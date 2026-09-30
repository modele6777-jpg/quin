package defpackage;

import com.adjust.sdk.sig.r3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v56 extends j3 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, v56> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected cff unknownFields;

    public v56() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cff.f;
    }

    public static v56 c(Class cls) {
        v56 v56Var = defaultInstanceMap.get(cls);
        if (v56Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                v56Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                ho7.r("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (v56Var != null) {
            return v56Var;
        }
        try {
            v56 v56Var2 = (v56) ((v56) xff.a.allocateInstance(cls)).b(6);
            if (v56Var2 != null) {
                defaultInstanceMap.put(cls, v56Var2);
                return v56Var2;
            }
            r3.l();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object d(Method method, v56 v56Var, Object... objArr) {
        try {
            return method.invoke(v56Var, objArr);
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

    public static final boolean e(v56 v56Var, boolean z) {
        byte bByteValue = ((Byte) v56Var.b(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        v0b v0bVar = v0b.c;
        v0bVar.getClass();
        boolean zC = v0bVar.a(v56Var.getClass()).c(v56Var);
        if (z) {
            v56Var.b(2);
        }
        return zC;
    }

    public static void i(Class cls, v56 v56Var) {
        v56Var.g();
        defaultInstanceMap.put(cls, v56Var);
    }

    @Override // defpackage.j3
    public final int a(gfc gfcVar) {
        int iH;
        int iH2;
        if (f()) {
            if (gfcVar == null) {
                v0b v0bVar = v0b.c;
                v0bVar.getClass();
                iH2 = v0bVar.a(getClass()).h(this);
            } else {
                iH2 = gfcVar.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            qc0.p(tec.e(iH2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (gfcVar == null) {
            v0b v0bVar2 = v0b.c;
            v0bVar2.getClass();
            iH = v0bVar2.a(getClass()).h(this);
        } else {
            iH = gfcVar.h(this);
        }
        j(iH);
        return iH;
    }

    public abstract Object b(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v0b v0bVar = v0b.c;
        v0bVar.getClass();
        return v0bVar.a(getClass()).e(this, (v56) obj);
    }

    public final boolean f() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void g() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final v56 h() {
        return (v56) b(4);
    }

    public final int hashCode() {
        if (f()) {
            v0b v0bVar = v0b.c;
            v0bVar.getClass();
            return v0bVar.a(getClass()).g(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        v0b v0bVar2 = v0b.c;
        v0bVar2.getClass();
        int iG = v0bVar2.a(getClass()).g(this);
        this.memoizedHashCode = iG;
        return iG;
    }

    public final void j(int i) {
        if (i < 0) {
            qc0.p(tec.e(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final void k(m72 m72Var) {
        v0b v0bVar = v0b.c;
        v0bVar.getClass();
        gfc gfcVarA = v0bVar.a(getClass());
        kd9 kd9Var = m72Var.a;
        if (kd9Var == null) {
            kd9Var = new kd9(m72Var);
        }
        gfcVarA.i(this, kd9Var);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = yt8.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        yt8.c(this, sb, 0);
        return sb.toString();
    }
}
