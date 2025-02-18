package javax.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowSetInternal {
  Object[] getParams() throws SQLException;
  
  Connection getConnection() throws SQLException;
  
  void setMetaData(RowSetMetaData paramRowSetMetaData) throws SQLException;
  
  ResultSet getOriginal() throws SQLException;
  
  ResultSet getOriginalRow() throws SQLException;
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/javax/sql/RowSetInternal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */