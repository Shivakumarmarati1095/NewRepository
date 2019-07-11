package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
public class MobileTest {
	@Test

	public void testStartCameraAppWhenCameraFunctionNormally(){
		//Mocking
		Camera mockedCamera = Mockito.mock(Camera.class);
		
		//stubbing
		Mockito.when(mockedCamera.on()).thenReturn(true);
		
		
		
		Mobile mobile = new Mobile(mockedCamera);
		
		boolean actualStatus = mobile.startCameraApp();
		boolean expectedStatus = true;
		assertEquals(expectedStatus,actualStatus);
	}
}
