package com.kite.test.guava.func.demo1;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * 类State.java的实现描述：TODO 类实现描述 
 * @author pengliang 2016年10月14日 下午2:31:21
 */
public class State {
	private String name;
	private String code;
	private Set<City> citys = new HashSet<City>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Set<City> getCitys() {
		return citys;
	}
	public void setCitys(Set<City> citys) {
		this.citys = citys;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	public State(String name, String code, Set<City> citys) {
		super();
		this.name = name;
		this.code = code;
		this.citys = citys;
	}
	
	
	
}
