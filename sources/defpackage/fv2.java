package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fv2 extends sv3 implements wwc {
    public w2f F0;
    public zse G0;
    public r38 H0;
    public boolean I0;
    public sl9 J0;
    public cre K0;
    public rx6 L0;
    public fo5 M0;

    public static void o1(r38 r38Var, String str, boolean z) {
        if (z) {
            jte jteVar = r38Var.e;
            ou2 ou2Var = r38Var.v;
            if (jteVar == null) {
                int length = str.length();
                ou2Var.d(new zse(4, u3c.b(length, length), str));
            } else {
                zse zseVarJ = r38Var.d.j(t72.I(new fw3(), new ba2(str, 1)));
                jteVar.a(null, zseVarJ);
                ou2Var.d(zseVarJ);
            }
        }
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        k00 k00Var = this.G0.a;
        wn7[] wn7VarArr = exc.a;
        gxc gxcVar = cxc.F;
        wn7[] wn7VarArr2 = exc.a;
        wn7 wn7Var = wn7VarArr2[18];
        gxcVar.getClass();
        hxcVar.c(gxcVar, k00Var);
        k00 k00Var2 = this.F0.a;
        gxc gxcVar2 = cxc.G;
        wn7 wn7Var2 = wn7VarArr2[19];
        gxcVar2.getClass();
        hxcVar.c(gxcVar2, k00Var2);
        long j = this.G0.b;
        gxc gxcVar3 = cxc.H;
        wn7 wn7Var3 = wn7VarArr2[20];
        eue eueVar = new eue(j);
        gxcVar3.getClass();
        hxcVar.c(gxcVar3, eueVar);
        exc.e(hxcVar, ndb.L0);
        exc.h(hxcVar, new yr(AutofillValue.forText(lmg.r0(this.G0.a))));
        exc.b(hxcVar, new ev2(this, 0));
        int i = this.L0.d;
        if (i == 6) {
            en2.a.getClass();
            exc.g(hxcVar, dn2.c);
        } else if (i == 7 || i == 8) {
            en2.a.getClass();
            exc.g(hxcVar, dn2.b);
        } else if (i == 4) {
            en2.a.getClass();
            exc.g(hxcVar, dn2.d);
        }
        if (!this.I0) {
            hxcVar.c(cxc.j, wef.a);
        }
        boolean z = this.I0;
        gxc gxcVar4 = cxc.Q;
        wn7 wn7Var4 = wn7VarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z);
        gxcVar4.getClass();
        hxcVar.c(gxcVar4, boolValueOf);
        exc.a(hxcVar, new ev2(this, 1));
        if (z) {
            hxcVar.c(swc.k, new f6(null, new ev2(this, 2)));
            hxcVar.c(swc.o, new f6(null, new ev2(this, hxcVar)));
        }
        hxcVar.c(swc.j, new f6(null, new g20(9, this)));
        exc.c(hxcVar, this.L0.e, new dv2(this, 6));
        hxcVar.c(swc.b, new f6(null, new dv2(this, 7)));
        hxcVar.c(swc.c, new f6(null, new dv2(this, 1)));
        if (!eue.d(this.G0.b)) {
            hxcVar.c(swc.q, new f6(null, new dv2(this, 2)));
            if (this.I0) {
                hxcVar.c(swc.r, new f6(null, new dv2(this, 3)));
            }
        }
        if (this.I0) {
            hxcVar.c(swc.s, new f6(null, new dv2(this, 5)));
        }
    }

    @Override // defpackage.wwc
    public final boolean S0() {
        return true;
    }
}
