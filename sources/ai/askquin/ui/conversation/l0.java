package ai.askquin.ui.conversation;

import ai.askquin.data.QuotaBlockReason;
import defpackage.ad4;
import defpackage.bw2;
import defpackage.gbe;
import defpackage.iy9;
import defpackage.j8;
import defpackage.jyb;
import defpackage.jzb;
import defpackage.kyb;
import defpackage.l26;
import defpackage.nyb;
import defpackage.oyb;
import defpackage.pa7;
import defpackage.qc0;
import defpackage.rab;
import defpackage.wef;
import defpackage.xn2;
import defpackage.ym8;
import defpackage.zf4;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends gbe implements l26 {
    final /* synthetic */ Operation<?> $operation;
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(xn2 xn2Var, r0 r0Var, Operation operation) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$operation = operation;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        l0 l0Var = new l0(xn2Var, this.this$0, this.$operation);
        l0Var.L$0 = obj;
        return l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0151 A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        QuotaBlockReason reason;
        oyb oybVar = (oyb) this.L$0;
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            if (i != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wefVar;
        }
        jzb.q(obj);
        if (oybVar instanceof jyb) {
            this.this$0.d().e("operation cancel: " + this.$operation);
            if (this.$operation instanceof Operation.Chat) {
                this.this$0.L1(null);
                return wefVar;
            }
        } else if (oybVar instanceof kyb) {
            r0 r0Var = this.this$0;
            kyb kybVar = (kyb) oybVar;
            Throwable th = kybVar.a;
            int i2 = r0.j2;
            r0Var.getClass();
            iy9 iy9VarK = r0.K(kybVar);
            FailReason failReason = (FailReason) iy9VarK.a();
            String str = (String) iy9VarK.b();
            Operation<?> operation = this.$operation;
            int i3 = ((operation instanceof Operation.Ask) || (operation instanceof Operation.UpdateQuestion) || (operation instanceof Operation.SubmitSpread) || (operation instanceof Operation.Explanation)) ? 1 : 0;
            bw2 bw2Var = bw2.a;
            if (i3 == 0 || !zf4.c(th)) {
                this.this$0.d().c("operation failed: " + this.$operation + ", reason: " + failReason + ", body: " + str, th);
                if (pa7.t(failReason, FailReason.Unauthorized.INSTANCE)) {
                    ((rab) this.this$0.v).g(true);
                }
                if (failReason instanceof FailReason.UsageBlocked) {
                    reason = ((FailReason.UsageBlocked) failReason).getReason();
                } else {
                    reason = pa7.t(failReason, FailReason.NoFreeCount.INSTANCE) ? QuotaBlockReason.CountInsufficient : null;
                }
                ad4 ad4VarM = ym8.m(this.this$0.a0());
                if (ad4VarM != null) {
                    Operation<?> operation2 = this.$operation;
                    if (((operation2 instanceof Operation.SubmitSpread) || (operation2 instanceof Operation.Explanation)) && reason != null) {
                        r0 r0Var2 = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.I$0 = i3;
                        this.label = 2;
                        if (r0Var2.j1(ad4VarM, reason, this) == bw2Var) {
                            return bw2Var;
                        }
                    }
                }
                this.this$0.L1(null);
                Operation<?> operation3 = this.$operation;
                if (!(operation3 instanceof Operation.Ask) && !(operation3 instanceof Operation.UpdateQuestion)) {
                    this.this$0.B1(operation3, failReason);
                    return wefVar;
                }
                r0 r0Var3 = this.this$0;
                r0Var3.U0(operation3, new j8(r0Var3, operation3, failReason, 26));
                return wefVar;
            }
            this.this$0.d().g("Reading operation already completed; reconciling " + this.$operation);
            r0 r0Var4 = this.this$0;
            Operation<?> operation4 = this.$operation;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = i3;
            this.label = 1;
            if (r0Var4.a1(operation4, this) == bw2Var) {
                return bw2Var;
            }
        } else if (oybVar instanceof nyb) {
            r0 r0Var5 = this.this$0;
            int i4 = r0.j2;
            r0Var5.q();
            this.this$0.L1(null);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((l0) k((xn2) obj2, (oyb) obj)).r(wef.a);
    }
}
