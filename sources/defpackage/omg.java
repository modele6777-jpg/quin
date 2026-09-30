package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class omg extends qlg {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected gog zzc;

    public omg() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = gog.f;
    }

    public static omg c(omg omgVar, byte[] bArr, hmg hmgVar) throws bng {
        int length = bArr.length;
        if (length != 0) {
            omg omgVarG = omgVar.g();
            try {
                yng yngVarA = vng.c.a(omgVarG.getClass());
                yngVarA.h(omgVarG, bArr, 0, length, new tlg(hmgVar));
                yngVarA.c(omgVarG);
                omgVar = omgVarG;
            } catch (bng e) {
                if (e.b()) {
                    throw new bng(e.getMessage(), e);
                }
                throw e;
            } catch (cog e2) {
                throw e2.a();
            } catch (IOException e3) {
                if (e3.getCause() instanceof bng) {
                    throw ((bng) e3.getCause());
                }
                throw new bng(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                s8f.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        p(omgVar);
        return omgVar;
    }

    public static omg l(Class cls) {
        Map map = zze;
        omg omgVar = (omg) map.get(cls);
        if (omgVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                omgVar = (omg) map.get(cls);
            } catch (ClassNotFoundException e) {
                ho7.r("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (omgVar != null) {
            return omgVar;
        }
        try {
            omg omgVar2 = (omg) ((omg) iog.a.allocateInstance(cls)).q(6);
            if (omgVar2 != null) {
                map.put(cls, omgVar2);
                return omgVar2;
            }
            r3.l();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void m(Class cls, omg omgVar) {
        omgVar.f();
        zze.put(cls, omgVar);
    }

    public static Object n(Method method, omg omgVar, Object... objArr) {
        try {
            return method.invoke(omgVar, objArr);
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

    public static final boolean o(omg omgVar, boolean z) {
        byte bByteValue = ((Byte) omgVar.q(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = vng.c.a(omgVar.getClass()).f(omgVar);
        if (z) {
            omgVar.q(2);
        }
        return zF;
    }

    public static void p(omg omgVar) {
        if (omgVar != null && !o(omgVar, true)) {
            throw new cog().a();
        }
    }

    @Override // defpackage.qlg
    public final int b(yng yngVar) {
        if (e()) {
            int iE = yngVar.e(this);
            if (iE >= 0) {
                return iE;
            }
            s8f.g(String.valueOf(iE).length() + 42, iE);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iE2 = yngVar.e(this);
        if (iE2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        s8f.g(String.valueOf(iE2).length() + 42, iE2);
        return 0;
    }

    public final void d(gmg gmgVar) {
        yng yngVarA = vng.c.a(getClass());
        g5b g5bVar = gmgVar.a;
        if (g5bVar == null) {
            g5bVar = new g5b(gmgVar);
        }
        yngVarA.j(this, g5bVar);
    }

    public final boolean e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return vng.c.a(getClass()).k(this, (omg) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final omg g() {
        return (omg) q(4);
    }

    public final mmg h() {
        return (mmg) q(5);
    }

    public final int hashCode() {
        if (e()) {
            return vng.c.a(getClass()).i(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int i2 = vng.c.a(getClass()).i(this);
        this.zza = i2;
        return i2;
    }

    public final mmg i() {
        mmg mmgVar = (mmg) q(5);
        mmgVar.f(this);
        return mmgVar;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int iE = vng.c.a(getClass()).e(this);
            if (iE >= 0) {
                return iE;
            }
            s8f.g(String.valueOf(iE).length() + 42, iE);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iE2 = vng.c.a(getClass()).e(this);
        if (iE2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        s8f.g(String.valueOf(iE2).length() + 42, iE2);
        return 0;
    }

    public abstract Object q(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = png.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        png.b(this, sb, 0);
        return sb.toString();
    }
}
