package com.test.stock;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.test.stock.controller.StockController;
import com.test.stock.dto.StockDTO;

@WebMvcTest
public class StockAppTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private StockController controller;
	
	

	@Test
	public void getSingleStock() throws Exception {
		StockDTO stdto = new StockDTO(); 
		stdto.setSymbol("INTC");
		stdto.setAskprice("$1000");
        Mockito.when(controller.getSingleStock("INTC")).thenReturn(stdto);
        mockMvc.perform(get("/stocks/singlestock/INTC")).andExpect(status().isOk());
	}

	@Test
	public void getAllStock() throws Exception {
		List<StockDTO> list  = new ArrayList<>();
		StockDTO stdto = new StockDTO(); 
		stdto.setSymbol("INTC");
		stdto.setAskprice("$1000");
		StockDTO stdto1 = new StockDTO(); 
		stdto1.setSymbol("BABA");
		stdto1.setAskprice("$2000");		
		list.add(stdto);
		list.add(stdto1);
		
		Mockito.when(controller.getAllStocks()).thenReturn(list);
        mockMvc.perform(get("/stocks/allstocks")).andExpect(status().isOk());
	}

	@Test
	public void addStock() throws Exception {
		List<StockDTO> list  = new ArrayList<>();
		StockDTO stdto = new StockDTO(); 
		stdto.setSymbol("INTC");
		stdto.setAskprice("$1000");
		StockDTO stdto1 = new StockDTO(); 
		stdto1.setSymbol("BABA");
		stdto1.setAskprice("$2000");		
		list.add(stdto);
		list.add(stdto1);
		Mockito.when(controller.addStocks(ArgumentMatchers.any())).thenReturn(list);
        mockMvc.perform(get("/stocks/addstock"));
	}

	@Test
	public void removeStock() throws Exception {
		List<StockDTO> list  = new ArrayList<>();
		StockDTO stdto = new StockDTO(); 
		stdto.setSymbol("INTC");
		stdto.setAskprice("$1000");
		StockDTO stdto1 = new StockDTO(); 
		stdto1.setSymbol("BABA");
		stdto1.setAskprice("$2000");		
		list.add(stdto);
		list.add(stdto1);
		Mockito.when(controller.removeStocks(ArgumentMatchers.any())).thenReturn(list);
        mockMvc.perform(get("/stocks/addstock"));
	}
}
