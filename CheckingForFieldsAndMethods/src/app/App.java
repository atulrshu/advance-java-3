package app;

import java.util.Arrays;

class User {
	public int id;
}


class Employee extends User {
	public String name;
	
	private String password;
	
	private boolean setUpdated(int sequence) {
		return true;
	}
	
}


public class App {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		// TODO Auto-generated method stub

		Class<Employee> clazz = Employee.class;
		
		var nameField = clazz.getField("name");
		
		System.out.println(nameField);
		
		var setUpdateMethod = clazz.getDeclaredMethod("setUpdated", int.class);
		
		System.out.println(setUpdateMethod);
		
		var methodexists = Arrays.stream(clazz.getDeclaredMethods()).anyMatch(m->m.getName().equals("setUpdated"));
		
		System.out.println(methodexists);
		
	}

}
