package com.lukaroncevic.spring6di;

import com.lukaroncevic.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController controller;

	@Test
	void testAutowireOfController() {
		System.out.println(controller.sayHello());
	}

	@Test
	void testGetControllerFromCtx() {
		MyController controller = applicationContext.getBean(MyController.class);

		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
