package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rn4 extends gu7 implements a26 {
    final /* synthetic */ a26 $block;
    final /* synthetic */ sn4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn4(sn4 sn4Var, a26 a26Var) {
        super(1);
        this.this$0 = sn4Var;
        this.$block = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        ta0 ta0VarV0;
        sn4 sn4Var = (sn4) obj;
        sn4 sn4Var2 = this.this$0;
        sw3 sw3VarU = sn4Var.v0().u();
        cv7 cv7VarW = sn4Var.v0().w();
        vl1 vl1VarP = sn4Var.v0().p();
        long jZ = sn4Var.v0().z();
        ke6 ke6Var = (ke6) sn4Var.v0().d;
        a26 a26Var = this.$block;
        sw3 sw3VarU2 = sn4Var2.v0().u();
        cv7 cv7VarW2 = sn4Var2.v0().w();
        vl1 vl1VarP2 = sn4Var2.v0().p();
        long jZ2 = sn4Var2.v0().z();
        ke6 ke6Var2 = (ke6) sn4Var2.v0().d;
        ta0 ta0VarV1 = sn4Var2.v0();
        ta0VarV1.P(sw3VarU);
        ta0VarV1.Q(cv7VarW);
        ta0VarV1.O(vl1VarP);
        ta0VarV1.R(jZ);
        ta0VarV1.d = ke6Var;
        vl1VarP.g();
        try {
            a26Var.d(sn4Var2);
            return wef.a;
        } finally {
            vl1VarP.o();
            ta0VarV0 = sn4Var2.v0();
            ta0VarV0.P(sw3VarU2);
            ta0VarV0.Q(cv7VarW2);
            ta0VarV0.O(vl1VarP2);
            ta0VarV0.R(jZ2);
            ta0VarV0.d = ke6Var2;
        }
    }
}
