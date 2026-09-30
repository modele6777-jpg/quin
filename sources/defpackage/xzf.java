package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xzf extends ewf {
    public final gpf b;
    public final t7 c;
    public final s0e d;
    public final whb e;

    public xzf(gpf gpfVar, t7 t7Var) {
        this.b = gpfVar;
        this.c = t7Var;
        s0e s0eVarA = t0e.a(xu4.a);
        this.d = s0eVarA;
        this.e = if9.n(s0eVarA);
    }

    public final void f(rzf rzfVar) {
        s0e s0eVar;
        Object value;
        Set set;
        do {
            s0eVar = this.d;
            value = s0eVar.getValue();
            set = (Set) value;
        } while (!s0eVar.l(value, set.contains(rzfVar) ? n3d.k(set, rzfVar) : n3d.n(set, rzfVar)));
    }
}
