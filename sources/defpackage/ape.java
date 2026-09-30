package defpackage;

import android.view.KeyEvent;
import android.view.autofill.AutofillValue;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ape extends sv3 implements pn4, cga, wwc, mb6, ria, qo7, ug2, p09, al9, zu7, eo5 {
    public z2f F0;
    public ute G0;
    public jse H0;
    public boolean I0;
    public wo7 J0;
    public dwd K0;
    public boolean L0;
    public t69 M0;
    public b89 N0;
    public final vo5 O0;
    public final obe P0;
    public gj4 Q0;
    public final lj4 R0;
    public e7g S0;
    public lyd T0;
    public final ta0 U0;
    public final moe V0;
    public lyd W0;
    public final koe X0;
    public final vz9 Y0;

    public ape(z2f z2fVar, ute uteVar, jse jseVar, u47 u47Var, boolean z, wo7 wo7Var, dwd dwdVar, boolean z2, t69 t69Var, b89 b89Var) {
        this.F0 = z2fVar;
        this.G0 = uteVar;
        this.H0 = jseVar;
        this.I0 = z;
        this.J0 = wo7Var;
        this.K0 = dwdVar;
        this.L0 = z2;
        this.M0 = t69Var;
        this.N0 = b89Var;
        int i = 3;
        jseVar.l = new koe(this, i);
        int i2 = 0;
        this.O0 = new vo5(t69Var, new loe(this, i2), 2);
        sr srVar = new sr(9, this);
        hia hiaVar = ibe.a;
        obe obeVar = new obe(null, null, null, srVar);
        l1(obeVar);
        this.P0 = obeVar;
        int i3 = 5;
        koe koeVar = new koe(this, i3);
        moe moeVar = new moe(this, i2);
        int i4 = 1;
        int i5 = 4;
        lj4 lj4Var = new lj4(new ks2(25, new trd(13, koeVar), new epe(new loe(this, i4), moeVar, new loe(this, 2), new loe(this, i), new loe(this, i5), new loe(this, i3))), 1);
        l1(lj4Var);
        this.R0 = lj4Var;
        this.U0 = new ta0(7);
        this.V0 = new moe(this, i4);
        this.X0 = new koe(this, i5);
        this.Y0 = q1c.f(Boolean.FALSE);
    }

    @Override // defpackage.al9
    public final void A0() {
        if9.C(this, new koe(this, 1));
    }

    @Override // defpackage.ria
    public final void E(hia hiaVar, iia iiaVar, long j) {
        this.P0.E(hiaVar, iiaVar, j);
    }

    @Override // defpackage.eo5
    public final void K(co5 co5Var) {
        bv7 bv7VarB;
        jse jseVar = this.H0;
        ute uteVar = jseVar.b;
        ste steVarC = uteVar.c();
        hkb hkbVarF = hkb.e;
        if (steVarC != null) {
            if (jseVar.h) {
                vne vneVarD = jseVar.a.d();
                if (eue.d(vneVarD.d)) {
                    hkbVarF = jseVar.a(steVarC, vneVarD);
                } else {
                    long j = vneVarD.d;
                    if (!eue.d(j)) {
                        int i = (int) (j >> 32);
                        b59 b59Var = steVarC.b;
                        int iD = b59Var.d(i);
                        int i2 = (int) (4294967295L & j);
                        int iD2 = b59Var.d(i2);
                        if (iD == iD2) {
                            float fG = steVarC.g(i, true);
                            float fG2 = steVarC.g(i2, true);
                            hkbVarF = new hkb(Math.min(fG, fG2), b59Var.f(iD), Math.max(fG, fG2), b59Var.b(iD2));
                        } else {
                            hkbVarF = steVarC.l(eue.g(j), eue.f(j)).f();
                        }
                    }
                }
                bv7 bv7VarE = uteVar.e();
                if (bv7VarE != null) {
                    if (!bv7VarE.h()) {
                        bv7VarE = null;
                    }
                    if (bv7VarE != null && (bv7VarB = uteVar.b()) != null) {
                        bv7 bv7Var = bv7VarB.h() ? bv7VarB : null;
                        if (bv7Var != null) {
                            hkbVarF = hkbVarF.k(bv7Var.M(bv7VarE, false).f());
                        }
                    }
                }
            } else {
                hkbVarF = hj6.J0;
            }
        }
        co5Var.d(hkbVarF);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:223:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:231:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:234:0x0511  */
    /* JADX WARN: Code duplicated, block: B:237:0x051a  */
    /* JADX WARN: Code duplicated, block: B:239:0x0526  */
    /* JADX WARN: Code duplicated, block: B:240:0x052f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ff  */
    @Override // defpackage.qo7
    public final boolean M(KeyEvent keyEvent) {
        boolean z;
        float fIntBitsToFloat;
        lo7 lo7Var;
        boolean zR1;
        boolean z2;
        lo7 lo7Var2;
        vne vneVar;
        q2g q2gVar;
        hkb hkbVarM;
        Integer numA;
        z2f z2fVar = this.F0;
        ute uteVar = this.G0;
        jse jseVar = this.H0;
        vsd vsdVarS1 = s1();
        boolean z3 = this.I0;
        boolean z4 = this.L0;
        ta0 ta0Var = this.U0;
        ta0Var.getClass();
        jqe jqeVar = (jqe) ta0Var.c;
        if (nk8.r(keyEvent) == 2 && keyEvent.isFromSource(257) && (!afc.i(keyEvent) || !hfc.f(keyEvent))) {
            jseVar.v(false);
        }
        long jG = k99.g(keyEvent.getKeyCode());
        if (nk8.r(keyEvent) == 1) {
            z69 z69Var = (z69) ta0Var.b;
            if (z69Var != null && z69Var.a(jG)) {
                z69 z69Var2 = (z69) ta0Var.b;
                if (z69Var2 != null) {
                    z69Var2.e(jG);
                }
                return true;
            }
        } else if (nk8.r(keyEvent) != 0 || hfc.f(keyEvent)) {
            if (!hfc.f(keyEvent) || (numA = ((ih3) ta0Var.d).a(keyEvent)) == null) {
                lo7 lo7VarH = to7.a.h(keyEvent);
                if (lo7VarH == null || (lo7VarH.a() && !z3)) {
                    z = false;
                } else {
                    ste steVarC = uteVar.c();
                    bv7 bv7VarE = uteVar.e();
                    if (bv7VarE == null) {
                        fIntBitsToFloat = Float.NaN;
                    } else {
                        if (!bv7VarE.h()) {
                            bv7VarE = null;
                        }
                        if (bv7VarE == null) {
                            fIntBitsToFloat = Float.NaN;
                        } else {
                            bv7 bv7VarB = uteVar.b();
                            if (bv7VarB == null) {
                                hkbVarM = null;
                            } else {
                                if (!bv7VarB.h()) {
                                    bv7VarB = null;
                                }
                                if (bv7VarB != null) {
                                    hkbVarM = bv7VarB.M(bv7VarE, true);
                                } else {
                                    hkbVarM = null;
                                }
                            }
                            if (hkbVarM != null) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (hkbVarM.e() & 4294967295L));
                            } else {
                                fIntBitsToFloat = Float.NaN;
                            }
                        }
                    }
                    nwc nwcVar = new nwc(z2fVar, steVarC, afc.i(keyEvent), afc.h(keyEvent), fIntBitsToFloat, jqeVar);
                    vz9 vz9Var = z2fVar.e;
                    use useVar = z2fVar.a;
                    int iOrdinal = lo7VarH.ordinal();
                    String str = nwcVar.k;
                    switch (iOrdinal) {
                        case 0:
                            lo7Var = lo7VarH;
                            jqeVar.a = Float.NaN;
                            if (str.length() > 0) {
                                if (!eue.d(nwcVar.i)) {
                                    boolean zB = nwcVar.b();
                                    long j = nwcVar.i;
                                    if (zB) {
                                        int iG = eue.g(j);
                                        nwcVar.i = u3c.b(iG, iG);
                                    } else {
                                        int iF = eue.f(j);
                                        nwcVar.i = u3c.b(iF, iF);
                                    }
                                } else if (nwcVar.b()) {
                                    nwcVar.j();
                                } else {
                                    nwcVar.g();
                                }
                            }
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2 || lo7Var == lo7.z || lo7Var == lo7.a || lo7Var == lo7.b) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = zR1;
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 1:
                            lo7Var = lo7VarH;
                            jqeVar.a = Float.NaN;
                            if (str.length() > 0) {
                                if (!eue.d(nwcVar.i)) {
                                    boolean zB2 = nwcVar.b();
                                    long j2 = nwcVar.i;
                                    if (zB2) {
                                        int iF2 = eue.f(j2);
                                        nwcVar.i = u3c.b(iF2, iF2);
                                    } else {
                                        int iG2 = eue.g(j2);
                                        nwcVar.i = u3c.b(iG2, iG2);
                                    }
                                } else if (nwcVar.b()) {
                                    nwcVar.g();
                                } else {
                                    nwcVar.j();
                                }
                            }
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 2:
                            lo7Var = lo7VarH;
                            if (nwcVar.b()) {
                                nwcVar.i();
                            } else {
                                nwcVar.l();
                            }
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 3:
                            lo7Var = lo7VarH;
                            if (nwcVar.b()) {
                                nwcVar.l();
                            } else {
                                nwcVar.i();
                            }
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 4:
                            lo7Var = lo7VarH;
                            nwcVar.h();
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 5:
                            lo7Var = lo7VarH;
                            nwcVar.k();
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 6:
                            lo7Var = lo7VarH;
                            nwcVar.p();
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 7:
                            lo7Var = lo7VarH;
                            nwcVar.o();
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 8:
                            lo7Var = lo7VarH;
                            if (nwcVar.b()) {
                                nwcVar.p();
                            } else {
                                nwcVar.o();
                            }
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 9:
                            lo7Var = lo7VarH;
                            if (nwcVar.b()) {
                                nwcVar.o();
                            } else {
                                nwcVar.p();
                            }
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            lo7Var = lo7VarH;
                            nwcVar.q();
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            lo7Var = lo7VarH;
                            nwcVar.e();
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            lo7Var = lo7VarH;
                            ((dw3) vsdVarS1).b();
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            lo7Var = lo7VarH;
                            nwcVar.r();
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 14:
                            lo7Var = lo7VarH;
                            nwcVar.f();
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 15:
                            lo7Var = lo7VarH;
                            nwcVar.n();
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                            lo7Var = lo7VarH;
                            nwcVar.m();
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 17:
                        case 18:
                        case 19:
                            lo7Var = lo7VarH;
                            this.V0.z(lo7Var, Boolean.valueOf(afc.h(keyEvent)));
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 20:
                            jqeVar.a = Float.NaN;
                            if (str.length() > 0) {
                                long j3 = nwcVar.i;
                                int i = eue.c;
                                int i2 = (int) (j3 & 4294967295L);
                                int iOffsetByCodePoints = -1;
                                if (i2 > 0) {
                                    jt4 jt4VarG = dec.g();
                                    if (jt4VarG != null) {
                                        int iB = jt4VarG.b(str, i2 - 1);
                                        if (iB >= 0) {
                                            iOffsetByCodePoints = iB;
                                        } else if (i2 > 0) {
                                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                                        }
                                    } else if (i2 > 0) {
                                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                                    }
                                }
                                long jF = q3c.f(iOffsetByCodePoints, i2, z2fVar);
                                int i3 = (int) (jF >> 32);
                                q2g q2gVarE = qk2.E(jF);
                                if (i3 != i2 || !eue.d(nwcVar.i)) {
                                    nwcVar.i = u3c.b(i3, i3);
                                }
                                if (q2gVarE != null) {
                                    nwcVar.j = q2gVarE;
                                }
                            }
                            nwcVar.a();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 21:
                            nwcVar.g();
                            nwcVar.a();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 22:
                            nwcVar.l();
                            nwcVar.a();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 23:
                            nwcVar.i();
                            nwcVar.a();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 24:
                            nwcVar.p();
                            nwcVar.a();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 25:
                            nwcVar.o();
                            nwcVar.a();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 26:
                            jqeVar.a = Float.NaN;
                            if (str.length() > 0) {
                                nwcVar.i = u3c.b(0, str.length());
                            }
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 27:
                            if (nwcVar.b()) {
                                nwcVar.j();
                            } else {
                                nwcVar.g();
                            }
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 28:
                            if (nwcVar.b()) {
                                nwcVar.g();
                            } else {
                                nwcVar.j();
                            }
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 29:
                            nwcVar.q();
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 30:
                            nwcVar.e();
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 31:
                            nwcVar.r();
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                            nwcVar.f();
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 33:
                            nwcVar.n();
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 34:
                            nwcVar.m();
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 35:
                            if (nwcVar.b()) {
                                nwcVar.l();
                            } else {
                                nwcVar.i();
                            }
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 36:
                            if (nwcVar.b()) {
                                nwcVar.i();
                            } else {
                                nwcVar.l();
                            }
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 37:
                            nwcVar.h();
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 38:
                            nwcVar.k();
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 39:
                            nwcVar.p();
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 40:
                            nwcVar.o();
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 41:
                            if (nwcVar.b()) {
                                nwcVar.p();
                            } else {
                                nwcVar.o();
                            }
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 42:
                            if (nwcVar.b()) {
                                nwcVar.o();
                            } else {
                                nwcVar.p();
                            }
                            nwcVar.s();
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 43:
                            jqeVar.a = Float.NaN;
                            if (str.length() > 0) {
                                long j4 = nwcVar.i;
                                int i4 = eue.c;
                                int i5 = (int) (j4 & 4294967295L);
                                nwcVar.i = u3c.b(i5, i5);
                            }
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 44:
                            if (z4) {
                                zR1 = r1(this.J0.a());
                            } else {
                                z2f.h(z2fVar, "\n", !afc.i(keyEvent), afc.h(keyEvent), 4);
                                zR1 = true;
                            }
                            lo7Var = lo7VarH;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 45:
                            if (z4) {
                                z2 = false;
                            } else {
                                z2f.h(z2fVar, "\t", !afc.i(keyEvent), afc.h(keyEvent), 4);
                                z2 = true;
                            }
                            zR1 = z2;
                            lo7Var = lo7VarH;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 46:
                            use useVar2 = useVar.g.a;
                            lqb lqbVar = useVar2.a;
                            ibf ibfVar = (ibf) lqbVar.b;
                            jsd jsdVar = ibfVar.b;
                            if (!jsdVar.isEmpty() || ((vue) ((vz9) lqbVar.c).getValue()) != null) {
                                lqbVar.g();
                                if (jsdVar.isEmpty()) {
                                    l37.c("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
                                }
                                Object objK0 = x72.k0(jsdVar);
                                ibfVar.c.add(objK0);
                                vue vueVar = (vue) objK0;
                                useVar2.b.a().v();
                                une uneVar = useVar2.b;
                                int i6 = vueVar.a;
                                uneVar.c(i6, vueVar.c.length() + i6, vueVar.b);
                                long j5 = vueVar.d;
                                xdc.u(uneVar, (int) (j5 >> 32), (int) (j5 & 4294967295L));
                                useVar2.j(useVar2.d(), une.i(useVar2.b, 0L, null, 15), true);
                            }
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case 47:
                            use useVar3 = useVar.g.a;
                            lqb lqbVar2 = useVar3.a;
                            ibf ibfVar2 = (ibf) lqbVar2.b;
                            jsd jsdVar2 = ibfVar2.c;
                            if (!jsdVar2.isEmpty() && ((vue) ((vz9) lqbVar2.c).getValue()) == null) {
                                if (jsdVar2.isEmpty()) {
                                    l37.c("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
                                }
                                Object objK1 = x72.k0(jsdVar2);
                                ibfVar2.b.add(objK1);
                                vue vueVar2 = (vue) objK1;
                                useVar3.b.a().v();
                                une uneVar2 = useVar3.b;
                                int i7 = vueVar2.a;
                                uneVar2.c(i7, vueVar2.b.length() + i7, vueVar2.c);
                                long j6 = vueVar2.e;
                                xdc.u(uneVar2, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                                useVar3.j(useVar3.d(), une.i(useVar3.b, 0L, null, 15), true);
                            }
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        case z7c.f /* 48 */:
                            lo7Var = lo7VarH;
                            zR1 = true;
                            lo7Var2 = lo7.y;
                            vneVar = nwcVar.g;
                            if (lo7Var != lo7Var2) {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            } else {
                                z = !eue.c(vneVar.d, nwcVar.i);
                            }
                            if (!eue.c(nwcVar.i, vneVar.d)) {
                                z2fVar.j(nwcVar.i);
                            }
                            q2gVar = nwcVar.j;
                            if (q2gVar != null) {
                                if (!eue.d(useVar.d().d)) {
                                    vz9Var.setValue(new rwc(nwcVar.h.a, q2gVar));
                                } else {
                                    vz9Var.setValue(new rwc(q2gVar, q2gVar));
                                }
                            }
                            break;
                        default:
                            ap.c();
                            return false;
                    }
                }
            } else {
                String string = new StringBuilder(2).appendCodePoint(numA.intValue()).toString();
                if (z3) {
                    z2f.h(z2fVar, string, !afc.i(keyEvent), afc.h(keyEvent), 4);
                    jqeVar.a = Float.NaN;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                z69 z69Var3 = (z69) ta0Var.b;
                if (z69Var3 == null) {
                    z69Var3 = new z69(3);
                    ta0Var.b = z69Var3;
                }
                z69Var3.d(jG);
            }
            return z;
        }
        return false;
    }

    @Override // defpackage.ria
    public final void N() {
        this.P0.N();
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        vne vneVarD = this.F0.a.d();
        long j = vneVarD.d;
        k00 k00Var = new k00(this.F0.a.d().c.toString());
        wn7[] wn7VarArr = exc.a;
        gxc gxcVar = cxc.F;
        wn7[] wn7VarArr2 = exc.a;
        wn7 wn7Var = wn7VarArr2[18];
        gxcVar.getClass();
        hxcVar.c(gxcVar, k00Var);
        k00 k00Var2 = new k00(vneVarD.c.toString());
        gxc gxcVar2 = cxc.G;
        wn7 wn7Var2 = wn7VarArr2[19];
        gxcVar2.getClass();
        hxcVar.c(gxcVar2, k00Var2);
        gxc gxcVar3 = cxc.H;
        wn7 wn7Var3 = wn7VarArr2[20];
        eue eueVar = new eue(j);
        gxcVar3.getClass();
        hxcVar.c(gxcVar3, eueVar);
        eue eueVar2 = this.F0.a.d().e;
        gxc gxcVar4 = cxc.I;
        wn7 wn7Var4 = wn7VarArr2[21];
        gxcVar4.getClass();
        hxcVar.c(gxcVar4, eueVar2);
        t47 t47Var = new t47(((Boolean) this.F0.a.e.getValue()).booleanValue(), ((Boolean) this.F0.a.f.getValue()).booleanValue());
        gxc gxcVar5 = cxc.M;
        wn7 wn7Var5 = wn7VarArr2[27];
        gxcVar5.getClass();
        hxcVar.c(gxcVar5, t47Var);
        if (!this.I0) {
            hxcVar.c(cxc.j, wef.a);
        }
        final boolean z = this.I0;
        gxc gxcVar6 = cxc.Q;
        wn7 wn7Var6 = wn7VarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z);
        gxcVar6.getClass();
        hxcVar.c(gxcVar6, boolValueOf);
        exc.e(hxcVar, ndb.L0);
        exc.h(hxcVar, new yr(AutofillValue.forText(lmg.r0(vneVarD))));
        final int i = 0;
        exc.b(hxcVar, new a26() { // from class: joe
            @Override // defpackage.a26
            public final Object d(Object obj) {
                int i2 = i;
                boolean z2 = true;
                ape apeVar = this;
                boolean z3 = z;
                switch (i2) {
                    case 0:
                        yr yrVar = (yr) obj;
                        if (z3) {
                            AutofillValue autofillValue = yrVar.a;
                            CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                            if (textValue != null) {
                                apeVar.F0.g(textValue);
                            }
                            apeVar.Y0.setValue(Boolean.TRUE);
                            ynb.V(apeVar.Z0(), null, null, new qoe(apeVar, null), 3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        k00 k00Var3 = (k00) obj;
                        if (z3) {
                            apeVar.F0.g(k00Var3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        k00 k00Var4 = (k00) obj;
                        if (z3) {
                            z2f.h(apeVar.F0, k00Var4, false, false, 28);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        });
        int i2 = this.J0.c;
        int i3 = 8;
        int i4 = 4;
        int i5 = 6;
        if (i2 == 6) {
            en2.a.getClass();
            exc.g(hxcVar, dn2.c);
        } else if (i2 == 7 || i2 == 8) {
            en2.a.getClass();
            exc.g(hxcVar, dn2.b);
        } else if (i2 == 4) {
            en2.a.getClass();
            exc.g(hxcVar, dn2.d);
        }
        exc.a(hxcVar, new loe(this, i5));
        if (z) {
            final int i6 = 1;
            hxcVar.c(swc.k, new f6(null, new a26() { // from class: joe
                @Override // defpackage.a26
                public final Object d(Object obj) {
                    int i7 = i6;
                    boolean z2 = true;
                    ape apeVar = this;
                    boolean z3 = z;
                    switch (i7) {
                        case 0:
                            yr yrVar = (yr) obj;
                            if (z3) {
                                AutofillValue autofillValue = yrVar.a;
                                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                                if (textValue != null) {
                                    apeVar.F0.g(textValue);
                                }
                                apeVar.Y0.setValue(Boolean.TRUE);
                                ynb.V(apeVar.Z0(), null, null, new qoe(apeVar, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            k00 k00Var3 = (k00) obj;
                            if (z3) {
                                apeVar.F0.g(k00Var3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            k00 k00Var4 = (k00) obj;
                            if (z3) {
                                z2f.h(apeVar.F0, k00Var4, false, false, 28);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
            final int i7 = 2;
            hxcVar.c(swc.o, new f6(null, new a26() { // from class: joe
                @Override // defpackage.a26
                public final Object d(Object obj) {
                    int i8 = i7;
                    boolean z2 = true;
                    ape apeVar = this;
                    boolean z3 = z;
                    switch (i8) {
                        case 0:
                            yr yrVar = (yr) obj;
                            if (z3) {
                                AutofillValue autofillValue = yrVar.a;
                                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                                if (textValue != null) {
                                    apeVar.F0.g(textValue);
                                }
                                apeVar.Y0.setValue(Boolean.TRUE);
                                ynb.V(apeVar.Z0(), null, null, new qoe(apeVar, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            k00 k00Var3 = (k00) obj;
                            if (z3) {
                                apeVar.F0.g(k00Var3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            k00 k00Var4 = (k00) obj;
                            if (z3) {
                                z2f.h(apeVar.F0, k00Var4, false, false, 28);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
        }
        hxcVar.c(swc.j, new f6(null, new jxc(i4, this)));
        int iA = this.J0.a();
        exc.c(hxcVar, iA, new uj(this, iA, i4));
        hxcVar.c(swc.b, new f6(null, new koe(this, i3)));
        hxcVar.c(swc.c, new f6(null, new koe(this, 9)));
        if (!eue.d(j)) {
            hxcVar.c(swc.q, new f6(null, new koe(this, 10)));
            if (this.I0) {
                hxcVar.c(swc.r, new f6(null, new koe(this, i)));
            }
        }
        if (z) {
            hxcVar.c(swc.s, new f6(null, new koe(this, i5)));
        }
        if (this.I0) {
            this.O0.R0(hxcVar);
        }
    }

    @Override // defpackage.wwc
    public final boolean S0() {
        return true;
    }

    @Override // defpackage.zu7, defpackage.co8
    public final void a(long j) {
        this.R0.G0 = j;
    }

    @Override // defpackage.i09
    public final void d1() {
        if9.C(this, new koe(this, 1));
        this.H0.m = this.X0;
        if (this.I0) {
            l1(this.O0);
        }
    }

    @Override // defpackage.i09
    public final void e1() {
        o1();
        this.H0.m = null;
    }

    @Override // defpackage.qo7
    public final boolean l(KeyEvent keyEvent) {
        z2f z2fVar = this.F0;
        jse jseVar = this.H0;
        s1();
        this.U0.getClass();
        if (eue.d(z2fVar.d().d) || keyEvent.getKeyCode() != 4 || nk8.r(keyEvent) != 1) {
            return false;
        }
        z2f z2fVar2 = jseVar.a;
        if (!eue.d(z2fVar2.d().d)) {
            use useVar = z2fVar2.a;
            u47 u47Var = z2fVar2.b;
            useVar.b.a().v();
            une uneVar = useVar.b;
            int i = (int) (uneVar.g & 4294967295L);
            xdc.u(uneVar, i, i);
            useVar.b(u47Var, true, fpe.a);
            useVar.g(true);
            useVar.f(useVar.b.e);
        }
        jseVar.w(false);
        jseVar.x(sue.a);
        return true;
    }

    @Override // defpackage.mb6
    public final void l0(yf9 yf9Var) {
        this.G0.f.setValue(yf9Var);
        if (this.I0) {
            this.O0.l0(yf9Var);
        }
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        vv7 vv7Var = (vv7) im2Var;
        vv7Var.a();
        if (((Boolean) this.Y0.getValue()).booleanValue()) {
            b41 dtdVar = (b41) eb3.H(this, uq0.a);
            long j = ((y72) eb3.H(this, uq0.b)).a;
            long jC = abg.c(1308617531);
            int i = y72.l;
            if (!faf.a(j, jC)) {
                dtdVar = new dtd(j);
            }
            sn4.O0(vv7Var, dtdVar, 0L, 0L, 0.0f, null, null, 0, 126);
        }
    }

    public final void o1() {
        lyd lydVar = this.W0;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.W0 = null;
        b89 b89Var = this.N0;
        if (b89Var != null) {
            b89Var.h();
        }
    }

    @Override // defpackage.zu7
    public final void p(bv7 bv7Var) {
        this.R0.getClass();
    }

    public final void p1() {
        gj4 gj4Var = this.Q0;
        if (gj4Var != null) {
            ((u69) this.M0).b(new hj4(gj4Var));
            this.Q0 = null;
        }
    }

    public final boolean q1() {
        e7g e7gVar;
        return this.O0.K0.q1().b() && (e7gVar = this.S0) != null && ((b28) e7gVar).a();
    }

    public final boolean r1(int i) {
        dwd dwdVar;
        if (i != 0 && i != 1 && (dwdVar = this.K0) != null) {
            dwdVar.a.invoke();
            return true;
        }
        if (i == 6) {
            ((bo5) ((xn5) eb3.H(this, zg2.i))).h(1, true);
            return true;
        }
        if (i == 5) {
            ((bo5) ((xn5) eb3.H(this, zg2.i))).h(2, true);
            return true;
        }
        if (i != 7) {
            return false;
        }
        ((dw3) s1()).a();
        return true;
    }

    public final vsd s1() {
        vsd vsdVar = (vsd) eb3.H(this, zg2.q);
        if (vsdVar != null) {
            return vsdVar;
        }
        qc0.p("No software keyboard controller");
        return null;
    }

    public final void t1(boolean z) {
        if (!z) {
            Boolean bool = this.J0.e;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        this.W0 = ynb.V(Z0(), null, dw2.d, new yoe(this, b21.B(this), null), 1);
    }
}
