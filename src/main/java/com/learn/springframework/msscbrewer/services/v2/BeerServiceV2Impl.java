package com.learn.springframework.msscbrewer.services.v2;

import com.learn.springframework.msscbrewer.web.model.v2.BeerDtov2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtov2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtov2 saveNewBeer(BeerDtov2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtov2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
