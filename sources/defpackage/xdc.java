package defpackage;

import ai.askquin.R;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xdc {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;
    public static Method e;

    /* JADX WARN: Code duplicated, block: B:107:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x014d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0151  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:114:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0160  */
    /* JADX WARN: Code duplicated, block: B:120:0x0163  */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x016b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0178  */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c4 A[PHI: r32
  0x01c4: PHI (r32v3 int) = (r32v1 int), (r32v4 int) binds: [B:138:0x01c2, B:136:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x0200  */
    /* JADX WARN: Code duplicated, block: B:158:0x025d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0273  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    public static final void a(j09 j09Var, l26 l26Var, l26 l26Var2, l26 l26Var3, l26 l26Var4, int i, long j, long j2, g7g g7gVar, final dd2 dd2Var, l46 l46Var, final int i2, final int i3) {
        int i4;
        l26 l26Var5;
        int i5;
        l26 l26Var6;
        int i6;
        int i7;
        l26 l26Var7;
        int i8;
        int i9;
        l26 l26Var8;
        int i10;
        int i11;
        g7g g7gVar2;
        boolean z;
        final j09 j09Var2;
        final int i12;
        final l26 l26Var9;
        final l26 l26Var10;
        final l26 l26Var11;
        final l26 l26Var12;
        final g7g g7gVar3;
        final long j3;
        final long j4;
        ojb ojbVarV;
        j09 j09Var3;
        l26 l26Var13;
        l26 l26Var14;
        l26 l26Var15;
        l26 l26Var16;
        long j5;
        long jB;
        int i13;
        g7g tefVar;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z2;
        Object objR;
        boolean z3;
        r89 r89Var;
        boolean zG;
        Object objR2;
        int i18;
        int i19;
        l46Var.h0(-1211482744);
        int i20 = i3 & 1;
        if (i20 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i21 = i3 & 2;
        if (i21 == 0) {
            if ((i2 & 48) == 0) {
                l26Var5 = l26Var;
                i4 |= l46Var.i(l26Var5) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    l26Var6 = l26Var2;
                    if (l46Var.i(l26Var6)) {
                        i6 = 256;
                    } else {
                        i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        l26Var7 = l26Var3;
                        if (l46Var.i(l26Var7)) {
                            i8 = 2048;
                        } else {
                            i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            l26Var8 = l26Var4;
                            if (l46Var.i(l26Var8)) {
                                i10 = 16384;
                            } else {
                                i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                            }
                            i4 |= i10;
                        }
                        i11 = i4 | 196608;
                        if ((1572864 & i2) != 0) {
                            if ((i3 & 64) == 0 || !l46Var.f(j)) {
                                i19 = 524288;
                            } else {
                                i19 = 1048576;
                            }
                            i11 |= i19;
                        }
                        if ((i2 & 12582912) == 0) {
                            i11 |= 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            if ((i3 & 256) == 0) {
                                g7gVar2 = g7gVar;
                                int i22 = l46Var.g(g7gVar2) ? 67108864 : 33554432;
                                i11 |= i22;
                            } else {
                                g7gVar2 = g7gVar;
                            }
                            i11 |= i22;
                        } else {
                            g7gVar2 = g7gVar;
                        }
                        if ((i2 & 805306368) != 0) {
                            if (l46Var.i(dd2Var)) {
                                i18 = 536870912;
                            } else {
                                i18 = 268435456;
                            }
                            i11 |= i18;
                        }
                        if ((i11 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (l46Var.W(i11 & 1, z)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0 || l46Var.C()) {
                                if (i20 != 0) {
                                    j09Var3 = g09.a;
                                } else {
                                    j09Var3 = j09Var;
                                }
                                if (i21 != 0) {
                                    l26Var13 = ge2.a;
                                } else {
                                    l26Var13 = l26Var5;
                                }
                                if (i5 != 0) {
                                    l26Var14 = ge2.b;
                                } else {
                                    l26Var14 = l26Var6;
                                }
                                if (i7 != 0) {
                                    l26Var15 = ge2.c;
                                } else {
                                    l26Var15 = l26Var7;
                                }
                                if (i9 != 0) {
                                    l26Var16 = ge2.d;
                                } else {
                                    l26Var16 = l26Var8;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((m82) l46Var.k(o82.a)).n;
                                    i11 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jB = o82.b(j5, l46Var);
                                i13 = i11 & (-29360129);
                                if ((i3 & 256) != 0) {
                                    WeakHashMap weakHashMap = m8g.w;
                                    i14 = i11 & (-264241153);
                                    tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                                } else {
                                    tefVar = g7gVar2;
                                    i14 = i13;
                                }
                                i15 = 2;
                            } else {
                                l46Var.Z();
                                if ((i3 & 64) != 0) {
                                    i11 &= -3670017;
                                }
                                int i23 = i11 & (-29360129);
                                if ((i3 & 256) != 0) {
                                    i23 = i11 & (-264241153);
                                }
                                i15 = i;
                                j5 = j;
                                i14 = i23;
                                l26Var13 = l26Var5;
                                l26Var14 = l26Var6;
                                l26Var15 = l26Var7;
                                l26Var16 = l26Var8;
                                tefVar = g7gVar2;
                                j09Var3 = j09Var;
                                jB = j2;
                            }
                            l46Var.s();
                            i16 = (234881024 & i14) ^ 100663296;
                            if (i16 > 67108864 || !l46Var.g(tefVar)) {
                                i17 = i14;
                                if ((i17 & 100663296) != 67108864) {
                                    z2 = false;
                                }
                                objR = l46Var.R();
                                z3 = z2;
                                Object obj = sf2.a;
                                if (z3 || objR == obj) {
                                    objR = new r89(tefVar);
                                    l46Var.p0(objR);
                                }
                                r89Var = (r89) objR;
                                long j6 = j5;
                                zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                                objR2 = l46Var.R();
                                if (zG || objR2 == obj) {
                                    objR2 = new h6b(10, r89Var, tefVar);
                                    l46Var.p0(objR2);
                                }
                                l26 l26Var17 = l26Var13;
                                l26 l26Var18 = l26Var14;
                                l26 l26Var19 = l26Var15;
                                l26 l26Var20 = l26Var16;
                                int i24 = i15;
                                long j7 = jB;
                                nae.a(eb3.P(j09Var3, (a26) objR2), null, j6, j7, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i24, l26Var17, dd2Var, l26Var19, l26Var20, r89Var, l26Var18), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                                j3 = j6;
                                j4 = j7;
                                j09Var2 = j09Var3;
                                g7gVar3 = tefVar;
                                l26Var9 = l26Var17;
                                l26Var10 = l26Var18;
                                l26Var11 = l26Var19;
                                l26Var12 = l26Var20;
                                i12 = i24;
                            } else {
                                i17 = i14;
                            }
                            z2 = true;
                            objR = l46Var.R();
                            z3 = z2;
                            Object obj2 = sf2.a;
                            if (z3) {
                                objR = new r89(tefVar);
                                l46Var.p0(objR);
                            } else {
                                objR = new r89(tefVar);
                                l46Var.p0(objR);
                            }
                            r89Var = (r89) objR;
                            long j8 = j5;
                            zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                            objR2 = l46Var.R();
                            if (zG) {
                                objR2 = new h6b(10, r89Var, tefVar);
                                l46Var.p0(objR2);
                            } else {
                                objR2 = new h6b(10, r89Var, tefVar);
                                l46Var.p0(objR2);
                            }
                            l26 l26Var110 = l26Var13;
                            l26 l26Var111 = l26Var14;
                            l26 l26Var112 = l26Var15;
                            l26 l26Var21 = l26Var16;
                            int i25 = i15;
                            long j9 = jB;
                            nae.a(eb3.P(j09Var3, (a26) objR2), null, j8, j9, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i25, l26Var110, dd2Var, l26Var112, l26Var21, r89Var, l26Var111), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                            j3 = j8;
                            j4 = j9;
                            j09Var2 = j09Var3;
                            g7gVar3 = tefVar;
                            l26Var9 = l26Var110;
                            l26Var10 = l26Var111;
                            l26Var11 = l26Var112;
                            l26Var12 = l26Var21;
                            i12 = i25;
                        } else {
                            l46Var.Z();
                            j09Var2 = j09Var;
                            i12 = i;
                            l26Var9 = l26Var5;
                            l26Var10 = l26Var6;
                            l26Var11 = l26Var7;
                            l26Var12 = l26Var8;
                            g7gVar3 = g7gVar2;
                            j3 = j;
                            j4 = j2;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: tdc
                                @Override // defpackage.l26
                                public final Object z(Object obj3, Object obj4) {
                                    ((Integer) obj4).getClass();
                                    int iP = k99.P(i2 | 1);
                                    xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj3, iP, i3);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i4 |= 24576;
                    l26Var8 = l26Var4;
                    i11 = i4 | 196608;
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            i19 = 524288;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i2 & 12582912) == 0) {
                        i11 |= 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        if ((i3 & 256) == 0) {
                            g7gVar2 = g7gVar;
                            if (l46Var.g(g7gVar2)) {
                            }
                            i11 |= i22;
                        } else {
                            g7gVar2 = g7gVar;
                        }
                        i11 |= i22;
                    } else {
                        g7gVar2 = g7gVar;
                    }
                    if ((i2 & 805306368) != 0) {
                        if (l46Var.i(dd2Var)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i11 |= i18;
                    }
                    if ((i11 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i11 & 1, z)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                l26Var13 = ge2.a;
                            } else {
                                l26Var13 = l26Var5;
                            }
                            if (i5 != 0) {
                                l26Var14 = ge2.b;
                            } else {
                                l26Var14 = l26Var6;
                            }
                            if (i7 != 0) {
                                l26Var15 = ge2.c;
                            } else {
                                l26Var15 = l26Var7;
                            }
                            if (i9 != 0) {
                                l26Var16 = ge2.d;
                            } else {
                                l26Var16 = l26Var8;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((m82) l46Var.k(o82.a)).n;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jB = o82.b(j5, l46Var);
                            i13 = i11 & (-29360129);
                            if ((i3 & 256) != 0) {
                                WeakHashMap weakHashMap2 = m8g.w;
                                i14 = i11 & (-264241153);
                                tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                            } else {
                                tefVar = g7gVar2;
                                i14 = i13;
                            }
                            i15 = 2;
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                l26Var13 = ge2.a;
                            } else {
                                l26Var13 = l26Var5;
                            }
                            if (i5 != 0) {
                                l26Var14 = ge2.b;
                            } else {
                                l26Var14 = l26Var6;
                            }
                            if (i7 != 0) {
                                l26Var15 = ge2.c;
                            } else {
                                l26Var15 = l26Var7;
                            }
                            if (i9 != 0) {
                                l26Var16 = ge2.d;
                            } else {
                                l26Var16 = l26Var8;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((m82) l46Var.k(o82.a)).n;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jB = o82.b(j5, l46Var);
                            i13 = i11 & (-29360129);
                            if ((i3 & 256) != 0) {
                                WeakHashMap weakHashMap3 = m8g.w;
                                i14 = i11 & (-264241153);
                                tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                            } else {
                                tefVar = g7gVar2;
                                i14 = i13;
                            }
                            i15 = 2;
                        }
                        l46Var.s();
                        i16 = (234881024 & i14) ^ 100663296;
                        if (i16 > 67108864) {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objR = l46Var.R();
                        z3 = z2;
                        Object obj3 = sf2.a;
                        if (z3) {
                            objR = new r89(tefVar);
                            l46Var.p0(objR);
                        } else {
                            objR = new r89(tefVar);
                            l46Var.p0(objR);
                        }
                        r89Var = (r89) objR;
                        long j10 = j5;
                        zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                        objR2 = l46Var.R();
                        if (zG) {
                            objR2 = new h6b(10, r89Var, tefVar);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new h6b(10, r89Var, tefVar);
                            l46Var.p0(objR2);
                        }
                        l26 l26Var113 = l26Var13;
                        l26 l26Var114 = l26Var14;
                        l26 l26Var115 = l26Var15;
                        l26 l26Var22 = l26Var16;
                        int i26 = i15;
                        long j11 = jB;
                        nae.a(eb3.P(j09Var3, (a26) objR2), null, j10, j11, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i26, l26Var113, dd2Var, l26Var115, l26Var22, r89Var, l26Var114), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                        j3 = j10;
                        j4 = j11;
                        j09Var2 = j09Var3;
                        g7gVar3 = tefVar;
                        l26Var9 = l26Var113;
                        l26Var10 = l26Var114;
                        l26Var11 = l26Var115;
                        l26Var12 = l26Var22;
                        i12 = i26;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        i12 = i;
                        l26Var9 = l26Var5;
                        l26Var10 = l26Var6;
                        l26Var11 = l26Var7;
                        l26Var12 = l26Var8;
                        g7gVar3 = g7gVar2;
                        j3 = j;
                        j4 = j2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: tdc
                            @Override // defpackage.l26
                            public final Object z(Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                int iP = k99.P(i2 | 1);
                                xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj4, iP, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 3072;
                l26Var7 = l26Var3;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        l26Var8 = l26Var4;
                        if (l46Var.i(l26Var8)) {
                            i10 = 16384;
                        } else {
                            i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i10;
                    }
                    i11 = i4 | 196608;
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            i19 = 524288;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i2 & 12582912) == 0) {
                        i11 |= 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        if ((i3 & 256) == 0) {
                            g7gVar2 = g7gVar;
                            if (l46Var.g(g7gVar2)) {
                            }
                            i11 |= i22;
                        } else {
                            g7gVar2 = g7gVar;
                        }
                        i11 |= i22;
                    } else {
                        g7gVar2 = g7gVar;
                    }
                    if ((i2 & 805306368) != 0) {
                        if (l46Var.i(dd2Var)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i11 |= i18;
                    }
                    if ((i11 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i11 & 1, z)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                l26Var13 = ge2.a;
                            } else {
                                l26Var13 = l26Var5;
                            }
                            if (i5 != 0) {
                                l26Var14 = ge2.b;
                            } else {
                                l26Var14 = l26Var6;
                            }
                            if (i7 != 0) {
                                l26Var15 = ge2.c;
                            } else {
                                l26Var15 = l26Var7;
                            }
                            if (i9 != 0) {
                                l26Var16 = ge2.d;
                            } else {
                                l26Var16 = l26Var8;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((m82) l46Var.k(o82.a)).n;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jB = o82.b(j5, l46Var);
                            i13 = i11 & (-29360129);
                            if ((i3 & 256) != 0) {
                                WeakHashMap weakHashMap4 = m8g.w;
                                i14 = i11 & (-264241153);
                                tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                            } else {
                                tefVar = g7gVar2;
                                i14 = i13;
                            }
                            i15 = 2;
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                l26Var13 = ge2.a;
                            } else {
                                l26Var13 = l26Var5;
                            }
                            if (i5 != 0) {
                                l26Var14 = ge2.b;
                            } else {
                                l26Var14 = l26Var6;
                            }
                            if (i7 != 0) {
                                l26Var15 = ge2.c;
                            } else {
                                l26Var15 = l26Var7;
                            }
                            if (i9 != 0) {
                                l26Var16 = ge2.d;
                            } else {
                                l26Var16 = l26Var8;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((m82) l46Var.k(o82.a)).n;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jB = o82.b(j5, l46Var);
                            i13 = i11 & (-29360129);
                            if ((i3 & 256) != 0) {
                                WeakHashMap weakHashMap5 = m8g.w;
                                i14 = i11 & (-264241153);
                                tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                            } else {
                                tefVar = g7gVar2;
                                i14 = i13;
                            }
                            i15 = 2;
                        }
                        l46Var.s();
                        i16 = (234881024 & i14) ^ 100663296;
                        if (i16 > 67108864) {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objR = l46Var.R();
                        z3 = z2;
                        Object obj4 = sf2.a;
                        if (z3) {
                            objR = new r89(tefVar);
                            l46Var.p0(objR);
                        } else {
                            objR = new r89(tefVar);
                            l46Var.p0(objR);
                        }
                        r89Var = (r89) objR;
                        long j12 = j5;
                        zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                        objR2 = l46Var.R();
                        if (zG) {
                            objR2 = new h6b(10, r89Var, tefVar);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new h6b(10, r89Var, tefVar);
                            l46Var.p0(objR2);
                        }
                        l26 l26Var116 = l26Var13;
                        l26 l26Var117 = l26Var14;
                        l26 l26Var118 = l26Var15;
                        l26 l26Var23 = l26Var16;
                        int i27 = i15;
                        long j13 = jB;
                        nae.a(eb3.P(j09Var3, (a26) objR2), null, j12, j13, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i27, l26Var116, dd2Var, l26Var118, l26Var23, r89Var, l26Var117), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                        j3 = j12;
                        j4 = j13;
                        j09Var2 = j09Var3;
                        g7gVar3 = tefVar;
                        l26Var9 = l26Var116;
                        l26Var10 = l26Var117;
                        l26Var11 = l26Var118;
                        l26Var12 = l26Var23;
                        i12 = i27;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        i12 = i;
                        l26Var9 = l26Var5;
                        l26Var10 = l26Var6;
                        l26Var11 = l26Var7;
                        l26Var12 = l26Var8;
                        g7gVar3 = g7gVar2;
                        j3 = j;
                        j4 = j2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: tdc
                            @Override // defpackage.l26
                            public final Object z(Object obj5, Object obj6) {
                                ((Integer) obj6).getClass();
                                int iP = k99.P(i2 | 1);
                                xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj5, iP, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 24576;
                l26Var8 = l26Var4;
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    i11 |= 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        g7gVar2 = g7gVar;
                        if (l46Var.g(g7gVar2)) {
                        }
                        i11 |= i22;
                    } else {
                        g7gVar2 = g7gVar;
                    }
                    i11 |= i22;
                } else {
                    g7gVar2 = g7gVar;
                }
                if ((i2 & 805306368) != 0) {
                    if (l46Var.i(dd2Var)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                if ((i11 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i11 & 1, z)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap6 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap7 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    }
                    l46Var.s();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objR = l46Var.R();
                    z3 = z2;
                    Object obj5 = sf2.a;
                    if (z3) {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    } else {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    }
                    r89Var = (r89) objR;
                    long j14 = j5;
                    zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                    objR2 = l46Var.R();
                    if (zG) {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    }
                    l26 l26Var119 = l26Var13;
                    l26 l26Var1110 = l26Var14;
                    l26 l26Var1111 = l26Var15;
                    l26 l26Var24 = l26Var16;
                    int i28 = i15;
                    long j15 = jB;
                    nae.a(eb3.P(j09Var3, (a26) objR2), null, j14, j15, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i28, l26Var119, dd2Var, l26Var1111, l26Var24, r89Var, l26Var1110), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                    j3 = j14;
                    j4 = j15;
                    j09Var2 = j09Var3;
                    g7gVar3 = tefVar;
                    l26Var9 = l26Var119;
                    l26Var10 = l26Var1110;
                    l26Var11 = l26Var1111;
                    l26Var12 = l26Var24;
                    i12 = i28;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    i12 = i;
                    l26Var9 = l26Var5;
                    l26Var10 = l26Var6;
                    l26Var11 = l26Var7;
                    l26Var12 = l26Var8;
                    g7gVar3 = g7gVar2;
                    j3 = j;
                    j4 = j2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: tdc
                        @Override // defpackage.l26
                        public final Object z(Object obj6, Object obj7) {
                            ((Integer) obj7).getClass();
                            int iP = k99.P(i2 | 1);
                            xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj6, iP, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 384;
            l26Var6 = l26Var2;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    l26Var7 = l26Var3;
                    if (l46Var.i(l26Var7)) {
                        i8 = 2048;
                    } else {
                        i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        l26Var8 = l26Var4;
                        if (l46Var.i(l26Var8)) {
                            i10 = 16384;
                        } else {
                            i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i10;
                    }
                    i11 = i4 | 196608;
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            i19 = 524288;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i2 & 12582912) == 0) {
                        i11 |= 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        if ((i3 & 256) == 0) {
                            g7gVar2 = g7gVar;
                            if (l46Var.g(g7gVar2)) {
                            }
                            i11 |= i22;
                        } else {
                            g7gVar2 = g7gVar;
                        }
                        i11 |= i22;
                    } else {
                        g7gVar2 = g7gVar;
                    }
                    if ((i2 & 805306368) != 0) {
                        if (l46Var.i(dd2Var)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i11 |= i18;
                    }
                    if ((i11 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i11 & 1, z)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                l26Var13 = ge2.a;
                            } else {
                                l26Var13 = l26Var5;
                            }
                            if (i5 != 0) {
                                l26Var14 = ge2.b;
                            } else {
                                l26Var14 = l26Var6;
                            }
                            if (i7 != 0) {
                                l26Var15 = ge2.c;
                            } else {
                                l26Var15 = l26Var7;
                            }
                            if (i9 != 0) {
                                l26Var16 = ge2.d;
                            } else {
                                l26Var16 = l26Var8;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((m82) l46Var.k(o82.a)).n;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jB = o82.b(j5, l46Var);
                            i13 = i11 & (-29360129);
                            if ((i3 & 256) != 0) {
                                WeakHashMap weakHashMap8 = m8g.w;
                                i14 = i11 & (-264241153);
                                tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                            } else {
                                tefVar = g7gVar2;
                                i14 = i13;
                            }
                            i15 = 2;
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                l26Var13 = ge2.a;
                            } else {
                                l26Var13 = l26Var5;
                            }
                            if (i5 != 0) {
                                l26Var14 = ge2.b;
                            } else {
                                l26Var14 = l26Var6;
                            }
                            if (i7 != 0) {
                                l26Var15 = ge2.c;
                            } else {
                                l26Var15 = l26Var7;
                            }
                            if (i9 != 0) {
                                l26Var16 = ge2.d;
                            } else {
                                l26Var16 = l26Var8;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((m82) l46Var.k(o82.a)).n;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jB = o82.b(j5, l46Var);
                            i13 = i11 & (-29360129);
                            if ((i3 & 256) != 0) {
                                WeakHashMap weakHashMap9 = m8g.w;
                                i14 = i11 & (-264241153);
                                tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                            } else {
                                tefVar = g7gVar2;
                                i14 = i13;
                            }
                            i15 = 2;
                        }
                        l46Var.s();
                        i16 = (234881024 & i14) ^ 100663296;
                        if (i16 > 67108864) {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objR = l46Var.R();
                        z3 = z2;
                        Object obj6 = sf2.a;
                        if (z3) {
                            objR = new r89(tefVar);
                            l46Var.p0(objR);
                        } else {
                            objR = new r89(tefVar);
                            l46Var.p0(objR);
                        }
                        r89Var = (r89) objR;
                        long j16 = j5;
                        zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                        objR2 = l46Var.R();
                        if (zG) {
                            objR2 = new h6b(10, r89Var, tefVar);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new h6b(10, r89Var, tefVar);
                            l46Var.p0(objR2);
                        }
                        l26 l26Var1112 = l26Var13;
                        l26 l26Var1113 = l26Var14;
                        l26 l26Var1114 = l26Var15;
                        l26 l26Var25 = l26Var16;
                        int i29 = i15;
                        long j17 = jB;
                        nae.a(eb3.P(j09Var3, (a26) objR2), null, j16, j17, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i29, l26Var1112, dd2Var, l26Var1114, l26Var25, r89Var, l26Var1113), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                        j3 = j16;
                        j4 = j17;
                        j09Var2 = j09Var3;
                        g7gVar3 = tefVar;
                        l26Var9 = l26Var1112;
                        l26Var10 = l26Var1113;
                        l26Var11 = l26Var1114;
                        l26Var12 = l26Var25;
                        i12 = i29;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        i12 = i;
                        l26Var9 = l26Var5;
                        l26Var10 = l26Var6;
                        l26Var11 = l26Var7;
                        l26Var12 = l26Var8;
                        g7gVar3 = g7gVar2;
                        j3 = j;
                        j4 = j2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: tdc
                            @Override // defpackage.l26
                            public final Object z(Object obj7, Object obj8) {
                                ((Integer) obj8).getClass();
                                int iP = k99.P(i2 | 1);
                                xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj7, iP, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 24576;
                l26Var8 = l26Var4;
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    i11 |= 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        g7gVar2 = g7gVar;
                        if (l46Var.g(g7gVar2)) {
                        }
                        i11 |= i22;
                    } else {
                        g7gVar2 = g7gVar;
                    }
                    i11 |= i22;
                } else {
                    g7gVar2 = g7gVar;
                }
                if ((i2 & 805306368) != 0) {
                    if (l46Var.i(dd2Var)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                if ((i11 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i11 & 1, z)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap10 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap11 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    }
                    l46Var.s();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objR = l46Var.R();
                    z3 = z2;
                    Object obj7 = sf2.a;
                    if (z3) {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    } else {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    }
                    r89Var = (r89) objR;
                    long j18 = j5;
                    zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                    objR2 = l46Var.R();
                    if (zG) {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    }
                    l26 l26Var1115 = l26Var13;
                    l26 l26Var1116 = l26Var14;
                    l26 l26Var1117 = l26Var15;
                    l26 l26Var26 = l26Var16;
                    int i210 = i15;
                    long j19 = jB;
                    nae.a(eb3.P(j09Var3, (a26) objR2), null, j18, j19, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i210, l26Var1115, dd2Var, l26Var1117, l26Var26, r89Var, l26Var1116), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                    j3 = j18;
                    j4 = j19;
                    j09Var2 = j09Var3;
                    g7gVar3 = tefVar;
                    l26Var9 = l26Var1115;
                    l26Var10 = l26Var1116;
                    l26Var11 = l26Var1117;
                    l26Var12 = l26Var26;
                    i12 = i210;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    i12 = i;
                    l26Var9 = l26Var5;
                    l26Var10 = l26Var6;
                    l26Var11 = l26Var7;
                    l26Var12 = l26Var8;
                    g7gVar3 = g7gVar2;
                    j3 = j;
                    j4 = j2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: tdc
                        @Override // defpackage.l26
                        public final Object z(Object obj8, Object obj9) {
                            ((Integer) obj9).getClass();
                            int iP = k99.P(i2 | 1);
                            xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj8, iP, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 3072;
            l26Var7 = l26Var3;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    l26Var8 = l26Var4;
                    if (l46Var.i(l26Var8)) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i10;
                }
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    i11 |= 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        g7gVar2 = g7gVar;
                        if (l46Var.g(g7gVar2)) {
                        }
                        i11 |= i22;
                    } else {
                        g7gVar2 = g7gVar;
                    }
                    i11 |= i22;
                } else {
                    g7gVar2 = g7gVar;
                }
                if ((i2 & 805306368) != 0) {
                    if (l46Var.i(dd2Var)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                if ((i11 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i11 & 1, z)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap12 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap13 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    }
                    l46Var.s();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objR = l46Var.R();
                    z3 = z2;
                    Object obj8 = sf2.a;
                    if (z3) {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    } else {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    }
                    r89Var = (r89) objR;
                    long j110 = j5;
                    zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                    objR2 = l46Var.R();
                    if (zG) {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    }
                    l26 l26Var1118 = l26Var13;
                    l26 l26Var1119 = l26Var14;
                    l26 l26Var11110 = l26Var15;
                    l26 l26Var27 = l26Var16;
                    int i211 = i15;
                    long j111 = jB;
                    nae.a(eb3.P(j09Var3, (a26) objR2), null, j110, j111, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i211, l26Var1118, dd2Var, l26Var11110, l26Var27, r89Var, l26Var1119), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                    j3 = j110;
                    j4 = j111;
                    j09Var2 = j09Var3;
                    g7gVar3 = tefVar;
                    l26Var9 = l26Var1118;
                    l26Var10 = l26Var1119;
                    l26Var11 = l26Var11110;
                    l26Var12 = l26Var27;
                    i12 = i211;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    i12 = i;
                    l26Var9 = l26Var5;
                    l26Var10 = l26Var6;
                    l26Var11 = l26Var7;
                    l26Var12 = l26Var8;
                    g7gVar3 = g7gVar2;
                    j3 = j;
                    j4 = j2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: tdc
                        @Override // defpackage.l26
                        public final Object z(Object obj9, Object obj10) {
                            ((Integer) obj10).getClass();
                            int iP = k99.P(i2 | 1);
                            xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj9, iP, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            l26Var8 = l26Var4;
            i11 = i4 | 196608;
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i2 & 12582912) == 0) {
                i11 |= 4194304;
            }
            if ((i2 & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    g7gVar2 = g7gVar;
                    if (l46Var.g(g7gVar2)) {
                    }
                    i11 |= i22;
                } else {
                    g7gVar2 = g7gVar;
                }
                i11 |= i22;
            } else {
                g7gVar2 = g7gVar;
            }
            if ((i2 & 805306368) != 0) {
                if (l46Var.i(dd2Var)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i11 |= i18;
            }
            if ((i11 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i11 & 1, z)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        l26Var13 = ge2.a;
                    } else {
                        l26Var13 = l26Var5;
                    }
                    if (i5 != 0) {
                        l26Var14 = ge2.b;
                    } else {
                        l26Var14 = l26Var6;
                    }
                    if (i7 != 0) {
                        l26Var15 = ge2.c;
                    } else {
                        l26Var15 = l26Var7;
                    }
                    if (i9 != 0) {
                        l26Var16 = ge2.d;
                    } else {
                        l26Var16 = l26Var8;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((m82) l46Var.k(o82.a)).n;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jB = o82.b(j5, l46Var);
                    i13 = i11 & (-29360129);
                    if ((i3 & 256) != 0) {
                        WeakHashMap weakHashMap14 = m8g.w;
                        i14 = i11 & (-264241153);
                        tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                    } else {
                        tefVar = g7gVar2;
                        i14 = i13;
                    }
                    i15 = 2;
                } else {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        l26Var13 = ge2.a;
                    } else {
                        l26Var13 = l26Var5;
                    }
                    if (i5 != 0) {
                        l26Var14 = ge2.b;
                    } else {
                        l26Var14 = l26Var6;
                    }
                    if (i7 != 0) {
                        l26Var15 = ge2.c;
                    } else {
                        l26Var15 = l26Var7;
                    }
                    if (i9 != 0) {
                        l26Var16 = ge2.d;
                    } else {
                        l26Var16 = l26Var8;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((m82) l46Var.k(o82.a)).n;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jB = o82.b(j5, l46Var);
                    i13 = i11 & (-29360129);
                    if ((i3 & 256) != 0) {
                        WeakHashMap weakHashMap15 = m8g.w;
                        i14 = i11 & (-264241153);
                        tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                    } else {
                        tefVar = g7gVar2;
                        i14 = i13;
                    }
                    i15 = 2;
                }
                l46Var.s();
                i16 = (234881024 & i14) ^ 100663296;
                if (i16 > 67108864) {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objR = l46Var.R();
                z3 = z2;
                Object obj9 = sf2.a;
                if (z3) {
                    objR = new r89(tefVar);
                    l46Var.p0(objR);
                } else {
                    objR = new r89(tefVar);
                    l46Var.p0(objR);
                }
                r89Var = (r89) objR;
                long j112 = j5;
                zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                objR2 = l46Var.R();
                if (zG) {
                    objR2 = new h6b(10, r89Var, tefVar);
                    l46Var.p0(objR2);
                } else {
                    objR2 = new h6b(10, r89Var, tefVar);
                    l46Var.p0(objR2);
                }
                l26 l26Var11111 = l26Var13;
                l26 l26Var11112 = l26Var14;
                l26 l26Var11113 = l26Var15;
                l26 l26Var28 = l26Var16;
                int i212 = i15;
                long j113 = jB;
                nae.a(eb3.P(j09Var3, (a26) objR2), null, j112, j113, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i212, l26Var11111, dd2Var, l26Var11113, l26Var28, r89Var, l26Var11112), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                j3 = j112;
                j4 = j113;
                j09Var2 = j09Var3;
                g7gVar3 = tefVar;
                l26Var9 = l26Var11111;
                l26Var10 = l26Var11112;
                l26Var11 = l26Var11113;
                l26Var12 = l26Var28;
                i12 = i212;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                i12 = i;
                l26Var9 = l26Var5;
                l26Var10 = l26Var6;
                l26Var11 = l26Var7;
                l26Var12 = l26Var8;
                g7gVar3 = g7gVar2;
                j3 = j;
                j4 = j2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: tdc
                    @Override // defpackage.l26
                    public final Object z(Object obj10, Object obj11) {
                        ((Integer) obj11).getClass();
                        int iP = k99.P(i2 | 1);
                        xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj10, iP, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 48;
        l26Var5 = l26Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                l26Var6 = l26Var2;
                if (l46Var.i(l26Var6)) {
                    i6 = 256;
                } else {
                    i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    l26Var7 = l26Var3;
                    if (l46Var.i(l26Var7)) {
                        i8 = 2048;
                    } else {
                        i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        l26Var8 = l26Var4;
                        if (l46Var.i(l26Var8)) {
                            i10 = 16384;
                        } else {
                            i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i10;
                    }
                    i11 = i4 | 196608;
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            i19 = 524288;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i2 & 12582912) == 0) {
                        i11 |= 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        if ((i3 & 256) == 0) {
                            g7gVar2 = g7gVar;
                            if (l46Var.g(g7gVar2)) {
                            }
                            i11 |= i22;
                        } else {
                            g7gVar2 = g7gVar;
                        }
                        i11 |= i22;
                    } else {
                        g7gVar2 = g7gVar;
                    }
                    if ((i2 & 805306368) != 0) {
                        if (l46Var.i(dd2Var)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i11 |= i18;
                    }
                    if ((i11 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i11 & 1, z)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                l26Var13 = ge2.a;
                            } else {
                                l26Var13 = l26Var5;
                            }
                            if (i5 != 0) {
                                l26Var14 = ge2.b;
                            } else {
                                l26Var14 = l26Var6;
                            }
                            if (i7 != 0) {
                                l26Var15 = ge2.c;
                            } else {
                                l26Var15 = l26Var7;
                            }
                            if (i9 != 0) {
                                l26Var16 = ge2.d;
                            } else {
                                l26Var16 = l26Var8;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((m82) l46Var.k(o82.a)).n;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jB = o82.b(j5, l46Var);
                            i13 = i11 & (-29360129);
                            if ((i3 & 256) != 0) {
                                WeakHashMap weakHashMap16 = m8g.w;
                                i14 = i11 & (-264241153);
                                tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                            } else {
                                tefVar = g7gVar2;
                                i14 = i13;
                            }
                            i15 = 2;
                        } else {
                            if (i20 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i21 != 0) {
                                l26Var13 = ge2.a;
                            } else {
                                l26Var13 = l26Var5;
                            }
                            if (i5 != 0) {
                                l26Var14 = ge2.b;
                            } else {
                                l26Var14 = l26Var6;
                            }
                            if (i7 != 0) {
                                l26Var15 = ge2.c;
                            } else {
                                l26Var15 = l26Var7;
                            }
                            if (i9 != 0) {
                                l26Var16 = ge2.d;
                            } else {
                                l26Var16 = l26Var8;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((m82) l46Var.k(o82.a)).n;
                                i11 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jB = o82.b(j5, l46Var);
                            i13 = i11 & (-29360129);
                            if ((i3 & 256) != 0) {
                                WeakHashMap weakHashMap17 = m8g.w;
                                i14 = i11 & (-264241153);
                                tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                            } else {
                                tefVar = g7gVar2;
                                i14 = i13;
                            }
                            i15 = 2;
                        }
                        l46Var.s();
                        i16 = (234881024 & i14) ^ 100663296;
                        if (i16 > 67108864) {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i17 = i14;
                            if ((i17 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objR = l46Var.R();
                        z3 = z2;
                        Object obj10 = sf2.a;
                        if (z3) {
                            objR = new r89(tefVar);
                            l46Var.p0(objR);
                        } else {
                            objR = new r89(tefVar);
                            l46Var.p0(objR);
                        }
                        r89Var = (r89) objR;
                        long j114 = j5;
                        zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                        objR2 = l46Var.R();
                        if (zG) {
                            objR2 = new h6b(10, r89Var, tefVar);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new h6b(10, r89Var, tefVar);
                            l46Var.p0(objR2);
                        }
                        l26 l26Var11114 = l26Var13;
                        l26 l26Var11115 = l26Var14;
                        l26 l26Var11116 = l26Var15;
                        l26 l26Var29 = l26Var16;
                        int i213 = i15;
                        long j115 = jB;
                        nae.a(eb3.P(j09Var3, (a26) objR2), null, j114, j115, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i213, l26Var11114, dd2Var, l26Var11116, l26Var29, r89Var, l26Var11115), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                        j3 = j114;
                        j4 = j115;
                        j09Var2 = j09Var3;
                        g7gVar3 = tefVar;
                        l26Var9 = l26Var11114;
                        l26Var10 = l26Var11115;
                        l26Var11 = l26Var11116;
                        l26Var12 = l26Var29;
                        i12 = i213;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        i12 = i;
                        l26Var9 = l26Var5;
                        l26Var10 = l26Var6;
                        l26Var11 = l26Var7;
                        l26Var12 = l26Var8;
                        g7gVar3 = g7gVar2;
                        j3 = j;
                        j4 = j2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: tdc
                            @Override // defpackage.l26
                            public final Object z(Object obj11, Object obj12) {
                                ((Integer) obj12).getClass();
                                int iP = k99.P(i2 | 1);
                                xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj11, iP, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 24576;
                l26Var8 = l26Var4;
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    i11 |= 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        g7gVar2 = g7gVar;
                        if (l46Var.g(g7gVar2)) {
                        }
                        i11 |= i22;
                    } else {
                        g7gVar2 = g7gVar;
                    }
                    i11 |= i22;
                } else {
                    g7gVar2 = g7gVar;
                }
                if ((i2 & 805306368) != 0) {
                    if (l46Var.i(dd2Var)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                if ((i11 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i11 & 1, z)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap18 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap19 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    }
                    l46Var.s();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objR = l46Var.R();
                    z3 = z2;
                    Object obj11 = sf2.a;
                    if (z3) {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    } else {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    }
                    r89Var = (r89) objR;
                    long j116 = j5;
                    zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                    objR2 = l46Var.R();
                    if (zG) {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    }
                    l26 l26Var11117 = l26Var13;
                    l26 l26Var11118 = l26Var14;
                    l26 l26Var11119 = l26Var15;
                    l26 l26Var210 = l26Var16;
                    int i214 = i15;
                    long j117 = jB;
                    nae.a(eb3.P(j09Var3, (a26) objR2), null, j116, j117, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i214, l26Var11117, dd2Var, l26Var11119, l26Var210, r89Var, l26Var11118), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                    j3 = j116;
                    j4 = j117;
                    j09Var2 = j09Var3;
                    g7gVar3 = tefVar;
                    l26Var9 = l26Var11117;
                    l26Var10 = l26Var11118;
                    l26Var11 = l26Var11119;
                    l26Var12 = l26Var210;
                    i12 = i214;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    i12 = i;
                    l26Var9 = l26Var5;
                    l26Var10 = l26Var6;
                    l26Var11 = l26Var7;
                    l26Var12 = l26Var8;
                    g7gVar3 = g7gVar2;
                    j3 = j;
                    j4 = j2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: tdc
                        @Override // defpackage.l26
                        public final Object z(Object obj12, Object obj13) {
                            ((Integer) obj13).getClass();
                            int iP = k99.P(i2 | 1);
                            xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj12, iP, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 3072;
            l26Var7 = l26Var3;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    l26Var8 = l26Var4;
                    if (l46Var.i(l26Var8)) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i10;
                }
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    i11 |= 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        g7gVar2 = g7gVar;
                        if (l46Var.g(g7gVar2)) {
                        }
                        i11 |= i22;
                    } else {
                        g7gVar2 = g7gVar;
                    }
                    i11 |= i22;
                } else {
                    g7gVar2 = g7gVar;
                }
                if ((i2 & 805306368) != 0) {
                    if (l46Var.i(dd2Var)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                if ((i11 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i11 & 1, z)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap110 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap111 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    }
                    l46Var.s();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objR = l46Var.R();
                    z3 = z2;
                    Object obj12 = sf2.a;
                    if (z3) {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    } else {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    }
                    r89Var = (r89) objR;
                    long j118 = j5;
                    zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                    objR2 = l46Var.R();
                    if (zG) {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    }
                    l26 l26Var111110 = l26Var13;
                    l26 l26Var111111 = l26Var14;
                    l26 l26Var111112 = l26Var15;
                    l26 l26Var211 = l26Var16;
                    int i215 = i15;
                    long j119 = jB;
                    nae.a(eb3.P(j09Var3, (a26) objR2), null, j118, j119, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i215, l26Var111110, dd2Var, l26Var111112, l26Var211, r89Var, l26Var111111), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                    j3 = j118;
                    j4 = j119;
                    j09Var2 = j09Var3;
                    g7gVar3 = tefVar;
                    l26Var9 = l26Var111110;
                    l26Var10 = l26Var111111;
                    l26Var11 = l26Var111112;
                    l26Var12 = l26Var211;
                    i12 = i215;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    i12 = i;
                    l26Var9 = l26Var5;
                    l26Var10 = l26Var6;
                    l26Var11 = l26Var7;
                    l26Var12 = l26Var8;
                    g7gVar3 = g7gVar2;
                    j3 = j;
                    j4 = j2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: tdc
                        @Override // defpackage.l26
                        public final Object z(Object obj13, Object obj14) {
                            ((Integer) obj14).getClass();
                            int iP = k99.P(i2 | 1);
                            xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj13, iP, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            l26Var8 = l26Var4;
            i11 = i4 | 196608;
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i2 & 12582912) == 0) {
                i11 |= 4194304;
            }
            if ((i2 & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    g7gVar2 = g7gVar;
                    if (l46Var.g(g7gVar2)) {
                    }
                    i11 |= i22;
                } else {
                    g7gVar2 = g7gVar;
                }
                i11 |= i22;
            } else {
                g7gVar2 = g7gVar;
            }
            if ((i2 & 805306368) != 0) {
                if (l46Var.i(dd2Var)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i11 |= i18;
            }
            if ((i11 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i11 & 1, z)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        l26Var13 = ge2.a;
                    } else {
                        l26Var13 = l26Var5;
                    }
                    if (i5 != 0) {
                        l26Var14 = ge2.b;
                    } else {
                        l26Var14 = l26Var6;
                    }
                    if (i7 != 0) {
                        l26Var15 = ge2.c;
                    } else {
                        l26Var15 = l26Var7;
                    }
                    if (i9 != 0) {
                        l26Var16 = ge2.d;
                    } else {
                        l26Var16 = l26Var8;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((m82) l46Var.k(o82.a)).n;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jB = o82.b(j5, l46Var);
                    i13 = i11 & (-29360129);
                    if ((i3 & 256) != 0) {
                        WeakHashMap weakHashMap112 = m8g.w;
                        i14 = i11 & (-264241153);
                        tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                    } else {
                        tefVar = g7gVar2;
                        i14 = i13;
                    }
                    i15 = 2;
                } else {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        l26Var13 = ge2.a;
                    } else {
                        l26Var13 = l26Var5;
                    }
                    if (i5 != 0) {
                        l26Var14 = ge2.b;
                    } else {
                        l26Var14 = l26Var6;
                    }
                    if (i7 != 0) {
                        l26Var15 = ge2.c;
                    } else {
                        l26Var15 = l26Var7;
                    }
                    if (i9 != 0) {
                        l26Var16 = ge2.d;
                    } else {
                        l26Var16 = l26Var8;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((m82) l46Var.k(o82.a)).n;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jB = o82.b(j5, l46Var);
                    i13 = i11 & (-29360129);
                    if ((i3 & 256) != 0) {
                        WeakHashMap weakHashMap113 = m8g.w;
                        i14 = i11 & (-264241153);
                        tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                    } else {
                        tefVar = g7gVar2;
                        i14 = i13;
                    }
                    i15 = 2;
                }
                l46Var.s();
                i16 = (234881024 & i14) ^ 100663296;
                if (i16 > 67108864) {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objR = l46Var.R();
                z3 = z2;
                Object obj13 = sf2.a;
                if (z3) {
                    objR = new r89(tefVar);
                    l46Var.p0(objR);
                } else {
                    objR = new r89(tefVar);
                    l46Var.p0(objR);
                }
                r89Var = (r89) objR;
                long j1110 = j5;
                zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                objR2 = l46Var.R();
                if (zG) {
                    objR2 = new h6b(10, r89Var, tefVar);
                    l46Var.p0(objR2);
                } else {
                    objR2 = new h6b(10, r89Var, tefVar);
                    l46Var.p0(objR2);
                }
                l26 l26Var111113 = l26Var13;
                l26 l26Var111114 = l26Var14;
                l26 l26Var111115 = l26Var15;
                l26 l26Var212 = l26Var16;
                int i216 = i15;
                long j1111 = jB;
                nae.a(eb3.P(j09Var3, (a26) objR2), null, j1110, j1111, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i216, l26Var111113, dd2Var, l26Var111115, l26Var212, r89Var, l26Var111114), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                j3 = j1110;
                j4 = j1111;
                j09Var2 = j09Var3;
                g7gVar3 = tefVar;
                l26Var9 = l26Var111113;
                l26Var10 = l26Var111114;
                l26Var11 = l26Var111115;
                l26Var12 = l26Var212;
                i12 = i216;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                i12 = i;
                l26Var9 = l26Var5;
                l26Var10 = l26Var6;
                l26Var11 = l26Var7;
                l26Var12 = l26Var8;
                g7gVar3 = g7gVar2;
                j3 = j;
                j4 = j2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: tdc
                    @Override // defpackage.l26
                    public final Object z(Object obj14, Object obj15) {
                        ((Integer) obj15).getClass();
                        int iP = k99.P(i2 | 1);
                        xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj14, iP, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 384;
        l26Var6 = l26Var2;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                l26Var7 = l26Var3;
                if (l46Var.i(l26Var7)) {
                    i8 = 2048;
                } else {
                    i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    l26Var8 = l26Var4;
                    if (l46Var.i(l26Var8)) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i10;
                }
                i11 = i4 | 196608;
                if ((1572864 & i2) != 0) {
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    i11 |= 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        g7gVar2 = g7gVar;
                        if (l46Var.g(g7gVar2)) {
                        }
                        i11 |= i22;
                    } else {
                        g7gVar2 = g7gVar;
                    }
                    i11 |= i22;
                } else {
                    g7gVar2 = g7gVar;
                }
                if ((i2 & 805306368) != 0) {
                    if (l46Var.i(dd2Var)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i11 |= i18;
                }
                if ((i11 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i11 & 1, z)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap114 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    } else {
                        if (i20 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i21 != 0) {
                            l26Var13 = ge2.a;
                        } else {
                            l26Var13 = l26Var5;
                        }
                        if (i5 != 0) {
                            l26Var14 = ge2.b;
                        } else {
                            l26Var14 = l26Var6;
                        }
                        if (i7 != 0) {
                            l26Var15 = ge2.c;
                        } else {
                            l26Var15 = l26Var7;
                        }
                        if (i9 != 0) {
                            l26Var16 = ge2.d;
                        } else {
                            l26Var16 = l26Var8;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((m82) l46Var.k(o82.a)).n;
                            i11 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jB = o82.b(j5, l46Var);
                        i13 = i11 & (-29360129);
                        if ((i3 & 256) != 0) {
                            WeakHashMap weakHashMap115 = m8g.w;
                            i14 = i11 & (-264241153);
                            tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                        } else {
                            tefVar = g7gVar2;
                            i14 = i13;
                        }
                        i15 = 2;
                    }
                    l46Var.s();
                    i16 = (234881024 & i14) ^ 100663296;
                    if (i16 > 67108864) {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i17 = i14;
                        if ((i17 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objR = l46Var.R();
                    z3 = z2;
                    Object obj14 = sf2.a;
                    if (z3) {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    } else {
                        objR = new r89(tefVar);
                        l46Var.p0(objR);
                    }
                    r89Var = (r89) objR;
                    long j1112 = j5;
                    zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                    objR2 = l46Var.R();
                    if (zG) {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new h6b(10, r89Var, tefVar);
                        l46Var.p0(objR2);
                    }
                    l26 l26Var111116 = l26Var13;
                    l26 l26Var111117 = l26Var14;
                    l26 l26Var111118 = l26Var15;
                    l26 l26Var213 = l26Var16;
                    int i217 = i15;
                    long j1113 = jB;
                    nae.a(eb3.P(j09Var3, (a26) objR2), null, j1112, j1113, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i217, l26Var111116, dd2Var, l26Var111118, l26Var213, r89Var, l26Var111117), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                    j3 = j1112;
                    j4 = j1113;
                    j09Var2 = j09Var3;
                    g7gVar3 = tefVar;
                    l26Var9 = l26Var111116;
                    l26Var10 = l26Var111117;
                    l26Var11 = l26Var111118;
                    l26Var12 = l26Var213;
                    i12 = i217;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    i12 = i;
                    l26Var9 = l26Var5;
                    l26Var10 = l26Var6;
                    l26Var11 = l26Var7;
                    l26Var12 = l26Var8;
                    g7gVar3 = g7gVar2;
                    j3 = j;
                    j4 = j2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: tdc
                        @Override // defpackage.l26
                        public final Object z(Object obj15, Object obj16) {
                            ((Integer) obj16).getClass();
                            int iP = k99.P(i2 | 1);
                            xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj15, iP, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            l26Var8 = l26Var4;
            i11 = i4 | 196608;
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i2 & 12582912) == 0) {
                i11 |= 4194304;
            }
            if ((i2 & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    g7gVar2 = g7gVar;
                    if (l46Var.g(g7gVar2)) {
                    }
                    i11 |= i22;
                } else {
                    g7gVar2 = g7gVar;
                }
                i11 |= i22;
            } else {
                g7gVar2 = g7gVar;
            }
            if ((i2 & 805306368) != 0) {
                if (l46Var.i(dd2Var)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i11 |= i18;
            }
            if ((i11 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i11 & 1, z)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        l26Var13 = ge2.a;
                    } else {
                        l26Var13 = l26Var5;
                    }
                    if (i5 != 0) {
                        l26Var14 = ge2.b;
                    } else {
                        l26Var14 = l26Var6;
                    }
                    if (i7 != 0) {
                        l26Var15 = ge2.c;
                    } else {
                        l26Var15 = l26Var7;
                    }
                    if (i9 != 0) {
                        l26Var16 = ge2.d;
                    } else {
                        l26Var16 = l26Var8;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((m82) l46Var.k(o82.a)).n;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jB = o82.b(j5, l46Var);
                    i13 = i11 & (-29360129);
                    if ((i3 & 256) != 0) {
                        WeakHashMap weakHashMap116 = m8g.w;
                        i14 = i11 & (-264241153);
                        tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                    } else {
                        tefVar = g7gVar2;
                        i14 = i13;
                    }
                    i15 = 2;
                } else {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        l26Var13 = ge2.a;
                    } else {
                        l26Var13 = l26Var5;
                    }
                    if (i5 != 0) {
                        l26Var14 = ge2.b;
                    } else {
                        l26Var14 = l26Var6;
                    }
                    if (i7 != 0) {
                        l26Var15 = ge2.c;
                    } else {
                        l26Var15 = l26Var7;
                    }
                    if (i9 != 0) {
                        l26Var16 = ge2.d;
                    } else {
                        l26Var16 = l26Var8;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((m82) l46Var.k(o82.a)).n;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jB = o82.b(j5, l46Var);
                    i13 = i11 & (-29360129);
                    if ((i3 & 256) != 0) {
                        WeakHashMap weakHashMap117 = m8g.w;
                        i14 = i11 & (-264241153);
                        tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                    } else {
                        tefVar = g7gVar2;
                        i14 = i13;
                    }
                    i15 = 2;
                }
                l46Var.s();
                i16 = (234881024 & i14) ^ 100663296;
                if (i16 > 67108864) {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objR = l46Var.R();
                z3 = z2;
                Object obj15 = sf2.a;
                if (z3) {
                    objR = new r89(tefVar);
                    l46Var.p0(objR);
                } else {
                    objR = new r89(tefVar);
                    l46Var.p0(objR);
                }
                r89Var = (r89) objR;
                long j1114 = j5;
                zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                objR2 = l46Var.R();
                if (zG) {
                    objR2 = new h6b(10, r89Var, tefVar);
                    l46Var.p0(objR2);
                } else {
                    objR2 = new h6b(10, r89Var, tefVar);
                    l46Var.p0(objR2);
                }
                l26 l26Var111119 = l26Var13;
                l26 l26Var1111110 = l26Var14;
                l26 l26Var1111111 = l26Var15;
                l26 l26Var214 = l26Var16;
                int i218 = i15;
                long j1115 = jB;
                nae.a(eb3.P(j09Var3, (a26) objR2), null, j1114, j1115, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i218, l26Var111119, dd2Var, l26Var1111111, l26Var214, r89Var, l26Var1111110), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                j3 = j1114;
                j4 = j1115;
                j09Var2 = j09Var3;
                g7gVar3 = tefVar;
                l26Var9 = l26Var111119;
                l26Var10 = l26Var1111110;
                l26Var11 = l26Var1111111;
                l26Var12 = l26Var214;
                i12 = i218;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                i12 = i;
                l26Var9 = l26Var5;
                l26Var10 = l26Var6;
                l26Var11 = l26Var7;
                l26Var12 = l26Var8;
                g7gVar3 = g7gVar2;
                j3 = j;
                j4 = j2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: tdc
                    @Override // defpackage.l26
                    public final Object z(Object obj16, Object obj17) {
                        ((Integer) obj17).getClass();
                        int iP = k99.P(i2 | 1);
                        xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj16, iP, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 3072;
        l26Var7 = l26Var3;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                l26Var8 = l26Var4;
                if (l46Var.i(l26Var8)) {
                    i10 = 16384;
                } else {
                    i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i10;
            }
            i11 = i4 | 196608;
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i2 & 12582912) == 0) {
                i11 |= 4194304;
            }
            if ((i2 & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    g7gVar2 = g7gVar;
                    if (l46Var.g(g7gVar2)) {
                    }
                    i11 |= i22;
                } else {
                    g7gVar2 = g7gVar;
                }
                i11 |= i22;
            } else {
                g7gVar2 = g7gVar;
            }
            if ((i2 & 805306368) != 0) {
                if (l46Var.i(dd2Var)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i11 |= i18;
            }
            if ((i11 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i11 & 1, z)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        l26Var13 = ge2.a;
                    } else {
                        l26Var13 = l26Var5;
                    }
                    if (i5 != 0) {
                        l26Var14 = ge2.b;
                    } else {
                        l26Var14 = l26Var6;
                    }
                    if (i7 != 0) {
                        l26Var15 = ge2.c;
                    } else {
                        l26Var15 = l26Var7;
                    }
                    if (i9 != 0) {
                        l26Var16 = ge2.d;
                    } else {
                        l26Var16 = l26Var8;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((m82) l46Var.k(o82.a)).n;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jB = o82.b(j5, l46Var);
                    i13 = i11 & (-29360129);
                    if ((i3 & 256) != 0) {
                        WeakHashMap weakHashMap118 = m8g.w;
                        i14 = i11 & (-264241153);
                        tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                    } else {
                        tefVar = g7gVar2;
                        i14 = i13;
                    }
                    i15 = 2;
                } else {
                    if (i20 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i21 != 0) {
                        l26Var13 = ge2.a;
                    } else {
                        l26Var13 = l26Var5;
                    }
                    if (i5 != 0) {
                        l26Var14 = ge2.b;
                    } else {
                        l26Var14 = l26Var6;
                    }
                    if (i7 != 0) {
                        l26Var15 = ge2.c;
                    } else {
                        l26Var15 = l26Var7;
                    }
                    if (i9 != 0) {
                        l26Var16 = ge2.d;
                    } else {
                        l26Var16 = l26Var8;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((m82) l46Var.k(o82.a)).n;
                        i11 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jB = o82.b(j5, l46Var);
                    i13 = i11 & (-29360129);
                    if ((i3 & 256) != 0) {
                        WeakHashMap weakHashMap119 = m8g.w;
                        i14 = i11 & (-264241153);
                        tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                    } else {
                        tefVar = g7gVar2;
                        i14 = i13;
                    }
                    i15 = 2;
                }
                l46Var.s();
                i16 = (234881024 & i14) ^ 100663296;
                if (i16 > 67108864) {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    i17 = i14;
                    if ((i17 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objR = l46Var.R();
                z3 = z2;
                Object obj16 = sf2.a;
                if (z3) {
                    objR = new r89(tefVar);
                    l46Var.p0(objR);
                } else {
                    objR = new r89(tefVar);
                    l46Var.p0(objR);
                }
                r89Var = (r89) objR;
                long j1116 = j5;
                zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
                objR2 = l46Var.R();
                if (zG) {
                    objR2 = new h6b(10, r89Var, tefVar);
                    l46Var.p0(objR2);
                } else {
                    objR2 = new h6b(10, r89Var, tefVar);
                    l46Var.p0(objR2);
                }
                l26 l26Var1111112 = l26Var13;
                l26 l26Var1111113 = l26Var14;
                l26 l26Var1111114 = l26Var15;
                l26 l26Var215 = l26Var16;
                int i219 = i15;
                long j1117 = jB;
                nae.a(eb3.P(j09Var3, (a26) objR2), null, j1116, j1117, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i219, l26Var1111112, dd2Var, l26Var1111114, l26Var215, r89Var, l26Var1111113), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
                j3 = j1116;
                j4 = j1117;
                j09Var2 = j09Var3;
                g7gVar3 = tefVar;
                l26Var9 = l26Var1111112;
                l26Var10 = l26Var1111113;
                l26Var11 = l26Var1111114;
                l26Var12 = l26Var215;
                i12 = i219;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                i12 = i;
                l26Var9 = l26Var5;
                l26Var10 = l26Var6;
                l26Var11 = l26Var7;
                l26Var12 = l26Var8;
                g7gVar3 = g7gVar2;
                j3 = j;
                j4 = j2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: tdc
                    @Override // defpackage.l26
                    public final Object z(Object obj17, Object obj18) {
                        ((Integer) obj18).getClass();
                        int iP = k99.P(i2 | 1);
                        xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj17, iP, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 24576;
        l26Var8 = l26Var4;
        i11 = i4 | 196608;
        if ((1572864 & i2) != 0) {
            if ((i3 & 64) == 0) {
                i19 = 524288;
            } else {
                i19 = 524288;
            }
            i11 |= i19;
        }
        if ((i2 & 12582912) == 0) {
            i11 |= 4194304;
        }
        if ((i2 & 100663296) == 0) {
            if ((i3 & 256) == 0) {
                g7gVar2 = g7gVar;
                if (l46Var.g(g7gVar2)) {
                }
                i11 |= i22;
            } else {
                g7gVar2 = g7gVar;
            }
            i11 |= i22;
        } else {
            g7gVar2 = g7gVar;
        }
        if ((i2 & 805306368) != 0) {
            if (l46Var.i(dd2Var)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i11 |= i18;
        }
        if ((i11 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i11 & 1, z)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i20 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var;
                }
                if (i21 != 0) {
                    l26Var13 = ge2.a;
                } else {
                    l26Var13 = l26Var5;
                }
                if (i5 != 0) {
                    l26Var14 = ge2.b;
                } else {
                    l26Var14 = l26Var6;
                }
                if (i7 != 0) {
                    l26Var15 = ge2.c;
                } else {
                    l26Var15 = l26Var7;
                }
                if (i9 != 0) {
                    l26Var16 = ge2.d;
                } else {
                    l26Var16 = l26Var8;
                }
                if ((i3 & 64) != 0) {
                    j5 = ((m82) l46Var.k(o82.a)).n;
                    i11 &= -3670017;
                } else {
                    j5 = j;
                }
                jB = o82.b(j5, l46Var);
                i13 = i11 & (-29360129);
                if ((i3 & 256) != 0) {
                    WeakHashMap weakHashMap1110 = m8g.w;
                    i14 = i11 & (-264241153);
                    tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                } else {
                    tefVar = g7gVar2;
                    i14 = i13;
                }
                i15 = 2;
            } else {
                if (i20 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var;
                }
                if (i21 != 0) {
                    l26Var13 = ge2.a;
                } else {
                    l26Var13 = l26Var5;
                }
                if (i5 != 0) {
                    l26Var14 = ge2.b;
                } else {
                    l26Var14 = l26Var6;
                }
                if (i7 != 0) {
                    l26Var15 = ge2.c;
                } else {
                    l26Var15 = l26Var7;
                }
                if (i9 != 0) {
                    l26Var16 = ge2.d;
                } else {
                    l26Var16 = l26Var8;
                }
                if ((i3 & 64) != 0) {
                    j5 = ((m82) l46Var.k(o82.a)).n;
                    i11 &= -3670017;
                } else {
                    j5 = j;
                }
                jB = o82.b(j5, l46Var);
                i13 = i11 & (-29360129);
                if ((i3 & 256) != 0) {
                    WeakHashMap weakHashMap1111 = m8g.w;
                    i14 = i11 & (-264241153);
                    tefVar = new tef(q7c.k(l46Var).g, q7c.k(l46Var).b);
                } else {
                    tefVar = g7gVar2;
                    i14 = i13;
                }
                i15 = 2;
            }
            l46Var.s();
            i16 = (234881024 & i14) ^ 100663296;
            if (i16 > 67108864) {
                i17 = i14;
                if ((i17 & 100663296) != 67108864) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                i17 = i14;
                if ((i17 & 100663296) != 67108864) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            objR = l46Var.R();
            z3 = z2;
            Object obj17 = sf2.a;
            if (z3) {
                objR = new r89(tefVar);
                l46Var.p0(objR);
            } else {
                objR = new r89(tefVar);
                l46Var.p0(objR);
            }
            r89Var = (r89) objR;
            long j1118 = j5;
            zG = l46Var.g(r89Var) | ((i16 <= 67108864 && l46Var.g(tefVar)) || (i17 & 100663296) == 67108864);
            objR2 = l46Var.R();
            if (zG) {
                objR2 = new h6b(10, r89Var, tefVar);
                l46Var.p0(objR2);
            } else {
                objR2 = new h6b(10, r89Var, tefVar);
                l46Var.p0(objR2);
            }
            l26 l26Var1111115 = l26Var13;
            l26 l26Var1111116 = l26Var14;
            l26 l26Var1111117 = l26Var15;
            l26 l26Var216 = l26Var16;
            int i2110 = i15;
            long j1119 = jB;
            nae.a(eb3.P(j09Var3, (a26) objR2), null, j1118, j1119, 0.0f, 0.0f, null, af1.b0(848889571, new vdc(i2110, l26Var1111115, dd2Var, l26Var1111117, l26Var216, r89Var, l26Var1111116), l46Var), l46Var, ((i17 >> 12) & 896) | 12582912, 114);
            j3 = j1118;
            j4 = j1119;
            j09Var2 = j09Var3;
            g7gVar3 = tefVar;
            l26Var9 = l26Var1111115;
            l26Var10 = l26Var1111116;
            l26Var11 = l26Var1111117;
            l26Var12 = l26Var216;
            i12 = i2110;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            i12 = i;
            l26Var9 = l26Var5;
            l26Var10 = l26Var6;
            l26Var11 = l26Var7;
            l26Var12 = l26Var8;
            g7gVar3 = g7gVar2;
            j3 = j;
            j4 = j2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: tdc
                @Override // defpackage.l26
                public final Object z(Object obj18, Object obj19) {
                    ((Integer) obj19).getClass();
                    int iP = k99.P(i2 | 1);
                    xdc.a(j09Var2, l26Var9, l26Var10, l26Var11, l26Var12, i12, j3, j4, g7gVar3, dd2Var, (l46) obj18, iP, i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(int i, l26 l26Var, dd2 dd2Var, l26 l26Var2, l26 l26Var3, g7g g7gVar, l26 l26Var4, l46 l46Var, int i2) {
        boolean z;
        Object o53Var;
        int i3;
        int i4;
        l46Var.h0(-280287501);
        int i5 = i2 | (l46Var.e(i) ? 4 : 2) | (l46Var.i(l26Var) ? 32 : 16) | (l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(l26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(l26Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.g(g7gVar) ? 131072 : 65536) | (l46Var.i(l26Var4) ? 1048576 : 524288);
        if (l46Var.W(i5 & 1, (599187 & i5) != 599186)) {
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = new wdc();
                l46Var.p0(objR);
            }
            wdc wdcVar = (wdc) objR;
            boolean z2 = (i5 & 112) == 32;
            Object objR2 = l46Var.R();
            if (z2 || objR2 == obj) {
                objR2 = new dd2(new af3(5, l26Var), true, 605195056);
                l46Var.p0(objR2);
            }
            l26 l26Var5 = (l26) objR2;
            boolean z3 = (i5 & 7168) == 2048;
            Object objR3 = l46Var.R();
            if (z3 || objR3 == obj) {
                objR3 = new dd2(new af3(4, l26Var2), true, 418899191);
                l46Var.p0(objR3);
            }
            l26 l26Var6 = (l26) objR3;
            boolean z4 = (57344 & i5) == 16384;
            Object objR4 = l46Var.R();
            if (z4 || objR4 == obj) {
                objR4 = new dd2(new af3(3, l26Var3), true, 338600263);
                l46Var.p0(objR4);
            }
            l26 l26Var7 = (l26) objR4;
            boolean z5 = (i5 & 896) == 256;
            Object objR5 = l46Var.R();
            if (z5 || objR5 == obj) {
                objR5 = new dd2(new fw0(dd2Var, wdcVar, false, 12), true, -1776388365);
                l46Var.p0(objR5);
            }
            l26 l26Var8 = (l26) objR5;
            boolean z6 = (i5 & 3670016) == 1048576;
            Object objR6 = l46Var.R();
            if (z6 || objR6 == obj) {
                z = true;
                objR6 = new dd2(new af3(2, l26Var4), true, -1731662488);
                l46Var.p0(objR6);
            } else {
                z = true;
            }
            l26 l26Var9 = (l26) objR6;
            boolean zG = ((i5 & 458752) == 131072 ? z : false) | l46Var.g(l26Var5) | l46Var.g(l26Var6) | l46Var.g(l26Var7) | ((i5 & 14) == 4) | l46Var.g(l26Var9) | l46Var.g(l26Var8);
            Object objR7 = l46Var.R();
            if (zG || objR7 == obj) {
                i3 = 0;
                i4 = 1;
                o53Var = new o53(g7gVar, l26Var5, l26Var6, l26Var7, i, l26Var9, wdcVar, l26Var8);
                l46Var.p0(o53Var);
            } else {
                o53Var = objR7;
                i3 = 0;
                i4 = 1;
            }
            m6e.a(null, (l26) o53Var, l46Var, i3, i4);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r20(i, l26Var, dd2Var, l26Var2, l26Var3, g7gVar, l26Var4, i2, 4);
        }
    }

    public static final ykd c(int i, int i2) {
        z84.a(i);
        z84 z84Var = new z84(i);
        z84.a(i2);
        return new ykd(z84Var, new z84(i2));
    }

    public static final void d(j09 j09Var, boolean z, float[] fArr, a26 a26Var, l46 l46Var, int i) {
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        l46Var.h0(1813075079);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i4 |= l46Var.i(fArr != null ? new zm8(fArr) : null) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i4 |= l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((i4 & 9363) == 9362 && l46Var.F()) {
            l46Var.Z();
            z4 = z;
        } else {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                i3 = i4 & (-897);
                z2 = true;
            } else {
                l46Var.Z();
                i3 = i4 & (-897);
                z2 = z;
            }
            l46Var.s();
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                ah2 ah2Var = new ah2(af1.E(l46Var));
                l46Var.p0(ah2Var);
                objR = ah2Var;
            }
            aw2 aw2Var = ((ah2) objR).a;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new dxf(aw2Var);
                l46Var.p0(objR2);
            }
            dxf dxfVar = (dxf) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new ksf(12);
                l46Var.p0(objR3);
            }
            a26 a26Var2 = (a26) objR3;
            boolean zI = l46Var.i(dxfVar);
            Object objR4 = l46Var.R();
            if (zI || objR4 == i8cVar) {
                objR4 = new trd(28, dxfVar);
                l46Var.p0(objR4);
            }
            a26 a26Var3 = (a26) objR4;
            int i5 = i3;
            boolean zI2 = l46Var.i(fArr != null ? new zm8(fArr) : null) | ((i5 & 57344) == 16384) | l46Var.f(0L) | l46Var.i(dxfVar) | ((i5 & 112) == 32);
            Object objR5 = l46Var.R();
            if (zI2 || objR5 == i8cVar) {
                boolean z5 = z2;
                xu xuVar = new xu(dxfVar, a26Var, z5, fArr, 4);
                z3 = z5;
                l46Var.p0(xuVar);
                objR5 = xuVar;
            } else {
                z3 = z2;
            }
            xo1.b(a26Var2, j09Var, a26Var3, null, (a26) objR5, l46Var, ((i5 << 3) & 112) | 6, 8);
            z4 = z3;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60(i, 14, a26Var, j09Var, fArr, z4);
        }
    }

    public static final long e(int i, int i2, int i3, long j) {
        int i4;
        int iG = eue.g(j);
        int iF = eue.f(j);
        if (iF < i) {
            return j;
        }
        if (iG <= i && i2 <= iF) {
            i4 = i3 - (i2 - i);
            if (iG == iF) {
            }
            i = iF + i4;
            return u3c.b(iG, i);
        }
        if (iG > i && iF < i2) {
            i += i3;
            iG = i;
        } else if (iG >= i2) {
            i4 = i3 - (i2 - i);
        } else if (i < iG) {
            iG = i + i3;
            i = (i3 - (i2 - i)) + iF;
        }
        return u3c.b(iG, i);
        iG += i4;
        i = iF + i4;
        return u3c.b(iG, i);
    }

    public static final void f(int i, String str) throws Throwable {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            bp.b(i, v(str));
            return;
        }
        String strV = v(str);
        try {
            Method method = c;
            if (method == null) {
                method = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                c = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(a), strV, Integer.valueOf(i));
        } catch (Exception e2) {
            o(e2, "asyncTraceBegin");
        }
    }

    public static final void g(qi6 qi6Var, String str, String str2) {
        qi6Var.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = qi6Var.a;
        arrayList.add(str);
        arrayList.add(v4e.o0(str2).toString());
    }

    public static final si6 h(qi6 qi6Var) {
        qi6Var.getClass();
        return new si6((String[]) qi6Var.a.toArray(new String[0]));
    }

    public static final String i(si6 si6Var, int i) {
        si6Var.getClass();
        String str = (String) qd0.q0(i * 2, si6Var.a);
        if (str != null) {
            return str;
        }
        r3.i(tec.k("name[", i, ']'));
        return null;
    }

    public static final qi6 j(si6 si6Var) {
        si6Var.getClass();
        qi6 qi6Var = new qi6();
        ArrayList arrayList = qi6Var.a;
        String[] strArr = si6Var.a;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return qi6Var;
    }

    public static final String k(si6 si6Var, int i) {
        si6Var.getClass();
        String str = (String) qd0.q0((i * 2) + 1, si6Var.a);
        if (str != null) {
            return str;
        }
        r3.i(tec.k("value[", i, ']'));
        return null;
    }

    public static final void l(int i, String str) throws Throwable {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            bp.q(i, v(str));
            return;
        }
        String strV = v(str);
        try {
            Method method = d;
            if (method == null) {
                method = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                d = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(a), strV, Integer.valueOf(i));
        } catch (Exception e2) {
            o(e2, "asyncTraceEnd");
        }
    }

    public static final int m(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int n(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static void o(Exception exc, String str) throws Throwable {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            yg5.p(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final void p(String str) {
        str.getClass();
        if (str.length() <= 0) {
            qc0.j("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                tq.o(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void q(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                tq.o(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(ieg.l(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final boolean r() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return bp.B();
        }
        try {
            Method method = b;
            if (method == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                b = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(a));
            objInvoke.getClass();
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e2) {
            o(e2, "isTagEnabled");
            return false;
        }
    }

    public static final void s(une uneVar) {
        q0a q0aVar = uneVar.c;
        int length = q0aVar.length();
        int length2 = q0aVar.length() + 1;
        if (length < 0 || length >= length2) {
            l37.a("Expected " + length + " to be in [0, " + length2 + ")");
        }
        uneVar.g = u3c.b(length, length);
    }

    public static final int t(Integer num) {
        if (num != null && num.intValue() == -2) {
            return R.string.auth_login_code_send_network_error;
        }
        if (num != null && num.intValue() == 500) {
            return R.string.auth_login_code_send_failed;
        }
        return (num != null && num.intValue() == 70001) ? R.string.auth_login_code_send_frequently : R.string.auth_login_code_send_unknown_error;
    }

    public static final void u(une uneVar, int i, int i2) {
        uneVar.h(u3c.b(mh3.o(i, 0, uneVar.c.length()), mh3.o(i2, 0, uneVar.c.length())));
    }

    public static String v(String str) {
        String str2 = str.length() <= 127 ? str : null;
        return str2 == null ? str.substring(0, 127) : str2;
    }

    public static final double w(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final String x(int i, long j) {
        if (j >= 0) {
            tq.o(i);
            String string = Long.toString(j, i);
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        tq.o(i);
        String string2 = Long.toString(j3, i);
        string2.getClass();
        tq.o(i);
        String string3 = Long.toString(j4, i);
        string3.getClass();
        return string2.concat(string3);
    }

    public static vqg y(Object obj) {
        if (obj == null) {
            return vqg.w0;
        }
        if (obj instanceof String) {
            return new erg((String) obj);
        }
        if (obj instanceof Double) {
            return new vog((Double) obj);
        }
        if (obj instanceof Long) {
            return new vog(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new vog(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new lng((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                qc0.j("Invalid value type");
                return null;
            }
            smg smgVar = new smg();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                smgVar.r(smgVar.p(), y(it.next()));
            }
            return smgVar;
        }
        rqg rqgVar = new rqg();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            vqg vqgVarY = y(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                rqgVar.i((String) string, vqgVarY);
            }
        }
        return rqgVar;
    }

    public static vqg z(f5h f5hVar) {
        if (f5hVar == null) {
            return vqg.v0;
        }
        int iZ = f5hVar.z() - 1;
        if (iZ == 1) {
            return f5hVar.t() ? new erg(f5hVar.u()) : vqg.C0;
        }
        if (iZ == 2) {
            return f5hVar.x() ? new vog(Double.valueOf(f5hVar.y())) : new vog(null);
        }
        if (iZ == 3) {
            return f5hVar.v() ? new lng(Boolean.valueOf(f5hVar.w())) : new lng(null);
        }
        if (iZ != 4) {
            qc0.j("Unknown type found. Cannot convert entity");
            return null;
        }
        List listR = f5hVar.r();
        ArrayList arrayList = new ArrayList();
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            arrayList.add(z((f5h) it.next()));
        }
        return new yqg(f5hVar.s(), arrayList);
    }
}
