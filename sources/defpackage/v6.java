package defpackage;

import ai.askquin.R;
import ai.askquin.ui.account.component.AuthOption;
import ai.askquin.ui.annual.d;
import ai.askquin.ui.annual.h;
import android.hardware.camera2.CameraManager;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.ArcanaGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v6 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        ywc ywcVar;
        LayoutNode layoutNode;
        hkb hkbVar;
        int i = 0;
        switch (this.a) {
            case 0:
                ((z88) this.b).h((AccessibilityManager) this.c);
                return wef.a;
            case 1:
                ((p59) this.b).d((id) this.c);
                return wef.a;
            case 2:
                dvd dvdVar = (dvd) this.b;
                return dvdVar == null ? (dvd) this.c : dvdVar;
            case 3:
                ((a26) this.b).d(this.c);
                return wef.a;
            case 4:
                return Boolean.valueOf(AndroidComposeView.f((AndroidComposeView) this.b, (KeyEvent) this.c));
            case 5:
                ehc ehcVar = (ehc) this.b;
                lq lqVar = (lq) this.c;
                rgc rgcVar = ehcVar.e;
                rgc rgcVar2 = ehcVar.f;
                Float f = ehcVar.c;
                Float f2 = ehcVar.d;
                float fFloatValue = (rgcVar == null || f == null) ? 0.0f : ((Number) rgcVar.a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (rgcVar2 == null || f2 == null) ? 0.0f : ((Number) rgcVar2.a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = lqVar.A(ehcVar.a);
                    axc axcVar = (axc) lqVar.s().b(lqVar.y);
                    if (axcVar != null) {
                        try {
                            t6 t6Var = lqVar.X;
                            if (t6Var != null) {
                                t6Var.a.setBoundsInScreen(lqVar.k(axcVar));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    axc axcVar2 = (axc) lqVar.s().b(lqVar.z);
                    if (axcVar2 != null) {
                        try {
                            t6 t6Var2 = lqVar.Y;
                            if (t6Var2 != null) {
                                t6Var2.a.setBoundsInScreen(lqVar.k(axcVar2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    lqVar.d.invalidate();
                    axc axcVar3 = (axc) lqVar.s().b(iA);
                    if (axcVar3 != null && (ywcVar = axcVar3.a) != null && (layoutNode = ywcVar.c) != null) {
                        if (rgcVar != null) {
                            lqVar.E0.i(iA, rgcVar);
                        }
                        if (rgcVar2 != null) {
                            lqVar.F0.i(iA, rgcVar2);
                        }
                        lqVar.w(layoutNode);
                    }
                }
                if (rgcVar != null) {
                    ehcVar.c = (Float) rgcVar.a.invoke();
                }
                if (rgcVar2 != null) {
                    ehcVar.d = (Float) rgcVar2.a.invoke();
                }
                return wef.a;
            case 6:
                ((mmb) this.b).element = ((x16) this.c).invoke();
                return wef.a;
            case 7:
                ((yv1) this.b).d(this.c);
                return wef.a;
            case 8:
                return cz.b((cz) this.b, (imb) this.c);
            case 9:
                e89 e89Var = (e89) this.b;
                e30 e30Var = (e30) this.c;
                z6e z6eVar = ((a30) e89Var.getValue()).b;
                if (z6eVar != null) {
                    e30Var.T0 = true;
                    e30Var.H(z6eVar, ((mo3) e30Var.P0).a());
                } else {
                    jcc.k(1, Integer.valueOf(R.string.chat_mind_pricing_loading_failed));
                }
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                h hVar = (h) this.b;
                ka9 ka9Var = (ka9) this.c;
                hVar.getClass();
                ynb.V(hwf.a(hVar), null, null, new d(hVar, ka9Var, null), 3);
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((a26) this.b).d(s72.j1(((w10) this.c).f));
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((a26) this.b).d((ArcanaGroup) this.c);
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((je0) this.b).f((String) this.c);
                return wef.a;
            case 14:
                cb9 cb9Var = (cb9) this.b;
                x16 x16Var = (x16) this.c;
                if (!cb9Var.g()) {
                    x16Var.invoke();
                }
                return wef.a;
            case 15:
                ((a26) this.b).d((AuthOption) this.c);
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((je2) this.b).c = (x16) this.c;
                return wef.a;
            case 17:
                ss0 ss0Var = (ss0) this.b;
                vv7 vv7Var = (vv7) this.c;
                ss0Var.L0 = ss0Var.G0.a(vv7Var.a.f(), vv7Var.getLayoutDirection(), vv7Var);
                return wef.a;
            case 18:
                ot0 ot0Var = (ot0) this.b;
                mt0 mt0Var = (mt0) this.c;
                gl2 gl2Var = ot0Var.a;
                synchronized (gl2Var.c) {
                    if (gl2Var.d.remove(mt0Var) && gl2Var.d.isEmpty()) {
                        gl2Var.d();
                    }
                    break;
                }
                return wef.a;
            case 19:
                zse zseVar = (zse) this.b;
                e89 e89Var2 = (e89) this.c;
                if (!eue.c(zseVar.b, ((zse) e89Var2.getValue()).b) || !pa7.t(zseVar.c, ((zse) e89Var2.getValue()).c)) {
                    e89Var2.setValue(zseVar);
                }
                return wef.a;
            case 20:
                return Boolean.valueOf(((Boolean) ((h0e) this.c).getValue()).booleanValue() && ((b28) ((e7g) this.b)).a());
            case 21:
                yte yteVar = (yte) this.b;
                k00 k00Var = (k00) this.c;
                if (yteVar == null) {
                    return k00Var;
                }
                jsd jsdVar = yteVar.c;
                boolean zIsEmpty = jsdVar.isEmpty();
                k00 k00Var2 = yteVar.b;
                if (!zIsEmpty) {
                    pme pmeVar = new pme(k00Var2);
                    int size = jsdVar.size();
                    while (i < size) {
                        ((a26) jsdVar.get(i)).d(pmeVar);
                        i++;
                    }
                    k00Var2 = pmeVar.b;
                }
                yteVar.b = k00Var2;
                return k00Var2 == null ? k00Var : k00Var2;
            case 22:
                ynb.V((aw2) this.b, null, null, new gw0((d0f) this.c, null), 3);
                return Boolean.TRUE;
            case 23:
                oy0 oy0Var = (oy0) this.b;
                String str = (String) this.c;
                str.getClass();
                ynb.V(hwf.a(oy0Var), null, null, new ly0(oy0Var, str, null), 3);
                return wef.a;
            case 24:
                gy0 gy0Var = (gy0) this.b;
                hy0 hy0Var = new hy0((a26) this.c, i);
                String string = ((jy0) gy0Var.c.getValue()).a.d().c.toString();
                string.getClass();
                if (new rob("^1(3\\d|4[5-9]|5[0-35-9]|6[2567]|7[0-8]|8\\d|9[0-35-9])\\d{8}$").g(string)) {
                    gy0Var.d.setValue(Boolean.TRUE);
                    ynb.V(hwf.a(gy0Var), null, null, new fy0(gy0Var, string, hy0Var, null), 3).E(new c1(22, gy0Var));
                }
                return wef.a;
            case 25:
                use useVar = (use) this.b;
                x16 x16Var2 = (x16) this.c;
                n3d.g(useVar);
                x16Var2.invoke();
                return wef.a;
            case 26:
                x16 x16Var3 = (x16) this.b;
                yf9 yf9Var = (yf9) this.c;
                if (x16Var3 != null && (hkbVar = (hkb) x16Var3.invoke()) != null) {
                    return hkbVar;
                }
                if (!yf9Var.h1().Y) {
                    yf9Var = null;
                }
                if (yf9Var != null) {
                    return z5c.g(0L, db6.Y0(yf9Var.c));
                }
                return null;
            case 27:
                ((g81) this.b).F0.d((h81) this.c);
                return wef.a;
            case 28:
                ((CameraManager) this.b).unregisterAvailabilityCallback((ob1) this.c);
                return wef.a;
            default:
                ((rc1) this.b).c.unregisterAvailabilityCallback((oc1) this.c);
                return wef.a;
        }
    }
}
