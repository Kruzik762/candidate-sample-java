package com.bravo.user.service;

import com.bravo.user.dao.model.Payment;
import com.bravo.user.dao.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private UserService userService;


    public List<Payment> getUserPayments(String userId) {
        return paymentRepository.findAllByUserId(userId);
    }

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
