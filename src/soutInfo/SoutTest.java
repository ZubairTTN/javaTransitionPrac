package soutInfo;
/* Reference: https://chatgpt.com/share/6a802abd-92d8-83ee-b0fc-da5a4a0d0178 */
public class SoutTest {
    public static void main(String[] args)
    {
        SystemNew.outnew.print("This is print method called after constructor has ben called, object has been created");


    }
}
class SystemNew{
    static PrintStream outnew = new PrintStream("this is Constructor being Called as PrintSTream Object is being Created");
}

class PrintStream{
    public PrintStream(String name)
    {
        System.out.println(name);
    }
    public void print(String name)
    {
        System.out.println(name);
    }
}

/* Remember: A java file can have one top level public class like here SoutTest is public and other class SystemNew and PrintStream are default or package private classes.
 * and yes, a java file can have multiple nested public java classes  */


/* main()
  │
  │
  ↓
SystemNew.outnew.print("Zubiar")
  │
  │ Need SystemNew
  ↓
Initialize SystemNew
  │
  ↓
static PrintStream outnew =
        new PrintStream("Zubair");
                │
                ↓
        Create PrintStream object
                │
                ↓
        Call constructor
                │
                ↓
        Print "Zubair"
                │
                ↓
        Constructor finishes
                │
                ↓
        outnew now refers to object
                │
                ↓
SystemNew.outnew.print("Zubiar")
                │
                ↓
        Call print()
                │
                ↓
        Print "Zubiar" */
