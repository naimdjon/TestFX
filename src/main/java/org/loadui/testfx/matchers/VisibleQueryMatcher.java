package org.loadui.testfx.matchers;

import javafx.scene.Node;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.junit.internal.matchers.TypeSafeMatcher;
import org.loadui.testfx.exceptions.NoNodesFoundException;

import static org.loadui.testfx.GuiTest.find;

public class VisibleQueryMatcher extends TypeSafeMatcher<String>
{
	public void describeTo( Description desc )
	{
		desc.appendText( "visible" );
	}

	@Factory
	public static Matcher<String> visible()
	{
		return new VisibleQueryMatcher();
	}

	@Override
	public boolean matchesSafely( String target )
	{
		try
		{
			Node node = find(target );
			return node.isVisible();
		}
		catch( NoNodesFoundException e )
		{
			return false;
		}
	}
}
