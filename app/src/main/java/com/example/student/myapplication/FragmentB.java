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

public class FragmentB extends Fragment implements View.OnClickListener {
    Button btnB;
    TextView lblB;
    EditText txtB;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View infView=inflater.inflate(R.layout.fragment_b, container, false);
        btnB= (Button) infView.findViewById(R.id.btnB);
        lblB= (TextView) infView.findViewById(R.id.lblB);
        txtB= (EditText) infView.findViewById(R.id.txtB);
        btnB.setOnClickListener(this);
        return infView;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), "Fragment B", Toast.LENGTH_LONG).show();
    }
}
