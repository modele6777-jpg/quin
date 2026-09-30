package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xme implements ume {
    public final long a;
    public final /* synthetic */ zme b;

    public xme(zme zmeVar, long j) {
        this.b = zmeVar;
        this.a = j;
    }

    @Override // defpackage.ume
    public final tme a0() {
        return tq.p(this.b);
    }

    @Override // defpackage.ume
    public final long j(bv7 bv7Var) {
        bv7 bv7Var2 = (bv7) this.b.G0.getValue();
        if (bv7Var2 != null) {
            if (bv7Var2.h()) {
                return bv7Var.L(bv7Var2.r(this.a));
            }
            return 0L;
        }
        l37.d("Tried to open context menu before the anchor was placed.");
        oo3.f();
        return 0L;
    }

    @Override // defpackage.ume
    public final hkb n(bv7 bv7Var) {
        return z5c.g(j(bv7Var), 0L);
    }
}
