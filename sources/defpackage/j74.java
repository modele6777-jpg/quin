package defpackage;

import ai.askquin.R;
import ai.askquin.ui.annual.c;
import ai.askquin.ui.paywall.upgrade.s;
import ai.askquin.ui.popup.dailyfortune.v;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.LocalDateTime;
import java.util.Iterator;
import tech.chatmind.api.Period;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j74 {
    public static final void A(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-1553234173);
        int i2 = i | 6;
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = nfcVarB.b(job.a.b(gd8.class), null, null);
                l46Var.p0(objR);
            }
            gd8 gd8Var = (gd8) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = af1.E(l46Var);
                l46Var.p0(objR2);
            }
            dd2 dd2VarB0 = af1.b0(-2068503400, new t14((aw2) objR2, gd8Var, i3), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("折扣活动", g09Var, false, dd2VarB0, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 11, j09Var);
        }
    }

    public static final void B(x16 x16Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(1984632610);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2 = l46Var;
            p("Intercept paywall", null, false, af1.b0(732144503, new m(24, x16Var), l46Var), l46Var2, 3078, 6);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m(i, 25, x16Var);
        }
    }

    public static final void C(int i, l46 l46Var) {
        l46 l46Var2;
        String str;
        l46Var.h0(-49940445);
        if (l46Var.W(i & 1, i != 0)) {
            hs3 hs3Var = xqa.P0;
            isa isaVar = hs3Var.a;
            Object obj = hs3Var.b;
            ypa.a.getClass();
            u34 u34Var = new u34(ypa.b(), isaVar, obj);
            Boolean bool = Boolean.FALSE;
            e89 e89VarI = jzb.i(u34Var, bool, l46Var, 48, 2);
            hs3 hs3Var2 = xqa.Q0;
            if (((Boolean) jzb.i(new y34(ypa.b(), hs3Var2.a, hs3Var2.b), bool, l46Var, 48, 2).getValue()).booleanValue()) {
                str = ((Boolean) e89VarI.getValue()).booleanValue() ? "老用户" : "新用户";
            } else {
                str = "未检测";
            }
            l46Var2 = l46Var;
            p(ib8.j("老用户状态 [当前: ", str, "]"), null, true, tm7.l, l46Var2, 3456, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i, 11);
        }
    }

    public static final void D(ka9 ka9Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(205109524);
        int i2 = (l46Var.i(ka9Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2 = l46Var;
            p("运营活动弹窗", null, true, af1.b0(1967300393, new o93(ka9Var, 21), l46Var), l46Var2, 3462, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var, i, 22);
        }
    }

    public static final void E(ka9 ka9Var, l46 l46Var, int i) {
        l46 l46Var2;
        Object next;
        pwf pwfVarH;
        l46Var.h0(-1380147993);
        int i2 = (l46Var.i(ka9Var) ? 4 : 2) | i;
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = z03.y;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            } else {
                l46Var2 = l46Var;
                p("五一限定弹窗", null, true, af1.b0(1739749106, new o14(i3, ka9Var, (mma) z5c.G(job.a.b(mma.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null)), l46Var), l46Var2, 3462, 2);
            }
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var, i, 17);
        }
    }

    public static final void F(int i, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(574971740);
        if (l46Var.W(i & 1, i != 0)) {
            l46Var2 = l46Var;
            p("NetSim 解读无剩余额度", null, false, tm7.f, l46Var2, 3078, 6);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i, 14);
        }
    }

    public static final void G(ka9 ka9Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-1377976405);
        int i2 = (l46Var.i(ka9Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2 = l46Var;
            p("新皮肤弹窗", null, true, af1.b0(2047801408, new o93(ka9Var, 24), l46Var), l46Var2, 3462, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var, i, 25);
        }
    }

    public static final void H(ka9 ka9Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(1203979982);
        int i2 = (l46Var.i(ka9Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2 = l46Var;
            p("通知设置页", null, false, af1.b0(-500177447, new o93(ka9Var, 8), l46Var), l46Var2, 3078, 6);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var, i, 10);
        }
    }

    public static final void I(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-30186725);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            dd2 dd2VarB0 = af1.b0(1176336422, new l14((Context) l46Var.k(uq.b), 3), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("Notification", g09Var, false, dd2VarB0, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 24, j09Var);
        }
    }

    public static final void J(int i, l46 l46Var) {
        l46 l46Var2;
        Object next;
        pwf pwfVarH;
        l46Var.h0(1909823211);
        if (l46Var.W(i & 1, i != 0)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            i8c i8cVar = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = z03.z;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                l46Var.r(false);
                pwfVarH = (pwf) next;
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarH);
            kob kobVar = job.a;
            mma mmaVar = (mma) z5c.G(kobVar.b(mma.class), pwfVarH.g(), null, gy2VarR, nfcVarB, null);
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG || objR2 == i8cVar) {
                objR2 = nfcVarB2.b(kobVar.b(gd8.class), null, null);
                l46Var.p0(objR2);
            }
            l46Var2 = l46Var;
            p("通知触点", null, true, af1.b0(-1178620938, new o14(5, mmaVar, (gd8) objR2), l46Var), l46Var2, 3462, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i, 18);
        }
    }

    public static final void K(ka9 ka9Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-2002215120);
        int i2 = i & 1;
        int i3 = 1;
        if (l46Var.W(i2, i2 != 0)) {
            l46Var2 = l46Var;
            p("Onboarding 通知页", null, true, af1.b0(-753904635, new l14((Context) l46Var.k(uq.b), 4), l46Var), l46Var2, 3462, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new u14(ka9Var, i, i3);
        }
    }

    public static final void L(int i, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(-645442491);
        if (l46Var.W(i & 1, i != 0)) {
            Context context = (Context) l46Var.k(uq.b);
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = nfcVarB.b(job.a.b(gpf.class), null, null);
                l46Var.p0(objR);
            }
            l46Var2 = l46Var;
            p("Opt-out 同步", null, true, af1.b0(-629644848, new o14(6, context, (gpf) objR), l46Var), l46Var2, 3462, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i, 19);
        }
    }

    public static final void M(int i, l46 l46Var) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(145600273);
        if (l46Var2.W(i & 1, i != 0)) {
            hs3 hs3Var = xqa.w0;
            isa isaVar = hs3Var.a;
            Object obj = hs3Var.b;
            ypa.a.getClass();
            e89 e89VarI = jzb.i(new b54(ypa.b(), isaVar, obj), "", l46Var2, 48, 2);
            hs3 hs3Var2 = xqa.x0;
            e89 e89VarI2 = jzb.i(new f54(ypa.b(), hs3Var2.a, hs3Var2.b), Boolean.FALSE, l46Var2, 48, 2);
            nfc nfcVarB = kr7.b(l46Var2);
            boolean zG = l46Var2.g(null) | l46Var2.g(nfcVarB);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = nfcVarB.b(job.a.b(ht6.class), null, null);
                l46Var2.p0(objR);
            }
            ht6 ht6Var = (ht6) objR;
            nfc nfcVarB2 = kr7.b(l46Var2);
            boolean zG2 = l46Var2.g(null) | l46Var2.g(nfcVarB2);
            Object objR2 = l46Var2.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = nfcVarB2.b(job.a.b(p5a.class), null, null);
                l46Var2.p0(objR2);
            }
            p5a p5aVar = (p5a) objR2;
            nfc nfcVarB3 = kr7.b(l46Var2);
            boolean zG3 = l46Var2.g(null) | l46Var2.g(nfcVarB3);
            Object objR3 = l46Var2.R();
            if (zG3 || objR3 == i8cVar) {
                objR3 = nfcVarB3.b(job.a.b(fab.class), null, null);
                l46Var2.p0(objR3);
            }
            fab fabVar = (fab) objR3;
            Object objR4 = l46Var2.R();
            if (objR4 == i8cVar) {
                objR4 = af1.E(l46Var2);
                l46Var2.p0(objR4);
            }
            aw2 aw2Var = (aw2) objR4;
            c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            String strJ = ib8.j("Paywall AB Test 1 强制分组（当前：", v4e.Q((String) e89VarI.getValue()) ? "未设置（走真实接口）" : (String) e89VarI.getValue(), "）");
            pr4 pr4Var = r9f.a;
            nte.b(strJ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(pr4Var)).k, l46Var, 0, 0, 131070);
            nte.b("切换会立刻拉一次 settings/query + paywall-skus + quota-usage；用于价格/SKU 分组。", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).l, l46Var, 6, 0, 131070);
            ynb.j(null, new uc0(8.0f, true, new qc0(0)), null, null, 0, 0, af1.b0(1209835926, new n50(aw2Var, ht6Var, p5aVar, fabVar, e89VarI, 3), l46Var), l46Var, 1572912, 61);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var, 54);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, g09Var);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            boolean zBooleanValue = ((Boolean) e89VarI2.getValue()).booleanValue();
            boolean z2 = pa7.t((String) e89VarI.getValue(), "experiment_1") || pa7.t((String) e89VarI.getValue(), "experiment_2");
            boolean zI = l46Var.i(aw2Var) | l46Var.i(ht6Var) | l46Var.i(p5aVar) | l46Var.i(fabVar);
            Object objR5 = l46Var.R();
            if (zI || objR5 == i8cVar) {
                objR5 = new wg(aw2Var, ht6Var, p5aVar, fabVar);
                l46Var.p0(objR5);
            }
            wbe.a(zBooleanValue, (a26) objR5, null, z2, null, l46Var, 0, 108);
            nte.b("已用首月特惠（仅 G2/G3 生效；G1 无首月态）", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).l, l46Var, 6, 0, 131070);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object N(ht6 ht6Var, p5a p5aVar, fab fabVar, zn2 zn2Var) {
        i54 i54Var;
        fab fabVar2;
        if (zn2Var instanceof i54) {
            i54Var = (i54) zn2Var;
            int i = i54Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                i54Var.label = i - Integer.MIN_VALUE;
            } else {
                i54Var = new i54(zn2Var);
            }
        } else {
            i54Var = new i54(zn2Var);
        }
        Object obj = i54Var.result;
        int i2 = i54Var.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            i54Var.L$0 = null;
            i54Var.L$1 = p5aVar;
            i54Var.L$2 = fabVar;
            i54Var.label = 1;
            if (((cb) ht6Var).a(i54Var) != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            fabVar = (fab) i54Var.L$2;
            p5aVar = (p5a) i54Var.L$1;
            jzb.q(obj);
        } else if (i2 == 2) {
            fabVar2 = (fab) i54Var.L$2;
            jzb.q(obj);
            i54Var.L$0 = null;
            i54Var.L$1 = null;
            i54Var.L$2 = null;
            i54Var.label = 3;
            if (((rab) fabVar2).b(i54Var) != bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wefVar;
        i54Var.L$0 = null;
        i54Var.L$1 = null;
        i54Var.L$2 = fabVar;
        i54Var.label = 2;
        u5a u5aVar = (u5a) p5aVar;
        u5aVar.getClass();
        js3 js3Var = ga4.a;
        Object objP0 = ynb.p0(hr3.c, new t5a(u5aVar, null), i54Var);
        if (objP0 != bw2Var) {
            objP0 = wefVar;
        }
        if (objP0 != bw2Var) {
            fabVar2 = fabVar;
            i54Var.L$0 = null;
            i54Var.L$1 = null;
            i54Var.L$2 = null;
            i54Var.label = 3;
            if (((rab) fabVar2).b(i54Var) != bw2Var) {
                return wefVar;
            }
        }
        return bw2Var;
    }

    public static final void O(int i, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(1734973520);
        if (l46Var.W(i & 1, i != 0)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            l46Var2 = l46Var;
            p("Paywall 缓存", null, true, af1.b0(1900693925, new i1(18, (aw2) objR), l46Var), l46Var2, 3462, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i, 17);
        }
    }

    public static final void P(ka9 ka9Var, j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(451946764);
        int i2 = (l46Var.i(ka9Var) ? 4 : 2) | i | 48;
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = nfcVarB.b(job.a.b(q9b.class), null, null);
                l46Var.p0(objR);
            }
            dd2 dd2VarB0 = af1.b0(-754711145, new o14(i3, ka9Var, (q9b) objR), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("Regular Paywall", g09Var, true, dd2VarB0, l46Var2, 3510, 0);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p14(ka9Var, j09Var, i, i3);
        }
    }

    public static final void Q(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(1890870334);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            dd2 dd2Var = tm7.n;
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("切牌提示", g09Var, false, dd2Var, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 15, j09Var);
        }
    }

    public static final void R(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(283688802);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            dd2 dd2Var = tm7.m;
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("抽卡提示", g09Var, false, dd2Var, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 13, j09Var);
        }
    }

    public static final void S(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(1879695729);
        int i2 = i | 6;
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            dd2 dd2VarB0 = af1.b0(1364426502, new l14((Context) l46Var.k(uq.b), i3), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("Onboarding", g09Var, true, dd2VarB0, l46Var2, 3510, 0);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 9, j09Var);
        }
    }

    public static final void T(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-969187951);
        int i2 = i | 6;
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = nfcVarB.b(job.a.b(gd8.class), null, null);
                l46Var.p0(objR);
            }
            gd8 gd8Var = (gd8) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = af1.E(l46Var);
                l46Var.p0(objR2);
            }
            dd2 dd2VarB0 = af1.b0(2073291238, new t14((aw2) objR2, gd8Var, i3), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("首页引导动画", g09Var, false, dd2VarB0, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 12, j09Var);
        }
    }

    public static final void U(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(1564555086);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = nfcVarB.b(job.a.b(fcb.class), null, null);
                l46Var.p0(objR);
            }
            dd2 dd2VarB0 = af1.b0(1730275491, new i1(16, (fcb) objR), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("重置评分记录时间", g09Var, false, dd2VarB0, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 7, j09Var);
        }
    }

    public static final void V(int i, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(-1205282412);
        if (l46Var.W(i & 1, i != 0)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = nfcVarB.b(job.a.b(k2c.class), null, null);
                l46Var.p0(objR);
            }
            k2c k2cVar = (k2c) objR;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = nfcVarB2.b(job.a.b(t7.class), null, null);
                l46Var.p0(objR2);
            }
            l46Var2 = l46Var;
            p("评价奖励状态", null, true, af1.b0(-1189484769, new o14(11, (t7) objR2, k2cVar), l46Var), l46Var2, 3462, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i, 21);
        }
    }

    public static final void W(t7 t7Var, l26 l26Var, a26 a26Var) {
        ynb.V(lw2.a, null, null, new v54(t7Var, l26Var, a26Var, null), 3);
    }

    public static final void X(ka9 ka9Var, l46 l46Var, int i) {
        l46 l46Var2;
        Object next;
        pwf pwfVarH;
        l46Var.h0(304889901);
        int i2 = (l46Var.i(ka9Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = z03.X;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            } else {
                l46Var2 = l46Var;
                p("样例数据进结果流", null, false, af1.b0(-870180296, new o14((orc) z5c.G(job.a.b(orc.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null), ka9Var), l46Var), l46Var2, 3078, 6);
            }
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var, i, 18);
        }
    }

    public static final void Y(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-179075386);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = nfcVarB.b(job.a.b(xof.class), null, null);
                l46Var.p0(objR);
            }
            xof xofVar = (xof) objR;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = nfcVarB2.b(job.a.b(kmd.class), null, null);
                l46Var.p0(objR2);
            }
            kmd kmdVar = (kmd) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = af1.E(l46Var);
                l46Var.p0(objR3);
            }
            dd2 dd2VarB0 = af1.b0(-1229303333, new x6((aw2) objR3, xofVar, kmdVar, 24), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("设置未下载皮肤", g09Var, true, dd2VarB0, l46Var2, 3510, 0);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 18, j09Var);
        }
    }

    public static final void Z(int i, l46 l46Var) {
        l46 l46Var2;
        String strI;
        Period period;
        l46Var.h0(1173351451);
        int i2 = 0;
        if (l46Var.W(i & 1, i != 0)) {
            nfc nfcVarB = kr7.b(l46Var);
            String string = null;
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = nfcVarB.b(job.a.b(q9b.class), null, null);
                l46Var.p0(objR);
            }
            objR.getClass();
            eab eabVar = (eab) objR;
            l46Var.f0(-1985648971);
            QuotaUsage quotaUsageB = eabVar.b();
            SubscriptionInfo subscription = quotaUsageB != null ? quotaUsageB.getSubscription() : null;
            o7e subscriptionLevel = subscription != null ? subscription.getSubscriptionLevel() : null;
            if (subscriptionLevel == null) {
                l46Var.f0(1360397712);
                l46Var.r(false);
                strI = null;
            } else {
                l46Var.f0(-94663535);
                int i3 = j64.a[subscriptionLevel.ordinal()];
                if (i3 == 1) {
                    strI = tec.i(l46Var, -2056653610, R.string.paywall_member_type_basic, l46Var, false);
                } else if (i3 == 2) {
                    strI = tec.i(l46Var, -2056650892, R.string.paywall_member_type_pro, l46Var, false);
                } else if (i3 != 3) {
                    l46Var.f0(668482046);
                    l46Var.r(false);
                    strI = null;
                } else {
                    strI = tec.i(l46Var, -2056648232, R.string.paywall_member_type_supreme, l46Var, false);
                }
                l46Var.r(false);
            }
            if (strI == null) {
                if (subscription != null && (period = subscription.getPeriod()) != null) {
                    string = period.toString();
                }
                strI = string == null ? "无订阅" : string;
            }
            l46Var.r(false);
            l46Var2 = l46Var;
            p("Subscription (" + strI + ")", null, true, af1.b0(-645468496, new f14(eabVar, i2), l46Var), l46Var2, 3456, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i, 13);
        }
    }

    public static final void a(ka9 ka9Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(2041292207);
        int i2 = 4;
        int i3 = (l46Var.i(ka9Var) ? 4 : 2) | i;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            l46Var2 = l46Var;
            p("Annual Fortune Entry", null, false, af1.b0(991064260, new o93(ka9Var, i2), l46Var), l46Var2, 3078, 6);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var, i, 5);
        }
    }

    public static final void a0(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-795323806);
        int i2 = i | 6;
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = nfcVarB.b(job.a.b(gd8.class), null, null);
                l46Var.p0(objR);
            }
            dd2 dd2VarB0 = af1.b0(-1210456201, new a14((gd8) objR, i3), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("Today free draw", g09Var, false, dd2VarB0, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 6, j09Var);
        }
    }

    public static final void b(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-2056861384);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                hs3 hs3Var = xqa.u;
                Boolean bool = (Boolean) z5c.I(nu4.a, new x10(hs3Var.a, hs3Var.b, null));
                bool.getClass();
                objR = q1c.f(bool);
                l46Var.p0(objR);
            }
            dd2 dd2VarB0 = af1.b0(-2008603891, new hr((e89) objR, 5), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("年运活动2026", g09Var, false, dd2VarB0, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 8, j09Var);
        }
    }

    public static final void b0(ka9 ka9Var, l46 l46Var, int i) {
        ka9 ka9Var2;
        Context context;
        l46Var.h0(829576046);
        int i2 = i | (l46Var.i(ka9Var) ? 4 : 2);
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Context context2 = (Context) l46Var.k(uq.b);
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB.b(job.a.b(s.class), null, null);
                l46Var.p0(objR);
            }
            s sVar = (s) objR;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                objR2 = nfcVarB2.b(job.a.b(t7.class), null, null);
                l46Var.p0(objR2);
            }
            t7 t7Var = (t7) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = af1.E(l46Var);
                l46Var.p0(objR3);
            }
            aw2 aw2Var = (aw2) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == obj) {
                objR4 = q1c.f(null);
                l46Var.p0(objR4);
            }
            e89 e89Var = (e89) objR4;
            p("自动触发状态 · 只读", null, true, af1.b0(-1662719239, new q8(aw2Var, t7Var, sVar, e89Var, 13), l46Var), l46Var, 3462, 2);
            String str = (String) e89Var.getValue();
            if (str == null) {
                l46Var.f0(659030723);
                l46Var.r(false);
                context = context2;
            } else {
                l46Var.f0(659030724);
                context = context2;
                nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
                l46Var.r(false);
            }
            nte.b("UI 预览使用演示商品，不发起购买；可直接切换套餐、展开 5 次卡并检查协议。", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 6, 0, 262142);
            Context context3 = context;
            p("UI 预览 · 月卡首月优惠", null, true, af1.b0(1655754018, new l14(context3, 1), l46Var), l46Var, 3462, 2);
            p("UI 预览 · 月卡无优惠", null, true, af1.b0(-1471017023, new l14(context3, 2), l46Var), l46Var, 3462, 2);
            ka9Var2 = ka9Var;
            p("真实商品与支付 · 后端联调", null, true, af1.b0(-302820768, new o93(ka9Var2, 13), l46Var), l46Var, 3462, 2);
        } else {
            ka9Var2 = ka9Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var2, i, 14);
        }
    }

    public static final void c(ka9 ka9Var, j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-1859648194);
        int i2 = 2;
        int i3 = (l46Var.i(ka9Var) ? 4 : 2) | i | 48;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            dd2 dd2VarB0 = af1.b0(-154700845, new o93(ka9Var, 28), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("年运会员弹窗", g09Var, false, dd2VarB0, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p14(ka9Var, j09Var, i, i2);
        }
    }

    public static final void c0(j09 j09Var, l46 l46Var, int i) {
        j09 j09Var2;
        l46Var.h0(336600327);
        int i2 = i | 6;
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB.b(job.a.b(q9b.class), null, null);
                l46Var.p0(objR);
            }
            q9b q9bVar = (q9b) objR;
            q9bVar.getClass();
            eab eabVar = (eab) q9bVar;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                objR2 = nfcVarB2.b(job.a.b(fab.class), null, null);
                l46Var.p0(objR2);
            }
            dd2 dd2VarB0 = af1.b0(1543123474, new f14(eabVar, i3), l46Var);
            j09Var2 = g09.a;
            p("Usage mock · 账号", j09Var2, true, dd2VarB0, l46Var, 3510, 0);
            p("Usage mock · 限制", j09Var2, true, af1.b0(1649905851, new o14(8, eabVar, (fab) objR2), l46Var), l46Var, 3510, 0);
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 21, j09Var2);
        }
    }

    public static final void d(ka9 ka9Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-20156242);
        int i2 = (l46Var.i(ka9Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2 = l46Var;
            p("卡牌布局调试", null, false, af1.b0(1782515769, new o93(ka9Var, 6), l46Var), l46Var2, 3078, 6);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var, i, 7);
        }
    }

    public static final void d0(j09 j09Var, l46 l46Var, int i) {
        l46Var.h0(-2038342626);
        int i2 = 2;
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            Context context = (Context) l46Var.k(uq.b);
            use useVarO = n3d.o(null, l46Var, 3);
            b21.j(useVarO, mh3.L(j09Var), false, null, null, null, tm7.q, af1.b0(1862437414, new o14(i2, useVarO, context), l46Var), null, null, null, null, null, null, l46Var, 12582912, 48, 33552252);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 16, j09Var);
        }
    }

    public static final void e(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-1132570624);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = nfcVarB.b(job.a.b(c.class), null, null);
                l46Var.p0(objR);
            }
            c cVar = (c) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = af1.E(l46Var);
                l46Var.p0(objR2);
            }
            dd2 dd2VarB0 = af1.b0(2112168725, new o14(4, (aw2) objR2, cVar), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("年运活动进度", g09Var, false, dd2VarB0, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 19, j09Var);
        }
    }

    public static final void e0(ka9 ka9Var, l46 l46Var, int i) {
        l46 l46Var2;
        Object next;
        pwf pwfVarH;
        l46Var.h0(49391706);
        int i2 = (l46Var.i(ka9Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            pr4 pr4Var = uq.b;
            Context context = (Context) l46Var.k(pr4Var);
            nfc nfcVarB = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(pr4Var);
                Object objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = z03.Y;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            } else {
                l46Var2 = l46Var;
                p("小组件引导弹窗", null, true, af1.b0(383331237, new x6(context, (mma) z5c.G(job.a.b(mma.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null), ka9Var, 21), l46Var), l46Var2, 3462, 2);
            }
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var, i, 11);
        }
    }

    public static final void f(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(904413253);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            dd2 dd2Var = tm7.k;
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("删除登录Cookies", g09Var, false, dd2Var, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 5, j09Var);
        }
    }

    public static final void f0(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-846970059);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                hs3 hs3Var = xqa.r0;
                objR = q1c.f(z5c.I(nu4.a, new c74(hs3Var.a, hs3Var.b, null)));
                l46Var.p0(objR);
            }
            dd2 dd2VarB0 = af1.b0(955701952, new hr((e89) objR, 6), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("年卡解锁全部塔罗牌", g09Var, false, dd2VarB0, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 20, j09Var);
        }
    }

    public static final void g(int i, l46 l46Var) {
        l46Var.h0(469718724);
        final int i2 = 0;
        final int i3 = 1;
        if (l46Var.W(i & 1, i != 0)) {
            Context context = (Context) l46Var.k(uq.b);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            final aw2 aw2Var = (aw2) objR;
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = nfcVarB.b(job.a.b(nb4.class), null, null);
                l46Var.p0(objR2);
            }
            final nb4 nb4Var = (nb4) objR2;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj) {
                objR3 = nfcVarB2.b(job.a.b(s7.class), null, null);
                l46Var.p0(objR3);
            }
            s7 s7Var = (s7) objR3;
            nfc nfcVarB3 = kr7.b(l46Var);
            boolean zG3 = l46Var.g(null) | l46Var.g(nfcVarB3);
            Object objR4 = l46Var.R();
            if (zG3 || objR4 == obj) {
                objR4 = nfcVarB3.b(job.a.b(tc4.class), null, null);
                l46Var.p0(objR4);
            }
            p("CursorWindow 崩溃历史行", null, true, af1.b0(485516367, new x6(aw2Var, nb4Var, s7Var, 22), l46Var), l46Var, 3462, 2);
            p("Legacy import", null, true, af1.b0(-1733314440, new x6(context, aw2Var, nb4Var, 23), l46Var), l46Var, 3462, 2);
            p("Cloud refresh", null, true, af1.b0(-779085545, new h8(29, aw2Var, (tc4) objR4), l46Var), l46Var, 3462, 2);
            p("Counts", null, true, af1.b0(175143350, new l26() { // from class: m14
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    int i4 = i2;
                    wef wefVar = wef.a;
                    i8c i8cVar = sf2.a;
                    nb4 nb4Var2 = nb4Var;
                    aw2 aw2Var2 = aw2Var;
                    int i5 = 2;
                    int i6 = 1;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i4) {
                        case 0:
                            if (!l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                l46Var2.Z();
                            } else {
                                boolean zI = l46Var2.i(aw2Var2) | l46Var2.i(nb4Var2);
                                Object objR5 = l46Var2.R();
                                if (zI || objR5 == i8cVar) {
                                    objR5 = new q14(aw2Var2, nb4Var2, i6);
                                    l46Var2.p0(objR5);
                                }
                                j74.n("Unsynced", (x16) objR5, l46Var2, 6);
                                boolean zI2 = l46Var2.i(aw2Var2) | l46Var2.i(nb4Var2);
                                Object objR6 = l46Var2.R();
                                if (zI2 || objR6 == i8cVar) {
                                    objR6 = new q14(aw2Var2, nb4Var2, i5);
                                    l46Var2.p0(objR6);
                                }
                                j74.n("Soft-deleted", (x16) objR6, l46Var2, 6);
                            }
                            break;
                        default:
                            if (!l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                l46Var2.Z();
                            } else {
                                boolean zI3 = l46Var2.i(aw2Var2) | l46Var2.i(nb4Var2);
                                Object objR7 = l46Var2.R();
                                if (zI3 || objR7 == i8cVar) {
                                    objR7 = new q14(aw2Var2, nb4Var2, 3);
                                    l46Var2.p0(objR7);
                                }
                                j74.n("Clear deletedAt", (x16) objR7, l46Var2, 6);
                            }
                            break;
                    }
                    return wefVar;
                }
            }, l46Var), l46Var, 3462, 2);
            p("Soft delete", null, true, af1.b0(1129372245, new l26() { // from class: m14
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    int i4 = i3;
                    wef wefVar = wef.a;
                    i8c i8cVar = sf2.a;
                    nb4 nb4Var2 = nb4Var;
                    aw2 aw2Var2 = aw2Var;
                    int i5 = 2;
                    int i6 = 1;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i4) {
                        case 0:
                            if (!l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                l46Var2.Z();
                            } else {
                                boolean zI = l46Var2.i(aw2Var2) | l46Var2.i(nb4Var2);
                                Object objR5 = l46Var2.R();
                                if (zI || objR5 == i8cVar) {
                                    objR5 = new q14(aw2Var2, nb4Var2, i6);
                                    l46Var2.p0(objR5);
                                }
                                j74.n("Unsynced", (x16) objR5, l46Var2, 6);
                                boolean zI2 = l46Var2.i(aw2Var2) | l46Var2.i(nb4Var2);
                                Object objR6 = l46Var2.R();
                                if (zI2 || objR6 == i8cVar) {
                                    objR6 = new q14(aw2Var2, nb4Var2, i5);
                                    l46Var2.p0(objR6);
                                }
                                j74.n("Soft-deleted", (x16) objR6, l46Var2, 6);
                            }
                            break;
                        default:
                            if (!l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                l46Var2.Z();
                            } else {
                                boolean zI3 = l46Var2.i(aw2Var2) | l46Var2.i(nb4Var2);
                                Object objR7 = l46Var2.R();
                                if (zI3 || objR7 == i8cVar) {
                                    objR7 = new q14(aw2Var2, nb4Var2, 3);
                                    l46Var2.p0(objR7);
                                }
                                j74.n("Clear deletedAt", (x16) objR7, l46Var2, 6);
                            }
                            break;
                    }
                    return wefVar;
                }
            }, l46Var), l46Var, 3462, 2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i, 15);
        }
    }

    public static final void h(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(204505535);
        int i2 = i | 6;
        int i3 = 17;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = nfcVarB.b(job.a.b(q9b.class), null, null);
                l46Var.p0(objR);
            }
            dd2 dd2VarB0 = af1.b0(-310763692, new i1(17, (q9b) objR), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("Compensate (5 total, 2 used)", g09Var, false, dd2VarB0, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, i3, j09Var);
        }
    }

    public static final void i(a26 a26Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-552478861);
        int i2 = 4;
        int i3 = (l46Var.i(a26Var) ? 4 : 2) | i;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            l46Var2 = l46Var;
            p("Congratulation (撒金币)", null, false, af1.b0(-1067748088, new k50(a26Var, i2), l46Var), l46Var2, 3078, 6);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k50(i, 5, a26Var);
        }
    }

    public static final void j(x16 x16Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(1860744494);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2 = l46Var;
            p("Usage credit pack paywall", null, false, af1.b0(1688318841, new m(26, x16Var), l46Var), l46Var2, 3078, 6);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m(i, 27, x16Var);
        }
    }

    public static final void k(j09 j09Var, l46 l46Var, int i) {
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1686558134);
        int i2 = i | 6;
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            hs3 hs3Var = xqa.U;
            use useVarO = n3d.o((String) z5c.I(nu4.a, new ji4(hs3Var.a, hs3Var.b, null)), l46Var2, 2);
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(b.c(g09Var, 1.0f), 16.0f, 8.0f);
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA0);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            nte.b("当前域名: https://quin.love", null, ((m82) l46Var2.k(o82.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).l, l46Var, 0, 0, 131066);
            b21.j(useVarO, b.c(g09Var, 1.0f), false, null, null, tm7.g, tm7.h, null, null, gec.x, null, null, null, null, l46Var, 14155824, 100663296, 33292092);
            j09Var2 = g09Var;
            j09 j09VarC = b.c(j09Var2, 1.0f);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var, 6);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarC);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            jw7 jw7Var = new jw7(1.0f, true);
            boolean zG = l46Var.g(useVarO);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = new zr1(useVarO, 3);
                l46Var.p0(objR);
            }
            cgg.a((x16) objR, jw7Var, false, null, null, null, null, null, tm7.i, l46Var, 805306368, 508);
            boolean zG2 = l46Var.g(useVarO);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = new zr1(useVarO, 4);
                l46Var.p0(objR2);
            }
            cgg.m((x16) objR2, null, false, null, null, null, tm7.j, l46Var, 805306368, 510);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 10, j09Var2);
        }
    }

    public static final void l(ka9 ka9Var, l46 l46Var, int i) {
        Object next;
        pwf pwfVarH;
        l46Var.h0(2033829185);
        int i2 = (l46Var.i(ka9Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            Object obj = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == obj) {
                    objR = z03.x;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarH);
            kob kobVar = job.a;
            mma mmaVar = (mma) z5c.G(kobVar.b(mma.class), pwfVarH.g(), null, gy2VarR, nfcVarB, null);
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = nfcVarB2.b(kobVar.b(v.class), null, null);
                l46Var.p0(objR2);
            }
            v vVar = (v) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = af1.E(l46Var);
                l46Var.p0(objR3);
            }
            p("今日运势推荐弹窗", null, true, af1.b0(1164639702, new q8((aw2) objR3, vVar, mmaVar, ka9Var, 14), l46Var), l46Var, 3462, 2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var, i, 15);
        }
    }

    public static final void m(int i, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(-1186566891);
        if (l46Var.W(i & 1, i != 0)) {
            Context context = (Context) l46Var.k(uq.b);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = q1c.f(0);
                l46Var.p0(objR);
            }
            l46Var2 = l46Var;
            p("今日运势 push 文案 (13条)", null, true, af1.b0(872595360, new o14(7, context, (e89) objR), l46Var), l46Var2, 3462, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i, 20);
        }
    }

    public static final void n(String str, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1807996554);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            cgg.m(x16Var, null, false, null, null, new bx9(8.0f, 2.0f, 8.0f, 2.0f), af1.b0(-1065160973, new ob0(str, 7), l46Var), l46Var, ((i2 >> 3) & 14) | 817889280, 382);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ik3(str, x16Var, i, i3);
        }
    }

    public static final void o(ka9 ka9Var, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, a26 a26Var, l46 l46Var, int i) {
        ka9 ka9Var2 = ka9Var;
        l46Var.h0(578636060);
        int i2 = i | (l46Var.i(ka9Var2) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(a26Var) ? 131072 : 65536);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            FillElement fillElement = b.c;
            j09 j09VarO = tm7.o(fillElement, ((m82) l46Var.k(o82.a)).n, g21.f);
            jx0 jx0Var = ndb.Y;
            c92 c92VarA = a92.a(xc0.c, jx0Var, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarO);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            pa7.a(null, 0L, 0L, null, tm7.a, null, false, false, x16Var, l46Var, ((i2 << 21) & 234881024) | 24576, 239);
            j09 j09VarA0 = ynb.a0(mh3.d0(fillElement, mh3.T(l46Var), false, 14), 16.0f, 12.0f);
            c92 c92VarA2 = a92.a(new uc0(12.0f, true, new qc0(0)), jx0Var, l46Var, 6);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarA0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            r("网络配置", tm7.b, l46Var, 390);
            r("账户与订阅", tm7.c, l46Var, 390);
            r("升级付费墙审查 · #1809", af1.b0(1351401439, new o93(ka9Var, 23), l46Var), l46Var, 390);
            ka9Var2 = ka9Var;
            r("支付与奖励", af1.b0(-1390478496, new cm(x16Var2, x16Var3, x16Var4, a26Var, ka9Var), l46Var), l46Var, 390);
            r("活动与通知", af1.b0(162608865, new o93(ka9Var2, 29), l46Var), l46Var, 390);
            r("抽卡相关", af1.b0(1715696226, new u14(ka9Var2, i3), l46Var), l46Var, 390);
            r("年度活动", af1.b0(-1026183709, new u14(ka9Var2, 2), l46Var), l46Var, 390);
            r("四季牌阵", af1.b0(526903652, new o93(ka9Var2, 9), l46Var), l46Var, 390);
            r("季运占卜（结果流 #1550）", af1.b0(2079991013, new o93(ka9Var2, 12), l46Var), l46Var, 390);
            r("界面", tm7.d, l46Var, 390);
            r("WebView 测试", af1.b0(473474916, new o93(ka9Var2, 16), l46Var), l46Var, 390);
            r("云同步调试", tm7.e, l46Var, 390);
            l46Var.r(true);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iq1(ka9Var2, x16Var, x16Var2, x16Var3, x16Var4, a26Var, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x016e  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0243  */
    /* JADX WARN: Code duplicated, block: B:67:0x024e  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void p(String str, j09 j09Var, boolean z, dd2 dd2Var, l46 l46Var, int i, int i2) {
        int i3;
        j09 j09Var2;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        j09 j09Var3;
        boolean z4;
        ojb ojbVarV;
        j09 j09Var4;
        boolean z5;
        ov7 ov7Var;
        int i6;
        int i7;
        l46 l46Var2 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var2.h0(1745123466);
        if ((i & 6) == 0) {
            i3 = (l46Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                j09Var2 = j09Var;
                i3 |= l46Var2.g(j09Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (l46Var2.h(z2)) {
                        i5 = 256;
                    } else {
                        i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (l46Var2.i(dd2Var)) {
                        i7 = 2048;
                    } else {
                        i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i3 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var2.W(i3 & 1, z3)) {
                    if (i8 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    ov7Var = LayoutNode.h1;
                    i6 = i3;
                    if (z5) {
                        l46Var2.f0(-1605783349);
                        j09 j09VarA0 = ynb.a0(b.c(j09Var4, 1.0f), 16.0f, 4.0f);
                        c92 c92VarA = a92.a(new uc0(2.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarA0);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var4, l46Var2, c92VarA);
                        dec.l(he2Var3, l46Var2, u8aVarM);
                        dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode));
                        dec.k(l46Var2);
                        dec.l(he2Var, l46Var2, j09VarJ);
                        j09Var3 = j09Var4;
                        nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).k, l46Var, i6 & 14, 0, 131070);
                        l46Var2 = l46Var;
                        ynb.j(null, new uc0(4.0f, true, new qc0(0)), new uc0(2.0f, true, new qc0(0)), null, 0, 0, af1.b0(-1877008128, new ec(dd2Var, 5), l46Var2), l46Var2, 1573296, 57);
                        l46Var2.r(true);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1605342622);
                        j09 j09VarA1 = ynb.a0(b.c(j09Var4, 1.0f), 16.0f, 4.0f);
                        t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var2, 54);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, j09VarA1);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var4, l46Var2, t7cVarA);
                        dec.l(he2Var3, l46Var2, u8aVarM2);
                        dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode2));
                        dec.k(l46Var2);
                        dec.l(he2Var, l46Var2, j09VarJ2);
                        j09Var3 = j09Var4;
                        nte.b(str, new jw7(1.0f, true), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).k, l46Var, i6 & 14, 0, 131068);
                        l46Var2 = l46Var;
                        ynb.j(null, new uc0(4.0f, true, new qc0(0)), new uc0(2.0f, true, new qc0(0)), null, 0, 0, af1.b0(1726013303, new ec(dd2Var, 6), l46Var2), l46Var2, 1573296, 57);
                        l46Var2.r(true);
                        l46Var2.r(false);
                    }
                    z4 = z5;
                } else {
                    l46Var2.Z();
                    j09Var3 = j09Var2;
                    z4 = z2;
                }
                ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new lc2(str, j09Var3, z4, dd2Var, i, i2);
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if (l46Var2.i(dd2Var)) {
                    i7 = 2048;
                } else {
                    i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i7;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var2.W(i3 & 1, z3)) {
                if (i8 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                ov7Var = LayoutNode.h1;
                i6 = i3;
                if (z5) {
                    l46Var2.f0(-1605783349);
                    j09 j09VarA2 = ynb.a0(b.c(j09Var4, 1.0f), 16.0f, 4.0f);
                    c92 c92VarA2 = a92.a(new uc0(2.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                    int iHashCode3 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM3 = l46Var2.m();
                    j09 j09VarJ3 = m93.J(l46Var2, j09VarA2);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var4, l46Var2, c92VarA2);
                    dec.l(he2Var3, l46Var2, u8aVarM3);
                    dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode3));
                    dec.k(l46Var2);
                    dec.l(he2Var, l46Var2, j09VarJ3);
                    j09Var3 = j09Var4;
                    nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).k, l46Var, i6 & 14, 0, 131070);
                    l46Var2 = l46Var;
                    ynb.j(null, new uc0(4.0f, true, new qc0(0)), new uc0(2.0f, true, new qc0(0)), null, 0, 0, af1.b0(-1877008128, new ec(dd2Var, 5), l46Var2), l46Var2, 1573296, 57);
                    l46Var2.r(true);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1605342622);
                    j09 j09VarA3 = ynb.a0(b.c(j09Var4, 1.0f), 16.0f, 4.0f);
                    t7c t7cVarA2 = s7c.a(xc0.g, ndb.z, l46Var2, 54);
                    int iHashCode4 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM4 = l46Var2.m();
                    j09 j09VarJ4 = m93.J(l46Var2, j09VarA3);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var4, l46Var2, t7cVarA2);
                    dec.l(he2Var3, l46Var2, u8aVarM4);
                    dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode4));
                    dec.k(l46Var2);
                    dec.l(he2Var, l46Var2, j09VarJ4);
                    j09Var3 = j09Var4;
                    nte.b(str, new jw7(1.0f, true), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).k, l46Var, i6 & 14, 0, 131068);
                    l46Var2 = l46Var;
                    ynb.j(null, new uc0(4.0f, true, new qc0(0)), new uc0(2.0f, true, new qc0(0)), null, 0, 0, af1.b0(1726013303, new ec(dd2Var, 6), l46Var2), l46Var2, 1573296, 57);
                    l46Var2.r(true);
                    l46Var2.r(false);
                }
                z4 = z5;
            } else {
                l46Var2.Z();
                j09Var3 = j09Var2;
                z4 = z2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new lc2(str, j09Var3, z4, dd2Var, i, i2);
            }
        }
        i3 |= 48;
        j09Var2 = j09Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (l46Var2.h(z2)) {
                    i5 = 256;
                } else {
                    i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (l46Var2.i(dd2Var)) {
                    i7 = 2048;
                } else {
                    i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i7;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var2.W(i3 & 1, z3)) {
                if (i8 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                ov7Var = LayoutNode.h1;
                i6 = i3;
                if (z5) {
                    l46Var2.f0(-1605783349);
                    j09 j09VarA4 = ynb.a0(b.c(j09Var4, 1.0f), 16.0f, 4.0f);
                    c92 c92VarA3 = a92.a(new uc0(2.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                    int iHashCode5 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM5 = l46Var2.m();
                    j09 j09VarJ5 = m93.J(l46Var2, j09VarA4);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var4, l46Var2, c92VarA3);
                    dec.l(he2Var3, l46Var2, u8aVarM5);
                    dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode5));
                    dec.k(l46Var2);
                    dec.l(he2Var, l46Var2, j09VarJ5);
                    j09Var3 = j09Var4;
                    nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).k, l46Var, i6 & 14, 0, 131070);
                    l46Var2 = l46Var;
                    ynb.j(null, new uc0(4.0f, true, new qc0(0)), new uc0(2.0f, true, new qc0(0)), null, 0, 0, af1.b0(-1877008128, new ec(dd2Var, 5), l46Var2), l46Var2, 1573296, 57);
                    l46Var2.r(true);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1605342622);
                    j09 j09VarA5 = ynb.a0(b.c(j09Var4, 1.0f), 16.0f, 4.0f);
                    t7c t7cVarA3 = s7c.a(xc0.g, ndb.z, l46Var2, 54);
                    int iHashCode6 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM6 = l46Var2.m();
                    j09 j09VarJ6 = m93.J(l46Var2, j09VarA5);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var4, l46Var2, t7cVarA3);
                    dec.l(he2Var3, l46Var2, u8aVarM6);
                    dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode6));
                    dec.k(l46Var2);
                    dec.l(he2Var, l46Var2, j09VarJ6);
                    j09Var3 = j09Var4;
                    nte.b(str, new jw7(1.0f, true), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).k, l46Var, i6 & 14, 0, 131068);
                    l46Var2 = l46Var;
                    ynb.j(null, new uc0(4.0f, true, new qc0(0)), new uc0(2.0f, true, new qc0(0)), null, 0, 0, af1.b0(1726013303, new ec(dd2Var, 6), l46Var2), l46Var2, 1573296, 57);
                    l46Var2.r(true);
                    l46Var2.r(false);
                }
                z4 = z5;
            } else {
                l46Var2.Z();
                j09Var3 = j09Var2;
                z4 = z2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new lc2(str, j09Var3, z4, dd2Var, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if (l46Var2.i(dd2Var)) {
                i7 = 2048;
            } else {
                i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var2.W(i3 & 1, z3)) {
            if (i8 != 0) {
                j09Var4 = g09.a;
            } else {
                j09Var4 = j09Var2;
            }
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            ov7Var = LayoutNode.h1;
            i6 = i3;
            if (z5) {
                l46Var2.f0(-1605783349);
                j09 j09VarA6 = ynb.a0(b.c(j09Var4, 1.0f), 16.0f, 4.0f);
                c92 c92VarA4 = a92.a(new uc0(2.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                int iHashCode7 = Long.hashCode(l46Var2.T);
                u8a u8aVarM7 = l46Var2.m();
                j09 j09VarJ7 = m93.J(l46Var2, j09VarA6);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var4, l46Var2, c92VarA4);
                dec.l(he2Var3, l46Var2, u8aVarM7);
                dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode7));
                dec.k(l46Var2);
                dec.l(he2Var, l46Var2, j09VarJ7);
                j09Var3 = j09Var4;
                nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).k, l46Var, i6 & 14, 0, 131070);
                l46Var2 = l46Var;
                ynb.j(null, new uc0(4.0f, true, new qc0(0)), new uc0(2.0f, true, new qc0(0)), null, 0, 0, af1.b0(-1877008128, new ec(dd2Var, 5), l46Var2), l46Var2, 1573296, 57);
                l46Var2.r(true);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1605342622);
                j09 j09VarA7 = ynb.a0(b.c(j09Var4, 1.0f), 16.0f, 4.0f);
                t7c t7cVarA4 = s7c.a(xc0.g, ndb.z, l46Var2, 54);
                int iHashCode8 = Long.hashCode(l46Var2.T);
                u8a u8aVarM8 = l46Var2.m();
                j09 j09VarJ8 = m93.J(l46Var2, j09VarA7);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var4, l46Var2, t7cVarA4);
                dec.l(he2Var3, l46Var2, u8aVarM8);
                dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode8));
                dec.k(l46Var2);
                dec.l(he2Var, l46Var2, j09VarJ8);
                j09Var3 = j09Var4;
                nte.b(str, new jw7(1.0f, true), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).k, l46Var, i6 & 14, 0, 131068);
                l46Var2 = l46Var;
                ynb.j(null, new uc0(4.0f, true, new qc0(0)), new uc0(2.0f, true, new qc0(0)), null, 0, 0, af1.b0(1726013303, new ec(dd2Var, 6), l46Var2), l46Var2, 1573296, 57);
                l46Var2.r(true);
                l46Var2.r(false);
            }
            z4 = z5;
        } else {
            l46Var2.Z();
            j09Var3 = j09Var2;
            z4 = z2;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lc2(str, j09Var3, z4, dd2Var, i, i2);
        }
    }

    public static final void q(cb9 cb9Var, l46 l46Var, int i) {
        Object a9Var;
        cb9 cb9Var2;
        cb9 cb9Var3 = cb9Var;
        l46Var.h0(538697712);
        int i2 = 2;
        int i3 = i | (l46Var.i(cb9Var3) ? 4 : 2);
        int i4 = 0;
        int i5 = 1;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            boolean zI = l46Var.i(cb9Var3);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zI || objR == i8cVar) {
                cb9Var2 = cb9Var;
                a9Var = new a9(0, cb9Var2, cb9.class, "popBackStack", "popBackStack()Z", 8, 8);
                l46Var.p0(a9Var);
            } else {
                cb9Var2 = cb9Var3;
                a9Var = objR;
            }
            x16 x16Var = (x16) a9Var;
            boolean zI2 = l46Var.i(cb9Var2);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == i8cVar) {
                objR2 = new r14(cb9Var2, i4);
                l46Var.p0(objR2);
            }
            x16 x16Var2 = (x16) objR2;
            boolean zI3 = l46Var.i(cb9Var2);
            Object objR3 = l46Var.R();
            if (zI3 || objR3 == i8cVar) {
                objR3 = new r14(cb9Var2, i5);
                l46Var.p0(objR3);
            }
            x16 x16Var3 = (x16) objR3;
            boolean zI4 = l46Var.i(cb9Var2);
            Object objR4 = l46Var.R();
            if (zI4 || objR4 == i8cVar) {
                objR4 = new r14(cb9Var2, i2);
                l46Var.p0(objR4);
            }
            x16 x16Var4 = (x16) objR4;
            boolean zI5 = l46Var.i(cb9Var2);
            Object objR5 = l46Var.R();
            if (zI5 || objR5 == i8cVar) {
                objR5 = new mr2(cb9Var2, i5);
                l46Var.p0(objR5);
            }
            cb9Var3 = cb9Var2;
            o(cb9Var3, x16Var, x16Var2, x16Var3, x16Var4, (a26) objR5, l46Var, i3 & 14);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s14(cb9Var3, i, i4);
        }
    }

    public static final void r(String str, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-665442164);
        int i2 = i | 48;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = {str, false};
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new vg3(29);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) vfh.I(objArr, (x16) objR, l46Var, 0);
            nae.a(null, ((s5d) l46Var.k(u5d.a)).c, 0L, 0L, 1.0f, 0.0f, null, af1.b0(-1614358447, new cm((((Boolean) e89Var.getValue()).booleanValue() ? "收起" : "展开").concat(str), e89Var, ((Boolean) e89Var.getValue()).booleanValue() ? "已展开" : "已收起", dd2Var, str), l46Var), l46Var, 12607488, 109);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o14(str, dd2Var, i, 10);
        }
    }

    public static final void s(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-419822628);
        int i2 = i | 6;
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = nfcVarB.b(job.a.b(gd8.class), null, null);
                l46Var.p0(objR);
            }
            dd2 dd2VarB0 = af1.b0(1876810407, new a14((gd8) objR, i3), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("Events", g09Var, true, dd2VarB0, l46Var2, 3510, 0);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 14, j09Var);
        }
    }

    public static final void t(ka9 ka9Var, j09 j09Var, l46 l46Var, int i) {
        int i2;
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1383886616);
        int i3 = i | (l46Var2.i(ka9Var) ? 4 : 2) | 48;
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            kx0 kx0Var = ndb.z;
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(16.0f, 0.0f, g09Var, 2);
            t7c t7cVarA = s7c.a(xc0.a, kx0Var, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            nte.b("EXIF 写入测试 (AI内容标识)", new jw7(1.0f, true), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 6, 0, 262140);
            l46Var2 = l46Var;
            boolean zI = l46Var2.i(ka9Var);
            Object objR = l46Var2.R();
            if (zI || objR == sf2.a) {
                objR = new a40(ka9Var, 21);
                l46Var2.p0(objR);
            }
            cgg.m((x16) objR, null, false, null, null, null, tm7.p, l46Var2, 805306368, 510);
            i2 = 1;
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            i2 = 1;
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p14(ka9Var, j09Var2, i, i2);
        }
    }

    public static final void u(x16 x16Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(1415888470);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2 = l46Var;
            p("Follow-up intercept paywall", null, false, af1.b0(-651549269, new m(28, x16Var), l46Var), l46Var2, 3078, 6);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m(i, 23, x16Var);
        }
    }

    public static final void v(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(-82441664);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                LocalDateTime localDateTime = xs5.a;
                hs3 hs3Var = xqa.v;
                Boolean bool = (Boolean) z5c.I(nu4.a, new ts5(hs3Var.a, hs3Var.b, null));
                bool.booleanValue();
                objR = q1c.f(bool);
                l46Var.p0(objR);
            }
            dd2 dd2VarB0 = af1.b0(-1132669611, new hr((e89) objR, 7), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("四季牌阵2026", g09Var, false, dd2VarB0, l46Var2, 3126, 4);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 23, j09Var);
        }
    }

    public static final void w(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(1136738289);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) l46Var.k(uq.b);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            dd2 dd2VarB0 = af1.b0(-930699450, new o14(9, (aw2) objR, context), l46Var);
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            p("四季牌阵通知", g09Var, true, dd2VarB0, l46Var2, 3510, 0);
            j09Var = g09Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 22, j09Var);
        }
    }

    public static final void x(int i, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(2124196403);
        if (l46Var.W(i & 1, i != 0)) {
            l46Var2 = l46Var;
            p("秋分通知弹窗", null, false, tm7.o, l46Var2, 3078, 6);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qv2(i, 12);
        }
    }

    public static final void y(ka9 ka9Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(2009235181);
        int i2 = (l46Var.i(ka9Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2 = l46Var;
            p("四季牌阵·夏至(二期)", null, false, af1.b0(2052154552, new o93(ka9Var, 19), l46Var), l46Var2, 3078, 6);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var, i, 20);
        }
    }

    public static final void z(ka9 ka9Var, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(1762321028);
        int i2 = (l46Var.i(ka9Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2 = l46Var;
            p("Free count reward", null, false, af1.b0(637320783, new o93(ka9Var, 26), l46Var), l46Var2, 3078, 6);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o93(ka9Var, i, 27);
        }
    }
}
