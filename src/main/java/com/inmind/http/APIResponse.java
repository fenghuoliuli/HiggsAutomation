package com.inmind.http;

import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.*;

import java.util.Map;

/**
 * Help class to check HTTP response
 * 
 * @author Jiang Zhaoting
 */
public class APIResponse {
	protected static final Logger LOGGER = LogManager.getLogger(APIResponse.class);
	private Response response;
	private String body;

	public APIResponse(Response response)
	{
		this.response = response;
	}

	/**
	 * Asserts the status of the HTTP response 
	 * 
	 * @param status
	 *        The expected number that will be compared with actual HTTP response status  
	 * @return
	 *        {@link APIResponse}
	 */
	public APIResponse assertStatus(int status)
	{
		LOGGER.info("The response status is "+Integer.toString(response.getStatus()));
		Assert.assertEquals(status, response.getStatus());
		
		return this;
	}
	
	/**
	 * 
	 * Assert the body of HTTP response
	 * 
	 * @param content
	 *        The content that will be compared with actual HTTP response body
	 * @return
	 */
	public APIResponse assertBody(String content)
	{
		String body = getBody();
		//LOGGER.info(getBody());
		Assert.assertEquals(body,content);
		return this;
	}
	
	/**
	 * Assert HTTP response body contains the expected content
	 * 
	 * @param content
	 *        The expected content in HTTP response
	 * @return
	 *        {@link APIResponse}
	 */
	public APIResponse assertBodyContains(String content)
	{
		String body = getBody();
		LOGGER.info("The response body is:"+getBody());
		LOGGER.info("Checking if the body contains "+content);
		Assert.assertEquals(body.contains(content),true,"\nThe response body is:\n"+body);
		return this;
	}
	
	/**
	 * Assert HTTP response body not contains the expected content
	 * 
	 * @param content
	 *        The expected content in HTTP response
	 * @return
	 *        {@link APIResponse}
	 */
	public APIResponse assertBodyNotContains(String content)
	{
		String body = getBody();
		LOGGER.info("The response body is:"+getBody());
		Assert.assertNotEquals(body.contains(content), true,"\nThe response body is:\n"+body);
		return this;
	}
	
	/**
	 * Get the body of HTTP response as String
	 * 
	 * @return the body of HTTP response
	 */
	public String getBody()
	{
		if(body == null)
		{
			response.bufferEntity();
			return response.readEntity(String.class);
		}
		return body;
	}
	
	/**
	 * Get the cookie of HTTP response as String
	 * 
	 * @return the cookie 
	 */	
	
	public Map<String,NewCookie> getcookie()
	{
		return response.getCookies();
	}
	

	
	/**
	 * Get the body as the given type
	 * 
	 * @param t
	 *        The class type that you want to get
	 * @return
	 *        The response body as given type
	 */
	public <T> T getBody(Class<T> t)
	{
		return response.readEntity(t);
	}
	

}
