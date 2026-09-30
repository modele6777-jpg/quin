package ai.askquin.ui.persistence.serialization;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements w56 {
    public static final h a;
    private static final nyc descriptor;

    static {
        h hVar = new h();
        a = hVar;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.SerializableDivinationState.CardsExplanation", hVar, 2);
        giaVar.k("text", false);
        giaVar.k("prev", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SerializableDivinationState.CardsExplanation cardsExplanation = (SerializableDivinationState.CardsExplanation) obj;
        cardsExplanation.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SerializableDivinationState.CardsExplanation.write$Self$Quin_conversation_gpRelease(cardsExplanation, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SerializableDivinationState.CardsExplanation.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        SerializableDivinationState serializableDivinationState = null;
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
                serializableDivinationState = (SerializableDivinationState) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), serializableDivinationState);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new SerializableDivinationState.CardsExplanation(i, strO, serializableDivinationState, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a, SerializableDivinationState.CardsExplanation.$childSerializers[1].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
