package racingcar;

public class GamePlayManager {
    private final CarNameManager carNameManger;
    private final TrialManger trialManager;
    private final CarMoveLogicManger carMoveLogicManger;
    private final DisplayManager displayManager;
    private final FindWinnerManager findWinnerManager;

    public GamePlayManager() {
        carNameManger = new CarNameManager();
        trialManager = new TrialManger();
        carMoveLogicManger = new CarMoveLogicManger();
        displayManager = new DisplayManager();
        findWinnerManager = new FindWinnerManager();
    }

    public void startGame() {
        // 자동차 이름 입력 및 유효성 검사
        String[] carNames = carNameManger.newCars();

        // 시도 횟수 입력 및 유효성 검사
        int trialCount = trialManager.trialCount();

        // 자동차 초기 위치 설정
        int[] carPositions = new int[carNames.length];

        // 게임 진행
        for (int i = 0; i < trialCount; i++) {
            carPositions = carMoveLogicManger.moveOrStop(carPositions);
            displayManager.moveOrStopDisplay(carNames, carPositions);
        }

        // 최종 우승자 결정 및 출력
        int maxDistance = findWinnerManager.findMaxDistance(carPositions);
        String[] winners = findWinnerManager.findWinners(carNames, carPositions, maxDistance);
        displayManager.printWinner(winners);
    }
}
