package defpackage;

import ai.askquin.ui.conversation.r0;
import tech.chatmind.api.TarotReadingHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class se4 extends gbe implements l26 {
    final /* synthetic */ TarotReadingHistory $history;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se4(r0 r0Var, TarotReadingHistory tarotReadingHistory, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$history = tarotReadingHistory;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        se4 se4Var = new se4(this.this$0, this.$history, xn2Var);
        se4Var.L$0 = obj;
        return se4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        Object objE;
        r0 r0Var;
        TarotReadingHistory tarotReadingHistory;
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                r0 r0Var2 = this.this$0;
                TarotReadingHistory tarotReadingHistory2 = this.$history;
                this.L$0 = null;
                this.L$1 = r0Var2;
                this.L$2 = tarotReadingHistory2;
                this.L$3 = null;
                this.label = 1;
                int i2 = r0.j2;
                objE = ((gq3) r0Var2.f).e(k99.J(tarotReadingHistory2.getChatId()), this);
                bw2 bw2Var = bw2.a;
                if (objE == bw2Var) {
                    return bw2Var;
                }
                r0Var = r0Var2;
                tarotReadingHistory = tarotReadingHistory2;
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tarotReadingHistory = (TarotReadingHistory) this.L$2;
                r0 r0Var3 = (r0) this.L$1;
                jzb.q(obj);
                r0Var = r0Var3;
                objE = obj;
            }
            yc4 yc4Var = (yc4) objE;
            ((gq3) r0Var.f).g(af8.m(tarotReadingHistory, yc4Var != null ? yc4.a(yc4Var, null, false, null, null, 0, fb4.a(yc4Var.h, null, null, null, null, null, null, null, null, null, 483), null, null, null, null, null, null, null, 4194175) : null, 2));
            dzbVar = wefVar;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        r0 r0Var4 = this.this$0;
        TarotReadingHistory tarotReadingHistory3 = this.$history;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            kv2.A("persistCloudHistory failed for ", tarotReadingHistory3.getChatId(), r0Var4.d(), thA);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((se4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
