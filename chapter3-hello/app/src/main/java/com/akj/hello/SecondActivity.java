package com.akj.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    // 가속도가 3, 최고속도가 100, 브레이크 속도 4 인 차를 만든다.
    Car car1 = new Car(3, 100, 4);

    // 가속도가 10, 최고속도가 50, 브레이크 속도가 8인 차를 만든다.
    SportsCar car2 = new SportsCar(10, 50, 8);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // "프로그래밍을 시작해보자" 메세지를 잠시 보여준다.
        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        // 레이아웃에 testButton1 ID 로 선언된 뷰에 클릭 이벤트 리스너를 등록한다.
        findViewById(R.id.testButton1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                car1.accelerationPedal();;
                car2.accelerationPedal();
                String info = "car1: " + car1.getCurrentSppedText() + ", car2: " + car2.getCurrentSppedText();
                Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();

                // 스포츠카의 선루프를 연다.
                car2.openSunRoof();
                Toast.makeText(getApplicationContext(), car2.getSunRoofInfo(), Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.testButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                car1.brakePedal();
                car2.brakePedal();
                String info = "car1: " + car1.getCurrentSppedText() + ", car2: " + car2.getCurrentSppedText();
                Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();

                // 스포츠카의 선루프를 닫는다.
                car2.closeSunRoof();
                Toast.makeText(getApplicationContext(), car2.getSunRoofInfo(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
