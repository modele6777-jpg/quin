package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jf7 {
    public static final dx5 a;
    public static final dx5[] b;
    public static final fz3 c;
    public static final kf7 d;

    static {
        dx5 dx5Var = new dx5("org.jspecify.nullness");
        dx5 dx5Var2 = new dx5("org.jspecify.annotations");
        a = dx5Var2;
        dx5 dx5Var3 = new dx5("io.reactivex.rxjava3.annotations");
        dx5 dx5Var4 = new dx5("org.checkerframework.checker.nullness.compatqual");
        String str = dx5Var3.a.a;
        b = new dx5[]{new dx5(tec.l(str, ".Nullable")), new dx5(tec.l(str, ".NonNull"))};
        dx5 dx5Var5 = new dx5("org.jetbrains.annotations");
        kf7 kf7Var = kf7.d;
        iy9 iy9Var = new iy9(dx5Var5, kf7Var);
        iy9 iy9Var2 = new iy9(new dx5("kotlin.annotations.jvm"), kf7Var);
        iy9 iy9Var3 = new iy9(new dx5("androidx.annotation"), kf7Var);
        iy9 iy9Var4 = new iy9(new dx5("android.support.annotation"), kf7Var);
        iy9 iy9Var5 = new iy9(new dx5("android.annotation"), kf7Var);
        iy9 iy9Var6 = new iy9(new dx5("com.android.annotations"), kf7Var);
        iy9 iy9Var7 = new iy9(new dx5("org.eclipse.jdt.annotation"), kf7Var);
        iy9 iy9Var8 = new iy9(new dx5("org.checkerframework.checker.nullness.qual"), kf7Var);
        iy9 iy9Var9 = new iy9(dx5Var4, kf7Var);
        iy9 iy9Var10 = new iy9(new dx5("javax.annotation"), kf7Var);
        iy9 iy9Var11 = new iy9(new dx5("edu.umd.cs.findbugs.annotations"), kf7Var);
        iy9 iy9Var12 = new iy9(new dx5("io.reactivex.annotations"), kf7Var);
        dx5 dx5Var6 = new dx5("androidx.annotation.RecentlyNullable");
        csb csbVar = csb.WARN;
        iy9 iy9Var13 = new iy9(dx5Var6, new kf7(csbVar, 4));
        iy9 iy9Var14 = new iy9(new dx5("androidx.annotation.RecentlyNonNull"), new kf7(csbVar, 4));
        iy9 iy9Var15 = new iy9(new dx5("lombok"), kf7Var);
        bu7 bu7Var = new bu7(2, 1, 0);
        csb csbVar2 = csb.STRICT;
        c = new fz3(bm8.H(iy9Var, iy9Var2, iy9Var3, iy9Var4, iy9Var5, iy9Var6, iy9Var7, iy9Var8, iy9Var9, iy9Var10, iy9Var11, iy9Var12, iy9Var13, iy9Var14, iy9Var15, new iy9(dx5Var, new kf7(csbVar, bu7Var, csbVar2)), new iy9(dx5Var2, new kf7(csbVar, new bu7(2, 1, 0), csbVar2)), new iy9(dx5Var3, new kf7(csbVar, new bu7(1, 8, 0), csbVar2)), new iy9(new dx5("jakarta.annotation"), new kf7(csbVar, new bu7(2, 4, 0), csbVar2)), new iy9(pj7.l, new kf7(csbVar, new bu7(2, 5, 0), csbVar2)), new iy9(pj7.m, new kf7(csbVar, new bu7(2, 5, 0), csbVar2)), new iy9(new dx5("io.vertx.codegen.annotations"), new kf7(csbVar, new bu7(2, 5, 0), csbVar2))));
        d = new kf7(csbVar, 4);
    }
}
