/**
 * @author Larson
 */
package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Teams {
  private IntegerProperty teamID;

  public int getTeamID() {
    return teamID.get();
  }

  public IntegerProperty teamIDProperty() {
    return teamID;
  }

  public void setTeamID(int teamID) {
    this.teamID.set(teamID);
  }

  private IntegerProperty offensiveRank;
  private IntegerProperty defensiveRank;
  private IntegerProperty overallRank;
  private IntegerProperty starterRank;
  private StringProperty city;
  private StringProperty team;
  private StringProperty division;

  public int getOffensiveRank() {
    return offensiveRank.get();
  }

  public IntegerProperty offensiveRankProperty() {
    return offensiveRank;
  }

  public void setOffensiveRank(int offensiveRank) {
    this.offensiveRank.set(offensiveRank);
  }

  public int getDefensiveRank() {
    return defensiveRank.get();
  }

  public IntegerProperty defensiveRankProperty() {
    return defensiveRank;
  }

  public void setDefensiveRank(int defensiveRank) {
    this.defensiveRank.set(defensiveRank);
  }

  public int getOverallRank() {
    return overallRank.get();
  }

  public IntegerProperty overallRankProperty() {
    return overallRank;
  }

  public void setOverallRank(int overallRank) {
    this.overallRank.set(overallRank);
  }

  public int getStarterRank() {
    return starterRank.get();
  }

  public IntegerProperty starterRankProperty() {
    return starterRank;
  }

  public void setStarterRank(int starterRank) {
    this.starterRank.set(starterRank);
  }

  public String getCity() {
    return city.get();
  }

  public StringProperty cityProperty() {
    return city;
  }

  public void setCity(String city) {
    this.city.set(city);
  }

  public String getTeam() {
    return team.get();
  }

  public StringProperty teamProperty() {
    return team;
  }

  public void setTeam(String team) {
    this.team.set(team);
  }

  public String getDivision() {
    return division.get();
  }

  public StringProperty divisionProperty() {
    return division;
  }

  public void setDivision(String division) {
    this.division.set(division);
  }

  public Teams() {
    this.offensiveRank = new SimpleIntegerProperty();
    this.defensiveRank = new SimpleIntegerProperty();
    this.overallRank = new SimpleIntegerProperty();
    this.starterRank = new SimpleIntegerProperty();
    this.city = new SimpleStringProperty();
    this.team = new SimpleStringProperty();
    this.division = new SimpleStringProperty();


  }


}
