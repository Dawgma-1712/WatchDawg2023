package com.example.frcscoutingapp2022;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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



    //counter variables
    private int AutoUpperConeCounter = 0;
    private int AutoUpperCubeCounter = 0;

    private int AutoMiddleConeCounter = 0;
    private int AutoMiddleCubeCounter = 0;

    private int AutoHybridConeCounter = 0;
    private int AutoHybridCubeCounter = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_auto, container, false);



        //Define TextViews
        AutoUpperConeText = (TextView) view.findViewById(R.id.AutoUpperConeCounter);
        AutoUpperCubeText = (TextView) view.findViewById(R.id.AutoUpperCubeCounter);

        AutoMiddleConeText = (TextView) view.findViewById(R.id.AutoMiddleConeCounter);
        AutoMiddleCubeText = (TextView) view.findViewById(R.id.AutoMiddleCubeCounter);

        AutoHybridConeText = (TextView) view.findViewById(R.id.AutoHybridConeCounter);
        AutoHybridCubeText = (TextView) view.findViewById(R.id.AutoHybridCubeCounter);



        //Upper Row Buttons
        view.findViewById(R.id.AutoUpperConeIncrease).setOnClickListener(this);
        view.findViewById(R.id.AutoUpperConeDecrease).setOnClickListener(this);

        view.findViewById(R.id.AutoUpperCubeIncrease).setOnClickListener(this);
        view.findViewById(R.id.AutoUpperCubeDecrease).setOnClickListener(this);

        //Middle Row Buttons
        view.findViewById(R.id.AutoMiddleConeIncrease).setOnClickListener(this);
        view.findViewById(R.id.AutoMiddleConeDecrease).setOnClickListener(this);

        view.findViewById(R.id.AutoMiddleCubeIncrease).setOnClickListener(this);
        view.findViewById(R.id.AutoMiddleCubeDecrease).setOnClickListener(this);

        //Hybrid Row Buttons
        view.findViewById(R.id.AutoHybridConeIncrease).setOnClickListener(this);
        view.findViewById(R.id.AutoHybridConeDecrease).setOnClickListener(this);

        view.findViewById(R.id.AutoHybridCubeIncrease).setOnClickListener(this);
        view.findViewById(R.id.AutoHybridCubeDecrease).setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.AutoUpperConeIncrease:
                AutoUpperConeCounter++;
                AutoUpperConeText.setText(Integer.toString(AutoUpperConeCounter));
                //MainActivity.editMatchData(0, 0, MainActivity.getButtonData()[0][0] + 1);
                MainActivity.AutoUpperCone++;
                break;

            case R.id.AutoUpperConeDecrease:
                if(AutoUpperConeCounter > 0) {
                    AutoUpperConeCounter--;
                    AutoUpperConeText.setText(Integer.toString(AutoUpperConeCounter));
                    //MainActivity.editMatchData(0, 0, MainActivity.getButtonData()[0][0] - 1);
                    MainActivity.AutoUpperCone--;
                } break;

            case R.id.AutoUpperCubeIncrease:
                AutoUpperCubeCounter++;
                AutoUpperCubeText.setText(Integer.toString(AutoUpperCubeCounter));
                //MainActivity.editMatchData(0, 1, MainActivity.getButtonData()[0][1] + 1);\
                MainActivity.AutoUpperCube++;

                break;

            case R.id.AutoUpperCubeDecrease:
                if(AutoUpperCubeCounter > 0) {
                    AutoUpperCubeCounter--;
                    AutoUpperCubeText.setText(Integer.toString(AutoUpperCubeCounter));
                    //MainActivity.editMatchData(0, 1, MainActivity.getButtonData()[0][1] - 1);
                    MainActivity.AutoUpperCube--;
                } break;

            case R.id.AutoMiddleConeIncrease:
                AutoMiddleConeCounter++;
                AutoMiddleConeText.setText(Integer.toString(AutoMiddleConeCounter));
                //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] + 1);
                MainActivity.AutoMiddleCone++;

                break;

            case R.id.AutoMiddleConeDecrease:
                if(AutoMiddleConeCounter > 0) {
                    AutoMiddleConeCounter--;
                    AutoMiddleConeText.setText(Integer.toString(AutoMiddleConeCounter));
                    //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] - 1);
                    MainActivity.AutoMiddleCone--;
                } break;

            case R.id.AutoMiddleCubeIncrease:
                AutoMiddleCubeCounter++;
                AutoMiddleCubeText.setText(Integer.toString(AutoMiddleCubeCounter));
                //MainActivity.editMatchData(0, 3, MainActivity.getButtonData()[0][3] + 1);
                MainActivity.AutoMiddleCube++;
                break;

            case R.id.AutoMiddleCubeDecrease:
                if(AutoMiddleCubeCounter > 0) {
                    AutoMiddleCubeCounter--;
                    AutoMiddleCubeText.setText(Integer.toString(AutoMiddleCubeCounter));
                    //MainActivity.editMatchData(0, 3, MainActivity.getButtonData()[0][3] - 1);
                    MainActivity.AutoMiddleCube--;
                } break;
            case R.id.AutoHybridConeIncrease:
                AutoHybridConeCounter++;
                AutoHybridConeText.setText(Integer.toString(AutoHybridConeCounter));
                //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] + 1);
                MainActivity.AutoHybridCone++;

                break;

            case R.id.AutoHybridConeDecrease:
                if(AutoHybridConeCounter > 0) {
                    AutoHybridConeCounter--;
                    AutoHybridConeText.setText(Integer.toString(AutoHybridConeCounter));
                    //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] - 1);
                    MainActivity.AutoHybridCone--;
                } break;

            case R.id.AutoHybridCubeIncrease:
                AutoHybridCubeCounter++;
                AutoHybridCubeText.setText(Integer.toString(AutoHybridCubeCounter));
                //MainActivity.editMatchData(0, 3, MainActivity.getButtonData()[0][3] + 1);
                MainActivity.AutoHybridCube++;
                break;

            case R.id.AutoHybridCubeDecrease:
                if(AutoHybridCubeCounter > 0) {
                    AutoHybridCubeCounter--;
                    AutoHybridCubeText.setText(Integer.toString(AutoHybridCubeCounter));
                    //MainActivity.editMatchData(0, 3, MainActivity.getButtonData()[0][3] - 1);
                    MainActivity.AutoHybridCube--;
                } break;
        }
    }

    public void onResume() {
        super.onResume();

        AutoUpperConeText.setText(Integer.toString(AutoUpperConeCounter));
        AutoUpperCubeText.setText(Integer.toString(AutoUpperCubeCounter));

        AutoMiddleConeText.setText(Integer.toString(AutoMiddleConeCounter));
        AutoMiddleCubeText.setText(Integer.toString(AutoMiddleCubeCounter));

        AutoHybridConeText.setText(Integer.toString(AutoHybridConeCounter));
        AutoHybridCubeText.setText(Integer.toString(AutoHybridCubeCounter));

    }
}