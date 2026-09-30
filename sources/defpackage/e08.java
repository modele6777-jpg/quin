package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e08 {
    public final a26 a;
    public zi0 c;
    public int f;
    public final gg7 b = new gg7(21);
    public int d = -1;
    public int e = -1;

    public e08(a26 a26Var) {
        this.a = a26Var;
    }

    public final d08 a(int i, long j, boolean z, a26 a26Var) {
        zi0 zi0Var = this.c;
        if (zi0Var == null) {
            return xq4.a;
        }
        wsa wsaVar = (wsa) zi0Var.d;
        boolean z2 = wsaVar instanceof ru;
        vsa vsaVar = new vsa(zi0Var, i, this.b, a26Var);
        vsaVar.d = new kl2(j);
        if (!z2) {
            wsaVar.a(vsaVar);
        } else if (z) {
            ru ruVar = (ru) wsaVar;
            ruVar.b.add(new zua(1, vsaVar));
            if (!ruVar.c) {
                ruVar.c = true;
                ruVar.a.post(ruVar);
            }
        } else {
            ru ruVar2 = (ru) wsaVar;
            ruVar2.b.add(new zua(0, vsaVar));
            if (!ruVar2.c) {
                ruVar2.c = true;
                ruVar2.a.post(ruVar2);
            }
        }
        bp.Y(i, "compose:lazy:schedule_prefetch:index");
        return vsaVar;
    }
}
