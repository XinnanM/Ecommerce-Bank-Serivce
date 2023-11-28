package com.urbanthreads.bankservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;
    private String cardHolderName;
    private String cardNumber;
    private String expirationDate;
    private String ccv;




}
