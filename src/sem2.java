import sem2.pack.MyFirstClass;

public class sem2 {
    public static void main(String[] args) {
        MyFirstClass myClass = new MyFirstClass(5);
        MyFirstClass [] myFirstClassArray = new MyFirstClass[2];
        myFirstClassArray[0] = new MyFirstClass(5);
        myFirstClassArray[1] = new MyFirstClass(7);
        int val = myClass.getMyAttribute();
        System.out.println(val);
        System.out.println(myClass);
        for(MyFirstClass item:myFirstClassArray){
            System.out.println(item);
        }
        for(int i=0;i<myFirstClassArray.length;i++){
            System.out.println(myFirstClassArray[i]);
        }
    }
}
