public class exercise1 {

    static boolean iwillBehave = true;
    static boolean iwillGraduate = true;

    public static void main(String[] args) throws Exception {

        // precondition 
        assert iwillBehave == true : "umayos ka bata";

        // method
        College();

        // postcondition
        assert iwillGraduate == true : "ay bahala ka na sa buhay mo. kakatulog mo yan.";

    }

    static void College(){
      iwillGraduate = false ;
      System.out.print(" !!!! ");

    }

}
