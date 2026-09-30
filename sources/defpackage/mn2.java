package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mn2 {
    public final jsd a = new jsd();

    public static void b(mn2 mn2Var, l26 l26Var, dd2 dd2Var, x16 x16Var, int i) {
        if ((i & 8) != 0) {
            dd2Var = null;
        }
        mn2Var.a.add(new dd2(new sz7(l26Var, mn2Var, dd2Var, x16Var), true, -1789283891));
    }

    public final void a(ln2 ln2Var, l46 l46Var, int i) {
        l46Var.h0(-798501095);
        int i2 = (l46Var.g(ln2Var) ? 4 : 2) | i | (l46Var.g(this) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            jsd jsdVar = this.a;
            int size = jsdVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((n26) jsdVar.get(i3)).m(ln2Var, l46Var, Integer.valueOf(i2 & 14));
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(this, ln2Var, i, 20);
        }
    }
}
