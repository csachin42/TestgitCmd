public class DatatypeandVariable
{
    byte b;                               // instance variable
    short s;                             // instance variable
    int num;                            // instance variable
    long l;                            // instance variable
    float f;                          // instance variable
    double db;                       //instance variable
    boolean todaywillberaining;     //instance variable
    char a;                        //instance variable
    static boolean todayismonday; // static variable only for main method as main method cannot take non-static variable
    public void datatype(){
        int y=30;                // Local Variable needs to initialize
        System.out.println("default byte value :"+ b);
        System.out.println("default short value :"+ s);
        System.out.println("default integer value :"+ num);
        System.out.println("default long value :"+ l);
        System.out.println("default float value :"+ f);
        System.out.println("default double valu: "+ db);
        System.out.println("default boolean value :"+ todaywillberaining);
        System.out.println("defaul char value :" + a);
        System.out.println("boolean value :"+ todayismonday);
    }
    public static void main(String[] args) {
        int z=0;
        System.out.println("boolean value :"+ todayismonday);
        System.out.println(z);
        DatatypeandVariable x = new DatatypeandVariable();
        x.datatype();
    }
}
