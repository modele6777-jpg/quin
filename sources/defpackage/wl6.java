package defpackage;

import ai.askquin.R;
import ai.askquin.ui.draw.photo.homepage.PhysicalDeckCameraRoute;
import ai.askquin.ui.quickdecision.QuickDecisionDetailRoute;
import ai.askquin.ui.router.AppRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wl6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q7b b;

    public /* synthetic */ wl6(q7b q7bVar, int i) {
        this.a = i;
        this.b = q7bVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        q7b q7bVar = this.b;
        switch (i) {
            case 0:
                zb4 zb4Var = (zb4) obj;
                zb4Var.getClass();
                jr2 jr2Var = q7bVar.b;
                jr2Var.b.h(zb4Var.i);
                ka9.e(jr2Var.a, AppRoute.Conversation.INSTANCE, cn1.I(new cz1(18)), 4);
                break;
            case 1:
                ac4 ac4Var = (ac4) obj;
                ac4Var.getClass();
                ka9.e(q7bVar.a, new QuickDecisionDetailRoute(ac4Var.a, "chat_history"), null, 6);
                break;
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    jcc.k(0, Integer.valueOf(R.string.camera_permission_denied));
                } else {
                    ka9.e(q7bVar.a, PhysicalDeckCameraRoute.INSTANCE, null, 6);
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                jr2 jr2Var2 = q7bVar.b;
                jr2Var2.getClass();
                dc9 dc9Var = jr2Var2.b;
                dc9Var.getClass();
                dc9Var.c.setValue(str);
                dc9Var.d = "card_of_day";
                dc9Var.h(null);
                jr2Var2.b();
                break;
        }
        return wefVar;
    }
}
