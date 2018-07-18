package com.akj.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    // testButton1 의 클릭된 횟수를 저장하는 변수를 선언한다.
    int clickCount1 = 0;

    // testButton2 의 클릭된 횟수를 저장하는 변수를 선언한다.
    int clickCount2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // "프로그래밍을 시작해보자" 메세지를 잠시 보여준다.
        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_SHORT).show();

        // 레이아웃에 testButton1 ID 로 선언된 뷰에 클릭 이벤트 리스너를 등록한다.
        findViewById(R.id.testButton1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 클릭 카운트를 1회 증가시킨다.
                clickCount1 = clickCount1 + 1;

                //getMessage 함수에서 반환된 문자열을 잠시 보여준다.
                Toast.makeText(getApplicationContext(), getMessage(clickCount1), Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.testButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 클릭 카운트를 1회 증가시킨다.
                clickCount2 = clickCount2 + 1;

                //getMessage 함수에서 반환된 문자열을 잠시 보여준다.
                Toast.makeText(getApplicationContext(), getMessage(clickCount2), Toast.LENGTH_SHORT).show();
            }
        });
    }

    // 함수에 전달된 clickCount 를 기반으로 메세지에 해당하는 텍스트를 반환한다.
    String getMessage(int clickCount){
        if(clickCount % 2 == 0){
            return "클릭횟수:" + clickCount;
        }else if(clickCount % 3 == 0){
            return "Hello, Korea!";
        }else {
            return "Hello";
        }
    }
}
