package com.example.raga.ujianuts;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class wisata extends AppCompatActivity {

    String[] namawisata = {
            "candi borobudur",
            "candi prambanan",
            "danau toba",
            "taman mini",
            "pulau komodo",
            "taman safari",
            "ancol",
            "museum nasional",
            "ragunan",
            "monas",
            "gunung rinjani",
            "gunung bromo",
            "pulau seribu",
            "kawah putih",
            "raja ampat",
    };

    String[] webview4 = {
            "https://id.wikipedia.org/wiki/Borobudur",
            "https://id.wikipedia.org/wiki/Candi_Prambanan",
            "https://id.wikipedia.org/wiki/Danau_Toba",
            "https://id.wikipedia.org/wiki/Taman_Mini_Indonesia_Indah",
            "https://id.wikipedia.org/wiki/Pulau_Komodo",
            "https://id.wikipedia.org/wiki/Taman_Safari_Indonesia",
            "https://id.wikipedia.org/wiki/Taman_Impian_Jaya_Ancol",
            "https://id.wikipedia.org/wiki/Museum_Nasional_Indonesia",
            "https://id.wikipedia.org/wiki/Kebun_Binatang_Ragunan",
            "https://id.wikipedia.org/wiki/Monumen_Nasional",
            "https://id.wikipedia.org/wiki/Gunung_Rinjani",
            "https://id.wikipedia.org/wiki/Gunung_Bromo",
            "https://id.wikipedia.org/wiki/Taman_Nasional_Kepulauan_Seribu",
            "https://id.wikipedia.org/wiki/Kawah_Putih",
            "https://id.wikipedia.org/wiki/Kepulauan_Raja_Ampat",
    };

    Integer[] gambarwisata = {
            R.drawable.candiborobudur,
            R.drawable.candiprambanan,
            R.drawable.danautoba,
            R.drawable.tamanmini,
            R.drawable.pulaukomodo,
            R.drawable.tamansafari,
            R.drawable.ancol,
            R.drawable.museumindonesia,
            R.drawable.ragunan,
            R.drawable.monas,
            R.drawable.gunungrinjani,
            R.drawable.gunungbromo,
            R.drawable.pulauseribu,
            R.drawable.kawahputih,
            R.drawable.rajaampat,

    };

    ListView list3;
    AlertDialog.Builder alertdialog4;
    AlertDialog alertnya4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
        CustomListAdapter4 cladapter4 = new CustomListAdapter4(this,namawisata,gambarwisata);
        list3 = (ListView)findViewById(R.id.list4);
        list3.setAdapter(cladapter4);

        list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                alertdialog4 = new AlertDialog.Builder(wisata.this);
                alertdialog4
                        .setTitle("pilihan yang kamu pilih adalah wisata " + namawisata[position])
                        .setMessage("tempat wisata " + namawisata[position] + " salah satu tempat wisata yang ada di indonesia")
                        .setPositiveButton("ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String judul = namawisata[position];
                                Integer gambar4 = gambarwisata[position];
                                String url4 = webview4[position];

                                Bundle ngambil4 = new Bundle();

                                ngambil4.putString("judul4",judul);
                                ngambil4.putInt("gambar4", gambar4);
                                ngambil4.putString("url5" ,url4);

                                Intent kirim4 = new Intent(wisata.this,detailactivty4.class);
                                kirim4.putExtras(ngambil4);
                                startActivity(kirim4);

                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                alertnya4=alertdialog4.create();
                alertdialog4.show();
            }
        });

    }
}
