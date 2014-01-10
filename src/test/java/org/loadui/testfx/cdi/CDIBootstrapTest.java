package org.loadui.testfx.cdi;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.loadui.testfx.GuiTest;
import org.loadui.testfx.categories.TestFX;
import org.rapidpm.commons.cdi.logger.CDILogger;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.inject.Inject;

import static org.loadui.testfx.Assertions.verifyThat;
import static org.loadui.testfx.controls.Commons.hasText;

/**
 * Created by Sven Ruppert on 10.01.14.
 */

@Category( TestFX.class )
public class CDIBootstrapTest extends GuiTest {

    @Override
    protected Parent getRootNode() {
        final Button btn = new Button();
        btn.setId("btn");
        btn.setText("Hello World");
        btn.setOnAction((actionEvent)-> btn.setText( "was clicked" ));
        return btn;
    }


    /**
     * Default TestFX Test
     */
    @Test
    public void shouldClickButton(){
        final Button button = find( "#btn" );
        click(button);
        verifyThat( "#btn", hasText("was clicked") );
    }


    @Inject @CDILogger Logger logger;
    /**
     * test the CDI Settup
     */
    @Test
    public void cdiBootstrapTest(){
        Assert.assertNotNull(logger);
    }





}
