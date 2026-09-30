package defpackage;

import java.util.Set;
import tech.chatmind.api.WhereDidYouHear;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gj6 extends ewf {
    public final gpf b;
    public final t7 c;
    public ej6 d = ej6.a;
    public final s0e e;
    public final whb f;

    public gj6(gpf gpfVar, t7 t7Var) {
        this.b = gpfVar;
        this.c = t7Var;
        s0e s0eVarA = t0e.a(xu4.a);
        this.e = s0eVarA;
        this.f = if9.n(s0eVarA);
    }

    public final void f(WhereDidYouHear whereDidYouHear) {
        s0e s0eVar;
        Object value;
        Set set;
        do {
            s0eVar = this.e;
            value = s0eVar.getValue();
            set = (Set) value;
        } while (!s0eVar.l(value, set.contains(whereDidYouHear) ? n3d.k(set, whereDidYouHear) : n3d.n(set, whereDidYouHear)));
    }
}
