package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.divination.k;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zv9 extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ t7 $accountInfo;
    final /* synthetic */ e89 $isQuotaCheckInProgress$delegate;
    final /* synthetic */ x16 $onAllowed;
    final /* synthetic */ j4a $paywallChecker;
    final /* synthetic */ String $readingId;
    final /* synthetic */ String $source;
    final /* synthetic */ tr2 $this_OverviewLayer;
    final /* synthetic */ r0 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv9(j4a j4aVar, t7 t7Var, String str, r0 r0Var, String str2, x16 x16Var, String str3, tr2 tr2Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$paywallChecker = j4aVar;
        this.$accountInfo = t7Var;
        this.$accountId = str;
        this.$vm = r0Var;
        this.$readingId = str2;
        this.$onAllowed = x16Var;
        this.$source = str3;
        this.$this_OverviewLayer = tr2Var;
        this.$isQuotaCheckInProgress$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zv9(this.$paywallChecker, this.$accountInfo, this.$accountId, this.$vm, this.$readingId, this.$onAllowed, this.$source, this.$this_OverviewLayer, this.$isQuotaCheckInProgress$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                j4a j4aVar = this.$paywallChecker;
                this.label = 1;
                obj = j4aVar.b(this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            p9b p9bVar = (p9b) obj;
            boolean zT = pa7.t(((mo3) this.$accountInfo).a(), this.$accountId);
            wef wefVar = wef.a;
            if (zT && pa7.t(this.$vm.E(), this.$readingId)) {
                if (pa7.t(p9bVar, n9b.a)) {
                    this.$onAllowed.invoke();
                } else {
                    if (!(p9bVar instanceof o9b)) {
                        throw new rf9();
                    }
                    k.g(this.$paywallChecker, this.$accountInfo, this.$vm, this.$this_OverviewLayer, ((o9b) p9bVar).a, this.$source);
                }
            }
            k.f(this.$isQuotaCheckInProgress$delegate);
            return wefVar;
        } catch (Throwable th) {
            k.f(this.$isQuotaCheckInProgress$delegate);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zv9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
