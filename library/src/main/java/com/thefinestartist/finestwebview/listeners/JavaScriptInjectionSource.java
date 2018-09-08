package com.thefinestartist.finestwebview.listeners;

import android.webkit.WebView;

public interface JavaScriptInjectionSource {
    void getJavaScriptToInject(String url, WebView webView, JavaScriptInjectionSourceCallback callback);
}
