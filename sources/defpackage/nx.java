package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nx {
    public static final w84 a = w84.b1("k", "x", "y");

    public static mx a(kj7 kj7Var, uh8 uh8Var) {
        ArrayList arrayList = new ArrayList();
        if (kj7Var.l() == 1) {
            kj7Var.beginArray();
            while (kj7Var.hasNext()) {
                kj7 kj7Var2 = kj7Var;
                uh8 uh8Var2 = uh8Var;
                arrayList.add(new i1a(uh8Var2, dp7.b(kj7Var2, uh8Var2, xqf.c(), af8.S0, kj7Var.l() == 3, false)));
                kj7Var = kj7Var2;
                uh8Var = uh8Var2;
            }
            kj7Var.endArray();
            ep7.b(arrayList);
        } else {
            arrayList.add(new bp7(lj7.b(kj7Var, xqf.c())));
        }
        return new mx(arrayList);
    }

    public static sx b(kj7 kj7Var, uh8 uh8Var) {
        kj7Var.beginObject();
        mx mxVarA = null;
        lx lxVarQ0 = null;
        boolean z = false;
        lx lxVarQ1 = null;
        while (kj7Var.l() != 4) {
            int iX = kj7Var.x(a);
            if (iX == 0) {
                mxVarA = a(kj7Var, uh8Var);
            } else if (iX != 1) {
                if (iX != 2) {
                    kj7Var.E();
                    kj7Var.skipValue();
                } else if (kj7Var.l() == 6) {
                    kj7Var.skipValue();
                    z = true;
                } else {
                    lxVarQ0 = kj0.q0(kj7Var, uh8Var, true);
                }
            } else if (kj7Var.l() == 6) {
                kj7Var.skipValue();
                z = true;
            } else {
                lxVarQ1 = kj0.q0(kj7Var, uh8Var, true);
            }
        }
        kj7Var.endObject();
        if (z) {
            uh8Var.a("Lottie doesn't support expressions.");
        }
        return mxVarA != null ? mxVarA : new ox(lxVarQ1, lxVarQ0);
    }
}
