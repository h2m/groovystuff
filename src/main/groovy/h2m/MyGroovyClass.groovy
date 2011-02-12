package h2m;

class MyGroovyClass {
    public static void main(String[] args) {
        (1..3).each {
            MyScalaClass msc = MyJavaClass.doIt(it * 2);
            MyJavaClass.doItAgain(msc);
        }
    }
}