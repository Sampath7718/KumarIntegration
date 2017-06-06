package com.kumar.authenticator.unit;
import org.junit.Test;

import com.kumar.authenticator.UserInformation;
import com.kumar.authenticator.unit.*;

import junit.framework.Assert;




public class USerInformationTest {

	 @Test
	 public void testKey(){
	UserInformation uinfo = new UserInformation();
       uinfo.setId(10);
       uinfo.setName("Ram");
       uinfo.setSecret(20);
       Assert.assertEquals(uinfo.calcualteKey().intValue(), 200);
	
	 }
	 
	 @Test
	 public void testUserName(){
	UserInformation uinfo = new UserInformation();
       uinfo.setId(10);
       uinfo.setName("Ram");
       uinfo.setSecret(200);
       Assert.assertEquals(uinfo.getName(), "Ram" );
	 
	
}
}