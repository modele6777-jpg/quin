package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import tech.chatmind.api.AiRecommendResponse;
import tech.chatmind.api.SpreadRecommendationResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ji implements xn7 {
    public static final ji a = new ji();
    public static final dd0 b = t72.l(SpreadRecommendationResult.Companion.serializer());
    public static final pyc c = eec.o("tech.chatmind.api.AiRecommendResponse", new nyc[0], new z4(11));

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AiRecommendResponse aiRecommendResponse = (AiRecommendResponse) obj;
        aiRecommendResponse.getClass();
        sh7 sh7Var = ev4Var instanceof sh7 ? (sh7) ev4Var : null;
        if (sh7Var == null) {
            throw new yyc("AiRecommendResponse only supports JSON");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yi7 yi7VarB = oh7.b(Integer.valueOf(aiRecommendResponse.getSuggestedSpreadIndex()));
        yi7VarB.getClass();
        sh7Var.z(new ti7(linkedHashMap));
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        List list;
        Integer numG;
        jh7 jh7Var = om3Var instanceof jh7 ? (jh7) om3Var : null;
        if (jh7Var == null) {
            throw new yyc("AiRecommendResponse only supports JSON");
        }
        nh7 nh7VarM = jh7Var.m();
        boolean z = nh7VarM instanceof yg7;
        int iIntValue = 0;
        dd0 dd0Var = b;
        if (z) {
            return new AiRecommendResponse((List) jh7Var.d().a(dd0Var, nh7VarM), 0);
        }
        if (!(nh7VarM instanceof ti7)) {
            throw new yyc("AiRecommendResponse expected JSON object or array, got " + nh7VarM);
        }
        ti7 ti7Var = (ti7) nh7VarM;
        nh7 nh7Var = (nh7) ti7Var.get("spreads");
        if (nh7Var == null || (list = (List) jh7Var.d().a(dd0Var, nh7Var)) == null) {
            list = pu4.a;
        }
        nh7 nh7Var2 = (nh7) ti7Var.get("suggestedSpreadIndex");
        if (nh7Var2 != null && (numG = oh7.g(oh7.i(nh7Var2))) != null) {
            iIntValue = numG.intValue();
        }
        return new AiRecommendResponse(list, iIntValue);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return c;
    }
}
