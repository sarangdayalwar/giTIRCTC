package com.BikkadIT.IRCTCApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.IRCTCApp.model.Ticket;
@Repository
public interface TicketRepository  extends JpaRepository< Ticket,  Integer>{

}
