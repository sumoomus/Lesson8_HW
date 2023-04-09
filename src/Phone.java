public class Phone {
    private final String number;
    private final String model;
    private final double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("", "", 0.0);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("1234567", "iPhone", 0.3);
        Phone phone2 = new Phone("7654321", "Samsung");
        Phone phone3 = new Phone();

        System.out.println("Телефон 1: Номер: " + phone1.getNumber() + ", Модель: " + phone1.model + ", Вес: " + phone1.weight);
        System.out.println("Телефон 2: Номер: " + phone2.getNumber() + ", Модель: " + phone2.model + ", Вес: " + phone2.weight);
        System.out.println("Телефон 3: Номер: " + phone3.getNumber() + ", Модель: " + phone3.model + ", Вес: " + phone3.weight);

        phone1.receiveCall("John");
        phone2.receiveCall("Kate");
        phone3.receiveCall("Tom");

        phone1.sendMessage("1111111", "2222222");
        phone2.sendMessage("3333333", "4444444", "5555555");
        phone3.sendMessage("6666666");
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name + ". Номер телефона: " + number);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + ". Номер звонящего: " + callerNumber + ". Номер телефона: " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправляем сообщение на номера: ");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}

