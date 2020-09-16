package br.com.zeDelivery.api.funcionalidades;

import io.restassured.RestAssured;

public class DadosMeteorologicosFunc {



    public void BaseApi(){
        RestAssured.given().baseUri("api.openweathermap.org/data/2.5/weather?");
    }



}
