package Application;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;



// declaration
public class ResultSetTableModel extends AbstractTableModel{
    private ResultSet rs;
    
    public ResultSetTableModel(ResultSet rs){
        this.rs = rs;
        fireTableDataChanged ();
        
    }
    public int getColumnCount (){
        try {
           
            if (rs == null){
            return 0 ;
            } 
         else {
         return rs.getMetaData().getColumnCount();
        }
        }
        catch (SQLException e) {
               System.out.println("getColumncount resultset generating error while getting column count");//message d'erreur
               System.out.println (e.getMessage());
               return 0;
            }
    }
    public int getRowCount (){
        try {
           
            if (rs == null){
            return 0 ;
            } 
         else {
                rs.last();
                return rs.getRow();
        }
        }
        catch (SQLException e) {
               System.out.println("getRowcount resultset generating error while getting rows count");//
               System.out.println (e.getMessage());
               return 0;
            }
    }
    public Object getValuesAt (int rowIndex,int columnIndex){
        if (rowIndex < 0 || rowIndex > getRowCount()
                || columnIndex < 0 || columnIndex > getColumnCount()){
            return null;
        }
        
        try {
           
            if (rs == null){
            return 0 ;
            } 
         else {
            rs.absolute(rowIndex + 1);
            return rs.getObject(columnIndex + 1);
        }
        }
        catch (SQLException e) {
               System.out.println("getvalueat resultset generating error while fetching rows");
               System.out.println (e.getMessage());
               return null;
            }
    }
    public String getColumnName (int columnIndex){
        try {
         return rs.getMetaData().getColumnName(columnIndex + 1);
        }
        catch (SQLException e) {
               System.out.println("getColumnname resultset generating error while fetching column name");//message d'erreur
               System.out.println (e.getMessage());
            }
        return super.getColumnName(columnIndex);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
