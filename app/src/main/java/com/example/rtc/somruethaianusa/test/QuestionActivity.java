package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;




public class QuestionActivity extends AppCompatActivity {

    //Explicit
    private TextView txtQuestion;
    private ImageView imvIshihara;
    private RadioGroup ragChoice;
    private RadioButton radChoice1, radChoice2, radChoice3, radChoice4;
    private Button btnAnswer;
    private int intRadio, intIndex, intScore, intUserChoose[], intAnswerTrue[];
    private MyModel objMyModel;
    private String strChoice[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        //Bind Widget
        bindWidget();

        //button Controller
        buttonController();

        //radioButton Controller
        radioButtonController();

        //About MyModel
        aboutMyModel();

        //setUp Array
        setUpArray();

    }   // onCreate

    private void setUpArray() {

        intUserChoose = new int[10];
        intAnswerTrue = new int[10];

        intAnswerTrue[0] = 1;
        intAnswerTrue[1] = 2;
        intAnswerTrue[2] = 3;
        intAnswerTrue[3] = 1;
        intAnswerTrue[4] = 2;
        intAnswerTrue[5] = 3;
        intAnswerTrue[6] = 1;
        intAnswerTrue[7] = 2;
        intAnswerTrue[8] = 4;
        intAnswerTrue[9] = 4;

    }   // setUpArray

    private void aboutMyModel() {

        objMyModel = new MyModel();

        objMyModel.setOnMyModelChangeListener(new MyModel.OnMyModelChangeListener() {
            @Override
            public void onMyModelChangeListener(MyModel myModel) {

                switch (myModel.getIntButton()) {

                    case 2:
                        imvIshihara.setImageResource(R.drawable.t10);
                        strChoice = getResources().getStringArray(R.array.time2);
                        setUpChoice();
                        break;
                    case 3:
                        imvIshihara.setImageResource(R.drawable.t11);
                        strChoice = getResources().getStringArray(R.array.time3);
                        setUpChoice();
                        break;
                    case 4:
                        imvIshihara.setImageResource(R.drawable.t12);
                        strChoice = getResources().getStringArray(R.array.time4);
                        setUpChoice();
                        break;
                    case 5:
                        imvIshihara.setImageResource(R.drawable.t15);
                        strChoice = getResources().getStringArray(R.array.time5);
                        setUpChoice();
                        break;
                    case 6:
                        imvIshihara.setImageResource(R.drawable.r3);
                        strChoice = getResources().getStringArray(R.array.time6);
                        setUpChoice();
                        break;
                    case 7:
                        imvIshihara.setImageResource(R.drawable.r6);
                        strChoice = getResources().getStringArray(R.array.time7);
                        setUpChoice();
                        break;
                    case 8:
                        imvIshihara.setImageResource(R.drawable.r7);
                        strChoice = getResources().getStringArray(R.array.time8);
                        setUpChoice();
                        break;
                    case 9:
                        imvIshihara.setImageResource(R.drawable.r9);
                        strChoice = getResources().getStringArray(R.array.time9);
                        setUpChoice();
                        break;
                    case 10:
                        imvIshihara.setImageResource(R.drawable.r10);
                        strChoice = getResources().getStringArray(R.array.time10);
                        setUpChoice();
                        break;

                }   // switch

            }   //event
        });


    }   // aboutMyModel

    private void setUpChoice() {

        radChoice1.setText(strChoice[0]);
        radChoice2.setText(strChoice[1]);
        radChoice3.setText(strChoice[2]);
        radChoice4.setText(strChoice[3]);

    }   // setUpChoice

    private void radioButtonController() {

        ragChoice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                //SetUp intRadio
                switch (checkedId) {

                    case R.id.radioButton:
                        intRadio = 1;
                        break;
                    case R.id.radioButton2:
                        intRadio = 2;
                        break;
                    case R.id.radioButton3:
                        intRadio = 3;
                        break;
                    case R.id.radioButton4:
                        intRadio = 4;
                        break;
                    default:
                        intRadio = 0;
                        break;

                }   // switch


            }   // event
        });

    }   // radioButtonController

    private void buttonController() {

        btnAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Check Zero
                checkZero();


            }   //event
        });

    }   // buttonController

    private void checkZero() {

        if (intRadio == 0) {

            MyAlertDialog objMyAlert = new MyAlertDialog();
            objMyAlert.answer(QuestionActivity.this, "กรุณาตอบคำถาม");

        } else {

            checkScore();

            checkTime();

            ragChoice.clearCheck();

        }

    }   //checkZero

    private void checkScore() {

        intUserChoose[intIndex] = intRadio;

        if (intUserChoose[intIndex] == intAnswerTrue[intIndex] ) {
            intScore += 1;
        }

    }   //checkScore

    private void checkTime() {

        if (intIndex == 9) {

            Intent objIntent = new Intent(QuestionActivity.this, ShowScoreActivity.class);

            objIntent.putExtra("Score", intScore);

            startActivity(objIntent);
            finish();

        } else {

            //Show Controller Call View
            txtQuestion.setText(Integer.toString(intIndex + 2) + ". ในภาพคือสัตว์อะไร?");

            intIndex += 1;

            //Sent Value to MyModel
            objMyModel.setIntButton(intIndex + 1);

        }

    }   // checkTime


    private void bindWidget() {

        txtQuestion = (TextView) findViewById(R.id.textView2);
        imvIshihara = (ImageView) findViewById(R.id.imageView);
        ragChoice = (RadioGroup) findViewById(R.id.ragChoice);
        radChoice1 = (RadioButton) findViewById(R.id.radioButton);
        radChoice2 = (RadioButton) findViewById(R.id.radioButton2);
        radChoice3 = (RadioButton) findViewById(R.id.radioButton3);
        radChoice4 = (RadioButton) findViewById(R.id.radioButton4);
        btnAnswer = (Button) findViewById(R.id.button);

    }   // bindWidget



}   // Main Class
