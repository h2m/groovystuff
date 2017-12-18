package h2m;

class MyGroovyClass {
    public static void main(String[] args) {
        new MyGroovyClass().run()
    }

    public void run() {
        (1..3).each {
            MyJavaClass.doIt(it * 2);
        }
    }
}