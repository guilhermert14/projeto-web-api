package br.com.zeDelivery.api.funcionalidades;

import br.com.commons.PropertiesManager;
import br.com.commons.VariaveisEstaticas;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class DadosMeteorologicosFunc {

    public void weatherByCityName(String nome) {
        Map<String, String> params = new HashMap<>();
        params.put("q", nome);
        params.put("appid", PropertiesManager.getPropertiesValue("TOKEN"));

        Response response =
            given()
                .pathParams(params)
            .when()
                .get("http://api.openweathermap.org/data/2.5/weather?q={q}&appid={appid}")
            .then()
                .log().all()
                .statusCode(200)
            .extract().response();

        VariaveisEstaticas.setNome(response.getBody().path("name"));

    }

    public void weatherByCityId(String id) {
        Map<String, String> params = new HashMap<>();
        params.put("city_id", id);
        params.put("appid", PropertiesManager.getPropertiesValue("TOKEN"));

        Response response =
            given()
                .pathParams(params)
            .when()
                .get("http://api.openweathermap.org/data/2.5/weather?id={city_id}&appid={appid}")
            .then()
                .log().all()
                .statusCode(200)
            .extract().response();

        VariaveisEstaticas.setId(response.getBody().path("id"));

    }

    public void weatherByGeographicCoordinates(String latitude, String longitude) {
        Map<String, String> params = new HashMap<>();
        params.put("latitude", latitude);
        params.put("longitude", longitude);
        params.put("appid", PropertiesManager.getPropertiesValue("TOKEN"));

        Response response =
            given()
                .pathParams(params)
            .when()
                .get("http://api.openweathermap.org/data/2.5/weather?lat={latitude}&lon={longitude}&appid={appid}")
            .then()
                .log().all()
                .statusCode(200)
            .extract().response();

        VariaveisEstaticas.setLatitude(response.getBody().path("coord.lat"));
        VariaveisEstaticas.setLongitude(response.getBody().path("coord.lon"));

    }

    public void weatherByZipCode(String codigo_postal, String pais) {
        Map<String, String> params = new HashMap<>();
        params.put("codigo_postal", codigo_postal);
        params.put("pais", pais);
        params.put("appid", PropertiesManager.getPropertiesValue("TOKEN"));

        Response response =
            given()
                .pathParams(params)
            .when()
                .get("http://api.openweathermap.org/data/2.5/weather?zip={codigo_postal},{pais}&appid={appid}")
            .then()
                .log().all()
                .statusCode(200)
            .extract().response();

        VariaveisEstaticas.setPais(response.getBody().path("sys.country"));
    }

    public void weatherByIds(String ids) {
        Map<String, String> params = new HashMap<>();
        params.put("ids", ids);
        params.put("appid", PropertiesManager.getPropertiesValue("TOKEN"));

        Response response =
            given()
                .pathParams(params)
            .when()
                .get("http://api.openweathermap.org/data/2.5/group?id={ids}&units=metric&appid={appid}")
            .then()
                .log().all()
                .statusCode(200)
            .extract().response();

        VariaveisEstaticas.setQtd(response.getBody().path("cnt"));
    }


}
