package com.kite.test.guava.eventbus.demo1;

import java.util.Date;

import com.google.common.eventbus.EventBus;

/**
 * 
 * 类SimpleTradeExecutor.java的实现描述： 执行交易, 即发布者
 * 
 * @author pengliang 2016年10月17日 下午5:39:21
 */
public class SimpleTradeExecutor {

	private EventBus eventBus;

	public SimpleTradeExecutor(EventBus eventBus) {
		this.eventBus = eventBus;
	}

	public void executeTrade(TradeAccount account, Double amount, TradeType tradeType) {
		eventBus.post(processTrade(account, amount, tradeType)); //发布事件
	}

	private TradeAccountEvent processTrade(TradeAccount tradeAccount, Double amount, TradeType tradeType) {
		Date executionTime = new Date();
		String message = String.format("Processed trade for %s of amount %n type %s @ %s", tradeAccount, amount, tradeType, executionTime);
		TradeAccountEvent tradeAccountEvent;
		if (tradeType.equals(TradeType.BUY)) { // 购买动作
			tradeAccountEvent = new BuyEvent(amount, executionTime, tradeAccount, tradeType);
		} else { // 卖出动作
			tradeAccountEvent = new SellEvent(amount, executionTime, tradeAccount, tradeType);
		}
		System.out.println(message);
		return tradeAccountEvent;
	}
	
	/**
	 * 订阅者来取消注册
	 */
	public void unRegister() {
		this.eventBus.unregister(this);
	}
	
	
}
