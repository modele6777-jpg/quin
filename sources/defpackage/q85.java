package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q85 implements ptb {
    public final qtb a;
    public final long b;

    public q85(qtb qtbVar, long j) {
        qtbVar.getClass();
        this.a = qtbVar;
        this.b = j;
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        return null;
    }

    @Override // defpackage.ptb
    public final boolean N() {
        return false;
    }

    @Override // defpackage.ptb
    public final int U() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q85) {
            q85 q85Var = (q85) obj;
            return pa7.t(this.a, q85Var.a) && this.b == q85Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ib8.b(ub3.d(this.a.hashCode() * 31, 31, false), 31, this.b);
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.a + ", wasImageCaptured=false, frameNumber=" + ((Object) yy5.a(this.b)) + ", reason=0)";
    }
}
