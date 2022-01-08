package ec.edu.uce.repository;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.VehiculoPesado;

public interface IGestorMatriculaPesado {
	void matricularVehiculo(VehiculoPesado v, Propietario p);
	void imprimirVehiculo(VehiculoPesado v);
}
