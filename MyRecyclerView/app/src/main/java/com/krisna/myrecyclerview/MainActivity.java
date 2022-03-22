package com.krisna.myrecyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Mode List";
    private RecyclerView rvliga;
    private ArrayList<liga> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvliga = findViewById(R.id.rv_heroes);
        rvliga.setHasFixedSize(true);

        list.addAll(dataLiga.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvliga.setLayoutManager(new LinearLayoutManager(this));
        ListligaAdapter listligaAdapter = new ListligaAdapter(list);
        rvliga.setAdapter(listligaAdapter);

        listligaAdapter.setOnItemClickCallback(new ListligaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(liga data) {
                showSelectedHero(data);
            }
        });
    }

    private void showRecyclerGrid() {
        rvliga.setLayoutManager(new GridLayoutManager(this, 2));
        GridligaAdapter gridligaAdapter = new GridligaAdapter(list);
        rvliga.setAdapter(gridligaAdapter);

        gridligaAdapter.setOnItemClickCallback(new GridligaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(liga data) {
                showSelectedHero(data);
            }
        });
    }

    private void showRecyclerCardView() {
        rvliga.setLayoutManager(new LinearLayoutManager(this));
        CardViewligaAdapter cardViewligaAdapter = new CardViewligaAdapter(list);
        rvliga.setAdapter(cardViewligaAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedHero(liga liga) {
        Toast.makeText(this, "Kamu memilih " + liga.getName(), Toast.LENGTH_SHORT).show();
    }
}
