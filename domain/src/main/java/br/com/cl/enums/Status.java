package br.com.cl.enums;

public enum Status {

    INATIVO (0),
    ATIVO (1);

    private Integer code;

    Status(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public static Status valueOf(Integer code) {
        for (Status s : Status.values()) {
            if (s.getCode().equals(code))
                return s;
        }
        return null;
    }
}