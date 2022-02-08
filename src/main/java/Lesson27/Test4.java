package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    void abc() throws FileNotFoundException{
       try {
        File f = new File("test.txt");
           FileInputStream fid = new FileInputStream(f);
    } catch (FileNotFoundException e){
           System.out.println("We caught the Exception and a bit edited");
           throw e;
       } finally {
           System.out.println("That block is finally");
       }



    }

    void method(){
        try { abc();
    }catch (FileNotFoundException e){
            System.out.println("We caught this Exception");
        }
    }

//    void def() {
//        try {
//            int [] array ={1,2,3};
//            System.out.println(array[5]);
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("We caught the Exception and a bit edited");
//            throw e;
//        } finally {
//            System.out.println("That block is finally");
//        }
//
//
//
//    }


}
