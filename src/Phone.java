public class Phone {
    public final String number;
    public final String model;
    public final double weight;

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



    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name + ". Номер телефона: " + number);
    }

    public void receivedCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + ". Номер звонящего: " + callerNumber + ". Номер телефона: " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправляем сообщение на номера: ");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}

