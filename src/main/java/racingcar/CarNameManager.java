package racingcar;
import camp.nextstep.edu.missionutils.Console;
public class CarNameManager {
    public String[] newCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] carName = Console.readLine().split(",");
        for (String name : carName) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("이름은 5자 이하만 가능합니다");
            }
        }
        return carName;
    } //자동차 입력
}
