import java.util.Scanner;

class ThapHaNoi {
    static void HaNoiTower(long n, char first_rod, char third_rod, char second_rod){
        if(n == 0) return;
        HaNoiTower(n-1, first_rod, second_rod, third_rod);
        System.out.println("Disk " + n + " moved from " + first_rod + " to " + third_rod);
        HaNoiTower(n-1, second_rod, third_rod, first_rod);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        HaNoiTower(n, 'A', 'C', 'B');
    }
}