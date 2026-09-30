package defpackage;

import tech.chatmind.api.events.model.PopupTracking;
import tech.chatmind.api.events.model.PopupTrackingEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qma implements w56 {
    public static final qma a;
    private static final nyc descriptor;

    static {
        qma qmaVar = new qma();
        a = qmaVar;
        gia giaVar = new gia("tech.chatmind.api.events.model.PopupTracking", qmaVar, 2);
        giaVar.k("view", true);
        giaVar.k("close", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PopupTracking popupTracking = (PopupTracking) obj;
        popupTracking.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PopupTracking.write$Self$Quin_core_base_api_release(popupTracking, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        PopupTrackingEvent popupTrackingEvent = null;
        PopupTrackingEvent popupTrackingEvent2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                popupTrackingEvent = (PopupTrackingEvent) zf2VarC.y(nycVar, 0, sma.a, popupTrackingEvent);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                popupTrackingEvent2 = (PopupTrackingEvent) zf2VarC.y(nycVar, 1, sma.a, popupTrackingEvent2);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new PopupTracking(i, popupTrackingEvent, popupTrackingEvent2, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        sma smaVar = sma.a;
        return new xn7[]{t72.F(smaVar), t72.F(smaVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
