package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.repository.IPropietarioRepo;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	@Autowired
	private IPropietarioRepo propietarioRepo;
	
	@Override
	public void imprimir(Propietario p) {
		this.propietarioRepo.imprimirPropietario(p);
		
	}

}
