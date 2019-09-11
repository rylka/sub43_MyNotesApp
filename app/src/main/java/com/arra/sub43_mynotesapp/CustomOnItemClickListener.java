package com.arra.sub43_mynotesapp;

import android.view.View;

public class CustomOnItemClickListener implements View.OnClickListener {

    private int position;

    private OnItemClickCallback onItemClickCallback;

    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }

    public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);
    }
}
