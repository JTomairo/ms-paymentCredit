package com.banca.payment.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "paymentCredit")
public class PaymentCredit {
    @Id
    private String id;
    @Digits(integer = 6, fraction = 2)
    @Field(name = "amount")
    private Double amount;
    @Size(max = 200)
    @Field(name = "description")
    private String description;
    @Size(max = 200)
    @Field(name = "status")
    private String status;
    @Field(name = "product")
    private Product product;
    @Field(name = "client")
    private Client client;
    @Field(name = "paymentDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime paymentDate;
}
