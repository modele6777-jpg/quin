package ai.askquin.ui.persistence.serialization;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.t72;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements w56 {
    public static final i0 a;
    private static final nyc descriptor;

    static {
        i0 i0Var = new i0();
        a = i0Var;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.SerializableMessage.NewReadingRequest", i0Var, 4);
        giaVar.k("id", false);
        giaVar.k("question", false);
        giaVar.k("childReadingId", true);
        giaVar.k("childReading", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SerializableMessage.NewReadingRequest newReadingRequest = (SerializableMessage.NewReadingRequest) obj;
        newReadingRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SerializableMessage.NewReadingRequest.write$Self$Quin_conversation_gpRelease(newReadingRequest, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String str = null;
        SerializableLinkedReadingSnapshot serializableLinkedReadingSnapshot = null;
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
            } else if (iJ == 2) {
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                serializableLinkedReadingSnapshot = (SerializableLinkedReadingSnapshot) zf2VarC.y(nycVar, 3, u.a, serializableLinkedReadingSnapshot);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new SerializableMessage.NewReadingRequest(i, strO, strO2, str, serializableLinkedReadingSnapshot, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, t72.F(p4eVar), t72.F(u.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
