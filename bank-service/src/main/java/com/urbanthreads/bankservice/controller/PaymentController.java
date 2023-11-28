package com.urbanthreads.bankservice.controller;

import com.urbanthreads.bankservice.DTO.PaymentDTO;
import com.urbanthreads.bankservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/make-payment")
    public ResponseEntity<?> makePayment(@RequestBody PaymentDTO paymentDTO) {
        boolean paymentSuccess = paymentService.processPayment(paymentDTO);

        if (paymentSuccess) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
