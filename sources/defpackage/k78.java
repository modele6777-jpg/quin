package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k78 extends l78 {
    @Override // defpackage.l78
    public final void a(long j, Object obj) {
        l4 l4Var = (l4) ((n87) wff.j(j, obj));
        if (l4Var.a) {
            l4Var.a = false;
        }
    }

    @Override // defpackage.l78
    public final void b(long j, Object obj, Object obj2) {
        n87 n87VarG = (n87) wff.j(j, obj);
        n87 n87Var = (n87) wff.j(j, obj2);
        int size = n87VarG.size();
        int size2 = n87Var.size();
        if (size > 0 && size2 > 0) {
            if (!((l4) n87VarG).a) {
                n87VarG = n87VarG.G(size2 + size);
            }
            n87VarG.addAll(n87Var);
        }
        if (size > 0) {
            n87Var = n87VarG;
        }
        wff.p(j, obj, n87Var);
    }
}
