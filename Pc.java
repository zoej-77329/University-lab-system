public class Pc{
	
   private int id; 
   private String cpumodel;
   private int Ramsize;
   private int harddisksize;
   private String lcdmodel;
   private boolean Gpu;
   private static int count=0;
   
   	//Counstructor
   Pc(int id,String cpumodel,int Ramsize,int harddisksize,String lcdmodel,boolean Gpu)
   {
	   this.id=id;
	   this.cpumodel=cpumodel;
	   this.Ramsize=Ramsize;
	   this.harddisksize=harddisksize;
	   this.lcdmodel=lcdmodel;
	   this.Gpu=Gpu;
   }
   public int getid(){
	   return id;
   }
   public void setCpumodel(String cpumodel)
   {
	   this.cpumodel=cpumodel;
   }
   public String getCpumodel()
   {
	   return cpumodel;
   }
   public void setramsize(int Ramsize)
   {
	   this.Ramsize=Ramsize;
   }
   public int getramsize()
   {
	   return Ramsize;
   }
   public void setHarddisksize(int harddisksize)
   {
	   this.harddisksize=harddisksize;
   }  
   public int getHarddisksize()
   {
	   return harddisksize;
   }
   public void setlcdmodel(String lcdmodel)
   {
	  this.lcdmodel=lcdmodel;
   }
      
   public String getlcdmodel()
   {
	   return lcdmodel;
   }
   public void setGpu(boolean Gpu)
   {
	   this.Gpu=Gpu;
   }
    public boolean getGpu()
   {
       return Gpu;
   }
   
   @Override 
   public String toString()
   {
     return String.format( "ID: %d\nCPU model: %s\nRAM size: %dGB\nHardDisk size: %dGBs\nLCD model: %s\nGpu: %b\n",id,cpumodel,Ramsize,harddisksize,lcdmodel,Gpu);
   }
   
   @Override
   public boolean equals(Object o)
   {
	   Pc other=(Pc)o;
	   return cpumodel.equals(other.cpumodel)&&lcdmodel.equals(other.lcdmodel)&&this.id==other.id&&this.Ramsize==other.Ramsize&&this.harddisksize==other.harddisksize&&this.Gpu==other.Gpu;
   }
}   