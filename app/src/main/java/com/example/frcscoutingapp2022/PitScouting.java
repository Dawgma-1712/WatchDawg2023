package com.example.frcscoutingapp2022;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.util.Calendar;

public class PitScouting extends AppCompatActivity implements View.OnClickListener {
    private String data = "";
    private Bitmap bitmap;

    private static EditText TeamNumPit;
    private static EditText Weight;
    private static EditText DriveMotors;
    private static EditText numberOfMotors;
    private static EditText WheelType;
    private static EditText DriveType;
    private static EditText robotLength;
    private static EditText RobotWidth;
    private static EditText locationOfScoring;
    private static EditText notesOnCupOrCone;
    private static EditText abilityToDockAndEngage;
    private static EditText dockingAndEngagingFeatures;
    private static EditText intakeMethod;
    private static EditText autoRoutine;
    private static EditText notesOnRobot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pit_scouting);

        findViewById(R.id.pitScoutingSave).setOnClickListener(this);

        TeamNumPit = (EditText) findViewById(R.id.TeamNumPit);
        Weight = (EditText) findViewById(R.id.Weight);
        DriveMotors = (EditText) findViewById(R.id.DriveMotors);
        robotLength = (EditText) findViewById(R.id.robotLength);
        RobotWidth = (EditText) findViewById(R.id.RobotWidth);
        locationOfScoring = (EditText) findViewById(R.id.locationOfScoring);
        notesOnCupOrCone = (EditText) findViewById(R.id.notesOnCupOrCone);
        abilityToDockAndEngage = (EditText) findViewById(R.id.abilityToDockAndEngage);
        dockingAndEngagingFeatures = (EditText) findViewById(R.id.dockingAndEngagingFeatures);
        intakeMethod = (EditText) findViewById(R.id.intakeMethod);
        autoRoutine = (EditText) findViewById(R.id.autoRoutine);
        notesOnRobot = (EditText) findViewById(R.id.notesOnRobot);
        numberOfMotors = (EditText) findViewById(R.id.numberOfMotors);
        WheelType = (EditText) findViewById(R.id.WheelType);
        DriveType = (EditText) findViewById(R.id.DriveType);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.pitScoutingSave:


                data = TeamNumPit.getText().toString() + ","+Weight.getText().toString()+","+R.id.DriveMotors+","+R.id.numberOfMotors+","+R.id.WheelType+","+R.id.DriveType+","+R.id.robotLength+","+
                        R.id.RobotWidth+"'"+R.id.locationOfScoring+","+R.id.notesOnCupOrCone+","+R.id.abilityToDockAndEngage+","+R.id.dockingAndEngagingFeatures+","+
                        R.id.intakeMethod+","+R.id.autoRoutine+","+R.id.notesOnRobot;

                //Initialize multi format writer
                MultiFormatWriter writer = new MultiFormatWriter();
                try {
                    //Initialize bit matrix
                    BitMatrix matrix = writer.encode(data, BarcodeFormat.QR_CODE, 600, 600);
                    //Initialize barcode Encoder
                    BarcodeEncoder encoder = new BarcodeEncoder();
                    //initialize bitmap
                    bitmap = encoder.createBitmap(matrix);
                    //set bitmap on image view
                    //saveFragment.ivOutput.setImageBitmap(bitmap);
                    MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "QR Code during"+String.valueOf(Calendar.getInstance().getTime()), String.valueOf(R.id.teamNum));

                } catch(WriterException e){
                    e.printStackTrace();
                }

                break;

        }
    }
}