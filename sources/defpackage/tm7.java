package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import tech.chatmind.api.TarotReadingBody;
import tech.chatmind.api.TarotReadingHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tm7 {
    public static final za5 E;
    public static final za5[] F;
    public static gx6 G = null;
    public static boolean H = false;
    public static Method I = null;
    public static boolean J = false;
    public static Field K;
    public static final dd2 f;
    public static final dd2 h;
    public static final dd2 k;
    public static final dd2 l;
    public static final dd2 t;
    public static final dd2 v;
    public static final dd2 w;
    public static final dd2 x;
    public static final dd2 y;
    public static final dd2 a = new dd2(new gd2(28), false, 1028360092);
    public static final dd2 b = new dd2(new gd2(29), false, -1379293145);
    public static final dd2 c = new dd2(new md2(0), false, -201685922);
    public static final dd2 d = new dd2(new md2(1), false, -661888922);
    public static final dd2 e = new dd2(new md2(2), false, 2026562277);
    public static final dd2 g = new dd2(new kd2(13), false, 1975848603);
    public static final dd2 i = new dd2(new kd2(14), false, -405592172);
    public static final dd2 j = new dd2(new kd2(15), false, 1908159969);
    public static final dd2 m = new dd2(new md2(7), false, -968799305);
    public static final dd2 n = new dd2(new md2(8), false, -1197573815);
    public static final dd2 o = new dd2(new md2(9), false, 1951770750);
    public static final dd2 p = new dd2(new kd2(16), false, 434832983);
    public static final dd2 q = new dd2(new md2(10), false, -180179945);
    public static final dd2 r = new dd2(new kd2(17), false, 446275094);
    public static final dd2 s = new dd2(new kd2(18), false, 1849152697);
    public static final dd2 u = new dd2(new yd2(22), false, -445610726);
    public static final g5d z = g5d.a;
    public static final n82 A = n82.w;
    public static final float B = 4.0f;
    public static final float C = 32.0f;
    public static final float D = 1.0f;

    static {
        int i2 = 3;
        f = new dd2(new md2(i2), false, 1064698673);
        int i3 = 4;
        h = new dd2(new md2(i3), false, -1135915079);
        int i4 = 5;
        k = new dd2(new md2(i4), false, -1331391792);
        int i5 = 6;
        l = new dd2(new md2(i5), false, -34142802);
        t = new dd2(new ce2(i2), false, -722051115);
        v = new dd2(new ce2(i3), false, -1255555933);
        w = new dd2(new he2(i3), false, -249624663);
        x = new dd2(new he2(i4), false, -1582423864);
        y = new dd2(new he2(i5), false, 885595876);
        za5 za5Var = new za5("register", -1, 1L, true);
        E = za5Var;
        F = new za5[]{za5Var, new za5("unregister", -1, 1L, true)};
    }

    public static int A(float f2, int i2, int i3) {
        if (i2 == i3 || f2 <= 0.0f) {
            return i2;
        }
        if (f2 >= 1.0f) {
            return i3;
        }
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float f4 = ((i3 >> 24) & 255) / 255.0f;
        float fD = d(((i2 >> 16) & 255) / 255.0f);
        float fD2 = d(((i2 >> 8) & 255) / 255.0f);
        float fD3 = d((i2 & 255) / 255.0f);
        float fD4 = d(((i3 >> 16) & 255) / 255.0f);
        float fD5 = d(((i3 >> 8) & 255) / 255.0f);
        float fD6 = d((i3 & 255) / 255.0f);
        float fA = ks0.a(f4, f3, f2, f3);
        float fA2 = ks0.a(fD4, fD, f2, fD);
        float fA3 = ks0.a(fD5, fD2, f2, fD2);
        float fA4 = ks0.a(fD6, fD3, f2, fD3);
        float fI = i(fA2) * 255.0f;
        float fI2 = i(fA3) * 255.0f;
        return Math.round(i(fA4) * 255.0f) | (Math.round(fI) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fI2) << 8);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(wj5 wj5Var, xn2 xn2Var) {
        em5 em5Var;
        mmb mmbVarD;
        l e2;
        xj5 xj5Var;
        if (xn2Var instanceof em5) {
            em5Var = (em5) xn2Var;
            int i2 = em5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                em5Var.label = i2 - Integer.MIN_VALUE;
            } else {
                em5Var = new em5(xn2Var);
            }
        } else {
            em5Var = new em5(xn2Var);
        }
        Object obj = em5Var.result;
        int i3 = em5Var.label;
        ig4 ig4Var = rj9.a;
        if (i3 == 0) {
            mmbVarD = ks0.d(obj);
            mmbVarD.element = ig4Var;
            xj5 bm5Var = new bm5(mmbVarD);
            try {
                em5Var.L$0 = null;
                em5Var.L$1 = mmbVarD;
                em5Var.L$2 = null;
                em5Var.L$3 = bm5Var;
                em5Var.I$0 = 0;
                em5Var.label = 1;
                Object objB = wj5Var.b(bm5Var, em5Var);
                Object obj2 = bw2.a;
                if (objB == obj2) {
                    return obj2;
                }
            } catch (l e3) {
                e2 = e3;
                xj5Var = bm5Var;
                if (e2.a == xj5Var) {
                    throw e2;
                }
                tq.v(em5Var.getContext());
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xj5Var = (bm5) em5Var.L$3;
            mmbVarD = (mmb) em5Var.L$1;
            try {
                jzb.q(obj);
            } catch (l e4) {
                e2 = e4;
                if (e2.a == xj5Var) {
                    throw e2;
                }
                tq.v(em5Var.getContext());
            }
        }
        Object obj3 = mmbVarD.element;
        if (obj3 != ig4Var) {
            return obj3;
        }
        r3.n("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object C(wj5 wj5Var, l26 l26Var, xn2 xn2Var) {
        fm5 fm5Var;
        mmb mmbVar;
        l e2;
        xj5 xj5Var;
        if (xn2Var instanceof fm5) {
            fm5Var = (fm5) xn2Var;
            int i2 = fm5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fm5Var.label = i2 - Integer.MIN_VALUE;
            } else {
                fm5Var = new fm5(xn2Var);
            }
        } else {
            fm5Var = new fm5(xn2Var);
        }
        Object obj = fm5Var.result;
        int i3 = fm5Var.label;
        ig4 ig4Var = rj9.a;
        if (i3 == 0) {
            mmb mmbVarD = ks0.d(obj);
            mmbVarD.element = ig4Var;
            xj5 dm5Var = new dm5(l26Var, mmbVarD);
            try {
                fm5Var.L$0 = null;
                fm5Var.L$1 = null;
                fm5Var.L$2 = mmbVarD;
                fm5Var.L$3 = null;
                fm5Var.L$4 = dm5Var;
                fm5Var.I$0 = 0;
                fm5Var.label = 1;
                Object objB = wj5Var.b(dm5Var, fm5Var);
                Object obj2 = bw2.a;
                if (objB == obj2) {
                    return obj2;
                }
                mmbVar = mmbVarD;
            } catch (l e3) {
                mmbVar = mmbVarD;
                e2 = e3;
                xj5Var = dm5Var;
                if (e2.a == xj5Var) {
                    throw e2;
                }
                tq.v(fm5Var.getContext());
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xj5Var = (dm5) fm5Var.L$4;
            mmbVar = (mmb) fm5Var.L$2;
            try {
                jzb.q(obj);
            } catch (l e4) {
                e2 = e4;
                if (e2.a == xj5Var) {
                    throw e2;
                }
                tq.v(fm5Var.getContext());
            }
        }
        Object obj3 = mmbVar.element;
        if (obj3 != ig4Var) {
            return obj3;
        }
        r3.n("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object D(wj5 wj5Var, zn2 zn2Var) {
        jm5 jm5Var;
        mmb mmbVarD;
        l e2;
        xj5 xj5Var;
        if (zn2Var instanceof jm5) {
            jm5Var = (jm5) zn2Var;
            int i2 = jm5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jm5Var.label = i2 - Integer.MIN_VALUE;
            } else {
                jm5Var = new jm5(zn2Var);
            }
        } else {
            jm5Var = new jm5(zn2Var);
        }
        Object obj = jm5Var.result;
        int i3 = jm5Var.label;
        if (i3 == 0) {
            mmbVarD = ks0.d(obj);
            xj5 gm5Var = new gm5(mmbVarD);
            try {
                jm5Var.L$0 = null;
                jm5Var.L$1 = mmbVarD;
                jm5Var.L$2 = null;
                jm5Var.L$3 = gm5Var;
                jm5Var.I$0 = 0;
                jm5Var.label = 1;
                Object objB = wj5Var.b(gm5Var, jm5Var);
                Object obj2 = bw2.a;
                if (objB == obj2) {
                    return obj2;
                }
            } catch (l e3) {
                e2 = e3;
                xj5Var = gm5Var;
                if (e2.a == xj5Var) {
                    throw e2;
                }
                tq.v(jm5Var.getContext());
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xj5Var = (gm5) jm5Var.L$3;
            mmbVarD = (mmb) jm5Var.L$1;
            try {
                jzb.q(obj);
            } catch (l e4) {
                e2 = e4;
                if (e2.a == xj5Var) {
                    throw e2;
                }
                tq.v(jm5Var.getContext());
            }
        }
        return mmbVarD.element;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object E(wj5 wj5Var, l26 l26Var, zn2 zn2Var) {
        km5 km5Var;
        mmb mmbVar;
        l e2;
        xj5 xj5Var;
        if (zn2Var instanceof km5) {
            km5Var = (km5) zn2Var;
            int i2 = km5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                km5Var.label = i2 - Integer.MIN_VALUE;
            } else {
                km5Var = new km5(zn2Var);
            }
        } else {
            km5Var = new km5(zn2Var);
        }
        Object obj = km5Var.result;
        int i3 = km5Var.label;
        if (i3 == 0) {
            mmb mmbVarD = ks0.d(obj);
            xj5 im5Var = new im5(l26Var, mmbVarD);
            try {
                km5Var.L$0 = null;
                km5Var.L$1 = null;
                km5Var.L$2 = mmbVarD;
                km5Var.L$3 = null;
                km5Var.L$4 = im5Var;
                km5Var.I$0 = 0;
                km5Var.label = 1;
                Object objB = wj5Var.b(im5Var, km5Var);
                Object obj2 = bw2.a;
                if (objB == obj2) {
                    return obj2;
                }
                mmbVar = mmbVarD;
            } catch (l e3) {
                mmbVar = mmbVarD;
                e2 = e3;
                xj5Var = im5Var;
                if (e2.a == xj5Var) {
                    throw e2;
                }
                tq.v(km5Var.getContext());
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xj5Var = (im5) km5Var.L$4;
            mmbVar = (mmb) km5Var.L$2;
            try {
                jzb.q(obj);
            } catch (l e4) {
                e2 = e4;
                if (e2.a == xj5Var) {
                    throw e2;
                }
                tq.v(km5Var.getContext());
            }
        }
        return mmbVar.element;
    }

    public static final mue F(l46 l46Var) {
        return mue.a((mue) l46Var.k(nte.a), 0L, w6c.l(19), new ar5(510), null, 0L, null, 0, w6c.k(22.67d), null, null, 16646137);
    }

    public static final ArrayList G(nm7 nm7Var) {
        Collection collectionA = ((jm7) nm7Var.c.getValue()).a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionA) {
            if (obj instanceof ym7) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean H(fb4 fb4Var) {
        Operation operation = fb4Var.e;
        if ((operation instanceof Operation.Ask) || (operation instanceof Operation.UpdateQuestion)) {
            return true;
        }
        Operation operation2 = fb4Var.c;
        if ((operation2 instanceof Operation.Ask) || (operation2 instanceof Operation.UpdateQuestion)) {
            return true;
        }
        jd4 jd4Var = fb4Var.a;
        if ((jd4Var instanceof ed4) || (jd4Var instanceof zc4) || (jd4Var instanceof dd4) || (jd4Var instanceof bd4)) {
            return true;
        }
        List<ot8> list = fb4Var.b;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (ot8 ot8Var : list) {
            if ((ot8Var instanceof nt8) && !v4e.Q(((nt8) ot8Var).a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean I(fb4 fb4Var) {
        fb4Var.getClass();
        jd4 jd4Var = fb4Var.a;
        if ((jd4Var instanceof bd4) && !v4e.Q(((bd4) jd4Var).a) && !(fb4Var.e instanceof Operation.Explanation) && !(fb4Var.c instanceof Operation.Explanation)) {
            List list = fb4Var.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof et8) {
                    arrayList.add(obj);
                }
            }
            et8 et8Var = (et8) s72.x0(arrayList);
            if (et8Var != null && et8Var.c && !v4e.Q(et8Var.b)) {
                return true;
            }
        }
        return false;
    }

    public static final z09 J(pv2 pv2Var) {
        z09 z09Var = (z09) pv2Var.F0(hj6.O0);
        if (z09Var != null) {
            return z09Var;
        }
        qc0.p("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final boolean K(em7 em7Var, em7 em7Var2) {
        em7Var2.getClass();
        if (em7Var.equals(em7Var2)) {
            return true;
        }
        List listH = t72.H(em7Var);
        sm7 sm7Var = sm7.a;
        return od4.w(listH, new jy4(10), new x(20, em7Var2)).booleanValue();
    }

    public static final j09 L(j09 j09Var, a26 a26Var) {
        return j09Var.D(new vl9(a26Var));
    }

    public static final j09 M(j09 j09Var, float f2, float f3) {
        return j09Var.D(new kl9(f2, f3));
    }

    public static j09 N(float f2, float f3, j09 j09Var, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return M(j09Var, f2, f3);
    }

    public static ei9 O(int i2) {
        if (1 <= i2 && i2 < 5) {
            return new ei9(tec.e(i2, (i2 == 1 || i2 == 3) ? "open_notification_tp_" : "daily_reminder_tp_"), "open_notification", Integer.valueOf(i2));
        }
        qc0.o(tec.e(i2, "Unsupported notification touchpoint: "));
        return null;
    }

    public static final void P(String str, String str2) {
        str.getClass();
        str2.getClass();
        bt6 bt6Var = new bt6();
        bt6Var.d(null, str);
        ct6 ct6VarA = bt6Var.a();
        ArrayList arrayList = ct6VarA.f;
        if (!ct6VarA.f() || ct6VarA.b.length() != 0 || ct6VarA.c.length() != 0) {
            qc0.j("Failed requirement.");
            return;
        }
        if (!qd0.I0(new String[]{"quinlove.cn", "quin.love", "staging.quinlove.cn", "staging.quin.love"}).contains(ct6VarA.d)) {
            qc0.j("Failed requirement.");
            return;
        }
        if (arrayList.size() != 2 || !pa7.t(arrayList.get(0), "s") || !c5e.v((String) arrayList.get(1), str2, true)) {
            qc0.j("Failed requirement.");
            return;
        }
        String strH = ct6VarA.h("sid");
        if (strH == null || v4e.Q(strH)) {
            qc0.j("Failed requirement.");
        }
    }

    public static final Object Q(a26 a26Var, zn2 zn2Var) {
        return J(zn2Var.getContext()).g0(zn2Var, new pb6(a26Var, 2));
    }

    public static final void R(ug2 ug2Var, a26 a26Var) {
        ie6 ie6Var = (ie6) eb3.H(ug2Var, zg2.g);
        ke6 ke6VarC = ie6Var.c();
        try {
            a26Var.d(ke6VarC);
        } finally {
            ie6Var.a(ke6VarC);
        }
    }

    public static final void a(final Uri uri, final x16 x16Var, final x16 x16Var2, final j09 j09Var, l46 l46Var, final int i2) {
        ojb ojbVarV;
        l26 l26Var;
        uri.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-437192037);
        int i3 = (l46Var.i(uri) ? 4 : 2) | i2 | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = 9;
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                l46Var.f0(-2046968059);
                s21.a(j09Var, l46Var, (i3 >> 9) & 14);
                l46Var.r(false);
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i5 = 0;
                l26Var = new l26(uri, x16Var, x16Var2, j09Var, i2, i5) { // from class: qj
                    public final /* synthetic */ int a;
                    public final /* synthetic */ Uri b;
                    public final /* synthetic */ x16 c;
                    public final /* synthetic */ x16 d;
                    public final /* synthetic */ j09 e;

                    {
                        this.a = i5;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i6 = this.a;
                        wef wefVar = wef.a;
                        switch (i6) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(433);
                                tm7.a(this.b, this.c, this.d, this.e, (l46) obj, iP);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(433);
                                tm7.a(this.b, this.c, this.d, this.e, (l46) obj, iP2);
                                break;
                        }
                        return wefVar;
                    }
                };
            } else {
                l46Var.f0(-2046935385);
                l46Var.r(false);
                h48 h48VarK = ((x48) l46Var.k(cb8.a)).k();
                l46Var.d0(765255998, uri);
                boolean zI = l46Var.i(uri);
                Object objR = l46Var.R();
                Object obj = sf2.a;
                if (zI || objR == obj) {
                    objR = new c1(i4, uri);
                    l46Var.p0(objR);
                }
                a26 a26Var = (a26) objR;
                Object objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = new z4(12);
                    l46Var.p0(objR2);
                }
                a26 a26Var2 = (a26) objR2;
                boolean zI2 = l46Var.i(h48VarK);
                Object objR3 = l46Var.R();
                if (zI2 || objR3 == obj) {
                    objR3 = new w6(x16Var, x16Var2, h48VarK);
                    l46Var.p0(objR3);
                }
                xo1.b(a26Var, j09Var, null, a26Var2, (a26) objR3, l46Var, ((i3 >> 6) & 112) | 3072, 4);
                l46Var.r(false);
            }
            ojbVarV.d = l26Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i6 = 1;
            l26Var = new l26(uri, x16Var, x16Var2, j09Var, i2, i6) { // from class: qj
                public final /* synthetic */ int a;
                public final /* synthetic */ Uri b;
                public final /* synthetic */ x16 c;
                public final /* synthetic */ x16 d;
                public final /* synthetic */ j09 e;

                {
                    this.a = i6;
                }

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    int i7 = this.a;
                    wef wefVar = wef.a;
                    switch (i7) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iP = k99.P(433);
                            tm7.a(this.b, this.c, this.d, this.e, (l46) obj2, iP);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iP2 = k99.P(433);
                            tm7.a(this.b, this.c, this.d, this.e, (l46) obj2, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void b(j09 j09Var, x16 x16Var, l46 l46Var, int i2, int i3) {
        j09 j09Var2;
        int i4;
        x16Var.getClass();
        l46Var.h0(-1221701028);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            j09Var2 = j09Var;
        } else if ((i2 & 6) == 0) {
            j09Var2 = j09Var;
            i4 = i2 | (l46Var.g(j09Var2) ? 4 : 2);
        } else {
            j09Var2 = j09Var;
            i4 = i2;
        }
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            j09 j09Var3 = i5 != 0 ? g09.a : j09Var2;
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new c20(9, x16Var);
                l46Var.p0(objR);
            }
            rxg.a(false, (x16) objR, l46Var, 0, 1);
            j09Var3.getClass();
            nae.a(urg.F(g21.B(j09Var3, true, new r02(15)), ia7.b), ((s5d) l46Var.k(u5d.a)).d, 0L, 0L, 0.0f, 0.0f, null, af1.b0(-1884140809, new m(16, x16Var), l46Var), l46Var, 12582912, 124);
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new or1(j09Var2, x16Var, i2, i3, 3);
        }
    }

    public static final void c(DailyFortuneGuideTrigger dailyFortuneGuideTrigger, a26 a26Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        dailyFortuneGuideTrigger.getClass();
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-642389964);
        int i3 = (l46Var.e(dailyFortuneGuideTrigger.ordinal()) ? 4 : 2) | i2 | (l46Var.g(a26Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            t72.b(x16Var2, new s84(true, false, false), af1.b0(1566233995, new l73(dailyFortuneGuideTrigger, a26Var, x16Var, x16Var2), l46Var), l46Var, ((i3 >> 9) & 14) | 432, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l73(dailyFortuneGuideTrigger, a26Var, x16Var, x16Var2, i2);
        }
    }

    public static float d(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final void e(c4c c4cVar, String str, l46 l46Var, int i2) {
        str.getClass();
        l46Var.h0(-166034923);
        int i3 = (l46Var.g(c4cVar) ? 4 : 2) | i2 | (l46Var.g(str) ? 32 : 16);
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = (i3 & 112) == 32;
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                i00 i00Var = new i00(16);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                vea veaVar = k00.e;
                i00Var.d(feg.H(str));
                m4c m4cVar = new m4c(i00Var.l(), bm8.X(linkedHashMap));
                l46Var.p0(m4cVar);
                objR = m4cVar;
            }
            rrb.f(c4cVar, (m4c) objR, null, null, false, 0, 0, l46Var, i3 & 14, 62);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rk6(c4cVar, str, i2, i4);
        }
    }

    public static final void f(boolean z2, int i2, String str, String str2, l46 l46Var, int i3) {
        boolean z3;
        l46 l46Var2;
        l46Var.h0(-645871933);
        int i4 = (l46Var.h(z2) ? 4 : 2) | i3 | (l46Var.e(i2) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(str2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            z3 = z2;
            l46Var2 = l46Var;
            k(z3, new k00(afc.r(R.string.draw_card_no, new Object[]{Integer.valueOf(i2 + 1)}, l46Var)), new k00(str), new k00(str2), l46Var2, i4 & 14, 0);
        } else {
            z3 = z2;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i30(z3, i2, str, str2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:130:0x0188  */
    /* JADX WARN: Code duplicated, block: B:132:0x018c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0190  */
    /* JADX WARN: Code duplicated, block: B:136:0x0194  */
    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:139:0x019b  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01da  */
    /* JADX WARN: Code duplicated, block: B:155:0x0231  */
    /* JADX WARN: Code duplicated, block: B:157:0x0237  */
    /* JADX WARN: Code duplicated, block: B:163:0x0249  */
    /* JADX WARN: Code duplicated, block: B:165:0x024f  */
    /* JADX WARN: Code duplicated, block: B:171:0x025e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x0260  */
    /* JADX WARN: Code duplicated, block: B:175:0x0270  */
    /* JADX WARN: Code duplicated, block: B:178:0x0291  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:183:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:189:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:191:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:199:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:205:0x030d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0313  */
    /* JADX WARN: Code duplicated, block: B:213:0x032a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0330  */
    /* JADX WARN: Code duplicated, block: B:221:0x0341  */
    /* JADX WARN: Code duplicated, block: B:223:0x0347  */
    /* JADX WARN: Code duplicated, block: B:229:0x0358  */
    /* JADX WARN: Code duplicated, block: B:231:0x035e  */
    /* JADX WARN: Code duplicated, block: B:237:0x036f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0375  */
    /* JADX WARN: Code duplicated, block: B:245:0x038e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x0390  */
    /* JADX WARN: Code duplicated, block: B:251:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:252:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:254:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:256:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:258:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:265:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:268:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:272:0x040d  */
    /* JADX WARN: Code duplicated, block: B:274:0x041e  */
    /* JADX WARN: Code duplicated, block: B:275:0x0421  */
    /* JADX WARN: Code duplicated, block: B:278:0x0428 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x042a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0478  */
    /* JADX WARN: Code duplicated, block: B:284:0x0487  */
    /* JADX WARN: Code duplicated, block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0169, please report this as an issue */
    public static final void g(j09 j09Var, j18 j18Var, xw9 xw9Var, boolean z2, gj5 gj5Var, boolean z3, lu9 lu9Var, xi xiVar, wc0 wc0Var, kx0 kx0Var, tc0 tc0Var, a26 a26Var, l46 l46Var, int i2, int i3, int i4) {
        int i5;
        xi xiVar2;
        wc0 wc0Var2;
        int i6;
        boolean z4;
        j18 j18Var2;
        kx0 kx0Var2;
        tc0 tc0Var2;
        ojb ojbVarV;
        int i7;
        kx0 kx0Var3;
        kx0 kx0Var4;
        wc0 wc0Var3;
        int i8;
        e89 e89VarI;
        boolean z5;
        Object objR;
        Object obj;
        sn7 sn7Var;
        boolean z6;
        Object objR2;
        Object objR3;
        aw2 aw2Var;
        ie6 ie6Var;
        w1e w1eVar;
        int i9;
        boolean zE;
        Object a18Var;
        j18 j18Var3;
        Object obj2;
        int i10;
        sn7 sn7Var2;
        ks9 ks9Var;
        Object obj3;
        boolean z7;
        j09 j09VarJ0;
        boolean z8;
        Object objR4;
        boolean zE2;
        Object objR5;
        l46Var.h0(924924659);
        if ((i2 & 6) == 0) {
            i5 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= l46Var.g(j18Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= l46Var.g(xw9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i11 = i2 & 3072;
        int i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i11 == 0) {
            i5 |= l46Var.h(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i5 |= l46Var.g(gj5Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= l46Var.h(z3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= l46Var.g(lu9Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= 33554432;
        }
        int i13 = i4 & 512;
        if (i13 != 0) {
            i5 |= 805306368;
            xiVar2 = xiVar;
        } else {
            xiVar2 = xiVar;
            if ((i2 & 805306368) == 0) {
                i5 |= l46Var.g(xiVar2) ? 536870912 : 268435456;
            }
        }
        int i14 = i4 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i14 != 0) {
            i6 = i3 | 6;
            wc0Var2 = wc0Var;
        } else {
            wc0Var2 = wc0Var;
            if ((i3 & 6) == 0) {
                i6 = i3 | (l46Var.g(wc0Var2) ? 4 : 2);
            } else {
                i6 = i3;
            }
        }
        int i15 = i5;
        int i16 = i4 & 2048;
        if (i16 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= l46Var.g(kx0Var) ? 32 : 16;
        }
        int i17 = i6;
        int i18 = i4 & 4096;
        if (i18 == 0) {
            if ((i3 & 384) == 0) {
                i17 |= l46Var.g(tc0Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i3 & 3072) != 0) {
                if (l46Var.i(a26Var)) {
                    i12 = 2048;
                }
                i17 |= i12;
            }
            if ((i15 & 306783379) == 306783378 || (i17 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i15 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0 || l46Var.C()) {
                    i7 = i15 & (-234881025);
                    if (i13 != 0) {
                        xiVar2 = null;
                    }
                    if (i14 != 0) {
                        wc0Var2 = null;
                    }
                    if (i16 != 0) {
                        kx0Var3 = null;
                    } else {
                        kx0Var3 = kx0Var;
                    }
                    if (i18 != 0) {
                        kx0Var4 = kx0Var3;
                        wc0Var3 = wc0Var2;
                        tc0Var = null;
                    } else {
                        kx0Var4 = kx0Var3;
                    }
                    l46Var.s();
                    i8 = i7 >> 3;
                    int i19 = i8 & 14;
                    int i20 = ((i17 >> 6) & 112) | i19;
                    int i21 = i7;
                    e89VarI = q1c.i(a26Var, l46Var);
                    int i22 = i17;
                    z5 = (((i20 & 14) ^ 6) <= 4 && l46Var.g(j18Var)) || (i20 & 6) == 4;
                    objR = l46Var.R();
                    obj = sf2.a;
                    if (z5 || objR == obj) {
                        mx7 mx7Var = new mx7();
                        mx7Var.a = new sz9(Integer.MAX_VALUE);
                        mx7Var.b = new sz9(Integer.MAX_VALUE);
                        hj6 hj6Var = hj6.X0;
                        x08 x08Var = new x08(e89VarI, 0);
                        psd psdVar = zrd.a;
                        objR = new uw7(0, 2, h0e.class, new mx3(new n25(new mx3(x08Var, hj6Var), j18Var, mx7Var, 11), hj6Var), "value", "getValue()Ljava/lang/Object;");
                        l46Var.p0(objR);
                    }
                    sn7Var = (sn7) objR;
                    int i23 = i21 >> 9;
                    int i24 = i19 | (i23 & 112);
                    z6 = ((((i24 & 112) ^ 48) <= 32 && l46Var.h(z2)) || (i24 & 48) == 32) | ((((i24 & 14) ^ 6) <= 4 && l46Var.g(j18Var)) || (i24 & 6) == 4);
                    objR2 = l46Var.R();
                    if (z6 || objR2 == obj) {
                        objR2 = new m08(j18Var, z2);
                        l46Var.p0(objR2);
                    }
                    k08 k08Var = (k08) objR2;
                    objR3 = l46Var.R();
                    if (objR3 == obj) {
                        objR3 = af1.E(l46Var);
                        l46Var.p0(objR3);
                    }
                    aw2Var = (aw2) objR3;
                    ie6Var = (ie6) l46Var.k(zg2.g);
                    w1eVar = ((Boolean) l46Var.k(zg2.x)).booleanValue() ? null : x1e.a;
                    i9 = i21 & 112;
                    int i25 = i22 << 18;
                    int i26 = (i21 & 65520) | (i23 & 3670016) | (i25 & 29360128) | (i25 & 234881024) | ((i22 << 27) & 1879048192);
                    zE = ((((i26 & 896) ^ 384) <= 256 && l46Var.g(xw9Var)) || (i26 & 384) == 256) | ((((i26 & 112) ^ 48) <= 32 && l46Var.g(j18Var)) || (i26 & 48) == 32) | ((((i26 & 7168) ^ 3072) <= 2048 && l46Var.h(false)) || (i26 & 3072) == 2048) | ((((57344 & i26) ^ 24576) <= 16384 && l46Var.h(z2)) || (i26 & 24576) == 16384) | l46Var.e(0) | ((((i26 & 3670016) ^ 1572864) <= 1048576 && l46Var.g(xiVar2)) || (i26 & 1572864) == 1048576) | ((((i26 & 29360128) ^ 12582912) <= 8388608 && l46Var.g(kx0Var4)) || (i26 & 12582912) == 8388608) | ((((i26 & 234881024) ^ 100663296) <= 67108864 && l46Var.g(tc0Var)) || (i26 & 100663296) == 67108864) | ((((i26 & 1879048192) ^ 805306368) <= 536870912 && l46Var.g(wc0Var3)) || (i26 & 805306368) == 536870912) | l46Var.g(ie6Var) | l46Var.g(w1eVar);
                    Object objR6 = l46Var.R();
                    if (!zE || objR6 == obj) {
                        j18Var3 = j18Var;
                        obj2 = obj;
                        i10 = 4;
                        a18Var = new a18(j18Var3, z2, xw9Var, sn7Var, wc0Var3, tc0Var, aw2Var, ie6Var, w1eVar, xiVar2, kx0Var4);
                        sn7Var2 = sn7Var;
                        l46Var.p0(a18Var);
                    } else {
                        a18Var = objR6;
                        obj2 = obj;
                        i10 = 4;
                        j18Var3 = j18Var;
                        sn7Var2 = sn7Var;
                    }
                    tz7 tz7Var = (tz7) a18Var;
                    if (
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1192
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.tm7.g(j09, j18, xw9, boolean, gj5, boolean, lu9, xi, wc0, kx0, tc0, a26, l46, int, int, int):void");
                }

                public static final void h(String str, x16 x16Var, j09 j09Var, float f2, float f3, float f4, boolean z2, mue mueVar, y72 y72Var, xw9 xw9Var, boolean z3, l46 l46Var, int i2, int i3) {
                    int i4;
                    int i5;
                    y72 y72Var2;
                    str.getClass();
                    x16Var.getClass();
                    l46Var.h0(-1417634925);
                    if ((i2 & 6) == 0) {
                        i4 = (l46Var.g(str) ? 4 : 2) | i2;
                    } else {
                        i4 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i4 |= l46Var.i(x16Var) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        i4 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    if ((i2 & 3072) == 0) {
                        i4 |= l46Var.g(null) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    if ((196608 & i2) == 0) {
                        i4 |= l46Var.d(f3) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i4 |= l46Var.d(f4) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i4 |= l46Var.h(z2) ? 8388608 : 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        i4 |= l46Var.g(mueVar) ? 67108864 : 33554432;
                    }
                    if ((i3 & 6) == 0) {
                        i5 = i3 | (l46Var.g(xw9Var) ? 4 : 2);
                    } else {
                        i5 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i5 |= l46Var.h(z3) ? 32 : 16;
                    }
                    int i6 = i4;
                    if (l46Var.W(i6 & 1, ((i4 & 38339731) == 38339730 && (i5 & 19) == 18) ? false : true)) {
                        l46Var.b0();
                        if ((i2 & 1) == 0 || l46Var.C()) {
                            y72Var2 = new y72(y72.e);
                        } else {
                            l46Var.Z();
                            y72Var2 = y72Var;
                        }
                        l46Var.s();
                        gh6 gh6VarW0 = kj0.w0(l46Var);
                        j09 j09VarZ = ynb.Z(j09Var, 6.0f);
                        boolean zI = ((i6 & 112) == 32) | ((i5 & 112) == 32) | l46Var.i(gh6VarW0);
                        Object objR = l46Var.R();
                        if (zI || objR == sf2.a) {
                            objR = new j28(z3, gh6VarW0, x16Var, 2);
                            l46Var.p0(objR);
                        }
                        j09 j09VarA = b.a(o(androidx.compose.foundation.b.c(j09VarZ, z2, null, null, (x16) objR, 14), ((y72) ((l26) eze.a(l46Var).b.b).z(l46Var, 0)).a, g21.f), f4, f3);
                        xn8 xn8VarC = s21.c(ndb.f, false);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ = m93.J(l46Var, j09VarA);
                        lf2.q.getClass();
                        l46Var.j0();
                        boolean z4 = l46Var.S;
                        x16 x16Var2 = LayoutNode.h1;
                        if (z4) {
                            l46Var.l(x16Var2);
                        } else {
                            l46Var.s0();
                        }
                        he2 he2Var = hj6.z;
                        dec.l(he2Var, l46Var, xn8VarC);
                        he2 he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        he2 he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf);
                        dec.k(l46Var);
                        he2 he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ);
                        j09 j09VarY = ynb.Y(g09.a, xw9Var);
                        c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
                        int iHashCode2 = Long.hashCode(l46Var.T);
                        u8a u8aVarM2 = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, j09VarY);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(x16Var2);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, c92VarA);
                        dec.l(he2Var2, l46Var, u8aVarM2);
                        ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ2);
                        nte.b(str, null, ((y72) ((l26) eze.a(l46Var).b.c).z(l46Var, 0)).a, 0L, ar5.e, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar, l46Var, (i6 & 14) | 1572864, (i6 >> 3) & 29360128, 129850);
                        l46Var.f0(-1004969559);
                        l46Var.r(false);
                        l46Var.r(true);
                        l46Var.r(true);
                    } else {
                        l46Var.Z();
                        y72Var2 = y72Var;
                    }
                    ojb ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new kk8(str, x16Var, j09Var, f2, f3, f4, z2, mueVar, y72Var2, xw9Var, z3, i2, i3, 1);
                    }
                }

                public static float i(float f2) {
                    return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
                }

                /* JADX WARN: Code duplicated, block: B:100:0x012d  */
                /* JADX WARN: Code duplicated, block: B:101:0x0130  */
                /* JADX WARN: Code duplicated, block: B:103:0x0135  */
                /* JADX WARN: Code duplicated, block: B:106:0x0143  */
                /* JADX WARN: Code duplicated, block: B:110:0x014b  */
                /* JADX WARN: Code duplicated, block: B:113:0x0154  */
                /* JADX WARN: Code duplicated, block: B:115:0x0158  */
                /* JADX WARN: Code duplicated, block: B:116:0x015a  */
                /* JADX WARN: Code duplicated, block: B:119:0x015f  */
                /* JADX WARN: Code duplicated, block: B:120:0x0164  */
                /* JADX WARN: Code duplicated, block: B:122:0x0167  */
                /* JADX WARN: Code duplicated, block: B:123:0x016c  */
                /* JADX WARN: Code duplicated, block: B:126:0x0171  */
                /* JADX WARN: Code duplicated, block: B:127:0x0173  */
                /* JADX WARN: Code duplicated, block: B:130:0x019b  */
                /* JADX WARN: Code duplicated, block: B:131:0x019d  */
                /* JADX WARN: Code duplicated, block: B:134:0x01ac A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:135:0x01ae  */
                /* JADX WARN: Code duplicated, block: B:137:0x01b8  */
                /* JADX WARN: Code duplicated, block: B:140:0x01c1  */
                /* JADX WARN: Code duplicated, block: B:144:0x0222  */
                /* JADX WARN: Code duplicated, block: B:145:0x0226  */
                /* JADX WARN: Code duplicated, block: B:148:0x0266  */
                /* JADX WARN: Code duplicated, block: B:149:0x026a  */
                /* JADX WARN: Code duplicated, block: B:152:0x02a1  */
                /* JADX WARN: Code duplicated, block: B:153:0x02b4  */
                /* JADX WARN: Code duplicated, block: B:155:0x02bd  */
                /* JADX WARN: Code duplicated, block: B:156:0x02c9  */
                /* JADX WARN: Code duplicated, block: B:159:0x02fc A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:162:0x0302  */
                /* JADX WARN: Code duplicated, block: B:165:0x0332 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:166:0x0334  */
                /* JADX WARN: Code duplicated, block: B:169:0x0357 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:172:0x035c  */
                /* JADX WARN: Code duplicated, block: B:175:0x0385  */
                /* JADX WARN: Code duplicated, block: B:176:0x0389  */
                /* JADX WARN: Code duplicated, block: B:179:0x03a0  */
                /* JADX WARN: Code duplicated, block: B:180:0x03a8  */
                /* JADX WARN: Code duplicated, block: B:183:0x03ec A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:184:0x03ee  */
                /* JADX WARN: Code duplicated, block: B:186:0x0448  */
                /* JADX WARN: Code duplicated, block: B:189:0x0457  */
                /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:23:0x0058  */
                /* JADX WARN: Code duplicated, block: B:25:0x005d  */
                /* JADX WARN: Code duplicated, block: B:27:0x0061  */
                /* JADX WARN: Code duplicated, block: B:29:0x0069  */
                /* JADX WARN: Code duplicated, block: B:30:0x006c  */
                /* JADX WARN: Code duplicated, block: B:34:0x0074  */
                /* JADX WARN: Code duplicated, block: B:36:0x0078  */
                /* JADX WARN: Code duplicated, block: B:37:0x007d  */
                /* JADX WARN: Code duplicated, block: B:39:0x0083  */
                /* JADX WARN: Code duplicated, block: B:40:0x0086  */
                /* JADX WARN: Code duplicated, block: B:44:0x008d  */
                /* JADX WARN: Code duplicated, block: B:46:0x0093  */
                /* JADX WARN: Code duplicated, block: B:47:0x0098  */
                /* JADX WARN: Code duplicated, block: B:49:0x009e  */
                /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
                /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
                /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
                /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
                /* JADX WARN: Code duplicated, block: B:59:0x00b9  */
                /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
                /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
                /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
                /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
                /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
                /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
                /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
                /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
                /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
                /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
                /* JADX WARN: Code duplicated, block: B:84:0x0101  */
                /* JADX WARN: Code duplicated, block: B:86:0x0107  */
                /* JADX WARN: Code duplicated, block: B:87:0x010a  */
                /* JADX WARN: Code duplicated, block: B:91:0x0114  */
                /* JADX WARN: Code duplicated, block: B:93:0x011a  */
                /* JADX WARN: Code duplicated, block: B:94:0x011d  */
                /* JADX WARN: Code duplicated, block: B:98:0x0127  */
                /* JADX WARN: Multi-variable type inference failed */
                public static final void j(final sdd sddVar, j09 j09Var, xw9 xw9Var, final ly lyVar, final List list, final List list2, xw9 xw9Var2, final boolean z2, boolean z3, final dd2 dd2Var, final x16 x16Var, l46 l46Var, final int i2, final int i3, final int i4) {
                    int i5;
                    j09 j09Var2;
                    int i6;
                    xw9 xw9Var3;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    boolean z4;
                    final xw9 xw9Var4;
                    final boolean z5;
                    final j09 j09Var3;
                    final xw9 xw9Var5;
                    ojb ojbVarV;
                    g09 g09Var;
                    j09 j09Var4;
                    xw9 xw9VarQ;
                    xw9 xw9VarQ2;
                    boolean z6;
                    lu9 lu9VarB;
                    int i13;
                    boolean z7;
                    boolean z8;
                    Object objR;
                    Integer num;
                    Object obj;
                    boolean z9;
                    x16 x16Var2;
                    b1b b1bVar;
                    boolean z10;
                    long jD;
                    float f2;
                    boolean zF;
                    Object objR2;
                    long j2;
                    Object obj2;
                    boolean zG;
                    Object objR3;
                    boolean zD;
                    Object objR4;
                    int i14;
                    lcg lcgVar;
                    boolean zI;
                    Object objR5;
                    int i15;
                    int i16;
                    int i17;
                    boolean zI2;
                    int i18;
                    boolean zI3;
                    int i19;
                    boolean zI4;
                    int i20;
                    sddVar.getClass();
                    lyVar.getClass();
                    list.getClass();
                    list2.getClass();
                    x16Var.getClass();
                    l46Var.h0(1296588016);
                    if ((i2 & 6) == 0) {
                        i5 = (l46Var.g(sddVar) ? 4 : 2) | i2;
                    } else {
                        i5 = i2;
                    }
                    int i21 = i4 & 1;
                    if (i21 == 0) {
                        if ((i2 & 48) == 0) {
                            j09Var2 = j09Var;
                            i5 |= l46Var.g(j09Var2) ? 32 : 16;
                        }
                        i6 = i4 & 2;
                        if (i6 != 0) {
                            if ((i2 & 384) == 0) {
                                xw9Var3 = xw9Var;
                                if (l46Var.g(xw9Var3)) {
                                    i7 = 256;
                                } else {
                                    i7 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                }
                                i5 |= i7;
                            }
                            if ((i2 & 3072) == 0) {
                                if ((i2 & 4096) == 0) {
                                    zI4 = l46Var.g(lyVar);
                                } else {
                                    zI4 = l46Var.i(lyVar);
                                }
                                if (zI4) {
                                    i20 = 2048;
                                } else {
                                    i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                                }
                                i5 |= i20;
                            }
                            if ((i2 & 24576) == 0) {
                                if ((32768 & i2) == 0) {
                                    zI3 = l46Var.g(list);
                                } else {
                                    zI3 = l46Var.i(list);
                                }
                                if (zI3) {
                                    i19 = 16384;
                                } else {
                                    i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                }
                                i5 |= i19;
                            }
                            if ((196608 & i2) == 0) {
                                if ((262144 & i2) == 0) {
                                    zI2 = l46Var.g(list2);
                                } else {
                                    zI2 = l46Var.i(list2);
                                }
                                if (zI2) {
                                    i18 = 131072;
                                } else {
                                    i18 = 65536;
                                }
                                i5 |= i18;
                            }
                            i8 = i4 & 32;
                            if (i8 != 0) {
                                i5 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                if (l46Var.g(xw9Var2)) {
                                    i9 = 1048576;
                                } else {
                                    i9 = 524288;
                                }
                                i5 |= i9;
                            }
                            if ((i2 & 12582912) == 0) {
                                if (l46Var.h(z2)) {
                                    i17 = 8388608;
                                } else {
                                    i17 = 4194304;
                                }
                                i5 |= i17;
                            }
                            i10 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            if (i10 != 0) {
                                i5 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                if (l46Var.h(z3)) {
                                    i11 = 67108864;
                                } else {
                                    i11 = 33554432;
                                }
                                i5 |= i11;
                            }
                            if ((i2 & 805306368) == 0) {
                                if (l46Var.i(dd2Var)) {
                                    i16 = 536870912;
                                } else {
                                    i16 = 268435456;
                                }
                                i5 |= i16;
                            }
                            if ((i3 & 6) == 0) {
                                if (l46Var.i(x16Var)) {
                                    i15 = 4;
                                } else {
                                    i15 = 2;
                                }
                                i12 = i3 | i15;
                            } else {
                                i12 = i3;
                            }
                            if ((i5 & 306783379) == 306783378 || (i12 & 3) != 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (l46Var.W(i5 & 1, z4)) {
                                g09Var = g09.a;
                                if (i21 != 0) {
                                    j09Var4 = g09Var;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i6 != 0) {
                                    xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                                } else {
                                    xw9VarQ = xw9Var3;
                                }
                                if (i8 != 0) {
                                    xw9VarQ2 = ynb.q(0.0f, 0.0f, 3);
                                } else {
                                    xw9VarQ2 = xw9Var2;
                                }
                                int i22 = i5;
                                if (i10 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z3;
                                }
                                cv7 cv7Var = (cv7) l46Var.k(zg2.n);
                                lu9VarB = mu9.b(l46Var);
                                boolean zE = l46Var.e(list2.size()) | l46Var.e(list.size());
                                i13 = 29360128 & i22;
                                if (i13 == 8388608) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                z8 = zE | z7;
                                objR = l46Var.R();
                                Object obj3 = sf2.a;
                                if (z8 || objR == obj3) {
                                    int size = list.size();
                                    Integer numValueOf = Integer.valueOf(size);
                                    if (!z2 || size >= list2.size()) {
                                        num = null;
                                    } else {
                                        num = numValueOf;
                                    }
                                    Object qt1Var = new qt1(num);
                                    l46Var.p0(qt1Var);
                                    objR = qt1Var;
                                }
                                obj = (qt1) objR;
                                FillElement fillElement = b.c;
                                j09 j09VarD0 = ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, ynb.Y(j09Var4.D(fillElement), xw9VarQ));
                                j09 j09Var5 = j09Var4;
                                boolean z11 = z6;
                                xw9 xw9Var6 = xw9VarQ;
                                c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                                int iHashCode = Long.hashCode(l46Var.T);
                                u8a u8aVarM = l46Var.m();
                                j09 j09VarJ = m93.J(l46Var, j09VarD0);
                                lf2.q.getClass();
                                l46Var.j0();
                                z9 = l46Var.S;
                                x16Var2 = LayoutNode.h1;
                                if (z9) {
                                    l46Var.l(x16Var2);
                                } else {
                                    l46Var.s0();
                                }
                                he2 he2Var = hj6.z;
                                dec.l(he2Var, l46Var, c92VarA);
                                he2 he2Var2 = hj6.y;
                                dec.l(he2Var2, l46Var, u8aVarM);
                                Integer numValueOf2 = Integer.valueOf(iHashCode);
                                he2 he2Var3 = hj6.X;
                                dec.l(he2Var3, l46Var, numValueOf2);
                                dec.k(l46Var);
                                he2 he2Var4 = hj6.x;
                                dec.l(he2Var4, l46Var, j09VarJ);
                                lx0 lx0Var = ndb.b;
                                xw9 xw9Var7 = xw9VarQ2;
                                xn8 xn8VarC = s21.c(lx0Var, false);
                                int iHashCode2 = Long.hashCode(l46Var.T);
                                u8a u8aVarM2 = l46Var.m();
                                j09 j09VarJ2 = m93.J(l46Var, g09Var);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(x16Var2);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC);
                                dec.l(he2Var2, l46Var, u8aVarM2);
                                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ2);
                                tec.q((i22 >> 27) & 14, dd2Var, l46Var, true);
                                j09 j09VarA = mu9.a(fillElement, lu9VarB);
                                j09VarA.getClass();
                                obj.getClass();
                                l46Var.f0(-685173009);
                                b1bVar = l8b.a;
                                if (k8b.e((e8b) l46Var.k(b1bVar))) {
                                    z10 = false;
                                    if (l46Var.k(snd.b) != null) {
                                        l46Var.f0(-685169447);
                                        l46Var.r(false);
                                        jD = rx8.a;
                                    } else {
                                        l46Var.f0(-685168363);
                                        l46Var.r(false);
                                        jD = abg.d(4284961270L);
                                    }
                                } else {
                                    l46Var.f0(-685171119);
                                    jD = ((e8b) l46Var.k(b1bVar)).u;
                                    z10 = false;
                                    l46Var.r(false);
                                }
                                l46Var.r(z10);
                                f2 = eze.a(l46Var).a.f;
                                zF = l46Var.f(jD) | l46Var.d(f2);
                                objR2 = l46Var.R();
                                j2 = jD;
                                if (zF || objR2 == obj3) {
                                    y6c y6cVarB = a7c.b(f2);
                                    n4d n4dVar = new n4d(8.0f, j2, 0.0f, 0L, 44);
                                    oq4.t.getClass();
                                    objR2 = new DropShadowPainter(y6cVarB, n4dVar, qk6.z);
                                    l46Var.p0(objR2);
                                }
                                obj2 = (DropShadowPainter) objR2;
                                zG = l46Var.g(obj);
                                objR3 = l46Var.R();
                                if (zG || objR3 == obj3) {
                                    objR3 = new ot1(0, obj);
                                    l46Var.p0(objR3);
                                }
                                j09 j09VarW = nk8.w(j09VarA, (a26) objR3);
                                zD = l46Var.d(f2) | l46Var.g(obj) | l46Var.i(obj2);
                                objR4 = l46Var.R();
                                if (!zD || objR4 == obj3) {
                                    i14 = 1;
                                    objR4 = new er(f2, obj, obj2, i14);
                                    l46Var.p0(objR4);
                                } else {
                                    i14 = 1;
                                }
                                j09 j09VarT = b21.t(j09VarW, (a26) objR4);
                                xn8 xn8VarC2 = s21.c(lx0Var, false);
                                int iHashCode3 = Long.hashCode(l46Var.T);
                                u8a u8aVarM3 = l46Var.m();
                                j09 j09VarJ3 = m93.J(l46Var, j09VarT);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(x16Var2);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC2);
                                dec.l(he2Var2, l46Var, u8aVarM3);
                                ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ3);
                                ghc ghcVarT = mh3.T(l46Var);
                                if (lu9VarB != null) {
                                    lcgVar = new lcg(lu9VarB);
                                } else {
                                    lcgVar = null;
                                }
                                j09 j09VarV = mh3.V(fillElement, ghcVarT, true, true, false, lcgVar);
                                bx9 bx9Var = new bx9(ynb.B(xw9Var7, cv7Var), ((yi4) mh3.l(new yi4(xw9Var7.d()), new yi4(24.0f))).a, ynb.A(xw9Var7, cv7Var), xw9Var7.a() + 24.0f);
                                zI = l46Var.i(obj);
                                objR5 = l46Var.R();
                                if (zI || objR5 == obj3) {
                                    objR5 = new gl(2, obj, qt1.class, "onCardPositioned", "onCardPositioned(ILandroidx/compose/ui/layout/LayoutCoordinates;)V", 0, 25);
                                    l46Var.p0(objR5);
                                }
                                boolean z12 = i14;
                                cgg.e(sddVar, j09VarV, lyVar, bx9Var, list, list2, 0, z2, z11, (l26) ((ym7) objR5), x16Var, l46Var, (i22 & 14) | ((i22 >> 3) & 896) | (i22 & 57344) | (i22 & 458752) | i13 | (i22 & 234881024), i12 & 14);
                                l46Var.r(z12);
                                l46Var.r(z12);
                                z5 = z11;
                                j09Var3 = j09Var5;
                                xw9Var5 = xw9Var6;
                                xw9Var4 = xw9Var7;
                            } else {
                                l46Var.Z();
                                xw9Var4 = xw9Var2;
                                z5 = z3;
                                j09Var3 = j09Var2;
                                xw9Var5 = xw9Var3;
                            }
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new l26() { // from class: f2a
                                    @Override // defpackage.l26
                                    public final Object z(Object obj4, Object obj5) {
                                        ((Integer) obj5).getClass();
                                        int iP = k99.P(i2 | 1);
                                        int iP2 = k99.P(i3);
                                        tm7.j(sddVar, j09Var3, xw9Var5, lyVar, list, list2, xw9Var4, z2, z5, dd2Var, x16Var, (l46) obj4, iP, iP2, i4);
                                        return wef.a;
                                    }
                                };
                            }
                        }
                        i5 |= 384;
                        xw9Var3 = xw9Var;
                        if ((i2 & 3072) == 0) {
                            if ((i2 & 4096) == 0) {
                                zI4 = l46Var.g(lyVar);
                            } else {
                                zI4 = l46Var.i(lyVar);
                            }
                            if (zI4) {
                                i20 = 2048;
                            } else {
                                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                            }
                            i5 |= i20;
                        }
                        if ((i2 & 24576) == 0) {
                            if ((32768 & i2) == 0) {
                                zI3 = l46Var.g(list);
                            } else {
                                zI3 = l46Var.i(list);
                            }
                            if (zI3) {
                                i19 = 16384;
                            } else {
                                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                            }
                            i5 |= i19;
                        }
                        if ((196608 & i2) == 0) {
                            if ((262144 & i2) == 0) {
                                zI2 = l46Var.g(list2);
                            } else {
                                zI2 = l46Var.i(list2);
                            }
                            if (zI2) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i5 |= i18;
                        }
                        i8 = i4 & 32;
                        if (i8 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (l46Var.g(xw9Var2)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i5 |= i9;
                        }
                        if ((i2 & 12582912) == 0) {
                            if (l46Var.h(z2)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i5 |= i17;
                        }
                        i10 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        if (i10 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z3)) {
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i5 |= i11;
                        }
                        if ((i2 & 805306368) == 0) {
                            if (l46Var.i(dd2Var)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i5 |= i16;
                        }
                        if ((i3 & 6) == 0) {
                            if (l46Var.i(x16Var)) {
                                i15 = 4;
                            } else {
                                i15 = 2;
                            }
                            i12 = i3 | i15;
                        } else {
                            i12 = i3;
                        }
                        if ((i5 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i5 & 1, z4)) {
                            g09Var = g09.a;
                            if (i21 != 0) {
                                j09Var4 = g09Var;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i6 != 0) {
                                xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                            } else {
                                xw9VarQ = xw9Var3;
                            }
                            if (i8 != 0) {
                                xw9VarQ2 = ynb.q(0.0f, 0.0f, 3);
                            } else {
                                xw9VarQ2 = xw9Var2;
                            }
                            int i23 = i5;
                            if (i10 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            cv7 cv7Var2 = (cv7) l46Var.k(zg2.n);
                            lu9VarB = mu9.b(l46Var);
                            boolean zE2 = l46Var.e(list2.size()) | l46Var.e(list.size());
                            i13 = 29360128 & i23;
                            if (i13 == 8388608) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = zE2 | z7;
                            objR = l46Var.R();
                            Object obj4 = sf2.a;
                            if (z8) {
                                int size2 = list.size();
                                Integer numValueOf3 = Integer.valueOf(size2);
                                if (z2) {
                                    num = null;
                                } else {
                                    num = null;
                                }
                                Object qt1Var2 = new qt1(num);
                                l46Var.p0(qt1Var2);
                                objR = qt1Var2;
                            } else {
                                int size3 = list.size();
                                Integer numValueOf4 = Integer.valueOf(size3);
                                if (z2) {
                                    num = null;
                                } else {
                                    num = null;
                                }
                                Object qt1Var3 = new qt1(num);
                                l46Var.p0(qt1Var3);
                                objR = qt1Var3;
                            }
                            obj = (qt1) objR;
                            FillElement fillElement2 = b.c;
                            j09 j09VarD1 = ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, ynb.Y(j09Var4.D(fillElement2), xw9VarQ));
                            j09 j09Var6 = j09Var4;
                            boolean z13 = z6;
                            xw9 xw9Var8 = xw9VarQ;
                            c92 c92VarA2 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                            int iHashCode4 = Long.hashCode(l46Var.T);
                            u8a u8aVarM4 = l46Var.m();
                            j09 j09VarJ4 = m93.J(l46Var, j09VarD1);
                            lf2.q.getClass();
                            l46Var.j0();
                            z9 = l46Var.S;
                            x16Var2 = LayoutNode.h1;
                            if (z9) {
                                l46Var.l(x16Var2);
                            } else {
                                l46Var.s0();
                            }
                            he2 he2Var5 = hj6.z;
                            dec.l(he2Var5, l46Var, c92VarA2);
                            he2 he2Var6 = hj6.y;
                            dec.l(he2Var6, l46Var, u8aVarM4);
                            Integer numValueOf5 = Integer.valueOf(iHashCode4);
                            he2 he2Var7 = hj6.X;
                            dec.l(he2Var7, l46Var, numValueOf5);
                            dec.k(l46Var);
                            he2 he2Var8 = hj6.x;
                            dec.l(he2Var8, l46Var, j09VarJ4);
                            lx0 lx0Var2 = ndb.b;
                            xw9 xw9Var9 = xw9VarQ2;
                            xn8 xn8VarC3 = s21.c(lx0Var2, false);
                            int iHashCode5 = Long.hashCode(l46Var.T);
                            u8a u8aVarM5 = l46Var.m();
                            j09 j09VarJ5 = m93.J(l46Var, g09Var);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(x16Var2);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var5, l46Var, xn8VarC3);
                            dec.l(he2Var6, l46Var, u8aVarM5);
                            ib8.s(iHashCode5, l46Var, he2Var7, l46Var);
                            dec.l(he2Var8, l46Var, j09VarJ5);
                            tec.q((i23 >> 27) & 14, dd2Var, l46Var, true);
                            j09 j09VarA2 = mu9.a(fillElement2, lu9VarB);
                            j09VarA2.getClass();
                            obj.getClass();
                            l46Var.f0(-685173009);
                            b1bVar = l8b.a;
                            if (k8b.e((e8b) l46Var.k(b1bVar))) {
                                l46Var.f0(-685171119);
                                jD = ((e8b) l46Var.k(b1bVar)).u;
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                z10 = false;
                                if (l46Var.k(snd.b) != null) {
                                    l46Var.f0(-685169447);
                                    l46Var.r(false);
                                    jD = rx8.a;
                                } else {
                                    l46Var.f0(-685168363);
                                    l46Var.r(false);
                                    jD = abg.d(4284961270L);
                                }
                            }
                            l46Var.r(z10);
                            f2 = eze.a(l46Var).a.f;
                            zF = l46Var.f(jD) | l46Var.d(f2);
                            objR2 = l46Var.R();
                            j2 = jD;
                            if (zF) {
                                y6c y6cVarB2 = a7c.b(f2);
                                n4d n4dVar2 = new n4d(8.0f, j2, 0.0f, 0L, 44);
                                oq4.t.getClass();
                                objR2 = new DropShadowPainter(y6cVarB2, n4dVar2, qk6.z);
                                l46Var.p0(objR2);
                            } else {
                                y6c y6cVarB3 = a7c.b(f2);
                                n4d n4dVar3 = new n4d(8.0f, j2, 0.0f, 0L, 44);
                                oq4.t.getClass();
                                objR2 = new DropShadowPainter(y6cVarB3, n4dVar3, qk6.z);
                                l46Var.p0(objR2);
                            }
                            obj2 = (DropShadowPainter) objR2;
                            zG = l46Var.g(obj);
                            objR3 = l46Var.R();
                            if (zG) {
                                objR3 = new ot1(0, obj);
                                l46Var.p0(objR3);
                            } else {
                                objR3 = new ot1(0, obj);
                                l46Var.p0(objR3);
                            }
                            j09 j09VarW2 = nk8.w(j09VarA2, (a26) objR3);
                            zD = l46Var.d(f2) | l46Var.g(obj) | l46Var.i(obj2);
                            objR4 = l46Var.R();
                            if (zD) {
                                i14 = 1;
                                objR4 = new er(f2, obj, obj2, i14);
                                l46Var.p0(objR4);
                            } else {
                                i14 = 1;
                                objR4 = new er(f2, obj, obj2, i14);
                                l46Var.p0(objR4);
                            }
                            j09 j09VarT2 = b21.t(j09VarW2, (a26) objR4);
                            xn8 xn8VarC4 = s21.c(lx0Var2, false);
                            int iHashCode6 = Long.hashCode(l46Var.T);
                            u8a u8aVarM6 = l46Var.m();
                            j09 j09VarJ6 = m93.J(l46Var, j09VarT2);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(x16Var2);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var5, l46Var, xn8VarC4);
                            dec.l(he2Var6, l46Var, u8aVarM6);
                            ib8.s(iHashCode6, l46Var, he2Var7, l46Var);
                            dec.l(he2Var8, l46Var, j09VarJ6);
                            ghc ghcVarT2 = mh3.T(l46Var);
                            if (lu9VarB != null) {
                                lcgVar = new lcg(lu9VarB);
                            } else {
                                lcgVar = null;
                            }
                            j09 j09VarV2 = mh3.V(fillElement2, ghcVarT2, true, true, false, lcgVar);
                            bx9 bx9Var2 = new bx9(ynb.B(xw9Var9, cv7Var2), ((yi4) mh3.l(new yi4(xw9Var9.d()), new yi4(24.0f))).a, ynb.A(xw9Var9, cv7Var2), xw9Var9.a() + 24.0f);
                            zI = l46Var.i(obj);
                            objR5 = l46Var.R();
                            if (zI) {
                                objR5 = new gl(2, obj, qt1.class, "onCardPositioned", "onCardPositioned(ILandroidx/compose/ui/layout/LayoutCoordinates;)V", 0, 25);
                                l46Var.p0(objR5);
                            } else {
                                objR5 = new gl(2, obj, qt1.class, "onCardPositioned", "onCardPositioned(ILandroidx/compose/ui/layout/LayoutCoordinates;)V", 0, 25);
                                l46Var.p0(objR5);
                            }
                            boolean z14 = i14;
                            cgg.e(sddVar, j09VarV2, lyVar, bx9Var2, list, list2, 0, z2, z13, (l26) ((ym7) objR5), x16Var, l46Var, (i23 & 14) | ((i23 >> 3) & 896) | (i23 & 57344) | (i23 & 458752) | i13 | (i23 & 234881024), i12 & 14);
                            l46Var.r(z14);
                            l46Var.r(z14);
                            z5 = z13;
                            j09Var3 = j09Var6;
                            xw9Var5 = xw9Var8;
                            xw9Var4 = xw9Var9;
                        } else {
                            l46Var.Z();
                            xw9Var4 = xw9Var2;
                            z5 = z3;
                            j09Var3 = j09Var2;
                            xw9Var5 = xw9Var3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: f2a
                                @Override // defpackage.l26
                                public final Object z(Object obj5, Object obj6) {
                                    ((Integer) obj6).getClass();
                                    int iP = k99.P(i2 | 1);
                                    int iP2 = k99.P(i3);
                                    tm7.j(sddVar, j09Var3, xw9Var5, lyVar, list, list2, xw9Var4, z2, z5, dd2Var, x16Var, (l46) obj5, iP, iP2, i4);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i5 |= 48;
                    j09Var2 = j09Var;
                    i6 = i4 & 2;
                    if (i6 != 0) {
                        if ((i2 & 384) == 0) {
                            xw9Var3 = xw9Var;
                            if (l46Var.g(xw9Var3)) {
                                i7 = 256;
                            } else {
                                i7 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            }
                            i5 |= i7;
                        }
                        if ((i2 & 3072) == 0) {
                            if ((i2 & 4096) == 0) {
                                zI4 = l46Var.g(lyVar);
                            } else {
                                zI4 = l46Var.i(lyVar);
                            }
                            if (zI4) {
                                i20 = 2048;
                            } else {
                                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                            }
                            i5 |= i20;
                        }
                        if ((i2 & 24576) == 0) {
                            if ((32768 & i2) == 0) {
                                zI3 = l46Var.g(list);
                            } else {
                                zI3 = l46Var.i(list);
                            }
                            if (zI3) {
                                i19 = 16384;
                            } else {
                                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                            }
                            i5 |= i19;
                        }
                        if ((196608 & i2) == 0) {
                            if ((262144 & i2) == 0) {
                                zI2 = l46Var.g(list2);
                            } else {
                                zI2 = l46Var.i(list2);
                            }
                            if (zI2) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i5 |= i18;
                        }
                        i8 = i4 & 32;
                        if (i8 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (l46Var.g(xw9Var2)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i5 |= i9;
                        }
                        if ((i2 & 12582912) == 0) {
                            if (l46Var.h(z2)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i5 |= i17;
                        }
                        i10 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        if (i10 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (l46Var.h(z3)) {
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i5 |= i11;
                        }
                        if ((i2 & 805306368) == 0) {
                            if (l46Var.i(dd2Var)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i5 |= i16;
                        }
                        if ((i3 & 6) == 0) {
                            if (l46Var.i(x16Var)) {
                                i15 = 4;
                            } else {
                                i15 = 2;
                            }
                            i12 = i3 | i15;
                        } else {
                            i12 = i3;
                        }
                        if ((i5 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (l46Var.W(i5 & 1, z4)) {
                            g09Var = g09.a;
                            if (i21 != 0) {
                                j09Var4 = g09Var;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i6 != 0) {
                                xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                            } else {
                                xw9VarQ = xw9Var3;
                            }
                            if (i8 != 0) {
                                xw9VarQ2 = ynb.q(0.0f, 0.0f, 3);
                            } else {
                                xw9VarQ2 = xw9Var2;
                            }
                            int i24 = i5;
                            if (i10 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            cv7 cv7Var3 = (cv7) l46Var.k(zg2.n);
                            lu9VarB = mu9.b(l46Var);
                            boolean zE3 = l46Var.e(list2.size()) | l46Var.e(list.size());
                            i13 = 29360128 & i24;
                            if (i13 == 8388608) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = zE3 | z7;
                            objR = l46Var.R();
                            Object obj5 = sf2.a;
                            if (z8) {
                                int size4 = list.size();
                                Integer numValueOf6 = Integer.valueOf(size4);
                                if (z2) {
                                    num = null;
                                } else {
                                    num = null;
                                }
                                Object qt1Var4 = new qt1(num);
                                l46Var.p0(qt1Var4);
                                objR = qt1Var4;
                            } else {
                                int size5 = list.size();
                                Integer numValueOf7 = Integer.valueOf(size5);
                                if (z2) {
                                    num = null;
                                } else {
                                    num = null;
                                }
                                Object qt1Var5 = new qt1(num);
                                l46Var.p0(qt1Var5);
                                objR = qt1Var5;
                            }
                            obj = (qt1) objR;
                            FillElement fillElement3 = b.c;
                            j09 j09VarD2 = ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, ynb.Y(j09Var4.D(fillElement3), xw9VarQ));
                            j09 j09Var7 = j09Var4;
                            boolean z15 = z6;
                            xw9 xw9Var10 = xw9VarQ;
                            c92 c92VarA3 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                            int iHashCode7 = Long.hashCode(l46Var.T);
                            u8a u8aVarM7 = l46Var.m();
                            j09 j09VarJ7 = m93.J(l46Var, j09VarD2);
                            lf2.q.getClass();
                            l46Var.j0();
                            z9 = l46Var.S;
                            x16Var2 = LayoutNode.h1;
                            if (z9) {
                                l46Var.l(x16Var2);
                            } else {
                                l46Var.s0();
                            }
                            he2 he2Var9 = hj6.z;
                            dec.l(he2Var9, l46Var, c92VarA3);
                            he2 he2Var10 = hj6.y;
                            dec.l(he2Var10, l46Var, u8aVarM7);
                            Integer numValueOf8 = Integer.valueOf(iHashCode7);
                            he2 he2Var11 = hj6.X;
                            dec.l(he2Var11, l46Var, numValueOf8);
                            dec.k(l46Var);
                            he2 he2Var12 = hj6.x;
                            dec.l(he2Var12, l46Var, j09VarJ7);
                            lx0 lx0Var3 = ndb.b;
                            xw9 xw9Var11 = xw9VarQ2;
                            xn8 xn8VarC5 = s21.c(lx0Var3, false);
                            int iHashCode8 = Long.hashCode(l46Var.T);
                            u8a u8aVarM8 = l46Var.m();
                            j09 j09VarJ8 = m93.J(l46Var, g09Var);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(x16Var2);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var9, l46Var, xn8VarC5);
                            dec.l(he2Var10, l46Var, u8aVarM8);
                            ib8.s(iHashCode8, l46Var, he2Var11, l46Var);
                            dec.l(he2Var12, l46Var, j09VarJ8);
                            tec.q((i24 >> 27) & 14, dd2Var, l46Var, true);
                            j09 j09VarA3 = mu9.a(fillElement3, lu9VarB);
                            j09VarA3.getClass();
                            obj.getClass();
                            l46Var.f0(-685173009);
                            b1bVar = l8b.a;
                            if (k8b.e((e8b) l46Var.k(b1bVar))) {
                                l46Var.f0(-685171119);
                                jD = ((e8b) l46Var.k(b1bVar)).u;
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                z10 = false;
                                if (l46Var.k(snd.b) != null) {
                                    l46Var.f0(-685169447);
                                    l46Var.r(false);
                                    jD = rx8.a;
                                } else {
                                    l46Var.f0(-685168363);
                                    l46Var.r(false);
                                    jD = abg.d(4284961270L);
                                }
                            }
                            l46Var.r(z10);
                            f2 = eze.a(l46Var).a.f;
                            zF = l46Var.f(jD) | l46Var.d(f2);
                            objR2 = l46Var.R();
                            j2 = jD;
                            if (zF) {
                                y6c y6cVarB4 = a7c.b(f2);
                                n4d n4dVar4 = new n4d(8.0f, j2, 0.0f, 0L, 44);
                                oq4.t.getClass();
                                objR2 = new DropShadowPainter(y6cVarB4, n4dVar4, qk6.z);
                                l46Var.p0(objR2);
                            } else {
                                y6c y6cVarB5 = a7c.b(f2);
                                n4d n4dVar5 = new n4d(8.0f, j2, 0.0f, 0L, 44);
                                oq4.t.getClass();
                                objR2 = new DropShadowPainter(y6cVarB5, n4dVar5, qk6.z);
                                l46Var.p0(objR2);
                            }
                            obj2 = (DropShadowPainter) objR2;
                            zG = l46Var.g(obj);
                            objR3 = l46Var.R();
                            if (zG) {
                                objR3 = new ot1(0, obj);
                                l46Var.p0(objR3);
                            } else {
                                objR3 = new ot1(0, obj);
                                l46Var.p0(objR3);
                            }
                            j09 j09VarW3 = nk8.w(j09VarA3, (a26) objR3);
                            zD = l46Var.d(f2) | l46Var.g(obj) | l46Var.i(obj2);
                            objR4 = l46Var.R();
                            if (zD) {
                                i14 = 1;
                                objR4 = new er(f2, obj, obj2, i14);
                                l46Var.p0(objR4);
                            } else {
                                i14 = 1;
                                objR4 = new er(f2, obj, obj2, i14);
                                l46Var.p0(objR4);
                            }
                            j09 j09VarT3 = b21.t(j09VarW3, (a26) objR4);
                            xn8 xn8VarC6 = s21.c(lx0Var3, false);
                            int iHashCode9 = Long.hashCode(l46Var.T);
                            u8a u8aVarM9 = l46Var.m();
                            j09 j09VarJ9 = m93.J(l46Var, j09VarT3);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(x16Var2);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var9, l46Var, xn8VarC6);
                            dec.l(he2Var10, l46Var, u8aVarM9);
                            ib8.s(iHashCode9, l46Var, he2Var11, l46Var);
                            dec.l(he2Var12, l46Var, j09VarJ9);
                            ghc ghcVarT3 = mh3.T(l46Var);
                            if (lu9VarB != null) {
                                lcgVar = new lcg(lu9VarB);
                            } else {
                                lcgVar = null;
                            }
                            j09 j09VarV3 = mh3.V(fillElement3, ghcVarT3, true, true, false, lcgVar);
                            bx9 bx9Var3 = new bx9(ynb.B(xw9Var11, cv7Var3), ((yi4) mh3.l(new yi4(xw9Var11.d()), new yi4(24.0f))).a, ynb.A(xw9Var11, cv7Var3), xw9Var11.a() + 24.0f);
                            zI = l46Var.i(obj);
                            objR5 = l46Var.R();
                            if (zI) {
                                objR5 = new gl(2, obj, qt1.class, "onCardPositioned", "onCardPositioned(ILandroidx/compose/ui/layout/LayoutCoordinates;)V", 0, 25);
                                l46Var.p0(objR5);
                            } else {
                                objR5 = new gl(2, obj, qt1.class, "onCardPositioned", "onCardPositioned(ILandroidx/compose/ui/layout/LayoutCoordinates;)V", 0, 25);
                                l46Var.p0(objR5);
                            }
                            boolean z16 = i14;
                            cgg.e(sddVar, j09VarV3, lyVar, bx9Var3, list, list2, 0, z2, z15, (l26) ((ym7) objR5), x16Var, l46Var, (i24 & 14) | ((i24 >> 3) & 896) | (i24 & 57344) | (i24 & 458752) | i13 | (i24 & 234881024), i12 & 14);
                            l46Var.r(z16);
                            l46Var.r(z16);
                            z5 = z15;
                            j09Var3 = j09Var7;
                            xw9Var5 = xw9Var10;
                            xw9Var4 = xw9Var11;
                        } else {
                            l46Var.Z();
                            xw9Var4 = xw9Var2;
                            z5 = z3;
                            j09Var3 = j09Var2;
                            xw9Var5 = xw9Var3;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: f2a
                                @Override // defpackage.l26
                                public final Object z(Object obj6, Object obj7) {
                                    ((Integer) obj7).getClass();
                                    int iP = k99.P(i2 | 1);
                                    int iP2 = k99.P(i3);
                                    tm7.j(sddVar, j09Var3, xw9Var5, lyVar, list, list2, xw9Var4, z2, z5, dd2Var, x16Var, (l46) obj6, iP, iP2, i4);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i5 |= 384;
                    xw9Var3 = xw9Var;
                    if ((i2 & 3072) == 0) {
                        if ((i2 & 4096) == 0) {
                            zI4 = l46Var.g(lyVar);
                        } else {
                            zI4 = l46Var.i(lyVar);
                        }
                        if (zI4) {
                            i20 = 2048;
                        } else {
                            i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        i5 |= i20;
                    }
                    if ((i2 & 24576) == 0) {
                        if ((32768 & i2) == 0) {
                            zI3 = l46Var.g(list);
                        } else {
                            zI3 = l46Var.i(list);
                        }
                        if (zI3) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i5 |= i19;
                    }
                    if ((196608 & i2) == 0) {
                        if ((262144 & i2) == 0) {
                            zI2 = l46Var.g(list2);
                        } else {
                            zI2 = l46Var.i(list2);
                        }
                        if (zI2) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i5 |= i18;
                    }
                    i8 = i4 & 32;
                    if (i8 != 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (l46Var.g(xw9Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i5 |= i9;
                    }
                    if ((i2 & 12582912) == 0) {
                        if (l46Var.h(z2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i5 |= i17;
                    }
                    i10 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    if (i10 != 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (l46Var.h(z3)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i5 |= i11;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (l46Var.i(dd2Var)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i5 |= i16;
                    }
                    if ((i3 & 6) == 0) {
                        if (l46Var.i(x16Var)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i12 = i3 | i15;
                    } else {
                        i12 = i3;
                    }
                    if ((i5 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i5 & 1, z4)) {
                        g09Var = g09.a;
                        if (i21 != 0) {
                            j09Var4 = g09Var;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i6 != 0) {
                            xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                        } else {
                            xw9VarQ = xw9Var3;
                        }
                        if (i8 != 0) {
                            xw9VarQ2 = ynb.q(0.0f, 0.0f, 3);
                        } else {
                            xw9VarQ2 = xw9Var2;
                        }
                        int i25 = i5;
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        cv7 cv7Var4 = (cv7) l46Var.k(zg2.n);
                        lu9VarB = mu9.b(l46Var);
                        boolean zE4 = l46Var.e(list2.size()) | l46Var.e(list.size());
                        i13 = 29360128 & i25;
                        if (i13 == 8388608) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = zE4 | z7;
                        objR = l46Var.R();
                        Object obj6 = sf2.a;
                        if (z8) {
                            int size6 = list.size();
                            Integer numValueOf9 = Integer.valueOf(size6);
                            if (z2) {
                                num = null;
                            } else {
                                num = null;
                            }
                            Object qt1Var6 = new qt1(num);
                            l46Var.p0(qt1Var6);
                            objR = qt1Var6;
                        } else {
                            int size7 = list.size();
                            Integer numValueOf10 = Integer.valueOf(size7);
                            if (z2) {
                                num = null;
                            } else {
                                num = null;
                            }
                            Object qt1Var7 = new qt1(num);
                            l46Var.p0(qt1Var7);
                            objR = qt1Var7;
                        }
                        obj = (qt1) objR;
                        FillElement fillElement4 = b.c;
                        j09 j09VarD3 = ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, ynb.Y(j09Var4.D(fillElement4), xw9VarQ));
                        j09 j09Var8 = j09Var4;
                        boolean z17 = z6;
                        xw9 xw9Var12 = xw9VarQ;
                        c92 c92VarA4 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                        int iHashCode10 = Long.hashCode(l46Var.T);
                        u8a u8aVarM10 = l46Var.m();
                        j09 j09VarJ10 = m93.J(l46Var, j09VarD3);
                        lf2.q.getClass();
                        l46Var.j0();
                        z9 = l46Var.S;
                        x16Var2 = LayoutNode.h1;
                        if (z9) {
                            l46Var.l(x16Var2);
                        } else {
                            l46Var.s0();
                        }
                        he2 he2Var13 = hj6.z;
                        dec.l(he2Var13, l46Var, c92VarA4);
                        he2 he2Var14 = hj6.y;
                        dec.l(he2Var14, l46Var, u8aVarM10);
                        Integer numValueOf11 = Integer.valueOf(iHashCode10);
                        he2 he2Var15 = hj6.X;
                        dec.l(he2Var15, l46Var, numValueOf11);
                        dec.k(l46Var);
                        he2 he2Var16 = hj6.x;
                        dec.l(he2Var16, l46Var, j09VarJ10);
                        lx0 lx0Var4 = ndb.b;
                        xw9 xw9Var13 = xw9VarQ2;
                        xn8 xn8VarC7 = s21.c(lx0Var4, false);
                        int iHashCode11 = Long.hashCode(l46Var.T);
                        u8a u8aVarM11 = l46Var.m();
                        j09 j09VarJ11 = m93.J(l46Var, g09Var);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(x16Var2);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var13, l46Var, xn8VarC7);
                        dec.l(he2Var14, l46Var, u8aVarM11);
                        ib8.s(iHashCode11, l46Var, he2Var15, l46Var);
                        dec.l(he2Var16, l46Var, j09VarJ11);
                        tec.q((i25 >> 27) & 14, dd2Var, l46Var, true);
                        j09 j09VarA4 = mu9.a(fillElement4, lu9VarB);
                        j09VarA4.getClass();
                        obj.getClass();
                        l46Var.f0(-685173009);
                        b1bVar = l8b.a;
                        if (k8b.e((e8b) l46Var.k(b1bVar))) {
                            l46Var.f0(-685171119);
                            jD = ((e8b) l46Var.k(b1bVar)).u;
                            z10 = false;
                            l46Var.r(false);
                        } else {
                            z10 = false;
                            if (l46Var.k(snd.b) != null) {
                                l46Var.f0(-685169447);
                                l46Var.r(false);
                                jD = rx8.a;
                            } else {
                                l46Var.f0(-685168363);
                                l46Var.r(false);
                                jD = abg.d(4284961270L);
                            }
                        }
                        l46Var.r(z10);
                        f2 = eze.a(l46Var).a.f;
                        zF = l46Var.f(jD) | l46Var.d(f2);
                        objR2 = l46Var.R();
                        j2 = jD;
                        if (zF) {
                            y6c y6cVarB6 = a7c.b(f2);
                            n4d n4dVar6 = new n4d(8.0f, j2, 0.0f, 0L, 44);
                            oq4.t.getClass();
                            objR2 = new DropShadowPainter(y6cVarB6, n4dVar6, qk6.z);
                            l46Var.p0(objR2);
                        } else {
                            y6c y6cVarB7 = a7c.b(f2);
                            n4d n4dVar7 = new n4d(8.0f, j2, 0.0f, 0L, 44);
                            oq4.t.getClass();
                            objR2 = new DropShadowPainter(y6cVarB7, n4dVar7, qk6.z);
                            l46Var.p0(objR2);
                        }
                        obj2 = (DropShadowPainter) objR2;
                        zG = l46Var.g(obj);
                        objR3 = l46Var.R();
                        if (zG) {
                            objR3 = new ot1(0, obj);
                            l46Var.p0(objR3);
                        } else {
                            objR3 = new ot1(0, obj);
                            l46Var.p0(objR3);
                        }
                        j09 j09VarW4 = nk8.w(j09VarA4, (a26) objR3);
                        zD = l46Var.d(f2) | l46Var.g(obj) | l46Var.i(obj2);
                        objR4 = l46Var.R();
                        if (zD) {
                            i14 = 1;
                            objR4 = new er(f2, obj, obj2, i14);
                            l46Var.p0(objR4);
                        } else {
                            i14 = 1;
                            objR4 = new er(f2, obj, obj2, i14);
                            l46Var.p0(objR4);
                        }
                        j09 j09VarT4 = b21.t(j09VarW4, (a26) objR4);
                        xn8 xn8VarC8 = s21.c(lx0Var4, false);
                        int iHashCode12 = Long.hashCode(l46Var.T);
                        u8a u8aVarM12 = l46Var.m();
                        j09 j09VarJ12 = m93.J(l46Var, j09VarT4);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(x16Var2);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var13, l46Var, xn8VarC8);
                        dec.l(he2Var14, l46Var, u8aVarM12);
                        ib8.s(iHashCode12, l46Var, he2Var15, l46Var);
                        dec.l(he2Var16, l46Var, j09VarJ12);
                        ghc ghcVarT4 = mh3.T(l46Var);
                        if (lu9VarB != null) {
                            lcgVar = new lcg(lu9VarB);
                        } else {
                            lcgVar = null;
                        }
                        j09 j09VarV4 = mh3.V(fillElement4, ghcVarT4, true, true, false, lcgVar);
                        bx9 bx9Var4 = new bx9(ynb.B(xw9Var13, cv7Var4), ((yi4) mh3.l(new yi4(xw9Var13.d()), new yi4(24.0f))).a, ynb.A(xw9Var13, cv7Var4), xw9Var13.a() + 24.0f);
                        zI = l46Var.i(obj);
                        objR5 = l46Var.R();
                        if (zI) {
                            objR5 = new gl(2, obj, qt1.class, "onCardPositioned", "onCardPositioned(ILandroidx/compose/ui/layout/LayoutCoordinates;)V", 0, 25);
                            l46Var.p0(objR5);
                        } else {
                            objR5 = new gl(2, obj, qt1.class, "onCardPositioned", "onCardPositioned(ILandroidx/compose/ui/layout/LayoutCoordinates;)V", 0, 25);
                            l46Var.p0(objR5);
                        }
                        boolean z18 = i14;
                        cgg.e(sddVar, j09VarV4, lyVar, bx9Var4, list, list2, 0, z2, z17, (l26) ((ym7) objR5), x16Var, l46Var, (i25 & 14) | ((i25 >> 3) & 896) | (i25 & 57344) | (i25 & 458752) | i13 | (i25 & 234881024), i12 & 14);
                        l46Var.r(z18);
                        l46Var.r(z18);
                        z5 = z17;
                        j09Var3 = j09Var8;
                        xw9Var5 = xw9Var12;
                        xw9Var4 = xw9Var13;
                    } else {
                        l46Var.Z();
                        xw9Var4 = xw9Var2;
                        z5 = z3;
                        j09Var3 = j09Var2;
                        xw9Var5 = xw9Var3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: f2a
                            @Override // defpackage.l26
                            public final Object z(Object obj7, Object obj8) {
                                ((Integer) obj8).getClass();
                                int iP = k99.P(i2 | 1);
                                int iP2 = k99.P(i3);
                                tm7.j(sddVar, j09Var3, xw9Var5, lyVar, list, list2, xw9Var4, z2, z5, dd2Var, x16Var, (l46) obj7, iP, iP2, i4);
                                return wef.a;
                            }
                        };
                    }
                }

                public static final void k(boolean z2, k00 k00Var, k00 k00Var2, k00 k00Var3, l46 l46Var, int i2, int i3) {
                    int i4;
                    int i5;
                    k00 k00Var4;
                    l46Var.h0(1476949405);
                    if ((i2 & 6) == 0) {
                        i4 = (l46Var.h(z2) ? 4 : 2) | i2;
                    } else {
                        i4 = i2;
                    }
                    int i6 = 16;
                    if ((i2 & 48) == 0) {
                        i4 |= l46Var.g(k00Var) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        i4 |= l46Var.g(k00Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    int i7 = i3 & 8;
                    if (i7 != 0) {
                        i5 = i4 | 3072;
                    } else {
                        i5 = i4 | (l46Var.g(k00Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
                    }
                    if (l46Var.W(i5 & 1, (i5 & 1171) != 1170)) {
                        k00 k00Var5 = i7 != 0 ? null : k00Var3;
                        m93.d(z2, null, null, null, null, nk8.d, l46Var, (i5 & 14) | 196608, 30);
                        m93.d(!z2, null, null, null, null, af1.b0(62466796, new j41(k00Var, k00Var2, k00Var5, i6), l46Var), l46Var, 196608, 30);
                        k00Var4 = k00Var5;
                    } else {
                        l46Var.Z();
                        k00Var4 = k00Var3;
                    }
                    ojb ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new lc2(z2, k00Var, k00Var2, k00Var4, i2, i3);
                    }
                }

                public static final void l(int i2, x16 x16Var, x16 x16Var2, l46 l46Var, boolean z2) {
                    int i3;
                    l46Var.h0(1887168730);
                    if ((i2 & 6) == 0) {
                        i3 = (l46Var.h(z2) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= l46Var.i(x16Var) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        i3 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    if (!l46Var.W(i3 & 1, (i3 & 147) != 146)) {
                        l46Var.Z();
                    } else {
                        if (!z2) {
                            ojb ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new e21(z2, x16Var, x16Var2, i2, 0);
                                return;
                            }
                            return;
                        }
                        int i4 = i3;
                        kj0.F(afc.q(R.string.auth_login_phone_has_been_bound, l46Var), vd0.f, afc.q(R.string.auth_login_sign_in_directly, l46Var), afc.q(R.string.auth_login_please_change_phone_cancel, l46Var), false, false, null, null, x16Var2, x16Var, l46Var, ((i4 << 18) & 234881024) | 48 | ((i4 << 24) & 1879048192), 240);
                    }
                    ojb ojbVarV2 = l46Var.v();
                    if (ojbVarV2 != null) {
                        ojbVarV2.d = new e21(z2, x16Var, x16Var2, i2, 1);
                    }
                }

                public static final String m(kg4 kg4Var, boolean z2, l46 l46Var, int i2) {
                    kg4Var.getClass();
                    if ((i2 & 2) != 0) {
                        z2 = false;
                    }
                    int iOrdinal = kg4Var.ordinal();
                    if (iOrdinal == 0) {
                        return tec.i(l46Var, 1248280292, R.string.domain_love, l46Var, false);
                    }
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return tec.i(l46Var, 1248289574, R.string.domain_wealth, l46Var, false);
                        }
                        if (iOrdinal == 3) {
                            return tec.i(l46Var, 1248292422, R.string.domain_health, l46Var, false);
                        }
                        if (iOrdinal == 4) {
                            return tec.i(l46Var, 1248295468, R.string.domain_relationship, l46Var, false);
                        }
                        if (iOrdinal == 5) {
                            return tec.i(l46Var, 1248298566, R.string.domain_growth, l46Var, false);
                        }
                        ap.c();
                        return null;
                    }
                    if (z2) {
                        l46Var.f0(1248283330);
                        l46Var.f0(1248283909);
                        String strQ = afc.q(R.string.domain_study, l46Var);
                        l46Var.r(false);
                        l46Var.r(false);
                        return strQ;
                    }
                    l46Var.f0(1248285923);
                    l46Var.f0(1248286502);
                    String strQ2 = afc.q(R.string.domain_career, l46Var);
                    l46Var.r(false);
                    l46Var.r(false);
                    return strQ2;
                }

                public static j09 n(j09 j09Var, b41 b41Var, x4d x4dVar, int i2) {
                    if ((i2 & 2) != 0) {
                        x4dVar = g21.f;
                    }
                    return j09Var.D(new qs0(0L, b41Var, x4dVar, 1));
                }

                public static final j09 o(j09 j09Var, long j2, x4d x4dVar) {
                    return j09Var.D(new qs0(j2, null, x4dVar, 2));
                }

                public static final j97 p(j97 j97Var, String str) {
                    TarotReadingBody reading;
                    String content;
                    String strJ = k99.J(str);
                    TarotReadingHistory tarotReadingHistory = j97Var.b;
                    String str2 = null;
                    if (tarotReadingHistory != null) {
                        if (!k99.J(tarotReadingHistory.getChatId()).equals(strJ)) {
                            tarotReadingHistory = null;
                        }
                        if (tarotReadingHistory != null && (reading = tarotReadingHistory.getReading()) != null && (content = reading.getContent()) != null && !v4e.Q(content)) {
                            str2 = content;
                        }
                    }
                    return (str2 == null || str2.equals(j97Var.a)) ? j97Var : new j97(str2, j97Var.b);
                }

                public static void q(Object obj, String str) {
                    if (obj != null) {
                        return;
                    }
                    r82.g(str);
                }

                public static final e89 r(wj5 wj5Var, Object obj, l46 l46Var, int i2) {
                    return s(wj5Var, obj, ((x48) l46Var.k(cb8.a)).k(), l46Var, i2 & 112);
                }

                public static final e89 s(wj5 wj5Var, Object obj, h48 h48Var, l46 l46Var, int i2) {
                    g48 g48Var = g48.d;
                    nu4 nu4Var = nu4.a;
                    Object[] objArr = {wj5Var, h48Var, g48Var, nu4Var};
                    boolean zI = ((((i2 & 7168) ^ 3072) > 2048 && l46Var.e(g48Var.ordinal())) || (i2 & 3072) == 2048) | l46Var.i(h48Var) | l46Var.i(nu4Var) | l46Var.i(wj5Var);
                    Object objR = l46Var.R();
                    if (zI || objR == sf2.a) {
                        objR = new ek5(h48Var, g48Var, nu4Var, wj5Var, null);
                        l46Var.p0(objR);
                    }
                    return uyb.z(obj, objArr, (l26) objR, l46Var);
                }

                public static final e89 t(q0e q0eVar, l46 l46Var) {
                    return s(q0eVar, q0eVar.getValue(), ((x48) l46Var.k(cb8.a)).k(), l46Var, 0);
                }

                public static final j2 u(em7 em7Var) {
                    em7Var.getClass();
                    List listG = xo1.g(em7Var);
                    ArrayList arrayList = new ArrayList(t72.u(listG, 10));
                    Iterator it = listG.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new do7(qn4.x((ao7) it.next(), null, false, 7), io7.a));
                    }
                    return qn4.x(em7Var, arrayList, false, 6);
                }

                public static boolean v(no7 no7Var, View view, Window.Callback callback, KeyEvent keyEvent) {
                    DialogInterface.OnKeyListener onKeyListener;
                    boolean zBooleanValue = false;
                    if (no7Var != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            return no7Var.i(keyEvent);
                        }
                        if (callback instanceof Activity) {
                            Activity activity = (Activity) callback;
                            activity.onUserInteraction();
                            Window window = activity.getWindow();
                            if (window.hasFeature(8)) {
                                ActionBar actionBar = activity.getActionBar();
                                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                                    if (!H) {
                                        try {
                                            I = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                                        } catch (NoSuchMethodException unused) {
                                        }
                                        H = true;
                                    }
                                    Method method = I;
                                    if (method != null) {
                                        try {
                                            Object objInvoke = method.invoke(actionBar, keyEvent);
                                            if (objInvoke != null) {
                                                zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                            }
                                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        }
                                    }
                                    if (zBooleanValue) {
                                        return true;
                                    }
                                }
                            }
                            if (window.superDispatchKeyEvent(keyEvent)) {
                                return true;
                            }
                            View decorView = window.getDecorView();
                            if (nvf.c(decorView, keyEvent)) {
                                return true;
                            }
                            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
                        }
                        if (callback instanceof Dialog) {
                            Dialog dialog = (Dialog) callback;
                            if (!J) {
                                try {
                                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                                    K = declaredField;
                                    declaredField.setAccessible(true);
                                } catch (NoSuchFieldException unused3) {
                                }
                                J = true;
                            }
                            Field field = K;
                            if (field != null) {
                                try {
                                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                                } catch (IllegalAccessException unused4) {
                                    onKeyListener = null;
                                }
                            } else {
                                onKeyListener = null;
                            }
                            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                                return true;
                            }
                            Window window2 = dialog.getWindow();
                            if (window2.superDispatchKeyEvent(keyEvent)) {
                                return true;
                            }
                            View decorView2 = window2.getDecorView();
                            if (nvf.c(decorView2, keyEvent)) {
                                return true;
                            }
                            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                        }
                        if ((view != null && nvf.c(view, keyEvent)) || no7Var.i(keyEvent)) {
                            return true;
                        }
                    }
                    return false;
                }

                public static final String w(kg4 kg4Var, Context context, boolean z2) {
                    kg4Var.getClass();
                    int iOrdinal = kg4Var.ordinal();
                    if (iOrdinal == 0) {
                        String string = context.getString(R.string.domain_love);
                        string.getClass();
                        return string;
                    }
                    if (iOrdinal == 1) {
                        String string2 = context.getString(z2 ? R.string.domain_study : R.string.domain_career);
                        string2.getClass();
                        return string2;
                    }
                    if (iOrdinal == 2) {
                        String string3 = context.getString(R.string.domain_wealth);
                        string3.getClass();
                        return string3;
                    }
                    if (iOrdinal == 3) {
                        String string4 = context.getString(R.string.domain_health);
                        string4.getClass();
                        return string4;
                    }
                    if (iOrdinal == 4) {
                        String string5 = context.getString(R.string.domain_relationship);
                        string5.getClass();
                        return string5;
                    }
                    if (iOrdinal != 5) {
                        ap.c();
                        return null;
                    }
                    String string6 = context.getString(R.string.domain_growth);
                    string6.getClass();
                    return string6;
                }

                public static final String x(g19 g19Var, Context context) {
                    g19Var.getClass();
                    switch (g19Var.ordinal()) {
                        case 0:
                            String string = context.getString(R.string.month_january);
                            string.getClass();
                            return string;
                        case 1:
                            String string2 = context.getString(R.string.month_february);
                            string2.getClass();
                            return string2;
                        case 2:
                            String string3 = context.getString(R.string.month_march);
                            string3.getClass();
                            return string3;
                        case 3:
                            String string4 = context.getString(R.string.month_april);
                            string4.getClass();
                            return string4;
                        case 4:
                            String string5 = context.getString(R.string.month_may);
                            string5.getClass();
                            return string5;
                        case 5:
                            String string6 = context.getString(R.string.month_june);
                            string6.getClass();
                            return string6;
                        case 6:
                            String string7 = context.getString(R.string.month_july);
                            string7.getClass();
                            return string7;
                        case 7:
                            String string8 = context.getString(R.string.month_august);
                            string8.getClass();
                            return string8;
                        case 8:
                            String string9 = context.getString(R.string.month_september);
                            string9.getClass();
                            return string9;
                        case 9:
                            String string10 = context.getString(R.string.month_october);
                            string10.getClass();
                            return string10;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            String string11 = context.getString(R.string.month_november);
                            string11.getClass();
                            return string11;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            String string12 = context.getString(R.string.month_december);
                            string12.getClass();
                            return string12;
                        default:
                            ap.c();
                            return null;
                    }
                }

                public static final void y(vv7 vv7Var) throws Exception {
                    try {
                        vv7Var.a();
                    } catch (Exception e2) {
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        if (!v4e.F(message, "mViewFlags", false) && !v4e.F(message, "LayoutNode", false)) {
                            throw e2;
                        }
                    }
                }

                public static final ti7 z(u79 u79Var) {
                    iy9 iy9Var = new iy9("epochMillis", oh7.b(Long.valueOf(u79Var.b())));
                    iy9 iy9Var2 = new iy9("iso", oh7.c(e3b.a(u79Var).toString()));
                    whb whbVar = u79Var.b;
                    return new ti7(bm8.H(iy9Var, iy9Var2, new iy9("isOverridden", oh7.a(Boolean.valueOf(whbVar.a.getValue() != null))), new iy9("display", oh7.c(whbVar.a.getValue() != null ? e3b.a(u79Var).toString() : "真实时间"))));
                }
            }
