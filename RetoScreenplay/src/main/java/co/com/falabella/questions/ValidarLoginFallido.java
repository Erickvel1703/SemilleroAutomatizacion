package co.com.falabella.questions;

import co.com.falabella.userInterface.PaginaPrincipalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLoginFallido implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return PaginaPrincipalUI.MSJ_LOGIN_FALLIDO.resolveFor(actor).isVisible();
    }

    public static Question validarLoginFallido() {

        return new ValidarLoginFallido();
    }
}
