package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d59 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ d59(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Throwable {
        String strValueOf;
        switch (this.a) {
            case 0:
                oy9 oy9Var = (oy9) obj;
                return kv2.h(oy9Var.b, oy9Var.c, "[", ", ", ")");
            case 1:
                return Long.valueOf(((guc) obj).a);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i = 0;
                    for (byte b : (byte[]) value) {
                        i++;
                        if (i > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    strValueOf = sb.toString();
                } else {
                    strValueOf = String.valueOf(entry.getValue());
                }
                return ib8.m(new StringBuilder("  "), ((isa) entry.getKey()).a, " = ", strValueOf);
            case 3:
                gy2 gy2Var = (gy2) obj;
                gy2Var.getClass();
                return new ea9(cdc.a(gy2Var));
            case 4:
                return new gs0(cdc.a((gy2) obj));
            case 5:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 6:
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                qb9Var.c = true;
                return wef.a;
            case 7:
                ua9 ua9Var = (ua9) obj;
                ua9Var.getClass();
                ya9 ya9Var = ua9Var.c;
                if (ya9Var == null || ya9Var.f.a != ua9Var.b.b) {
                    return null;
                }
                return ya9Var;
            case 8:
                ua9 ua9Var2 = (ua9) obj;
                ua9Var2.getClass();
                ya9 ya9Var2 = ua9Var2.c;
                if (ya9Var2 == null || ya9Var2.f.a != ua9Var2.b.b) {
                    return null;
                }
                return ya9Var2;
            case 9:
                ua9 ua9Var3 = (ua9) obj;
                ua9Var3.getClass();
                return Integer.valueOf(ua9Var3.b.b);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((gy2) obj).getClass();
                return new na9();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ua9 ua9Var4 = (ua9) obj;
                ua9Var4.getClass();
                return ua9Var4.c;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ua9 ua9Var5 = (ua9) obj;
                ua9Var5.getClass();
                if (!(ua9Var5 instanceof ya9)) {
                    return null;
                }
                r1f r1fVar = ((ya9) ua9Var5).f;
                return r1fVar.k(r1fVar.a);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ua9 ua9Var6 = ((da9) ((my) obj).d()).b;
                ua9Var6.getClass();
                int i2 = ua9.e;
                for (ua9 ua9Var7 : kj0.h0((re2) ua9Var6)) {
                }
                return null;
            case 14:
                return rw4.f(b21.T(700, 0, null, 6), 2);
            case 15:
                return rw4.g(b21.T(700, 0, null, 6), 2);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return ((da9) obj).f;
            case 17:
                qb9 qb9Var2 = (qb9) obj;
                qb9Var2.getClass();
                qb9Var2.b = true;
                return wef.a;
            case 18:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("new_tarot_skins_close", "btn");
                return wef.a;
            case 19:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a("check_NewTarotCard", "btn");
                return wef.a;
            case 20:
                ((l1f) obj).a("new_tarot_skins", "popup");
                return wef.a;
            case 21:
                zv6 zv6Var = ((ff9) obj).a;
                if (zv6Var != null) {
                    zv6Var.invoke();
                }
                return wef.a;
            case 22:
                yf9 yf9Var = (yf9) obj;
                LayoutNode layoutNode = yf9Var.J0;
                try {
                    if (yf9Var.w()) {
                        yf9Var.I1(true);
                        break;
                    }
                    return wef.a;
                } catch (Throwable th) {
                    layoutNode.x0(th);
                    throw null;
                }
            case 23:
                ew9 ew9Var = ((yf9) obj).k1;
                if (ew9Var != null) {
                    ((ne6) ew9Var).c();
                }
                return wef.a;
            case 24:
                ((Long) obj).getClass();
                return wef.a;
            case 25:
                ((wh9) obj).getClass();
                return wef.a;
            case 26:
                kv2.y((l1f) obj, "btn", "setup_later", "pathway", "onboarding_notification_permission");
                return wef.a;
            case 27:
                bl9 bl9Var = (bl9) obj;
                if (bl9Var.w()) {
                    bl9Var.a.A0();
                }
                return wef.a;
            case 28:
                ((ra4) obj).getClass();
                String str = ir5.d;
                ir5.d = "ai.askquin.ui.auth.Login";
                return new o02(str, 1);
            default:
                l1f l1fVar3 = (l1f) obj;
                kv2.y(l1fVar3, "btn", "edit_birthday", "pathway", "onboarding_birthday_select");
                l1fVar3.a("onboarding_age_restriction", "popup");
                return wef.a;
        }
    }
}
