package com.kite.test.guava.eventbus.demo1;

import java.util.Date;

/**
 * 
 * 类TradeAccountEvent.java的实现描述：模拟一个交易过程 
 * @author pengliang 2016年10月17日 下午5:16:56
 */
public class TradeAccountEvent {

	private Double amount;
	private Date tradeTime;
	private TradeAccount tradeAccount;
	private TradeType tradeType;
	public TradeAccountEvent(Double amount, Date tradeTime, TradeAccount tradeAccount, TradeType tradeType) {
		super();
		this.amount = amount;
		this.tradeTime = tradeTime;
		this.tradeAccount = tradeAccount;
		this.tradeType = TradeType.BUY;
	}
}

