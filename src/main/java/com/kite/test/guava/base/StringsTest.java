package com.kite.test.guava.base;

import org.junit.Test;

import com.google.common.base.Strings;

/**
 * 
 * 类StringsTest.java的实现描述：对guava Strings进行测试 
 * @author pengliang 2016年10月14日 上午11:18:33
 */
public class StringsTest {
	
	
	/**
	 * 测试字符串是否为nullor空
	 */
	@Test
	public void testIsNullOrEmpty() {
		System.out.println(Strings.isNullOrEmpty(null)); //true
		System.out.println(Strings.isNullOrEmpty("")); //true
		System.out.println(Strings.isNullOrEmpty(" ")); //false
	}
	
	/**
	 * 测试两个字符串公共的开头或者结尾部分
	 */
	@Test
	public void testCommonPrefixAndSuffix() {
		System.out.println(Strings.commonPrefix("a:a", "ab:b")); //a
		System.out.println(Strings.commonSuffix("a:a", "b:a")); //:a
		
		System.out.println(Strings.nullToEmpty(null));
	}
	
	/**
	 * 测试 	null 转 ""
	 * 		"" 转 null
	 */
	@Test
	public void testNullToEmpty() {
		System.out.println("str:" + Strings.nullToEmpty(null));//str:
		System.out.println("str:" + Strings.nullToEmpty("null"));//str:null
		System.out.println("str:" + Strings.emptyToNull(""));//str:null
		
		
	}
	
	/**
	 * 测试补充字符串
	 */
	@Test
	public void testPadStartOrEnd() {
		//用padChar填充string前面, 使string最小长度为minLength
		System.out.println(Strings.padStart("test", 20, 'd')); //ddddddddddddddddtest
		//用padChar填充string后面, 使string最小长度为minLength
		System.out.println(Strings.padEnd("test", 20, 'd'));   //testdddddddddddddddd
		
	}
	
	
	/**
	 * 测试重复字符串
	 */
	public void testRepeat() {
		System.out.println(Strings.repeat("s", 10)); //ssssssssss
	}
	
	
}
