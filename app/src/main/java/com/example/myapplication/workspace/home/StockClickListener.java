package com.example.myapplication.workspace.home;

import com.example.myapplication.Models.StockItem;

public interface StockClickListener {
  void onItemClickListener(StockItem stockItem, Integer position);
}
