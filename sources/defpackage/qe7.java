package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qe7 implements z85 {
    @Override // defpackage.z85
    public final int a() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z85
    public final int b(ca1 ca1Var, ca1 ca1Var2, u09 u09Var) {
        boolean z;
        c36 c36Var;
        ca1Var.getClass();
        ca1Var2.getClass();
        if ((ca1Var instanceof ea1) && (ca1Var2 instanceof c36) && !xr7.A(ca1Var2)) {
            int i = o51.l;
            c36 c36Var2 = (c36) ca1Var2;
            cm3 cm3Var = (cm3) c36Var2;
            t99 name = cm3Var.getName();
            name.getClass();
            if (qud.e.contains(name)) {
                ea1 ea1VarI = m7c.i((ea1) ca1Var);
                z = ca1Var instanceof c36;
                if (z) {
                    c36Var = (c36) ca1Var;
                } else {
                    c36Var = null;
                }
                if (c36Var == null) {
                    if (u09Var instanceof rx7) {
                        if (urg.s(ca1Var, ca1Var2)) {
                            return 3;
                        }
                    } else if (urg.s(ca1Var, ca1Var2)) {
                        return 3;
                    }
                } else if (u09Var instanceof rx7) {
                    if (urg.s(ca1Var, ca1Var2)) {
                        return 3;
                    }
                } else if (urg.s(ca1Var, ca1Var2)) {
                    return 3;
                }
            } else {
                ArrayList arrayList = qud.a;
                t99 name2 = cm3Var.getName();
                name2.getClass();
                if (qud.j.contains(name2)) {
                    ea1 ea1VarI2 = m7c.i((ea1) ca1Var);
                    z = ca1Var instanceof c36;
                    if (z) {
                        c36Var = (c36) ca1Var;
                    } else {
                        c36Var = null;
                    }
                    if ((c36Var == null && c36Var2.X() == c36Var.X()) || (ea1VarI2 != null && c36Var2.X())) {
                        if ((u09Var instanceof rx7) || c36Var2.J() != null || ea1VarI2 == null || m7c.k(u09Var, ea1VarI2)) {
                            if (urg.s(ca1Var, ca1Var2)) {
                                return 3;
                            }
                        } else if ((ea1VarI2 instanceof c36) && z && o51.a((c36) ea1VarI2) != null) {
                            String strQ = xo1.q(c36Var2, 2);
                            c36 c36VarA = ((c36) ca1Var).a();
                            c36VarA.getClass();
                            if (strQ.equals(xo1.q(c36VarA, 2))) {
                                if (urg.s(ca1Var, ca1Var2)) {
                                    return 3;
                                }
                            }
                        }
                    }
                } else if (urg.s(ca1Var, ca1Var2)) {
                    return 3;
                }
            }
        } else if (urg.s(ca1Var, ca1Var2)) {
            return 3;
        }
        return 2;
    }
}
