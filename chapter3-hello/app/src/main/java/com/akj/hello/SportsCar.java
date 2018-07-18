package com.akj.hello;

// Sports Car 클래스는 Car 클래스를 확장(상속) 한다.
public class SportsCar extends Car {

    // 선루프가 열려있는지 상태를 나타내는 변수
    private boolean isOpenSunRoof = false;

    public SportsCar(int acceleration, int maxSpeed, int brakeSpeed) {
        super(acceleration, maxSpeed, brakeSpeed);
    }

    // 스포츠카의 선루프를 연다.
    public void openSunRoof() {
        isOpenSunRoof = true;
    }

    // 스포츠카의 선루프를 닫는다.
    public void closeSunRoof() {
        isOpenSunRoof = false;
    }

    // 스포츠카의 선루프 정보를 읽어온다.
    public String getSunRoofInfo() {
        if (isOpenSunRoof) {
            return "선루프를 열었더니 상쾌하다";
        } else {
            return "선루프는 닫혀있다.";
        }
    }


    @Override
    public String getCurrentSppedText() {
        return "스포츠카입니다." + super.getCurrentSppedText();
    }
}
