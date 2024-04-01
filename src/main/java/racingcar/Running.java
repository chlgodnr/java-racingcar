package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Running {
    public String[] newCars() {
        System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        String[] carName = Console.readLine().split(",");
        for (String name : carName) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("이름은 5자 이하만 가능합니다");
            }
        }
        return carName;
    } //자동차 입력

    public int trialCount() {
        int count = 0;
        try {
            System.out.print("시도할 회수는 몇회인가요?");
            String input = Console.readLine();
            count = Integer.parseInt(input);
            if (count < 0 || count > 9) {
                throw new IllegalArgumentException("시도횟수는 0이상 9이하여야 합니다");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 입력되어야 합니다.");
        }
        return count;
    } //시도 횟수

    public int[] moveOrStop(String[] carName) {
        int[] carPosition = new int[carName.length];
        for (int i = 0; i < carPosition.length; i++) {
            int random = Randoms.pickNumberInRange(0, 9);
            if (random >= 4) carPosition[i]++;
        }
        return carPosition;
    } // 전진 or 정지 동작

    public void carDisplay(String[] carName) {
        int[] carPosition = new int[carName.length];
        for(int i=0; i< carPosition.length; i++){
            System.out.print(carName[i] + ":");
        }
    } //자동차 이름 출력
    public void moveOrStopDisplay(String[] carName, int[] carPosition) {
        carPosition = new int[carName.length];
        for(int i=0; i<carPosition[i]; i++){
            System.out.print("-");
        }
    } //자동차 이동상태



}