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
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private save saveFragment;

    public static EditText teamNumText;
    public static EditText matchNumText;
    public static EditText scoutNameText;

    public static EditText eventKeyText;

    public static Bitmap bitmap;
    private static boolean qrReady = false;

    public static String teamNumber;
    public static String matchNumber;
    public static String scoutName;
    public static String eventKey;
    public static int[][] buttonData;
    public static int[] checkBoxData;
    public static String defendedOnByNumber = "";


    public static int mobility = 0;
    public static String alliance = "";
    public static int playedDefense = 0;
    public static int effectiveDefense = 0;
    public static int preventsScoring = 0;
    public static int defendsOften = 0;

    public static int AutoDocked = 0;
    public static int AutoEngaged = 0;
    public static int Parking = 0;

    public static int NotInCommunity = 0;
    public static int TeleopDocked = 0;
    public static int TeleopEngaged = 0;

    public static int groundPickup = 0;
    public static int playerStation = 0;

    public static int[] autoUpperNodes = {0,0,0,0,0,0,0,0,0};
    public static int[] autoMiddleNodes = {0,0,0,0,0,0,0,0,0};
    public static int[] autoHybridNodes = {0,0,0,0,0,0,0,0,0};

    public static int[] teleopUpperNodes = {0,0,0,0,0,0,0,0,0};
    public static int[] teleopMiddleNodes = {0,0,0,0,0,0,0,0,0};
    public static int[] teleopHybridNodes = {0,0,0,0,0,0,0,0,0};
    


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
        effectiveDefense = 0;
        preventsScoring = 0;
        defendsOften = 0;

        groundPickup = 0;
        playerStation = 0;

        AutoDocked = 0;
        AutoEngaged = 0;
        Parking = 0;
        NotInCommunity = 0;
        TeleopDocked = 0;
        TeleopEngaged = 0;

        
    }

    public static void editMatchData(int ind0, int ind1, int value) {
        buttonData[ind0][ind1] = value;
    }

    public void onCheckBoxClicked(View view) {
        // Is view checked
        boolean checked = ((CheckBox) view).isChecked();

        // Check which one clicked
        switch (view.getId()) {
            case R.id.MobilityCheckBox:
                //MainActivity.checkBoxData[16] = checked ? 1 : 0;
                MainActivity.mobility = checked ? 1 : 0;
                break;
            case R.id.defenseCheckBox:
                MainActivity.playedDefense = checked ? 1 : 0;
                break;
            case R.id.effectiveDefenseCheckBox:
                MainActivity.effectiveDefense = checked ? 1 : 0;
                break;
            case R.id.preventsScoringCheckBox:
                MainActivity.preventsScoring = checked ? 1 : 0;
                break;
            case R.id.defendsOftenCheckBox2:
                MainActivity.defendsOften = checked ? 1 : 0;
                break;
            case R.id.pickupCheckBox:
                MainActivity.groundPickup = checked ? 1 : 0;
                break;
            case R.id.playerStationCheckBox:
                MainActivity.playerStation = checked ? 1 : 0;
                break;

        }


    }

    public void onRadioButtonClicked(View view) {
        RadioGroup EndgameRadioGroup = (RadioGroup)findViewById(R.id.EndgameRadioGroup);
        RadioGroup AutoRadioGroup = (RadioGroup)findViewById(R.id.AutoRadioGroup);

        switch (view.getId()) {


            case R.id.AutoDocked:
                if(MainActivity.AutoDocked==1) {
                    AutoRadioGroup.clearCheck();
                    MainActivity.AutoDocked=0;
                }
                else {MainActivity.AutoDocked = 1;
                MainActivity.AutoEngaged = 0;
                System.out.println(MainActivity.AutoDocked);
                System.out.println(MainActivity.AutoEngaged);}
                break;
            case R.id.AutoEngaged:
                if(MainActivity.AutoEngaged==1){
                    AutoRadioGroup.clearCheck();
                    MainActivity.AutoEngaged=0;}
                else {MainActivity.AutoEngaged = 1;
                MainActivity.AutoDocked = 0;
                System.out.println(MainActivity.AutoEngaged);
                System.out.println(MainActivity.AutoDocked);}
                break;
            case R.id.TeleopEngaged:

                if(MainActivity.TeleopEngaged==1){
                    EndgameRadioGroup.clearCheck();
                    MainActivity.TeleopEngaged=0;
                }
                else{MainActivity.TeleopEngaged =1;
                MainActivity.TeleopDocked =0;
                MainActivity.Parking =0;
                MainActivity.NotInCommunity = 0;
                System.out.println(MainActivity.TeleopEngaged);
                System.out.println(MainActivity.TeleopDocked);
                System.out.println(MainActivity.Parking);}
                break;
            case R.id.TeleopDocked:
                if(MainActivity.TeleopDocked==1){
                    EndgameRadioGroup.clearCheck();
                    MainActivity.TeleopDocked=0;
                }
                else{MainActivity.TeleopEngaged =0;
                MainActivity.TeleopDocked =1;
                MainActivity.Parking =0;
                MainActivity.NotInCommunity = 0;
                System.out.println(MainActivity.TeleopEngaged);
                System.out.println(MainActivity.TeleopDocked);
                System.out.println(MainActivity.Parking);}
                break;
            case R.id.Parking:
                if(MainActivity.Parking==1){
                    EndgameRadioGroup.clearCheck();
                    MainActivity.Parking=0;
                }
                else{MainActivity.TeleopEngaged =0;
                MainActivity.TeleopDocked =0;
                MainActivity.NotInCommunity = 0;
                MainActivity.Parking =1;
                System.out.println(MainActivity.TeleopEngaged);
                System.out.println(MainActivity.TeleopDocked);
                System.out.println(MainActivity.Parking);}
                break;
            case R.id.NotInCommunity:
                if(MainActivity.NotInCommunity==1){
                    EndgameRadioGroup.clearCheck();
                    MainActivity.NotInCommunity=0;
                }
                else{MainActivity.TeleopEngaged =0;
                    MainActivity.TeleopDocked =0;
                    MainActivity.Parking = 0;
                    MainActivity.NotInCommunity = 1;
                    System.out.println(MainActivity.TeleopEngaged);
                    System.out.println(MainActivity.TeleopDocked);
                    System.out.println(MainActivity.Parking);}
                break;

        }

        boolean checked = ((RadioButton) view).isChecked();

//
//    public void updateTeamAndMatchNum() {
//        teamNumber = Integer.parseInt(((EditText)findViewById(R.id.teamNum)).getText().toString());
//        matchNumber = Integer.parseInt(((EditText)findViewById(R.id.matchNum)).getText().toString());
//    }
    }
}
