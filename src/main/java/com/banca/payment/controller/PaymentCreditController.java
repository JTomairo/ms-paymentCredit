package com.banca.payment.controller;

import com.banca.payment.model.PaymentCredit;
import com.banca.payment.service.impl.PaymentCreditImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@Api(tags = {"REST APIs related to Payment Credit Entity"})
public class PaymentCreditController {

    @Autowired
    private PaymentCreditImpl paymentCreditService;

    @ApiOperation(value = "Get list of payment credit", response = String.class)
    @GetMapping("/listPaymentCredits")
    public Flux<PaymentCredit> listPaymentCredits() {
        log.info("Get list of PaymentCredits");
        return paymentCreditService.findAll();
    }

    @ApiOperation(value = "Create payment credit", response = String.class)
    @GetMapping("/getPaymentCredit/{id}")
    public Mono<PaymentCredit> getPaymentCredit(@PathVariable("id") String id) {
        log.info("Get a specific PaymentCredit");
        return paymentCreditService.findById(id);
    }

    @ApiOperation(value = "Update payment credit", response = String.class)
    @PostMapping("/addPaymentCredit")
    public void createPaymentCredit(@RequestBody PaymentCredit PaymentCredit) {
        log.info("Create PaymentCredit");
        paymentCreditService.save(PaymentCredit).subscribe();
    }

    @ApiOperation(value = "Delete a specific payment credit", response = String.class)
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
