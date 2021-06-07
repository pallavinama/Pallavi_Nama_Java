package com.company;

public class ConverterApplication {
//Main Method
    public static void main(String[] args){
        String monthName;
        String dayName;
        Converter converterIf = new ConverterIf();
        monthName = converterIf.convertMonth(1);
        dayName = converterIf.convertDay(1);
        System.out.println("Month Name using converterIf: " + monthName);
        System.out.println("Day Name using converterIf: " +dayName);
        System.out.println("..............................");
        Converter converterSwitch = new ConverterSwitch();
        monthName = converterSwitch.convertMonth(1);
        dayName = converterSwitch.convertDay(1);
        System.out.println("Month Name using converterSwitch:" + monthName);
        System.out.println("Day Name using converterDay:" +dayName);

    }

}
