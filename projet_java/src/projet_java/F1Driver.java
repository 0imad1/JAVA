package projet_java;

import java.util.Objects;

public class F1Driver extends F1Team {
		private String driverName;
	    private int driverNumber;

	
    public F1Driver(String name, int establishedYear, String driverName, int driverNumber) {
	        super(name, establishedYear);
	        this.driverName = driverName;
	        this.driverNumber = driverNumber;
	    }

	   
	    @Override
	    public String toString() {
	        return super.toString() + " - Driver: " + driverName + " (#" + driverNumber + ")";
	    }

	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		F1Driver other = (F1Driver)obj;
		return Objects.equals(driverNumber,other.driverNumber);
	}

	@Override
	protected F1Driver clone() {
		// TODO Auto-generated method stub
	
			return (F1Driver)super.clone();
		
	}
	
	 
	    
	
	    
}

