package aaa01;

class MyObject {
    @MyAnnotation(number=4)
    public void test1() {
        System.out.println("This is testMethod1");
  }

    @MyAnnotation(value = "My new Annotation")
    public void test2() {
        System.out.println("This is testMethod1");
  }
}
