package defpackage;

import com.adjust.sdk.sig.r3;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class he8 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = ud0.a;
        a = unsafe.objectFieldOffset(he8.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(he8.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(he8.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean e(he8 he8Var, int i) {
        he8 he8Var2;
        he8 he8Var3;
        while (true) {
            he8 he8VarJ = this.j();
            if (he8VarJ instanceof e78) {
                return (((e78) he8VarJ).d & i) == 0 && he8VarJ.e(he8Var, i);
            }
            Unsafe unsafe = ud0.a;
            unsafe.putObjectVolatile(he8Var, b, he8VarJ);
            long j = a;
            unsafe.putObjectVolatile(he8Var, j, this);
            while (true) {
                Unsafe unsafe2 = ud0.a;
                he8Var2 = this;
                he8Var3 = he8Var;
                if (unsafe2.compareAndSwapObject(he8VarJ, a, he8Var2, he8Var3)) {
                    he8Var3.g(he8Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(he8VarJ, j) != he8Var2) {
                    break;
                }
                this = he8Var2;
                he8Var = he8Var3;
            }
            this = he8Var2;
            he8Var = he8Var3;
        }
    }

    public final he8 f() {
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = b;
            he8 he8Var = (he8) unsafe.getObjectVolatile(this, j);
            he8 he8Var2 = null;
            he8 he8Var3 = he8Var;
            while (true) {
                if (he8Var3 == null) {
                    r3.f();
                    return null;
                }
                Unsafe unsafe2 = ud0.a;
                long j2 = a;
                Object objectVolatile = unsafe2.getObjectVolatile(he8Var3, j2);
                if (objectVolatile == this) {
                    if (he8Var != he8Var3) {
                        while (true) {
                            Unsafe unsafe3 = ud0.a;
                            he8 he8Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(he8Var4, b, he8Var, he8Var3);
                            he8 he8Var5 = he8Var;
                            this = he8Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != he8Var5) {
                                    break;
                                }
                                this = this;
                                he8Var = he8Var5;
                            }
                        }
                    }
                    return he8Var3;
                }
                he8Var = he8Var;
                this = this;
                if (this.k()) {
                    return null;
                }
                if (!(objectVolatile instanceof mqb)) {
                    objectVolatile.getClass();
                    he8Var2 = he8Var3;
                    he8Var3 = (he8) objectVolatile;
                } else if (he8Var2 != null) {
                    he8 he8Var6 = ((mqb) objectVolatile).a;
                    while (true) {
                        he8 he8Var7 = he8Var3;
                        Unsafe unsafe4 = ud0.a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(he8Var2, a, he8Var7, he8Var6);
                        he8Var3 = he8Var7;
                        if (zCompareAndSwapObject2) {
                            he8Var3 = he8Var2;
                            he8Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(he8Var2, j2) != he8Var3) {
                            break;
                        }
                    }
                } else {
                    if (he8Var3 == null) {
                        r3.f();
                        return null;
                    }
                    he8Var3 = (he8) unsafe2.getObjectVolatile(he8Var3, j);
                }
            }
            this = this;
        }
    }

    public final void g(he8 he8Var) {
        he8 he8Var2;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = b;
            he8 he8Var3 = (he8) unsafe.getObjectVolatile(he8Var, j);
            if (this.h() != he8Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = ud0.a;
                he8Var2 = this;
                he8 he8Var4 = he8Var;
                if (unsafe2.compareAndSwapObject(he8Var4, b, he8Var3, he8Var2)) {
                    if (he8Var2.k()) {
                        he8Var4.f();
                        return;
                    }
                    return;
                } else {
                    he8Var = he8Var4;
                    if (unsafe2.getObjectVolatile(he8Var4, j) != he8Var3) {
                        break;
                    } else {
                        this = he8Var2;
                    }
                }
            }
            this = he8Var2;
        }
    }

    public final Object h() {
        return ud0.a.getObjectVolatile(this, a);
    }

    public final he8 i() {
        Object objH = h();
        mqb mqbVar = objH instanceof mqb ? (mqb) objH : null;
        if (mqbVar != null) {
            return mqbVar.a;
        }
        objH.getClass();
        return (he8) objH;
    }

    public final he8 j() {
        he8 he8VarF = f();
        if (he8VarF != null) {
            return he8VarF;
        }
        Unsafe unsafe = ud0.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            he8 he8Var = (he8) objectVolatile;
            if (!he8Var.k()) {
                return he8Var;
            }
            objectVolatile = ud0.a.getObjectVolatile(he8Var, j);
        }
    }

    public boolean k() {
        return h() instanceof mqb;
    }

    public String toString() {
        return new uw7(1, 3, mh3.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + mh3.F(this);
    }
}
