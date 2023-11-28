package com.urbanthreads.bankservice.DTO;

import com.urbanthreads.bankservice.model.Payment;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class PaymentDTO {
    @Getter
    @Setter
    private String cardHolderName;
    private String cardNumber;
    private String expirationDate;
    private String ccv;
    private String creditCardCompany; // 根据你的Payment类，可能需要调整类型
    private BigDecimal totalAmount;

    public PaymentDTO(Payment card, BigDecimal totalAmount) {
        this.cardHolderName = card.getCardHolderName();
        this.cardNumber = card.getCardNumber();
        this.expirationDate = card.getExpirationDate();
        this.ccv = card.getCcv();
        this.totalAmount = totalAmount;
    }


}
