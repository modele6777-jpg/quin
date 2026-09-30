package defpackage;

import ai.askquin.ui.conversation.r0;
import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hl extends h36 implements x16 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        ContentCaptureSession contentCaptureSessionB;
        Object value;
        wg1 wg1Var;
        Object value2;
        Object value3;
        boolean z = true;
        switch (this.a) {
            case 0:
                ((r0) this.receiver).J1(null);
                return wef.a;
            case 1:
                View view = (View) this.receiver;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    p6.q(view);
                }
                if (i < 29 || (contentCaptureSessionB = ovf.b(view)) == null) {
                    return null;
                }
                return new cm2(contentCaptureSessionB, view);
            case 2:
                ((Runnable) this.receiver).run();
                return wef.a;
            case 3:
                ((rcf) this.receiver).m();
                return wef.a;
            case 4:
                ((rcf) this.receiver).v.setValue(tn4.c);
                return wef.a;
            case 5:
                ((w10) this.receiver).p(null);
                return wef.a;
            case 6:
                l93 l93Var = (l93) this.receiver;
                b73 b73Var = l93.b;
                l93Var.getClass();
                l93.a(b73Var, "Failed to deliver app_install");
                l93.a(l93.c, "Failed to deliver app_open");
                l93.a(l93.d, "Failed to deliver Firebase app_open");
                return wef.a;
            case 7:
                ((oy0) this.receiver).e.setValue(Boolean.FALSE);
                return wef.a;
            case 8:
                gy0 gy0Var = (gy0) this.receiver;
                jy0 jy0VarA = jy0.a((jy0) gy0Var.c.getValue(), false);
                n3d.g(jy0VarA.a);
                gy0Var.c.setValue(jy0VarA);
                return wef.a;
            case 9:
                pi1 pi1Var = (pi1) this.receiver;
                s0e s0eVar = pi1Var.v;
                i48 i48Var = pi1Var.F0;
                if (i48Var != null) {
                    kg1 kg1VarB = i48Var.b();
                    kg1VarB.getClass();
                    uf ufVar = i48Var.c.a.c;
                    if (((vf) kg1VarB).b.r()) {
                        boolean z2 = !((Boolean) s0eVar.getValue()).booleanValue();
                        ufVar.g(z2);
                        do {
                            value = s0eVar.getValue();
                            ((Boolean) value).getClass();
                        } while (!s0eVar.l(value, Boolean.valueOf(z2)));
                    }
                }
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                wg1 wg1Var2 = wg1.b;
                pi1 pi1Var2 = (pi1) this.receiver;
                s0e s0eVar2 = pi1Var2.x;
                x48 x48Var = pi1Var2.G0;
                if (x48Var != null && (wg1Var = (wg1) s72.x0(n16.u(!((Boolean) s0eVar2.getValue()).booleanValue(), pi1Var2.H0, pi1Var2.I0))) != null) {
                    if ((wg1Var == wg1Var2) != ((Boolean) s0eVar2.getValue()).booleanValue()) {
                        s0e s0eVar3 = pi1Var2.v;
                        do {
                            value2 = s0eVar3.getValue();
                            ((Boolean) value2).getClass();
                        } while (!s0eVar3.l(value2, Boolean.FALSE));
                        pi1Var2.f(x48Var, wg1Var == wg1Var2);
                    }
                }
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((tt1) this.receiver).b(false);
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((tt1) this.receiver).b(false);
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((mma) this.receiver).h();
                return wef.a;
            case 14:
                mma mmaVar = (mma) this.receiver;
                String strD = jrb.d(mmaVar.v);
                if (strD != null) {
                    ynb.V(hwf.a(mmaVar), null, null, new ola(mmaVar, strD, null), 3);
                }
                return wef.a;
            case 15:
                a06 a06Var = (a06) this.receiver;
                if (!a06Var.b) {
                    a06Var.b = true;
                    a06Var.a.invoke();
                }
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((mma) this.receiver).G();
                return wef.a;
            case 17:
                ((mma) this.receiver).G();
                return wef.a;
            case 18:
                r0 r0Var = (r0) this.receiver;
                if (r0Var.B()) {
                    if (!((Boolean) r0Var.J0.getValue()).booleanValue()) {
                        ConcurrentHashMap concurrentHashMap = xfb.a;
                        String str = r0Var.I0;
                        str.getClass();
                        xfb.a.remove(str);
                        xfb.b.remove(str);
                    }
                    r0Var.x1(null);
                    r0Var.b2.setValue(pu4.a);
                    r0Var.K1(new id4(null));
                    r0Var.k("quick_draw", "spread_select");
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("quick_draw_started"), null, 6);
                }
                return wef.a;
            case 19:
                ((r0) this.receiver).E0.i(-10000L);
                return wef.a;
            case 20:
                t6f t6fVar = ((r0) this.receiver).E0;
                int iOrdinal = ((w6f) t6fVar.X.getValue()).b.ordinal();
                if (iOrdinal == 2) {
                    t6fVar.g();
                } else if (iOrdinal == 3) {
                    if (t6fVar.z) {
                        t6fVar.g();
                    } else {
                        t6fVar.h();
                    }
                }
                return wef.a;
            case 21:
                ((r0) this.receiver).E0.i(10000L);
                return wef.a;
            case 22:
                ((r0) this.receiver).E0.k();
                return wef.a;
            case 23:
                p3c p3cVar = (p3c) this.receiver;
                p3cVar.f();
                o2c o2cVar = p3cVar.w;
                if (o2cVar != null) {
                    r0c r0cVar = o2cVar.a;
                    if (((d3c) p3cVar.d.getValue()).a && p3cVar.m(r0cVar) && !pa7.t(p3cVar.y, r0cVar)) {
                        p3cVar.k(o2cVar);
                        if (o2cVar.c) {
                            ynb.V(hwf.a(p3cVar), null, null, new h3c(p3cVar, r0cVar, null), 3);
                            x1f x1fVar2 = x1f.a;
                            x1f.g(p05.a, m1f.a, new z8b(26));
                        }
                    }
                }
                return wef.a;
            case 24:
                ((p3c) this.receiver).h();
                return wef.a;
            case 25:
                p3c p3cVar2 = (p3c) this.receiver;
                r0c r0cVarF = p3cVar2.f();
                long j = p3cVar2.v + 1;
                p3cVar2.v = j;
                p3cVar2.w = new o2c(r0cVarF, j, false);
                s0e s0eVar4 = p3cVar2.d;
                do {
                    value3 = s0eVar4.getValue();
                } while (!s0eVar4.l(value3, d3c.a((d3c) value3, true, false, 2)));
                return wef.a;
            case 26:
                ((x1f) this.receiver).getClass();
                return Boolean.valueOf(x1f.d());
            case 27:
                ((x1f) this.receiver).getClass();
                o05 o05VarA = x1f.a();
                uu3 uu3Var = o05VarA instanceof uu3 ? (uu3) o05VarA : null;
                if (uu3Var != null && uu3Var.b == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                ((x1f) this.receiver).getClass();
                return Boolean.valueOf(x1f.d());
            default:
                ((x1f) this.receiver).getClass();
                return Boolean.valueOf(x1f.d());
        }
    }
}
