package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public class BottleOfWine extends Product {
    private static final BigDecimal EXCISE_DUTY = new BigDecimal("5.56");

    public BottleOfWine(String name, BigDecimal price) {
        super(name, price, EXCISE_DUTY);
    }

    @Override
    public BigDecimal getPriceWithTax() {
        return super.getPrice().add(EXCISE_DUTY);
    }
}