package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum fbf {
    /* JADX INFO: Fake field, exist only in values array */
    Heavy(1.0f, 1.0f),
    Block(0.5f, 0.32f),
    Item(0.5f, 0.12f);

    private final float alpha;
    private final float thickness;

    fbf(float f, float f2) {
        this.thickness = f;
        this.alpha = f2;
    }

    public final float a() {
        return this.alpha;
    }

    public final float b() {
        return this.thickness;
    }
}
