package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cf9 implements bf9 {
    public final yt7 c = yt7.q;
    public final iu9 d = new iu9(iu9.d);

    public final boolean a(tt7 tt7Var, tt7 tt7Var2) {
        tt7Var.getClass();
        tt7Var2.getClass();
        return hj6.s(n16.A(false, null, this.c, 6), tt7Var.k0(), tt7Var2.k0());
    }

    public final boolean b(tt7 tt7Var, tt7 tt7Var2) {
        tt7Var.getClass();
        tt7Var2.getClass();
        h7f h7fVarA = n16.A(true, null, this.c, 6);
        r8f r8fVar = h7fVarA.c;
        jgf jgfVarK0 = tt7Var.k0();
        jgf jgfVarK1 = tt7Var2.k0();
        if (jgfVarK0 == jgfVarK1) {
            return true;
        }
        l26 l26VarO = r8fVar.O();
        Boolean bool = l26VarO != null ? (Boolean) l26VarO.z(jgfVarK0, jgfVarK1) : null;
        return bool != null ? bool.booleanValue() : hj6.b.p(h7fVarA, r8fVar, jgfVarK0, jgfVarK1);
    }
}
