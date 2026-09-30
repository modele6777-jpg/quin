package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gx extends gbe implements a26 {
    final /* synthetic */ qz $animation;
    final /* synthetic */ a26 $block;
    final /* synthetic */ Object $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jx this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(jx jxVar, Object obj, qz qzVar, long j, a26 a26Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = jxVar;
        this.$initialVelocity = obj;
        this.$animation = qzVar;
        this.$startTime = j;
        this.$block = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new gx(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        wz wzVar;
        imb imbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                jx jxVar = this.this$0;
                jxVar.c.c = (b00) jxVar.a.a.d(this.$initialVelocity);
                this.this$0.e.setValue(this.$animation.h());
                this.this$0.d.setValue(Boolean.TRUE);
                wz wzVar2 = this.this$0.c;
                wz wzVar3 = new wz(wzVar2.a, wzVar2.b.getValue(), y41.g(wzVar2.c), wzVar2.d, Long.MIN_VALUE, wzVar2.f);
                imb imbVar2 = new imb();
                qz qzVar = this.$animation;
                long j = this.$startTime;
                wg wgVar = new wg(this.this$0, wzVar3, this.$block, imbVar2, 1);
                this.L$0 = wzVar3;
                this.L$1 = imbVar2;
                this.label = 1;
                Object objR = hkg.R(wzVar3, qzVar, j, wgVar, this);
                bw2 bw2Var = bw2.a;
                if (objR == bw2Var) {
                    return bw2Var;
                }
                wzVar = wzVar3;
                imbVar = imbVar2;
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                imbVar = (imb) this.L$1;
                wzVar = (wz) this.L$0;
                jzb.q(obj);
            }
            rz rzVar = imbVar.element ? rz.a : rz.b;
            this.this$0.d();
            return new tz(wzVar, rzVar);
        } catch (CancellationException e) {
            this.this$0.d();
            throw e;
        }
    }
}
