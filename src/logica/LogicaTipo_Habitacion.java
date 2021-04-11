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
	
	public Tipo_Habitacion getOne(int id) {
		return tipo_habitacionDAO.getOne(id);
	}
	
	public void añadirTipoHabitacion(HttpServletRequest request) {
		Tipo_Habitacion th = new Tipo_Habitacion();
		th.setDenominacion(request.getParameter("denominacion"));
		th.setDescripcion(request.getParameter("descripcion"));
		th.setCapacidad_Personas(Integer.parseInt(request.getParameter("capacidadPersonas")));
		th.setPrecio_Por_Dia(Integer.parseInt(request.getParameter("precioPorDia")));
		
		tipo_habitacionDAO.add(th);
	}
	
	public void editarTipoHabitacion(HttpServletRequest request) {
		int id = Integer.parseInt((String)request.getParameter("txtid"));
		String denominacion = request.getParameter("denominacion");
		String descripcion = request.getParameter("descripcion");
		int capacidadPersonas = Integer.parseInt(request.getParameter("capacidadPersonas"));
		float precioPorDia = Float.parseFloat(request.getParameter("precioPorDia"));
		
		Tipo_Habitacion th = new Tipo_Habitacion();
		th.setId_Tipo_Habitacion(id);
		th.setDenominacion(denominacion);
		th.setDescripcion(descripcion);
		th.setCapacidad_Personas(capacidadPersonas);
		th.setPrecio_Por_Dia(precioPorDia);
		tipo_habitacionDAO.update(th);
	}
}
