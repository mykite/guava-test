package com.kite.test.guava.func;

import org.junit.Test;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.kite.test.guava.func.demo1.City;

/**
 * 
 * 类SuppliersTest.java的实现描述：TODO 类实现描述 
 * @author pengliang 2016年10月14日 下午3:04:20
 */
public class SuppliersTest {

	@Test
	public void test() {
		CitySupplier city = new CitySupplier();
		System.out.println(Suppliers.memoize(city).get());
		System.out.println(Suppliers.memoize(city).get());
		//TODO 没搞懂
	}
	
	
	class CitySupplier implements Supplier<City> {

		public City get() {
			return new City();
		}
		
	}
}
