package com.example.user.dn2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class list extends AppCompatActivity {
    Toolbar mToolbar;
    // Array of strings for ListView Title
    ArrayList<String> listviewTitle = new ArrayList<>();
    ArrayList<Integer> listviewImage = new ArrayList<>();
    ArrayList<String> listviewShoetDescription = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_with_image_and_text);
        configureToolbar();
        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
        listviewShoetDescription.add("Android ListView Short Description1");
        listviewShoetDescription.add("Android ListView Short Description2");
        listviewShoetDescription.add("Android ListView Short Description3");
        listviewShoetDescription.add("Android ListView Short Description4");
        listviewShoetDescription.add("Android ListView Short Description5");
        listviewShoetDescription.add("Android ListView Short Description6");
        listviewShoetDescription.add("Android ListView Short Description7");
        listviewShoetDescription.add("Android ListView Short Description8");


        listviewTitle.add("ListView Title 1");
        listviewTitle.add("ListView Title 2");
        listviewTitle.add("ListView Title 3");
        listviewTitle.add("ListView Title 4");
        listviewTitle.add("ListView Title 5");
        listviewTitle.add("ListView Title 6");
        listviewTitle.add("ListView Title 7");
        listviewTitle.add("ListView Title 8");

        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        for (int i = 0; i < 8; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle.get(i));
            hm.put("listview_discription", listviewShoetDescription.get(i));
            hm.put("listview_image", Integer.toString(listviewImage.get(i)));
            aList.add(hm);
        }



        String[] from = {"listview_image", "listview_title", "listview_discription"};
        int[] to = {R.id.listview_image, R.id.listview_item_title, R.id.listview_item_short_description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_activity, from, to);
        final ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);
        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int o = position;//As you are using Default String Adapter
                Toast.makeText(getBaseContext(),listviewShoetDescription.get(o),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(list.this,Detaul.class);
                startActivity(intent);
            }
        });
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void configureToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getString(R.string.app_name));
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
    }
}