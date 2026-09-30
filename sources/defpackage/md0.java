package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class md0 extends jd0 {
    public Object[] a;
    public int b;

    @Override // defpackage.jd0
    public final int c() {
        return this.b;
    }

    @Override // defpackage.jd0
    public final void d(int i, k10 k10Var) {
        Object[] objArrCopyOf = this.a;
        if (objArrCopyOf.length <= i) {
            int length = objArrCopyOf.length;
            do {
                length *= 2;
            } while (length <= i);
            objArrCopyOf = Arrays.copyOf(this.a, length);
            this.a = objArrCopyOf;
        }
        if (objArrCopyOf[i] == null) {
            this.b++;
        }
        objArrCopyOf[i] = k10Var;
    }

    @Override // defpackage.jd0
    public final Object get(int i) {
        return qd0.q0(i, this.a);
    }

    @Override // defpackage.jd0, java.lang.Iterable
    public final Iterator iterator() {
        return new ld0(this);
    }
}
