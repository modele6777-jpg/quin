package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class io2 {
    public static final Set a = Collections.unmodifiableSet(EnumSet.of(le1.d, le1.e, le1.f, le1.g));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(me1.d, me1.a));
    public static final Set c;
    public static final Set d;

    static {
        ke1 ke1Var = ke1.e;
        ke1 ke1Var2 = ke1.d;
        ke1 ke1Var3 = ke1.a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(ke1Var, ke1Var2, ke1Var3));
        c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(ke1Var2);
        enumSetCopyOf.remove(ke1Var3);
        d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0185 A[PHI: r7
  0x0185: PHI (r7v5 char) = (r7v1 char), (r7v0 char) binds: [B:122:0x01a7, B:106:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean a(co1 co1Var, boolean z) {
        char c2;
        char c3;
        es esVarK = co1Var.b.k();
        CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
        key.getClass();
        esVarK.getClass();
        CaptureResult captureResult = esVarK.a;
        Integer num = (Integer) captureResult.get(key);
        char c4 = 5;
        char c5 = 4;
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 5)) {
            c2 = 2;
        } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            c2 = 3;
        } else if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 3)) {
            c2 = 4;
        } else {
            if (num != null && b21.F(3, "CXCP")) {
                Log.d("CXCP", "Unknown AF mode (" + num.intValue() + ") for " + ((Object) yy5.a(captureResult.getFrameNumber())) + '!');
            }
            c2 = 1;
        }
        boolean z2 = c2 == 2 || a.contains(co1Var.y());
        es esVarK2 = co1Var.b.k();
        CaptureResult.Key key2 = CaptureResult.CONTROL_AE_MODE;
        key2.getClass();
        esVarK2.getClass();
        CaptureResult captureResult2 = esVarK2.a;
        Integer num2 = (Integer) captureResult2.get(key2);
        if (num2 != null && num2.intValue() == 0) {
            c3 = 2;
        } else if (num2 != null && num2.intValue() == 1) {
            c3 = 3;
        } else if (num2 != null && num2.intValue() == 2) {
            c3 = 4;
        } else if (num2 != null && num2.intValue() == 3) {
            c3 = 5;
        } else if (num2 != null && num2.intValue() == 4) {
            c3 = 6;
        } else {
            if (num2 != null && b21.F(3, "CXCP")) {
                Log.d("CXCP", "Unknown AE mode (" + num2.intValue() + ") for " + ((Object) yy5.a(captureResult2.getFrameNumber())) + '!');
            }
            c3 = 1;
        }
        boolean z3 = c3 == 2;
        boolean z4 = !z ? !(z3 || c.contains(co1Var.t())) : !(z3 || d.contains(co1Var.t()));
        es esVarK3 = co1Var.b.k();
        CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
        key3.getClass();
        esVarK3.getClass();
        CaptureResult captureResult3 = esVarK3.a;
        Integer num3 = (Integer) captureResult3.get(key3);
        if (num3 != null && num3.intValue() == 0) {
            c4 = 2;
        } else if (num3 != null && num3.intValue() == 1) {
            c4 = 3;
        } else if (num3 != null && num3.intValue() == 2) {
            c4 = c5;
        } else if (num3 == null || num3.intValue() != 3) {
            if (num3 != null && num3.intValue() == 4) {
                c4 = 6;
            } else {
                c5 = 7;
                if (num3 != null && num3.intValue() == 5) {
                    c4 = c5;
                } else {
                    c4 = '\b';
                    if (num3 == null || num3.intValue() != 6) {
                        if (num3 != null && num3.intValue() == 7) {
                            c4 = '\t';
                        } else if (num3 != null && num3.intValue() == 8) {
                            c4 = '\n';
                        } else {
                            if (num3 != null && b21.F(3, "CXCP")) {
                                Log.d("CXCP", "Unknown AWB mode (" + num3.intValue() + ") for " + ((Object) yy5.a(captureResult3.getFrameNumber())) + '!');
                            }
                            c4 = 1;
                        }
                    }
                }
            }
        }
        boolean z5 = c4 == 2 || b.contains(co1Var.n());
        b21.q("ConvergenceUtils", "checkCaptureResult, AE=" + co1Var.t() + " AF =" + co1Var.y() + " AWB=" + co1Var.n());
        return z2 && z4 && z5;
    }
}
