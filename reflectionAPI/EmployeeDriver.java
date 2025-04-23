package reflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployeeDriver {
	public static void main(String[] args) throws Exception{
		Class<Employee> employee =Employee.class;
		//fetching all the field names of a class
		Field[] fields = employee.getDeclaredFields();
		
		
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		System.out.println("-------------------------------------------------------------------------------");
		//changing the value of a field of a particular object
		Employee e = new Employee(1,"Shreyanshi",30000,22);
		Field f = employee.getDeclaredField("name");
		
		f.setAccessible(true);
		f.set(e,"Shrey");
		System.out.println(f.get(e));
		f.setAccessible(false);
		System.out.println(e.getName());
		
		System.out.println("----------------------------------------------------------------------------------");
		
		Method[] methods = employee.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("----------------------------------------------------------------------------------");
		
		for(Method method : methods) {
			if(method.isAnnotationPresent(Deprecated.class)) {
				System.out.println(method.getName());
				System.out.println(method.invoke(e));
			}
		}
	}
}
