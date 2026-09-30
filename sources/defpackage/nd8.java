package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nd8 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ nd8(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        rq6 rq6Var;
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                gg3 gg3Var = (gg3) obj;
                gg3Var.getClass();
                z7f.u(gg3Var, '.');
                ((v5) gg3Var).b(new ru0(new fx5()));
                return wefVar;
            case 1:
                return Boolean.valueOf(((QuotaUsage) obj).getTestReportCount() > 0);
            case 2:
                eea eeaVar = (eea) obj;
                if (eeaVar.w()) {
                    lg8 lg8Var = eeaVar.b;
                    if (!lg8Var.Z) {
                        a26 a26VarG = eeaVar.a.g();
                        if (eeaVar.a.f() != null) {
                            lg8Var.S0();
                        } else if (a26VarG == null) {
                            lg8Var.v = null;
                            lg8Var.w = null;
                            lg8Var.g = null;
                            lg8Var.S0();
                        } else {
                            lg8Var.v = null;
                            lg8Var.w = null;
                            lg8Var.q0(eeaVar, 9223372034707292159L, 0L);
                            lg8Var.g = a26VarG;
                        }
                    }
                }
                return wefVar;
            case 3:
                eea eeaVar2 = (eea) obj;
                if (eeaVar2.w() && (rq6Var = eeaVar2.c) != null) {
                    lg8 lg8Var2 = eeaVar2.b;
                    w79 w79Var = lg8Var2.G0;
                    x79 x79Var = w79Var != null ? (x79) w79Var.g(rq6Var) : null;
                    if (x79Var != null) {
                        a80 a80Var = lg8Var2.F0;
                        if (a80Var != null) {
                            a80Var.A(rq6Var);
                        }
                        lg8Var2.P0(x79Var);
                        x79Var.f();
                    }
                }
                return wefVar;
            case 4:
                ((LayoutNode) obj).v = true;
                return wefVar;
            case 5:
                ((Long) obj).getClass();
                return wefVar;
            case 6:
                Context context = (Context) obj;
                context.getClass();
                TextView textView = new TextView(context);
                textView.setText(R.string.main_privacy_content);
                x57.f0(textView);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return textView;
            case 7:
                Context context2 = (Context) obj;
                context2.getClass();
                TextView textView2 = new TextView(context2);
                textView2.setText(R.string.main_privacy_consent_check);
                textView2.setTextSize(11.0f);
                x57.f0(textView2);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                return textView2;
            case 8:
                Context context3 = (Context) obj;
                context3.getClass();
                TextView textView3 = new TextView(context3);
                textView3.setText(R.string.main_privacy_dialog_message);
                x57.f0(textView3);
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
                return textView3;
            case 9:
                im2 im2Var = (im2) obj;
                im2Var.getClass();
                vv7 vv7Var = (vv7) im2Var;
                vv7Var.a();
                Float fValueOf = Float.valueOf(0.0f);
                long j = y72.b;
                sn4.O0(im2Var, gec.O(new iy9[]{new iy9(fValueOf, new y72(j)), new iy9(Float.valueOf(0.68f), new y72(j)), new iy9(Float.valueOf(1.0f), new y72(y72.j))}, 0.0f, Float.intBitsToFloat((int) (4294967295L & vv7Var.a.f())), 8), 0L, 0L, 0.0f, null, null, 6, 62);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.j(1);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                sw3 sw3Var = (sw3) obj;
                sw3Var.getClass();
                return new e77((((long) sw3Var.D0(128.0f)) & 4294967295L) | (((long) sw3Var.D0(128.0f)) << 32));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((c4c) obj).getClass();
                return new es9(new dd2(new wt(6, new a26[]{new nd8(13), new nd8(14), new nd8(15), new nd8(16)}), true, 56369481));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return ub3.g(((Integer) obj).intValue() + 1, ".");
            case 14:
                return ((Character) s72.v0(s72.r0(new gx1('a', 'z'), ((Integer) obj).intValue() % 26))).charValue() + ".";
            case 15:
                return ub3.g(((Integer) obj).intValue() + 1, ")");
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return ((Character) s72.v0(s72.r0(new gx1('a', 'z'), ((Integer) obj).intValue() % 26))).charValue() + ")";
            case 17:
                ((l1f) obj).a("activity_popup", "popup");
                return wefVar;
            case 18:
                kv2.y((l1f) obj, "btn", "close", "pathway", "may_day_free_deck");
                return wefVar;
            case 19:
                kv2.y((l1f) obj, "btn", "go_reading", "pathway", "may_day_free_deck");
                return wefVar;
            case 20:
                ((l1f) obj).a("may_day_free_deck", "popup");
                return wefVar;
            case 21:
                lif lifVar = (lif) obj;
                lifVar.getClass();
                return lifVar.a();
            case 22:
                UsageBillingBalance usageBillingBalance = (UsageBillingBalance) obj;
                usageBillingBalance.getClass();
                return usageBillingBalance.getSource();
            case 23:
                return Boolean.TRUE;
            case 24:
                exc.p((hxc) obj);
                return wefVar;
            case 25:
                wn7[] wn7VarArr = exc.a;
                ((hxc) obj).c(cxc.y, wefVar);
                return wefVar;
            case 26:
                kv2.y((l1f) obj, "btn", "YR2026_monthly_viewSummary", "pathway", "YR2026_monthly_details");
                return wefVar;
            case 27:
                kv2.y((l1f) obj, "btn", "YR2026_monthly_viewDetails", "pathway", "YR2026_monthly_overview");
                return wefVar;
            case 28:
                kv2.y((l1f) obj, "btn", "YR2026_monthly_startShuffle", "pathway", "YR2026_monthly_spreadPreview");
                return wefVar;
            default:
                ((ued) obj).getClass();
                return Boolean.FALSE;
        }
    }
}
