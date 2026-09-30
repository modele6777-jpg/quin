package defpackage;

import ai.askquin.ui.seasonal.SeasonalLoadingRoute;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ww5 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ orc b;
    public final /* synthetic */ lsc c;
    public final /* synthetic */ ka9 d;
    public final /* synthetic */ uqc e;

    public /* synthetic */ ww5(orc orcVar, lsc lscVar, ka9 ka9Var, uqc uqcVar, int i) {
        this.a = i;
        this.b = orcVar;
        this.c = lscVar;
        this.d = ka9Var;
        this.e = uqcVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        uqc uqcVar = this.e;
        ka9 ka9Var = this.d;
        lsc lscVar = this.c;
        orc orcVar = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                mic micVar = lscVar.e;
                orcVar.n(micVar.b(), micVar.c(), an1.W(lscVar), an1.S(list));
                ka9.e(ka9Var, new SeasonalLoadingRoute(micVar.b(), micVar.c().getWireValue(), uqcVar.c, false, 8, (rp3) null), null, 6);
                break;
            default:
                List list2 = (List) obj;
                list2.getClass();
                mic micVar2 = lscVar.e;
                orcVar.n(micVar2.b(), micVar2.c(), an1.W(lscVar), an1.S(list2));
                ka9.e(ka9Var, new SeasonalLoadingRoute(micVar2.b(), micVar2.c().getWireValue(), uqcVar.c, false, 8, (rp3) null), null, 6);
                break;
        }
        return wefVar;
    }
}
