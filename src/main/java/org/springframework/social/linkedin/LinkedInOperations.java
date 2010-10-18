package org.springframework.social.linkedin;

import java.util.List;

/**
 * <p>
 * Interface specifying a basic set of operations for interacting with LinkedIn.
 * Implemented by {@link LinkedInTemplate}. Not often used directly, but a
 * useful option to enhance testability, as it can easily be mocked or stubbed.
 * </p>
 * 
 * <p>
 * Many of the methods contained in this interface require OAuth authentication
 * with LinkedIn. When a method's description speaks of the "current user", it
 * is referring to the user for whom the access token has been issued.
 * </p>
 * 
 * @author Craig Walls
 */
public interface LinkedInOperations {
	/**
	 * Retrieves the user's LinkedIn profile ID.
	 * 
	 * @return the user's LinkedIn profile ID.
	 */
	String getProfileId();

	/**
	 * Retrieves a URL to the user's public profile page.
	 * 
	 * @return a URL to the user's public profile page.
	 */
	String getProfileUrl();

	/**
	 * Retrieves the current user's profile details.
	 * 
	 * @return the user's profile data.
	 */
	LinkedInProfile getUserProfile();

	/**
	 * Retrieves the 1st-degree connections from the current user's network.
	 * 
	 * @return the user's connections
	 */
	List<LinkedInProfile> getConnections();
}