package org.pop.hit;

import org.pop.Ent.Auditorium;
import org.pop.Ent.Instrumentalist;
import org.pop.Ent.PerformanceException;
import org.pop.Ent.Performer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HitApplication {

	public static void main(String[] args) throws PerformanceException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/pop/Ent/Perform.xml");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!! START MAIN !!!!!!!!!!!!!!!!!!!!!!!!!!");
		// Auditorium hall = (Auditorium) ctx.getBean("hall");
		Performer kenny = (Performer) ctx.getBean("pianist");
		kenny.perform();
		kenny.perform();
	}

}
