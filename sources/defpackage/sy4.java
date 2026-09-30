package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sy4 {
    public static final sy4 a = new sy4();
    public static final hy4 b = hy4.a;
    public static final xx4 c = new xx4(t99.g(String.format(ey4.ERROR_CLASS.a(), Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final oy4 d = c(qy4.f, new String[0]);
    public static final oy4 e = c(qy4.H0, new String[0]);
    public static final Set f = n3d.p(new iy4());

    public static final my4 a(ny4 ny4Var, boolean z, String... strArr) {
        if (!z) {
            return new my4(ny4Var, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new uwe(ny4Var, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final my4 b(ny4 ny4Var, String... strArr) {
        return a(ny4Var, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final oy4 c(qy4 qy4Var, String... strArr) {
        qy4Var.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return e(qy4Var, pu4.a, d(qy4Var, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static py4 d(qy4 qy4Var, String... strArr) {
        qy4Var.getClass();
        return new py4(qy4Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static oy4 e(qy4 qy4Var, List list, j7f j7fVar, String... strArr) {
        qy4Var.getClass();
        return new oy4(j7fVar, b(ny4.ERROR_TYPE_SCOPE, j7fVar.toString()), qy4Var, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(bm3 bm3Var) {
        if (bm3Var != null) {
            return (bm3Var instanceof xx4) || (bm3Var.k() instanceof xx4) || bm3Var == b;
        }
        return false;
    }
}
