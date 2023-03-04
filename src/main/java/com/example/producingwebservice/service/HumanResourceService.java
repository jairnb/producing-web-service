package com.example.producingwebservice.service;


import org.springframework.stereotype.Service;

import javax.xml.datatype.XMLGregorianCalendar;

@Service
public class HumanResourceService {

    public void bookHoliday(XMLGregorianCalendar startDate, XMLGregorianCalendar endDate, String firstName) {

        System.out.println("----------------------------");
        System.out.println("Testing");
        System.out.println("----------------------------");
    }
}
