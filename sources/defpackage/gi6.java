package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gi6 extends i09 implements ug2, mb6, zu7, pn4, i4f, al9 {
    public ii6 E0;
    public lyd F0;
    public final sh6 Z;

    public gi6(ii6 ii6Var) {
        sh6 sh6Var = new sh6();
        this.Z = sh6Var;
        sh6Var.c.k(0.0f);
        this.E0 = ii6Var;
    }

    @Override // defpackage.al9
    public final void A0() {
        if9.C(this, new uo2(27, this));
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.i09
    public final void d1() {
        vb2 vb2Var;
        ii6 ii6Var = this.E0;
        ii6Var.getClass();
        sh6 sh6Var = this.Z;
        sh6Var.getClass();
        ii6Var.a.add(sh6Var);
        Context baseContext = (Context) eb3.H(this, uq.b);
        while (true) {
            if (!(baseContext instanceof vb2)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    vb2Var = null;
                    break;
                } else {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    baseContext.getClass();
                }
            } else {
                vb2Var = (vb2) baseContext;
                break;
            }
        }
        if (vb2Var != null) {
            ynb.V(Z0(), null, null, new hi6(vb2Var, this, null), 3);
        }
        A0();
    }

    @Override // defpackage.i09
    public final void e1() {
        sh6 sh6Var = this.Z;
        sh6Var.a.setValue(new hl9(9205357640488583168L));
        sh6Var.b.setValue(new ald(9205357640488583168L));
        sh6Var.g = false;
        ke6 ke6VarA = sh6Var.a();
        if (ke6VarA != null) {
            ((ie6) eb3.H(this, zg2.g)).a(ke6VarA);
        }
        sh6Var.f.setValue(null);
        ii6 ii6Var = this.E0;
        ii6Var.getClass();
        ii6Var.a.remove(sh6Var);
    }

    @Override // defpackage.i09
    public final void f1() {
        sh6 sh6Var = this.Z;
        sh6Var.a.setValue(new hl9(9205357640488583168L));
        sh6Var.b.setValue(new ald(9205357640488583168L));
        sh6Var.g = false;
    }

    @Override // defpackage.mb6
    public final void l0(yf9 yf9Var) {
        if (this.Y) {
            long jR = yf9Var.r(0L);
            sh6 sh6Var = this.Z;
            sh6Var.a.setValue(new hl9(jR));
            sh6Var.b.setValue(new ald(db6.Y0(yf9Var.l())));
            sh6Var.d = ((View) eb3.H(this, uq.f)).getWindowId();
        }
    }

    public final lyd l1() {
        return ynb.V(Z0(), null, null, new fi6(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:3:0x0004, B:7:0x0010, B:9:0x0023, B:11:0x0031, B:20:0x0045, B:19:0x003c, B:21:0x0057), top: B:25:0x0004 }] */
    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        sh6 sh6Var = this.Z;
        try {
            sh6Var.g = true;
            if (this.Y) {
                if (ym8.L(ald.c(((vv7) im2Var).a.f())) >= 1) {
                    ie6 ie6Var = (ie6) eb3.H(this, zg2.g);
                    ke6 ke6VarA = sh6Var.a();
                    if (ke6VarA == null) {
                        ke6VarA = ie6Var.c();
                        sh6Var.f.setValue(ke6VarA);
                    } else {
                        if (ke6VarA.s) {
                            ke6VarA = null;
                        }
                        if (ke6VarA == null) {
                            ke6VarA = ie6Var.c();
                            sh6Var.f.setValue(ke6VarA);
                        }
                    }
                    sn4.j0((vv7) im2Var, ke6VarA, new uh6((vv7) im2Var, ke6VarA));
                    i7h.r(im2Var, ke6VarA);
                } else {
                    tm7.y((vv7) im2Var);
                }
            }
        } finally {
            sh6Var.g = false;
            l1();
        }
    }

    @Override // defpackage.zu7
    public final void p(bv7 bv7Var) {
        sh6 sh6Var = this.Z;
        bv7Var.getClass();
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            if ((sh6Var.b() & 9223372034707292159L) == 9205357640488583168L && this.Y) {
                sh6Var.a.setValue(new hl9(bv7Var.r(0L)));
                sh6Var.b.setValue(new ald(db6.Y0(bv7Var.l())));
                sh6Var.d = ((View) eb3.H(this, uq.f)).getWindowId();
            }
        } finally {
            iqf.p(irdVarJ, irdVarL, a26VarE);
        }
    }

    @Override // defpackage.i4f
    public final Object q() {
        return mi6.b;
    }
}
