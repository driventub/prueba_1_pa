package ec.edu.uce.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.repository.IGestorMatriculaRepo;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService {

	private static final Logger LOG = LogManager.getLogger(GestorMatriculaServiceImpl.class);

	@Autowired
	@Qualifier("liviano")
	private IGestorMatriculaRepo liviano;

	@Autowired
	@Qualifier("pesado")
	private IGestorMatriculaRepo pesado;

	@Override
	public void matricularVehiculo(Vehiculo v, Propietario p) {
		LOG.info("Aqui se matriculara el vehiculo en la base de datos");

		if (v.getTipo().contains("liviano")) {
			this.liviano.matricularVehiculo(v, p);
		} else if (v.getTipo().contains("pesado")) {
			this.pesado.matricularVehiculo(v, p);
		} else {
			LOG.fatal("No existe el tipo de vehiclo mencionado, matriculacion fallida");
		}

	}

	@Override
	public void imprimirVehiculo(Vehiculo v) {
		LOG.info("Aqui se imprimira la informacion");

		if (v.getTipo().contains("liviano")) {
			this.liviano.imprimirVehiculo(v);
		} else if (v.getTipo().contains("pesado")) {
			this.pesado.imprimirVehiculo(v);
		} else {
			LOG.fatal("No existe el tipo de vehiclo mencionado, impresion fallida");
		}

	}

}
