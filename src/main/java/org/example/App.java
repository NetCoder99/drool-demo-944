package org.example;

import org.example.classes.KieSessionUtil;
import org.example.classes.TestCases;
import org.example.model.Customer;
import org.kie.api.runtime.KieSession;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "App starting" );
        KieSessionUtil kieSessionUtil = new KieSessionUtil();
        KieSession kieSession = kieSessionUtil.getKieSession();

        String drl_text = kieSessionUtil.getDrlFromExcel("Discount.drl.xls");
        System.out.println( "drl_text: \n" + drl_text );

        TestCases.TestSet01(kieSession);
        TestCases.TestSet02(kieSession);
        TestCases.TestSet03(kieSession);

        System.out.println( "App completed" );

    }
}
