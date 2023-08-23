package com.spring.transactions.dto;

import com.spring.transactions.entity.Passenger;
import com.spring.transactions.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private Passenger passenger;
    private Payment payment;


}
