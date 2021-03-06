package com.kite.test.guava.collection;

import java.util.HashSet;

import org.junit.Test;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

/**
 * 
 * 类SetsTest.java的实现描述：TODO 类实现描述 
 * @author pengliang 2016年10月14日 下午3:21:35
 */
public class SetsTest {
	
	/**
	 * 测试差异数据 求S1-S2
	 */
	@Test
	public void testDifference() {
		HashSet<Integer> set1 = Sets.newHashSet(1,2,3,4);
		HashSet<Integer> set2 = Sets.newHashSet(1,3,4);
		//差异数据 求S1-S2
		SetView<Integer> difference = Sets.difference(set1, set2);
		System.out.println(difference); //[2]
		
	}
	
	/**
	 * 测试  S1 S2交集
	 */
	@Test
	public void testIntersection() {
		HashSet<Integer> set1 = Sets.newHashSet(1,2,3,4);
		HashSet<Integer> set2 = Sets.newHashSet(1,3,4);
		//差异数据 求S1-S2
		SetView<Integer> difference = Sets.intersection(set1, set2);
		System.out.println(difference);
		
	}
	
	/**
	 * 测试  S1 S2合集
	 */
	@Test
	public void testUnion() {
		HashSet<Integer> set1 = Sets.newHashSet(1,2,3,4);
		HashSet<Integer> set2 = Sets.newHashSet(1,3,4);
		//差异数据 求S1-S2
		SetView<Integer> difference = Sets.union(set1, set2);
		System.out.println(difference);
		
	}
}
