package Singleton;

public class LoggerImplemenation implements loggerInterface {

	public static LoggerImplemenation logger;
	
	private LoggerImplemenation() {}
	
	public String getLogError(int i) {
		
		return "Error : 1";
	}
	
	public void logError() {
		System.out.println("Error is logged Successfuly");
	}
	
	public static LoggerImplemenation getInstance() {
		
		if(logger == null) {
			synchronized (LoggerImplemenation.class) {
				if(logger == null) {
					logger = new LoggerImplemenation();
					System.out.println("new Instance Created");
				}
			}
		}
		
		return logger;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerImplemenation obj = getInstance();
		LoggerImplemenation obj2 = getInstance();
		obj.logError();
		
		
	}

}
