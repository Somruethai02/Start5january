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

        intUserChoose = new int[60];
        intAnswerTrue = new int[60];

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
        intAnswerTrue[11] = 1;
        intAnswerTrue[12] = 2;
        intAnswerTrue[13] = 3;
        intAnswerTrue[14] = 1;
        intAnswerTrue[15] = 2;
        intAnswerTrue[16] = 3;
        intAnswerTrue[17] = 1;
        intAnswerTrue[18] = 2;
        intAnswerTrue[19] = 3;
        intAnswerTrue[20] = 1;
        intAnswerTrue[21] = 1;
        intAnswerTrue[22] = 2;
        intAnswerTrue[23] = 3;
        intAnswerTrue[24] = 4;
        intAnswerTrue[25] = 1;
        intAnswerTrue[26] = 2;
        intAnswerTrue[27] = 3;
        intAnswerTrue[28] = 4;
        intAnswerTrue[29] = 1;
        intAnswerTrue[30] = 2;
        intAnswerTrue[31] = 1;
        intAnswerTrue[32] = 2;
        intAnswerTrue[33] = 3;
        intAnswerTrue[34] = 4;
        intAnswerTrue[35] = 1;
        intAnswerTrue[36] = 2;
        intAnswerTrue[37] = 3;
        intAnswerTrue[38] = 4;
        intAnswerTrue[39] = 1;
        intAnswerTrue[40] = 2;
        intAnswerTrue[41] = 1;
        intAnswerTrue[42] = 2;
        intAnswerTrue[43] = 3;
        intAnswerTrue[44] = 4;
        intAnswerTrue[45] = 1;
        intAnswerTrue[46] = 2;
        intAnswerTrue[47] = 3;
        intAnswerTrue[48] = 4;
        intAnswerTrue[49] = 1;
        intAnswerTrue[50] = 2;




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
                    case 11:
                        imvIshihara.setImageResource(R.drawable.p1);
                        strChoice = getResources().getStringArray(R.array.time11);
                        setUpChoice();
                        break;
                    case 12:
                        imvIshihara.setImageResource(R.drawable.p2);
                        strChoice = getResources().getStringArray(R.array.time12);
                        setUpChoice();
                        break;
                    case 13:
                        imvIshihara.setImageResource(R.drawable.p3);
                        strChoice = getResources().getStringArray(R.array.time13);
                        setUpChoice();
                        break;
                    case 14:
                        imvIshihara.setImageResource(R.drawable.p4);
                        strChoice = getResources().getStringArray(R.array.time14);
                        setUpChoice();
                        break;
                    case 15:
                        imvIshihara.setImageResource(R.drawable.p5);
                        strChoice = getResources().getStringArray(R.array.time15);
                        setUpChoice();
                        break;
                    case 16:
                        imvIshihara.setImageResource(R.drawable.p6);
                        strChoice = getResources().getStringArray(R.array.time16);
                        setUpChoice();
                        break;
                    case 17:
                        imvIshihara.setImageResource(R.drawable.p7);
                        strChoice = getResources().getStringArray(R.array.time17);
                        setUpChoice();
                        break;
                    case 18:
                        imvIshihara.setImageResource(R.drawable.p8);
                        strChoice = getResources().getStringArray(R.array.time18);
                        setUpChoice();
                        break;
                    case 19:
                        imvIshihara.setImageResource(R.drawable.p9);
                        strChoice = getResources().getStringArray(R.array.time19);
                        setUpChoice();
                        break;
                    case 20:
                        imvIshihara.setImageResource(R.drawable.p10);
                        strChoice = getResources().getStringArray(R.array.time20);
                        setUpChoice();
                        break;
                    case 21:
                        imvIshihara.setImageResource(R.drawable.p11);
                        strChoice = getResources().getStringArray(R.array.time21);
                        setUpChoice();
                        break;
                    case 22:
                        imvIshihara.setImageResource(R.drawable.p12);
                        strChoice = getResources().getStringArray(R.array.time22);
                        setUpChoice();
                        break;
                    case 23:
                        imvIshihara.setImageResource(R.drawable.p13);
                        strChoice = getResources().getStringArray(R.array.time23);
                        setUpChoice();
                        break;
                    case 24:
                        imvIshihara.setImageResource(R.drawable.p14);
                        strChoice = getResources().getStringArray(R.array.time24);
                        setUpChoice();
                        break;
                    case 25:
                        imvIshihara.setImageResource(R.drawable.p15);
                        strChoice = getResources().getStringArray(R.array.time25);
                        setUpChoice();
                        break;
                    case 26:
                        imvIshihara.setImageResource(R.drawable.p16);
                        strChoice = getResources().getStringArray(R.array.time26);
                        setUpChoice();
                        break;
                    case 27:
                        imvIshihara.setImageResource(R.drawable.p17);
                        strChoice = getResources().getStringArray(R.array.time27);
                        setUpChoice();
                        break;
                    case 28:
                        imvIshihara.setImageResource(R.drawable.p18);
                        strChoice = getResources().getStringArray(R.array.time28);
                        setUpChoice();
                        break;
                    case 29:
                        imvIshihara.setImageResource(R.drawable.p19);
                        strChoice = getResources().getStringArray(R.array.time29);
                        setUpChoice();
                        break;
                    case 30:
                        imvIshihara.setImageResource(R.drawable.p20);
                        strChoice = getResources().getStringArray(R.array.time30);
                        setUpChoice();
                        break;
                    case 31:
                        imvIshihara.setImageResource(R.drawable.p21);
                        strChoice = getResources().getStringArray(R.array.time31);
                        setUpChoice();
                        break;
                    case 32:
                        imvIshihara.setImageResource(R.drawable.p22);
                        strChoice = getResources().getStringArray(R.array.time32);
                        setUpChoice();
                        break;
                    case 33:
                        imvIshihara.setImageResource(R.drawable.p23);
                        strChoice = getResources().getStringArray(R.array.time33);
                        setUpChoice();
                        break;
                    case 34:
                        imvIshihara.setImageResource(R.drawable.p24);
                        strChoice = getResources().getStringArray(R.array.time34);
                        setUpChoice();
                        break;
                    case 35:
                        imvIshihara.setImageResource(R.drawable.p25);
                        strChoice = getResources().getStringArray(R.array.time35);
                        setUpChoice();
                        break;
                    case 36:
                        imvIshihara.setImageResource(R.drawable.p26);
                        strChoice = getResources().getStringArray(R.array.time36);
                        setUpChoice();
                        break;
                    case 37:
                        imvIshihara.setImageResource(R.drawable.p27);
                        strChoice = getResources().getStringArray(R.array.time37);
                        setUpChoice();
                        break;
                    case 38:
                        imvIshihara.setImageResource(R.drawable.p28);
                        strChoice = getResources().getStringArray(R.array.time38);
                        setUpChoice();
                        break;
                    case 39:
                        imvIshihara.setImageResource(R.drawable.p29);
                        strChoice = getResources().getStringArray(R.array.time39);
                        setUpChoice();
                        break;
                    case 40:
                        imvIshihara.setImageResource(R.drawable.p30);
                        strChoice = getResources().getStringArray(R.array.time40);
                        setUpChoice();
                        break;
                    case 41:
                        imvIshihara.setImageResource(R.drawable.p31);
                        strChoice = getResources().getStringArray(R.array.time41);
                        setUpChoice();
                        break;
                    case 42:
                        imvIshihara.setImageResource(R.drawable.p32);
                        strChoice = getResources().getStringArray(R.array.time42);
                        setUpChoice();
                        break;
                    case 43:
                        imvIshihara.setImageResource(R.drawable.p33);
                        strChoice = getResources().getStringArray(R.array.time43);
                        setUpChoice();
                        break;
                    case 44:
                        imvIshihara.setImageResource(R.drawable.p34);
                        strChoice = getResources().getStringArray(R.array.time44);
                        setUpChoice();
                        break;
                    case 45:
                        imvIshihara.setImageResource(R.drawable.p35);
                        strChoice = getResources().getStringArray(R.array.time45);
                        setUpChoice();
                        break;
                    case 46:
                        imvIshihara.setImageResource(R.drawable.p36);
                        strChoice = getResources().getStringArray(R.array.time46);
                        setUpChoice();
                        break;
                    case 47:
                        imvIshihara.setImageResource(R.drawable.p37);
                        strChoice = getResources().getStringArray(R.array.time47);
                        setUpChoice();
                        break;
                    case 48:
                        imvIshihara.setImageResource(R.drawable.p38);
                        strChoice = getResources().getStringArray(R.array.time48);
                        setUpChoice();
                        break;
                    case 49:
                        imvIshihara.setImageResource(R.drawable.p39);
                        strChoice = getResources().getStringArray(R.array.time49);
                        setUpChoice();
                        break;
                    case 50:
                        imvIshihara.setImageResource(R.drawable.p40);
                        strChoice = getResources().getStringArray(R.array.time50);
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

        if (intIndex == 49) {

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

        txtQuestion = (TextView) findViewById(R.id.textView24);
        imvIshihara = (ImageView) findViewById(R.id.imageView);
        ragChoice = (RadioGroup) findViewById(R.id.ragChoice);
        radChoice1 = (RadioButton) findViewById(R.id.radioButton);
        radChoice2 = (RadioButton) findViewById(R.id.radioButton2);
        radChoice3 = (RadioButton) findViewById(R.id.radioButton3);
        radChoice4 = (RadioButton) findViewById(R.id.radioButton4);
        btnAnswer = (Button) findViewById(R.id.button);

    }   // bindWidget



}   // Main Class
