package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ra2 extends ta2 {
    public static ta2 f(int i) {
        if (i < 0) {
            return ta2.b;
        }
        return i > 0 ? ta2.c : ta2.a;
    }

    @Override // defpackage.ta2
    public final ta2 a(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.ta2
    public final ta2 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.ta2
    public final ta2 c(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.ta2
    public final ta2 d(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.ta2
    public final int e() {
        return 0;
    }
}
