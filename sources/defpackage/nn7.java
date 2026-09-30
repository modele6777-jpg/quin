package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nn7 extends xm7 {
    public static final /* synthetic */ int d = 0;
    public final Class b;
    public final lw7 c = eb3.N(z18.b, new kn7(this, 0));

    public nn7(Class cls) {
        this.b = cls;
    }

    @Override // defpackage.xm7
    public final Collection H() {
        return pu4.a;
    }

    @Override // defpackage.xm7
    public final Collection I() {
        return pu4.a;
    }

    @Override // defpackage.xm7
    public final Collection J(t99 t99Var) {
        fob fobVar = ((mn7) this.c.getValue()).e;
        wn7 wn7Var = mn7.g[1];
        Object objInvoke = fobVar.invoke();
        objInvoke.getClass();
        return ((dr8) objInvoke).b(t99Var, lf9.b);
    }

    @Override // defpackage.xm7
    public final wxa K(int i) {
        fob fobVar = ((mn7) this.c.getValue()).e;
        wn7 wn7Var = mn7.g[1];
        Object objInvoke = fobVar.invoke();
        objInvoke.getClass();
        dr8 dr8Var = (dr8) objInvoke;
        p04 p04Var = dr8Var instanceof p04 ? (p04) dr8Var : null;
        if (p04Var != null) {
            lp0 lp0Var = p04Var.b;
            hza hzaVar = p04Var.h;
            s56 s56Var = rl7.l;
            s56Var.getClass();
            hzaVar.getClass();
            kza kzaVar = (kza) (i < hzaVar.o(s56Var) ? hzaVar.n(s56Var, i) : null);
            if (kzaVar != null) {
                bb8 bb8Var = new bb8(this);
                u99 u99Var = (u99) lp0Var.c;
                b0b b0bVarH = hzaVar.H();
                b0bVarH.getClass();
                return (wxa) sqf.g(this.b, bb8Var, kzaVar, u99Var, new bu3(b0bVarH), (ay0) lp0Var.g, y.H0);
            }
        }
        return null;
    }

    @Override // defpackage.xm7
    public final uq7 L(int i) {
        tq7 tq7Var = (tq7) s72.Z0((List) ((mn7) this.c.getValue()).c.getValue());
        if (tq7Var == null) {
            return null;
        }
        qq7 qq7Var = xk7.b;
        qq7Var.getClass();
        return (uq7) s72.y0(i, ((xk7) y7h.N(tq7Var.d, qq7Var)).a);
    }

    @Override // defpackage.xm7
    public final Class M() {
        Class cls = (Class) ((mn7) this.c.getValue()).f.getValue();
        return cls == null ? this.b : cls;
    }

    @Override // defpackage.xm7
    public final Collection N(t99 t99Var) {
        fob fobVar = ((mn7) this.c.getValue()).e;
        wn7 wn7Var = mn7.g[1];
        Object objInvoke = fobVar.invoke();
        objInvoke.getClass();
        return ((dr8) objInvoke).f(t99Var, lf9.b);
    }

    public final ArrayList Q() {
        List list = (List) ((mn7) this.c.getValue()).c.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x72.g0(arrayList, ((tq7) it.next()).a);
        }
        return arrayList;
    }

    @Override // defpackage.y12
    public final Class d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nn7) {
            return this.b.equals(((nn7) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "file class " + smb.a(this.b).a();
    }
}
