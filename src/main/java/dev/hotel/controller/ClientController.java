package dev.hotel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.hotel.entite.Client;
import dev.hotel.services.ClientService;

@RestController
@RequestMapping("client")
public class ClientController {
	
	private ClientService clientServ;

	public ClientController(ClientService clientServ) {
		this.clientServ = clientServ;
	}
	
	@GetMapping("client/?start=X&size=Y")
	public List<Client> listeClient(){
		return this.clientServ.listClient();
	}
	
	@GetMapping("client/{id}")
	public Optional<Client> SearchClient(Client client) {
		return this.clientServ.SearchClientByID(client.getId());
	}
	
	@PostMapping
	public Client nouveauClient(@RequestBody Client client) {
		return this.clientServ.newClient(client);
	}
}
