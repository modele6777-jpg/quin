package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sw1 extends rtc {
    public final r41 g;
    public final /* synthetic */ AtomicReferenceArray v;

    public sw1(long j, sw1 sw1Var, r41 r41Var, int i) {
        super(j, sw1Var, i);
        this.g = r41Var;
        this.v = new AtomicReferenceArray(t41.b * 2);
    }

    @Override // defpackage.rtc
    public final int g() {
        return t41.b;
    }

    @Override // defpackage.rtc
    public final void h(int i, pv2 pv2Var) {
        r41 r41Var;
        int i2 = t41.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.v.get(i * 2);
        while (true) {
            Object objL = l(i);
            boolean z2 = objL instanceof fzf;
            r41Var = this.g;
            if (z2 || (objL instanceof gzf)) {
                if (k(i, objL, z ? t41.j : t41.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        r41Var.getClass();
                        a26 a26Var = r41Var.b;
                        if (a26Var != null) {
                            vpf.q(a26Var, obj, pv2Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (objL == t41.j || objL == t41.k) {
                    break;
                }
                if (objL != t41.g && objL != t41.f) {
                    if (objL == t41.i || objL == t41.d || objL == t41.l) {
                        return;
                    }
                    pd4.i(objL, "unexpected state: ");
                    return;
                }
            }
        }
        n(i, null);
        if (z) {
            r41Var.getClass();
            a26 a26Var2 = r41Var.b;
            if (a26Var2 != null) {
                vpf.q(a26Var2, obj, pv2Var);
            }
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.v;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.v.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            r41 r41Var = this.g;
            r41Var.getClass();
            r41Var.P((this.d * ((long) t41.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.v.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.v.set((i * 2) + 1, obj);
    }
}
