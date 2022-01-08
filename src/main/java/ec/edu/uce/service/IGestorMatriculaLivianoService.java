package ec.edu.uce.service;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.VehiculoLiviano;

public interface IGestorMatriculaLivianoService {
	void matricularVehiculo(VehiculoLiviano v, Propietario p);
	void imprimirVehiculo(VehiculoLiviano v);
}
