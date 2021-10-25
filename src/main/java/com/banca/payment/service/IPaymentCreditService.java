package com.banca.payment.service;

import com.banca.payment.model.PaymentCredit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPaymentCreditService {
    public Flux<PaymentCredit> findAll();
    public Mono<PaymentCredit> findById(String id);
    public Mono<PaymentCredit> save(PaymentCredit paymentCredit);
    public Mono<PaymentCredit> update(PaymentCredit paymentCredit);
    public Mono<Void> deleteById(String id);
}
