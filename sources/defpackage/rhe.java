package defpackage;

import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rhe implements w56 {
    public static final rhe a;
    private static final nyc descriptor;

    static {
        rhe rheVar = new rhe();
        a = rheVar;
        gia giaVar = new gia("tech.chatmind.api.TarotCardChoice", rheVar, 3);
        giaVar.k("card", false);
        giaVar.k("isReversed", false);
        giaVar.k("tarotCardDesc", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
        tarotCardChoice.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotCardChoice.write$Self$Quin_core_base_api_release(tarotCardChoice, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = TarotCardChoice.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        TarotCardType tarotCardType = null;
        String str = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                tarotCardType = (TarotCardType) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), tarotCardType);
                i |= 1;
            } else if (iJ == 1) {
                z2 = zf2VarC.z(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotCardChoice(i, tarotCardType, z2, str, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{TarotCardChoice.$childSerializers[0].getValue(), g11.a, t72.F(p4e.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
