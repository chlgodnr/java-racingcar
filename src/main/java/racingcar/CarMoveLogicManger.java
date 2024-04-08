package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
public class CarMoveLogicManger {
    public int[] moveOrStop(int[] carPositions) {
        for (int i = 0; i < carPositions.length; i++) {
            int random = Randoms.pickNumberInRange(0, 9);
            if (random >= 4) carPositions[i]++;
        }
        return carPositions;
    }
}
