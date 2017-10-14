package com.example.raga.ujianuts;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by RAGA on 02/10/2017.
 */

public class  CustomListAdapter2 extends ArrayAdapter<String> {

    private Activity contex2 ;
    private final String[] namakota;
    private final Integer[] logokota;

    public CustomListAdapter2(Activity contex2, String[] namakota, Integer[] logokota) {
       super(contex2,R.layout.list_item,namakota);
        this.contex2 = contex2;
        this.namakota = namakota;
        this.logokota = logokota;

        }

    public View getView(int posisi ,View view , ViewGroup parent){
        LayoutInflater inflater = contex2.getLayoutInflater();
        View rowView2 = inflater.inflate(R.layout.list_item,null,true);
        TextView title = (TextView) rowView2.findViewById(R.id.textview);
        ImageView image = (ImageView) rowView2.findViewById(R.id.imageview);

        title.setText(namakota[posisi]);
        image.setImageResource(logokota[posisi]);

        return rowView2;














}








}



