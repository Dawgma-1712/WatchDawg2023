package com.example.frcscoutingapp2022;

import android.graphics.Bitmap;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private save saveFragment;

    public static EditText teamNumText;
    public static EditText matchNumText;
    public static EditText scoutNameText;

    public static Bitmap bitmap;
    private static boolean qrReady = false;

    public static String teamNumber;
    public static String matchNumber;
    public static String scoutName;
    public static String additionalNotes;
    public static int[][] buttonData;
    public static int[] checkBoxData;
    public static String defendedOnByNumber = "";


    public static int mobility = 0;
    public static int alliance = 0;
    public static int playedDefense = 0;
    public static int defendedOn = 0;

    public static int AutoDocked = 0;
    public static int AutoEngaged = 0;
    public static int midFail = 0;
    public static int midSuccess = 0;
    public static int highFail = 0;
    public static int highSuccess = 0;
    public static int travFail = 0;
    public static int travSuccess = 0;
    public static int penalty = 0;
    public static int deadBot = 0;
    public static int noClimbAttempt = 0;

    public static int AutoUpperCone = 0;
    public static int AutoUpperCube = 0;
    public static int AutoMiddleCone = 0;
    public static int AutoMiddleCube = 0;
    public static int AutoHybridCone = 0;
    public static int AutoHybridCube = 0;

    public static int upperScoredTeleop = 0;
    public static int upperMissedTeleop = 0;
    public static int lowerScoredTeleop = 0;
    public static int lowerMissedTeleop = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);

        tabLayout.setupWithViewPager(viewPager);

        VPadapter vpAdapter = new VPadapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        vpAdapter.addFragment(new Auto(), "Auto");
        vpAdapter.addFragment(new Teleop(), "Teleop");
        vpAdapter.addFragment(new endgame(), "Endgame");
        vpAdapter.addFragment(new save(), "Save");
        viewPager.setAdapter(vpAdapter);

        teamNumText = (EditText) findViewById(R.id.teamNum);
        matchNumText = (EditText) findViewById(R.id.matchNum);
        scoutNameText = (EditText) findViewById(R.id.name);

        mobility = 0;
        playedDefense = 0;
        defendedOn = 0;


        AutoDocked = 0;
        AutoEngaged = 0;
        midFail = 0;
        midSuccess = 0;
        highFail = 0;
        highSuccess = 0;
        travFail = 0;
        travSuccess = 0;
        penalty = 0;
        deadBot = 0;
        noClimbAttempt = 0;

        AutoUpperCone = 0;
        AutoUpperCube = 0;
        AutoMiddleCone = 0;
        AutoMiddleCube = 0;
        AutoHybridCone = 0;
        AutoHybridCube = 0;

        upperScoredTeleop = 0;
        upperMissedTeleop = 0;
        lowerScoredTeleop = 0;
        lowerMissedTeleop = 0;


    }

    public static void editMatchData(int ind0, int ind1, int value) {
        buttonData[ind0][ind1] = value;
    }

    public void onCheckBoxClicked(View view) {
        // Is view checked
        boolean checked = ((CheckBox) view).isChecked();

        // Check which one clicked
        switch (view.getId()) {
            case R.id.playedDefenseCheckBox:
                //MainActivity.checkBoxData[2] = checked ? 1 : 0;
                MainActivity.playedDefense = checked ? 1 : 0;

                break;
            case R.id.defendedOnCheckBox:
                //MainActivity.checkBoxData[3] = checked ? 1 : 0;
                MainActivity.defendedOn = checked ? 1 : 0;

                break;

            case R.id.midHangFailure:
                //MainActivity.checkBoxData[10] = checked ? 1 : 0;
                MainActivity.midFail = checked ? 1 : 0;
                //((CheckBox)findViewById(R.id.midHangSuccess)).setSelected(false);
                //MainActivity.midSuccess = 0;

                break;
            case R.id.midHangSuccess:
                //MainActivity.checkBoxData[11] = checked ? 1 : 0;
                MainActivity.midSuccess = checked ? 1 : 0;

                //MainActivity.midFail = 0;

                break;
            case R.id.highHangFailure:
                //MainActivity.checkBoxData[12] = checked ? 1 : 0;
                MainActivity.highFail = checked ? 1 : 0;
                //view.findViewById(R.id.highHangSuccess).setSelected(false);
                //MainActivity.highSuccess = 0;

                break;
            case R.id.highHangSuccess:
                //MainActivity.checkBoxData[13] = checked ? 1 : 0;
                MainActivity.highSuccess = checked ? 1 : 0;
                //view.findViewById(R.id.highHangFailure).setSelected(false);
                //MainActivity.highFail = 0;

                break;
            case R.id.traversalHangFailure:
                //MainActivity.checkBoxData[14] = checked ? 1 : 0;
                MainActivity.travFail = checked ? 1 : 0;
                //view.findViewById(R.id.traversalHangSuccess).setSelected(false);
                ///MainActivity.travSuccess = 0;

                break;
            case R.id.traversalHangSuccess:
                //MainActivity.checkBoxData[15] = checked ? 1 : 0;
                MainActivity.travSuccess = checked ? 1 : 0;
                //view.findViewById(R.id.traversalHangFailure).setSelected(false);
                //MainActivity.travFail = 0;

                break;
            case R.id.MobilityCheckBox:
                //MainActivity.checkBoxData[16] = checked ? 1 : 0;
                MainActivity.mobility = checked ? 1 : 0;

                break;
            case R.id.penalized:
                //MainActivity.checkBoxData[17] = checked ? 1 : 0;
                MainActivity.penalty = checked ? 1 : 0;

                break;
            case R.id.deadBot:
                //MainActivity.checkBoxData[18] = checked ? 1 : 0;
                MainActivity.deadBot = checked ? 1 : 0;

                break;
            case R.id.noClimbAttempt:
                //MainActivity.checkBoxData[19] = checked ? 1 : 0;
                MainActivity.noClimbAttempt = checked ? 1 : 0;
        }


    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.blue:
                MainActivity.alliance = 1;
                System.out.println(MainActivity.alliance);
                break;

            case R.id.red:
                MainActivity.alliance = 0;
                System.out.println(MainActivity.alliance);
                break;


            case R.id.AutoDocked:
                MainActivity.AutoDocked = 1;
                MainActivity.AutoEngaged = 0;
                System.out.println(MainActivity.AutoDocked);
                System.out.println(MainActivity.AutoEngaged);
                break;
            case R.id.AutoEngaged:
                MainActivity.AutoEngaged = 1;
                MainActivity.AutoDocked = 0;
                System.out.println(MainActivity.AutoEngaged);
                System.out.println(MainActivity.AutoDocked);
        }

//
//    public void updateTeamAndMatchNum() {
//        teamNumber = Integer.parseInt(((EditText)findViewById(R.id.teamNum)).getText().toString());
//        matchNumber = Integer.parseInt(((EditText)findViewById(R.id.matchNum)).getText().toString());
//    }
    }
}
