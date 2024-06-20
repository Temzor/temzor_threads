package ru.j4j.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BoxTest {
    @Test
    void isThisSphere() {
        Box box = new Box(0, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Sphere");
    }

    @Test
    void isThisCube() {
        Box box = new Box(8, 8);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Cube");
    }

    @Test
    void fourVertex() {
        Box box = new Box(4, 4);
        int vertices = box.getNumberOfVertices();
        assertThat(vertices).isEqualTo(4);
    }

    @Test
    void unknownVertexFigure() {
        Box box = new Box(1, 1);
        int vertices = box.getNumberOfVertices();
        assertThat(vertices).isEqualTo(-1);
    }

    @Test
    void figureIsNotExist() {
        Box box = new Box(1, 1);
        boolean result = box.isExist();
        assertThat(result).isFalse();
    }

    @Test
    void figureIsExist() {
        Box box = new Box(4, 4);
        boolean result = box.isExist();
        assertThat(result).isTrue();
    }

    @Test
    void whenCubeThenGenArea() {
        Box box = new Box(4, 4);
        double area = box.getArea();
        assertThat(area).isEqualTo(Math.sqrt(3) * (box.getEdge() * box.getEdge()));
    }

    @Test
    void whenTetrahedronThenGenArea() {
        Box box = new Box(8, 8);
        double area = box.getArea();
        assertThat(area).isEqualTo(6 * (box.getEdge() * box.getEdge()));
    }
    @Test
    void checkDefaultArea() {
        Box box = new Box(-1, -1);
        double area = box.getArea();
        assertThat(area).isEqualTo(0);
    }
}