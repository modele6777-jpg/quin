package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fvg extends m7c {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafeD;
        try {
            try {
                unsafeD = Unsafe.getUnsafe();
            } catch (Exception e2) {
                cva.q("Could not initialize intrinsics", e2);
                return;
            }
        } catch (SecurityException unused) {
            try {
                unsafeD = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new c2(4));
            } catch (Exception unused2) {
                unsafeD = D();
            }
        }
        try {
            c = unsafeD.objectFieldOffset(ivg.class.getDeclaredField("c"));
            b = unsafeD.objectFieldOffset(ivg.class.getDeclaredField("b"));
            d = unsafeD.objectFieldOffset(ivg.class.getDeclaredField("a"));
            e = unsafeD.objectFieldOffset(gvg.class.getDeclaredField("a"));
            f = unsafeD.objectFieldOffset(gvg.class.getDeclaredField("b"));
            a = unsafeD;
        } catch (NoSuchFieldException e3) {
            yg5.p(e3);
        }
    }

    public static /* synthetic */ Unsafe D() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // defpackage.m7c
    public final boolean A(zwg zwgVar, bvg bvgVar, bvg bvgVar2) {
        return q7c.u(a, zwgVar, b, bvgVar, bvgVar2);
    }

    @Override // defpackage.m7c
    public final boolean B(ivg ivgVar, Object obj, Object obj2) {
        return q7c.u(a, ivgVar, d, obj, obj2);
    }

    @Override // defpackage.m7c
    public final boolean C(ivg ivgVar, gvg gvgVar, gvg gvgVar2) {
        return q7c.u(a, ivgVar, c, gvgVar, gvgVar2);
    }

    @Override // defpackage.m7c
    public final bvg w(zwg zwgVar) {
        bvg bvgVar;
        bvg bvgVar2 = bvg.d;
        do {
            bvgVar = zwgVar.b;
            if (bvgVar2 == bvgVar) {
                break;
            }
        } while (!A(zwgVar, bvgVar, bvgVar2));
        return bvgVar;
    }

    @Override // defpackage.m7c
    public final gvg x(zwg zwgVar) {
        gvg gvgVar;
        gvg gvgVar2 = gvg.c;
        do {
            gvgVar = zwgVar.c;
            if (gvgVar2 == gvgVar) {
                break;
            }
        } while (!C(zwgVar, gvgVar, gvgVar2));
        return gvgVar;
    }

    @Override // defpackage.m7c
    public final void y(gvg gvgVar, gvg gvgVar2) {
        a.putObject(gvgVar, f, gvgVar2);
    }

    @Override // defpackage.m7c
    public final void z(gvg gvgVar, Thread thread) {
        a.putObject(gvgVar, e, thread);
    }
}
