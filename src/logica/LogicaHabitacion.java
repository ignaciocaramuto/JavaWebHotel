package logica;

import java.util.LinkedList;

import dao.HabitacionDAO;
import entidades.Cliente;
import entidades.Habitacion;

public class LogicaHabitacion {
	
	private HabitacionDAO habitacionDAO;
	
	public LogicaHabitacion() {
		habitacionDAO = new HabitacionDAO();
	}
	
	public LinkedList<Habitacion> getAll(){
		return habitacionDAO.getAll();
	}
}
