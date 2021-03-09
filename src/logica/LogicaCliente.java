package logica;

import java.util.LinkedList;

import dao.ClienteDAO;
import entidades.Cliente;

public class LogicaCliente {
	
	private ClienteDAO clienteDAO;
	
	public LogicaCliente() {
		clienteDAO = new ClienteDAO();
	}
	
	public LinkedList<Cliente> getAll(){
		return clienteDAO.getAll();
	}
	
	public void registrarCliente(Cliente c) {
		clienteDAO.add(c);
	}
}
