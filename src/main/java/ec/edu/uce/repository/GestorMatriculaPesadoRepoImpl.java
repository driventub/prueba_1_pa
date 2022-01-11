package ec.edu.uce.repository;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.Vehiculo;



@Repository
@Qualifier("pesado")

public class GestorMatriculaPesadoRepoImpl implements IGestorMatriculaRepo {

	private static final Logger LOG= LogManager.getLogger(GestorMatriculaPesadoRepoImpl.class);
	private int peso;
	
	
	@Override
	public void matricularVehiculo(Vehiculo v, Propietario p) {
		LOG.info("se ha matriculado el vehiculo: "+ v.getPlaca() +"con el propietario" + p.getNombre());
		
	}

	@Override
	public void imprimirVehiculo(Vehiculo v) {
		setPeso(1000);
		LOG.info(" [ " + " valorMatricula: " + v.getPrecio().multiply(new BigDecimal("0.15"))+ "]");
		LOG.info(" [ " + v.toString() +"peso: " + getPeso()+ "kg" + " ] ");
		
	}
	
//	Set y Get
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	


	

}
