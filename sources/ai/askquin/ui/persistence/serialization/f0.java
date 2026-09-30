package ai.askquin.ui.persistence.serialization;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.g11;
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
public final /* synthetic */ class f0 implements w56 {
    public static final f0 a;
    private static final nyc descriptor;

    static {
        f0 f0Var = new f0();
        a = f0Var;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.SerializableMessage.ClarifyingCardRequest", f0Var, 5);
        giaVar.k("id", false);
        giaVar.k("label", false);
        giaVar.k("ignored", true);
        giaVar.k("drawMessageId", true);
        giaVar.k("interpretationMessageId", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SerializableMessage.ClarifyingCardRequest clarifyingCardRequest = (SerializableMessage.ClarifyingCardRequest) obj;
        clarifyingCardRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SerializableMessage.ClarifyingCardRequest.write$Self$Quin_conversation_gpRelease(clarifyingCardRequest, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String strO = null;
        String strO2 = null;
        String str = null;
        String str2 = null;
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
                z2 = zf2VarC.z(nycVar, 2);
                i |= 4;
            } else if (iJ == 3) {
                str = (String) zf2VarC.y(nycVar, 3, p4e.a, str);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                str2 = (String) zf2VarC.y(nycVar, 4, p4e.a, str2);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new SerializableMessage.ClarifyingCardRequest(i, strO, strO2, z2, str, str2, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, g11.a, t72.F(p4eVar), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
