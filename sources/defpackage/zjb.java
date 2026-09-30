package defpackage;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zjb extends gbe implements l26 {
    final /* synthetic */ LocalDate $completionDate;
    final /* synthetic */ List<LocalDate> $targetDates;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ akb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjb(List list, akb akbVar, LocalDate localDate, xn2 xn2Var) {
        super(2, xn2Var);
        this.$targetDates = list;
        this.this$0 = akbVar;
        this.$completionDate = localDate;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zjb(this.$targetDates, this.this$0, this.$completionDate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        LocalDate localDate;
        akb akbVar;
        Iterator it;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            List<LocalDate> list = this.$targetDates;
            akb akbVar2 = this.this$0;
            localDate = this.$completionDate;
            akbVar = akbVar2;
            it = list.iterator();
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$3;
            localDate = (LocalDate) this.L$2;
            akbVar = (akb) this.L$1;
            jzb.q(obj);
        }
        while (it.hasNext()) {
            LocalDate localDate2 = (LocalDate) it.next();
            gd8 gd8Var = akbVar.a;
            localDate2.getClass();
            ma8 ma8Var = new ma8(localDate2);
            localDate.getClass();
            ma8 ma8Var2 = new ma8(localDate);
            this.L$0 = null;
            this.L$1 = akbVar;
            this.L$2 = localDate;
            this.L$3 = it;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 1;
            Object objJ = gd8Var.j(ma8Var, ma8Var2, this);
            bw2 bw2Var = bw2.a;
            if (objJ == bw2Var) {
                return bw2Var;
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zjb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
