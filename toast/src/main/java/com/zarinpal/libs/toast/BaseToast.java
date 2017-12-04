package com.zarinpal.libs.toast;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

/**
 * Base Toast Created by farshid roohi on 12/3/17.
 */

public abstract class BaseToast<T> extends Toast {

    private View view;
    private Context context;

    public BaseToast(Context context) {
        super(context);
        this.context = context;
        this.view = LayoutInflater.from(context).inflate(getLayout(), null);
        this.setView(view);
        this.onCreateView(view);
    }

    @LayoutRes
    public abstract int getLayout();

    public abstract void onCreateView(View view);

    public abstract T setIcon(@DrawableRes int drawable);

    public abstract T setMessage(String msg);

    public abstract T setColor(@ColorInt int txtColor, @ColorInt int bgColor);

    public abstract T setDurationToast(int duration);

    public View getView() {
        return this.view;
    }

    public Context getContext() {
        return this.context;
    }
}
