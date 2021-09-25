public interface Foo {

    default int bar() {
        return complicatedMethodWithManyLinesOfCode();
    }

    default int bazz() {
        return complicatedMethodWithManyLinesOfCode() + 1;
    }


    // Will not work in Java 8 because interface methods cannot be private!
    private int complicatedMethodWithManyLinesOfCode() {
        // Actual code not shown...
        return 0;
    }
}