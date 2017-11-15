package org.fage.test;


import java.util.Iterator;

import org.fage.domain.Actor;
import org.fage.domain.Movie;
import org.fage.node.repository.MovieRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class MovieTest {
	@Autowired
	MovieRepository movieRepository;
	@Before
	public void initData(){
		movieRepository.deleteAll();
		//设置电影
		Movie m1 = new Movie();
		m1.setTitle("战狼2");
		m1.setYear("2017-9-1");
		
		Movie m2 = new Movie();
		m2.setTitle("钢铁侠3");
		m2.setYear("2016-1-1");
		//设置演员
		Actor wujing = new Actor();
		wujing.setName("吴京");

		Actor lujinshan = new Actor();
		lujinshan.setName("卢靖姗");
		
		Actor robat = new Actor();
		robat.setName("小罗伯特唐尼");
		
		//加入演员
		m1.addRole(wujing, "冷锋");
		m1.addRole(lujinshan, "医生");
		m2.addRole(robat, "钢铁侠");
		//存储战狼电影
		movieRepository.save(m1);
		System.out.println(m1.getId());
		//存储钢铁侠电影
		movieRepository.save(m2);
		System.out.println(m2.getId());
	}
	
	@Test
	public void testGet(){
		Iterator<Movie> movies = movieRepository.findAll().iterator();
		while(movies.hasNext()){
			System.out.println(movies.next().getTitle());
		}
	}
	
}
