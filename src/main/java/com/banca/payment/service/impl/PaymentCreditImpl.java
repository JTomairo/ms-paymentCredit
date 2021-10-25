package com.banca.payment.service.impl;

import com.banca.payment.model.PaymentCredit;
import com.banca.payment.repository.IPaymentCreditRepository;
import com.banca.payment.service.IPaymentCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PaymentCreditImpl implements IPaymentCreditService {

    @Autowired
    private IPaymentCreditRepository paymentCreditRepository;

    @Override
    public Flux<PaymentCredit> findAll() {
        return paymentCreditRepository.findAll();
    }

    @Override
    public Mono<PaymentCredit> findById(String id) {
        return paymentCreditRepository.findById(id);
    }

    @Override
    public Mono<PaymentCredit> save(PaymentCredit paymentCredit) {
        return paymentCreditRepository.save(paymentCredit);
    }

    @Override
    public Mono<PaymentCredit> update(PaymentCredit paymentCredit) {
        return paymentCreditRepository.save(paymentCredit);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return paymentCreditRepository.deleteById(id);
    }
}
