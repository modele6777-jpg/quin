package defpackage;

import java.util.List;
import tech.chatmind.api.DrawClarifyingCardRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ln4 implements w56 {
    public static final ln4 a;
    private static final nyc descriptor;

    static {
        ln4 ln4Var = new ln4();
        a = ln4Var;
        gia giaVar = new gia("tech.chatmind.api.DrawClarifyingCardRequest", ln4Var, 3);
        giaVar.k("type", true);
        giaVar.k("cards", false);
        giaVar.k("requestClarifyingCardMessageId", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DrawClarifyingCardRequest drawClarifyingCardRequest = (DrawClarifyingCardRequest) obj;
        drawClarifyingCardRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DrawClarifyingCardRequest.write$Self$Quin_core_base_api_release(drawClarifyingCardRequest, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = DrawClarifyingCardRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        List list = null;
        String strO2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                list = (List) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                strO2 = zf2VarC.o(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new DrawClarifyingCardRequest(i, strO, list, strO2, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = DrawClarifyingCardRequest.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, lw7VarArr[1].getValue(), p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
