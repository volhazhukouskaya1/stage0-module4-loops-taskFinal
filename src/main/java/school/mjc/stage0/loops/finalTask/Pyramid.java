package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for (int y=1; y<=cathetusLength; y++)
        { for (int x=1; x<=cathetusLength*2-1; x++){
            if (x<=cathetusLength) {
                if (cathetusLength-x+1<=y) {
                    System.out.print(cathetusLength-x+1);
                }
                else {
                    System.out.print(" ");
                }
            }
            else {
                if (x-cathetusLength+1<=y) {
                        System.out.print(x-cathetusLength+1);
                    }
                    else {
                        System.out.print("");
                    }
                }
            }
            System.out.println();
        }

        }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
    }



