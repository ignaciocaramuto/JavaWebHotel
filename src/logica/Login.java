package logica;

import dao.ClienteDAO;
import entidades.Cliente;

public class Login {

	private ClienteDAO clienteDAO;
	
	public Login() {
		clienteDAO = new ClienteDAO();
	}
	
	public Cliente validateCliente(Cliente c) {
		
		return clienteDAO.getByUser(c);
	}
}
