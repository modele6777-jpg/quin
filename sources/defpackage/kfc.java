package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kfc {
    public static final Class a;
    public static final zef b;
    public static final dff c;

    static {
        Class<?> cls;
        Class<?> cls2;
        zef zefVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zefVar = (zef) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = zefVar;
        c = new dff();
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l67)) {
            int iA = 0;
            while (i < size) {
                iA += j72.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        l67 l67Var = (l67) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += j72.a(l67Var.e(i));
            i++;
        }
        return iA2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j72.c(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j72.c(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l67)) {
            int iA = 0;
            while (i < size) {
                iA += j72.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        l67 l67Var = (l67) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += j72.a(l67Var.e(i));
            i++;
        }
        return iA2;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = 0;
        for (int i = 0; i < size; i++) {
            iE += j72.e(((Long) list.get(i)).longValue());
        }
        return iE;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l67)) {
            int iD = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iD += j72.d((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iD;
        }
        l67 l67Var = (l67) list;
        int iD2 = 0;
        while (i < size) {
            int iE = l67Var.e(i);
            iD2 += j72.d((iE >> 31) ^ (iE << 1));
            i++;
        }
        return iD2;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iE += j72.e((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iE;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l67)) {
            int iD = 0;
            while (i < size) {
                iD += j72.d(((Integer) list.get(i)).intValue());
                i++;
            }
            return iD;
        }
        l67 l67Var = (l67) list;
        int iD2 = 0;
        while (i < size) {
            iD2 += j72.d(l67Var.e(i));
            i++;
        }
        return iD2;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = 0;
        for (int i = 0; i < size; i++) {
            iE += j72.e(((Long) list.get(i)).longValue());
        }
        return iE;
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
    public static void j(zef zefVar, Object obj, Object obj2) {
        ((dff) zefVar).getClass();
        t56 t56Var = (t56) obj;
        bff bffVar = t56Var.unknownFields;
        bff bffVar2 = ((t56) obj2).unknownFields;
        bff bffVar3 = bff.f;
        if (!bffVar3.equals(bffVar2)) {
            if (bffVar3.equals(bffVar)) {
                int i = bffVar.a + bffVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(bffVar.b, i);
                System.arraycopy(bffVar2.b, 0, iArrCopyOf, bffVar.a, bffVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(bffVar.c, i);
                System.arraycopy(bffVar2.c, 0, objArrCopyOf, bffVar.a, bffVar2.a);
                bffVar = new bff(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                bffVar.getClass();
                if (!bffVar2.equals(bffVar3)) {
                    if (!bffVar.e) {
                        cva.f();
                        return;
                    }
                    int i2 = bffVar.a;
                    int i3 = bffVar2.a + i2;
                    int[] iArr = bffVar.b;
                    if (i3 > iArr.length) {
                        int i4 = (i2 / 2) + i2;
                        if (i4 < i3) {
                            i4 = i3;
                        }
                        if (i4 < 8) {
                            i4 = 8;
                        }
                        bffVar.b = Arrays.copyOf(iArr, i4);
                        bffVar.c = Arrays.copyOf(bffVar.c, i4);
                    }
                    System.arraycopy(bffVar2.b, 0, bffVar.b, bffVar.a, bffVar2.a);
                    System.arraycopy(bffVar2.c, 0, bffVar.c, bffVar.a, bffVar2.a);
                    bffVar.a = i3;
                }
            }
        }
        t56Var.unknownFields = bffVar;
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void l(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                j72Var.m(i, 0);
                j72Var.f(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        j72Var.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        j72Var.n(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            j72Var.f(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void m(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue());
                j72Var.m(i, 1);
                j72Var.j(jDoubleToRawLongBits);
                i2++;
            }
            return;
        }
        j72Var.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        j72Var.n(i3);
        while (i2 < list.size()) {
            j72Var.j(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void n(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                j72Var.m(i, 0);
                j72Var.k(iIntValue);
            }
            return;
        }
        j72Var.m(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += j72.a(((Integer) list.get(i3)).intValue());
        }
        j72Var.n(iA);
        for (int i4 = 0; i4 < list.size(); i4++) {
            j72Var.k(((Integer) list.get(i4)).intValue());
        }
    }

    public static void o(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                j72Var.m(i, 5);
                j72Var.i(iIntValue);
                i2++;
            }
            return;
        }
        j72Var.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        j72Var.n(i3);
        while (i2 < list.size()) {
            j72Var.i(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                j72Var.m(i, 1);
                j72Var.j(jLongValue);
                i2++;
            }
            return;
        }
        j72Var.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        j72Var.n(i3);
        while (i2 < list.size()) {
            j72Var.j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void q(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iFloatToRawIntBits = Float.floatToRawIntBits(((Float) list.get(i2)).floatValue());
                j72Var.m(i, 5);
                j72Var.i(iFloatToRawIntBits);
                i2++;
            }
            return;
        }
        j72Var.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        j72Var.n(i3);
        while (i2 < list.size()) {
            j72Var.i(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void r(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                j72Var.m(i, 0);
                j72Var.k(iIntValue);
            }
            return;
        }
        j72Var.m(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += j72.a(((Integer) list.get(i3)).intValue());
        }
        j72Var.n(iA);
        for (int i4 = 0; i4 < list.size(); i4++) {
            j72Var.k(((Integer) list.get(i4)).intValue());
        }
    }

    public static void s(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                j72Var.m(i, 0);
                j72Var.o(jLongValue);
            }
            return;
        }
        j72Var.m(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE += j72.e(((Long) list.get(i3)).longValue());
        }
        j72Var.n(iE);
        for (int i4 = 0; i4 < list.size(); i4++) {
            j72Var.o(((Long) list.get(i4)).longValue());
        }
    }

    public static void t(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                j72Var.m(i, 5);
                j72Var.i(iIntValue);
                i2++;
            }
            return;
        }
        j72Var.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        j72Var.n(i3);
        while (i2 < list.size()) {
            j72Var.i(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void u(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                j72Var.m(i, 1);
                j72Var.j(jLongValue);
                i2++;
            }
            return;
        }
        j72Var.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        j72Var.n(i3);
        while (i2 < list.size()) {
            j72Var.j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void v(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                j72Var.m(i, 0);
                j72Var.n((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        j72Var.m(i, 2);
        int iD = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iD += j72.d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        j72Var.n(iD);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            j72Var.n((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void w(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                j72Var.m(i, 0);
                j72Var.o((jLongValue >> 63) ^ (jLongValue << 1));
            }
            return;
        }
        j72Var.m(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iE += j72.e((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        j72Var.n(iE);
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue3 = ((Long) list.get(i4)).longValue();
            j72Var.o((jLongValue3 >> 63) ^ (jLongValue3 << 1));
        }
    }

    public static void x(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                j72Var.m(i, 0);
                j72Var.n(iIntValue);
            }
            return;
        }
        j72Var.m(i, 2);
        int iD = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iD += j72.d(((Integer) list.get(i3)).intValue());
        }
        j72Var.n(iD);
        for (int i4 = 0; i4 < list.size(); i4++) {
            j72Var.n(((Integer) list.get(i4)).intValue());
        }
    }

    public static void y(int i, List list, kb6 kb6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j72 j72Var = (j72) kb6Var.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                j72Var.m(i, 0);
                j72Var.o(jLongValue);
            }
            return;
        }
        j72Var.m(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE += j72.e(((Long) list.get(i3)).longValue());
        }
        j72Var.n(iE);
        for (int i4 = 0; i4 < list.size(); i4++) {
            j72Var.o(((Long) list.get(i4)).longValue());
        }
    }
}
