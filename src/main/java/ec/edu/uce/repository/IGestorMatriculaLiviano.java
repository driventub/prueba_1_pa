package ec.edu.uce.repository;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.VehiculoLiviano;

public interface IGestorMatriculaLiviano {
	void matricularVehiculo(VehiculoLiviano v, Propietario p);
	void imprimirVehiculo(VehiculoLiviano v);
}
