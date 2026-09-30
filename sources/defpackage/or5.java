package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class or5 extends ftb {
    public static final oq8 d;
    public final List b;
    public final List c;

    static {
        rob robVar = oq8.e;
        d = kj0.c0("application/x-www-form-urlencoded");
    }

    public or5(ArrayList arrayList, ArrayList arrayList2) {
        this.b = keg.j(arrayList);
        this.c = keg.j(arrayList2);
    }

    @Override // defpackage.ftb
    public final long a() {
        return e(null, true);
    }

    @Override // defpackage.ftb
    public final oq8 b() {
        return d;
    }

    @Override // defpackage.ftb
    public final void d(u41 u41Var) {
        e(u41Var, false);
    }

    public final long e(u41 u41Var, boolean z) {
        f41 f41VarI;
        if (z) {
            f41VarI = new f41();
        } else {
            u41Var.getClass();
            f41VarI = u41Var.i();
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                f41VarI.i1(38);
            }
            f41VarI.n1((String) list.get(i));
            f41VarI.i1(61);
            f41VarI.n1((String) this.c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = f41VarI.b;
        f41VarI.b();
        return j;
    }
}
