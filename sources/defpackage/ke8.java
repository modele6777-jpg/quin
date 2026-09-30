package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ke8 {
    public static final ig4 e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = ud0.a;
        f = unsafe.objectFieldOffset(ke8.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(ke8.class.getDeclaredField("_state$volatile"));
        e = new ig4("REMOVE_FROZEN", 2);
    }

    public ke8(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            qc0.p("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        qc0.p("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        ke8 ke8Var = this;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(ke8Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = ke8Var.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = ke8Var.b;
            AtomicReferenceArray atomicReferenceArray = ke8Var.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(ke8Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    ke8 ke8VarC = this;
                    while ((ud0.a.getLongVolatile(ke8VarC, j) & 1152921504606846976L) != 0) {
                        ke8VarC = ke8VarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = ke8VarC.d;
                        int i4 = ke8VarC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof je8) && ((je8) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            ke8VarC = null;
                        }
                        if (ke8VarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                ke8Var = this;
            } else {
                int i5 = ke8Var.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = ud0.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            ke8 ke8Var = this;
            if (ud0.a.compareAndSwapLong(ke8Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = ke8Var;
        }
    }

    public final ke8 c() {
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Unsafe unsafe2;
        do {
            unsafe = ud0.a;
            j = g;
            longVolatile = unsafe.getLongVolatile(this, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j2 = longVolatile;
                break;
            }
            j2 = 1152921504606846976L | longVolatile;
        } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        while (true) {
            Unsafe unsafe3 = ud0.a;
            long j3 = f;
            ke8 ke8Var = (ke8) unsafe3.getObjectVolatile(this, j3);
            if (ke8Var != null) {
                return ke8Var;
            }
            ke8 ke8Var2 = new ke8(this.a * 2, this.b);
            int i = (int) (1073741823 & j2);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object je8Var = this.d.get(i4);
                if (je8Var == null) {
                    je8Var = new je8(i);
                }
                ke8Var2.d.set(ke8Var2.c & i, je8Var);
                i++;
            }
            ud0.a.putLongVolatile(ke8Var2, g, j2 & (-1152921504606846977L));
            do {
                unsafe2 = ud0.a;
                if (unsafe2.compareAndSwapObject(this, f, (Object) null, ke8Var2)) {
                    break;
                }
            } while (unsafe2.getObjectVolatile(this, j3) == null);
        }
    }

    public final Object d() {
        ke8 ke8VarC = this;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(ke8VarC, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return e;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = ke8VarC.c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = ke8VarC.d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = ke8VarC.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof je8)) {
                    long j2 = (i + 1) & 1073741823;
                    if (unsafe.compareAndSwapLong(ke8VarC, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    ke8VarC = this;
                    if (z) {
                        while (true) {
                            Unsafe unsafe2 = ud0.a;
                            long j3 = g;
                            long longVolatile2 = unsafe2.getLongVolatile(ke8VarC, j3);
                            int i5 = (int) (longVolatile2 & 1073741823);
                            if ((longVolatile2 & 1152921504606846976L) != 0) {
                                ke8VarC = ke8VarC.c();
                            } else {
                                if (unsafe2.compareAndSwapLong(ke8VarC, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                    ke8VarC.d.set(ke8VarC.c & i5, null);
                                    ke8VarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (ke8VarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
