package com.kumar.authenticator.unit;

import org.junit.Test;

import com.kumar.authenticator.Lock;
import com.kumar.authenticator.UserInformation;

import junit.framework.Assert;

public class PerformanceTest {

	@Test
	public void performanceTest(){
		

		for (int i=0; i<100000;i++){
			Lock lock =new Lock(1);
			UserInformation uinfo = new UserInformation();
		    uinfo.setId(1);
		    uinfo.setSecret(1);
		    Assert.assertEquals(lock.unlock(uinfo.calcualteKey().intValue()), lock.unlock(1));
         			
			
		}
	}
}
