package annotations;

import java.lang.reflect.Field;

public class SalaryDriver {
    public static void main(String[] args) {
        Salary salary = new Salary(75000.0);
        System.out.println("Salary Amount: " + salary.getAmount());
        try {
            Field field = salary.getClass().getDeclaredField("amount");
            if (field.isAnnotationPresent(SalaryInfo.class)) {
                SalaryInfo info = field.getAnnotation(SalaryInfo.class);
                System.out.println("Min Salary: " + info.min());
                System.out.println("Max Salary: " + info.max());
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
