package dev.hotel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping
	public List<Client> listeClient(){
		return this.clientServ.listClient();
	}
}
