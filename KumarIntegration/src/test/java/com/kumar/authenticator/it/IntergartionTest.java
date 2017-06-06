package com.kumar.authenticator.it;
import org.junit.Test;

import com.kumar.authenticator.*;

import junit.framework.Assert;

public class IntergartionTest {
    
   @Test
   public void integratedTest(){
		UserInformation uinfo = new UserInformation();
		Lock lock = new Lock(10);
    	uinfo.setName("test");
    	uinfo.setId(2);
    	uinfo.setSecret(5);
    Assert.assertEquals(true,lock.unlock(uinfo.calcualteKey().intValue()));
		
    Assert.assertEquals(false, lock.isLocked());
    lock.lock();
    Assert.assertEquals(true,lock.isLocked());
 }
	
}
