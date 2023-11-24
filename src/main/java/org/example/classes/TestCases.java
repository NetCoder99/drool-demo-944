package org.example.classes;

import com.google.gson.Gson;
import org.example.model.Customer;
import org.kie.api.runtime.KieSession;

public class TestCases {
    private static Gson gson = new Gson();
    public static void TestSet01(KieSession kieSession) {
        Customer customer = new Customer(Customer.CustomerType.BUSINESS, 2);
        kieSession.insert(customer);
        int rules_fired = kieSession.fireAllRules();
        System.out.println( "rules fired  : " + rules_fired );
        System.out.println( "customer rec : " + gson.toJson(customer) );
    }
    public static void TestSet02(KieSession kieSession) {
        Customer customer = new Customer(Customer.CustomerType.INDIVIDUAL, 2);
        kieSession.insert(customer);
        int rules_fired = kieSession.fireAllRules();
        System.out.println( "rules fired  : " + rules_fired );
        System.out.println( "customer     : " + gson.toJson(customer) );
    }
    public static void TestSet03(KieSession kieSession) {
        Customer customer = new Customer(Customer.CustomerType.INDIVIDUAL, 5);
        kieSession.insert(customer);
        int rules_fired = kieSession.fireAllRules();
        System.out.println( "rules fired  : " + rules_fired );
        System.out.println( "customer rec : " + gson.toJson(customer) );
    }
}
