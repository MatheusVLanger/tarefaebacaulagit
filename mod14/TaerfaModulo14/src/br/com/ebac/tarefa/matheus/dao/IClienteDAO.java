package br.com.ebac.tarefa.matheus.dao;

import br.com.ebac.tarefa.matheus.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    Boolean cadastrarCliente(Cliente cliente);

    public void excluir(String cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(String cpf);

    public Collection<Cliente> buscarTodos();
}
