package ec.edu.uce.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Propietario;

import ec.edu.uce.modelo.VehiculoPesado;


@Service
public class GestorMatriculaPesadoServiceImpl implements IGestorMatriculaPesadoService {

	private static final Logger LOG= LogManager.getLogger(GestorMatriculaPesadoServiceImpl.class);
	
	
	@Autowired
	private IGestorMatriculaPesadoService service;
	
	
	@Override
	public void matricularVehiculo(VehiculoPesado v, Propietario p) {
		this.service.matricularVehiculo(v,p);
		
	}

	@Override
	public void imprimirVehiculo(VehiculoPesado v) {
		this.service.imprimirVehiculo(v);
		
	}
	
	

	

}
