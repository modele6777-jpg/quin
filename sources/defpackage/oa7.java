package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.work.impl.WorkDatabase;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.Serializable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oa7 {
    public static final gxc f;
    public static final gxc h;
    public static volatile eog j;
    public static final byte[] a = {-75, 0, 60, 0, 1, 4};
    public static final dd2 b = new dd2(new gd2(27), false, -1326982000);
    public static final dd2 c = new dd2(new ce2(2), false, 1448625710);
    public static final dd2 d = new dd2(new he2(3), false, -1351364472);
    public static final int[] e = {13, 15, 14};
    public static final gxc g = new gxc("AccessibilityClassName", true, new qdc(22));
    public static final Object i = new Object();

    static {
        byte b2 = 0;
        f = new gxc("TestTagsAsResourceId", false, new dxc(b2, b2));
        h = new gxc("CredentialRequest", false, new dxc(1, b2));
    }

    public static void A(Object obj) {
        if (obj != null) {
            return;
        }
        r82.g("null reference");
    }

    public static void B(Object obj, String str) {
        if (obj != null) {
            return;
        }
        r82.g(str);
    }

    public static void C(String str, boolean z) {
        if (z) {
            return;
        }
        qc0.p(str);
    }

    public static final cyc D(rf0 rf0Var) {
        return fyc.u(new z8b(14), rf0Var.b.b);
    }

    public static final j09 E(j09 j09Var, x4d x4dVar) {
        return bzd.y(j09Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, x4dVar, true, 0L, 0L, 1042431);
    }

    public static final j09 F(j09 j09Var) {
        return bzd.y(j09Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 1044479);
    }

    public static final int G(tt7 tt7Var) {
        tt7Var.getClass();
        u00 u00VarR = tt7Var.getAnnotations().R(syd.q);
        if (u00VarR == null) {
            return 0;
        }
        bl2 bl2Var = (bl2) bm8.B(u00VarR.g(), tyd.e);
        bl2Var.getClass();
        return ((Number) ((g77) bl2Var).a).intValue();
    }

    public static mr7 H(em7 em7Var, l26 l26Var, z3b z3bVar, lp7 lp7Var, t09 t09Var, boolean z, int i2) {
        u57 ckdVar;
        o4e o4eVar = szc.v;
        if ((i2 & 64) != 0) {
            z = false;
        }
        em7Var.getClass();
        o4eVar.getClass();
        yw0 yw0Var = new yw0(o4eVar, em7Var, z3bVar, l26Var, lp7Var);
        int iOrdinal = lp7Var.ordinal();
        if (iOrdinal == 0) {
            ckdVar = new ckd(yw0Var);
        } else if (iOrdinal == 1) {
            ckdVar = new w95(yw0Var);
        } else {
            if (iOrdinal != 2) {
                ap.c();
                return null;
            }
            tfc tfcVar = new tfc(yw0Var);
            tfcVar.b = new ConcurrentHashMap();
            ckdVar = tfcVar;
        }
        t09Var.a(ckdVar);
        if (z && lp7Var == lp7.a && (ckdVar instanceof ckd)) {
            t09Var.b.add(ckdVar);
        }
        return new mr7(t09Var, ckdVar);
    }

    public static final tjd I(xr7 xr7Var, h10 h10Var, tt7 tt7Var, List list, ArrayList arrayList, tt7 tt7Var2, boolean z) {
        u09 u09VarK;
        h10 j10Var = hj6.c;
        int i2 = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (tt7Var != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tt7 tt7Var3 = (tt7) it.next();
            tt7Var3.getClass();
            arrayList3.add(new dzd(tt7Var3));
        }
        arrayList2.addAll(arrayList3);
        dzd dzdVar = tt7Var != null ? new dzd(tt7Var) : null;
        if (dzdVar != null) {
            arrayList2.add(dzdVar);
        }
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                t72.Z();
                throw null;
            }
            tt7 tt7Var4 = (tt7) obj;
            tt7Var4.getClass();
            arrayList2.add(new dzd(tt7Var4));
            i3 = i4;
        }
        arrayList2.add(new dzd(tt7Var2));
        int size = list.size() + arrayList.size() + (tt7Var == null ? 0 : 1);
        if (z) {
            u09VarK = xr7Var.w(size);
        } else {
            t99 t99Var = tyd.a;
            u09VarK = xr7Var.k("Function" + size);
        }
        if (tt7Var != null) {
            dx5 dx5Var = syd.p;
            if (!h10Var.E(dx5Var)) {
                ArrayList arrayListP0 = s72.P0(h10Var, new a51(xr7Var, dx5Var, qu4.a));
                h10Var = arrayListP0.isEmpty() ? j10Var : new j10(i2, arrayListP0);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            dx5 dx5Var2 = syd.q;
            if (!h10Var.E(dx5Var2)) {
                ArrayList arrayListP1 = s72.P0(h10Var, new a51(xr7Var, dx5Var2, bm8.G(new iy9(tyd.e, new g77(size2)))));
                if (!arrayListP1.isEmpty()) {
                    j10Var = new j10(i2, arrayListP1);
                }
                h10Var = j10Var;
            }
        }
        return rxg.S(jzb.r(h10Var), u09VarK, arrayList2);
    }

    public static final t99 K(tt7 tt7Var) {
        String str;
        u00 u00VarR = tt7Var.getAnnotations().R(syd.r);
        if (u00VarR != null) {
            Object objY0 = s72.Y0(u00VarR.g().values());
            t4e t4eVar = objY0 instanceof t4e ? (t4e) objY0 : null;
            if (t4eVar != null && (str = (String) t4eVar.a) != null) {
                if (!t99.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return t99.e(str);
                }
            }
        }
        return null;
    }

    public static final List L(tt7 tt7Var) {
        tt7Var.getClass();
        S(tt7Var);
        int iG = G(tt7Var);
        if (iG == 0) {
            return pu4.a;
        }
        List listSubList = tt7Var.Z().subList(0, iG);
        ArrayList arrayList = new ArrayList(t72.u(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((i8f) it.next()).b());
        }
        return arrayList;
    }

    public static final m36 M(ex5 ex5Var) {
        if (!ex5Var.d() || ex5Var.c()) {
            return null;
        }
        o36 o36Var = o36.b;
        dx5 dx5VarB = ex5Var.i().b();
        String strB = ex5Var.g().b();
        strB.getClass();
        o36Var.getClass();
        n36 n36VarA = o36Var.a(dx5VarB, strB);
        if (n36VarA != null) {
            return n36VarA.a;
        }
        return null;
    }

    public static final tt7 N(tt7 tt7Var) {
        tt7Var.getClass();
        S(tt7Var);
        if (tt7Var.getAnnotations().R(syd.p) == null) {
            return null;
        }
        return ((i8f) tt7Var.Z().get(G(tt7Var))).b();
    }

    public static String O(String str, String str2) {
        return ub3.k("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    public static final List P(tt7 tt7Var) {
        tt7Var.getClass();
        S(tt7Var);
        List listZ = tt7Var.Z();
        return listZ.subList(((!S(tt7Var) || tt7Var.getAnnotations().R(syd.p) == null) ? 0 : 1) + G(tt7Var), listZ.size() - 1);
    }

    public static final mue R(l46 l46Var) {
        mue mueVar = pue.a;
        return mue.a(pue.g(l46Var), 0L, 0L, null, null, 0L, null, 0, w6c.l(16), new iga(), new y58(v58.b, 0, 0), 15073279);
    }

    public static final boolean S(tt7 tt7Var) {
        m36 m36VarM;
        tt7Var.getClass();
        y22 y22VarM = tt7Var.c0().m();
        if (y22VarM == null) {
            return false;
        }
        if ((y22VarM instanceof u09) && xr7.J(y22VarM)) {
            int i2 = qz3.a;
            ex5 ex5VarF = oz3.f(y22VarM);
            ex5VarF.getClass();
            m36VarM = M(ex5VarF);
        } else {
            m36VarM = null;
        }
        return pa7.t(m36VarM, i36.d) || pa7.t(m36VarM, l36.d);
    }

    public static boolean T(gh1 gh1Var) {
        Boolean bool;
        gh1Var.getClass();
        try {
            yg1 yg1Var = gh1Var.b;
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            key.getClass();
            bool = (Boolean) ((nc1) yg1Var).c(key);
        } catch (BufferUnderflowException e2) {
            if (s74.a().b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (b21.F(6, "CXCP")) {
                b1.e("CXCP", "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. Flash is not available.", e2);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null && b21.F(5, "CXCP")) {
            b1.l("CXCP", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean U(yn7 yn7Var, yn7 yn7Var2) {
        yn7Var.getClass();
        yn7Var2.getClass();
        if (rce.a) {
            return o7c.u(((zy3) yn7Var).b, ((zy3) yn7Var2).b);
        }
        qk6 qk6Var = qk6.R0;
        h7f h7fVar = new h7f(false, false, false, qk6Var, q5.q, r5.p);
        j2 j2Var = (j2) yn7Var;
        j2 j2Var2 = (j2) yn7Var2;
        if (j2Var == j2Var2) {
            return true;
        }
        l26 l26VarO = qk6Var.O();
        Boolean bool = l26VarO != null ? (Boolean) l26VarO.z(j2Var, j2Var2) : null;
        return bool != null ? bool.booleanValue() : hj6.b.p(h7fVar, qk6Var, j2Var, j2Var2);
    }

    public static final boolean V(tt7 tt7Var) {
        tt7Var.getClass();
        y22 y22VarM = tt7Var.c0().m();
        m36 m36VarM = null;
        if (y22VarM != null && (y22VarM instanceof u09) && xr7.J(y22VarM)) {
            int i2 = qz3.a;
            ex5 ex5VarF = oz3.f(y22VarM);
            ex5VarF.getClass();
            m36VarM = M(ex5VarF);
        }
        return pa7.t(m36VarM, l36.d);
    }

    public static lb0 W(String str) {
        Object dzbVar;
        rob robVar = lb0.d;
        if (str == null) {
            str = "";
        }
        um8 um8VarB = rob.b(robVar, str);
        if (um8VarB == null) {
            return null;
        }
        try {
            dzbVar = new lb0(Integer.parseInt((String) ((sm8) um8VarB.a()).get(1)), Integer.parseInt((String) ((sm8) um8VarB.a()).get(2)), Integer.parseInt((String) ((sm8) um8VarB.a()).get(3)));
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return (lb0) (dzbVar instanceof dzb ? null : dzbVar);
    }

    public static final void X(os osVar, rf0 rf0Var) {
        l4c g4cVar;
        i00 i00Var = (i00) osVar.c;
        z5c z5cVar = rf0Var.a;
        if (z5cVar instanceof ff0) {
            g4cVar = f4c.d;
        } else if (z5cVar instanceof ag0) {
            g4cVar = d4c.d;
        } else if (z5cVar instanceof zf0) {
            g4cVar = h4c.d;
        } else if (z5cVar instanceof cf0) {
            g4cVar = e4c.d;
        } else if (z5cVar instanceof of0) {
            g4cVar = new g4c(((of0) z5cVar).l);
        } else {
            g4cVar = z5cVar instanceof pf0 ? new g4c(((pf0) z5cVar).m) : null;
        }
        Integer numValueOf = g4cVar != null ? Integer.valueOf(osVar.p(g4cVar)) : null;
        if (z5cVar instanceof hg0) {
            String str = ((hg0) z5cVar).l;
            str.getClass();
            i00Var.f(str);
        } else if (z5cVar instanceof cf0) {
            String str2 = ((cf0) z5cVar).l;
            str2.getClass();
            i00Var.f(str2);
        } else if (z5cVar.equals(yf0.l)) {
            i00Var.f(" ");
        } else if (z5cVar.equals(hf0.l)) {
            i00Var.f("\n");
        } else if (z5cVar instanceof lf0) {
            os.b(osVar, new o37(new z8b(12), new dd2(new hm8(z5cVar, 1), true, -323684801), 2));
        } else {
            Iterator it = D(rf0Var).iterator();
            while (it.hasNext()) {
                X(osVar, (rf0) it.next());
            }
        }
        if (numValueOf != null) {
            i00Var.h(numValueOf.intValue());
        }
    }

    public static final uo Y(ei9 ei9Var, x16 x16Var, l46 l46Var, int i2) {
        ei9Var.getClass();
        x16Var.getClass();
        Context context = (Context) l46Var.k(uq.b);
        e89 e89VarI = q1c.i(x16Var, l46Var);
        af afVar = new af(4);
        boolean zI = l46Var.i(context) | l46Var.g(e89VarI);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (zI || objR == obj) {
            objR = new t95(context, e89VarI, 1);
            l46Var.p0(objR);
        }
        yk8 yk8VarP = qn4.P(afVar, (a26) objR, l46Var);
        boolean zG = l46Var.g(context) | l46Var.g(yk8VarP) | l46Var.g(ei9Var);
        Object objR2 = l46Var.R();
        if (zG || objR2 == obj) {
            objR2 = new uo(context, yk8VarP, ei9Var);
            l46Var.p0(objR2);
        }
        return (uo) objR2;
    }

    public static final uh9 Z(a26 a26Var, ei9 ei9Var, l46 l46Var) {
        a26Var.getClass();
        ei9Var.getClass();
        Context context = (Context) l46Var.k(uq.b);
        Object objI = q1c.i(a26Var, l46Var);
        Object objI2 = q1c.i(ei9Var, l46Var);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (objR == obj) {
            objR = new AtomicReference(null);
            l46Var.p0(objR);
        }
        AtomicReference atomicReference = (AtomicReference) objR;
        af afVar = new af(3);
        boolean zI = l46Var.i(context) | l46Var.i(atomicReference) | l46Var.g(objI) | l46Var.g(objI2);
        Object objR2 = l46Var.R();
        if (zI || objR2 == obj) {
            Object wgVar = new wg(context, atomicReference, objI, objI2, 23);
            l46Var.p0(wgVar);
            objR2 = wgVar;
        }
        yk8 yk8VarP = qn4.P(afVar, (a26) objR2, l46Var);
        boolean zG = l46Var.g(context) | l46Var.g(yk8VarP) | l46Var.g(ei9Var);
        Object objR3 = l46Var.R();
        if (zG || objR3 == obj) {
            objR3 = new uh9(context, yk8VarP, ei9Var, atomicReference);
            l46Var.p0(objR3);
        }
        return (uh9) objR3;
    }

    public static final void a(TarotSkinIdentify tarotSkinIdentify, x16 x16Var, l46 l46Var, int i2) {
        tarotSkinIdentify.getClass();
        x16Var.getClass();
        l46Var.h0(1889527455);
        int i3 = i2 | (l46Var.e(tarotSkinIdentify.ordinal()) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = s72.j1(aie.a.keySet());
                l46Var.p0(objR);
            }
            xdc.a(null, af1.b0(505825635, new ej(x16Var, tarotSkinIdentify), l46Var), null, null, null, 0, 0L, 0L, null, af1.b0(-1208043858, new w7(3, (List) objR, tarotSkinIdentify), l46Var), l46Var, 805306416, 509);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ej(tarotSkinIdentify, x16Var, i2, 1);
        }
    }

    public static final TarotSkinIdentify a0(LocalDate localDate, Map map, TarotSkinIdentify tarotSkinIdentify, mfc mfcVar) {
        localDate.getClass();
        map.getClass();
        tarotSkinIdentify.getClass();
        mfcVar.getClass();
        String str = (String) map.get(localDate.toString());
        if (str != null) {
            return r8c.n(str, mfcVar);
        }
        return r8c.j(tarotSkinIdentify, mfcVar) ? tarotSkinIdentify : r8c.n(null, mfcVar);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x015b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void b(j09 j09Var, long j2, float f2, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        j09 j09Var2;
        int i4;
        long j3;
        int i5;
        int i6;
        float f3;
        int i7;
        boolean z;
        dd2 dd2Var2;
        j09 j09Var3;
        long j4;
        float f4;
        ojb ojbVarV;
        int i8;
        g09 g09Var;
        long j5;
        boolean z2;
        ov7 ov7Var;
        l46Var.h0(-1059654838);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            j09Var2 = j09Var;
        } else {
            j09Var2 = j09Var;
            i4 = (l46Var.g(j09Var2) ? 4 : 2) | i2;
        }
        if ((i3 & 2) == 0) {
            j3 = j2;
            int i10 = l46Var.f(j3) ? 32 : 16;
            i5 = i4 | i10;
            i6 = i3 & 4;
            if (i6 != 0) {
                if ((i2 & 384) == 0) {
                    f3 = f2;
                    if (l46Var.d(f3)) {
                        i7 = 256;
                    } else {
                        i7 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i5 |= i7;
                }
                if ((i5 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i5 & 1, z)) {
                    l46Var.b0();
                    i8 = i2 & 1;
                    g09Var = g09.a;
                    if (i8 != 0 || l46Var.C()) {
                        if (i9 != 0) {
                            j09Var2 = g09Var;
                        }
                        if ((i3 & 2) != 0) {
                            j5 = ((e8b) l46Var.k(l8b.a)).e;
                        } else {
                            j5 = j3;
                        }
                        if (i6 != 0) {
                            f3 = 40.0f;
                        }
                    } else {
                        l46Var.Z();
                        j5 = j3;
                    }
                    l46Var.s();
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09Var2);
                    lf2.q.getClass();
                    l46Var.j0();
                    z2 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z2) {
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
                    o5c.f(l46Var, tm7.n(b.d(b.c(g09Var, 1.0f), f3), gec.N(0.0f, 14, t72.I(new y72(y72.j), new y72(j5))), null, 6));
                    j09 j09VarO = tm7.o(b.c(g09Var, 1.0f), j5, g21.f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarO);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, xn8VarC);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    dd2Var2 = dd2Var;
                    dd2Var2.m(d31.a, l46Var, 54);
                    l46Var.r(true);
                    l46Var.r(true);
                    j09Var3 = j09Var2;
                    j4 = j5;
                } else {
                    dd2Var2 = dd2Var;
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    j4 = j3;
                }
                f4 = f3;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new s11(j09Var3, j4, f4, dd2Var2, i2, i3);
                }
            }
            i5 |= 384;
            f3 = f2;
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i5 & 1, z)) {
                l46Var.b0();
                i8 = i2 & 1;
                g09Var = g09.a;
                if (i8 != 0) {
                    if (i9 != 0) {
                        j09Var2 = g09Var;
                    }
                    if ((i3 & 2) != 0) {
                        j5 = ((e8b) l46Var.k(l8b.a)).e;
                    } else {
                        j5 = j3;
                    }
                    if (i6 != 0) {
                        f3 = 40.0f;
                    }
                } else {
                    if (i9 != 0) {
                        j09Var2 = g09Var;
                    }
                    if ((i3 & 2) != 0) {
                        j5 = ((e8b) l46Var.k(l8b.a)).e;
                    } else {
                        j5 = j3;
                    }
                    if (i6 != 0) {
                        f3 = 40.0f;
                    }
                }
                l46Var.s();
                c92 c92VarA2 = a92.a(xc0.c, ndb.Y, l46Var, 0);
                int iHashCode3 = Long.hashCode(l46Var.T);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, j09Var2);
                lf2.q.getClass();
                l46Var.j0();
                z2 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z2) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var5 = hj6.z;
                dec.l(he2Var5, l46Var, c92VarA2);
                he2 he2Var6 = hj6.y;
                dec.l(he2Var6, l46Var, u8aVarM3);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                he2 he2Var7 = hj6.X;
                dec.l(he2Var7, l46Var, numValueOf2);
                dec.k(l46Var);
                he2 he2Var8 = hj6.x;
                dec.l(he2Var8, l46Var, j09VarJ3);
                o5c.f(l46Var, tm7.n(b.d(b.c(g09Var, 1.0f), f3), gec.N(0.0f, 14, t72.I(new y72(y72.j), new y72(j5))), null, 6));
                j09 j09VarO2 = tm7.o(b.c(g09Var, 1.0f), j5, g21.f);
                xn8 xn8VarC2 = s21.c(ndb.b, false);
                int iHashCode4 = Long.hashCode(l46Var.T);
                u8a u8aVarM4 = l46Var.m();
                j09 j09VarJ4 = m93.J(l46Var, j09VarO2);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var5, l46Var, xn8VarC2);
                dec.l(he2Var6, l46Var, u8aVarM4);
                ib8.s(iHashCode4, l46Var, he2Var7, l46Var);
                dec.l(he2Var8, l46Var, j09VarJ4);
                dd2Var2 = dd2Var;
                dd2Var2.m(d31.a, l46Var, 54);
                l46Var.r(true);
                l46Var.r(true);
                j09Var3 = j09Var2;
                j4 = j5;
            } else {
                dd2Var2 = dd2Var;
                l46Var.Z();
                j09Var3 = j09Var2;
                j4 = j3;
            }
            f4 = f3;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new s11(j09Var3, j4, f4, dd2Var2, i2, i3);
            }
        }
        j3 = j2;
        i5 = i4 | i10;
        i6 = i3 & 4;
        if (i6 != 0) {
            if ((i2 & 384) == 0) {
                f3 = f2;
                if (l46Var.d(f3)) {
                    i7 = 256;
                } else {
                    i7 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i5 |= i7;
            }
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i5 & 1, z)) {
                l46Var.b0();
                i8 = i2 & 1;
                g09Var = g09.a;
                if (i8 != 0) {
                    if (i9 != 0) {
                        j09Var2 = g09Var;
                    }
                    if ((i3 & 2) != 0) {
                        j5 = ((e8b) l46Var.k(l8b.a)).e;
                    } else {
                        j5 = j3;
                    }
                    if (i6 != 0) {
                        f3 = 40.0f;
                    }
                } else {
                    if (i9 != 0) {
                        j09Var2 = g09Var;
                    }
                    if ((i3 & 2) != 0) {
                        j5 = ((e8b) l46Var.k(l8b.a)).e;
                    } else {
                        j5 = j3;
                    }
                    if (i6 != 0) {
                        f3 = 40.0f;
                    }
                }
                l46Var.s();
                c92 c92VarA3 = a92.a(xc0.c, ndb.Y, l46Var, 0);
                int iHashCode5 = Long.hashCode(l46Var.T);
                u8a u8aVarM5 = l46Var.m();
                j09 j09VarJ5 = m93.J(l46Var, j09Var2);
                lf2.q.getClass();
                l46Var.j0();
                z2 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z2) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var9 = hj6.z;
                dec.l(he2Var9, l46Var, c92VarA3);
                he2 he2Var10 = hj6.y;
                dec.l(he2Var10, l46Var, u8aVarM5);
                Integer numValueOf3 = Integer.valueOf(iHashCode5);
                he2 he2Var11 = hj6.X;
                dec.l(he2Var11, l46Var, numValueOf3);
                dec.k(l46Var);
                he2 he2Var12 = hj6.x;
                dec.l(he2Var12, l46Var, j09VarJ5);
                o5c.f(l46Var, tm7.n(b.d(b.c(g09Var, 1.0f), f3), gec.N(0.0f, 14, t72.I(new y72(y72.j), new y72(j5))), null, 6));
                j09 j09VarO3 = tm7.o(b.c(g09Var, 1.0f), j5, g21.f);
                xn8 xn8VarC3 = s21.c(ndb.b, false);
                int iHashCode6 = Long.hashCode(l46Var.T);
                u8a u8aVarM6 = l46Var.m();
                j09 j09VarJ6 = m93.J(l46Var, j09VarO3);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var9, l46Var, xn8VarC3);
                dec.l(he2Var10, l46Var, u8aVarM6);
                ib8.s(iHashCode6, l46Var, he2Var11, l46Var);
                dec.l(he2Var12, l46Var, j09VarJ6);
                dd2Var2 = dd2Var;
                dd2Var2.m(d31.a, l46Var, 54);
                l46Var.r(true);
                l46Var.r(true);
                j09Var3 = j09Var2;
                j4 = j5;
            } else {
                dd2Var2 = dd2Var;
                l46Var.Z();
                j09Var3 = j09Var2;
                j4 = j3;
            }
            f4 = f3;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new s11(j09Var3, j4, f4, dd2Var2, i2, i3);
            }
        }
        i5 |= 384;
        f3 = f2;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i5 & 1, z)) {
            l46Var.b0();
            i8 = i2 & 1;
            g09Var = g09.a;
            if (i8 != 0) {
                if (i9 != 0) {
                    j09Var2 = g09Var;
                }
                if ((i3 & 2) != 0) {
                    j5 = ((e8b) l46Var.k(l8b.a)).e;
                } else {
                    j5 = j3;
                }
                if (i6 != 0) {
                    f3 = 40.0f;
                }
            } else {
                if (i9 != 0) {
                    j09Var2 = g09Var;
                }
                if ((i3 & 2) != 0) {
                    j5 = ((e8b) l46Var.k(l8b.a)).e;
                } else {
                    j5 = j3;
                }
                if (i6 != 0) {
                    f3 = 40.0f;
                }
            }
            l46Var.s();
            c92 c92VarA4 = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode7 = Long.hashCode(l46Var.T);
            u8a u8aVarM7 = l46Var.m();
            j09 j09VarJ7 = m93.J(l46Var, j09Var2);
            lf2.q.getClass();
            l46Var.j0();
            z2 = l46Var.S;
            ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var13 = hj6.z;
            dec.l(he2Var13, l46Var, c92VarA4);
            he2 he2Var14 = hj6.y;
            dec.l(he2Var14, l46Var, u8aVarM7);
            Integer numValueOf4 = Integer.valueOf(iHashCode7);
            he2 he2Var15 = hj6.X;
            dec.l(he2Var15, l46Var, numValueOf4);
            dec.k(l46Var);
            he2 he2Var16 = hj6.x;
            dec.l(he2Var16, l46Var, j09VarJ7);
            o5c.f(l46Var, tm7.n(b.d(b.c(g09Var, 1.0f), f3), gec.N(0.0f, 14, t72.I(new y72(y72.j), new y72(j5))), null, 6));
            j09 j09VarO4 = tm7.o(b.c(g09Var, 1.0f), j5, g21.f);
            xn8 xn8VarC4 = s21.c(ndb.b, false);
            int iHashCode8 = Long.hashCode(l46Var.T);
            u8a u8aVarM8 = l46Var.m();
            j09 j09VarJ8 = m93.J(l46Var, j09VarO4);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var13, l46Var, xn8VarC4);
            dec.l(he2Var14, l46Var, u8aVarM8);
            ib8.s(iHashCode8, l46Var, he2Var15, l46Var);
            dec.l(he2Var16, l46Var, j09VarJ8);
            dd2Var2 = dd2Var;
            dd2Var2.m(d31.a, l46Var, 54);
            l46Var.r(true);
            l46Var.r(true);
            j09Var3 = j09Var2;
            j4 = j5;
        } else {
            dd2Var2 = dd2Var;
            l46Var.Z();
            j09Var3 = j09Var2;
            j4 = j3;
        }
        f4 = f3;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s11(j09Var3, j4, f4, dd2Var2, i2, i3);
        }
    }

    public static final gl5 b0(wj5 wj5Var, long j2, l26 l26Var) {
        if (j2 > 0) {
            return new gl5(wj5Var, new el5(j2, l26Var, null));
        }
        qc0.o(ks0.i(j2, "Expected positive amount of retries, but had "));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    public static final void c(j09 j09Var, String str, boolean z, n26 n26Var, x16 x16Var, l46 l46Var, int i2, int i3) {
        String str2;
        int i4;
        n26 n26Var2;
        int i5;
        int i6;
        int i7;
        byte b2;
        boolean z2;
        boolean z3;
        j09 j09Var2;
        ojb ojbVarV;
        String str3;
        n26 n26Var3;
        x16Var.getClass();
        l46Var.h0(-1204604224);
        int i8 = i2 | 6;
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                str2 = str;
                i8 |= l46Var.g(str2) ? 32 : 16;
            }
            i4 = i3 & 8;
            if (i4 != 0) {
                if ((i2 & 3072) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i8 |= i5;
                }
                if (l46Var.i(x16Var)) {
                    i6 = 16384;
                } else {
                    i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i7 = i8 | i6;
                b2 = 0;
                if ((i7 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i7 & 1, z2)) {
                    if (i9 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i4 != 0) {
                        n26Var3 = db6.c;
                    } else {
                        n26Var3 = n26Var2;
                    }
                    z3 = z;
                    dd2 dd2VarB0 = af1.b0(1084918021, new y01(str3, z3, 6, b2), l46Var);
                    int i10 = ((i7 << 6) & 458752) | 24582 | ((i7 << 9) & 29360128);
                    g09 g09Var = g09.a;
                    n26 n26Var4 = n26Var3;
                    pa7.d(g09Var, 0L, 0L, null, dd2VarB0, n26Var4, false, x16Var, l46Var, i10, 78);
                    j09Var2 = g09Var;
                    n26Var2 = n26Var4;
                    str2 = str3;
                } else {
                    z3 = z;
                    l46Var.Z();
                    j09Var2 = j09Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new jv1(j09Var2, str2, z3, n26Var2, x16Var, i2, i3, 1);
                }
            }
            i8 |= 3072;
            n26Var2 = n26Var;
            if (l46Var.i(x16Var)) {
                i6 = 16384;
            } else {
                i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i7 = i8 | i6;
            b2 = 0;
            if ((i7 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i7 & 1, z2)) {
                if (i9 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i4 != 0) {
                    n26Var3 = db6.c;
                } else {
                    n26Var3 = n26Var2;
                }
                z3 = z;
                dd2 dd2VarB1 = af1.b0(1084918021, new y01(str3, z3, 6, b2), l46Var);
                int i11 = ((i7 << 6) & 458752) | 24582 | ((i7 << 9) & 29360128);
                g09 g09Var2 = g09.a;
                n26 n26Var5 = n26Var3;
                pa7.d(g09Var2, 0L, 0L, null, dd2VarB1, n26Var5, false, x16Var, l46Var, i11, 78);
                j09Var2 = g09Var2;
                n26Var2 = n26Var5;
                str2 = str3;
            } else {
                z3 = z;
                l46Var.Z();
                j09Var2 = j09Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new jv1(j09Var2, str2, z3, n26Var2, x16Var, i2, i3, 1);
            }
        }
        i8 = i2 | 54;
        str2 = str;
        i4 = i3 & 8;
        if (i4 != 0) {
            if ((i2 & 3072) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i5 = 2048;
                } else {
                    i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i8 |= i5;
            }
            if (l46Var.i(x16Var)) {
                i6 = 16384;
            } else {
                i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i7 = i8 | i6;
            b2 = 0;
            if ((i7 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i7 & 1, z2)) {
                if (i9 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i4 != 0) {
                    n26Var3 = db6.c;
                } else {
                    n26Var3 = n26Var2;
                }
                z3 = z;
                dd2 dd2VarB2 = af1.b0(1084918021, new y01(str3, z3, 6, b2), l46Var);
                int i12 = ((i7 << 6) & 458752) | 24582 | ((i7 << 9) & 29360128);
                g09 g09Var3 = g09.a;
                n26 n26Var6 = n26Var3;
                pa7.d(g09Var3, 0L, 0L, null, dd2VarB2, n26Var6, false, x16Var, l46Var, i12, 78);
                j09Var2 = g09Var3;
                n26Var2 = n26Var6;
                str2 = str3;
            } else {
                z3 = z;
                l46Var.Z();
                j09Var2 = j09Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new jv1(j09Var2, str2, z3, n26Var2, x16Var, i2, i3, 1);
            }
        }
        i8 |= 3072;
        n26Var2 = n26Var;
        if (l46Var.i(x16Var)) {
            i6 = 16384;
        } else {
            i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        i7 = i8 | i6;
        b2 = 0;
        if ((i7 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i7 & 1, z2)) {
            if (i9 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (i4 != 0) {
                n26Var3 = db6.c;
            } else {
                n26Var3 = n26Var2;
            }
            z3 = z;
            dd2 dd2VarB3 = af1.b0(1084918021, new y01(str3, z3, 6, b2), l46Var);
            int i13 = ((i7 << 6) & 458752) | 24582 | ((i7 << 9) & 29360128);
            g09 g09Var4 = g09.a;
            n26 n26Var7 = n26Var3;
            pa7.d(g09Var4, 0L, 0L, null, dd2VarB3, n26Var7, false, x16Var, l46Var, i13, 78);
            j09Var2 = g09Var4;
            n26Var2 = n26Var7;
            str2 = str3;
        } else {
            z3 = z;
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jv1(j09Var2, str2, z3, n26Var2, x16Var, i2, i3, 1);
        }
    }

    public static final n0a c0(Integer num, Integer num2, Integer num3, ze0 ze0Var, String str, boolean z) {
        int iIntValue;
        pu4 pu4Var;
        int iIntValue2 = num.intValue() + (z ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return d0(z, ze0Var, str, iIntValue2, iIntValue);
        }
        n0a n0aVarD0 = d0(z, ze0Var, str, iIntValue2, iIntValue2);
        while (true) {
            pu4Var = pu4.a;
            if (iIntValue2 >= iMin) {
                break;
            }
            iIntValue2++;
            n0aVarD0 = new n0a(pu4Var, t72.I(d0(z, ze0Var, str, iIntValue2, iIntValue2), x57.E(t72.I(new n0a(t72.H(new qea(" ")), pu4Var), n0aVarD0))));
        }
        if (iIntValue3 > iIntValue) {
            return x57.E(t72.I(new n0a(t72.H(new qea(c5e.y(iIntValue3 - iIntValue, " "))), pu4Var), n0aVarD0));
        }
        return iIntValue3 == iIntValue ? n0aVarD0 : new n0a(pu4Var, t72.I(d0(z, ze0Var, str, iIntValue3 + 1, iIntValue), n0aVarD0));
    }

    public static final void d(j09 j09Var, float f2, long j2, l46 l46Var, int i2, int i3) {
        int i4;
        long jD;
        float f3;
        j09 j09Var2;
        long j3;
        float f4;
        l46Var.h0(75144485);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= l46Var.d(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            jD = j2;
            i4 |= ((i3 & 4) == 0 && l46Var.f(jD)) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            jD = j2;
        }
        int i7 = 1;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                if (i5 != 0) {
                    j09Var = g09.a;
                }
                f4 = i6 != 0 ? cb4.a : f2;
                if ((i3 & 4) != 0) {
                    float f5 = cb4.a;
                    i4 &= -897;
                    jD = o82.d(kj0.g, l46Var);
                }
            } else {
                l46Var.Z();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                f4 = f2;
            }
            l46Var.s();
            j09 j09VarD = b.d(b.c(j09Var, 1.0f), f4);
            boolean z = ((((i4 & 896) ^ 384) > 256 && l46Var.f(jD)) || (i4 & 384) == 256) | ((i4 & 112) == 32);
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new db4(f4, i7, jD);
                l46Var.p0(objR);
            }
            nk8.e(0, (a26) objR, l46Var, j09VarD);
            f3 = f4;
            j3 = jD;
            j09Var2 = j09Var;
        } else {
            l46Var.Z();
            f3 = f2;
            j09Var2 = j09Var;
            j3 = jD;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new eb4(j09Var2, f3, j3, i2, i3, 1);
        }
    }

    public static final n0a d0(boolean z, ze0 ze0Var, String str, int i2, int i3) {
        if (i3 < (z ? 1 : 0) + 1) {
            qc0.p("Check failed.");
            return null;
        }
        c78 c78VarW = t72.w();
        if (z) {
            c78VarW.add(new qea("-"));
        }
        c78VarW.add(new fk9(t72.H(new bgf(Integer.valueOf(i2 - (z ? 1 : 0)), Integer.valueOf(i3 - (z ? 1 : 0)), ze0Var, str, z))));
        return new n0a(c78VarW.n(), pu4.a);
    }

    public static final void e(bwa bwaVar, boolean z, int i2, j09 j09Var, l46 l46Var, int i3) {
        int i4;
        int i5;
        l46 l46Var2;
        j09 j09Var2;
        List listH;
        String strI;
        l46 l46Var3 = l46Var;
        int i6 = R.string.intercept_paywall_monthly_desc;
        Integer numValueOf = Integer.valueOf(R.string.intercept_paywall_monthly_desc);
        bwaVar.getClass();
        l46Var3.h0(1073018527);
        int i7 = 2;
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? l46Var3.g(bwaVar) : l46Var3.i(bwaVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var3.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 = i2;
            i4 |= l46Var3.e(i5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            i5 = i2;
        }
        int i8 = i4 | 3072;
        boolean z2 = true;
        boolean z3 = false;
        if (l46Var3.W(i8 & 1, (i8 & 1171) != 1170)) {
            cwa type = bwaVar.getType();
            u7e u7eVar = u7e.b;
            int i9 = R.string.intercept_paywall_annual_desc;
            if (type == u7eVar) {
                listH = z ? t72.H(numValueOf) : t72.I(numValueOf, Integer.valueOf(R.string.intercept_paywall_monthly_refresh_desc));
            } else if (type == u7e.c) {
                if (!z) {
                    i6 = R.string.intercept_paywall_annual_renew_desc;
                }
                listH = t72.I(Integer.valueOf(i6), Integer.valueOf(R.string.intercept_paywall_annual_desc));
            } else {
                listH = type instanceof thb ? t72.H(Integer.valueOf(R.string.intercept_paywall_reading_pack_desc)) : pu4.a;
            }
            g09 g09Var = g09.a;
            int i10 = 3;
            j09 j09VarW = eb3.w(b.f(40.0f, 0.0f, b.c(g09Var, 1.0f), 2), null, 3);
            c92 c92VarA = a92.a(new uc0(8.0f, false, new jv2(i7, ndb.z)), ndb.Z, l46Var3, 54);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarW);
            lf2.q.getClass();
            l46Var3.j0();
            if (l46Var3.S) {
                l46Var3.l(LayoutNode.h1);
            } else {
                l46Var3.s0();
            }
            dec.l(hj6.z, l46Var3, c92VarA);
            dec.l(hj6.y, l46Var3, u8aVarM);
            dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode));
            dec.k(l46Var3);
            Iterator itS = kv2.s(l46Var3, j09VarJ, hj6.x, -85903631, listH);
            while (itS.hasNext()) {
                int iIntValue = ((Number) itS.next()).intValue();
                if (iIntValue == i9) {
                    l46Var3.f0(415031316);
                    strI = afc.r(iIntValue, new Object[]{Integer.valueOf(i5)}, l46Var3);
                    l46Var3.r(z3);
                } else {
                    strI = tec.i(l46Var3, 415097284, iIntValue, l46Var3, z3);
                }
                l46 l46Var4 = l46Var3;
                nte.b(strI, null, ((e8b) l46Var3.k(l8b.a)).r, 0L, null, null, 0L, null, new jme(i10), 0L, 0, false, 0, 0, null, R(l46Var3), l46Var4, 0, 0, 130042);
                i5 = i2;
                z3 = z3;
                l46Var3 = l46Var4;
                i10 = i10;
                i9 = i9;
                g09Var = g09Var;
                z2 = true;
            }
            l46Var2 = l46Var3;
            l46Var2.r(z3);
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2 = l46Var3;
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p83(bwaVar, z, i2, j09Var2, i3);
        }
    }

    public static void e0(ByteBuffer byteBuffer, boolean z) {
        for (el9 el9Var : bm8.Q(byteBuffer.asReadOnlyBuffer())) {
            int i2 = el9Var.a;
            ByteBuffer byteBuffer2 = el9Var.b;
            if (i2 == 5) {
                try {
                    pa7.A(i2 == 5);
                    ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                    if (bm8.E(byteBufferAsReadOnlyBuffer) == 4) {
                        if (z && byteBufferAsReadOnlyBuffer.remaining() >= 6) {
                            int iPosition = byteBufferAsReadOnlyBuffer.position();
                            for (int i3 = 0; i3 < 6; i3++) {
                                if (byteBufferAsReadOnlyBuffer.get(iPosition + i3) == a[i3]) {
                                }
                            }
                        }
                        byteBuffer.put(byteBuffer2.position(), (byte) 31);
                        break;
                    }
                } catch (BufferUnderflowException unused) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0157  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final void f(bwa bwaVar, boolean z, j09 j09Var, l46 l46Var, int i2) {
        l46 l46Var2;
        j09 j09Var2;
        ojb ojbVarV;
        z6e z6eVar;
        String strR;
        String strB;
        bwaVar.getClass();
        l46Var.h0(297129948);
        int i3 = i2 | (l46Var.g(bwaVar) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | 384;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            int i4 = 3;
            if (bwaVar.getType() instanceof thb) {
                strR = tec.i(l46Var, 2074045116, R.string.intercept_paywall_reading_pack_validity, l46Var, false);
            } else {
                boolean z2 = bwaVar instanceof z6e;
                if (!z2) {
                    if (z2) {
                        z6eVar = (z6e) bwaVar;
                        if (z6eVar.h() == u7e.b) {
                            l46Var.f0(-128795572);
                            if (p4a.a(z6eVar, z)) {
                                l46Var.f0(-128739462);
                                strB = p4a.b(z6eVar);
                                if (strB != null) {
                                    l46Var.f0(-128652197);
                                    strR = afc.r(R.string.intercept_paywall_first_month_renewal, new Object[]{z6eVar.y(), strB}, l46Var);
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(-128478318);
                                    strR = afc.r(R.string.intercept_paywall_first_month_renewal_unknown, new Object[]{z6eVar.y()}, l46Var);
                                    l46Var.r(false);
                                }
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-128349854);
                                strR = afc.r(R.string.intercept_paywall_monthly_renewal, new Object[]{z6eVar.y()}, l46Var);
                                l46Var.r(false);
                            }
                            l46Var.r(false);
                        }
                    }
                    l46Var.f0(-128234720);
                    l46Var.r(false);
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new nu2(i2, i4, bwaVar, z);
                        return;
                    }
                    return;
                }
                z6e z6eVar2 = (z6e) bwaVar;
                if (z6eVar2.h() != u7e.c) {
                    if (z2) {
                        z6eVar = (z6e) bwaVar;
                        if (z6eVar.h() == u7e.b) {
                            l46Var.f0(-128795572);
                            if (p4a.a(z6eVar, z)) {
                                l46Var.f0(-128739462);
                                strB = p4a.b(z6eVar);
                                if (strB != null) {
                                    l46Var.f0(-128652197);
                                    strR = afc.r(R.string.intercept_paywall_first_month_renewal, new Object[]{z6eVar.y(), strB}, l46Var);
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(-128478318);
                                    strR = afc.r(R.string.intercept_paywall_first_month_renewal_unknown, new Object[]{z6eVar.y()}, l46Var);
                                    l46Var.r(false);
                                }
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-128349854);
                                strR = afc.r(R.string.intercept_paywall_monthly_renewal, new Object[]{z6eVar.y()}, l46Var);
                                l46Var.r(false);
                            }
                            l46Var.r(false);
                        }
                    }
                    l46Var.f0(-128234720);
                    l46Var.r(false);
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new nu2(i2, i4, bwaVar, z);
                        return;
                    }
                    return;
                }
                l46Var.f0(2074049773);
                strR = afc.r(R.string.intercept_paywall_annual_renewal, new Object[]{z6eVar2.y()}, l46Var);
                l46Var.r(false);
            }
            mue mueVarR = R(l46Var);
            long j2 = ((e8b) l46Var.k(l8b.a)).t;
            g09 g09Var = g09.a;
            j09Var2 = g09Var;
            nte.b(strR, eb3.w(b.c(g09Var, 1.0f), null, 3), j2, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarR, l46Var, 0, 0, 130040);
            l46Var2 = l46Var;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV2 = l46Var2.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new kg(bwaVar, z, j09Var2, i2, 8);
        }
    }

    public static final void g(Object obj, int i2, b08 b08Var, dd2 dd2Var, l46 l46Var, int i3) {
        int i4;
        l46Var.h0(872548579);
        if ((i3 & 6) == 0) {
            i4 = (l46Var.i(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var.i(b08Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var.i(dd2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zG = l46Var.g(obj) | l46Var.g(b08Var);
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (zG || objR == obj2) {
                objR = new a08(obj, b08Var);
                l46Var.p0(objR);
            }
            a08 a08Var = (a08) objR;
            a08Var.c = i2;
            vz9 vz9Var = a08Var.g;
            b1b b1bVar = tda.a;
            a08 a08Var2 = (a08) l46Var.k(b1bVar);
            ird irdVarJ = iqf.j();
            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
            ird irdVarL = iqf.l(irdVarJ);
            try {
                if (a08Var2 != ((a08) vz9Var.getValue())) {
                    vz9Var.setValue(a08Var2);
                    if (a08Var.d > 0) {
                        a08 a08Var3 = a08Var.e;
                        if (a08Var3 != null) {
                            a08Var3.b();
                        }
                        if (a08Var2 != null) {
                            a08Var2.a();
                        } else {
                            a08Var2 = null;
                        }
                        a08Var.e = a08Var2;
                    }
                }
                iqf.p(irdVarJ, irdVarL, a26VarE);
                boolean zG2 = l46Var.g(a08Var);
                Object objR2 = l46Var.R();
                if (zG2 || objR2 == obj2) {
                    objR2 = new rn6(a08Var, 2);
                    l46Var.p0(objR2);
                }
                af1.g(a08Var, (a26) objR2, l46Var);
                mh3.a(b1bVar.a(a08Var), dd2Var, l46Var, ((i4 >> 6) & 112) | 8);
            } catch (Throwable th) {
                iqf.p(irdVarJ, irdVarL, a26VarE);
                throw th;
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr(obj, i2, b08Var, dd2Var, i3);
        }
    }

    public static final void h(j09 j09Var, dd2 dd2Var, dd2 dd2Var2, x16 x16Var, dd2 dd2Var3, l46 l46Var, int i2) {
        dd2 dd2Var4;
        x16Var.getClass();
        l46Var.h0(1408945755);
        int i3 = i2 | 6 | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            rxg.a(false, x16Var, l46Var, (i3 >> 6) & 112, 1);
            j09Var = g09.a;
            j09 j09VarW = mh3.W(j09Var);
            long j2 = y72.j;
            pr4 pr4Var = o82.a;
            dd2Var4 = dd2Var2;
            v70.a(dd2Var, j09VarW, af1.b0(1895745300, new rk6(x16Var, dd2Var4), l46Var), dd2Var3, 0.0f, null, fdc.v(j2, 0L, y72.b(((m82) l46Var.k(pr4Var)).q, 0.88f), y72.b(((m82) l46Var.k(pr4Var)).q, 0.88f), l46Var, 42), l46Var, 3462, 176);
        } else {
            dd2Var4 = dd2Var2;
            l46Var.Z();
        }
        j09 j09Var2 = j09Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm(j09Var2, dd2Var, dd2Var4, x16Var, dd2Var3, i2);
        }
    }

    public static final void i(String str, l46 l46Var, int i2) {
        str.getClass();
        l46Var.h0(9708363);
        int i3 = 2;
        int i4 = (l46Var.g(str) ? 4 : 2) | i2;
        if (l46Var.W(i4 & 1, (i4 & 3) != 2)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new ja2();
                l46Var.p0(objR);
            }
            ja2 ja2Var = (ja2) objR;
            boolean z = (i4 & 14) == 4;
            Object objR2 = l46Var.R();
            if (z || objR2 == i8cVar) {
                objR2 = ja2Var.a(w4e.p(str));
                l46Var.p0(objR2);
            }
            z7f.i(null, 0L, 0L, 0L, af1.b0(1958035358, new vu0((rf0) objR2, i3), l46Var), l46Var, 24576, 15);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o8(str, i2, 29);
        }
    }

    public static final void j(c4c c4cVar, String str, l46 l46Var, int i2) {
        l46Var.h0(1966320956);
        int i3 = (i2 & 6) == 0 ? (l46Var.g(c4cVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                str.getClass();
                sb.append(str);
                String string = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList2.add(((h00) arrayList.get(i5)).a(sb.length()));
                }
                m4c m4cVar = new m4c(new k00(string, arrayList2), bm8.X(linkedHashMap));
                l46Var.p0(m4cVar);
                objR = m4cVar;
            }
            l(c4cVar, (m4c) objR, null, l46Var, i3 & 14, 2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o62(c4cVar, str, i2, i4);
        }
    }

    public static final void k(c4c c4cVar, rf0 rf0Var, j09 j09Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        l46Var.h0(-1977743294);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(c4cVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? l46Var.g(rf0Var) : l46Var.i(rf0Var) ? 32 : 16;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        boolean z = true;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            j09 j09Var3 = i5 != 0 ? g09.a : j09Var;
            if ((i4 & 112) != 32 && ((i4 & 64) == 0 || !l46Var.g(rf0Var))) {
                z = false;
            }
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                rf0Var.getClass();
                os osVar = new os(10, (byte) 0);
                X(osVar, rf0Var);
                m4c m4cVar = new m4c(((i00) osVar.c).l(), bm8.X((LinkedHashMap) osVar.d));
                l46Var.p0(m4cVar);
                objR = m4cVar;
            }
            j09 j09Var4 = j09Var3;
            l(c4cVar, (m4c) objR, j09Var4, l46Var, i4 & 910, 0);
            j09Var2 = j09Var4;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gm8(c4cVar, rf0Var, j09Var2, i2, i3, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void l(c4c c4cVar, m4c m4cVar, j09 j09Var, l46 l46Var, int i2, int i3) {
        c4c c4cVar2;
        int i4;
        j09 j09Var2;
        int i5;
        boolean z;
        l46 l46Var2;
        j09 j09Var3;
        ojb ojbVarV;
        j09 j09Var4;
        phb phbVar;
        boolean zG;
        Object objR;
        lhb lhbVar;
        boolean zG2;
        Object objR2;
        int i6;
        phb phbVar2;
        boolean z2;
        boolean z3;
        boolean z4;
        lhb lhbVar2;
        boolean zI;
        Object objR3;
        boolean zI2;
        Object objR4;
        l46Var.h0(1670370180);
        int i7 = 2;
        if ((i2 & 6) == 0) {
            c4cVar2 = c4cVar;
            i4 = (l46Var.g(c4cVar2) ? 4 : 2) | i2;
        } else {
            c4cVar2 = c4cVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(m4cVar) ? 32 : 16;
        }
        int i8 = i3 & 2;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = 1;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i8 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                pr4 pr4Var = mhb.a;
                phbVar = (phb) l46Var.k(pr4Var);
                zG = l46Var.g(phbVar);
                objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (zG || objR == i8cVar) {
                    objR = new lhb();
                    l46Var.p0(objR);
                }
                lhbVar = (lhb) objR;
                zG2 = l46Var.g(phbVar) | l46Var.g(lhbVar);
                objR2 = l46Var.R();
                i6 = 6;
                if (zG2 || objR2 == i8cVar) {
                    objR2 = new h6b(i6, phbVar, lhbVar);
                    l46Var.p0(objR2);
                }
                af1.h(phbVar, lhbVar, (a26) objR2, l46Var);
                phbVar2 = (phb) l46Var.k(pr4Var);
                if (phbVar2 != null) {
                    lhbVar.getClass();
                    if (((Set) phbVar2.b.getValue()).contains(lhbVar)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                z3 = !z2;
                if (z2) {
                    z4 = z3;
                    l46Var2 = l46Var;
                    l46Var2.f0(507288994);
                    j09Var2 = j09Var4;
                    lhbVar2 = lhbVar;
                    fbc.a(af1.b0(-1931045703, new r19(c4cVar, m4cVar, j09Var2, lhbVar2, 7), l46Var2), l46Var2, 6);
                    l46Var2.r(false);
                } else {
                    l46Var.f0(507189825);
                    j09Var4.getClass();
                    lhbVar.getClass();
                    j09 j09VarW = nk8.w(j09Var4, new lgb(lhbVar, i7));
                    zI2 = l46Var.i(lhbVar);
                    objR4 = l46Var.R();
                    if (zI2 || objR4 == i8cVar) {
                        objR4 = new lgb(lhbVar, i5);
                        l46Var.p0(objR4);
                    }
                    rrb.f(c4cVar2, m4cVar, j09VarW, (a26) objR4, false, 0, 0, l46Var, i4 & 126, 56);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                    j09Var2 = j09Var4;
                    lhbVar2 = lhbVar;
                    z4 = z3;
                }
                zI = l46Var2.i(lhbVar2) | l46Var2.h(z4);
                objR3 = l46Var2.R();
                if (zI || objR3 == i8cVar) {
                    objR3 = new mv0(lhbVar2, z4, 7);
                    l46Var2.p0(objR3);
                }
                af1.u((x16) objR3, l46Var2);
            } else {
                l46Var2 = l46Var;
                l46Var2.Z();
            }
            j09Var3 = j09Var2;
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new kr(c4cVar, m4cVar, j09Var3, i2, i3, 8);
            }
        }
        i4 |= 384;
        j09Var2 = j09Var;
        i5 = 1;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i4 & 1, z)) {
            if (i8 != 0) {
                j09Var4 = g09.a;
            } else {
                j09Var4 = j09Var2;
            }
            pr4 pr4Var2 = mhb.a;
            phbVar = (phb) l46Var.k(pr4Var2);
            zG = l46Var.g(phbVar);
            objR = l46Var.R();
            i8c i8cVar2 = sf2.a;
            if (zG) {
                objR = new lhb();
                l46Var.p0(objR);
            } else {
                objR = new lhb();
                l46Var.p0(objR);
            }
            lhbVar = (lhb) objR;
            zG2 = l46Var.g(phbVar) | l46Var.g(lhbVar);
            objR2 = l46Var.R();
            i6 = 6;
            if (zG2) {
                objR2 = new h6b(i6, phbVar, lhbVar);
                l46Var.p0(objR2);
            } else {
                objR2 = new h6b(i6, phbVar, lhbVar);
                l46Var.p0(objR2);
            }
            af1.h(phbVar, lhbVar, (a26) objR2, l46Var);
            phbVar2 = (phb) l46Var.k(pr4Var2);
            if (phbVar2 != null) {
                lhbVar.getClass();
                if (((Set) phbVar2.b.getValue()).contains(lhbVar)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            z3 = !z2;
            if (z2) {
                l46Var.f0(507189825);
                j09Var4.getClass();
                lhbVar.getClass();
                j09 j09VarW2 = nk8.w(j09Var4, new lgb(lhbVar, i7));
                zI2 = l46Var.i(lhbVar);
                objR4 = l46Var.R();
                if (zI2) {
                    objR4 = new lgb(lhbVar, i5);
                    l46Var.p0(objR4);
                } else {
                    objR4 = new lgb(lhbVar, i5);
                    l46Var.p0(objR4);
                }
                rrb.f(c4cVar2, m4cVar, j09VarW2, (a26) objR4, false, 0, 0, l46Var, i4 & 126, 56);
                l46Var2 = l46Var;
                l46Var2.r(false);
                j09Var2 = j09Var4;
                lhbVar2 = lhbVar;
                z4 = z3;
            } else {
                z4 = z3;
                l46Var2 = l46Var;
                l46Var2.f0(507288994);
                j09Var2 = j09Var4;
                lhbVar2 = lhbVar;
                fbc.a(af1.b0(-1931045703, new r19(c4cVar, m4cVar, j09Var2, lhbVar2, 7), l46Var2), l46Var2, 6);
                l46Var2.r(false);
            }
            zI = l46Var2.i(lhbVar2) | l46Var2.h(z4);
            objR3 = l46Var2.R();
            if (zI) {
                objR3 = new mv0(lhbVar2, z4, 7);
                l46Var2.p0(objR3);
            } else {
                objR3 = new mv0(lhbVar2, z4, 7);
                l46Var2.p0(objR3);
            }
            af1.u((x16) objR3, l46Var2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        j09Var3 = j09Var2;
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr(c4cVar, m4cVar, j09Var3, i2, i3, 8);
        }
    }

    public static final void m(c4c c4cVar, rf0 rf0Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(1230740910);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(c4cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? l46Var.g(rf0Var) : l46Var.i(rf0Var) ? 32 : 16;
        }
        int i5 = 0;
        int i6 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            int i7 = i3 & 112;
            boolean z = i7 == 32 || ((i3 & 64) != 0 && l46Var.i(rf0Var));
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                objR = new sf0(rf0Var, i6);
                l46Var.p0(objR);
            }
            a26 a26Var = (a26) objR;
            if (i7 != 32 && ((i3 & 64) == 0 || !l46Var.i(rf0Var))) {
                i6 = 0;
            }
            Object objR2 = l46Var.R();
            if (i6 != 0 || objR2 == i8cVar) {
                objR2 = new sf0(rf0Var, i4);
                l46Var.p0(objR2);
            }
            qde.a(c4cVar, null, a26Var, (a26) objR2, l46Var, i3 & 14);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mgb(c4cVar, rf0Var, i2, i5);
        }
    }

    public static final void n(j09 j09Var, float f2, long j2, l46 l46Var, int i2, int i3) {
        float f3;
        int i4;
        j09 j09Var2;
        float f4;
        float f5;
        l46Var.h0(-1534852205);
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = i2 | 48;
            f3 = f2;
        } else if ((i2 & 48) == 0) {
            f3 = f2;
            i4 = i2 | (l46Var.d(f3) ? 32 : 16);
        } else {
            f3 = f2;
            i4 = i2;
        }
        long jD = j2;
        int i6 = i4 | (((i3 & 4) == 0 && l46Var.f(jD)) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i7 = 0;
        boolean z = true;
        if (l46Var.W(i6 & 1, (i6 & 147) != 146)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                f5 = i5 != 0 ? cb4.a : f3;
                if ((i3 & 4) != 0) {
                    float f6 = cb4.a;
                    jD = o82.d(kj0.g, l46Var);
                    i6 &= -897;
                }
            } else {
                l46Var.Z();
                if ((i3 & 4) != 0) {
                    i6 &= -897;
                }
                f5 = f3;
            }
            l46Var.s();
            j09Var2 = j09Var;
            j09 j09VarP = b.p(j09Var2.D(b.b), f5);
            boolean z2 = (i6 & 112) == 32;
            if ((((i6 & 896) ^ 384) <= 256 || !l46Var.f(jD)) && (i6 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objR = l46Var.R();
            if (z3 || objR == sf2.a) {
                objR = new db4(f5, i7, jD);
                l46Var.p0(objR);
            }
            nk8.e(0, (a26) objR, l46Var, j09VarP);
            f4 = f5;
        } else {
            j09Var2 = j09Var;
            l46Var.Z();
            f4 = f3;
        }
        long j3 = jD;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new eb4(j09Var2, f4, j3, i2, i3, 0);
        }
    }

    public static final void o(mr7 mr7Var, em7 em7Var) {
        String value;
        em7Var.getClass();
        u57 u57Var = mr7Var.b;
        yw0 yw0Var = u57Var.a;
        yw0Var.f.add(em7Var);
        t09 t09Var = mr7Var.a;
        for (em7 em7Var2 : yw0Var.f) {
            z3b z3bVar = yw0Var.c;
            z3b z3bVar2 = yw0Var.a;
            StringBuilder sb = new StringBuilder(fm7.a(em7Var2));
            sb.append(':');
            if (z3bVar == null || (value = z3bVar.getValue()) == null) {
                value = "";
            }
            sb.append(value);
            sb.append(':');
            sb.append(z3bVar2);
            t09Var.c.put(sb.toString(), u57Var);
        }
    }

    public static final mr7 q(t09 t09Var, em7 em7Var, o4e o4eVar, l26 l26Var) {
        em7Var.getClass();
        return H(em7Var, l26Var, o4eVar, lp7.b, t09Var, false, 72);
    }

    public static mr7 r(t09 t09Var, em7 em7Var, l26 l26Var) {
        em7Var.getClass();
        return H(em7Var, l26Var, null, lp7.a, t09Var, false, 8);
    }

    public static final void s(yag yagVar, String str) {
        ccg ccgVarB;
        WorkDatabase workDatabase = yagVar.c;
        workDatabase.getClass();
        nbg nbgVarX = workDatabase.x();
        bx3 bx3VarS = workDatabase.s();
        ArrayList arrayListK = t72.K(str);
        while (!arrayListK.isEmpty()) {
            String str2 = (String) x72.k0(arrayListK);
            vag vagVarC = nbgVarX.c(str2);
            if (vagVarC != vag.c && vagVarC != vag.d) {
                ((Number) urg.I(nbgVarX.a, false, true, new alc(str2, 22))).intValue();
            }
            arrayListK.addAll(bx3VarS.a(str2));
        }
        vva vvaVar = yagVar.f;
        vvaVar.getClass();
        synchronized (vvaVar.k) {
            ff8.h().e(vva.l, "Processor cancelling " + str);
            vvaVar.i.add(str);
            ccgVarB = vvaVar.b(str);
        }
        vva.d(str, ccgVarB, 1);
        Iterator it = yagVar.e.iterator();
        while (it.hasNext()) {
            ((bfc) it.next()).d(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable t(wj5 wj5Var, xj5 xj5Var, zn2 zn2Var) throws Throwable {
        bl5 bl5Var;
        mmb mmbVar;
        dg7 dg7Var;
        CancellationException cancellationExceptionN;
        if (zn2Var instanceof bl5) {
            bl5Var = (bl5) zn2Var;
            int i2 = bl5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bl5Var.label = i2 - Integer.MIN_VALUE;
            } else {
                bl5Var = new bl5(zn2Var);
            }
        } else {
            bl5Var = new bl5(zn2Var);
        }
        Object obj = bl5Var.result;
        int i3 = bl5Var.label;
        if (i3 == 0) {
            mmb mmbVarD = ks0.d(obj);
            try {
                xj5 dl5Var = new dl5(xj5Var, mmbVarD);
                bl5Var.L$0 = null;
                bl5Var.L$1 = null;
                bl5Var.L$2 = mmbVarD;
                bl5Var.label = 1;
                Object objB = wj5Var.b(dl5Var, bl5Var);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                mmbVar = mmbVarD;
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) bl5Var.L$2;
            try {
                jzb.q(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) mmbVar.element;
        if ((th3 != null && th3.equals(th)) || ((dg7Var = (dg7) bl5Var.getContext().F0(ndb.Y0)) != null && dg7Var.isCancelled() && (cancellationExceptionN = dg7Var.N()) != null && cancellationExceptionN.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            bzd.m(th3, th);
            throw th3;
        }
        bzd.m(th, th3);
        throw th;
    }

    public static void u(String str, boolean z) {
        if (z) {
            return;
        }
        qc0.j(str);
    }

    public static void v(boolean z) {
        if (z) {
            return;
        }
        cva.s();
    }

    public static void w(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            ub3.v(sb, "Must be called on ", name2, " thread, but got ", name);
            r3.k(sb, ".");
        }
    }

    public static void x(String str) {
        if (TextUtils.isEmpty(str)) {
            qc0.j("Given String is empty or null");
        }
    }

    public static void y(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            qc0.j(str2);
        }
    }

    public static void z(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        qc0.p(str);
    }

    public abstract String J();

    public void Q(q8c q8cVar, Object obj) {
        q8cVar.getClass();
        if (obj == null) {
            return;
        }
        x8c x8cVarW0 = q8cVar.W0(J());
        try {
            p(x8cVarW0, obj);
            x8cVarW0.R0();
            cgg.t(x8cVarW0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(x8cVarW0, th);
                throw th2;
            }
        }
    }

    public abstract void p(x8c x8cVar, Object obj);
}
