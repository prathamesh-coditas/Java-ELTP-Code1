package Feb23;

class MemoryPolluter {

    static final int MEGABYTE_IN_BYTES = 1024 * 1024;
    static final int ITERATION_COUNT = 1024 * 10;

    public static void main(String[] args) {
        System.out.println("Starting pollution Memory");

        for (int i = 0; i < ITERATION_COUNT; i++) {
            byte[] array = new byte[MEGABYTE_IN_BYTES];
        }

        System.out.println("Terminating the allocation");
    }
}
/*
        **With Epsilon GC
                Starting pollution Memory
                Terminating due to java.lang.OutOfMemoryError: Java heap space
        **with standard vm
                *Starting pollution Memory
                *Terminating the allocation
 */