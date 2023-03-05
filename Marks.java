public class Marks {
    // Sec A: marks
    private float marks[];
    private int numdata;

    public Marks(int numdat) {
        createData(numdat);
    }

    // Sec B: operation
    public void createData(int numdat) {
        marks = new float[numdat];
        for (int i=0; i<numdat; i++) {
            marks[i] =  0;
        }
        this.numdata = numdat;
    }

    public float calcAvg() {
        float sum = 0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
        }
        float ans = sum / numdata;
        return ans;
    }

    public void setMark(int mark, int index) throws Exception {
        if (mark < 0)
            throw new Exception("Mark is incorrect");

        this.marks[index]=mark;
    }
    public float getMark(int index) {
        return marks[index];
    }
}
