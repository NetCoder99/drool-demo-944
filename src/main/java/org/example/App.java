package org.example;

import org.example.classes.KieSessionUtil;
import org.example.classes.TestCases;
import org.example.model.Customer;
import org.example.model.RuleDefinition;
import org.kie.api.runtime.KieSession;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "App starting" );
        KieSessionUtil kieSessionUtil = new KieSessionUtil();
        KieSession kieSession1 = kieSessionUtil.getKieSession1();

        List<RuleDefinition> rulesList = kieSessionUtil.GetAllRulesNames(kieSession1);

        //String drl_text = kieSessionUtil.getDrlFromExcel("Discount.drl.xls");
        //System.out.println( "drl_text: \n" + drl_text );

        TestCases.TestSet01(kieSession1);
        TestCases.TestSet02(kieSession1);
        TestCases.TestSet03(kieSession1);

        System.out.println( "App completed" );

    }
}
