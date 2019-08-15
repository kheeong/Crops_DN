package com.example.user.dn2019;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cart extends Fragment {
    // Array of strings for ListView Title
    ArrayList<String> listviewTitle;
    ArrayList<Integer> listviewImage = new ArrayList<>();
    ArrayList<String> listviewShoetDescription = new ArrayList<>();
    int size;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.cart, container, false);


        listviewShoetDescription.add("Android ListView Short Description1");
        listviewShoetDescription.add("Android ListView Short Description2");
        listviewShoetDescription.add("Android ListView Short Description3");
        listviewShoetDescription.add("Android ListView Short Description4");
        listviewShoetDescription.add("Android ListView Short Description5");
        listviewShoetDescription.add("Android ListView Short Description6");
        listviewShoetDescription.add("Android ListView Short Description7");
        listviewShoetDescription.add("Android ListView Short Description8");

        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);
        listviewImage.add( R.drawable.logo);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
        listviewTitle = ((cart_variable)getActivity().getApplication()).getCart();
        size = ((cart_variable)getActivity().getApplication()).getLen();
        for (int i = 0; i < size; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle.get(i));
            hm.put("listview_discription", listviewShoetDescription.get(i));
            hm.put("listview_image", Integer.toString(listviewImage.get(i)));
            aList.add(hm);
        }


        String[] from = {"listview_image", "listview_title", "listview_discription"};
        int[] to = {R.id.listview_image, R.id.listview_item_title, R.id.listview_item_short_description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(v.getContext(), aList, R.layout.listview_activity, from, to);
        final ListView androidListView = (ListView) v.findViewById(R.id.cart_list_view);
        androidListView.setAdapter(simpleAdapter);
        return v;
    }
}
