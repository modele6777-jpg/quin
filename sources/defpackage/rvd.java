package defpackage;

import tech.chatmind.api.SpreadDetail;
import tech.chatmind.api.SpreadDetailCard;
import tech.chatmind.api.SpreadDetailPattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rvd implements w56 {
    public static final rvd a;
    private static final nyc descriptor;

    static {
        rvd rvdVar = new rvd();
        a = rvdVar;
        gia giaVar = new gia("tech.chatmind.api.SpreadDetail", rvdVar, 2);
        giaVar.k("card", true);
        giaVar.k("pattern", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SpreadDetail spreadDetail = (SpreadDetail) obj;
        spreadDetail.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SpreadDetail.write$Self$Quin_core_base_api_release(spreadDetail, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        SpreadDetailCard spreadDetailCard = null;
        SpreadDetailPattern spreadDetailPattern = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                spreadDetailCard = (SpreadDetailCard) zf2VarC.y(nycVar, 0, tvd.a, spreadDetailCard);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                spreadDetailPattern = (SpreadDetailPattern) zf2VarC.y(nycVar, 1, vvd.a, spreadDetailPattern);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new SpreadDetail(i, spreadDetailCard, spreadDetailPattern, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F(tvd.a), t72.F(vvd.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
