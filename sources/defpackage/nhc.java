package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nhc extends gbe implements l26 {
    final /* synthetic */ long $offset;
    final /* synthetic */ jmb $previousValue;
    final /* synthetic */ gic $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhc(gic gicVar, long j, jmb jmbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_semanticsScrollBy = gicVar;
        this.$offset = j;
        this.$previousValue = jmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        nhc nhcVar = new nhc(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, xn2Var);
        nhcVar.L$0 = obj;
        return nhcVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            dic dicVar = (dic) this.L$0;
            float fH = this.$this_semanticsScrollBy.h(this.$offset);
            o7b o7bVar = new o7b(this.$previousValue, this.$this_semanticsScrollBy, dicVar, 5);
            this.label = 1;
            Object objS = hkg.S(0.0f, fH, null, o7bVar, this, 12);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
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

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nhc) k((xn2) obj2, (dic) obj)).r(wef.a);
    }
}
