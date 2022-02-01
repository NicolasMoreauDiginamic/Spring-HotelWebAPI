package dev.hotel.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import dev.hotel.entite.Client;
import dev.hotel.repositories.ClientRepository;

@Service
public class ClientService {
	
	private ClientRepository clientRepo;

	public ClientService(ClientRepository clientRepo) {
		this.clientRepo = clientRepo;
	}
	
	public List<Client> listClient(){
		return this.clientRepo.findAll();
	}
	
	public Optional<Client> SearchClientByID(@PathVariable Integer id) {
		return this.clientRepo.findById(id);
	}
	
	@Transactional
	public Client newClient(Client client) {
		return this.clientRepo.save(client);
	}
	
}
