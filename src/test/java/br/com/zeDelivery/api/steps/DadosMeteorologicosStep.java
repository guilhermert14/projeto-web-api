package br.com.zeDelivery.api.steps;

import br.com.zeDelivery.api.funcionalidades.DadosMeteorologicosFunc;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Quando;

public class DadosMeteorologicosStep {

    DadosMeteorologicosFunc dadosMeteorologicosFunc = new DadosMeteorologicosFunc();

    @Quando("^realizo uma requisição GET no serviço pelo nome \"([^\"]*)\"$")
    public void realizoUmaRequisiçãoGETNoServiçoPeloNome(String nome) {

    }

    @Quando("^realizo uma requisição GET no serviço pelo id da cidade \"([^\"]*)\"$")
    public void realizoUmaRequisiçãoGETNoServiçoPeloIdDaCidade(String id)  {
    }

    @Quando("^realizo uma requisição GET no serviço pela coordenada da cidade long \"([^\"]*)\" lat \"([^\"]*)\"$")
    public void realizoUmaRequisiçãoGETNoServiçoPelaCoordenadaDaCidadeLongLat(String longitude, String latitude) {

    }

    @Quando("^realizo uma requisição GET no serviço pelas cidades \"([^\"]*)\"$")
    public void realizoUmaRequisiçãoGETNoServiçoPelasCidades(String cidades) {

    }
}
