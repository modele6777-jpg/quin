package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lh4 extends oh4 {
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh4(Throwable th, int i) {
        super(null);
        th = (i & 2) != 0 ? null : th;
        this.b = th;
    }

    @Override // defpackage.oh4
    public final m40 a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lh4) && pa7.t(this.b, ((lh4) obj).b);
    }

    public final int hashCode() {
        Throwable th = this.b;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Error(completedStatus=null, error=" + this.b + ")";
    }
}
