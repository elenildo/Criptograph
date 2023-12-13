package Criptograph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriptoTest {

    @Test
    @DisplayName("Should encode a simple word with key 0")
    void encodeSingleWord() {
        assertEquals("US2w#201pa2A+2e1+v2w#2}1<?201}1", Cripto.encode("Criptografia", 0));
    }

    @Test
    @DisplayName("Should decode a encoded word with key 0")
    void decodeText() {
        assertEquals("Criptografia", Cripto.decode("US2w#201pa2A+2e1+v2w#2}1<?201}1", 0));
    }
}