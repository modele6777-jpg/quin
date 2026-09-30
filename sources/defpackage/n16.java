package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.draw.photo.homepage.CardLayoutConfig;
import ai.askquin.ui.draw.photo.homepage.CardPositionConfig;
import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;
import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n16 {
    public static final float A;
    public static final n82 B;
    public static final n82 C;
    public static final byte[] D;
    public static final float[] E;
    public static final Object F;
    public static int[] G;
    public static final char[] H;
    public static gx6 I;
    public static final float[] a = new float[91];
    public static final dd2 b = new dd2(new kd2(8), false, 1235345616);
    public static final dd2 c = new dd2(new gd2(23), false, -638737502);
    public static final dd2 d = new dd2(new yd2(18), false, 873830138);
    public static final dd2 e = new dd2(new ie2(0), false, -1774488488);
    public static final dd2 f = new dd2(new ie2(1), false, 430702507);
    public static final g5d g = g5d.g;
    public static final n82 h;
    public static final float i;
    public static final float j;
    public static final n82 k;
    public static final float l;
    public static final n82 m;
    public static final float n;
    public static final n82 o;
    public static final float p;
    public static final n82 q;
    public static final float r;
    public static final q9f s;
    public static final n82 t;
    public static final n82 u;
    public static final n82 v;
    public static final float w;
    public static final n82 x;
    public static final n82 y;
    public static final n82 z;

    static {
        n82 n82Var = n82.v;
        h = n82Var;
        i = 0.38f;
        j = 8.0f;
        k = n82Var;
        l = 0.12f;
        m = n82Var;
        n = 0.12f;
        o = n82.Y;
        p = 1.0f;
        q = n82.y;
        r = 1.0f;
        s = q9f.e;
        n82 n82Var2 = n82.g;
        t = n82Var2;
        n82 n82Var3 = n82.w;
        u = n82Var3;
        v = n82Var;
        w = 0.38f;
        x = n82Var2;
        y = n82.z;
        z = n82Var;
        A = 0.38f;
        B = n82Var2;
        C = n82Var3;
        D = new byte[]{0, 0, 0, 1};
        E = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        F = new Object();
        G = new int[10];
        H = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static h7f A(boolean z2, qfc qfcVar, yt7 yt7Var, int i2) {
        zt7 zt7Var = zt7.p;
        if ((i2 & 4) != 0) {
            qfcVar = qfc.d;
        }
        qfc qfcVar2 = qfcVar;
        if ((i2 & 8) != 0) {
            yt7Var = yt7.q;
        }
        return new h7f(z2, true, true, qfcVar2, yt7Var, zt7Var);
    }

    public static int B(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        pa7.J(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            z(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            z(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            z(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    z(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0097 A[SYNTHETIC] */
    public static final FiveCardUpgradePending C(String str, String str2, List list, QuotaUsage quotaUsage, Set set, Instant instant) {
        int i2;
        int totalCount;
        iy9 iy9Var;
        str.getClass();
        str2.getClass();
        set.getClass();
        if (!quotaUsage.getHasSubscription()) {
            List<LimitedQuota> limitedQuotaList = quotaUsage.getLimitedQuotaList();
            if (limitedQuotaList == null) {
                limitedQuotaList = pu4.a;
            }
            int iF = bm8.F(t72.u(limitedQuotaList, 10));
            if (iF < 16) {
                iF = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
            for (Object obj : limitedQuotaList) {
                linkedHashMap.put(((LimitedQuota) obj).getOrderId(), obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (H((LimitedQuota) obj2, instant)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (!s72.o0(set, ((LimitedQuota) obj3).getOrderId())) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (true) {
                i2 = 2;
                if (!it.hasNext()) {
                    break;
                }
                LimitedQuota limitedQuota = (LimitedQuota) it.next();
                LimitedQuota limitedQuota2 = (LimitedQuota) linkedHashMap.get(limitedQuota.getOrderId());
                if (limitedQuota2 == null) {
                    if (limitedQuota.getExpiredAt() != null) {
                        totalCount = 0;
                        if (totalCount < 0 && totalCount < 2) {
                            iy9Var = new iy9(limitedQuota, Integer.valueOf(totalCount));
                        }
                    }
                    if (iy9Var != null) {
                        arrayList3.add(iy9Var);
                    }
                } else {
                    if (J(limitedQuota2, instant) && limitedQuota2.getUsedCount() > limitedQuota.getUsedCount()) {
                        totalCount = limitedQuota2.getTotalCount() - limitedQuota2.getUsedCount();
                        if (totalCount < 0) {
                        }
                    }
                    if (iy9Var != null) {
                        arrayList3.add(iy9Var);
                    }
                }
                iy9Var = null;
                if (iy9Var != null) {
                    arrayList3.add(iy9Var);
                }
            }
            List listB1 = s72.b1(arrayList3, new y85(i2, new qu(4)));
            iy9 iy9Var2 = (iy9) s72.x0(listB1);
            if (iy9Var2 != null) {
                ArrayList arrayList4 = new ArrayList(t72.u(listB1, 10));
                Iterator it2 = listB1.iterator();
                while (it2.hasNext()) {
                    String orderId = ((LimitedQuota) ((iy9) it2.next()).d()).getOrderId();
                    if (orderId == null) {
                        qc0.j("Required value was null.");
                        return null;
                    }
                    arrayList4.add(orderId);
                }
                return new FiveCardUpgradePending(str, str2, arrayList4, ((Number) iy9Var2.e()).intValue());
            }
        }
        return null;
    }

    public static final String D(u99 u99Var, int i2) {
        u99Var.getClass();
        String strA = u99Var.a(i2);
        return u99Var.b(i2) ? ".".concat(strA) : strA;
    }

    public static String E(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                dy6 dy6VarM = jy6.m();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int iB = B(bArr, i3, bArr.length, zArr);
                    if (iB != bArr.length) {
                        dy6VarM.b(Integer.valueOf(iB));
                    }
                    i3 = iB + 3;
                }
                yob yobVarG = dy6VarM.g();
                for (int i4 = 0; i4 < yobVarG.d; i4++) {
                    if (((Integer) yobVarG.get(i4)).intValue() + 3 < length) {
                        er0 er0Var = new er0(bArr, ((Integer) yobVarG.get(i4)).intValue() + 3, length);
                        e6 e6VarL = L(er0Var);
                        if (e6VarL.a == 33 && e6VarL.b == 0) {
                            er0Var.x(4);
                            int iK = er0Var.k(3);
                            er0Var.w();
                            m99 m99VarM = M(er0Var, true, iK, null);
                            return d72.a(m99VarM.a, m99VarM.b, m99VarM.c, m99VarM.d, m99VarM.e, m99VarM.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String F(rr5 rr5Var) {
        String str = rr5Var.p;
        String str2 = rr5Var.l;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return rr5Var.p;
    }

    public static boolean G(byte[] bArr, int i2, rr5 rr5Var) {
        int i3;
        if (Objects.equals(rr5Var.p, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(rr5Var.p, "video/hevc")) {
            e6 e6VarL = L(new er0(bArr, 4, i2 + 4));
            int i4 = e6VarL.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && e6VarL.c == rr5Var.I - 1) {
                return false;
            }
        }
        return true;
    }

    public static final boolean H(LimitedQuota limitedQuota, Instant instant) {
        return J(limitedQuota, instant) && limitedQuota.getUsedCount() < limitedQuota.getTotalCount();
    }

    public static final boolean I(int i2, int i3, String str) {
        str.getClass();
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && ieg.m(str.charAt(i2 + 1)) != -1 && ieg.m(str.charAt(i4)) != -1;
    }

    public static final boolean J(LimitedQuota limitedQuota, Instant instant) {
        String orderId;
        Object dzbVar;
        if (!pa7.t(limitedQuota.getCategory(), LimitedQuota.CATEGORY_TIME_MEMBERSHIP) || limitedQuota.getTotalCount() != 5 || (orderId = limitedQuota.getOrderId()) == null || v4e.Q(orderId)) {
            return false;
        }
        int totalCount = limitedQuota.getTotalCount();
        int usedCount = limitedQuota.getUsedCount();
        if (usedCount < 0 || usedCount > totalCount) {
            return false;
        }
        if (limitedQuota.getExpiredAt() != null) {
            try {
                dzbVar = Boolean.valueOf(Instant.parse(limitedQuota.getExpiredAt()).isAfter(instant));
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            Object obj = Boolean.FALSE;
            if (dzbVar instanceof dzb) {
                dzbVar = obj;
            }
            if (!((Boolean) dzbVar).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int K(rr5 rr5Var) {
        String strF = F(rr5Var);
        if (Objects.equals(strF, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strF, "video/hevc") || Objects.equals(strF, "video/vvc")) ? 2 : 0;
    }

    public static e6 L(er0 er0Var) {
        er0Var.w();
        return new e6(er0Var.k(6), er0Var.k(6), er0Var.k(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static m99 M(er0 er0Var, boolean z2, int i2, m99 m99Var) {
        int[] iArr;
        int i3;
        boolean z3;
        int i4;
        int i5;
        boolean zJ;
        int iK;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (!z2) {
            if (m99Var != null) {
                int i8 = m99Var.a;
                zJ = m99Var.b;
                iK = m99Var.c;
                i6 = m99Var.d;
                iArr2 = m99Var.e;
                i3 = i8;
            } else {
                iArr = iArr2;
                i3 = 0;
                z3 = false;
                i4 = 0;
                i5 = 0;
            }
            int iK2 = er0Var.k(8);
            i7 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                if (er0Var.j()) {
                    i7 += 88;
                }
                if (er0Var.j()) {
                    i7 += 8;
                }
            }
            er0Var.x(i7);
            if (i2 > 0) {
                er0Var.x((8 - i2) * 2);
            }
            return new m99(i3, z3, i4, i5, iArr, iK2);
        }
        int iK3 = er0Var.k(2);
        zJ = er0Var.j();
        iK = er0Var.k(5);
        i6 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            if (er0Var.j()) {
                i6 |= 1 << i10;
            }
        }
        for (int i11 = 0; i11 < 6; i11++) {
            iArr2[i11] = er0Var.k(8);
        }
        i3 = iK3;
        iArr = iArr2;
        z3 = zJ;
        i4 = iK;
        i5 = i6;
        int iK4 = er0Var.k(8);
        i7 = 0;
        while (i9 < i2) {
            if (er0Var.j()) {
                i7 += 88;
            }
            if (er0Var.j()) {
                i7 += 8;
            }
        }
        er0Var.x(i7);
        if (i2 > 0) {
            er0Var.x((8 - i2) * 2);
        }
        return new m99(i3, z3, i4, i5, iArr, iK4);
    }

    public static ff8 N(byte[] bArr, int i2, int i3) {
        byte b2;
        int i4 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i4);
        if (b2 == 0 || i3 <= i4) {
            return null;
        }
        er0 er0Var = new er0(bArr, i4, i3 + 1);
        while (er0Var.c(16)) {
            int iK = er0Var.k(8);
            int i5 = 0;
            while (iK == 255) {
                i5 += 255;
                iK = er0Var.k(8);
            }
            int i6 = i5 + iK;
            int iK2 = er0Var.k(8);
            int i7 = 0;
            while (iK2 == 255) {
                i7 += 255;
                iK2 = er0Var.k(8);
            }
            int i8 = i7 + iK2;
            if (i8 == 0 || !er0Var.c(i8)) {
                return null;
            }
            if (i6 == 176) {
                int iL = er0Var.l();
                boolean zJ = er0Var.j();
                int iL2 = zJ ? er0Var.l() : 0;
                int iL3 = er0Var.l();
                int iL4 = -1;
                for (int i9 = 0; i9 <= iL3; i9++) {
                    iL4 = er0Var.l();
                    er0Var.l();
                    int iK3 = er0Var.k(6);
                    if (iK3 == 63) {
                        return null;
                    }
                    er0Var.k(iK3 == 0 ? Math.max(0, iL - 30) : Math.max(0, (iK3 + iL) - 31));
                    if (zJ) {
                        int iK4 = er0Var.k(6);
                        if (iK4 == 63) {
                            return null;
                        }
                        er0Var.k(iK4 == 0 ? Math.max(0, iL2 - 30) : Math.max(0, (iK4 + iL2) - 31));
                    }
                    if (er0Var.j()) {
                        er0Var.x(10);
                    }
                }
                return new ff8(iL4, 9);
            }
            er0Var.x(i8 * 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:202:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    public static p99 O(byte[] bArr, int i2, int i3, szc szcVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iL;
        int i8;
        int iL2;
        int i9;
        int i10;
        int iMax;
        int i11;
        int i12;
        int i13;
        int iF;
        int iG;
        int i14;
        n99 n99Var;
        fz3 fz3Var;
        e6 e6VarL = L(new er0(bArr, i2, i3));
        er0 er0Var = new er0(bArr, i2 + 2, i3);
        int i15 = 4;
        er0Var.x(4);
        int iK = er0Var.k(3);
        int i16 = e6VarL.b;
        boolean z2 = i16 != 0 && iK == 7;
        if (szcVar != null) {
            jy6 jy6Var = (jy6) szcVar.b;
            if (jy6Var.isEmpty()) {
                i4 = 0;
            } else {
                i4 = ((l99) jy6Var.get(Math.min(i16, jy6Var.size() - 1))).a;
            }
        } else {
            i4 = 0;
        }
        m99 m99VarM = null;
        if (!z2) {
            er0Var.w();
            m99VarM = M(er0Var, true, iK, null);
        } else if (szcVar != null) {
            n99 n99Var2 = (n99) szcVar.c;
            int[] iArr = n99Var2.b;
            jy6 jy6Var2 = n99Var2.a;
            int i17 = iArr[i4];
            if (jy6Var2.size() > i17) {
                m99VarM = (m99) jy6Var2.get(i17);
            }
        }
        er0Var.l();
        if (z2) {
            int iK2 = er0Var.j() ? er0Var.k(8) : -1;
            if (szcVar == null || (fz3Var = (fz3) szcVar.d) == null) {
                iL = 0;
                iL2 = 0;
                i8 = 0;
                i10 = 0;
                i7 = 0;
                i9 = 0;
            } else {
                jy6 jy6Var3 = (jy6) fz3Var.b;
                if (iK2 == -1) {
                    iK2 = ((int[]) fz3Var.c)[i4];
                }
                if (iK2 == -1 || jy6Var3.size() <= iK2) {
                    iL = 0;
                    iL2 = 0;
                    i8 = 0;
                    i10 = 0;
                    i7 = 0;
                    i9 = 0;
                } else {
                    o99 o99Var = (o99) jy6Var3.get(iK2);
                    int i18 = o99Var.a;
                    i8 = o99Var.d;
                    int i19 = o99Var.e;
                    iL = o99Var.b;
                    iL2 = o99Var.c;
                    i7 = i19;
                    i9 = i7;
                    i10 = i8;
                }
            }
        } else {
            int iL3 = er0Var.l();
            if (iL3 == 3) {
                er0Var.w();
            }
            int iL4 = er0Var.l();
            int iL5 = er0Var.l();
            if (er0Var.j()) {
                int iL6 = er0Var.l();
                int iL7 = er0Var.l();
                int iL8 = er0Var.l();
                int iL9 = er0Var.l();
                i5 = iL4 - ((iL6 + iL7) * ((iL3 == 1 || iL3 == 2) ? 2 : 1));
                i6 = iL5 - ((iL8 + iL9) * (iL3 == 1 ? 2 : 1));
            } else {
                i5 = iL4;
                i6 = iL5;
            }
            i7 = i6;
            iL = er0Var.l();
            i8 = i5;
            iL2 = er0Var.l();
            i9 = iL5;
            i10 = iL4;
        }
        int iL10 = er0Var.l();
        if (z2) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i20 = er0Var.j() ? 0 : iK; i20 <= iK; i20++) {
                er0Var.l();
                iMax = Math.max(er0Var.l(), iMax);
                er0Var.l();
            }
        }
        er0Var.l();
        er0Var.l();
        er0Var.l();
        er0Var.l();
        er0Var.l();
        er0Var.l();
        if (er0Var.j()) {
            int i21 = 6;
            if (z2 ? er0Var.j() : false) {
                er0Var.x(6);
            } else if (er0Var.j()) {
                int i22 = 0;
                while (i22 < i15) {
                    int i23 = 0;
                    while (i23 < i21) {
                        if (er0Var.j()) {
                            int iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                            if (i22 > 1) {
                                er0Var.m();
                            }
                            for (int i24 = 0; i24 < iMin; i24++) {
                                er0Var.m();
                            }
                        } else {
                            er0Var.l();
                        }
                        i23 += i22 == 3 ? 3 : 1;
                        i21 = 6;
                    }
                    i22++;
                    i15 = 4;
                    i21 = 6;
                }
            }
        }
        er0Var.x(2);
        if (er0Var.j()) {
            er0Var.x(8);
            er0Var.l();
            er0Var.l();
            er0Var.w();
        }
        int iL11 = er0Var.l();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i25 = 0;
        int iL12 = -1;
        int i26 = -1;
        while (i25 < iL11) {
            if (i25 == 0 || !er0Var.j()) {
                int iL13 = er0Var.l();
                iL12 = er0Var.l();
                int[] iArr3 = new int[iL13];
                int i27 = 0;
                while (i27 < iL13) {
                    iArr3[i27] = (i27 > 0 ? iArr3[i27 - 1] : 0) - (er0Var.l() + 1);
                    er0Var.w();
                    i27++;
                }
                int[] iArr4 = new int[iL12];
                int i28 = 0;
                while (i28 < iL12) {
                    iArr4[i28] = er0Var.l() + 1 + (i28 > 0 ? iArr4[i28 - 1] : 0);
                    er0Var.w();
                    i28++;
                }
                i26 = iL13;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i29 = i26 + iL12;
                int iL14 = (1 - ((er0Var.j() ? 1 : 0) * 2)) * (er0Var.l() + 1);
                int i30 = i29 + 1;
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 <= i29; i31++) {
                    if (er0Var.j()) {
                        zArr[i31] = true;
                    } else {
                        zArr[i31] = er0Var.j();
                    }
                }
                int[] iArr5 = new int[i30];
                int[] iArr6 = new int[i30];
                int i32 = 0;
                for (int i33 = iL12 - 1; i33 >= 0; i33--) {
                    int i34 = iArrCopyOf[i33] + iL14;
                    if (i34 < 0 && zArr[i26 + i33]) {
                        iArr5[i32] = i34;
                        i32++;
                    }
                }
                if (iL14 < 0 && zArr[i29]) {
                    iArr5[i32] = iL14;
                    i32++;
                }
                int i35 = i32;
                int[] iArr7 = iArr2;
                for (int i36 = 0; i36 < i26; i36++) {
                    int i37 = iArr7[i36] + iL14;
                    if (i37 < 0 && zArr[i36]) {
                        iArr5[i35] = i37;
                        i35++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i35);
                int i38 = 0;
                for (int i39 = i26 - 1; i39 >= 0; i39--) {
                    int i40 = iArr7[i39] + iL14;
                    if (i40 > 0 && zArr[i39]) {
                        iArr6[i38] = i40;
                        i38++;
                    }
                }
                if (iL14 > 0 && zArr[i29]) {
                    iArr6[i38] = iL14;
                    i38++;
                }
                int i41 = i35;
                int i42 = i38;
                for (int i43 = 0; i43 < iL12; i43++) {
                    int i44 = iArrCopyOf[i43] + iL14;
                    if (i44 > 0 && zArr[i26 + i43]) {
                        iArr6[i42] = i44;
                        i42++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i42);
                iL12 = i42;
                i26 = i41;
                iArr2 = iArrCopyOf2;
            }
            i25++;
            iL11 = iL11;
            i4 = i4;
        }
        int i45 = i4;
        if (er0Var.j()) {
            int iL15 = er0Var.l();
            for (int i46 = 0; i46 < iL15; i46++) {
                er0Var.x(iL10 + 5);
            }
        }
        er0Var.x(2);
        float f2 = 1.0f;
        if (er0Var.j()) {
            if (er0Var.j()) {
                int iK3 = er0Var.k(8);
                if (iK3 == 255) {
                    int iK4 = er0Var.k(16);
                    int iK5 = er0Var.k(16);
                    if (iK4 != 0 && iK5 != 0) {
                        f2 = iK4 / iK5;
                    }
                } else if (iK3 < 17) {
                    f2 = E[iK3];
                } else {
                    kv2.w(iK3, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (er0Var.j()) {
                er0Var.w();
            }
            if (er0Var.j()) {
                er0Var.x(3);
                i14 = er0Var.j() ? 1 : 2;
                if (er0Var.j()) {
                    int iK6 = er0Var.k(8);
                    int iK7 = er0Var.k(8);
                    er0Var.x(8);
                    iF = e82.f(iK6);
                    iG = e82.g(iK7);
                } else {
                    iF = -1;
                    iG = -1;
                }
            } else if (szcVar == null || (n99Var = (n99) szcVar.e) == null) {
                iF = -1;
                iG = -1;
                i14 = -1;
            } else {
                jy6 jy6Var4 = n99Var.a;
                int i47 = n99Var.b[i45];
                if (jy6Var4.size() > i47) {
                    q99 q99Var = (q99) jy6Var4.get(i47);
                    int i48 = q99Var.a;
                    int i49 = q99Var.b;
                    iG = q99Var.c;
                    iF = i48;
                    i14 = i49;
                } else {
                    iF = -1;
                    iG = -1;
                    i14 = -1;
                }
            }
            if (er0Var.j()) {
                er0Var.l();
                er0Var.l();
            }
            er0Var.w();
            if (er0Var.j()) {
                i7 *= 2;
            }
            i11 = iF;
            i13 = iG;
            i12 = i14;
        } else {
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new p99(iK, m99VarM, iL, iL2, i8, i7, i10, i9, f2, iMax, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:472:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public static szc P(byte[] bArr, int i2, int i3) {
        int[] iArr;
        n99 n99Var;
        int iK;
        int iK2;
        int iK3;
        yob yobVar;
        boolean[][] zArr;
        int i4;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        int i5;
        boolean zJ;
        int i6;
        int i7;
        int i8;
        boolean zJ2;
        boolean zJ3;
        int iL;
        int i9;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        er0 er0Var = new er0(bArr, i2, i3);
        L(er0Var);
        er0Var.x(4);
        boolean zJ4 = er0Var.j();
        boolean zJ5 = er0Var.j();
        int iK4 = er0Var.k(6);
        int i12 = iK4 + 1;
        int iK5 = er0Var.k(3);
        er0Var.x(17);
        m99 m99VarM = M(er0Var, true, iK5, null);
        for (int i13 = er0Var.j() ? 0 : iK5; i13 <= iK5; i13++) {
            er0Var.l();
            er0Var.l();
            er0Var.l();
        }
        int iK6 = er0Var.k(6);
        int iL2 = er0Var.l() + 1;
        int i14 = 6;
        n99 n99Var2 = new n99(jy6.s(m99VarM), new int[1], 0);
        boolean z4 = i12 >= 2 && iL2 >= 2;
        boolean z5 = zJ4 && zJ5;
        int i15 = iK6 + 1;
        boolean z6 = i15 >= i12;
        if (!z4 || !z5 || !z6) {
            return new szc((yob) null, n99Var2, (fz3) null, (n99) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iL2, i15);
        int i16 = 1;
        int[] iArr5 = new int[iL2];
        int[] iArr6 = new int[iL2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i17 = 1; i17 < iL2; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 <= iK6; i19++) {
                if (er0Var.j()) {
                    iArr4[i17][i18] = i19;
                    iArr6[i17] = i19;
                    i18++;
                }
                iArr5[i17] = i18;
            }
        }
        if (er0Var.j()) {
            er0Var.x(64);
            if (er0Var.j()) {
                er0Var.l();
            }
            int iL3 = er0Var.l();
            int i20 = 0;
            while (i20 < iL3) {
                er0Var.l();
                if (i20 == 0 || er0Var.j()) {
                    boolean zJ6 = er0Var.j();
                    boolean zJ7 = er0Var.j();
                    z3 = zJ6;
                    z2 = zJ7;
                    if (zJ6 || zJ7) {
                        zJ = er0Var.j();
                        if (zJ) {
                            er0Var.x(19);
                        }
                        er0Var.x(8);
                        if (zJ) {
                            er0Var.x(4);
                        }
                        er0Var.x(15);
                        i7 = zJ6;
                        i6 = zJ7;
                    }
                    i8 = 0;
                    while (i8 <= iK5) {
                        zJ2 = er0Var.j();
                        if (!zJ2) {
                            zJ2 = er0Var.j();
                        }
                        if (zJ2) {
                            er0Var.l();
                            zJ3 = false;
                        } else {
                            zJ3 = er0Var.j();
                        }
                        if (zJ3) {
                            iL = 0;
                        } else {
                            iL = er0Var.l();
                        }
                        int[][] iArr7 = iArr4;
                        i9 = i7 + i6;
                        int[] iArr8 = iArr6;
                        i10 = 0;
                        while (i10 < i9) {
                            int i21 = i9;
                            for (i11 = 0; i11 <= iL; i11++) {
                                er0Var.l();
                                er0Var.l();
                                if (zJ) {
                                    er0Var.l();
                                    er0Var.l();
                                }
                                er0Var.w();
                            }
                            i10++;
                            i9 = i21;
                        }
                        i8++;
                        i20 = i20;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i20++;
                } else {
                    z3 = false;
                    z2 = false;
                }
                zJ = false;
                i7 = z3;
                i6 = z2;
                i8 = 0;
                while (i8 <= iK5) {
                    zJ2 = er0Var.j();
                    if (!zJ2) {
                        zJ2 = er0Var.j();
                    }
                    if (zJ2) {
                        er0Var.l();
                        zJ3 = false;
                    } else {
                        zJ3 = er0Var.j();
                    }
                    if (zJ3) {
                        iL = er0Var.l();
                    } else {
                        iL = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i9 = i7 + i6;
                    int[] iArr10 = iArr6;
                    i10 = 0;
                    while (i10 < i9) {
                        int i22 = i9;
                        while (i11 <= iL) {
                            er0Var.l();
                            er0Var.l();
                            if (zJ) {
                                er0Var.l();
                                er0Var.l();
                            }
                            er0Var.w();
                        }
                        i10++;
                        i9 = i22;
                    }
                    i8++;
                    i20 = i20;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i20++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!er0Var.j()) {
            return new szc((yob) null, n99Var2, (fz3) null, (n99) null);
        }
        int i23 = er0Var.e;
        if (i23 > 0) {
            er0Var.x(8 - i23);
        }
        m99 m99VarM2 = M(er0Var, false, iK5, m99VarM);
        boolean zJ8 = er0Var.j();
        boolean[] zArr3 = new boolean[16];
        int i24 = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            boolean zJ9 = er0Var.j();
            zArr3[i25] = zJ9;
            if (zJ9) {
                i24++;
            }
        }
        if (i24 == 0 || !zArr3[1]) {
            return new szc((yob) null, n99Var2, (fz3) null, (n99) null);
        }
        int[] iArr13 = new int[i24];
        for (int i26 = 0; i26 < i24 - (zJ8 ? 1 : 0); i26++) {
            iArr13[i26] = er0Var.k(3);
        }
        int[] iArr14 = new int[i24 + 1];
        if (zJ8) {
            int i27 = 1;
            while (i27 < i24) {
                int[] iArr15 = iArr14;
                for (int i28 = 0; i28 < i27; i28++) {
                    iArr15[i27] = iArr13[i28] + 1 + iArr15[i27];
                }
                i27++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i24] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i12, i24);
        int[] iArr17 = new int[i12];
        iArr17[0] = 0;
        boolean zJ10 = er0Var.j();
        int i29 = 1;
        while (i29 < i12) {
            if (zJ10) {
                i5 = i29;
                iArr17[i5] = er0Var.k(i14);
            } else {
                i5 = i29;
                iArr17[i5] = i5;
            }
            if (zJ8) {
                int i30 = 0;
                while (i30 < i24) {
                    int i31 = i30 + 1;
                    iArr16[i5][i30] = (iArr17[i5] & ((1 << iArr[i31]) - 1)) >> iArr[i30];
                    i30 = i31;
                }
            } else {
                int i32 = 0;
                while (i32 < i24) {
                    int i33 = i32;
                    iArr16[i5][i33] = er0Var.k(iArr13[i32] + 1);
                    i32 = i33 + 1;
                }
            }
            i29 = i5 + 1;
            i14 = 6;
        }
        int[] iArr18 = new int[i15];
        int i34 = 1;
        int i35 = 0;
        while (i35 < i12) {
            iArr18[iArr17[i35]] = -1;
            int[] iArr19 = iArr18;
            int i36 = 0;
            int i37 = 0;
            while (i36 < 16) {
                if (zArr3[i36]) {
                    if (i36 == i16) {
                        iArr19[iArr17[i35]] = iArr16[i35][i37];
                    }
                    i37++;
                }
                i36++;
                i16 = 1;
            }
            if (i35 > 0) {
                int i38 = 0;
                while (true) {
                    if (i38 >= i35) {
                        i34++;
                        break;
                    }
                    int i39 = i38;
                    if (iArr19[iArr17[i35]] == iArr19[iArr17[i38]]) {
                        break;
                    }
                    i38 = i39 + 1;
                }
            }
            i35++;
            iArr18 = iArr19;
            i16 = 1;
        }
        int[] iArr20 = iArr18;
        int iK7 = er0Var.k(4);
        if (i34 < 2 || iK7 == 0) {
            return new szc((yob) null, n99Var2, (fz3) null, (n99) null);
        }
        int[] iArr21 = new int[i34];
        for (int i40 = 0; i40 < i34; i40++) {
            iArr21[i40] = er0Var.k(iK7);
        }
        int[] iArr22 = new int[i15];
        for (int i41 = 0; i41 < i12; i41++) {
            iArr22[Math.min(iArr17[i41], iK6)] = i41;
        }
        dy6 dy6VarM = jy6.m();
        int i42 = 0;
        while (i42 <= iK6) {
            int[] iArr23 = iArr22;
            int i43 = i34;
            int iMin = Math.min(iArr20[i42], i43 - 1);
            dy6VarM.b(new l99(iArr23[i42], iMin >= 0 ? iArr21[iMin] : -1));
            i42++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i34 = i43;
        }
        int[] iArr24 = iArr17;
        yob yobVarG = dy6VarM.g();
        if (((l99) yobVarG.get(0)).b == -1) {
            return new szc((yob) null, n99Var2, (fz3) null, (n99) null);
        }
        int i44 = 1;
        while (true) {
            if (i44 > iK6) {
                i44 = -1;
                break;
            }
            if (((l99) yobVarG.get(i44)).b != -1) {
                break;
            }
            i44++;
        }
        if (i44 == -1) {
            return new szc((yob) null, n99Var2, (fz3) null, (n99) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        for (int i45 = 1; i45 < i12; i45++) {
            for (int i46 = 0; i46 < i45; i46++) {
                boolean[] zArr6 = zArr4[i45];
                boolean[] zArr7 = zArr5[i45];
                boolean zJ11 = er0Var.j();
                zArr7[i46] = zJ11;
                zArr6[i46] = zJ11;
            }
        }
        for (int i47 = 1; i47 < i12; i47++) {
            int i48 = 0;
            while (i48 < iK4) {
                boolean[][] zArr8 = zArr4;
                for (int i49 = 0; i49 < i47; i49++) {
                    boolean[] zArr9 = zArr5[i47];
                    if (zArr9[i49] && zArr5[i49][i48]) {
                        zArr9[i48] = true;
                        break;
                    }
                }
                i48++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i15];
        for (int i50 = 0; i50 < i12; i50++) {
            int i51 = 0;
            for (int i52 = 0; i52 < i50; i52++) {
                i51 += zArr10[i50][i52] ? 1 : 0;
            }
            iArr25[iArr24[i50]] = i51;
        }
        int i53 = 0;
        for (int i54 = 0; i54 < i12; i54++) {
            if (iArr25[iArr24[i54]] == 0) {
                i53++;
            }
        }
        if (i53 > 1) {
            return new szc((yob) null, n99Var2, (fz3) null, (n99) null);
        }
        int[] iArr26 = new int[i12];
        int[] iArr27 = new int[iL2];
        if (er0Var.j()) {
            int i55 = 0;
            while (i55 < i12) {
                int i56 = i55;
                iArr26[i56] = er0Var.k(3);
                i55 = i56 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i12, iK5);
        }
        int i57 = 0;
        while (i57 < iL2) {
            int i58 = i57;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i59 = 0; i59 < iArr5[i58]; i59++) {
                iMax = Math.max(iMax, iArr28[((l99) yobVarG.get(iArr11[i58][i59])).a]);
            }
            iArr27[i58] = iMax + 1;
            i57 = i58 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (er0Var.j()) {
            int i60 = 0;
            while (i60 < iK4) {
                int i61 = i60 + 1;
                int i62 = i61;
                while (i62 < i12) {
                    if (zArr10[i62][i60]) {
                        er0Var.x(3);
                    }
                    i62++;
                    iK4 = iK4;
                }
                i60 = i61;
            }
        }
        er0Var.w();
        int iL4 = er0Var.l() + 1;
        dy6 dy6VarM2 = jy6.m();
        dy6VarM2.b(m99VarM);
        if (iL4 > 1) {
            dy6VarM2.b(m99VarM2);
            for (int i63 = 2; i63 < iL4; i63++) {
                m99VarM2 = M(er0Var, er0Var.j(), iK5, m99VarM2);
                dy6VarM2.b(m99VarM2);
            }
        }
        yob yobVarG2 = dy6VarM2.g();
        int iL5 = er0Var.l() + iL2;
        if (iL5 > iL2) {
            return new szc((yob) null, n99Var2, (fz3) null, (n99) null);
        }
        int iK8 = er0Var.k(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iL5, i15);
        int[] iArr29 = new int[iL5];
        int i64 = 0;
        int[] iArr30 = new int[iL5];
        int i65 = 0;
        while (i65 < iL2) {
            iArr29[i65] = i64;
            iArr30[i65] = iArr12[i65];
            if (iK8 == 0) {
                i4 = i65;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i4], i64, iArr5[i4], true);
                iArr2[i4] = iArr5[i4];
            } else {
                i4 = i65;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (iK8 == 1) {
                    int i66 = iArr12[i4];
                    for (int i67 = 0; i67 < iArr5[i4]; i67++) {
                        zArr2[i4][i67] = iArr11[i4][i67] == i66;
                    }
                    iArr2[i4] = 1;
                } else {
                    i64 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i65 = i4 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i64 = 0;
            i65 = i4 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i15];
        int i68 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i15;
        iArr34[i64] = iL5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i69 = 1;
        int i70 = 0;
        while (i69 < iL5) {
            if (iK8 == i68) {
                for (int i71 = 0; i71 < iArr5[i69]; i71++) {
                    zArr14[i69][i71] = er0Var.j();
                    int i72 = iArr31[i69];
                    boolean z7 = zArr14[i69][i71];
                    iArr31[i69] = i72 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr30[i69] = iArr11[i69][i71];
                    }
                }
            }
            if (i70 == 0 && iArr11[i69][0] == 0 && zArr14[i69][0]) {
                for (int i73 = 1; i73 < iArr5[i69]; i73++) {
                    if (iArr11[i69][i73] == i44 && zArr14[i69][i44]) {
                        i70 = i69;
                    }
                }
            }
            int i74 = 0;
            while (i74 < iArr5[i69]) {
                if (iL4 > 1) {
                    zArr15[i69][i74] = zArr14[i69][i74];
                    yobVar = yobVarG2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iC = ui4.c(iL4);
                    if (!zArr[i69][i74]) {
                        int i75 = ((l99) yobVarG.get(iArr11[i69][i74])).a;
                        int i76 = 0;
                        while (i76 < i74) {
                            int i77 = i76;
                            if (zArr12[i75][((l99) yobVarG.get(iArr11[i69][i77])).a]) {
                                zArr[i69][i74] = true;
                                break;
                            }
                            i76 = i77 + 1;
                        }
                    }
                    if (zArr[i69][i74]) {
                        if (i70 <= 0 || i69 != i70) {
                            er0Var.x(iC);
                        } else {
                            iArr33[i74] = er0Var.k(iC);
                        }
                    }
                } else {
                    yobVar = yobVarG2;
                    zArr = zArr15;
                }
                i74++;
                yobVarG2 = yobVar;
                zArr15 = zArr;
            }
            yob yobVar2 = yobVarG2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i69] == 1 && iArr25[iArr30[i69]] > 0) {
                er0Var.w();
            }
            i69++;
            yobVarG2 = yobVar2;
            zArr15 = zArr16;
            i68 = 2;
        }
        yob yobVar3 = yobVarG2;
        boolean[][] zArr17 = zArr15;
        if (i70 == 0) {
            return new szc((yob) null, n99Var2, (fz3) null, (n99) null);
        }
        int iL6 = er0Var.l();
        int i78 = iL6 + 1;
        dy6 dy6VarN = jy6.n(i78);
        int[] iArr35 = new int[i12];
        for (int i79 = 0; i79 < i78; i79++) {
            int iK9 = er0Var.k(16);
            int iK10 = er0Var.k(16);
            if (er0Var.j()) {
                iK = er0Var.k(2);
                if (iK == 3) {
                    er0Var.w();
                }
                iK2 = er0Var.k(4);
                iK3 = er0Var.k(4);
            } else {
                iK = 0;
                iK2 = 0;
                iK3 = 0;
            }
            if (er0Var.j()) {
                int iL7 = er0Var.l();
                int iL8 = er0Var.l();
                int iL9 = er0Var.l();
                int iL10 = er0Var.l();
                iK9 -= (iL7 + iL8) * ((iK == 1 || iK == 2) ? 2 : 1);
                iK10 -= (iL9 + iL10) * (iK == 1 ? 2 : 1);
            }
            dy6VarN.b(new o99(iK, iK2, iK3, iK9, iK10));
        }
        if (i78 <= 1 || !er0Var.j()) {
            for (int i80 = 1; i80 < i12; i80++) {
                iArr35[i80] = Math.min(i80, iL6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iC2 = ui4.c(i78);
            for (int i81 = 1; i81 < i12; i81++) {
                iArr35[i81] = er0Var.k(iC2);
            }
        }
        fz3 fz3Var = new fz3(dy6VarN.g(), iArr35);
        er0Var.x(2);
        for (int i82 = 1; i82 < i12; i82++) {
            if (iArr25[iArr24[i82]] == 0) {
                er0Var.w();
            }
        }
        for (int i83 = 1; i83 < iL5; i83++) {
            boolean zJ12 = er0Var.j();
            int i84 = 0;
            while (i84 < iArr32[i83]) {
                if ((i84 <= 0 || !zJ12) ? i84 == 0 : er0Var.j()) {
                    for (int i85 = 0; i85 < iArr5[i83]; i85++) {
                        if (zArr17[i83][i85]) {
                            er0Var.l();
                        }
                    }
                    er0Var.l();
                    er0Var.l();
                }
                i84++;
            }
        }
        int iL11 = er0Var.l() + 2;
        if (er0Var.j()) {
            er0Var.x(iL11);
        } else {
            for (int i86 = 1; i86 < i12; i86++) {
                for (int i87 = 0; i87 < i86; i87++) {
                    if (zArr10[i86][i87]) {
                        er0Var.x(iL11);
                    }
                }
            }
        }
        int iL12 = er0Var.l();
        for (int i88 = 1; i88 <= iL12; i88++) {
            er0Var.x(8);
        }
        if (er0Var.j()) {
            int i89 = er0Var.e;
            if (i89 > 0) {
                er0Var.x(8 - i89);
            }
            if (!er0Var.j() ? er0Var.j() : true) {
                er0Var.w();
            }
            boolean zJ13 = er0Var.j();
            boolean zJ14 = er0Var.j();
            if (zJ13 || zJ14) {
                for (int i90 = 0; i90 < iL2; i90++) {
                    for (int i91 = 0; i91 < iArr32[i90]; i91++) {
                        boolean zJ15 = zJ13 ? er0Var.j() : false;
                        boolean zJ16 = zJ14 ? er0Var.j() : false;
                        if (zJ15) {
                            er0Var.x(32);
                        }
                        if (zJ16) {
                            er0Var.x(18);
                        }
                    }
                }
            }
            boolean zJ17 = er0Var.j();
            int iK11 = zJ17 ? er0Var.k(4) + 1 : i12;
            dy6 dy6VarN2 = jy6.n(iK11);
            int[] iArr36 = new int[i12];
            for (int i92 = 0; i92 < iK11; i92++) {
                er0Var.x(3);
                int i93 = er0Var.j() ? 1 : 2;
                int iF = e82.f(er0Var.k(8));
                int iG = e82.g(er0Var.k(8));
                er0Var.x(8);
                dy6VarN2.b(new q99(iF, i93, iG));
            }
            if (zJ17 && iK11 > 1) {
                for (int i94 = 0; i94 < i12; i94++) {
                    iArr36[i94] = er0Var.k(4);
                }
            }
            n99Var = new n99(dy6VarN2.g(), iArr36, 1);
        } else {
            n99Var = null;
        }
        return new szc(yobVarG, new n99(yobVar3, iArr33, 0), fz3Var, n99Var);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[PHI: r19
  0x01ae: PHI (r19v6 float) = (r19v3 float), (r19v9 float), (r19v3 float), (r19v3 float), (r19v10 float) binds: [B:94:0x0190, B:104:0x01b5, B:98:0x01a6, B:99:0x01a8, B:100:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public static s99 Q(byte[] bArr, int i2, int i3) {
        int iL;
        int iL2;
        int i4;
        boolean z2;
        int i5;
        int iL3;
        boolean z3;
        boolean zJ;
        int i6;
        int i7;
        int i8;
        int iL4;
        int iF;
        float f2;
        int i9;
        int i10;
        int i11;
        float f3;
        int i12;
        int i13;
        int iG;
        boolean zJ2;
        boolean zJ3;
        int iK;
        int iK2;
        int iK3;
        int i14;
        int i15;
        er0 er0Var = new er0(bArr, i2 + 1, i3);
        int iK4 = er0Var.k(8);
        int iK5 = er0Var.k(8);
        int iK6 = er0Var.k(8);
        int iL5 = er0Var.l();
        if (iK4 == 100 || iK4 == 110 || iK4 == 122 || iK4 == 244 || iK4 == 44 || iK4 == 83 || iK4 == 86 || iK4 == 118 || iK4 == 128 || iK4 == 138) {
            iL = er0Var.l();
            boolean zJ4 = iL == 3 ? er0Var.j() : false;
            int iL6 = er0Var.l();
            iL2 = er0Var.l();
            er0Var.w();
            if (er0Var.j()) {
                int i16 = iL != 3 ? 8 : 12;
                i4 = 16;
                int i17 = 0;
                while (i17 < i16) {
                    if (er0Var.j()) {
                        int i18 = i17 < 6 ? 16 : 64;
                        int iM = 8;
                        int i19 = 8;
                        for (int i20 = 0; i20 < i18; i20++) {
                            if (iM != 0) {
                                iM = ((er0Var.m() + i19) + 256) % 256;
                            }
                            if (iM != 0) {
                                i19 = iM;
                            }
                        }
                    }
                    i17++;
                }
            } else {
                i4 = 16;
            }
            z2 = zJ4;
            i5 = iL6;
        } else {
            iL = 1;
            i4 = 16;
            i5 = 0;
            z2 = false;
            iL2 = 0;
        }
        int iL7 = er0Var.l() + 4;
        int iL8 = er0Var.l();
        if (iL8 != 0) {
            if (iL8 == 1) {
                boolean zJ5 = er0Var.j();
                er0Var.m();
                er0Var.m();
                iK4 = iK4;
                long jL = er0Var.l();
                iL8 = iL8;
                for (int i21 = 0; i21 < jL; i21++) {
                    er0Var.l();
                }
                iL2 = iL2;
                z3 = zJ5;
                iL3 = 0;
            } else {
                iL3 = 0;
            }
            er0Var.l();
            er0Var.w();
            int iL9 = er0Var.l() + 1;
            int iL10 = er0Var.l() + 1;
            zJ = er0Var.j();
            i6 = 2 - (zJ ? 1 : 0);
            int i22 = iL10 * i6;
            if (!zJ) {
                er0Var.w();
            }
            er0Var.w();
            i7 = iL9 * 16;
            i8 = i22 * 16;
            if (er0Var.j()) {
                int iL11 = er0Var.l();
                int iL12 = er0Var.l();
                int iL13 = er0Var.l();
                int iL14 = er0Var.l();
                if (iL == 0) {
                    i14 = 1;
                } else {
                    if (iL == 3) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    if (iL == 1) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    i6 *= i15;
                }
                i7 -= (iL11 + iL12) * i14;
                i8 -= (iL13 + iL14) * i6;
            }
            int i23 = i8;
            int i24 = i7;
            int i25 = iK4;
            iL4 = ((i25 != 44 || i25 == 86 || i25 == 100 || i25 == 110 || i25 == 122 || i25 == 244) && (iK5 & 16) != 0) ? 0 : i4;
            iF = -1;
            f2 = 1.0f;
            if (er0Var.j()) {
                if (!er0Var.j()) {
                    iK = er0Var.k(8);
                    if (iK == 255) {
                        int i26 = i4;
                        iK2 = er0Var.k(i26);
                        iK3 = er0Var.k(i26);
                        if (iK2 != 0 && iK3 != 0) {
                            f2 = iK2 / iK3;
                        }
                    } else if (iK < 17) {
                        f2 = E[iK];
                    } else {
                        kv2.w(iK, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (er0Var.j()) {
                    er0Var.w();
                }
                if (er0Var.j()) {
                    er0Var.x(3);
                    if (er0Var.j()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (er0Var.j()) {
                        int iK7 = er0Var.k(8);
                        int iK8 = er0Var.k(8);
                        er0Var.x(8);
                        iF = e82.f(iK7);
                        iG = e82.g(iK8);
                    } else {
                        iG = -1;
                    }
                } else {
                    i13 = -1;
                    iG = -1;
                }
                if (er0Var.j()) {
                    er0Var.l();
                    er0Var.l();
                }
                if (er0Var.j()) {
                    er0Var.x(65);
                }
                zJ2 = er0Var.j();
                if (zJ2) {
                    X(er0Var);
                }
                zJ3 = er0Var.j();
                if (zJ3) {
                    X(er0Var);
                }
                if (zJ2 || zJ3) {
                    er0Var.w();
                }
                er0Var.w();
                if (er0Var.j()) {
                    er0Var.w();
                    er0Var.l();
                    er0Var.l();
                    er0Var.l();
                    er0Var.l();
                    iL4 = er0Var.l();
                    er0Var.l();
                }
                f3 = f2;
                i12 = iF;
                i10 = i13;
                i11 = iG;
                i9 = iL4;
            } else {
                iL7 = iL7;
                i9 = iL4;
                i10 = -1;
                i11 = -1;
                f3 = 1.0f;
                i12 = -1;
            }
            return new s99(i25, iK5, iK6, iL5, i24, i23, f3, i5, iL2, z2, zJ, iL7, iL8, iL3, z3, i12, i10, i11, i9);
        }
        iL3 = er0Var.l() + 4;
        z3 = false;
        er0Var.l();
        er0Var.w();
        int iL15 = er0Var.l() + 1;
        int iL16 = er0Var.l() + 1;
        zJ = er0Var.j();
        i6 = 2 - (zJ ? 1 : 0);
        int i27 = iL16 * i6;
        if (!zJ) {
            er0Var.w();
        }
        er0Var.w();
        i7 = iL15 * 16;
        i8 = i27 * 16;
        if (er0Var.j()) {
            int iL17 = er0Var.l();
            int iL18 = er0Var.l();
            int iL19 = er0Var.l();
            int iL110 = er0Var.l();
            if (iL == 0) {
                i14 = 1;
            } else {
                if (iL == 3) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                if (iL == 1) {
                    i15 = 2;
                } else {
                    i15 = 1;
                }
                i6 *= i15;
            }
            i7 -= (iL17 + iL18) * i14;
            i8 -= (iL19 + iL110) * i6;
        }
        int i28 = i8;
        int i29 = i7;
        int i210 = iK4;
        if (i210 != 44) {
        }
        iF = -1;
        f2 = 1.0f;
        if (er0Var.j()) {
            if (!er0Var.j()) {
                iK = er0Var.k(8);
                if (iK == 255) {
                    int i211 = i4;
                    iK2 = er0Var.k(i211);
                    iK3 = er0Var.k(i211);
                    if (iK2 != 0) {
                        f2 = iK2 / iK3;
                    }
                } else if (iK < 17) {
                    f2 = E[iK];
                } else {
                    kv2.w(iK, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (er0Var.j()) {
                er0Var.w();
            }
            if (er0Var.j()) {
                er0Var.x(3);
                if (er0Var.j()) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (er0Var.j()) {
                    int iK9 = er0Var.k(8);
                    int iK10 = er0Var.k(8);
                    er0Var.x(8);
                    iF = e82.f(iK9);
                    iG = e82.g(iK10);
                } else {
                    iG = -1;
                }
            } else {
                i13 = -1;
                iG = -1;
            }
            if (er0Var.j()) {
                er0Var.l();
                er0Var.l();
            }
            if (er0Var.j()) {
                er0Var.x(65);
            }
            zJ2 = er0Var.j();
            if (zJ2) {
                X(er0Var);
            }
            zJ3 = er0Var.j();
            if (zJ3) {
                X(er0Var);
            }
            if (zJ2) {
                er0Var.w();
            } else {
                er0Var.w();
            }
            er0Var.w();
            if (er0Var.j()) {
                er0Var.w();
                er0Var.l();
                er0Var.l();
                er0Var.l();
                er0Var.l();
                iL4 = er0Var.l();
                er0Var.l();
            }
            f3 = f2;
            i12 = iF;
            i10 = i13;
            i11 = iG;
            i9 = iL4;
        } else {
            iL7 = iL7;
            i9 = iL4;
            i10 = -1;
            i11 = -1;
            f3 = 1.0f;
            i12 = -1;
        }
        return new s99(i210, iK5, iK6, iL5, i29, i28, f3, i5, iL2, z2, zJ, iL7, iL8, iL3, z3, i12, i10, i11, i9);
    }

    public static String R(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z2 = (i4 & 4) == 0;
        str.getClass();
        int iCharCount = i2;
        while (iCharCount < i3) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                f41 f41Var = new f41();
                f41Var.m1(i2, iCharCount, str);
                while (iCharCount < i3) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i5 = iCharCount + 2) < i3) {
                        int iM = ieg.m(str.charAt(iCharCount + 1));
                        int iM2 = ieg.m(str.charAt(i5));
                        if (iM == -1 || iM2 == -1) {
                            f41Var.o1(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            f41Var.i1((iM << 4) + iM2);
                            iCharCount = Character.charCount(iCodePointAt) + i5;
                        }
                    } else if (iCodePointAt == 43 && z2) {
                        f41Var.i1(32);
                        iCharCount++;
                    } else {
                        f41Var.o1(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return f41Var.a1();
            }
            iCharCount++;
        }
        return str.substring(i2, i3);
    }

    public static final mp7 S(kya kyaVar, u99 u99Var) {
        u99Var.getClass();
        String strD = D(u99Var, kyaVar.q());
        List<iya> listP = kyaVar.p();
        listP.getClass();
        ArrayList arrayList = new ArrayList();
        for (iya iyaVar : listP) {
            hya hyaVarO = iyaVar.o();
            hyaVarO.getClass();
            gq7 gq7VarT = T(hyaVarO, u99Var);
            iy9 iy9Var = gq7VarT != null ? new iy9(u99Var.getString(iyaVar.n()), gq7VarT) : null;
            if (iy9Var != null) {
                arrayList.add(iy9Var);
            }
        }
        return new mp7(strD, bm8.W(arrayList));
    }

    public static final gq7 T(hya hyaVar, u99 u99Var) {
        u99Var.getClass();
        if (oi5.S.e(hyaVar.F()).booleanValue()) {
            gya gyaVarJ = hyaVar.J();
            int i2 = gyaVarJ != null ? udb.a[gyaVarJ.ordinal()] : -1;
            if (i2 == 1) {
                return new cq7((byte) hyaVar.H());
            }
            if (i2 == 2) {
                return new fq7((short) hyaVar.H());
            }
            if (i2 == 3) {
                return new dq7((int) hyaVar.H());
            }
            if (i2 == 4) {
                return new eq7(hyaVar.H());
            }
            cva.k(hyaVar.J(), "Cannot read value of unsigned type: ");
            return null;
        }
        gya gyaVarJ2 = hyaVar.J();
        switch (gyaVarJ2 != null ? udb.a[gyaVarJ2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                ap.c();
                return null;
            case 1:
                return new rp7((byte) hyaVar.H());
            case 2:
                return new aq7((short) hyaVar.H());
            case 3:
                return new wp7((int) hyaVar.H());
            case 4:
                return new zp7(hyaVar.H());
            case 5:
                return new sp7((char) hyaVar.H());
            case 6:
                return new vp7(hyaVar.G());
            case 7:
                return new tp7(hyaVar.D());
            case 8:
                return new qp7(hyaVar.H() != 0);
            case 9:
                return new bq7(u99Var.getString(hyaVar.I()));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                String strD = D(u99Var, hyaVar.C());
                return hyaVar.z() == 0 ? new xp7(strD) : new op7(strD, hyaVar.z());
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new up7(D(u99Var, hyaVar.C()), u99Var.getString(hyaVar.E()));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                kya kyaVarX = hyaVar.x();
                kyaVarX.getClass();
                return new np7(S(kyaVarX, u99Var));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                List<hya> listB = hyaVar.B();
                listB.getClass();
                ArrayList arrayList = new ArrayList();
                for (hya hyaVar2 : listB) {
                    hyaVar2.getClass();
                    gq7 gq7VarT = T(hyaVar2, u99Var);
                    if (gq7VarT != null) {
                        arrayList.add(gq7VarT);
                    }
                }
                return new pp7(arrayList);
        }
    }

    public static final a77 U(hkb hkbVar) {
        return new a77(Math.round(hkbVar.a), Math.round(hkbVar.b), Math.round(hkbVar.c), Math.round(hkbVar.d));
    }

    public static final j09 V(j09 j09Var, boolean z2, t69 t69Var, r17 r17Var, boolean z3, i5c i5cVar, x16 x16Var) {
        j09 j09VarD;
        if (r17Var != null) {
            j09VarD = new fuc(z2, t69Var, r17Var, false, z3, i5cVar, x16Var);
        } else if (r17Var == null) {
            j09VarD = new fuc(z2, t69Var, null, false, z3, i5cVar, x16Var);
        } else {
            g09 g09Var = g09.a;
            j09VarD = t69Var != null ? o17.a(g09Var, t69Var, r17Var).D(new fuc(z2, t69Var, null, false, z3, i5cVar, x16Var)) : m93.u(g09Var, new huc(r17Var, z2, z3, i5cVar, x16Var, 0));
        }
        return j09Var.D(j09VarD);
    }

    public static j09 W(j09 j09Var, boolean z2, boolean z3, i5c i5cVar, x16 x16Var, int i2) {
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        return j09Var.D(new fuc(z2, null, null, true, z3, i5cVar, x16Var));
    }

    public static void X(er0 er0Var) {
        int iL = er0Var.l() + 1;
        er0Var.x(8);
        for (int i2 = 0; i2 < iL; i2++) {
            er0Var.l();
            er0Var.l();
            er0Var.w();
        }
        er0Var.x(20);
    }

    public static final JSONObject Y(LinkedHashMap linkedHashMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Collection) {
                value = new JSONArray((Collection) value);
            }
            jSONObject.put(str, value);
        }
        return jSONObject;
    }

    public static final nm7 Z(u09 u09Var) {
        Class clsQ = sqf.q(u09Var);
        nm7 nm7Var = (nm7) (clsQ != null ? job.a.b(clsQ) : null);
        if (nm7Var != null) {
            return nm7Var;
        }
        yg5.t(u09Var.k(), "Type parameter container is not resolved: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0226  */
    /* JADX WARN: Code duplicated, block: B:101:0x022a  */
    /* JADX WARN: Code duplicated, block: B:104:0x025d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0261  */
    /* JADX WARN: Code duplicated, block: B:108:0x0274  */
    /* JADX WARN: Code duplicated, block: B:109:0x0286  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:113:0x02da  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:119:0x0326  */
    /* JADX WARN: Code duplicated, block: B:122:0x0331  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX WARN: Code duplicated, block: B:84:0x015b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0161  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fd  */
    public static final void a(final j09 j09Var, final long j2, final Integer num, Integer num2, final x01 x01Var, dd2 dd2Var, final dd2 dd2Var2, l46 l46Var, final int i2, final int i3) {
        int i4;
        Integer num3;
        int i5;
        final int i6;
        boolean z2;
        final Integer num4;
        l46 l46Var2;
        ojb ojbVarV;
        Integer num5;
        pr4 pr4Var;
        x01 x01Var2;
        final sw3 sw3Var;
        boolean zD;
        boolean z3;
        Object obj;
        r66 r66Var;
        lx0 lx0Var;
        g09 g09Var;
        boolean z4;
        ov7 ov7Var;
        jx0 jx0Var;
        int iOrdinal;
        d31 d31Var;
        boolean z5;
        g09 g09Var2;
        int i7;
        l46 l46Var3;
        lx0 lx0Var2;
        l46 l46Var4;
        final sw3 sw3Var2;
        boolean zD2;
        Object objR;
        Object obj2;
        int i8;
        int i9;
        int iOrdinal2;
        int i10;
        final dd2 dd2Var3 = dd2Var;
        l46Var.h0(737958862);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.f(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.g(num) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i11 = i3 & 8;
        if (i11 == 0) {
            if ((i2 & 3072) == 0) {
                num3 = num2;
                i4 |= l46Var.g(num3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i2 & 24576) == 0) {
                if (x01Var == null) {
                    iOrdinal2 = -1;
                } else {
                    iOrdinal2 = x01Var.ordinal();
                }
                if (l46Var.e(iOrdinal2)) {
                    i10 = 16384;
                } else {
                    i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i10;
            }
            if ((196608 & i2) == 0) {
                if (l46Var.i(dd2Var3)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            if ((1572864 & i2) == 0) {
                if (l46Var.i(dd2Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i5 = i4;
            i6 = 1;
            if ((i5 & 599187) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i5 & 1, z2)) {
                if (i11 != 0) {
                    num5 = null;
                } else {
                    num5 = num3;
                }
                pr4Var = zg2.h;
                sw3 sw3Var3 = (sw3) l46Var.k(pr4Var);
                i8c i8cVar = sf2.a;
                x01Var2 = x01.a;
                if (x01Var == x01Var2) {
                    l46Var.f0(508874503);
                    sw3Var2 = (sw3) l46Var.k(pr4Var);
                    zD2 = l46Var.d(27.0f) | l46Var.g(sw3Var2);
                    objR = l46Var.R();
                    if (zD2 || objR == i8cVar) {
                        obj2 = objR;
                        n26 n26Var = new n26() { // from class: a11
                            @Override // defpackage.n26
                            public final Object m(Object obj3, Object obj4, Object obj5) {
                                int i12 = i6;
                                wef wefVar = wef.a;
                                sw3 sw3Var4 = sw3Var2;
                                switch (i12) {
                                    case 0:
                                        zt ztVar = (zt) obj3;
                                        ald aldVar = (ald) obj4;
                                        ztVar.getClass();
                                        ((cv7) obj5).getClass();
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (aldVar.a >> 32));
                                        float fP0 = sw3Var4.p0(54.0f);
                                        float fP1 = sw3Var4.p0(27.0f);
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L);
                                        float f2 = fP1 * 0.3f;
                                        float f3 = fP1 + f2;
                                        ztVar.h(fP0, f3);
                                        float f4 = (((fIntBitsToFloat - ((fIntBitsToFloat / 2.0f) - (fP0 * 2.0f))) - (3.0f * fP0)) - fP1) + fP0;
                                        ztVar.g(f4, f3);
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP1)) << 32) | (((long) Float.floatToRawIntBits(fP1)) & 4294967295L)), 90.0f, -90.0f, false);
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4 + fP1)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 180.0f, 90.0f, false);
                                        float f5 = fIntBitsToFloat - fP0;
                                        ztVar.g(f5, 0.0f);
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 270.0f, 90.0f, false);
                                        int i13 = (int) (aldVar.a & 4294967295L);
                                        ztVar.g(fIntBitsToFloat, Float.intBitsToFloat(i13) - fP0);
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 0.0f, 90.0f, false);
                                        ztVar.g(fP0, Float.intBitsToFloat(i13));
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 90.0f, 90.0f, false);
                                        ztVar.g(0.0f, fP0);
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 180.0f, 90.0f, false);
                                        ztVar.e();
                                        break;
                                    default:
                                        zt ztVar2 = (zt) obj3;
                                        ald aldVar2 = (ald) obj4;
                                        ztVar2.getClass();
                                        ((cv7) obj5).getClass();
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (aldVar2.a >> 32));
                                        float fP2 = sw3Var4.p0(54.0f);
                                        float fP3 = sw3Var4.p0(27.0f);
                                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L);
                                        float f6 = fP3 * 0.3f;
                                        ztVar2.h(fP2, 0.0f);
                                        float f7 = ((fIntBitsToFloat2 / 2.0f) - (fP2 * 2.0f)) + fP2;
                                        ztVar2.g(f7, 0.0f);
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7 + fP2)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(fP3)) << 32) | (((long) Float.floatToRawIntBits(fP3)) & 4294967295L)), 180.0f, -90.0f, false);
                                        float f8 = fIntBitsToFloat2 - fP2;
                                        float f9 = fP3 + f6;
                                        ztVar2.g(f8, f9);
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                        int i14 = (int) (aldVar2.a & 4294967295L);
                                        ztVar2.g(fIntBitsToFloat2, Float.intBitsToFloat(i14) - fP2);
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 0.0f, 90.0f, false);
                                        ztVar2.g(fP2, Float.intBitsToFloat(i14));
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 90.0f, 90.0f, false);
                                        ztVar2.g(0.0f, fP2);
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 180.0f, 90.0f, false);
                                        ztVar2.e();
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        l46Var.p0(n26Var);
                        obj2 = n26Var;
                    }
                    r66 r66Var2 = new r66((n26) obj2);
                    l46Var.r(false);
                    r66Var = r66Var2;
                    z3 = false;
                } else {
                    l46Var.f0(508876517);
                    sw3Var = (sw3) l46Var.k(pr4Var);
                    zD = l46Var.d(27.0f) | l46Var.g(sw3Var);
                    Object objR2 = l46Var.R();
                    if (!zD || objR2 == i8cVar) {
                        z3 = false;
                        final boolean z6 = false ? 1 : 0;
                        n26 n26Var2 = new n26() { // from class: a11
                            @Override // defpackage.n26
                            public final Object m(Object obj3, Object obj4, Object obj5) {
                                int i12 = z6;
                                wef wefVar = wef.a;
                                sw3 sw3Var4 = sw3Var;
                                switch (i12) {
                                    case 0:
                                        zt ztVar = (zt) obj3;
                                        ald aldVar = (ald) obj4;
                                        ztVar.getClass();
                                        ((cv7) obj5).getClass();
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (aldVar.a >> 32));
                                        float fP0 = sw3Var4.p0(54.0f);
                                        float fP1 = sw3Var4.p0(27.0f);
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L);
                                        float f2 = fP1 * 0.3f;
                                        float f3 = fP1 + f2;
                                        ztVar.h(fP0, f3);
                                        float f4 = (((fIntBitsToFloat - ((fIntBitsToFloat / 2.0f) - (fP0 * 2.0f))) - (3.0f * fP0)) - fP1) + fP0;
                                        ztVar.g(f4, f3);
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP1)) << 32) | (((long) Float.floatToRawIntBits(fP1)) & 4294967295L)), 90.0f, -90.0f, false);
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4 + fP1)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 180.0f, 90.0f, false);
                                        float f5 = fIntBitsToFloat - fP0;
                                        ztVar.g(f5, 0.0f);
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 270.0f, 90.0f, false);
                                        int i13 = (int) (aldVar.a & 4294967295L);
                                        ztVar.g(fIntBitsToFloat, Float.intBitsToFloat(i13) - fP0);
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 0.0f, 90.0f, false);
                                        ztVar.g(fP0, Float.intBitsToFloat(i13));
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 90.0f, 90.0f, false);
                                        ztVar.g(0.0f, fP0);
                                        ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 180.0f, 90.0f, false);
                                        ztVar.e();
                                        break;
                                    default:
                                        zt ztVar2 = (zt) obj3;
                                        ald aldVar2 = (ald) obj4;
                                        ztVar2.getClass();
                                        ((cv7) obj5).getClass();
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (aldVar2.a >> 32));
                                        float fP2 = sw3Var4.p0(54.0f);
                                        float fP3 = sw3Var4.p0(27.0f);
                                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L);
                                        float f6 = fP3 * 0.3f;
                                        ztVar2.h(fP2, 0.0f);
                                        float f7 = ((fIntBitsToFloat2 / 2.0f) - (fP2 * 2.0f)) + fP2;
                                        ztVar2.g(f7, 0.0f);
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7 + fP2)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(fP3)) << 32) | (((long) Float.floatToRawIntBits(fP3)) & 4294967295L)), 180.0f, -90.0f, false);
                                        float f8 = fIntBitsToFloat2 - fP2;
                                        float f9 = fP3 + f6;
                                        ztVar2.g(f8, f9);
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                        int i14 = (int) (aldVar2.a & 4294967295L);
                                        ztVar2.g(fIntBitsToFloat2, Float.intBitsToFloat(i14) - fP2);
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 0.0f, 90.0f, false);
                                        ztVar2.g(fP2, Float.intBitsToFloat(i14));
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 90.0f, 90.0f, false);
                                        ztVar2.g(0.0f, fP2);
                                        ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 180.0f, 90.0f, false);
                                        ztVar2.e();
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        l46Var.p0(n26Var2);
                        obj = n26Var2;
                    } else {
                        z3 = false;
                        obj = objR2;
                    }
                    r66Var = new r66((n26) obj);
                    l46Var.r(z3);
                }
                lx0Var = ndb.b;
                xn8 xn8VarC = s21.c(lx0Var, z3);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                g09Var = g09.a;
                j09 j09VarJ = m93.J(l46Var, g09Var);
                lf2.q.getClass();
                l46Var.j0();
                z4 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z4) {
                    l46Var.l(ov7Var);
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
                j09 j09VarN = tm7.n(tm7.o(oa7.E(j09Var, r66Var), ((e8b) l46Var.k(l8b.a)).a, g21.f), gec.N(sw3Var3.p0(64.0f), 10, t72.I(new y72(j2), new y72(y72.j))), null, 6);
                jx0Var = ndb.Y;
                c92 c92VarA = a92.a(xc0.c, jx0Var, l46Var, 0);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarN);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, c92VarA);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                j09 j09VarC = b.c(g09Var, 0.5f);
                iOrdinal = x01Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        ap.c();
                        return;
                    }
                    jx0Var = ndb.E0;
                }
                j09 j09VarD = j09VarC.D(new mq6(jx0Var));
                xn8 xn8VarC2 = s21.c(ndb.f, false);
                int iHashCode3 = Long.hashCode(l46Var.T);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, j09VarD);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, xn8VarC2);
                dec.l(he2Var2, l46Var, u8aVarM3);
                ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ3);
                dd2Var3 = dd2Var;
                tec.q((i5 >> 15) & 14, dd2Var3, l46Var, true);
                xn8 xn8VarC3 = s21.c(lx0Var, false);
                int iHashCode4 = Long.hashCode(l46Var.T);
                u8a u8aVarM4 = l46Var.m();
                j09 j09VarJ4 = m93.J(l46Var, g09Var);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, xn8VarC3);
                dec.l(he2Var2, l46Var, u8aVarM4);
                ib8.s(iHashCode4, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ4);
                d31Var = d31.a;
                if (num5 == null) {
                    l46Var.f0(-65898310);
                    l46Var.r(false);
                    l46Var3 = l46Var;
                    g09Var2 = g09Var;
                    z5 = false;
                    i7 = 2;
                } else {
                    l46Var.f0(-65898309);
                    z5 = false;
                    g09Var2 = g09Var;
                    i7 = 2;
                    feg.j(od4.A(num5.intValue(), (i5 >> 9) & 14, l46Var), null, d31Var.b(g09Var), null, an2.g, 0.0f, null, l46Var, 24632, 104);
                    l46 l46Var5 = l46Var;
                    l46Var5.r(false);
                    l46Var3 = l46Var5;
                }
                dd2Var2.z(l46Var3, Integer.valueOf((i5 >> 18) & 14));
                l46Var3.r(true);
                l46Var3.r(true);
                if (num == null) {
                    l46Var3.f0(2042227592);
                    l46Var3.r(z5);
                    l46Var4 = l46Var3;
                } else {
                    l46Var3.f0(2042227593);
                    if (x01Var == x01Var2) {
                        lx0Var2 = ndb.d;
                    } else {
                        lx0Var2 = lx0Var;
                    }
                    l46 l46Var6 = l46Var3;
                    feg.j(od4.A(num.intValue(), (i5 >> 6) & 14, l46Var3), null, b.l(tm7.N(0.0f, -24.0f, ynb.b0(24.0f, 0.0f, d31Var.a(g09Var2, lx0Var2), i7), 1), 100.0f), null, null, 0.0f, null, l46Var6, 56, 120);
                    l46 l46Var7 = l46Var6;
                    l46Var7.r(z5);
                    l46Var4 = l46Var7;
                }
                l46Var4.r(true);
                num4 = num5;
                l46Var2 = l46Var4;
            } else {
                l46 l46Var8 = l46Var;
                l46Var8.Z();
                num4 = num3;
                l46Var2 = l46Var8;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: z01
                    @Override // defpackage.l26
                    public final Object z(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        n16.a(j09Var, j2, num, num4, x01Var, dd2Var3, dd2Var2, (l46) obj3, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 3072;
        num3 = num2;
        if ((i2 & 24576) == 0) {
            if (x01Var == null) {
                iOrdinal2 = -1;
            } else {
                iOrdinal2 = x01Var.ordinal();
            }
            if (l46Var.e(iOrdinal2)) {
                i10 = 16384;
            } else {
                i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i4 |= i10;
        }
        if ((196608 & i2) == 0) {
            if (l46Var.i(dd2Var3)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i4 |= i9;
        }
        if ((1572864 & i2) == 0) {
            if (l46Var.i(dd2Var2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i4 |= i8;
        }
        i5 = i4;
        i6 = 1;
        if ((i5 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i5 & 1, z2)) {
            if (i11 != 0) {
                num5 = null;
            } else {
                num5 = num3;
            }
            pr4Var = zg2.h;
            sw3 sw3Var4 = (sw3) l46Var.k(pr4Var);
            i8c i8cVar2 = sf2.a;
            x01Var2 = x01.a;
            if (x01Var == x01Var2) {
                l46Var.f0(508874503);
                sw3Var2 = (sw3) l46Var.k(pr4Var);
                zD2 = l46Var.d(27.0f) | l46Var.g(sw3Var2);
                objR = l46Var.R();
                if (zD2) {
                    obj2 = objR;
                    n26 n26Var3 = new n26() { // from class: a11
                        @Override // defpackage.n26
                        public final Object m(Object obj3, Object obj4, Object obj5) {
                            int i12 = i6;
                            wef wefVar = wef.a;
                            sw3 sw3Var5 = sw3Var2;
                            switch (i12) {
                                case 0:
                                    zt ztVar = (zt) obj3;
                                    ald aldVar = (ald) obj4;
                                    ztVar.getClass();
                                    ((cv7) obj5).getClass();
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (aldVar.a >> 32));
                                    float fP0 = sw3Var5.p0(54.0f);
                                    float fP1 = sw3Var5.p0(27.0f);
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L);
                                    float f2 = fP1 * 0.3f;
                                    float f3 = fP1 + f2;
                                    ztVar.h(fP0, f3);
                                    float f4 = (((fIntBitsToFloat - ((fIntBitsToFloat / 2.0f) - (fP0 * 2.0f))) - (3.0f * fP0)) - fP1) + fP0;
                                    ztVar.g(f4, f3);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP1)) << 32) | (((long) Float.floatToRawIntBits(fP1)) & 4294967295L)), 90.0f, -90.0f, false);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4 + fP1)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 180.0f, 90.0f, false);
                                    float f5 = fIntBitsToFloat - fP0;
                                    ztVar.g(f5, 0.0f);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 270.0f, 90.0f, false);
                                    int i13 = (int) (aldVar.a & 4294967295L);
                                    ztVar.g(fIntBitsToFloat, Float.intBitsToFloat(i13) - fP0);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 0.0f, 90.0f, false);
                                    ztVar.g(fP0, Float.intBitsToFloat(i13));
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 90.0f, 90.0f, false);
                                    ztVar.g(0.0f, fP0);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 180.0f, 90.0f, false);
                                    ztVar.e();
                                    break;
                                default:
                                    zt ztVar2 = (zt) obj3;
                                    ald aldVar2 = (ald) obj4;
                                    ztVar2.getClass();
                                    ((cv7) obj5).getClass();
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (aldVar2.a >> 32));
                                    float fP2 = sw3Var5.p0(54.0f);
                                    float fP3 = sw3Var5.p0(27.0f);
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L);
                                    float f6 = fP3 * 0.3f;
                                    ztVar2.h(fP2, 0.0f);
                                    float f7 = ((fIntBitsToFloat2 / 2.0f) - (fP2 * 2.0f)) + fP2;
                                    ztVar2.g(f7, 0.0f);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7 + fP2)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(fP3)) << 32) | (((long) Float.floatToRawIntBits(fP3)) & 4294967295L)), 180.0f, -90.0f, false);
                                    float f8 = fIntBitsToFloat2 - fP2;
                                    float f9 = fP3 + f6;
                                    ztVar2.g(f8, f9);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                    int i14 = (int) (aldVar2.a & 4294967295L);
                                    ztVar2.g(fIntBitsToFloat2, Float.intBitsToFloat(i14) - fP2);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 0.0f, 90.0f, false);
                                    ztVar2.g(fP2, Float.intBitsToFloat(i14));
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 90.0f, 90.0f, false);
                                    ztVar2.g(0.0f, fP2);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 180.0f, 90.0f, false);
                                    ztVar2.e();
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(n26Var3);
                    obj2 = n26Var3;
                } else {
                    obj2 = objR;
                    n26 n26Var4 = new n26() { // from class: a11
                        @Override // defpackage.n26
                        public final Object m(Object obj3, Object obj4, Object obj5) {
                            int i12 = i6;
                            wef wefVar = wef.a;
                            sw3 sw3Var5 = sw3Var2;
                            switch (i12) {
                                case 0:
                                    zt ztVar = (zt) obj3;
                                    ald aldVar = (ald) obj4;
                                    ztVar.getClass();
                                    ((cv7) obj5).getClass();
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (aldVar.a >> 32));
                                    float fP0 = sw3Var5.p0(54.0f);
                                    float fP1 = sw3Var5.p0(27.0f);
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L);
                                    float f2 = fP1 * 0.3f;
                                    float f3 = fP1 + f2;
                                    ztVar.h(fP0, f3);
                                    float f4 = (((fIntBitsToFloat - ((fIntBitsToFloat / 2.0f) - (fP0 * 2.0f))) - (3.0f * fP0)) - fP1) + fP0;
                                    ztVar.g(f4, f3);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP1)) << 32) | (((long) Float.floatToRawIntBits(fP1)) & 4294967295L)), 90.0f, -90.0f, false);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4 + fP1)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 180.0f, 90.0f, false);
                                    float f5 = fIntBitsToFloat - fP0;
                                    ztVar.g(f5, 0.0f);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 270.0f, 90.0f, false);
                                    int i13 = (int) (aldVar.a & 4294967295L);
                                    ztVar.g(fIntBitsToFloat, Float.intBitsToFloat(i13) - fP0);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 0.0f, 90.0f, false);
                                    ztVar.g(fP0, Float.intBitsToFloat(i13));
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 90.0f, 90.0f, false);
                                    ztVar.g(0.0f, fP0);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 180.0f, 90.0f, false);
                                    ztVar.e();
                                    break;
                                default:
                                    zt ztVar2 = (zt) obj3;
                                    ald aldVar2 = (ald) obj4;
                                    ztVar2.getClass();
                                    ((cv7) obj5).getClass();
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (aldVar2.a >> 32));
                                    float fP2 = sw3Var5.p0(54.0f);
                                    float fP3 = sw3Var5.p0(27.0f);
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L);
                                    float f6 = fP3 * 0.3f;
                                    ztVar2.h(fP2, 0.0f);
                                    float f7 = ((fIntBitsToFloat2 / 2.0f) - (fP2 * 2.0f)) + fP2;
                                    ztVar2.g(f7, 0.0f);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7 + fP2)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(fP3)) << 32) | (((long) Float.floatToRawIntBits(fP3)) & 4294967295L)), 180.0f, -90.0f, false);
                                    float f8 = fIntBitsToFloat2 - fP2;
                                    float f9 = fP3 + f6;
                                    ztVar2.g(f8, f9);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                    int i14 = (int) (aldVar2.a & 4294967295L);
                                    ztVar2.g(fIntBitsToFloat2, Float.intBitsToFloat(i14) - fP2);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 0.0f, 90.0f, false);
                                    ztVar2.g(fP2, Float.intBitsToFloat(i14));
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 90.0f, 90.0f, false);
                                    ztVar2.g(0.0f, fP2);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 180.0f, 90.0f, false);
                                    ztVar2.e();
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(n26Var4);
                    obj2 = n26Var4;
                }
                r66 r66Var3 = new r66((n26) obj2);
                l46Var.r(false);
                r66Var = r66Var3;
                z3 = false;
            } else {
                l46Var.f0(508876517);
                sw3Var = (sw3) l46Var.k(pr4Var);
                zD = l46Var.d(27.0f) | l46Var.g(sw3Var);
                Object objR3 = l46Var.R();
                if (zD) {
                    z3 = false;
                    final int z7 = false ? 1 : 0;
                    n26 n26Var5 = new n26() { // from class: a11
                        @Override // defpackage.n26
                        public final Object m(Object obj3, Object obj4, Object obj5) {
                            int i12 = z7;
                            wef wefVar = wef.a;
                            sw3 sw3Var5 = sw3Var;
                            switch (i12) {
                                case 0:
                                    zt ztVar = (zt) obj3;
                                    ald aldVar = (ald) obj4;
                                    ztVar.getClass();
                                    ((cv7) obj5).getClass();
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (aldVar.a >> 32));
                                    float fP0 = sw3Var5.p0(54.0f);
                                    float fP1 = sw3Var5.p0(27.0f);
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L);
                                    float f2 = fP1 * 0.3f;
                                    float f3 = fP1 + f2;
                                    ztVar.h(fP0, f3);
                                    float f4 = (((fIntBitsToFloat - ((fIntBitsToFloat / 2.0f) - (fP0 * 2.0f))) - (3.0f * fP0)) - fP1) + fP0;
                                    ztVar.g(f4, f3);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP1)) << 32) | (((long) Float.floatToRawIntBits(fP1)) & 4294967295L)), 90.0f, -90.0f, false);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4 + fP1)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 180.0f, 90.0f, false);
                                    float f5 = fIntBitsToFloat - fP0;
                                    ztVar.g(f5, 0.0f);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 270.0f, 90.0f, false);
                                    int i13 = (int) (aldVar.a & 4294967295L);
                                    ztVar.g(fIntBitsToFloat, Float.intBitsToFloat(i13) - fP0);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 0.0f, 90.0f, false);
                                    ztVar.g(fP0, Float.intBitsToFloat(i13));
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 90.0f, 90.0f, false);
                                    ztVar.g(0.0f, fP0);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 180.0f, 90.0f, false);
                                    ztVar.e();
                                    break;
                                default:
                                    zt ztVar2 = (zt) obj3;
                                    ald aldVar2 = (ald) obj4;
                                    ztVar2.getClass();
                                    ((cv7) obj5).getClass();
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (aldVar2.a >> 32));
                                    float fP2 = sw3Var5.p0(54.0f);
                                    float fP3 = sw3Var5.p0(27.0f);
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L);
                                    float f6 = fP3 * 0.3f;
                                    ztVar2.h(fP2, 0.0f);
                                    float f7 = ((fIntBitsToFloat2 / 2.0f) - (fP2 * 2.0f)) + fP2;
                                    ztVar2.g(f7, 0.0f);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7 + fP2)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(fP3)) << 32) | (((long) Float.floatToRawIntBits(fP3)) & 4294967295L)), 180.0f, -90.0f, false);
                                    float f8 = fIntBitsToFloat2 - fP2;
                                    float f9 = fP3 + f6;
                                    ztVar2.g(f8, f9);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                    int i14 = (int) (aldVar2.a & 4294967295L);
                                    ztVar2.g(fIntBitsToFloat2, Float.intBitsToFloat(i14) - fP2);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 0.0f, 90.0f, false);
                                    ztVar2.g(fP2, Float.intBitsToFloat(i14));
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 90.0f, 90.0f, false);
                                    ztVar2.g(0.0f, fP2);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 180.0f, 90.0f, false);
                                    ztVar2.e();
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(n26Var5);
                    obj = n26Var5;
                } else {
                    z3 = false;
                    final int z8 = false ? 1 : 0;
                    n26 n26Var6 = new n26() { // from class: a11
                        @Override // defpackage.n26
                        public final Object m(Object obj3, Object obj4, Object obj5) {
                            int i12 = z8;
                            wef wefVar = wef.a;
                            sw3 sw3Var5 = sw3Var;
                            switch (i12) {
                                case 0:
                                    zt ztVar = (zt) obj3;
                                    ald aldVar = (ald) obj4;
                                    ztVar.getClass();
                                    ((cv7) obj5).getClass();
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (aldVar.a >> 32));
                                    float fP0 = sw3Var5.p0(54.0f);
                                    float fP1 = sw3Var5.p0(27.0f);
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L);
                                    float f2 = fP1 * 0.3f;
                                    float f3 = fP1 + f2;
                                    ztVar.h(fP0, f3);
                                    float f4 = (((fIntBitsToFloat - ((fIntBitsToFloat / 2.0f) - (fP0 * 2.0f))) - (3.0f * fP0)) - fP1) + fP0;
                                    ztVar.g(f4, f3);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP1)) << 32) | (((long) Float.floatToRawIntBits(fP1)) & 4294967295L)), 90.0f, -90.0f, false);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f4 + fP1)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 180.0f, 90.0f, false);
                                    float f5 = fIntBitsToFloat - fP0;
                                    ztVar.g(f5, 0.0f);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits), 270.0f, 90.0f, false);
                                    int i13 = (int) (aldVar.a & 4294967295L);
                                    ztVar.g(fIntBitsToFloat, Float.intBitsToFloat(i13) - fP0);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 0.0f, 90.0f, false);
                                    ztVar.g(fP0, Float.intBitsToFloat(i13));
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fP0)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 90.0f, 90.0f, false);
                                    ztVar.g(0.0f, fP0);
                                    ztVar.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L)), 180.0f, 90.0f, false);
                                    ztVar.e();
                                    break;
                                default:
                                    zt ztVar2 = (zt) obj3;
                                    ald aldVar2 = (ald) obj4;
                                    ztVar2.getClass();
                                    ((cv7) obj5).getClass();
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (aldVar2.a >> 32));
                                    float fP2 = sw3Var5.p0(54.0f);
                                    float fP3 = sw3Var5.p0(27.0f);
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L);
                                    float f6 = fP3 * 0.3f;
                                    ztVar2.h(fP2, 0.0f);
                                    float f7 = ((fIntBitsToFloat2 / 2.0f) - (fP2 * 2.0f)) + fP2;
                                    ztVar2.g(f7, 0.0f);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f7 + fP2)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(fP3)) << 32) | (((long) Float.floatToRawIntBits(fP3)) & 4294967295L)), 180.0f, -90.0f, false);
                                    float f8 = fIntBitsToFloat2 - fP2;
                                    float f9 = fP3 + f6;
                                    ztVar2.g(f8, f9);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), jFloatToRawIntBits2), 270.0f, 90.0f, false);
                                    int i14 = (int) (aldVar2.a & 4294967295L);
                                    ztVar2.g(fIntBitsToFloat2, Float.intBitsToFloat(i14) - fP2);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 0.0f, 90.0f, false);
                                    ztVar2.g(fP2, Float.intBitsToFloat(i14));
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) - fP2)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 90.0f, 90.0f, false);
                                    ztVar2.g(0.0f, fP2);
                                    ztVar2.d(z5c.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L)), 180.0f, 90.0f, false);
                                    ztVar2.e();
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(n26Var6);
                    obj = n26Var6;
                }
                r66Var = new r66((n26) obj);
                l46Var.r(z3);
            }
            lx0Var = ndb.b;
            xn8 xn8VarC4 = s21.c(lx0Var, z3);
            int iHashCode5 = Long.hashCode(l46Var.T);
            u8a u8aVarM5 = l46Var.m();
            g09Var = g09.a;
            j09 j09VarJ5 = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            z4 = l46Var.S;
            ov7Var = LayoutNode.h1;
            if (z4) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var5 = hj6.z;
            dec.l(he2Var5, l46Var, xn8VarC4);
            he2 he2Var6 = hj6.y;
            dec.l(he2Var6, l46Var, u8aVarM5);
            Integer numValueOf2 = Integer.valueOf(iHashCode5);
            he2 he2Var7 = hj6.X;
            dec.l(he2Var7, l46Var, numValueOf2);
            dec.k(l46Var);
            he2 he2Var8 = hj6.x;
            dec.l(he2Var8, l46Var, j09VarJ5);
            j09 j09VarN2 = tm7.n(tm7.o(oa7.E(j09Var, r66Var), ((e8b) l46Var.k(l8b.a)).a, g21.f), gec.N(sw3Var4.p0(64.0f), 10, t72.I(new y72(j2), new y72(y72.j))), null, 6);
            jx0Var = ndb.Y;
            c92 c92VarA2 = a92.a(xc0.c, jx0Var, l46Var, 0);
            int iHashCode6 = Long.hashCode(l46Var.T);
            u8a u8aVarM6 = l46Var.m();
            j09 j09VarJ6 = m93.J(l46Var, j09VarN2);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var5, l46Var, c92VarA2);
            dec.l(he2Var6, l46Var, u8aVarM6);
            ib8.s(iHashCode6, l46Var, he2Var7, l46Var);
            dec.l(he2Var8, l46Var, j09VarJ6);
            j09 j09VarC2 = b.c(g09Var, 0.5f);
            iOrdinal = x01Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    ap.c();
                    return;
                }
                jx0Var = ndb.E0;
            }
            j09 j09VarD2 = j09VarC2.D(new mq6(jx0Var));
            xn8 xn8VarC5 = s21.c(ndb.f, false);
            int iHashCode7 = Long.hashCode(l46Var.T);
            u8a u8aVarM7 = l46Var.m();
            j09 j09VarJ7 = m93.J(l46Var, j09VarD2);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var5, l46Var, xn8VarC5);
            dec.l(he2Var6, l46Var, u8aVarM7);
            ib8.s(iHashCode7, l46Var, he2Var7, l46Var);
            dec.l(he2Var8, l46Var, j09VarJ7);
            dd2Var3 = dd2Var;
            tec.q((i5 >> 15) & 14, dd2Var3, l46Var, true);
            xn8 xn8VarC6 = s21.c(lx0Var, false);
            int iHashCode8 = Long.hashCode(l46Var.T);
            u8a u8aVarM8 = l46Var.m();
            j09 j09VarJ8 = m93.J(l46Var, g09Var);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var5, l46Var, xn8VarC6);
            dec.l(he2Var6, l46Var, u8aVarM8);
            ib8.s(iHashCode8, l46Var, he2Var7, l46Var);
            dec.l(he2Var8, l46Var, j09VarJ8);
            d31Var = d31.a;
            if (num5 == null) {
                l46Var.f0(-65898310);
                l46Var.r(false);
                l46Var3 = l46Var;
                g09Var2 = g09Var;
                z5 = false;
                i7 = 2;
            } else {
                l46Var.f0(-65898309);
                z5 = false;
                g09Var2 = g09Var;
                i7 = 2;
                feg.j(od4.A(num5.intValue(), (i5 >> 9) & 14, l46Var), null, d31Var.b(g09Var), null, an2.g, 0.0f, null, l46Var, 24632, 104);
                l46 l46Var9 = l46Var;
                l46Var9.r(false);
                l46Var3 = l46Var9;
            }
            dd2Var2.z(l46Var3, Integer.valueOf((i5 >> 18) & 14));
            l46Var3.r(true);
            l46Var3.r(true);
            if (num == null) {
                l46Var3.f0(2042227592);
                l46Var3.r(z5);
                l46Var4 = l46Var3;
            } else {
                l46Var3.f0(2042227593);
                if (x01Var == x01Var2) {
                    lx0Var2 = ndb.d;
                } else {
                    lx0Var2 = lx0Var;
                }
                l46 l46Var10 = l46Var3;
                feg.j(od4.A(num.intValue(), (i5 >> 6) & 14, l46Var3), null, b.l(tm7.N(0.0f, -24.0f, ynb.b0(24.0f, 0.0f, d31Var.a(g09Var2, lx0Var2), i7), 1), 100.0f), null, null, 0.0f, null, l46Var10, 56, 120);
                l46 l46Var11 = l46Var10;
                l46Var11.r(z5);
                l46Var4 = l46Var11;
            }
            l46Var4.r(true);
            num4 = num5;
            l46Var2 = l46Var4;
        } else {
            l46 l46Var12 = l46Var;
            l46Var12.Z();
            num4 = num3;
            l46Var2 = l46Var12;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: z01
                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    n16.a(j09Var, j2, num, num4, x01Var, dd2Var3, dd2Var2, (l46) obj3, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    public static int a0(byte[] bArr, int i2) {
        int i3;
        synchronized (F) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArrCopyOf = G;
                    if (iArrCopyOf.length <= i5) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                        G = iArrCopyOf;
                    }
                    iArrCopyOf[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = G[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void b(j09 j09Var, boolean z2, boolean z3, String str, x01 x01Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        byte b2;
        boolean z6;
        x01 x01Var2;
        boolean z7;
        boolean z8;
        String str2;
        ojb ojbVarV;
        String strQ;
        boolean z9;
        int i6;
        Integer numValueOf;
        l46Var.h0(1880146192);
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 = i2 | 48;
            z4 = z2;
        } else if ((i2 & 48) == 0) {
            z4 = z2;
            i4 = (l46Var.h(z4) ? 32 : 16) | i2;
        } else {
            z4 = z2;
            i4 = i2;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                z5 = z3;
                i4 |= l46Var.h(z5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i4 | 25600;
            b2 = 0;
            if ((74899 & i5) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i5 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0 || l46Var.C()) {
                    if (i7 != 0) {
                        z4 = true;
                    }
                    boolean z10 = i8 == 0 ? z5 : true;
                    strQ = afc.q(R.string.personality_bookmark3, l46Var);
                    x01Var2 = x01.a;
                    z9 = z10;
                } else {
                    l46Var.Z();
                    strQ = str;
                    x01Var2 = x01Var;
                    z9 = z5;
                }
                boolean z11 = z4;
                l46Var.s();
                if (g21.S(l46Var)) {
                    i6 = 449936186;
                } else {
                    i6 = 1305574202;
                }
                long jC = abg.c(i6);
                numValueOf = Integer.valueOf(R.drawable.bookmark_cp);
                if (!z9) {
                    numValueOf = null;
                }
                a(j09Var, jC, numValueOf, Integer.valueOf(R.drawable.bookmark_cp_bg), x01Var2, af1.b0(1937809688, new y01(strQ, z11, 5, b2), l46Var), dd2Var, l46Var, 1794054, 0);
                z7 = z11;
                z8 = z9;
                str2 = strQ;
            } else {
                l46Var.Z();
                x01Var2 = x01Var;
                z7 = z4;
                z8 = z5;
                str2 = str;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b11(j09Var, z7, z8, str2, x01Var2, dd2Var, i2, i3, 4);
            }
        }
        i4 |= 384;
        z5 = z3;
        i5 = i4 | 25600;
        b2 = 0;
        if ((74899 & i5) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (l46Var.W(i5 & 1, z6)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    z4 = true;
                }
                if (i8 == 0) {
                }
                strQ = afc.q(R.string.personality_bookmark3, l46Var);
                x01Var2 = x01.a;
                z9 = z10;
            } else {
                if (i7 != 0) {
                    z4 = true;
                }
                if (i8 == 0) {
                }
                strQ = afc.q(R.string.personality_bookmark3, l46Var);
                x01Var2 = x01.a;
                z9 = z10;
            }
            boolean z12 = z4;
            l46Var.s();
            if (g21.S(l46Var)) {
                i6 = 449936186;
            } else {
                i6 = 1305574202;
            }
            long jC2 = abg.c(i6);
            numValueOf = Integer.valueOf(R.drawable.bookmark_cp);
            if (!z9) {
                numValueOf = null;
            }
            a(j09Var, jC2, numValueOf, Integer.valueOf(R.drawable.bookmark_cp_bg), x01Var2, af1.b0(1937809688, new y01(strQ, z12, 5, b2), l46Var), dd2Var, l46Var, 1794054, 0);
            z7 = z12;
            z8 = z9;
            str2 = strQ;
        } else {
            l46Var.Z();
            x01Var2 = x01Var;
            z7 = z4;
            z8 = z5;
            str2 = str;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b11(j09Var, z7, z8, str2, x01Var2, dd2Var, i2, i3, 4);
        }
    }

    public static final Exception b0(String str, FileNotFoundException fileNotFoundException) {
        int i2;
        boolean zEquals = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i2 = parcelObtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i2 = 0;
            }
            Object objInvoke = method.invoke(null, "sys.user." + i2 + ".ce_available", "false");
            objInvoke.getClass();
            zEquals = ((String) objInvoke).equals("true");
        } catch (Throwable th) {
            bzd.m(fileNotFoundException, th);
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new c94(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void c(j09 j09Var, boolean z2, boolean z3, String str, x01 x01Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        boolean z4;
        int i4;
        boolean z5;
        String str2;
        int i5;
        int i6;
        int i7;
        int iOrdinal;
        int i8;
        byte b2;
        boolean z6;
        boolean z7;
        boolean z8;
        String str3;
        x01 x01Var2;
        ojb ojbVarV;
        String strQ;
        boolean z9;
        boolean z10;
        long jC;
        Integer numValueOf;
        l46Var.h0(-2027786275);
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 = i2 | 48;
            z4 = z2;
        } else if ((i2 & 48) == 0) {
            z4 = z2;
            i4 = (l46Var.h(z4) ? 32 : 16) | i2;
        } else {
            z4 = z2;
            i4 = i2;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 384) == 0) {
                z5 = z3;
                i4 |= l46Var.h(z5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i3 & 8) == 0) {
                str2 = str;
                if (l46Var.g(str2)) {
                    i5 = 2048;
                }
                i6 = i4 | i5;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i6 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    if (x01Var == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = x01Var.ordinal();
                    }
                    if (l46Var.e(iOrdinal)) {
                        i8 = 16384;
                    } else {
                        i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i6 |= i8;
                }
                b2 = 0;
                if ((74899 & i6) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (l46Var.W(i6 & 1, z6)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0 || l46Var.C()) {
                        if (i9 != 0) {
                            z4 = true;
                        }
                        boolean z11 = i10 == 0 ? z5 : true;
                        if ((i3 & 8) != 0) {
                            strQ = afc.q(R.string.personality_bookmark5, l46Var);
                            i6 &= -7169;
                        } else {
                            strQ = str2;
                        }
                        if (i7 != 0) {
                            x01Var2 = x01.a;
                        } else {
                            x01Var2 = x01Var;
                        }
                        z9 = z11;
                        z10 = z4;
                    } else {
                        l46Var.Z();
                        if ((i3 & 8) != 0) {
                            i6 &= -7169;
                        }
                        z10 = z4;
                        z9 = z5;
                        strQ = str2;
                        x01Var2 = x01Var;
                    }
                    l46Var.s();
                    if (g21.S(l46Var)) {
                        jC = abg.d(4293783039L);
                    } else {
                        jC = abg.c(1297300177);
                    }
                    numValueOf = Integer.valueOf(R.drawable.bookmark_comics);
                    if (!z9) {
                        numValueOf = null;
                    }
                    a(j09Var, jC, numValueOf, null, x01Var2, af1.b0(-1877799963, new y01(strQ, z10, 2, b2), l46Var), dd2Var, l46Var, (i6 & 57344) | 1769478, 8);
                    z7 = z10;
                    z8 = z9;
                    str3 = strQ;
                } else {
                    l46Var.Z();
                    z7 = z4;
                    z8 = z5;
                    str3 = str2;
                    x01Var2 = x01Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var2, dd2Var, i2, i3, 1);
                }
            }
            str2 = str;
            i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i6 = i4 | i5;
            i7 = i3 & 16;
            if (i7 != 0) {
                i6 |= 24576;
            } else if ((i2 & 24576) == 0) {
                if (x01Var == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = x01Var.ordinal();
                }
                if (l46Var.e(iOrdinal)) {
                    i8 = 16384;
                } else {
                    i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i6 |= i8;
            }
            b2 = 0;
            if ((74899 & i6) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i6 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        z4 = true;
                    }
                    if (i10 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark5, l46Var);
                        i6 &= -7169;
                    } else {
                        strQ = str2;
                    }
                    if (i7 != 0) {
                        x01Var2 = x01.a;
                    } else {
                        x01Var2 = x01Var;
                    }
                    z9 = z11;
                    z10 = z4;
                } else {
                    if (i9 != 0) {
                        z4 = true;
                    }
                    if (i10 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark5, l46Var);
                        i6 &= -7169;
                    } else {
                        strQ = str2;
                    }
                    if (i7 != 0) {
                        x01Var2 = x01.a;
                    } else {
                        x01Var2 = x01Var;
                    }
                    z9 = z11;
                    z10 = z4;
                }
                l46Var.s();
                if (g21.S(l46Var)) {
                    jC = abg.d(4293783039L);
                } else {
                    jC = abg.c(1297300177);
                }
                numValueOf = Integer.valueOf(R.drawable.bookmark_comics);
                if (!z9) {
                    numValueOf = null;
                }
                a(j09Var, jC, numValueOf, null, x01Var2, af1.b0(-1877799963, new y01(strQ, z10, 2, b2), l46Var), dd2Var, l46Var, (i6 & 57344) | 1769478, 8);
                z7 = z10;
                z8 = z9;
                str3 = strQ;
            } else {
                l46Var.Z();
                z7 = z4;
                z8 = z5;
                str3 = str2;
                x01Var2 = x01Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var2, dd2Var, i2, i3, 1);
            }
        }
        i4 |= 384;
        z5 = z3;
        if ((i3 & 8) == 0) {
            str2 = str;
            if (l46Var.g(str2)) {
                i5 = 2048;
            }
            i6 = i4 | i5;
            i7 = i3 & 16;
            if (i7 != 0) {
                i6 |= 24576;
            } else if ((i2 & 24576) == 0) {
                if (x01Var == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = x01Var.ordinal();
                }
                if (l46Var.e(iOrdinal)) {
                    i8 = 16384;
                } else {
                    i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i6 |= i8;
            }
            b2 = 0;
            if ((74899 & i6) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i6 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        z4 = true;
                    }
                    if (i10 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark5, l46Var);
                        i6 &= -7169;
                    } else {
                        strQ = str2;
                    }
                    if (i7 != 0) {
                        x01Var2 = x01.a;
                    } else {
                        x01Var2 = x01Var;
                    }
                    z9 = z11;
                    z10 = z4;
                } else {
                    if (i9 != 0) {
                        z4 = true;
                    }
                    if (i10 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark5, l46Var);
                        i6 &= -7169;
                    } else {
                        strQ = str2;
                    }
                    if (i7 != 0) {
                        x01Var2 = x01.a;
                    } else {
                        x01Var2 = x01Var;
                    }
                    z9 = z11;
                    z10 = z4;
                }
                l46Var.s();
                if (g21.S(l46Var)) {
                    jC = abg.d(4293783039L);
                } else {
                    jC = abg.c(1297300177);
                }
                numValueOf = Integer.valueOf(R.drawable.bookmark_comics);
                if (!z9) {
                    numValueOf = null;
                }
                a(j09Var, jC, numValueOf, null, x01Var2, af1.b0(-1877799963, new y01(strQ, z10, 2, b2), l46Var), dd2Var, l46Var, (i6 & 57344) | 1769478, 8);
                z7 = z10;
                z8 = z9;
                str3 = strQ;
            } else {
                l46Var.Z();
                z7 = z4;
                z8 = z5;
                str3 = str2;
                x01Var2 = x01Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var2, dd2Var, i2, i3, 1);
            }
        }
        str2 = str;
        i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        i6 = i4 | i5;
        i7 = i3 & 16;
        if (i7 != 0) {
            i6 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (x01Var == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = x01Var.ordinal();
            }
            if (l46Var.e(iOrdinal)) {
                i8 = 16384;
            } else {
                i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i6 |= i8;
        }
        b2 = 0;
        if ((74899 & i6) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (l46Var.W(i6 & 1, z6)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    z4 = true;
                }
                if (i10 == 0) {
                }
                if ((i3 & 8) != 0) {
                    strQ = afc.q(R.string.personality_bookmark5, l46Var);
                    i6 &= -7169;
                } else {
                    strQ = str2;
                }
                if (i7 != 0) {
                    x01Var2 = x01.a;
                } else {
                    x01Var2 = x01Var;
                }
                z9 = z11;
                z10 = z4;
            } else {
                if (i9 != 0) {
                    z4 = true;
                }
                if (i10 == 0) {
                }
                if ((i3 & 8) != 0) {
                    strQ = afc.q(R.string.personality_bookmark5, l46Var);
                    i6 &= -7169;
                } else {
                    strQ = str2;
                }
                if (i7 != 0) {
                    x01Var2 = x01.a;
                } else {
                    x01Var2 = x01Var;
                }
                z9 = z11;
                z10 = z4;
            }
            l46Var.s();
            if (g21.S(l46Var)) {
                jC = abg.d(4293783039L);
            } else {
                jC = abg.c(1297300177);
            }
            numValueOf = Integer.valueOf(R.drawable.bookmark_comics);
            if (!z9) {
                numValueOf = null;
            }
            a(j09Var, jC, numValueOf, null, x01Var2, af1.b0(-1877799963, new y01(strQ, z10, 2, b2), l46Var), dd2Var, l46Var, (i6 & 57344) | 1769478, 8);
            z7 = z10;
            z8 = z9;
            str3 = strQ;
        } else {
            l46Var.Z();
            z7 = z4;
            z8 = z5;
            str3 = str2;
            x01Var2 = x01Var;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var2, dd2Var, i2, i3, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void d(j09 j09Var, boolean z2, boolean z3, String str, x01 x01Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        byte b2;
        boolean z6;
        j09 j09Var2;
        x01 x01Var2;
        boolean z7;
        boolean z8;
        ojb ojbVarV;
        j09 j09Var3;
        boolean z9;
        x01 x01Var3;
        long jC;
        Integer numValueOf;
        l46Var.h0(-1330722793);
        int i8 = i2 | 6;
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                z4 = z2;
                i8 |= l46Var.h(z4) ? 32 : 16;
            }
            i4 = i3 & 4;
            if (i4 != 0) {
                if ((i2 & 384) == 0) {
                    z5 = z3;
                    if (l46Var.h(z5)) {
                        i5 = 256;
                    } else {
                        i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i8 |= i5;
                }
                if (l46Var.g(str)) {
                    i6 = 2048;
                } else {
                    i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i7 = i8 | i6 | 24576;
                b2 = 0;
                if ((74899 & i7) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (l46Var.W(i7 & 1, z6)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0 || l46Var.C()) {
                        if (i9 != 0) {
                            z4 = true;
                        }
                        boolean z10 = i4 == 0 ? z5 : true;
                        j09Var3 = g09.a;
                        z9 = z10;
                        x01Var3 = x01.a;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var;
                        x01Var3 = x01Var;
                        z9 = z5;
                    }
                    l46Var.s();
                    if (g21.S(l46Var)) {
                        jC = abg.d(4293783039L);
                    } else {
                        jC = abg.c(1297300177);
                    }
                    numValueOf = Integer.valueOf(R.drawable.bookmark_personality);
                    if (!z9) {
                        numValueOf = null;
                    }
                    a(j09Var3, jC, numValueOf, Integer.valueOf(R.drawable.bookmark_personality_bg), x01Var3, af1.b0(-10063601, new y01(str, z4, 4, b2), l46Var), dd2Var, l46Var, 1794054, 0);
                    z7 = z4;
                    z8 = z9;
                    j09Var2 = j09Var3;
                    x01Var2 = x01Var3;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    x01Var2 = x01Var;
                    z7 = z4;
                    z8 = z5;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b11(j09Var2, z7, z8, str, x01Var2, dd2Var, i2, i3, 3);
                }
            }
            i8 |= 384;
            z5 = z3;
            if (l46Var.g(str)) {
                i6 = 2048;
            } else {
                i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i7 = i8 | i6 | 24576;
            b2 = 0;
            if ((74899 & i7) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i7 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        z4 = true;
                    }
                    if (i4 == 0) {
                    }
                    j09Var3 = g09.a;
                    z9 = z10;
                    x01Var3 = x01.a;
                } else {
                    if (i9 != 0) {
                        z4 = true;
                    }
                    if (i4 == 0) {
                    }
                    j09Var3 = g09.a;
                    z9 = z10;
                    x01Var3 = x01.a;
                }
                l46Var.s();
                if (g21.S(l46Var)) {
                    jC = abg.d(4293783039L);
                } else {
                    jC = abg.c(1297300177);
                }
                numValueOf = Integer.valueOf(R.drawable.bookmark_personality);
                if (!z9) {
                    numValueOf = null;
                }
                a(j09Var3, jC, numValueOf, Integer.valueOf(R.drawable.bookmark_personality_bg), x01Var3, af1.b0(-10063601, new y01(str, z4, 4, b2), l46Var), dd2Var, l46Var, 1794054, 0);
                z7 = z4;
                z8 = z9;
                j09Var2 = j09Var3;
                x01Var2 = x01Var3;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                x01Var2 = x01Var;
                z7 = z4;
                z8 = z5;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b11(j09Var2, z7, z8, str, x01Var2, dd2Var, i2, i3, 3);
            }
        }
        i8 = i2 | 54;
        z4 = z2;
        i4 = i3 & 4;
        if (i4 != 0) {
            if ((i2 & 384) == 0) {
                z5 = z3;
                if (l46Var.h(z5)) {
                    i5 = 256;
                } else {
                    i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i8 |= i5;
            }
            if (l46Var.g(str)) {
                i6 = 2048;
            } else {
                i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i7 = i8 | i6 | 24576;
            b2 = 0;
            if ((74899 & i7) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i7 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        z4 = true;
                    }
                    if (i4 == 0) {
                    }
                    j09Var3 = g09.a;
                    z9 = z10;
                    x01Var3 = x01.a;
                } else {
                    if (i9 != 0) {
                        z4 = true;
                    }
                    if (i4 == 0) {
                    }
                    j09Var3 = g09.a;
                    z9 = z10;
                    x01Var3 = x01.a;
                }
                l46Var.s();
                if (g21.S(l46Var)) {
                    jC = abg.d(4293783039L);
                } else {
                    jC = abg.c(1297300177);
                }
                numValueOf = Integer.valueOf(R.drawable.bookmark_personality);
                if (!z9) {
                    numValueOf = null;
                }
                a(j09Var3, jC, numValueOf, Integer.valueOf(R.drawable.bookmark_personality_bg), x01Var3, af1.b0(-10063601, new y01(str, z4, 4, b2), l46Var), dd2Var, l46Var, 1794054, 0);
                z7 = z4;
                z8 = z9;
                j09Var2 = j09Var3;
                x01Var2 = x01Var3;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                x01Var2 = x01Var;
                z7 = z4;
                z8 = z5;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b11(j09Var2, z7, z8, str, x01Var2, dd2Var, i2, i3, 3);
            }
        }
        i8 |= 384;
        z5 = z3;
        if (l46Var.g(str)) {
            i6 = 2048;
        } else {
            i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        i7 = i8 | i6 | 24576;
        b2 = 0;
        if ((74899 & i7) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (l46Var.W(i7 & 1, z6)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    z4 = true;
                }
                if (i4 == 0) {
                }
                j09Var3 = g09.a;
                z9 = z10;
                x01Var3 = x01.a;
            } else {
                if (i9 != 0) {
                    z4 = true;
                }
                if (i4 == 0) {
                }
                j09Var3 = g09.a;
                z9 = z10;
                x01Var3 = x01.a;
            }
            l46Var.s();
            if (g21.S(l46Var)) {
                jC = abg.d(4293783039L);
            } else {
                jC = abg.c(1297300177);
            }
            numValueOf = Integer.valueOf(R.drawable.bookmark_personality);
            if (!z9) {
                numValueOf = null;
            }
            a(j09Var3, jC, numValueOf, Integer.valueOf(R.drawable.bookmark_personality_bg), x01Var3, af1.b0(-10063601, new y01(str, z4, 4, b2), l46Var), dd2Var, l46Var, 1794054, 0);
            z7 = z4;
            z8 = z9;
            j09Var2 = j09Var3;
            x01Var2 = x01Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            x01Var2 = x01Var;
            z7 = z4;
            z8 = z5;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b11(j09Var2, z7, z8, str, x01Var2, dd2Var, i2, i3, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void e(j09 j09Var, boolean z2, boolean z3, String str, x01 x01Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        boolean z4;
        int i4;
        boolean z5;
        String str2;
        int i5;
        int i6;
        byte b2;
        boolean z6;
        boolean z7;
        boolean z8;
        String str3;
        ojb ojbVarV;
        String strQ;
        String str4;
        boolean z9;
        long jC;
        Integer numValueOf;
        l46Var.h0(1155610049);
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 = i2 | 48;
            z4 = z2;
        } else if ((i2 & 48) == 0) {
            z4 = z2;
            i4 = (l46Var.h(z4) ? 32 : 16) | i2;
        } else {
            z4 = z2;
            i4 = i2;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                z5 = z3;
                i4 |= l46Var.h(z5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i3 & 8) == 0) {
                str2 = str;
                if (l46Var.g(str2)) {
                    i5 = 2048;
                }
                i6 = i4 | i5;
                b2 = 0;
                if ((74899 & i6) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (l46Var.W(i6 & 1, z6)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0 || l46Var.C()) {
                        if (i7 != 0) {
                            z4 = true;
                        }
                        boolean z10 = i8 == 0 ? z5 : true;
                        if ((i3 & 8) != 0) {
                            strQ = afc.q(R.string.personality_bookmark4, l46Var);
                        } else {
                            strQ = str2;
                        }
                        str4 = strQ;
                        z9 = z10;
                    } else {
                        l46Var.Z();
                        z9 = z5;
                        str4 = str2;
                    }
                    boolean z11 = z4;
                    l46Var.s();
                    if (g21.S(l46Var)) {
                        jC = abg.d(4292799487L);
                    } else {
                        jC = abg.c(1295677905);
                    }
                    long j2 = jC;
                    numValueOf = Integer.valueOf(R.drawable.bookmark_profession);
                    if (!z9) {
                        numValueOf = null;
                    }
                    a(j09Var, j2, numValueOf, null, x01Var, af1.b0(-325808695, new y01(str4, z11, b2, b2), l46Var), dd2Var, l46Var, 1794054, 8);
                    z7 = z11;
                    z8 = z9;
                    str3 = str4;
                } else {
                    l46Var.Z();
                    z7 = z4;
                    z8 = z5;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var, dd2Var, i2, i3, 0);
                }
            }
            str2 = str;
            i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i6 = i4 | i5;
            b2 = 0;
            if ((74899 & i6) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i6 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark4, l46Var);
                    } else {
                        strQ = str2;
                    }
                    str4 = strQ;
                    z9 = z10;
                } else {
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark4, l46Var);
                    } else {
                        strQ = str2;
                    }
                    str4 = strQ;
                    z9 = z10;
                }
                boolean z12 = z4;
                l46Var.s();
                if (g21.S(l46Var)) {
                    jC = abg.d(4292799487L);
                } else {
                    jC = abg.c(1295677905);
                }
                long j3 = jC;
                numValueOf = Integer.valueOf(R.drawable.bookmark_profession);
                if (!z9) {
                    numValueOf = null;
                }
                a(j09Var, j3, numValueOf, null, x01Var, af1.b0(-325808695, new y01(str4, z12, b2, b2), l46Var), dd2Var, l46Var, 1794054, 8);
                z7 = z12;
                z8 = z9;
                str3 = str4;
            } else {
                l46Var.Z();
                z7 = z4;
                z8 = z5;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var, dd2Var, i2, i3, 0);
            }
        }
        i4 |= 384;
        z5 = z3;
        if ((i3 & 8) == 0) {
            str2 = str;
            if (l46Var.g(str2)) {
                i5 = 2048;
            }
            i6 = i4 | i5;
            b2 = 0;
            if ((74899 & i6) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i6 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark4, l46Var);
                    } else {
                        strQ = str2;
                    }
                    str4 = strQ;
                    z9 = z10;
                } else {
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark4, l46Var);
                    } else {
                        strQ = str2;
                    }
                    str4 = strQ;
                    z9 = z10;
                }
                boolean z13 = z4;
                l46Var.s();
                if (g21.S(l46Var)) {
                    jC = abg.d(4292799487L);
                } else {
                    jC = abg.c(1295677905);
                }
                long j4 = jC;
                numValueOf = Integer.valueOf(R.drawable.bookmark_profession);
                if (!z9) {
                    numValueOf = null;
                }
                a(j09Var, j4, numValueOf, null, x01Var, af1.b0(-325808695, new y01(str4, z13, b2, b2), l46Var), dd2Var, l46Var, 1794054, 8);
                z7 = z13;
                z8 = z9;
                str3 = str4;
            } else {
                l46Var.Z();
                z7 = z4;
                z8 = z5;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var, dd2Var, i2, i3, 0);
            }
        }
        str2 = str;
        i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        i6 = i4 | i5;
        b2 = 0;
        if ((74899 & i6) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (l46Var.W(i6 & 1, z6)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    z4 = true;
                }
                if (i8 == 0) {
                }
                if ((i3 & 8) != 0) {
                    strQ = afc.q(R.string.personality_bookmark4, l46Var);
                } else {
                    strQ = str2;
                }
                str4 = strQ;
                z9 = z10;
            } else {
                if (i7 != 0) {
                    z4 = true;
                }
                if (i8 == 0) {
                }
                if ((i3 & 8) != 0) {
                    strQ = afc.q(R.string.personality_bookmark4, l46Var);
                } else {
                    strQ = str2;
                }
                str4 = strQ;
                z9 = z10;
            }
            boolean z14 = z4;
            l46Var.s();
            if (g21.S(l46Var)) {
                jC = abg.d(4292799487L);
            } else {
                jC = abg.c(1295677905);
            }
            long j5 = jC;
            numValueOf = Integer.valueOf(R.drawable.bookmark_profession);
            if (!z9) {
                numValueOf = null;
            }
            a(j09Var, j5, numValueOf, null, x01Var, af1.b0(-325808695, new y01(str4, z14, b2, b2), l46Var), dd2Var, l46Var, 1794054, 8);
            z7 = z14;
            z8 = z9;
            str3 = str4;
        } else {
            l46Var.Z();
            z7 = z4;
            z8 = z5;
            str3 = str2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var, dd2Var, i2, i3, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void f(j09 j09Var, boolean z2, boolean z3, String str, x01 x01Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        boolean z4;
        int i4;
        boolean z5;
        String str2;
        int i5;
        int i6;
        byte b2;
        boolean z6;
        boolean z7;
        boolean z8;
        String str3;
        ojb ojbVarV;
        String strQ;
        String str4;
        boolean z9;
        long jC;
        Integer numValueOf;
        l46Var.h0(860485638);
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 = i2 | 48;
            z4 = z2;
        } else if ((i2 & 48) == 0) {
            z4 = z2;
            i4 = (l46Var.h(z4) ? 32 : 16) | i2;
        } else {
            z4 = z2;
            i4 = i2;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                z5 = z3;
                i4 |= l46Var.h(z5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i3 & 8) == 0) {
                str2 = str;
                if (l46Var.g(str2)) {
                    i5 = 2048;
                }
                i6 = i4 | i5;
                b2 = 0;
                if ((74899 & i6) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (l46Var.W(i6 & 1, z6)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0 || l46Var.C()) {
                        if (i7 != 0) {
                            z4 = true;
                        }
                        boolean z10 = i8 == 0 ? z5 : true;
                        if ((i3 & 8) != 0) {
                            strQ = afc.q(R.string.personality_bookmark2, l46Var);
                        } else {
                            strQ = str2;
                        }
                        str4 = strQ;
                        z9 = z10;
                    } else {
                        l46Var.Z();
                        z9 = z5;
                        str4 = str2;
                    }
                    boolean z11 = z4;
                    l46Var.s();
                    if (g21.S(l46Var)) {
                        jC = abg.d(4294962679L);
                    } else {
                        jC = abg.c(1305557667);
                    }
                    long j2 = jC;
                    numValueOf = Integer.valueOf(R.drawable.bookmark_romance);
                    if (!z9) {
                        numValueOf = null;
                    }
                    a(j09Var, j2, numValueOf, Integer.valueOf(R.drawable.bookmark_romance_bg), x01Var, af1.b0(1215094014, new y01(str4, z11, 3, b2), l46Var), dd2Var, l46Var, 1794054, 0);
                    z7 = z11;
                    z8 = z9;
                    str3 = str4;
                } else {
                    l46Var.Z();
                    z7 = z4;
                    z8 = z5;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var, dd2Var, i2, i3, 2);
                }
            }
            str2 = str;
            i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i6 = i4 | i5;
            b2 = 0;
            if ((74899 & i6) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i6 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark2, l46Var);
                    } else {
                        strQ = str2;
                    }
                    str4 = strQ;
                    z9 = z10;
                } else {
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark2, l46Var);
                    } else {
                        strQ = str2;
                    }
                    str4 = strQ;
                    z9 = z10;
                }
                boolean z12 = z4;
                l46Var.s();
                if (g21.S(l46Var)) {
                    jC = abg.d(4294962679L);
                } else {
                    jC = abg.c(1305557667);
                }
                long j3 = jC;
                numValueOf = Integer.valueOf(R.drawable.bookmark_romance);
                if (!z9) {
                    numValueOf = null;
                }
                a(j09Var, j3, numValueOf, Integer.valueOf(R.drawable.bookmark_romance_bg), x01Var, af1.b0(1215094014, new y01(str4, z12, 3, b2), l46Var), dd2Var, l46Var, 1794054, 0);
                z7 = z12;
                z8 = z9;
                str3 = str4;
            } else {
                l46Var.Z();
                z7 = z4;
                z8 = z5;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var, dd2Var, i2, i3, 2);
            }
        }
        i4 |= 384;
        z5 = z3;
        if ((i3 & 8) == 0) {
            str2 = str;
            if (l46Var.g(str2)) {
                i5 = 2048;
            }
            i6 = i4 | i5;
            b2 = 0;
            if ((74899 & i6) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i6 & 1, z6)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark2, l46Var);
                    } else {
                        strQ = str2;
                    }
                    str4 = strQ;
                    z9 = z10;
                } else {
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        strQ = afc.q(R.string.personality_bookmark2, l46Var);
                    } else {
                        strQ = str2;
                    }
                    str4 = strQ;
                    z9 = z10;
                }
                boolean z13 = z4;
                l46Var.s();
                if (g21.S(l46Var)) {
                    jC = abg.d(4294962679L);
                } else {
                    jC = abg.c(1305557667);
                }
                long j4 = jC;
                numValueOf = Integer.valueOf(R.drawable.bookmark_romance);
                if (!z9) {
                    numValueOf = null;
                }
                a(j09Var, j4, numValueOf, Integer.valueOf(R.drawable.bookmark_romance_bg), x01Var, af1.b0(1215094014, new y01(str4, z13, 3, b2), l46Var), dd2Var, l46Var, 1794054, 0);
                z7 = z13;
                z8 = z9;
                str3 = str4;
            } else {
                l46Var.Z();
                z7 = z4;
                z8 = z5;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var, dd2Var, i2, i3, 2);
            }
        }
        str2 = str;
        i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        i6 = i4 | i5;
        b2 = 0;
        if ((74899 & i6) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (l46Var.W(i6 & 1, z6)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    z4 = true;
                }
                if (i8 == 0) {
                }
                if ((i3 & 8) != 0) {
                    strQ = afc.q(R.string.personality_bookmark2, l46Var);
                } else {
                    strQ = str2;
                }
                str4 = strQ;
                z9 = z10;
            } else {
                if (i7 != 0) {
                    z4 = true;
                }
                if (i8 == 0) {
                }
                if ((i3 & 8) != 0) {
                    strQ = afc.q(R.string.personality_bookmark2, l46Var);
                } else {
                    strQ = str2;
                }
                str4 = strQ;
                z9 = z10;
            }
            boolean z14 = z4;
            l46Var.s();
            if (g21.S(l46Var)) {
                jC = abg.d(4294962679L);
            } else {
                jC = abg.c(1305557667);
            }
            long j5 = jC;
            numValueOf = Integer.valueOf(R.drawable.bookmark_romance);
            if (!z9) {
                numValueOf = null;
            }
            a(j09Var, j5, numValueOf, Integer.valueOf(R.drawable.bookmark_romance_bg), x01Var, af1.b0(1215094014, new y01(str4, z14, 3, b2), l46Var), dd2Var, l46Var, 1794054, 0);
            z7 = z14;
            z8 = z9;
            str3 = str4;
        } else {
            l46Var.Z();
            z7 = z4;
            z8 = z5;
            str3 = str2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b11(j09Var, z7, z8, str3, x01Var, dd2Var, i2, i3, 2);
        }
    }

    public static final void g(String str, boolean z2, l46 l46Var, int i2) {
        str.getClass();
        l46Var.h0(-868981314);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.h(z2) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(g09Var, 24.0f, 12.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            if (z2) {
                l46Var.f0(1800541950);
                gu6.b(od4.A(R.drawable.lock, 0, l46Var), null, b.l(ynb.d0(0.0f, 0.0f, 8.0f, 0.0f, 11, g09Var), 12.0f), 0L, l46Var, 440, 8);
                l46Var.r(false);
            } else {
                l46Var.f0(1800705320);
                l46Var.r(false);
            }
            k00 k00Var = new k00(str);
            mue mueVar = pue.a;
            iqf.b(k00Var, null, 0L, mue.a(pue.p(l46Var), 0L, 0L, ar5.e, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 3, w6c.l(24), null, null, 16613339), w6c.l(10), w6c.l(19), 2, Float.valueOf(1.6f), l46Var, 14376960, 6);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new y01(str, z2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0054  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0066  */
    /* JADX WARN: Code duplicated, block: B:43:0x006a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void h(final int i2, final int i3, j09 j09Var, boolean z2, CardLayoutConfig cardLayoutConfig, final dd2 dd2Var, l46 l46Var, int i4, int i5) {
        int i6;
        j09 j09Var2;
        int i7;
        boolean z3;
        int i8;
        dd2 dd2Var2;
        boolean z4;
        j09 j09Var3;
        boolean z5;
        CardLayoutConfig cardLayoutConfig2;
        ojb ojbVarV;
        j09 j09Var4;
        CardLayoutConfig cardLayoutConfig3;
        boolean z6;
        ojb ojbVarV2;
        int i9;
        int i10;
        boolean zI;
        CardLayoutConfig cardLayoutConfigA = cardLayoutConfig;
        l46Var.h0(2021264078);
        if ((i4 & 6) == 0) {
            i6 = (l46Var.e(i2) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= l46Var.e(i3) ? 32 : 16;
        }
        int i11 = i5 & 4;
        if (i11 == 0) {
            if ((i4 & 384) == 0) {
                j09Var2 = j09Var;
                i6 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i7 = i5 & 8;
            if (i7 != 0) {
                if ((i4 & 3072) == 0) {
                    z3 = z2;
                    if (l46Var.h(z3)) {
                        i8 = 2048;
                    } else {
                        i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i6 |= i8;
                }
                if ((i4 & 24576) == 0) {
                    if ((i5 & 16) != 0) {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    } else {
                        if ((32768 & i4) == 0) {
                            zI = l46Var.g(cardLayoutConfigA);
                        } else {
                            zI = l46Var.i(cardLayoutConfigA);
                        }
                        if (zI) {
                            i10 = 16384;
                        } else {
                            i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                    }
                    i6 |= i10;
                }
                if ((196608 & i4) == 0) {
                    dd2Var2 = dd2Var;
                    if (l46Var.i(dd2Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i6 |= i9;
                } else {
                    dd2Var2 = dd2Var;
                }
                if ((74899 & i6) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i6 & 1, z4)) {
                    l46Var.b0();
                    if ((i4 & 1) != 0 || l46Var.C()) {
                        if (i11 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i5 & 16) != 0) {
                            cardLayoutConfigA = jr1.a(i2);
                        }
                        cardLayoutConfig3 = cardLayoutConfigA;
                        z6 = z3;
                    } else {
                        l46Var.Z();
                        j09Var4 = j09Var2;
                        z6 = z3;
                        cardLayoutConfig3 = cardLayoutConfigA;
                    }
                    l46Var.s();
                    if (i2 <= 0) {
                        ojbVarV2 = l46Var.v();
                        if (ojbVarV2 != null) {
                            ojbVarV2.d = new ni2(i2, i3, j09Var4, z6, cardLayoutConfig3, dd2Var2, i4, i5, 0);
                            return;
                        }
                        return;
                    }
                    j09 j09Var5 = j09Var4;
                    final boolean z7 = z6;
                    final CardLayoutConfig cardLayoutConfig4 = cardLayoutConfig3;
                    nk8.d(dj6.w(b.c(j09Var5, 1.0f), cardLayoutConfig4.getContainerAspectRatio()), null, af1.b0(-13349832, new n26() { // from class: oi2
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // defpackage.n26
                        public final Object m(Object obj, Object obj2, Object obj3) {
                            boolean z8;
                            Object obj4;
                            int i12;
                            Object obj5;
                            Object obj6;
                            boolean z9;
                            Object obj7;
                            oi2 oi2Var = this;
                            he2 he2Var = hj6.x;
                            he2 he2Var2 = hj6.X;
                            he2 he2Var3 = hj6.y;
                            he2 he2Var4 = hj6.z;
                            e31 e31Var = (e31) obj;
                            l46 l46Var2 = (l46) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            Integer num = 48;
                            lx0 lx0Var = ndb.b;
                            e31Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                            }
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                                sw3 sw3Var = (sw3) l46Var2.k(zg2.h);
                                float fH = kl2.h(e31Var.b);
                                CardLayoutConfig cardLayoutConfig5 = cardLayoutConfig4;
                                float fP0 = fH / sw3Var.p0(cardLayoutConfig5.getContainerWidth());
                                g09 g09Var = g09.a;
                                j09 j09VarB = e31Var.b(g09Var);
                                boolean z10 = z7;
                                boolean zH = l46Var2.h(z10);
                                Object objR = l46Var2.R();
                                i8c i8cVar = sf2.a;
                                if (zH || objR == i8cVar) {
                                    z8 = false;
                                    pi2 pi2Var = new pi2(z10, 0);
                                    l46Var2.p0(pi2Var);
                                    obj4 = pi2Var;
                                } else {
                                    z8 = false;
                                    obj4 = objR;
                                }
                                j09 j09VarX = bzd.x(j09VarB, (a26) obj4);
                                xn8 xn8VarC = s21.c(lx0Var, z8);
                                int iHashCode = Long.hashCode(l46Var2.T);
                                u8a u8aVarM = l46Var2.m();
                                j09 j09VarJ = m93.J(l46Var2, j09VarX);
                                lf2.q.getClass();
                                l46Var2.j0();
                                boolean z11 = l46Var2.S;
                                ov7 ov7Var = LayoutNode.h1;
                                if (z11) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var4, l46Var2, xn8VarC);
                                dec.l(he2Var3, l46Var2, u8aVarM);
                                dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode));
                                dec.k(l46Var2);
                                dec.l(he2Var, l46Var2, j09VarJ);
                                l46Var2.f0(-1954365096);
                                Iterator it = cardLayoutConfig5.getPositions().iterator();
                                int i13 = 0;
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    Iterator it2 = it;
                                    dd2 dd2Var3 = dd2Var;
                                    if (!zHasNext) {
                                        boolean z12 = z10;
                                        l46Var2.r(false);
                                        l46Var2.r(true);
                                        if (z12 && (i12 = i3) >= 0 && i12 < cardLayoutConfig5.getPositions().size()) {
                                            l46Var2.f0(1728751458);
                                            final CardPositionConfig cardPositionConfig = cardLayoutConfig5.getPositions().get(i12);
                                            float fP1 = sw3Var.p0(cardPositionConfig.getX()) * fP0;
                                            float fP2 = sw3Var.p0(cardPositionConfig.getY()) * fP0;
                                            Integer num2 = num;
                                            float fP3 = sw3Var.p0(cardPositionConfig.getWidth()) * fP0;
                                            float fP4 = sw3Var.p0(cardPositionConfig.getHeight()) * fP0;
                                            boolean zD = l46Var2.d(fP1) | l46Var2.d(fP2);
                                            he2 he2Var5 = he2Var;
                                            Object objR2 = l46Var2.R();
                                            if (zD || objR2 == i8cVar) {
                                                qi2 qi2Var = new qi2(fP1, fP2, 1);
                                                l46Var2.p0(qi2Var);
                                                obj5 = qi2Var;
                                            } else {
                                                obj5 = objR2;
                                            }
                                            j09 j09VarW = fdc.w(b.m(tm7.L(g09Var, (a26) obj5), sw3Var.c0(fP3), sw3Var.c0(fP4)), i2 + 10);
                                            boolean zI2 = l46Var2.i(cardPositionConfig);
                                            Object objR3 = l46Var2.R();
                                            Object obj8 = objR3;
                                            if (zI2 || objR3 == i8cVar) {
                                                final int i14 = 1;
                                                a26 a26Var = new a26() { // from class: ri2
                                                    @Override // defpackage.a26
                                                    public final Object d(Object obj9) {
                                                        int i15 = i14;
                                                        wef wefVar = wef.a;
                                                        CardPositionConfig cardPositionConfig2 = cardPositionConfig;
                                                        g0c g0cVar = (g0c) obj9;
                                                        g0cVar.getClass();
                                                        switch (i15) {
                                                            case 0:
                                                                g0cVar.p(cardPositionConfig2.getRotation());
                                                                break;
                                                            default:
                                                                g0cVar.p(cardPositionConfig2.getRotation());
                                                                break;
                                                        }
                                                        return wefVar;
                                                    }
                                                };
                                                l46Var2.p0(a26Var);
                                                obj8 = a26Var;
                                            }
                                            j09 j09VarX2 = bzd.x(j09VarW, (a26) obj8);
                                            xn8 xn8VarC2 = s21.c(lx0Var, false);
                                            int iHashCode2 = Long.hashCode(l46Var2.T);
                                            u8a u8aVarM2 = l46Var2.m();
                                            j09 j09VarJ2 = m93.J(l46Var2, j09VarX2);
                                            lf2.q.getClass();
                                            l46Var2.j0();
                                            if (l46Var2.S) {
                                                l46Var2.l(ov7Var);
                                            } else {
                                                l46Var2.s0();
                                            }
                                            dec.l(he2Var4, l46Var2, xn8VarC2);
                                            dec.l(he2Var3, l46Var2, u8aVarM2);
                                            dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode2));
                                            dec.k(l46Var2);
                                            dec.l(he2Var5, l46Var2, j09VarJ2);
                                            dd2Var3.t(Integer.valueOf(i12), Boolean.TRUE, l46Var2, num2);
                                            l46Var2.r(true);
                                            l46Var2.r(false);
                                            break;
                                        }
                                        l46Var2.f0(1729650954);
                                        l46Var2.r(false);
                                        break;
                                    }
                                    Object next = it2.next();
                                    int i15 = i13 + 1;
                                    if (i13 < 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    final CardPositionConfig cardPositionConfig2 = (CardPositionConfig) next;
                                    boolean z13 = z10;
                                    float fP5 = sw3Var.p0(cardPositionConfig2.getX()) * fP0;
                                    float fP6 = sw3Var.p0(cardPositionConfig2.getY()) * fP0;
                                    float fP7 = sw3Var.p0(cardPositionConfig2.getWidth()) * fP0;
                                    Integer num3 = num;
                                    float fP8 = sw3Var.p0(cardPositionConfig2.getHeight()) * fP0;
                                    Integer zIndex = cardPositionConfig2.getZIndex();
                                    he2 he2Var6 = he2Var;
                                    float fIntValue = zIndex != null ? zIndex.intValue() : i13;
                                    boolean zD2 = l46Var2.d(fP5) | l46Var2.d(fP6);
                                    int i16 = i13;
                                    Object objR4 = l46Var2.R();
                                    if (zD2 || objR4 == i8cVar) {
                                        qi2 qi2Var2 = new qi2(fP5, fP6, 0);
                                        l46Var2.p0(qi2Var2);
                                        obj6 = qi2Var2;
                                    } else {
                                        obj6 = objR4;
                                    }
                                    j09 j09VarW2 = fdc.w(b.m(tm7.L(g09Var, (a26) obj6), sw3Var.c0(fP7), sw3Var.c0(fP8)), fIntValue);
                                    boolean zI3 = l46Var2.i(cardPositionConfig2);
                                    Object objR5 = l46Var2.R();
                                    if (zI3 || objR5 == i8cVar) {
                                        z9 = false;
                                        final boolean z14 = false ? 1 : 0;
                                        a26 a26Var2 = new a26() { // from class: ri2
                                            @Override // defpackage.a26
                                            public final Object d(Object obj9) {
                                                int i17 = z14;
                                                wef wefVar = wef.a;
                                                CardPositionConfig cardPositionConfig3 = cardPositionConfig2;
                                                g0c g0cVar = (g0c) obj9;
                                                g0cVar.getClass();
                                                switch (i17) {
                                                    case 0:
                                                        g0cVar.p(cardPositionConfig3.getRotation());
                                                        break;
                                                    default:
                                                        g0cVar.p(cardPositionConfig3.getRotation());
                                                        break;
                                                }
                                                return wefVar;
                                            }
                                        };
                                        l46Var2.p0(a26Var2);
                                        obj7 = a26Var2;
                                    } else {
                                        z9 = false;
                                        obj7 = objR5;
                                    }
                                    j09 j09VarX3 = bzd.x(j09VarW2, (a26) obj7);
                                    xn8 xn8VarC3 = s21.c(lx0Var, z9);
                                    int iHashCode3 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM3 = l46Var2.m();
                                    j09 j09VarJ3 = m93.J(l46Var2, j09VarX3);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(he2Var4, l46Var2, xn8VarC3);
                                    dec.l(he2Var3, l46Var2, u8aVarM3);
                                    he2Var2 = he2Var2;
                                    dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode3));
                                    dec.k(l46Var2);
                                    he2Var = he2Var6;
                                    dec.l(he2Var, l46Var2, j09VarJ3);
                                    num = num3;
                                    dd2Var3.t(Integer.valueOf(i16), Boolean.FALSE, l46Var2, num);
                                    l46Var2.r(true);
                                    oi2Var = this;
                                    it = it2;
                                    i13 = i15;
                                    z10 = z13;
                                }
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, 3072, 6);
                    j09Var3 = j09Var5;
                    cardLayoutConfig2 = cardLayoutConfig4;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    z5 = z3;
                    cardLayoutConfig2 = cardLayoutConfigA;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new ni2(i2, i3, j09Var3, z5, cardLayoutConfig2, dd2Var, i4, i5, 1);
                }
            }
            i6 |= 3072;
            z3 = z2;
            if ((i4 & 24576) == 0) {
                if ((i5 & 16) != 0) {
                    i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                } else {
                    if ((32768 & i4) == 0) {
                        zI = l46Var.g(cardLayoutConfigA);
                    } else {
                        zI = l46Var.i(cardLayoutConfigA);
                    }
                    if (zI) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                }
                i6 |= i10;
            }
            if ((196608 & i4) == 0) {
                dd2Var2 = dd2Var;
                if (l46Var.i(dd2Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i6 |= i9;
            } else {
                dd2Var2 = dd2Var;
            }
            if ((74899 & i6) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i6 & 1, z4)) {
                l46Var.b0();
                if ((i4 & 1) != 0) {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i5 & 16) != 0) {
                        cardLayoutConfigA = jr1.a(i2);
                    }
                    cardLayoutConfig3 = cardLayoutConfigA;
                    z6 = z3;
                } else {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i5 & 16) != 0) {
                        cardLayoutConfigA = jr1.a(i2);
                    }
                    cardLayoutConfig3 = cardLayoutConfigA;
                    z6 = z3;
                }
                l46Var.s();
                if (i2 <= 0) {
                    ojbVarV2 = l46Var.v();
                    if (ojbVarV2 != null) {
                        ojbVarV2.d = new ni2(i2, i3, j09Var4, z6, cardLayoutConfig3, dd2Var2, i4, i5, 0);
                        return;
                    }
                    return;
                }
                j09 j09Var6 = j09Var4;
                final boolean z8 = z6;
                final CardLayoutConfig cardLayoutConfig5 = cardLayoutConfig3;
                nk8.d(dj6.w(b.c(j09Var6, 1.0f), cardLayoutConfig5.getContainerAspectRatio()), null, af1.b0(-13349832, new n26() { // from class: oi2
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        boolean z9;
                        Object obj4;
                        int i12;
                        Object obj5;
                        Object obj6;
                        boolean z10;
                        Object obj7;
                        oi2 oi2Var = this;
                        he2 he2Var = hj6.x;
                        he2 he2Var2 = hj6.X;
                        he2 he2Var3 = hj6.y;
                        he2 he2Var4 = hj6.z;
                        e31 e31Var = (e31) obj;
                        l46 l46Var2 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Integer num = 48;
                        lx0 lx0Var = ndb.b;
                        e31Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                        }
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                            sw3 sw3Var = (sw3) l46Var2.k(zg2.h);
                            float fH = kl2.h(e31Var.b);
                            CardLayoutConfig cardLayoutConfig6 = cardLayoutConfig5;
                            float fP0 = fH / sw3Var.p0(cardLayoutConfig6.getContainerWidth());
                            g09 g09Var = g09.a;
                            j09 j09VarB = e31Var.b(g09Var);
                            boolean z11 = z8;
                            boolean zH = l46Var2.h(z11);
                            Object objR = l46Var2.R();
                            i8c i8cVar = sf2.a;
                            if (zH || objR == i8cVar) {
                                z9 = false;
                                pi2 pi2Var = new pi2(z11, 0);
                                l46Var2.p0(pi2Var);
                                obj4 = pi2Var;
                            } else {
                                z9 = false;
                                obj4 = objR;
                            }
                            j09 j09VarX = bzd.x(j09VarB, (a26) obj4);
                            xn8 xn8VarC = s21.c(lx0Var, z9);
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, j09VarX);
                            lf2.q.getClass();
                            l46Var2.j0();
                            boolean z12 = l46Var2.S;
                            ov7 ov7Var = LayoutNode.h1;
                            if (z12) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var4, l46Var2, xn8VarC);
                            dec.l(he2Var3, l46Var2, u8aVarM);
                            dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode));
                            dec.k(l46Var2);
                            dec.l(he2Var, l46Var2, j09VarJ);
                            l46Var2.f0(-1954365096);
                            Iterator it = cardLayoutConfig6.getPositions().iterator();
                            int i13 = 0;
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                Iterator it2 = it;
                                dd2 dd2Var3 = dd2Var;
                                if (!zHasNext) {
                                    boolean z13 = z11;
                                    l46Var2.r(false);
                                    l46Var2.r(true);
                                    if (z13 && (i12 = i3) >= 0 && i12 < cardLayoutConfig6.getPositions().size()) {
                                        l46Var2.f0(1728751458);
                                        final CardPositionConfig cardPositionConfig = cardLayoutConfig6.getPositions().get(i12);
                                        float fP1 = sw3Var.p0(cardPositionConfig.getX()) * fP0;
                                        float fP2 = sw3Var.p0(cardPositionConfig.getY()) * fP0;
                                        Integer num2 = num;
                                        float fP3 = sw3Var.p0(cardPositionConfig.getWidth()) * fP0;
                                        float fP4 = sw3Var.p0(cardPositionConfig.getHeight()) * fP0;
                                        boolean zD = l46Var2.d(fP1) | l46Var2.d(fP2);
                                        he2 he2Var5 = he2Var;
                                        Object objR2 = l46Var2.R();
                                        if (zD || objR2 == i8cVar) {
                                            qi2 qi2Var = new qi2(fP1, fP2, 1);
                                            l46Var2.p0(qi2Var);
                                            obj5 = qi2Var;
                                        } else {
                                            obj5 = objR2;
                                        }
                                        j09 j09VarW = fdc.w(b.m(tm7.L(g09Var, (a26) obj5), sw3Var.c0(fP3), sw3Var.c0(fP4)), i2 + 10);
                                        boolean zI2 = l46Var2.i(cardPositionConfig);
                                        Object objR3 = l46Var2.R();
                                        Object obj8 = objR3;
                                        if (zI2 || objR3 == i8cVar) {
                                            final int i14 = 1;
                                            a26 a26Var = new a26() { // from class: ri2
                                                @Override // defpackage.a26
                                                public final Object d(Object obj9) {
                                                    int i17 = i14;
                                                    wef wefVar = wef.a;
                                                    CardPositionConfig cardPositionConfig3 = cardPositionConfig;
                                                    g0c g0cVar = (g0c) obj9;
                                                    g0cVar.getClass();
                                                    switch (i17) {
                                                        case 0:
                                                            g0cVar.p(cardPositionConfig3.getRotation());
                                                            break;
                                                        default:
                                                            g0cVar.p(cardPositionConfig3.getRotation());
                                                            break;
                                                    }
                                                    return wefVar;
                                                }
                                            };
                                            l46Var2.p0(a26Var);
                                            obj8 = a26Var;
                                        }
                                        j09 j09VarX2 = bzd.x(j09VarW, (a26) obj8);
                                        xn8 xn8VarC2 = s21.c(lx0Var, false);
                                        int iHashCode2 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM2 = l46Var2.m();
                                        j09 j09VarJ2 = m93.J(l46Var2, j09VarX2);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(ov7Var);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(he2Var4, l46Var2, xn8VarC2);
                                        dec.l(he2Var3, l46Var2, u8aVarM2);
                                        dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode2));
                                        dec.k(l46Var2);
                                        dec.l(he2Var5, l46Var2, j09VarJ2);
                                        dd2Var3.t(Integer.valueOf(i12), Boolean.TRUE, l46Var2, num2);
                                        l46Var2.r(true);
                                        l46Var2.r(false);
                                        break;
                                    }
                                    l46Var2.f0(1729650954);
                                    l46Var2.r(false);
                                    break;
                                }
                                Object next = it2.next();
                                int i15 = i13 + 1;
                                if (i13 < 0) {
                                    t72.Z();
                                    throw null;
                                }
                                final CardPositionConfig cardPositionConfig2 = (CardPositionConfig) next;
                                boolean z14 = z11;
                                float fP5 = sw3Var.p0(cardPositionConfig2.getX()) * fP0;
                                float fP6 = sw3Var.p0(cardPositionConfig2.getY()) * fP0;
                                float fP7 = sw3Var.p0(cardPositionConfig2.getWidth()) * fP0;
                                Integer num3 = num;
                                float fP8 = sw3Var.p0(cardPositionConfig2.getHeight()) * fP0;
                                Integer zIndex = cardPositionConfig2.getZIndex();
                                he2 he2Var6 = he2Var;
                                float fIntValue = zIndex != null ? zIndex.intValue() : i13;
                                boolean zD2 = l46Var2.d(fP5) | l46Var2.d(fP6);
                                int i16 = i13;
                                Object objR4 = l46Var2.R();
                                if (zD2 || objR4 == i8cVar) {
                                    qi2 qi2Var2 = new qi2(fP5, fP6, 0);
                                    l46Var2.p0(qi2Var2);
                                    obj6 = qi2Var2;
                                } else {
                                    obj6 = objR4;
                                }
                                j09 j09VarW2 = fdc.w(b.m(tm7.L(g09Var, (a26) obj6), sw3Var.c0(fP7), sw3Var.c0(fP8)), fIntValue);
                                boolean zI3 = l46Var2.i(cardPositionConfig2);
                                Object objR5 = l46Var2.R();
                                if (zI3 || objR5 == i8cVar) {
                                    z10 = false;
                                    final int z15 = false ? 1 : 0;
                                    a26 a26Var2 = new a26() { // from class: ri2
                                        @Override // defpackage.a26
                                        public final Object d(Object obj9) {
                                            int i17 = z15;
                                            wef wefVar = wef.a;
                                            CardPositionConfig cardPositionConfig3 = cardPositionConfig2;
                                            g0c g0cVar = (g0c) obj9;
                                            g0cVar.getClass();
                                            switch (i17) {
                                                case 0:
                                                    g0cVar.p(cardPositionConfig3.getRotation());
                                                    break;
                                                default:
                                                    g0cVar.p(cardPositionConfig3.getRotation());
                                                    break;
                                            }
                                            return wefVar;
                                        }
                                    };
                                    l46Var2.p0(a26Var2);
                                    obj7 = a26Var2;
                                } else {
                                    z10 = false;
                                    obj7 = objR5;
                                }
                                j09 j09VarX3 = bzd.x(j09VarW2, (a26) obj7);
                                xn8 xn8VarC3 = s21.c(lx0Var, z10);
                                int iHashCode3 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM3 = l46Var2.m();
                                j09 j09VarJ3 = m93.J(l46Var2, j09VarX3);
                                lf2.q.getClass();
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var4, l46Var2, xn8VarC3);
                                dec.l(he2Var3, l46Var2, u8aVarM3);
                                he2Var2 = he2Var2;
                                dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode3));
                                dec.k(l46Var2);
                                he2Var = he2Var6;
                                dec.l(he2Var, l46Var2, j09VarJ3);
                                num = num3;
                                dd2Var3.t(Integer.valueOf(i16), Boolean.FALSE, l46Var2, num);
                                l46Var2.r(true);
                                oi2Var = this;
                                it = it2;
                                i13 = i15;
                                z11 = z14;
                            }
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, 3072, 6);
                j09Var3 = j09Var6;
                cardLayoutConfig2 = cardLayoutConfig5;
                z5 = z8;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                z5 = z3;
                cardLayoutConfig2 = cardLayoutConfigA;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new ni2(i2, i3, j09Var3, z5, cardLayoutConfig2, dd2Var, i4, i5, 1);
            }
        }
        i6 |= 384;
        j09Var2 = j09Var;
        i7 = i5 & 8;
        if (i7 != 0) {
            if ((i4 & 3072) == 0) {
                z3 = z2;
                if (l46Var.h(z3)) {
                    i8 = 2048;
                } else {
                    i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i6 |= i8;
            }
            if ((i4 & 24576) == 0) {
                if ((i5 & 16) != 0) {
                    i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                } else {
                    if ((32768 & i4) == 0) {
                        zI = l46Var.g(cardLayoutConfigA);
                    } else {
                        zI = l46Var.i(cardLayoutConfigA);
                    }
                    if (zI) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                }
                i6 |= i10;
            }
            if ((196608 & i4) == 0) {
                dd2Var2 = dd2Var;
                if (l46Var.i(dd2Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i6 |= i9;
            } else {
                dd2Var2 = dd2Var;
            }
            if ((74899 & i6) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i6 & 1, z4)) {
                l46Var.b0();
                if ((i4 & 1) != 0) {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i5 & 16) != 0) {
                        cardLayoutConfigA = jr1.a(i2);
                    }
                    cardLayoutConfig3 = cardLayoutConfigA;
                    z6 = z3;
                } else {
                    if (i11 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i5 & 16) != 0) {
                        cardLayoutConfigA = jr1.a(i2);
                    }
                    cardLayoutConfig3 = cardLayoutConfigA;
                    z6 = z3;
                }
                l46Var.s();
                if (i2 <= 0) {
                    ojbVarV2 = l46Var.v();
                    if (ojbVarV2 != null) {
                        ojbVarV2.d = new ni2(i2, i3, j09Var4, z6, cardLayoutConfig3, dd2Var2, i4, i5, 0);
                        return;
                    }
                    return;
                }
                j09 j09Var7 = j09Var4;
                final boolean z9 = z6;
                final CardLayoutConfig cardLayoutConfig6 = cardLayoutConfig3;
                nk8.d(dj6.w(b.c(j09Var7, 1.0f), cardLayoutConfig6.getContainerAspectRatio()), null, af1.b0(-13349832, new n26() { // from class: oi2
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        boolean z10;
                        Object obj4;
                        int i12;
                        Object obj5;
                        Object obj6;
                        boolean z11;
                        Object obj7;
                        oi2 oi2Var = this;
                        he2 he2Var = hj6.x;
                        he2 he2Var2 = hj6.X;
                        he2 he2Var3 = hj6.y;
                        he2 he2Var4 = hj6.z;
                        e31 e31Var = (e31) obj;
                        l46 l46Var2 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Integer num = 48;
                        lx0 lx0Var = ndb.b;
                        e31Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                        }
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                            sw3 sw3Var = (sw3) l46Var2.k(zg2.h);
                            float fH = kl2.h(e31Var.b);
                            CardLayoutConfig cardLayoutConfig7 = cardLayoutConfig6;
                            float fP0 = fH / sw3Var.p0(cardLayoutConfig7.getContainerWidth());
                            g09 g09Var = g09.a;
                            j09 j09VarB = e31Var.b(g09Var);
                            boolean z12 = z9;
                            boolean zH = l46Var2.h(z12);
                            Object objR = l46Var2.R();
                            i8c i8cVar = sf2.a;
                            if (zH || objR == i8cVar) {
                                z10 = false;
                                pi2 pi2Var = new pi2(z12, 0);
                                l46Var2.p0(pi2Var);
                                obj4 = pi2Var;
                            } else {
                                z10 = false;
                                obj4 = objR;
                            }
                            j09 j09VarX = bzd.x(j09VarB, (a26) obj4);
                            xn8 xn8VarC = s21.c(lx0Var, z10);
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, j09VarX);
                            lf2.q.getClass();
                            l46Var2.j0();
                            boolean z13 = l46Var2.S;
                            ov7 ov7Var = LayoutNode.h1;
                            if (z13) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var4, l46Var2, xn8VarC);
                            dec.l(he2Var3, l46Var2, u8aVarM);
                            dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode));
                            dec.k(l46Var2);
                            dec.l(he2Var, l46Var2, j09VarJ);
                            l46Var2.f0(-1954365096);
                            Iterator it = cardLayoutConfig7.getPositions().iterator();
                            int i13 = 0;
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                Iterator it2 = it;
                                dd2 dd2Var3 = dd2Var;
                                if (!zHasNext) {
                                    boolean z14 = z12;
                                    l46Var2.r(false);
                                    l46Var2.r(true);
                                    if (z14 && (i12 = i3) >= 0 && i12 < cardLayoutConfig7.getPositions().size()) {
                                        l46Var2.f0(1728751458);
                                        final CardPositionConfig cardPositionConfig = cardLayoutConfig7.getPositions().get(i12);
                                        float fP1 = sw3Var.p0(cardPositionConfig.getX()) * fP0;
                                        float fP2 = sw3Var.p0(cardPositionConfig.getY()) * fP0;
                                        Integer num2 = num;
                                        float fP3 = sw3Var.p0(cardPositionConfig.getWidth()) * fP0;
                                        float fP4 = sw3Var.p0(cardPositionConfig.getHeight()) * fP0;
                                        boolean zD = l46Var2.d(fP1) | l46Var2.d(fP2);
                                        he2 he2Var5 = he2Var;
                                        Object objR2 = l46Var2.R();
                                        if (zD || objR2 == i8cVar) {
                                            qi2 qi2Var = new qi2(fP1, fP2, 1);
                                            l46Var2.p0(qi2Var);
                                            obj5 = qi2Var;
                                        } else {
                                            obj5 = objR2;
                                        }
                                        j09 j09VarW = fdc.w(b.m(tm7.L(g09Var, (a26) obj5), sw3Var.c0(fP3), sw3Var.c0(fP4)), i2 + 10);
                                        boolean zI2 = l46Var2.i(cardPositionConfig);
                                        Object objR3 = l46Var2.R();
                                        Object obj8 = objR3;
                                        if (zI2 || objR3 == i8cVar) {
                                            final int i14 = 1;
                                            a26 a26Var = new a26() { // from class: ri2
                                                @Override // defpackage.a26
                                                public final Object d(Object obj9) {
                                                    int i17 = i14;
                                                    wef wefVar = wef.a;
                                                    CardPositionConfig cardPositionConfig3 = cardPositionConfig;
                                                    g0c g0cVar = (g0c) obj9;
                                                    g0cVar.getClass();
                                                    switch (i17) {
                                                        case 0:
                                                            g0cVar.p(cardPositionConfig3.getRotation());
                                                            break;
                                                        default:
                                                            g0cVar.p(cardPositionConfig3.getRotation());
                                                            break;
                                                    }
                                                    return wefVar;
                                                }
                                            };
                                            l46Var2.p0(a26Var);
                                            obj8 = a26Var;
                                        }
                                        j09 j09VarX2 = bzd.x(j09VarW, (a26) obj8);
                                        xn8 xn8VarC2 = s21.c(lx0Var, false);
                                        int iHashCode2 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM2 = l46Var2.m();
                                        j09 j09VarJ2 = m93.J(l46Var2, j09VarX2);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(ov7Var);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(he2Var4, l46Var2, xn8VarC2);
                                        dec.l(he2Var3, l46Var2, u8aVarM2);
                                        dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode2));
                                        dec.k(l46Var2);
                                        dec.l(he2Var5, l46Var2, j09VarJ2);
                                        dd2Var3.t(Integer.valueOf(i12), Boolean.TRUE, l46Var2, num2);
                                        l46Var2.r(true);
                                        l46Var2.r(false);
                                        break;
                                    }
                                    l46Var2.f0(1729650954);
                                    l46Var2.r(false);
                                    break;
                                }
                                Object next = it2.next();
                                int i15 = i13 + 1;
                                if (i13 < 0) {
                                    t72.Z();
                                    throw null;
                                }
                                final CardPositionConfig cardPositionConfig2 = (CardPositionConfig) next;
                                boolean z15 = z12;
                                float fP5 = sw3Var.p0(cardPositionConfig2.getX()) * fP0;
                                float fP6 = sw3Var.p0(cardPositionConfig2.getY()) * fP0;
                                float fP7 = sw3Var.p0(cardPositionConfig2.getWidth()) * fP0;
                                Integer num3 = num;
                                float fP8 = sw3Var.p0(cardPositionConfig2.getHeight()) * fP0;
                                Integer zIndex = cardPositionConfig2.getZIndex();
                                he2 he2Var6 = he2Var;
                                float fIntValue = zIndex != null ? zIndex.intValue() : i13;
                                boolean zD2 = l46Var2.d(fP5) | l46Var2.d(fP6);
                                int i16 = i13;
                                Object objR4 = l46Var2.R();
                                if (zD2 || objR4 == i8cVar) {
                                    qi2 qi2Var2 = new qi2(fP5, fP6, 0);
                                    l46Var2.p0(qi2Var2);
                                    obj6 = qi2Var2;
                                } else {
                                    obj6 = objR4;
                                }
                                j09 j09VarW2 = fdc.w(b.m(tm7.L(g09Var, (a26) obj6), sw3Var.c0(fP7), sw3Var.c0(fP8)), fIntValue);
                                boolean zI3 = l46Var2.i(cardPositionConfig2);
                                Object objR5 = l46Var2.R();
                                if (zI3 || objR5 == i8cVar) {
                                    z11 = false;
                                    final int z16 = false ? 1 : 0;
                                    a26 a26Var2 = new a26() { // from class: ri2
                                        @Override // defpackage.a26
                                        public final Object d(Object obj9) {
                                            int i17 = z16;
                                            wef wefVar = wef.a;
                                            CardPositionConfig cardPositionConfig3 = cardPositionConfig2;
                                            g0c g0cVar = (g0c) obj9;
                                            g0cVar.getClass();
                                            switch (i17) {
                                                case 0:
                                                    g0cVar.p(cardPositionConfig3.getRotation());
                                                    break;
                                                default:
                                                    g0cVar.p(cardPositionConfig3.getRotation());
                                                    break;
                                            }
                                            return wefVar;
                                        }
                                    };
                                    l46Var2.p0(a26Var2);
                                    obj7 = a26Var2;
                                } else {
                                    z11 = false;
                                    obj7 = objR5;
                                }
                                j09 j09VarX3 = bzd.x(j09VarW2, (a26) obj7);
                                xn8 xn8VarC3 = s21.c(lx0Var, z11);
                                int iHashCode3 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM3 = l46Var2.m();
                                j09 j09VarJ3 = m93.J(l46Var2, j09VarX3);
                                lf2.q.getClass();
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var4, l46Var2, xn8VarC3);
                                dec.l(he2Var3, l46Var2, u8aVarM3);
                                he2Var2 = he2Var2;
                                dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode3));
                                dec.k(l46Var2);
                                he2Var = he2Var6;
                                dec.l(he2Var, l46Var2, j09VarJ3);
                                num = num3;
                                dd2Var3.t(Integer.valueOf(i16), Boolean.FALSE, l46Var2, num);
                                l46Var2.r(true);
                                oi2Var = this;
                                it = it2;
                                i13 = i15;
                                z12 = z15;
                            }
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, 3072, 6);
                j09Var3 = j09Var7;
                cardLayoutConfig2 = cardLayoutConfig6;
                z5 = z9;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                z5 = z3;
                cardLayoutConfig2 = cardLayoutConfigA;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new ni2(i2, i3, j09Var3, z5, cardLayoutConfig2, dd2Var, i4, i5, 1);
            }
        }
        i6 |= 3072;
        z3 = z2;
        if ((i4 & 24576) == 0) {
            if ((i5 & 16) != 0) {
                i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            } else {
                if ((32768 & i4) == 0) {
                    zI = l46Var.g(cardLayoutConfigA);
                } else {
                    zI = l46Var.i(cardLayoutConfigA);
                }
                if (zI) {
                    i10 = 16384;
                } else {
                    i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
            }
            i6 |= i10;
        }
        if ((196608 & i4) == 0) {
            dd2Var2 = dd2Var;
            if (l46Var.i(dd2Var2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i6 |= i9;
        } else {
            dd2Var2 = dd2Var;
        }
        if ((74899 & i6) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var.W(i6 & 1, z4)) {
            l46Var.b0();
            if ((i4 & 1) != 0) {
                if (i11 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((i5 & 16) != 0) {
                    cardLayoutConfigA = jr1.a(i2);
                }
                cardLayoutConfig3 = cardLayoutConfigA;
                z6 = z3;
            } else {
                if (i11 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((i5 & 16) != 0) {
                    cardLayoutConfigA = jr1.a(i2);
                }
                cardLayoutConfig3 = cardLayoutConfigA;
                z6 = z3;
            }
            l46Var.s();
            if (i2 <= 0) {
                ojbVarV2 = l46Var.v();
                if (ojbVarV2 != null) {
                    ojbVarV2.d = new ni2(i2, i3, j09Var4, z6, cardLayoutConfig3, dd2Var2, i4, i5, 0);
                    return;
                }
                return;
            }
            j09 j09Var8 = j09Var4;
            final boolean z10 = z6;
            final CardLayoutConfig cardLayoutConfig7 = cardLayoutConfig3;
            nk8.d(dj6.w(b.c(j09Var8, 1.0f), cardLayoutConfig7.getContainerAspectRatio()), null, af1.b0(-13349832, new n26() { // from class: oi2
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    boolean z11;
                    Object obj4;
                    int i12;
                    Object obj5;
                    Object obj6;
                    boolean z12;
                    Object obj7;
                    oi2 oi2Var = this;
                    he2 he2Var = hj6.x;
                    he2 he2Var2 = hj6.X;
                    he2 he2Var3 = hj6.y;
                    he2 he2Var4 = hj6.z;
                    e31 e31Var = (e31) obj;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Integer num = 48;
                    lx0 lx0Var = ndb.b;
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        sw3 sw3Var = (sw3) l46Var2.k(zg2.h);
                        float fH = kl2.h(e31Var.b);
                        CardLayoutConfig cardLayoutConfig8 = cardLayoutConfig7;
                        float fP0 = fH / sw3Var.p0(cardLayoutConfig8.getContainerWidth());
                        g09 g09Var = g09.a;
                        j09 j09VarB = e31Var.b(g09Var);
                        boolean z13 = z10;
                        boolean zH = l46Var2.h(z13);
                        Object objR = l46Var2.R();
                        i8c i8cVar = sf2.a;
                        if (zH || objR == i8cVar) {
                            z11 = false;
                            pi2 pi2Var = new pi2(z13, 0);
                            l46Var2.p0(pi2Var);
                            obj4 = pi2Var;
                        } else {
                            z11 = false;
                            obj4 = objR;
                        }
                        j09 j09VarX = bzd.x(j09VarB, (a26) obj4);
                        xn8 xn8VarC = s21.c(lx0Var, z11);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarX);
                        lf2.q.getClass();
                        l46Var2.j0();
                        boolean z14 = l46Var2.S;
                        ov7 ov7Var = LayoutNode.h1;
                        if (z14) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var4, l46Var2, xn8VarC);
                        dec.l(he2Var3, l46Var2, u8aVarM);
                        dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode));
                        dec.k(l46Var2);
                        dec.l(he2Var, l46Var2, j09VarJ);
                        l46Var2.f0(-1954365096);
                        Iterator it = cardLayoutConfig8.getPositions().iterator();
                        int i13 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            Iterator it2 = it;
                            dd2 dd2Var3 = dd2Var;
                            if (!zHasNext) {
                                boolean z15 = z13;
                                l46Var2.r(false);
                                l46Var2.r(true);
                                if (z15 && (i12 = i3) >= 0 && i12 < cardLayoutConfig8.getPositions().size()) {
                                    l46Var2.f0(1728751458);
                                    final CardPositionConfig cardPositionConfig = cardLayoutConfig8.getPositions().get(i12);
                                    float fP1 = sw3Var.p0(cardPositionConfig.getX()) * fP0;
                                    float fP2 = sw3Var.p0(cardPositionConfig.getY()) * fP0;
                                    Integer num2 = num;
                                    float fP3 = sw3Var.p0(cardPositionConfig.getWidth()) * fP0;
                                    float fP4 = sw3Var.p0(cardPositionConfig.getHeight()) * fP0;
                                    boolean zD = l46Var2.d(fP1) | l46Var2.d(fP2);
                                    he2 he2Var5 = he2Var;
                                    Object objR2 = l46Var2.R();
                                    if (zD || objR2 == i8cVar) {
                                        qi2 qi2Var = new qi2(fP1, fP2, 1);
                                        l46Var2.p0(qi2Var);
                                        obj5 = qi2Var;
                                    } else {
                                        obj5 = objR2;
                                    }
                                    j09 j09VarW = fdc.w(b.m(tm7.L(g09Var, (a26) obj5), sw3Var.c0(fP3), sw3Var.c0(fP4)), i2 + 10);
                                    boolean zI2 = l46Var2.i(cardPositionConfig);
                                    Object objR3 = l46Var2.R();
                                    Object obj8 = objR3;
                                    if (zI2 || objR3 == i8cVar) {
                                        final int i14 = 1;
                                        a26 a26Var = new a26() { // from class: ri2
                                            @Override // defpackage.a26
                                            public final Object d(Object obj9) {
                                                int i17 = i14;
                                                wef wefVar = wef.a;
                                                CardPositionConfig cardPositionConfig3 = cardPositionConfig;
                                                g0c g0cVar = (g0c) obj9;
                                                g0cVar.getClass();
                                                switch (i17) {
                                                    case 0:
                                                        g0cVar.p(cardPositionConfig3.getRotation());
                                                        break;
                                                    default:
                                                        g0cVar.p(cardPositionConfig3.getRotation());
                                                        break;
                                                }
                                                return wefVar;
                                            }
                                        };
                                        l46Var2.p0(a26Var);
                                        obj8 = a26Var;
                                    }
                                    j09 j09VarX2 = bzd.x(j09VarW, (a26) obj8);
                                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                                    int iHashCode2 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM2 = l46Var2.m();
                                    j09 j09VarJ2 = m93.J(l46Var2, j09VarX2);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(he2Var4, l46Var2, xn8VarC2);
                                    dec.l(he2Var3, l46Var2, u8aVarM2);
                                    dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode2));
                                    dec.k(l46Var2);
                                    dec.l(he2Var5, l46Var2, j09VarJ2);
                                    dd2Var3.t(Integer.valueOf(i12), Boolean.TRUE, l46Var2, num2);
                                    l46Var2.r(true);
                                    l46Var2.r(false);
                                    break;
                                }
                                l46Var2.f0(1729650954);
                                l46Var2.r(false);
                                break;
                            }
                            Object next = it2.next();
                            int i15 = i13 + 1;
                            if (i13 < 0) {
                                t72.Z();
                                throw null;
                            }
                            final CardPositionConfig cardPositionConfig2 = (CardPositionConfig) next;
                            boolean z16 = z13;
                            float fP5 = sw3Var.p0(cardPositionConfig2.getX()) * fP0;
                            float fP6 = sw3Var.p0(cardPositionConfig2.getY()) * fP0;
                            float fP7 = sw3Var.p0(cardPositionConfig2.getWidth()) * fP0;
                            Integer num3 = num;
                            float fP8 = sw3Var.p0(cardPositionConfig2.getHeight()) * fP0;
                            Integer zIndex = cardPositionConfig2.getZIndex();
                            he2 he2Var6 = he2Var;
                            float fIntValue = zIndex != null ? zIndex.intValue() : i13;
                            boolean zD2 = l46Var2.d(fP5) | l46Var2.d(fP6);
                            int i16 = i13;
                            Object objR4 = l46Var2.R();
                            if (zD2 || objR4 == i8cVar) {
                                qi2 qi2Var2 = new qi2(fP5, fP6, 0);
                                l46Var2.p0(qi2Var2);
                                obj6 = qi2Var2;
                            } else {
                                obj6 = objR4;
                            }
                            j09 j09VarW2 = fdc.w(b.m(tm7.L(g09Var, (a26) obj6), sw3Var.c0(fP7), sw3Var.c0(fP8)), fIntValue);
                            boolean zI3 = l46Var2.i(cardPositionConfig2);
                            Object objR5 = l46Var2.R();
                            if (zI3 || objR5 == i8cVar) {
                                z12 = false;
                                final int z17 = false ? 1 : 0;
                                a26 a26Var2 = new a26() { // from class: ri2
                                    @Override // defpackage.a26
                                    public final Object d(Object obj9) {
                                        int i17 = z17;
                                        wef wefVar = wef.a;
                                        CardPositionConfig cardPositionConfig3 = cardPositionConfig2;
                                        g0c g0cVar = (g0c) obj9;
                                        g0cVar.getClass();
                                        switch (i17) {
                                            case 0:
                                                g0cVar.p(cardPositionConfig3.getRotation());
                                                break;
                                            default:
                                                g0cVar.p(cardPositionConfig3.getRotation());
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                                l46Var2.p0(a26Var2);
                                obj7 = a26Var2;
                            } else {
                                z12 = false;
                                obj7 = objR5;
                            }
                            j09 j09VarX3 = bzd.x(j09VarW2, (a26) obj7);
                            xn8 xn8VarC3 = s21.c(lx0Var, z12);
                            int iHashCode3 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM3 = l46Var2.m();
                            j09 j09VarJ3 = m93.J(l46Var2, j09VarX3);
                            lf2.q.getClass();
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var4, l46Var2, xn8VarC3);
                            dec.l(he2Var3, l46Var2, u8aVarM3);
                            he2Var2 = he2Var2;
                            dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode3));
                            dec.k(l46Var2);
                            he2Var = he2Var6;
                            dec.l(he2Var, l46Var2, j09VarJ3);
                            num = num3;
                            dd2Var3.t(Integer.valueOf(i16), Boolean.FALSE, l46Var2, num);
                            l46Var2.r(true);
                            oi2Var = this;
                            it = it2;
                            i13 = i15;
                            z13 = z16;
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 3072, 6);
            j09Var3 = j09Var8;
            cardLayoutConfig2 = cardLayoutConfig7;
            z5 = z10;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            z5 = z3;
            cardLayoutConfig2 = cardLayoutConfigA;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ni2(i2, i3, j09Var3, z5, cardLayoutConfig2, dd2Var, i4, i5, 1);
        }
    }

    public static final void i(j09 j09Var, z63 z63Var, boolean z2, x16 x16Var, l46 l46Var, int i2) {
        boolean z3;
        z63 z63Var2 = z63Var;
        l46 l46Var2 = l46Var;
        z63Var2.getClass();
        x16Var.getClass();
        l46Var2.h0(-91900356);
        int i3 = 2;
        int i4 = i2 | (l46Var2.g(j09Var) ? 4 : 2) | (l46Var2.i(z63Var2) ? 32 : 16) | (l46Var2.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var2.W(i4 & 1, (i4 & 1171) != 1170)) {
            qhe qheVar = z63Var2.b;
            j09 j09VarD0 = ynb.d0(24.0f, 24.0f, 24.0f, 0.0f, 8, androidx.compose.foundation.b.c(j09Var, false, null, null, x16Var, 15));
            c92 c92VarA = a92.a(new uc0(0.0f, false, new jv2(i3, ndb.y)), ndb.Y, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD0);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z4 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
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
            String strQ = afc.q(r8c.f(qheVar), l46Var2);
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            String strR = afc.r(z2 ? R.string.tomorrow_daily_tarot_title : R.string.daily_tarot_title, new Object[]{strQ}, l46Var2);
            mue mueVar = pue.a;
            nte.b(strR, j09VarC, 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, null, 0L, 0, false, 0, 0, null, pue.p(l46Var2), l46Var, 48, 0, 130940);
            j09 j09VarC2 = b.c(b.b, 1.0f);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new jv2(3, ndb.Z)), ndb.z, l46Var, 54);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarC2);
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
            z63Var2 = z63Var;
            String str = z63Var2.e;
            if (v4e.Q(str)) {
                str = z63Var2.c;
            }
            nte.b(str, jw7Var, 0L, 0L, null, null, 0L, null, null, w6c.l(24), 2, false, 2, 0, null, pue.e(l46Var), l46Var, 0, 25008, 108540);
            l46Var2 = l46Var;
            j09 j09VarD = tm7.M(q6c.i(b.p(g09Var, 80.0f), 8.0f), 4.0f, 30.0f).D(new ttf());
            TarotSkinIdentify tarotSkinIdentify = z63Var2.f;
            if (tarotSkinIdentify == null) {
                l46Var2.f0(-649097274);
                tarotSkinIdentify = ((die) l46Var2.k(snd.a)).a;
                z3 = false;
            } else {
                z3 = false;
                l46Var2.f0(-649098669);
            }
            l46Var2.r(z3);
            o7c.d(j09VarD, qheVar, tarotSkinIdentify, false, null, 6.0f, null, false, l46Var2, 196608, 216);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50((Object) j09Var, (Object) z63Var2, z2, x16Var, i2, 7);
        }
    }

    public static final void j(int i2, int i3, l46 l46Var, j09 j09Var) {
        int i4;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-356590042);
        if ((i3 & 6) == 0) {
            i4 = (l46Var2.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
            float f2 = eze.a(l46Var2).a.f;
            y6c y6cVarB = a7c.b(f2);
            pr4 pr4Var = l8b.a;
            long j2 = ((e8b) l46Var2.k(pr4Var)).z;
            j09Var.getClass();
            j09 j09VarO = tm7.o(m93.u(j09Var, new ev1(0.5f, f2, j2)), ((e8b) l46Var2.k(pr4Var)).m, y6cVarB);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            String strValueOf = String.valueOf(i2);
            mue mueVar = (mue) l46Var2.k(nte.a);
            cq5 cq5Var = cr5.f;
            nte.b(strValueOf, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVar, 0L, w6c.l(21), ar5.x, cq5Var, w6c.i(0.006d), null, 3, w6c.k(28.35d), null, null, 16613209), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kc2(i2, i3, j09Var);
        }
    }

    public static final void k(x16 x16Var, a26 a26Var, a26 a26Var2, j09 j09Var, u16 u16Var, t7 t7Var, l46 l46Var, int i2) {
        int i3;
        j09 j09Var2;
        u16 u16Var2;
        t7 t7Var2;
        t7 t7Var3;
        int i4;
        j09 j09Var3;
        u16 u16Var3;
        x16Var.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        l46Var.h0(-1144651321);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(a26Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(a26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i5 = i3 | 11264;
        }
        if ((196608 & i2) == 0) {
            i5 |= 65536;
        }
        if (l46Var.W(i5 & 1, (74899 & i5) != 74898)) {
            l46Var.b0();
            int i6 = i2 & 1;
            Object obj = sf2.a;
            if (i6 == 0 || l46Var.C()) {
                pwf pwfVarA = qd8.a(l46Var);
                if (pwfVarA == null) {
                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                gy2 gy2VarR = b21.r(pwfVarA);
                nfc nfcVarB = kr7.b(l46Var);
                kob kobVar = job.a;
                u16 u16Var4 = (u16) z5c.G(kobVar.b(u16.class), pwfVarA.g(), null, gy2VarR, nfcVarB, null);
                nfc nfcVarB2 = kr7.b(l46Var);
                boolean zG = l46Var.g(null) | l46Var.g(nfcVarB2);
                Object objR = l46Var.R();
                if (zG || objR == obj) {
                    objR = nfcVarB2.b(kobVar.b(t7.class), null, null);
                    l46Var.p0(objR);
                }
                t7Var3 = (t7) objR;
                i4 = i5 & (-516097);
                j09Var3 = g09.a;
                u16Var3 = u16Var4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var;
                u16Var3 = u16Var;
                i4 = i5 & (-516097);
                t7Var3 = t7Var;
            }
            l46Var.s();
            e89 e89VarT = tm7.t(u16Var3.d, l46Var);
            e89 e89VarI = q1c.i(x16Var, l46Var);
            boolean zG2 = l46Var.g(u16Var3) | l46Var.g(t7Var3);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                int i7 = 0;
                Class<u16> cls = u16.class;
                Object q06Var = new q06(new sk3(0, u16Var3, cls, "load", "load()V", i7, 14), new sk3(0, u16Var3, cls, "refresh", "refresh()V", i7, 15), new sk3(0, u16Var3, cls, "cancelLoad", "cancelLoad()V", i7, 16), new ok3(e89VarI, 22));
                l46Var.p0(q06Var);
                objR2 = q06Var;
            }
            q06 q06Var2 = (q06) objR2;
            Object obj2 = (x48) l46Var.k(cb8.a);
            boolean zI = l46Var.i(t7Var3) | l46Var.i(q06Var2);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new r06(t7Var3, q06Var2, null);
                l46Var.p0(objR3);
            }
            af1.p(q06Var2, t7Var3, (l26) objR3, l46Var);
            boolean zI2 = l46Var.i(q06Var2) | l46Var.i(obj2);
            Object objR4 = l46Var.R();
            if (zI2 || objR4 == obj) {
                objR4 = new so5(3, obj2, q06Var2);
                l46Var.p0(objR4);
            }
            af1.h(obj2, q06Var2, (a26) objR4, l46Var);
            s16 s16Var = (s16) e89VarT.getValue();
            boolean zI3 = l46Var.i(u16Var3);
            Object objR5 = l46Var.R();
            if (zI3 || objR5 == obj) {
                Object sk3Var = new sk3(0, u16Var3, u16.class, "load", "load()V", 0, 13);
                l46Var.p0(sk3Var);
                objR5 = sk3Var;
            }
            x16 x16Var2 = (x16) ((ym7) objR5);
            int i8 = (i4 << 3) & 112;
            int i9 = i4 << 6;
            eb3.k(s16Var, x16Var, x16Var2, a26Var, a26Var2, j09Var3, l46Var, i8 | (i9 & 7168) | (57344 & i9) | (i9 & 458752));
            j09Var2 = j09Var3;
            t7Var2 = t7Var3;
            u16Var2 = u16Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            u16Var2 = u16Var;
            t7Var2 = t7Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r20(x16Var, a26Var, a26Var2, j09Var2, u16Var2, t7Var2, i2);
        }
    }

    public static final void l(final oo6 oo6Var, final z63 z63Var, final LocalDate localDate, final LocalDate localDate2, final z63 z63Var2, final h73 h73Var, final h73 h73Var2, final h73 h73Var3, final int i2, final boolean z2, final List list, final boolean z3, final float f2, final j18 j18Var, final x16 x16Var, final q7b q7bVar, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, final x16 x16Var5, final x16 x16Var6, final a26 a26Var, final a26 a26Var2, final x16 x16Var7, final x16 x16Var8, final x16 x16Var9, final a26 a26Var3, l46 l46Var, final int i3) {
        boolean z4;
        int i4;
        oo6Var.getClass();
        localDate.getClass();
        h73Var.getClass();
        h73Var2.getClass();
        list.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        x16Var5.getClass();
        x16Var6.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        x16Var7.getClass();
        x16Var8.getClass();
        x16Var9.getClass();
        a26Var3.getClass();
        l46Var.h0(-1436861177);
        int i5 = i3 | (l46Var.g(oo6Var) ? 4 : 2) | (l46Var.i(z63Var) ? 32 : 16) | (l46Var.i(localDate) ? 256 : 128) | (l46Var.i(localDate2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(z63Var2) ? 16384 : 8192) | (l46Var.e(h73Var.ordinal()) ? 131072 : 65536) | (l46Var.e(h73Var2.ordinal()) ? 1048576 : 524288) | (l46Var.e(h73Var3 == null ? -1 : h73Var3.ordinal()) ? 8388608 : 4194304) | (l46Var.e(i2) ? 67108864 : 33554432) | (l46Var.h(z2) ? 536870912 : 268435456);
        int i6 = 0;
        if (l46Var.W(i5 & 1, ((i5 & 306783379) == 306783378 && (((((((((((l46Var.g(list) ? (char) 4 : (char) 2) | (l46Var.h(z3) ? ' ' : (char) 16)) | (l46Var.d(f2) ? 256 : 128)) | (l46Var.g(j18Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE)) | (l46Var.i(x16Var) ? 16384 : 8192)) | (l46Var.g(q7bVar) ? 131072 : 65536)) | (l46Var.i(x16Var2) ? 1048576 : 524288)) | (l46Var.i(x16Var3) ? (char) 0 : (char) 0)) | (l46Var.i(x16Var4) ? (char) 0 : (char) 0)) | (l46Var.i(x16Var5) ? (char) 0 : (char) 0)) & 306783379) == 306783378 && ((((((((l46Var.i(x16Var6) ? (char) 4 : (char) 2) | (l46Var.i(a26Var) ? ' ' : (char) 16)) | (l46Var.i(a26Var2) ? (char) 256 : (char) 128)) | (l46Var.i(x16Var7) ? (char) 2048 : (char) 1024)) | (l46Var.i(x16Var8) ? (char) 16384 : (char) 8192)) | (l46Var.i(x16Var9) ? (char) 0 : (char) 0)) | (l46Var.i(a26Var3) ? (char) 0 : (char) 0)) & 599187) == 599186) ? false : true)) {
            l46Var.b0();
            if ((i3 & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            final a26 a26VarF = qka.f(hc9.b, q7bVar, l46Var);
            final Context context = (Context) l46Var.k(uq.b);
            long jD = abg.d(g21.S(l46Var) ? 4209699324L : 4196805174L);
            final ii6 ii6VarB0 = g21.b0(l46Var);
            FillElement fillElement = b.c;
            j09 j09VarG = k8b.g(fillElement, new en6(ii6VarB0, i6), l46Var, 6);
            x48 x48Var = (x48) l46Var.k(cb8.a);
            boolean z5 = f2 == 0.0f;
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                z4 = false;
                i4 = 8;
                l46Var.f0(-1885232357);
                l46Var.r(false);
            } else {
                l46Var.f0(-1885769556);
                Boolean boolValueOf = Boolean.valueOf(z5);
                boolean z6 = z5;
                boolean zH = l46Var.h(z6) | l46Var.i(x48Var);
                Object objR = l46Var.R();
                if (zH || objR == sf2.a) {
                    i4 = 8;
                    objR = new bs0(x48Var, z6, i4);
                    l46Var.p0(objR);
                } else {
                    i4 = 8;
                }
                af1.h(x48Var, boolValueOf, (a26) objR, l46Var);
                z4 = false;
                l46Var.r(false);
            }
            xn8 xn8VarC = s21.c(ndb.b, z4);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, fillElement);
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
            int i7 = i4;
            rs0.f(j09VarG, true, y7h.c, l46Var, 432, 0);
            pr4 pr4Var = zg2.h;
            sw3 sw3Var = (sw3) l46Var.k(pr4Var);
            l46Var.f0(-1471817202);
            WeakHashMap weakHashMap = m8g.w;
            final float fZ = sw3Var.Z(q7c.k(l46Var).l.c(sw3Var));
            l46Var.r(false);
            m58 m58VarP = fdc.p(l46Var);
            tef tefVar = q7c.k(l46Var).l;
            float fN = mh3.n(f2, 0.0f, 1.0f);
            sw3 sw3Var2 = (sw3) l46Var.k(pr4Var);
            cv7 cv7Var = (cv7) l46Var.k(zg2.n);
            int iA = m58VarP.a(sw3Var2);
            int i8 = (int) (((0 - iA) * fN) + iA);
            cv7 cv7Var2 = cv7.a;
            xdc.a(null, af1.b0(-304168495, new fj3(jD, new rh5(z7c.k(15, cv7Var == cv7Var2 ? i7 : 2) ? tefVar.d(sw3Var2, cv7Var) : 0, i8, z7c.k(15, cv7Var == cv7Var2 ? 4 : 1) ? tefVar.b(sw3Var2, cv7Var) : 0), x16Var9, x16Var2), l46Var), null, null, null, 0, y72.j, 0L, new rh5(0, 0, 0), af1.b0(-897384100, new n26() { // from class: gn6
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((xw9) obj).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        FillElement fillElement2 = b.c;
                        final ii6 ii6Var = ii6VarB0;
                        final j18 j18Var2 = j18Var;
                        final float f3 = fZ;
                        final z63 z63Var3 = z63Var;
                        final LocalDate localDate3 = localDate;
                        final LocalDate localDate4 = localDate2;
                        final z63 z63Var4 = z63Var2;
                        final h73 h73Var4 = h73Var;
                        final h73 h73Var5 = h73Var2;
                        final h73 h73Var6 = h73Var3;
                        final int i9 = i2;
                        final oo6 oo6Var2 = oo6Var;
                        final List list2 = list;
                        final Context context2 = context;
                        final a26 a26Var4 = a26VarF;
                        final x16 x16Var10 = x16Var3;
                        final boolean z7 = z2;
                        final x16 x16Var11 = x16Var;
                        final x16 x16Var12 = x16Var4;
                        final x16 x16Var13 = x16Var5;
                        final x16 x16Var14 = x16Var6;
                        final a26 a26Var5 = a26Var;
                        final a26 a26Var6 = a26Var2;
                        final x16 x16Var15 = x16Var7;
                        final x16 x16Var16 = x16Var8;
                        final a26 a26Var7 = a26Var3;
                        bzd.l(fillElement2, z3, 0L, null, null, af1.b0(-20593640, new n26() { // from class: jn6
                            @Override // defpackage.n26
                            public final Object m(Object obj4, Object obj5, Object obj6) {
                                l46 l46Var3 = (l46) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((c31) obj4).getClass();
                                if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    oo6 oo6Var3 = oo6Var2;
                                    TarotSkinIdentify tarotSkinIdentify = oo6Var3.d;
                                    Context context3 = context2;
                                    boolean zI = l46Var3.i(context3);
                                    a26 a26Var8 = a26Var4;
                                    boolean zG = zI | l46Var3.g(a26Var8);
                                    Object objR2 = l46Var3.R();
                                    i8c i8cVar = sf2.a;
                                    if (zG || objR2 == i8cVar) {
                                        objR2 = new so5(11, context3, a26Var8);
                                        l46Var3.p0(objR2);
                                    }
                                    a26 a26Var9 = (a26) objR2;
                                    x16 x16Var17 = x16Var10;
                                    boolean zG2 = l46Var3.g(x16Var17);
                                    Object objR3 = l46Var3.R();
                                    if (zG2 || objR3 == i8cVar) {
                                        objR3 = new fn6(0, x16Var17);
                                        l46Var3.p0(objR3);
                                    }
                                    x16 x16Var18 = (x16) objR3;
                                    List list3 = oo6Var3.c;
                                    x16 x16Var19 = x16Var16;
                                    boolean zG3 = l46Var3.g(x16Var19);
                                    Object objR4 = l46Var3.R();
                                    if (zG3 || objR4 == i8cVar) {
                                        objR4 = new fn6(1, x16Var19);
                                        l46Var3.p0(objR4);
                                    }
                                    x16 x16Var20 = (x16) objR4;
                                    a26 a26Var10 = a26Var7;
                                    boolean zG4 = l46Var3.g(a26Var10);
                                    Object objR5 = l46Var3.R();
                                    if (zG4 || objR5 == i8cVar) {
                                        objR5 = new hy0(a26Var10, 12);
                                        l46Var3.p0(objR5);
                                    }
                                    wn6.a(null, ii6Var, j18Var2, f3, z63Var3, localDate3, localDate4, z63Var4, h73Var4, h73Var5, h73Var6, i9, tarotSkinIdentify, list2, a26Var9, x16Var18, z7, x16Var11, list3, x16Var12, x16Var13, x16Var14, a26Var5, a26Var6, x16Var15, x16Var20, (a26) objR5, l46Var3, 16809984);
                                } else {
                                    l46Var3.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var2), l46Var2, 1572870, 60);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 806879280, 189);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(z63Var, localDate, localDate2, z63Var2, h73Var, h73Var2, h73Var3, i2, z2, list, z3, f2, j18Var, x16Var, q7bVar, x16Var2, x16Var3, x16Var4, x16Var5, x16Var6, a26Var, a26Var2, x16Var7, x16Var8, x16Var9, a26Var3, i3) { // from class: hn6
                public final /* synthetic */ q7b E0;
                public final /* synthetic */ x16 F0;
                public final /* synthetic */ x16 G0;
                public final /* synthetic */ x16 H0;
                public final /* synthetic */ x16 I0;
                public final /* synthetic */ x16 J0;
                public final /* synthetic */ a26 K0;
                public final /* synthetic */ a26 L0;
                public final /* synthetic */ x16 M0;
                public final /* synthetic */ x16 N0;
                public final /* synthetic */ x16 O0;
                public final /* synthetic */ a26 P0;
                public final /* synthetic */ float X;
                public final /* synthetic */ j18 Y;
                public final /* synthetic */ x16 Z;
                public final /* synthetic */ z63 b;
                public final /* synthetic */ LocalDate c;
                public final /* synthetic */ LocalDate d;
                public final /* synthetic */ z63 e;
                public final /* synthetic */ h73 f;
                public final /* synthetic */ h73 g;
                public final /* synthetic */ h73 v;
                public final /* synthetic */ int w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ List y;
                public final /* synthetic */ boolean z;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(32833);
                    n16.l(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void m(j09 j09Var, final long j2, rh5 rh5Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        j09 j09Var2;
        l46Var.h0(2049937985);
        int i3 = i2 | 6 | (l46Var.f(j2) ? 32 : 16) | (l46Var.g(rh5Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            g09 g09Var = g09.a;
            v70.c(y7h.d, k8b.g(b.c(g09Var, 1.0f), new n26() { // from class: kn6
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    j09 j09Var3 = (j09) obj;
                    l46 l46Var2 = (l46) obj2;
                    ((Integer) obj3).getClass();
                    j09Var3.getClass();
                    l46Var2.f0(-263824021);
                    j09 j09VarN = tm7.n(j09Var3, gec.N(0.0f, 14, t72.I(new y72(j2), new y72(y72.j))), null, 6);
                    l46Var2.r(false);
                    return j09VarN;
                }
            }, l46Var, 0), null, af1.b0(-1011962574, new ht5(x16Var, x16Var2, i4), l46Var), 0.0f, rh5Var, fdc.v(y72.j, 0L, 0L, 0L, l46Var, 62), l46Var, ((i3 << 9) & 458752) | 3078, 148);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ln6(j09Var2, j2, rh5Var, x16Var, x16Var2, i2);
        }
    }

    public static final a77 n(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new a77(i2, i3, ((int) (j3 >> 32)) + i2, ((int) (j3 & 4294967295L)) + i3);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:39:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final void o(fj8 fj8Var, j09 j09Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        boolean z2;
        ojb ojbVarV;
        g09 g09Var;
        j09 j09Var3;
        l46 l46Var2 = l46Var;
        fj8Var.getClass();
        l46Var2.h0(2128767520);
        if ((i2 & 6) == 0) {
            i4 = i2 | (l46Var2.e(fj8Var.ordinal()) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 == 0) {
            if ((i2 & 48) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var2.g(j09Var2) ? 32 : 16;
            }
            if ((i4 & 19) != 18) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var2.W(i4 & 1, z2)) {
                g09Var = g09.a;
                if (i5 != 0) {
                    j09Var3 = g09Var;
                } else {
                    j09Var3 = j09Var2;
                }
                c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09Var3);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(LayoutNode.h1);
                } else {
                    l46Var2.s0();
                }
                dec.l(hj6.z, l46Var2, c92VarA);
                dec.l(hj6.y, l46Var2, u8aVarM);
                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                dec.k(l46Var2);
                dec.l(hj6.x, l46Var2, j09VarJ);
                String strQ = afc.q(R.string.annual_luck_item_title, l46Var2);
                mue mueVar = pue.a;
                mue mueVarD = pue.d(l46Var2);
                pr4 pr4Var = l8b.a;
                nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarD, l46Var, 0, 0, 131066);
                o5c.f(l46Var, b.d(g09Var, 12.0f));
                feg.j(od4.A(fj8Var.b(), 0, l46Var), null, b.l(g09Var, 100.0f), null, null, 0.0f, null, l46Var, 440, 120);
                o5c.f(l46Var, b.d(g09Var, 12.0f));
                nte.b(afc.q(fj8Var.d(), l46Var), null, ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var), l46Var, 0, 0, 131066);
                o5c.f(l46Var, b.d(g09Var, 4.0f));
                nte.b(afc.q(fj8Var.e(), l46Var), null, ((e8b) l46Var.k(pr4Var)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
                o5c.f(l46Var, b.d(g09Var, 12.0f));
                nte.b(afc.q(fj8Var.c(), l46Var), null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var.k(pr4Var)).q, w6c.l(27), new ar5(600), null, cr5.c(), 0L, 0L, 0, 0, 0L, null, null, 16777176), l46Var, 0, 0, 130046);
                l46Var2 = l46Var;
                l46Var2.r(true);
                j09Var2 = j09Var3;
            } else {
                l46Var2.Z();
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new or1(fj8Var, j09Var2, i2, i3, 5);
            }
        }
        i4 |= 48;
        j09Var2 = j09Var;
        if ((i4 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var2.W(i4 & 1, z2)) {
            g09Var = g09.a;
            if (i5 != 0) {
                j09Var3 = g09Var;
            } else {
                j09Var3 = j09Var2;
            }
            c92 c92VarA2 = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09Var3);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA2);
            dec.l(hj6.y, l46Var2, u8aVarM2);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ2);
            String strQ2 = afc.q(R.string.annual_luck_item_title, l46Var2);
            mue mueVar2 = pue.a;
            mue mueVarD2 = pue.d(l46Var2);
            pr4 pr4Var2 = l8b.a;
            nte.b(strQ2, null, ((e8b) l46Var2.k(pr4Var2)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarD2, l46Var, 0, 0, 131066);
            o5c.f(l46Var, b.d(g09Var, 12.0f));
            feg.j(od4.A(fj8Var.b(), 0, l46Var), null, b.l(g09Var, 100.0f), null, null, 0.0f, null, l46Var, 440, 120);
            o5c.f(l46Var, b.d(g09Var, 12.0f));
            nte.b(afc.q(fj8Var.d(), l46Var), null, ((e8b) l46Var.k(pr4Var2)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var), l46Var, 0, 0, 131066);
            o5c.f(l46Var, b.d(g09Var, 4.0f));
            nte.b(afc.q(fj8Var.e(), l46Var), null, ((e8b) l46Var.k(pr4Var2)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
            o5c.f(l46Var, b.d(g09Var, 12.0f));
            nte.b(afc.q(fj8Var.c(), l46Var), null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var.k(pr4Var2)).q, w6c.l(27), new ar5(600), null, cr5.c(), 0L, 0L, 0, 0, 0L, null, null, 16777176), l46Var, 0, 0, 130046);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j09Var2 = j09Var3;
        } else {
            l46Var2.Z();
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new or1(fj8Var, j09Var2, i2, i3, 5);
        }
    }

    public static final void p(int i2, x16 x16Var, x16 x16Var2, l46 l46Var, j09 j09Var) {
        j09 j09Var2;
        int i3;
        g09 g09Var;
        pr4 pr4Var;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var2.h0(1807047029);
        int i4 = i2 | 6 | (l46Var2.i(x16Var) ? 32 : 16) | (l46Var2.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i4 & 1, (i4 & 147) != 146)) {
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new ef9(2, null);
                l46Var2.p0(objR);
            }
            af1.o((l26) objR, l46Var2, wef.a);
            ia7 ia7Var = ia7.a;
            g09 g09Var2 = g09.a;
            j09 j09VarE = oa7.E(urg.F(g09Var2, ia7Var), a7c.b(32.0f));
            pr4 pr4Var2 = l8b.a;
            j09 j09VarO = tm7.o(j09VarE, ((e8b) l46Var2.k(pr4Var2)).a, g21.f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z2 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var4 = hj6.z;
            dec.l(he2Var4, l46Var2, xn8VarC);
            he2 he2Var5 = hj6.y;
            dec.l(he2Var5, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var6 = hj6.X;
            dec.l(he2Var6, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var7 = hj6.x;
            dec.l(he2Var7, l46Var2, j09VarJ);
            boolean zE = k8b.e((e8b) l46Var2.k(pr4Var2));
            d31 d31Var = d31.a;
            if (zE) {
                l46Var2.f0(1572512941);
                he2Var2 = he2Var7;
                he2Var3 = he2Var6;
                g09Var = g09Var2;
                pr4Var = pr4Var2;
                he2Var = he2Var5;
                i3 = 0;
                feg.j(od4.A(R.drawable.bg_new_tarot_skins, 0, l46Var2), null, d31Var.b(g09Var2), null, an2.a, 0.0f, null, l46Var2, 24632, 104);
                l46Var2.r(false);
            } else {
                i3 = 0;
                g09Var = g09Var2;
                pr4Var = pr4Var2;
                he2Var = he2Var5;
                he2Var2 = he2Var7;
                he2Var3 = he2Var6;
                l46Var2.f0(1572722439);
                l46Var2.r(false);
            }
            j09 j09VarD0 = ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31Var.a(g09Var, ndb.d));
            int i5 = (i4 & 896) == 256 ? 1 : i3;
            Object objR2 = l46Var2.R();
            if (i5 != 0 || objR2 == i8cVar) {
                objR2 = new fn6(18, x16Var2);
                l46Var2.p0(objR2);
            }
            c8b.h(j09VarD0, false, 0L, 0L, null, (x16) objR2, l46Var, 0, 30);
            j09 j09VarZ = ynb.Z(g09Var, 32.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarZ);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, c92VarA);
            dec.l(he2Var, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var2, l46Var, j09VarJ2);
            pr4 pr4Var3 = pr4Var;
            feg.j(od4.A(k8b.e((e8b) l46Var.k(pr4Var3)) ? R.drawable.new_tarot_skins_banner : R.drawable.new_tarot_skins_banner_greyscale, i3, l46Var), null, null, null, null, 0.0f, null, l46Var, 56, 124);
            String strQ = afc.q(R.string.new_tarot_skins_popup_title, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var.k(pr4Var3)).q, 0L, ar5.y, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.n(l46Var), l46Var, 1572864, 0, 129850);
            nte.b(ks0.h(8.0f, R.string.new_tarot_skins_popup_desc, l46Var, l46Var, g09Var), null, ((e8b) l46Var.k(pr4Var3)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            String strH = ks0.h(24.0f, R.string.new_tarot_skins_popup_view_button, l46Var, l46Var, g09Var);
            j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
            boolean z3 = (i4 & 112) == 32;
            Object objR3 = l46Var.R();
            if (z3 || objR3 == i8cVar) {
                objR3 = new fn6(19, x16Var);
                l46Var.p0(objR3);
            }
            c8b.i(j09VarB, strH, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR3, l46Var, 6, 0, 4092);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o(j09Var2, x16Var, x16Var2, i2, 6);
        }
    }

    public static final void q(int i2, l46 l46Var) {
        l46Var.h0(-398779353);
        int i3 = 0;
        if (l46Var.W(i2 & 1, i2 != 0)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            Class<qna> cls = qna.class;
            qna qnaVar = (qna) z5c.G(job.a.b(qna.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            vma vmaVarI = qnaVar.i();
            Object obj = sf2.a;
            if (vmaVarI != null) {
                l46Var.f0(-974864647);
                boolean zI = l46Var.i(qnaVar);
                Object objR = l46Var.R();
                if (zI || objR == obj) {
                    Object yv9Var = new yv9(0, qnaVar, cls, "dismiss", "dismiss()V", 0, 3);
                    l46Var.p0(yv9Var);
                    objR = yv9Var;
                }
                s(vmaVarI, (x16) ((ym7) objR), l46Var, 0, 0);
                l46Var.r(false);
            } else {
                if (vmaVarI != null) {
                    throw tec.d(-974866426, l46Var, false);
                }
                l46Var.f0(-155971975);
                l46Var.r(false);
            }
            boolean zI2 = l46Var.i(qnaVar);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == obj) {
                objR2 = new cka(qnaVar, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, wef.a);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new aka(i2, i3);
        }
    }

    public static final void r(rz7 rz7Var, Object obj, int i2, Object obj2, l46 l46Var, int i3) {
        l46Var.h0(1439843069);
        int i4 = (l46Var.g(rz7Var) ? 4 : 2) | i3 | (l46Var.g(obj) ? 32 : 16) | (l46Var.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(obj2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            ((qcc) obj).b(obj2, af1.b0(980966366, new gc(rz7Var, i2, obj2, 28), l46Var), l46Var, 48);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(rz7Var, obj, i2, obj2, i3);
        }
    }

    public static final void s(vma vmaVar, x16 x16Var, l46 l46Var, int i2, int i3) {
        int i4;
        x16 x16Var2;
        l46Var.h0(-977568324);
        int i5 = (l46Var.g(vmaVar) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        int i7 = 16;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (l46Var.i(x16Var) ? 32 : 16);
        }
        int i8 = 0;
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            if (i6 != 0) {
                Object objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = new bca(i7);
                    l46Var.p0(objR);
                }
                x16Var2 = (x16) objR;
            } else {
                x16Var2 = x16Var;
            }
            wi.a(x16Var2, null, new s84(vmaVar.a, false, 4), af1.b0(-1730140606, new bka(vmaVar, x16Var2, (Context) l46Var.k(uq.b), i8), l46Var), l46Var, ((i4 >> 3) & 14) | 3072, 2);
        } else {
            l46Var.Z();
            x16Var2 = x16Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(vmaVar, x16Var2, i2, i3);
        }
    }

    public static final c78 u(boolean z2, boolean z3, boolean z4) {
        c78 c78VarW = t72.w();
        wg1 wg1Var = wg1.b;
        wg1 wg1Var2 = wg1.a;
        wg1 wg1Var3 = z2 ? wg1Var : wg1Var2;
        wg1 wg1Var4 = z2 ? wg1Var2 : wg1Var;
        if ((wg1Var3 == wg1Var && z4) || (wg1Var3 == wg1Var2 && z3)) {
            c78VarW.add(wg1Var3);
        }
        if ((wg1Var4 == wg1Var && z4) || (wg1Var4 == wg1Var2 && z3)) {
            c78VarW.add(wg1Var4);
        }
        return c78VarW.n();
    }

    public static String x(int i2, int i3, int i4, String str, String str2) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        int i6 = i3;
        boolean z2 = (i4 & 8) == 0;
        boolean z3 = (i4 & 16) == 0;
        boolean z4 = (i4 & 32) == 0;
        boolean z5 = (i4 & 64) == 0;
        str.getClass();
        return y(str, i5, i6, str2, z2, z3, z4, z5, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
    }

    public static String y(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z6 = (i4 & 8) != 0 ? false : z2;
        boolean z7 = (i4 & 16) != 0 ? false : z3;
        boolean z8 = (i4 & 64) == 0 ? z5 : false;
        str.getClass();
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || v4e.G(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z6 || (z7 && !I(iCharCount, length, str)))) || (iCodePointAt == 43 && z4)))) {
                f41 f41Var = new f41();
                f41Var.m1(i5, iCharCount, str);
                f41 f41Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z6 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            f41Var.n1("+");
                        } else if (iCodePointAt2 == 43 && z4) {
                            f41Var.n1(z6 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z8) || v4e.G(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z6 || (z7 && !I(iCharCount, length, str)))))) {
                            if (f41Var2 == null) {
                                f41Var2 = new f41();
                            }
                            f41Var2.o1(iCodePointAt2);
                            while (!f41Var2.E()) {
                                byte bH0 = f41Var2.h0();
                                f41Var.i1(37);
                                char[] cArr = H;
                                f41Var.i1(cArr[((bH0 & 255) >> 4) & 15]);
                                f41Var.i1(cArr[bH0 & 15]);
                            }
                        } else {
                            f41Var.o1(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                return f41Var.a1();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i5, length);
    }

    public static void z(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public abstract void t(htb htbVar, Object obj);

    public xb6 v(Context context, Looper looper, hbc hbcVar, Object obj, cc6 cc6Var, dc6 dc6Var) {
        return w(context, looper, hbcVar, obj, (rhg) cc6Var, (rhg) dc6Var);
    }

    public xb6 w(Context context, Looper looper, hbc hbcVar, Object obj, rhg rhgVar, rhg rhgVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
