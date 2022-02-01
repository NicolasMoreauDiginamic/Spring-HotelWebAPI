package dev.hotel.services;

import java.util.List;

import org.springframework.stereotype.Service;

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
	
	
}
