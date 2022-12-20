public class Printer {
    private String[] message;
    private String[] sortedMessage;
    private int n;

    public Printer(int n) {
        this.message = new String[n];
        this.sortedMessage = new String[n];
        this.n = n;
    }

    public String getMessage(int i) {
        return message[i];
    }

    public void setMessage(String message, int i) {
        this.message[i] = message;
    }

    public void printMessage(){

        for (int i = 0; i < this.n; i++){
            this.sortedMessage[i] = arrangeLine(i);
            System.out.println(sortedMessage[i]);
        }
    }

    private String arrangeLine(int index) {
        String line = "";
        StringBuilder newLine = new StringBuilder();
        int begin = getMessage(index).length() / 2;
        int end = getMessage(index).length();
        char ch;

        for (int j = 0; j < 2; j++) {
            line = getMessage(index).substring(begin, end);
            for (int i = 0; i < line.length(); i++) {
                ch = line.charAt(i);
                newLine.insert(0, ch);
            }
            begin = 0;
            end = getMessage(index).length() / 2;
        }
        return newLine.toString();
    }
}
