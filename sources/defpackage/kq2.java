package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kq2 extends gbe implements o26 {
    final /* synthetic */ o9 $accountProfileRepository;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq2(o9 o9Var, xn2 xn2Var) {
        super(4, xn2Var);
        this.$accountProfileRepository = o9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Boolean bool = (Boolean) this.L$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            o9 o9Var = this.$accountProfileRepository;
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            this.L$0 = null;
            this.Z$0 = z;
            this.Z$1 = z2;
            this.label = 1;
            Object objH = o9Var.h(bool, boolValueOf, boolValueOf2, this);
            bw2 bw2Var = bw2.a;
            if (objH == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        kq2 kq2Var = new kq2(this.$accountProfileRepository, (xn2) obj4);
        kq2Var.L$0 = (Boolean) obj;
        kq2Var.Z$0 = zBooleanValue;
        kq2Var.Z$1 = zBooleanValue2;
        return kq2Var.r(wef.a);
    }
}
