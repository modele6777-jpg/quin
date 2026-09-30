package defpackage;

import ai.askquin.ui.conversation.r0;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.CursorAnchorInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.ZoneId;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.ShareSummaryContent;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ts implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ts(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0216  */
    /* JADX WARN: Code duplicated, block: B:110:0x0240  */
    /* JADX WARN: Instruction removed from duplicated block: B:109:0x0216, please report this as an issue */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        Object objA;
        Object value;
        Object objK;
        Object objG;
        o7c j8gVar;
        switch (this.a) {
            case 0:
                k47 k47Var = (k47) ((j47) this.b);
                if (Build.VERSION.SDK_INT >= 34) {
                    q6.O(k47Var.C(), (View) k47Var.b);
                } else {
                    k47Var.getClass();
                }
                return wef.a;
            case 1:
                ((ne2) this.b).j();
                return wef.a;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                i60 i60Var = (i60) this.b;
                return (!zBooleanValue || v4e.Q(((mo3) i60Var.b).a())) ? wef.a : i60Var.b(((mo3) i60Var.b).a(), xn2Var);
            case 3:
                vj1 vj1Var = (vj1) obj;
                rc1 rc1Var = (rc1) this.b;
                wef wefVar = wef.a;
                if (vj1Var instanceof rj1) {
                    rc1Var.f.a(vj1Var, xn2Var);
                    return wefVar;
                }
                if (!(vj1Var instanceof tj1)) {
                    return ((vj1Var instanceof sj1) && (objA = rc1Var.v.a(wefVar, xn2Var)) == bw2.a) ? objA : wefVar;
                }
                rc1Var.f.a(vj1Var, xn2Var);
                return wefVar;
            case 4:
                ((qz9) ((n69) this.b)).k(((Number) obj).floatValue());
                return wef.a;
            case 5:
                a90 a90Var = (a90) ((c13) this.b).c;
                a90Var.S().updateCursorAnchorInfo((View) a90Var.b, (CursorAnchorInfo) obj);
                return wef.a;
            case 6:
                Map map = (Map) obj;
                ((y63) this.b).I0 = map;
                s0e s0eVar = ((y63) this.b).x;
                do {
                    value = s0eVar.getValue();
                    objK = (e63) value;
                    d63 d63Var = objK instanceof d63 ? (d63) objK : null;
                    if (d63Var != null) {
                        objK = y63.k(d63Var, map);
                    }
                } while (!s0eVar.l(value, objK));
                return wef.a;
            case 7:
                wef wefVar2 = wef.a;
                od3 od3Var = (od3) this.b;
                return ((od3Var.h.F() instanceof we5) || (objG = od3Var.g(true, xn2Var)) != bw2.a) ? wefVar2 : objG;
            case 8:
                yof yofVar = (yof) obj;
                r0 r0Var = (r0) this.b;
                if (r0Var.H() == null) {
                    r0Var.C1 = yofVar.g.name();
                }
                return wef.a;
            case 9:
                List list = (List) obj;
                rcf rcfVar = (rcf) this.b;
                if (list != null && list.size() == rcfVar.i().size()) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String desc = ((PatternData) it.next()).getDesc();
                            if (desc == null || desc.length() == 0) {
                            }
                        }
                        if (list.size() != rcfVar.i().size()) {
                            rcfVar.d().b("updatePatterns size mismatch old=" + rcfVar.i().size() + " new=" + list.size());
                        } else {
                            rcfVar.e.setValue(list);
                        }
                    } else if (list.size() != rcfVar.i().size()) {
                        rcfVar.d().b("updatePatterns size mismatch old=" + rcfVar.i().size() + " new=" + list.size());
                    } else {
                        rcfVar.e.setValue(list);
                    }
                }
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return ((zva) ((awa) this.b)).e.a(xn2Var, (List) obj);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (((Boolean) obj).booleanValue()) {
                    qv5 qv5Var = qv5.a;
                    qv5.i((Context) this.b, null, 6);
                }
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (((g48) obj).compareTo(g48.c) <= 0) {
                    gi6 gi6Var = (gi6) this.b;
                    sh6 sh6Var = gi6Var.Z;
                    sh6Var.getClass();
                    ke6 ke6VarA = sh6Var.a();
                    if (ke6VarA != null) {
                        ((ie6) eb3.H(gi6Var, zg2.g)).a(ke6VarA);
                    }
                    sh6Var.f.setValue(null);
                }
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (((l77) obj) instanceof al4) {
                    e89 e89Var = (e89) this.b;
                    int i = al6.a;
                    e89Var.setValue(Boolean.TRUE);
                }
                return wef.a;
            case 14:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Activity activity = (Activity) this.b;
                if (activity != null) {
                    Window window = activity.getWindow();
                    activity.getWindow().getDecorView();
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 35) {
                        j8gVar = new l8g(window);
                    } else {
                        j8gVar = i2 >= 30 ? new j8g(window) : new i8g(window);
                    }
                    j8gVar.B(!zBooleanValue2);
                }
                return wef.a;
            case 15:
                kq6 kq6Var = (kq6) this.b;
                kq6Var.J0 = (String) obj;
                kq6Var.k();
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                g87 g87Var = (g87) this.b;
                g87Var.V0.setValue(c87.a(g87Var.Q(), null, null, null, zBooleanValue3, false, 47));
                return wef.a;
            case 17:
                ((l39) this.b).c.k(((Number) obj).floatValue());
                return wef.a;
            case 18:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                ru9 ru9Var = (ru9) this.b;
                if (zBooleanValue4 && !ru9Var.a()) {
                    ru9Var.a.setValue(Boolean.TRUE);
                }
                return wef.a;
            case 19:
                mma mmaVar = (mma) this.b;
                ZoneId zoneId = mma.u1;
                return mmaVar.K(xn2Var);
            case 20:
                QuotaUsage quotaUsage = (QuotaUsage) obj;
                if (((eab) this.b).b == null) {
                    ((eab) this.b).a.setValue(quotaUsage);
                }
                return wef.a;
            case 21:
                p3c p3cVar = (p3c) this.b;
                p3cVar.K0 = ((yof) obj).m;
                int iOrdinal = p3cVar.i().ordinal();
                if (iOrdinal == 0) {
                    p3cVar.k(null);
                    p3cVar.h();
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        ap.c();
                        return null;
                    }
                    p3cVar.k(null);
                    p3cVar.h();
                } else {
                    p3cVar.p();
                }
                return wef.a;
            case 22:
                lbd lbdVar = (lbd) this.b;
                int i3 = lbd.w;
                lbdVar.g.setValue((ShareSummaryContent) obj);
                lbdVar.v.setValue(abd.c);
                return wef.a;
            case 23:
                j0d j0dVar = (j0d) obj;
                ldd lddVar = (ldd) this.b;
                lddVar.getClass();
                j0dVar.getClass();
                lddVar.h = j0dVar;
                if (lddVar.j) {
                    lddVar.j = false;
                    lddVar.b();
                }
                Object objE = lddVar.e(j0dVar.a.a, fdd.a, xn2Var);
                return objE == bw2.a ? objE : wef.a;
            case 24:
                ((ape) this.b).Y0.setValue(Boolean.FALSE);
                return wef.a;
            default:
                yi1 yi1Var = (yi1) obj;
                eyf eyfVar = (eyf) this.b;
                synchronized (eyfVar.e) {
                    try {
                        if (yi1Var instanceof dj1) {
                            wxf wxfVar = new wxf((fp) ((dj1) yi1Var).a);
                            eyfVar.g = wxfVar;
                            eyfVar.b(new dj1(wxfVar));
                        } else {
                            eyfVar.b(yi1Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return wef.a;
        }
    }
}
