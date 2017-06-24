package com.example.android.android_me.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * @author root
 */

public class BodyPartFragment extends Fragment {

    private View rootView;
    private ImageView bodyImage;

    public BodyPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_body_part,container,false);

        bodyImage = rootView.findViewById(R.id.bodyImageView);

        bodyImage.setImageResource(AndroidImageAssets.getHeads().get(0));
        bodyImage.setContentDescription("Head");
        return rootView;
    }
}
