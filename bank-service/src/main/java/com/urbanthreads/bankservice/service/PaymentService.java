package com.urbanthreads.bankservice.service;

import com.urbanthreads.bankservice.DTO.PaymentDTO;

public interface PaymentService {
    boolean processPayment(PaymentDTO paymentDTO);
}
