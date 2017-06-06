package com.kumar.authenticator.unit;
import org.junit.Test;

import com.kumar.authenticator.Lock;
import com.kumar.authenticator.*;

import junit.framework.Assert;

public class LockTest {

	
	@Test
	public void lockTest(){
	 Lock lock = new Lock(10);
	 Assert.assertEquals(true,lock.locked);
	 Assert.assertEquals(true,lock.unlock(10));
	 
	 Assert.assertEquals(false,lock.locked);
	 
	 lock.lock();
	 
	 Assert.assertEquals(true,lock.isLocked());
	 Assert.assertEquals(false,lock.unlock(1));
	 Assert.assertEquals(true,lock.isLocked());
	}
}
