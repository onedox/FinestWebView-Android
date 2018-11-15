package com.thefinestartist.finestwebview.listeners;

import android.webkit.WebView;

public interface OverrideUrlLoadingHandler {
    boolean shouldOverrideUrlLoading(WebView view, String url);
}
