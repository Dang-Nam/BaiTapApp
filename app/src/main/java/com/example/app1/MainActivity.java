package com.example.app1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView1;
    private EditText sizeCanhInput;
    private Button ButtonTinh;
    private TextView TextKq;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        webView1 = findViewById(R.id.webview1);
        sizeCanhInput = findViewById(R.id.sizeCanh);
        ButtonTinh = findViewById(R.id.ButtonTinh);
        TextKq = findViewById(R.id.TextKq);


        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.setWebChromeClient(new WebChromeClient());
        webView1.loadUrl("file:///android_asset/index.html");


        ButtonTinh.setOnClickListener(view -> {
            String sizeCanhText = sizeCanhInput.getText().toString();
            if (!sizeCanhText.isEmpty()) {
                double sizeCanh = Double.parseDouble(sizeCanhText);
                ChuViVuong chuViVuong = new ChuViVuong(sizeCanh);
                double perimeter = chuViVuong.calculatePerimeter();
                TextKq.setText("Chu vi hình vuông là: " + perimeter + " cm");
            }
        });
    }
}
