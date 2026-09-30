package defpackage;

import ai.askquin.ui.conversation.r0;
import tech.chatmind.api.CloudMixedDeckSnapshot;
import tech.chatmind.api.SubmitSpreadRequest;
import tech.chatmind.api.UserSelectedSpread;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class re4 extends gbe implements l26 {
    final /* synthetic */ String $chatId;
    final /* synthetic */ SubmitSpreadRequest $request;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re4(r0 r0Var, String str, SubmitSpreadRequest submitSpreadRequest, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$chatId = str;
        this.$request = submitSpreadRequest;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        re4 re4Var = new re4(this.this$0, this.$chatId, this.$request, xn2Var);
        re4Var.L$0 = obj;
        return re4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        r0 r0Var;
        d99 d99Var;
        String str;
        SubmitSpreadRequest submitSpreadRequest;
        Throwable th;
        d99 d99Var2;
        xj5 xj5Var = (xj5) this.L$0;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                r0Var = this.this$0;
                d99Var = r0Var.n1;
                String str2 = this.$chatId;
                SubmitSpreadRequest submitSpreadRequest2 = this.$request;
                this.L$0 = xj5Var;
                this.L$1 = d99Var;
                this.L$2 = r0Var;
                this.L$3 = str2;
                this.L$4 = submitSpreadRequest2;
                this.label = 1;
                if (d99Var.b(this) != bw2Var) {
                    str = str2;
                    submitSpreadRequest = submitSpreadRequest2;
                }
                return bw2Var;
            }
            if (i != 1) {
                if (i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) this.L$1;
                try {
                    jzb.q(obj);
                    d99Var2.h(null);
                    return wef.a;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            submitSpreadRequest = (SubmitSpreadRequest) this.L$4;
            String str3 = (String) this.L$3;
            r0Var = (r0) this.L$2;
            d99 d99Var3 = (d99) this.L$1;
            jzb.q(obj);
            str = str3;
            d99Var = d99Var3;
            yt6 yt6Var = r0Var.d;
            UserSelectedSpread userSelectedSpread = submitSpreadRequest.getUserSelectedSpread();
            CloudMixedDeckSnapshot mixedDeckSnapshot = submitSpreadRequest.getMixedDeckSnapshot();
            uke ukeVar = (uke) yt6Var;
            ukeVar.getClass();
            str.getClass();
            userSelectedSpread.getClass();
            wj5 wj5VarF = ndc.f(new tke(ukeVar, str, userSelectedSpread, mixedDeckSnapshot, null));
            this.L$0 = null;
            this.L$1 = d99Var;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            if (ok8.r(xj5Var, wj5VarF, this) != bw2Var) {
                d99Var2 = d99Var;
                d99Var2.h(null);
                return wef.a;
            }
            return bw2Var;
        } catch (Throwable th3) {
            d99 d99Var4 = d99Var;
            th = th3;
            d99Var2 = d99Var4;
            d99Var2.h(null);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((re4) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
