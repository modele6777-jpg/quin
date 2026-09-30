package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.events.model.Background;
import tech.chatmind.api.events.model.Icon;
import tech.chatmind.api.events.model.Popup;
import tech.chatmind.api.events.model.PopupTracking;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sja implements w56 {
    public static final sja a;
    private static final nyc descriptor;

    static {
        sja sjaVar = new sja();
        a = sjaVar;
        gia giaVar = new gia("tech.chatmind.api.events.model.Popup", sjaVar, 9);
        giaVar.k("actions", false);
        giaVar.k("background", false);
        giaVar.k("canClose", false);
        giaVar.k("desc", false);
        giaVar.k("icon", false);
        giaVar.k("title", false);
        giaVar.k("iconSize", true);
        giaVar.k("prompt", true);
        giaVar.k("tracking", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        Popup popup = (Popup) obj;
        popup.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        Popup.write$Self$Quin_core_base_api_release(popup, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = Popup.$childSerializers;
        PopupTracking popupTracking = null;
        boolean z = true;
        String str = null;
        int i = 0;
        List list = null;
        Background background = null;
        boolean z2 = false;
        String strO = null;
        Icon icon = null;
        String strO2 = null;
        List list2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    background = (Background) zf2VarC.s(nycVar, 1, ls0.a, background);
                    i |= 2;
                    break;
                case 2:
                    z2 = zf2VarC.z(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    strO = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    icon = (Icon) zf2VarC.s(nycVar, 4, au6.a, icon);
                    i |= 16;
                    break;
                case 5:
                    strO2 = zf2VarC.o(nycVar, 5);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) zf2VarC.y(nycVar, 6, (xn7) lw7VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    str = (String) zf2VarC.y(nycVar, 7, p4e.a, str);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                case 8:
                    popupTracking = (PopupTracking) zf2VarC.y(nycVar, 8, qma.a, popupTracking);
                    i |= 256;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new Popup(i, list, background, z2, strO, icon, strO2, list2, str, popupTracking, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = Popup.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{lw7VarArr[0].getValue(), ls0.a, g11.a, p4eVar, au6.a, p4eVar, t72.F((xn7) lw7VarArr[6].getValue()), t72.F(p4eVar), t72.F(qma.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
