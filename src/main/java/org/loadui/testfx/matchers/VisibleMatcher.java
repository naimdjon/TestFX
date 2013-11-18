package org.loadui.testfx.matchers;

import javafx.scene.Node;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.junit.internal.matchers.TypeSafeMatcher;

public class VisibleMatcher extends TypeSafeMatcher<Node>
{
	public void describeTo( Description desc )
	{
		desc.appendText( "visible" );
	}

	@Factory
	public static Matcher<Node> visible()
	{
		return new VisibleMatcher();
	}

	@Override
	public boolean matchesSafely( Node target )
	{
		return target.isVisible();
	}
}

