public class SK{

    public static void print_sums(){

        int s = 0 ;
         for(int i = 1 ; i <= 10 ; i++){
             for(int j = 1 ; j <= i; j++ ){
                s = s + j ;
             }
             System.out.println( s) ;
             s = 0 ;
         }

    }

    public static void main(String[] args)
    {
        print_sums() ;


    }
}
