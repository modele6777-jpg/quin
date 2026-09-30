package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v3h {
    public static final mwg a;

    static {
        int i = hyg.a;
        a = new mwg(19);
    }

    public static void a(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof n0h)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    p90Var.C0(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            p90Var.B0(i, 2);
            int iG0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iG0 += p90.G0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            p90Var.D0(iG0);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                p90Var.D0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        n0h n0hVar = (n0h) list;
        if (!z) {
            while (i2 < n0hVar.c) {
                int iC = n0hVar.c(i2);
                p90Var.C0(i, (iC >> 31) ^ (iC + iC));
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int iG1 = 0;
        for (int i4 = 0; i4 < n0hVar.c; i4++) {
            int iC2 = n0hVar.c(i4);
            iG1 += p90.G0((iC2 >> 31) ^ (iC2 + iC2));
        }
        p90Var.D0(iG1);
        while (i2 < n0hVar.c) {
            int iC3 = n0hVar.c(i2);
            p90Var.D0((iC3 >> 31) ^ (iC3 + iC3));
            i2++;
        }
    }

    public static void b(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                p90Var.E0(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int iH0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iH0 += p90.H0((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        p90Var.D0(iH0);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            p90Var.F0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void c(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof n0h)) {
            if (!z) {
                while (i2 < list.size()) {
                    p90Var.C0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            p90Var.B0(i, 2);
            int iG0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG0 += p90.G0(((Integer) list.get(i3)).intValue());
            }
            p90Var.D0(iG0);
            while (i2 < list.size()) {
                p90Var.D0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n0h n0hVar = (n0h) list;
        if (!z) {
            while (i2 < n0hVar.c) {
                p90Var.C0(i, n0hVar.c(i2));
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int iG1 = 0;
        for (int i4 = 0; i4 < n0hVar.c; i4++) {
            iG1 += p90.G0(n0hVar.c(i4));
        }
        p90Var.D0(iG1);
        while (i2 < n0hVar.c) {
            p90Var.D0(n0hVar.c(i2));
            i2++;
        }
    }

    public static void d(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p90Var.E0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int iH0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iH0 += p90.H0(((Long) list.get(i3)).longValue());
        }
        p90Var.D0(iH0);
        while (i2 < list.size()) {
            p90Var.F0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n0h)) {
            int iH0 = 0;
            while (i < size) {
                iH0 += p90.H0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iH0;
        }
        n0h n0hVar = (n0h) list;
        int iH1 = 0;
        while (i < size) {
            iH1 += p90.H0(n0hVar.c(i));
            i++;
        }
        return iH1;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p90.G0(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p90.G0(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n0h)) {
            int iH0 = 0;
            while (i < size) {
                iH0 += p90.H0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iH0;
        }
        n0h n0hVar = (n0h) list;
        int iH1 = 0;
        while (i < size) {
            iH1 += p90.H0(n0hVar.c(i));
            i++;
        }
        return iH1;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = 0;
        for (int i = 0; i < size; i++) {
            iH0 += p90.H0(((Long) list.get(i)).longValue());
        }
        return iH0;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n0h)) {
            int iG0 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iG0 += p90.G0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iG0;
        }
        n0h n0hVar = (n0h) list;
        int iG1 = 0;
        while (i < size) {
            int iC = n0hVar.c(i);
            iG1 += p90.G0((iC >> 31) ^ (iC + iC));
            i++;
        }
        return iG1;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iH0 += p90.H0((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iH0;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n0h)) {
            int iG0 = 0;
            while (i < size) {
                iG0 += p90.G0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG0;
        }
        n0h n0hVar = (n0h) list;
        int iG1 = 0;
        while (i < size) {
            iG1 += p90.G0(n0hVar.c(i));
            i++;
        }
        return iG1;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = 0;
        for (int i = 0; i < size; i++) {
            iH0 += p90.H0(((Long) list.get(i)).longValue());
        }
        return iH0;
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
    public static void o(Object obj, Object obj2) {
        l0h l0hVar = (l0h) obj;
        l4h l4hVar = l0hVar.zzc;
        l4h l4hVar2 = ((l0h) obj2).zzc;
        l4h l4hVar3 = l4h.f;
        if (!l4hVar3.equals(l4hVar2)) {
            if (l4hVar3.equals(l4hVar)) {
                int i = l4hVar.a + l4hVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(l4hVar.b, i);
                System.arraycopy(l4hVar2.b, 0, iArrCopyOf, l4hVar.a, l4hVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(l4hVar.c, i);
                System.arraycopy(l4hVar2.c, 0, objArrCopyOf, l4hVar.a, l4hVar2.a);
                l4hVar = new l4h(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                l4hVar.getClass();
                if (!l4hVar2.equals(l4hVar3)) {
                    if (!l4hVar.e) {
                        cva.f();
                        return;
                    }
                    int i2 = l4hVar.a + l4hVar2.a;
                    l4hVar.e(i2);
                    System.arraycopy(l4hVar2.b, 0, l4hVar.b, l4hVar.a, l4hVar2.a);
                    System.arraycopy(l4hVar2.c, 0, l4hVar.c, l4hVar.a, l4hVar2.a);
                    l4hVar.a = i2;
                }
            }
        }
        l0hVar.zzc = l4hVar;
    }

    public static void p(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                p90Var.D0(i << 3);
                p90Var.t0(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        p90Var.D0(i3);
        while (i2 < list.size()) {
            p90Var.t0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void q(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p90Var.x0(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        p90Var.D0(i3);
        while (i2 < list.size()) {
            p90Var.y0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof n0h)) {
            if (!z) {
                while (i2 < list.size()) {
                    p90Var.z0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            p90Var.B0(i, 2);
            int iH0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iH0 += p90.H0(((Integer) list.get(i3)).intValue());
            }
            p90Var.D0(iH0);
            while (i2 < list.size()) {
                p90Var.A0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n0h n0hVar = (n0h) list;
        if (!z) {
            while (i2 < n0hVar.c) {
                p90Var.z0(i, n0hVar.c(i2));
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int iH1 = 0;
        for (int i4 = 0; i4 < n0hVar.c; i4++) {
            iH1 += p90.H0(n0hVar.c(i4));
        }
        p90Var.D0(iH1);
        while (i2 < n0hVar.c) {
            p90Var.A0(n0hVar.c(i2));
            i2++;
        }
    }

    public static void s(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof n0h)) {
            if (!z) {
                while (i2 < list.size()) {
                    p90Var.v0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            p90Var.B0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            p90Var.D0(i3);
            while (i2 < list.size()) {
                p90Var.w0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n0h n0hVar = (n0h) list;
        if (!z) {
            while (i2 < n0hVar.c) {
                p90Var.v0(i, n0hVar.c(i2));
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < n0hVar.c; i6++) {
            n0hVar.c(i6);
            i5 += 4;
        }
        p90Var.D0(i5);
        while (i2 < n0hVar.c) {
            p90Var.w0(n0hVar.c(i2));
            i2++;
        }
    }

    public static void t(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p90Var.x0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        p90Var.D0(i3);
        while (i2 < list.size()) {
            p90Var.y0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p90Var.v0(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        p90Var.D0(i3);
        while (i2 < list.size()) {
            p90Var.w0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof n0h)) {
            if (!z) {
                while (i2 < list.size()) {
                    p90Var.z0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            p90Var.B0(i, 2);
            int iH0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iH0 += p90.H0(((Integer) list.get(i3)).intValue());
            }
            p90Var.D0(iH0);
            while (i2 < list.size()) {
                p90Var.A0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n0h n0hVar = (n0h) list;
        if (!z) {
            while (i2 < n0hVar.c) {
                p90Var.z0(i, n0hVar.c(i2));
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int iH1 = 0;
        for (int i4 = 0; i4 < n0hVar.c; i4++) {
            iH1 += p90.H0(n0hVar.c(i4));
        }
        p90Var.D0(iH1);
        while (i2 < n0hVar.c) {
            p90Var.A0(n0hVar.c(i2));
            i2++;
        }
    }

    public static void w(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p90Var.E0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int iH0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iH0 += p90.H0(((Long) list.get(i3)).longValue());
        }
        p90Var.D0(iH0);
        while (i2 < list.size()) {
            p90Var.F0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof n0h)) {
            if (!z) {
                while (i2 < list.size()) {
                    p90Var.v0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            p90Var.B0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            p90Var.D0(i3);
            while (i2 < list.size()) {
                p90Var.w0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n0h n0hVar = (n0h) list;
        if (!z) {
            while (i2 < n0hVar.c) {
                p90Var.v0(i, n0hVar.c(i2));
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < n0hVar.c; i6++) {
            n0hVar.c(i6);
            i5 += 4;
        }
        p90Var.D0(i5);
        while (i2 < n0hVar.c) {
            p90Var.w0(n0hVar.c(i2));
            i2++;
        }
    }

    public static void y(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p90 p90Var = (p90) g5bVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p90Var.x0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p90Var.B0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        p90Var.D0(i3);
        while (i2 < list.size()) {
            p90Var.y0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
