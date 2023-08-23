package com.spring.transactions.service;


import com.spring.transactions.dto.FlightBookingRequest;
import com.spring.transactions.dto.FlightBookingResponse;
import com.spring.transactions.entity.Passenger;
import com.spring.transactions.entity.Payment;
import com.spring.transactions.repository.PassengerRepository;
import com.spring.transactions.repository.PaymentRepository;
import com.spring.transactions.utils.PaymentUtils;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FlightBookingService {


    private final PassengerRepository passengerRepository;
    private final PaymentRepository paymentRepository;



    @Transactional
    public FlightBookingResponse bookFlightTicket(FlightBookingRequest request){

        Passenger pass = request.getPassenger();
        passengerRepository.save(pass);

        Payment payment  = request.getPayment();

        PaymentUtils.validateCreditLimit(payment.getAccountNo() , pass.getFare());

        payment.setPaymentID(payment.getPID());
        payment.setAmount(pass.getFare());
        paymentRepository.save(payment);
        return new FlightBookingResponse("SUCCESS" , pass.getFare() , UUID.randomUUID().toString() , pass );
    }


}
