package defpackage;

import tech.chatmind.api.EmotionTheme;
import tech.chatmind.api.ShareSummaryContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yad implements w56 {
    public static final yad a;
    private static final nyc descriptor;

    static {
        yad yadVar = new yad();
        a = yadVar;
        gia giaVar = new gia("tech.chatmind.api.ShareSummaryContent", yadVar, 3);
        giaVar.k("advice", false);
        giaVar.k("summary", false);
        giaVar.k("theme", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ShareSummaryContent shareSummaryContent = (ShareSummaryContent) obj;
        shareSummaryContent.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ShareSummaryContent.write$Self$Quin_core_base_api_release(shareSummaryContent, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = ShareSummaryContent.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        EmotionTheme emotionTheme = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                strO2 = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                emotionTheme = (EmotionTheme) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), emotionTheme);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new ShareSummaryContent(i, strO, strO2, emotionTheme, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = ShareSummaryContent.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, lw7VarArr[2].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
