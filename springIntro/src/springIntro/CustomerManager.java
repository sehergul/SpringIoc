package springIntro;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal iCustomerDal;
	
//	Constructor injection
//	public CustomerManager(ICustomerDal iCustomerDal) {
//		this.iCustomerDal = iCustomerDal;
//	}
	
	@Override
	public void add() {
		this.iCustomerDal.add();
	}

	
//	Setter injection
	public void setiCustomerDal(ICustomerDal iCustomerDal) {
		this.iCustomerDal = iCustomerDal;
	}
//	setter kullanmak için applicationContext.xml'e property eklenmesi gerekir
	
	
}
