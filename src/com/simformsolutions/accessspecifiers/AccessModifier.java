package com.simformsolutions.accessspecifiers;

public class AccessModifier {

  public String companyName;

  private String companyLocation;

  protected String companyGrowth;


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(String companyLocation) {
    this.companyLocation = companyLocation;
  }

  public String getCompanyGrowth() {
    return companyGrowth;
  }

  public void setCompanyGrowth(String companyGrowth) {
    this.companyGrowth = companyGrowth;
  }
}
