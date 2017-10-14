package com.example.raga.ujianuts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class detailactivty3 extends AppCompatActivity {

    TextView titleapps2;
    ImageView pictures2;
    WebView wvbrowser3;
    WebSettings webset3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailactivty3);

        titleapps2 = (TextView)findViewById(R.id.titleApps2);
        pictures2 = (ImageView)findViewById(R.id.imgData2);
        wvbrowser3 =(WebView) findViewById(R.id.webView3);
        Bundle tampungbundle3 = getIntent().getExtras();
        String title3 = tampungbundle3.getString("tit");
        Integer pic3 = tampungbundle3.getInt("gambar");
        String url3 = tampungbundle3.getString("url3");

        titleapps2.setText(title3);
        pictures2.setImageResource(pic3);
        webset3 = wvbrowser3.getSettings();
        webset3.setJavaScriptEnabled(true);
        wvbrowser3.setWebViewClient(new WebViewClient());
        wvbrowser3.loadUrl(url3);



        System.out.println("data yang diterima adalah " + title3 +    " dengan gambar " + pic3);

        }

    }

