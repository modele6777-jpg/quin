package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum erb {
    /* JADX INFO: Fake field, exist only in values array */
    POINTS(0),
    /* JADX INFO: Fake field, exist only in values array */
    LINES(1),
    /* JADX INFO: Fake field, exist only in values array */
    LINE_STRIP(3),
    TRIANGLES(4),
    /* JADX INFO: Fake field, exist only in values array */
    TRIANGLE_STRIP(5);

    private final int mType;

    erb(int i) {
        this.mType = i;
    }

    public final int a() {
        return this.mType;
    }
}
