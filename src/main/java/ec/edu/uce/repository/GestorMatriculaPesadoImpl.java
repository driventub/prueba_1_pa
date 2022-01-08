package ec.edu.uce.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Propietario;

import ec.edu.uce.modelo.VehiculoPesado;


@Repository
public class GestorMatriculaPesadoImpl implements IGestorMatriculaPesado {

	private static final Logger LOG= LogManager.getLogger(GestorMatriculaPesadoImpl.class);

	@Override
	public void matricularVehiculo(VehiculoPesado v, Propietario p) {
		LOG.info("se ha matriculado el vehiculo: "+ v.getPlaca() +"con el propietario" + p.getNombre());
		
	}

	@Override
	public void imprimirVehiculo(VehiculoPesado v) {
		LOG.info(v.toString());
		
	}
	
	

	

}
