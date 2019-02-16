package hijava.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassEX {

	public static void main(String[] args) {

		String inputstr = "hijava.basic.Students";
		Class cls = class.forName(oinputstr);
		package pkg = cls.getPackage();
		System.out.println("pkg=" + pkg);
		
		for (Constructor c : cls.getConstructors())
			System.out.println("constructor=" + c);
		for (Field f : cls.getField())
			System.out.println("field=" + f);
		for (Method m : cls.getMethods())
			System.out.println(m.getName());
		

	}

}
