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

 public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity contex;
    private final String[] namaprovinsi;
    private final Integer[] logoprovinsi;

    public CustomListAdapter(Activity contex, String[] namaprovinsi, Integer[] logoprovinsi) {
        super(contex, R.layout.list_item, namaprovinsi);
        this.contex = contex;
        this.namaprovinsi = namaprovinsi;
        this.logoprovinsi = logoprovinsi;
    }
    public View getView(int posisi,View view , ViewGroup parent) {
        LayoutInflater inflater = contex.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item,null, true);
        TextView title = (TextView) rowView.findViewById(R.id.textview);
        ImageView picture = (ImageView) rowView.findViewById(R.id.imageview);

        title.setText(namaprovinsi[posisi]);
        picture.setImageResource(logoprovinsi[posisi]);

        return rowView;







    }

}
