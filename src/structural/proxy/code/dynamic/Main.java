package structural.proxy.code.dynamic;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Login loginProxy = (Login) Proxy.newProxyInstance(
            Login.class.getClassLoader(),
            new Class[]{Login.class},
            (proxy, method, args1) -> {
                Object target = new Customer();

                System.out.println("check dormant customer");
                Object result = method.invoke(target, args1);
                System.out.println("increase login count");
                return result;
            }
        );

        loginProxy.login();
    }

}
