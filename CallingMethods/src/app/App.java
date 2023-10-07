package app;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

class User {
	public int id;
}


class Employee extends User {
	public String name;
	
	private String password;
	
	private boolean setUpdated(int sequence) {
		System.out.println("setUpdated: "+sequence);
		return true;
	}
	
}


public class App {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub


		Class<Employee> clazz = Employee.class;
		
		var nameField = clazz.getField("name");
		
		System.out.println(nameField);
		
		var setUpdateMethod = clazz.getDeclaredMethod("setUpdated", int.class);
		
		setUpdateMethod.setAccessible(true);
		
		setUpdateMethod.invoke(new Employee(), 7);		
	
		
	}

}
