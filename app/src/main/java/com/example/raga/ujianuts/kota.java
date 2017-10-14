package com.example.raga.ujianuts;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class kota extends AppCompatActivity {
    String[] namakota1 = {
            "jakarta",
            "bandung",
            "semarang",
            "surabaya",
            "palembang",
            "yogyakarta",
            "makassar",
            "medan",
            "malang",
            "pekanbaru",
            "bogor",
            "balikpapan",
            "tanggerang",
            "manado",
            "bali",
            "padang",
            "bekasi",
    };

    String[] webview2 = {
            "https://id.wikipedia.org/wiki/Daerah_Khusus_Ibukota_Jakarta",
            "https://id.wikipedia.org/wiki/Kota_Bandung",
            "https://id.wikipedia.org/wiki/Kota_Semarang",
            "https://id.wikipedia.org/wiki/Kota_Surabaya",
            "https://id.wikipedia.org/wiki/Kota_Palembang",
            "https://id.wikipedia.org/wiki/Kota_Yogyakarta",
            "https://id.wikipedia.org/wiki/Kota_Makassar",
            "https://id.wikipedia.org/wiki/Kota_Medan",
            "https://id.wikipedia.org/wiki/Kota_Malang",
            "https://id.wikipedia.org/wiki/Kota_Pekanbaru",
            "https://id.wikipedia.org/wiki/Kota_Bogor",
            "https://id.wikipedia.org/wiki/Kota_Balikpapan",
            "https://id.wikipedia.org/wiki/Kota_Tangerang",
            "https://id.wikipedia.org/wiki/Kota_Manado",
            "https://id.wikipedia.org/wiki/Bali",
            "https://id.wikipedia.org/wiki/Kota_Padang",
            "https://id.wikipedia.org/wiki/Kota_Bekasi",

    };

    Integer[] logokota ={
            R.drawable.jakarta,
            R.drawable.bandung,
            R.drawable.semarang,
            R.drawable.surabaya,
            R.drawable.palembang,
            R.drawable.yogya,
            R.drawable.makassar,
            R.drawable.medan,
            R.drawable.malang,
            R.drawable.pekanbaru,
            R.drawable.bogor,
            R.drawable.balikpapan,
            R.drawable.tanggerang,
            R.drawable.manado,
            R.drawable.bali,
            R.drawable.padang,
            R.drawable.bekasi,


    };

    ListView list;
    AlertDialog.Builder alertdialog1;
    AlertDialog alertnya1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kota);

        CustomListAdapter2 cladapter2= new CustomListAdapter2(this,namakota1,logokota);

        list =(ListView)findViewById(R.id.list2);
        list.setAdapter(cladapter2);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                alertdialog1 = new AlertDialog.Builder(kota.this);
                alertdialog1
                        .setTitle("pilihan yang kamu pilih adalah " + namakota1[position])
                        .setMessage("kota " + namakota1[position] + " adalah salah satu kota yang ada diindonesia")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String title1 = namakota1[position];
                                Integer bitmap = logokota[position];
                                String url2 = webview2[position];

                                Bundle ngambil1= new Bundle();

                                ngambil1.putString("tit1", title1);
                                ngambil1.putInt("pic1", bitmap);
                                ngambil1.putString("url2", url2);


                                Intent kirim = new Intent(kota.this,detailactivty2.class);
                                kirim.putExtras(ngambil1);
                                startActivity(kirim);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                alertnya1=alertdialog1.create();
                alertnya1.show();

            }
        });

    }
}
