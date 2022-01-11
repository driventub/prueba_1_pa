package ec.edu.uce.repository;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.Vehiculo;


public interface IGestorMatriculaRepo {
	void matricularVehiculo(Vehiculo v, Propietario p);
	void imprimirVehiculo(Vehiculo v);
}
