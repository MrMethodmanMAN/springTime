package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
			// check that they are the same reference
		boolean result = (theCoach == alphaCoach);
		
		// print out results 
		System.out.println("printing to the same oject : " + result);
		
		// print out the memory location 
		System.out.println("\n Memory location fro theCoach : " + theCoach);
		
		System.out.println("\n Memory location for alphaCoach " + alphaCoach + "\n" );
	
		//Close the context 
		context.close();
	}

}








