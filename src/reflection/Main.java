package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by TalekO01 on 7/16/2018
 */

public class Main {

    public static void main(String... args) {

        System.out.println(Child.class.getSuperclass().getSuperclass());
        System.out.println(Arrays.asList(Child.class.getDeclaredFields()));
        System.out.println(Arrays.asList(Child.class.getSuperclass().getDeclaredFields()));

        List<Field> fields = getAllDeclaredFields(Child.class);
        System.out.println(fields);

        for (Field field : fields) {
            if ("first".equalsIgnoreCase(field.getName())) {
                System.out.println(field);
            }
        }

        List<Field> allDeclaredFields = getAllDeclaredFields(Outer.class);
    }


    private static List<Field> getAllDeclaredFields(Class jpaEntity) {
        List<Field> fields = getAllDeclaredFieldsRecursive(jpaEntity, new ArrayList<Field>());
        List<Field> innerClassFields = new ArrayList<>();

        for (Field field : fields) {
            if (field.getType() != String.class && field.getType() != BigInteger.class && field.getType() != Long.class) {
                if (Collection.class.isAssignableFrom(field.getType())) {
                    ParameterizedType parameterizedType = (ParameterizedType) field.getGenericType();
                    Class<?> actualTypeArgument = (Class<?>) parameterizedType.getActualTypeArguments()[0];
                    innerClassFields.addAll(Arrays.asList(actualTypeArgument.getDeclaredFields()));
                } else {
                    innerClassFields.addAll(Arrays.asList(field.getType().getDeclaredFields()));
                }
            }
        }

        fields.addAll(innerClassFields);
        return fields;
    }

    private static List<Field> getAllDeclaredFieldsRecursive(Class jpaEntity, List<Field> fields) {
        Class superClass = jpaEntity.getSuperclass();

        if (superClass != null) {
            getAllDeclaredFieldsRecursive(superClass, fields);
        }

        fields.addAll(Arrays.asList(jpaEntity.getDeclaredFields()));
        return fields;
    }

}
