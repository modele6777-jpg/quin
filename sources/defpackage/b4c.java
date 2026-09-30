package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b4c {
    public static final pr4 a = new pr4(0, new zib(17));
    public static final pr4 b = new pr4(0, tq0.E0);

    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x0140  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void a(c4c c4cVar, k00 k00Var, j09 j09Var, a26 a26Var, Map map, l46 l46Var, int i, int i2) {
        int i3;
        j09 j09Var2;
        int i4;
        Map map2;
        int i5;
        j09 j09Var3;
        Map map3;
        ojb ojbVarV;
        Map map4;
        long jC;
        int i6;
        int i7;
        int i8;
        int i9;
        k00Var.getClass();
        l46Var.h0(559740240);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(c4cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(k00Var) ? 32 : 16;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                j09Var2 = j09Var;
                i3 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i & 3072) != 0) {
                if (l46Var.i(a26Var)) {
                    i9 = 2048;
                } else {
                    i9 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i9;
            }
            if ((i & 24576) == 0) {
                if (l46Var.e(1)) {
                    i8 = 16384;
                } else {
                    i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i8;
            }
            if ((196608 & i) == 0) {
                if (l46Var.h(true)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if (l46Var.e(Integer.MAX_VALUE)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    map2 = map;
                    if (l46Var.i(map2)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i3 |= i5;
                }
                if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
                    if (i10 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i4 != 0) {
                        map4 = qu4.a;
                    } else {
                        map4 = map2;
                    }
                    l46Var.f0(1039469618);
                    jC = d(c4cVar, l46Var).c();
                    if (jC == 16) {
                        jC = c(c4cVar, l46Var);
                    }
                    long j = jC;
                    l46Var.r(false);
                    vd0.d(k00Var, j09Var3, mue.a(d(c4cVar, l46Var), j, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), a26Var, 1, true, Integer.MAX_VALUE, 0, map4, null, l46Var, ((i3 >> 3) & 126) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0, 1664);
                    map3 = map4;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    map3 = map2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new r8(c4cVar, k00Var, j09Var3, a26Var, map3, i, i2, 4);
                }
            }
            i3 |= 12582912;
            map2 = map;
            if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
                if (i10 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i4 != 0) {
                    map4 = qu4.a;
                } else {
                    map4 = map2;
                }
                l46Var.f0(1039469618);
                jC = d(c4cVar, l46Var).c();
                if (jC == 16) {
                    jC = c(c4cVar, l46Var);
                }
                long j2 = jC;
                l46Var.r(false);
                vd0.d(k00Var, j09Var3, mue.a(d(c4cVar, l46Var), j2, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), a26Var, 1, true, Integer.MAX_VALUE, 0, map4, null, l46Var, ((i3 >> 3) & 126) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0, 1664);
                map3 = map4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                map3 = map2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new r8(c4cVar, k00Var, j09Var3, a26Var, map3, i, i2, 4);
            }
        }
        i3 |= 384;
        j09Var2 = j09Var;
        if ((i & 3072) != 0) {
            if (l46Var.i(a26Var)) {
                i9 = 2048;
            } else {
                i9 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i3 |= i9;
        }
        if ((i & 24576) == 0) {
            if (l46Var.e(1)) {
                i8 = 16384;
            } else {
                i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i3 |= i8;
        }
        if ((196608 & i) == 0) {
            if (l46Var.h(true)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (l46Var.e(Integer.MAX_VALUE)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((12582912 & i) == 0) {
                map2 = map;
                if (l46Var.i(map2)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
                if (i10 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i4 != 0) {
                    map4 = qu4.a;
                } else {
                    map4 = map2;
                }
                l46Var.f0(1039469618);
                jC = d(c4cVar, l46Var).c();
                if (jC == 16) {
                    jC = c(c4cVar, l46Var);
                }
                long j3 = jC;
                l46Var.r(false);
                vd0.d(k00Var, j09Var3, mue.a(d(c4cVar, l46Var), j3, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), a26Var, 1, true, Integer.MAX_VALUE, 0, map4, null, l46Var, ((i3 >> 3) & 126) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0, 1664);
                map3 = map4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                map3 = map2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new r8(c4cVar, k00Var, j09Var3, a26Var, map3, i, i2, 4);
            }
        }
        i3 |= 12582912;
        map2 = map;
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            if (i10 != 0) {
                j09Var3 = g09.a;
            } else {
                j09Var3 = j09Var2;
            }
            if (i4 != 0) {
                map4 = qu4.a;
            } else {
                map4 = map2;
            }
            l46Var.f0(1039469618);
            jC = d(c4cVar, l46Var).c();
            if (jC == 16) {
                jC = c(c4cVar, l46Var);
            }
            long j4 = jC;
            l46Var.r(false);
            vd0.d(k00Var, j09Var3, mue.a(d(c4cVar, l46Var), j4, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), a26Var, 1, true, Integer.MAX_VALUE, 0, map4, null, l46Var, ((i3 >> 3) & 126) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0, 1664);
            map3 = map4;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            map3 = map2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r8(c4cVar, k00Var, j09Var3, a26Var, map3, i, i2, 4);
        }
    }

    public static final void b(c4c c4cVar, String str, j09 j09Var, a26 a26Var, int i, boolean z, int i2, l46 l46Var, int i3) {
        int i4;
        String str2;
        j09 j09Var2;
        a26 a26Var2;
        int i5;
        boolean z2;
        int i6;
        str.getClass();
        l46Var.h0(-1456639868);
        if ((i3 & 6) == 0) {
            i4 = i3 | (l46Var.g(c4cVar) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            str2 = str;
            i4 |= l46Var.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i7 = i4 | 1797504;
        int i8 = 0;
        if (l46Var.W(i7 & 1, (599187 & i7) != 599186)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new a4c(i8);
                l46Var.p0(objR);
            }
            a26 a26Var3 = (a26) objR;
            l46Var.f0(328434118);
            long jC = d(c4cVar, l46Var).c();
            if (jC == 16) {
                jC = c(c4cVar, l46Var);
            }
            long j = jC;
            l46Var.r(false);
            j09Var2 = g09.a;
            vd0.e(str2, j09Var2, mue.a(d(c4cVar, l46Var), j, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), a26Var3, 1, true, Integer.MAX_VALUE, 0, null, l46Var, ((i7 >> 3) & 126) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (i7 & 3670016), 896);
            a26Var2 = a26Var3;
            i5 = 1;
            z2 = true;
            i6 = Integer.MAX_VALUE;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            a26Var2 = a26Var;
            i5 = i;
            z2 = z;
            i6 = i2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new c06(c4cVar, str, j09Var2, a26Var2, i5, z2, i6, i3);
        }
    }

    public static final long c(c4c c4cVar, l46 l46Var) {
        return ((y72) ((r4c) l46Var.k(s4c.a)).c.z(l46Var, 0)).a;
    }

    public static final mue d(c4c c4cVar, l46 l46Var) {
        return (mue) ((r4c) l46Var.k(s4c.a)).a.z(l46Var, 0);
    }
}
