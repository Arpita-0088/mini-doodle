import java.io.File;
import java.io.IOException;
class CreateFile{
    public static void main(String args []){
        try{
            File fo = new File ("C:example.txt");
            if(fo.createNewFile()){
                System.out.println("FILE:"+fo.getName()+"IS CREATED");}
                else {
                    System.out.println("FILE IS ALREADY EXIST IN THE DIRECTORY");
                }
            }
        catch (IOException exception){
            System.out.println("A UNEXCEPTED ERROR ID OCCURED");
            exception.printStackTrace();
        }
        }
    }
