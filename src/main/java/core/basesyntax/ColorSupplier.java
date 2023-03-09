package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int randNumber = random.nextInt(Colors.values().length);

        return Colors.values()[randNumber].toString();
    }
}
