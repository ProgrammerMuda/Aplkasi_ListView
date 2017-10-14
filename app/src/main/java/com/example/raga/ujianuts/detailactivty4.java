package com.example.raga.ujianuts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class detailactivty4 extends AppCompatActivity {
    TextView titleapps4;
    ImageView pictures4;
    WebView wvbrowser4;
    WebSettings webset4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailactivty4);
        titleapps4= (TextView)findViewById(R.id.titleApps4);
        pictures4= (ImageView)findViewById(R.id.imgData4);
        wvbrowser4 =(WebView) findViewById(R.id.webView4);

        Bundle tampungbundle4 = getIntent().getExtras();
        String title4 = tampungbundle4.getString("judul4");
        Integer gambar4 = tampungbundle4.getInt("gambar4");
        String url4 = tampungbundle4.getString("url5");

        titleapps4.setText(title4);
        pictures4.setImageResource(gambar4);
        webset4=wvbrowser4.getSettings();
        webset4.setJavaScriptEnabled(true);
        wvbrowser4.setWebViewClient(new WebViewClient());
        wvbrowser4.loadUrl(url4);

        System.out.println("data yang diterima adalah " + title4 +    " dengan gambar " + gambar4);

    }
}
