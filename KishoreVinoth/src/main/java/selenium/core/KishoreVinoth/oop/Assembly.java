package selenium.core.KishoreVinoth.oop;

import java.util.Arrays;

public class Assembly 
{
	private String name, district, sittingMLA, isues[];
	private Integer population;
	private Double devAmt;
	String hai;
	public Assembly() {
		System.out.println("DEfault called");
		//super();
		// TODO Auto-generated constructor stub
	}
	public Assembly(String name, String district, String sittingMLA, String[] isues, Integer population,
			Double devAmt) {
		super();
		this.name = name;
		this.district = district;
		this.sittingMLA = sittingMLA;
		this.isues = isues;
		this.population = population;
		this.devAmt = devAmt;
	}
	@Override
	public String toString() {
		return "Assembly [name=" + name + ", district=" + district + ", sittingMLA=" + sittingMLA + ", isues="
				+ Arrays.toString(isues) + ", population=" + population + ", devAmt=" + devAmt + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSittingMLA() {
		return sittingMLA;
	}
	public void setSittingMLA(String sittingMLA) {
		this.sittingMLA = sittingMLA;
	}
	public String[] getIsues() {
		return isues;
	}
	public void setIsues(String[] isues) {
		this.isues = isues;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public Double getDevAmt() {
		return devAmt;
	}
	public void setDevAmt(Double devAmt) {
		this.devAmt = devAmt;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
}
