public class trianglewithzeroone {
    public static void main(String[]args){
        trianglepattern(5);
    }
    public static void trianglepattern(int n) {
        for (int i=1;i<=n;i++){
            for (int j=1;j <= i;j++){
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}
