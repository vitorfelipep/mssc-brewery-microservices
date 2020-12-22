package com.learn.springframework.msscbrewer.web.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDTO {

    private UUID uuid;
    private Integer version;

    private OffsetDateTime createDate;
    private OffsetDateTime lasModifiedDate;

    private String beerName;

    private BeerStyleEnum beerStyle;

    private Long upc;
    private BigDecimal price;

    private Integer quantityOnHand;
}
