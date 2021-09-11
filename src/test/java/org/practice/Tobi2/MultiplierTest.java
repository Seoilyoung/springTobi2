package org.practice.Tobi2;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplierTest {

    @Test
    public void multiply(){
        Multiplier multiplier = new Multiplier();
        assertEquals(multiplier.Multiply(2,3),6);
    }
}