package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c28 extends tt7 {
    public final ge8 b;
    public final x16 c;
    public final ee8 d;

    public c28(ge8 ge8Var, x16 x16Var) {
        this.b = ge8Var;
        this.c = x16Var;
        this.d = new ee8(ge8Var, x16Var);
    }

    @Override // defpackage.tt7
    public final dr8 F() {
        return l0().F();
    }

    @Override // defpackage.tt7
    public final List Z() {
        return l0().Z();
    }

    @Override // defpackage.tt7
    public final e7f a0() {
        return l0().a0();
    }

    @Override // defpackage.tt7
    public final j7f c0() {
        return l0().c0();
    }

    @Override // defpackage.tt7
    public final boolean i0() {
        return l0().i0();
    }

    @Override // defpackage.tt7
    public final tt7 j0(zt7 zt7Var) {
        return new c28(this.b, new wj7(11, zt7Var, this));
    }

    @Override // defpackage.tt7
    public final jgf k0() {
        tt7 tt7VarL0 = l0();
        while (tt7VarL0 instanceof c28) {
            tt7VarL0 = ((c28) tt7VarL0).l0();
        }
        tt7VarL0.getClass();
        return (jgf) tt7VarL0;
    }

    public final tt7 l0() {
        return (tt7) this.d.invoke();
    }

    public final String toString() {
        ee8 ee8Var = this.d;
        return (ee8Var.c == fe8.a || ee8Var.c == fe8.b) ? "<Not computed yet>" : l0().toString();
    }
}
