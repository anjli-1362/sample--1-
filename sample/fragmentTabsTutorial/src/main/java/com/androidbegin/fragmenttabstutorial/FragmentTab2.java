package com.androidbegin.fragmenttabstutorial;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FragmentTab2 extends Fragment implements AdapterView.OnItemClickListener {


int flag=0;
    ListView f2lv;
    AdapterClass2 adapter;
    ArrayList<RowClass_uninstaled> rowClass=new ArrayList<RowClass_uninstaled>() ;

    PackageManager pm;
    List<ApplicationInfo> packages ;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragmenttab2, container, false);
        return rootView;
    }




    @Override
    public void onStart() {
        super.onStart();



        f2lv = (ListView) getView().findViewById(R.id.f2_lv);
        prepData();   //add data here from data base to class  also change the class to add the image aswell
        f2lv.setOnItemClickListener(this);
        adapter = new AdapterClass2(rowClass, getActivity());

        f2lv.setAdapter(adapter);

        flag = 1;





    }


    public void prepData(){

        // this is sample data
        rowClass.add(new RowClass_uninstaled("App1","21/2/2015"));
        rowClass.add(new RowClass_uninstaled("App1","15/3/2015"));
        rowClass.add(new RowClass_uninstaled("App1","12/4/2015"));
        rowClass.add(new RowClass_uninstaled("App1","13/5/2015"));



    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }







 
}