package controlador;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Cliente;
import entidades.Tipo_Habitacion;
import logica.LogicaTipo_Habitacion;

/**
 * Servlet implementation class ControladorABMTipo_Habitacion
 */
@WebServlet("/ControladorABMTipo_Habitacion")
public class ControladorABMTipo_Habitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LogicaTipo_Habitacion ctrlTipoHabitacion;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorABMTipo_Habitacion() {
        super();
        ctrlTipoHabitacion = new LogicaTipo_Habitacion();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		if(request.getParameter("btn-abmTipo_Habitacion") != null) {
			listarTipoHabitaciones(request, response);
		}
		
		if(request.getParameter("btn-añadirTipo_Habitacion") != null) {
			ctrlTipoHabitacion.añadirTipoHabitacion(request);
			listarTipoHabitaciones(request, response);
		}
		
		if(request.getParameter("btn-actualizarTipo_Habitacion") !=null) {
			ctrlTipoHabitacion.editarTipoHabitacion(request);
			listarTipoHabitaciones(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void listarTipoHabitaciones(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LinkedList<Tipo_Habitacion> tipo_habitaciones = ctrlTipoHabitacion.getAll();
		request.setAttribute("listaTipo_Habitaciones", tipo_habitaciones);
		request.getRequestDispatcher("abmTipo_Habitacion.jsp").forward(request, response);
	}

}
