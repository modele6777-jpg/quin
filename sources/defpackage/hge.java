package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hge extends gbe implements l26 {
    final /* synthetic */ ege $session;
    final /* synthetic */ TarotSkinIdentify $skin;
    int label;
    final /* synthetic */ lge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hge(xn2 xn2Var, ege egeVar, lge lgeVar, TarotSkinIdentify tarotSkinIdentify) {
        super(2, xn2Var);
        this.this$0 = lgeVar;
        this.$session = egeVar;
        this.$skin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hge(xn2Var, this.$session, this.this$0, this.$skin);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        lge lgeVar = this.this$0;
        if (!lgeVar.v) {
            ege egeVar = lgeVar.k;
            ege egeVar2 = this.$session;
            if (egeVar == egeVar2) {
                Integer num = (Integer) egeVar2.c.get(this.$skin);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                this.$session.c.put(this.$skin, new Integer(iIntValue));
                List list = mge.a;
                if (iIntValue < 3) {
                    this.this$0.h();
                }
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        hge hgeVar = (hge) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        hgeVar.r(wefVar);
        return wefVar;
    }
}
