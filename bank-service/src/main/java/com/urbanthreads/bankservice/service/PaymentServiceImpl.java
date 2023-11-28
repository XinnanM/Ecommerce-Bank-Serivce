package com.urbanthreads.bankservice.service;

import com.urbanthreads.bankservice.DTO.PaymentDTO;
import com.urbanthreads.bankservice.service.PaymentService;
import com.urbanthreads.bankservice.DTO.PaymentDTO;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {


    @Override
    public boolean processPayment(PaymentDTO paymentDTO) {
        return true;
    }
}
