package com.wnf.homeuidemo.fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wnf.homeuidemo.R;
import com.wnf.homeuidemo.homeview.CircleImageView;
import com.wnf.homeuidemo.homeview.event.HideButtonEvent;
import com.wnf.homeuidemo.homeview.event.ShowButtonEvent;
import com.wnf.homeuidemo.homeview.leftview.MenuFragment;

import de.greenrobot.event.EventBus;


/**
 * Created by sig on 2018/7/23.
 */

public class MenuLeftFragment extends MenuFragment {

    private CircleImageView head;
    public static MenuLeftFragment newInstance() {
        Bundle args = new Bundle();

        MenuLeftFragment fragment = new MenuLeftFragment();
        fragment.setArguments(args);
        return fragment;
    }
    private View leftMenu;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        leftMenu = inflater.inflate(R.layout.fragment_leftmenu, container, false);
        init();
        return setupReveal(leftMenu);           /**坑点**/
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void init(){
        head = (CircleImageView) leftMenu.findViewById(R.id.head);
    }

    @Override
    public void onOpenMenu() {
        super.onOpenMenu();
        ShowButtonEvent showButtonEvent = new ShowButtonEvent();
        showButtonEvent.setShow(true);
        EventBus.getDefault().post(showButtonEvent);
    }

    @Override
    public void onCloseMenu() {
        super.onCloseMenu();
        HideButtonEvent hideButtonEvent = new HideButtonEvent();
        hideButtonEvent.setHide(true);
        EventBus.getDefault().post(hideButtonEvent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}

