package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.account.component.AuthOption;
import ai.askquin.ui.divination.OverviewItem;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.ArcanaGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g20 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        ms8 ms8Var = (ms8) this.b;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d92) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            Iterator it = ms8Var.a.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    r3.f();
                    return null;
                }
                float f = rr8.a;
                pr4 pr4Var = o82.a;
                long j = ((m82) l46Var.k(pr4Var)).o;
                int i = y72.l;
                rr8.a((m82) l46Var.k(pr4Var));
                throw null;
            }
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        bx9 bx9Var = (bx9) this.b;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((mx7) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            jgb.b(ynb.Y(g09.a, bx9Var), tm7.u, l46Var, 48, 0);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        OverviewItem.UserMessageItem userMessageItem = (OverviewItem.UserMessageItem) this.b;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d92) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            j09 j09VarC = b.c(g09.a, 1.0f);
            xn8 xn8VarC = s21.c(ndb.g, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            n3d.b(0, 1, l46Var, null, userMessageItem.getText());
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        List list = (List) this.b;
        int iIntValue = ((Integer) obj).intValue();
        l46 l46Var = (l46) obj2;
        ((Integer) obj3).getClass();
        l46Var.f0(563367099);
        String strQ = afc.q(((oed) list.get(iIntValue)).a(), l46Var);
        l46Var.r(false);
        return strQ;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        n26 n26Var = (n26) this.b;
        u7c u7cVar = (u7c) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        u7cVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(u7cVar) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            pr4 pr4Var = nte.a;
            mue mueVar = pue.a;
            mh3.a(pr4Var.a(mue.a(pue.a(l46Var), 0L, 0L, jgb.S(l46Var), null, 0L, null, 3, 0L, null, null, 16744443)), af1.b0(1015122520, new rk6(25, n26Var, u7cVar), l46Var), l46Var, 56);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        kxa kxaVar = (kxa) this.b;
        int iIntValue = ((Integer) obj).intValue();
        String str = (String) obj2;
        ub9 ub9Var = (ub9) obj3;
        str.getClass();
        ub9Var.getClass();
        int iOrdinal = (((ub9Var instanceof r72) || ((xn7) kxaVar.a).e().j(iIntValue)) ? f7c.b : f7c.a).ordinal();
        if (iOrdinal == 0) {
            kxaVar.c = ((String) kxaVar.c) + '/' + ks0.g('}', "{", str);
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return null;
            }
            kxaVar.a(str, "{" + str + '}');
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:190:0x0719  */
    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        long j;
        boolean z;
        int i;
        int i2;
        boolean z2;
        String strI;
        int i3 = this.a;
        ov7 ov7Var = LayoutNode.h1;
        int i4 = 2;
        int i5 = 3;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        Object obj4 = this.b;
        switch (i3) {
            case 0:
                a30 a30Var = (a30) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z6e z6eVar = a30Var.b;
                    c92 c92VarA = a92.a(xc0.e, ndb.Z, l46Var, 54);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, g09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    String strQ = afc.q(R.string.annual_button_subscribe_unlock, l46Var);
                    mue mueVar = pue.a;
                    nte.b(strQ, null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.a(l46Var), l46Var, 0, 0, 130046);
                    if (z6eVar != null) {
                        l46Var.f0(706983335);
                        nte.b(afc.r(R.string.annual_button_subscribe_desc, new Object[]{z6eVar.y()}, l46Var), null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.j(l46Var), l46Var, 0, 0, 130046);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(707320367);
                        l46Var.r(false);
                    }
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                AuthOption authOption = (AuthOption) obj4;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    t7c t7cVarA = s7c.a(new uc0(10.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
                    int iHashCode2 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, g09Var);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, t7cVarA);
                    dec.l(hj6.y, l46Var2, u8aVarM2);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ2);
                    j09 j09VarL = b.l(g09Var, 24.0f);
                    fy9 fy9VarA = od4.A(authOption.getIcon(), 0, l46Var2);
                    if (authOption.getTint()) {
                        l46Var2.f0(-824862288);
                        j = ((y72) l46Var2.k(em2.a)).a;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-824861676);
                        l46Var2.r(false);
                        j = y72.k;
                    }
                    gu6.b(fy9VarA, null, j09VarL, j, l46Var2, 440, 0);
                    String strQ2 = afc.q(authOption.getLabel(), l46Var2);
                    mue mueVar2 = pue.a;
                    nte.b(strQ2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var2), l46Var2, 0, 0, 131070);
                    l46Var2.r(true);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                en0 en0Var = (en0) obj4;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                } else if (en0Var.f) {
                    l46Var3.f0(1534575724);
                    axa.a(2.0f, 0.0f, 0, 390, 56, ((m82) l46Var3.k(o82.a)).b, 0L, l46Var3, b.l(g09Var, 20.0f));
                    l46Var3.r(false);
                } else {
                    l46Var3.f0(1534762344);
                    String strQ3 = afc.q(en0Var.a() ? R.string.auto_renew_cancel : R.string.auto_renew_enable, l46Var3);
                    mue mueVar3 = pue.a;
                    nte.b(strQ3, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var3), l46Var3, 0, 0, 131070);
                    l46Var3.r(false);
                }
                return wefVar;
            case 3:
                zn8 zn8Var = (zn8) obj;
                tn8 tn8Var = (tn8) obj2;
                float f = ((yi4) ((ute) obj4).g.getValue()).a;
                int iD0 = zn8Var.D0(f);
                cea ceaVarV = tn8Var.v(ll2.e(((kl2) obj3).a, ll2.a(0, Integer.MAX_VALUE, iD0, yi4.b(f, 0.0f) ? Integer.MAX_VALUE : iD0)));
                return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 3));
            case 4:
                return new j41(obj3, (r41) obj4, (ytc) obj, 0);
            case 5:
                pi1 pi1Var = (pi1) obj4;
                hkb hkbVar = (hkb) obj;
                hkb hkbVar2 = (hkb) obj2;
                float fFloatValue = ((Float) obj3).floatValue();
                hkbVar.getClass();
                hkbVar2.getClass();
                if (pi1Var.F0 != null) {
                    bu0 bu0Var = new bu0(hkbVar2, pi1Var, hkbVar, fFloatValue);
                    hv6 hv6Var = pi1Var.Z;
                    Context contextZ = cn1.z();
                    hv6Var.I(Build.VERSION.SDK_INT >= 28 ? s.w(contextZ) : new ft(new Handler(contextZ.getMainLooper()), 1), bu0Var);
                }
                return wefVar;
            case 6:
                ((p59) obj4).d((Throwable) obj);
                return wefVar;
            case 7:
                ArcanaGroup arcanaGroup = (ArcanaGroup) obj4;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((vw7) obj).getClass();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    j09 j09VarB0 = ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                    t7c t7cVarA2 = s7c.a(xc0.a, ndb.z, l46Var4, 48);
                    int iHashCode3 = Long.hashCode(l46Var4.T);
                    u8a u8aVarM3 = l46Var4.m();
                    j09 j09VarJ3 = m93.J(l46Var4, j09VarB0);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, t7cVarA2);
                    dec.l(hj6.y, l46Var4, u8aVarM3);
                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode3));
                    dec.k(l46Var4);
                    dec.l(hj6.x, l46Var4, j09VarJ3);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    mue mueVar4 = pue.a;
                    mue mueVarD = pue.d(l46Var4);
                    pr4 pr4Var = o82.a;
                    nte.b("-", jw7Var, ((m82) l46Var4.k(pr4Var)).a, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarD, l46Var4, 6, 0, 130040);
                    int i6 = us1.a[arcanaGroup.ordinal()];
                    if (i6 == 1) {
                        z = false;
                        i = 63149363;
                        i2 = R.string.tarot_category_arcana;
                    } else if (i6 == 2) {
                        z = false;
                        i = 63151673;
                        i2 = R.string.tarot_category_arcana_wands;
                    } else if (i6 == 3) {
                        z = false;
                        i = 63154136;
                        i2 = R.string.tarot_category_arcana_cups;
                    } else if (i6 == 4) {
                        z = false;
                        i = 63156634;
                        i2 = R.string.tarot_category_arcana_swords;
                    } else {
                        if (i6 != 5) {
                            throw tec.d(63148478, l46Var4, false);
                        }
                        i = 63159293;
                        i2 = R.string.tarot_category_arcana_pentacles;
                        z = false;
                    }
                    nte.b(tec.i(l46Var4, i, i2, l46Var4, z), null, ((m82) l46Var4.k(pr4Var)).a, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.d(l46Var4), l46Var4, 0, 0, 130042);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    nte.b("-", new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ((m82) l46Var4.k(pr4Var)).a, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.d(l46Var4), l46Var4, 6, 0, 130040);
                    l46Var4.r(true);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 8:
                l26 l26Var = (l26) obj4;
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    l26Var.z(l46Var5, 0);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 9:
                fv2 fv2Var = (fv2) obj4;
                int iIntValue6 = ((Integer) obj).intValue();
                int iIntValue7 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue6 = fv2Var.J0.j(iIntValue6);
                }
                if (!zBooleanValue) {
                    iIntValue7 = fv2Var.J0.j(iIntValue7);
                }
                if (fv2Var.I0) {
                    long j2 = fv2Var.G0.b;
                    int i7 = eue.c;
                    if (iIntValue6 == ((int) (j2 >> 32)) && iIntValue7 == ((int) (j2 & 4294967295L))) {
                        z2 = false;
                    } else {
                        int iMin = Math.min(iIntValue6, iIntValue7);
                        ug6 ug6Var = ug6.a;
                        if (iMin < 0 || Math.max(iIntValue6, iIntValue7) > fv2Var.G0.a.b.length()) {
                            cre creVar = fv2Var.K0;
                            creVar.u(false);
                            creVar.r(ug6Var);
                            z2 = false;
                        } else {
                            if (zBooleanValue || iIntValue6 == iIntValue7) {
                                cre creVar2 = fv2Var.K0;
                                creVar2.u(false);
                                creVar2.r(ug6Var);
                            } else {
                                fv2Var.K0.e(true);
                            }
                            fv2Var.H0.v.d(new zse(fv2Var.G0.a, u3c.b(iIntValue6, iIntValue7), (eue) null));
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                jaa jaaVar = (jaa) obj4;
                l46 l46Var6 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var6.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    String strQ4 = afc.q(jaaVar.f ? R.string.personality_view_result : R.string.personality_continue_test, l46Var6);
                    mue mueVar5 = pue.a;
                    nte.b(strQ4, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.i(l46Var6), l46Var6, 0, 0, 131070);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                t7 t7Var = (t7) obj4;
                l46 l46Var7 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var7.W(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    j09 j09VarZ = ynb.Z(g09Var, 16.0f);
                    c92 c92VarA2 = a92.a(xc0.c, ndb.Y, l46Var7, 0);
                    int iHashCode4 = Long.hashCode(l46Var7.T);
                    u8a u8aVarM4 = l46Var7.m();
                    j09 j09VarJ4 = m93.J(l46Var7, j09VarZ);
                    lf2.q.getClass();
                    l46Var7.j0();
                    if (l46Var7.S) {
                        l46Var7.l(ov7Var);
                    } else {
                        l46Var7.s0();
                    }
                    dec.l(hj6.z, l46Var7, c92VarA2);
                    dec.l(hj6.y, l46Var7, u8aVarM4);
                    dec.l(hj6.X, l46Var7, Integer.valueOf(iHashCode4));
                    dec.k(l46Var7);
                    dec.l(hj6.x, l46Var7, j09VarJ4);
                    nte.b("System Info:", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var7.k(r9f.a)).h, l46Var7, 6, 0, 131070);
                    int i8 = Build.VERSION.SDK_INT;
                    nte.b("Android Version: " + i8 + " (" + Build.VERSION.RELEASE + ")", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var7, 0, 0, 262142);
                    nte.b("Code Path: ".concat(i8 >= 29 ? "Modern (Q+)" : "Legacy (<Q)"), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var7, 0, 0, 262142);
                    String strA = ((mo3) t7Var).a();
                    if (strA.length() == 0) {
                        strA = "Not logged in";
                    }
                    nte.b("User UID: " + ((Object) strA), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var7, 0, 0, 262142);
                    l46Var7.r(true);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ob5 ob5Var = (ob5) obj4;
                l46 l46Var8 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var8.W(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    j09 j09VarZ2 = ynb.Z(b.c(g09Var, 1.0f), 24.0f);
                    c92 c92VarA3 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var8, 54);
                    int iHashCode5 = Long.hashCode(l46Var8.T);
                    u8a u8aVarM5 = l46Var8.m();
                    j09 j09VarJ5 = m93.J(l46Var8, j09VarZ2);
                    lf2.q.getClass();
                    l46Var8.j0();
                    if (l46Var8.S) {
                        l46Var8.l(ov7Var);
                    } else {
                        l46Var8.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var8, c92VarA3);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var8, u8aVarM5);
                    Integer numValueOf = Integer.valueOf(iHashCode5);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var8, numValueOf);
                    dec.k(l46Var8);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var8, j09VarJ5);
                    feg.j(od4.A(ob5Var.c, 0, l46Var8), null, oa7.E(b.l(g09Var, 48.0f), a7c.a), null, null, 0.0f, null, l46Var8, 56, 120);
                    j09 j09VarF = b.f(24.0f, 0.0f, g09Var, 2);
                    t7c t7cVarA3 = s7c.a(xc0.a, ndb.y, l46Var8, 0);
                    int iHashCode6 = Long.hashCode(l46Var8.T);
                    u8a u8aVarM6 = l46Var8.m();
                    j09 j09VarJ6 = m93.J(l46Var8, j09VarF);
                    l46Var8.j0();
                    if (l46Var8.S) {
                        l46Var8.l(ov7Var);
                    } else {
                        l46Var8.s0();
                    }
                    dec.l(he2Var, l46Var8, t7cVarA3);
                    dec.l(he2Var2, l46Var8, u8aVarM6);
                    ib8.s(iHashCode6, l46Var8, he2Var3, l46Var8);
                    dec.l(he2Var4, l46Var8, j09VarJ6);
                    l46Var8.f0(-581429824);
                    Iterator it = new z67(1, 5, 1).iterator();
                    while (((y67) it).c) {
                        ((q67) it).nextInt();
                        gu6.a(z8c.i(), null, b.l(g09Var, 24.0f), ((e8b) l46Var8.k(l8b.a)).r, l46Var8, 432, 0);
                    }
                    l46Var8.r(false);
                    l46Var8.r(true);
                    String str = ob5Var.b;
                    mue mueVar6 = pue.a;
                    mue mueVarE = pue.e(l46Var8);
                    pr4 pr4Var2 = l8b.a;
                    nte.b(str, null, ((e8b) l46Var8.k(pr4Var2)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarE, l46Var8, 0, 0, 130042);
                    nte.b(ob5Var.a, null, ((e8b) l46Var8.k(pr4Var2)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.i(l46Var8), l46Var8, 0, 0, 131066);
                    l46Var8.r(true);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                b16 b16Var = (b16) obj4;
                l46 l46Var9 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var9.W(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    String str2 = b16Var.f;
                    mue mueVar7 = pue.a;
                    nte.b(str2, null, ((e8b) l46Var9.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var9), l46Var9, 0, 0, 131066);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 14:
                int iIntValue12 = ((Integer) obj).intValue();
                l46 l46Var10 = (l46) obj2;
                ((Integer) obj3).getClass();
                l46Var10.f0(-2060031567);
                String strQ5 = afc.q(((mx4) ((lx4) obj4)).get(iIntValue12) == wa6.Sent ? R.string.gift_card_sent : R.string.gift_card_received, l46Var10);
                l46Var10.r(false);
                return strQ5;
            case 15:
                f96 f96Var = (f96) obj4;
                l46 l46Var11 = (l46) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var11.W(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x76.c(f96Var.a, f96Var.b, null, f96Var.c, null, true, b.c(g09Var, 1.0f), false, l46Var11, 1794432, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj4;
                c31 c31Var = (c31) obj;
                l46 l46Var12 = (l46) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                c31Var.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= l46Var12.g(c31Var) ? 4 : 2;
                }
                if (l46Var12.W(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x57.t(tarotSkinIdentify, b.c, l46Var12, 0);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case 17:
                mic micVar = (mic) obj4;
                l46 l46Var13 = (l46) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var13.W(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    feg.j(od4.A(if9.w(micVar).a, 0, l46Var13), null, b.c, null, an2.b, 0.0f, null, l46Var13, 25016, 104);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case 18:
                iwa iwaVar = (iwa) obj4;
                l46 l46Var14 = (l46) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var14.W(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    String strR = afc.r(R.string.personality_paywall_unlock, new Object[]{iwaVar.b.y()}, l46Var14);
                    mue mueVar8 = pue.a;
                    nte.b(strR, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var14), l46Var14, 0, 0, 131070);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
            case 19:
                ij ijVar = (ij) obj4;
                l46 l46Var15 = (l46) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var15.W(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    if (ijVar != null) {
                        l46Var15.f0(1783272028);
                        strI = afc.r(R.string.mixed_all_decks_price, new Object[]{Integer.valueOf(ijVar.b.size()), ijVar.a.y()}, l46Var15);
                        l46Var15.r(false);
                    } else {
                        strI = tec.i(l46Var15, 1783453099, R.string.mixed_unlock_all_decks, l46Var15, false);
                    }
                    String str3 = strI;
                    mue mueVar9 = oue.a;
                    nte.b(str3, null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.a(l46Var15), l46Var15, 0, 0, 130046);
                } else {
                    l46Var15.Z();
                }
                return wefVar;
            case 20:
                p29 p29Var = (p29) obj4;
                xw9 xw9Var = (xw9) obj;
                l46 l46Var16 = (l46) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= l46Var16.g(xw9Var) ? 4 : 2;
                }
                if (l46Var16.W(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    kn2.c(p29Var, null, null, null, null, null, af1.b0(1544338308, new wt(9, xw9Var), l46Var16), l46Var16, 1572872, 62);
                } else {
                    l46Var16.Z();
                }
                return wefVar;
            case 21:
                f99 f99Var = (f99) obj4;
                f99.w.set(f99Var, null);
                f99Var.h(null);
                return wefVar;
            case 22:
                j09 j09VarD = (j09) obj;
                l46 l46Var17 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09VarD.getClass();
                l46Var17.f0(-879843801);
                if (((wp9) obj4).c) {
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    j09VarD = j09VarD.D(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                }
                l46Var17.r(false);
                return j09VarD;
            case 23:
                return a(obj, obj2, obj3);
            case 24:
                return e(obj, obj2, obj3);
            case 25:
                return f(obj, obj2, obj3);
            case 26:
                return g(obj, obj2, obj3);
            case 27:
                return h(obj, obj2, obj3);
            case 28:
                return i(obj, obj2, obj3);
            default:
                fwc fwcVar = (fwc) obj4;
                j09 j09Var = (j09) obj;
                l46 l46Var18 = (l46) obj2;
                ((Integer) obj3).getClass();
                l46Var18.f0(-1914520728);
                sw3 sw3Var = (sw3) l46Var18.k(zg2.h);
                Object objR = l46Var18.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = q1c.f(new e77(0L));
                    l46Var18.p0(objR);
                }
                e89 e89Var = (e89) objR;
                boolean zI = l46Var18.i(fwcVar);
                Object objR2 = l46Var18.R();
                if (zI || objR2 == i8cVar) {
                    objR2 = new ykc(i5, fwcVar, e89Var);
                    l46Var18.p0(objR2);
                }
                x16 x16Var = (x16) objR2;
                boolean zG = l46Var18.g(sw3Var);
                Object objR3 = l46Var18.R();
                if (zG || objR3 == i8cVar) {
                    objR3 = new si3(sw3Var, e89Var, i4);
                    l46Var18.p0(objR3);
                }
                yz yzVar = xvc.a;
                j09 j09VarU = m93.u(j09Var, new s19(11, x16Var, (a26) objR3));
                l46Var18.r(false);
                return j09VarU;
        }
    }

    public /* synthetic */ g20(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }
}
