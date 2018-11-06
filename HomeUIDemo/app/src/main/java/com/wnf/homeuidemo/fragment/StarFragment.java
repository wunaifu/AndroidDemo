package com.wnf.homeuidemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.wnf.homeuidemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sig on 2018/7/9.
 */

public class StarFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_star, container, false);

        return view;

    }
}
