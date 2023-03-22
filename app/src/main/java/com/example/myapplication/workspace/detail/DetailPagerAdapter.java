package com.example.myapplication.workspace.detail;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.Models.StockItem;


import java.util.List;

public class DetailPagerAdapter extends FragmentStateAdapter {
    private List<String> tabs;
    private String code;
    private StockItem stockItem;

    public DetailPagerAdapter(@NonNull FragmentActivity fragmentActivity, List<String> tabs, String code,StockItem stockItem) {
        super(fragmentActivity);
        this.tabs = tabs;
        this.code = code;
        this.stockItem = stockItem;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return DetailFragment.newInstance(stockItem);
            default:
                return new BlankFragment();
        }

    }

    @Override
    public int getItemCount() {
        return tabs.size();
    }
}
