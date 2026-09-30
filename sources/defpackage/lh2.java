package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lh2 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = ud0.a;
        a = unsafe.objectFieldOffset(lh2.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(lh2.class.getDeclaredField("_prev$volatile"));
    }

    public lh2(rtc rtcVar) {
        this._prev$volatile = rtcVar;
    }

    public final void a() {
        ud0.a.putObjectVolatile(this, b, (Object) null);
    }

    public final lh2 c() {
        Object objectVolatile = ud0.a.getObjectVolatile(this, a);
        if (objectVolatile == kh2.a) {
            return null;
        }
        return (lh2) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        lh2 lh2Var;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = ud0.a;
            long j = b;
            lh2 lh2Var2 = (lh2) unsafe2.getObjectVolatile(this, j);
            while (lh2Var2 != null && lh2Var2.d()) {
                lh2Var2 = (lh2) ud0.a.getObjectVolatile(lh2Var2, j);
            }
            lh2 lh2VarC = c();
            lh2VarC.getClass();
            do {
                lh2Var = lh2VarC;
                if (!lh2Var.d()) {
                    break;
                } else {
                    lh2VarC = lh2Var.c();
                }
            } while (lh2VarC != null);
            while (true) {
                Object objectVolatile = ud0.a.getObjectVolatile(lh2Var, j);
                lh2 lh2Var3 = ((lh2) objectVolatile) == null ? null : lh2Var2;
                while (true) {
                    unsafe = ud0.a;
                    if (unsafe.compareAndSwapObject(lh2Var, b, objectVolatile, lh2Var3)) {
                        break;
                    } else if (unsafe.getObjectVolatile(lh2Var, j) != objectVolatile) {
                    }
                }
            }
            if (lh2Var2 != null) {
                unsafe.putObjectVolatile(lh2Var2, a, lh2Var);
            }
            if (!lh2Var.d() || lh2Var.c() == null) {
                if (lh2Var2 == null || !lh2Var2.d()) {
                    return;
                }
            }
        }
    }
}
