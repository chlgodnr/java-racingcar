package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;

public class Running {
    public String[] newCars(){
        System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        String[] carName = Console.readLine().split(",");
        for (String name : carName){
            if (name.length() > 5) {
                throw new IllegalArgumentException();
            }
        }
        return carName;
    } // 자동차 입력

