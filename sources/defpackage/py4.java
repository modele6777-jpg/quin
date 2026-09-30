package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class py4 implements j7f {
    public final qy4 a;
    public final String[] b;
    public final String c;

    public py4(qy4 qy4Var, String... strArr) {
        qy4Var.getClass();
        this.a = qy4Var;
        this.b = strArr;
        String strA = ey4.ERROR_TYPE.a();
        String strA2 = qy4Var.a();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.c = String.format(strA, Arrays.copyOf(new Object[]{String.format(strA2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // defpackage.j7f
    public final Collection e() {
        return pu4.a;
    }

    @Override // defpackage.j7f
    public final xr7 f() {
        return (np3) np3.f.getValue();
    }

    @Override // defpackage.j7f
    public final List getParameters() {
        return pu4.a;
    }

    @Override // defpackage.j7f
    public final y22 m() {
        sy4.a.getClass();
        return sy4.c;
    }

    @Override // defpackage.j7f
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return this.c;
    }
}
