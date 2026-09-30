package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum kz3 {
    c(true),
    d(true),
    e(true),
    f(false),
    g(true),
    v(true),
    w(true),
    x(true),
    y(true),
    z(true),
    X(true),
    Y(true),
    Z(true),
    E0(true);

    public static final Set a;
    public static final Set b;
    private final boolean includeByDefault;

    static {
        kz3[] kz3VarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (kz3 kz3Var : kz3VarArrValues) {
            if (kz3Var.includeByDefault) {
                arrayList.add(kz3Var);
            }
        }
        a = s72.o1(arrayList);
        b = qd0.I0(values());
    }

    kz3(boolean z2) {
        this.includeByDefault = z2;
    }
}
