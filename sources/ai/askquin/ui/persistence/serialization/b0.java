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
public final /* synthetic */ class b0 implements w56 {
    public static final b0 a;
    private static final nyc descriptor;

    static {
        b0 b0Var = new b0();
        a = b0Var;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.SerializableMessage.ClarifyingCardDraw", b0Var, 4);
        giaVar.k("id", false);
        giaVar.k("cards", false);
        giaVar.k("requestMessageId", false);
        giaVar.k("interpretationMessageId", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SerializableMessage.ClarifyingCardDraw clarifyingCardDraw = (SerializableMessage.ClarifyingCardDraw) obj;
        clarifyingCardDraw.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SerializableMessage.ClarifyingCardDraw.write$Self$Quin_conversation_gpRelease(clarifyingCardDraw, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SerializableMessage.ClarifyingCardDraw.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        List list = null;
        String strO2 = null;
        String str = null;
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
            } else if (iJ == 2) {
                strO2 = zf2VarC.o(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                str = (String) zf2VarC.y(nycVar, 3, p4e.a, str);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new SerializableMessage.ClarifyingCardDraw(i, strO, list, strO2, str, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SerializableMessage.ClarifyingCardDraw.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, lw7VarArr[1].getValue(), p4eVar, t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
