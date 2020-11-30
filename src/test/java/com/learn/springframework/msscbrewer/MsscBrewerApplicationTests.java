package com.learn.springframework.msscbrewer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learn.springframework.msscbrewer.services.BeerService;
import com.learn.springframework.msscbrewer.web.model.BeerDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

@SpringBootTest
class MsscBrewerApplicationTests {


    @Test
    public void getBeer() {

    }

}
