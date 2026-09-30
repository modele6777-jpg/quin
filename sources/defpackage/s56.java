package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s56 {
    public final ut8 a;
    public final Object b;
    public final ut8 c;
    public final r56 d;
    public final Method e;

    public s56(ut8 ut8Var, Object obj, ut8 ut8Var2, r56 r56Var, Class cls) {
        if (ut8Var == null) {
            qc0.j("Null containingTypeDefaultInstance");
            throw null;
        }
        if (r56Var.b == x9g.d && ut8Var2 == null) {
            qc0.j("Null messageDefaultInstance");
            throw null;
        }
        this.a = ut8Var;
        this.b = obj;
        this.c = ut8Var2;
        this.d = r56Var;
        if (!j87.class.isAssignableFrom(cls)) {
            this.e = null;
            return;
        }
        try {
            this.e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            cva.q(ib8.m(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
            throw null;
        }
    }

    public final Object a(Object obj) {
        if (this.d.b.a() != aag.v) {
            return obj;
        }
        try {
            return this.e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e) {
            cva.q("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            cva.q("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public final Object b(Object obj) {
        return this.d.b.a() == aag.v ? Integer.valueOf(((j87) obj).a()) : obj;
    }
}
