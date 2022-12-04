package com.BikkadIT.IRCTCApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.IRCTCApp.model.Passenger;
import com.BikkadIT.IRCTCApp.model.Ticket;
import com.BikkadIT.IRCTCApp.service.TicketServiceI;

@RestController
public class TicketBookingController {

	@Autowired
	private TicketServiceI ticketServiceI;
	
	
	@PostMapping(value = "/bookTicket",produces = "application/json",consumes = "application/json")
	public ResponseEntity< Ticket> bookTicket(@RequestBody Passenger psg){
		Ticket ticket = ticketServiceI.bookTicket(psg);
		
		
		
		
		return  new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
		
	}
	
	
	
}
