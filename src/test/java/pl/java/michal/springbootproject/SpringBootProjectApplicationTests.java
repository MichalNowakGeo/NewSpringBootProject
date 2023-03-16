package pl.java.michal.springbootproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import pl.java.michal.springbootproject.controllers.MyController;

@SpringBootTest
class SpringBootProjectApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	 @Autowired
	 MyController myController;


	 @Test
	 void testAutowireOfController() {
		 System.out.println(myController.sayHello());

	 }

	@Test
	void testGetControllerFtomCx(){
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
