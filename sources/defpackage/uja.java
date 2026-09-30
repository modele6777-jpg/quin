package defpackage;

import tech.chatmind.api.events.model.PopupAction;
import tech.chatmind.api.events.model.PopupActionType;
import tech.chatmind.api.events.model.PopupTrackingEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uja implements w56 {
    public static final uja a;
    private static final nyc descriptor;

    static {
        uja ujaVar = new uja();
        a = ujaVar;
        gia giaVar = new gia("tech.chatmind.api.events.model.PopupAction", ujaVar, 4);
        giaVar.k("text", false);
        giaVar.k("type", true);
        giaVar.k("url", true);
        giaVar.k("tracking", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PopupAction popupAction = (PopupAction) obj;
        popupAction.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PopupAction.write$Self$Quin_core_base_api_release(popupAction, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = PopupAction.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        PopupActionType popupActionType = null;
        String str = null;
        PopupTrackingEvent popupTrackingEvent = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                popupActionType = (PopupActionType) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), popupActionType);
                i |= 2;
            } else if (iJ == 2) {
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                popupTrackingEvent = (PopupTrackingEvent) zf2VarC.y(nycVar, 3, sma.a, popupTrackingEvent);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new PopupAction(i, strO, popupActionType, str, popupTrackingEvent, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = PopupAction.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, lw7VarArr[1].getValue(), t72.F(p4eVar), t72.F(sma.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
