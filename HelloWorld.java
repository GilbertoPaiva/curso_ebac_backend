public class HelloWorld {

    public static void main(String[] args) {
        String ambiente = args[0];

        if (ambiente.equals("DEV")) {
            System.out.print(ambiente);
        }
    }
}