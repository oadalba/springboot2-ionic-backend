package com.adalba.cursomc.services;

import com.adalba.cursomc.domain.Cliente;
import com.adalba.cursomc.repositores.ClienteRepository;
import com.adalba.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id +	", Tipo:" + Cliente.class.getName()));
		}
	

}
