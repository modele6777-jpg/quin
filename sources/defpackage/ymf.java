package defpackage;

import java.time.OffsetDateTime;
import tech.chatmind.api.events.model.Popup;
import tech.chatmind.api.events.model.UserPopupEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ymf implements w56 {
    public static final ymf a;
    private static final nyc descriptor;

    static {
        ymf ymfVar = new ymf();
        a = ymfVar;
        gia giaVar = new gia("tech.chatmind.api.events.model.UserPopupEvent", ymfVar, 4);
        giaVar.k("id", false);
        giaVar.k("popup", false);
        giaVar.k("startAt", false);
        giaVar.k("endAt", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        UserPopupEvent userPopupEvent = (UserPopupEvent) obj;
        userPopupEvent.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        UserPopupEvent.write$Self$Quin_core_base_api_release(userPopupEvent, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = UserPopupEvent.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        Popup popup = null;
        OffsetDateTime offsetDateTime = null;
        OffsetDateTime offsetDateTime2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                popup = (Popup) zf2VarC.s(nycVar, 1, sja.a, popup);
                i |= 2;
            } else if (iJ == 2) {
                offsetDateTime = (OffsetDateTime) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), offsetDateTime);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                offsetDateTime2 = (OffsetDateTime) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), offsetDateTime2);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new UserPopupEvent(i, strO, popup, offsetDateTime, offsetDateTime2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = UserPopupEvent.$childSerializers;
        return new xn7[]{p4e.a, sja.a, lw7VarArr[2].getValue(), lw7VarArr[3].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
