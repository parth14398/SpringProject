package com.example.photoApp;

import com.example.photoApp.Model.AlbumWithDatabase;
import com.example.photoApp.Service.AlbumWithDatabaseService;
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
public class AlbumTests {


	@Autowired
	private AlbumWithDatabaseService albumWithDatabaseService;

	@Before
	public void setData(){
		albumWithDatabaseService.savaData(new AlbumWithDatabase("parthalbum","urlpic.com",
				"1/03/1998","parth"));
	}

	@Test
	public void getData(){
		List<AlbumWithDatabase> albumList = albumWithDatabaseService.getData();
		AlbumWithDatabase album = albumList.get(0);
		Assert.assertEquals("parth",album.getCreatedBy());
	}

	@Test
	public void updateData(){
		List<AlbumWithDatabase> albumList = albumWithDatabaseService.getData();
		AlbumWithDatabase album = albumList.get(0);
		album.setCreatedBy("soni");
		Assert.assertEquals("soni",album.getCreatedBy());
	}
}
