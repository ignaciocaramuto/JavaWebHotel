package logica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	public Cliente getOne(int id) {
		return clienteDAO.getByID(id);
	}
	
	public void actualizarCliente(HttpServletRequest request) {
		int id = Integer.parseInt((String)request.getParameter("txtid"));
		String tipoDoc = request.getParameter("tipoDoc");
		String nroDoc = request.getParameter("numDoc");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String password = request.getParameter("contraseña");
		String telefono = request.getParameter("telefono");
		String sexo = request.getParameter("sexo");
		String fechaNacimiento = request.getParameter("fechaNacimiento");
		Date myDate = convertDate(fechaNacimiento);
		java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
		String tipoTarjeta = request.getParameter("tipoTarjetaCredito");
		String nroTarjeta = request.getParameter("numTarjetaCredito");
		
		Cliente cli = new Cliente();
		cli.setIdCliente(id);
		cli.setTipoDoc(tipoDoc);
		cli.setNumDoc(nroDoc);
		cli.setNombre(nombre);
		cli.setApellido(apellido);
		cli.setMail(email);
		cli.setContraseña(password);
		cli.setTelefono(telefono);
		cli.setSexo(sexo);
		cli.setFechaNacimiento(sqlDate);
		cli.setTipoTarjetaCredito(tipoTarjeta);
		cli.setNumTarjetaCredito(nroTarjeta);
		clienteDAO.update(cli);
	}
	
	public void eliminarCliente(int id) {
		clienteDAO.delete(id);
	}
	
	public void registrarCliente(HttpServletRequest request) {
		String tipoDoc = request.getParameter("tipoDoc");
		String nroDoc = request.getParameter("numDoc");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String password = request.getParameter("contraseña");
		String telefono = request.getParameter("telefono");
		String sexo = request.getParameter("sexo");
		String fechaNacimiento = request.getParameter("fechaNacimiento");
		Date myDate = convertDate(fechaNacimiento);
		java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
		String tipoTarjeta = request.getParameter("tipoTarjetaCredito");
		String nroTarjeta = request.getParameter("numTarjetaCredito");
		
		Cliente newCliente = new Cliente();
		newCliente.setTipoDoc(tipoDoc);
		newCliente.setNumDoc(nroDoc);
		newCliente.setNombre(nombre);
		newCliente.setApellido(apellido);
		newCliente.setMail(email);
		newCliente.setContraseña(password);
		newCliente.setTelefono(telefono);
		newCliente.setSexo(sexo);
		newCliente.setFechaNacimiento(sqlDate);
		newCliente.setTipoTarjetaCredito(tipoTarjeta);
		newCliente.setNumTarjetaCredito(nroTarjeta);
		
		clienteDAO.add(newCliente);
	}
	
	public Date convertDate(String date) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate = null;
		try {
			myDate = formatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return myDate;
	}
	
}
