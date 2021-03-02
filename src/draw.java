public class draw {
    static void triangle () {
        for (int i =0; i<5; i++) {
            for(int j = 5; j>i; j--) {
                System.out.printf("* ");
            }
            System.out.printf("%n");
        }
    }
    static void rectangle() {
        for (int i =0; i<4; i++) {
            for(int j = 0; j<8; j++) {
                System.out.printf("* ");
            }
            System.out.printf("%n");
        }
    }
    static void square() {
        for (int i =0; i<5; i++) {
            for(int j = 0; j<5; j++) {
                System.out.printf("*  ");
            }
            System.out.printf("%n");
        }
    }
    public static void main(String[] args) {
        triangle();
        rectangle();
        square();
    }
}

