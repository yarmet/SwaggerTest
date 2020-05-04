package com.example.SwaggerTest.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/product")
public class TestRestController {

//    Здесь смотреть параметры
//    http://localhost:8080/swagger-ui.html

    @ApiOperation("Метод метод возвращает все значения")
    @RequestMapping(method = RequestMethod.GET, value = "/items")
    public List<String> getItems() {
        return Collections.singletonList("our items list");
    }


    @ApiOperation("Метод вставляет значение")
    @RequestMapping(method = RequestMethod.POST, value = "/items")
    public String insertItems(@ApiParam(value = "Наше значение для вставки") String value) {
        // сохраним
        return value + 1;
    }

    @ApiOperation("Метод обновляет значение")
    @RequestMapping(method = RequestMethod.PUT, value = "/items")
    public String updateItems(@ApiParam(value = "Наше значение для обновления") String value) {
        //обновим
        return value + 2;
    }


    @ApiOperation("Метод удаляет значение")
    @RequestMapping(method = RequestMethod.DELETE, value = "/items")
    public void deleteItems(@ApiParam(value = "Наше значение для удаления") String value) {
        // удалим
    }


}
