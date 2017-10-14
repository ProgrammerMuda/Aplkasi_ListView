package com.example.raga.ujianuts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class detailactivty extends AppCompatActivity {

   TextView titleapps;
   ImageView pictures;
    WebView wvbrowser;
    WebSettings webset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailactivty);
        titleapps = (TextView)findViewById(R.id.titleApps);

        pictures = (ImageView) findViewById(R.id.imgData);
        wvbrowser=(WebView) findViewById(R.id.webView);


        Bundle tampungBundle = getIntent().getExtras();
        String title = tampungBundle.getString("tit");
        Integer pic = tampungBundle.getInt("picture");
        String url = tampungBundle.getString("url");




        titleapps.setText(title);

        pictures.setImageResource(pic);

        webset=wvbrowser.getSettings();
        webset.setJavaScriptEnabled(true);
        wvbrowser.setWebViewClient(new WebViewClient());
        wvbrowser.loadUrl(url);


        System.out.println("data yang diterima adalah " + title +    " dengan gambar " + pic);




    }
}
