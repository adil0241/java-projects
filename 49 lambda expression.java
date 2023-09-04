@FunctionalInterface
 interface cr7
 {
    void show();
 }
 class ronny
 {
    public static void main(String[] args) 
    {
        cr7 obj=() ->System.out.println("goat");
        obj.show();
    }
 }
 
 // when we pass parameter 

 @FunctionalInterface
 interface cr77
 {
    void show(int i);
 }
 class ronnyy
 {
    public static void main(String[] args) 
    {
        cr77 obj=(int i) ->System.out.println("goat" + i);
        obj.show(7);
    }
 }

 // wnat to return something

 @FunctionalInterface
 interface cr777
 {
    int add(int n1,int n2);
 }
 class ronnny
 {
    public static void main(String[] args) 
    {
        cr777 obj=(n1,n2) ->n1+ n2;
        int res=obj.add(40, 60);
        System.out.println(res);
    }
 }