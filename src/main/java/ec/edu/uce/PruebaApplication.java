package ec.edu.uce;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.service.IGestorMatriculaService;

/**
 * Problemas Actuales:
 * 
 * 
 * @author Paulo
 *
 */

@SpringBootApplication
public class PruebaApplication implements CommandLineRunner {

	@Autowired
	private IGestorMatriculaService servicio;

	private static final Logger LOG = LogManager.getLogger(PruebaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Constructores
		Vehiculo v = new Vehiculo();
		Propietario p = new Propietario();

		p.setNombre("Lucas");
		p.setApellido("Moura");
		p.setEdad(28);

		v.setMarca("Toyota");
		v.setModelo("Prius");
		v.setPlaca("TR3S");
		v.setTipo("pesado");
		v.setPropietario(p);
		v.setPrecio(new BigDecimal("3000"));
		
		

		if (v.getPrecio().compareTo(new BigDecimal("0")) <= 0) {
			LOG.error("Precio incorrecto");
			LOG.info("No se matriculo el vehiculo");
		} else if (v.getPrecio().compareTo(new BigDecimal("1000")) <= 0) {
			LOG.warn("Precio muy bajo");
			this.servicio.matricularVehiculo(v, p);

			this.servicio.imprimirVehiculo(v);
			LOG.info("Matriculacion exitosa");
		} else {
			LOG.info("Precio adecuado");
			this.servicio.matricularVehiculo(v, p);

			this.servicio.imprimirVehiculo(v);
			LOG.info("Matriculacion exitosa");
		}

	}

}
