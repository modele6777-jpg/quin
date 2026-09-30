package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ay0 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public ay0(int... iArr) {
        List listJ1;
        this.a = iArr;
        Integer numP0 = qd0.p0(iArr, 0);
        this.b = numP0 != null ? numP0.intValue() : -1;
        Integer numP1 = qd0.p0(iArr, 1);
        this.c = numP1 != null ? numP1.intValue() : -1;
        Integer numP2 = qd0.p0(iArr, 2);
        this.d = numP2 != null ? numP2.intValue() : -1;
        if (iArr.length <= 3) {
            listJ1 = pu4.a;
        } else {
            if (iArr.length > 1024) {
                qc0.j(tec.n(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            listJ1 = s72.j1(new rd0(iArr).subList(3, iArr.length));
        }
        this.e = listJ1;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        ay0 ay0Var = (ay0) obj;
        return this.b == ay0Var.b && this.c == ay0Var.c && this.d == ay0Var.d && this.e.equals(ay0Var.e);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : s72.D0(arrayList, ".", null, null, null, 62);
    }
}
