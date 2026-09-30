package defpackage;

import com.adjust.sdk.sig.r3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l0h extends dyg {
    private static final Map zzb = new ConcurrentHashMap();
    protected l4h zzc;
    private int zzd;

    public l0h() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = l4h.f;
    }

    public static void f(Class cls, l0h l0hVar) {
        l0hVar.e();
        zzb.put(cls, l0hVar);
    }

    public static final boolean i(l0h l0hVar, boolean z) {
        byte bByteValue = ((Byte) l0hVar.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = i3h.b.a(l0hVar.getClass()).c(l0hVar);
        if (z) {
            l0hVar.j(2);
        }
        return zC;
    }

    public static l0h m(Class cls) {
        Map map = zzb;
        l0h l0hVar = (l0h) map.get(cls);
        if (l0hVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                l0hVar = (l0h) map.get(cls);
            } catch (ClassNotFoundException e) {
                ho7.r("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (l0hVar != null) {
            return l0hVar;
        }
        try {
            l0h l0hVar2 = (l0h) ((l0h) s4h.a.allocateInstance(cls)).j(6);
            if (l0hVar2 != null) {
                map.put(cls, l0hVar2);
                return l0hVar2;
            }
            r3.l();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object o(Method method, l0h l0hVar, Object... objArr) {
        try {
            return method.invoke(l0hVar, objArr);
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

    @Override // defpackage.dyg
    public final void a(p90 p90Var) {
        s3h s3hVarA = i3h.b.a(getClass());
        g5b g5bVar = (g5b) p90Var.d;
        if (g5bVar == null) {
            g5bVar = new g5b(p90Var);
        }
        s3hVarA.d(this, g5bVar);
    }

    @Override // defpackage.dyg
    public final int c(s3h s3hVar) {
        if (h()) {
            int iF = s3hVar.f(this);
            if (iF >= 0) {
                return iF;
            }
            qc0.p(tec.e(iF, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iF2 = s3hVar.f(this);
        if (iF2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iF2;
            return iF2;
        }
        qc0.p(tec.e(iF2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // defpackage.dyg
    public final int d() {
        if (h()) {
            int iF = i3h.b.a(getClass()).f(this);
            if (iF >= 0) {
                return iF;
            }
            qc0.p(tec.e(iF, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iF2 = i3h.b.a(getClass()).f(this);
        if (iF2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iF2;
            return iF2;
        }
        qc0.p(tec.e(iF2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return i3h.b.a(getClass()).g(this, (l0h) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return i3h.b.a(getClass()).i(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int i2 = i3h.b.a(getClass()).i(this);
        this.zza = i2;
        return i2;
    }

    public abstract Object j(int i);

    public final e0h k() {
        return (e0h) j(5);
    }

    public final e0h l() {
        e0h e0hVar = (e0h) j(5);
        l0h l0hVar = e0hVar.a;
        if (!l0hVar.getClass().isInstance(this)) {
            qc0.j("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        if (!l0hVar.equals(this)) {
            if (!e0hVar.b.h()) {
                l0h l0hVarN = e0hVar.a.n();
                i3h.b.a(l0hVarN.getClass()).h(l0hVarN, e0hVar.b);
                e0hVar.b = l0hVarN;
            }
            l0h l0hVar2 = e0hVar.b;
            i3h.b.a(l0hVar2.getClass()).h(l0hVar2, this);
        }
        return e0hVar;
    }

    public final l0h n() {
        return (l0h) j(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = x2h.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        x2h.c(this, sb, 0);
        return sb.toString();
    }
}
