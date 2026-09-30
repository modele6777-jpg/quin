package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uj7 implements e22 {
    public static final t99 g;
    public static final j22 h;
    public final x09 a;
    public final a26 b;
    public final ee8 c;
    public static final /* synthetic */ wn7[] e = {new aya(uj7.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};
    public static final yx4 d = new yx4(10);
    public static final dx5 f = tyd.k;

    static {
        ex5 ex5Var = syd.c;
        g = ex5Var.g();
        dx5 dx5VarI = ex5Var.i();
        h = new j22(dx5VarI.b(), dx5VarI.a.g());
    }

    public uj7(ge8 ge8Var, x09 x09Var) {
        tj7 tj7Var = tj7.b;
        this.a = x09Var;
        this.b = tj7Var;
        this.c = new ee8(ge8Var, new n5(14, this, ge8Var));
    }

    @Override // defpackage.e22
    public final u09 a(j22 j22Var) {
        j22Var.getClass();
        if (!j22Var.equals(h)) {
            return null;
        }
        return (f22) gdc.f(this.c, e[0]);
    }

    @Override // defpackage.e22
    public final Collection b(dx5 dx5Var) {
        dx5Var.getClass();
        if (!dx5Var.equals(f)) {
            return xu4.a;
        }
        return n3d.p((f22) gdc.f(this.c, e[0]));
    }

    @Override // defpackage.e22
    public final boolean c(dx5 dx5Var, t99 t99Var) {
        dx5Var.getClass();
        t99Var.getClass();
        return t99Var.equals(g) && dx5Var.equals(f);
    }
}
