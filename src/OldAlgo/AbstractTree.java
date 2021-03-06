package OldAlgo;

/**
 * Created by lenar on 30.04.17.
 */
public class AbstractTree {
    int n;
    int height;
    int[] width;
    int[] level;

    public AbstractTree(){}

    public AbstractTree(int n) {
        this.n = n;
        level = new int[n];
    }

    public void setLevel(int node, int l) { level[node] = l;}

    public int getLevel(int i) { return level[i]; }

    public void setHeight() {
        int largest = 0;
        for (int i = 0; i < n; i++)
            if (level[i] > largest)
                largest = level[i];
        height = largest;
    }

    public void setWidth() {
        width = new int[height + 1];
        width[0] = 1;
        for (int i = 0; i < n; i++)
            if (level[i] != 0)
                width[level[i]]++;
    }
}
