public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb=new CodingBat();
        System.out.print(cb.close10(2, 3));
    }
        public int close10 ( int a, int b){

            if (Math.abs(10 - a) > Math.abs(10 - b)) {
                return b;
            }
            if (Math.abs(10 - a) < Math.abs(10 - b)) {
                return a;
            } else {
                return 0;
            }

        }
    }
