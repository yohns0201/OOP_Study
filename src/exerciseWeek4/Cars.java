package exerciseWeek4;

import java.util.Scanner;

public class Cars {
    String carName;
    float maxSpeed;

    //생성자
    public Cars(String carName, float maxSpeed){
        this.carName = carName;
        this.maxSpeed = maxSpeed;
    }
    //최대 속도 수정
    public void updateMaxSpeed(float updateSpeed){
        maxSpeed += updateSpeed;
    }
    //차 이름 반환
    public String getCarName(){
        return this.carName;
    }
    //최대 속도 반황
    public float getMaxSpeed(){
        return this.maxSpeed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String carName1, carName2;
        float maxSpeed1, maxSpeed2;
        Cars[] car;
        car = new Cars[2];

        System.out.print("첫번째 자동차의 이름: ");
        carName1 = scanner.next();
        System.out.print("첫번째 자동차의 최대Speed: ");
        maxSpeed1 = scanner.nextFloat();
        car[0] = new Cars(carName1, maxSpeed1);

        System.out.print("두번째 자동차의 이름: ");
        carName2 = scanner.next();
        System.out.print("두번째 자동차의 최대Speed: ");
        maxSpeed2 = scanner.nextFloat();
        car[1] = new Cars(carName2, maxSpeed2);

        System.out.println("수정하고 싶은 자동차의 번호를 입력하세요: ");
        for (int i = 0; i < car.length; i++) {
            System.out.println("["+(i + 1) + "] " + car[i].carName + " ");
        }

        int selNum = scanner.nextInt();
        System.out.println("추가할 속도를 입력하세요: ");
        float updateSpeed = scanner.nextFloat();
        car[selNum - 1].updateMaxSpeed(updateSpeed);
        System.out.println("수정됨:\n이름: " + car[selNum - 1].getCarName());
        System.out.println("최대 속도: " + car[selNum - 1].getMaxSpeed());
    }
}
