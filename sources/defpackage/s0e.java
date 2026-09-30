package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0e extends b5 implements h89, wj5, q36 {
    public static final /* synthetic */ long f = ud0.a.objectFieldOffset(s0e.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public s0e(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.b89, defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        m(obj);
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e9 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:14:0x0038, B:28:0x007d, B:30:0x0087, B:33:0x008e, B:34:0x0092, B:36:0x0095, B:46:0x00b6, B:49:0x00c6, B:50:0x00e2, B:56:0x00f2, B:53:0x00e9, B:55:0x00ef, B:38:0x009b, B:42:0x00a2, B:21:0x0053, B:24:0x0060, B:27:0x006e), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00e2->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c5 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wj5
    public final java.lang.Object b(defpackage.xj5 r14, defpackage.xn2 r15) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s0e.b(xj5, xn2):java.lang.Object");
    }

    @Override // defpackage.q36
    public final wj5 c(pv2 pv2Var, int i, i41 i41Var) {
        return (((i < 0 || i >= 2) && i != -2) || i41Var != i41.b) ? ocd.c(this, pv2Var, i, i41Var) : this;
    }

    @Override // defpackage.b5
    public final c5 f() {
        return new u0e();
    }

    @Override // defpackage.b5
    public final c5[] g() {
        return new u0e[2];
    }

    @Override // defpackage.q0e
    public final Object getValue() {
        Object objectVolatile = ud0.a.getObjectVolatile(this, f);
        if (objectVolatile == rj9.a) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.b89
    public final void h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.b89
    public final boolean i(Object obj) {
        m(obj);
        return true;
    }

    public final boolean l(Object obj, Object obj2) {
        ig4 ig4Var = rj9.a;
        if (obj == null) {
            obj = ig4Var;
        }
        if (obj2 == null) {
            obj2 = ig4Var;
        }
        return n(obj, obj2);
    }

    public final void m(Object obj) {
        if (obj == null) {
            obj = rj9.a;
        }
        n(null, obj);
    }

    public final boolean n(Object obj, Object obj2) {
        int i;
        c5[] c5VarArr;
        ig4 ig4Var;
        synchronized (this) {
            Unsafe unsafe = ud0.a;
            long j = f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !pa7.t(objectVolatile, obj)) {
                return false;
            }
            if (pa7.t(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            c5[] c5VarArr2 = this.a;
            while (true) {
                u0e[] u0eVarArr = (u0e[]) c5VarArr2;
                if (u0eVarArr != null) {
                    for (u0e u0eVar : u0eVarArr) {
                        if (u0eVar != null) {
                            AtomicReference atomicReference = u0eVar.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 == null || obj3 == (ig4Var = t0e.b)) {
                                    break;
                                }
                                ig4 ig4Var2 = t0e.a;
                                if (obj3 != ig4Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, ig4Var2)) {
                                            ((pl1) obj3).g(wef.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, ig4Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    c5VarArr = this.a;
                }
                c5VarArr2 = c5VarArr;
                i3 = i;
            }
        }
    }
}
