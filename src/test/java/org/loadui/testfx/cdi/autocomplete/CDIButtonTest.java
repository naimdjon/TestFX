/*
 * Copyright [2013] [www.rapidpm.org / Sven Ruppert (sven.ruppert@rapidpm.org)]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.loadui.testfx.cdi.autocomplete;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.loadui.testfx.GuiTest;
import org.loadui.testfx.categories.TestFX;

import static org.loadui.testfx.Assertions.verifyThat;
import static org.loadui.testfx.controls.Commons.hasText;

/**
 * User: Sven Ruppert Date: 17.09.13 Time: 15:29
 */
@Category( TestFX.class )
public class CDIButtonTest extends GuiTest {

//    @Inject CDIButton button;

    @Override
    protected Parent getRootNode() {
        final CDIButton button = cdi.getManagedInstance(CDIButton.class);
        button.setId("btn");
        button.setLoggedText("Hello World");
        button.setOnAction((actionEvent)-> button.setLoggedText( "was clicked" ));
        return button;
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



}
