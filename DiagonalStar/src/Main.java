public class Main {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        int currentRow = 1;
        int currentColumn = 1;
        int flag = 0;

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                currentColumn = 1;
                for(int j = 1; j <= number ; j++) {
                    flag = 0;
                    if(flag == 0 && (currentRow != 1 && currentRow != number) && currentColumn == currentRow) {
                        flag = 1;
                        //System.out.print(" currentColumn = " + currentColumn + " ");
                        //System.out.print("'ke 3");
                        //System.out.print("column = row");
                        System.out.print("*");
                    }

                    if(flag == 0 && (currentRow != 1 && currentRow != number) && currentColumn == (number - currentRow + 1)) {
                        flag = 1;
                        //System.out.print(" currentColumn = " + currentColumn + " ");
                        //System.out.print("'ke 4'");
                        System.out.print("*");
                    }

                    if(flag == 0 && (currentRow != 1 && currentRow != number) && (currentColumn == 1 || currentColumn == number)) {
                        flag = 1;
                        //System.out.print("fist column last column");
                        //System.out.print(" currentColumn = " + currentColumn + " ");
                        System.out.print("*");
                        if(currentColumn == number) {
                            //System.out.print(" currentColumn = " + currentColumn + " ");
                            System.out.println();
                        }

                    }
                    if (flag == 0 && currentRow == 1 || currentRow == number) {
                        flag = 1;
                       // System.out.print("first last all stars");
                        System.out.print("*");
                        //System.out.print("rowCount = " + rowCount);
                        //System.out.print(" currentColumn = " + currentColumn + " ");
                        if (currentColumn == number) {
                            System.out.println();
                        }
                    }
                    currentColumn++;
                    if(flag == 0) {
                        System.out.print(" ");
                    }
                }
                currentRow++;
            }
        }
        //System.out.println(currentRow);
    }
}
