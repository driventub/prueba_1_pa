package ec.edu.uce.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.VehiculoLiviano;


@Service
public class GestorMatriculaLivianoServiceImpl implements IGestorMatriculaLivianoService {

	private static final Logger LOG= LogManager.getLogger(GestorMatriculaLivianoServiceImpl.class);
	
	
	
	@Autowired
	private IGestorMatriculaLivianoService service;
	
	public void precioCondicion() {
		
	}
	
	@Override
	public void matricularVehiculo(VehiculoLiviano v, Propietario p) {
		this.service.matricularVehiculo(v,p);
		
	}

	@Override
	public void imprimirVehiculo(VehiculoLiviano v) {
		this.service.imprimirVehiculo(v);
		
	}
	
	
	

}
