package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.draw.a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gu6 {
    public static final j09 a = b.l(g09.a, ym8.g);

    public static final void a(gx6 gx6Var, String str, j09 j09Var, long j, l46 l46Var, int i, int i2) {
        int i3;
        j09 j09Var2;
        long j2;
        l46Var.h0(-126890956);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(gx6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && l46Var.f(j)) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                if (i4 != 0) {
                    j09Var = g09.a;
                }
                if ((i2 & 8) != 0) {
                    j = ((y72) l46Var.k(em2.a)).a;
                    i3 &= -7169;
                }
            } else {
                l46Var.Z();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            j09 j09Var3 = j09Var;
            long j3 = j;
            l46Var.s();
            b(o7c.x(gx6Var, l46Var), str, j09Var3, j3, l46Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
            j2 = j3;
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            j2 = j;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new du6(gx6Var, str, j09Var2, j2, i, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x011f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0141  */
    /* JADX WARN: Code duplicated, block: B:95:0x0161  */
    /* JADX WARN: Code duplicated, block: B:98:0x016c  */
    public static final void b(fy9 fy9Var, String str, j09 j09Var, long j, l46 l46Var, int i, int i2) {
        int i3;
        j09 j09Var2;
        long j2;
        boolean z;
        j09 j09Var3;
        long j3;
        ojb ojbVarV;
        int i4;
        j09 j09Var4;
        boolean z2;
        Object xz0Var;
        j09 j09VarB;
        long jI;
        boolean z3;
        Object objR;
        int i5;
        l46Var.h0(-2142239481);
        if ((i & 6) == 0) {
            i3 = (l46Var.i(fy9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                j09Var2 = j09Var;
                i3 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !l46Var.f(j2)) {
                    i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i3 & 1, z)) {
                l46Var.b0();
                i4 = i & 1;
                j09Var4 = g09.a;
                if (i4 != 0 || l46Var.C()) {
                    if (i6 != 0) {
                        j09Var2 = j09Var4;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((y72) l46Var.k(em2.a)).a;
                        i3 &= -7169;
                    }
                } else {
                    l46Var.Z();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                l46Var.s();
                z2 = (((i3 & 7168) ^ 3072) <= 2048 && l46Var.f(j2)) || (i3 & 3072) == 2048;
                Object objR2 = l46Var.R();
                i8c i8cVar = sf2.a;
                if (!z2 || objR2 == i8cVar) {
                    if (faf.a(j2, y72.k)) {
                        xz0Var = null;
                    } else {
                        xz0Var = new xz0(j2, 5);
                    }
                    l46Var.p0(xz0Var);
                } else {
                    xz0Var = objR2;
                }
                c82 c82Var = (c82) xz0Var;
                if (str != null) {
                    l46Var.f0(-536990979);
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objR = l46Var.R();
                    if (z3 || objR == i8cVar) {
                        objR = new bt5(str, 7);
                        l46Var.p0(objR);
                    }
                    j09VarB = vwc.b(j09Var4, false, (a26) objR);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-536832197);
                    l46Var.r(false);
                    j09VarB = j09Var4;
                }
                if (ald.a(fy9Var.getE0(), 9205357640488583168L)) {
                    j09Var4 = a;
                } else {
                    jI = fy9Var.getE0();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jI >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jI & 4294967295L)))) {
                        j09Var4 = a;
                    }
                }
                s21.a(a.a(j09Var2.D(j09Var4), fy9Var, null, an2.b, 0.0f, c82Var, 22).D(j09VarB), l46Var, 0);
                j09Var3 = j09Var2;
                j3 = j2;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                j3 = j2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new du6(fy9Var, str, j09Var3, j3, i, i2, 1);
            }
        }
        i3 |= 384;
        j09Var2 = j09Var;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            } else {
                i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i3 & 1, z)) {
            l46Var.b0();
            i4 = i & 1;
            j09Var4 = g09.a;
            if (i4 != 0) {
                if (i6 != 0) {
                    j09Var2 = j09Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((y72) l46Var.k(em2.a)).a;
                    i3 &= -7169;
                }
            } else {
                if (i6 != 0) {
                    j09Var2 = j09Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((y72) l46Var.k(em2.a)).a;
                    i3 &= -7169;
                }
            }
            l46Var.s();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            Object objR3 = l46Var.R();
            i8c i8cVar2 = sf2.a;
            if (z2) {
                if (faf.a(j2, y72.k)) {
                    xz0Var = null;
                } else {
                    xz0Var = new xz0(j2, 5);
                }
                l46Var.p0(xz0Var);
            } else {
                if (faf.a(j2, y72.k)) {
                    xz0Var = null;
                } else {
                    xz0Var = new xz0(j2, 5);
                }
                l46Var.p0(xz0Var);
            }
            c82 c82Var2 = (c82) xz0Var;
            if (str != null) {
                l46Var.f0(-536990979);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objR = l46Var.R();
                if (z3) {
                    objR = new bt5(str, 7);
                    l46Var.p0(objR);
                } else {
                    objR = new bt5(str, 7);
                    l46Var.p0(objR);
                }
                j09VarB = vwc.b(j09Var4, false, (a26) objR);
                l46Var.r(false);
            } else {
                l46Var.f0(-536832197);
                l46Var.r(false);
                j09VarB = j09Var4;
            }
            if (ald.a(fy9Var.getE0(), 9205357640488583168L)) {
                jI = fy9Var.getE0();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jI >> 32)))) {
                    j09Var4 = a;
                }
            } else {
                j09Var4 = a;
            }
            s21.a(a.a(j09Var2.D(j09Var4), fy9Var, null, an2.b, 0.0f, c82Var2, 22).D(j09VarB), l46Var, 0);
            j09Var3 = j09Var2;
            j3 = j2;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            j3 = j2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new du6(fy9Var, str, j09Var3, j3, i, i2, 1);
        }
    }
}
