// BankingServiceImpl.java

package com.urbanthreads.bankservice.service;

import org.springframework.stereotype.Service;

@Service
public class BankingServiceImpl implements BankingService {

    @Override
    public boolean makePayment(PaymentDTO paymentDTO) {
        return true;
    }
}
