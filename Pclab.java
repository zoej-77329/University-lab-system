public class Pclab{
   private String labname;
  // private int size;
   private Pc pclist[];
   private String assistantname;
   private String incharge;
   private int counter=0;
   
   
   //counstructor
   Pclab(String labname,int counter,String assistantname,String incharge)
   {
	   this.labname=labname;
	   this.pclist=new Pc[counter];
       this.assistantname=assistantname;
	   this.incharge=incharge;
	   
   }
    Pclab(Pclab p)
   {
	   this.labname=p.labname;
	   this.pclist=new Pc[counter];
       this.assistantname=p.assistantname;
	   this.incharge=p.incharge;
	   
   }
   public void setlabname(String labname)
   {
     this.labname=labname;
   }
   public String getlabname()
   {
    return labname;
   }
   public void setassistantname(String assistantname)
   {
	   this.assistantname=assistantname;
   }
   public String getassistantname()
   {
    return assistantname;
   }
   public void setincharge(String incharge)
   {
	   this.incharge=incharge;
   }
  public String getincharge()
  {
     return incharge;
  }   
  
  public void addpc(int id,String cpumodel,int Ramsize,int harddisksize,String lcdmodel,boolean Gpu)
  {
	 if (counter < pclist.length) {
            pclist[counter] = new Pc(id, cpumodel, Ramsize, harddisksize, lcdmodel, Gpu);
			counter++;
        }
  }
  
   @Override
  public String toString() 
  {
    StringBuilder pcStringBuilder = new StringBuilder("\n\nPC's Details\n");
    for (int i = 0; i < counter; i++) {
        pcStringBuilder.append(pclist[i].toString()).append("\n");
    }
    return String.format("Lab name: %s\nPClist:%s\nLab Assistant: %s\nLab incharge: %s\n", labname, pcStringBuilder.toString(), assistantname, incharge);
 }
   
   public void display()
   {
	   for(int i=0;i<counter;i++)
	   {
		   
	   System.out.println(pclist[i]);
	   }
   }
   @Override
   public boolean equals(Object o)
   {
	   Pclab other=(Pclab)o;
	   return labname.equals(other.labname)&&assistantname.equals(other.assistantname)&&incharge.equals(other.incharge);
   }
   @Override
   public Object clone()
   {
	   return new Pclab(this);
   }
}