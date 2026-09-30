package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class juc extends sv3 implements kv7, pn4, mb6, ug2, al9, zu7, mff {
    public hvc F0;
    public final ome G0;
    public boolean H0;

    public juc(k00 k00Var, mue mueVar, xp5 xp5Var, a26 a26Var, int i, boolean z, int i2, int i3, List list, a26 a26Var2, hvc hvcVar, k82 k82Var, co0 co0Var) {
        this.F0 = hvcVar;
        ome omeVar = new ome(k00Var, mueVar, xp5Var, a26Var, i, z, i2, i3, list, a26Var2, hvcVar, k82Var, co0Var, null);
        l1(omeVar);
        this.G0 = omeVar;
        if (this.F0 == null) {
            throw ub3.e("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // defpackage.al9
    public final void A0() {
        hvc hvcVar = this.F0;
        if (hvcVar != null) {
            hvcVar.d = ta0.j(hvcVar.d, null, null, o1(), 3);
        }
    }

    @Override // defpackage.kv7
    public final int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        return this.G0.E0(lg8Var, tn8Var, i);
    }

    @Override // defpackage.mff
    public final void Y0() {
        if (this.H0) {
            this.H0 = false;
            hvc hvcVar = this.F0;
            if (hvcVar != null) {
                hvcVar.b();
            }
        }
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        return this.G0.d(zn8Var, tn8Var, j);
    }

    @Override // defpackage.i09
    public final void d1() {
        hvc hvcVar = this.F0;
        if (hvcVar != null) {
            hvcVar.d = ta0.j(hvcVar.d, null, null, o1(), 3);
        }
    }

    @Override // defpackage.i09
    public final void e1() {
        hvc hvcVar = this.F0;
        if (hvcVar != null) {
            hvcVar.d = ta0.j(hvcVar.d, null, null, null, 3);
        }
    }

    @Override // defpackage.kv7
    public final int h(lg8 lg8Var, tn8 tn8Var, int i) {
        return this.G0.h(lg8Var, tn8Var, i);
    }

    @Override // defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        return this.G0.i0(lg8Var, tn8Var, i);
    }

    @Override // defpackage.mb6
    public final void l0(yf9 yf9Var) {
        hvc hvcVar = this.F0;
        if (hvcVar != null) {
            hvcVar.d = ta0.j(hvcVar.d, yf9Var, null, null, 6);
            owc owcVar = hvcVar.b;
            long j = hvcVar.a;
            owcVar.a = false;
            cvc cvcVar = owcVar.e;
            if (cvcVar != null) {
                cvcVar.d(Long.valueOf(j));
            }
        }
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) throws Throwable {
        this.G0.o0(im2Var);
    }

    public final a08 o1() {
        mmb mmbVar = new mmb();
        if9.C(this, new ykc(2, mmbVar, this));
        return (a08) mmbVar.element;
    }

    @Override // defpackage.zu7
    public final void p(bv7 bv7Var) {
        if (this.H0) {
            return;
        }
        this.H0 = true;
        hvc hvcVar = this.F0;
        if (hvcVar != null) {
            hvcVar.a();
        }
    }

    @Override // defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        return this.G0.u0(lg8Var, tn8Var, i);
    }
}
