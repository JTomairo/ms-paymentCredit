package com.banca.payment.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {
    private String id;
    @Size(max = 8)
    @Field(name ="identityNumber")
    private String identityNumber;
    @Size(max = 200)
    @Field(name ="name")
    private String name;
    @Field(name ="clientType")
    @Size(max = 20)
    private String clientType;
}
