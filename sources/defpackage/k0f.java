package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k0f implements xn8 {
    public final qj5 a;
    public final jx0 b;
    public final float c;

    public k0f(qj5 qj5Var, jx0 jx0Var, float f) {
        this.a = qj5Var;
        this.b = jx0Var;
        this.c = f;
    }

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
    public final yn8 b(final zn8 zn8Var, List list, final long j) {
        int iH;
        int size = list.size();
        final int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            tn8 tn8Var = (tn8) list.get(i2);
            if (pa7.t(vfh.v(tn8Var), "navigationIcon")) {
                final cea ceaVarV = tn8Var.v(kl2.a(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    tn8 tn8Var2 = (tn8) list.get(i3);
                    if (pa7.t(vfh.v(tn8Var2), "actionIcons")) {
                        final cea ceaVarV2 = tn8Var2.v(kl2.a(j, 0, 0, 0, 0, 14));
                        if (kl2.h(j) == Integer.MAX_VALUE) {
                            iH = kl2.h(j);
                        } else {
                            iH = (kl2.h(j) - ceaVarV.a) - ceaVarV2.a;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i4 = iH;
                        int size3 = list.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            tn8 tn8Var3 = (tn8) list.get(i5);
                            if (pa7.t(vfh.v(tn8Var3), "title")) {
                                final cea ceaVarV3 = tn8Var3.v(kl2.a(j, 0, i4, 0, 0, 12));
                                oq6 oq6Var = cj.b;
                                int iW = ceaVarV3.W(oq6Var) != Integer.MIN_VALUE ? ceaVarV3.W(oq6Var) : 0;
                                float fInvoke = this.a.invoke();
                                int iL = Float.isNaN(fInvoke) ? 0 : ym8.L(fInvoke);
                                final int iMax = Math.max(zn8Var.D0(this.c), ceaVarV3.b);
                                if (kl2.g(j) == Integer.MAX_VALUE) {
                                    i = iMax;
                                } else {
                                    int i6 = iL + iMax;
                                    if (i6 >= 0) {
                                        i = i6;
                                    }
                                }
                                final int i7 = iW;
                                return zn8Var.n0(kl2.h(j), i, qu4.a, new a26(i, ceaVarV3, ceaVarV2, j, zn8Var, this, i7, iMax) { // from class: j0f
                                    public final /* synthetic */ int b;
                                    public final /* synthetic */ cea c;
                                    public final /* synthetic */ cea d;
                                    public final /* synthetic */ long e;
                                    public final /* synthetic */ zn8 f;
                                    public final /* synthetic */ k0f g;

                                    @Override // defpackage.a26
                                    public final Object d(Object obj) {
                                        int iH2;
                                        bea beaVar = (bea) obj;
                                        cea ceaVar = this.a;
                                        int i8 = ceaVar.b;
                                        int i9 = this.b;
                                        beaVar.k(ceaVar, 0, (i9 - i8) / 2, 0.0f);
                                        int iMax2 = Math.max(this.f.D0(v70.c), ceaVar.a);
                                        cea ceaVar2 = this.d;
                                        int i10 = ceaVar2.a;
                                        jx0 jx0Var = this.g.b;
                                        cea ceaVar3 = this.c;
                                        int i11 = ceaVar3.a;
                                        long j2 = this.e;
                                        int iA = jx0Var.a(i11, kl2.h(j2), cv7.a);
                                        if (iA >= iMax2) {
                                            if (ceaVar3.a + iA > kl2.h(j2) - i10) {
                                                iH2 = (kl2.h(j2) - i10) - (ceaVar3.a + iA);
                                            }
                                            beaVar.k(ceaVar3, iA, (i9 - ceaVar3.b) / 2, 0.0f);
                                            beaVar.k(ceaVar2, kl2.h(j2) - ceaVar2.a, (i9 - ceaVar2.b) / 2, 0.0f);
                                            return wef.a;
                                        }
                                        iH2 = iMax2 - iA;
                                        iA += iH2;
                                        beaVar.k(ceaVar3, iA, (i9 - ceaVar3.b) / 2, 0.0f);
                                        beaVar.k(ceaVar2, kl2.h(j2) - ceaVar2.a, (i9 - ceaVar2.b) / 2, 0.0f);
                                        return wef.a;
                                    }
                                });
                            }
                            i5++;
                            this = this;
                        }
                        k88.b("Collection contains no element matching the predicate.");
                        oo3.f();
                        return null;
                    }
                    i3++;
                    this = this;
                }
                k88.b("Collection contains no element matching the predicate.");
                oo3.f();
                return null;
            }
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
        int iD0 = ga7Var.D0(this.c);
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
        return Math.max(iD0, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.xn8
    public final int e(ga7 ga7Var, List list, int i) {
        Integer numValueOf;
        int iD0 = ga7Var.D0(this.c);
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
        return Math.max(iD0, numValueOf != null ? numValueOf.intValue() : 0);
    }
}
