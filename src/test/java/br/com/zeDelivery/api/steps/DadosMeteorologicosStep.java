package br.com.zeDelivery.api.steps;

import br.com.commons.VariaveisEstaticas;
import br.com.zeDelivery.api.funcionalidades.DadosMeteorologicosFunc;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class DadosMeteorologicosStep {

    DadosMeteorologicosFunc dadosMeteorologicosFunc = new DadosMeteorologicosFunc();

    @Quando("^realizo uma requisição GET no serviço pelo nome \"([^\"]*)\"$")
    public void realizoUmaRequisiçãoGETNoServiçoPeloNome(String nome) {
        dadosMeteorologicosFunc.weatherByCityName(nome);
    }

    @Quando("^realizo uma requisição GET no serviço pelo id da cidade \"([^\"]*)\"$")
    public void realizoUmaRequisiçãoGETNoServiçoPeloIdDaCidade(String id) {
        dadosMeteorologicosFunc.weatherByCityId(id);
    }

    @Quando("^realizo uma requisição GET no serviço pela coordenada da cidade lat \"([^\"]*)\" long \"([^\"]*)\"$")
    public void realizoUmaRequisiçãoGETNoServiçoPelaCoordenadaDaCidadeLongLat(String latitude, String longitude) {
        dadosMeteorologicosFunc.weatherByGeographicCoordinates(latitude, longitude);

    }


    @Quando("^realizo uma requisição GET no serviço pelo código postal \"([^\"]*)\" do país \"([^\"]*)\"$")
    public void realizoUmaRequisiçãoGETNoServiçoPeloCódigoPostalDoPaís(String codigo_postal, String pais)  {
        dadosMeteorologicosFunc.weatherByZipCode(codigo_postal, pais);

    }

    @Então("^valido o nome \"([^\"]*)\" no retorno do serviço$")
    public void validoONomeNoRetornoDoServiço(String nome) {
        assertEquals(nome, VariaveisEstaticas.getNome());
    }

    @Então("^valido o id \"([^\"]*)\" no retorno do serviço$")
    public void entãoValidoOIdNoRetornoDoServiço(String id) {
        int convertId = Integer.parseInt(id);
        assertEquals(convertId, VariaveisEstaticas.getId());
    }

    @Então("^valido a lat \"([^\"]*)\" long \"([^\"]*)\" no retorno do serviço$")
    public void validoALatLongNoRetornoDoServiço(String lat, String lon) {
        int convertLat = Integer.parseInt(lat);
        int convertLong = Integer.parseInt(lon);
        assertEquals(convertLat, VariaveisEstaticas.getLatitude());
        assertEquals(convertLong, VariaveisEstaticas.getLongitude());
    }

    @Então("^valido o país \"([^\"]*)\" no retorno do serviço$")
    public void validoOPaísNoRetornoDoServiço(String pais) throws Throwable {
        assertEquals(pais, VariaveisEstaticas.getPais());
    }

    @Quando("^realizo uma requisição GET no serviço pelos IDs \"([^\"]*)\"$")
    public void realizoUmaRequisiçãoGETNoServiçoPelosIDs(String ids) throws Throwable {
        dadosMeteorologicosFunc.weatherByIds(ids);
    }

    @Então("^valido a quantidade de \"([^\"]*)\" IDs no retorno da api$")
    public void validoAQuantidadeDeIDsNoRetornoDaApi(String qtd) {
        int convertQtd = Integer.parseInt(qtd);
        Assert.assertEquals(convertQtd, VariaveisEstaticas.getQtd());
    }
}
