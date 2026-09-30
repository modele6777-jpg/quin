package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fo extends gbe implements a26 {
    final /* synthetic */ o26 $block;
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ mo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(mo moVar, Object obj, o26 o26Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = moVar;
        this.$targetValue = obj;
        this.$block = o26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new fo(this.this$0, this.$targetValue, this.$block, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            mo moVar = this.this$0;
            moVar.l.setValue(this.$targetValue);
            mo moVar2 = this.this$0;
            tn tnVar = new tn(moVar2, 2);
            co coVar = new co(this.$block, moVar2, null);
            this.label = 1;
            Object objE = jn.e(tnVar, coVar, this);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        if (((Boolean) this.this$0.a.d(this.$targetValue)).booleanValue()) {
            float fE = this.this$0.b().e(this.$targetValue);
            mo moVar3 = this.this$0;
            moVar3.n.a(fE, moVar3.k.j());
            mo moVar4 = this.this$0;
            moVar4.h.setValue(this.$targetValue);
            mo moVar5 = this.this$0;
            moVar5.g.setValue(this.$targetValue);
        }
        return wef.a;
    }
}
