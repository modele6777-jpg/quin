package defpackage;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ne6 implements ew9 {
    public vs9 E0;
    public boolean F0;
    public boolean G0;
    public boolean I0;
    public int Y;
    public ke6 a;
    public final ie6 b;
    public final AndroidComposeView c;
    public l26 d;
    public x16 e;
    public boolean g;
    public float[] w;
    public boolean x;
    public long f = 9223372034707292159L;
    public final float[] v = zm8.a();
    public sw3 y = g21.b();
    public cv7 z = cv7.a;
    public final xl1 X = new xl1();
    public long Z = r2f.b;
    public boolean H0 = true;
    public final za6 J0 = new za6(4, this);

    public ne6(ke6 ke6Var, ie6 ie6Var, AndroidComposeView androidComposeView, l26 l26Var, x16 x16Var) {
        this.a = ke6Var;
        this.b = ie6Var;
        this.c = androidComposeView;
        this.d = l26Var;
        this.e = x16Var;
    }

    public final float[] a() {
        float[] fArrA = this.w;
        if (fArrA == null) {
            fArrA = zm8.a();
            this.w = fArrA;
        }
        if (this.G0) {
            this.G0 = false;
            float[] fArrB = b();
            if (this.H0) {
                return fArrB;
            }
            if (!if9.A(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.F0;
        float[] fArr = this.v;
        if (z) {
            ke6 ke6Var = this.a;
            long jF = ke6Var.z;
            me6 me6Var = ke6Var.a;
            if ((9223372034707292159L & jF) == 9205357640488583168L) {
                jF = dec.f(db6.Y0(this.f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jF >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF & 4294967295L));
            float fE = me6Var.E();
            float fY = me6Var.y();
            float fG = me6Var.G();
            float fQ = me6Var.q();
            float fS = me6Var.s();
            float fC = me6Var.c();
            float fN = me6Var.N();
            double d = ((double) fG) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fY * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fY * fSin);
            double d2 = ((double) fQ) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fE * fCos2);
            float f10 = (f3 * fCos2) + ((-fE) * fSin2);
            double d3 = ((double) fS) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fC;
            float f16 = f14 * fC;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fC;
            float f18 = f12 * fN;
            float f19 = fCos * fCos3 * fN;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fN;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.F0 = false;
            this.H0 = lmg.k0(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.x || this.g) {
            return;
        }
        this.c.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zL = AndroidComposeView.l();
        AndroidComposeView androidComposeView = this.c;
        if (zL) {
            androidComposeView.M(-4.0f);
        }
        ke6 ke6Var = this.a;
        if (!w67.b(ke6Var.t, j)) {
            ke6Var.t = j;
            ke6Var.a.p((int) (j >> 32), (int) (j & 4294967295L), ke6Var.u);
        }
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    public final void e(long j) {
        if (e77.b(j, this.f)) {
            return;
        }
        if (AndroidComposeView.l()) {
            this.c.M(-4.0f);
        }
        this.f = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.x) {
            this.x = z;
            AndroidComposeView androidComposeView = this.c;
            i79 i79Var = androidComposeView.S0;
            boolean z2 = androidComposeView.U0;
            if (!z) {
                if (z2) {
                    return;
                }
                i79Var.l(this);
                i79 i79Var2 = androidComposeView.T0;
                if (i79Var2 != null) {
                    i79Var2.l(this);
                    return;
                }
                return;
            }
            if (!z2) {
                i79Var.h(this);
                return;
            }
            i79 i79Var3 = androidComposeView.T0;
            if (i79Var3 == null) {
                i79Var3 = new i79();
                androidComposeView.T0 = i79Var3;
            }
            i79Var3.h(this);
        }
    }

    public final void g() {
        AndroidComposeView.l();
        if (this.x) {
            if (!r2f.a(this.Z, r2f.b) && !e77.b(this.a.u, this.f)) {
                ke6 ke6Var = this.a;
                float fB = r2f.b(this.Z) * ((int) (this.f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(r2f.c(this.Z) * ((int) (this.f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!hl9.c(ke6Var.z, jFloatToRawIntBits)) {
                    ke6Var.z = jFloatToRawIntBits;
                    ke6Var.a.t(jFloatToRawIntBits);
                }
            }
            this.a.e(this.y, this.z, this.f, this.J0);
            f(false);
        }
    }
}
