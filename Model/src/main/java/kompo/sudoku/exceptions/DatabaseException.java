package kompo.sudoku.exceptions;

import java.sql.SQLException;

public class DatabaseException extends SQLException {
    public DatabaseException(final String mes) {
        super(mes);
    }
}
