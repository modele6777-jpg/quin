package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lg7 implements x07 {
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final ag9 a;

    static {
        Unsafe unsafe = ud0.a;
        c = unsafe.objectFieldOffset(lg7.class.getDeclaredField("_isCompleting$volatile"));
        d = unsafe.objectFieldOffset(lg7.class.getDeclaredField("_rootCause$volatile"));
        b = unsafe.objectFieldOffset(lg7.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public lg7(ag9 ag9Var, Throwable th) {
        this.a = ag9Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thC = c();
        if (thC == null) {
            ud0.a.putObjectVolatile(this, d, th);
            return;
        }
        if (th == thC) {
            return;
        }
        Unsafe unsafe = ud0.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                pd4.i(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    @Override // defpackage.x07
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) ud0.a.getObjectVolatile(this, d);
    }

    @Override // defpackage.x07
    public final ag9 d() {
        return this.a;
    }

    public final boolean e() {
        return c() != null;
    }

    public final boolean f() {
        return ud0.a.getIntVolatile(this, c) == 1;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = ud0.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                pd4.i(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th != null && !th.equals(thC)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, sg7.e);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + ud0.a.getObjectVolatile(this, b) + ", list=" + this.a + ']';
    }
}
