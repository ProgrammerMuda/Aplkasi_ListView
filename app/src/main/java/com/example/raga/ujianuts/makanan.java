package com.example.raga.ujianuts;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class makanan extends AppCompatActivity {

 String[] namamakanan = {
         "mie aceh",
         "bika ambon",
         "rendang",
         "pempek",
         "gulai ikan patin",
         "keraktelor",
         "mie ayam",
         "gudeg",
         "rujak cingur",
         "ayam betutu",
         "soto banjar",
         "papeda",
 };

String[] webview3 = {
        "https://id.wikipedia.org/wiki/Mi_aceh",
        "https://id.wikipedia.org/wiki/Bika_ambon",
        "https://id.wikipedia.org/wiki/Rendang",
        "https://id.wikipedia.org/wiki/Pempek",
        "www.sarihusada.co.id/Nutrisi...Gizi/Gulai-Ikan-Patin-Khas-Jambi",
        "https://id.wikipedia.org/wiki/Kerak_telor",
        "https://id.wikipedia.org/wiki/Mi_ayam",
        "https://id.wikipedia.org/wiki/Gudeg",
        "https://id.wikipedia.org/wiki/Rujak_cingur",
        "https://id.wikipedia.org/wiki/Ayam_betutu",
        "https://id.wikipedia.org/wiki/Soto_Banjar",
        "https://id.wikipedia.org/wiki/Papeda",

};

 Integer[] gambarmakanan = {
         R.drawable.mieaceh,
         R.drawable.bikaambon,
         R.drawable.rendang,
         R.drawable.pemepk,
         R.drawable.ikanpatin,
         R.drawable.keraktelor,
         R.drawable.miebangka,
         R.drawable.gudeg,
         R.drawable.rujak,
         R.drawable.ayambetutu,
         R.drawable.sotobanjar,
         R.drawable.papeda,



 };

 ListView list;
 AlertDialog.Builder alertdialog2;
 AlertDialog alertnya2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        CustomListAdapter3 cladapter3 = new CustomListAdapter3(this,namamakanan,gambarmakanan);
        list= (ListView)findViewById(R.id.lis3);
        list.setAdapter(cladapter3);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                alertdialog2 = new AlertDialog.Builder(makanan.this);

                alertdialog2
                        .setTitle("pilihan yang kamu pilih adalah " + namamakanan[position])
                        .setMessage("makanan" + namamakanan[position] + " salah satu kuliner yang ada diindonesia")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String title = namamakanan[position];
                                Integer bitmap = gambarmakanan[position];
                                String url3 = webview3[position];


                                Bundle ngambil = new Bundle();

                                ngambil.putString("tit",title);
                                ngambil.putInt("gambar",bitmap);
                                ngambil.putString("url3", url3);

                                Intent kirim= new Intent(makanan.this,detailactivty3.class);
                                kirim.putExtras(ngambil);
                                startActivity(kirim);

                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                alertnya2=alertdialog2.create();
                alertnya2.show();




            }
        });
    }
}
