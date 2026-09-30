package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidComposeView;
import coil3.compose.AsyncImagePainter$State$Error;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z4 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ z4(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        int i2 = 2;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                xia xiaVar = (xia) obj;
                boolean z = false;
                if (xiaVar != null && xiaVar.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 1:
                return wefVar;
            case 2:
                return wefVar;
            case 3:
                ((t7) obj).getClass();
                return wefVar;
            case 4:
                kv2.y((l1f) obj, "btn", "auto_renew", "pathway", "account");
                return wefVar;
            case 5:
                ((Boolean) obj).getClass();
                return wefVar;
            case 6:
                kv2.y((l1f) obj, "btn", "usage_info_close", "pathway", "usage_info_popup");
                return wefVar;
            case 7:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("usage_info_popup", "pathway");
                return wefVar;
            case 8:
                kv2.y((l1f) obj, "btn", "usage_info", "pathway", "account_page");
                return wefVar;
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey() + "→" + entry.getValue();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                q22 q22Var = (q22) obj;
                q22Var.getClass();
                q22Var.a("spreads", (zc0) ji.b.c, (12 & 8) == 0);
                q22Var.a("suggestedSpreadIndex", c77.b, true);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                yj yjVar = (yj) obj;
                yjVar.getClass();
                if (!yjVar.v) {
                    yjVar.v = true;
                    h48 h48Var = yjVar.g;
                    if (h48Var != null) {
                        h48Var.b(yjVar.y);
                    }
                    yjVar.g = null;
                    yjVar.b = null;
                    yjVar.c = null;
                    yjVar.f.post(new j1(i2, yjVar));
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Boolean) obj).getClass();
                return wefVar;
            case 14:
                t09 t09Var = (t09) obj;
                t09Var.getClass();
                o4e o4eVar = new o4e("mixpanel");
                ai aiVar = new ai(8);
                o4e o4eVar2 = szc.v;
                kob kobVar = job.a;
                em7 em7VarB = kobVar.b(o05.class);
                lp7 lp7Var = lp7.b;
                t09Var.a(new w95(new yw0(o4eVar2, em7VarB, o4eVar, aiVar, lp7Var)));
                t09Var.a(new w95(new yw0(o4eVar2, kobVar.b(o05.class), new o4e("firebase"), new ai(9), lp7Var)));
                return wefVar;
            case 15:
                AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) obj;
                asyncImagePainter$State$Error.getClass();
                hf8.Q.getClass();
                ef8.a("Quin").b("Error loading image: " + asyncImagePainter$State$Error);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 17:
                return Boolean.TRUE;
            case 18:
                return Boolean.TRUE;
            case 19:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 20:
                Class cls = AndroidComposeView.X1;
                return Boolean.TRUE;
            case 21:
                return Boolean.valueOf(gdc.g((ywc) obj));
            case 22:
                return (gga) obj;
            case 23:
                tg2 tg2Var = (tg2) obj;
                tg2Var.s0(uq.a);
                return ((Context) tg2Var.s0(uq.b)).getResources();
            case 24:
                return Boolean.valueOf(gdc.g((ywc) obj));
            case 25:
                wn7[] wn7VarArr = exc.a;
                ((hxc) obj).c(cxc.y, wefVar);
                return wefVar;
            case 26:
                ((Long) obj).getClass();
                return wefVar;
            case 27:
                wn7[] wn7VarArr2 = exc.a;
                ((hxc) obj).c(cxc.x, wefVar);
                return wefVar;
            case 28:
                ((Long) obj).getClass();
                return wefVar;
            default:
                return wefVar;
        }
    }
}
