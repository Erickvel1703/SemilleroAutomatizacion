package co.com.falabella.questions;

import co.com.falabella.userInterface.PaginaCategoriaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarCarroCompras implements Question {


    @Override
    public Boolean answeredBy(Actor actor) {
        return PaginaCategoriaUI.MSJ_AGREGAR_PRODUCTO.resolveFor(actor).isVisible();
    }

    public static Question validarCarroCompras() {
        return new ValidarCarroCompras();

    }

}
