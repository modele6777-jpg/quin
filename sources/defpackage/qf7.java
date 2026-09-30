package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qf7 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final j22 e;
    public static final dx5 f;
    public static final j22 g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final LinkedHashSet n;
    public static final List o;

    static {
        StringBuilder sb = new StringBuilder();
        i36 i36Var = i36.d;
        sb.append(i36Var.a);
        sb.append('.');
        sb.append(i36Var.b);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        j36 j36Var = j36.d;
        sb2.append(j36Var.a);
        sb2.append('.');
        sb2.append(j36Var.b);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        l36 l36Var = l36.d;
        sb3.append(l36Var.a);
        sb3.append('.');
        sb3.append(l36Var.b);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        k36 k36Var = k36.d;
        sb4.append(k36Var.a);
        sb4.append('.');
        sb4.append(k36Var.b);
        d = sb4.toString();
        j22 j22VarB0 = mh3.b0(new dx5("kotlin.jvm.functions.FunctionN"));
        e = j22VarB0;
        f = j22VarB0.a();
        g = pyd.u;
        e(Class.class);
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        n = new LinkedHashSet();
        j22 j22VarB1 = mh3.b0(syd.B);
        dx5 dx5Var = syd.J;
        dx5 dx5Var2 = j22VarB1.a;
        pf7 pf7Var = new pf7(e(Iterable.class), j22VarB1, new j22(dx5Var2, xo1.O(dx5Var, dx5Var2), false));
        j22 j22VarB2 = mh3.b0(syd.A);
        dx5 dx5Var3 = syd.I;
        dx5 dx5Var4 = j22VarB2.a;
        pf7 pf7Var2 = new pf7(e(Iterator.class), j22VarB2, new j22(dx5Var4, xo1.O(dx5Var3, dx5Var4), false));
        j22 j22VarB3 = mh3.b0(syd.C);
        dx5 dx5Var5 = syd.K;
        dx5 dx5Var6 = j22VarB3.a;
        pf7 pf7Var3 = new pf7(e(Collection.class), j22VarB3, new j22(dx5Var6, xo1.O(dx5Var5, dx5Var6), false));
        j22 j22VarB4 = mh3.b0(syd.D);
        dx5 dx5Var7 = syd.L;
        dx5 dx5Var8 = j22VarB4.a;
        pf7 pf7Var4 = new pf7(e(List.class), j22VarB4, new j22(dx5Var8, xo1.O(dx5Var7, dx5Var8), false));
        j22 j22VarB5 = mh3.b0(syd.F);
        dx5 dx5Var9 = syd.N;
        dx5 dx5Var10 = j22VarB5.a;
        pf7 pf7Var5 = new pf7(e(Set.class), j22VarB5, new j22(dx5Var10, xo1.O(dx5Var9, dx5Var10), false));
        j22 j22VarB6 = mh3.b0(syd.E);
        dx5 dx5Var11 = syd.M;
        dx5 dx5Var12 = j22VarB6.a;
        pf7 pf7Var6 = new pf7(e(ListIterator.class), j22VarB6, new j22(dx5Var12, xo1.O(dx5Var11, dx5Var12), false));
        dx5 dx5Var13 = syd.G;
        j22 j22VarB7 = mh3.b0(dx5Var13);
        dx5 dx5Var14 = syd.O;
        dx5 dx5Var15 = j22VarB7.a;
        pf7 pf7Var7 = new pf7(e(Map.class), j22VarB7, new j22(dx5Var15, xo1.O(dx5Var14, dx5Var15), false));
        j22 j22VarD = mh3.b0(dx5Var13).d(syd.H.a.g());
        dx5 dx5Var16 = syd.P;
        dx5 dx5Var17 = j22VarD.a;
        List<pf7> listI = t72.I(pf7Var, pf7Var2, pf7Var3, pf7Var4, pf7Var5, pf7Var6, pf7Var7, new pf7(e(Map.Entry.class), j22VarD, new j22(dx5Var17, xo1.O(dx5Var16, dx5Var17), false)));
        o = listI;
        d(Object.class, syd.a);
        d(String.class, syd.f);
        d(CharSequence.class, syd.e);
        c(Throwable.class, syd.k);
        d(Cloneable.class, syd.c);
        d(Number.class, syd.i);
        c(Comparable.class, syd.l);
        d(Enum.class, syd.j);
        c(Annotation.class, syd.s);
        for (pf7 pf7Var8 : listI) {
            j22 j22Var = pf7Var8.a;
            j22 j22Var2 = pf7Var8.b;
            j22 j22Var3 = pf7Var8.c;
            a(j22Var, j22Var2);
            b(j22Var3.a(), j22Var);
            l.put(j22Var3, j22Var2);
            m.put(j22Var2, j22Var3);
            dx5 dx5VarA = j22Var2.a();
            dx5 dx5VarA2 = j22Var3.a();
            j.put(j22Var3.a().a, dx5VarA);
            k.put(dx5VarA.a, dx5VarA2);
        }
        for (al7 al7Var : al7.values()) {
            dx5 dx5VarG = al7Var.g();
            dx5VarG.getClass();
            j22 j22Var4 = new j22(dx5VarG.b(), dx5VarG.a.g());
            jua juaVarE = al7Var.e();
            juaVarE.getClass();
            dx5 dx5VarA3 = tyd.k.a(juaVarE.e());
            a(j22Var4, new j22(dx5VarA3.b(), dx5VarA3.a.g()));
        }
        for (j22 j22Var5 : oa2.a) {
            dx5 dx5Var18 = new dx5("kotlin.jvm.internal." + j22Var5.f().b() + "CompanionObject");
            a(new j22(dx5Var18.b(), dx5Var18.a.g()), j22Var5.d(sud.b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            dx5 dx5Var19 = new dx5(tec.e(i2, "kotlin.jvm.functions.Function"));
            a(new j22(dx5Var19.b(), dx5Var19.a.g()), new j22(tyd.k, t99.e("Function" + i2)));
            b(new dx5(ub3.h(i2, b, new StringBuilder())), g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            b(new dx5(ub3.h(i3, d, new StringBuilder())), g);
        }
        b(new dx5("kotlin.concurrent.atomics.AtomicInt"), e(AtomicInteger.class));
        b(new dx5("kotlin.concurrent.atomics.AtomicLong"), e(AtomicLong.class));
        b(new dx5("kotlin.concurrent.atomics.AtomicBoolean"), e(AtomicBoolean.class));
        b(new dx5("kotlin.concurrent.atomics.AtomicReference"), e(AtomicReference.class));
        b(new dx5("kotlin.concurrent.atomics.AtomicIntArray"), e(AtomicIntegerArray.class));
        b(new dx5("kotlin.concurrent.atomics.AtomicLongArray"), e(AtomicLongArray.class));
        b(new dx5("kotlin.concurrent.atomics.AtomicArray"), e(AtomicReferenceArray.class));
        b(syd.b.i(), e(Void.class));
    }

    public static void a(j22 j22Var, j22 j22Var2) {
        h.put(j22Var.a().a, j22Var2);
        b(j22Var2.a(), j22Var);
    }

    public static void b(dx5 dx5Var, j22 j22Var) {
        n.add(dx5Var);
        i.put(dx5Var.a, j22Var);
    }

    public static void c(Class cls, dx5 dx5Var) {
        j22 j22VarE = e(cls);
        dx5Var.getClass();
        a(j22VarE, new j22(dx5Var.b(), dx5Var.a.g()));
    }

    public static void d(Class cls, ex5 ex5Var) {
        c(cls, ex5Var.i());
    }

    public static j22 e(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return e(declaringClass).d(t99.e(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        dx5 dx5Var = new dx5(canonicalName);
        return new j22(dx5Var.b(), dx5Var.a.g());
    }

    public static boolean f(ex5 ex5Var, String str, boolean z) {
        String str2 = ex5Var.a;
        if (c5e.C(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            if (!v4e.e0(strSubstring, '0')) {
                Integer numD = c5e.D(strSubstring);
                int i2 = z ? 22 : 23;
                if (numD != null && numD.intValue() >= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static j22 g(dx5 dx5Var) {
        dx5Var.getClass();
        return (j22) h.get(dx5Var.a);
    }

    public static j22 h(ex5 ex5Var) {
        ex5Var.getClass();
        if (f(ex5Var, a, false) || f(ex5Var, c, true)) {
            return e;
        }
        return (f(ex5Var, b, false) || f(ex5Var, d, true)) ? g : (j22) i.get(ex5Var);
    }

    public static dx5 i(ex5 ex5Var) {
        return (dx5) k.get(ex5Var);
    }
}
