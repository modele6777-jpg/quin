package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kr7 {
    public static final pr4 a;
    public static final pr4 b;

    static {
        new a28(new yv6(22));
        new a28(new yv6(23));
        a = new pr4(0, new yv6(24));
        b = new pr4(0, new yv6(25));
    }

    public static final void a(hr7 hr7Var, dd2 dd2Var, l46 l46Var, int i) {
        ComponentCallbacks componentCallbacks;
        l46Var.h0(1560007908);
        int i2 = (i & 6) == 0 ? i | 2 : i;
        if ((i & 48) == 0) {
            i2 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        int i3 = 26;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            l46Var.b0();
            int i4 = i & 1;
            Object obj = sf2.a;
            if (i4 == 0 || l46Var.C()) {
                Context context = (Context) l46Var.k(uq.b);
                boolean zG = l46Var.g(context);
                Object objR = l46Var.R();
                if (zG || objR == obj) {
                    Object baseContext = context;
                    while (true) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            Context applicationContext = context.getApplicationContext();
                            applicationContext.getClass();
                            componentCallbacks = (Application) applicationContext;
                            break;
                        } else if ((baseContext instanceof lr7) && (baseContext instanceof ComponentCallbacks)) {
                            componentCallbacks = (ComponentCallbacks) baseContext;
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                            baseContext.getClass();
                        }
                    }
                    objR = tq.A(componentCallbacks);
                    l46Var.p0(objR);
                }
                hr7Var = (hr7) objR;
            } else {
                l46Var.Z();
            }
            int i5 = i2 & (-15);
            l46Var.s();
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new yv6(26);
                l46Var.p0(objR2);
            }
            e1b e1bVarA = b.a(new le2(hr7Var, (x16) objR2));
            nfc nfcVar = (nfc) hr7Var.c.e;
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = new yv6(27);
                l46Var.p0(objR3);
            }
            mh3.b(new e1b[]{e1bVarA, a.a(new le2(nfcVar, (x16) objR3))}, dd2Var, l46Var, (i5 & 112) | 8);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(hr7Var, dd2Var, i, i3);
        }
    }

    public static final nfc b(l46 l46Var) {
        pr4 pr4Var = a;
        try {
            le2 le2Var = (le2) l46Var.k(pr4Var);
            Object objInvoke = le2Var.b;
            if (objInvoke == null) {
                x16 x16Var = le2Var.a;
                objInvoke = x16Var != null ? x16Var.invoke() : null;
                le2Var.b = objInvoke;
            }
            if (objInvoke != null) {
                return (nfc) objInvoke;
            }
            throw new IllegalStateException("Can't retrieve Koin context value. Ensure Koin is properly initialized with startKoin() or KoinApplication.");
        } catch (Exception e) {
            le2 le2Var2 = (le2) l46Var.k(pr4Var);
            x16 x16Var2 = le2Var2.a;
            Object objInvoke2 = x16Var2 != null ? x16Var2.invoke() : null;
            le2Var2.b = objInvoke2;
            nfc nfcVar = (nfc) objInvoke2;
            if (nfcVar != null) {
                return nfcVar;
            }
            pd4.i(e, "Can't get Koin scope due to error: ");
            return null;
        }
    }
}
