package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void truePosition() {
        Figure bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position(), is(Cell.C8));
    }

    @Test
    public void copyPosition() {
        Figure bishopBlack = new BishopBlack(Cell.C8);
        Figure copyBishopBlack = bishopBlack.copy(Cell.F8);
        assertThat(copyBishopBlack.position(), is(Cell.F8));

    }

    @Test
    public void leftRightUp() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] rsl = bishopBlack.way(Cell.G5);
        Cell[] expect = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(rsl, is(expect));
    }

    @Test
    public void leftRightDown() {
        Figure bishopBlack = new BishopBlack(Cell.C4);
        Cell[] rsl = bishopBlack.way(Cell.E2);
        Cell[] expect = new Cell[]{Cell.D3, Cell.E2};
        assertThat(rsl, is(expect));
    }

    @Test
    public void rightLeftUp() {
        Figure bishopBlack = new BishopBlack(Cell.E2);
        Cell[] rsl = bishopBlack.way(Cell.C4);
        Cell[] expect = new Cell[]{Cell.D3, Cell.C4};
        assertThat(rsl, is(expect));
    }

    @Test
    public void rightLeftDown() {
        Figure bishopBlack = new BishopBlack(Cell.B7);
        Cell[] rsl = bishopBlack.way(Cell.D5);
        Cell[] expect = new Cell[]{Cell.C6, Cell.D5};
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenNonDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean rsl = bishopBlack.isDiagonal(Cell.C1, Cell.G4);
        assertThat(rsl, is(false));
    }
}