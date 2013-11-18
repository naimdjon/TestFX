package org.loadui.testfx;

import javafx.scene.Node;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.loadui.testfx.matchers.HasLabelMatcher;
import org.loadui.testfx.matchers.HasLabelStringMatcher;
import org.loadui.testfx.matchers.VisibleMatcher;
import org.loadui.testfx.matchers.VisibleQueryMatcher;

public class Matchers
{
    /**
     * Matches any Labeled Node that has the given label.
     *
     * @param label
     */
	@Factory
	public static Matcher<Object> hasLabel( String label )
	{
		return new HasLabelStringMatcher( label );
	}

    /**
     * Matches any Labeled Node that has a label that matches the given stringMatcher.
     *
     * @param stringMatcher
     */
	@Factory
	public static Matcher<Object> hasLabel( Matcher<String> stringMatcher )
	{
		return new HasLabelMatcher( stringMatcher );
	}

	/**
	 * Matches any Node with matching query who´s isVisible returns true
	 *
	 */
	@Factory
	public static Matcher<String> visible()
	{
		return new VisibleQueryMatcher();
	}

	/**
	 * Matches any Node who´s isVisible returns true
	 *
	 */
	@Factory
	public static Matcher<Node> nodeVisible()
	{
		return new VisibleMatcher();
	}



}
