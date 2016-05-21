package com.pluu.webtoon.adapter.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pluu.webtoon.R;
import com.pluu.webtoon.item.ChatView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by PLUUSYSTEM-SURFACE on 2016-05-21.
 */

public class DaumLeftViewHolder extends BaseChattingViewHolder {

    @Bind(R.id.leftProfileImageView)
    ImageView leftProfileImageView;
    @Bind(R.id.leftNameTextView)
    TextView leftNameTextView;
    @Bind(R.id.leftMessageTextView)
    TextView leftMessageTextView;

    public DaumLeftViewHolder(View v) {
        super(v);
        ButterKnife.bind(this, v);
    }

    @Override
    public void bind(Context context, ChatView item) {
        loadProfileImage(context, leftProfileImageView, item.getImgUrl());
        leftNameTextView.setText(item.getName());
        leftMessageTextView.setText(item.getText());
    }
}