public class MegaBytesConverter {

    public static final String invalid_value = "Invalid Value"; // use 'final' to define a constant

    public static void main(String[] args) {

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;
        if (kiloBytes < 0){
            System.out.println(invalid_value);
        } else{
            System.out.println(kiloBytes + " KB" + " = " + megabytes + " MB and " + remainder + " KB");
        }
    }

}
