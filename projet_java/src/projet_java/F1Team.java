package projet_java;

import java.util.Objects;


public class F1Team implements Comparable<F1Team>, Cloneable{
	
	private String name;
    private int establishedYear;
   public F1Team(String name, int establishedYear) {
        this.name = name;
        this.establishedYear = establishedYear;
    }

  
    @Override
    public String toString() {
        return "F1Team: " + name + " - Established: " + establishedYear;
    }

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		F1Team other = (F1Team)obj;
		return Objects.equals(establishedYear,other.establishedYear);
	}

	@Override
	protected F1Team clone() {
		// TODO Auto-generated method stub
		try {
			return (F1Team)super.clone();
		}
		catch(CloneNotSupportedException e ) {
			return null;
		}
			
	}

	@Override
	public int compareTo(F1Team o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	

	

}
