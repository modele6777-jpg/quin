package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ay7 {
    public final t99 a;
    public final enb b;

    public ay7(t99 t99Var, enb enbVar) {
        t99Var.getClass();
        this.a = t99Var;
        this.b = enbVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ay7) {
            return pa7.t(this.a, ((ay7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
