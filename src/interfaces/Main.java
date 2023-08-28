package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger [] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger(), new SmsLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer xxx = new Customer(1, "xxx", "yyy");
		
		customerManager.add(xxx);
	}

}
