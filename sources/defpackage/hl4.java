package defpackage;

import ai.askquin.ui.draw.navhost.DeckSelectionRoute;
import ai.askquin.ui.draw.navhost.UnifiedDrawingRoute;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.android.core.b1;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hl4 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ hl4(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Object dzbVar;
        int i = this.a;
        int i2 = 5;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.j(1);
                return wefVar;
            case 1:
                return Boolean.TRUE;
            case 2:
                kv2.y((l1f) obj, "btn", "done", "pathway", "cut_the_deck_popup");
                return wefVar;
            case 3:
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                qb9Var.g = job.a.b(UnifiedDrawingRoute.class);
                qb9Var.e = false;
                qb9Var.a(-1);
                qb9Var.e = false;
                qb9Var.f = false;
                return wefVar;
            case 4:
                qb9 qb9Var2 = (qb9) obj;
                qb9Var2.getClass();
                qb9Var2.g = job.a.b(DeckSelectionRoute.class);
                qb9Var2.e = false;
                qb9Var2.a(-1);
                qb9Var2.e = true;
                qb9Var2.f = false;
                return wefVar;
            case 5:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 6:
                kv2.y((l1f) obj, "btn", "shuffle_again", "pathway", "shufflePage");
                return wefVar;
            case 7:
                kv2.y((l1f) obj, "btn", "cut_the_deck_again", "pathway", "cut_the_deck_page");
                return wefVar;
            case 8:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                g0cVar2.n(180.0f);
                return wefVar;
            case 9:
                g0c g0cVar3 = (g0c) obj;
                g0cVar3.getClass();
                g0cVar3.n(0.0f);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((l1f) obj).a("report_start", "btn");
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Integer.valueOf((-((Integer) obj).intValue()) / 3);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Integer.valueOf(((Integer) obj).intValue() / 5);
            case 14:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                str.getClass();
                return Boolean.valueOf(c5e.C(str, "operation.", false));
            case 15:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                Object value = entry2.getValue();
                String str2 = value instanceof String ? (String) value : null;
                if (str2 == null) {
                    return null;
                }
                f95 f95Var = f95.a;
                try {
                    dzbVar = f95.r(new JSONObject(str2));
                    break;
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                return (e95) (dzbVar instanceof dzb ? null : dzbVar);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new ikd(absolutePath);
            case 17:
                mw2 mw2Var = (mw2) obj;
                mw2Var.getClass();
                b1.n("FirebaseSessions", "CorruptionException in session configs DataStore", mw2Var);
                return qfc.c;
            case 18:
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "setTorchIfRequired: torch control completed");
                }
                return wefVar;
            case 19:
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "setExternalFlashAeModeAsync: state3AControl.updateSignal completed");
                }
                return wefVar;
            case 20:
                return wefVar;
            case 21:
                return wefVar;
            case 22:
                return wefVar;
            case 23:
                return wefVar;
            case 24:
                return ub3.g(((Integer) obj).intValue() + 1, ")");
            case 25:
                return ((Character) s72.v0(s72.r0(new gx1('a', 'z'), ((Integer) obj).intValue() % 26))).charValue() + ")";
            case 26:
                c4c c4cVar = (c4c) obj;
                c4cVar.getClass();
                return new es9(new dd2(new p50(i2, c4cVar, new a26[]{new hl4(28), new hl4(29), new hl4(24), new hl4(25)}), true, -373393724));
            case 27:
                c4c c4cVar2 = (c4c) obj;
                c4cVar2.getClass();
                return new lff(new dd2(new w7(19, c4cVar2, new String[]{"•", "◦", "▸", "▹"}), true, 15273025));
            case 28:
                return ub3.g(((Integer) obj).intValue() + 1, ".");
            default:
                return ((Character) s72.v0(s72.r0(new gx1('a', 'z'), ((Integer) obj).intValue() % 26))).charValue() + ".";
        }
    }
}
