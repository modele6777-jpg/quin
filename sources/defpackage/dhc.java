package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dhc extends i09 implements kv7, wwc {
    public boolean E0;
    public ghc Z;

    @Override // defpackage.kv7
    public final int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        if (this.E0) {
            i = Integer.MAX_VALUE;
        }
        return tn8Var.n(i);
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        exc.p(hxcVar);
        final int i = 0;
        final int i2 = 1;
        rgc rgcVar = new rgc(new x16(this) { // from class: chc
            public final /* synthetic */ dhc b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int iJ;
                int i3 = i;
                dhc dhcVar = this.b;
                switch (i3) {
                    case 0:
                        iJ = dhcVar.Z.a.j();
                        break;
                    default:
                        iJ = dhcVar.Z.f.j();
                        break;
                }
                return Float.valueOf(iJ);
            }
        }, new x16(this) { // from class: chc
            public final /* synthetic */ dhc b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int iJ;
                int i3 = i2;
                dhc dhcVar = this.b;
                switch (i3) {
                    case 0:
                        iJ = dhcVar.Z.a.j();
                        break;
                    default:
                        iJ = dhcVar.Z.f.j();
                        break;
                }
                return Float.valueOf(iJ);
            }
        });
        if (!this.E0) {
            exc.i(hxcVar, rgcVar);
            return;
        }
        gxc gxcVar = cxc.w;
        wn7 wn7Var = exc.a[13];
        gxcVar.getClass();
        hxcVar.c(gxcVar, rgcVar);
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        y41.e(j, this.E0 ? ks9.a : ks9.b);
        cea ceaVarV = tn8Var.v(kl2.a(j, 0, this.E0 ? kl2.h(j) : Integer.MAX_VALUE, 0, this.E0 ? Integer.MAX_VALUE : kl2.g(j), 5));
        int i = ceaVarV.a;
        int iH = kl2.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = ceaVarV.b;
        int iG = kl2.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = ceaVarV.b - i2;
        int i4 = ceaVarV.a - i;
        if (!this.E0) {
            i3 = i4;
        }
        this.Z.g(i3);
        this.Z.b.k(this.E0 ? i2 : i);
        this.Z.c.k(this.E0 ? ceaVarV.b : ceaVarV.a);
        this.Z.d.setValue(Boolean.FALSE);
        return zn8Var.n0(i, i2, qu4.a, new g01(this, i3, ceaVarV));
    }

    @Override // defpackage.kv7
    public final int h(lg8 lg8Var, tn8 tn8Var, int i) {
        if (this.E0) {
            i = Integer.MAX_VALUE;
        }
        return tn8Var.q(i);
    }

    @Override // defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        if (!this.E0) {
            i = Integer.MAX_VALUE;
        }
        return tn8Var.b(i);
    }

    @Override // defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        if (!this.E0) {
            i = Integer.MAX_VALUE;
        }
        return tn8Var.V(i);
    }
}
