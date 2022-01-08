package ec.edu.uce.service;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.VehiculoPesado;

public interface IGestorMatriculaPesadoService {
	void matricularVehiculo(VehiculoPesado v, Propietario p);
	void imprimirVehiculo(VehiculoPesado v);
}
