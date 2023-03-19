package com.example.myapplication.Models;

import java.util.List;

public class Tab {

  private String title;
  private List<StockItem> stocks;

  public Tab( String title, List<StockItem> stocks) {
    this.title = title;
    this.stocks = stocks;

  }


  public String getTitle() {
    return title;
  }

  public List<StockItem> getStocks() {
    return stocks;
  }
}
