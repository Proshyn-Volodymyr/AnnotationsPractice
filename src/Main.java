import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Main {
   private static int methodsAnnAmount = 0;
    private static int parametersAnnAmount = 0;
    public static void main(String[] args) {
        Class<?> vClass = Vehicle.class;
        Class<?> cClass = Car.class;
        Class<?> aClass = Audi.class;
        Class<?> methods = MethodInfo.class;
        Class<?> params = ParameterInfo.class;

        Map<Class<?>, Integer> annotationsMap = analyze(cClass, methods, params);
        for (Map.Entry<Class<?>, Integer> entry : annotationsMap.entrySet()
        ) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
        }
    }

    public static Map<Class<?>, Integer> analyze(Class<?> clazz, Class<?> method, Class<?> parameter) {
        Class<?> superClazz = clazz.getSuperclass();
        boolean hasSuper = superClazz != null;
        if(hasSuper){
            analyze(superClazz, method, parameter);
        }
        Method[] methods = clazz.getDeclaredMethods();

        for (Method m : methods
        ) {
            if (m.getDeclaredAnnotations() != null) methodsAnnAmount += methodAnnotations(m, method);
            if (m.getParameterAnnotations() != null) parametersAnnAmount += parametersAnnotations(m, parameter);
        }
        return Map.of(method, methodsAnnAmount, parameter, parametersAnnAmount);
    }


    private static int methodAnnotations(Method method, Class<?> annotation) {
        int anns = 0;
        Annotation[] annotations = method.getDeclaredAnnotations();
        for (Annotation a : annotations
        ) {
            if (a.annotationType().equals(annotation)) {
                anns++;
            }
        }
        return anns;
    }

    private static int parametersAnnotations(Method method, Class<?> annotation) {
        int anns = 0;
        Annotation[][] parameterAnnArray = method.getParameterAnnotations();
        for (Annotation[] ans : parameterAnnArray
        ) {
            for (Annotation a : ans
            ) {
                if (a.annotationType().equals(annotation)) {
                    anns++;
                }
            }
        }
        return anns;
    }
}