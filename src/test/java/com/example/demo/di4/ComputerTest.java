package com.example.demo.di4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class ComputerTest {
	
	@Autowired
	Coding coding;//스프링이 ComponentScan을 해서 만든 객체를 주입해준다.
	
	@Test
	public void computerTest() {
		System.out.println(coding.getComputer().getScreenWidth()); 
		
	}
	
}
