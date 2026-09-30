package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zh7 implements xn7 {
    public static final zh7 a = new zh7();
    public static final hua b = eec.c("kotlinx.serialization.json.JsonLiteral");

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        Boolean bool;
        yh7 yh7Var = (yh7) obj;
        yh7Var.getClass();
        String str = yh7Var.c;
        vd0.K(ev4Var);
        if (yh7Var.a) {
            ev4Var.D(str);
            return;
        }
        nyc nycVar = yh7Var.b;
        if (nycVar != null) {
            ev4Var.n(nycVar).D(str);
            return;
        }
        Long lE = c5e.E(str);
        if (lE != null) {
            ev4Var.B(lE.longValue());
            return;
        }
        faf fafVarL = z8c.l(str);
        if (fafVarL != null) {
            ev4Var.n(jaf.b).B(fafVarL.a);
            return;
        }
        Double dS = b5e.s(str);
        if (dS != null) {
            ev4Var.i(dS.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            ev4Var.m(bool.booleanValue());
        } else {
            ev4Var.D(str);
        }
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        jh7 jh7VarJ = vd0.J(om3Var);
        nh7 nh7VarM = jh7VarJ.m();
        if (nh7VarM instanceof yh7) {
            return (yh7) nh7VarM;
        }
        String strJ = tec.j(job.a, nh7VarM.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had "));
        String string = jh7VarJ.d().a.j ? kj0.n0(nh7VarM.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(strJ, null, null, -1, string), strJ, null, -1, string, null);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
