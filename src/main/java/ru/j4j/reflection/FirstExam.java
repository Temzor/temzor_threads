package ru.j4j.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class FirstExam {
    public static void main(String[] args) throws Exception {
        try {
            Class<?> employeeClass = Class.forName("ru.j4j.reflection.Employee");

            Class<?> employeeClass2 = Employee.class;

            Employee employee = new Employee();
            Class<?> employeeClass3 = employee.getClass();

            Field fieldEmployee = employeeClass.getField("id");
            Field fieldEmployee1 = employeeClass.getField("name");
            Field fieldEmployee2 = employeeClass.getField("department");


            System.out.println("Type of id Field: " + fieldEmployee.getType());
            System.out.println("Type of name Field: " + fieldEmployee1.getType());
            System.out.println("Type of department Field: " + fieldEmployee2.getType());

            Field[] fieldsEmployee = employeeClass.getFields();
            System.out.println(Arrays.toString(fieldsEmployee));
            for (Field field : fieldsEmployee) {
                System.out.println("Name: " + field.getName() + ", Type: " + field.getType());
            }

            Field[] fieldsDeclaredEmployee = employeeClass.getDeclaredFields();
            for (Field field : fieldsDeclaredEmployee) {
                System.out.println("Name: " + field.getName() + ", Type: " + field.getType());
            }

            Method increaseSalary = employeeClass.getMethod("increaseSalary", double.class, int.class);
            System.out.println("Increasing Salary: " + increaseSalary.invoke(employee, 1.0, 2));
            System.out.println("Return type of method increaseSalary = " + increaseSalary.getReturnType()
                    + System.lineSeparator() + ", parameter type: " + Arrays.toString(increaseSalary.getParameterTypes()));

            Method setSalary = employeeClass.getMethod("setSalary", double.class);
            System.out.println("Set Salary: " + setSalary.invoke(employee, 1.0));
            System.out.println("Return type of method setSalary = " + increaseSalary.getReturnType()
                    + System.lineSeparator() + ", parameter type: " + Arrays.toString(increaseSalary.getParameterTypes()));

            System.out.println("****************");
            Method[] methodsEmployee = employeeClass.getMethods();
            for (Method method : methodsEmployee) {
                System.out.println("Name: of method " + method.getName() + ", Return type: " + method.getReturnType()
                        + ", Parameter type: " + Arrays.toString(method.getParameterTypes()));
            }

            System.out.println("****************");
            Method[] methodsDeclaredEmployee = employeeClass.getDeclaredMethods();
            for (Method method : methodsDeclaredEmployee) {
                System.out.println("Name: of method " + method.getName() + ", Return type: " + method.getReturnType()
                        + ", Parameter type: " + Arrays.toString(method.getParameterTypes()));
            }

            System.out.println("****************");
            Method[] methodsDeclaredEmployee2 = employeeClass.getDeclaredMethods();
            for (Method method : methodsDeclaredEmployee2) {
                if (Modifier.isPublic(method.getModifiers())) {
                    System.out.println("Name: of method " + method.getName() + ", Return type: " + method.getReturnType()
                            + ", Parameter type: " + Arrays.toString(method.getParameterTypes()));
                }
            }

            System.out.println("****************");
            Constructor<?> constructorEmployee = employeeClass.getConstructor();
            System.out.println("Constructor has = " + constructorEmployee.getParameterCount()
                    + System.lineSeparator() + " parameters, their types are: "
                    + Arrays.toString(constructorEmployee.getParameterTypes()));

            System.out.println("****************");
            Constructor<?> constructorEmployeeWithParameter = employeeClass.getConstructor(int.class, String.class, String.class);
            System.out.println("Constructor has = " + constructorEmployeeWithParameter.getParameterCount()
                    + System.lineSeparator() + " parameters, their types are: "
                    + Arrays.toString(constructorEmployeeWithParameter.getParameterTypes()));

            System.out.println("****************");
            Constructor<?>[] constructorEmployeeWithAllParameter = employeeClass.getConstructors();
            for (Constructor<?> constructor : constructorEmployeeWithAllParameter) {
                System.out.println("Name of constructor " + constructor.getName()
                        + ", and has " + constructor.getParameterCount() + System.lineSeparator()
                        + " parameters, their types are: " + Arrays.toString(constructor.getParameterTypes()));
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
