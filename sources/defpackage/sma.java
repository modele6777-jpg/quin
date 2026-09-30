package defpackage;

import java.util.Map;
import tech.chatmind.api.events.model.PopupTrackingEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sma implements w56 {
    public static final sma a;
    private static final nyc descriptor;

    static {
        sma smaVar = new sma();
        a = smaVar;
        gia giaVar = new gia("tech.chatmind.api.events.model.PopupTrackingEvent", smaVar, 2);
        giaVar.k("event", false);
        giaVar.k("properties", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PopupTrackingEvent popupTrackingEvent = (PopupTrackingEvent) obj;
        popupTrackingEvent.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PopupTrackingEvent.write$Self$Quin_core_base_api_release(popupTrackingEvent, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = PopupTrackingEvent.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        Map map = null;
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
                map = (Map) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), map);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new PopupTrackingEvent(i, strO, map, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a, PopupTrackingEvent.$childSerializers[1].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
