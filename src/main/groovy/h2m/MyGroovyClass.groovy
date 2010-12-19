package h2m;

class MyGroovyClass{
	public static void main (String[] args){
		(1..3).each{
			MyJavaClass.doIt(it);
		}
	}
}