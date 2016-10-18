package com.kite.test.guava.func.demo1;

import com.google.common.base.MoreObjects;

/**
 * 
 * 类City.java的实现描述：TODO 类实现描述 
 * @author pengliang 2016年10月14日 下午2:32:03
 */
public class City {
	private String name;
	private String zipCode;
	private int population;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public City(String name, String zipCode, int population) {
		super();
		this.name = name;
		this.zipCode = zipCode;
		this.population = population;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("name", name)
				.add("zipCode", zipCode)
				.add("popilation", population).omitNullValues().toString();
	}
}
