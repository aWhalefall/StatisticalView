package com.tseng.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.android.widget.StatisticalItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CircleStatisticalView csv;
    List<StatisticalItem> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        csv = findViewById(R.id.csv);
        csv.setUseAnimation(false);

        float total = 100F;
        //测试数据
        float[] percent = {10/total, 20F/total, 15F/total, 15F/total,40F/total};

        int[] color = {
                Color.parseColor("#FD695D"),
                Color.parseColor("#FDB57B"),
                Color.parseColor("#12B166"),
                Color.parseColor("#1DA0FB"),
                Color.GREEN};
        String[] markTop = {
                "13.20",
                "2.80",
                "5.74",
                "24.00",
                "24.00"}
                ;
        String[] markBottom = {
                "商超",
                "水房",
                "其他",
                "餐饮",
                "餐饮"};

        list = new ArrayList<>();
        for (int i = 0; i < percent.length; i++) {
            StatisticalItem item = new StatisticalItem();
            item.setPercent(percent[i]);
            item.setColor(color[i]);
            item.setTopMarkText(markTop[i]);
            item.setBottomMarkText(markBottom[i]);
            list.add(item);
        }
        //设置数据方法
        csv.setStatisticalItems(list);
    }


    @Override
    protected void onResume() {
        super.onResume();

    }
}
