package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ky implements xn8 {
    public final uy a;
    public cea[] b;
    public cea[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final jy h = new jy(this);
    public final iy i = new iy(this);

    public ky(uy uyVar) {
        this.a = uyVar;
    }

    @Override // defpackage.xn8
    public final int a(ga7 ga7Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((tn8) list.get(0)).q(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((tn8) list.get(i2)).q(i));
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
    public final yn8 b(zn8 zn8Var, List list, long j) {
        iy9 iy9Var;
        int size = list.size();
        cea[] ceaVarArr = new cea[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            tn8 tn8Var = (tn8) list.get(i);
            Object objE = tn8Var.E();
            ny nyVar = objE instanceof ny ? (ny) objE : null;
            if (nyVar != null && ((Boolean) nyVar.a.getValue()).booleanValue()) {
                cea ceaVarV = tn8Var.v(j);
                long j3 = (((long) ceaVarV.b) & 4294967295L) | (((long) ceaVarV.a) << 32);
                ceaVarArr[i] = ceaVarV;
                j2 = j3;
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            tn8 tn8Var2 = (tn8) list.get(i2);
            if (ceaVarArr[i2] == null) {
                ceaVarArr[i2] = tn8Var2.v(j);
            }
        }
        if (zn8Var.k0()) {
            iy9Var = new iy9(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                cea ceaVar = ceaVarArr[i5];
                if (ceaVar != null) {
                    Object objE2 = ((tn8) list.get(i5)).E();
                    ny nyVar2 = objE2 instanceof ny ? (ny) objE2 : null;
                    if (nyVar2 == null || !((Boolean) nyVar2.b.getValue()).booleanValue()) {
                        int i6 = ceaVar.a;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = ceaVar.b;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            iy9Var = new iy9(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) iy9Var.a()).intValue();
        int iIntValue2 = ((Number) iy9Var.b()).intValue();
        boolean zK0 = zn8Var.k0();
        qu4 qu4Var = qu4.a;
        if (zK0) {
            this.b = ceaVarArr;
            this.d = iIntValue;
            this.f = iIntValue2;
            return zn8Var.n0(iIntValue, iIntValue2, qu4Var, this.h);
        }
        this.a.c.setValue(new e77((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        this.c = ceaVarArr;
        this.e = iIntValue;
        this.g = iIntValue2;
        return zn8Var.n0(iIntValue, iIntValue2, qu4Var, this.i);
    }

    @Override // defpackage.xn8
    public final int c(ga7 ga7Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((tn8) list.get(0)).n(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((tn8) list.get(i2)).n(i));
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
