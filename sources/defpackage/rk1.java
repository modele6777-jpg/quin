package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.SparseArray;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rk1 {
    public static final Object s = new Object();
    public static final SparseArray t = new SparseArray();
    public final uk1 c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public wo0 g;
    public zj1 h;
    public mk1 i;
    public vea j;
    public szc k;
    public final tzb l;
    public final pa1 m;
    public final uh1 n;
    public final ace o;
    public int p;
    public final Integer r;
    public final vi1 a = new vi1();
    public final Object b = new Object();
    public m88 q = tx6.c;

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0288, code lost:
    
        r5 = r11;
        r11 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rk1(android.content.Context r11, defpackage.j48 r12) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.<init>(android.content.Context, j48):void");
    }

    public static void a(Integer num) {
        synchronized (s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = t;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(ri1 ri1Var) throws Throwable {
        if (xdc.r()) {
            int i = ri1Var != null ? ri1Var.a : -1;
            if (Build.VERSION.SDK_INT >= 29) {
                bp.N(i, xdc.v("CX:CameraProvider-RetryStatus"));
                return;
            }
            String strV = xdc.v("CX:CameraProvider-RetryStatus");
            try {
                Method method = xdc.e;
                if (method == null) {
                    method = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                    xdc.e = method;
                }
                if (method == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                method.invoke(null, Long.valueOf(xdc.a), strV, Integer.valueOf(i));
            } catch (Exception e) {
                xdc.o(e, "traceCounter");
            }
        }
    }

    public static void c() {
        SparseArray sparseArray = t;
        if (sparseArray.size() == 0) {
            b21.n = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            b21.n = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            b21.n = 4;
        } else if (sparseArray.get(5) != null) {
            b21.n = 5;
        } else if (sparseArray.get(6) != null) {
            b21.n = 6;
        }
    }
}
