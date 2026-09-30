package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import android.graphics.Color;
import android.os.Handler;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.annotation.Annotation;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nk8 {
    public static volatile Handler a;
    public static final zv b = new zv(29);
    public static final dd2 c = new dd2(new md2(11), false, -1417255283);
    public static final dd2 d = new dd2(new ce2(5), false, 358389877);
    public static final dd2 e;
    public static final dd2 f;
    public static final long[] g;
    public static gx6 h;

    static {
        new dd2(new yd2(23), false, -1349408360);
        e = new dd2(new ie2(6), false, 793221291);
        f = new dd2(new ie2(7), false, 1369024318);
        g = new long[0];
    }

    public static final int A(b18 b18Var) {
        List list = b18Var.l;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((c18) list.get(i2)).p;
        }
        return (i / list.size()) + b18Var.r;
    }

    public static int B(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                try {
                    int i4 = d5h.a;
                    int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new c5h("Unpaired surrogate at index " + i2 + " of " + length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                    break;
                } catch (c5h unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static final void a(ik ikVar, boolean z, a26 a26Var, a26 a26Var2, x16 x16Var, l46 l46Var, int i) {
        int i2;
        boolean z2;
        Object obj;
        Object obj2;
        l46Var.h0(-1713271490);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(ikVar) : l46Var.i(ikVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= l46Var.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            obj = a26Var;
            i2 |= l46Var.i(obj) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            obj = a26Var;
        }
        if ((i & 3072) == 0) {
            obj2 = a26Var2;
            i2 |= l46Var.i(obj2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            obj2 = a26Var2;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            xdc.a(null, af1.b0(1331535866, new m(5, x16Var), l46Var), null, null, null, 0, 0L, 0L, null, af1.b0(255436751, new ck(z2, ikVar, obj, obj2, 0), l46Var), l46Var, 805306416, 509);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dk(ikVar, z, a26Var, a26Var2, x16Var, i, 0);
        }
    }

    public static final void b(a26 a26Var, a26 a26Var2, a26 a26Var3, x16 x16Var, l46 l46Var, int i) {
        a26Var.getClass();
        a26Var2.getClass();
        a26Var3.getClass();
        x16Var.getClass();
        l46Var.h0(-992480047);
        int i2 = 4;
        int i3 = i | (l46Var.i(a26Var) ? 4 : 2) | (l46Var.i(a26Var2) ? 32 : 16) | (l46Var.i(a26Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            vk vkVar = (vk) z5c.G(job.a.b(vk.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            e89 e89VarT = tm7.t(vkVar.d, l46Var);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09.a);
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
            ik ikVar = (ik) e89VarT.getValue();
            boolean zBooleanValue = ((Boolean) vkVar.e.getValue()).booleanValue();
            boolean zI = ((i3 & 112) == 32) | l46Var.i(vkVar) | ((i3 & 896) == 256);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new w6(vkVar, a26Var2, a26Var3, i2);
                l46Var.p0(objR);
            }
            a(ikVar, zBooleanValue, a26Var, (a26) objR, x16Var, l46Var, ((i3 << 6) & 896) | ((i3 << 3) & 57344));
            l46Var.f0(-561352169);
            l46Var.r(false);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(i, 2, a26Var, a26Var2, a26Var3, x16Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [int] */
    /* JADX WARN: Type inference failed for: r15v24 */
    public static final void c(ArcanaGroup arcanaGroup, a26 a26Var, j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        long j;
        j09 j09VarW;
        ?? r15;
        Object obj;
        char c2;
        int i2;
        boolean z;
        long j2;
        l46 l46Var3 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        y02 y02Var = g21.f;
        lx0 lx0Var = ndb.f;
        arcanaGroup.getClass();
        a26Var.getClass();
        l46Var3.h0(1335692272);
        int i3 = i | (l46Var3.e(arcanaGroup.ordinal()) ? 4 : 2) | (l46Var3.i(a26Var) ? 32 : 16) | (l46Var3.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var3.W(i3 & 1, (i3 & 147) != 146)) {
            lx4 entries = ArcanaGroup.getEntries();
            int iOrdinal = arcanaGroup.ordinal();
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var3.k(pr4Var));
            x4d x4dVarB = we6.e(l46Var3) ? y02Var : a7c.b(40.0f);
            if (zF) {
                l46Var3.f0(-594931333);
                l46Var3.r(false);
                j = y72.j;
            } else {
                l46Var3.f0(-594930563);
                j = ((e8b) l46Var3.k(pr4Var)).m;
                l46Var3.r(false);
            }
            long j3 = j;
            long j4 = ((e8b) l46Var3.k(pr4Var)).m;
            long j5 = ((e8b) l46Var3.k(pr4Var)).d;
            if (we6.e(l46Var3)) {
                j5 = j4;
            }
            int i4 = i3;
            j09 j09VarC = b.c(j09Var, 1.0f);
            xn8 xn8VarC = s21.c(lx0Var, false);
            lx0 lx0Var2 = lx0Var;
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarC);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z2 = l46Var3.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, xn8VarC);
            dec.l(he2Var3, l46Var3, u8aVarM);
            ib8.s(iHashCode, l46Var3, he2Var2, l46Var3);
            dec.l(he2Var, l46Var3, j09VarJ);
            g09 g09Var = g09.a;
            j09 j09VarO = tm7.o(oa7.E(g09Var, x4dVarB), j3, y02Var);
            if (zF) {
                l46Var3.f0(887845311);
                j09VarW = db6.w(g09Var, 0.5f, ((e8b) l46Var3.k(pr4Var)).z, x4dVarB);
                l46Var3.r(false);
            } else {
                l46Var3.f0(887847474);
                l46Var3.r(false);
                j09VarW = g09Var;
            }
            j09 j09VarZ = ynb.Z(mh3.K(b.d(j09VarO.D(j09VarW), 32.0f), mh3.T(l46Var3)), 2.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var3, 48);
            int iHashCode2 = Long.hashCode(l46Var3.T);
            u8a u8aVarM2 = l46Var3.m();
            j09 j09VarJ2 = m93.J(l46Var3, j09VarZ);
            l46Var3.j0();
            x4d x4dVar = x4dVarB;
            if (l46Var3.S) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, t7cVarA);
            dec.l(he2Var3, l46Var3, u8aVarM2);
            ib8.s(iHashCode2, l46Var3, he2Var2, l46Var3);
            dec.l(he2Var, l46Var3, j09VarJ2);
            l46Var3.f0(112963658);
            int i5 = 0;
            l46 l46Var4 = l46Var3;
            for (Object obj2 : entries) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    t72.Z();
                    throw null;
                }
                ArcanaGroup arcanaGroup2 = (ArcanaGroup) obj2;
                if (i5 > 0) {
                    l46Var4.f0(-387304144);
                    boolean z3 = iOrdinal == i5 + (-1) || iOrdinal == i5;
                    j09 j09VarD = b.p(ynb.b0(0.0f, 6.0f, g09Var, 1), 1.0f).D(b.b);
                    if (z3) {
                        l46Var4.f0(126063143);
                        z = false;
                        l46Var4.r(false);
                        j2 = y72.j;
                    } else {
                        z = false;
                        l46Var4.f0(126063922);
                        j2 = ((e8b) l46Var4.k(l8b.a)).A;
                        l46Var4.r(false);
                    }
                    s21.a(tm7.o(j09VarD, j2, y02Var), l46Var4, z ? 1 : 0);
                    l46Var4.r(z);
                    r15 = z;
                } else {
                    he2Var = he2Var;
                    he2Var2 = he2Var2;
                    r15 = 0;
                    l46Var4.f0(-386944730);
                    l46Var4.r(false);
                }
                long jB = iOrdinal == i5 ? j5 : y72.b(j5, 0.0f);
                x6f x6fVarT = b21.T(200, r15, hs4.a, 2);
                int i7 = iOrdinal;
                long j6 = j5;
                x4d x4dVar2 = x4dVar;
                int i8 = i4;
                j09 j09VarO2 = tm7.o(oa7.E(b.b, x4dVar2), ((y72) qkd.a(jB, x6fVarT, "tabBackground", l46Var4, 384, 8).getValue()).a, y02Var);
                boolean zE = l46Var4.e(arcanaGroup2.ordinal()) | ((i8 & 112) == 32);
                Object objR = l46Var4.R();
                if (zE || objR == sf2.a) {
                    v6 v6Var = new v6(12, a26Var, arcanaGroup2);
                    l46Var4.p0(v6Var);
                    obj = v6Var;
                } else {
                    obj = objR;
                }
                j09 j09VarA0 = ynb.a0(androidx.compose.foundation.b.c(j09VarO2, false, null, null, (x16) obj, 15), 10.0f, 5.0f);
                lx0 lx0Var3 = lx0Var2;
                xn8 xn8VarC2 = s21.c(lx0Var3, false);
                int iHashCode3 = Long.hashCode(l46Var4.T);
                u8a u8aVarM3 = l46Var4.m();
                j09 j09VarJ3 = m93.J(l46Var4, j09VarA0);
                lf2.q.getClass();
                l46Var4.j0();
                if (l46Var4.S) {
                    l46Var4.l(ov7Var);
                } else {
                    l46Var4.s0();
                }
                dec.l(he2Var4, l46Var4, xn8VarC2);
                dec.l(he2Var3, l46Var4, u8aVarM3);
                he2Var2 = he2Var2;
                ib8.s(iHashCode3, l46Var4, he2Var2, l46Var4);
                he2 he2Var5 = he2Var;
                dec.l(he2Var5, l46Var4, j09VarJ3);
                int i9 = lc0.a[arcanaGroup2.ordinal()];
                if (i9 != 1) {
                    c2 = 2;
                    if (i9 == 2) {
                        i2 = R.string.explore_arcana_wands;
                    } else if (i9 == 3) {
                        i2 = R.string.explore_arcana_cups;
                    } else if (i9 == 4) {
                        i2 = R.string.explore_arcana_swords;
                    } else {
                        if (i9 != 5) {
                            ap.c();
                            return;
                        }
                        i2 = R.string.explore_arcana_pentacles;
                    }
                } else {
                    c2 = 2;
                    i2 = R.string.explore_arcana_major;
                }
                nte.b(afc.q(i2, l46Var4), null, ((m82) l46Var4.k(o82.a)).q, w6c.l(13), ar5.c, null, 0L, null, null, w6c.l(18), 0, false, 1, 0, null, null, l46Var, 1597440, 24624, 243626);
                l46 l46Var5 = l46Var;
                l46Var5.r(true);
                i5 = i6;
                lx0Var2 = lx0Var3;
                he2Var4 = he2Var4;
                iOrdinal = i7;
                j5 = j6;
                x4dVar = x4dVar2;
                i4 = i8;
                y02Var = y02Var;
                he2Var = he2Var5;
                l46Var4 = l46Var5;
            }
            tec.s(l46Var4, false, true, true);
            l46Var2 = l46Var4;
        } else {
            l46Var3.Z();
            l46Var2 = l46Var3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(i, arcanaGroup, a26Var, j09Var, 5);
        }
    }

    public static final void d(j09 j09Var, yi yiVar, dd2 dd2Var, l46 l46Var, int i, int i2) {
        int i3;
        l46Var.h0(380139498);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= l46Var.g(yiVar) ? 32 : 16;
        }
        int i6 = i3 | 384;
        if ((i & 3072) == 0) {
            i6 |= l46Var.i(dd2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i6 & 1, (i6 & 1171) != 1170)) {
            if (i4 != 0) {
                j09Var = g09.a;
            }
            if (i5 != 0) {
                yiVar = ndb.b;
            }
            xn8 xn8VarC = s21.c(yiVar, false);
            boolean zG = l46Var.g(xn8VarC) | ((i6 & 7168) == 2048);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new h8(8, xn8VarC, dd2Var);
                l46Var.p0(objR);
            }
            m6e.a(j09Var, (l26) objR, l46Var, i6 & 14, 0);
        } else {
            l46Var.Z();
        }
        j09 j09Var2 = j09Var;
        yi yiVar2 = yiVar;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr(j09Var2, yiVar2, dd2Var, i, i2, 3);
        }
    }

    public static final void e(int i, a26 a26Var, l46 l46Var, j09 j09Var) {
        int i2;
        l46Var.h0(-932836462);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(a26Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            o5c.f(l46Var, b21.s(j09Var, a26Var));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zl1(i, a26Var, j09Var);
        }
    }

    public static final void f(j09 j09Var, String str, dd2 dd2Var, dd2 dd2Var2, s84 s84Var, x16 x16Var, l46 l46Var, int i) {
        s84 s84Var2;
        y6c y6cVarB;
        x16Var.getClass();
        l46Var.h0(-1964315067);
        int i2 = 4;
        int i3 = i | (l46Var.g(j09Var) ? 4 : 2) | (l46Var.g(str) ? 32 : 16) | 24576 | (l46Var.i(x16Var) ? 131072 : 65536);
        boolean z = false;
        if (l46Var.W(i3 & 1, (74899 & i3) != 74898)) {
            s84 s84Var3 = new s84(z, z, i2);
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            if (zF) {
                l46Var.f0(2078844043);
                y6cVarB = eze.a(l46Var).a.j;
                l46Var.r(false);
            } else {
                l46Var.f0(2078844446);
                l46Var.r(false);
                y6cVarB = a7c.b(24.0f);
            }
            t72.b(x16Var, s84Var3, af1.b0(-1362641074, new r52(j09Var, y6cVarB, zF ? 24.0f : 32.0f, x16Var, str, dd2Var, dd2Var2), l46Var), l46Var, ((i3 >> 15) & 14) | 432, 0);
            s84Var2 = s84Var3;
        } else {
            l46Var.Z();
            s84Var2 = s84Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iq1(j09Var, str, dd2Var, dd2Var2, s84Var2, x16Var, i);
        }
    }

    public static final void g(DailyFortuneGuideTrigger dailyFortuneGuideTrigger, x16 x16Var, x16 x16Var2, j09 j09Var, l46 l46Var, int i) {
        iy9 iy9Var;
        dailyFortuneGuideTrigger.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-2099109569);
        int i2 = i | (l46Var.e(dailyFortuneGuideTrigger.ordinal()) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 14) == 4;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new p73(dailyFortuneGuideTrigger, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, dailyFortuneGuideTrigger);
            int i3 = q73.a[dailyFortuneGuideTrigger.ordinal()];
            if (i3 == 1) {
                iy9Var = new iy9(Integer.valueOf(R.string.daily_fortune_guide_first_reading_title), Integer.valueOf(R.string.daily_fortune_guide_first_reading_subtitle));
            } else {
                if (i3 != 2) {
                    ap.c();
                    return;
                }
                iy9Var = new iy9(Integer.valueOf(R.string.daily_fortune_guide_paywall_title), Integer.valueOf(R.string.daily_fortune_guide_paywall_subtitle));
            }
            h(afc.q(((Number) iy9Var.a()).intValue(), l46Var), afc.q(((Number) iy9Var.b()).intValue(), l46Var), afc.q(R.string.daily_fortune_guide_cta, l46Var), k8b.e((e8b) l46Var.k(l8b.a)) ? R.drawable.img_popup_daily_card_classic : R.drawable.img_popup_daily_card_neo, false, x16Var, x16Var2, null, j09Var, l46Var, ((i2 << 12) & 4128768) | 100663296, 144);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8((Object) dailyFortuneGuideTrigger, x16Var, x16Var2, j09Var, i, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:105:0x032f  */
    /* JADX WARN: Code duplicated, block: B:108:0x033b  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0149  */
    /* JADX WARN: Code duplicated, block: B:94:0x014d  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a2  */
    public static final void h(final String str, final String str2, final String str3, final int i, boolean z, final x16 x16Var, final x16 x16Var2, j09 j09Var, final j09 j09Var2, l46 l46Var, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5;
        j09 j09Var3;
        int i6;
        boolean z3;
        l46 l46Var2;
        final boolean z4;
        final j09 j09Var4;
        ojb ojbVarV;
        boolean z5;
        g09 g09Var;
        j09 j09Var5;
        boolean z6;
        ov7 ov7Var;
        int i7;
        int i8;
        int i9;
        str.getClass();
        str2.getClass();
        str3.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(2030785031);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.g(str3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= l46Var.e(i) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i10 = i3 & 16;
        if (i10 == 0) {
            if ((i2 & 24576) == 0) {
                z2 = z;
                i4 |= l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((196608 & i2) != 0) {
                if (l46Var.i(x16Var)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            if ((1572864 & i2) != 0) {
                if (l46Var.i(x16Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i5 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i5 != 0) {
                if ((12582912 & i2) == 0) {
                    j09Var3 = j09Var;
                    if (l46Var.g(j09Var3)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
                if ((100663296 & i2) == 0) {
                    if (l46Var.g(j09Var2)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i4 |= i7;
                }
                if ((38347923 & i4) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i4 & 1, z3)) {
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    g09Var = g09.a;
                    if (i5 != 0) {
                        j09Var5 = g09Var;
                    } else {
                        j09Var5 = j09Var3;
                    }
                    j09 j09VarE = oa7.E(b.c(j09Var2, 1.0f), a7c.b(32.0f));
                    pr4 pr4Var = l8b.a;
                    j09 j09VarO = tm7.o(j09VarE, ((e8b) l46Var.k(pr4Var)).c, g21.f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarO);
                    lf2.q.getClass();
                    l46Var.j0();
                    z6 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z6) {
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
                    boolean z7 = z5;
                    j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 32.0f);
                    jx0 jx0Var = ndb.Z;
                    sc0 sc0Var = xc0.c;
                    int i11 = i4;
                    c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var, 48);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarZ);
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
                    c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var, 48);
                    int iHashCode3 = Long.hashCode(l46Var.T);
                    u8a u8aVarM3 = l46Var.m();
                    j09 j09VarJ3 = m93.J(l46Var, g09Var);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA2);
                    dec.l(he2Var2, l46Var, u8aVarM3);
                    ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ3);
                    int i12 = i11 >> 9;
                    feg.j(od4.A(i, i12 & 14, l46Var), null, dj6.w(b.c(b.q(0.0f, 280.0f, g09Var, 1), 1.0f), 1.6666666f), null, null, 0.0f, null, l46Var, 440, 120);
                    l46Var2 = l46Var;
                    mue mueVar = pue.a;
                    nte.b(str, b.c(g09Var, 1.0f), ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var2, (i11 & 14) | 48, 0, 130040);
                    mue mueVar2 = oue.a;
                    int i13 = i11 >> 3;
                    nte.b(str2, ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, b.c(g09Var, 1.0f)), ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.c(l46Var2), l46Var2, (i13 & 14) | 48, 0, 130040);
                    l46Var2.r(true);
                    j09 j09Var6 = j09Var5;
                    c8b.i(b.b(0.0f, 56.0f, b.c(ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, j09Var6), 1.0f), 1), str3, null, null, 0L, 0.0f, z7, null, null, false, null, null, x16Var, l46Var2, (i13 & 112) | (3670016 & (i11 << 6)), i12 & 896, 4028);
                    l46Var2.r(true);
                    c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, 0L, null, x16Var2, l46Var2, i13 & 458752, 30);
                    l46Var2.r(true);
                    j09Var4 = j09Var6;
                    z4 = z7;
                } else {
                    l46Var2 = l46Var;
                    l46Var2.Z();
                    z4 = z2;
                    j09Var4 = j09Var3;
                }
                ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: o73
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk8.h(str, str2, str3, i, z4, x16Var, x16Var2, j09Var4, j09Var2, (l46) obj, k99.P(i2 | 1), i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 12582912;
            j09Var3 = j09Var;
            if ((100663296 & i2) == 0) {
                if (l46Var.g(j09Var2)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i4 |= i7;
            }
            if ((38347923 & i4) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i4 & 1, z3)) {
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                g09Var = g09.a;
                if (i5 != 0) {
                    j09Var5 = g09Var;
                } else {
                    j09Var5 = j09Var3;
                }
                j09 j09VarE2 = oa7.E(b.c(j09Var2, 1.0f), a7c.b(32.0f));
                pr4 pr4Var2 = l8b.a;
                j09 j09VarO2 = tm7.o(j09VarE2, ((e8b) l46Var.k(pr4Var2)).c, g21.f);
                xn8 xn8VarC2 = s21.c(ndb.b, false);
                int iHashCode4 = Long.hashCode(l46Var.T);
                u8a u8aVarM4 = l46Var.m();
                j09 j09VarJ4 = m93.J(l46Var, j09VarO2);
                lf2.q.getClass();
                l46Var.j0();
                z6 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z6) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var5 = hj6.z;
                dec.l(he2Var5, l46Var, xn8VarC2);
                he2 he2Var6 = hj6.y;
                dec.l(he2Var6, l46Var, u8aVarM4);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                he2 he2Var7 = hj6.X;
                dec.l(he2Var7, l46Var, numValueOf2);
                dec.k(l46Var);
                he2 he2Var8 = hj6.x;
                dec.l(he2Var8, l46Var, j09VarJ4);
                boolean z8 = z5;
                j09 j09VarZ2 = ynb.Z(b.c(g09Var, 1.0f), 32.0f);
                jx0 jx0Var2 = ndb.Z;
                sc0 sc0Var2 = xc0.c;
                int i14 = i4;
                c92 c92VarA3 = a92.a(sc0Var2, jx0Var2, l46Var, 48);
                int iHashCode5 = Long.hashCode(l46Var.T);
                u8a u8aVarM5 = l46Var.m();
                j09 j09VarJ5 = m93.J(l46Var, j09VarZ2);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var5, l46Var, c92VarA3);
                dec.l(he2Var6, l46Var, u8aVarM5);
                ib8.s(iHashCode5, l46Var, he2Var7, l46Var);
                dec.l(he2Var8, l46Var, j09VarJ5);
                c92 c92VarA4 = a92.a(sc0Var2, jx0Var2, l46Var, 48);
                int iHashCode6 = Long.hashCode(l46Var.T);
                u8a u8aVarM6 = l46Var.m();
                j09 j09VarJ6 = m93.J(l46Var, g09Var);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var5, l46Var, c92VarA4);
                dec.l(he2Var6, l46Var, u8aVarM6);
                ib8.s(iHashCode6, l46Var, he2Var7, l46Var);
                dec.l(he2Var8, l46Var, j09VarJ6);
                int i15 = i14 >> 9;
                feg.j(od4.A(i, i15 & 14, l46Var), null, dj6.w(b.c(b.q(0.0f, 280.0f, g09Var, 1), 1.0f), 1.6666666f), null, null, 0.0f, null, l46Var, 440, 120);
                l46Var2 = l46Var;
                mue mueVar3 = pue.a;
                nte.b(str, b.c(g09Var, 1.0f), ((e8b) l46Var2.k(pr4Var2)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var2, (i14 & 14) | 48, 0, 130040);
                mue mueVar4 = oue.a;
                int i16 = i14 >> 3;
                nte.b(str2, ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, b.c(g09Var, 1.0f)), ((e8b) l46Var2.k(pr4Var2)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.c(l46Var2), l46Var2, (i16 & 14) | 48, 0, 130040);
                l46Var2.r(true);
                j09 j09Var7 = j09Var5;
                c8b.i(b.b(0.0f, 56.0f, b.c(ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, j09Var7), 1.0f), 1), str3, null, null, 0L, 0.0f, z8, null, null, false, null, null, x16Var, l46Var2, (i16 & 112) | (3670016 & (i14 << 6)), i15 & 896, 4028);
                l46Var2.r(true);
                c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, 0L, null, x16Var2, l46Var2, i16 & 458752, 30);
                l46Var2.r(true);
                j09Var4 = j09Var7;
                z4 = z8;
            } else {
                l46Var2 = l46Var;
                l46Var2.Z();
                z4 = z2;
                j09Var4 = j09Var3;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: o73
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk8.h(str, str2, str3, i, z4, x16Var, x16Var2, j09Var4, j09Var2, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 24576;
        z2 = z;
        if ((196608 & i2) != 0) {
            if (l46Var.i(x16Var)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i4 |= i9;
        }
        if ((1572864 & i2) != 0) {
            if (l46Var.i(x16Var2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i4 |= i8;
        }
        i5 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i5 != 0) {
            if ((12582912 & i2) == 0) {
                j09Var3 = j09Var;
                if (l46Var.g(j09Var3)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
            if ((100663296 & i2) == 0) {
                if (l46Var.g(j09Var2)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i4 |= i7;
            }
            if ((38347923 & i4) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i4 & 1, z3)) {
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                g09Var = g09.a;
                if (i5 != 0) {
                    j09Var5 = g09Var;
                } else {
                    j09Var5 = j09Var3;
                }
                j09 j09VarE3 = oa7.E(b.c(j09Var2, 1.0f), a7c.b(32.0f));
                pr4 pr4Var3 = l8b.a;
                j09 j09VarO3 = tm7.o(j09VarE3, ((e8b) l46Var.k(pr4Var3)).c, g21.f);
                xn8 xn8VarC3 = s21.c(ndb.b, false);
                int iHashCode7 = Long.hashCode(l46Var.T);
                u8a u8aVarM7 = l46Var.m();
                j09 j09VarJ7 = m93.J(l46Var, j09VarO3);
                lf2.q.getClass();
                l46Var.j0();
                z6 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z6) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var9 = hj6.z;
                dec.l(he2Var9, l46Var, xn8VarC3);
                he2 he2Var10 = hj6.y;
                dec.l(he2Var10, l46Var, u8aVarM7);
                Integer numValueOf3 = Integer.valueOf(iHashCode7);
                he2 he2Var11 = hj6.X;
                dec.l(he2Var11, l46Var, numValueOf3);
                dec.k(l46Var);
                he2 he2Var12 = hj6.x;
                dec.l(he2Var12, l46Var, j09VarJ7);
                boolean z9 = z5;
                j09 j09VarZ3 = ynb.Z(b.c(g09Var, 1.0f), 32.0f);
                jx0 jx0Var3 = ndb.Z;
                sc0 sc0Var3 = xc0.c;
                int i17 = i4;
                c92 c92VarA5 = a92.a(sc0Var3, jx0Var3, l46Var, 48);
                int iHashCode8 = Long.hashCode(l46Var.T);
                u8a u8aVarM8 = l46Var.m();
                j09 j09VarJ8 = m93.J(l46Var, j09VarZ3);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var9, l46Var, c92VarA5);
                dec.l(he2Var10, l46Var, u8aVarM8);
                ib8.s(iHashCode8, l46Var, he2Var11, l46Var);
                dec.l(he2Var12, l46Var, j09VarJ8);
                c92 c92VarA6 = a92.a(sc0Var3, jx0Var3, l46Var, 48);
                int iHashCode9 = Long.hashCode(l46Var.T);
                u8a u8aVarM9 = l46Var.m();
                j09 j09VarJ9 = m93.J(l46Var, g09Var);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var9, l46Var, c92VarA6);
                dec.l(he2Var10, l46Var, u8aVarM9);
                ib8.s(iHashCode9, l46Var, he2Var11, l46Var);
                dec.l(he2Var12, l46Var, j09VarJ9);
                int i18 = i17 >> 9;
                feg.j(od4.A(i, i18 & 14, l46Var), null, dj6.w(b.c(b.q(0.0f, 280.0f, g09Var, 1), 1.0f), 1.6666666f), null, null, 0.0f, null, l46Var, 440, 120);
                l46Var2 = l46Var;
                mue mueVar5 = pue.a;
                nte.b(str, b.c(g09Var, 1.0f), ((e8b) l46Var2.k(pr4Var3)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var2, (i17 & 14) | 48, 0, 130040);
                mue mueVar6 = oue.a;
                int i19 = i17 >> 3;
                nte.b(str2, ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, b.c(g09Var, 1.0f)), ((e8b) l46Var2.k(pr4Var3)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.c(l46Var2), l46Var2, (i19 & 14) | 48, 0, 130040);
                l46Var2.r(true);
                j09 j09Var8 = j09Var5;
                c8b.i(b.b(0.0f, 56.0f, b.c(ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, j09Var8), 1.0f), 1), str3, null, null, 0L, 0.0f, z9, null, null, false, null, null, x16Var, l46Var2, (i19 & 112) | (3670016 & (i17 << 6)), i18 & 896, 4028);
                l46Var2.r(true);
                c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, 0L, null, x16Var2, l46Var2, i19 & 458752, 30);
                l46Var2.r(true);
                j09Var4 = j09Var8;
                z4 = z9;
            } else {
                l46Var2 = l46Var;
                l46Var2.Z();
                z4 = z2;
                j09Var4 = j09Var3;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: o73
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk8.h(str, str2, str3, i, z4, x16Var, x16Var2, j09Var4, j09Var2, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 12582912;
        j09Var3 = j09Var;
        if ((100663296 & i2) == 0) {
            if (l46Var.g(j09Var2)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i4 |= i7;
        }
        if ((38347923 & i4) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i4 & 1, z3)) {
            if (i10 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            g09Var = g09.a;
            if (i5 != 0) {
                j09Var5 = g09Var;
            } else {
                j09Var5 = j09Var3;
            }
            j09 j09VarE4 = oa7.E(b.c(j09Var2, 1.0f), a7c.b(32.0f));
            pr4 pr4Var4 = l8b.a;
            j09 j09VarO4 = tm7.o(j09VarE4, ((e8b) l46Var.k(pr4Var4)).c, g21.f);
            xn8 xn8VarC4 = s21.c(ndb.b, false);
            int iHashCode10 = Long.hashCode(l46Var.T);
            u8a u8aVarM10 = l46Var.m();
            j09 j09VarJ10 = m93.J(l46Var, j09VarO4);
            lf2.q.getClass();
            l46Var.j0();
            z6 = l46Var.S;
            ov7Var = LayoutNode.h1;
            if (z6) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var13 = hj6.z;
            dec.l(he2Var13, l46Var, xn8VarC4);
            he2 he2Var14 = hj6.y;
            dec.l(he2Var14, l46Var, u8aVarM10);
            Integer numValueOf4 = Integer.valueOf(iHashCode10);
            he2 he2Var15 = hj6.X;
            dec.l(he2Var15, l46Var, numValueOf4);
            dec.k(l46Var);
            he2 he2Var16 = hj6.x;
            dec.l(he2Var16, l46Var, j09VarJ10);
            boolean z10 = z5;
            j09 j09VarZ4 = ynb.Z(b.c(g09Var, 1.0f), 32.0f);
            jx0 jx0Var4 = ndb.Z;
            sc0 sc0Var4 = xc0.c;
            int i110 = i4;
            c92 c92VarA7 = a92.a(sc0Var4, jx0Var4, l46Var, 48);
            int iHashCode11 = Long.hashCode(l46Var.T);
            u8a u8aVarM11 = l46Var.m();
            j09 j09VarJ11 = m93.J(l46Var, j09VarZ4);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var13, l46Var, c92VarA7);
            dec.l(he2Var14, l46Var, u8aVarM11);
            ib8.s(iHashCode11, l46Var, he2Var15, l46Var);
            dec.l(he2Var16, l46Var, j09VarJ11);
            c92 c92VarA8 = a92.a(sc0Var4, jx0Var4, l46Var, 48);
            int iHashCode12 = Long.hashCode(l46Var.T);
            u8a u8aVarM12 = l46Var.m();
            j09 j09VarJ12 = m93.J(l46Var, g09Var);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var13, l46Var, c92VarA8);
            dec.l(he2Var14, l46Var, u8aVarM12);
            ib8.s(iHashCode12, l46Var, he2Var15, l46Var);
            dec.l(he2Var16, l46Var, j09VarJ12);
            int i111 = i110 >> 9;
            feg.j(od4.A(i, i111 & 14, l46Var), null, dj6.w(b.c(b.q(0.0f, 280.0f, g09Var, 1), 1.0f), 1.6666666f), null, null, 0.0f, null, l46Var, 440, 120);
            l46Var2 = l46Var;
            mue mueVar7 = pue.a;
            nte.b(str, b.c(g09Var, 1.0f), ((e8b) l46Var2.k(pr4Var4)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var2, (i110 & 14) | 48, 0, 130040);
            mue mueVar8 = oue.a;
            int i112 = i110 >> 3;
            nte.b(str2, ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, b.c(g09Var, 1.0f)), ((e8b) l46Var2.k(pr4Var4)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.c(l46Var2), l46Var2, (i112 & 14) | 48, 0, 130040);
            l46Var2.r(true);
            j09 j09Var9 = j09Var5;
            c8b.i(b.b(0.0f, 56.0f, b.c(ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, j09Var9), 1.0f), 1), str3, null, null, 0L, 0.0f, z10, null, null, false, null, null, x16Var, l46Var2, (i112 & 112) | (3670016 & (i110 << 6)), i111 & 896, 4028);
            l46Var2.r(true);
            c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, 0L, null, x16Var2, l46Var2, i112 & 458752, 30);
            l46Var2.r(true);
            j09Var4 = j09Var9;
            z4 = z10;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
            z4 = z2;
            j09Var4 = j09Var3;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: o73
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nk8.h(str, str2, str3, i, z4, x16Var, x16Var2, j09Var4, j09Var2, (l46) obj, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0146  */
    /* JADX WARN: Code duplicated, block: B:105:0x014b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0150  */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:112:0x015f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0168  */
    /* JADX WARN: Code duplicated, block: B:115:0x016f  */
    /* JADX WARN: Code duplicated, block: B:119:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0190  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x011e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0128  */
    public static final void i(final String str, final x16 x16Var, j09 j09Var, float f2, float f3, float f4, boolean z, mue mueVar, y72 y72Var, xw9 xw9Var, boolean z2, l46 l46Var, final int i, final int i2, final int i3) {
        int i4;
        j09 j09Var2;
        int i5;
        int i6;
        float f5;
        int i7;
        int i8;
        float f6;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        y72 y72Var2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z4;
        final float f7;
        final mue mueVar2;
        final boolean z5;
        final y72 y72Var3;
        final float f8;
        final j09 j09Var3;
        final float f9;
        final boolean z6;
        final xw9 xw9Var2;
        ojb ojbVarV;
        xw9 bx9Var;
        float f10;
        xw9 xw9Var3;
        float f11;
        float f12;
        boolean z7;
        mue mueVar3;
        int i18;
        y72 y72Var4;
        j09 j09Var4;
        boolean z8;
        int iOrdinal;
        y72 y72Var5;
        str.getClass();
        x16Var.getClass();
        l46Var.h0(1365483881);
        if ((i & 6) == 0) {
            i4 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 == 0) {
            if ((i & 384) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i4 | 27648;
            i6 = i3 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    f5 = f3;
                    if (l46Var.d(f5)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i5 |= i7;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        f6 = f4;
                        if (l46Var.d(f6)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i5 |= i9;
                    }
                    i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    if (i10 != 0) {
                        if ((12582912 & i) == 0) {
                            z3 = z;
                            if (l46Var.h(z3)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i5 |= i11;
                        }
                        if ((i & 100663296) == 0) {
                            i5 |= 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 != 0) {
                            i5 |= 805306368;
                            y72Var2 = y72Var;
                        } else {
                            y72Var2 = y72Var;
                            if ((i & 805306368) == 0) {
                                if (l46Var.g(y72Var2)) {
                                    i13 = 536870912;
                                } else {
                                    i13 = 268435456;
                                }
                                i5 |= i13;
                            }
                        }
                        i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                        if (i14 != 0) {
                            i15 = 6;
                        } else if ((i2 & 6) == 0) {
                            if (l46Var.g(xw9Var)) {
                                i16 = 4;
                            } else {
                                i16 = 2;
                            }
                            i15 = i2 | i16;
                        } else {
                            i15 = i2;
                        }
                        i17 = i15 | 48;
                        if ((i5 & 306783379) == 306783378 || (i17 & 19) != 18) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (l46Var.W(i5 & 1, z4)) {
                            l46Var.b0();
                            if ((i & 1) != 0 || l46Var.C()) {
                                if (i19 != 0) {
                                    j09Var2 = g09.a;
                                }
                                if (i6 != 0) {
                                    f5 = 56.0f;
                                }
                                if (i8 != 0) {
                                    f6 = 218.0f;
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                }
                                mue mueVar4 = pue.a;
                                mue mueVarQ = pue.q(l46Var);
                                int i20 = (-234881025) & i5;
                                if (i12 != 0) {
                                    y72Var2 = new y72(y72.e);
                                }
                                if (i14 != 0) {
                                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    bx9Var = xw9Var;
                                }
                                f10 = f5;
                                xw9Var3 = bx9Var;
                                f11 = 32.0f;
                                f12 = f6;
                                z7 = true;
                                mueVar3 = mueVarQ;
                                i18 = i20;
                            } else {
                                l46Var.Z();
                                i18 = i5 & (-234881025);
                                mueVar3 = mueVar;
                                xw9Var3 = xw9Var;
                                f10 = f5;
                                f12 = f6;
                                f11 = f2;
                                z7 = z2;
                            }
                            y72Var4 = y72Var2;
                            j09Var4 = j09Var2;
                            z8 = z3;
                            l46Var.s();
                            iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                            if (iOrdinal != 0) {
                                l46Var.f0(-2029967276);
                                y72Var5 = y72Var4;
                                pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                                l46Var.r(false);
                            } else {
                                if (iOrdinal == 1) {
                                    throw tec.d(-2029969193, l46Var, false);
                                }
                                l46Var.f0(1495945796);
                                tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                                l46Var.r(false);
                                y72Var5 = y72Var4;
                            }
                            z5 = z7;
                            xw9Var2 = xw9Var3;
                            y72Var3 = y72Var5;
                            mueVar2 = mueVar3;
                            z6 = z8;
                            f9 = f12;
                            f8 = f10;
                            f7 = f11;
                            j09Var3 = j09Var4;
                        } else {
                            l46Var.Z();
                            f7 = f2;
                            mueVar2 = mueVar;
                            z5 = z2;
                            y72Var3 = y72Var2;
                            f8 = f5;
                            j09Var3 = j09Var2;
                            f9 = f6;
                            z6 = z3;
                            xw9Var2 = xw9Var;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: lk8
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i | 1);
                                    int iP2 = k99.P(i2);
                                    nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i5 |= 12582912;
                    z3 = z;
                    if ((i & 100663296) == 0) {
                        i5 |= 33554432;
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                        i5 |= 805306368;
                        y72Var2 = y72Var;
                    } else {
                        y72Var2 = y72Var;
                        if ((i & 805306368) == 0) {
                            if (l46Var.g(y72Var2)) {
                                i13 = 536870912;
                            } else {
                                i13 = 268435456;
                            }
                            i5 |= i13;
                        }
                    }
                    i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i14 != 0) {
                        i15 = 6;
                    } else if ((i2 & 6) == 0) {
                        if (l46Var.g(xw9Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    i17 = i15 | 48;
                    if ((i5 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i5 & 1, z4)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i19 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i6 != 0) {
                                f5 = 56.0f;
                            }
                            if (i8 != 0) {
                                f6 = 218.0f;
                            }
                            if (i10 != 0) {
                                z3 = true;
                            }
                            mue mueVar5 = pue.a;
                            mue mueVarQ2 = pue.q(l46Var);
                            int i21 = (-234881025) & i5;
                            if (i12 != 0) {
                                y72Var2 = new y72(y72.e);
                            }
                            if (i14 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var;
                            }
                            f10 = f5;
                            xw9Var3 = bx9Var;
                            f11 = 32.0f;
                            f12 = f6;
                            z7 = true;
                            mueVar3 = mueVarQ2;
                            i18 = i21;
                        } else {
                            if (i19 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i6 != 0) {
                                f5 = 56.0f;
                            }
                            if (i8 != 0) {
                                f6 = 218.0f;
                            }
                            if (i10 != 0) {
                                z3 = true;
                            }
                            mue mueVar6 = pue.a;
                            mue mueVarQ3 = pue.q(l46Var);
                            int i22 = (-234881025) & i5;
                            if (i12 != 0) {
                                y72Var2 = new y72(y72.e);
                            }
                            if (i14 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var;
                            }
                            f10 = f5;
                            xw9Var3 = bx9Var;
                            f11 = 32.0f;
                            f12 = f6;
                            z7 = true;
                            mueVar3 = mueVarQ3;
                            i18 = i22;
                        }
                        y72Var4 = y72Var2;
                        j09Var4 = j09Var2;
                        z8 = z3;
                        l46Var.s();
                        iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                        if (iOrdinal != 0) {
                            l46Var.f0(-2029967276);
                            y72Var5 = y72Var4;
                            pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                            l46Var.r(false);
                        } else {
                            if (iOrdinal == 1) {
                                throw tec.d(-2029969193, l46Var, false);
                            }
                            l46Var.f0(1495945796);
                            tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                            l46Var.r(false);
                            y72Var5 = y72Var4;
                        }
                        z5 = z7;
                        xw9Var2 = xw9Var3;
                        y72Var3 = y72Var5;
                        mueVar2 = mueVar3;
                        z6 = z8;
                        f9 = f12;
                        f8 = f10;
                        f7 = f11;
                        j09Var3 = j09Var4;
                    } else {
                        l46Var.Z();
                        f7 = f2;
                        mueVar2 = mueVar;
                        z5 = z2;
                        y72Var3 = y72Var2;
                        f8 = f5;
                        j09Var3 = j09Var2;
                        f9 = f6;
                        z6 = z3;
                        xw9Var2 = xw9Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: lk8
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                int iP2 = k99.P(i2);
                                nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i5 |= 1572864;
                f6 = f4;
                i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i10 != 0) {
                    if ((12582912 & i) == 0) {
                        z3 = z;
                        if (l46Var.h(z3)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i5 |= i11;
                    }
                    if ((i & 100663296) == 0) {
                        i5 |= 33554432;
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                        i5 |= 805306368;
                        y72Var2 = y72Var;
                    } else {
                        y72Var2 = y72Var;
                        if ((i & 805306368) == 0) {
                            if (l46Var.g(y72Var2)) {
                                i13 = 536870912;
                            } else {
                                i13 = 268435456;
                            }
                            i5 |= i13;
                        }
                    }
                    i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i14 != 0) {
                        i15 = 6;
                    } else if ((i2 & 6) == 0) {
                        if (l46Var.g(xw9Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    i17 = i15 | 48;
                    if ((i5 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i5 & 1, z4)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i19 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i6 != 0) {
                                f5 = 56.0f;
                            }
                            if (i8 != 0) {
                                f6 = 218.0f;
                            }
                            if (i10 != 0) {
                                z3 = true;
                            }
                            mue mueVar7 = pue.a;
                            mue mueVarQ4 = pue.q(l46Var);
                            int i23 = (-234881025) & i5;
                            if (i12 != 0) {
                                y72Var2 = new y72(y72.e);
                            }
                            if (i14 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var;
                            }
                            f10 = f5;
                            xw9Var3 = bx9Var;
                            f11 = 32.0f;
                            f12 = f6;
                            z7 = true;
                            mueVar3 = mueVarQ4;
                            i18 = i23;
                        } else {
                            if (i19 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i6 != 0) {
                                f5 = 56.0f;
                            }
                            if (i8 != 0) {
                                f6 = 218.0f;
                            }
                            if (i10 != 0) {
                                z3 = true;
                            }
                            mue mueVar8 = pue.a;
                            mue mueVarQ5 = pue.q(l46Var);
                            int i24 = (-234881025) & i5;
                            if (i12 != 0) {
                                y72Var2 = new y72(y72.e);
                            }
                            if (i14 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var;
                            }
                            f10 = f5;
                            xw9Var3 = bx9Var;
                            f11 = 32.0f;
                            f12 = f6;
                            z7 = true;
                            mueVar3 = mueVarQ5;
                            i18 = i24;
                        }
                        y72Var4 = y72Var2;
                        j09Var4 = j09Var2;
                        z8 = z3;
                        l46Var.s();
                        iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                        if (iOrdinal != 0) {
                            l46Var.f0(-2029967276);
                            y72Var5 = y72Var4;
                            pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                            l46Var.r(false);
                        } else {
                            if (iOrdinal == 1) {
                                throw tec.d(-2029969193, l46Var, false);
                            }
                            l46Var.f0(1495945796);
                            tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                            l46Var.r(false);
                            y72Var5 = y72Var4;
                        }
                        z5 = z7;
                        xw9Var2 = xw9Var3;
                        y72Var3 = y72Var5;
                        mueVar2 = mueVar3;
                        z6 = z8;
                        f9 = f12;
                        f8 = f10;
                        f7 = f11;
                        j09Var3 = j09Var4;
                    } else {
                        l46Var.Z();
                        f7 = f2;
                        mueVar2 = mueVar;
                        z5 = z2;
                        y72Var3 = y72Var2;
                        f8 = f5;
                        j09Var3 = j09Var2;
                        f9 = f6;
                        z6 = z3;
                        xw9Var2 = xw9Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: lk8
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                int iP2 = k99.P(i2);
                                nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i5 |= 12582912;
                z3 = z;
                if ((i & 100663296) == 0) {
                    i5 |= 33554432;
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                    i5 |= 805306368;
                    y72Var2 = y72Var;
                } else {
                    y72Var2 = y72Var;
                    if ((i & 805306368) == 0) {
                        if (l46Var.g(y72Var2)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i5 |= i13;
                    }
                }
                i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i14 != 0) {
                    i15 = 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(xw9Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                i17 = i15 | 48;
                if ((i5 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i5 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar9 = pue.a;
                        mue mueVarQ6 = pue.q(l46Var);
                        int i25 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ6;
                        i18 = i25;
                    } else {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar10 = pue.a;
                        mue mueVarQ7 = pue.q(l46Var);
                        int i26 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ7;
                        i18 = i26;
                    }
                    y72Var4 = y72Var2;
                    j09Var4 = j09Var2;
                    z8 = z3;
                    l46Var.s();
                    iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                    if (iOrdinal != 0) {
                        l46Var.f0(-2029967276);
                        y72Var5 = y72Var4;
                        pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                        l46Var.r(false);
                    } else {
                        if (iOrdinal == 1) {
                            throw tec.d(-2029969193, l46Var, false);
                        }
                        l46Var.f0(1495945796);
                        tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                        l46Var.r(false);
                        y72Var5 = y72Var4;
                    }
                    z5 = z7;
                    xw9Var2 = xw9Var3;
                    y72Var3 = y72Var5;
                    mueVar2 = mueVar3;
                    z6 = z8;
                    f9 = f12;
                    f8 = f10;
                    f7 = f11;
                    j09Var3 = j09Var4;
                } else {
                    l46Var.Z();
                    f7 = f2;
                    mueVar2 = mueVar;
                    z5 = z2;
                    y72Var3 = y72Var2;
                    f8 = f5;
                    j09Var3 = j09Var2;
                    f9 = f6;
                    z6 = z3;
                    xw9Var2 = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: lk8
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i5 = 224256 | i4;
            f5 = f3;
            i8 = i3 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    f6 = f4;
                    if (l46Var.d(f6)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
                i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i10 != 0) {
                    if ((12582912 & i) == 0) {
                        z3 = z;
                        if (l46Var.h(z3)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i5 |= i11;
                    }
                    if ((i & 100663296) == 0) {
                        i5 |= 33554432;
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                        i5 |= 805306368;
                        y72Var2 = y72Var;
                    } else {
                        y72Var2 = y72Var;
                        if ((i & 805306368) == 0) {
                            if (l46Var.g(y72Var2)) {
                                i13 = 536870912;
                            } else {
                                i13 = 268435456;
                            }
                            i5 |= i13;
                        }
                    }
                    i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i14 != 0) {
                        i15 = 6;
                    } else if ((i2 & 6) == 0) {
                        if (l46Var.g(xw9Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    i17 = i15 | 48;
                    if ((i5 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i5 & 1, z4)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i19 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i6 != 0) {
                                f5 = 56.0f;
                            }
                            if (i8 != 0) {
                                f6 = 218.0f;
                            }
                            if (i10 != 0) {
                                z3 = true;
                            }
                            mue mueVar11 = pue.a;
                            mue mueVarQ8 = pue.q(l46Var);
                            int i27 = (-234881025) & i5;
                            if (i12 != 0) {
                                y72Var2 = new y72(y72.e);
                            }
                            if (i14 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var;
                            }
                            f10 = f5;
                            xw9Var3 = bx9Var;
                            f11 = 32.0f;
                            f12 = f6;
                            z7 = true;
                            mueVar3 = mueVarQ8;
                            i18 = i27;
                        } else {
                            if (i19 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i6 != 0) {
                                f5 = 56.0f;
                            }
                            if (i8 != 0) {
                                f6 = 218.0f;
                            }
                            if (i10 != 0) {
                                z3 = true;
                            }
                            mue mueVar12 = pue.a;
                            mue mueVarQ9 = pue.q(l46Var);
                            int i28 = (-234881025) & i5;
                            if (i12 != 0) {
                                y72Var2 = new y72(y72.e);
                            }
                            if (i14 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var;
                            }
                            f10 = f5;
                            xw9Var3 = bx9Var;
                            f11 = 32.0f;
                            f12 = f6;
                            z7 = true;
                            mueVar3 = mueVarQ9;
                            i18 = i28;
                        }
                        y72Var4 = y72Var2;
                        j09Var4 = j09Var2;
                        z8 = z3;
                        l46Var.s();
                        iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                        if (iOrdinal != 0) {
                            l46Var.f0(-2029967276);
                            y72Var5 = y72Var4;
                            pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                            l46Var.r(false);
                        } else {
                            if (iOrdinal == 1) {
                                throw tec.d(-2029969193, l46Var, false);
                            }
                            l46Var.f0(1495945796);
                            tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                            l46Var.r(false);
                            y72Var5 = y72Var4;
                        }
                        z5 = z7;
                        xw9Var2 = xw9Var3;
                        y72Var3 = y72Var5;
                        mueVar2 = mueVar3;
                        z6 = z8;
                        f9 = f12;
                        f8 = f10;
                        f7 = f11;
                        j09Var3 = j09Var4;
                    } else {
                        l46Var.Z();
                        f7 = f2;
                        mueVar2 = mueVar;
                        z5 = z2;
                        y72Var3 = y72Var2;
                        f8 = f5;
                        j09Var3 = j09Var2;
                        f9 = f6;
                        z6 = z3;
                        xw9Var2 = xw9Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: lk8
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                int iP2 = k99.P(i2);
                                nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i5 |= 12582912;
                z3 = z;
                if ((i & 100663296) == 0) {
                    i5 |= 33554432;
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                    i5 |= 805306368;
                    y72Var2 = y72Var;
                } else {
                    y72Var2 = y72Var;
                    if ((i & 805306368) == 0) {
                        if (l46Var.g(y72Var2)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i5 |= i13;
                    }
                }
                i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i14 != 0) {
                    i15 = 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(xw9Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                i17 = i15 | 48;
                if ((i5 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i5 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar13 = pue.a;
                        mue mueVarQ10 = pue.q(l46Var);
                        int i29 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ10;
                        i18 = i29;
                    } else {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar14 = pue.a;
                        mue mueVarQ11 = pue.q(l46Var);
                        int i210 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ11;
                        i18 = i210;
                    }
                    y72Var4 = y72Var2;
                    j09Var4 = j09Var2;
                    z8 = z3;
                    l46Var.s();
                    iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                    if (iOrdinal != 0) {
                        l46Var.f0(-2029967276);
                        y72Var5 = y72Var4;
                        pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                        l46Var.r(false);
                    } else {
                        if (iOrdinal == 1) {
                            throw tec.d(-2029969193, l46Var, false);
                        }
                        l46Var.f0(1495945796);
                        tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                        l46Var.r(false);
                        y72Var5 = y72Var4;
                    }
                    z5 = z7;
                    xw9Var2 = xw9Var3;
                    y72Var3 = y72Var5;
                    mueVar2 = mueVar3;
                    z6 = z8;
                    f9 = f12;
                    f8 = f10;
                    f7 = f11;
                    j09Var3 = j09Var4;
                } else {
                    l46Var.Z();
                    f7 = f2;
                    mueVar2 = mueVar;
                    z5 = z2;
                    y72Var3 = y72Var2;
                    f8 = f5;
                    j09Var3 = j09Var2;
                    f9 = f6;
                    z6 = z3;
                    xw9Var2 = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: lk8
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i5 |= 1572864;
            f6 = f4;
            i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i10 != 0) {
                if ((12582912 & i) == 0) {
                    z3 = z;
                    if (l46Var.h(z3)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
                if ((i & 100663296) == 0) {
                    i5 |= 33554432;
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                    i5 |= 805306368;
                    y72Var2 = y72Var;
                } else {
                    y72Var2 = y72Var;
                    if ((i & 805306368) == 0) {
                        if (l46Var.g(y72Var2)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i5 |= i13;
                    }
                }
                i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i14 != 0) {
                    i15 = 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(xw9Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                i17 = i15 | 48;
                if ((i5 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i5 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar15 = pue.a;
                        mue mueVarQ12 = pue.q(l46Var);
                        int i211 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ12;
                        i18 = i211;
                    } else {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar16 = pue.a;
                        mue mueVarQ13 = pue.q(l46Var);
                        int i212 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ13;
                        i18 = i212;
                    }
                    y72Var4 = y72Var2;
                    j09Var4 = j09Var2;
                    z8 = z3;
                    l46Var.s();
                    iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                    if (iOrdinal != 0) {
                        l46Var.f0(-2029967276);
                        y72Var5 = y72Var4;
                        pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                        l46Var.r(false);
                    } else {
                        if (iOrdinal == 1) {
                            throw tec.d(-2029969193, l46Var, false);
                        }
                        l46Var.f0(1495945796);
                        tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                        l46Var.r(false);
                        y72Var5 = y72Var4;
                    }
                    z5 = z7;
                    xw9Var2 = xw9Var3;
                    y72Var3 = y72Var5;
                    mueVar2 = mueVar3;
                    z6 = z8;
                    f9 = f12;
                    f8 = f10;
                    f7 = f11;
                    j09Var3 = j09Var4;
                } else {
                    l46Var.Z();
                    f7 = f2;
                    mueVar2 = mueVar;
                    z5 = z2;
                    y72Var3 = y72Var2;
                    f8 = f5;
                    j09Var3 = j09Var2;
                    f9 = f6;
                    z6 = z3;
                    xw9Var2 = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: lk8
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i5 |= 12582912;
            z3 = z;
            if ((i & 100663296) == 0) {
                i5 |= 33554432;
            }
            i12 = i3 & 512;
            if (i12 != 0) {
                i5 |= 805306368;
                y72Var2 = y72Var;
            } else {
                y72Var2 = y72Var;
                if ((i & 805306368) == 0) {
                    if (l46Var.g(y72Var2)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i5 |= i13;
                }
            }
            i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i14 != 0) {
                i15 = 6;
            } else if ((i2 & 6) == 0) {
                if (l46Var.g(xw9Var)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
            }
            i17 = i15 | 48;
            if ((i5 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (l46Var.W(i5 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i19 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i6 != 0) {
                        f5 = 56.0f;
                    }
                    if (i8 != 0) {
                        f6 = 218.0f;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    mue mueVar17 = pue.a;
                    mue mueVarQ14 = pue.q(l46Var);
                    int i213 = (-234881025) & i5;
                    if (i12 != 0) {
                        y72Var2 = new y72(y72.e);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    f10 = f5;
                    xw9Var3 = bx9Var;
                    f11 = 32.0f;
                    f12 = f6;
                    z7 = true;
                    mueVar3 = mueVarQ14;
                    i18 = i213;
                } else {
                    if (i19 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i6 != 0) {
                        f5 = 56.0f;
                    }
                    if (i8 != 0) {
                        f6 = 218.0f;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    mue mueVar18 = pue.a;
                    mue mueVarQ15 = pue.q(l46Var);
                    int i214 = (-234881025) & i5;
                    if (i12 != 0) {
                        y72Var2 = new y72(y72.e);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    f10 = f5;
                    xw9Var3 = bx9Var;
                    f11 = 32.0f;
                    f12 = f6;
                    z7 = true;
                    mueVar3 = mueVarQ15;
                    i18 = i214;
                }
                y72Var4 = y72Var2;
                j09Var4 = j09Var2;
                z8 = z3;
                l46Var.s();
                iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                if (iOrdinal != 0) {
                    l46Var.f0(-2029967276);
                    y72Var5 = y72Var4;
                    pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                    l46Var.r(false);
                } else {
                    if (iOrdinal == 1) {
                        throw tec.d(-2029969193, l46Var, false);
                    }
                    l46Var.f0(1495945796);
                    tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                    l46Var.r(false);
                    y72Var5 = y72Var4;
                }
                z5 = z7;
                xw9Var2 = xw9Var3;
                y72Var3 = y72Var5;
                mueVar2 = mueVar3;
                z6 = z8;
                f9 = f12;
                f8 = f10;
                f7 = f11;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                f7 = f2;
                mueVar2 = mueVar;
                z5 = z2;
                y72Var3 = y72Var2;
                f8 = f5;
                j09Var3 = j09Var2;
                f9 = f6;
                z6 = z3;
                xw9Var2 = xw9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: lk8
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 384;
        j09Var2 = j09Var;
        i5 = i4 | 27648;
        i6 = i3 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                f5 = f3;
                if (l46Var.d(f5)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i5 |= i7;
            }
            i8 = i3 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    f6 = f4;
                    if (l46Var.d(f6)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
                i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i10 != 0) {
                    if ((12582912 & i) == 0) {
                        z3 = z;
                        if (l46Var.h(z3)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i5 |= i11;
                    }
                    if ((i & 100663296) == 0) {
                        i5 |= 33554432;
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                        i5 |= 805306368;
                        y72Var2 = y72Var;
                    } else {
                        y72Var2 = y72Var;
                        if ((i & 805306368) == 0) {
                            if (l46Var.g(y72Var2)) {
                                i13 = 536870912;
                            } else {
                                i13 = 268435456;
                            }
                            i5 |= i13;
                        }
                    }
                    i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i14 != 0) {
                        i15 = 6;
                    } else if ((i2 & 6) == 0) {
                        if (l46Var.g(xw9Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    i17 = i15 | 48;
                    if ((i5 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (l46Var.W(i5 & 1, z4)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i19 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i6 != 0) {
                                f5 = 56.0f;
                            }
                            if (i8 != 0) {
                                f6 = 218.0f;
                            }
                            if (i10 != 0) {
                                z3 = true;
                            }
                            mue mueVar19 = pue.a;
                            mue mueVarQ16 = pue.q(l46Var);
                            int i215 = (-234881025) & i5;
                            if (i12 != 0) {
                                y72Var2 = new y72(y72.e);
                            }
                            if (i14 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var;
                            }
                            f10 = f5;
                            xw9Var3 = bx9Var;
                            f11 = 32.0f;
                            f12 = f6;
                            z7 = true;
                            mueVar3 = mueVarQ16;
                            i18 = i215;
                        } else {
                            if (i19 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i6 != 0) {
                                f5 = 56.0f;
                            }
                            if (i8 != 0) {
                                f6 = 218.0f;
                            }
                            if (i10 != 0) {
                                z3 = true;
                            }
                            mue mueVar110 = pue.a;
                            mue mueVarQ17 = pue.q(l46Var);
                            int i216 = (-234881025) & i5;
                            if (i12 != 0) {
                                y72Var2 = new y72(y72.e);
                            }
                            if (i14 != 0) {
                                bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                bx9Var = xw9Var;
                            }
                            f10 = f5;
                            xw9Var3 = bx9Var;
                            f11 = 32.0f;
                            f12 = f6;
                            z7 = true;
                            mueVar3 = mueVarQ17;
                            i18 = i216;
                        }
                        y72Var4 = y72Var2;
                        j09Var4 = j09Var2;
                        z8 = z3;
                        l46Var.s();
                        iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                        if (iOrdinal != 0) {
                            l46Var.f0(-2029967276);
                            y72Var5 = y72Var4;
                            pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                            l46Var.r(false);
                        } else {
                            if (iOrdinal == 1) {
                                throw tec.d(-2029969193, l46Var, false);
                            }
                            l46Var.f0(1495945796);
                            tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                            l46Var.r(false);
                            y72Var5 = y72Var4;
                        }
                        z5 = z7;
                        xw9Var2 = xw9Var3;
                        y72Var3 = y72Var5;
                        mueVar2 = mueVar3;
                        z6 = z8;
                        f9 = f12;
                        f8 = f10;
                        f7 = f11;
                        j09Var3 = j09Var4;
                    } else {
                        l46Var.Z();
                        f7 = f2;
                        mueVar2 = mueVar;
                        z5 = z2;
                        y72Var3 = y72Var2;
                        f8 = f5;
                        j09Var3 = j09Var2;
                        f9 = f6;
                        z6 = z3;
                        xw9Var2 = xw9Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: lk8
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                int iP2 = k99.P(i2);
                                nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i5 |= 12582912;
                z3 = z;
                if ((i & 100663296) == 0) {
                    i5 |= 33554432;
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                    i5 |= 805306368;
                    y72Var2 = y72Var;
                } else {
                    y72Var2 = y72Var;
                    if ((i & 805306368) == 0) {
                        if (l46Var.g(y72Var2)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i5 |= i13;
                    }
                }
                i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i14 != 0) {
                    i15 = 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(xw9Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                i17 = i15 | 48;
                if ((i5 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i5 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar111 = pue.a;
                        mue mueVarQ18 = pue.q(l46Var);
                        int i217 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ18;
                        i18 = i217;
                    } else {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar112 = pue.a;
                        mue mueVarQ19 = pue.q(l46Var);
                        int i218 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ19;
                        i18 = i218;
                    }
                    y72Var4 = y72Var2;
                    j09Var4 = j09Var2;
                    z8 = z3;
                    l46Var.s();
                    iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                    if (iOrdinal != 0) {
                        l46Var.f0(-2029967276);
                        y72Var5 = y72Var4;
                        pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                        l46Var.r(false);
                    } else {
                        if (iOrdinal == 1) {
                            throw tec.d(-2029969193, l46Var, false);
                        }
                        l46Var.f0(1495945796);
                        tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                        l46Var.r(false);
                        y72Var5 = y72Var4;
                    }
                    z5 = z7;
                    xw9Var2 = xw9Var3;
                    y72Var3 = y72Var5;
                    mueVar2 = mueVar3;
                    z6 = z8;
                    f9 = f12;
                    f8 = f10;
                    f7 = f11;
                    j09Var3 = j09Var4;
                } else {
                    l46Var.Z();
                    f7 = f2;
                    mueVar2 = mueVar;
                    z5 = z2;
                    y72Var3 = y72Var2;
                    f8 = f5;
                    j09Var3 = j09Var2;
                    f9 = f6;
                    z6 = z3;
                    xw9Var2 = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: lk8
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i5 |= 1572864;
            f6 = f4;
            i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i10 != 0) {
                if ((12582912 & i) == 0) {
                    z3 = z;
                    if (l46Var.h(z3)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
                if ((i & 100663296) == 0) {
                    i5 |= 33554432;
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                    i5 |= 805306368;
                    y72Var2 = y72Var;
                } else {
                    y72Var2 = y72Var;
                    if ((i & 805306368) == 0) {
                        if (l46Var.g(y72Var2)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i5 |= i13;
                    }
                }
                i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i14 != 0) {
                    i15 = 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(xw9Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                i17 = i15 | 48;
                if ((i5 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i5 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar113 = pue.a;
                        mue mueVarQ110 = pue.q(l46Var);
                        int i219 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ110;
                        i18 = i219;
                    } else {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar114 = pue.a;
                        mue mueVarQ111 = pue.q(l46Var);
                        int i2110 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ111;
                        i18 = i2110;
                    }
                    y72Var4 = y72Var2;
                    j09Var4 = j09Var2;
                    z8 = z3;
                    l46Var.s();
                    iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                    if (iOrdinal != 0) {
                        l46Var.f0(-2029967276);
                        y72Var5 = y72Var4;
                        pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                        l46Var.r(false);
                    } else {
                        if (iOrdinal == 1) {
                            throw tec.d(-2029969193, l46Var, false);
                        }
                        l46Var.f0(1495945796);
                        tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                        l46Var.r(false);
                        y72Var5 = y72Var4;
                    }
                    z5 = z7;
                    xw9Var2 = xw9Var3;
                    y72Var3 = y72Var5;
                    mueVar2 = mueVar3;
                    z6 = z8;
                    f9 = f12;
                    f8 = f10;
                    f7 = f11;
                    j09Var3 = j09Var4;
                } else {
                    l46Var.Z();
                    f7 = f2;
                    mueVar2 = mueVar;
                    z5 = z2;
                    y72Var3 = y72Var2;
                    f8 = f5;
                    j09Var3 = j09Var2;
                    f9 = f6;
                    z6 = z3;
                    xw9Var2 = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: lk8
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i5 |= 12582912;
            z3 = z;
            if ((i & 100663296) == 0) {
                i5 |= 33554432;
            }
            i12 = i3 & 512;
            if (i12 != 0) {
                i5 |= 805306368;
                y72Var2 = y72Var;
            } else {
                y72Var2 = y72Var;
                if ((i & 805306368) == 0) {
                    if (l46Var.g(y72Var2)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i5 |= i13;
                }
            }
            i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i14 != 0) {
                i15 = 6;
            } else if ((i2 & 6) == 0) {
                if (l46Var.g(xw9Var)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
            }
            i17 = i15 | 48;
            if ((i5 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (l46Var.W(i5 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i19 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i6 != 0) {
                        f5 = 56.0f;
                    }
                    if (i8 != 0) {
                        f6 = 218.0f;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    mue mueVar115 = pue.a;
                    mue mueVarQ112 = pue.q(l46Var);
                    int i2111 = (-234881025) & i5;
                    if (i12 != 0) {
                        y72Var2 = new y72(y72.e);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    f10 = f5;
                    xw9Var3 = bx9Var;
                    f11 = 32.0f;
                    f12 = f6;
                    z7 = true;
                    mueVar3 = mueVarQ112;
                    i18 = i2111;
                } else {
                    if (i19 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i6 != 0) {
                        f5 = 56.0f;
                    }
                    if (i8 != 0) {
                        f6 = 218.0f;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    mue mueVar116 = pue.a;
                    mue mueVarQ113 = pue.q(l46Var);
                    int i2112 = (-234881025) & i5;
                    if (i12 != 0) {
                        y72Var2 = new y72(y72.e);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    f10 = f5;
                    xw9Var3 = bx9Var;
                    f11 = 32.0f;
                    f12 = f6;
                    z7 = true;
                    mueVar3 = mueVarQ113;
                    i18 = i2112;
                }
                y72Var4 = y72Var2;
                j09Var4 = j09Var2;
                z8 = z3;
                l46Var.s();
                iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                if (iOrdinal != 0) {
                    l46Var.f0(-2029967276);
                    y72Var5 = y72Var4;
                    pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                    l46Var.r(false);
                } else {
                    if (iOrdinal == 1) {
                        throw tec.d(-2029969193, l46Var, false);
                    }
                    l46Var.f0(1495945796);
                    tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                    l46Var.r(false);
                    y72Var5 = y72Var4;
                }
                z5 = z7;
                xw9Var2 = xw9Var3;
                y72Var3 = y72Var5;
                mueVar2 = mueVar3;
                z6 = z8;
                f9 = f12;
                f8 = f10;
                f7 = f11;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                f7 = f2;
                mueVar2 = mueVar;
                z5 = z2;
                y72Var3 = y72Var2;
                f8 = f5;
                j09Var3 = j09Var2;
                f9 = f6;
                z6 = z3;
                xw9Var2 = xw9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: lk8
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i5 = 224256 | i4;
        f5 = f3;
        i8 = i3 & 64;
        if (i8 != 0) {
            if ((1572864 & i) == 0) {
                f6 = f4;
                if (l46Var.d(f6)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
            i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i10 != 0) {
                if ((12582912 & i) == 0) {
                    z3 = z;
                    if (l46Var.h(z3)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
                if ((i & 100663296) == 0) {
                    i5 |= 33554432;
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                    i5 |= 805306368;
                    y72Var2 = y72Var;
                } else {
                    y72Var2 = y72Var;
                    if ((i & 805306368) == 0) {
                        if (l46Var.g(y72Var2)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i5 |= i13;
                    }
                }
                i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i14 != 0) {
                    i15 = 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(xw9Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                i17 = i15 | 48;
                if ((i5 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (l46Var.W(i5 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar117 = pue.a;
                        mue mueVarQ114 = pue.q(l46Var);
                        int i2113 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ114;
                        i18 = i2113;
                    } else {
                        if (i19 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i6 != 0) {
                            f5 = 56.0f;
                        }
                        if (i8 != 0) {
                            f6 = 218.0f;
                        }
                        if (i10 != 0) {
                            z3 = true;
                        }
                        mue mueVar118 = pue.a;
                        mue mueVarQ115 = pue.q(l46Var);
                        int i2114 = (-234881025) & i5;
                        if (i12 != 0) {
                            y72Var2 = new y72(y72.e);
                        }
                        if (i14 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        f10 = f5;
                        xw9Var3 = bx9Var;
                        f11 = 32.0f;
                        f12 = f6;
                        z7 = true;
                        mueVar3 = mueVarQ115;
                        i18 = i2114;
                    }
                    y72Var4 = y72Var2;
                    j09Var4 = j09Var2;
                    z8 = z3;
                    l46Var.s();
                    iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                    if (iOrdinal != 0) {
                        l46Var.f0(-2029967276);
                        y72Var5 = y72Var4;
                        pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                        l46Var.r(false);
                    } else {
                        if (iOrdinal == 1) {
                            throw tec.d(-2029969193, l46Var, false);
                        }
                        l46Var.f0(1495945796);
                        tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                        l46Var.r(false);
                        y72Var5 = y72Var4;
                    }
                    z5 = z7;
                    xw9Var2 = xw9Var3;
                    y72Var3 = y72Var5;
                    mueVar2 = mueVar3;
                    z6 = z8;
                    f9 = f12;
                    f8 = f10;
                    f7 = f11;
                    j09Var3 = j09Var4;
                } else {
                    l46Var.Z();
                    f7 = f2;
                    mueVar2 = mueVar;
                    z5 = z2;
                    y72Var3 = y72Var2;
                    f8 = f5;
                    j09Var3 = j09Var2;
                    f9 = f6;
                    z6 = z3;
                    xw9Var2 = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: lk8
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i5 |= 12582912;
            z3 = z;
            if ((i & 100663296) == 0) {
                i5 |= 33554432;
            }
            i12 = i3 & 512;
            if (i12 != 0) {
                i5 |= 805306368;
                y72Var2 = y72Var;
            } else {
                y72Var2 = y72Var;
                if ((i & 805306368) == 0) {
                    if (l46Var.g(y72Var2)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i5 |= i13;
                }
            }
            i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i14 != 0) {
                i15 = 6;
            } else if ((i2 & 6) == 0) {
                if (l46Var.g(xw9Var)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
            }
            i17 = i15 | 48;
            if ((i5 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (l46Var.W(i5 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i19 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i6 != 0) {
                        f5 = 56.0f;
                    }
                    if (i8 != 0) {
                        f6 = 218.0f;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    mue mueVar119 = pue.a;
                    mue mueVarQ116 = pue.q(l46Var);
                    int i2115 = (-234881025) & i5;
                    if (i12 != 0) {
                        y72Var2 = new y72(y72.e);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    f10 = f5;
                    xw9Var3 = bx9Var;
                    f11 = 32.0f;
                    f12 = f6;
                    z7 = true;
                    mueVar3 = mueVarQ116;
                    i18 = i2115;
                } else {
                    if (i19 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i6 != 0) {
                        f5 = 56.0f;
                    }
                    if (i8 != 0) {
                        f6 = 218.0f;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    mue mueVar1110 = pue.a;
                    mue mueVarQ117 = pue.q(l46Var);
                    int i2116 = (-234881025) & i5;
                    if (i12 != 0) {
                        y72Var2 = new y72(y72.e);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    f10 = f5;
                    xw9Var3 = bx9Var;
                    f11 = 32.0f;
                    f12 = f6;
                    z7 = true;
                    mueVar3 = mueVarQ117;
                    i18 = i2116;
                }
                y72Var4 = y72Var2;
                j09Var4 = j09Var2;
                z8 = z3;
                l46Var.s();
                iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                if (iOrdinal != 0) {
                    l46Var.f0(-2029967276);
                    y72Var5 = y72Var4;
                    pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                    l46Var.r(false);
                } else {
                    if (iOrdinal == 1) {
                        throw tec.d(-2029969193, l46Var, false);
                    }
                    l46Var.f0(1495945796);
                    tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                    l46Var.r(false);
                    y72Var5 = y72Var4;
                }
                z5 = z7;
                xw9Var2 = xw9Var3;
                y72Var3 = y72Var5;
                mueVar2 = mueVar3;
                z6 = z8;
                f9 = f12;
                f8 = f10;
                f7 = f11;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                f7 = f2;
                mueVar2 = mueVar;
                z5 = z2;
                y72Var3 = y72Var2;
                f8 = f5;
                j09Var3 = j09Var2;
                f9 = f6;
                z6 = z3;
                xw9Var2 = xw9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: lk8
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i5 |= 1572864;
        f6 = f4;
        i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i10 != 0) {
            if ((12582912 & i) == 0) {
                z3 = z;
                if (l46Var.h(z3)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
            if ((i & 100663296) == 0) {
                i5 |= 33554432;
            }
            i12 = i3 & 512;
            if (i12 != 0) {
                i5 |= 805306368;
                y72Var2 = y72Var;
            } else {
                y72Var2 = y72Var;
                if ((i & 805306368) == 0) {
                    if (l46Var.g(y72Var2)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i5 |= i13;
                }
            }
            i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i14 != 0) {
                i15 = 6;
            } else if ((i2 & 6) == 0) {
                if (l46Var.g(xw9Var)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
            }
            i17 = i15 | 48;
            if ((i5 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (l46Var.W(i5 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i19 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i6 != 0) {
                        f5 = 56.0f;
                    }
                    if (i8 != 0) {
                        f6 = 218.0f;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    mue mueVar1111 = pue.a;
                    mue mueVarQ118 = pue.q(l46Var);
                    int i2117 = (-234881025) & i5;
                    if (i12 != 0) {
                        y72Var2 = new y72(y72.e);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    f10 = f5;
                    xw9Var3 = bx9Var;
                    f11 = 32.0f;
                    f12 = f6;
                    z7 = true;
                    mueVar3 = mueVarQ118;
                    i18 = i2117;
                } else {
                    if (i19 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i6 != 0) {
                        f5 = 56.0f;
                    }
                    if (i8 != 0) {
                        f6 = 218.0f;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    mue mueVar1112 = pue.a;
                    mue mueVarQ119 = pue.q(l46Var);
                    int i2118 = (-234881025) & i5;
                    if (i12 != 0) {
                        y72Var2 = new y72(y72.e);
                    }
                    if (i14 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    f10 = f5;
                    xw9Var3 = bx9Var;
                    f11 = 32.0f;
                    f12 = f6;
                    z7 = true;
                    mueVar3 = mueVarQ119;
                    i18 = i2118;
                }
                y72Var4 = y72Var2;
                j09Var4 = j09Var2;
                z8 = z3;
                l46Var.s();
                iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
                if (iOrdinal != 0) {
                    l46Var.f0(-2029967276);
                    y72Var5 = y72Var4;
                    pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                    l46Var.r(false);
                } else {
                    if (iOrdinal == 1) {
                        throw tec.d(-2029969193, l46Var, false);
                    }
                    l46Var.f0(1495945796);
                    tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                    l46Var.r(false);
                    y72Var5 = y72Var4;
                }
                z5 = z7;
                xw9Var2 = xw9Var3;
                y72Var3 = y72Var5;
                mueVar2 = mueVar3;
                z6 = z8;
                f9 = f12;
                f8 = f10;
                f7 = f11;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                f7 = f2;
                mueVar2 = mueVar;
                z5 = z2;
                y72Var3 = y72Var2;
                f8 = f5;
                j09Var3 = j09Var2;
                f9 = f6;
                z6 = z3;
                xw9Var2 = xw9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: lk8
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i5 |= 12582912;
        z3 = z;
        if ((i & 100663296) == 0) {
            i5 |= 33554432;
        }
        i12 = i3 & 512;
        if (i12 != 0) {
            i5 |= 805306368;
            y72Var2 = y72Var;
        } else {
            y72Var2 = y72Var;
            if ((i & 805306368) == 0) {
                if (l46Var.g(y72Var2)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i5 |= i13;
            }
        }
        i14 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i14 != 0) {
            i15 = 6;
        } else if ((i2 & 6) == 0) {
            if (l46Var.g(xw9Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i2 | i16;
        } else {
            i15 = i2;
        }
        i17 = i15 | 48;
        if ((i5 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (l46Var.W(i5 & 1, z4)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i19 != 0) {
                    j09Var2 = g09.a;
                }
                if (i6 != 0) {
                    f5 = 56.0f;
                }
                if (i8 != 0) {
                    f6 = 218.0f;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                mue mueVar1113 = pue.a;
                mue mueVarQ1110 = pue.q(l46Var);
                int i2119 = (-234881025) & i5;
                if (i12 != 0) {
                    y72Var2 = new y72(y72.e);
                }
                if (i14 != 0) {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    bx9Var = xw9Var;
                }
                f10 = f5;
                xw9Var3 = bx9Var;
                f11 = 32.0f;
                f12 = f6;
                z7 = true;
                mueVar3 = mueVarQ1110;
                i18 = i2119;
            } else {
                if (i19 != 0) {
                    j09Var2 = g09.a;
                }
                if (i6 != 0) {
                    f5 = 56.0f;
                }
                if (i8 != 0) {
                    f6 = 218.0f;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                mue mueVar1114 = pue.a;
                mue mueVarQ1111 = pue.q(l46Var);
                int i21110 = (-234881025) & i5;
                if (i12 != 0) {
                    y72Var2 = new y72(y72.e);
                }
                if (i14 != 0) {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    bx9Var = xw9Var;
                }
                f10 = f5;
                xw9Var3 = bx9Var;
                f11 = 32.0f;
                f12 = f6;
                z7 = true;
                mueVar3 = mueVarQ1111;
                i18 = i21110;
            }
            y72Var4 = y72Var2;
            j09Var4 = j09Var2;
            z8 = z3;
            l46Var.s();
            iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
            if (iOrdinal != 0) {
                l46Var.f0(-2029967276);
                y72Var5 = y72Var4;
                pa7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, y72Var5, xw9Var3, z7, l46Var, i18 & 2147483646, i17 & 126);
                l46Var.r(false);
            } else {
                if (iOrdinal == 1) {
                    throw tec.d(-2029969193, l46Var, false);
                }
                l46Var.f0(1495945796);
                tm7.h(str, x16Var, j09Var4, f11, f10, f12, z8, mueVar3, null, xw9Var3, z7, l46Var, i18 & 268435454, i17 & 126);
                l46Var.r(false);
                y72Var5 = y72Var4;
            }
            z5 = z7;
            xw9Var2 = xw9Var3;
            y72Var3 = y72Var5;
            mueVar2 = mueVar3;
            z6 = z8;
            f9 = f12;
            f8 = f10;
            f7 = f11;
            j09Var3 = j09Var4;
        } else {
            l46Var.Z();
            f7 = f2;
            mueVar2 = mueVar;
            z5 = z2;
            y72Var3 = y72Var2;
            f8 = f5;
            j09Var3 = j09Var2;
            f9 = f6;
            z6 = z3;
            xw9Var2 = xw9Var;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: lk8
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i | 1);
                    int iP2 = k99.P(i2);
                    nk8.i(str, x16Var, j09Var3, f7, f8, f9, z6, mueVar2, y72Var3, xw9Var2, z5, (l46) obj, iP, iP2, i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void j(j09 j09Var, r91 r91Var, final LocalDate localDate, final List list, final Map map, final TarotSkinIdentify tarotSkinIdentify, x16 x16Var, final a26 a26Var, l46 l46Var, int i) {
        j09 j09Var2;
        r91Var.getClass();
        localDate.getClass();
        a26Var.getClass();
        l46Var.h0(1344287457);
        int i2 = i | 6 | (l46Var.g(r91Var) ? 32 : 16) | (l46Var.i(localDate) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(list) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(map) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 131072 : 65536) | (l46Var.i(x16Var) ? 1048576 : 524288) | (l46Var.i(a26Var) ? 8388608 : 4194304);
        if (l46Var.W(i2 & 1, (4793491 & i2) != 4793490)) {
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            abg.n(null, l46Var, 0);
            vd0.t(eb3.w(oa7.F(g09Var), null, 3), r91Var, false, false, null, null, af1.b0(272541294, new o26() { // from class: d19
                /* JADX WARN: Code duplicated, block: B:24:0x0074  */
                @Override // defpackage.o26
                public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean z;
                    d91 d91Var = (d91) obj2;
                    l46 l46Var2 = (l46) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((c31) obj).getClass();
                    d91Var.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= l46Var2.g(d91Var) ? 32 : 16;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 145) != 144)) {
                        boolean z2 = d91Var.b() == hh3.b;
                        qhe qheVar = (qhe) map.get(d91Var.a().toString());
                        boolean zContains = list.contains(d91Var.a().toString());
                        LocalDate localDateA = d91Var.a();
                        if (z2) {
                            if (pa7.t(localDate, d91Var.a())) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        abg.j(localDateA, false, z, d91Var.b(), zContains, qheVar, tarotSkinIdentify, a26Var, l46Var2, 0);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, (i2 & 112) | 12582912);
            String strQ = afc.q(R.string.text_uncollapsed, l46Var);
            String strQ2 = afc.q(R.string.text_collapsed, l46Var);
            boolean z = (i2 & 3670016) == 1048576;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new fn6(11, x16Var);
                l46Var.p0(objR);
            }
            abg.f(null, true, strQ, strQ2, (x16) objR, l46Var, 48);
            l46Var.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bq1(j09Var2, r91Var, localDate, list, map, tarotSkinIdentify, x16Var, a26Var, i);
        }
    }

    public static final void k(String str, khb khbVar, j09 j09Var, l46 l46Var, int i) {
        int i2;
        str.getClass();
        khbVar.getClass();
        l46Var.h0(2011211399);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(khbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            boolean z = khbVar.a;
            boolean z2 = khbVar.b;
            rhb rhbVar = new rhb(afc.q(R.string.reading_menu_copy_all, l46Var), afc.q(R.string.reading_menu_select, l46Var), afc.q(R.string.reading_menu_listen, l46Var), afc.q(R.string.reading_menu_share, l46Var));
            Object objR = l46Var.R();
            int i3 = 26;
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new i7b(i3);
                l46Var.p0(objR);
            }
            x16 x16Var = (x16) objR;
            boolean z3 = (i2 & 112) == 32;
            Object objR2 = l46Var.R();
            if (z3 || objR2 == i8cVar) {
                objR2 = new p59(i3, khbVar);
                l46Var.p0(objR2);
            }
            a26 a26Var = (a26) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new z8b(17);
                l46Var.p0(objR3);
            }
            a26 a26Var2 = (a26) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == i8cVar) {
                objR4 = new i7b(27);
                l46Var.p0(objR4);
            }
            rs0.g(str, z, rhbVar, x16Var, a26Var, a26Var2, (x16) objR4, j09Var, z2, l46Var, (i2 & 14) | 1772544 | ((i2 << 15) & 29360128));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, str, khbVar, j09Var, 8);
        }
    }

    public static final f46 l(f46 f46Var) {
        if (f46Var == null) {
            f46Var = null;
        }
        if (f46Var != null) {
            return f46Var;
        }
        wf2.b("Inconsistent composition");
        oo3.f();
        return null;
    }

    public static final ka1 m(l26 l26Var) {
        return new ka1(l26Var, nu4.a, -2, i41.a);
    }

    public static void n(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                r82.g(tec.e(i2, "at index "));
                return;
            }
        }
    }

    public static void o(Object obj) {
        if (obj != null) {
            return;
        }
        r82.g("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final wn2 p(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        enumArr.getClass();
        kx4 kx4Var = new kx4(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String strName = (String) qd0.q0(i2, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            kx4Var.k(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) qd0.q0(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    annotation.getClass();
                    int i4 = kx4Var.d;
                    List[] listArr = kx4Var.f;
                    List arrayList = listArr[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[kx4Var.d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        wn2 wn2Var = new wn2(str, enumArr);
        wn2Var.c = kx4Var;
        return wn2Var;
    }

    public static final long q(KeyEvent keyEvent) {
        return k99.g(keyEvent.getKeyCode());
    }

    public static final int r(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final ArcanaGroup s(int i) {
        lx4 entries = ArcanaGroup.getEntries();
        ListIterator listIterator = entries.listIterator(entries.size());
        while (listIterator.hasPrevious()) {
            ArcanaGroup arcanaGroup = (ArcanaGroup) listIterator.previous();
            if (t(arcanaGroup) <= i) {
                return arcanaGroup;
            }
        }
        r3.n("List contains no element matching the predicate.");
        return null;
    }

    public static final int t(ArcanaGroup arcanaGroup) {
        arcanaGroup.getClass();
        return ((TarotCardType) s72.v0(arcanaGroup.getTypes())).ordinal();
    }

    public static final boolean u(String str) {
        String string = v4e.o0(str).toString();
        if (string.length() < 2) {
            return false;
        }
        String strH = new rob("[：:：\\s]+").h(v4e.o0(v4e.Y("Spread Layout：", v4e.Y("Spread Layout:", v4e.Y("牌阵布局:", v4e.Y("牌阵布局：", string))))).toString(), "");
        return strH.length() >= 2 && !new rob("^[0-9]+$").g(strH);
    }

    public static final j09 v(j09 j09Var, a26 a26Var) {
        return j09Var.D(new kn5(a26Var));
    }

    public static final j09 w(j09 j09Var, a26 a26Var) {
        return j09Var.D(new bn9(a26Var));
    }

    public static Object x(x16 x16Var, zn2 zn2Var) {
        return ynb.p0(nu4.a, new z97(x16Var, null), zn2Var);
    }

    public static final String y(zc4 zc4Var, Instant instant) {
        if (gc4.a[zc4Var.e.ordinal()] != 1) {
            return zc4Var.a;
        }
        String string = cn1.z().getString(R.string.invitation_daily_event_title_with_suffix, ZonedDateTime.ofInstant(instant, ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(cn1.z().getString(R.string.invitation_daily_event_title_formatter))));
        string.getClass();
        return string;
    }

    public static String z(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        String str = pqf.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }
}
