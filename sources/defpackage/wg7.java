package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wg7 {
    public static final vg7 d = new vg7(new dh7(false, false, false, true, "    ", false, "type", true, i22.c, true), izc.a);
    public final dh7 a;
    public final hzc b;
    public final kb6 c = new kb6(13);

    public wg7(dh7 dh7Var, hzc hzcVar) {
        this.a = dh7Var;
        this.b = hzcVar;
    }

    public final Object a(xn7 xn7Var, nh7 nh7Var) {
        om3 zi7Var;
        xn7Var.getClass();
        nh7Var.getClass();
        if (nh7Var instanceof ti7) {
            zi7Var = new dj7(this, (ti7) nh7Var, (String) null, 12);
        } else if (nh7Var instanceof yg7) {
            zi7Var = new ej7(this, (yg7) nh7Var);
        } else {
            if (!(nh7Var instanceof yh7) && !nh7Var.equals(qi7.INSTANCE)) {
                ap.c();
                return null;
            }
            zi7Var = new zi7(this, (yi7) nh7Var, null);
        }
        return zi7Var.h(xn7Var);
    }

    public final Object b(xn7 xn7Var, String str) {
        xn7Var.getClass();
        str.getClass();
        a80 a80VarF = eec.f(this, str);
        Object objH = new q3e(this, ucg.OBJ, a80VarF, xn7Var.e(), null).h(xn7Var);
        if (a80VarF.g() == 10) {
            return objH;
        }
        a80.n(a80VarF, "Expected EOF after parsing, but had " + ((String) a80VarF.g).charAt(a80VarF.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final nh7 c(xn7 xn7Var, Object obj) {
        xn7Var.getClass();
        mmb mmbVar = new mmb();
        new aj7(this, new up(mmbVar, 9), 1).h(xn7Var, obj);
        Object obj2 = mmbVar.element;
        if (obj2 != null) {
            return (nh7) obj2;
        }
        pa7.g0("result");
        throw null;
    }

    public final String d(xn7 xn7Var, Object obj) {
        char[] cArr;
        xn7Var.getClass();
        sug sugVar = new sug(9, (char) 0);
        zw1 zw1Var = zw1.c;
        synchronized (zw1Var) {
            ad0 ad0Var = zw1Var.a;
            cArr = null;
            char[] cArr2 = (char[]) (ad0Var.isEmpty() ? null : ad0Var.removeLast());
            if (cArr2 != null) {
                zw1Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];
        }
        sugVar.c = cArr;
        try {
            new r3e(this.a.c ? new xf2(sugVar, this) : new pk1(sugVar), this, ucg.OBJ, new sh7[ucg.f.c()]).h(xn7Var, obj);
            return sugVar.toString();
        } finally {
            sugVar.p();
        }
    }

    public final nh7 e(String str) {
        str.getClass();
        return (nh7) b(qh7.a, str);
    }
}
