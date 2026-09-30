package defpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pj7 {
    public static final dx5 a;
    public static final t99 b;
    public static final dx5 c;
    public static final dx5 d;
    public static final dx5 e;
    public static final dx5 f;
    public static final dx5 g;
    public static final dx5 h;
    public static final dx5 i;
    public static final dx5 j;
    public static final dx5 k;
    public static final dx5 l;
    public static final dx5 m;
    public static final dx5 n;
    public static final dx5 o;
    public static final dx5 p;
    public static final dx5 q;
    public static final dx5 r;

    static {
        dx5 dx5Var = new dx5("kotlin.Metadata");
        a = dx5Var;
        if (dx5Var.a.a.replace('.', '/') == null) {
            gk7.a(7);
            throw null;
        }
        b = t99.e("value");
        c = new dx5(Target.class.getName());
        new dx5(ElementType.class.getName());
        d = new dx5(Retention.class.getName());
        new dx5(RetentionPolicy.class.getName());
        e = new dx5(Deprecated.class.getName());
        f = new dx5(Documented.class.getName());
        g = new dx5("java.lang.annotation.Repeatable");
        new dx5("java.lang.annotation.Inherited");
        new dx5(Override.class.getName());
        h = new dx5("org.jetbrains.annotations.NotNull");
        i = new dx5("org.jetbrains.annotations.Nullable");
        j = new dx5("org.jetbrains.annotations.Mutable");
        k = new dx5("org.jetbrains.annotations.ReadOnly");
        l = new dx5("org.jetbrains.annotations.Unmodifiable");
        m = new dx5("org.jetbrains.annotations.UnmodifiableView");
        n = new dx5("kotlin.annotations.jvm.ReadOnly");
        o = new dx5("kotlin.annotations.jvm.Mutable");
        p = new dx5("kotlin.jvm.PurelyImplements");
        new dx5("kotlin.jvm.internal");
        q = new dx5("kotlin.jvm.internal.EnhancedNullability");
        r = new dx5("kotlin.jvm.internal.EnhancedMutability");
    }
}
