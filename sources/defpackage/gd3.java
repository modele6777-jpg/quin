package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gd3 extends gbe implements a26 {
    final /* synthetic */ mmb $newData;
    final /* synthetic */ kmb $version;
    Object L$0;
    int label;
    final /* synthetic */ od3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd3(mmb mmbVar, od3 od3Var, kmb kmbVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.$newData = mmbVar;
        this.this$0 = od3Var;
        this.$version = kmbVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new gd3(this.$newData, this.this$0, this.$version, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        kmb kmbVar;
        mmb mmbVar;
        kmb kmbVar2;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                mmbVar = this.$newData;
                od3 od3Var = this.this$0;
                this.L$0 = mmbVar;
                this.label = 1;
                obj = ((wd5) od3Var.j.getValue()).a(new m2e(3, null), this);
                if (obj == bw2Var) {
                }
                return bw2Var;
            }
            if (i == 1) {
                mmbVar = (mmb) this.L$0;
                jzb.q(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kmbVar = (kmb) this.L$0;
                    jzb.q(obj);
                    kmbVar.element = ((Number) obj).intValue();
                    return wef.a;
                }
                kmbVar2 = (kmb) this.L$0;
                jzb.q(obj);
            }
            kmbVar2.element = ((Number) obj).intValue();
            return wef.a;
            mmbVar.element = obj;
            kmbVar2 = this.$version;
            k77 k77VarC = this.this$0.c();
            this.L$0 = kmbVar2;
            this.label = 2;
            obj = k77VarC.a(this);
            if (obj == bw2Var) {
                return bw2Var;
            }
            kmbVar2.element = ((Number) obj).intValue();
        } catch (mw2 unused) {
            kmb kmbVar3 = this.$version;
            od3 od3Var2 = this.this$0;
            Object obj2 = this.$newData.element;
            this.L$0 = kmbVar3;
            this.label = 3;
            Object objI = od3Var2.i(obj2, true, this);
            if (objI != bw2Var) {
                obj = objI;
                kmbVar = kmbVar3;
            }
            return bw2Var;
        }
        return wef.a;
    }
}
