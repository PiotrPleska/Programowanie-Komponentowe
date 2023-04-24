package kompo.sudoku;

import java.io.IOException;
import kompo.sudoku.exceptions.DaoFileException;

public interface Dao<T> extends AutoCloseable {
    T read() throws IOException;

    void write(T t) throws IOException;
}
