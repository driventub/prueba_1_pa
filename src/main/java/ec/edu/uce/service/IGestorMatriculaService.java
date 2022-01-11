package ec.edu.uce.service;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.Vehiculo;


public interface IGestorMatriculaService {
	void matricularVehiculo(Vehiculo v, Propietario p);
	void imprimirVehiculo(Vehiculo v);
}
