package racingcar;
import camp.nextstep.edu.missionutils.Console;

public class TrialManger {
    public int trialCount() {
        int count;
        try {
            System.out.println("시도할 회수는 몇회인가요?");
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

}
