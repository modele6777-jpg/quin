package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class syd {
    public static final dx5 A;
    public static final dx5 B;
    public static final dx5 C;
    public static final dx5 D;
    public static final dx5 E;
    public static final dx5 F;
    public static final dx5 G;
    public static final dx5 H;
    public static final dx5 I;
    public static final dx5 J;
    public static final dx5 K;
    public static final dx5 L;
    public static final dx5 M;
    public static final dx5 N;
    public static final dx5 O;
    public static final dx5 P;
    public static final ex5 Q;
    public static final j22 R;
    public static final j22 S;
    public static final j22 T;
    public static final j22 U;
    public static final j22 V;
    public static final dx5 W;
    public static final dx5 X;
    public static final dx5 Y;
    public static final dx5 Z;
    public static final dx5 a0;
    public static final dx5 b0;
    public static final dx5 c0;
    public static final ex5 d;
    public static final HashSet d0;
    public static final ex5 e;
    public static final HashSet e0;
    public static final ex5 f;
    public static final HashMap f0;
    public static final ex5 g;
    public static final HashMap g0;
    public static final ex5 h;
    public static final ex5 i;
    public static final ex5 j;
    public static final dx5 k;
    public static final dx5 l;
    public static final dx5 m;
    public static final dx5 n;
    public static final dx5 o;
    public static final dx5 p;
    public static final dx5 q;
    public static final dx5 r;
    public static final dx5 s;
    public static final dx5 t;
    public static final dx5 u;
    public static final dx5 v;
    public static final dx5 w;
    public static final dx5 x;
    public static final dx5 y;
    public static final dx5 z;
    public static final ex5 a = d("Any").a;
    public static final ex5 b = d("Nothing").a;
    public static final ex5 c = d("Cloneable").a;

    static {
        d("Suppress");
        d = d("Unit").a;
        e = d("CharSequence").a;
        f = d("String").a;
        g = d("Array").a;
        h = d("Boolean").a;
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        i = d("Number").a;
        j = d("Enum").a;
        d("Function");
        k = d("Throwable");
        l = d("Comparable");
        dx5 dx5Var = tyd.n;
        dx5Var.a(t99.e("IntRange"));
        dx5Var.a(t99.e("LongRange"));
        m = d("Deprecated");
        d("DeprecatedSinceKotlin");
        n = d("DeprecationLevel");
        o = d("ReplaceWith");
        p = d("ExtensionFunctionType");
        q = d("ContextFunctionTypeParams");
        dx5 dx5VarD = d("ParameterName");
        r = dx5VarD;
        mh3.b0(dx5VarD);
        s = d("Annotation");
        dx5 dx5VarA = a("Target");
        t = dx5VarA;
        mh3.b0(dx5VarA);
        u = a("AnnotationTarget");
        v = a("AnnotationRetention");
        dx5 dx5VarA2 = a("Retention");
        w = dx5VarA2;
        mh3.b0(dx5VarA2);
        mh3.b0(a("Repeatable"));
        x = a("MustBeDocumented");
        y = d("UnsafeVariance");
        d("PublishedApi");
        tyd.o.a(t99.e("AccessibleLateinitPropertyLiteral"));
        dx5 dx5Var2 = new dx5("kotlin.internal.PlatformDependent");
        z = dx5Var2;
        mh3.b0(dx5Var2);
        d("IntroducedAt");
        A = b("Iterator");
        B = b("Iterable");
        C = b("Collection");
        D = b("List");
        E = b("ListIterator");
        F = b("Set");
        dx5 dx5VarB = b("Map");
        G = dx5VarB;
        H = dx5VarB.a(t99.e("Entry"));
        I = b("MutableIterator");
        J = b("MutableIterable");
        K = b("MutableCollection");
        L = b("MutableList");
        M = b("MutableListIterator");
        N = b("MutableSet");
        dx5 dx5VarB2 = b("MutableMap");
        O = dx5VarB2;
        P = dx5VarB2.a(t99.e("MutableEntry"));
        Q = e("KClass");
        e("KType");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        ex5 ex5VarE = e("KProperty");
        e("KMutableProperty");
        R = mh3.b0(ex5VarE.i());
        e("KDeclarationContainer");
        e("findAssociatedObject");
        dx5 dx5VarD2 = d("UByte");
        dx5 dx5VarD3 = d("UShort");
        dx5 dx5VarD4 = d("UInt");
        dx5 dx5VarD5 = d("ULong");
        S = mh3.b0(dx5VarD2);
        T = mh3.b0(dx5VarD3);
        U = mh3.b0(dx5VarD4);
        V = mh3.b0(dx5VarD5);
        W = d("UByteArray");
        X = d("UShortArray");
        Y = d("UIntArray");
        Z = d("ULongArray");
        c("AtomicInt");
        c("AtomicLong");
        c("AtomicBoolean");
        c("AtomicReference");
        a0 = c("AtomicIntArray");
        b0 = c("AtomicLongArray");
        c0 = c("AtomicArray");
        int length = jua.values().length;
        HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
        for (jua juaVar : jua.values()) {
            hashSet.add(juaVar.e());
        }
        d0 = hashSet;
        int length2 = jua.values().length;
        HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
        for (jua juaVar2 : jua.values()) {
            hashSet2.add(juaVar2.c());
        }
        e0 = hashSet2;
        int length3 = jua.values().length;
        HashMap map = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
        for (jua juaVar3 : jua.values()) {
            String strB = juaVar3.e().b();
            strB.getClass();
            map.put(d(strB).a, juaVar3);
        }
        f0 = map;
        int length4 = jua.values().length;
        HashMap map2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
        for (jua juaVar4 : jua.values()) {
            String strB2 = juaVar4.c().b();
            strB2.getClass();
            map2.put(d(strB2).a, juaVar4);
        }
        g0 = map2;
    }

    public static dx5 a(String str) {
        return tyd.l.a(t99.e(str));
    }

    public static dx5 b(String str) {
        return tyd.m.a(t99.e(str));
    }

    public static dx5 c(String str) {
        return tyd.p.a(t99.e(str));
    }

    public static dx5 d(String str) {
        return tyd.k.a(t99.e(str));
    }

    public static final ex5 e(String str) {
        return tyd.i.a(t99.e(str)).a;
    }
}
