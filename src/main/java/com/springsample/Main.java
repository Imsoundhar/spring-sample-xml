package com.springsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static ApplicationContext context;
    public static void main(String[] args){
        context = new ClassPathXmlApplicationContext("beans.xml");

//        -------------------first government-----------------------------
        Government government1 = context.getBean(Government.class);
        government1.setName("Tamil nadu");

        School school1 = (School) context.getBean("school");
        school1.setSchoolId("01");
        school1.setSchoolName("1st school");

        School school2 = (School) context.getBean("school");
        school2.setSchoolId("02");
        school2.setSchoolName("2nd school");

        List<School> schoolList1 = new ArrayList<>();
        schoolList1.add(school1);
        schoolList1.add(school2);
        government1.setSchool(schoolList1);

        System.out.print("\ngovernment 1 -> ");
        System.out.println(government1);

//  ----------------------------second government---------------------------------

        Government government2 = (Government) context.getBean("government");
        government2.setName("Andhra");

        School school3 = (School) context.getBean("school");
        school3.setSchoolId("03");
        school3.setSchoolName("3rd school");

        School school4 = (School) context.getBean("school");
        school4.setSchoolId("04");
        school4.setSchoolName("4th school");

        List<School> schoolList2 = new ArrayList<>();
        schoolList2.add(school3);
        schoolList2.add(school4);
        government1.setSchool(schoolList2);

//  ------------------------singleton demonstrate---------------------

        System.out.println("\nAfter set the values to the government 2.");
        System.out.println("Government 1 replaced by the government 2\n");
        System.out.print("government 1 -> ");
        System.out.println(government1);
        System.out.print("government 2 -> ");
        System.out.println(government2 + "\n");
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}
