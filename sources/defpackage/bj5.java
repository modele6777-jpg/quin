package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bj5 extends jgf implements dj5 {
    public final tjd b;
    public final tjd c;

    public bj5(tjd tjdVar, tjd tjdVar2) {
        tjdVar.getClass();
        tjdVar2.getClass();
        this.b = tjdVar;
        this.c = tjdVar2;
    }

    @Override // defpackage.tt7
    public dr8 F() {
        return o0().F();
    }

    @Override // defpackage.tt7
    public final List Z() {
        return o0().Z();
    }

    @Override // defpackage.tt7
    public final e7f a0() {
        return o0().a0();
    }

    @Override // defpackage.tt7
    public final j7f c0() {
        return o0().c0();
    }

    @Override // defpackage.tt7
    public final boolean i0() {
        return o0().i0();
    }

    public abstract tjd o0();

    public abstract String p0(jz3 jz3Var, jz3 jz3Var2);

    public String toString() {
        return jz3.e.P(this);
    }
}
