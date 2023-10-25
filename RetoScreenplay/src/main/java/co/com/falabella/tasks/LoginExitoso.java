package co.com.falabella.tasks;

import co.com.falabella.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static co.com.falabella.userInterface.PaginaPrincipalUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class LoginExitoso implements Task {

    Excel excel = new Excel();

    private static final String RUTA = "data.xlsx";
    private static final String HOJA = "DatosLogin";


    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(

                    Click.on(BTN_HOLA),
                    Click.on(BTN_INICIAR_SESION),
                    Enter.theValue(excel.leerDatosExcel(RUTA, HOJA, 1, 0)).into(TXT_CORREO),
                    Enter.theValue(excel.leerDatosExcel(RUTA, HOJA, 1, 1)).into(TXT_CLAVE),
                    Click.on(BTN_INGRESAR),
                    WaitUntil.the(BTN_HOLA_USUARIO, isClickable()).forNoMoreThan(240).seconds()


            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public static LoginExitoso iniciar() {

        return instrumented(LoginExitoso.class);
    }

}
