package com.kite.test.guava.base;

import org.junit.Test;

import com.google.common.base.CharMatcher;

/**
 * 
 * 类CharMatcherTest.java的实现描述：测试guava CharMatcher 
 * @author pengliang 2016年10月14日 上午11:41:23
 */
public class CharMatcherTest {
	
	/**
	 * 测试将多个连续的空格替换为一个
	 */
	@Test
	public void testReplaceMultiBlankSpace2OneBlankSpace() {
		String tabsAndSpaces = "String  with      spaces     and tabs";
		//将多个连续的空格替换为一个
		String scrubbed = CharMatcher.WHITESPACE.collapseFrom(tabsAndSpaces,' ');
		System.out.println(scrubbed); //String with spaces and tabs
	}

	/**
	 * 测试将多个连续的空格替换为一个同时去除牵头空格
	 */
	@Test
	public void testReplaceMultiBlankSpace2OneBlankSpaceAndTrimBeforeAfter() {
		String tabsAndSpaces = "    String  with     spaces     and tabs";
		String scrubbed = CharMatcher.WHITESPACE.trimAndCollapseFrom(tabsAndSpaces, ' ');
		System.out.println(scrubbed); //String with spaces and tabs
	}
	
	/**
	 * 测试保留指定字符，如数字，字母等
	 */
	@Test
	public void test() {
		String lettersAndNumbers = "testAndBefore111,";
		String retained = CharMatcher.JAVA_DIGIT //数字
				.or(CharMatcher.JAVA_LETTER).//字母
				retainFrom(lettersAndNumbers); 
		System.out.println(retained); //testAndBefore111
	}
}
