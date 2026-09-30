package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bj7 implements xn7 {
    public static final bj7 a = new bj7();
    public static final pyc b = eec.q("kotlinx.serialization.json.JsonPrimitive", fua.k, new nyc[0]);

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        yi7 yi7Var = (yi7) obj;
        yi7Var.getClass();
        vd0.K(ev4Var);
        if (yi7Var instanceof qi7) {
            ev4Var.h(ri7.a, qi7.INSTANCE);
        } else {
            ev4Var.h(zh7.a, (yh7) yi7Var);
        }
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        jh7 jh7VarJ = vd0.J(om3Var);
        nh7 nh7VarM = jh7VarJ.m();
        if (nh7VarM instanceof yi7) {
            return (yi7) nh7VarM;
        }
        String strJ = tec.j(job.a, nh7VarM.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had "));
        String string = jh7VarJ.d().a.j ? kj0.n0(nh7VarM.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(strJ, null, null, -1, string), strJ, null, -1, string, null);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
