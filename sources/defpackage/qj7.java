package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qj7 {
    public static final dx5 a;
    public static final dx5 b;
    public static final dx5 c;
    public static final dx5 d;
    public static final dx5 e;
    public static final dx5 f;
    public static final dx5 g;
    public static final dx5 h;
    public static final dx5 i;
    public static final Set j;
    public static final Set k;
    public static final Set l;
    public static final Set m;
    public static final Set n;
    public static final Set o;
    public static final dx5 p;

    static {
        dx5 dx5Var = new dx5("org.jspecify.nullness.Nullable");
        dx5 dx5Var2 = new dx5("org.jspecify.nullness.NullMarked");
        a = dx5Var2;
        dx5 dx5Var3 = new dx5("org.jspecify.nullness.NullnessUnspecified");
        dx5 dx5Var4 = new dx5("org.jspecify.annotations.NonNull");
        dx5 dx5Var5 = new dx5("org.jspecify.annotations.Nullable");
        dx5 dx5Var6 = new dx5("org.jspecify.annotations.NullMarked");
        b = dx5Var6;
        dx5 dx5Var7 = new dx5("org.jspecify.annotations.NullnessUnspecified");
        dx5 dx5Var8 = new dx5("org.jspecify.annotations.NullUnmarked");
        c = dx5Var8;
        d = new dx5("javax.annotation.meta.TypeQualifier");
        e = new dx5("javax.annotation.meta.TypeQualifierNickname");
        f = new dx5("javax.annotation.meta.TypeQualifierDefault");
        dx5 dx5Var9 = new dx5("javax.annotation.Nonnull");
        g = dx5Var9;
        dx5 dx5Var10 = new dx5("javax.annotation.Nullable");
        dx5 dx5Var11 = new dx5("javax.annotation.CheckForNull");
        h = new dx5("javax.annotation.ParametersAreNonnullByDefault");
        i = new dx5("javax.annotation.ParametersAreNullableByDefault");
        j = qd0.I0(new dx5[]{dx5Var9, dx5Var11});
        dx5 dx5Var12 = pj7.h;
        dx5Var12.getClass();
        Set setI0 = qd0.I0(new dx5[]{dx5Var12, dx5Var4, new dx5("android.annotation.NonNull"), new dx5("androidx.annotation.NonNull"), new dx5("androidx.annotation.RecentlyNonNull"), new dx5("android.support.annotation.NonNull"), new dx5("com.android.annotations.NonNull"), new dx5("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new dx5("org.checkerframework.checker.nullness.qual.NonNull"), new dx5("edu.umd.cs.findbugs.annotations.NonNull"), new dx5("io.reactivex.annotations.NonNull"), new dx5("io.reactivex.rxjava3.annotations.NonNull"), new dx5("org.eclipse.jdt.annotation.NonNull"), new dx5("lombok.NonNull"), new dx5("jakarta.annotation.Nonnull")});
        k = setI0;
        dx5 dx5Var13 = pj7.i;
        dx5Var13.getClass();
        Set setI1 = qd0.I0(new dx5[]{dx5Var13, dx5Var, dx5Var5, dx5Var10, dx5Var11, new dx5("android.annotation.Nullable"), new dx5("androidx.annotation.Nullable"), new dx5("androidx.annotation.RecentlyNullable"), new dx5("android.support.annotation.Nullable"), new dx5("com.android.annotations.Nullable"), new dx5("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new dx5("org.checkerframework.checker.nullness.qual.Nullable"), new dx5("edu.umd.cs.findbugs.annotations.Nullable"), new dx5("edu.umd.cs.findbugs.annotations.PossiblyNull"), new dx5("edu.umd.cs.findbugs.annotations.CheckForNull"), new dx5("io.reactivex.annotations.Nullable"), new dx5("io.reactivex.rxjava3.annotations.Nullable"), new dx5("org.eclipse.jdt.annotation.Nullable"), new dx5("jakarta.annotation.Nullable"), new dx5("io.vertx.codegen.annotations.Nullable")});
        l = setI1;
        m = qd0.I0(new dx5[]{dx5Var3, dx5Var7});
        n3d.n(n3d.n(n3d.n(n3d.n(n3d.m(n3d.m(new LinkedHashSet(), setI0), setI1), dx5Var9), dx5Var2), dx5Var6), dx5Var8);
        n = qd0.I0(new dx5[]{pj7.k, pj7.n, pj7.l, pj7.m});
        o = qd0.I0(new dx5[]{pj7.j, pj7.o});
        bm8.H(new iy9(pj7.c, syd.t), new iy9(pj7.d, syd.w), new iy9(pj7.e, syd.m), new iy9(pj7.f, syd.x));
        p = new dx5("kotlin.annotations.jvm.UnderMigration");
    }
}
