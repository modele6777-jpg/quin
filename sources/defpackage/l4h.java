package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l4h {
    public static final l4h f = new l4h(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public l4h(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static l4h b() {
        return new l4h(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iG0;
        int iH0;
        int iG1;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        vyg vygVar = (vyg) this.c[i2];
                        int iG2 = p90.G0(i6);
                        int iD = vygVar.d();
                        iG = xkg.g(iD, iD, iG2, iG);
                    } else if (i5 == 3) {
                        int iG3 = p90.G0(i4 << 3);
                        iG0 = iG3 + iG3;
                        iH0 = ((l4h) this.c[i2]).a();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new n1h());
                        }
                        ((Integer) this.c[i2]).getClass();
                        iG1 = p90.G0(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iG1 = p90.G0(i4 << 3) + 8;
                }
                iG = iG1 + iG;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iG0 = p90.G0(i7);
                iH0 = p90.H0(jLongValue);
            }
            iG = iH0 + iG0 + iG;
        }
        this.d = iG;
        return iG;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            cva.f();
            return;
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(g5b g5bVar) throws yyg {
        p90 p90Var = (p90) g5bVar.b;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    p90Var.E0(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    p90Var.x0(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    vyg vygVar = (vyg) obj;
                    p90Var.D0((i3 << 3) | 2);
                    p90Var.D0(vygVar.d());
                    vygVar.i(p90Var);
                } else if (i4 == 3) {
                    p90Var.B0(i3, 3);
                    ((l4h) obj).d(g5bVar);
                    p90Var.B0(i3, 4);
                } else {
                    if (i4 != 5) {
                        yg5.p(new n1h());
                        return;
                    }
                    p90Var.v0(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof l4h)) {
            l4h l4hVar = (l4h) obj;
            int i = this.a;
            if (i == l4hVar.a) {
                int[] iArr = this.b;
                int[] iArr2 = l4hVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.c;
                Object[] objArr2 = l4hVar.c;
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
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
