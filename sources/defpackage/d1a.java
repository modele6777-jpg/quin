package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d1a implements zj2 {
    public final s8c a;
    public final String b;
    public final l26 c;
    public final ace d = new ace(new zv6(25, this));

    public d1a(s8c s8cVar, String str, l26 l26Var) {
        this.a = s8cVar;
        this.b = str;
        this.c = l26Var;
    }

    @Override // defpackage.zj2
    public final Object J0(boolean z, l26 l26Var, zn2 zn2Var) {
        b1a b1aVar = (b1a) zn2Var.getContext().F0(b1a.b);
        a1a a1aVar = b1aVar != null ? b1aVar.a : null;
        if (a1aVar != null) {
            return l26Var.z(a1aVar, zn2Var);
        }
        a1a a1aVar2 = new a1a(this.c, (q8c) this.d.getValue());
        return ynb.p0(new b1a(a1aVar2), new c1a(l26Var, a1aVar2, null), zn2Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        ace aceVar = this.d;
        if (aceVar.b()) {
            ((q8c) aceVar.getValue()).close();
        }
    }
}
