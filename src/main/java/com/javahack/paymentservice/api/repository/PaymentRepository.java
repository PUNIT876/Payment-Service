package com.javahack.paymentservice.api.repository;

import com.javahack.paymentservice.api.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByorderId(int orderId);
}
