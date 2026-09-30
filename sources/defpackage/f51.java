package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f51 {
    public static final f51 m = new f51();
    public final o85 a;
    public final s56 b;
    public final s56 c;
    public final s56 d;
    public final s56 e;
    public final s56 f;
    public final s56 g;
    public final s56 h;
    public final s56 i;
    public final s56 j;
    public final s56 k;
    public final s56 l;

    public f51() {
        o85 o85VarC = vfh.c(e51.a);
        l51.a.getClass();
        s56 s56Var = l51.c;
        s56Var.getClass();
        s56 s56Var2 = l51.b;
        s56Var2.getClass();
        s56 s56Var3 = l51.d;
        s56Var3.getClass();
        s56 s56Var4 = l51.e;
        s56Var4.getClass();
        s56 s56Var5 = l51.f;
        s56Var5.getClass();
        s56 s56Var6 = l51.g;
        s56Var6.getClass();
        s56 s56Var7 = l51.i;
        s56Var7.getClass();
        s56 s56Var8 = l51.h;
        s56Var8.getClass();
        s56 s56Var9 = l51.j;
        s56Var9.getClass();
        s56 s56Var10 = l51.k;
        s56Var10.getClass();
        s56 s56Var11 = l51.l;
        s56Var11.getClass();
        this.a = o85VarC;
        this.b = s56Var;
        this.c = s56Var2;
        this.d = s56Var3;
        this.e = s56Var4;
        this.f = s56Var5;
        this.g = s56Var6;
        this.h = s56Var7;
        this.i = s56Var8;
        this.j = s56Var9;
        this.k = s56Var10;
        this.l = s56Var11;
    }

    public static String a(dx5 dx5Var) {
        String strB;
        dx5Var.getClass();
        ex5 ex5Var = dx5Var.a;
        StringBuilder sb = new StringBuilder(c5e.z(ex5Var.a, '.', '/'));
        sb.append('/');
        if (ex5Var.c()) {
            strB = "default-package";
        } else {
            strB = ex5Var.g().b();
            strB.getClass();
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
