package com.example.student.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Student on 10/9/2018.
 */

public class FragmentA extends Fragment implements View.OnClickListener {
    Button btnA;
    TextView lblA;
    EditText txtA;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View infView=inflater.inflate(R.layout.fragment_a, container, false);
        btnA= (Button) infView.findViewById(R.id.btnA);
        lblA= (TextView) infView.findViewById(R.id.lblA);
        txtA= (EditText) infView.findViewById(R.id.txtA);

        btnA.setOnClickListener(this);
        return infView;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), "Fragment A", Toast.LENGTH_LONG).show();
    }
}
