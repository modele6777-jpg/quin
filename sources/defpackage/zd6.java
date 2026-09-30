package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zd6 extends ee6 {
    public final int b;
    public final boolean c;

    public zd6(int i, boolean z) {
        super("GRAPH_ERROR");
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.ee6
    public final String toString() {
        return this.a + "(cameraError=" + ((Object) nf1.a(this.b)) + ", willAttemptRetry=" + this.c + ')';
    }
}
