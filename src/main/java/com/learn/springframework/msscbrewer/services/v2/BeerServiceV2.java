package com.learn.springframework.msscbrewer.services.v2;

import com.learn.springframework.msscbrewer.web.model.v2.BeerDtov2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtov2 getBeerById(UUID beerId);

    BeerDtov2 saveNewBeer(BeerDtov2 beerDto);

    void updateBeer(UUID beerId, BeerDtov2 beerDto);

    void deleteById(UUID beerId);

}
