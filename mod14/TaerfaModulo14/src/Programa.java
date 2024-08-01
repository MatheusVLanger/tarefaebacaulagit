import br.com.ebac.tarefa.matheus.dao.ClienteListDAO;
import br.com.ebac.tarefa.matheus.dao.IClienteDAO;
import br.com.ebac.tarefa.matheus.domain.Cliente;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        IClienteDAO iClienteDAO = new ClienteListDAO();

        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("Digite 1 para cadastrar o cliente, 2 para alterar um cliente, 3 para buscar por um cliente, " +
                    "4 para exluir um cliente, 5 para buscar todos e 6 para sair do programa");
            System.out.println("------------------------------------------------------------------------------------------");
            int numeroSwitch = scanner.nextInt();
            switch (numeroSwitch) {
                case 1:
                    System.out.println("Escreva as informações do cliente separado por vírgula, passando o nome,cpf," +
                            "telefone,endereco,numero,cidade,estado");
                    String informacoesCliente = scanner.next();
                    String[] dados = informacoesCliente.split(",");
                    Cliente cliente = new Cliente(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], dados[6]);
                    boolean cadastro =  iClienteDAO.cadastrarCliente(cliente);
                    if (!cadastro){
                        System.out.println("O cliente já se encontra em nosa base de dados.");
                    }else {
                        System.out.println("O cliente cadastrado foi :" + cliente);
                    }
                    break;
                case 2:
                    System.out.println("Digite o cpf do cliente");
                    String cpfAlteracao= scanner.next();
                    System.out.println("Digite as informações alteradas separadas por vírgula  seguindo a ordem: " +
                            "nome,telefone,endereço,numero,cidade,estado");
                    String informacoesClienteAlteracao = scanner.next();
                    String[] dados2 = informacoesClienteAlteracao.split(",");
                    Cliente cliente2 = new Cliente(dados2[0], cpfAlteracao, dados2[1], dados2[2], dados2[3], dados2[4], dados2[5]);
                    iClienteDAO.alterar(cliente2);
                    System.out.println("Cliente alterado: "+ iClienteDAO.consultar(cpfAlteracao));
                    break;
                case 3:
                    System.out.println("Digite o cpf que deseja buscar");
                    String cpfBusca = scanner.next();
                    System.out.println("Cliente encontrado : " + iClienteDAO.consultar(cpfBusca));
                    break;
                case 4:
                    System.out.println("Digite o cpf que deseja excluir");
                    String cpfExclusao = scanner.next();
                    iClienteDAO.excluir(cpfExclusao);
                    break;
                case 5:
                    System.out.println(iClienteDAO.buscarTodos());
                    break;
                case 6:
                    System.out.println("Obrigado por usar nosso sistema, até a próxima");
                    rodando = false;
            }
        }
    }

}
