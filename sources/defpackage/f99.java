package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f99 extends mxc implements d99 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(f99.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long x = ud0.a.objectFieldOffset(f99.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public f99() {
        super(1);
        this.owner$volatile = g99.a;
    }

    @Override // defpackage.d99
    public final Object b(xn2 xn2Var) {
        boolean zF = f();
        wef wefVar = wef.a;
        if (!zF) {
            pl1 pl1VarW = pa7.W(k99.D(xn2Var));
            try {
                e99 e99Var = new e99(this, pl1VarW);
                while (true) {
                    int andDecrement = mxc.e.getAndDecrement(this);
                    if (andDecrement <= this.a) {
                        if (andDecrement > 0) {
                            e99Var.n(wefVar, this.b);
                            break;
                        }
                        if (c(e99Var)) {
                            break;
                        }
                    }
                }
                Object objT = pl1VarW.t();
                bw2 bw2Var = bw2.a;
                if (objT != bw2Var) {
                    objT = wefVar;
                }
                if (objT == bw2Var) {
                    return objT;
                }
            } catch (Throwable th) {
                pl1VarW.D();
                throw th;
            }
        }
        return wefVar;
    }

    public final boolean e() {
        return Math.max(ud0.a.getIntVolatile(this, mxc.f), 0) == 0;
    }

    public final boolean f() {
        f99 f99Var;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = mxc.f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.a) {
                while (true) {
                    Unsafe unsafe2 = ud0.a;
                    long j2 = mxc.f;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.a;
                    if (intVolatile2 <= i) {
                        f99Var = this;
                        break;
                    }
                    f99 f99Var2 = this;
                    f99Var = f99Var2;
                    if (unsafe2.compareAndSwapInt(f99Var2, j2, intVolatile2, i)) {
                        break;
                    }
                    this = f99Var;
                }
            } else {
                f99Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(f99Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(f99Var, x, (Object) null);
                    return true;
                }
            }
            this = f99Var;
        }
    }

    @Override // defpackage.d99
    public final void h(Object obj) {
        while (this.e()) {
            Unsafe unsafe = ud0.a;
            long j = x;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            ig4 ig4Var = g99.a;
            if (objectVolatile != ig4Var) {
                if (objectVolatile != obj && obj != null) {
                    ho7.q("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    f99 f99Var = this;
                    if (ud0.a.compareAndSwapObject(f99Var, x, objectVolatile, ig4Var)) {
                        f99Var.d();
                        return;
                    } else {
                        if (ud0.a.getObjectVolatile(f99Var, j) != objectVolatile) {
                            this = f99Var;
                            break;
                        }
                        this = f99Var;
                    }
                }
            }
        }
        qc0.p("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + mh3.F(this) + "[isLocked=" + e() + ",owner=" + ud0.a.getObjectVolatile(this, x) + ']';
    }
}
