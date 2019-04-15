package Lab_5;

public abstract class Currency {
    private float amount;
    private int code;

    public Currency(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public int getCode() {
        return code;
    }

    protected void setCode(int code) {
        this.code = code;
    }
}
