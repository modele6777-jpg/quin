package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z3d extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ TarotSkinIdentify $currentSkin;
    final /* synthetic */ h0e $deckDownloadStates$delegate;
    final /* synthetic */ mfc $deckSchemeType;
    final /* synthetic */ h0e $profile$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3d(Context context, mfc mfcVar, TarotSkinIdentify tarotSkinIdentify, h0e h0eVar, h0e h0eVar2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$deckSchemeType = mfcVar;
        this.$currentSkin = tarotSkinIdentify;
        this.$profile$delegate = h0eVar;
        this.$deckDownloadStates$delegate = h0eVar2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new z3d(this.$context, this.$deckSchemeType, this.$currentSkin, this.$profile$delegate, this.$deckDownloadStates$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        List list;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        yof yofVar = (yof) this.$profile$delegate.getValue();
        wef wefVar = wef.a;
        if (yofVar != null && (list = yofVar.f) != null) {
            Context context = this.$context;
            mfc mfcVar = this.$deckSchemeType;
            TarotSkinIdentify tarotSkinIdentify = this.$currentSkin;
            List listM = r8c.m(list);
            Map map = (Map) this.$deckDownloadStates$delegate.getValue();
            float f = xj3.e;
            context.getClass();
            mfcVar.getClass();
            tarotSkinIdentify.getClass();
            map.getClass();
            List listB1 = s72.b1(r8c.c(mfcVar), new zd0(3, listM, map));
            if (!listB1.isEmpty()) {
                List<TarotSkinIdentify> listC1 = s72.c1(m7c.c(listB1, tarotSkinIdentify), 3);
                fhe fheVar = fhe.a;
                if (m7c.l(context)) {
                    fhe.b.e(true);
                }
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                if (!fhe.c) {
                    fhe.c = true;
                    applicationContext.registerComponentCallbacks(new oge(1));
                }
                ws4 ws4Var = fhe.b;
                ws4Var.getClass();
                bhe bheVarA = ws4Var.a(context, cge.g);
                ws4.b(ws4Var, 1);
                ArrayList arrayList = new ArrayList(t72.u(listC1, 10));
                for (TarotSkinIdentify tarotSkinIdentify2 : listC1) {
                    arrayList.add(new mhe(tarotSkinIdentify2, xj3.s(tarotSkinIdentify2, listM, map) == pl3.c));
                }
                bheVarA.c(arrayList);
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        z3d z3dVar = (z3d) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        z3dVar.r(wefVar);
        return wefVar;
    }
}
