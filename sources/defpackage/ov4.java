package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ov4 extends gbe implements l26 {
    final /* synthetic */ mmb $components;
    final /* synthetic */ uz4 $eventListener;
    final /* synthetic */ mmb $fetchResult;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ mmb $options;
    final /* synthetic */ sw6 $request;
    int label;
    final /* synthetic */ sv4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov4(sv4 sv4Var, mmb mmbVar, mmb mmbVar2, sw6 sw6Var, Object obj, mmb mmbVar3, uz4 uz4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = sv4Var;
        this.$fetchResult = mmbVar;
        this.$components = mmbVar2;
        this.$request = sw6Var;
        this.$mappedData = obj;
        this.$options = mmbVar3;
        this.$eventListener = uz4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ov4(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        sv4 sv4Var = this.this$0;
        otd otdVar = (otd) this.$fetchResult.element;
        ec2 ec2Var = (ec2) this.$components.element;
        sw6 sw6Var = this.$request;
        Object obj2 = this.$mappedData;
        as9 as9Var = (as9) this.$options.element;
        uz4 uz4Var = this.$eventListener;
        this.label = 1;
        Object objA = sv4Var.a(otdVar, ec2Var, sw6Var, obj2, as9Var, uz4Var, this);
        bw2 bw2Var = bw2.a;
        return objA == bw2Var ? bw2Var : objA;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ov4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
