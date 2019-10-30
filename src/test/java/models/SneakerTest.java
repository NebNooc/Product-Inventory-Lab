package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SneakerTest {
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Sketchidas";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }

    @Test
    public void setSportTest() {
        // given (1)
        String expected = "Foosball";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setSizeTest() {
        // given (1)
        Integer expected = 12;

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSize());
    }

    @Test
    public void setQtyTest() {
        // given (1)
        Integer expected = 14;

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setQty(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        Float expected = 62.43f;

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }


}