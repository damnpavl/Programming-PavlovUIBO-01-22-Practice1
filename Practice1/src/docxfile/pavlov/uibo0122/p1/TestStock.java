package docxfile.pavlov.uibo0122.p1;

public class TestStock {
    public static void main(String[] args) {
        Stock Stock1 = new Stock("SBER", "ПАО Сбербанк", 281.5, 282.87);
        System.out.println("Процент изменения стоимости акций равен: " + Stock1.getChangePercent() + "%");
    }
}
