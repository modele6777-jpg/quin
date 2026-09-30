package defpackage;

import tech.chatmind.api.events.model.Background;
import tech.chatmind.api.events.model.EventInfo;
import tech.chatmind.api.events.model.Popup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j25 implements xj5 {
    public final /* synthetic */ xj5 a;

    public j25(xj5 xj5Var, m25 m25Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        i25 i25Var;
        o19 o19Var;
        if (xn2Var instanceof i25) {
            i25Var = (i25) xn2Var;
            int i = i25Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                i25Var.label = i - Integer.MIN_VALUE;
            } else {
                i25Var = new i25(this, xn2Var);
            }
        } else {
            i25Var = new i25(this, xn2Var);
        }
        Object obj2 = i25Var.result;
        int i2 = i25Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            EventInfo eventInfo = (EventInfo) obj;
            if (eventInfo != null) {
                int i3 = m25.g;
                boolean zB = li4.b(cn1.z());
                Popup popup = eventInfo.getPopup();
                popup.getClass();
                String id = eventInfo.getId();
                Background background = popup.getBackground();
                o19Var = new o19(id, eventInfo, new q19(zB ? background.getDark() : background.getLight(), zB ? popup.getIcon().getDark() : popup.getIcon().getLight(), popup.getTitle(), popup.getActions(), popup.getDesc()));
            } else {
                o19Var = null;
            }
            i25Var.L$0 = null;
            i25Var.L$1 = null;
            i25Var.L$2 = null;
            i25Var.L$3 = null;
            i25Var.label = 1;
            Object objA = this.a.a(o19Var, i25Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
