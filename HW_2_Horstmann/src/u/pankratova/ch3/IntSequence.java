package u.pankratova.ch3;

public interface IntSequence {
    boolean hasNext();

    int next();

    /* ex4 */
    static IntSequence of(int... arguments) {
        return new IntSequence() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < arguments.length;
            }

            @Override
            public int next() {
                return arguments[i++];
            }
        };
    }

    /* ex5 */
    static IntSequence constant(int n) {
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return n;
            }
        };
    }
}

