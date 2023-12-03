package projet_java;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
	
public	class F1TeamArray {
	    private F1Team[] teams;

	  
	    public F1TeamArray(F1Team[] teams) {
	        this.teams = teams;
	    }

	    
	    public void sortTeams() {
	        Arrays.sort(teams);
	    }

	    

	    public int countTeams() {
	        return teams.length;
	    }

	    public void reverseTeamsOrder() {
	        List<F1Team> teamList = Arrays.asList(teams);
	        Collections.reverse(teamList);
	        teams = teamList.toArray(new F1Team[0]);
	    }

	    public void displayTeams() {
	        for (F1Team team : teams) {
	            System.out.println(team.toString());
	        }
	    }

	    public F1Team getLargestTeam() {
	        sortTeams();
	        return teams[teams.length - 1];
	    }

	    public boolean compareTeams(F1TeamArray otherArray) {
	        return Arrays.equals(this.teams, otherArray.teams);
	    }
}
