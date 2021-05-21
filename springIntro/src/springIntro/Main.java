package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("applicationContext.xml");

	ICustomerService iCustomerService = context.getBean("service",ICustomerService.class); 
	iCustomerService.add();
	
	
	//CustomerManager'�n constructor'�nda parametre oldu�u i�in newleyemiyor
	//applicationContext.xml'e constructor parametresinin eklenmesi gerekir
	
	
	/*CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
	manager.add();*/
	//do�rudan CustomerManager newlemek yerine interface kulland�k
	
	
	}

}
