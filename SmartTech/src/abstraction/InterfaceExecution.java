package abstraction;

public class InterfaceExecution implements ClassA,ClassB{
	
	/*
	 We can't extends two class at same time because of the diamond issue
	 
	 But 
	 
	  We can do it in interface. We can use the implements keyword to
	  bring multiple interface at a same time
	 	
	 */


		//When we implements the interface we need to implements all those incomplete method in this class.

		public void getEmployeeSalary() {
			// TODO Auto-generated method stub

		}

		public void getEmployeeID() {
			// TODO Auto-generated method stub

		}

		public void getEmployeeName() {
			// TODO Auto-generated method stub

		}

		public void getEmployeeAdress() {
			// TODO Auto-generated method stub

		}


}
