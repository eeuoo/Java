package hijava.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassEX {

	public static void main(String[] args) throws Exception{
		String inputstr = "hijava.basic.Students";
		Class<?> cls = Class.forName(inputstr);
		Package pkg = cls.getPackage();
		System.out.println("pkg=" + pkg);
		
//		for (Constructor c : cls.getConstructors())
//			System.out.println("constructor=" + c);
//		for (Field f : cls.getFields())
//			System.out.println("field=" + f);
//		for (Method m : cls.getMethods())
//			System.out.println(m.getName());
		
		
		Students newStu = (Students)cls.newInstance();
		System.out.println(newStu);
		Method setnameMethod = cls.getMethod("setName", String.class);
		setnameMethod.invoke(newStu, "lee");
		Method getnameMethod = cls.getMethod("getName");
		getnameMethod.invoke(newStu);
		Method setidMethod = cls.getMethod("setId", int.class);
		setidMethod.invoke(newStu, 123);
		System.out.println();
		
	}	
	

}
