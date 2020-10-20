public class Main {
    public static void main(String[] args) {
       /* //canPack(1, 0, 4);
       // canPack(1, 0, 5);
        canPack(0, 5, 4);
        canPack(2, 2, 11);
        canPack(-3, 2, 12);*/
        //canPack(2, 2, 12);
        //canPack(2, 1, 5);
        //canPack(2, 10, 18);
        //canPack(4, 18, 19);
        //canPack(5, 3, 24);
        canPack(5, 3, -12);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean status = false;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigOne = 5;
        int smallOne = 1;
        int range = 0;

        if (bigCount > 1 && bigOne == goal) {
            status = true;
            System.out.println("1");
        } else if (bigCount * bigOne > goal) {
            //System.out.println("2");
            for (int i = 1; i <= bigCount; i++) {
                //System.out.println("inside for, goal and i = " + goal + " and " + i*bigOne);
                if (bigOne * i > goal) {
                    System.out.println("inside if again");
                    i -= 1;
                    range = goal - (bigCount * i);
                   // System.out.println("Range = " + range);
                    break;
                }
            }
            if (smallCount * smallOne >= range) {
                status = true;
            } else {
                status = false;
            }
        } else if (bigCount == 0 && smallCount * smallOne > goal) {
            System.out.println("3");
            range = goal - (smallCount * smallOne);
            System.out.println("range = " + range);
            if (range == -1) {
                status = true;
            }
        } else if (bigCount * bigOne == goal || smallCount * smallOne == goal) {
            System.out.println("4");
            status = true;
        } else if (bigCount * bigOne < goal) {
            System.out.println("5");
            range = goal - (bigCount * bigOne);
            if ((smallCount * smallOne) >= range) {
                status = true;
            }
        }
        System.out.println("status = " + status);
        return status;
    }
}
