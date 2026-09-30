package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mz1 implements xn8 {
    @Override // defpackage.xn8
    public final int a(ga7 ga7Var, List list, int i) {
        int size = list.size();
        int iQ = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iQ += ((tn8) list.get(i2)).q(i);
        }
        return iQ;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (pa7.t(vfh.v((tn8) obj), "leadingIcon")) {
                break;
            }
            i++;
        }
        tn8 tn8Var = (tn8) obj;
        final cea ceaVarV = tn8Var != null ? tn8Var.v(kl2.a(j, 0, 0, 0, 0, 10)) : null;
        int i2 = ceaVarV != null ? ceaVarV.a : 0;
        final int i3 = ceaVarV != null ? ceaVarV.b : 0;
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (pa7.t(vfh.v((tn8) obj2), "trailingIcon")) {
                break;
            }
            i4++;
        }
        tn8 tn8Var2 = (tn8) obj2;
        final cea ceaVarV2 = tn8Var2 != null ? tn8Var2.v(kl2.a(j, 0, 0, 0, 0, 10)) : null;
        int i5 = ceaVarV2 != null ? ceaVarV2.a : 0;
        final int i6 = ceaVarV2 != null ? ceaVarV2.b : 0;
        int size3 = list.size();
        int i7 = 0;
        while (i7 < size3) {
            tn8 tn8Var3 = (tn8) list.get(i7);
            if (pa7.t(vfh.v(tn8Var3), "label")) {
                final cea ceaVarV3 = tn8Var3.v(ll2.j(-(i2 + i5), 0, 2, j));
                int i8 = ceaVarV3.a + i2 + i5;
                final int iMax = Math.max(i3, Math.max(ceaVarV3.b, i6));
                final int i9 = i2;
                return zn8Var.n0(i8, iMax, qu4.a, new a26() { // from class: lz1
                    @Override // defpackage.a26
                    public final Object d(Object obj3) {
                        bea beaVar = (bea) obj3;
                        cea ceaVar = ceaVarV;
                        int i10 = iMax;
                        if (ceaVar != null) {
                            beaVar.k(ceaVar, 0, Math.round(((i10 - i3) / 2.0f) * 1.0f), 0.0f);
                        }
                        cea ceaVar2 = ceaVarV3;
                        int i11 = i9;
                        beaVar.k(ceaVar2, i11, 0, 0.0f);
                        cea ceaVar3 = ceaVarV2;
                        if (ceaVar3 != null) {
                            beaVar.k(ceaVar3, i11 + ceaVar2.a, Math.round(((i10 - i6) / 2.0f) * 1.0f), 0.0f);
                        }
                        return wef.a;
                    }
                });
            }
            i7++;
            ceaVarV = ceaVarV;
            i2 = i2;
        }
        k88.b("Collection contains no element matching the predicate.");
        oo3.f();
        return null;
    }

    @Override // defpackage.xn8
    public final int c(ga7 ga7Var, List list, int i) {
        int size = list.size();
        int iN = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iN += ((tn8) list.get(i2)).n(i);
        }
        return iN;
    }

    @Override // defpackage.xn8
    public final int d(ga7 ga7Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((tn8) list.get(0)).b(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((tn8) list.get(i2)).b(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.xn8
    public final int e(ga7 ga7Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((tn8) list.get(0)).V(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((tn8) list.get(i2)).V(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
