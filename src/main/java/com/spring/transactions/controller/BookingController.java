package com.spring.transactions.controller;


import com.spring.transactions.dto.FlightBookingRequest;
import com.spring.transactions.dto.FlightBookingResponse;
import com.spring.transactions.service.FlightBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
@EnableTransactionManagement
public class BookingController {

    private final FlightBookingService flightBookingService;

    @PostMapping("/flightbooking")
    public FlightBookingResponse bookFlightTicket(@RequestBody FlightBookingRequest flightBookingRequest){
        return flightBookingService.bookFlightTicket(flightBookingRequest);

    }

}
