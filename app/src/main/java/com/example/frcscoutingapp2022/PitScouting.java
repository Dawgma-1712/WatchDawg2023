package com.example.frcscoutingapp2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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

    private static ImageView iv_output2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pit_scouting);



        findViewById(R.id.pitScoutingSave).setOnClickListener(this);
        findViewById(R.id.newActivityPitScouting).setOnClickListener(this);

        TeamNumPit = (EditText) findViewById(R.id.TeamNumPit);
        Weight = (EditText) findViewById(R.id.Weight);
        DriveMotors = (EditText) findViewById(R.id.DriveMotors);
        robotLength = (EditText) findViewById(R.id.robotLength);
        RobotWidth = (EditText) findViewById(R.id.RobotWidth);
        locationOfScoring = (EditText) findViewById(R.id.locationOfScoring);
        notesOnCupOrCone = (EditText) findViewById(R.id.notesOnCubeOrCone);
        abilityToDockAndEngage = (EditText) findViewById(R.id.abilityToDockAndEngage);
        dockingAndEngagingFeatures = (EditText) findViewById(R.id.dockingAndEngagingFeatures);
        intakeMethod = (EditText) findViewById(R.id.intakeMethod);
        autoRoutine = (EditText) findViewById(R.id.autoRoutine);
        notesOnRobot = (EditText) findViewById(R.id.notesOnRobot);
        numberOfMotors = (EditText) findViewById(R.id.numberOfMotors);
        WheelType = (EditText) findViewById(R.id.WheelType);
        DriveType = (EditText) findViewById(R.id.DriveType);

        iv_output2 = findViewById(R.id.iv_output2);



    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.pitScoutingSave:


                data = TeamNumPit.getText().toString() + ","+Weight.getText().toString()+","+DriveMotors.getText().toString()+","+numberOfMotors.getText().toString()+","+WheelType.getText().toString()+","+DriveType.getText().toString()+","+robotLength.getText().toString()+","+
                        RobotWidth.getText().toString()+"'"+locationOfScoring.getText().toString()+","+notesOnCupOrCone.getText().toString()+","+abilityToDockAndEngage.getText().toString()+","+dockingAndEngagingFeatures.getText().toString()+","+
                        intakeMethod.getText().toString()+","+autoRoutine.getText().toString()+","+notesOnRobot.getText().toString();

                //Initialize multi format writer
                MultiFormatWriter writer = new MultiFormatWriter();
                try {
                    BitMatrix matrix = writer.encode(data, BarcodeFormat.QR_CODE, 600, 600);
                    BarcodeEncoder encoder = new BarcodeEncoder();
                    bitmap = encoder.createBitmap(matrix);
                    iv_output2.setImageBitmap(bitmap);

                    if (Build.VERSION.SDK_INT >= 23) {
                        if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                            == PackageManager.PERMISSION_GRANTED){
                            saveImage(bitmap, TeamNumPit.getText().toString() + "pit_scouting.png");
                        }
                        else {
                            ActivityCompat.requestPermissions(PitScouting.this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                        }
                    }


                } catch(WriterException e){
                    e.printStackTrace();
                }

                break;
            case R.id.newActivityPitScouting:
                startActivity(new Intent(this, HomeScreen.class));
                break;

        }
    }

    private void saveImage(Bitmap bitmap, String name) {
        File mypath = new File("/storage/emulated/0/Download",name);

        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(mypath);
            bitmap.compress (Bitmap.CompressFormat.PNG, 100, fos);
            Toast.makeText(PitScouting.this, "QR Code saved", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(PitScouting.this, "Error saving QR Code to gallery", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
        finally {
            try{
                fos.flush();
                fos.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}