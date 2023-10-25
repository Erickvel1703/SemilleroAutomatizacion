package co.com.falabella.tasks;

import co.com.falabella.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import java.io.IOException;

import static co.com.falabella.userInterface.PaginaCategoriaUI.BTN_AGREGAR_CARRITO;
import static co.com.falabella.userInterface.PaginaCategoriaUI.PIC_PRODUCTO;
import static co.com.falabella.userInterface.PaginaPrincipalUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AgregarProducto implements Task {

    Excel excel = new Excel();

    private static final String RUTA = "data.xlsx";
    private static final String HOJA = "BusquedaProducto";


    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(

                    Enter.theValue(excel.leerDatosExcel(RUTA, HOJA, 1, 0)).into(TXT_BUSQUEDA),
                    Click.on(BTN_BUSCAR),
                    Scroll.to(PIC_PRODUCTO),
                    Click.on(BTN_AGREGAR_CARRITO)


            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static AgregarProducto agregarProducto() {
        return instrumented(AgregarProducto.class);

    }
}
