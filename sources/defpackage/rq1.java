package defpackage;

import ai.askquin.repository.b;
import tech.chatmind.api.TarotCardInfo;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rq1 extends gbe implements l26 {
    final /* synthetic */ TarotCardType $cardType;
    final /* synthetic */ b $repository;
    final /* synthetic */ String $skinFolder;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq1(xn2 xn2Var, b bVar, String str, TarotCardType tarotCardType) {
        super(2, xn2Var);
        this.$cardType = tarotCardType;
        this.$repository = bVar;
        this.$skinFolder = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        rq1 rq1Var = new rq1(xn2Var, this.$repository, this.$skinFolder, this.$cardType);
        rq1Var.L$0 = obj;
        return rq1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xva xvaVar = (xva) this.L$0;
        int i = this.label;
        TarotCardInfo tarotCardInfo = null;
        if (i == 0) {
            jzb.q(obj);
            TarotCardType tarotCardType = this.$cardType;
            if (tarotCardType != null) {
                b bVar = this.$repository;
                String str = this.$skinFolder;
                js3 js3Var = ga4.a;
                hr3 hr3Var = hr3.c;
                qq1 qq1Var = new qq1(null, bVar, str, tarotCardType);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = xvaVar;
                this.label = 1;
                obj = ynb.p0(hr3Var, qq1Var, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            ((yva) xvaVar).setValue(tarotCardInfo);
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xvaVar = (xva) this.L$2;
        jzb.q(obj);
        tarotCardInfo = (TarotCardInfo) obj;
        ((yva) xvaVar).setValue(tarotCardInfo);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rq1) k((xn2) obj2, (xva) obj)).r(wef.a);
    }
}
