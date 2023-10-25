package ru.j4j.oop;

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

    public String showInfo() {
        return "Error { /nisActive = " + active + "/nstatus = " + status + "/nmessage = " + message + "/n}";
    }

}
