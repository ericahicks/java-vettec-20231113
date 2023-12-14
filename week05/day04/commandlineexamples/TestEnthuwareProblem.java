public class TestEnthuwareProblem {

    public static void main(String[] args) {
        TestEnthuwareProblem tep = new TestEnthuwareProblem();
        tep.switchTest((byte) 'b');
    }

    public void switchTest(byte x) 
    {
       switch(x)
       {
          case 'b':   // 1
          default :   // 2
          case -2:    // 3
          case 80:    // 4
      }
   }
}