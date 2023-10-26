package com.sri.core;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class StreamTest {


    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.id=1;
        e1.name="amma";
        e1.address="Warangal";
        e1.city="Wgl";
        e1.gender="F";

        Employee e2=new Employee();
        e2.id=2;
        e2.name="sri";
        e2.address="charlotte";
        e2.city="NC";
        e2.gender="M";

        Employee e3=new Employee();
        e3.id=3;
        e3.name="nana";
        e3.address="Warangal";
        e3.city="Wgl";
        e3.gender="M";


        Employee e4=new Employee();
        e4.id=4;
        e4.name="Harish";
        e4.address="Warangal";
        e4.city="Wgl";
        e4.gender="M";


        Employee e5=new Employee();
        e5.id=5;
        e5.name="Keerti";
        e5.address="Warangal";
        e5.city="Wgl";
        e5.gender="F";

        ArrayList alist=new ArrayList();
        alist.add(e1);
        alist.add(e2);
        alist.add(e3);
        alist.add(e4);
        alist.add(e5);


      //  Map<String, Set<String>> map=alist.stream().collect(Collectors.groupingBy(Employee :: getCity, Collectors.mapping(Employee::getCity,Collectors.toSet())));


        ArrayList alist6=new ArrayList();
        alist6.add(1);
        alist6.add(2);
        alist6.add(3);
        alist6.add(4);
        alist6.add(5);


        System.out.println(alist.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst());


    }//git
}
