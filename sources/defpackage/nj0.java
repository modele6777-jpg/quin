package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nj0 extends Exception {
    public final int errorCode;
    public final boolean isRecoverable;

    public nj0(int i, boolean z) {
        super(tec.e(i, "AudioOutput write failed: "));
        this.isRecoverable = z;
        this.errorCode = i;
    }
}
