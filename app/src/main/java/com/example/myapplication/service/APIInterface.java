package com.example.myapplication.service;


import com.example.myapplication.Models.ListStockResp;
import com.example.myapplication.Models.Stock;
import com.example.myapplication.Models.StockMarket;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {
    @GET("stockhandler.ashx")
    Observable<List<Stock>> getStocks(@Query("center") Integer index);

    @GET("https://finfo-api.vndirect.com.vn/v4/stocks?q=type:STOCK~status:LISTED&fields=code,companyName,companyNameEng,shortName,floor,industryName,indexCode&size=3000")
    Observable<ListStockResp> getStock2s();

 @GET("https://banggia.cafef.vn/stockhandler.ashx?index=true")
  Observable<List<StockMarket>> getStockMarket();


}
