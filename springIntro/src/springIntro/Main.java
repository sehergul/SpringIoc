package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("applicationContext.xml");

	ICustomerService iCustomerService = context.getBean("service",ICustomerService.class); 
	iCustomerService.add();
	
	
	//CustomerManager'ýn constructor'ýnda parametre olduðu için newleyemiyor
	//applicationContext.xml'e constructor parametresinin eklenmesi gerekir
	
	
	/*CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
	manager.add();*/
	//doðrudan CustomerManager newlemek yerine interface kullandýk
	
	
	}

}
