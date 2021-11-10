package com.test.stock.dto;

import java.util.List;

import yahoofinance.histquotes.HistoricalQuote;

public class StockDTO {
	
	private String symbol;
	
	private String volume;
	
	private String matched;
	
	private String routed;
	
	private String bidsize;
	
	private String bidprice;
	
	private String asksize;
	
	private String askprice;
	
	private String lastprice;
	
	private String change;
	
	private String changeinpercentage;

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the volume
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}

	/**
	 * @return the matched
	 */
	public String getMatched() {
		return matched;
	}

	/**
	 * @param matched the matched to set
	 */
	public void setMatched(String matched) {
		this.matched = matched;
	}

	/**
	 * @return the routed
	 */
	public String getRouted() {
		return routed;
	}

	/**
	 * @param routed the routed to set
	 */
	public void setRouted(String routed) {
		this.routed = routed;
	}

	/**
	 * @return the bidsize
	 */
	public String getBidsize() {
		return bidsize;
	}

	/**
	 * @param bidsize the bidsize to set
	 */
	public void setBidsize(String bidsize) {
		this.bidsize = bidsize;
	}

	/**
	 * @return the bidprice
	 */
	public String getBidprice() {
		return bidprice;
	}

	/**
	 * @param bidprice the bidprice to set
	 */
	public void setBidprice(String bidprice) {
		this.bidprice = bidprice;
	}

	/**
	 * @return the asksize
	 */
	public String getAsksize() {
		return asksize;
	}

	/**
	 * @param asksize the asksize to set
	 */
	public void setAsksize(String asksize) {
		this.asksize = asksize;
	}

	/**
	 * @return the askprice
	 */
	public String getAskprice() {
		return askprice;
	}

	/**
	 * @param askprice the askprice to set
	 */
	public void setAskprice(String askprice) {
		this.askprice = askprice;
	}

	/**
	 * @return the lastprice
	 */
	public String getLastprice() {
		return lastprice;
	}

	/**
	 * @param lastprice the lastprice to set
	 */
	public void setLastprice(String lastprice) {
		this.lastprice = lastprice;
	}

	/**
	 * @return the change
	 */
	public String getChange() {
		return change;
	}

	/**
	 * @param change the change to set
	 */
	public void setChange(String change) {
		this.change = change;
	}

	/**
	 * @return the changeinpercentage
	 */
	public String getChangeinpercentage() {
		return changeinpercentage;
	}

	/**
	 * @param changeinpercentage the changeinpercentage to set
	 */
	public void setChangeinpercentage(String changeinpercentage) {
		this.changeinpercentage = changeinpercentage;
	}

	@Override
	public String toString() {
		return "StockDTO [symbol=" + symbol + ", volume=" + volume + ", matched=" + matched + ", routed=" + routed
				+ ", bidsize=" + bidsize + ", bidprice=" + bidprice + ", asksize=" + asksize + ", askprice=" + askprice
				+ ", lastprice=" + lastprice + ", change=" + change + ", changeinpercentage=" + changeinpercentage
				+ "]";
	}
	
	
	
}
