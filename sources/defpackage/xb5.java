package defpackage;

import java.util.List;
import tech.chatmind.api.FeedbackRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xb5 implements w56 {
    public static final xb5 a;
    private static final nyc descriptor;

    static {
        xb5 xb5Var = new xb5();
        a = xb5Var;
        gia giaVar = new gia("tech.chatmind.api.FeedbackRequest", xb5Var, 6);
        giaVar.k("uid", false);
        giaVar.k("chatId", false);
        giaVar.k("starNum", false);
        giaVar.k("tags", false);
        giaVar.k("chatRecord", false);
        giaVar.k("other", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        FeedbackRequest feedbackRequest = (FeedbackRequest) obj;
        feedbackRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        FeedbackRequest.write$Self$Quin_core_base_api_release(feedbackRequest, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = FeedbackRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        String strO = null;
        String strO2 = null;
        List list = null;
        List list2 = null;
        String strO3 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    iT = zf2VarC.t(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) zf2VarC.s(nycVar, 4, (xn7) lw7VarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    strO3 = zf2VarC.o(nycVar, 5);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new FeedbackRequest(i, strO, strO2, iT, list, list2, strO3, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = FeedbackRequest.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, c77.a, lw7VarArr[3].getValue(), lw7VarArr[4].getValue(), p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
