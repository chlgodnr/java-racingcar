package racingcar;

public class FindWinnerManager {
    public int findMaxDistance(int[] carPosition) {
        int maxDistance = 0;
        for (int position : carPosition) {
            if (position > maxDistance) {
                maxDistance = position;
            }
        }
        return maxDistance;
    } //최대거리 구하기

    public String[] findWinners(String[] carName, int[] carPosition, int maxDistance) {
        int index = 0;
        int count = countWinner(carPosition, maxDistance);
        String[] winner = new String[count];
        for (int i = 0; i < carName.length; i++) {
            if (maxDistance == carPosition[i]) winner[index++] = carName[i];
        }
        return winner;
    } // 우승자 찾기


    public int countWinner(int[] carPosition, int maxDistance) {
        int count = 0;
        for (int i = 0; i < carPosition.length; i++) {
            if (maxDistance == carPosition[i]) count++;
        }
        return count;
    } //우승자 수
}
