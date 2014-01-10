package org.loadui.testfx.cdi;

import org.rapidpm.commons.cdi.contextresolver.CDIContext;

import javax.inject.Singleton;

/**
 * Created by ts40 on 10.01.14.
 */
@Singleton
public class CDITestContext implements CDIContext {
    @Override
    public boolean isMockedModusActive() {
        return false;
    }
}
