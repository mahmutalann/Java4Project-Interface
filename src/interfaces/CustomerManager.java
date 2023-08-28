package interfaces;

public class CustomerManager {
	private Logger [] loggers;

		
		public CustomerManager(Logger [] loggers) {
		this.loggers = loggers;
	}

		//loosly - tightly coupled
		public void add(Customer customer) { 
		System.out.println("Customer added " + customer.getFirstName());
		/*this code structure is tightly coupled. Instead of this structure can use design pattern. This pattern is dependency injection.
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " databse logged");
		*/
		/*
		This structure cancels so using static structure in Utils class. 
		Utils utils = new Utils();
		*/
		Utils.runLoggers(loggers, customer.getFirstName());
		/*
		 For utils class, this structure cancel.
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
		*/
		//this.logger.log(customer.getFirstName());
	}
	
	
	public void delete(Customer customer) {
		
		System.out.println("Customer deleted " + customer.getFirstName());
		/*this code structure is tightly coupled
		DatabaseLogger logger = new DatabaseLogger();
		System.out.println(customer.getFirstName() + " database deleted");
		*/
		/*
		This structure cancels so using static structure in Utils class. 
		Utils utils = new Utils();
		*/
		Utils.runLoggers(loggers, customer.getFirstName());
		/*
		 For utils class, this structure cancel.
		 for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
		*/
		//this.logger.log(customer.getFirstName());

	}
}
