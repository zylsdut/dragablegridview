package com.dafasoft.dragablegridview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private DragableGridView mDragableGv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDragableGv = (DragableGridView) findViewById(R.id.drag_grid_view);
        MyAdapter adapter = new MyAdapter(this);
        List<String> list = new ArrayList<String>();
        for (int i = 0 ; i < 30 ; i ++) {
            list.add("position" + i);
        }
        adapter.setList(list);
        mDragableGv.setAdapter(adapter);
    }
}
