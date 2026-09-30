package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bff {
    public static final bff f = new bff(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public bff(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final int a() {
        int iC;
        int iE;
        int iC2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        y61 y61Var = (y61) this.c[i2];
                        int iC3 = j72.c(i4);
                        int size = y61Var.size();
                        iA = ib8.a(size, size, iC3, iA);
                    } else if (i5 == 3) {
                        iC = j72.c(i4) * 2;
                        iE = ((bff) this.c[i2]).a();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new za7.a("Protocol message tag had invalid wire type."));
                        }
                        ((Integer) this.c[i2]).getClass();
                        iC2 = j72.c(i4) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iC2 = j72.c(i4) + 8;
                }
                iA = iC2 + iA;
            } else {
                long jLongValue = ((Long) this.c[i2]).longValue();
                iC = j72.c(i4);
                iE = j72.e(jLongValue);
            }
            iA = iE + iC + iA;
        }
        this.d = iA;
        return iA;
    }

    public final void b(kb6 kb6Var) throws k72 {
        if (this.a == 0) {
            return;
        }
        kb6Var.getClass();
        j72 j72Var = (j72) kb6Var.b;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                long jLongValue = ((Long) obj).longValue();
                j72Var.m(i3, 0);
                j72Var.o(jLongValue);
            } else if (i4 == 1) {
                long jLongValue2 = ((Long) obj).longValue();
                j72Var.m(i3, 1);
                j72Var.j(jLongValue2);
            } else if (i4 == 2) {
                j72Var.m(i3, 2);
                j72Var.h((y61) obj);
            } else if (i4 == 3) {
                j72Var.m(i3, 3);
                ((bff) obj).b(kb6Var);
                j72Var.m(i3, 4);
            } else if (i4 != 5) {
                yg5.p(new za7.a("Protocol message tag had invalid wire type."));
                return;
            } else {
                int iIntValue = ((Integer) obj).intValue();
                j72Var.m(i3, 5);
                j72Var.i(iIntValue);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bff)) {
            bff bffVar = (bff) obj;
            int i = this.a;
            if (i == bffVar.a) {
                int[] iArr = this.b;
                int[] iArr2 = bffVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.c;
                Object[] objArr2 = bffVar.c;
                int i3 = this.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
