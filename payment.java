public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("masukkan lama parkir");
        int hour = myObj.nextInt();
        float pay;
        if (hour>24){
            pay= ((float)((hour/24)*15))+((float)((hour%24)*0.5));
        } else if (hour>5) {
            pay= ((float)5)+((float)((hour%5)*0.5));
        }else {
            pay = (float)hour;
        }
        System.out.println("biaya yang perlu dibayar adalah $"+pay);
    }
}
