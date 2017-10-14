package com.example.raga.ujianuts;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class provinsi extends AppCompatActivity {
    String[] namaprovinsi = {
            "aceh",
            "jakarta",
            "bali",
            "banten",
            "bengkulu",
            "gorontalo",
            "jambi",
            "jawa barat",
            "jawa tengah",
            "jawa timur",
            "kalimantan barat",
            "kalimantan selatan",
            "kalimantan tengah",
            "kalimantan timur",
            "kalimantan utara",
            "kepulauan bangka belitung",
            "riau",
            "lampung",
    };

    String[] webview1 = {
            "https://id.wikipedia.org/wiki/Aceh",
            "https://en.wikipedia.org/wiki/Jakarta",
            "https://en.wikipedia.org/wiki/bali",
            "https://id.wikipedia.org/wiki/Banten",
            "https://id.wikipedia.org/wiki/Bengkulu",
            "https://id.wikipedia.org/wiki/Gorontalo",
            "https://id.wikipedia.org/wiki/Jambi",
            "https://id.wikipedia.org/wiki/Jawa_Barat",
            "https://id.wikipedia.org/wiki/Jawa_Tengah",
            "https://id.wikipedia.org/wiki/Jawa_Timur",
            "https://id.wikipedia.org/wiki/Kalimantan_Barat",
            "https://id.wikipedia.org/wiki/Kalimantan_Selatan",
            "https://id.wikipedia.org/wiki/Kalimantan_Tengah",
            "https://id.wikipedia.org/wiki/Kalimantan_Timur",
            "https://id.wikipedia.org/wiki/Kalimantan_Utara",
            "https://id.wikipedia.org/wiki/Kepulauan_Bangka_Belitung",
            "https://id.wikipedia.org/wiki/Riau",
            "https://id.wikipedia.org/wiki/Lampung",

    };



    Integer[] logoprovinsi = {
            R.drawable.aceh,
            R.drawable.jakarta,
            R.drawable.bali,
            R.drawable.banten,
            R.drawable.bengkulu,
            R.drawable.gorontalo,
            R.drawable.jambi,
            R.drawable.jawabarat,
            R.drawable.jawatengah,
            R.drawable.jawatimur,
            R.drawable.kalimantanbarat,
            R.drawable.kalimantanselatan,
            R.drawable.kalimantantengah,
            R.drawable.kalimantantimur,
            R.drawable.kalimantanutara,
            R.drawable.bangkabelitung,
            R.drawable.riau,
            R.drawable.lampung,


    };



    ListView list;
    AlertDialog.Builder alertdialog;
    AlertDialog alertnya;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi);

        CustomListAdapter cladapter= new CustomListAdapter(this,namaprovinsi,logoprovinsi);
        list=(ListView)findViewById(R.id.list1);
        list.setAdapter(cladapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                alertdialog = new AlertDialog.Builder(provinsi.this);

                alertdialog
                      .setTitle("pilihan yang kamu pilih adalah " + namaprovinsi[position])
                        .setMessage("provinsi " + namaprovinsi[position] + " adalah salah satu provisi indonesia")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String title = namaprovinsi[position];
                                Integer bitmap = logoprovinsi[position];
                                String url = webview1[position];

                                Bundle ngambil = new Bundle();

                                ngambil.putString("tit", title);
                                ngambil.putInt("picture", bitmap);
                                ngambil.putString("url", url);


                                Intent kirim= new Intent(provinsi.this,detailactivty.class);
                                kirim.putExtras(ngambil);
                                startActivity(kirim);


                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                alertnya=alertdialog.create();
                alertnya.show();




            }
        });

    }
}
