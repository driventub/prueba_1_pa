package ec.edu.uce.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.VehiculoLiviano;


@Repository
public class GestorMatriculaLivianoImpl implements IGestorMatriculaLiviano {

	private static final Logger LOG= LogManager.getLogger(GestorMatriculaLivianoImpl.class);

	@Override
	public void matricularVehiculo(VehiculoLiviano v, Propietario p) {
		LOG.info("se ha matriculado el vehiculo: "+ v.getPlaca() +"con el propietario" + p.getNombre());
		
	}

	@Override
	public void imprimirVehiculo(VehiculoLiviano v) {
		LOG.info(v.toString());
		
	}
	
	
	

}
