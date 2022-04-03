package company.groww;

public class Currency {

    private Integer dominance;
    private String currency;
    private Integer quantity;

    public Currency(Integer dominance, String currency, Integer quantity) {
        this.dominance = dominance;
        this.currency = currency;
        this.quantity = quantity;
    }

    public Integer getDominance() {
        return dominance;
    }

    public void setDominance(Integer dominance) {
        this.dominance = dominance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "dominance=" + dominance +
                ", currency='" + currency + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
