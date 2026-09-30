package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zcg implements tc5 {
    public final q1 a;
    public final Integer b;
    public final Integer c;
    public final uw9 d;

    public zcg(uw9 uw9Var) {
        n66 n66Var = fdg.a;
        Integer numValueOf = Integer.valueOf(uw9Var != uw9.b ? 1 : 4);
        Integer num = uw9Var != uw9.c ? null : 4;
        n66Var.getClass();
        this.a = n66Var;
        this.b = numValueOf;
        this.c = num;
        this.d = uw9Var;
    }

    @Override // defpackage.tc5
    public final as5 a() {
        sid sidVar = new sid(new vx7(1, this.a.a(), txa.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, 22), this.b.intValue());
        Integer num = this.c;
        return num != null ? new sid(sidVar, num.intValue()) : sidVar;
    }

    @Override // defpackage.tc5
    public final n0a b() {
        q1 q1Var = this.a;
        txa txaVarA = q1Var.a();
        String strC = q1Var.c();
        txaVarA.getClass();
        strC.getClass();
        Integer num = this.b;
        Integer num2 = this.c;
        ArrayList arrayListK = t72.K(oa7.c0(num, null, num2, txaVarA, strC, true));
        arrayListK.add(oa7.c0(num, 4, num2, txaVarA, strC, false));
        List listI = t72.I(new qea("+"), new fk9(t72.H(new bgf(5, null, txaVarA, strC, false))));
        pu4 pu4Var = pu4.a;
        arrayListK.add(new n0a(listI, pu4Var));
        return new n0a(pu4Var, arrayListK);
    }

    @Override // defpackage.tc5
    public final q1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zcg) {
            return this.d == ((zcg) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.d.hashCode() * 31);
    }
}
