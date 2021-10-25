package com.banca.payment.repository;

import com.banca.payment.model.PaymentCredit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentCreditRepository extends ReactiveMongoRepository<PaymentCredit, String> {
}
