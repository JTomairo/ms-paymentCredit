package com.banca.payment.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private String Id;
    @Field(name = "productName")
    private String productName;
    @Field(name = "productYpe")
    private String productYpe;
}
