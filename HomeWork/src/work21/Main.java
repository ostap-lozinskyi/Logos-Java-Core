package work21;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) {
        Class<?> cl = TestReflection.class;

        Package p = cl.getPackage();
        System.out.println("package " + p.getName() + ";");

        int modifiers = cl.getModifiers();
        System.out.print(getModifiers(modifiers));
        System.out.print("class " + cl.getSimpleName() + " ");

        System.out.print("extends " + cl.getSuperclass().getSimpleName() + " ");

        Class<?>[] interfaces = cl.getInterfaces();
        for (int i = 0, size = interfaces.length; i < size; i++) {
            System.out.print(i == 0 ? "implements " : ", ");
            System.out.print(interfaces[i].getSimpleName());
        }
        System.out.println(" {");

        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("\t" + getModifiers(field.getModifiers())
                    + getType(field.getType()) + " " + field.getName() + ";");
        }

        Constructor<?>[] constructors = cl.getDeclaredConstructors();
        for (Constructor<?> c : constructors) {
            System.out.print("\t" + getModifiers(c.getModifiers()) +
                    cl.getSimpleName() + "(");
            System.out.print(getParameters(c.getParameterTypes()));
            System.out.println(") { }");
        }

        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            Annotation[] annotations = m.getAnnotations();
            System.out.print("\t");
            for (Annotation a : annotations)
                System.out.print("@" + a.annotationType().getSimpleName() + " ");
            System.out.println();

            System.out.print("\t" + getModifiers(m.getModifiers()) +
                    getType(m.getReturnType()) + " " + m.getName() + "(");
            System.out.print(getParameters(m.getParameterTypes()));
            System.out.println(") { }");
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
            p += getType(params[i]) + " param" + i;
        }
        return p;
    }
}
