package defpackage;

import ai.askquin.R;
import ai.askquin.model.Scene;
import ai.askquin.ui.paywall.upgrade.s;
import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import ai.askquin.ui.popup.dailyfortune.v;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import java.util.ListIterator;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q8 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q8(iu8 iu8Var, View view, e89 e89Var, dd2 dd2Var) {
        this.a = 29;
        this.b = iu8Var;
        this.c = view;
        this.e = e89Var;
        this.d = dd2Var;
    }

    private final Object a(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        dj6.t((x16) this.d, (j09) this.b, (e08) this.c, (tz7) this.e, (l46) obj, k99.P(1));
        return wef.a;
    }

    private final Object e(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iP = k99.P(9);
        t72.h((kq6) this.b, this.c, (x48) this.e, (a26) this.d, (l46) obj, iP);
        return wef.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        long jB;
        ?? r5;
        long j;
        ka9 ka9Var;
        ql6 ql6Var;
        int i = this.a;
        int i2 = 7;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        int i3 = 6;
        i8c i8cVar = sf2.a;
        final int i4 = 2;
        boolean z = true;
        wef wefVar = wef.a;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj6;
                y72 y72Var = (y72) obj4;
                String str2 = (String) obj5;
                x16 x16Var = (x16) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    kx0 kx0Var = ndb.z;
                    t7c t7cVarA = s7c.a(new uc0(16.0f, true, new qc0(0)), kx0Var, l46Var, 54);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarC);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var, t7cVarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p8c.r(l46Var), l46Var, 0, 0, 131070);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    t7c t7cVarA2 = s7c.a(new uc0(4.0f, true, new jv2(3, ndb.E0)), kx0Var, l46Var, 54);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, jw7Var);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, t7cVarA2);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    jw7 jw7Var2 = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    mue mueVarS = p8c.s(l46Var);
                    if (y72Var == null) {
                        l46Var.f0(-1377405039);
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.48f);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1377406589);
                        l46Var.r(false);
                        jB = y72Var.a;
                    }
                    nte.b(str2, jw7Var2, jB, 0L, null, null, 0L, null, new jme(6), 0L, 2, false, 1, 0, null, mueVarS, l46Var, 0, 24960, 109560);
                    if (x16Var == null) {
                        l46Var.f0(250171808);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(250171809);
                        gu6.a(bm8.z(), null, null, 0L, l46Var, 48, 12);
                        l46Var.r(false);
                    }
                    l46Var.r(true);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                ((Integer) obj2).getClass();
                dj6.b((String) obj6, (String) obj5, (x16) obj3, (x16) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 2:
                ((Integer) obj2).getClass();
                nk8.b((a26) obj6, (a26) obj5, (a26) obj4, (x16) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 3:
                x16 x16Var2 = (x16) obj3;
                v50 v50Var = (v50) obj6;
                e89 e89Var = (e89) obj5;
                h0e h0eVar = (h0e) obj4;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd2 dd2VarB0 = af1.b0(1300818903, new j30(v50Var, 0), l46Var2);
                    dd2 dd2VarB1 = af1.b0(-1609510400, new w7(5, e89Var, h0eVar), l46Var2);
                    boolean zG = l46Var2.g(x16Var2);
                    Object objR = l46Var2.R();
                    if (zG || objR == i8cVar) {
                        objR = new c20(4, x16Var2);
                        l46Var2.p0(objR);
                    }
                    pa7.d(null, 0L, 0L, null, dd2VarB0, dd2VarB1, false, (x16) objR, l46Var2, 221184, 79);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 4:
                String str3 = (String) obj6;
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                en0 en0Var = (en0) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 20.0f);
                    c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var3, 6);
                    int iHashCode3 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM3 = l46Var3.m();
                    j09 j09VarJ3 = m93.J(l46Var3, j09VarZ);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    he2 he2Var5 = hj6.z;
                    dec.l(he2Var5, l46Var3, c92VarA);
                    he2 he2Var6 = hj6.y;
                    dec.l(he2Var6, l46Var3, u8aVarM3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    he2 he2Var7 = hj6.X;
                    dec.l(he2Var7, l46Var3, numValueOf2);
                    dec.k(l46Var3);
                    he2 he2Var8 = hj6.x;
                    dec.l(he2Var8, l46Var3, j09VarJ3);
                    mue mueVar = pue.a;
                    mue mueVarP = pue.p(l46Var3);
                    pr4 pr4Var = o82.a;
                    nte.b(str3, null, ((m82) l46Var3.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarP, l46Var3, 0, 0, 131066);
                    mue mueVar2 = oue.a;
                    nte.b(str4, null, y72.b(((m82) l46Var3.k(pr4Var)).q, 0.72f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var3), l46Var3, 0, 0, 131066);
                    t7c t7cVarA3 = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var3, 54);
                    int iHashCode4 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM4 = l46Var3.m();
                    j09 j09VarJ4 = m93.J(l46Var3, g09Var);
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(he2Var5, l46Var3, t7cVarA3);
                    dec.l(he2Var6, l46Var3, u8aVarM4);
                    ib8.s(iHashCode4, l46Var3, he2Var7, l46Var3);
                    dec.l(he2Var8, l46Var3, j09VarJ4);
                    nte.b(ub3.j(afc.q(R.string.auto_renew_expiry_date, l46Var3), "：", str5), null, y72.b(((m82) l46Var3.k(pr4Var)).q, 0.72f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var3), l46Var3, 0, 0, 131066);
                    String strQ = afc.q(en0Var.a() ? R.string.auto_renew_status_on : R.string.auto_renew_status_off, l46Var3);
                    if (en0Var.a()) {
                        l46Var3.f0(-1719907512);
                        j = ((m82) l46Var3.k(pr4Var)).a;
                        r5 = 0;
                    } else {
                        r5 = 0;
                        l46Var3.f0(-1719906263);
                        j = ((m82) l46Var3.k(pr4Var)).j;
                    }
                    l46Var3.r(r5);
                    hkg.O(strQ, j, l46Var3, r5);
                    l46Var3.r(true);
                    l46Var3.r(true);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 5:
                j09 j09Var = (j09) obj6;
                e89 e89Var2 = (e89) obj5;
                dd2 dd2Var = (dd2) obj4;
                ev0 ev0Var = (ev0) obj3;
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objR2 = l46Var4.R();
                    if (objR2 == i8cVar) {
                        objR2 = new pg(e89Var2, i2);
                        l46Var4.p0(objR2);
                    }
                    j09 j09VarW = nk8.w(j09Var, (a26) objR2);
                    xn8 xn8VarC = s21.c(ndb.b, true);
                    int iHashCode5 = Long.hashCode(l46Var4.T);
                    u8a u8aVarM5 = l46Var4.m();
                    j09 j09VarJ5 = m93.J(l46Var4, j09VarW);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, xn8VarC);
                    dec.l(hj6.y, l46Var4, u8aVarM5);
                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode5));
                    dec.k(l46Var4);
                    dec.l(hj6.x, l46Var4, j09VarJ5);
                    dd2Var.z(l46Var4, 0);
                    Object objR3 = l46Var4.R();
                    if (objR3 == i8cVar) {
                        objR3 = new i8(e89Var2, 13);
                        l46Var4.p0(objR3);
                    }
                    ev0Var.b((x16) objR3, l46Var4, 6);
                    l46Var4.r(true);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 6:
                ((Integer) obj2).getClass();
                lt2.d((tr2) obj6, (j09) obj5, (kzd) obj4, (x16) obj3, (l46) obj, k99.P(521));
                return wefVar;
            case 7:
                ((Integer) obj2).getClass();
                x57.k((List) obj6, (TarotCardChoice) obj5, (cs3) obj4, (j09) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 8:
                ((Integer) obj2).getClass();
                x57.l((cod) obj6, (y72) obj4, (x16) obj3, (j09) obj5, (l46) obj, k99.P(3073));
                return wefVar;
            case 9:
                ((Integer) obj2).getClass();
                nk8.g((DailyFortuneGuideTrigger) obj6, (x16) obj3, (x16) obj5, (j09) obj4, (l46) obj, k99.P(3073));
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                xj3.i((k75) obj6, (o26) obj5, (a26) obj4, (x16) obj3, (l46) obj, k99.P(9));
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                xj3.m((String) obj6, (x16) obj3, (x16) obj5, (j09) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                jmb jmbVar = (jmb) obj5;
                oia oiaVar = (oia) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                oiaVar.getClass();
                z7c.h((ctf) obj6, oiaVar);
                float f = jmbVar.element + fFloatValue;
                jmbVar.element = f;
                am3.b((n69) obj3, (f / 160.0f) + ((jmb) obj4).element);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                aw2 aw2Var = (aw2) obj6;
                t7 t7Var = (t7) obj5;
                s sVar = (s) obj4;
                e89 e89Var3 = (e89) obj3;
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zI = l46Var5.i(aw2Var) | l46Var5.i(t7Var) | l46Var5.i(sVar);
                    Object objR4 = l46Var5.R();
                    if (zI || objR4 == i8cVar) {
                        jr jrVar = new jr(aw2Var, t7Var, sVar, e89Var3, 12);
                        l46Var5.p0(jrVar);
                        objR4 = jrVar;
                    }
                    j74.n("查看当前状态", (x16) objR4, l46Var5, 6);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 14:
                final aw2 aw2Var2 = (aw2) obj6;
                final v vVar = (v) obj5;
                final mma mmaVar = (mma) obj4;
                ka9 ka9Var2 = (ka9) obj3;
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zI2 = l46Var6.i(aw2Var2) | l46Var6.i(vVar) | l46Var6.i(mmaVar) | l46Var6.i(ka9Var2);
                    Object objR5 = l46Var6.R();
                    if (zI2 || objR5 == i8cVar) {
                        h14 h14Var = new h14(aw2Var2, vVar, mmaVar, ka9Var2, 0);
                        l46Var6.p0(h14Var);
                        objR5 = h14Var;
                    }
                    j74.n("UI·首次占卜", (x16) objR5, l46Var6, 6);
                    boolean zI3 = l46Var6.i(aw2Var2) | l46Var6.i(vVar) | l46Var6.i(mmaVar) | l46Var6.i(ka9Var2);
                    Object objR6 = l46Var6.R();
                    if (zI3 || objR6 == i8cVar) {
                        h14 h14Var2 = new h14(aw2Var2, vVar, mmaVar, ka9Var2, 1);
                        l46Var6.p0(h14Var2);
                        objR6 = h14Var2;
                    }
                    j74.n("UI·关闭付费墙", (x16) objR6, l46Var6, 6);
                    boolean zI4 = l46Var6.i(aw2Var2) | l46Var6.i(vVar) | l46Var6.i(mmaVar) | l46Var6.i(ka9Var2);
                    Object objR7 = l46Var6.R();
                    if (zI4 || objR7 == i8cVar) {
                        h14 h14Var3 = new h14(aw2Var2, vVar, mmaVar, ka9Var2, 2);
                        l46Var6.p0(h14Var3);
                        objR7 = h14Var3;
                    }
                    j74.n("准备·首次占卜链路", (x16) objR7, l46Var6, 6);
                    boolean zI5 = l46Var6.i(aw2Var2) | l46Var6.i(vVar) | l46Var6.i(mmaVar) | l46Var6.i(ka9Var2);
                    Object objR8 = l46Var6.R();
                    if (zI5 || objR8 == i8cVar) {
                        h14 h14Var4 = new h14(ka9Var2, aw2Var2, vVar, mmaVar, 3);
                        ka9Var2 = ka9Var2;
                        aw2Var2 = aw2Var2;
                        vVar = vVar;
                        mmaVar = mmaVar;
                        l46Var6.p0(h14Var4);
                        objR8 = h14Var4;
                    }
                    j74.n("链路·拦截付费墙", (x16) objR8, l46Var6, 6);
                    boolean zI6 = l46Var6.i(aw2Var2) | l46Var6.i(vVar) | l46Var6.i(mmaVar) | l46Var6.i(ka9Var2);
                    Object objR9 = l46Var6.R();
                    if (zI6 || objR9 == i8cVar) {
                        v vVar2 = vVar;
                        aw2 aw2Var3 = aw2Var2;
                        ka9 ka9Var3 = ka9Var2;
                        mma mmaVar2 = mmaVar;
                        h14 h14Var5 = new h14(ka9Var3, aw2Var3, vVar2, mmaVar2, 4);
                        ka9Var2 = ka9Var3;
                        aw2Var2 = aw2Var3;
                        vVar = vVar2;
                        mmaVar = mmaVar2;
                        l46Var6.p0(h14Var5);
                        objR9 = h14Var5;
                    }
                    j74.n("链路·余额不足 Addon", (x16) objR9, l46Var6, 6);
                    boolean zI7 = l46Var6.i(aw2Var2) | l46Var6.i(vVar) | l46Var6.i(mmaVar) | l46Var6.i(ka9Var2);
                    Object objR10 = l46Var6.R();
                    if (zI7 || objR10 == i8cVar) {
                        v vVar3 = vVar;
                        aw2 aw2Var4 = aw2Var2;
                        ka9 ka9Var4 = ka9Var2;
                        mma mmaVar3 = mmaVar;
                        h14 h14Var6 = new h14(ka9Var4, aw2Var4, vVar3, mmaVar3, 5);
                        ka9Var2 = ka9Var4;
                        aw2Var2 = aw2Var4;
                        vVar = vVar3;
                        mmaVar = mmaVar3;
                        l46Var6.p0(h14Var6);
                        objR10 = h14Var6;
                    }
                    j74.n("链路·订阅次数不足 Addon", (x16) objR10, l46Var6, 6);
                    boolean zI8 = l46Var6.i(mmaVar) | l46Var6.i(ka9Var2);
                    Object objR11 = l46Var6.R();
                    if (zI8 || objR11 == i8cVar) {
                        objR11 = new k14(mmaVar, ka9Var2, false ? 1 : 0);
                        l46Var6.p0(objR11);
                    }
                    j74.n("一次性·拦截不重置", (x16) objR11, l46Var6, 6);
                    boolean zI9 = l46Var6.i(aw2Var2) | l46Var6.i(vVar) | l46Var6.i(mmaVar);
                    Object objR12 = l46Var6.R();
                    if (zI9 || objR12 == i8cVar) {
                        final boolean z2 = true ? 1 : 0;
                        objR12 = new x16() { // from class: j14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i5 = z2;
                                wef wefVar2 = wef.a;
                                mma mmaVar4 = mmaVar;
                                v vVar4 = vVar;
                                aw2 aw2Var5 = aw2Var2;
                                switch (i5) {
                                    case 0:
                                        ynb.V(aw2Var5, null, null, new i24(vVar4, mmaVar4, null), 3);
                                        break;
                                    case 1:
                                        ynb.V(aw2Var5, null, null, new m24(vVar4, DailyFortuneGuideTrigger.FirstReadingCompleted, mmaVar4, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var5, null, null, new m24(vVar4, DailyFortuneGuideTrigger.PaywallInterceptClose, mmaVar4, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var6.p0(objR12);
                    }
                    j74.n("挂起·首次占卜", (x16) objR12, l46Var6, 6);
                    boolean zI10 = l46Var6.i(aw2Var2) | l46Var6.i(vVar) | l46Var6.i(mmaVar);
                    Object objR13 = l46Var6.R();
                    if (zI10 || objR13 == i8cVar) {
                        objR13 = new x16() { // from class: j14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i5 = i4;
                                wef wefVar2 = wef.a;
                                mma mmaVar4 = mmaVar;
                                v vVar4 = vVar;
                                aw2 aw2Var5 = aw2Var2;
                                switch (i5) {
                                    case 0:
                                        ynb.V(aw2Var5, null, null, new i24(vVar4, mmaVar4, null), 3);
                                        break;
                                    case 1:
                                        ynb.V(aw2Var5, null, null, new m24(vVar4, DailyFortuneGuideTrigger.FirstReadingCompleted, mmaVar4, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var5, null, null, new m24(vVar4, DailyFortuneGuideTrigger.PaywallInterceptClose, mmaVar4, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var6.p0(objR13);
                    }
                    j74.n("挂起·关闭付费墙", (x16) objR13, l46Var6, 6);
                    boolean zI11 = l46Var6.i(aw2Var2) | l46Var6.i(vVar);
                    Object objR14 = l46Var6.R();
                    if (zI11 || objR14 == i8cVar) {
                        final boolean z3 = true ? 1 : 0;
                        objR14 = new x16() { // from class: i14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i5 = z3;
                                wef wefVar2 = wef.a;
                                v vVar4 = vVar;
                                aw2 aw2Var5 = aw2Var2;
                                switch (i5) {
                                    case 0:
                                        ynb.V(aw2Var5, null, null, new h24(vVar4, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var5, null, null, new g24(vVar4, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var6.p0(objR14);
                    }
                    j74.n("状态", (x16) objR14, l46Var6, 6);
                    boolean zI12 = l46Var6.i(aw2Var2) | l46Var6.i(vVar);
                    Object objR15 = l46Var6.R();
                    if (zI12 || objR15 == i8cVar) {
                        final int i5 = false ? 1 : 0;
                        objR15 = new x16() { // from class: i14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i6 = i5;
                                wef wefVar2 = wef.a;
                                v vVar4 = vVar;
                                aw2 aw2Var5 = aw2Var2;
                                switch (i6) {
                                    case 0:
                                        ynb.V(aw2Var5, null, null, new h24(vVar4, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var5, null, null, new g24(vVar4, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var6.p0(objR15);
                    }
                    j74.n("清除今日已抽", (x16) objR15, l46Var6, 6);
                    boolean zI13 = l46Var6.i(aw2Var2) | l46Var6.i(vVar) | l46Var6.i(mmaVar);
                    Object objR16 = l46Var6.R();
                    if (zI13 || objR16 == i8cVar) {
                        final int i6 = false ? 1 : 0;
                        objR16 = new x16() { // from class: j14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i7 = i6;
                                wef wefVar2 = wef.a;
                                mma mmaVar4 = mmaVar;
                                v vVar4 = vVar;
                                aw2 aw2Var5 = aw2Var2;
                                switch (i7) {
                                    case 0:
                                        ynb.V(aw2Var5, null, null, new i24(vVar4, mmaVar4, null), 3);
                                        break;
                                    case 1:
                                        ynb.V(aw2Var5, null, null, new m24(vVar4, DailyFortuneGuideTrigger.FirstReadingCompleted, mmaVar4, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var5, null, null, new m24(vVar4, DailyFortuneGuideTrigger.PaywallInterceptClose, mmaVar4, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var6.p0(objR16);
                    }
                    j74.n("重置", (x16) objR16, l46Var6, 6);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 15:
                x16 x16Var3 = (x16) obj3;
                fh4 fh4Var = (fh4) obj6;
                a26 a26Var = (a26) obj5;
                s69 s69Var = (s69) obj4;
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    dd2 dd2VarB2 = af1.b0(879591864, new i1(21, fh4Var), l46Var7);
                    dd2 dd2VarB3 = af1.b0(-476050961, new j41(a26Var, s69Var, fh4Var, i4), l46Var7);
                    boolean zG2 = l46Var7.g(x16Var3);
                    Object objR17 = l46Var7.R();
                    if (zG2 || objR17 == i8cVar) {
                        objR17 = new c20(12, x16Var3);
                        l46Var7.p0(objR17);
                    }
                    pa7.d(null, 0L, 0L, null, dd2VarB2, dd2VarB3, false, (x16) objR17, l46Var7, 221184, 79);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                if9.k((j09) obj6, (jaa) obj5, (x16) obj3, (x16) obj4, (l46) obj, k99.P(7));
                return wefVar;
            case 17:
                mic micVar = (mic) obj6;
                x16 x16Var4 = (x16) obj3;
                x16 x16Var5 = (x16) obj5;
                x16 x16Var6 = (x16) obj4;
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    pa7.b(null, afc.r(R.string.four_seasons_intro_toolbar_title, new Object[]{afc.q(rmc.a(micVar), l46Var8)}, l46Var8), true, true, x16Var4, af1.b0(-2077608701, new ht5(x16Var5, x16Var6, false ? 1 : 0), l46Var8), l46Var8, 200064, 1);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 18:
                ((Integer) obj2).getClass();
                kj0.a((cs3) obj6, (j09) obj5, (dd2) obj4, (dd2) obj3, (l46) obj, k99.P(28081));
                return wefVar;
            case 19:
                uo uoVar = (uo) obj6;
                Context context = (Context) obj5;
                x16 x16Var7 = (x16) obj3;
                x16 x16Var8 = (x16) obj4;
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zI14 = l46Var9.i(uoVar) | l46Var9.i(context) | l46Var9.g(x16Var7);
                    Object objR18 = l46Var9.R();
                    if (zI14 || objR18 == i8cVar) {
                        objR18 = new n25((Object) uoVar, (Object) context, x16Var7, 4);
                        l46Var9.p0(objR18);
                    }
                    b21.f((x16) objR18, x16Var8, l46Var9, 0);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 20:
                lsc lscVar = (lsc) obj6;
                uqc uqcVar = (uqc) obj5;
                orc orcVar = (orc) obj4;
                ka9 ka9Var5 = (ka9) obj3;
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    mic micVar2 = lscVar.e;
                    boolean z4 = uqcVar.c;
                    boolean zI15 = l46Var10.i(orcVar) | l46Var10.g(lscVar) | l46Var10.i(ka9Var5) | l46Var10.i(uqcVar);
                    Object objR19 = l46Var10.R();
                    if (zI15 || objR19 == i8cVar) {
                        ww5 ww5Var = new ww5(orcVar, lscVar, ka9Var5, uqcVar, 0);
                        ka9Var = ka9Var5;
                        l46Var10.p0(ww5Var);
                        objR19 = ww5Var;
                    } else {
                        ka9Var = ka9Var5;
                    }
                    a26 a26Var2 = (a26) objR19;
                    boolean zI16 = l46Var10.i(ka9Var);
                    Object objR20 = l46Var10.R();
                    if (zI16 || objR20 == i8cVar) {
                        objR20 = new vw5(ka9Var, i3);
                        l46Var10.p0(objR20);
                    }
                    x16 x16Var9 = (x16) objR20;
                    boolean zI17 = l46Var10.i(ka9Var);
                    Object objR21 = l46Var10.R();
                    if (zI17 || objR21 == i8cVar) {
                        objR21 = new vw5(ka9Var, i2);
                        l46Var10.p0(objR21);
                    }
                    vtb.d(micVar2, z4, a26Var2, x16Var9, (x16) objR21, l46Var10, 0);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case 21:
                ((Integer) obj2).getClass();
                pa6.o((x16) obj3, (x16) obj6, (x16) obj5, (a26) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 22:
                ((Integer) obj2).getClass();
                af1.n((gj6) obj6, (wp9) obj5, (x16) obj3, (x16) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 23:
                ((Integer) obj2).getClass();
                al6.d((j09) obj6, (zb4) obj5, (x16) obj3, (x16) obj4, (l46) obj, k99.P(65));
                return wefVar;
            case 24:
                ((Integer) obj2).getClass();
                od4.f((j09) obj6, (ma8) obj5, (x16) obj3, (n26) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 25:
                ((Integer) obj2).getClass();
                no6.r((ii6) obj6, (Scene) obj5, (x16) obj3, (j09) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 26:
                yc7 yc7Var = (yc7) obj6;
                use useVar = (use) obj5;
                x16 x16Var10 = (x16) obj3;
                h0e h0eVar2 = (h0e) obj4;
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    j09 j09VarC2 = b.c(g09Var, 1.0f);
                    boolean z5 = ((Boolean) h0eVar2.getValue()).booleanValue() && ((dg7) yc7Var.b.getValue()) == null;
                    boolean zI18 = l46Var11.i(yc7Var) | l46Var11.g(useVar) | l46Var11.g(x16Var10);
                    Object objR22 = l46Var11.R();
                    if (zI18 || objR22 == i8cVar) {
                        objR22 = new n25((Object) yc7Var, (Object) useVar, x16Var10, 10);
                        l46Var11.p0(objR22);
                    }
                    ym8.h(j09VarC2, z5, null, false, (x16) objR22, l46Var11, 6, 12);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case 27:
                return a(obj, obj2);
            case 28:
                return e(obj, obj2);
            default:
                iu8 iu8Var = (iu8) obj6;
                View view = (View) obj5;
                e89 e89Var4 = (e89) obj4;
                dd2 dd2Var2 = (dd2) obj3;
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    Object objR23 = l46Var12.R();
                    if (objR23 == i8cVar) {
                        objR23 = new w77(e89Var4, i4);
                        l46Var12.p0(objR23);
                    }
                    j09 j09VarW2 = nk8.w(g09Var, (a26) objR23);
                    Object objR24 = l46Var12.R();
                    if (objR24 == i8cVar) {
                        objR24 = new u42(iu8Var, e89Var4);
                        l46Var12.p0(objR24);
                    }
                    j09 j09VarA = ibe.a(j09VarW2, iu8Var, (PointerInputEventHandler) objR24);
                    xn8 xn8VarC2 = s21.c(ndb.b, true);
                    int iHashCode6 = Long.hashCode(l46Var12.T);
                    u8a u8aVarM6 = l46Var12.m();
                    j09 j09VarJ6 = m93.J(l46Var12, j09VarA);
                    lf2.q.getClass();
                    l46Var12.j0();
                    if (l46Var12.S) {
                        l46Var12.l(ov7Var);
                    } else {
                        l46Var12.s0();
                    }
                    dec.l(hj6.z, l46Var12, xn8VarC2);
                    dec.l(hj6.y, l46Var12, u8aVarM6);
                    dec.l(hj6.X, l46Var12, Integer.valueOf(iHashCode6));
                    dec.k(l46Var12);
                    dec.l(hj6.x, l46Var12, j09VarJ6);
                    tec.q(0, dd2Var2, l46Var12, true);
                    jsd jsdVar = iu8Var.a;
                    if (jsdVar.isEmpty()) {
                        z = false;
                    } else {
                        ListIterator listIterator = jsdVar.listIterator();
                        do {
                            ql6Var = (ql6) listIterator;
                            if (!ql6Var.hasNext()) {
                                z = false;
                            }
                        } while (((List) ((hu8) ql6Var.next()).a.c.getValue()).isEmpty());
                    }
                    boolean zI19 = l46Var12.i(view);
                    Object objR25 = l46Var12.R();
                    if (zI19 || objR25 == i8cVar) {
                        objR25 = new jf6(19, view, iu8Var);
                        l46Var12.p0(objR25);
                    }
                    rxg.a(z, (x16) objR25, l46Var12, 0, 0);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ q8(int i, x16 x16Var, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = x16Var;
        this.e = obj3;
    }

    public /* synthetic */ q8(x16 x16Var, Object obj, Object obj2, h0e h0eVar, int i) {
        this.a = i;
        this.d = x16Var;
        this.b = obj;
        this.c = obj2;
        this.e = h0eVar;
    }

    public /* synthetic */ q8(x16 x16Var, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.d = x16Var;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ q8(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    public /* synthetic */ q8(mic micVar, x16 x16Var, x16 x16Var2, x16 x16Var3) {
        this.a = 17;
        this.b = micVar;
        this.d = x16Var;
        this.c = x16Var2;
        this.e = x16Var3;
    }

    public /* synthetic */ q8(cod codVar, y72 y72Var, x16 x16Var, j09 j09Var, int i) {
        this.a = 8;
        this.b = codVar;
        this.e = y72Var;
        this.d = x16Var;
        this.c = j09Var;
    }

    public /* synthetic */ q8(Object obj, x16 x16Var, x16 x16Var2, j09 j09Var, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.d = x16Var;
        this.c = x16Var2;
        this.e = j09Var;
    }

    public /* synthetic */ q8(Object obj, Object obj2, x16 x16Var, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = x16Var;
        this.e = obj3;
    }

    public /* synthetic */ q8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    public /* synthetic */ q8(String str, y72 y72Var, String str2, x16 x16Var) {
        this.a = 0;
        this.b = str;
        this.e = y72Var;
        this.c = str2;
        this.d = x16Var;
    }
}
