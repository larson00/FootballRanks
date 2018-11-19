/**
 * @author Larson
 */
package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
public class Controller {

  @FXML
  private TableView teamTable;

  @FXML
  private TableColumn<Teams, Integer> teamID;

  @FXML
  private TableColumn<Teams, String> city;

  @FXML
  private TableColumn<Teams, String> team;

  @FXML
  void connect(ActionEvent event) {

    //Sets table columns for ID, firstName, and lastName using lambda expressions
    teamID.setCellValueFactory(cellData -> cellData.getValue().teamIDProperty().asObject());
    city.setCellValueFactory(cellData -> cellData.getValue().cityProperty());
    team.setCellValueFactory(cellData -> cellData.getValue().teamProperty());

    try {
      //Set select statement to grab from employee table in database
      String selectStmt = "SELECT * FROM teams";

      //ObservableList used to store Employee objects and show in TableView FX element
      ObservableList<Teams> teamList = FXCollections.observableArrayList();

      //Calls DButil method to execute given query and stores in ResultSet
      ResultSet rsEmp = DBUtil.dbExecuteQuery(selectStmt);

      //Iterates through ResultSet to store employee ID and names into ObservableList
      while (rsEmp.next()){
        Teams teams = new Teams();
        teams.setTeam(rsEmp.getString(1));
        teams.setOffensiveRank(rsEmp.getInt(2));
        teams.setDefensiveRank(rsEmp.getInt(3));

        teamList.add(teams);
      }
      //Display list to TableView
      teamTable.setItems(teamList);

    } catch (SQLException | ClassNotFoundException e){
      System.out.println("Error");
    }

  }


}


//public class Controller {
//
//  @FXML
//  private TableView employeeTable;
//
//  @FXML
//  private TableColumn<Teams, Integer> offensiveRanking;
//
//
//  @FXML
//  private TableColumn<Teams, String> name;
//
//  @FXML
//  void connect(ActionEvent event) {
//
//    final String DATABASE_URL = "jdbc:derby:lib\\Football";
//    final String SELECT_QUERY =
//        "SELECT teamID, division FROM teams";
//    try (
//        Connection connection = DriverManager.getConnection(
//            DATABASE_URL);
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(SELECT_QUERY)) {
//      // get ResultSet's meta data
//      {
//        resultSet.next();
//        lblTeam.setText(resultSet.getString(1));
//        lblDivision.setText(resultSet.getString(2));
////        lblOffense.setText(resultSet.getString(3));
////        lblDefense.setText(resultSet.getString(1));
////        lblOverall.setText(resultSet.getString(2));
//
//
//
//      }
//    } // AutoCloseable objects' close methods are called now
//    catch (SQLException sqlException) {
//      sqlException.printStackTrace();
//    } catch (Exception ex) {
//      System.out.println("Error");
//    }
//
//  }
//
//}
//
//
