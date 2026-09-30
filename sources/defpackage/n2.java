package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n2 extends o2 implements RandomAccess {
    public final o2 a;
    public final int b;
    public final int c;

    public n2(o2 o2Var, int i, int i2) {
        this.a = o2Var;
        this.b = i;
        y7h.p(i, i2, o2Var.c());
        this.c = i2 - i;
    }

    @Override // defpackage.d1
    public final int c() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            r3.i(ks0.k("index: ", i, ", size: ", i2));
            return null;
        }
        return this.a.get(this.b + i);
    }

    @Override // defpackage.o2, java.util.List
    public final List subList(int i, int i2) {
        y7h.p(i, i2, this.c);
        int i3 = this.b;
        return new n2(this.a, i + i3, i3 + i2);
    }
}
