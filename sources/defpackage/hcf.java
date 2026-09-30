package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hcf extends gbe implements l26 {
    final /* synthetic */ TarotSkinIdentify $activeSkin;
    final /* synthetic */ r0 $divinationViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcf(r0 r0Var, TarotSkinIdentify tarotSkinIdentify, xn2 xn2Var) {
        super(2, xn2Var);
        this.$divinationViewModel = r0Var;
        this.$activeSkin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hcf(this.$divinationViewModel, this.$activeSkin, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        r0 r0Var = this.$divinationViewModel;
        if (r0Var != null) {
            String strName = this.$activeSkin.getKey().name();
            String str = r0Var.I0;
            strName.getClass();
            if (r0Var.R() != null) {
                ConcurrentHashMap concurrentHashMap = xfb.a;
                xfb.c(str, "mixed_tarot");
            } else {
                try {
                    xke xkeVar = TarotSkinIdentify.Companion;
                    n2f n2fVarValueOf = n2f.valueOf(strName);
                    xkeVar.getClass();
                    dzbVar = xke.a(n2fVarValueOf);
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) (dzbVar instanceof dzb ? null : dzbVar);
                if (tarotSkinIdentify != null) {
                    ConcurrentHashMap concurrentHashMap2 = xfb.a;
                    xfb.c(str, urg.r(tarotSkinIdentify));
                    if (r0Var.g0() && r0Var.H() == null) {
                        r0Var.C1 = strName;
                    }
                }
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        hcf hcfVar = (hcf) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        hcfVar.r(wefVar);
        return wefVar;
    }
}
