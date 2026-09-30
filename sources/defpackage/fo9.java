package defpackage;

import ai.askquin.ui.onboard.OnboardNotificationRoute;
import ai.askquin.ui.onboard.OnboardOverviewRoute;
import ai.askquin.ui.web.WebViewActivity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fo9 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ cb9 c;

    public /* synthetic */ fo9(Context context, cb9 cb9Var, int i) {
        this.a = i;
        this.b = context;
        this.c = cb9Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        cb9 cb9Var = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                boolean zK = uyb.k(context);
                y93 y93Var = y93.a;
                boolean z = y93.e() != null;
                boolean z2 = y93.h() != null;
                hs3 hs3Var = xqa.a;
                boolean zBooleanValue = ((Boolean) z5c.I(nu4.a, new no9(hs3Var.a, hs3Var.b, null))).booleanValue();
                ca2.a.getClass();
                if (!ap9.d(zK, z, z2, zBooleanValue, ca2.c)) {
                    ka9.e(cb9Var, new OnboardNotificationRoute(true), null, 6);
                } else {
                    ka9.e(cb9Var, OnboardOverviewRoute.INSTANCE, null, 6);
                }
                break;
            default:
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new zea(26), 2);
                int i2 = WebViewActivity.T0;
                String strD = vd8.d();
                ii4 ii4Var = ii4.a;
                StringBuilder sbO = ib8.o("https://quin.love", ub3.i("/api/activity/entry?position=", ii4Var.a()), "&pagename=", ii4Var.b(), "&lang=");
                sbO.append(strD);
                sbO.append("&ap=android&av=5.23.0");
                pzd.i(context, sbO.toString(), (8 & 4) != 0 ? ozd.a : ozd.b, null);
                cb9Var.g();
                break;
        }
        return wefVar;
    }
}
