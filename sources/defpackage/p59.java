package defpackage;

import android.view.MotionEvent;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p59 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p59(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                qn2 qn2Var = (qn2) this.b;
                File file = (File) obj;
                file.getClass();
                return new o59(qn2Var.a, file);
            case 1:
                ((f99) this.b).h(null);
                return wef.a;
            case 2:
                fc9 fc9Var = (fc9) this.b;
                da9 da9Var = (da9) obj;
                da9Var.getClass();
                fa9 fa9Var = da9Var.v;
                ua9 ua9Var = da9Var.b;
                if (ua9Var == null) {
                    ua9Var = null;
                }
                if (ua9Var == null) {
                    return null;
                }
                fa9Var.a();
                ua9 ua9VarC = fc9Var.c(ua9Var);
                if (ua9VarC == null) {
                    return null;
                }
                return ua9VarC.equals(ua9Var) ? da9Var : fc9Var.b().b(ua9VarC, ua9VarC.c(fa9Var.a()));
            case 3:
                return Boolean.valueOf(((mc9) obj).b == ((g49) this.b));
            case 4:
                ((i79) this.b).h((h09) obj);
                return Boolean.TRUE;
            case 5:
                t6a t6aVar = (t6a) this.b;
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("notification_allow_confirm", "btn");
                l1fVar.a(t6aVar.c.a, "pathway");
                return wef.a;
            case 6:
                e83 e83Var = (e83) this.b;
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "btn", "onboarding_notification_allow", "pathway", "onboarding_notification_permission");
                boolean z = e83Var.a;
                boolean z2 = e83Var.b;
                l1fVar2.a((z && z2) ? "both" : z2 ? "tomorrow" : "today", "selected_reminder_type");
                return wef.a;
            case 7:
                ak9 ak9Var = (ak9) this.b;
                q22 q22Var = (q22) obj;
                q22Var.getClass();
                hua huaVar = g11.b;
                q22Var.a("login", huaVar, true);
                q22Var.a("success", huaVar, true);
                q22Var.a("error", huaVar, true);
                q22Var.a("errorCode", c77.b, true);
                q22Var.a("errorMessage", p4e.b, true);
                q22Var.a("data", ak9Var.a.e(), (12 & 8) == 0);
                return wef.a;
            case 8:
                wn2 wn2Var = (wn2) this.b;
                q22 q22Var2 = (q22) obj;
                q22Var2.getClass();
                List list = (List) wn2Var.c;
                list.getClass();
                q22Var2.b = list;
                return wef.a;
            case 9:
                for (wr9 wr9Var : ((xr9) this.b).c) {
                    wr9Var.a.e(obj, wr9Var.b);
                }
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                cy9 cy9Var = (cy9) this.b;
                float fFloatValue = ((Float) obj).floatValue();
                yx9 yx9Var = cy9Var.b;
                yx9Var.q.k(yx9Var.j(((sz9) yx9Var.d.c).j() + ym8.L(yx9Var.n() != 0 ? fFloatValue / yx9Var.n() : 0.0f)));
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                o3a o3aVar = (o3a) this.b;
                wef wefVar = wef.a;
                ((t7) obj).getClass();
                z6e z6eVar = (z6e) o3aVar.R0.getValue();
                if (z6eVar != null) {
                    o3aVar.H(z6eVar, ((mo3) o3aVar.P0).a());
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                y3a y3aVar = (y3a) this.b;
                ((t7) obj).getClass();
                ((rab) y3aVar.Q0).f();
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                k00 k00Var = (k00) this.b;
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                exc.f(hxcVar, k00Var.b);
                return wef.a;
            case 14:
                nyc nycVar = (nyc) this.b;
                int iIntValue = ((Integer) obj).intValue();
                return nycVar.f(iIntValue) + ": " + nycVar.i(iIntValue).a();
            case 15:
                ((uw) ((via) this.b).a()).d((MotionEvent) obj);
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                aja ajaVar = (aja) this.b;
                q22 q22Var3 = (q22) obj;
                q22Var3.getClass();
                q22Var3.a("type", p4e.b, (12 & 8) == 0);
                q22Var3.a("value", eec.q("kotlinx.serialization.Polymorphic<" + ajaVar.a.r() + '>', qyc.c, new nyc[0]), (12 & 8) == 0);
                List list2 = ajaVar.b;
                list2.getClass();
                q22Var3.b = list2;
                return wef.a;
            case 17:
                uma umaVar = (uma) this.b;
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                l1fVar3.a(umaVar.a, "value");
                return wef.a;
            case 18:
                ((tva) this.b).e.addLast(obj);
                return wef.a;
            case 19:
                za2 za2Var = (za2) this.b;
                wef wefVar2 = wef.a;
                za2Var.R(wefVar2);
                return wefVar2;
            case 20:
                za2 za2Var2 = ((ktb) this.b).b;
                wef wefVar3 = wef.a;
                za2Var2.R(wefVar3);
                return wefVar3;
            case 21:
                z1b z1bVar = (z1b) this.b;
                id idVar = (id) obj;
                idVar.getClass();
                z1bVar.e.e.d(new itb(idVar));
                return wef.a;
            case 22:
                ((f2b) this.b).f.addLast(obj);
                return wef.a;
            case 23:
                cxe cxeVar = (cxe) this.b;
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                cxeVar.a[0] = bv7Var;
                return wef.a;
            case 24:
                wfb wfbVar = (wfb) this.b;
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.getClass();
                fl8 fl8Var = new fl8();
                fl8Var.put("entry_source", wfbVar.a);
                String str = wfbVar.b;
                if (str != null) {
                    fl8Var.put("reading_scene", str);
                }
                String str2 = wfbVar.c;
                if (str2 != null) {
                    fl8Var.put("fortune_type", str2);
                }
                fl8Var.put("question_edited", Boolean.valueOf(wfbVar.d));
                fl8Var.put("question_info_added", Boolean.valueOf(wfbVar.e));
                jhb jhbVar = wfbVar.f;
                if (jhbVar != null) {
                    fl8Var.put("spread_tier", jhbVar.a);
                    Boolean bool = jhbVar.b;
                    if (bool != null) {
                        fl8Var.put("spread_is_default", bool);
                    }
                    String str3 = jhbVar.c;
                    if (str3 != null) {
                        fl8Var.put("spread_first_recommended_tier", str3);
                    }
                    String str4 = jhbVar.d;
                    if (str4 != null) {
                        fl8Var.put("spread_suggested_tier", str4);
                    }
                }
                fl8Var.put("deck_id", wfbVar.g);
                fl8Var.put("shuffle_count", Integer.valueOf(wfbVar.h));
                fl8Var.put("cut_count", Integer.valueOf(wfbVar.i));
                fl8Var.put("draw_count", Integer.valueOf(wfbVar.j));
                fl8Var.put("credits_consumed", Integer.valueOf(wfbVar.m));
                fl8Var.put("extra_info_added", Boolean.valueOf(wfbVar.k));
                fl8Var.put("exit_step", wfbVar.l);
                fl8Var.j().forEach(new al(new gl(2, l1fVar4, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 29), 10));
                return wef.a;
            case 25:
                cgb cgbVar = (cgb) this.b;
                l1f l1fVar5 = (l1f) obj;
                kv2.y(l1fVar5, "popup", "reading_locked", "pathway", "reading_locked");
                l1fVar5.a(cgbVar.b, "triggered_by");
                l1fVar5.a(cgbVar.c.getAnalyticsValue(), "blocked_reason");
                String str5 = cgbVar.d;
                if (str5 != null) {
                    l1fVar5.a(str5, "entry_source");
                }
                return wef.a;
            case 26:
                p05 p05Var = p05.a;
                khb khbVar = (khb) this.b;
                qhb qhbVar = (qhb) obj;
                qhbVar.getClass();
                int iOrdinal = qhbVar.ordinal();
                int i = 29;
                if (iOrdinal == 0) {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05Var, new bt5("copy_all", i), 2);
                } else if (iOrdinal == 1) {
                    x1f x1fVar2 = x1f.a;
                    x1f.k(p05Var, new bt5("select_text", i), 2);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        ap.c();
                        return null;
                    }
                    khbVar.d.invoke();
                } else if (khbVar.b) {
                    khbVar.c.invoke();
                }
                return wef.a;
            case 27:
                urg.t((djb) this.b, (fj4) obj);
                return wef.a;
            case 28:
                ((rg2) this.b).e(obj);
                return wef.a;
            default:
                xjb xjbVar = (xjb) this.b;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (xjbVar.c) {
                    try {
                        dg7 dg7Var = xjbVar.d;
                        if (dg7Var != null) {
                            s0e s0eVar = xjbVar.u;
                            sjb sjbVar = sjb.b;
                            s0eVar.getClass();
                            s0eVar.n(null, sjbVar);
                            dg7Var.h(cancellationException);
                            xjbVar.r = null;
                            dg7Var.E(new h6b(8, xjbVar, th));
                        } else {
                            xjbVar.e = cancellationException;
                            s0e s0eVar2 = xjbVar.u;
                            sjb sjbVar2 = sjb.a;
                            s0eVar2.getClass();
                            s0eVar2.n(null, sjbVar2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return wef.a;
        }
    }

    public /* synthetic */ p59(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }
}
