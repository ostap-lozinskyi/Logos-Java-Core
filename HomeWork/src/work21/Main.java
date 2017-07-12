package work21;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) {
        Class<?> cl = TestReflection.class;
        
        System.out.println("Пакет:");
        Package p = cl.getPackage();
        System.out.println(p.getName());
        
        System.out.println("Клас:");
        System.out.println(cl.getSimpleName());
        
        System.out.println("Модифікатори");
        int modifiers = cl.getModifiers();
        System.out.println(getModifiers(modifiers));        

        System.out.println("Суперклас:");
        System.out.println(cl.getSuperclass().getSimpleName());

        System.out.println("Інтерфейcи:");
        Class<?>[] interfaces = cl.getInterfaces();
        for (Class<?> class1 : interfaces) {
			System.out.println(class1);
		}
        
        System.out.println("Поля:");
        Field[] fields = cl.getDeclaredFields();       
        for (Field field : fields) {
            System.out.println(getModifiers(field.getModifiers())
                    + getType(field.getType()) + " " + field.getName() + ";");
        }

        System.out.println("Конструктори:");
        Constructor<?>[] constructors = cl.getDeclaredConstructors();
        for (Constructor<?> c : constructors) {
            System.out.print(getModifiers(c.getModifiers()) +
                    cl.getSimpleName() + "(");
            System.out.print(getParameters(c.getParameterTypes()));
            System.out.println(") { }");
        }

        System.out.println("Методи:");
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a : annotations)
                System.out.print("@" + a.annotationType().getSimpleName() + " ");
            System.out.print(getModifiers(m.getModifiers()) +
                    getType(m.getReturnType()) + " " + m.getName() + "(");
            System.out.print(getParameters(m.getParameterTypes()));
            System.out.println(")");
        }
        System.out.println("}");
    }

    static String getModifiers(int m) {
        String modifiers = "";
        if (Modifier.isPublic(m)) modifiers += "public ";
        if (Modifier.isProtected(m)) modifiers += "protected ";
        if (Modifier.isPrivate(m)) modifiers += "private ";
        if (Modifier.isStatic(m)) modifiers += "static ";
        if (Modifier.isAbstract(m)) modifiers += "abstract ";
        return modifiers;
    }

    static String getType(Class<?> cl) {
        String type = cl.isArray()
                ? cl.getComponentType().getSimpleName()
                : cl.getSimpleName();
        if (cl.isArray()) type += "[]";
        return type;
    }

    static String getParameters(Class<?>[] params) {
        String p = "";
        for (int i = 0, size = params.length; i < size; i++) {
            if (i > 0) p += ", ";
            p += getType(params[i]) + " arg";
        }
        return p;
    }
}
