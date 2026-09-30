package defpackage;

import tech.chatmind.api.generatecard.model.CardDetectionResponse;
import tech.chatmind.api.generatecard.model.CardPosition;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yq1 implements w56 {
    public static final yq1 a;
    private static final nyc descriptor;

    static {
        yq1 yq1Var = new yq1();
        a = yq1Var;
        gia giaVar = new gia("tech.chatmind.api.generatecard.model.CardDetectionResponse", yq1Var, 2);
        giaVar.k("card", false);
        giaVar.k("position", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        CardDetectionResponse cardDetectionResponse = (CardDetectionResponse) obj;
        cardDetectionResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        CardDetectionResponse.write$Self$Quin_core_base_api_release(cardDetectionResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = CardDetectionResponse.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        CardPosition cardPosition = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                cardPosition = (CardPosition) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), cardPosition);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new CardDetectionResponse(i, strO, cardPosition, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a, CardDetectionResponse.$childSerializers[1].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
