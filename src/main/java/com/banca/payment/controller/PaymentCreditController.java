package com.banca.payment.controller;

import com.banca.payment.model.PaymentCredit;
import com.banca.payment.service.impl.PaymentCreditImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class PaymentCreditController {

    @Autowired
    private PaymentCreditImpl paymentCreditService;

    @GetMapping("/listPaymentCredits")
    public Flux<PaymentCredit> listPaymentCredits() {
        log.info("Get list of PaymentCredits");
        return paymentCreditService.findAll();
    }

    @GetMapping("/getPaymentCredit/{id}")
    public Mono<PaymentCredit> getPaymentCredit(@PathVariable("id") String id) {
        log.info("Get a specific PaymentCredit");
        return paymentCreditService.findById(id);
    }

    @PostMapping("/addPaymentCredit")
    public void createPaymentCredit(@RequestBody PaymentCredit PaymentCredit) {
        log.info("Create PaymentCredit");
        paymentCreditService.save(PaymentCredit).subscribe();
    }

    @PutMapping("/updatePaymentCredit")
    public Mono<PaymentCredit> updatePaymentCredit(@RequestBody PaymentCredit PaymentCredit) {
        log.info("Update PaymentCredit");
        return paymentCreditService.update(PaymentCredit);
    }

    @DeleteMapping("/deletePaymentCredit/{id}")
    public Mono<Void> deletePaymentCredit(@PathVariable("id") String id) {
        log.info("Delete a specific PaymentCredit");
        return paymentCreditService.deleteById(id);
    }

}
