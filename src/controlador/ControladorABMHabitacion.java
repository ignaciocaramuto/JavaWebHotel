package controlador;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Cliente;
import entidades.Habitacion;
import entidades.Tipo_Habitacion;
import logica.LogicaHabitacion;
import logica.LogicaTipo_Habitacion;

/**
 * Servlet implementation class ControladorABMHabitacion
 */
@WebServlet("/ControladorABMHabitacion")
public class ControladorABMHabitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LogicaHabitacion ctrlLogicaHabitacion;
	private LogicaTipo_Habitacion ctrlTipoHabitacion;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorABMHabitacion() {
        super();
        ctrlLogicaHabitacion = new LogicaHabitacion();
        ctrlTipoHabitacion = new LogicaTipo_Habitacion();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("btn-abmHabitacion") !=null) {
			listarHabitaciones(request, response);
		}
		
		if(request.getParameter("btn-añadirHabitacion") != null) {
			listarTipoHabitaciones(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void listarHabitaciones(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LinkedList<Habitacion> clientes = ctrlLogicaHabitacion.getAll();
		request.setAttribute("listaHabitaciones", clientes);
		request.getRequestDispatcher("abmHabitacion.jsp").forward(request, response);
	}
	
	public void listarTipoHabitaciones(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LinkedList<Tipo_Habitacion> tipo_habitaciones = ctrlTipoHabitacion.getAll();
		request.setAttribute("listaTipo_Habitaciones", tipo_habitaciones);
		request.getRequestDispatcher("../añadirHabitacion").forward(request, response);
	}
}
