package com.github.iamwee.mvpadaptersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.github.iamwee.mvpadaptersample.base.BaseItem;
import com.github.iamwee.mvpadaptersample.main.adapter.MainAdapter;
import com.github.iamwee.mvpadaptersample.main.adapter.item.TitleItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
    }

    private void setupView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter adapter = new MainAdapter();
        adapter.setItems(createItem());
        adapter.setOnActionListener(new MainAdapter.OnActionListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, "action from position : " + position, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);
    }

    private List<BaseItem> createItem() {
        List<BaseItem> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add(new TitleItem("item position -> " + (i + 1)));
        }
        return items;
    }
}
