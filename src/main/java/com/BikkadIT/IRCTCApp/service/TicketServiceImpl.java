package com.BikkadIT.IRCTCApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.IRCTCApp.Repository.PassengerRepository;
import com.BikkadIT.IRCTCApp.Repository.TicketRepository;
import com.BikkadIT.IRCTCApp.model.Passenger;
import com.BikkadIT.IRCTCApp.model.Ticket;
@Service
public class TicketServiceImpl implements TicketServiceI{
	
	
	@Autowired
	private PassengerRepository PassengerRepository;
	
	@Autowired
	private TicketRepository ticketRepository;
	
	

	@Override
	public Ticket bookTicket(Passenger psg) {
		Passenger passenger =  PassengerRepository.save( psg);
		if(passenger !=null) {
			
			Ticket ticket = ticketRepository.findById(1).get();
			return ticket;
		}
		
		
		
		
		
		
		return null;
	}
	
	

	}


