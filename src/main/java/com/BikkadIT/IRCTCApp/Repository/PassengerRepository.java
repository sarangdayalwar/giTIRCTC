package com.BikkadIT.IRCTCApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.IRCTCApp.model.Passenger;

@Repository
public interface PassengerRepository  extends JpaRepository< Passenger,  Integer> {

}
