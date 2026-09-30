package defpackage;

import ai.askquin.R;
import android.app.Activity;
import android.content.ClipboardManager;
import android.hardware.SensorManager;
import android.view.ActionMode;
import android.view.View;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lf implements qa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qa4
    public final void a() {
        lyd lydVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                jf jfVar = ((ef) obj).a;
                if (jfVar != null) {
                    jfVar.L();
                    return;
                } else {
                    qc0.p("Launcher has not been initialized");
                    return;
                }
            case 1:
                u84 u84Var = (u84) obj;
                u84Var.dismiss();
                u84Var.v.e();
                return;
            case 2:
                ila ilaVar = (ila) obj;
                ilaVar.e();
                ilaVar.setTag(R.id.view_tree_lifecycle_owner, null);
                ilaVar.H0.removeViewImmediate(ilaVar);
                return;
            case 3:
                rv rvVar = (rv) obj;
                nsd nsdVar = rvVar.e;
                hrd hrdVar = nsdVar.h;
                if (hrdVar != null) {
                    hrdVar.a();
                }
                nsdVar.a();
                ActionMode actionMode = rvVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                rvVar.h = null;
                return;
            case 4:
                if (((e89) obj).getValue() == null) {
                    return;
                }
                r3.f();
                return;
            case 5:
                cv0 cv0Var = (cv0) ((ev0) obj).c.getValue();
                if (cv0Var != null) {
                    cv0Var.close();
                    return;
                }
                return;
            case 6:
                jse jseVar = (jse) obj;
                lne lneVar = jseVar.d.a;
                if (lneVar != null && (lydVar = lneVar.J0) != null) {
                    lydVar.h(null);
                    lneVar.J0 = null;
                }
                jseVar.j = null;
                return;
            case 7:
                pl1 pl1Var = ((h0f) ((d0f) obj)).c;
                if (pl1Var != null) {
                    pl1Var.p(null);
                    return;
                }
                return;
            case 8:
                ls9 ls9Var = (ls9) obj;
                SensorManager sensorManager = ls9Var.a;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(ls9Var);
                    return;
                }
                return;
            case 9:
                ((xae) obj).b.c(null);
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Activity activity = (Activity) obj;
                if (activity != null) {
                    activity.setRequestedOrientation(-1);
                    return;
                }
                return;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((cre) obj).m();
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                a85 a85Var = (a85) obj;
                View view = a85Var.b;
                if (a85Var.a) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(a85Var);
                    a85Var.a = false;
                }
                view.removeOnAttachStateChangeListener(a85Var);
                return;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                tce.a().removePrimaryClipChangedListener((ClipboardManager.OnPrimaryClipChangedListener) obj);
                return;
            case 14:
                ((pz7) obj).d = null;
                return;
            case 15:
                e08 e08Var = (e08) obj;
                zi0 zi0Var = e08Var.c;
                if (zi0Var != null) {
                    zi0Var.a = false;
                }
                e08Var.c = null;
                return;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((g6d) obj).b();
                return;
            case 17:
                fz8 fz8Var = (fz8) obj;
                fz8Var.dismiss();
                fz8Var.w.e();
                return;
            case 18:
                ((i0g) obj).a(null);
                return;
            case 19:
                ((bjc) obj).a.a();
                return;
            case 20:
                fwc fwcVar = (fwc) obj;
                fwcVar.m();
                fwcVar.w.setValue(Boolean.FALSE);
                return;
            case 21:
                dg7 dg7Var = ((dg7[]) obj)[0];
                if (dg7Var != null) {
                    dg7Var.h(null);
                    return;
                }
                return;
            case 22:
                Object obj2 = ((mmb) obj).element;
                if (obj2 != null) {
                    jgb.I(((bad) obj2).j, null);
                    return;
                } else {
                    pa7.g0("controller");
                    throw null;
                }
            case 23:
                c85 c85Var = (c85) obj;
                if (c85Var.f) {
                    return;
                }
                c85Var.f = true;
                if (c85Var.b) {
                    c85Var.a.b(c85Var);
                }
                c85Var.d.invoke();
                return;
            case 24:
                ((ltc) ((s3f) obj)).n(null);
                return;
            case 25:
                n3f n3fVar = (n3f) obj;
                n3fVar.j();
                n3fVar.a.e();
                return;
            case 26:
                p3f p3fVar = (p3f) obj;
                p3fVar.j();
                p3fVar.a.e();
                return;
            default:
                ((bp3) ((o8b) obj)).i();
                return;
        }
    }
}
