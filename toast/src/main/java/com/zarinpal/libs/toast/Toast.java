package com.zarinpal.libs.toast;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Custom Toast Created by farshid roohi on 11/29/17.
 */

public class Toast extends BaseToast {

    private CardView cardView;
    private TextView txtText;
    private ImageView imgIc;

    public Toast(Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.cutom_toast;
    }

    @Override
    public void onCreateView(View view) {
        this.cardView = view.findViewById(R.id.card_view);
        this.imgIc = view.findViewById(R.id.img_ic);
        this.txtText = view.findViewById(R.id.txt_text);
    }

    @Override
    public Toast setIcon(int drawable) {
        this.imgIc.setImageResource(drawable);
        return this;
    }

    @Override
    public Toast setMessage(String msg) {
        this.txtText.setText(msg);
        return this;
    }

    @Override
    public Toast setColor(int txtColor, int bgColor) {
        this.cardView.setCardBackgroundColor(bgColor);
        this.txtText.setTextColor(txtColor);
        return this;
    }

    @Override
    public Toast setDurationToast(int duration) {
        this.setDuration(duration);
        return this;
    }
}
