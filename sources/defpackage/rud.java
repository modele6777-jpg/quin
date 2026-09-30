package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rud {
    public static final LinkedHashSet a;
    public static final j22 b;

    static {
        List<dx5> listI = t72.I(pj7.a, pj7.h, pj7.i, pj7.c, pj7.d, pj7.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (dx5 dx5Var : listI) {
            dx5Var.getClass();
            linkedHashSet.add(new j22(dx5Var.b(), dx5Var.a.g()));
        }
        a = linkedHashSet;
        dx5 dx5Var2 = pj7.g;
        dx5Var2.getClass();
        b = new j22(dx5Var2.b(), dx5Var2.a.g());
    }
}
