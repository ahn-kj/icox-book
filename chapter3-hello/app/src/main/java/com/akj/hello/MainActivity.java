package com.akj.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    /**
     * MainActivity 가 최초 실행될 때 실행된다.
     * 자바독 주석을 확인하려면 F1 키를 누르자.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Activity 의 UI 를 R.layout.activity_main 으로 한다.
        setContentView(R.layout.activity_main);

        // "프로그래밍을 시작해보자!" 메세지를 잠시 보여준다.
        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        /**
         여러 라인의 주석을 사용하는
         주석 2 번째줄
         주석 3 번째줄
         */
    }
}
