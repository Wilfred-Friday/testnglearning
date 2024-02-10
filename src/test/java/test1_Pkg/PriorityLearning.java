package test1_Pkg;

import org.testng.annotations.Test;

public class PriorityLearning {
    @Test(priority =0)
    public void tc001(){
        System.out.println("This is tc001 priority =0");
    }

    @Test(priority =1)
    public void tc002(){
        System.out.println("This is tc002 priority =1");
    }
    @Test(priority =2)
    public void tc003(){
        System.out.println("This is tc003 priority =2");
    }
    @Test(priority =0)
    public void tc004(){
        System.out.println("This is tc004 priority =0");
    }
    @Test(priority =1)
    public void tc005(){
        System.out.println("This is tc005 priority =1");
    }
    @Test(priority =2)
    public void tc006(){
        System.out.println("This is tc006 priority =2");
    }
    @Test(priority =0)
    public void tc007(){
        System.out.println("This is tc007 priority =0");
    }
    @Test(priority =1)
    public void tc008(){
        System.out.println("This is tc008 priority =1");
    }
    @Test(priority =2)
    public void tc009(){
        System.out.println("This is tc009 priority =2");
    }
    @Test(priority =3)
    public void tc010(){
        System.out.println("This is tc010 priority =3 ");
    }

}
