package defpackage;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.OffsetDateTime;
import java.util.List;
import tech.chatmind.api.events.model.EventImageAction;
import tech.chatmind.api.events.model.EventInfo;
import tech.chatmind.api.events.model.EventType;
import tech.chatmind.api.events.model.Popup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nz4 implements w56 {
    public static final nz4 a;
    private static final nyc descriptor;

    static {
        nz4 nz4Var = new nz4();
        a = nz4Var;
        gia giaVar = new gia("tech.chatmind.api.events.model.EventInfo", nz4Var, 9);
        giaVar.k("id", false);
        giaVar.k("type", false);
        giaVar.k("startAt", false);
        giaVar.k("endAt", false);
        giaVar.k(Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, true);
        giaVar.k("pattern", true);
        giaVar.k("patternData", true);
        giaVar.k("popup", true);
        giaVar.k("recommendQuestion", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        EventInfo eventInfo = (EventInfo) obj;
        eventInfo.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        EventInfo.write$Self$Quin_core_base_api_release(eventInfo, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = EventInfo.$childSerializers;
        String str = null;
        boolean z = true;
        Popup popup = null;
        int i = 0;
        String strO = null;
        EventType eventType = null;
        OffsetDateTime offsetDateTime = null;
        OffsetDateTime offsetDateTime2 = null;
        EventImageAction eventImageAction = null;
        String str2 = null;
        List list = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    eventType = (EventType) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), eventType);
                    i |= 2;
                    break;
                case 2:
                    offsetDateTime = (OffsetDateTime) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), offsetDateTime);
                    i |= 4;
                    break;
                case 3:
                    offsetDateTime2 = (OffsetDateTime) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), offsetDateTime2);
                    i |= 8;
                    break;
                case 4:
                    eventImageAction = (EventImageAction) zf2VarC.y(nycVar, 4, kz4.a, eventImageAction);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) zf2VarC.y(nycVar, 5, p4e.a, str2);
                    i |= 32;
                    break;
                case 6:
                    list = (List) zf2VarC.y(nycVar, 6, (xn7) lw7VarArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    popup = (Popup) zf2VarC.y(nycVar, 7, sja.a, popup);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                case 8:
                    str = (String) zf2VarC.y(nycVar, 8, p4e.a, str);
                    i |= 256;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new EventInfo(i, strO, eventType, offsetDateTime, offsetDateTime2, eventImageAction, str2, list, popup, str, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = EventInfo.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, lw7VarArr[1].getValue(), lw7VarArr[2].getValue(), lw7VarArr[3].getValue(), t72.F(kz4.a), t72.F(p4eVar), t72.F((xn7) lw7VarArr[6].getValue()), t72.F(sja.a), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
