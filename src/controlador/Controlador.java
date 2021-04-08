package controlador;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Cliente;
import logica.LogicaCliente;
import logica.Login;

/**
 * Servlet implementation class LoginControlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LogicaCliente ctrlLogicaCliente;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        ctrlLogicaCliente = new LogicaCliente();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		if(request.getParameter("btn-login") != null) {
			Cliente c = new Cliente();
			Login ctrlLogin = new Login();
			String email = request.getParameter("txtemail");
			String password = request.getParameter("txtpassword");
			c.setMail(email);
			c.setContraseña(password);
			c = ctrlLogin.validateCliente(c);
			request.getSession().setAttribute("usuario", c);
			if(c!=null) {
				response.sendRedirect("/JavaWebHotel/menu.jsp");
			}else {
				response.sendRedirect("/JavaWebHotel/login.jsp?c="+c);
			}
		}
		
		if(request.getParameter("btn-abmCliente") != null) {
			listarClientes(request, response);
			//response.sendRedirect("/JavaWebHotel/abmCliente.jsp");
		}
		
		if(request.getParameter("btn-registrarCliente") != null) {
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
			
			ctrlLogicaCliente.registrarCliente(newCliente);
			listarClientes(request, response);
		}
		
		if(request.getParameter("btn-actualizarCliente") != null) {
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
			
			ctrlLogicaCliente.actualizarCliente(cli);
			listarClientes(request, response);
		}
		
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
	
	public void listarClientes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LinkedList<Cliente> clientes = ctrlLogicaCliente.getAll();
		request.setAttribute("listaClientes", clientes);
		request.getRequestDispatcher("abmCliente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
