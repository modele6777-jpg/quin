package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ocd {
    public static final ig4 a = new ig4("NO_VALUE", 2);

    public static final ncd a(int i, int i2, i41 i41Var) {
        if (i < 0) {
            qc0.o(tec.e(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            qc0.o(tec.e(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && i41Var != i41.a) {
            ho7.y(i41Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new ncd(i, i3, i41Var);
    }

    public static /* synthetic */ ncd b(int i, int i2, i41 i41Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            i41Var = i41.a;
        }
        return a(i, i2, i41Var);
    }

    public static final wj5 c(kcd kcdVar, pv2 pv2Var, int i, i41 i41Var) {
        return ((i == 0 || i == -3) && i41Var == i41.a) ? kcdVar : new hw1(i, i41Var, pv2Var, kcdVar);
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
