package com.example.frcscoutingapp2022;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Teleop extends Fragment implements View.OnClickListener{

    //initialize variables



    //Initialize upper node text views
    private TextView TeleopUpperConeText;
    private TextView TeleopUpperCubeText;

    //initialize middle node text views
    private TextView TeleopMiddleCubeText;
    private TextView TeleopMiddleConeText;

    //initializer hybrid node text views
    private TextView TeleopHybridConeText;
    private TextView TeleopHybridCubeText;

    //counter variables
    private int TeleopUpperConeCounter = 0;
    private int TeleopUpperCubeCounter = 0;
    private int TeleopMiddleConeCounter = 0;
    private int TeleopMiddleCubeCounter = 0;
    private int TeleopHybridConeCounter = 0;
    private int TeleopHybridCubeCounter = 0;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_teleop, container, false);


        //Define TextViews
        TeleopUpperConeText = (TextView) view.findViewById(R.id.TeleopUpperConeCounter);
        TeleopUpperCubeText = (TextView) view.findViewById(R.id.TeleopUpperCubeCounter);

        TeleopMiddleConeText = (TextView) view.findViewById(R.id.TeleopMiddleConeCounter);
        TeleopMiddleCubeText = (TextView) view.findViewById(R.id.TeleopMiddleCubeCounter);

        TeleopHybridConeText = (TextView) view.findViewById(R.id.TeleopHybridConeCounter);
        TeleopHybridCubeText = (TextView) view.findViewById(R.id.TeleopHybridCubeCounter);





        //Upper buttons
        view.findViewById(R.id.TeleopUpperConeIncrease).setOnClickListener(this);
        view.findViewById(R.id.TeleopUpperConeDecrease).setOnClickListener(this);

        view.findViewById(R.id.TeleopUpperCubeIncrease).setOnClickListener(this);
        view.findViewById(R.id.TeleopUpperCubeDecrease).setOnClickListener(this);

        //Middle buttons
        view.findViewById(R.id.TeleopMiddleConeIncrease).setOnClickListener(this);
        view.findViewById(R.id.TeleopMiddleConeDecrease).setOnClickListener(this);

        view.findViewById(R.id.TeleopMiddleCubeIncrease).setOnClickListener(this);
        view.findViewById(R.id.TeleopMiddleCubeDecrease).setOnClickListener(this);

        //Hybrid Buttons
        view.findViewById(R.id.TeleopHybridConeIncrease).setOnClickListener(this);
        view.findViewById(R.id.TeleopHybridConeDecrease).setOnClickListener(this);

        view.findViewById(R.id.TeleopHybridCubeIncrease).setOnClickListener(this);
        view.findViewById(R.id.TeleopHybridCubeDecrease).setOnClickListener(this);

        return view;
    }



    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.TeleopUpperConeIncrease:
                System.out.println(MainActivity.checkBoxData);
                TeleopUpperConeCounter++;
                TeleopUpperConeText.setText(Integer.toString(TeleopUpperConeCounter));
                //MainActivity.editMatchData(1, 0, MainActivity.getButtonData()[0][0] + 1);
                MainActivity.TeleopUpperCone++;
                break;

            case R.id.TeleopUpperConeDecrease:
                if(TeleopUpperConeCounter > 0) {
                    TeleopUpperConeCounter--;
                    TeleopUpperConeText.setText(Integer.toString(TeleopUpperConeCounter));
                    //MainActivity.editMatchData(1, 0, MainActivity.getButtonData()[0][0] - 1);
                    MainActivity.TeleopUpperCone--;
                } break;

            case R.id.TeleopUpperCubeIncrease:
                TeleopUpperCubeCounter++;
                TeleopUpperCubeText.setText(Integer.toString(TeleopUpperCubeCounter));
                //MainActivity.editMatchData(1, 1, MainActivity.getButtonData()[0][1] + 1);
                MainActivity.TeleopUpperCube++;
                break;

            case R.id.TeleopUpperCubeDecrease:
                if(TeleopUpperCubeCounter > 0) {
                    TeleopUpperCubeCounter--;
                    TeleopUpperCubeText.setText(Integer.toString(TeleopUpperCubeCounter));
                    //MainActivity.editMatchData(1, 1, MainActivity.getButtonData()[0][1] - 1);
                    MainActivity.TeleopUpperCube--;
                } break;

            case R.id.TeleopMiddleConeIncrease:
                TeleopMiddleConeCounter++;
                TeleopMiddleConeText.setText(Integer.toString(TeleopMiddleConeCounter));
                //MainActivity.editMatchData(1, 2, MainActivity.getButtonData()[0][2] + 1);
                MainActivity.TeleopMiddleCone++;
                System.out.println(MainActivity.TeleopMiddleCone);
                break;

            case R.id.TeleopMiddleConeDecrease:
                if(TeleopMiddleConeCounter > 0) {
                    TeleopMiddleConeCounter--;
                    TeleopMiddleConeText.setText(Integer.toString(TeleopMiddleConeCounter));
                    //MainActivity.editMatchData(1, 2, MainActivity.getButtonData()[0][2] - 1);
                    MainActivity.TeleopMiddleCone--;
                    System.out.println(MainActivity.TeleopMiddleCone);

                } break;

            case R.id.TeleopMiddleCubeIncrease:
                TeleopMiddleCubeCounter++;
                TeleopMiddleCubeText.setText(Integer.toString(TeleopMiddleCubeCounter));
                //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] + 1);
                MainActivity.TeleopMiddleCube++;
                break;

            case R.id.TeleopMiddleCubeDecrease:
                if(TeleopMiddleCubeCounter > 0) {
                    TeleopMiddleCubeCounter--;
                    TeleopMiddleCubeText.setText(Integer.toString(TeleopMiddleCubeCounter));
                    //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] - 1);
                    MainActivity.TeleopMiddleCube--;
                } break;

            case R.id.TeleopHybridConeIncrease:
                System.out.print("HIt");
                TeleopHybridConeCounter++;
                TeleopHybridConeText.setText(Integer.toString(TeleopHybridConeCounter));
                //MainActivity.editMatchData(1, 2, MainActivity.getButtonData()[0][2] + 1);
                MainActivity.TeleopHybridCone++;
                System.out.println(MainActivity.TeleopHybridCone);
                break;

            case R.id.TeleopHybridConeDecrease:
                if(TeleopHybridConeCounter > 0) {
                    TeleopHybridConeCounter--;
                    TeleopHybridConeText.setText(Integer.toString(TeleopHybridConeCounter));
                    //MainActivity.editMatchData(1, 2, MainActivity.getButtonData()[0][2] - 1);
                    MainActivity.TeleopHybridCone--;
                    System.out.println(MainActivity.TeleopHybridCone);

                } break;

            case R.id.TeleopHybridCubeIncrease:
                TeleopHybridCubeCounter++;
                TeleopHybridCubeText.setText(Integer.toString(TeleopHybridCubeCounter));
                //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] + 1);
                MainActivity.TeleopHybridCube++;
                break;

            case R.id.TeleopHybridCubeDecrease:
                if(TeleopHybridCubeCounter > 0) {
                    TeleopHybridCubeCounter--;
                    TeleopHybridCubeText.setText(Integer.toString(TeleopHybridCubeCounter));
                    //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] - 1);
                    MainActivity.TeleopHybridCube--;
                } break;
        }
    }

    public void onResume(){
        super.onResume();

        TeleopUpperConeText.setText(Integer.toString(TeleopUpperConeCounter));
        TeleopUpperCubeText.setText(Integer.toString(TeleopUpperCubeCounter));
        TeleopMiddleConeText.setText(Integer.toString(TeleopMiddleConeCounter));
        TeleopMiddleCubeText.setText(Integer.toString(TeleopMiddleCubeCounter));
        TeleopHybridConeText.setText(Integer.toString(TeleopHybridConeCounter));
        TeleopHybridCubeText.setText(Integer.toString(TeleopHybridCubeCounter));
    }

    public void clear(){
        TeleopUpperConeText.setText(Integer.toString(0));
        TeleopUpperCubeText.setText(Integer.toString(0));
        TeleopMiddleConeText.setText(Integer.toString(0));
        TeleopMiddleCubeText.setText(Integer.toString(0));
        TeleopHybridConeText.setText(Integer.toString(0));
        TeleopHybridCubeText.setText(Integer.toString(0));

        TeleopUpperConeCounter = 0;
        TeleopUpperCubeCounter = 0;

        TeleopMiddleConeCounter = 0;
        TeleopMiddleCubeCounter = 0;

        TeleopHybridConeCounter = 0;
        TeleopHybridCubeCounter = 0;

    }





}
