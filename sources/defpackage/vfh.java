package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.q5;
import io.sentry.u5;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vfh {
    public static lp A = null;
    public static xl1 B = null;
    public static Boolean C = null;
    public static final dd2 b;
    public static final dd2 h;
    public static final dd2 i;
    public static final dd2 j;
    public static final dd2 k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;
    public static final byte[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final Object s;
    public static final Object t;
    public static final Object u;
    public static final Object v;
    public static final Object w;
    public static final float x = 24.0f;
    public static final float y = 24.0f;
    public static ks z;
    public static final dd2 a = new dd2(new ym0(24), false, 1692011066);
    public static final dd2 c = new dd2(new ym0(25), false, -1524733105);
    public static final dd2 d = new dd2(new ym0(26), false, 1446103915);
    public static final dd2 e = new dd2(new a7(16), false, 2117753912);
    public static final dd2 f = new dd2(new ym0(27), false, 1516462809);
    public static final dd2 g = new dd2(new a7(17), false, -132442266);

    static {
        int i2 = 15;
        b = new dd2(new a7(i2), false, 2086693069);
        new dd2(new a7(18), false, -901043300);
        h = new dd2(new ym0(28), false, -373554940);
        i = new dd2(new xd2(10), false, -733456986);
        j = new dd2(new xd2(11), false, 2049978664);
        k = new dd2(new de2(i2), false, 1619018896);
        l = new byte[]{48, 49, 53, 0};
        m = new byte[]{48, 49, 48, 0};
        n = new byte[]{48, 48, 57, 0};
        o = new byte[]{48, 48, 53, 0};
        p = new byte[]{48, 48, 49, 0};
        q = new byte[]{48, 48, 49, 0};
        r = new byte[]{48, 48, 50, 0};
        s = new Object();
        t = new Object();
        u = new Object();
        v = new Object();
        w = new Object();
    }

    public static boolean A(h7f h7fVar, w4c w4cVar, k7f k7fVar) {
        r8f r8fVar = h7fVar.c;
        if (r8fVar.x(w4cVar)) {
            return true;
        }
        if (r8fVar.z0(w4cVar)) {
            return false;
        }
        if (h7fVar.b) {
            r8fVar.S(w4cVar);
        }
        return r8fVar.c0(r8fVar.G(w4cVar), k7fVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0031  */
    /* JADX WARN: Code duplicated, block: B:26:0x003b  */
    public static boolean B(ryb rybVar, btb btbVar) {
        String strC;
        btbVar.getClass();
        int i2 = rybVar.d;
        if (i2 != 200 && i2 != 410 && i2 != 414 && i2 != 501 && i2 != 203 && i2 != 204) {
            if (i2 == 307) {
                strC = rybVar.f.c("Expires");
                if (strC == null) {
                    strC = null;
                }
                if (strC == null && rybVar.b().c == -1 && !rybVar.b().f && !rybVar.b().e) {
                    return false;
                }
            } else if (i2 != 308 && i2 != 404 && i2 != 405) {
                switch (i2) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        strC = rybVar.f.c("Expires");
                        if (strC == null) {
                            strC = null;
                        }
                        if (strC == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if (rybVar.b().b) {
            return false;
        }
        c81 c81VarK = btbVar.f;
        if (c81VarK == null) {
            int i3 = c81.n;
            c81VarK = rxg.K(btbVar.c);
            btbVar.f = c81VarK;
        }
        return !c81VarK.b;
    }

    public static boolean C(int i2) {
        switch (Character.getType(i2)) {
            default:
                if (i2 != 36 && i2 != 43 && i2 != 94 && i2 != 96 && i2 != 124 && i2 != 126) {
                    switch (i2) {
                        case 60:
                        case 61:
                        case 62:
                            break;
                        default:
                            return false;
                    }
                }
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return true;
        }
    }

    public static boolean D(int i2) {
        return i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32 || Character.getType(i2) == 12;
    }

    public static final j09 E(j09 j09Var, Object obj) {
        return j09Var.D(new fv7(obj));
    }

    public static final rv F(x16 x16Var, l46 l46Var, int i2) {
        View view = (View) l46Var.k(uq.f);
        boolean zG = l46Var.g(view);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (zG || objR == obj) {
            objR = new rv(view, null, x16Var);
            l46Var.p0(objR);
        }
        rv rvVar = (rv) objR;
        boolean zI = l46Var.i(rvVar);
        Object objR2 = l46Var.R();
        if (zI || objR2 == obj) {
            objR2 = new lv(rvVar, 3);
            l46Var.p0(objR2);
        }
        af1.g(rvVar, (a26) objR2, l46Var);
        return rvVar;
    }

    public static final Object G(Object obj) {
        return obj instanceof eb2 ? jzb.k(((eb2) obj).a) : obj;
    }

    public static final e89 H(Object[] objArr, odc odcVar, x16 x16Var, l46 l46Var) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        odcVar.getClass();
        return (e89) K(objArrCopyOf, new vea(7, new wf8(16, odcVar), new ckb(1, odcVar)), x16Var, l46Var, 3456, 0);
    }

    public static final Object I(Object[] objArr, x16 x16Var, l46 l46Var, int i2) {
        return K(Arrays.copyOf(objArr, objArr.length), qk2.Z, x16Var, l46Var, ((i2 << 6) & 7168) | 384, 0);
    }

    public static final Object J(Object[] objArr, odc odcVar, x16 x16Var, l46 l46Var, int i2) {
        return K(Arrays.copyOf(objArr, objArr.length), odcVar, x16Var, l46Var, (i2 & 112) | 384 | ((i2 << 3) & 7168), 0);
    }

    public static final Object K(Object[] objArr, odc odcVar, x16 x16Var, l46 l46Var, int i2, int i3) {
        Object[] objArr2;
        odc odcVar2;
        Object obj;
        Object objE;
        long j2 = l46Var.T;
        tq.o(36);
        String string = Long.toString(j2, 36);
        string.getClass();
        odcVar.getClass();
        ucc uccVar = (ucc) l46Var.k(wcc.a);
        Object objR = l46Var.R();
        Object obj2 = sf2.a;
        if (objR == obj2) {
            Object objV = (uccVar == null || (objE = uccVar.e(string)) == null) ? null : odcVar.v(objE);
            if (objV == null) {
                objV = x16Var.invoke();
            }
            objArr2 = objArr;
            odcVar2 = odcVar;
            Object pccVar = new pcc(odcVar2, uccVar, string, objV, objArr2);
            l46Var.p0(pccVar);
            objR = pccVar;
        } else {
            objArr2 = objArr;
            odcVar2 = odcVar;
        }
        pcc pccVar2 = (pcc) objR;
        Object objInvoke = Arrays.equals(objArr2, pccVar2.e) ? pccVar2.d : null;
        if (objInvoke == null) {
            objInvoke = x16Var.invoke();
        }
        boolean zI = l46Var.i(pccVar2) | ((((i2 & 112) ^ 48) > 32 && l46Var.i(odcVar2)) || (i2 & 48) == 32) | l46Var.i(uccVar) | l46Var.g(string) | l46Var.i(objInvoke) | l46Var.i(objArr2);
        Object objR2 = l46Var.R();
        if (zI || objR2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object xi3Var = new xi3(pccVar2, odcVar2, uccVar, string, obj, objArr3, 4);
            l46Var.p0(xi3Var);
            objR2 = xi3Var;
        } else {
            obj = objInvoke;
        }
        af1.u((x16) objR2, l46Var);
        return obj;
    }

    public static final void L(rr9 rr9Var, int i2, Object obj) {
        rr9Var.p[(rr9Var.q - rr9Var.l[rr9Var.m - 1].c) + i2] = obj;
    }

    public static final void M(rr9 rr9Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = rr9Var.q - rr9Var.l[rr9Var.m - 1].c;
        Object[] objArr = rr9Var.p;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static final void N(rr9 rr9Var, Object obj, Object obj2, Object obj3) {
        int i2 = rr9Var.q - rr9Var.l[rr9Var.m - 1].c;
        Object[] objArr = rr9Var.p;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        objArr[i2 + 2] = obj3;
    }

    public static int O(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int P(CharSequence charSequence, int i2, int i3) {
        while (i2 >= i3) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i2;
            }
            i2--;
        }
        return i3 - 1;
    }

    public static tf7 Q(t8f t8fVar, boolean z2, my7 my7Var, int i2) {
        boolean z3 = (i2 & 1) != 0 ? false : z2;
        boolean z4 = (i2 & 2) == 0;
        if ((i2 & 4) != 0) {
            my7Var = null;
        }
        return new tf7(t8fVar, z4, z3, my7Var != null ? n3d.p(my7Var) : null, 34);
    }

    public static final long R(long j2) {
        qfc qfcVar = ar4.b;
        boolean z2 = j2 > 0;
        if (z2) {
            return ar4.d(ar4.g(j2, y41.U(999999L, gr4.NANOSECONDS)));
        }
        if (!z2) {
            return 0L;
        }
        ap.c();
        return 0L;
    }

    public static final Object S(da9 da9Var, em7 em7Var) {
        da9Var.getClass();
        em7Var.getClass();
        Bundle bundleA = da9Var.v.a();
        if (bundleA == null) {
            bundleA = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
        }
        Map mapD = da9Var.b.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(mapD.size()));
        for (Map.Entry entry : mapD.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((ca9) entry.getValue()).a);
        }
        return hfc.l(em7Var).c(new g7c(bundleA, linkedHashMap));
    }

    public static final void a(int i2, x16 x16Var, l46 l46Var, String str, boolean z2) {
        boolean z3;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        l46Var2.h0(761615548);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var2.h(z2) ? 32 : 16) | (l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, b.c(androidx.compose.foundation.layout.b.d(g09.a, 64.0f), false, null, null, x16Var, 15), 2);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
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
            nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b4d.m(l46Var2), l46Var2, i3 & 14, 0, 131070);
            l46Var2 = l46Var2;
            o5c.f(l46Var2, new jw7(1.0f, true));
            z3 = z2;
            fu6.a(z3, null, l46Var2, (i3 >> 3) & 14);
            l46Var2.r(true);
        } else {
            z3 = z2;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ku7(str, z3, x16Var, i2, 0);
        }
    }

    public static final void b(List list, List list2, boolean z2, x16 x16Var, j09 j09Var, boolean z3, String str, l46 l46Var, int i2) {
        j09 j09Var2;
        TarotSkinIdentify tarotSkinIdentifyN;
        list.getClass();
        list2.getClass();
        x16Var.getClass();
        l46Var.h0(-1111934);
        int i3 = i2 | (l46Var.g(list) ? 4 : 2) | (l46Var.g(list2) ? 32 : 16) | (l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | 24576 | (l46Var.h(z3) ? 131072 : 65536) | (l46Var.g(str) ? 1048576 : 524288);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
            pr4 pr4Var = snd.a;
            die dieVar = (die) l46Var.k(pr4Var);
            mfc mfcVar = ((e8b) l46Var.k(l8b.a)).C;
            if (str == null || (tarotSkinIdentifyN = r8c.n(str, mfcVar)) == null) {
                tarotSkinIdentifyN = dieVar.a;
            }
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            xn8 xn8VarC = s21.c(ndb.b, false);
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
            mh3.a(pr4Var.a(die.a(dieVar, tarotSkinIdentifyN)), af1.b0(1134162760, new x6(list2, list, x16Var, 26), l46Var), l46Var, 56);
            lx0 lx0Var = ndb.w;
            d31 d31Var = d31.a;
            g09 g09Var = g09.a;
            j09 j09VarC = androidx.compose.foundation.layout.b.c(d31Var.a(g09Var, lx0Var), 1.0f);
            j09Var2 = g09Var;
            oa7.b(pa7.p(j09VarC, z3 ? 0.0f : 1.0f), 0L, 0.0f, af1.b0(2111943756, new em4(i4, x16Var, z2, z3), l46Var), l46Var, 3072, 6);
            l46Var.r(true);
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new we3(list, list2, z2, x16Var, j09Var2, z3, str, i2);
        }
    }

    public static final o85 c(a26 a26Var) {
        o85 o85Var = new o85();
        a26Var.d(o85Var);
        return new o85(o85Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(j09 j09Var, List list, l46 l46Var, int i2) {
        l46 l46Var2;
        l46 l46Var3 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var3.h0(1220613319);
        int i3 = i2 | (l46Var3.g(list) ? 32 : 16);
        int i4 = 0;
        boolean z2 = true;
        if (l46Var3.W(i3 & 1, (i3 & 19) != 18)) {
            float f2 = 1.0f;
            j09 j09VarZ = ynb.Z(tm7.n(db6.w(oa7.E(j09Var, a7c.b(30.0f)), 1.0f, ((e8b) l46Var3.k(l8b.a)).a, a7c.b(30.0f)), kj0.i0(l46Var3), null, 6), 24.0f);
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i4)), ndb.Y, l46Var3, 6);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarZ);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z3 = l46Var3.S;
            x16 x16Var = LayoutNode.h1;
            if (z3) {
                l46Var3.l(x16Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, c92VarA);
            dec.l(he2Var3, l46Var3, u8aVarM);
            ib8.s(iHashCode, l46Var3, he2Var2, l46Var3);
            Iterator itS = kv2.s(l46Var3, j09VarJ, he2Var, 1500460025, list);
            l46 l46Var4 = l46Var3;
            while (itS.hasNext()) {
                String str = (String) itS.next();
                g09 g09Var = g09.a;
                j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, f2);
                t7c t7cVarA = s7c.a(new uc0(16.0f, z2, new qc0(i4)), ndb.z, l46Var4, 54);
                int iHashCode2 = Long.hashCode(l46Var4.T);
                u8a u8aVarM2 = l46Var4.m();
                j09 j09VarJ2 = m93.J(l46Var4, j09VarC);
                lf2.q.getClass();
                l46Var4.j0();
                if (l46Var4.S) {
                    l46Var4.l(x16Var);
                } else {
                    l46Var4.s0();
                }
                dec.l(he2Var4, l46Var4, t7cVarA);
                dec.l(he2Var3, l46Var4, u8aVarM2);
                ib8.s(iHashCode2, l46Var4, he2Var2, l46Var4);
                dec.l(he2Var, l46Var4, j09VarJ2);
                j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.l(g09Var, 8.0f), a7c.a);
                b1b b1bVar = l8b.a;
                s21.a(tm7.o(j09VarE, ((e8b) l46Var4.k(b1bVar)).i, g21.f), l46Var4, 0);
                boolean z4 = z2;
                nte.b(str, null, ((e8b) l46Var4.k(b1bVar)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a, l46Var, 0, 0, 131066);
                l46 l46Var5 = l46Var;
                l46Var5.r(z4);
                i4 = 0;
                z2 = z4;
                he2Var2 = he2Var2;
                he2Var3 = he2Var3;
                f2 = 1.0f;
                he2Var = he2Var;
                x16Var = x16Var;
                he2Var4 = he2Var4;
                l46Var4 = l46Var5;
            }
            l46Var4.r(i4);
            l46Var4.r(z2);
            l46Var2 = l46Var4;
        } else {
            l46Var3.Z();
            l46Var2 = l46Var3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o14(j09Var, list, i2, 18);
        }
    }

    public static final void e(Locale locale, boolean z2, a26 a26Var, l46 l46Var, int i2) {
        String displayLanguage;
        String strValueOf;
        l46Var.h0(855048964);
        int i3 = (l46Var.g(locale) ? 4 : 2) | i2 | (l46Var.h(z2) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            String languageTag = locale.toLanguageTag();
            if (pa7.t(languageTag, "zh-TW")) {
                displayLanguage = "中文（繁体）";
            } else if (pa7.t(languageTag, "zh")) {
                displayLanguage = "中文（简体）";
            } else {
                displayLanguage = locale.getDisplayLanguage(locale);
                displayLanguage.getClass();
                if (displayLanguage.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = displayLanguage.charAt(0);
                    if (Character.isLowerCase(cCharAt)) {
                        String strValueOf2 = String.valueOf(cCharAt);
                        strValueOf2.getClass();
                        strValueOf = strValueOf2.toUpperCase(locale);
                        strValueOf.getClass();
                        if (strValueOf.length() <= 1) {
                            String strValueOf3 = String.valueOf(cCharAt);
                            strValueOf3.getClass();
                            String upperCase = strValueOf3.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            if (strValueOf.equals(upperCase)) {
                                strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                            }
                        } else if (cCharAt != 329) {
                            char cCharAt2 = strValueOf.charAt(0);
                            String lowerCase = strValueOf.substring(1).toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            strValueOf = cCharAt2 + lowerCase;
                        }
                    } else {
                        strValueOf = String.valueOf(cCharAt);
                    }
                    sb.append((Object) strValueOf);
                    sb.append(displayLanguage.substring(1));
                    displayLanguage = sb.toString();
                }
            }
            boolean z3 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object objR = l46Var.R();
            if (z3 || objR == sf2.a) {
                objR = new jf6(13, a26Var, locale);
                l46Var.p0(objR);
            }
            a(i3 & 112, (x16) objR, l46Var, displayLanguage, z2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kg(locale, z2, a26Var, i2, 9);
        }
    }

    public static final void f(Locale locale, a26 a26Var, l46 l46Var, int i2) {
        l46Var.h0(-1208184020);
        int i3 = 4;
        int i4 = (l46Var.g(locale) ? 4 : 2) | i2 | (l46Var.i(a26Var) ? 32 : 16);
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(locale);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            j09 j09VarB0 = ynb.b0(0.0f, 24.0f, g09.a, 1);
            boolean z2 = (i4 & 112) == 32;
            Object objR2 = l46Var.R();
            if (z2 || objR2 == i8cVar) {
                objR2 = new yx1(a26Var, e89Var, 8);
                l46Var.p0(objR2);
            }
            af1.s(j09VarB0, null, null, null, null, null, false, null, (a26) objR2, l46Var, 6, 510);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rk6(locale, a26Var, i2, i3);
        }
    }

    public static final void g(x16 x16Var, Locale locale, a26 a26Var, l46 l46Var, int i2) {
        l46Var.h0(-2084971747);
        int i3 = i2 | (l46Var.i(x16Var) ? 4 : 2) | (l46Var.g(locale) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            nae.a(androidx.compose.foundation.layout.b.c, null, ((m82) l46Var.k(o82.a)).n, 0L, 0.0f, 0.0f, null, af1.b0(123650872, new ju7(locale, x16Var, a26Var), l46Var), l46Var, 12582918, 122);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ju7(x16Var, locale, a26Var, i2);
        }
    }

    public static final void h(final j2a j2aVar, final boolean z2, final boolean z3, final int i2, final int i3, final boolean z4, final String str, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, x16 x16Var4, l46 l46Var, final int i4) {
        x16 x16Var5;
        g09 g09Var;
        float f2;
        int i5;
        boolean z5;
        int i6;
        l46 l46Var2 = l46Var;
        y02 y02Var = g21.f;
        l46Var2.h0(-520571472);
        int i7 = i4 | (l46Var2.e(j2aVar.ordinal()) ? 4 : 2) | (l46Var2.h(z2) ? 32 : 16) | (l46Var2.h(z3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.e(i3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.h(z4) ? 131072 : 65536) | (l46Var2.g(str) ? 1048576 : 524288) | (l46Var2.i(x16Var) ? 8388608 : 4194304) | (l46Var2.i(x16Var2) ? 67108864 : 33554432) | (l46Var2.i(x16Var3) ? 536870912 : 268435456);
        if (l46Var2.W(i7 & 1, (306782355 & i7) != 306782354)) {
            g09 g09Var2 = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(32.0f, 0.0f, ynb.d0(0.0f, 16.0f, 0.0f, 0.0f, 13, mh3.N(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f))), 2));
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD0);
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
            int iOrdinal = j2aVar.ordinal();
            i8c i8cVar = sf2.a;
            if (iOrdinal == 0) {
                l46Var2.f0(1906975143);
                j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var2, 1.0f);
                String strQ = afc.q(R.string.photo_recognize_btn, l46Var2);
                boolean z6 = (i7 & 1879048192) == 536870912;
                Object objR = l46Var2.R();
                if (z6 || objR == i8cVar) {
                    objR = new fn6(28, x16Var3);
                    l46Var2.p0(objR);
                }
                ym8.h(j09VarC, false, strQ, false, (x16) objR, l46Var2, 6, 10);
                l46Var2 = l46Var2;
                j09 j09VarC2 = androidx.compose.foundation.layout.b.c(g09Var2, 1.0f);
                String strQ2 = afc.q(R.string.photo_deck_select_btn, l46Var2);
                Object objR2 = l46Var2.R();
                if (objR2 == i8cVar) {
                    x16Var5 = x16Var4;
                    objR2 = new fn6(29, x16Var5);
                    l46Var2.p0(objR2);
                } else {
                    x16Var5 = x16Var4;
                }
                ym8.i(j09VarC2, strQ2, false, (x16) objR2, l46Var2, 6, 4);
                l46Var2.r(false);
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    throw tec.d(-77030926, l46Var2, false);
                }
                l46Var2.f0(1907812763);
                if (z4) {
                    l46Var2.f0(1907777175);
                    hfc.a(((i7 >> 18) & 14) | 48, l46Var2, androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), str);
                    l46Var2.r(false);
                    z5 = false;
                    g09Var = g09Var2;
                    f2 = 1.0f;
                    i5 = 1879048192;
                } else if (x16Var2 != null) {
                    l46Var2.f0(1907986673);
                    i5 = 1879048192;
                    j09 j09VarB = androidx.compose.foundation.layout.b.b(0.0f, 56.0f, androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), 1);
                    String strQ3 = afc.q(R.string.add_more_info_for_reading, l46Var2);
                    x4d x4dVar = eze.a(l46Var2).a.a;
                    x4dVar.getClass();
                    if (we6.e(l46Var2)) {
                        x4dVar = y02Var;
                    }
                    boolean z7 = (i7 & 234881024) == 67108864;
                    Object objR3 = l46Var2.R();
                    if (z7 || objR3 == i8cVar) {
                        i6 = 0;
                        objR3 = new yca(i6, x16Var2);
                        l46Var2.p0(objR3);
                    } else {
                        i6 = 0;
                    }
                    int i8 = ((i7 << 15) & 3670016) | 6;
                    g09Var = g09Var2;
                    f2 = 1.0f;
                    c8b.i(j09VarB, strQ3, null, null, 0L, 0.0f, z2, x4dVar, null, false, null, null, (x16) objR3, l46Var, i8, 0, 3900);
                    j09 j09VarB2 = androidx.compose.foundation.layout.b.b(0.0f, 56.0f, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 1);
                    String strQ4 = afc.q(R.string.start_reading_directly, l46Var);
                    x4d x4dVar2 = eze.a(l46Var).a.a;
                    x4dVar2.getClass();
                    x4d x4dVar3 = we6.e(l46Var) ? y02Var : x4dVar2;
                    u51 u51VarL = c8b.l(l46Var);
                    boolean z8 = (i7 & 29360128) == 8388608;
                    Object objR4 = l46Var.R();
                    if (z8 || objR4 == i8cVar) {
                        objR4 = new yca(1, x16Var);
                        l46Var.p0(objR4);
                    }
                    c8b.i(j09VarB2, strQ4, null, null, 0L, 0.0f, z2, x4dVar3, u51VarL, false, null, null, (x16) objR4, l46Var, i8, 0, 3644);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                    z5 = false;
                } else {
                    g09Var = g09Var2;
                    f2 = 1.0f;
                    i5 = 1879048192;
                    l46Var2.f0(1909168331);
                    j09 j09VarB3 = androidx.compose.foundation.layout.b.b(0.0f, 56.0f, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 1);
                    String strQ5 = afc.q(i3, l46Var2);
                    boolean z9 = (i7 & 29360128) == 8388608;
                    Object objR5 = l46Var2.R();
                    if (z9 || objR5 == i8cVar) {
                        objR5 = new yca(2, x16Var);
                        l46Var2.p0(objR5);
                    }
                    z5 = false;
                    c8b.i(j09VarB3, strQ5, null, null, 0L, 0.0f, z2, null, null, false, null, null, (x16) objR5, l46Var, ((i7 << 15) & 3670016) | 6, 0, 4028);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                }
                if (!z3 || z4) {
                    l46Var2.f0(1910123720);
                    l46Var2.r(z5);
                } else {
                    l46Var2.f0(1909722022);
                    j09 j09VarC3 = androidx.compose.foundation.layout.b.c(g09Var, f2);
                    String strQ6 = afc.q(R.string.photo_retake, l46Var2);
                    boolean z10 = (i7 & i5) == 536870912 ? true : z5;
                    Object objR6 = l46Var2.R();
                    if (z10 || objR6 == i8cVar) {
                        objR6 = new yca(3, x16Var3);
                        l46Var2.p0(objR6);
                    }
                    ym8.i(j09VarC3, strQ6, false, (x16) objR6, l46Var2, 6, 4);
                    l46Var2.r(z5);
                }
                l46Var2.r(z5);
                x16Var5 = x16Var4;
            }
            l46Var2.r(true);
        } else {
            x16Var5 = x16Var4;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final x16 x16Var6 = x16Var5;
            ojbVarV.d = new l26(z2, z3, i2, i3, z4, str, x16Var, x16Var2, x16Var3, x16Var6, i4) { // from class: zca
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ String g;
                public final /* synthetic */ x16 v;
                public final /* synthetic */ x16 w;
                public final /* synthetic */ x16 x;
                public final /* synthetic */ x16 y;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    vfh.h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void i(List list, List list2, l26 l26Var, final a26 a26Var, final x16 x16Var, a26 a26Var2, List list3, x16 x16Var2, boolean z2, boolean z3, final boolean z4, final String str, int i2, l46 l46Var, int i3, int i4) {
        boolean z5;
        boolean z6;
        a26 a26Var3;
        int i5;
        boolean z7;
        int i6;
        final a26 a26Var4;
        Object value;
        ArrayList arrayList;
        list.getClass();
        list2.getClass();
        l26Var.getClass();
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(754509456);
        int i7 = ((i3 & 6) == 0 ? i3 | (l46Var.g(list) ? 4 : 2) : i3) | (l46Var.g(list2) ? 32 : 16) | (l46Var.i(l26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i8 = i4 & 32;
        int i9 = (i8 != 0 ? i7 | 196608 : i7 | (l46Var.i(a26Var2) ? 131072 : 65536)) | (l46Var.g(list3) ? 1048576 : 524288) | (l46Var.i(x16Var2) ? 8388608 : 4194304);
        int i10 = i4 & 256;
        if (i10 != 0) {
            i9 |= 100663296;
            z5 = z2;
        } else {
            z5 = z2;
            if ((i3 & 100663296) == 0) {
                i9 |= l46Var.h(z5) ? 67108864 : 33554432;
            }
        }
        int i11 = i4 & 512;
        if (i11 != 0) {
            i9 |= 805306368;
            z6 = z3;
        } else {
            z6 = z3;
            if ((i3 & 805306368) == 0) {
                i9 |= l46Var.h(z6) ? 536870912 : 268435456;
            }
        }
        if (l46Var.W(i9 & 1, ((i9 & 306783379) == 306783378 && ((((l46Var.h(z4) ? (char) 4 : (char) 2) | (l46Var.g(str) ? ' ' : (char) 16)) | (((i4 & 4096) != 0 || !l46Var.e(i2)) ? UserMetadata.MAX_ROLLOUT_ASSIGNMENTS : 256)) & 147) == 146) ? false : true)) {
            l46Var.b0();
            if ((i3 & 1) == 0 || l46Var.C()) {
                a26 a26Var5 = i8 != 0 ? null : a26Var2;
                if (i10 != 0) {
                    z5 = false;
                }
                if (i11 != 0) {
                    z6 = true;
                }
                i6 = (i4 & 4096) != 0 ? R.string.photo_start_reading : i2;
                a26Var4 = a26Var5;
            } else {
                l46Var.Z();
                a26Var4 = a26Var2;
                i6 = i2;
            }
            final boolean z8 = z6;
            boolean z9 = z5;
            l46Var.s();
            int i12 = i9 & 112;
            boolean z10 = ((i9 & 14) == 4) | (i12 == 32);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z10 || objR == obj) {
                objR = new ek9(13, list, list2);
                l46Var.p0(objR);
            }
            x16 x16Var3 = (x16) objR;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final eda edaVar = (eda) z5c.G(job.a.b(eda.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var3);
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            final e89 e89Var = (e89) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = kv2.f(-1, l46Var);
            }
            final s69 s69Var = (s69) objR3;
            final ted tedVarF = zz8.f(6, 2, null, l46Var);
            Object objR4 = l46Var.R();
            if (objR4 == obj) {
                objR4 = af1.E(l46Var);
                l46Var.p0(objR4);
            }
            final aw2 aw2Var = (aw2) objR4;
            final e89 e89VarT = tm7.t(edaVar.c, l46Var);
            final j2a j2aVarB = (z9 && ((dda) e89VarT.getValue()).b() == j2a.a) ? j2a.b : ((dda) e89VarT.getValue()).b();
            af afVar = new af(3);
            boolean zG = ((i9 & 896) == 256) | l46Var.g(e89VarT);
            Object objR5 = l46Var.R();
            if (zG || objR5 == obj) {
                objR5 = new kz8(21, l26Var, e89VarT);
                l46Var.p0(objR5);
            }
            final yk8 yk8VarP = qn4.P(afVar, (a26) objR5, l46Var);
            boolean z11 = ((3670016 & i9) == 1048576) | (i12 == 32);
            Object objR6 = l46Var.R();
            if (z11 || objR6 == obj) {
                if (list3 != null && !list3.isEmpty()) {
                    if (list2.size() != ((dda) e89VarT.getValue()).a.size()) {
                        s0e s0eVar = edaVar.b;
                        do {
                            value = s0eVar.getValue();
                            int size = list2.size();
                            arrayList = new ArrayList(size);
                            for (int i13 = 0; i13 < size; i13++) {
                                arrayList.add(null);
                            }
                            int i14 = 0;
                            for (Object obj2 : s72.c1(list3, list2.size())) {
                                int i15 = i14 + 1;
                                if (i14 < 0) {
                                    t72.Z();
                                    throw null;
                                }
                                arrayList.set(i14, (TarotCardChoice) obj2);
                                i14 = i15;
                            }
                        } while (!s0eVar.l(value, new dda(list2, arrayList, false)));
                    } else {
                        edaVar.f(list3, true);
                    }
                    x16Var2.invoke();
                }
                l46Var.p0(wef.a);
            }
            final int i16 = i6;
            bzd.l(null, ((Boolean) edaVar.d.getValue()).booleanValue(), 0L, null, null, af1.b0(-178127020, new n26() { // from class: ada
                @Override // defpackage.n26
                public final Object m(Object obj3, Object obj4, Object obj5) {
                    e89 e89Var2;
                    l46 l46Var2 = (l46) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((c31) obj3).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        FillElement fillElement = androidx.compose.foundation.layout.b.c;
                        dd2 dd2VarB0 = af1.b0(1501303832, new mb0(x16Var, z8, 7), l46Var2);
                        j2a j2aVar = j2aVarB;
                        int i17 = i16;
                        boolean z12 = z4;
                        String str2 = str;
                        a26 a26Var6 = a26Var;
                        h0e h0eVar = e89VarT;
                        a26 a26Var7 = a26Var4;
                        yk8 yk8Var = yk8VarP;
                        s69 s69Var2 = s69Var;
                        e89 e89Var3 = e89Var;
                        dd2 dd2VarB1 = af1.b0(-1696345575, new nb(j2aVar, i17, z12, str2, a26Var6, h0eVar, a26Var7, yk8Var, s69Var2, e89Var3), l46Var2);
                        eda edaVar2 = edaVar;
                        xdc.a(fillElement, dd2VarB0, dd2VarB1, null, null, 0, 0L, 0L, null, af1.b0(-359709981, new n50(j2aVar, edaVar2, h0eVar, s69Var2, e89Var3, 9), l46Var2), l46Var2, 805306806, 504);
                        if (((Boolean) e89Var3.getValue()).booleanValue()) {
                            l46Var2.f0(2000352269);
                            boolean z13 = ((sz9) s69Var2).j() >= 0;
                            ArrayList arrayListT0 = s72.t0(((dda) h0eVar.getValue()).b);
                            ArrayList arrayList2 = new ArrayList(t72.u(arrayListT0, 10));
                            Iterator it = arrayListT0.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((TarotCardChoice) it.next()).getCard());
                            }
                            Set setO1 = s72.o1(arrayList2);
                            j09 j09VarW = mh3.W(g09.a);
                            long j2 = ((e8b) l46Var2.k(l8b.a)).a;
                            y6c y6cVarD = a7c.d(16.0f, 16.0f, 0.0f, 12);
                            Object objR7 = l46Var2.R();
                            if (objR7 == sf2.a) {
                                e89Var2 = e89Var3;
                                objR7 = new x08(e89Var2, 24);
                                l46Var2.p0(objR7);
                            } else {
                                e89Var2 = e89Var3;
                            }
                            db9 db9Var = new db9(29);
                            aw2 aw2Var2 = aw2Var;
                            ted tedVar = tedVarF;
                            zz8.a((x16) objR7, j09VarW, tedVar, 0.0f, false, y6cVarD, j2, 0L, 0L, null, db9Var, null, af1.b0(1221518861, new bda(z13, setO1, edaVar2, aw2Var2, tedVar, h0eVar, e89Var2, s69Var2), l46Var2), l46Var2, 6, 3072, 6040);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(2001552558);
                            l46Var2.r(false);
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 1572864, 61);
            z7 = z9;
            z6 = z8;
            i5 = i16;
            a26Var3 = a26Var4;
        } else {
            l46Var.Z();
            a26Var3 = a26Var2;
            i5 = i2;
            z7 = z5;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new d8(list, list2, l26Var, a26Var, x16Var, a26Var3, list3, x16Var2, z7, z6, z4, str, i5, i3, i4);
        }
    }

    public static final void j(j2a j2aVar, int i2, l46 l46Var, int i3) {
        String strR;
        String strI;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1662401418);
        int i4 = i3 | (l46Var2.e(j2aVar.ordinal()) ? 4 : 2) | (l46Var2.e(i2) ? 32 : 16);
        if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
            int iOrdinal = j2aVar.ordinal();
            if (iOrdinal == 0) {
                l46Var2.f0(160075376);
                strR = afc.r(R.string.photo_pick_number_card, new Object[]{Integer.valueOf(i2)}, l46Var2);
                l46Var2.r(false);
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    throw tec.d(160074143, l46Var2, false);
                }
                strR = tec.i(l46Var2, 160078882, R.string.photo_confirm_title, l46Var2, false);
            }
            int iOrdinal2 = j2aVar.ordinal();
            if (iOrdinal2 == 0) {
                strI = tec.i(l46Var2, 160082526, R.string.photo_draw_hint, l46Var2, false);
            } else {
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw tec.d(160081296, l46Var2, false);
                }
                strI = tec.i(l46Var2, 160085477, R.string.photo_confirm_subtitle, l46Var2, false);
            }
            String str = strI;
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(32.0f, 0.0f, g09Var, 2);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
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
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            pr4 pr4Var = nte.a;
            mue mueVar = (mue) l46Var2.k(pr4Var);
            cq5 cq5VarB = cr5.b();
            pr4 pr4Var2 = o82.a;
            String str2 = strR;
            nte.b(str2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVar, y72.b(((m82) l46Var2.k(pr4Var2)).q, 0.88f), w6c.l(27), ar5.y, cq5VarB, w6c.i(0.006d), null, 3, w6c.k(40.5d), null, null, 16613208), l46Var, 0, 0, 131070);
            o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09Var, 8.0f));
            nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var.k(pr4Var), y72.b(((m82) l46Var.k(pr4Var2)).q, 0.6f), w6c.l(14), null, null, 0L, null, 3, 0L, null, null, 16744444), l46Var, 0, 0, 131070);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new st5(j2aVar, i2, i3);
        }
    }

    public static final void k(j09 j09Var, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            l(j09Var, dd2Var, l46Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sv(j09Var, dd2Var, i2, i4);
        }
    }

    public static final void l(j09 j09Var, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(771959668);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = 1;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                vz9 vz9Var = new vz9(null, qk6.L0);
                l46Var.p0(vz9Var);
                objR = vz9Var;
            }
            e89 e89Var = (e89) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new i8(e89Var, 7);
                l46Var.p0(objR2);
            }
            mh3.a(fne.b.a(F((x16) objR2, l46Var, 0)), af1.b0(-291176396, new x6(j09Var, e89Var, dd2Var, i4), l46Var), l46Var, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sv(j09Var, dd2Var, i2, i5);
        }
    }

    public static final void m(float f2, float f3, int i2, l46 l46Var, j09 j09Var) {
        float f4;
        l46Var.h0(75993973);
        int i3 = (l46Var.d(f2) ? 4 : 2) | i2 | 384;
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            float fN = mh3.n(f2, 0.0f, 1.0f);
            Float fValueOf = Float.valueOf(fN);
            if (Float.isNaN(fN)) {
                fValueOf = null;
            }
            f4 = 8.0f;
            nk8.d(j09Var, ndb.e, af1.b0(1895936587, new k43(f4, vx.b(fValueOf != null ? fValueOf.floatValue() : 0.0f, b21.T(300, 0, null, 6), null, null, l46Var, 48, 28), i4), l46Var), l46Var, 3126, 4);
        } else {
            l46Var.Z();
            f4 = f3;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h5b(f2, j09Var, f4, i2);
        }
    }

    public static final Object n(m88 m88Var, zn2 zn2Var) throws Throwable {
        try {
            if (m88Var.isDone()) {
                return u4.h(m88Var);
            }
            pl1 pl1Var = new pl1(1, k99.D(zn2Var));
            m88Var.b(new w36(16, m88Var, pl1Var), d94.a);
            pl1Var.x(new p88(m88Var));
            return pl1Var.t();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                throw cause;
            }
            ot7 ot7Var = new ot7();
            pa7.c0(ot7Var, pa7.class.getName());
            throw ot7Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void o(zn2 zn2Var) {
        pv3 pv3Var;
        if (zn2Var instanceof pv3) {
            pv3Var = (pv3) zn2Var;
            int i2 = pv3Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pv3Var.label = i2 - Integer.MIN_VALUE;
            } else {
                pv3Var = new pv3(zn2Var);
            }
        } else {
            pv3Var = new pv3(zn2Var);
        }
        Object obj = pv3Var.result;
        int i3 = pv3Var.label;
        if (i3 == 0) {
            jzb.q(obj);
            pv3Var.I$0 = 0;
            pv3Var.label = 1;
            pl1 pl1Var = new pl1(1, k99.D(pv3Var));
            pl1Var.v();
            if (pl1Var.t() == bw2.a) {
                return;
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            jzb.q(obj);
        }
        oo3.f();
    }

    public static lq5 p(Context context) {
        ProviderInfo providerInfo;
        jq5 jq5Var;
        ApplicationInfo applicationInfo;
        int i2 = 24;
        m8c oq3Var = Build.VERSION.SDK_INT >= 28 ? new oq3(i2) : new m8c(i2);
        PackageManager packageManager = context.getPackageManager();
        ok8.n(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            jq5Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrY = oq3Var.y(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrY) {
                    arrayList.add(signature.toByteArray());
                }
                jq5Var = new jq5(str, str2, "emojicompat-emoji-font", null, Collections.singletonList(arrayList), null);
            } catch (PackageManager.NameNotFoundException e2) {
                b1.a("emoji2.text.DefaultEmojiConfig", q5.ERROR, null, e2);
                b1.b(u5.FATAL, null, e2);
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                jq5Var = null;
            }
        }
        if (jq5Var == null) {
            return null;
        }
        return new lq5(new kq5(context, jq5Var));
    }

    public static final Object q(long j2, xn2 xn2Var) {
        if (j2 > 0) {
            pl1 pl1Var = new pl1(1, k99.D(xn2Var));
            pl1Var.v();
            if (j2 < Long.MAX_VALUE) {
                u(pl1Var.e).k0(j2, pl1Var);
            }
            Object objT = pl1Var.t();
            if (objT == bw2.a) {
                return objT;
            }
        }
        return wef.a;
    }

    public static final Object r(long j2, zn2 zn2Var) {
        Object objQ = q(R(j2), zn2Var);
        return objQ == bw2.a ? objQ : wef.a;
    }

    public static int s(char c2, CharSequence charSequence, int i2) {
        int length = charSequence.length();
        while (i2 < length) {
            if (charSequence.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final String t(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final ov3 u(pv2 pv2Var) {
        nv2 nv2VarF0 = pv2Var.F0(hj6.Z);
        ov3 ov3Var = nv2VarF0 instanceof ov3 ? (ov3) nv2VarF0 : null;
        return ov3Var == null ? qq3.a : ov3Var;
    }

    public static final Object v(tn8 tn8Var) {
        Object objE = tn8Var.E();
        gv7 gv7Var = objE instanceof gv7 ? (gv7) objE : null;
        if (gv7Var != null) {
            return gv7Var.Z;
        }
        return null;
    }

    public static final void w(pv2 pv2Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = uv2.a.iterator();
        while (it.hasNext()) {
            try {
                ((tv2) it.next()).G(pv2Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    bzd.m(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            bzd.m(th, new e84(pv2Var));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused2) {
        }
    }

    public static boolean x(h7f h7fVar, w4c w4cVar, v2c v2cVar) {
        g7f g7fVar = g7f.c;
        h7fVar.getClass();
        w4cVar.getClass();
        r8f r8fVar = h7fVar.c;
        if ((r8fVar.y(w4cVar) && !r8fVar.z0(w4cVar)) || r8fVar.L(w4cVar)) {
            return true;
        }
        h7fVar.b();
        ArrayDeque arrayDeque = h7fVar.g;
        arrayDeque.getClass();
        dqd dqdVar = h7fVar.h;
        dqdVar.getClass();
        arrayDeque.push(w4cVar);
        while (!arrayDeque.isEmpty()) {
            w4c w4cVar2 = (w4c) arrayDeque.pop();
            w4cVar2.getClass();
            if (dqdVar.add(w4cVar2)) {
                v2c v2cVar2 = r8fVar.z0(w4cVar2) ? g7fVar : v2cVar;
                if (v2cVar2.equals(g7fVar)) {
                    v2cVar2 = null;
                }
                if (v2cVar2 == null) {
                    continue;
                } else {
                    Iterator it = r8fVar.E(r8fVar.G(w4cVar2)).iterator();
                    while (it.hasNext()) {
                        w4c w4cVarA = v2cVar2.A(h7fVar, (xt7) it.next());
                        if ((r8fVar.y(w4cVarA) && !r8fVar.z0(w4cVarA)) || r8fVar.L(w4cVarA)) {
                            h7fVar.a();
                            return true;
                        }
                        arrayDeque.add(w4cVarA);
                    }
                }
            }
        }
        h7fVar.a();
        return false;
    }

    public static final void y(une uneVar, int i2, int i3) {
        uneVar.e = false;
        eue eueVar = uneVar.v;
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        uneVar.c(iMin, iMax, "");
        if (eueVar != null) {
            long jE = xdc.e(iMin, iMax, 0, eueVar.a);
            if (eue.d(jE)) {
                uneVar.g(null);
            } else {
                uneVar.f(eue.g(jE), eue.f(jE), null);
            }
        }
    }

    public static final void z(une uneVar, int i2, int i3, CharSequence charSequence) {
        une uneVar2;
        q0a q0aVar = uneVar.c;
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        int i4 = 0;
        int i5 = iMin;
        while (i5 < iMax && i4 < charSequence.length() && charSequence.charAt(i4) == q0aVar.charAt(i5)) {
            i4++;
            i5++;
        }
        int length = charSequence.length();
        int i6 = iMax;
        while (i6 > i5 && length > i4 && charSequence.charAt(length - 1) == q0aVar.charAt(i6 - 1)) {
            length--;
            i6--;
        }
        if (i5 == i6 && i4 == length) {
            uneVar.g(null);
            uneVar.x = null;
            uneVar2 = uneVar;
        } else {
            CharSequence charSequenceSubSequence = (i4 == 0 && length == charSequence.length()) ? charSequence : charSequence.subSequence(i4, length);
            uneVar2 = uneVar;
            une.d(uneVar2, i5, i6, charSequenceSubSequence, 0, false, 24);
        }
        int length2 = charSequence.length() + iMin;
        uneVar2.h(u3c.b(length2, length2));
    }
}
