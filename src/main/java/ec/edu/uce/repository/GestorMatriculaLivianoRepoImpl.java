package ec.edu.uce.repository;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.Vehiculo;


/*
 * Quizas aqui seria mejor de settear el tipo de vehiculo = liviano, no me voy
 * a arriesgar, o quizas esta bien asi, por dar la opcion de escoger el tipo 
 * de vehiculo en el ejecutable
 * 
 * Aqui se pondra el valor de la matricula
 */

@Repository
@Qualifier("liviano")
public class GestorMatriculaLivianoRepoImpl implements IGestorMatriculaRepo {
	
	
	
	private static final Logger LOG= LogManager.getLogger(GestorMatriculaLivianoRepoImpl.class);
	private BigDecimal cilindraje ;
	
	
	
	@Override
	public void matricularVehiculo(Vehiculo v, Propietario p) {
		LOG.info("se ha matriculado el vehiculo: "+ v.getPlaca() +" con el propietario " + p.getNombre());
		
	}

	@Override
	public void imprimirVehiculo(Vehiculo v) {
		setCilindraje(new BigDecimal("1.5"));
		LOG.info(" [" + " ValorMatricula: " + v.getPrecio().multiply(new BigDecimal("0.1")) + "]");
		LOG.info(" [" +v.toString()+"cilindraje "+ getCilindraje() + "L" + " ]");
		
		
	}
	
// Get y Set 
	public BigDecimal getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(BigDecimal cilindraje) {
		this.cilindraje = cilindraje;
	}

	

}
