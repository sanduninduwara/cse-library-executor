package it.uom.cse;

public enum OperationType {

    ADD("ADD"),
    MULT("MULTIPLY"),
    SUM_OF_INTEGERS("SUM_OF_INTEGERS"),
    FIBONACCI("FIBONACCI"),
    FACTORIAL("FACTORIAL"),
    SUM_OF_PRIMES("SUM_OF_PRIMES"),
    EXIT("EXIT");

    String opeartionString;

    OperationType(String opeartionString) {
        this.opeartionString = opeartionString;
    }

    public String getOpeartionString() {
        return opeartionString;
    }

    public void setOpeartionString(String opeartionString) {
        this.opeartionString = opeartionString;
    }
}
