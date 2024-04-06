package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuelCanister extends Product {
    private static final BigDecimal EXCISE_DUTY = new BigDecimal("5.56");
    private static final LocalDate EXCISE_DUTY_DATE =
            LocalDate.of(LocalDate.now().getYear(), 1, 26);

    public FuelCanister(String name, BigDecimal price) {
        super(name, price, EXCISE_DUTY);
    }

    @Override
    public BigDecimal getPriceWithTax() {
        if (LocalDate.now().equals(EXCISE_DUTY_DATE)) {
            return this.getPrice();
        } else {
            return super.getPrice().add(EXCISE_DUTY);
        }
    }
}