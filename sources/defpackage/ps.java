package defpackage;

import ai.askquin.ui.AndroidJsonPayload;
import ai.askquin.ui.UrlData;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ps implements w56 {
    public static final ps a;
    private static final nyc descriptor;

    static {
        ps psVar = new ps();
        a = psVar;
        gia giaVar = new gia("ai.askquin.ui.AndroidJsonPayload", psVar, 3);
        giaVar.k("quinData", false);
        giaVar.k("reportTriggeredBy", true);
        giaVar.k("reportParameters", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AndroidJsonPayload androidJsonPayload = (AndroidJsonPayload) obj;
        androidJsonPayload.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        AndroidJsonPayload.write$Self$Quin_conversation_gpRelease(androidJsonPayload, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = AndroidJsonPayload.$childSerializers;
        boolean z = true;
        int i = 0;
        UrlData urlData = null;
        String str = null;
        Map map = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                urlData = (UrlData) zf2VarC.y(nycVar, 0, thf.a, urlData);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                map = (Map) zf2VarC.y(nycVar, 2, (xn7) lw7VarArr[2].getValue(), map);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new AndroidJsonPayload(i, urlData, str, map, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F(thf.a), t72.F(p4e.a), t72.F((xn7) AndroidJsonPayload.$childSerializers[2].getValue())};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
