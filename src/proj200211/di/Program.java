package proj200211.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import proj200211.di.ui.Console;

public class Program {
	public static void main(String [] args) {
		
	ApplicationContext context = 
			new ClassPathXmlApplicationContext("proj200211/di/setting.xml");
	
		
		 
	
		 Console console = context.getBean(Console.class);
		 console.print();
		
		
	}
}
