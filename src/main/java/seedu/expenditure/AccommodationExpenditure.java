package seedu.expenditure;

import java.time.LocalDate;

public class AccommodationExpenditure extends Expenditure {
    public static final String expenditureType = "Accom";
    public static String iconPaid = "[X]";
    public static String iconUnpaid = "[ ]";

    private boolean isPaid;

    public AccommodationExpenditure(String description, double value, LocalDate date) {
        super(description, value, date);
        isPaid = false;
    }

    public void setPaid() {
        isPaid = true;
    }

    public void resetPaid() {
        isPaid = false;
    }

    public String getStatusIcon() {
        return (isPaid) ? iconPaid : iconUnpaid;
    }

    @Override
    public String toString() {
        return String.format("[Accommodation] || %s || %s", getStatusIcon(), super.toString());
    }

    @Override
    public String getExpenditureType() {
        return expenditureType;
    }

    @Override
    public String saveInfo() { // NOT DONE
        return getExpenditureType() +
                "d/" + getDescription() +
                "v/" + getValue() +
                "t/" + getDate() +
                "p/" + getStatusIcon() +
                "n/" + "None" +
                "o/" + "None" + "\n";
    }
}
