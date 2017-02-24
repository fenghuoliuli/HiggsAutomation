package com.inmind.utils;

import org.testng.Assert;

public class CommonUtil{
	public void AssertEqualsCustomize(final String actual, final String expected){
		Assert.assertEquals(actual, expected,"\nThe actual value is:"+actual+"\nThe expected value is:"+expected+"\n");
	}
	public void AssertEqualsCustomize(final double actual, final double expected){
		Assert.assertEquals(actual, expected,"\nThe actual value is:"+actual+"\nThe expected value is:"+expected+"\n");
	}
	
	public void AssertEqualsCustomize(final long actual, final long expected) {
		Assert.assertEquals(actual, expected,"\nThe actual value is:"+actual+"\nThe expected value is:"+expected+"\n");
	}
	
	public void AssertEqualsCustomize(final boolean actual, final boolean expected){
		Assert.assertEquals(actual, expected,"\nThe actual value is:"+actual+"\nThe expected value is:"+expected+"\n");
	}
	
	public void AssertEqualsCustomize(final byte actual, final byte expected){
		Assert.assertEquals(actual, expected,"\nThe actual value is:"+actual+"\nThe expected value is:"+expected+"\n");
	} 
	
	public void AssertEqualsCustomize(final char actual, final char expected){
		Assert.assertEquals(actual, expected,"\nThe actual value is:"+actual+"\nThe expected value is:"+expected+"\n");
	}
	
	public void AssertEqualsCustomize(final short actual, final short expected){
		Assert.assertEquals(actual, expected,"\nThe actual value is:"+actual+"\nThe expected value is:"+expected+"\n");
	}
	
	public void AssertEqualsCustomize(final int actual, final int expected){
		Assert.assertEquals(actual, expected,"\nThe actual value is:"+actual+"\nThe expected value is:"+expected+"\n");
	}
	
	public <T> void AssertEqualsCustomize(final T actual, final T expected){
		Assert.assertEquals(actual, expected,"\nThe actual value is:"+actual+"\nThe expected value is:"+expected+"\n");
	}
}