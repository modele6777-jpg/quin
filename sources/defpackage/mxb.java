package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.icu.text.DateTimePatternGenerator;
import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.nio.ByteBuffer;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mxb {
    public static final void a(boolean z, a56 a56Var, a26 a26Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(889180116);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.e(a56Var == null ? -1 : a56Var.ordinal()) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            i8c i8cVar = sf2.a;
            if (z) {
                l46Var.f0(-1793253088);
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new pdc(24);
                    l46Var.p0(objR);
                }
                dec.b("page_view", (a26) objR, l46Var, 390);
                l46Var.r(false);
            } else {
                l46Var.f0(-1793116626);
                l46Var.r(false);
            }
            String strQ = afc.q(R.string.seasonal_gender_title, l46Var);
            boolean z2 = a56Var != null;
            boolean z3 = ((i2 & 14) == 4) | ((57344 & i2) == 16384);
            Object objR2 = l46Var.R();
            if (z3 || objR2 == i8cVar) {
                objR2 = new on2(z, x16Var2, 7);
                l46Var.p0(objR2);
            }
            xxb.d(1, strQ, z2, x16Var, (x16) objR2, null, af1.b0(1718022003, new b56(i3, a26Var, a56Var), l46Var), l46Var, (i2 & 7168) | 1769478);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l30(z, a56Var, a26Var, x16Var, x16Var2, i);
        }
    }

    public static final void b(j09 j09Var, dd2 dd2Var, dd2 dd2Var2, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        j09 j09Var3;
        lu9 lu9Var;
        boolean z;
        dd2 dd2Var3 = dd2Var;
        l46Var.h0(2094531013);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i3 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.i(dd2Var3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var.i(dd2Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09Var4 = i4 != 0 ? g09Var : j09Var2;
            b1b b1bVar = zg2.h;
            sw3 sw3Var = (sw3) l46Var.k(b1bVar);
            ph3 ph3VarA = yud.a(l46Var);
            Object objR = l46Var.R();
            ube ubeVar = ube.b;
            Object obj = sf2.a;
            if (objR == obj) {
                float fP0 = sw3Var.p0(100.0f);
                fz3 fz3Var = new fz3(2);
                fz3Var.k(0.0f, ube.a);
                fz3Var.k(-fP0, ubeVar);
                ArrayList arrayList = (ArrayList) fz3Var.b;
                float[] fArr = (float[]) fz3Var.c;
                int size = arrayList.size();
                ym8.v(size, fArr.length);
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                fArrCopyOfRange.getClass();
                hq3 hq3Var = new hq3(arrayList, fArrCopyOfRange);
                znd zndVar = new znd(22);
                tm tmVar = new tm(sw3Var, 1);
                x6f x6fVarT = b21.T(0, 0, null, 7);
                mo moVar = new mo(hq3Var, new z4(17));
                moVar.b = zndVar;
                moVar.c = tmVar;
                moVar.d = x6fVarT;
                moVar.e = ph3VarA;
                l46Var.p0(moVar);
                objR = moVar;
            }
            mo moVar2 = (mo) objR;
            int i5 = pt.a;
            Context context = (Context) l46Var.k(uq.b);
            sw3 sw3Var2 = (sw3) l46Var.k(b1bVar);
            ju9 ju9Var = (ju9) l46Var.k(ku9.a);
            if (ju9Var == null) {
                l46Var.f0(-1555403601);
                l46Var.r(false);
                z = false;
                lu9Var = null;
            } else {
                l46Var.f0(-1555370896);
                boolean zG = l46Var.g(context) | l46Var.g(sw3Var2) | l46Var.g(ju9Var);
                Object objR2 = l46Var.R();
                if (zG || objR2 == obj) {
                    objR2 = new tr(context, sw3Var2, ju9Var.a, ju9Var.b);
                    l46Var.p0(objR2);
                }
                lu9Var = (tr) objR2;
                z = false;
                l46Var.r(false);
            }
            if (lu9Var == null) {
                lu9Var = jhc.a;
            }
            lx0 lx0Var = ndb.b;
            xn8 xn8VarC = s21.c(lx0Var, z);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var4);
            lf2.q.getClass();
            l46Var.j0();
            boolean z2 = l46Var.S;
            x16 x16Var = LayoutNode.h1;
            if (z2) {
                l46Var.l(x16Var);
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
            j09 j09VarA = mu9.a(new sm(moVar2, lu9Var), lu9Var);
            Object objR3 = l46Var.R();
            j09 j09Var5 = j09Var4;
            int i6 = 6;
            if (objR3 == obj) {
                objR3 = new trd(i6, moVar2);
                l46Var.p0(objR3);
            }
            j09 j09VarL = tm7.L(j09VarA, (a26) objR3);
            xn8 xn8VarC2 = s21.c(lx0Var, false);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarL);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(x16Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            tec.q((i3 >> 6) & 14, dd2Var2, l46Var, true);
            j09 j09VarB = d31.a.b(g09Var);
            t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var, 54);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, j09VarB);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(x16Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ3);
            v7c v7cVar = v7c.a;
            o5c.f(l46Var, v7cVar.a(g09Var, 1.0f, true));
            boolean z3 = moVar2.g.getValue() == ubeVar;
            x6f x6fVarT2 = b21.T(0, 0, null, 7);
            Object objR4 = l46Var.R();
            int i7 = 5;
            if (objR4 == obj) {
                objR4 = new hl4(i7);
                l46Var.p0(objR4);
            }
            y6f y6fVar = rw4.a;
            cx4 cx4Var = new cx4(new o3f((x95) null, new ood(x6fVarT2, new mw4((a26) objR4)), (vv1) null, (aec) null, (LinkedHashMap) null, 125));
            x6f x6fVarT3 = b21.T(0, 0, null, 7);
            Object objR5 = l46Var.R();
            if (objR5 == obj) {
                objR5 = new hl4(i7);
                l46Var.p0(objR5);
            }
            dd2Var3 = dd2Var;
            m93.c(v7cVar, z3, null, cx4Var, new f45(new o3f((x95) null, new ood(x6fVarT3, new ow4((a26) objR5)), (vv1) null, (aec) null, (LinkedHashMap) null, 125)), null, af1.b0(819255559, new ec(dd2Var3, 10), l46Var), l46Var, 1600518, 18);
            l46Var.r(true);
            l46Var.r(true);
            j09Var3 = j09Var5;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr(j09Var3, dd2Var3, dd2Var2, i, i2);
        }
    }

    public static final void c(int i, x16 x16Var, l46 l46Var, j09 j09Var) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-305083852);
        int i2 = i | (l46Var2.i(x16Var) ? 32 : 16);
        int i3 = 0;
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            j09 j09VarZ = ynb.Z(j09Var, 12.0f);
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i3)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarZ);
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
            bm8.h(x16Var, oa7.E(g09.a, a7c.a), false, if9.z(((e8b) l46Var2.k(l8b.a)).k, 0L, l46Var2, 14), null, dj6.c, l46Var, ((i2 >> 3) & 14) | 1572864, 52);
            String strQ = afc.q(R.string.button_delete, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, y72.b(((m82) l46Var.k(o82.a)).q, 0.95f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc5(j09Var, x16Var, i, 8);
        }
    }

    public static final void d(ma8 ma8Var, ma8 ma8Var2, a26 a26Var, a26 a26Var2, j09 j09Var, l46 l46Var, int i) {
        char c;
        List listAsList;
        a26Var.getClass();
        a26Var2.getClass();
        l46Var.h0(34668859);
        int i2 = i | (l46Var.i(ma8Var) ? 4 : 2) | (l46Var.i(ma8Var2) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            Locale locale = ((Configuration) l46Var.k(uq.a)).getLocales().get(0);
            boolean zG = l46Var.g(locale);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "yMMMMd");
                bestDateTimePattern.getClass();
                StringBuilder sb = new StringBuilder();
                int length = bestDateTimePattern.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = bestDateTimePattern.charAt(i3);
                    if (v4e.G("yMLd", cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                c = 'M';
                String string = sb.toString();
                ArrayList arrayList = new ArrayList(string.length());
                for (int i4 = 0; i4 < string.length(); i4++) {
                    char cCharAt2 = string.charAt(i4);
                    if (cCharAt2 == 'L') {
                        cCharAt2 = 'M';
                    }
                    arrayList.add(Character.valueOf(cCharAt2));
                }
                objR = s72.j1(s72.n1(arrayList));
                l46Var.p0(objR);
            } else {
                c = 'M';
            }
            List list = (List) objR;
            boolean zG2 = l46Var.g(locale);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                String[] months = new DateFormatSymbols(locale).getMonths();
                months.getClass();
                if (12 >= months.length) {
                    listAsList = qd0.G0(months);
                } else {
                    listAsList = Arrays.asList(qd0.f0(months, 0, 12));
                    listAsList.getClass();
                }
                objR2 = (String[]) listAsList.toArray(new String[0]);
                l46Var.p0(objR2);
            }
            String[] strArr = (String[]) objR2;
            boolean zG3 = l46Var.g(locale);
            Object objR3 = l46Var.R();
            if (zG3 || objR3 == obj) {
                DateTimePatternGenerator dateTimePatternGenerator = DateTimePatternGenerator.getInstance(locale);
                objR3 = bm8.H(new iy9('y', dateTimePatternGenerator.getAppendItemName(1)), new iy9(Character.valueOf(c), dateTimePatternGenerator.getAppendItemName(3)), new iy9('d', dateTimePatternGenerator.getAppendItemName(7)));
                l46Var.p0(objR3);
            }
            Map map = (Map) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == obj) {
                objR4 = new lsd();
                l46Var.p0(objR4);
            }
            xxb.l(j09Var, 213.0f, 35.0f, null, abg.c(343439488), af1.b0(709253126, new n53(list, ma8Var2, ma8Var, a26Var, strArr, map, a26Var2, (lsd) objR4), l46Var), l46Var, ((i2 >> 12) & 14) | 221616, 8);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm(ma8Var, ma8Var2, a26Var, a26Var2, j09Var, i, 25);
        }
    }

    public static final qz9 e() {
        return new qz9(0.0f);
    }

    public static Collection f(dr8 dr8Var, ez3 ez3Var, int i) {
        if ((i & 1) != 0) {
            ez3Var = ez3.m;
        }
        dr8.a.getClass();
        return dr8Var.a(ez3Var, tj7.K0);
    }

    public static final float g(ste steVar, int i) {
        if (i < 0) {
            return 0.0f;
        }
        rte rteVar = steVar.a;
        b59 b59Var = steVar.b;
        if (rteVar.a.b.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(b59Var.d(i), Math.min(b59Var.b - 1, b59Var.f - 1));
        if (i > b59Var.c(iMin, false)) {
            return 0.0f;
        }
        b59Var.l(iMin);
        ArrayList arrayList = b59Var.h;
        oy9 oy9Var = (oy9) arrayList.get(hkg.q0(iMin, arrayList));
        return oy9Var.a.d.h(iMin - oy9Var.d);
    }

    public static int h(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int i(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return h(b, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    public static Long j(yid yidVar, String str) {
        long jA;
        yidVar.getClass();
        str.getClass();
        sp3 sp3VarE = yidVar.e(str);
        sp3VarE.getClass();
        byte[] bArr = (byte[]) sp3VarE.b.get("exo_len");
        long j = bArr != null ? ByteBuffer.wrap(bArr).getLong() : -1L;
        Long lValueOf = Long.valueOf(j);
        if (j > 0) {
            synchronized (yidVar) {
                t81 t81VarV = yidVar.c.V(str);
                jA = t81VarV != null ? t81VarV.a() : -9223372036854775807L;
            }
            if ((jA >= 0 ? jA : 0L) < j) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        ja8 ja8Var = new ja8();
        ja8Var.a(-1L, "exo_len");
        if (lValueOf == null) {
            ja8Var.b.add("custom_tts_pending_complete_length");
            ja8Var.a.remove("custom_tts_pending_complete_length");
        } else {
            ja8Var.a(lValueOf, "custom_tts_pending_complete_length");
        }
        yidVar.b(str, ja8Var);
        return lValueOf;
    }

    public static int k(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return i(bArr, i3, i2);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return i(bArr, i3, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static final j09 l(j09 j09Var, x4d x4dVar) {
        x4dVar.getClass();
        return rrb.q(rrb.q(j09Var, 6.0f, x4dVar, abg.c(637534208), abg.c(637534208), 4), 2.0f, x4dVar, abg.c(1291845632), abg.c(1291845632), 4);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: SQLiteException -> 0x00b7, LOOP:0: B:29:0x0080->B:32:0x008a, LOOP_END, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
  0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    public static void n(w0h w0hVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i;
        int i2;
        if (w0hVar == null) {
            qc0.j("Monitor must not be null");
            return;
        }
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
                try {
                    cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    try {
                        try {
                            boolean zMoveToFirst = cursorQuery.moveToFirst();
                            cursorQuery.close();
                            if (!zMoveToFirst) {
                                sQLiteDatabase2.execSQL(str2);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        w0hVar.x.c(str, e, "Error querying for table");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    cursorQuery = null;
                    w0hVar.x.c(str, e, "Error querying for table");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabase2.execSQL(str2);
                    hashSet = new HashSet();
                    StringBuilder sb = new StringBuilder(str.length() + 22);
                    sb.append("SELECT * FROM ");
                    sb.append(str);
                    sb.append(" LIMIT 0");
                    cursorRawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
                    try {
                        Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                        cursorRawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (hashSet.remove(str4)) {
                                StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                sb2.append("Table ");
                                sb2.append(str);
                                sb2.append(" is missing required column: ");
                                sb2.append(str4);
                                throw new SQLiteException(sb2.toString());
                            }
                        }
                        if (strArr != null) {
                            for (i = 0; i < strArr.length; i += 2) {
                                if (!hashSet.remove(strArr[i])) {
                                    sQLiteDatabase2.execSQL(strArr[i + 1]);
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                        }
                        w0hVar.x.c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                sQLiteDatabase2 = sQLiteDatabase;
            }
            try {
                hashSet = new HashSet();
                StringBuilder sb3 = new StringBuilder(str.length() + 22);
                sb3.append("SELECT * FROM ");
                sb3.append(str);
                sb3.append(" LIMIT 0");
                cursorRawQuery = sQLiteDatabase2.rawQuery(sb3.toString(), null);
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                while (i2 < r0) {
                    if (hashSet.remove(str4)) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb4.append("Table ");
                        sb4.append(str);
                        sb4.append(" is missing required column: ");
                        sb4.append(str4);
                        throw new SQLiteException(sb4.toString());
                    }
                }
                if (strArr != null) {
                    while (i < strArr.length) {
                        if (!hashSet.remove(strArr[i])) {
                            sQLiteDatabase2.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    w0hVar.x.c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                }
            } catch (SQLiteException e4) {
                w0hVar.g.b(str, "Failed to verify columns on table that was just created");
                throw e4;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    public static void p(w0h w0hVar, SQLiteDatabase sQLiteDatabase) {
        if (w0hVar == null) {
            qc0.j("Monitor must not be null");
            return;
        }
        tz0 tz0Var = w0hVar.x;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            tz0Var.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            tz0Var.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            tz0Var.a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        tz0Var.a("Failed to turn on database write permission for owner");
    }

    public abstract int m();

    public abstract ngh o(int i);

    public abstract Object q(int i);

    public abstract Object r(ngh nghVar);
}
