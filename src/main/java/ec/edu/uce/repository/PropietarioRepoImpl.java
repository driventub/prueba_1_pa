package ec.edu.uce.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepo{
	
	private static final Logger LOG= LogManager.getLogger(PropietarioRepoImpl.class);
	
	@Override
	public void imprimirPropietario(Propietario p) {
		LOG.info("Relleno" + p.toString());
		
	}
	
}
