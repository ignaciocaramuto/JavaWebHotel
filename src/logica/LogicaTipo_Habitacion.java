package logica;

import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;

import dao.Tipo_HabitacionDAO;
import entidades.Tipo_Habitacion;

public class LogicaTipo_Habitacion {

	private Tipo_HabitacionDAO tipo_habitacionDAO;
	
	public LogicaTipo_Habitacion(){
		tipo_habitacionDAO = new Tipo_HabitacionDAO();
	}
	
	public LinkedList<Tipo_Habitacion> getAll(){
		return tipo_habitacionDAO.getAll();
	}
	
	public void añadirTipoHabitacion(HttpServletRequest request) {
		Tipo_Habitacion th = new Tipo_Habitacion();
		th.setDenominacion(request.getParameter("denominacion"));
		th.setDescripcion(request.getParameter("descripcion"));
		th.setCapacidad_Personas(Integer.parseInt(request.getParameter("capacidadPersonas")));
		th.setPrecio_Por_Dia(Integer.parseInt(request.getParameter("precioPorDia")));
		
		tipo_habitacionDAO.add(th);
	}
}
