class Number{
    void display (){
        try {
            String Str = "HELLO";
            int num = Integer.parseInt(Str);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        System.out.println("EXCEPTION HANDELED");
    }
    public static void main (String args []){
        Number obj = new Number();
        obj.display();
     }
}

