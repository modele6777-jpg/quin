package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j66 extends gbe implements o26 {
    final /* synthetic */ long $duration;
    int I$0;
    int label;
    final /* synthetic */ k66 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j66(k66 k66Var, long j, xn2 xn2Var) {
        super(4, xn2Var);
        this.this$0 = k66Var;
        this.$duration = j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i;
        int i2;
        int i3 = this.label;
        if (i3 == 0) {
            jzb.q(obj);
            boolean zT = pa7.t(this.this$0.d.getValue(), f66.a);
            i = !zT ? 1 : 0;
            if (!zT) {
                long j = this.$duration;
                this.I$0 = i;
                this.label = 1;
                Object objQ = vfh.q(j, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
                i2 = i;
            }
            return Boolean.valueOf(i != 0);
        }
        if (i3 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = this.I$0;
        jzb.q(obj);
        i = i2;
        return Boolean.valueOf(i != 0);
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        return new j66(this.this$0, this.$duration, (xn2) obj4).r(wef.a);
    }
}
