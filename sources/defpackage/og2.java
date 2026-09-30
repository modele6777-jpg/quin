package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class og2 implements qr9, nv2 {
    public static final gec b = new gec(19);
    public final l46 a;

    public og2(l46 l46Var) {
        this.a = l46Var;
    }

    @Override // defpackage.pv2
    public final /* bridge */ nv2 F0(ov2 ov2Var) {
        return i7h.s(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final /* bridge */ pv2 U(ov2 ov2Var) {
        return i7h.E(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        return l26Var.z(obj, this);
    }

    @Override // defpackage.qr9
    public final List e(Integer num) {
        return this.a.K();
    }

    @Override // defpackage.qr9
    public final boolean g() {
        return this.a.C;
    }

    @Override // defpackage.nv2
    public final ov2 getKey() {
        return b;
    }

    @Override // defpackage.pv2
    public final /* bridge */ pv2 p0(pv2 pv2Var) {
        return i7h.I(this, pv2Var);
    }
}
