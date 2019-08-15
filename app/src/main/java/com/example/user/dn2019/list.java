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
        listviewShoetDescription.add("Distance 20km away, Average rating 4.5");
        listviewShoetDescription.add("Distance 100km away, Average rating 4.3");
        listviewShoetDescription.add("Distance 50km away, Average rating 3,5");
        listviewShoetDescription.add("Distance 70km away, Average rating 3.9");
        listviewShoetDescription.add("Distance 170km away, Average rating 4.4");
        listviewShoetDescription.add("Distance 270km away, Average rating 4.1");
        listviewShoetDescription.add("Distance 390km away, Average rating 3.6");
        listviewShoetDescription.add("Distance 500km away, Average rating 3.4");


        listviewTitle.add("Khee Ong's Farm");
        listviewTitle.add("Yi Jin's Farm");
        listviewTitle.add("Chew's Farm");
        listviewTitle.add("Thavaanesan's Farm");
        listviewTitle.add("John Chua's Farm");
        listviewTitle.add("Ernest's Farm");
        listviewTitle.add("MDEC's Farm");
        listviewTitle.add("Digital Ninja's Farm");

        listviewImage.add( R.drawable.download);
        listviewImage.add( R.drawable.download2);
        listviewImage.add( R.drawable.download3);
        listviewImage.add( R.drawable.download4);
        listviewImage.add( R.drawable.download5);
        listviewImage.add( R.drawable.download6);
        listviewImage.add( R.drawable.download7);
        listviewImage.add( R.drawable.download8);
        listviewImage.add( R.drawable.dowload9);
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