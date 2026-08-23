package streamsTut.functionalProgramming;
/*
┌─────────────┬───────────────┬───────────────┐
│ Interface   │ Input → Output│ Purpose       │
├─────────────┼───────────────┼───────────────┤
│ Predicate   │ T → boolean   │ Check         │
│ Function    │ T → R         │ Transform     │
│ Consumer    │ T → void      │ Perform       │
│ Supplier    │ () → T        │ Provide       │
└─────────────┴───────────────┴───────────────┘
* */
@FunctionalInterface
public interface Calculator {
    public int calculate(int a, int b);
}
