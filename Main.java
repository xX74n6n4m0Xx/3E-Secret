public class Main {
    public static void main(String[] args) {
        String palabra = "hello world";
        int j = 0;
        char[] abc = "abcdefghijklmnopqrstuvwxyz ".toCharArray();
        String txt = "";

        while (true) {
            for (int i = 0; i < abc.length; i++) {
                System.out.println(txt + abc[i]);
                if (abc[i] == palabra.charAt(j)) {
                    txt += abc[i];
                    break;
                }
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (txt.equals(palabra)) {
                break;
            }
            j += 1;
        }
    }
}
