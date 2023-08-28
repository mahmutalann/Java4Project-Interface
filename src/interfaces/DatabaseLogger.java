package interfaces;

public class DatabaseLogger implements Logger{ //implements like extends. The difference between implements and extends is implements write only required codes but extends can write except for the base class.   
  
	
	@Override
	public void log(String message) {
		System.out.println("Database logged : " + message);
	}

}
