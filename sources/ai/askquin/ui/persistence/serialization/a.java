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
public final /* synthetic */ class a implements w56 {
    public static final a a;
    private static final nyc descriptor;

    static {
        a aVar = new a();
        a = aVar;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.PhotoTarotCard", aVar, 4);
        giaVar.k("id", false);
        giaVar.k("imageKey", true);
        giaVar.k("name", false);
        giaVar.k("description", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PhotoTarotCard photoTarotCard = (PhotoTarotCard) obj;
        photoTarotCard.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PhotoTarotCard.write$Self$Quin_conversation_gpRelease(photoTarotCard, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        String strO = null;
        String str = null;
        String strO2 = null;
        String strO3 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                i |= 2;
            } else if (iJ == 2) {
                strO2 = zf2VarC.o(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                strO3 = zf2VarC.o(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new PhotoTarotCard(i, strO, str, strO2, strO3, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, t72.F(p4eVar), p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
