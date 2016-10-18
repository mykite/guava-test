package com.kite.test.guava.func.demo1;

import com.google.common.base.Function;
import com.google.common.base.Joiner;

/**
 * 
 * 类StateToCityString.java的实现描述：TODO 类实现描述 
 * @author pengliang 2016年10月14日 下午2:38:01
 */
public class StateToCityString implements Function<State, String> {

	public String apply(State input) {
		return Joiner.on(",").join(input.getCitys());
	}

}
