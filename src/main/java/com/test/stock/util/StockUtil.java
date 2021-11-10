package com.test.stock.util;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

import com.test.stock.dto.StockDTO;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class StockUtil {
	
	public static StockDTO getStockDetails(String stockName) throws IOException {
		Stock stock = YahooFinance.get(stockName);
		StockDTO sdto = new StockDTO();
		/*sdto.setSymbol(stock.getQuote().getSymbol());
		sdto.setName(stock.getName());
		sdto.setCurrency(stock.getCurrency());
		sdto.setStockExchange(stock.getStockExchange());
		sdto.setQuote("Ask: "+stock.getQuote().getAsk()+", Bid: "+stock.getQuote().getBid()+", Price: "+stock.getQuote().getPrice()+", Prev close: "+stock.getQuote().getPreviousClose());
		sdto.setStatus("EPS: "+stock.getStats().getEps()+", PE: "+stock.getStats().getPe()+", PEG: "+stock.getStats().getPeg());
		Calendar pdate = stock.getDividend().getPayDate();
		Calendar exdate = stock.getDividend().getExDate();
		sdto.setDividend("Pay date: "+(pdate != null ? pdate.getTime().toString(): "")+", Ex date: "+(exdate != null ? exdate.getTime().toString():"") +", Annual yield: "+stock.getDividend().getAnnualYield());
		sdto.setHistory(stock.getHistory());*/
		return sdto;
	}
	
	public static StockDTO addStock(Stock stock) {
		StockDTO sdto = new StockDTO();
		sdto.setSymbol(stock.getSymbol());
		sdto.setVolume(stock.getQuote().getVolume() == null ? null : stock.getQuote().getVolume().toString());
		// sdto.setMatched();
		// sdto.setRouted();
		sdto.setBidsize(stock.getQuote().getBidSize() == null ? null: stock.getQuote().getBidSize().toString());		
		sdto.setBidprice(stock.getQuote().getBid() == null ? null :stock.getQuote().getBid().toString());
		sdto.setAsksize(stock.getQuote().getAskSize() == null ? null : stock.getQuote().getAskSize().toString());
		sdto.setAskprice(stock.getQuote().getAsk() == null ? null : stock.getQuote().getAsk().toString());
		sdto.setLastprice(stock.getQuote().getPreviousClose() == null ? null : stock.getQuote().getPreviousClose().toString());
		sdto.setChangeinpercentage(stock.getQuote().getChangeInPercent() == null ? null : stock.getQuote().getChangeInPercent().toString());
		sdto.setChange(stock.getQuote().getChange() == null ? null : stock.getQuote().getChange().toString());
		return sdto;
	}
	
	// Generic method to remove elements from a list in Java 8
	public static <T> void remove(List<StockDTO> list, Predicate<StockDTO> predicate) {
	    list.removeIf(x -> predicate.test(x));
	}


}
