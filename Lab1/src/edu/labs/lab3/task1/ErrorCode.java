package edu.labs.lab3.task1;

enum ErrorCode {
    SUCCESS(200), BAD_REQUEST(400), SERVER_ERROR(500);
    private int numVal;

    private ErrorCode(final int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
