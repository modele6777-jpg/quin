package defpackage;

import java.util.concurrent.CancellationException;
import tech.chatmind.api.UpdateUserProfileResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mpf extends gbe implements l26 {
    final /* synthetic */ lmd $skinProductType;
    int label;
    final /* synthetic */ npf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpf(npf npfVar, lmd lmdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = npfVar;
        this.$skinProductType = lmdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mpf(this.this$0, this.$skinProductType, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                vkf vkfVar = this.this$0.a;
                String strD = this.$skinProductType.d();
                this.label = 1;
                obj = vkfVar.d(strD, this);
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
            dzbVar = ((UpdateUserProfileResponse) obj).getSuccess() ? wef.a : new dzb(new mgf("Update current card was rejected"));
        } catch (Exception e) {
            npf npfVar = this.this$0;
            int i2 = npf.c;
            npfVar.getClass();
            if (e instanceof CancellationException) {
                throw e;
            }
            ynb.h0(e);
            if (tgc.j(e, true)) {
                npfVar.b("Failed to update user tarot card skin");
            } else {
                npfVar.d().c("Failed to update user tarot card skin", e);
            }
            dzbVar = new dzb(e);
        }
        return new ezb(dzbVar);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mpf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
