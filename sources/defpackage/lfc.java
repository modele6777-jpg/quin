package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lfc {
    public static final Class a;
    public static final aff b;
    public static final eff c;

    static {
        Class<?> cls;
        Class<?> cls2;
        v0b v0bVar = v0b.c;
        aff affVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            v0b v0bVar2 = v0b.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                affVar = (aff) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = affVar;
        c = new eff();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += m72.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m72.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m72.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += m72.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += m72.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += m72.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += m72.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += m72.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += m72.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(aff affVar, Object obj, Object obj2) {
        ((eff) affVar).getClass();
        v56 v56Var = (v56) obj;
        cff cffVar = v56Var.unknownFields;
        cff cffVar2 = ((v56) obj2).unknownFields;
        cff cffVar3 = cff.f;
        if (!cffVar3.equals(cffVar2)) {
            if (cffVar3.equals(cffVar)) {
                int i = cffVar.a + cffVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(cffVar.b, i);
                System.arraycopy(cffVar2.b, 0, iArrCopyOf, cffVar.a, cffVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(cffVar.c, i);
                System.arraycopy(cffVar2.c, 0, objArrCopyOf, cffVar.a, cffVar2.a);
                cffVar = new cff(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                cffVar.getClass();
                if (!cffVar2.equals(cffVar3)) {
                    if (!cffVar.e) {
                        cva.f();
                        return;
                    }
                    int i2 = cffVar.a + cffVar2.a;
                    cffVar.a(i2);
                    System.arraycopy(cffVar2.b, 0, cffVar.b, cffVar.a, cffVar2.a);
                    System.arraycopy(cffVar2.c, 0, cffVar.c, cffVar.a, cffVar2.a);
                    cffVar.a = i2;
                }
            }
        }
        v56Var.unknownFields = cffVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        m72Var.D(i3);
        while (i2 < list.size()) {
            m72Var.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        m72Var.D(i3);
        while (i2 < list.size()) {
            m72Var.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += m72.j(((Integer) list.get(i3)).intValue());
        }
        m72Var.D(iJ);
        while (i2 < list.size()) {
            m72Var.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        m72Var.D(i3);
        while (i2 < list.size()) {
            m72Var.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        m72Var.D(i3);
        while (i2 < list.size()) {
            m72Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        m72Var.D(i3);
        while (i2 < list.size()) {
            m72Var.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += m72.j(((Integer) list.get(i3)).intValue());
        }
        m72Var.D(iJ);
        while (i2 < list.size()) {
            m72Var.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += m72.j(((Long) list.get(i3)).longValue());
        }
        m72Var.D(iJ);
        while (i2 < list.size()) {
            m72Var.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        m72Var.D(i3);
        while (i2 < list.size()) {
            m72Var.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        m72Var.D(i3);
        while (i2 < list.size()) {
            m72Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                m72Var.C(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += m72.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        m72Var.D(i3);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            m72Var.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                m72Var.E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += m72.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        m72Var.D(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            m72Var.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += m72.i(((Integer) list.get(i4)).intValue());
        }
        m72Var.D(i3);
        while (i2 < list.size()) {
            m72Var.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, kd9 kd9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m72 m72Var = (m72) kd9Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m72Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m72Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += m72.j(((Long) list.get(i3)).longValue());
        }
        m72Var.D(iJ);
        while (i2 < list.size()) {
            m72Var.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, o87 o87Var, Object obj2, aff affVar) {
        return obj2;
    }
}
