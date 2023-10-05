public class test3 {
    
    public static void  main (String[] args){

        System.out.println("Test2222");
        

    }

    // demonstrate n ^2 or n ^3
    public void makeTest(int [] numbers){
        // What is to use the  runtime completiy  here
        for(int first:numbers) // which means n * n or n*2   n ^ 2 n^3// Quadratic   it gets slower and slow  grown large input ... 
            for(int second:numbers) // 0(n)
                System.out.println(first + ""+second); // 0(n)

    }




   

}
