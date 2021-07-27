package com.example.kioskapp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;

public class PreventStatusBar extends ViewGroup {

    Context context;

    public PreventStatusBar(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.v("customViewGroup", "********** Status bar swipe intercepted");
        setDisableStatusBar(context);
        return true;
    }

    public void setDisableStatusBar(Context context){
        Intent it = new Intent(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
        context.sendBroadcast(it);
    }
}
