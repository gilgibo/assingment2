package com.example.gibo.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main_activity extends AppCompatActivity implements View.OnClickListener {


    private EditText et1,et2,et3;
    private Button b1,b2;
    private TextView t1,t2;
    private ImageView im1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);


        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener(this);

    }


    public void onClick(View v){

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);

        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);
        im1 = (ImageView)findViewById(R.id.im1);



        switch (v.getId()){
            case R.id.b1 :

                String score_1 = et1.getText().toString();
                String score_2 = et2.getText().toString();
                String score_3 = et3.getText().toString();

                int total_score = Integer.parseInt(score_1) + Integer.parseInt(score_2) + Integer.parseInt(score_3);
                int averge_score = total_score/3;

                t1.setText(Integer.toString(total_score));
                t2.setText(Integer.toString(averge_score));

                if(averge_score <= 100 && 90 < averge_score){
                    im1.setBackgroundResource(R.drawable.a);
                }

                else if(averge_score <= 90 && 80 < averge_score){
                    im1.setBackgroundResource(R.drawable.b);

                }

                else if(averge_score <= 80 && 70 < averge_score){

                    im1.setBackgroundResource(R.drawable.c);
                }

                else if(averge_score <= 60 && 70 < averge_score){

                    im1.setBackgroundResource(R.drawable.d);
                }

                else if(averge_score <= 60 && 0 <= averge_score){

                    im1.setBackgroundResource(R.drawable.f);

                }

                break;
            case R.id.b2 :

                et1.setHint("점수 입력");
                et2.setHint("점수 입력");
                et3.setHint("점수 입력");

                t1.setText("0점");
                t2.setText("0점");

                im1.setBackgroundResource(0);


                Toast.makeText(getApplicationContext(), "초기화 되었습니다.", Toast.LENGTH_SHORT).show();


                break;

        }

    }

}
