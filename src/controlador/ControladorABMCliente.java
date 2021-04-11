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
@WebServlet("/ControladorABMCliente")
public class ControladorABMCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LogicaCliente ctrlLogicaCliente;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorABMCliente() {
        super();
        ctrlLogicaCliente = new LogicaCliente();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("btn-abmCliente") != null) {
			listarClientes(request, response);
		}
		
		if(request.getParameter("btn-registrarCliente") != null) {
			ctrlLogicaCliente.registrarCliente(request);
			listarClientes(request, response);
		}
		
		if(request.getParameter("btn-actualizarCliente") != null) {
			ctrlLogicaCliente.actualizarCliente(request);
			listarClientes(request, response);
		}
		
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
