package com.example.raga.ujianuts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class detailactivty2 extends AppCompatActivity {
    TextView titleapps3;
    ImageView pictures3;
    WebView wvbrowser2;
    WebSettings webset2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailactivty2);
        titleapps3 = (TextView)findViewById(R.id.titleApps3);
        pictures3 = (ImageView)findViewById(R.id.imgData3);
        wvbrowser2 = (WebView) findViewById(R.id.webView2);

        Bundle tampungbundle3 = getIntent().getExtras();
        String title2 = tampungbundle3.getString("tit1");
        Integer pic2 = tampungbundle3.getInt("pic1");
        String url2 = tampungbundle3.getString("url2");

        titleapps3.setText(title2);
        pictures3.setImageResource(pic2);
        webset2=wvbrowser2.getSettings();
        webset2.setJavaScriptEnabled(true);
        wvbrowser2.setWebViewClient(new WebViewClient());
        wvbrowser2.loadUrl(url2);


        System.out.println("data yang diterima adalah " + title2 +    " dengan gambar " + pic2);



    }
}
