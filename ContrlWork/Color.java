package ContrlWork;

/**
 * Created by java3 on 27.07.17.
 */
public enum Color{ RED(50), GRIN(40), BLUE(20);


    int i;

    Color(int i) {
        this.i = i;
    }

    public int coast() {
        return (Color.this.i);
    }

    public String toString() {
        return (Color.this.name());
    }
}

