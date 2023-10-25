package co.com.falabella.questions;

import co.com.falabella.userInterface.PaginaPrincipalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLoginExitoso implements Question {


    @Override
    public Boolean answeredBy(Actor actor) {
        return PaginaPrincipalUI.BTN_HOLA_USUARIO.resolveFor(actor).isVisible();
    }

    public static Question validarLoginExitoso() {
        return new ValidarLoginExitoso();

    }

}
