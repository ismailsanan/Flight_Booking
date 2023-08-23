package com.spring.transactions.dto;


import com.spring.transactions.entity.Passenger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingResponse {

    private String status;
    private double totalFare;
    private String pnrNo;
    private Passenger passenger;



}
