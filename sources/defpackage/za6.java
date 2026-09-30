package defpackage;

import ai.askquin.MainActivity;
import ai.askquin.model.Scene;
import android.content.ClipboardManager;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.LocalDate;
import net.xmind.donut.gp.GooglePay;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class za6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ za6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        zw7 zw7Var;
        b18 b18Var;
        int i = this.a;
        int i2 = 0;
        float f = 0.0f;
        b18 b18Var2 = null;
        zw7 zw7Var2 = null;
        wef wefVar = wef.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("my_gift_cards_page", "pathway");
                l1fVar.a(((wa6) obj2).a(), "tab");
                return wefVar;
            case 1:
                m86 m86Var = (m86) obj2;
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a("gift_card_purchase_page", "pathway");
                ca2.a.getClass();
                l1fVar2.a(ca2.c ? m86Var.b() : m86Var.d(), "product_id");
                return wefVar;
            case 2:
                r41 r41Var = (r41) obj2;
                if (sb6.b.compareAndSet(false, true)) {
                    r41Var.d(wefVar);
                }
                return wefVar;
            case 3:
                Exception exc = (Exception) obj;
                int i3 = GooglePay.g;
                exc.getClass();
                ((GooglePay) obj2).d().c("Failed to close BillingClient", exc);
                return wefVar;
            case 4:
                sn4 sn4Var = (sn4) obj;
                vl1 vl1VarP = sn4Var.v0().p();
                l26 l26Var = ((ne6) obj2).d;
                if (l26Var != null) {
                    l26Var.z(vl1VarP, (ke6) sn4Var.v0().d);
                }
                return wefVar;
            case 5:
                df6 df6Var = (df6) obj2;
                lrf lrfVar = (lrf) obj;
                df6Var.g(lrfVar);
                a26 a26Var = df6Var.i;
                if (a26Var != null) {
                    a26Var.d(lrfVar);
                }
                return wefVar;
            case 6:
                aj6 aj6Var = (aj6) obj2;
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                bm8.H(new iy9("btn", aj6Var.a), new iy9("pathway", aj6Var.b), new iy9("choice", aj6Var.c)).forEach(new al(new gl(2, l1fVar3, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 19), 3));
                return wefVar;
            case 7:
                kq6 kq6Var = (kq6) obj2;
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                s0e s0eVar = kq6Var.P0;
                Comparable comparableS = mh3.s(localDate, kq6Var.y, ((b93) kq6Var.z.getValue()).a());
                s0eVar.getClass();
                s0eVar.n(null, comparableS);
                return wefVar;
            case 8:
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.getClass();
                l1fVar4.a(((wm6) obj2).c, "value");
                return wefVar;
            case 9:
                l1f l1fVar5 = (l1f) obj;
                l1fVar5.getClass();
                l1fVar5.a("enter_reading", "btn");
                l1fVar5.a(((Scene) obj2).getId(), "pathway");
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                g07 g07Var = (g07) obj2;
                l1f l1fVar6 = (l1f) obj;
                l1fVar6.a("inbox", "page_name");
                f07 f07Var = g07Var instanceof f07 ? (f07) g07Var : null;
                l1fVar6.a(Integer.valueOf(f07Var != null ? f07Var.a.size() : 0), "message_count");
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                x17 x17Var = (x17) obj2;
                h81 h81Var = (h81) obj;
                float density = h81Var.getDensity() * ((yi4) x17Var.O0.e()).a;
                zt ztVarA = cu.a();
                x4d x4dVarA = x17Var.N0;
                if (x4dVarA == null) {
                    x4dVarA = u5d.a((s5d) eb3.H(x17Var, u5d.a), od4.n);
                }
                vs9 vs9VarA = x4dVarA.a(h81Var.a.f(), h81Var.a.getLayoutDirection(), h81Var);
                if (vs9VarA instanceof ts9) {
                    zt.b(ztVarA, ((ts9) vs9VarA).a);
                } else if (vs9VarA instanceof us9) {
                    zt.c(ztVarA, ((us9) vs9VarA).a);
                } else {
                    if (!(vs9VarA instanceof ss9)) {
                        ap.c();
                        return null;
                    }
                    zt.a(ztVarA, ((ss9) vs9VarA).a);
                }
                zt ztVarA2 = cu.a();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (h81Var.a.f() & 4294967295L)) - density;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (h81Var.a.f() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & h81Var.a.f()));
                if (Float.isNaN(0.0f) || Float.isNaN(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat3)) {
                    cu.b("Invalid rectangle, make sure no value is NaN");
                }
                RectF rectF = ztVarA2.b;
                if (rectF == null) {
                    rectF = new RectF();
                    ztVarA2.b = rectF;
                }
                rectF.set(0.0f, fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3);
                Path path = ztVarA2.a;
                RectF rectF2 = ztVarA2.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                zt ztVarA3 = cu.a();
                ztVarA3.i(ztVarA2, ztVarA, 1);
                return h81Var.b(new so5(15, ztVarA3, x17Var));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l47 l47Var = (l47) obj2;
                wj9 wj9Var = (wj9) obj;
                InputConnection inputConnection = wj9Var.b;
                if (inputConnection != null) {
                    inputConnection.closeConnection();
                    wj9Var.b = null;
                }
                p89 p89Var = l47Var.d;
                Object[] objArr = p89Var.a;
                int i4 = p89Var.c;
                while (true) {
                    if (i2 >= i4) {
                        i2 = -1;
                    } else if (!pa7.t((g0g) objArr[i2], wj9Var)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    p89Var.k(i2);
                }
                if (p89Var.c == 0) {
                    l47Var.b.invoke();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = (ClipboardManager.OnPrimaryClipChangedListener) obj2;
                ((ra4) obj).getClass();
                onPrimaryClipChangedListener.onPrimaryClipChanged();
                tce.a().addPrimaryClipChangedListener(onPrimaryClipChangedListener);
                return new lf(13, onPrimaryClipChangedListener);
            case 14:
                l1f l1fVar7 = (l1f) obj;
                l1fVar7.a("2405", "aid");
                l1fVar7.a(((gbd) obj2).name(), "share_type");
                return wefVar;
            case 15:
                return Integer.valueOf(((fx7) obj2).c(((Integer) obj).intValue()));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                jx7 jx7Var = (jx7) obj2;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || jx7Var.d()) && (f2 <= 0.0f || jx7Var.c())) {
                    if (Math.abs(jx7Var.g) > 0.5f) {
                        l37.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = jx7Var.g + f2;
                    jx7Var.g = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = jx7Var.g;
                        int iL = ym8.L(f4);
                        zw7 zw7VarH = ((zw7) jx7Var.e.getValue()).h(iL, !jx7Var.b);
                        if (zw7VarH == null || (zw7Var = jx7Var.c) == null) {
                            zw7Var2 = zw7VarH;
                        } else {
                            zw7 zw7VarH2 = zw7Var.h(iL, true);
                            if (zw7VarH2 != null) {
                                jx7Var.c = zw7VarH2;
                                zw7Var2 = zw7VarH;
                            }
                        }
                        if (zw7Var2 != null) {
                            jx7Var.f(zw7Var2, jx7Var.b, true);
                            jx7Var.r.setValue(wefVar);
                            jx7Var.h(f4 - jx7Var.g, zw7Var2);
                        } else {
                            LayoutNode layoutNode = jx7Var.j;
                            if (layoutNode != null) {
                                layoutNode.m();
                            }
                            jx7Var.h(f4 - jx7Var.g, jx7Var.g());
                        }
                    }
                    if (Math.abs(jx7Var.g) > 0.5f) {
                        f2 -= jx7Var.g;
                        jx7Var.g = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 17:
                return new lf(14, (pz7) obj2);
            case 18:
                z08 z08Var = (z08) obj2;
                return z08Var.B0(((Integer) obj).intValue(), z08Var.e);
            case 19:
                j18 j18Var = (j18) obj2;
                float f5 = -((Float) obj).floatValue();
                if ((f5 >= 0.0f || j18Var.d()) && (f5 <= 0.0f || j18Var.c())) {
                    if (Math.abs(j18Var.h) > 0.5f) {
                        l37.c("entered drag with non-zero pending scroll");
                    }
                    j18Var.d = true;
                    float f6 = j18Var.h + f5;
                    j18Var.h = f6;
                    if (Math.abs(f6) > 0.5f) {
                        float f7 = j18Var.h;
                        int iRound = Math.round(f7);
                        b18 b18VarH = ((b18) j18Var.f.getValue()).h(iRound, !j18Var.b);
                        if (b18VarH == null || (b18Var = j18Var.c) == null) {
                            b18Var2 = b18VarH;
                        } else {
                            b18 b18VarH2 = b18Var.h(iRound, true);
                            if (b18VarH2 != null) {
                                j18Var.c = b18VarH2;
                                b18Var2 = b18VarH;
                            }
                        }
                        if (b18Var2 != null) {
                            j18Var.g(b18Var2, j18Var.b, true);
                            j18Var.w.setValue(wefVar);
                            j18Var.i(f7 - j18Var.h, b18Var2);
                        } else {
                            LayoutNode layoutNode2 = j18Var.l;
                            if (layoutNode2 != null) {
                                layoutNode2.m();
                            }
                            j18Var.i(f7 - j18Var.h, j18Var.h());
                        }
                    }
                    if (Math.abs(j18Var.h) > 0.5f) {
                        f5 -= j18Var.h;
                        j18Var.h = 0.0f;
                    }
                    f = f5;
                }
                return Float.valueOf(-f);
            case 20:
                ucc uccVar = (ucc) obj2;
                return Boolean.valueOf(uccVar != null ? uccVar.c(obj) : true);
            case 21:
                ((ra4) obj).getClass();
                return new lf(16, (g6d) obj2);
            case 22:
                return ((rk1) obj2).m;
            case 23:
                se8 se8Var = (se8) obj2;
                n07 n07Var = (n07) obj;
                n07Var.getClass();
                se8Var.H(n07Var, ((mo3) se8Var.P0).a());
                return wefVar;
            case 24:
                Throwable th = (Throwable) obj;
                int i5 = MainActivity.Z0;
                th.getClass();
                ((MainActivity) obj2).d().h("Failed to load startup update settings", th);
                return wefVar;
            case 25:
                dh9 dh9Var = (dh9) obj2;
                l1f l1fVar8 = (l1f) obj;
                int i6 = MainActivity.Z0;
                l1fVar8.getClass();
                String str = dh9Var.a;
                if (pa7.t(str, "four_seasons")) {
                    l1fVar8.a("campaign", "triggered_by");
                    l1fVar8.a("seasonal_reading", "campaign_name");
                    yic yicVar = dh9Var.c;
                    yicVar.getClass();
                    String strA = yicVar.a();
                    strA.getClass();
                    l1fVar8.a(strA, "seasonal_period");
                } else {
                    l1fVar8.a(str, "triggered_by");
                }
                String str2 = dh9Var.b;
                if (str2 != null) {
                    l1fVar8.a(str2, "push_id");
                }
                return wefVar;
            case 26:
                return ((tm8) obj2).d(((Integer) obj).intValue());
            case 27:
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                ((hu8) obj2).b = bv7Var;
                return wefVar;
            case 28:
                fz8 fz8Var = (fz8) obj2;
                fz8Var.show();
                return new lf(17, fz8Var);
            default:
                o29 o29Var = (o29) obj2;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                v08.Y(v08Var, o29Var.c.size(), null, new dd2(new wt(8, o29Var), true, 1186088992), 6);
                return wefVar;
        }
    }
}
