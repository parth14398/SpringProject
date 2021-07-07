package com.example.photoApp;

import com.example.photoApp.Model.UserWithDatabase;
import com.example.photoApp.Service.UserWithDatabaseService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {
	@Autowired
	private UserWithDatabaseService userWithDatabaseService;

	@Before
	public void setData(){
		userWithDatabaseService.savaData(new UserWithDatabase("parth3323232323","parth",
				"",10));
	}
	@Test
	public void getdata(){
		List<UserWithDatabase> user = userWithDatabaseService.getDataByname("parth3323232323");
		UserWithDatabase user1 =user.get(0);
		Assert.assertEquals(10,user1.getAge());
	}
	@Test
	public void updateData(){
		List<UserWithDatabase> user = userWithDatabaseService.getDataByname("parth3323232323");
		UserWithDatabase user1 =user.get(0);
		user1.setAge(20);
		Assert.assertEquals(20,user1.getAge());
	}

}
