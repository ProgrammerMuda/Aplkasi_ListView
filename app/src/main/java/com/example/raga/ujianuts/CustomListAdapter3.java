package com.example.raga.ujianuts;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by RAGA on 03/10/2017.
 */

public class CustomListAdapter3 extends ArrayAdapter<String> {
    private Activity contex3 ;
    private final String[] namamakanan;
    private final Integer[] gambarmakanan;

    public CustomListAdapter3(Activity contex3, String[] namamakanan, Integer[] gambarmakanan) {
        super(contex3,R.layout.list_item,namamakanan);
        this.contex3 = contex3;
        this.namamakanan = namamakanan;
        this.gambarmakanan= gambarmakanan;

    }

    public View getView(int posisi ,View view , ViewGroup parent){
        LayoutInflater inflater = contex3.getLayoutInflater();
        View rowView2 = inflater.inflate(R.layout.list_item,null,true);
        TextView title = (TextView) rowView2.findViewById(R.id.textview);
        ImageView image = (ImageView) rowView2.findViewById(R.id.imageview);

        title.setText(namamakanan[posisi]);
        image.setImageResource(gambarmakanan[posisi]);

        return rowView2;



        }
}
