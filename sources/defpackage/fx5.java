package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fx5 implements tc5 {
    public static final List c = t72.I(0, 0, 0, 0, 0, 0, 0, 0, 0);
    public final q1 a;
    public final List b;

    static {
        t72.I(2, 1, 0, 2, 1, 0, 2, 1, 0);
    }

    public fx5() {
        List list = c;
        list.getClass();
        n66 n66Var = txe.d;
        n66Var.getClass();
        this.a = n66Var;
        this.b = list;
    }

    @Override // defpackage.tc5
    public final as5 a() {
        return new sh3(new w(1, this.a.a(), txa.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, 26), this.b);
    }

    @Override // defpackage.tc5
    public final n0a b() {
        q1 q1Var = this.a;
        return new n0a(t72.H(new fk9(t72.H(new al2(q1Var.a(), q1Var.c())))), pu4.a);
    }

    @Override // defpackage.tc5
    public final q1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof fx5;
    }

    public final int hashCode() {
        return 40;
    }
}
