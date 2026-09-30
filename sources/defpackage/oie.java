package defpackage;

import java.util.List;
import tech.chatmind.api.TarotOrderErrorData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oie implements w56 {
    public static final oie a;
    private static final nyc descriptor;

    static {
        oie oieVar = new oie();
        a = oieVar;
        gia giaVar = new gia("tech.chatmind.api.TarotOrderErrorData", oieVar, 1);
        giaVar.k("tarotIds", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotOrderErrorData tarotOrderErrorData = (TarotOrderErrorData) obj;
        tarotOrderErrorData.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotOrderErrorData.write$Self$Quin_core_base_api_release(tarotOrderErrorData, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = TarotOrderErrorData.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                list = (List) zf2VarC.y(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotOrderErrorData(i, list, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F((xn7) TarotOrderErrorData.$childSerializers[0].getValue())};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
