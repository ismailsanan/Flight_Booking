package com.spring.transactions.utils;

import com.spring.transactions.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

   static {
        paymentMap.put("acc1" , 12000.0);
        paymentMap.put("acc2", 12200.1);
        paymentMap.put("acc3" , 10000.3);
        paymentMap.put("acc4" , 1000.2);

    }

    public static boolean validateCreditLimit(String accNo , double paidAmount){
        if(paidAmount > paymentMap.get(accNo)){
            throw  new InsufficientAmountException("insufficient funds...");
        }
        else{
            return  true;
        }
    }

}
