package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wy implements xn8 {
    public final pz a;
    public boolean b;

    public wy(pz pzVar) {
        this.a = pzVar;
    }

    @Override // defpackage.xn8
    public final int a(ga7 ga7Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iQ = ((tn8) list.get(0)).q(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iQ2 = ((tn8) list.get(i2)).q(i);
                if (iQ2 > iQ) {
                    iQ = iQ2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iQ;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        vz9 vz9Var = this.a.b;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            cea ceaVarV = ((tn8) list.get(i)).v(j);
            iMax = Math.max(iMax, ceaVarV.a);
            iMax2 = Math.max(iMax2, ceaVarV.b);
            arrayList.add(ceaVarV);
        }
        if (zn8Var.k0()) {
            this.b = true;
            vz9Var.setValue(new e77((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            vz9Var.setValue(new e77((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return zn8Var.n0(iMax, iMax2, qu4.a, new vy(arrayList));
    }

    @Override // defpackage.xn8
    public final int c(ga7 ga7Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iN = ((tn8) list.get(0)).n(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iN2 = ((tn8) list.get(i2)).n(i);
                if (iN2 > iN) {
                    iN = iN2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iN;
    }

    @Override // defpackage.xn8
    public final int d(ga7 ga7Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iB = ((tn8) list.get(0)).b(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iB2 = ((tn8) list.get(i2)).b(i);
                if (iB2 > iB) {
                    iB = iB2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iB;
    }

    @Override // defpackage.xn8
    public final int e(ga7 ga7Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iV = ((tn8) list.get(0)).V(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iV2 = ((tn8) list.get(i2)).V(i);
                if (iV2 > iV) {
                    iV = iV2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iV;
    }
}
