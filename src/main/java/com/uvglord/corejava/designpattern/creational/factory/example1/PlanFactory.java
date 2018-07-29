package com.uvglord.corejava.designpattern.creational.factory.example1;

public class PlanFactory {
	
	public Plan getPlan(String planType) {
		if(planType==null)
			return null;
		if(planType.equalsIgnoreCase("Domestic"))
			return new DomesticPlan();
		if(planType.equalsIgnoreCase("Commercial"))
			return new CommercialPlan();
		if(planType.equalsIgnoreCase("Institution"))
			return new InstitutionalPlan();
		return null;
	}

}
