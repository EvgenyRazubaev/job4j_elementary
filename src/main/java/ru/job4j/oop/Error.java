package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Состояние ошибки " + active);
        System.out.println("Номер ошибки " + status);
        System.out.println("Описание ошибки " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 1, "No lan connection");
        error.printInfo();
        Error errorSecond = new Error();
        errorSecond.printInfo();
        Error errorThird = new Error(false, 999, "User not found");
        errorThird.printInfo();
    }

}
