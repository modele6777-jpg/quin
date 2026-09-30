package defpackage;

import com.adjust.sdk.sig.r3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t56 extends h3 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, t56> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected bff unknownFields;

    public t56() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bff.f;
    }

    public static t56 j(Class cls) {
        t56 t56Var = defaultInstanceMap.get(cls);
        if (t56Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t56Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                ho7.r("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (t56Var != null) {
            return t56Var;
        }
        try {
            t56 t56Var2 = (t56) ((t56) wff.a.allocateInstance(cls)).i(6);
            if (t56Var2 != null) {
                defaultInstanceMap.put(cls, t56Var2);
                return t56Var2;
            }
            r3.l();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object k(Method method, t56 t56Var, Object... objArr) {
        try {
            return method.invoke(t56Var, objArr);
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

    public static n87 n(n87 n87Var) {
        int size = n87Var.size();
        return n87Var.G(size == 0 ? 10 : size * 2);
    }

    public static void o(Class cls, t56 t56Var) {
        t56Var.m();
        defaultInstanceMap.put(cls, t56Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u0b u0bVar = u0b.c;
        u0bVar.getClass();
        return u0bVar.a(getClass()).h(this, (t56) obj);
    }

    @Override // defpackage.h3
    public final int g(ffc ffcVar) {
        int iE;
        int iE2;
        if (l()) {
            if (ffcVar == null) {
                u0b u0bVar = u0b.c;
                u0bVar.getClass();
                iE2 = u0bVar.a(getClass()).e(this);
            } else {
                iE2 = ffcVar.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            qc0.p(tec.e(iE2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (ffcVar == null) {
            u0b u0bVar2 = u0b.c;
            u0bVar2.getClass();
            iE = u0bVar2.a(getClass()).e(this);
        } else {
            iE = ffcVar.e(this);
        }
        p(iE);
        return iE;
    }

    public final k56 h() {
        return (k56) i(5);
    }

    public final int hashCode() {
        if (l()) {
            u0b u0bVar = u0b.c;
            u0bVar.getClass();
            return u0bVar.a(getClass()).f(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        u0b u0bVar2 = u0b.c;
        u0bVar2.getClass();
        int iF = u0bVar2.a(getClass()).f(this);
        this.memoizedHashCode = iF;
        return iF;
    }

    public abstract Object i(int i);

    public final boolean l() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void m() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final void p(int i) {
        if (i < 0) {
            qc0.p(tec.e(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final void q(j72 j72Var) {
        u0b u0bVar = u0b.c;
        u0bVar.getClass();
        ffc ffcVarA = u0bVar.a(getClass());
        kb6 kb6Var = j72Var.a;
        if (kb6Var == null) {
            kb6Var = new kb6(j72Var);
        }
        ffcVarA.g(this, kb6Var);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = xt8.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        xt8.c(this, sb, 0);
        return sb.toString();
    }
}
