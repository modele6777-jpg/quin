package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m55 {
    public final h1f a;
    public final int[] b;

    public m55(h1f h1fVar, int... iArr) {
        if (iArr.length == 0) {
            xo1.y("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = h1fVar;
        this.b = iArr;
    }
}
