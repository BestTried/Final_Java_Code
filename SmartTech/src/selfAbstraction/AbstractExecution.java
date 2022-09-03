package selfAbstraction;

public class AbstractExecution extends AbstractTest {

	@Override
	public void getEmployeeInformation() {

		
		System.out.println("I was incomplete in other class");
		
		}
	public static void main(String[] args) {
		
		AbstractExecution absExe = new AbstractExecution();
		
		absExe.getEmployeeInformation();
		absExe.getName();
	}

	
	
	
	

}
