package com.learn.springframework.msscbrewer.web.model;

import com.learn.springframework.msscbrewer.web.model.v2.types.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id_;
    private String beerName;
    private String beerStyle;
    private Long upc;

}
