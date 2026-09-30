package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fqe extends aqe implements ug2 {
    public z2f F0;
    public jse G0;
    public ute H0;
    public boolean I0;
    public final vz9 J0;
    public final jx K0;
    public final oj8 L0;
    public lyd M0;

    public fqe(z2f z2fVar, jse jseVar, ute uteVar, boolean z) {
        this.F0 = z2fVar;
        this.G0 = jseVar;
        this.H0 = uteVar;
        this.I0 = z;
        vz9 vz9VarF = q1c.f(new e77(0L));
        this.J0 = vz9VarF;
        this.K0 = new jx(new hl9(sfc.g(this.F0, this.G0, this.H0, ((e77) vz9VarF.getValue()).a)), xvc.b, new hl9(xvc.c), 8);
        final int i = 0;
        a26 a26Var = new a26(this) { // from class: bqe
            public final /* synthetic */ fqe b;

            {
                this.b = this;
            }

            @Override // defpackage.a26
            public final Object d(Object obj) {
                int i2 = i;
                fqe fqeVar = this.b;
                switch (i2) {
                    case 0:
                        return (hl9) fqeVar.K0.e();
                    default:
                        bj4 bj4Var = (bj4) obj;
                        sw3 sw3Var = (sw3) eb3.H(fqeVar, zg2.h);
                        fqeVar.J0.setValue(new e77((((long) sw3Var.D0(bj4.b(bj4Var.a))) << 32) | (((long) sw3Var.D0(bj4.a(bj4Var.a))) & 4294967295L)));
                        return wef.a;
                }
            }
        };
        final int i2 = 1;
        a26 a26Var2 = new a26(this) { // from class: bqe
            public final /* synthetic */ fqe b;

            {
                this.b = this;
            }

            @Override // defpackage.a26
            public final Object d(Object obj) {
                int i3 = i2;
                fqe fqeVar = this.b;
                switch (i3) {
                    case 0:
                        return (hl9) fqeVar.K0.e();
                    default:
                        bj4 bj4Var = (bj4) obj;
                        sw3 sw3Var = (sw3) eb3.H(fqeVar, zg2.h);
                        fqeVar.J0.setValue(new e77((((long) sw3Var.D0(bj4.b(bj4Var.a))) << 32) | (((long) sw3Var.D0(bj4.a(bj4Var.a))) & 4294967295L)));
                        return wef.a;
                }
            }
        };
        if (!pj8.a()) {
            s8f.i("Magnifier is only supported on API level 28 and higher.");
            throw null;
        }
        oj8 oj8Var = new oj8(a26Var, a26Var2, Build.VERSION.SDK_INT == 28 ? gfa.a : ifa.a);
        l1(oj8Var);
        this.L0 = oj8Var;
    }

    @Override // defpackage.aqe, defpackage.wwc
    public final void R0(hxc hxcVar) {
        this.L0.R0(hxcVar);
    }

    @Override // defpackage.i09
    public final void d1() {
        p1();
    }

    @Override // defpackage.aqe
    public final void l0(yf9 yf9Var) {
        this.L0.l0(yf9Var);
    }

    @Override // defpackage.aqe, defpackage.pn4
    public final void o0(im2 im2Var) {
        vv7 vv7Var = (vv7) im2Var;
        vv7Var.a();
        this.L0.o0(vv7Var);
    }

    @Override // defpackage.aqe
    public final void o1(z2f z2fVar, jse jseVar, ute uteVar, boolean z) {
        z2f z2fVar2 = this.F0;
        jse jseVar2 = this.G0;
        ute uteVar2 = this.H0;
        boolean z2 = this.I0;
        this.F0 = z2fVar;
        this.G0 = jseVar;
        this.H0 = uteVar;
        this.I0 = z;
        if (pa7.t(z2fVar, z2fVar2) && jseVar == jseVar2 && pa7.t(uteVar, uteVar2) && z == z2) {
            return;
        }
        p1();
    }

    public final void p1() {
        lyd lydVar = this.M0;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.M0 = null;
        if (pj8.a()) {
            if (!this.I0 && (((hl9) this.K0.e()).a & 9223372034707292159L) != 9205357640488583168L) {
                ynb.V(Z0(), null, dw2.d, new cqe(this, null), 1);
            }
            this.M0 = ynb.V(Z0(), null, null, new eqe(this, null), 3);
        }
    }
}
