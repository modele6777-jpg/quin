package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yp9 extends jd0 {
    public final k10 a;
    public final int b;

    public yp9(int i, k10 k10Var) {
        this.a = k10Var;
        this.b = i;
    }

    @Override // defpackage.jd0
    public final int c() {
        return 1;
    }

    @Override // defpackage.jd0
    public final void d(int i, k10 k10Var) {
        throw new IllegalStateException();
    }

    @Override // defpackage.jd0
    public final Object get(int i) {
        if (i == this.b) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.jd0, java.lang.Iterable
    public final Iterator iterator() {
        return new hyc(2, this);
    }
}
