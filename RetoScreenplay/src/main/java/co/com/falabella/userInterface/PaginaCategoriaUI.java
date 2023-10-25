package co.com.falabella.userInterface;

import net.serenitybdd.screenplay.targets.Target;


public class PaginaCategoriaUI {

    public static final Target PIC_PRODUCTO = Target.the("producto a elegir").locatedBy("//*[@id='testId-pod-image-https://falabella.scene7.com/is/image/FalabellaCO/72724762_1']");
    public static final Target BTN_AGREGAR_CARRITO = Target.the("click agregar producto").locatedBy("//*[@id=\"testId-Pod-action-72724762\"]/div/div");
    public static final Target MSJ_AGREGAR_PRODUCTO = Target.the("mensaje agregar producto").locatedBy("//span/span[contains(text(),'Lo que llevas en tu Carro')]");
}
