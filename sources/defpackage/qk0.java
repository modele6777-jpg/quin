package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qk0 extends Exception {
    public final long actualPresentationTimeUs;
    public final long expectedPresentationTimeUs;

    /* JADX WARN: Illegal instructions before constructor call */
    public qk0(long j, long j2) {
        StringBuilder sbP = ub3.p("Unexpected audio track timestamp discontinuity: expected ", ", got ", j2);
        sbP.append(j);
        super(sbP.toString());
        this.actualPresentationTimeUs = j;
        this.expectedPresentationTimeUs = j2;
    }
}
