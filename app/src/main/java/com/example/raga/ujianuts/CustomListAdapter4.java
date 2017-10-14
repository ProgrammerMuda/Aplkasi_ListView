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

public class CustomListAdapter4 extends ArrayAdapter<String> {

    private Activity contex4 ;
    private final String[] namawisata;
    private final Integer[] gambarwisata;

    public CustomListAdapter4(Activity contex4,  String[] namawisata, Integer[] gambarwisata) {
        super(contex4,R.layout.list_item,namawisata);
        this.contex4 = contex4;
        this.namawisata = namawisata;
        this.gambarwisata = gambarwisata;
    }
    public View getView(int posisi , View view , ViewGroup parent){
        LayoutInflater inflater = contex4.getLayoutInflater();
        View rowView2 = inflater.inflate(R.layout.list_item,null,true);
        TextView title = (TextView) rowView2.findViewById(R.id.textview);
        ImageView image = (ImageView) rowView2.findViewById(R.id.imageview);
        title.setText(namawisata[posisi]);
        image.setImageResource(gambarwisata[posisi]);

        return rowView2;

    }
}
