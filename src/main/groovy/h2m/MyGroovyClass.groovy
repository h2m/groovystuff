package h2m;

class MyGroovyClass {
    public static void main(String[] args) {
        new MyGroovyClass().run()
    }

    public void run() {
        def java = new MyJavaClass();
        (1..3).each {
            java.twice(it * 2);
        }
    }
}