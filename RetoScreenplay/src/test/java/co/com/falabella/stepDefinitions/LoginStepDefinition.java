package co.com.falabella.stepDefinitions;

import co.com.falabella.questions.ValidarLoginExitoso;
import co.com.falabella.questions.ValidarLoginFallido;
import co.com.falabella.tasks.LoginExitoso;
import co.com.falabella.tasks.LoginFallido;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {


    @Managed(driver = "edge")
    private WebDriver navegador;
    private Actor erick = Actor.named("erick");

    @Before
    public void configuracion() {
        erick.can(BrowseTheWeb.with(navegador));

    }


    @Given("que el usuario se encuentre en la pagina web")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {
        erick.wasAbleTo(Open.url("https://www.falabella.com.co/falabella-co"));


    }


    @When("Ingrese el usuario con la clave")
    public void ingreseElUsuarioConLaClave() {
        erick.attemptsTo(LoginExitoso.iniciar());


    }

    @Then("el usuario visualizara un hola y su nombre en el boton cuenta")
    public void elUsuarioVisualizaraUnHolaYSuNombreEnElBotonCuenta() {
        erick.should(GivenWhenThen.seeThat("el puede ver", ValidarLoginExitoso.validarLoginExitoso(), Matchers.equalTo(true)));

    }


    @When("Ingrese con las credenciales incorrectas")
    public void ingreseConLasCredencialesIncorrectas() {
        erick.attemptsTo(LoginFallido.fallido());

    }

    @Then("el usuario visualizara un mensaje de credenciales incorrectas")
    public void elUsuarioVisualizaraUnMensajeDeCredencialesIncorrectas() {
        erick.should(GivenWhenThen.seeThat("el puede ver el mensaje", ValidarLoginFallido.validarLoginFallido(), Matchers.equalTo(true)));
    }


}
