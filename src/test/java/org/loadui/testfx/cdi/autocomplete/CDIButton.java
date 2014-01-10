package org.loadui.testfx.cdi.autocomplete;

import javafx.scene.control.Button;
import org.rapidpm.commons.cdi.logger.CDILogger;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.inject.Inject;

/**
 * Created by ts40 on 10.01.14.
 */
public class CDIButton extends Button {

    @Inject @CDILogger Logger logger;

    public void setLoggedText(String text){
        if (logger.isDebugEnabled()) {
            logger.debug("text will set to -> " + text);
        }
        this.setText(text);
    }




}
