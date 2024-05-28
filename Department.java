public class Department
{
	private String dhead;
	private String dname;
	private Pclab pclabs[];
	private int counter=0;
	
	//Counstructor
	Department(String dhead,String dname,int counter)
	{
		this.dhead=dhead;
		this.dname=dname;
		this.pclabs=new Pclab[counter];
	}
	
	public void setDhead(String dhead)
	{
		this.dhead=dhead;
	}
	public String getDhead()
	{
		return dhead;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public String getDname()
	{
		return dname;
	}
	
	public void addlab(Pclab lab){
		if(counter<pclabs.length)
		{
		   pclabs[counter++]=lab;
		}
		
	}

	public Pclab[] getlab(){
		return pclabs;
	}
	
	@Override
    public String toString() {
        StringBuilder labStringBuilder = new StringBuilder();
        for (Pclab pclab : pclabs) {
            if (pclab != null) {
                labStringBuilder.append(pclab).append("\n");
            }
        }
        return "Department: " + dname + "\nDepartment Head: " + dhead + "\nLabs:\n" + labStringBuilder.toString();
    }
}