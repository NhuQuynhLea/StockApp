package com.example.myapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.workspace.home.HomeViewModel;

import io.reactivex.disposables.Disposable;

public class BackgroundActivity extends AppCompatActivity {
    private HomeViewModel viewModel;
    private Disposable disposable;
    ProgressBar progressBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BackgroundActivity.this,MainActivity.class);
                startActivity(intent);
            }
        }, 4000);
    }


}

