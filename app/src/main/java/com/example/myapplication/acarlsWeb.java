package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class acarlsWeb extends Activity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.akarls);

            WebView myBrowser = (WebView)findViewById(R.id.acarlsWeb);

            myBrowser.getSettings().setBuiltInZoomControls(true);
            myBrowser.loadUrl("file:///android_asset/acarls.html");
        }
}
