package logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import entidades.Cliente;

public class Login {

	private ClienteDAO clienteDAO;
	
	public Login() {
		clienteDAO = new ClienteDAO();
	}
	
	public Cliente validateCliente(HttpServletRequest request) {
		Cliente c = new Cliente();
		String email = request.getParameter("txtemail");
		String password = request.getParameter("txtpassword");
		c.setMail(email);
		c.setContraseña(password);
		return clienteDAO.getByUser(c);
	}
}
