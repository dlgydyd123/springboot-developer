package com.example.demo.qualifier;


import org.springframework.beans.factory.annotation.Qualifier;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
//테스트에 필요한 의존성을 대신 제공
public class ComputerTest2 {
	
	@Autowired
	@Qualifier("desktop") 
	//default 값으로 사용할 클래스에 @primary 어노테이션을 붙힌다
	
	Computer1 computer;//주입을 하려고 할텐데 이자리에 Desktop,Laptop 둘다 올수 있어서 문젠
	
	@Test
	public void widthTest() {
		System.out.println(computer.getScreenWidth());
	}
}
