package kompo.sudoku;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;


class FileSudokuBoardDaoTest {


    @Test
    void WriteReadTest() throws IOException {
        BacktrackingSudokuSolver solver = new BacktrackingSudokuSolver();
        SudokuBoard board = new SudokuBoard(solver);
        SudokuBoardDaoFactory.getFileDao(new File("teest.txt")).write(board);
    }

}