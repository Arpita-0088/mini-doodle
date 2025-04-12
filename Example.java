class Example{
    void display (){
        try {
            String Str = null;
            System.out.println(Str.length());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        System.out.println("EXCEPTION HANDELED");
    }
    public static void main (String args []){
       Example obj = new Example();
       obj.display();
    }
}
