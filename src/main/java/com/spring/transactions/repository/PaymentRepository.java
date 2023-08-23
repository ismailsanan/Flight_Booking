package com.spring.transactions.repository;

import com.spring.transactions.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long > {
}
