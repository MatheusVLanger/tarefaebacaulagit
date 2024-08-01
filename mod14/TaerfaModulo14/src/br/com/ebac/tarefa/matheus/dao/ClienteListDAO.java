package br.com.ebac.tarefa.matheus.dao;

import br.com.ebac.tarefa.matheus.domain.Cliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ClienteListDAO implements IClienteDAO {
    public List<Cliente> clientes = new ArrayList<>();

    @Override
    public Boolean cadastrarCliente(Cliente cliente) {
        for (Cliente  clienteAux : clientes) {
            if (clienteAux.getCpf().equals(cliente.getCpf())) {
                return false;
            }
        }
        clientes.add(cliente);
        return true;
    }

    @Override
    public void excluir(String cpf) {
        for (Iterator<Cliente> iterator = clientes.iterator(); iterator.hasNext(); ) {
            Cliente cliente = iterator.next();
            if (cliente.getCpf().equals(cpf)) {
                iterator.remove();
                break;
            }
        }
    }

    @Override
    public void alterar(Cliente cliente) {
       Cliente clienteCadastrado = consultar(cliente.getCpf());
       if(clienteCadastrado!=null){
           clienteCadastrado.setNome(cliente.getNome());
           clienteCadastrado.setTelefone(cliente.getTelefone());
           clienteCadastrado.setEndereco(cliente.getEndereco());
           clienteCadastrado.setNumero(cliente.getNumero());
           clienteCadastrado.setCidade(cliente.getCidade());
           clienteCadastrado.setEstado(cliente.getEstado());
       }

    }

    @Override
    public Cliente consultar(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return clientes;
    }
}
