package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private ColorSupplier colorSupplier;
    private Random random;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        int randNumber = random.nextInt(MAX_NUMBER);
        String color = colorSupplier.getRandomColor();

        return new Ball(color, randNumber);
    }
}
