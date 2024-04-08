package racingcar;

public class DisplayManager {
    public void moveOrStopDisplay(String[] carName, int[] carPosition) {
        for (int i = 0; i < carName.length; i++) {
            System.out.print(carName[i] + " : ");
            for (int j = 0; j < carPosition[i]; j++) {
                System.out.print('-');
            }
            System.out.println();
        }
        System.out.println();
    }
    public void printWinner(String[] winner) {
        System.out.print("최종 우승자 : ");
        if (winner.length == 1) System.out.println(winner[0]);
        else {
            for (int i = 0; i < winner.length-1; i++)
                System.out.print(winner[i] + ",");
        }
        System.out.println(winner[winner.length - 1]);
    } //우승자 출력

}
