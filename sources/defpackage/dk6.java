package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dk6 extends gbe implements l26 {
    final /* synthetic */ h0e $currentOnChange$delegate;
    final /* synthetic */ h0e $currentSelection$delegate;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ LocalDate $endDate;
    final /* synthetic */ LocalDate $startDate;
    final /* synthetic */ t2g $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk6(boolean z, t2g t2gVar, LocalDate localDate, LocalDate localDate2, h0e h0eVar, h0e h0eVar2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$enabled = z;
        this.$state = t2gVar;
        this.$startDate = localDate;
        this.$endDate = localDate2;
        this.$currentSelection$delegate = h0eVar;
        this.$currentOnChange$delegate = h0eVar2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dk6(this.$enabled, this.$state, this.$startDate, this.$endDate, this.$currentSelection$delegate, this.$currentOnChange$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$enabled) {
            t2g t2gVar = this.$state;
            ck6 ck6Var = new ck6(t2gVar, 0);
            m8 m8Var = new m8(t2gVar, this.$startDate, this.$endDate, this.$currentSelection$delegate, this.$currentOnChange$delegate, 14);
            this.label = 1;
            Object objB = jzb.p(ck6Var).b(new qb1(4, new imb(), m8Var), this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dk6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
