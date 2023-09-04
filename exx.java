class Amm{
    int i=m1();
    Amm(){
        System.out.println("constr");
    }
    int m1(){
        System.out.println("m11");
        return 20;
    }
    {
        System.out.println("instancee");
    }
    public static void main(String[] args) {
        Amm obj =new Amm();
        System.out.println(obj);
    }
    }
