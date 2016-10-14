package com.kite.test.guava.collection;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.kite.test.guava.func.demo1.City;

/**
 * 
 * 类MapsTest.java的实现描述：测试 guava Maps 
 * @author pengliang 2016年10月14日 下午3:31:18
 */
public class MapsTest {
	@Test
	public void test() {
		Set<City> set = new HashSet<City>();
		set.add(new City("guangzhou", "111", 1111));
		set.add(new City("shengzheng", "222", 2222));
		set.add(new City("shanghai", "333", 3333));
		//iterator各个元素作为Map.values, key为Function.apply返回值
		ImmutableMap<String, City> immutableMap = Maps.uniqueIndex(set.iterator(), new Function<City, String>() {
			public String apply(City input) {
				return input.getName();
			}
		});
		//相反
		Map<City, String> map = Maps.asMap(set, new Function<City, String>() {
			public String apply(City input) {
				return input.getName();
			}
		});
		System.out.println(immutableMap);
		System.out.println(map);
	}
}
