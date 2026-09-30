package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.io.EOFException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rx {
    public static final w84 a = w84.b1("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final w84 b = w84.b1("k");

    public static void a(lx lxVar, uh8 uh8Var) {
        Float fValueOf = Float.valueOf(0.0f);
        List list = (List) lxVar.b;
        if (list.isEmpty()) {
            list.add(new bp7(uh8Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(uh8Var.m)));
        } else if (((bp7) list.get(0)).b == null) {
            list.set(0, new bp7(uh8Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(uh8Var.m)));
        }
    }

    public static boolean b(lx lxVar) {
        if (lxVar != null) {
            return lxVar.j0() && ((Float) ((bp7) ((List) lxVar.b).get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    public static qx c(kj7 kj7Var, uh8 uh8Var) throws uh7, EOFException {
        kx kxVar;
        boolean z = kj7Var.l() == 3;
        if (z) {
            kj7Var.beginObject();
        }
        mx mxVarA = null;
        sx sxVarB = null;
        lx lxVarQ0 = null;
        kx kxVar2 = null;
        lx lxVarQ1 = null;
        lx lxVarQ2 = null;
        lx lxVarQ3 = null;
        lx lxVarQ4 = null;
        lx lxVarQ5 = null;
        kx kxVarS0 = null;
        lx lxVarQ6 = null;
        lx lxVarQ7 = null;
        while (kj7Var.hasNext()) {
            switch (kj7Var.x(a)) {
                case 0:
                    kj7Var.beginObject();
                    while (kj7Var.hasNext()) {
                        if (kj7Var.x(b) != 0) {
                            kj7Var.E();
                            kj7Var.skipValue();
                        } else {
                            mxVarA = nx.a(kj7Var, uh8Var);
                        }
                    }
                    kj7Var.endObject();
                    break;
                case 1:
                    sxVarB = nx.b(kj7Var, uh8Var);
                    break;
                case 2:
                    kxVar2 = new kx(ep7.a(kj7Var, uh8Var, 1.0f, gec.b, false), 4);
                    break;
                case 3:
                    lxVarQ5 = kj0.q0(kj7Var, uh8Var, false);
                    a(lxVarQ5, uh8Var);
                    break;
                case 4:
                    lxVarQ0 = kj0.q0(kj7Var, uh8Var, false);
                    a(lxVarQ0, uh8Var);
                    break;
                case 5:
                    kxVarS0 = kj0.s0(kj7Var, uh8Var);
                    break;
                case 6:
                    lxVarQ6 = kj0.q0(kj7Var, uh8Var, false);
                    break;
                case 7:
                    lxVarQ7 = kj0.q0(kj7Var, uh8Var, false);
                    break;
                case 8:
                    lxVarQ1 = kj0.q0(kj7Var, uh8Var, false);
                    break;
                case 9:
                    lxVarQ2 = kj0.q0(kj7Var, uh8Var, false);
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    lxVarQ3 = kj0.q0(kj7Var, uh8Var, false);
                    a(lxVarQ3, uh8Var);
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    lxVarQ4 = kj0.q0(kj7Var, uh8Var, false);
                    a(lxVarQ4, uh8Var);
                    break;
                default:
                    kj7Var.E();
                    kj7Var.skipValue();
                    break;
            }
        }
        if (z) {
            kj7Var.endObject();
        }
        if (mxVarA == null || (mxVarA.j0() && ((PointF) ((bp7) mxVarA.a.get(0)).b).equals(0.0f, 0.0f))) {
            mxVarA = null;
        }
        sx sxVar = (sxVarB == null || (!(sxVarB instanceof ox) && sxVarB.j0() && ((PointF) ((bp7) sxVarB.i0().get(0)).b).equals(0.0f, 0.0f))) ? null : sxVarB;
        lx lxVar = b(lxVarQ0) ? null : lxVarQ0;
        if (kxVar2 == null) {
            kxVar = null;
        } else {
            if (kxVar2.j0()) {
                fec fecVar = (fec) ((bp7) ((List) kxVar2.b).get(0)).b;
                if (fecVar.a == 1.0f && fecVar.b == 1.0f) {
                    kxVar = null;
                }
            }
            kxVar = kxVar2;
        }
        return new qx(mxVarA, sxVar, kxVar, lxVar, kxVarS0, lxVarQ6, lxVarQ7, (lxVarQ1 == null || (lxVarQ1.j0() && ((Float) ((bp7) ((List) lxVarQ1.b).get(0)).b).floatValue() == 0.0f)) ? null : lxVarQ1, (lxVarQ2 == null || (lxVarQ2.j0() && ((Float) ((bp7) ((List) lxVarQ2.b).get(0)).b).floatValue() == 0.0f)) ? null : lxVarQ2, b(lxVarQ3) ? null : lxVarQ3, b(lxVarQ4) ? null : lxVarQ4, b(lxVarQ5) ? null : lxVarQ5);
    }
}
