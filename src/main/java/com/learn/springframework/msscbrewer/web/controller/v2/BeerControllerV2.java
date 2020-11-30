package com.learn.springframework.msscbrewer.web.controller.v2;

import com.learn.springframework.msscbrewer.services.v2.BeerServiceV2;
import com.learn.springframework.msscbrewer.web.model.v2.BeerDtov2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v2/beers")
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    public BeerControllerV2(BeerServiceV2 beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtov2> getBeers(@PathVariable("beerId") UUID beerId) {

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDtov2 beerDtoV2) {
        BeerDtov2 savedBeerDtoV2 = beerService.saveNewBeer(beerDtoV2);
        HttpHeaders httpHeaders = new HttpHeaders();
        //// TODO: 29/11/2020 added hostname url
        httpHeaders.add("location", "/api/v1/beers" + savedBeerDtoV2.getId_().toString());

        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdates(
            @PathVariable("beerId") UUID beerId,
            @RequestBody BeerDtov2 beerDtoV2) {

        beerService.updateBeer(beerId, beerDtoV2);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("beerId") UUID beerId) {
        beerService.deleteById(beerId);
    }

}
