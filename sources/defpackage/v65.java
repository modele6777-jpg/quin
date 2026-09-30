package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v65 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k75 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v65(k75 k75Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = k75Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        v65 v65Var = new v65(this.this$0, xn2Var);
        v65Var.L$0 = obj;
        return v65Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        yof yofVar = (yof) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        List listM = r8c.m(yofVar.f);
        xke xkeVar = TarotSkinIdentify.Companion;
        n2f n2fVar = yofVar.g;
        xkeVar.getClass();
        TarotSkinIdentify tarotSkinIdentifyA = xke.a(n2fVar);
        s0e s0eVar = this.this$0.v;
        do {
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, t65.a((t65) value, null, null, 0, listM, null, tarotSkinIdentifyA, 23)));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        v65 v65Var = (v65) k((xn2) obj2, (yof) obj);
        wef wefVar = wef.a;
        v65Var.r(wefVar);
        return wefVar;
    }
}
