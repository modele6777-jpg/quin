package defpackage;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gic {
    public zhc a;
    public lu9 b;
    public gj5 c;
    public ks9 d;
    public boolean e;
    public sc9 f;
    public final yhc g;
    public final rhc h;
    public boolean i;
    public int j = 1;
    public fhc k = ohc.a;
    public final dic l = new dic(this);
    public final ckb m = new ckb(10, this);

    public gic(zhc zhcVar, lu9 lu9Var, gj5 gj5Var, ks9 ks9Var, boolean z, sc9 sc9Var, yhc yhcVar, rhc rhcVar) {
        this.a = zhcVar;
        this.b = lu9Var;
        this.c = gj5Var;
        this.d = ks9Var;
        this.e = z;
        this.f = sc9Var;
        this.g = yhcVar;
        this.h = rhcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zn2 zn2Var) throws Throwable {
        bic bicVar;
        gic gicVar;
        Throwable th;
        lmb lmbVar;
        if (zn2Var instanceof bic) {
            bicVar = (bic) zn2Var;
            int i = bicVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bicVar.label = i - Integer.MIN_VALUE;
            } else {
                bicVar = new bic(this, zn2Var);
            }
        } else {
            bicVar = new bic(this, zn2Var);
        }
        Object obj = bicVar.result;
        int i2 = bicVar.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lmbVar = (lmb) bicVar.L$0;
            try {
                jzb.q(obj);
                gicVar = this;
                gicVar.i = false;
                return new zsf(lmbVar.element);
            } catch (Throwable th2) {
                th = th2;
                gicVar = this;
                gicVar.i = false;
                throw th;
            }
        }
        jzb.q(obj);
        lmb lmbVar2 = new lmb();
        lmbVar2.element = j;
        this.i = true;
        try {
            s89 s89Var = s89.a;
            gicVar = this;
            try {
                cic cicVar = new cic(gicVar, lmbVar2, j, null);
                bicVar.L$0 = lmbVar2;
                bicVar.label = 1;
                Object objG = gicVar.g(s89Var, cicVar, bicVar);
                bw2 bw2Var = bw2.a;
                if (objG == bw2Var) {
                    return bw2Var;
                }
                lmbVar = lmbVar2;
                gicVar.i = false;
                return new zsf(lmbVar.element);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                gicVar.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            gicVar = this;
        }
    }

    public final boolean b() {
        lu9 lu9Var;
        return this.a.d() || this.a.c() || ((lu9Var = this.b) != null && lu9Var.d());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final Object c(long j, boolean z, gbe gbeVar) {
        int i;
        long jA;
        eic eicVar;
        lu9 lu9Var;
        bw2 bw2Var;
        Object objR;
        wef wefVar = wef.a;
        if (z) {
            gj5 gj5Var = this.c;
            lhc lhcVar = ohc.a;
            if (!(gj5Var instanceof uq3)) {
                if (this.d == ks9.b) {
                    i = 1;
                } else {
                    i = 2;
                }
                jA = zsf.a(0.0f, 0.0f, i, j);
                eicVar = new eic(this, null);
                lu9Var = this.b;
                bw2Var = bw2.a;
                if (lu9Var == null && b()) {
                    Object objA = lu9Var.a(jA, eicVar, gbeVar);
                    if (objA == bw2Var) {
                        return objA;
                    }
                } else {
                    eic eicVar2 = new eic(eicVar.this$0, gbeVar);
                    eicVar2.J$0 = jA;
                    objR = eicVar2.r(wefVar);
                    if (objR == bw2Var) {
                        return objR;
                    }
                }
            }
        } else {
            if (this.d == ks9.b) {
                i = 1;
            } else {
                i = 2;
            }
            jA = zsf.a(0.0f, 0.0f, i, j);
            eicVar = new eic(this, null);
            lu9Var = this.b;
            bw2Var = bw2.a;
            if (lu9Var == null) {
                eic eicVar3 = new eic(eicVar.this$0, gbeVar);
                eicVar3.J$0 = jA;
                objR = eicVar3.r(wefVar);
                if (objR == bw2Var) {
                    return objR;
                }
            } else {
                eic eicVar4 = new eic(eicVar.this$0, gbeVar);
                eicVar4.J$0 = jA;
                objR = eicVar4.r(wefVar);
                if (objR == bw2Var) {
                    return objR;
                }
            }
        }
        return wefVar;
    }

    public final long d(fhc fhcVar, long j, int i) {
        wc9 wc9Var = this.f.a;
        wc9 wc9VarM1 = wc9Var != null ? wc9Var.m1() : null;
        long jU = wc9VarM1 != null ? wc9VarM1.U(i, j) : 0L;
        long jF = hl9.f(j, jU);
        long jF2 = f(i(fhcVar.a(h(f(this.d == ks9.b ? hl9.a(0.0f, 1, jF) : hl9.a(0.0f, 2, jF))))));
        yhc yhcVar = this.g;
        if (yhcVar.Y) {
            ViewTreeObserver viewTreeObserver = ((AndroidComposeView) vd0.t0(yhcVar)).getViewTreeObserver();
            try {
                Method declaredMethod = AndroidComposeView.c2;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.c2 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jF3 = hl9.f(jF, jF2);
        wc9 wc9Var2 = this.f.a;
        wc9 wc9VarM2 = wc9Var2 != null ? wc9Var2.m1() : null;
        return hl9.g(hl9.g(jU, jF2), wc9VarM2 != null ? wc9VarM2.G(jF2, i, jF3) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? hl9.h(j, -1.0f) : j;
    }

    public final Object g(s89 s89Var, l26 l26Var, zn2 zn2Var) {
        Object objB = this.a.b(s89Var, new fic(null, l26Var, this), zn2Var);
        return objB == bw2.a ? objB : wef.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == ks9.b ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == ks9.b) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        ks9 ks9Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (ks9Var == ks9.a) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (ks9Var == ks9.b) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
