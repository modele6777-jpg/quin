package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zva extends m1 implements awa, yv1 {
    public final r41 e;

    public zva(pv2 pv2Var, r41 r41Var) {
        super(pv2Var, true);
        this.e = r41Var;
    }

    @Override // defpackage.qxc
    public final Object a(xn2 xn2Var, Object obj) {
        return this.e.a(xn2Var, obj);
    }

    @Override // defpackage.qxc
    public final boolean c(Throwable th) {
        return this.e.e(th, false);
    }

    @Override // defpackage.qxc
    public final Object d(Object obj) {
        return this.e.d(obj);
    }

    @Override // defpackage.rg7, defpackage.dg7
    public final void h(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new eg7(y(), null, this);
        }
        v(cancellationException);
    }

    @Override // defpackage.yv1
    public final kxa i() {
        return this.e.i();
    }

    @Override // defpackage.m1
    public final void i0(Throwable th, boolean z) {
        if (this.e.e(th, false) || z) {
            return;
        }
        tq.C(this.d, th);
    }

    @Override // defpackage.yv1
    public final k41 iterator() {
        r41 r41Var = this.e;
        r41Var.getClass();
        return new k41(r41Var);
    }

    @Override // defpackage.m1
    public final void j0(Object obj) {
        this.e.c(null);
    }

    @Override // defpackage.yv1
    public final Object k() {
        return this.e.k();
    }

    public final void l0(x xVar) {
        Unsafe unsafe;
        Unsafe unsafe2;
        r41 r41Var = this.e;
        r41Var.getClass();
        long j = r41.X;
        do {
            unsafe = ud0.a;
            if (unsafe.compareAndSwapObject(r41Var, r41.X, (Object) null, xVar)) {
                return;
            }
        } while (unsafe.getObjectVolatile(r41Var, j) == null);
        while (true) {
            Object objectVolatile = ud0.a.getObjectVolatile(r41Var, j);
            ig4 ig4Var = t41.q;
            if (objectVolatile != ig4Var) {
                if (objectVolatile == t41.r) {
                    qc0.p("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    pd4.i(objectVolatile, "Another handler is already registered: ");
                    return;
                }
            }
            ig4 ig4Var2 = t41.r;
            do {
                unsafe2 = ud0.a;
                if (unsafe2.compareAndSwapObject(r41Var, r41.X, ig4Var, ig4Var2)) {
                    xVar.d(r41Var.q());
                    return;
                }
            } while (unsafe2.getObjectVolatile(r41Var, j) == ig4Var);
        }
    }

    @Override // defpackage.yv1
    public final Object m(xn2 xn2Var) {
        return this.e.m(xn2Var);
    }

    @Override // defpackage.yv1
    public final Object o(i92 i92Var) {
        r41 r41Var = this.e;
        r41Var.getClass();
        return r41.G(r41Var, i92Var);
    }

    @Override // defpackage.rg7
    public final void v(Throwable th) {
        CancellationException eg7Var = th instanceof CancellationException ? (CancellationException) th : null;
        if (eg7Var == null) {
            eg7Var = new eg7(y(), th, this);
        }
        this.e.e(eg7Var, true);
        t(eg7Var);
    }
}
