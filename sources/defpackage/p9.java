package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p9 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;

    public /* synthetic */ p9(int i, x16 x16Var) {
        this.a = i;
        this.b = x16Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Object dzbVar;
        Object dzbVar2;
        int i = this.a;
        int i2 = 0;
        wef wefVar = wef.a;
        final x16 x16Var = this.b;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    x16Var.invoke();
                }
                return wefVar;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    x16Var.invoke();
                }
                return wefVar;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    x16Var.invoke();
                }
                return wefVar;
            case 3:
                ((g0c) obj).b(((Number) x16Var.invoke()).floatValue());
                return wefVar;
            case 4:
                ((String) obj).getClass();
                x16Var.invoke();
                return wefVar;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    x16Var.invoke();
                } else {
                    jcc.k(0, Integer.valueOf(R.string.camera_permission_denied));
                }
                return wefVar;
            case 6:
                x16Var.invoke();
                return wefVar;
            case 7:
                x16Var.invoke();
                return wefVar;
            case 8:
                ((Boolean) obj).booleanValue();
                x16Var.invoke();
                return wefVar;
            case 9:
                x16Var.invoke();
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj).intValue();
                x16Var.invoke();
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
                tarotSkinIdentify.getClass();
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new ri3(i2, tarotSkinIdentify), 2);
                x16Var.invoke();
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Boolean) obj).booleanValue();
                x16Var.invoke();
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Boolean) obj).booleanValue();
                x16Var.invoke();
                return wefVar;
            case 14:
                x16Var.invoke();
                return wefVar;
            case 15:
                x16Var.invoke();
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                x16Var.invoke();
                return wefVar;
            case 17:
                ((Boolean) obj).booleanValue();
                x16Var.invoke();
                return wefVar;
            case 18:
                ((Boolean) obj).booleanValue();
                x16Var.invoke();
                return wefVar;
            case 19:
                Set set = (Set) obj;
                set.getClass();
                x16Var.getClass();
                bj6 bj6Var = bj6.a;
                uj3 uj3Var = new uj3(1, up9.a, up9.class, "channelSelect", "channelSelect(Ljava/lang/String;)V", 0, 21);
                x16Var.invoke();
                try {
                    bj6Var.d(set);
                    dzbVar = wefVar;
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                Throwable thA = ezb.a(dzbVar);
                if (thA != null) {
                    hf8.Q.getClass();
                    ef8.a("HearFromSubmission").c("Failed to track ".concat("source submission"), thA);
                }
                try {
                    uj3Var.d(s72.D0(set, ",", null, null, cj6.a, 30));
                    dzbVar2 = wefVar;
                } catch (Throwable th2) {
                    dzbVar2 = new dzb(th2);
                }
                Throwable thA2 = ezb.a(dzbVar2);
                if (thA2 != null) {
                    hf8.Q.getClass();
                    ef8.a("HearFromSubmission").c("Failed to track ".concat("onboarding funnel"), thA2);
                }
                return wefVar;
            case 20:
                x16Var.invoke();
                return wefVar;
            case 21:
                x16Var.invoke();
                return wefVar;
            case 22:
                x16Var.invoke();
                return wefVar;
            case 23:
                ((Integer) obj).intValue();
                x16Var.invoke();
                return wefVar;
            case 24:
                Context context = (Context) obj;
                context.getClass();
                final rc rcVar = new rc(context, 1);
                rcVar.setClickable(true);
                rcVar.setLongClickable(true);
                rcVar.setOnLongClickListener(new View.OnLongClickListener() { // from class: doa
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        int i3 = Build.VERSION.SDK_INT;
                        rc rcVar2 = rcVar;
                        if (i3 >= 30) {
                            rcVar2.performHapticFeedback(12);
                        } else {
                            rcVar2.performHapticFeedback(0);
                        }
                        x16Var.invoke();
                        return true;
                    }
                });
                return rcVar;
            case 25:
                hxc hxcVar = (hxc) obj;
                Object objInvoke = x16Var.invoke();
                Float f = (Float) (Float.isNaN(((Number) objInvoke).floatValue()) ? null : objInvoke);
                exc.l(hxcVar, new rwa(f != null ? f.floatValue() : 0.0f, 0, new b62(0.0f, 1.0f)));
                return wefVar;
            case 26:
                hxc hxcVar2 = (hxc) obj;
                Object objInvoke2 = x16Var.invoke();
                Float f2 = (Float) (Float.isNaN(((Number) objInvoke2).floatValue()) ? null : objInvoke2);
                exc.l(hxcVar2, new rwa(f2 != null ? f2.floatValue() : 0.0f, 0, new b62(0.0f, 1.0f)));
                return wefVar;
            case 27:
                ((t7) obj).getClass();
                x16Var.invoke();
                return wefVar;
            case 28:
                ((q8c) obj).getClass();
                return x16Var.invoke();
            default:
                x16Var.invoke();
                return wefVar;
        }
    }
}
