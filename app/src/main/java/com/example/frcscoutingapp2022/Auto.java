package com.example.frcscoutingapp2022;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class Auto extends Fragment implements View.OnClickListener {


    //initialize variables

    //Initialize upper node text views
    private TextView AutoUpperConeText;
    private TextView AutoUpperCubeText;

    //initialize Middle node text views
    private TextView AutoMiddleConeText;
    private TextView AutoMiddleCubeText;

    //initialize Hybrid node text views
    private TextView AutoHybridConeText;
    private TextView AutoHybridCubeText;



    //counter arrays

    private int[] upperNodes = {0,0,0,0,0,0,0,0,0};

    private int[] middleNodes = {0,0,0,0,0,0,0,0,0};

    private int[] hybridNodes = {0,0,0,0,0,0,0,0,0};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_auto, container, false);

        Spinner alliancePos = (Spinner) view.findViewById(R.id.alliancePos);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.alliance_pos, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        alliancePos.setAdapter(adapter);
                //Upper Row Buttons
        view.findViewById(R.id.coneNode1).setOnClickListener(this);
        view.findViewById(R.id.cubeNode1).setOnClickListener(this);
        view.findViewById(R.id.coneNode2).setOnClickListener(this);
        view.findViewById(R.id.coneNode3).setOnClickListener(this);
        view.findViewById(R.id.cubeNode2).setOnClickListener(this);
        view.findViewById(R.id.coneNode4).setOnClickListener(this);
        view.findViewById(R.id.coneNode5).setOnClickListener(this);
        view.findViewById(R.id.cubeNode3).setOnClickListener(this);
        view.findViewById(R.id.coneNode6).setOnClickListener(this);

        //Middle Row Buttons
        view.findViewById(R.id.coneNode7).setOnClickListener(this);
        view.findViewById(R.id.cubeNode4).setOnClickListener(this);
        view.findViewById(R.id.coneNode8).setOnClickListener(this);
        view.findViewById(R.id.coneNode9).setOnClickListener(this);
        view.findViewById(R.id.cubeNode5).setOnClickListener(this);
        view.findViewById(R.id.coneNode10).setOnClickListener(this);
        view.findViewById(R.id.coneNode11).setOnClickListener(this);
        view.findViewById(R.id.cubeNode6).setOnClickListener(this);
        view.findViewById(R.id.coneNode12).setOnClickListener(this);

        //Hybrid Row Buttons
        view.findViewById(R.id.hybridNode0).setOnClickListener(this);
        view.findViewById(R.id.hybridNode1).setOnClickListener(this);
        view.findViewById(R.id.hybridNode2).setOnClickListener(this);
        view.findViewById(R.id.hybridNode3).setOnClickListener(this);
        view.findViewById(R.id.hybridNode4).setOnClickListener(this);
        view.findViewById(R.id.hybridNode5).setOnClickListener(this);
        view.findViewById(R.id.hybridNode6).setOnClickListener(this);
        view.findViewById(R.id.hybridNode7).setOnClickListener(this);
        view.findViewById(R.id.hybridNode8).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.coneNode1:
                if(upperNodes[0] == 0) {
                    upperNodes[0] = 1;
                    MainActivity.autoUpperNodes[0] = 1;
                    view.findViewById(R.id.coneNode1).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (upperNodes[0] == 1) {
                    upperNodes[0] = 0;
                    MainActivity.autoUpperNodes[0] = 0;
                    view.findViewById(R.id.coneNode1).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.cubeNode1:
                if(upperNodes[1] == 0){
                    upperNodes[1] = 2;
                    MainActivity.autoUpperNodes[1] = 2;
                    view.findViewById(R.id.cubeNode1).setBackgroundColor(Color.parseColor("#bb00ff"));
                } else if (upperNodes[1] == 2) {
                    upperNodes[1] = 0;
                    MainActivity.autoUpperNodes[1] = 0;
                    view.findViewById(R.id.cubeNode1).setBackgroundColor(Color.parseColor("#7600bc"));
                }
                break;

            case R.id.coneNode2:
                if(upperNodes[2] == 0) {
                    upperNodes[2] = 1;
                    MainActivity.autoUpperNodes[2] = 1;
                    view.findViewById(R.id.coneNode2).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (upperNodes[2] == 1) {
                    upperNodes[2] = 0;
                    MainActivity.autoUpperNodes[2] = 0;
                    view.findViewById(R.id.coneNode2).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.coneNode3:
                if(upperNodes[3] == 0) {
                    upperNodes[3] = 1;
                    MainActivity.autoUpperNodes[3] = 1;
                    view.findViewById(R.id.coneNode3).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (upperNodes[3] == 1) {
                    upperNodes[3] = 0;
                    MainActivity.autoUpperNodes[3] = 0;
                    view.findViewById(R.id.coneNode3).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.cubeNode2:
                if(upperNodes[4] == 0){
                    upperNodes[4] = 2;
                    MainActivity.autoUpperNodes[4] = 2;
                    view.findViewById(R.id.cubeNode2).setBackgroundColor(Color.parseColor("#bb00ff"));
                } else if (upperNodes[4] == 2) {
                    upperNodes[4] = 0;
                    MainActivity.autoUpperNodes[4] = 0;
                    view.findViewById(R.id.cubeNode2).setBackgroundColor(Color.parseColor("#7600bc"));
                }
                break;

            case R.id.coneNode4:
                if(upperNodes[5] == 0) {
                    upperNodes[5] = 1;
                    MainActivity.autoUpperNodes[5] = 1;
                    view.findViewById(R.id.coneNode4).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (upperNodes[5] == 1) {
                    upperNodes[5] = 0;
                    MainActivity.autoUpperNodes[5] = 0;
                    view.findViewById(R.id.coneNode4).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.coneNode5:
                if(upperNodes[6] == 0) {
                    upperNodes[6] = 1;
                    MainActivity.autoUpperNodes[6] = 1;
                    view.findViewById(R.id.coneNode5).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (upperNodes[6] == 1) {
                    upperNodes[6] = 0;
                    MainActivity.autoUpperNodes[6] = 0;
                    view.findViewById(R.id.coneNode5).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.cubeNode3:
                if(upperNodes[7] == 0){
                    upperNodes[7] = 2;
                    MainActivity.autoUpperNodes[7] = 2;
                    view.findViewById(R.id.cubeNode3).setBackgroundColor(Color.parseColor("#bb00ff"));
                } else if (upperNodes[7] == 2) {
                    upperNodes[7] = 0;
                    MainActivity.autoUpperNodes[7] = 0;
                    view.findViewById(R.id.cubeNode3).setBackgroundColor(Color.parseColor("#7600bc"));
                }
                break;

            case R.id.coneNode6:
                if(upperNodes[8] == 0) {
                    upperNodes[8] = 1;
                    MainActivity.autoUpperNodes[8] = 1;
                    view.findViewById(R.id.coneNode6).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (upperNodes[8] == 1) {
                    upperNodes[5] = 0;
                    MainActivity.autoUpperNodes[8] = 0;
                    view.findViewById(R.id.coneNode6).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.coneNode7:
                if(middleNodes[0] == 0) {
                    middleNodes[0] = 1;
                    MainActivity.autoMiddleNodes[0] = 1;
                    view.findViewById(R.id.coneNode7).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (middleNodes[0] == 1) {
                    middleNodes[0] = 0;
                    MainActivity.autoMiddleNodes[0] = 0;
                    view.findViewById(R.id.coneNode7).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.cubeNode4:
                if(middleNodes[1] == 0){
                    middleNodes[1] = 2;
                    MainActivity.autoMiddleNodes[1] = 2;
                    view.findViewById(R.id.cubeNode4).setBackgroundColor(Color.parseColor("#bb00ff"));
                } else if (middleNodes[1] == 2) {
                    middleNodes[1] = 0;
                    MainActivity.autoMiddleNodes[1] = 0;
                    view.findViewById(R.id.cubeNode4).setBackgroundColor(Color.parseColor("#7600bc"));
                }
                break;

            case R.id.coneNode8:
                if(middleNodes[2] == 0) {
                    middleNodes[2] = 1;
                    MainActivity.autoMiddleNodes[0] = 1;
                    view.findViewById(R.id.coneNode8).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (middleNodes[2] == 1) {
                    middleNodes[2] = 0;
                    MainActivity.autoMiddleNodes[2] = 0;
                    view.findViewById(R.id.coneNode8).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.coneNode9:
                if(middleNodes[3] == 0) {
                    middleNodes[3] = 1;
                    MainActivity.autoMiddleNodes[3] = 1;
                    view.findViewById(R.id.coneNode9).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (middleNodes[3] == 1) {
                    middleNodes[3] = 0;
                    MainActivity.autoMiddleNodes[3] = 0;
                    view.findViewById(R.id.coneNode9).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.cubeNode5:
                if(middleNodes[4] == 0){
                    middleNodes[4] = 2;
                    MainActivity.autoMiddleNodes[4] = 2;
                    view.findViewById(R.id.cubeNode5).setBackgroundColor(Color.parseColor("#bb00ff"));
                } else if (middleNodes[4] == 2) {
                    middleNodes[4] = 0;
                    MainActivity.autoMiddleNodes[4] = 0;
                    view.findViewById(R.id.cubeNode5).setBackgroundColor(Color.parseColor("#7600bc"));
                }
                break;

            case R.id.coneNode10:
                if(middleNodes[5] == 0) {
                    middleNodes[5] = 1;
                    MainActivity.autoMiddleNodes[5] = 1;
                    view.findViewById(R.id.coneNode10).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (middleNodes[5] == 1) {
                    middleNodes[5] = 0;
                    MainActivity.autoMiddleNodes[5] = 0;
                    view.findViewById(R.id.coneNode10).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.coneNode11:
                if(middleNodes[6] == 0) {
                    middleNodes[6] = 1;
                    MainActivity.autoMiddleNodes[6] = 1;
                    view.findViewById(R.id.coneNode11).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (middleNodes[6] == 1) {
                    middleNodes[6] = 0;
                    MainActivity.autoMiddleNodes[6] = 0;
                    view.findViewById(R.id.coneNode11).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.cubeNode6:
                if(middleNodes[7] == 0){
                    middleNodes[7] = 2;
                    MainActivity.autoMiddleNodes[7] = 2;
                    view.findViewById(R.id.cubeNode6).setBackgroundColor(Color.parseColor("#bb00ff"));
                } else if (middleNodes[7] == 2) {
                    middleNodes[7] = 0;
                    MainActivity.autoMiddleNodes[7] = 0;
                    view.findViewById(R.id.cubeNode6).setBackgroundColor(Color.parseColor("#7600bc"));
                }
                break;

            case R.id.coneNode12:
                if(middleNodes[8] == 0) {
                    middleNodes[8] = 1;
                    MainActivity.autoMiddleNodes[8] = 1;
                    view.findViewById(R.id.coneNode12).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (middleNodes[8] == 1) {
                    middleNodes[8] = 0;
                    MainActivity.autoMiddleNodes[8] = 0;
                    view.findViewById(R.id.coneNode12).setBackgroundColor(Color.parseColor("#ffff00"));
                }
                break;

            case R.id.hybridNode0:
                if (hybridNodes[0] == 0) {
                    hybridNodes[0] = 1;
                    MainActivity.autoHybridNodes[0] = 1;
                    view.findViewById(R.id.hybridNode0).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (hybridNodes[0] == 1){
                    hybridNodes[0] = 2;
                    MainActivity.autoHybridNodes[0] = 2;
                    view.findViewById(R.id.hybridNode0).setBackgroundColor(Color.parseColor("#4c00a3"));
                } else if (hybridNodes[0] == 2){
                    hybridNodes[0] = 0;
                    MainActivity.autoHybridNodes[0] = 0;
                    view.findViewById(R.id.hybridNode0).setBackgroundColor(Color.parseColor("#616161"));
                }
                break;
            case R.id.hybridNode1:
                if (hybridNodes[1] == 0) {
                    hybridNodes[1] = 1;
                    MainActivity.autoHybridNodes[1] = 1;
                    view.findViewById(R.id.hybridNode1).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (hybridNodes[1] == 1){
                    hybridNodes[1] = 2;
                    MainActivity.autoHybridNodes[1] = 2;
                    view.findViewById(R.id.hybridNode1).setBackgroundColor(Color.parseColor("#4c00a3"));
                } else if (hybridNodes[1] == 2){
                    hybridNodes[1] = 0;
                    MainActivity.autoHybridNodes[1] = 0;
                    view.findViewById(R.id.hybridNode1).setBackgroundColor(Color.parseColor("#616161"));
                }
                break;
            case R.id.hybridNode2:
                if (hybridNodes[2] == 0) {
                    hybridNodes[2] = 1;
                    MainActivity.autoHybridNodes[2] = 1;
                    view.findViewById(R.id.hybridNode2).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (hybridNodes[2] == 1){
                    hybridNodes[2] = 2;
                    MainActivity.autoHybridNodes[2] = 2;
                    view.findViewById(R.id.hybridNode2).setBackgroundColor(Color.parseColor("#4c00a3"));
                } else if (hybridNodes[2] == 2){
                    hybridNodes[2] = 0;
                    MainActivity.autoHybridNodes[2] = 0;
                    view.findViewById(R.id.hybridNode2).setBackgroundColor(Color.parseColor("#616161"));
                }
                break;
            case R.id.hybridNode3:
                if (hybridNodes[3] == 0) {
                    hybridNodes[3] = 1;
                    MainActivity.autoHybridNodes[3] = 1;
                    view.findViewById(R.id.hybridNode3).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (hybridNodes[3] == 1){
                    hybridNodes[3] = 2;
                    MainActivity.autoHybridNodes[3] = 2;
                    view.findViewById(R.id.hybridNode3).setBackgroundColor(Color.parseColor("#4c00a3"));
                } else if (hybridNodes[3] == 2){
                    hybridNodes[3] = 0;
                    MainActivity.autoHybridNodes[3] = 0;
                    view.findViewById(R.id.hybridNode3).setBackgroundColor(Color.parseColor("#616161"));
                }
                break;
            case R.id.hybridNode4:
                if (hybridNodes[4] == 0) {
                    hybridNodes[4] = 1;
                    MainActivity.autoHybridNodes[4] = 1;
                    view.findViewById(R.id.hybridNode4).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (hybridNodes[4] == 1){
                    hybridNodes[4] = 2;
                    MainActivity.autoHybridNodes[4] = 2;
                    view.findViewById(R.id.hybridNode4).setBackgroundColor(Color.parseColor("#4c00a3"));
                } else if (hybridNodes[4] == 2){
                    hybridNodes[4] = 0;
                    MainActivity.autoHybridNodes[4] = 0;
                    view.findViewById(R.id.hybridNode4).setBackgroundColor(Color.parseColor("#616161"));
                }
                break;
            case R.id.hybridNode5:
                if (hybridNodes[5] == 0) {
                    hybridNodes[5] = 1;
                    MainActivity.autoHybridNodes[5] = 1;
                    view.findViewById(R.id.hybridNode5).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (hybridNodes[5] == 1){
                    hybridNodes[5] = 2;
                    MainActivity.autoHybridNodes[5] = 2;
                    view.findViewById(R.id.hybridNode5).setBackgroundColor(Color.parseColor("#4c00a3"));
                } else if (hybridNodes[5] == 2){
                    hybridNodes[5] = 0;
                    MainActivity.autoHybridNodes[5] = 0;
                    view.findViewById(R.id.hybridNode5).setBackgroundColor(Color.parseColor("#616161"));
                }
                break;
            case R.id.hybridNode6:
                if (hybridNodes[6] == 0) {
                    hybridNodes[6] = 1;
                    MainActivity.autoHybridNodes[6] = 1;
                    view.findViewById(R.id.hybridNode6).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (hybridNodes[6] == 1){
                    hybridNodes[6] = 2;
                    MainActivity.autoHybridNodes[6] = 2;
                    view.findViewById(R.id.hybridNode6).setBackgroundColor(Color.parseColor("#4c00a3"));
                } else if (hybridNodes[6] == 2){
                    hybridNodes[6] = 0;
                    MainActivity.autoHybridNodes[6] = 0;
                    view.findViewById(R.id.hybridNode6).setBackgroundColor(Color.parseColor("#616161"));
                }
                break;
            case R.id.hybridNode7:
                if (hybridNodes[7] == 0) {
                    hybridNodes[7] = 1;
                    MainActivity.autoHybridNodes[7] = 1;
                    view.findViewById(R.id.hybridNode7).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (hybridNodes[7] == 1){
                    hybridNodes[7] = 2;
                    MainActivity.autoHybridNodes[7] = 2;
                    view.findViewById(R.id.hybridNode7).setBackgroundColor(Color.parseColor("#4c00a3"));
                } else if (hybridNodes[7] == 2){
                    hybridNodes[7] = 0;
                    MainActivity.autoHybridNodes[7] = 0;
                    view.findViewById(R.id.hybridNode7).setBackgroundColor(Color.parseColor("#616161"));
                }
                break;
            case R.id.hybridNode8:
                if (hybridNodes[8] == 0) {
                    hybridNodes[8] = 1;
                    MainActivity.autoHybridNodes[8] = 1;
                    view.findViewById(R.id.hybridNode8).setBackgroundColor(Color.parseColor("#cc9602"));
                } else if (hybridNodes[8] == 1){
                    hybridNodes[8] = 2;
                    MainActivity.autoHybridNodes[8] = 2;
                    view.findViewById(R.id.hybridNode8).setBackgroundColor(Color.parseColor("#4c00a3"));
                } else if (hybridNodes[8] == 2){
                    hybridNodes[8] = 0;
                    MainActivity.autoHybridNodes[8] = 0;
                    view.findViewById(R.id.hybridNode8).setBackgroundColor(Color.parseColor("#616161"));
                }
                break;
        }
    }

    public void onResume() {
        super.onResume();


    }
}