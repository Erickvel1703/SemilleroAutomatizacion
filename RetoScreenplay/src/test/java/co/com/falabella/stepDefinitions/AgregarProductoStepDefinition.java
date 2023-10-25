package co.com.falabella.stepDefinitions;

import co.com.falabella.questions.ValidarCarroCompras;
import co.com.falabella.tasks.AgregarProducto;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class AgregarProductoStepDefinition {


    @Managed(driver = "edge")
    private WebDriver navegador;
    private Actor erick = Actor.named("erick");

    @Before
    public void configuracion (){
        erick.can(BrowseTheWeb.with(navegador));

    }

    @When("el da click en agregar producto al carro de compras")
    public void elDaClickEnAgregarProductoAlCarroDeCompras() {
    erick.attemptsTo(AgregarProducto.agregarProducto());

    }
    @Then("el usuario visualizara un mensaje de lo que llevas en tu carro")
    public void elUsuarioVisualizaraUnMensajeDeLoQueLlevasEnTuCarro() {
    erick.should(GivenWhenThen.seeThat("el puede ver", ValidarCarroCompras.validarCarroCompras(), Matchers.equalTo(true)));

    }






}
