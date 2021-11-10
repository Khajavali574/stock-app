package com.test.stock.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.stock.dto.StockDTO;
import com.test.stock.util.StockUtil;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

@RestController
@RequestMapping("/stocks")
public class StockController {

	// String[] symbols = new String[] { "INTC", "BABA", "TSLA", "AIR.PA"
	// ,"YHOO","VXX","UVXY","IEFA","USMV","ARKG","GOVT","RSX","EZU","VIXY","ITB","INDA","USHY","VLUE","IGV","SVXY","PAVE"};
	String[] symbols = new String[] { "INTC", "BABA", "TSLA", "AIR.PA", "YHOO" };
	Map<String, Stock> stocks = new LinkedHashMap<>();
	List<StockDTO> stocklist = new ArrayList<>();

	@GetMapping("/singlestock/{stockName}")
	public StockDTO getSingleStock(@PathVariable String stockName) throws IOException {
		return StockUtil.getStockDetails(stockName);
	}

	@GetMapping("/allstocks")
	public List<StockDTO> getAllStocks() throws IOException {
		stocks = YahooFinance.get(symbols);
		stocks.entrySet().stream().forEach(item -> {
			StockDTO stock = StockUtil.addStock(item.getValue());
			stocklist.add(stock);
		});
		return stocklist;
	}

	@GetMapping("/addstock")
	public List<StockDTO> addStocks(@RequestParam String stockname) throws IOException {
		Stock s = YahooFinance.get(stockname);
		StockDTO stock = StockUtil.addStock(s);
		stocklist.add(stock);
		return stocklist;
	}

	@GetMapping("/removestock")
	public List<StockDTO> removeStocks(@RequestParam String stockname) throws IOException {
        Iterator<StockDTO> it =  stocklist.iterator();
        while(it.hasNext()) {
        	StockDTO dto = (StockDTO) it.next();
        	if(dto.getSymbol().equalsIgnoreCase(stockname)) {
        		it.remove();
        		break;
        	}
        }
		return stocklist;
	}

}
