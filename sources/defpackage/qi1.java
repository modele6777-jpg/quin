package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qi1 implements zk9, v26 {
    public final /* synthetic */ di1 a;

    public qi1(di1 di1Var) {
        this.a = di1Var;
    }

    @Override // defpackage.zk9
    public final /* synthetic */ void a(Object obj) {
        this.a.d(obj);
    }

    @Override // defpackage.v26
    public final m26 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zk9) && (obj instanceof v26)) {
            return this.a == ((v26) obj).b();
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
