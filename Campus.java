public class Campus {
    private String campusName;
    private String location;

    // Constructor
    public Campus(String campusName, String location) {
        this.campusName = campusName;
        this.location = location;
    }

    // Getters and Setters
    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    @Override
    public String toString() 
	{
        return "\n\tCampus Details:\n\n" +
                "campusName="+campusName+"\tlocation=" + location+"\n" ;
    }
}