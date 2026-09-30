package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pk0 extends Exception {
    public final int audioTrackState;
    public final rr5 format;
    public final boolean isRecoverable;

    /* JADX WARN: Illegal instructions before constructor call */
    public pk0(int i, int i2, int i3, int i4, rr5 rr5Var, boolean z, rj0 rj0Var) {
        StringBuilder sbN = ib8.n(i, i2, "AudioTrack init failed 0 Config(", ", ", ", ");
        ub3.u(sbN, i3, ", ", i4, ") ");
        sbN.append(rr5Var);
        sbN.append(z ? " (recoverable)" : "");
        super(sbN.toString(), rj0Var);
        this.audioTrackState = 0;
        this.isRecoverable = z;
        this.format = rr5Var;
    }
}
