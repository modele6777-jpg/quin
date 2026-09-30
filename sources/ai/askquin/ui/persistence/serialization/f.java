package ai.askquin.ui.persistence.serialization;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.t72;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements w56 {
    public static final f a;
    private static final nyc descriptor;

    static {
        f fVar = new f();
        a = fVar;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.SerializableDivinationState.CardsDecided", fVar, 5);
        giaVar.k("analysis", false);
        giaVar.k("cards", false);
        giaVar.k("postDrawAdditionalInfo", true);
        giaVar.k("postDrawAudioChatId", true);
        giaVar.k("postDrawAudioAssetId", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SerializableDivinationState.CardsDecided cardsDecided = (SerializableDivinationState.CardsDecided) obj;
        cardsDecided.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SerializableDivinationState.CardsDecided.write$Self$Quin_conversation_gpRelease(cardsDecided, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SerializableDivinationState.CardsDecided.$childSerializers;
        boolean z = true;
        int i = 0;
        SerializableDivinationState.Analysis analysis = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                analysis = (SerializableDivinationState.Analysis) zf2VarC.s(nycVar, 0, d.a, analysis);
                i |= 1;
            } else if (iJ == 1) {
                list = (List) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list);
                i |= 2;
            } else if (iJ == 2) {
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            } else if (iJ == 3) {
                str2 = (String) zf2VarC.y(nycVar, 3, p4e.a, str2);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                str3 = (String) zf2VarC.y(nycVar, 4, p4e.a, str3);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new SerializableDivinationState.CardsDecided(i, analysis, list, str, str2, str3, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SerializableDivinationState.CardsDecided.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{d.a, lw7VarArr[1].getValue(), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
