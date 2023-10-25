package co.com.falabella.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PaginaPrincipalUI {


public static final Target BTN_HOLA = Target.the("Desplegar opciones inicio").located(By.id("testId-UserAction-userinfo"));
public static final Target BTN_INICIAR_SESION = Target.the("crear cuenta").located(By.id("testId-loggedout-item-0"));
public static final  Target TXT_CORREO = Target.the("ingresar correo").located(By.id("testId-cc-login-form-email-input"));
public static final  Target TXT_CLAVE = Target.the("ingresar clave").located(By.id("testId-cc-login-form-password-input"));
public static final  Target BTN_INGRESAR = Target.the("click ingresar").located(By.id("testId-cc-login-form-submit"));
public static final Target BTN_HOLA_USUARIO = Target.the("validar login exitoso").located(By.id("testId-UserAction-userinfo"));
public static final Target MSJ_LOGIN_FALLIDO = Target.the("validar login fallido").locatedBy("//div[text()='Correo electrónico o contraseña incorrecta. Por favor, vuelve a intentarlo nuevamente.']");
//localizadores flujo agregar producto
public static final Target TXT_BUSQUEDA = Target.the("ingresar producto").located(By.id("testId-SearchBar-Input"));
public static final Target BTN_BUSCAR = Target.the("click buscar").locatedBy("//*[@id='testId-search-wrapper']/div[2]/button");




}
