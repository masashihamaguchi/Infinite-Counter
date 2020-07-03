package com.masashi.hamaguchi.infinitecounter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.ResultReceiver;
import android.view.MotionEvent;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainActivity extends AppCompatActivity {

    // UI
    private RecyclerView recyclerView;

    private List<Counter> counterList;
    private CounterAdapter adapter;
    private GridLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        recyclerView = findViewById(R.id.recyclerView);

        counterList = new ArrayList<Counter>();
        mLayoutManager = new GridLayoutManager(this, 2);

        firstSet();

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        // TODO ③ Counter Adapterを初期化する。（引数はContextとcounterList）：難しかったらヒント
        adapter = new CounterAdapter(this, counterList);

        // TODO ④ recyclerViewにadapter(CounterAdapter)をセットする
        recyclerView.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterList.add(new Counter());
                adapter.notifyDataSetChanged();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
    }

    // TODO ② firstSetメソッドを作る
    public void firstSet() {

        // TODO counterListにCounterクラスを3つ追加する
        // for分を使って！

        for (int i = 0; i < 3; i++) {
            counterList.add(new Counter());
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_reset) {
            counterList.clear();
            firstSet();
            adapter.notifyDataSetChanged();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}