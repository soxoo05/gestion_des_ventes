
package Application;

import java.net.*;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class BDD {
    Connection connexion;
    Statement statement;
    String SQL;
    
    String url;
        String username;
        String password;
        Socket client;
        int Port;
        String Host;
        
   public BDD(String url,String username,String password,String Host,int Port){
       this.url = url;
       this.username = username;
       this.password = password;
       this.Host = Host;
       this.Port = Port;
   }
   // fonction pour faire la connexion a la bd
  public Connection connexionDatabase(){
      try {
                Class.forName("com.mysql.dbc.Driver");
      connexion = DriverManager.getConnection(url,username,password);
      }catch (Exception e)
      {System.err.println(e.getMessage());//pour afficher ou se trouve le bleme exactement
      }
      return connexion ;
   }
  public Connection closeconnexion(){
      try {
          connexion.close();
      }catch (Exception e) {System.err.print(e); 
      }
      return connexion;
  }
  public ResultSet executionQuery(String sql){
      connexionDatabase();
      ResultSet resultSet = null;
      try{
         statement   = connexion.createStatement();
          resultSet = statement.executeQuery(sql);
          System.out.println(sql);
      }catch (SQLException ex) {System.err.println(ex);
  }
  return resultSet;
  }
  public String executionUpdate(String sql){
      connexionDatabase();
      String result = "";
      try{
          statement = connexion.createStatement();
          statement.executeUpdate(sql);
          result=sql;
      }catch (SQLException ex){
          result = ex.toString();
      }
      return result;
  }
  public ResultSet querySelectAll(String nomTable){
      connexionDatabase();
      SQL = "SELECT * FROM" + nomTable;
      System.out.println(SQL);
      return this.executionQuery(SQL);
  }
   public ResultSet querySelectAll(String nomTable,String etat){
      connexionDatabase();
      SQL = "SELECT * FROM" + nomTable + "WHERE" + etat;
      return this.executionQuery(SQL);
  }
   public ResultSet querySelect(String[] nomColonne,String nomTable){
      connexionDatabase();
      int i;
      SQL = "SELECT";
      for(i=0; i<=nomColonne.length-1; i++){
          SQL += nomColonne[i];
          if(i<nomColonne.length-1){
              SQL += ",";
          }
      }
      SQL += "FROM" + nomTable;
      return this.executionQuery(SQL);
  }
    public ResultSet fcSelectCommand(String[] nomColonne,String nomTable,String etat){
      connexionDatabase();
      int i;
      SQL = "SELECT";
      for(i=0; i<=nomColonne.length-1; i++){
          SQL += nomColonne[i];
          if(i<nomColonne.length-1){
              SQL += ",";
          }
      }
      SQL += "FROM" + nomTable + "WHERE" + etat;
      return this.executionQuery(SQL);
  }
    public String queryInsert(String nomTable ,String[] contenuTableau ){
      connexionDatabase();
      int i;
      SQL = "INSERT INTO" + nomTable + "VALUES(";
      for(i=0; i<=contenuTableau.length-1; i++){
          SQL += "'" + contenuTableau[i] + "'";
          if(i<contenuTableau.length-1){
              SQL += ",";
          }
      }
      SQL += ")";
      return this.executionUpdate(SQL);
  }
  public String queryInsert(String nomTable ,String[] nomColonne, String[] contenuTableau ){
      connexionDatabase();
      int i;
      SQL = "INSERT INTO" + nomTable + "(";
      for(i=0; i<=nomColonne.length-1; i++){
          SQL += "'" + nomColonne[i] + "'";
          if(i<nomColonne.length-1){
              SQL += ",";
          }
      }
      SQL +=") VALUES(";
      for(i=0; i<=contenuTableau.length-1; i++){
          SQL += "'" + contenuTableau[i] + "'";
          if(i<contenuTableau.length-1){
              SQL += ",";
          }
      }
      SQL += ")";
      return this.executionUpdate(SQL);
  }
  public String queryUpdate(String nomTable,String[] nomColonne, String[] contenuTableau,String etat ){
      connexionDatabase();
      int i;
      SQL = "UPDATE" + nomTable + "SET";
      for(i=0; i<= nomColonne.length-1; i++){
          SQL += nomColonne[i] +  "='" + contenuTableau[i] + "'";
          if(i<nomColonne.length-1){
              SQL += ",";
          }
      }
      SQL += "WHERE" + etat;
      return this.executionUpdate(SQL);
  }
  // fonction pour la suppression d'une requete sans parametre
  public String queryDelete (String nomTable){
    connexionDatabase();  
    return this.executionUpdate(SQL);
  }
  // fonction pour supprimer une requete avec parametre
  public String queryDelete (String nomTable, String etat){
    connexionDatabase();
    SQL += "DELETE FROM" + nomTable + "WHERE" + etat;
    return this.executionUpdate(SQL);
  }
}