package edu.labs;

import java.util.Objects;

/*
Class implements Task8
 */
public class CustomDouble {
    private int whole;
    private double fractional;

    public CustomDouble(final int whole, final double fractional) {
        this.whole = whole;
        this.fractional = fractional;
    }

    public CustomDouble sum(final CustomDouble value) {
        int wholePart = this.whole + value.whole;
        double fractionalTmp = this.fractional + value.fractional;
        wholePart = wholePart + (int) fractionalTmp;
        double fractionalPart = fractionalTmp - (int) fractionalTmp;

        return new CustomDouble(wholePart, fractionalPart);
    }

    public CustomDouble subtraction(final CustomDouble value) {
        int wholePart = this.whole - value.whole;

        double fractionalTmp = this.fractional - value.fractional;
        if (fractionalTmp < 0) {
            --wholePart;
            fractionalTmp = fractionalTmp + 1;
        }
        wholePart = wholePart + (int) fractionalTmp;
        double fractionalPart = fractionalTmp - (int) fractionalTmp;
        return new CustomDouble(wholePart, fractionalPart);
    }

    public boolean greaterThan(final CustomDouble value) {
        return this.toDouble() > value.toDouble();
    }

    public boolean lesserThan(final CustomDouble value) {
        return this.toDouble() < value.toDouble();
    }

    public double toDouble() {
        return this.whole + this.fractional;
    }

    @Override
    public String toString() {
        final double tmp = whole + fractional;
        return "CustomDouble{" + tmp + "}";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (!(o instanceof CustomDouble))
            return false;
        final CustomDouble that = (CustomDouble) o;
        return whole == that.whole && Double.compare(that.fractional, fractional) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(whole, fractional);
    }
}
