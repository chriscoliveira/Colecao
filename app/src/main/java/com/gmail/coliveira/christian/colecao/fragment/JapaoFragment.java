package com.gmail.coliveira.christian.colecao.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail.coliveira.christian.colecao.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class JapaoFragment extends Fragment {


    public JapaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.op_data_japao, container, false);
    }

}
