package pdffile.palvov.uibo0122.pr1;

public class Task5 {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("Аргументы командной строки не переданы.");
        }
    }
}

