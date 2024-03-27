package org.example;

import org.drools.drl.ast.descr.PackageDescr;
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
    private static KieSessionUtil kieSessionUtil = new KieSessionUtil();

    public static void main( String[] args ) throws Exception {
        System.out.println( "App starting" );

        testGetFunctions();

//        KieSession kieSession1 = kieSessionUtil.getKieSession1();
//
//        List<RuleDefinition> rulesList = kieSessionUtil.GetAllRulesNames(kieSession1);
//
//        //String drl_text = kieSessionUtil.getDrlFromExcel("Discount.drl.xls");
//        //System.out.println( "drl_text: \n" + drl_text );
//
//        TestCases.TestSet01(kieSession1);
//        TestCases.TestSet02(kieSession1);
//        TestCases.TestSet03(kieSession1);

        System.out.println( "App completed" );

    }

    private static void testGetFunctions() throws Exception {
//        String       xlsLines = kieSessionUtil.getDrlFromExcel("Discount.drl.xls");
//        System.out.println( "xlsLines: \n" + xlsLines );
//        PackageDescr xlsDescr = KieSessionUtil.GetDrlParts(String.join("\n", xlsLines));
//
//        List<String> drlLines1 = KieSessionUtil.GetDrlString("C:\\Users\\jdugger01\\source\\Drools\\drool-demo-944\\src\\main\\resources\\TaxiRideFare.drl");
//        System.out.println( "drlLines1: \n" + drlLines1 );
//        PackageDescr drlDescr1 = KieSessionUtil.GetDrlParts(String.join("\n", xlsLines));

        List<String> drlLines2 = KieSessionUtil.GetDrlString("C:\\Users\\jdugger01\\source\\Drools\\drool-demo-944\\src\\main\\resources\\TaxiRideFareTest.drl");
        System.out.println( "drlLines2: \n" + drlLines2 );
        PackageDescr drlDescr2 = KieSessionUtil.GetDrlParts(String.join("\n", drlLines2));

        System.out.println( "testGetFunctions completed" );
    }

}
