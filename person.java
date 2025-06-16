class persn{
    private String name;
    
    public void setname( String name){
        this.name= name;
    }
    public String getname(){
        return name;
    }
}

public class person {
    
    public static void main(String[] args) {
        persn p = new persn();
         p.setname("AbdulRehman");
         System.err.println(p.getname());

    }
}


