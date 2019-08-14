package com.example.user.dn2019;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Random;

public class StopFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.stop_fragment, container, false);
        return fragView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        GraphView graph = view.findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, new Random().nextInt(100)),
                new DataPoint(1, new Random().nextInt(100)),
                new DataPoint(2, new Random().nextInt(100)),
                new DataPoint(3, new Random().nextInt(100)),
                new DataPoint(4, new Random().nextInt(100)),
                new DataPoint(5, new Random().nextInt(100)),
                new DataPoint(6, new Random().nextInt(100)),
                new DataPoint(7, new Random().nextInt(100)),
                new DataPoint(8, new Random().nextInt(100)),
                new DataPoint(9, new Random().nextInt(100)),
                new DataPoint(10, new Random().nextInt(100)),
                new DataPoint(11, new Random().nextInt(100)),
                new DataPoint(12, new Random().nextInt(100)),
                new DataPoint(13, new Random().nextInt(100)),
                new DataPoint(14, new Random().nextInt(100)),
                new DataPoint(15, new Random().nextInt(100)),
                new DataPoint(16, new Random().nextInt(100)),
                new DataPoint(17, new Random().nextInt(100)),
                new DataPoint(18, new Random().nextInt(100)),
                new DataPoint(19, new Random().nextInt(100)),
                new DataPoint(20, new Random().nextInt(100)),
        });
        graph.addSeries(series);
    }
}