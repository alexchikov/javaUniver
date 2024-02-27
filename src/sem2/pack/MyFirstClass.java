package sem2.pack;

public class MyFirstClass{
    private int myAttribute;
    public MyFirstClass() {
        myAttribute = 5;
    }
    public MyFirstClass(int myAttribute) {
        this.myAttribute = myAttribute;
    }

    public int getMyAttribute(){
        return myAttribute;
    }

    public void setMyAttribute(int myAttribute) {
        this.myAttribute = myAttribute;
    }

    @Override
    public String toString(){
        return "MyClass{attribute="+myAttribute+"}";
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyFirstClass that = (MyFirstClass) o;
        return this.myAttribute == that.myAttribute;
    }
}