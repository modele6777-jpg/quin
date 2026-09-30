package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ted {
    public final boolean a;
    public final a26 b;
    public ze5 c;
    public final lo d;
    public ze5 e;
    public ze5 f;

    public ted(boolean z, x16 x16Var, x16 x16Var2, ued uedVar, a26 a26Var) {
        this.a = z;
        this.b = a26Var;
        if (z && uedVar == ued.c) {
            qc0.j("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        this.c = red.a;
        this.d = new lo(uedVar, new lnc(3, x16Var), x16Var2, new hka(this, 1), a26Var);
        this.e = b21.O();
        this.f = b21.O();
    }

    public static Object a(ted tedVar, ued uedVar, ze5 ze5Var, xn2 xn2Var) {
        Object objB = tedVar.d.b(uedVar, s89.a, new sed(tedVar, tedVar.d.j.j(), ze5Var, null), xn2Var);
        return objB == bw2.a ? objB : wef.a;
    }

    public final Object b(gbe gbeVar) {
        Object objA;
        a26 a26Var = this.b;
        ued uedVar = ued.b;
        return (((Boolean) a26Var.d(uedVar)).booleanValue() && (objA = a(this, uedVar, this.e, gbeVar)) == bw2.a) ? objA : wef.a;
    }

    public final ued c() {
        return (ued) this.d.g.getValue();
    }

    public final Object d(xn2 xn2Var) {
        Object objA;
        a26 a26Var = this.b;
        ued uedVar = ued.a;
        return (((Boolean) a26Var.d(uedVar)).booleanValue() && (objA = a(this, uedVar, this.f, xn2Var)) == bw2.a) ? objA : wef.a;
    }

    public final boolean e() {
        return this.d.g.getValue() != ued.a;
    }

    public final Object f(gbe gbeVar) {
        Object objA;
        if (this.a) {
            qc0.p("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        a26 a26Var = this.b;
        ued uedVar = ued.c;
        return (((Boolean) a26Var.d(uedVar)).booleanValue() && (objA = a(this, uedVar, this.f, gbeVar)) == bw2.a) ? objA : wef.a;
    }

    public final Object g(gbe gbeVar) {
        Object objA;
        Map map = this.d.d().a;
        ued uedVar = ued.c;
        if (!map.containsKey(uedVar)) {
            uedVar = ued.b;
        }
        return (((Boolean) this.b.d(uedVar)).booleanValue() && (objA = a(this, uedVar, this.e, gbeVar)) == bw2.a) ? objA : wef.a;
    }
}
