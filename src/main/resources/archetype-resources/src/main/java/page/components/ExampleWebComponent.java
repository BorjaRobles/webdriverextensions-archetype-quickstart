#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.page.components;

import org.andidev.webdriverextension.WebComponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExampleWebComponent extends WebComponent {

    // Model
    @FindBy(css = "cssselector")
    public WebElement exampleWebElement;
    // ...add your Component's WebElements and WebComponents here
}
