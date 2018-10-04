package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author taleko01
 */

public class Main {
	
	public static void main(String[] args) {
		Example instance = Example.getInstance();
		Example instance2 = null;
		System.out.println(instance);
		
		Constructor<?>[] constructors = Example.class.getDeclaredConstructors();
		try {
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (Example) constructor.newInstance();
				break;
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(instance2);
		
		
		// ExampleEnum
		ExampleEnum exampleEnum = ExampleEnum.INSTANCE;
		ExampleEnum exampleEnum2 = null;
		
		System.out.println(exampleEnum);
		
		constructors = ExampleEnum.class.getDeclaredConstructors();
		try {
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				exampleEnum2 = (ExampleEnum) constructor.newInstance();
				break;
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(exampleEnum2);
	}
}
