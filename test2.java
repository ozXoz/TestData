public class test2 {

    public static void  main (String[] args){

        System.out.println("Test2222");
        

    }


    public void log(int [] numbers){

        System.out.println(""); // 0(1) //
        for(int number : numbers) //0(n)
            System.out.println(number);
        System.out.println("fff");    //0(1)  means 2+n
        

    }

// 
    public void log2(int [] numbers,String [] names){
        // 0( n + m ) either 0(n)
        System.out.println(""); // 0(1) //
        for(int number : numbers)  //0(n)
            System.out.println(number);
        for(String name: names)
            System.out.println(name); // 0(m)
        

    }
    
}
