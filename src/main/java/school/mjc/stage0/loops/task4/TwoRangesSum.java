package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger than the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int skippedSum = 0;
            int countedSum = 0;
            for (int i = 1; i <= lastInRow; i++) {
                if (i % numberToSkip != 0) {
                    countedSum += i;
                } else {
                    skippedSum += i;
                }
            }
            System.out.println(skippedSum);
            System.out.println(countedSum);
        }

    }
}
