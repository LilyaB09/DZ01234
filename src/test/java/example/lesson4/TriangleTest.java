package example.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    @DisplayName("Треугольник с валидными сторонами")
    void validTriangleTest(int i, int i1, int i2) throws SideIsOrLessOne {
        assertEquals(areaOfTriangle.threSidesOfTriangle(3, 3, 3), 3.897, 0.001);
        }
    @Test
    @DisplayName("Стороны треугольника равны нулю")
    void triangleSideIsOneTest() {
        assertThrows(SideIsOrLessOne.class,() -> areaOfTriangle.threSidesOfTriangle(0, 3, 3));
    }
    @Test
    @DisplayName("Треугольник с отрицательной стороной")
    void triagleSideLessOneTest() {
        assertThrows(SideIsOrLessOne.class,() -> areaOfTriangle.threSidesOfTriangle(-3, 3, 3));
    }
    @ParameterizedTest
    @DisplayName("Треугольник м валидными сторонами")
    @ValueSource(strings = {"3, 3, 3", "8, 4, 5"})
    void ValidData(String data) {
        boolean result = areaOfTriangle.validTriangle(data);
        assertTrue(result);
    }


}

