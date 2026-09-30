package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n58 extends sv2 implements ov3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(n58.class, "runningWorkers$volatile");
    public static final /* synthetic */ long w = ud0.a.objectFieldOffset(n58.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ ov3 c;
    public final sv2 d;
    public final int e;
    public final ie8 f;
    public final Object g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public n58(sv2 sv2Var, int i) {
        ov3 ov3Var = sv2Var instanceof ov3 ? (ov3) sv2Var : null;
        this.c = ov3Var == null ? qq3.a : ov3Var;
        this.d = sv2Var;
        this.e = i;
        this.f = new ie8();
        this.g = new Object();
    }

    @Override // defpackage.ov3
    public final ta4 R(long j, Runnable runnable, pv2 pv2Var) {
        return this.c.R(j, runnable, pv2Var);
    }

    @Override // defpackage.sv2
    public final void Z0(pv2 pv2Var, Runnable runnable) {
        Runnable runnableD1;
        this.f.a(runnable);
        if (ud0.a.getIntVolatile(this, w) >= this.e || !e1() || (runnableD1 = d1()) == null) {
            return;
        }
        try {
            aa4.b(this.d, this, new w36(this, runnableD1, false, 11));
        } catch (Throwable th) {
            v.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.sv2
    public final void a1(pv2 pv2Var, Runnable runnable) {
        Runnable runnableD1;
        this.f.a(runnable);
        if (ud0.a.getIntVolatile(this, w) >= this.e || !e1() || (runnableD1 = d1()) == null) {
            return;
        }
        try {
            this.d.a1(this, new w36(this, runnableD1, false, 11));
        } catch (Throwable th) {
            v.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.sv2
    public final sv2 c1(int i) {
        abg.p(i);
        return i >= this.e ? this : super.c1(i);
    }

    public final Runnable d1() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = v;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean e1() {
        synchronized (this.g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = v;
            if (ud0.a.getIntVolatile(this, w) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.ov3
    public final void k0(long j, pl1 pl1Var) {
        this.c.k0(j, pl1Var);
    }

    @Override // defpackage.sv2
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return tec.n(sb, this.e, ')');
    }
}
