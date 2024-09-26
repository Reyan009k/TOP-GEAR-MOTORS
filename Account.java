import java.io.*;

public class Account {
    private String email;
    private String pass;
    Account(String email,String pass){
        this.email = email;
        this.pass = pass;
    }

    public void setEmail(String email){this.email = email;}
    public void setPass(String pass){this.pass = pass;}

    public String getEmail(){return this.email;}
    public String getPass(){return this.pass;}




   public void userdata(){

       try{
           File file = new File("data.txt");
           FileWriter fw = new FileWriter(file,true);
           fw.write("\nUser Email : "+getEmail());
           fw.write("\nUser Pass : "+getPass());
           fw.write("\n---------------------------------\n");
           fw.close();

       }
       catch(IOException e){
           e.printStackTrace();
       }
   }
}
