package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.seasonal.model.SeasonalCard;
import tech.chatmind.api.seasonal.model.SeasonalElementGuides;
import tech.chatmind.api.seasonal.model.SeasonalFollowUp;
import tech.chatmind.api.seasonal.model.SeasonalReading;
import tech.chatmind.api.seasonal.model.SeasonalReadingCard;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;
import tech.chatmind.api.seasonal.model.SeasonalStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t4c {
    public static final void a(int i, int i2, l46 l46Var, j09 j09Var) {
        long jB;
        l46Var.h0(-1229597682);
        int i3 = (l46Var.e(i) ? 32 : 16) | i2 | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            t7c t7cVarA = s7c.a(new uc0(6.0f, true, new qc0(0)), ndb.y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
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
            l46Var.f0(-447510073);
            int i4 = 0;
            while (i4 < 2) {
                boolean z = i4 == i;
                if (z) {
                    l46Var.f0(290404110);
                    jB = ((e8b) l46Var.k(l8b.a)).i;
                } else {
                    l46Var.f0(290405645);
                    jB = y72.b(((e8b) l46Var.k(l8b.a)).q, 0.24f);
                }
                l46Var.r(false);
                s21.a(tm7.o(oa7.E(b.m(g09.a, z ? 16.0f : 6.0f, 6.0f), a7c.a), jB, g21.f), l46Var, 0);
                i4++;
            }
            l46Var.r(false);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb(i, j09Var, i2, 10);
        }
    }

    public static final void b(l26 l26Var, o26 o26Var, l26 l26Var2, o26 o26Var2, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-2090131479);
        int i2 = (l46Var.i(l26Var) ? 4 : 2) | i | (l46Var.i(l26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            mh3.a(s4c.a.a(new r4c(l26Var == null ? r4c.e.a : l26Var, o26Var == null ? r4c.e.b : o26Var, l26Var2 == null ? r4c.e.c : l26Var2, o26Var2 == null ? r4c.e.d : o26Var2)), af1.b0(-1030900567, new qx1(dd2Var, 23), l46Var), l46Var, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm((Object) l26Var, (Object) o26Var, (m26) l26Var2, (m26) o26Var2, (m26) dd2Var, i, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    /* JADX WARN: Code duplicated, block: B:97:0x0137  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void c(j09 j09Var, String str, l26 l26Var, final int i, final int i2, long j, float f, final n26 n26Var, final x16 x16Var, final dd2 dd2Var, l46 l46Var, final int i3, final int i4) {
        final j09 j09Var2;
        int i5;
        int i6;
        int i7;
        long j2;
        final float f2;
        int i8;
        n26 n26Var2;
        x16 x16Var2;
        boolean z;
        final String str2;
        final l26 l26Var2;
        final long j3;
        ojb ojbVarV;
        j09 j09Var3;
        float f3;
        l26 l26Var3;
        String str3;
        int i9;
        int i10;
        int i11;
        x16Var.getClass();
        l46Var.h0(961135362);
        int i12 = i4 & 1;
        if (i12 != 0) {
            i5 = i3 | 6;
            j09Var2 = j09Var;
        } else if ((i3 & 6) == 0) {
            j09Var2 = j09Var;
            i5 = (l46Var.g(j09Var2) ? 4 : 2) | i3;
        } else {
            j09Var2 = j09Var;
            i5 = i3;
        }
        int i13 = i5 | 432;
        if ((i3 & 3072) == 0) {
            i6 = i;
            i13 |= l46Var.e(i6) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            i6 = i;
        }
        if ((i3 & 24576) == 0) {
            i7 = i2;
            i13 |= l46Var.e(i7) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            i7 = i2;
        }
        if ((196608 & i3) == 0) {
            if ((i4 & 32) == 0) {
                j2 = j;
                int i14 = l46Var.f(j2) ? 131072 : 65536;
                i13 |= i14;
            } else {
                j2 = j;
            }
            i13 |= i14;
        } else {
            j2 = j;
        }
        int i15 = i4 & 64;
        if (i15 == 0) {
            if ((1572864 & i3) == 0) {
                f2 = f;
                i13 |= l46Var.d(f2) ? 1048576 : 524288;
            }
            i8 = i13 | 12582912;
            if ((100663296 & i3) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i8 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((805306368 & i3) == 0) {
                x16Var2 = x16Var;
                if (l46Var.i(x16Var2)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i8 |= i10;
            } else {
                x16Var2 = x16Var;
            }
            if ((306783379 & i8) == 306783378) {
                z = false;
            } else {
                z = true;
            }
            if (l46Var.W(i8 & 1, z)) {
                l46Var.b0();
                if ((i3 & 1) != 0 || l46Var.C()) {
                    if (i12 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    dd2 dd2Var2 = kj0.f;
                    if ((i4 & 32) != 0) {
                        j2 = ((e8b) l46Var.k(l8b.a)).e;
                        i8 &= -458753;
                    }
                    if (i15 != 0) {
                        f3 = 48.0f;
                    } else {
                        f3 = f2;
                    }
                    int i16 = i8;
                    l26Var3 = dd2Var2;
                    str3 = "";
                    i9 = i16;
                } else {
                    l46Var.Z();
                    if ((i4 & 32) != 0) {
                        i8 &= -458753;
                    }
                    j09Var3 = j09Var2;
                    f3 = f2;
                    str3 = str;
                    i9 = i8;
                    l26Var3 = l26Var;
                }
                l46Var.s();
                ynb.m(j09Var3, str3, l26Var3, i6, i7, j2, f3, n26Var2, x16Var2, dd2Var, l46Var, 2147483646 & i9);
                l26Var2 = l26Var3;
                f2 = f3;
                str2 = str3;
                j09Var2 = j09Var3;
            } else {
                l46Var.Z();
                str2 = str;
                l26Var2 = l26Var;
            }
            j3 = j2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: v8d
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i3 | 1);
                        t4c.c(j09Var2, str2, l26Var2, i, i2, j3, f2, n26Var, x16Var, dd2Var, (l46) obj, iP, i4);
                        return wef.a;
                    }
                };
            }
        }
        i13 |= 1572864;
        f2 = f;
        i8 = i13 | 12582912;
        if ((100663296 & i3) == 0) {
            n26Var2 = n26Var;
            if (l46Var.i(n26Var2)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i8 |= i11;
        } else {
            n26Var2 = n26Var;
        }
        if ((805306368 & i3) == 0) {
            x16Var2 = x16Var;
            if (l46Var.i(x16Var2)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i8 |= i10;
        } else {
            x16Var2 = x16Var;
        }
        if ((306783379 & i8) == 306783378) {
            z = false;
        } else {
            z = true;
        }
        if (l46Var.W(i8 & 1, z)) {
            l46Var.b0();
            if ((i3 & 1) != 0) {
                if (i12 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                dd2 dd2Var3 = kj0.f;
                if ((i4 & 32) != 0) {
                    j2 = ((e8b) l46Var.k(l8b.a)).e;
                    i8 &= -458753;
                }
                if (i15 != 0) {
                    f3 = 48.0f;
                } else {
                    f3 = f2;
                }
                int i17 = i8;
                l26Var3 = dd2Var3;
                str3 = "";
                i9 = i17;
            } else {
                if (i12 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                dd2 dd2Var4 = kj0.f;
                if ((i4 & 32) != 0) {
                    j2 = ((e8b) l46Var.k(l8b.a)).e;
                    i8 &= -458753;
                }
                if (i15 != 0) {
                    f3 = 48.0f;
                } else {
                    f3 = f2;
                }
                int i18 = i8;
                l26Var3 = dd2Var4;
                str3 = "";
                i9 = i18;
            }
            l46Var.s();
            ynb.m(j09Var3, str3, l26Var3, i6, i7, j2, f3, n26Var2, x16Var2, dd2Var, l46Var, 2147483646 & i9);
            l26Var2 = l26Var3;
            f2 = f3;
            str2 = str3;
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            str2 = str;
            l26Var2 = l26Var;
        }
        j3 = j2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: v8d
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i3 | 1);
                    t4c.c(j09Var2, str2, l26Var2, i, i2, j3, f2, n26Var, x16Var, dd2Var, (l46) obj, iP, i4);
                    return wef.a;
                }
            };
        }
    }

    public static final void d(int i, k00 k00Var, l46 l46Var, int i2) {
        k00 k00Var2 = k00Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1874268951);
        int i3 = i2 | (l46Var2.g(k00Var2) ? 32 : 16);
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            pr4 pr4Var = l8b.a;
            long j = ((e8b) l46Var2.k(pr4Var)).q;
            long j2 = ((e8b) l46Var2.k(pr4Var)).u;
            if (!we6.e(l46Var2)) {
                j = j2;
            }
            long jD = abg.d(4279440148L);
            long j3 = y72.e;
            if (!we6.e(l46Var2)) {
                jD = j3;
            }
            t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
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
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarO = tm7.o(b.l(g09Var, 16.0f), j, a7c.a);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarO);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            nte.b(String.valueOf(i), null, jD, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, new mue(0L, w6c.l(10), ar5.y, null, null, 0L, 0L, 0, 0, w6c.l(10), new iga(), new y58(v58.b, 17, 0), 15073273), l46Var, 0, 0, 130042);
            l46Var.r(true);
            mue mueVar = pue.a;
            k00Var2 = k00Var;
            nte.c(k00Var2, null, ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, pue.e(l46Var), l46Var, (i3 >> 3) & 14, 0, 262138);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new st5(i, i2, k00Var2);
        }
    }

    public static final void e(j09 j09Var, String str, x6d x6dVar, n26 n26Var, x16 x16Var, dd2 dd2Var, l46 l46Var, int i, int i2) {
        int i3;
        j09 j09Var2;
        str.getClass();
        x6dVar.getClass();
        x16Var.getClass();
        l46Var.h0(456527703);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? l46Var.g(x6dVar) : l46Var.i(x6dVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var.i(n26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i3 |= l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i3 |= l46Var.i(dd2Var) ? 131072 : 65536;
        }
        if (l46Var.W(i3 & 1, (74899 & i3) != 74898)) {
            if (i4 != 0) {
                j09Var = g09.a;
            }
            j09 j09Var3 = j09Var;
            l46Var.d0(636466815, l46Var.I(x6dVar.a, x6dVar.b));
            scc.d(j09Var3, str, x6dVar, n26Var, x16Var, dd2Var, l46Var, (i3 & 126) | 512 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
            l46Var.r(false);
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fr1(j09Var2, str, x6dVar, n26Var, x16Var, dd2Var, i, i2, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0054  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x013b  */
    /* JADX WARN: Code duplicated, block: B:45:0x018a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0192  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0229  */
    /* JADX WARN: Code duplicated, block: B:56:0x0235  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void f(int i, int i2, l46 l46Var, j09 j09Var, boolean z) {
        int i3;
        boolean z2;
        boolean z3;
        j09 j09Var2;
        boolean z4;
        ojb ojbVarV;
        g09 g09Var;
        j09 j09Var3;
        boolean z5;
        jx0 jx0Var;
        boolean z6;
        ov7 ov7Var;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        he2 he2Var4;
        j09 j09Var4;
        g09 g09Var2;
        he2 he2Var5;
        jx0 jx0Var2;
        int i4;
        he2 he2Var6;
        he2 he2Var7;
        he2 he2Var8;
        ov7 ov7Var2;
        long j;
        long j2;
        long j3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1791515902);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (l46Var.g(j09Var) ? 4 : 2);
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= l46Var2.h(z2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var2.W(i3 & 1, z3)) {
                g09Var = g09.a;
                if (i5 != 0) {
                    j09Var3 = g09Var;
                } else {
                    j09Var3 = j09Var;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                j09 j09VarC = b.c(j09Var3, 1.0f);
                uc0 uc0Var = new uc0(24.0f, true, new qc0(0));
                jx0Var = ndb.Y;
                c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var2, 6);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarC);
                lf2.q.getClass();
                l46Var2.j0();
                z6 = l46Var2.S;
                ov7Var = LayoutNode.h1;
                if (z6) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                he2Var = hj6.z;
                dec.l(he2Var, l46Var2, c92VarA);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var2, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var2, numValueOf);
                dec.k(l46Var2);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var2, j09VarJ);
                if (z5) {
                    l46Var2.f0(-722875772);
                    String strQ = afc.q(R.string.widget_onboarding_guide_title, l46Var2);
                    mue mueVar = pue.a;
                    j09Var4 = j09Var3;
                    g09Var2 = g09Var;
                    he2Var5 = he2Var2;
                    jx0Var2 = jx0Var;
                    he2Var7 = he2Var3;
                    he2Var6 = he2Var4;
                    he2Var8 = he2Var;
                    ov7Var2 = ov7Var;
                    nte.b(strQ, b.c(g09Var, 1.0f), ((e8b) l46Var2.k(l8b.a)).q, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var, 48, 0, 129912);
                    l46Var2 = l46Var;
                    i4 = 0;
                    l46Var2.r(false);
                } else {
                    j09Var4 = j09Var3;
                    g09Var2 = g09Var;
                    he2Var5 = he2Var2;
                    jx0Var2 = jx0Var;
                    i4 = 0;
                    he2Var6 = he2Var4;
                    he2Var7 = he2Var3;
                    he2Var8 = he2Var;
                    ov7Var2 = ov7Var;
                    l46Var2.f0(-722583442);
                    l46Var2.r(false);
                }
                g09 g09Var3 = g09Var2;
                p(dj6.w(b.c(g09Var3, 1.0f), 1.0f), l46Var2, 6);
                c92 c92VarA2 = a92.a(new uc0(16.0f, true, new qc0(i4)), jx0Var2, l46Var2, 6);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, g09Var3);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var2);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var8, l46Var2, c92VarA2);
                dec.l(he2Var5, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var7, l46Var2);
                dec.l(he2Var6, l46Var2, j09VarJ2);
                ar5 ar5Var = ar5.y;
                pr4 pr4Var = l8b.a;
                j = ((e8b) l46Var2.k(pr4Var)).q;
                j2 = ((e8b) l46Var2.k(pr4Var)).u;
                if (we6.e(l46Var2)) {
                    j3 = j;
                } else {
                    j3 = j2;
                }
                xtd xtdVar = new xtd(j3, 0L, ar5Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530);
                d(1, new k00(afc.q(R.string.widget_onboarding_guide_step_1, l46Var2)), l46Var2, 6);
                d(2, new k00(afc.q(R.string.widget_onboarding_guide_step_2, l46Var2)), l46Var2, 6);
                d(3, af1.z(R.string.widget_onboarding_guide_step_3, l46Var2, xtdVar), l46Var2, 6);
                d(4, af1.z(R.string.widget_onboarding_guide_step_4, l46Var2, xtdVar), l46Var2, 6);
                l46Var2.r(true);
                l46Var2.r(true);
                z4 = z5;
                j09Var2 = j09Var4;
            } else {
                l46Var2.Z();
                j09Var2 = j09Var;
                z4 = z2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new xx1(j09Var2, z4, i, i2, 3);
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var2.W(i3 & 1, z3)) {
            g09Var = g09.a;
            if (i5 != 0) {
                j09Var3 = g09Var;
            } else {
                j09Var3 = j09Var;
            }
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            j09 j09VarC2 = b.c(j09Var3, 1.0f);
            uc0 uc0Var2 = new uc0(24.0f, true, new qc0(0));
            jx0Var = ndb.Y;
            c92 c92VarA3 = a92.a(uc0Var2, jx0Var, l46Var2, 6);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarC2);
            lf2.q.getClass();
            l46Var2.j0();
            z6 = l46Var2.S;
            ov7Var = LayoutNode.h1;
            if (z6) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA3);
            he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM3);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf2);
            dec.k(l46Var2);
            he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ3);
            if (z5) {
                l46Var2.f0(-722875772);
                String strQ2 = afc.q(R.string.widget_onboarding_guide_title, l46Var2);
                mue mueVar2 = pue.a;
                j09Var4 = j09Var3;
                g09Var2 = g09Var;
                he2Var5 = he2Var2;
                jx0Var2 = jx0Var;
                he2Var7 = he2Var3;
                he2Var6 = he2Var4;
                he2Var8 = he2Var;
                ov7Var2 = ov7Var;
                nte.b(strQ2, b.c(g09Var, 1.0f), ((e8b) l46Var2.k(l8b.a)).q, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var, 48, 0, 129912);
                l46Var2 = l46Var;
                i4 = 0;
                l46Var2.r(false);
            } else {
                j09Var4 = j09Var3;
                g09Var2 = g09Var;
                he2Var5 = he2Var2;
                jx0Var2 = jx0Var;
                i4 = 0;
                he2Var6 = he2Var4;
                he2Var7 = he2Var3;
                he2Var8 = he2Var;
                ov7Var2 = ov7Var;
                l46Var2.f0(-722583442);
                l46Var2.r(false);
            }
            g09 g09Var4 = g09Var2;
            p(dj6.w(b.c(g09Var4, 1.0f), 1.0f), l46Var2, 6);
            c92 c92VarA4 = a92.a(new uc0(16.0f, true, new qc0(i4)), jx0Var2, l46Var2, 6);
            int iHashCode4 = Long.hashCode(l46Var2.T);
            u8a u8aVarM4 = l46Var2.m();
            j09 j09VarJ4 = m93.J(l46Var2, g09Var4);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var2);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var8, l46Var2, c92VarA4);
            dec.l(he2Var5, l46Var2, u8aVarM4);
            ib8.s(iHashCode4, l46Var2, he2Var7, l46Var2);
            dec.l(he2Var6, l46Var2, j09VarJ4);
            ar5 ar5Var2 = ar5.y;
            pr4 pr4Var2 = l8b.a;
            j = ((e8b) l46Var2.k(pr4Var2)).q;
            j2 = ((e8b) l46Var2.k(pr4Var2)).u;
            if (we6.e(l46Var2)) {
                j3 = j;
            } else {
                j3 = j2;
            }
            xtd xtdVar2 = new xtd(j3, 0L, ar5Var2, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530);
            d(1, new k00(afc.q(R.string.widget_onboarding_guide_step_1, l46Var2)), l46Var2, 6);
            d(2, new k00(afc.q(R.string.widget_onboarding_guide_step_2, l46Var2)), l46Var2, 6);
            d(3, af1.z(R.string.widget_onboarding_guide_step_3, l46Var2, xtdVar2), l46Var2, 6);
            d(4, af1.z(R.string.widget_onboarding_guide_step_4, l46Var2, xtdVar2), l46Var2, 6);
            l46Var2.r(true);
            l46Var2.r(true);
            z4 = z5;
            j09Var2 = j09Var4;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
            z4 = z2;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xx1(j09Var2, z4, i, i2, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void g(String str, x16 x16Var, j09 j09Var, l46 l46Var, int i, int i2) {
        String str2;
        int i3;
        j09 j09Var2;
        boolean z;
        j09 j09Var3;
        ojb ojbVarV;
        j09 j09Var4;
        str.getClass();
        x16Var.getClass();
        l46Var.h0(-1366349737);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (l46Var.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                j09Var2 = j09Var;
                i3 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i3 & 1, z)) {
                if (i4 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                int i5 = i3 << 3;
                c8b.i(b.b(0.0f, 56.0f, b.c(j09Var4, 1.0f), 1), str2, null, null, 0L, 0.0f, false, null, null, false, null, null, x16Var, l46Var, i5 & 112, i5 & 896, 4092);
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new kr((Object) str, x16Var, (Object) j09Var3, i, i2, 14);
            }
        }
        i3 |= 384;
        j09Var2 = j09Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i3 & 1, z)) {
            if (i4 != 0) {
                j09Var4 = g09.a;
            } else {
                j09Var4 = j09Var2;
            }
            int i6 = i3 << 3;
            c8b.i(b.b(0.0f, 56.0f, b.c(j09Var4, 1.0f), 1), str2, null, null, 0L, 0.0f, false, null, null, false, null, null, x16Var, l46Var, i6 & 112, i6 & 896, 4092);
            j09Var3 = j09Var4;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr((Object) str, x16Var, (Object) j09Var3, i, i2, 14);
        }
    }

    public static final void h(x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(909480342);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i | (l46Var.i(x16Var2) ? 32 : 16);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(c6g.a);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new r5g(2, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, wef.a);
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new xfc(e89Var, 22);
                l46Var.p0(objR3);
            }
            j(x16Var, (x16) objR3, l46Var, (i2 & 14) | 48);
            if (((c6g) e89Var.getValue()) == c6g.b) {
                l46Var.f0(1675834367);
                Object objR4 = l46Var.R();
                if (objR4 == i8cVar) {
                    objR4 = new xfc(e89Var, 23);
                    l46Var.p0(objR4);
                }
                i((x16) objR4, x16Var2, l46Var, (i2 & 112) | 6);
                l46Var.r(false);
            } else {
                l46Var.f0(1675969868);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q5g(i, i3, x16Var, x16Var2);
        }
    }

    public static final void i(x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        x16 x16Var3;
        l46Var.h0(303526945);
        int i2 = (l46Var.i(x16Var2) ? 32 : 16) | i;
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            ted tedVarF = zz8.f(6, 2, null, l46Var);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            boolean zG = l46Var.g(tedVarF) | l46Var.i(aw2Var);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new m50(tedVarF, aw2Var, x16Var, 8);
                l46Var.p0(objR2);
            }
            x16 x16Var4 = (x16) objR2;
            x16Var3 = x16Var2;
            k(tedVarF, x16Var4, af1.b0(2017399432, new sz7(x16Var4, aw2Var, tedVarF, x16Var3, 20), l46Var), l46Var, 384);
        } else {
            x16Var3 = x16Var2;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q5g(i, i3, x16Var, x16Var3);
        }
    }

    public static final void j(x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        l46Var.h0(-242940015);
        int i2 = 4;
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            ted tedVarF = zz8.f(6, 2, null, l46Var);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new t5g(2, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, wef.a);
            boolean zG = l46Var.g(tedVarF) | l46Var.i(aw2Var) | ((i3 & 14) == 4);
            Object objR3 = l46Var.R();
            if (zG || objR3 == obj) {
                objR3 = new m50(tedVarF, aw2Var, x16Var, 10);
                l46Var.p0(objR3);
            }
            x16 x16Var3 = (x16) objR3;
            k(tedVarF, x16Var3, af1.b0(1470932472, new ht5(x16Var3, x16Var2, i2), l46Var), l46Var, 384);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i, 28, x16Var, x16Var2);
        }
    }

    public static final void k(ted tedVar, x16 x16Var, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(1277031798);
        int i2 = i | (l46Var.g(tedVar) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            zz8.a(x16Var, null, tedVar, 0.0f, false, null, y72.j, 0L, ((e8b) l46Var.k(l8b.a)).m, null, null, null, af1.b0(1743723480, new ec(dd2Var, 12), l46Var), l46Var, ((i2 >> 3) & 14) | 1572864 | ((i2 << 6) & 896), 3078, 6586);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new j4g(tedVar, x16Var, dd2Var, i, 1);
        }
    }

    public static final void l(String str, String str2, dd2 dd2Var, l46 l46Var, int i) {
        l26 l26Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1706468817);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.g(str2) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09VarE = oa7.E(b.c(g09Var, 1.0f), a7c.b(32.0f));
            pr4 pr4Var = l8b.a;
            j09 j09VarZ = ynb.Z(db6.w(tm7.o(j09VarE, ((e8b) l46Var2.k(pr4Var)).m, g21.f), 0.5f, ((e8b) l46Var2.k(pr4Var)).A, a7c.b(32.0f)), 20.0f);
            uc0 uc0Var = new uc0(16.0f, true, new qc0(0));
            jx0 jx0Var = ndb.Y;
            c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarZ);
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
            c92 c92VarA2 = a92.a(new uc0(4.0f, true, new qc0(0)), jx0Var, l46Var2, 6);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            mue mueVar = pue.a;
            nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.d(l46Var2), l46Var2, i2 & 14, 0, 131066);
            nte.b(str2, null, ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var2), l46Var2, (i2 >> 3) & 14, 0, 131066);
            l46Var2 = l46Var2;
            l46Var2.r(true);
            l26Var = dd2Var;
            l26Var.z(l46Var2, 6);
            l46Var2.r(true);
        } else {
            l26Var = dd2Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o7b(i, str, str2, l26Var, 24);
        }
    }

    public static final void m(int i, l46 l46Var) {
        l46Var.h0(1820693240);
        if (l46Var.W(i & 1, i != 0)) {
            l(afc.q(R.string.widget_onboarding_card_daily_title, l46Var), afc.q(R.string.widget_onboarding_card_daily_desc, l46Var), t72.l, l46Var, 384);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cwe(i, 11);
        }
    }

    public static final void n(int i, l46 l46Var) {
        l46Var.h0(-1481801784);
        if (l46Var.W(i & 1, i != 0)) {
            l(afc.q(R.string.widget_onboarding_card_qd_title, l46Var), afc.q(R.string.widget_onboarding_card_qd_desc, l46Var), t72.m, l46Var, 384);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cwe(i, 12);
        }
    }

    public static final void o(int i, l46 l46Var) {
        l46Var.h0(-1614006318);
        if (l46Var.W(i & 1, i != 0)) {
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = new yqf(8);
                l46Var.p0(objR);
            }
            cs3 cs3VarB = ay9.b(0, 384, 3, (x16) objR, l46Var);
            u69 u69Var = cs3VarB.p;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            boolean zG = l46Var.g(u69Var);
            Object objR3 = l46Var.R();
            if (zG || objR3 == obj) {
                objR3 = new cl4(u69Var, e89Var, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, u69Var);
            Boolean bool = (Boolean) e89Var.getValue();
            bool.booleanValue();
            boolean zG2 = l46Var.g(e89Var) | l46Var.g(cs3VarB);
            Object objR4 = l46Var.R();
            if (zG2 || objR4 == obj) {
                objR4 = new u5g(cs3VarB, e89Var, null);
                l46Var.p0(objR4);
            }
            af1.o((l26) objR4, l46Var, bool);
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
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
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            cn1.h(8.0f, 0, 199680, 16342, null, t72.k, l46Var, null, null, null, null, hj6.U0, cs3VarB, null, null, false);
            a(((sz9) cs3VarB.d.c).j(), 6, l46Var, new mq6(ndb.Z));
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cwe(i, 10);
        }
    }

    public static final void p(j09 j09Var, l46 l46Var, int i) {
        l46Var.h0(2063978242);
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            pr4 pr4Var = l8b.a;
            String str = k8b.f((e8b) l46Var.k(pr4Var)) ? "lottie/widget-onboarding-tutorial-dark.json" : "lottie/widget-onboarding-tutorial-light.json";
            long jD = abg.d(4281150767L);
            long jD2 = abg.d(4293783021L);
            if (!we6.e(l46Var)) {
                jD = jD2;
            }
            j09 j09VarW = db6.w(tm7.o(oa7.E(j09Var, a7c.b(32.0f)), jD, g21.f), 0.5f, ((e8b) l46Var.k(pr4Var)).A, a7c.b(32.0f));
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarW);
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
            od4.g(b.c, str, false, Integer.MAX_VALUE, 0.0f, null, null, l46Var, 3078, 116);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new do6(i, 14, j09Var);
        }
    }

    public static final j2 q(yn7 yn7Var, yn7 yn7Var2, boolean z) {
        tt7 tt7VarE;
        yn7Var.getClass();
        yn7Var2.getClass();
        if (!rce.a) {
            j2 j2Var = (j2) yn7Var;
            j2 j2Var2 = (j2) yn7Var2;
            return j2Var.equals(j2Var2) ? j2Var : new aj5(j2Var, j2Var2, z, null);
        }
        tt7 tt7Var = ((zy3) yn7Var).b;
        tt7Var.getClass();
        tjd tjdVar = (tjd) tt7Var;
        tt7 tt7Var2 = ((zy3) yn7Var2).b;
        tt7Var2.getClass();
        tjd tjdVar2 = (tjd) tt7Var2;
        if (z) {
            tt7VarE = new mdb(tjdVar, tjdVar2);
            vt7.a.b(tjdVar, tjdVar2);
        } else {
            tt7VarE = rxg.E(tjdVar, tjdVar2);
        }
        return new zy3(tt7VarE, null, false);
    }

    public static final void r(aw2 aw2Var, ted tedVar, x16 x16Var, int i) {
        x1f x1fVar = x1f.a;
        x1f.k(p05.a, new xp(i, 20), 2);
        ynb.V(aw2Var, null, null, new v5g(null, x16Var, tedVar), 3);
    }

    public static final long s(ste steVar, int i, boolean z, boolean z2) {
        b59 b59Var = steVar.b;
        long j = steVar.c;
        int iD = b59Var.d(i);
        if (iD >= b59Var.f) {
            return 9205357640488583168L;
        }
        return (((long) Float.floatToRawIntBits(mh3.n(steVar.g(i, steVar.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == steVar.k(i)), 0.0f, (int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(mh3.n(b59Var.b(iD), 0.0f, (int) (j & 4294967295L)))) & 4294967295L);
    }

    public static final LimitedQuota t(List list) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (pa7.t(((LimitedQuota) next).getCategory(), LimitedQuota.CATEGORY_TIME_MEMBERSHIP)) {
                return (LimitedQuota) next;
            }
        }
        next = null;
        return (LimitedQuota) next;
    }

    public static final rz3 u(cd cdVar) {
        cdVar.getClass();
        rz3 rz3Var = (rz3) je7.d.get(cdVar);
        return rz3Var == null ? sz3.f(cdVar) : rz3Var;
    }

    public static final fpc v(SeasonalReadingResponse seasonalReadingResponse) {
        djc djcVar;
        SeasonalReading reading = seasonalReadingResponse.getReading();
        String str = null;
        if (reading == null) {
            return null;
        }
        Iterable cards = seasonalReadingResponse.getCards();
        List<SeasonalFollowUp> list = pu4.a;
        if (cards == null) {
            cards = list;
        }
        int iF = bm8.F(t72.u(cards, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        for (Object obj : cards) {
            linkedHashMap.put(((SeasonalCard) obj).getPosition(), obj);
        }
        List<SeasonalReadingCard> cards2 = reading.getCards();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = cards2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            kkc kkcVar = kkc.b;
            kkc kkcVar2 = kkc.c;
            kkc kkcVar3 = kkc.d;
            kkc kkcVar4 = kkc.e;
            if (!zHasNext) {
                c78 c78VarW = t72.w();
                SeasonalElementGuides elementGuides = reading.getElementGuides();
                if (elementGuides != null) {
                    String wands = elementGuides.getWands();
                    if (wands == null || v4e.Q(wands)) {
                        wands = null;
                    }
                    if (wands != null) {
                        c78VarW.add(new mlc(kkcVar, wands));
                    }
                    String cups = elementGuides.getCups();
                    if (cups == null || v4e.Q(cups)) {
                        cups = null;
                    }
                    if (cups != null) {
                        c78VarW.add(new mlc(kkcVar2, cups));
                    }
                    String swords = elementGuides.getSwords();
                    if (swords == null || v4e.Q(swords)) {
                        swords = null;
                    }
                    if (swords != null) {
                        c78VarW.add(new mlc(kkcVar3, swords));
                    }
                    String pentacles = elementGuides.getPentacles();
                    if (pentacles != null && !v4e.Q(pentacles)) {
                        str = pentacles;
                    }
                    if (str != null) {
                        c78VarW.add(new mlc(kkcVar4, str));
                    }
                }
                c78 c78VarN = c78VarW.n();
                List<SeasonalFollowUp> followUps = seasonalReadingResponse.getFollowUps();
                if (followUps != null) {
                    list = followUps;
                }
                ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
                for (SeasonalFollowUp seasonalFollowUp : list) {
                    String question = seasonalFollowUp.getQuestion();
                    if (question == null) {
                        question = "";
                    }
                    arrayList2.add(new klc(question, seasonalFollowUp.getAnswer(), seasonalFollowUp.getStatus() == SeasonalStatus.READY));
                }
                String summary = reading.getSummary();
                return new fpc(summary != null ? summary : "", arrayList, c78VarN, arrayList2);
            }
            SeasonalReadingCard seasonalReadingCard = (SeasonalReadingCard) it.next();
            switch (ioc.a[seasonalReadingCard.getPosition().ordinal()]) {
                case 1:
                    kkcVar = kkc.a;
                    break;
                case 2:
                    break;
                case 3:
                    kkcVar = kkcVar2;
                    break;
                case 4:
                    kkcVar = kkcVar3;
                    break;
                case 5:
                    kkcVar = kkcVar4;
                    break;
                case 6:
                    kkcVar = null;
                    break;
                default:
                    ap.c();
                    return null;
            }
            if (kkcVar == null) {
                djcVar = null;
            } else {
                int i = seasonalReadingCard.getDirection() != 1 ? 1 : 0;
                SeasonalCard seasonalCard = (SeasonalCard) linkedHashMap.get(seasonalReadingCard.getPosition());
                String key = seasonalCard != null ? seasonalCard.getKey() : null;
                djcVar = new djc(kkcVar, new qhe(key != null ? key : "", i), seasonalReadingCard.getCardName(), seasonalReadingCard.getContent());
            }
            if (djcVar != null) {
                arrayList.add(djcVar);
            }
        }
    }

    public abstract long w();
}
