
public class Windows implements Comparable<Windows>{
    Glass glass = new Glass();
    int size;
    public int compareTo(Windows win)
    {
        return (this.size - win.size);
    }
}
