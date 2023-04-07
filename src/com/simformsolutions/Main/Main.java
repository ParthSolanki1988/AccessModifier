package com.simformsolutions.Main;

import com.simformsolutions.accessspecifiers.AccessModifier;

public class Main {
  public static void main(String[] args) {
    AccessModifier accessModifier = new AccessModifier();
    accessModifier.companyName = "Simform";
//    accessModifier.companyLocation = "Ahmdabad";
//    accessModifier.getCompanyGrowth = "High";
    System.out.println(accessModifier.companyName);


//    accessModifier.setCompanyName("Simform Solutions");
    accessModifier.setCompanyLocation("Ahmdabad");
    accessModifier.setCompanyGrowth("high");

//
//    System.out.println(accessModifier.getCompanyName());
    System.out.println(accessModifier.getCompanyLocation());
    System.out.println(accessModifier.getCompanyGrowth());

  }
}