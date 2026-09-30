package defpackage;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.view.Surface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class arb {
    public static BitmapShader a(ks ksVar) {
        return new BitmapShader(abg.o(ksVar), jgb.h0(0), jgb.h0(0));
    }

    public static final void b(q7b q7bVar, l46 l46Var, int i) {
        int i2;
        Object next;
        pwf pwfVarH;
        Object next2;
        pwf pwfVarH2;
        Object next3;
        pwf pwfVarH3;
        q7b q7bVar2 = q7bVar;
        q7bVar2.getClass();
        cb9 cb9Var = q7bVar2.a;
        l46Var.h0(1580374580);
        int i3 = i | (l46Var.g(q7bVar2) ? 4 : 2);
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            Object obj = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == obj) {
                    objR = vic.c;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            i2 = 14;
            dc9 dc9Var = (dc9) z5c.G(job.a.b(dc9.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null);
            nfc nfcVarB2 = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH2 = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK2 = l46Var.k(uq.b);
                Object objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = vic.d;
                    l46Var.p0(objR2);
                }
                Iterator it2 = fyc.u((a26) objR2, objK2).iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!(((Context) next2) instanceof pwf));
                pwfVarH2 = (pwf) next2;
                l46Var.r(false);
            }
            if (pwfVarH2 == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            qna qnaVar = (qna) z5c.G(job.a.b(qna.class), pwfVarH2.g(), null, b21.r(pwfVarH2), nfcVarB2, null);
            nfc nfcVarB3 = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH3 = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK3 = l46Var.k(uq.b);
                Object objR3 = l46Var.R();
                if (objR3 == obj) {
                    objR3 = vic.e;
                    l46Var.p0(objR3);
                }
                Iterator it3 = fyc.u((a26) objR3, objK3).iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!(((Context) next3) instanceof pwf));
                pwfVarH3 = (pwf) next3;
                l46Var.r(false);
            }
            if (pwfVarH3 == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarH3);
            kob kobVar = job.a;
            mma mmaVar = (mma) z5c.G(kobVar.b(mma.class), pwfVarH3.g(), null, gy2VarR, nfcVarB3, null);
            nfc nfcVarB4 = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB4);
            Object objR4 = l46Var.R();
            if (zG || objR4 == obj) {
                objR4 = nfcVarB4.b(kobVar.b(rw5.class), null, null);
                l46Var.p0(objR4);
            }
            rw5 rw5Var = (rw5) objR4;
            vb2 vb2VarH = kn2.H((Context) l46Var.k(uq.b));
            yic yicVarC = rmc.c(mic.AutumnEquinox2026);
            Boolean bool = (Boolean) dc9Var.y.getValue();
            boolean zBooleanValue2 = bool.booleanValue();
            Object[] objArr = new Object[0];
            Object objR5 = l46Var.R();
            if (objR5 == obj) {
                objR5 = new kgc(2);
                l46Var.p0(objR5);
            }
            csc cscVar = (csc) vfh.J(objArr, csc.b, (x16) objR5, l46Var, 384);
            e89 e89VarH = y41.h(cb9Var, l46Var);
            int i4 = i3 & 14;
            boolean zI = (i4 == 4) | l46Var.i(cscVar);
            Object objR6 = l46Var.R();
            if (zI || objR6 == obj) {
                objR6 = new h6b(12, q7bVar2, cscVar);
                l46Var.p0(objR6);
            }
            af1.h(cb9Var, cscVar, (a26) objR6, l46Var);
            Object[] objArr2 = new Object[0];
            Object objR7 = l46Var.R();
            if (objR7 == obj) {
                objR7 = new kgc(3);
                l46Var.p0(objR7);
            }
            e89 e89Var = (e89) vfh.I(objArr2, (x16) objR7, l46Var, 48);
            da9 da9Var = (da9) e89VarH.getValue();
            Boolean boolValueOf = Boolean.valueOf(qnaVar.h());
            vma vmaVarI = qnaVar.i();
            Boolean bool2 = (Boolean) dsc.b.getValue();
            bool2.booleanValue();
            Object[] objArr3 = {bool, da9Var, boolValueOf, vmaVarI, bool2};
            boolean zI2 = l46Var.i(cscVar) | (i4 == 4) | l46Var.i(qnaVar) | l46Var.h(zBooleanValue2) | l46Var.g(e89Var) | l46Var.i(vb2VarH) | l46Var.i(dc9Var) | l46Var.i(mmaVar) | l46Var.i(rw5Var) | l46Var.i(yicVarC);
            Object objR8 = l46Var.R();
            if (zI2 || objR8 == obj) {
                q7bVar2 = q7bVar;
                Object xicVar = new xic(cscVar, q7bVar2, qnaVar, zBooleanValue2, vb2VarH, dc9Var, mmaVar, yicVarC, e89Var, rw5Var, null);
                l46Var.p0(xicVar);
                objR8 = xicVar;
            } else {
                q7bVar2 = q7bVar;
            }
            af1.r(objArr3, (l26) objR8, l46Var);
        } else {
            i2 = 14;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new oo2(q7bVar2, i, i2);
        }
    }

    public static final void c(r55 r55Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        int i2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(1038110822);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(r55Var) : l46Var.i(r55Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = i2;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new znd(i3);
                l46Var.p0(objR);
            }
            ted tedVarF = zz8.f(54, 0, (a26) objR, l46Var);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = af1.E(l46Var);
                l46Var.p0(objR2);
            }
            zz8.a(x16Var2, null, tedVarF, 0.0f, false, null, y72.j, 0L, 0L, null, null, null, af1.b0(-1781819452, new n50((aw2) objR2, tedVarF, x16Var2, r55Var, x16Var, 14), l46Var), l46Var, ((i4 >> 6) & 14) | 1572864, 3078, 7098);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, r55Var, x16Var, x16Var2, 20);
        }
    }

    public static final void d(pu1 pu1Var, a26 a26Var, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i) {
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(-895954425);
        int i2 = i | (l46Var.e(pu1Var == null ? -1 : pu1Var.ordinal()) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            rs0.f(null, false, af1.b0(294356778, new n50(x16Var2, (Object) pu1Var, x16Var, x16Var3, (m26) a26Var, 15), l46Var), l46Var, 384, 3);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm((Object) pu1Var, (Object) a26Var, (m26) x16Var, (m26) x16Var2, (m26) x16Var3, i, 24);
        }
    }

    public static final void e(j09 j09Var, t2g t2gVar, boolean z, boolean z2, xw9 xw9Var, dd2 dd2Var, a26 a26Var, l46 l46Var, int i) {
        int i2;
        a26Var.getClass();
        l46Var.h0(1034536050);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(t2gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.h(false) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.g(xw9Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var.i(dd2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= l46Var.i(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= l46Var.i(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= l46Var.i(null) ? 536870912 : 268435456;
        }
        int i3 = i2;
        char c = l46Var.i(a26Var) ? (char) 4 : (char) 2;
        if (l46Var.W(i3 & 1, ((i3 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            j18 j18Var = t2gVar.j;
            gj5 gj5VarQ = jgb.Q(z, j18Var, l46Var, ((i3 >> 6) & 14) | 384);
            boolean z3 = ((i3 & 112) == 32) | ((c & 14) == 4) | ((1879048192 & i3) == 536870912) | ((i3 & 896) == 256) | ((i3 & 29360128) == 8388608) | ((3670016 & i3) == 1048576) | ((234881024 & i3) == 67108864);
            Object objR = l46Var.R();
            if (z3 || objR == sf2.a) {
                xu xuVar = new xu(t2gVar, a26Var, z, dd2Var, 5);
                l46Var.p0(xuVar);
                objR = xuVar;
            }
            af1.t(j09Var, j18Var, xw9Var, null, null, gj5VarQ, z2, null, (a26) objR, l46Var, (i3 & 14) | ((i3 >> 9) & 896) | ((i3 >> 3) & 7168) | ((i3 << 12) & 29360128), 304);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iy0(j09Var, t2gVar, z, z2, xw9Var, dd2Var, a26Var, i, 5);
        }
    }

    public static final void f(dc9 dc9Var, mma mmaVar, boolean z) {
        dc9Var.y.setValue(Boolean.FALSE);
        mmaVar.k();
        if (z) {
            mmaVar.E(Boolean.TRUE);
        }
    }

    public static final cyc g(rf0 rf0Var, boolean z) {
        rf0Var.getClass();
        uf0 uf0Var = rf0Var.b;
        if (z) {
            return fyc.u(new ule(27), uf0Var.c);
        }
        return fyc.u(new ule(26), uf0Var.b);
    }

    public static final void h(Surface surface, ke6 ke6Var, sw3 sw3Var, xl1 xl1Var) {
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.getClass();
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            wl1 wl1Var = xl1Var.a;
            cv7 cv7Var = wl1Var.b;
            Canvas canvas = mp.a;
            lp lpVar = new lp();
            lpVar.a = canvasLockHardwareCanvas;
            float width = canvasLockHardwareCanvas.getWidth();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(canvasLockHardwareCanvas.getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
            sw3 sw3Var2 = wl1Var.a;
            cv7 cv7Var2 = wl1Var.b;
            vl1 vl1Var = wl1Var.c;
            long j = wl1Var.d;
            wl1Var.a = sw3Var;
            wl1Var.b = cv7Var;
            wl1Var.c = lpVar;
            wl1Var.d = jFloatToRawIntBits;
            lpVar.g();
            i7h.r(xl1Var, ke6Var);
            lpVar.o();
            wl1Var.a = sw3Var2;
            wl1Var.b = cv7Var2;
            wl1Var.c = vl1Var;
            wl1Var.d = j;
        } finally {
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public static ve5 i(rf0 rf0Var, a26 a26Var) {
        rf0Var.getClass();
        return new ve5(g(rf0Var, false), true, a26Var);
    }

    public static final k00 j(zse zseVar) {
        k00 k00Var = zseVar.a;
        long j = zseVar.b;
        k00Var.getClass();
        return k00Var.subSequence(eue.g(j), eue.f(j));
    }

    public static final k00 k(zse zseVar, int i) {
        k00 k00Var = zseVar.a;
        k00 k00Var2 = zseVar.a;
        long j = zseVar.b;
        int iF = eue.f(j);
        int iF2 = eue.f(j);
        int length = iF2 + i;
        if (((i ^ length) & (iF2 ^ length)) < 0) {
            length = k00Var2.b.length();
        }
        return k00Var.subSequence(iF, Math.min(length, k00Var2.b.length()));
    }

    public static final k00 l(zse zseVar, int i) {
        k00 k00Var = zseVar.a;
        long j = zseVar.b;
        int iG = eue.g(j);
        int i2 = iG - i;
        if (((iG ^ i2) & (i ^ iG)) < 0) {
            i2 = 0;
        }
        return k00Var.subSequence(Math.max(0, i2), eue.g(j));
    }

    public static final boolean m(Exception exc) {
        String message;
        for (Throwable th : fyc.z(fyc.u(new znd(0), exc), 16)) {
            if (((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.ENOSPC) || ((message = th.getMessage()) != null && (v4e.F(message, "ENOSPC", false) || v4e.F(message, "No space left", true)))) {
                return true;
            }
        }
        return false;
    }

    public static String n(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String strConcat = "".concat(str);
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static void o(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static int p(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }
}
