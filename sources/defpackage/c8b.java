package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c8b {
    public static final bx9 a = new bx9(12.0f, 4.0f, 12.0f, 4.0f);

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void a(j09 j09Var, boolean z, final boolean z2, long j, final x16 x16Var, l46 l46Var, final int i, final int i2) {
        boolean z3;
        long j2;
        boolean z4;
        final j09 j09Var2;
        final boolean z5;
        final long j3;
        ojb ojbVarV;
        boolean z6;
        int i3;
        g09 g09Var;
        int i4;
        j09 j09Var3;
        final long j4;
        boolean z7;
        long jD;
        int i5;
        int i6;
        int i7;
        x16Var.getClass();
        l46Var.h0(1380696608);
        int i8 = i | 6;
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                z3 = z;
                i8 |= l46Var.h(z3) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (l46Var.h(z2)) {
                    i7 = 256;
                } else {
                    i7 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i8 |= i7;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (l46Var.f(j2)) {
                        i6 = 2048;
                    }
                    i8 |= i6;
                } else {
                    j2 = j;
                }
                i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i8 |= i6;
            } else {
                j2 = j;
            }
            if ((i & 24576) != 0) {
                if (l46Var.i(x16Var)) {
                    i5 = 16384;
                } else {
                    i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i8 |= i5;
            }
            if ((i8 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i8 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0 || l46Var.C()) {
                    z6 = i9 == 0 ? z3 : true;
                    i3 = i2 & 8;
                    g09Var = g09.a;
                    if (i3 != 0) {
                        if (g21.S(l46Var)) {
                            jD = abg.d(2570861635L);
                        } else {
                            jD = abg.d(2751463423L);
                        }
                        i4 = i8 & (-7169);
                        z7 = z6;
                        j09Var3 = g09Var;
                        j4 = jD;
                    } else {
                        i4 = i8;
                        long j5 = j2;
                        j09Var3 = g09Var;
                        j4 = j5;
                        z7 = z6;
                    }
                } else {
                    l46Var.Z();
                    if ((i2 & 8) != 0) {
                        i8 &= -7169;
                    }
                    long j6 = j2;
                    j09Var3 = j09Var;
                    i4 = i8;
                    j4 = j6;
                    z7 = z3;
                }
                l46Var.s();
                int i10 = ((i4 >> 12) & 14) | 1572864;
                int i11 = i4 << 3;
                bm8.h(x16Var, j09Var3, z7, null, null, af1.b0(-1442516798, new l26() { // from class: u7b
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        l46 l46Var2 = (l46) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                            j09 j09VarE = oa7.E(b.l(g09.a, 30.0f), a7c.a);
                            if (z2) {
                                j09VarE = tm7.o(j09VarE, abg.c(527857280), g21.f);
                            }
                            xn8 xn8VarC = s21.c(ndb.f, false);
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, j09VarE);
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
                            gu6.a(ok8.v(), afc.q(R.string.button_close, l46Var2), null, j4, l46Var2, 0, 4);
                            l46Var2.r(true);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, i10 | (i11 & 112) | (i11 & 896), 56);
                long j7 = j4;
                j09Var2 = j09Var3;
                j3 = j7;
                z5 = z7;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                z5 = z3;
                j3 = j2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: a8b
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c8b.a(j09Var2, z5, z2, j3, x16Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i8 = i | 54;
        z3 = z;
        if ((i & 384) == 0) {
            if (l46Var.h(z2)) {
                i7 = 256;
            } else {
                i7 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i8 |= i7;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j2 = j;
                if (l46Var.f(j2)) {
                    i6 = 2048;
                }
                i8 |= i6;
            } else {
                j2 = j;
            }
            i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i8 |= i6;
        } else {
            j2 = j;
        }
        if ((i & 24576) != 0) {
            if (l46Var.i(x16Var)) {
                i5 = 16384;
            } else {
                i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i8 |= i5;
        }
        if ((i8 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var.W(i8 & 1, z4)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i9 == 0) {
                }
                i3 = i2 & 8;
                g09Var = g09.a;
                if (i3 != 0) {
                    if (g21.S(l46Var)) {
                        jD = abg.d(2570861635L);
                    } else {
                        jD = abg.d(2751463423L);
                    }
                    i4 = i8 & (-7169);
                    z7 = z6;
                    j09Var3 = g09Var;
                    j4 = jD;
                } else {
                    i4 = i8;
                    long j8 = j2;
                    j09Var3 = g09Var;
                    j4 = j8;
                    z7 = z6;
                }
            } else {
                if (i9 == 0) {
                }
                i3 = i2 & 8;
                g09Var = g09.a;
                if (i3 != 0) {
                    if (g21.S(l46Var)) {
                        jD = abg.d(2570861635L);
                    } else {
                        jD = abg.d(2751463423L);
                    }
                    i4 = i8 & (-7169);
                    z7 = z6;
                    j09Var3 = g09Var;
                    j4 = jD;
                } else {
                    i4 = i8;
                    long j9 = j2;
                    j09Var3 = g09Var;
                    j4 = j9;
                    z7 = z6;
                }
            }
            l46Var.s();
            int i12 = ((i4 >> 12) & 14) | 1572864;
            int i13 = i4 << 3;
            bm8.h(x16Var, j09Var3, z7, null, null, af1.b0(-1442516798, new l26() { // from class: u7b
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    l46 l46Var2 = (l46) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        j09 j09VarE = oa7.E(b.l(g09.a, 30.0f), a7c.a);
                        if (z2) {
                            j09VarE = tm7.o(j09VarE, abg.c(527857280), g21.f);
                        }
                        xn8 xn8VarC = s21.c(ndb.f, false);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarE);
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
                        gu6.a(ok8.v(), afc.q(R.string.button_close, l46Var2), null, j4, l46Var2, 0, 4);
                        l46Var2.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, i12 | (i13 & 112) | (i13 & 896), 56);
            long j10 = j4;
            j09Var2 = j09Var3;
            j3 = j10;
            z5 = z7;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z5 = z3;
            j3 = j2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: a8b
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c8b.a(j09Var2, z5, z2, j3, x16Var, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(j09 j09Var, String str, boolean z, x4d x4dVar, long j, x16 x16Var, l46 l46Var, int i) {
        boolean z2;
        x4d x4dVar2;
        long j2;
        long j3;
        int i2;
        x4d x4dVar3;
        boolean z3;
        long j4;
        l46Var.h0(-2003354752);
        int i3 = i | (l46Var.g(str) ? 32 : 16) | 25984 | (l46Var.i(x16Var) ? 131072 : 65536);
        if (l46Var.W(i3 & 1, (74899 & i3) != 74898)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                j3 = 300;
                i2 = i3 & (-7169);
                x4dVar3 = eze.a(l46Var).a.a;
                z3 = true;
            } else {
                l46Var.Z();
                x4dVar3 = x4dVar;
                j3 = j;
                i2 = i3 & (-7169);
                z3 = z;
            }
            l46Var.s();
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new tz9(0L);
                l46Var.p0(objR);
            }
            tz9 tz9Var = (tz9) objR;
            boolean z4 = (458752 & i2) == 131072;
            Object objR2 = l46Var.R();
            if (z4 || objR2 == i8cVar) {
                long j5 = j3;
                v7b v7bVar = new v7b(j5, x16Var, tz9Var, 0);
                j4 = j5;
                l46Var.p0(v7bVar);
                objR2 = v7bVar;
            } else {
                j4 = j3;
            }
            boolean z5 = z3;
            i(j09Var, str, null, null, 0L, 0.0f, z5, x4dVar3, null, false, null, null, (x16) objR2, l46Var, (i2 & 126) | 1572864, 0, 3900);
            z2 = z5;
            x4dVar2 = x4dVar3;
            j2 = j4;
        } else {
            l46Var.Z();
            z2 = z;
            x4dVar2 = x4dVar;
            j2 = j;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mt2(j09Var, str, z2, x4dVar2, j2, x16Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0150  */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void c(j09 j09Var, mue mueVar, boolean z, xw9 xw9Var, x16 x16Var, dd2 dd2Var, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        mue mueVar2;
        boolean z2;
        int i4;
        xw9 xw9Var2;
        int i5;
        x16 x16Var2;
        boolean z3;
        j09 j09Var3;
        mue mueVar3;
        boolean z4;
        xw9 xw9Var3;
        ojb ojbVarV;
        mue mueVarI;
        int i6;
        int i7;
        x16Var.getClass();
        l46Var.h0(-1814493649);
        int i8 = i2 & 1;
        if (i8 != 0) {
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
            if ((i2 & 2) == 0) {
                mueVar2 = mueVar;
                int i9 = l46Var.g(mueVar2) ? 32 : 16;
                i3 |= i9;
            } else {
                mueVar2 = mueVar;
            }
            i3 |= i9;
        } else {
            mueVar2 = mueVar;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    xw9Var2 = xw9Var;
                    if (l46Var.g(xw9Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    x16Var2 = x16Var;
                    if (l46Var.i(x16Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 |= i7;
                } else {
                    x16Var2 = x16Var;
                }
                if ((196608 & i) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0 || l46Var.C()) {
                        if (i8 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var2;
                        }
                        if ((i2 & 2) != 0) {
                            mue mueVar4 = pue.a;
                            mueVarI = pue.i(l46Var);
                        } else {
                            mueVarI = mueVar2;
                        }
                        if (i10 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            xw9Var2 = a;
                        }
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        mueVarI = mueVar2;
                    }
                    boolean z5 = z2;
                    l46Var.s();
                    j09 j09VarY = ynb.Y(androidx.compose.foundation.b.c(db6.w(tm7.o(oa7.E(j09Var3, eze.a(l46Var).a.a), ((e8b) l46Var.k(l8b.a)).m, g21.f), 1.0f, eze.a(l46Var).b.x(l46Var), eze.a(l46Var).a.a), z5, null, null, x16Var2, 14), xw9Var2);
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarY);
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
                    mue mueVar5 = mueVarI;
                    mh3.a(nte.a.a(mue.a(mueVar5, eze.a(l46Var).b.y(l46Var), 0L, jgb.S(l46Var), null, 0L, null, 3, 0L, null, null, 16744442)), af1.b0(23243433, new qx1(dd2Var, 14), l46Var), l46Var, 56);
                    l46Var.r(true);
                    z4 = z5;
                    mueVar3 = mueVar5;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    mueVar3 = mueVar2;
                    z4 = z2;
                }
                xw9Var3 = xw9Var2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t42(j09Var3, mueVar3, z4, xw9Var3, x16Var, dd2Var, i, i2);
                }
            }
            i3 |= 3072;
            xw9Var2 = xw9Var;
            if ((i & 24576) == 0) {
                x16Var2 = x16Var;
                if (l46Var.i(x16Var2)) {
                    i7 = 16384;
                } else {
                    i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i7;
            } else {
                x16Var2 = x16Var;
            }
            if ((196608 & i) == 0) {
                if (l46Var.i(dd2Var)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        mue mueVar6 = pue.a;
                        mueVarI = pue.i(l46Var);
                    } else {
                        mueVarI = mueVar2;
                    }
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        xw9Var2 = a;
                    }
                } else {
                    if (i8 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        mue mueVar7 = pue.a;
                        mueVarI = pue.i(l46Var);
                    } else {
                        mueVarI = mueVar2;
                    }
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        xw9Var2 = a;
                    }
                }
                boolean z6 = z2;
                l46Var.s();
                j09 j09VarY2 = ynb.Y(androidx.compose.foundation.b.c(db6.w(tm7.o(oa7.E(j09Var3, eze.a(l46Var).a.a), ((e8b) l46Var.k(l8b.a)).m, g21.f), 1.0f, eze.a(l46Var).b.x(l46Var), eze.a(l46Var).a.a), z6, null, null, x16Var2, 14), xw9Var2);
                xn8 xn8VarC2 = s21.c(ndb.f, false);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarY2);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC2);
                dec.l(hj6.y, l46Var, u8aVarM2);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ2);
                mue mueVar8 = mueVarI;
                mh3.a(nte.a.a(mue.a(mueVar8, eze.a(l46Var).b.y(l46Var), 0L, jgb.S(l46Var), null, 0L, null, 3, 0L, null, null, 16744442)), af1.b0(23243433, new qx1(dd2Var, 14), l46Var), l46Var, 56);
                l46Var.r(true);
                z4 = z6;
                mueVar3 = mueVar8;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                mueVar3 = mueVar2;
                z4 = z2;
            }
            xw9Var3 = xw9Var2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new t42(j09Var3, mueVar3, z4, xw9Var3, x16Var, dd2Var, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                xw9Var2 = xw9Var;
                if (l46Var.g(xw9Var2)) {
                    i5 = 2048;
                } else {
                    i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                x16Var2 = x16Var;
                if (l46Var.i(x16Var2)) {
                    i7 = 16384;
                } else {
                    i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i7;
            } else {
                x16Var2 = x16Var;
            }
            if ((196608 & i) == 0) {
                if (l46Var.i(dd2Var)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        mue mueVar9 = pue.a;
                        mueVarI = pue.i(l46Var);
                    } else {
                        mueVarI = mueVar2;
                    }
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        xw9Var2 = a;
                    }
                } else {
                    if (i8 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        mue mueVar10 = pue.a;
                        mueVarI = pue.i(l46Var);
                    } else {
                        mueVarI = mueVar2;
                    }
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        xw9Var2 = a;
                    }
                }
                boolean z7 = z2;
                l46Var.s();
                j09 j09VarY3 = ynb.Y(androidx.compose.foundation.b.c(db6.w(tm7.o(oa7.E(j09Var3, eze.a(l46Var).a.a), ((e8b) l46Var.k(l8b.a)).m, g21.f), 1.0f, eze.a(l46Var).b.x(l46Var), eze.a(l46Var).a.a), z7, null, null, x16Var2, 14), xw9Var2);
                xn8 xn8VarC3 = s21.c(ndb.f, false);
                int iHashCode3 = Long.hashCode(l46Var.T);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, j09VarY3);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC3);
                dec.l(hj6.y, l46Var, u8aVarM3);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode3));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ3);
                mue mueVar11 = mueVarI;
                mh3.a(nte.a.a(mue.a(mueVar11, eze.a(l46Var).b.y(l46Var), 0L, jgb.S(l46Var), null, 0L, null, 3, 0L, null, null, 16744442)), af1.b0(23243433, new qx1(dd2Var, 14), l46Var), l46Var, 56);
                l46Var.r(true);
                z4 = z7;
                mueVar3 = mueVar11;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                mueVar3 = mueVar2;
                z4 = z2;
            }
            xw9Var3 = xw9Var2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new t42(j09Var3, mueVar3, z4, xw9Var3, x16Var, dd2Var, i, i2);
            }
        }
        i3 |= 3072;
        xw9Var2 = xw9Var;
        if ((i & 24576) == 0) {
            x16Var2 = x16Var;
            if (l46Var.i(x16Var2)) {
                i7 = 16384;
            } else {
                i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i3 |= i7;
        } else {
            x16Var2 = x16Var;
        }
        if ((196608 & i) == 0) {
            if (l46Var.i(dd2Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i3 & 1, z3)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if ((i2 & 2) != 0) {
                    mue mueVar12 = pue.a;
                    mueVarI = pue.i(l46Var);
                } else {
                    mueVarI = mueVar2;
                }
                if (i10 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    xw9Var2 = a;
                }
            } else {
                if (i8 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if ((i2 & 2) != 0) {
                    mue mueVar13 = pue.a;
                    mueVarI = pue.i(l46Var);
                } else {
                    mueVarI = mueVar2;
                }
                if (i10 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    xw9Var2 = a;
                }
            }
            boolean z8 = z2;
            l46Var.s();
            j09 j09VarY4 = ynb.Y(androidx.compose.foundation.b.c(db6.w(tm7.o(oa7.E(j09Var3, eze.a(l46Var).a.a), ((e8b) l46Var.k(l8b.a)).m, g21.f), 1.0f, eze.a(l46Var).b.x(l46Var), eze.a(l46Var).a.a), z8, null, null, x16Var2, 14), xw9Var2);
            xn8 xn8VarC4 = s21.c(ndb.f, false);
            int iHashCode4 = Long.hashCode(l46Var.T);
            u8a u8aVarM4 = l46Var.m();
            j09 j09VarJ4 = m93.J(l46Var, j09VarY4);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC4);
            dec.l(hj6.y, l46Var, u8aVarM4);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode4));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ4);
            mue mueVar14 = mueVarI;
            mh3.a(nte.a.a(mue.a(mueVar14, eze.a(l46Var).b.y(l46Var), 0L, jgb.S(l46Var), null, 0L, null, 3, 0L, null, null, 16744442)), af1.b0(23243433, new qx1(dd2Var, 14), l46Var), l46Var, 56);
            l46Var.r(true);
            z4 = z8;
            mueVar3 = mueVar14;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            mueVar3 = mueVar2;
            z4 = z2;
        }
        xw9Var3 = xw9Var2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t42(j09Var3, mueVar3, z4, xw9Var3, x16Var, dd2Var, i, i2);
        }
    }

    public static final void d(j09 j09Var, String str, mue mueVar, boolean z, xw9 xw9Var, x16 x16Var, l46 l46Var, int i, int i2) {
        int i3;
        mue mueVar2;
        boolean z2;
        xw9 xw9Var2;
        mue mueVarI;
        int i4;
        xw9 xw9Var3;
        boolean z3;
        str.getClass();
        x16Var.getClass();
        l46Var.h0(-956809633);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (l46Var.g(str) ? 32 : 16);
        int i6 = i5 | 3200;
        int i7 = i2 & 16;
        if (i7 != 0) {
            i6 = i5 | 27776;
        } else if ((i & 24576) == 0) {
            i6 |= l46Var.g(xw9Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i8 = i6 | (l46Var.i(x16Var) ? 131072 : 65536);
        if (l46Var.W(i8 & 1, (74899 & i8) != 74898)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                mue mueVar3 = pue.a;
                mueVarI = pue.i(l46Var);
                int i9 = i8 & (-897);
                if (i7 != 0) {
                    i4 = i9;
                    xw9Var3 = a;
                } else {
                    i4 = i9;
                    xw9Var3 = xw9Var;
                }
                z3 = true;
            } else {
                l46Var.Z();
                int i10 = i8 & (-897);
                mueVarI = mueVar;
                i4 = i10;
                z3 = z;
                xw9Var3 = xw9Var;
            }
            l46Var.s();
            int i11 = i4 & 14;
            int i12 = i4 >> 3;
            c(j09Var, mueVarI, z3, xw9Var3, x16Var, af1.b0(-641720555, new o8(str, 24), l46Var), l46Var, i11 | 196992 | (i12 & 7168) | (i12 & 57344), 0);
            z2 = z3;
            xw9Var2 = xw9Var3;
            mueVar2 = mueVarI;
        } else {
            l46Var.Z();
            mueVar2 = mueVar;
            z2 = z;
            xw9Var2 = xw9Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t42(j09Var, str, mueVar2, z2, xw9Var2, x16Var, i, i2);
        }
    }

    public static final void e(j09 j09Var, mue mueVar, boolean z, x16 x16Var, dd2 dd2Var, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        mue mueVar2;
        j09 j09Var3;
        mue mueVar3;
        mue mueVar4;
        j09 j09Var4;
        l46Var.h0(895446810);
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
            if ((i2 & 2) == 0) {
                mueVar2 = mueVar;
                int i5 = l46Var.g(mueVar2) ? 32 : 16;
                i3 |= i5;
            } else {
                mueVar2 = mueVar;
            }
            i3 |= i5;
        } else {
            mueVar2 = mueVar;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i3 |= l46Var.i(dd2Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                j09 j09Var5 = i4 != 0 ? g09.a : j09Var2;
                if ((i2 & 2) == 0) {
                    mueVar4 = mueVar2;
                } else if (k8b.f((e8b) l46Var.k(l8b.a))) {
                    l46Var.f0(214150624);
                    mueVar4 = new mue(0L, w6c.l(13), new ar5(600), null, ((y8b) l46Var.k(x8b.a)).b, 0L, 0L, 0, 0, 0L, null, null, 16777177);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1530933570);
                    mue mueVar5 = pue.a;
                    mue mueVarI = pue.i(l46Var);
                    l46Var.r(false);
                    mueVar4 = mueVarI;
                }
                j09Var4 = j09Var5;
            } else {
                l46Var.Z();
                j09Var4 = j09Var2;
                mueVar4 = mueVar2;
            }
            l46Var.s();
            float f = z ? 1.0f : 0.38f;
            long jB = y72.b(eze.a(l46Var).b.y(l46Var), f);
            mue mueVar6 = mueVar4;
            j09 j09VarA0 = ynb.a0(androidx.compose.foundation.b.c(db6.w(oa7.E(j09Var4, eze.a(l46Var).a.a), 1.0f, y72.b(((e8b) l46Var.k(l8b.a)).s, f), eze.a(l46Var).a.a), z, null, null, x16Var, 14), 12.0f, 4.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
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
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            mh3.b(new e1b[]{nte.a.a(mue.a(mueVar6, jB, 0L, jgb.S(l46Var), null, 0L, null, 3, 0L, null, null, 16744442)), ib8.f(jB, em2.a)}, af1.b0(-927958380, new qx1(dd2Var, 15), l46Var), l46Var, 48);
            l46Var.r(true);
            j09Var3 = j09Var4;
            mueVar3 = mueVar6;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            mueVar3 = mueVar2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jv1(j09Var3, mueVar3, z, x16Var, dd2Var, i, i2);
        }
    }

    public static final void f(j09 j09Var, String str, mue mueVar, boolean z, x16 x16Var, l46 l46Var, int i, int i2) {
        boolean z2;
        int i3;
        j09 j09Var2;
        mue mueVar2;
        boolean z3;
        mue mueVar3;
        int i4;
        j09 j09Var3;
        boolean z4;
        mue mueVar4;
        str.getClass();
        l46Var.h0(1961085670);
        int i5 = i | 6 | (l46Var.g(str) ? 32 : 16);
        int i6 = i5 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i5 | 3200;
            z2 = z;
        } else {
            z2 = z;
            i3 = i6 | (l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
        int i8 = i3 | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i8 & 1, (i8 & 9363) != 9362)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                if (k8b.f((e8b) l46Var.k(l8b.a))) {
                    l46Var.f0(-1736807276);
                    mueVar3 = new mue(0L, w6c.l(13), new ar5(600), null, ((y8b) l46Var.k(x8b.a)).b, 0L, 0L, 0, 0, 0L, null, null, 16777177);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-887305202);
                    mue mueVar5 = pue.a;
                    mue mueVarI = pue.i(l46Var);
                    l46Var.r(false);
                    mueVar3 = mueVarI;
                }
                i4 = i8 & (-897);
                boolean z5 = i7 == 0 ? z2 : true;
                j09Var3 = g09.a;
                z4 = z5;
                mueVar4 = mueVar3;
            } else {
                l46Var.Z();
                i4 = i8 & (-897);
                j09Var3 = j09Var;
                mueVar4 = mueVar;
                z4 = z2;
            }
            l46Var.s();
            int i9 = i4 >> 3;
            e(j09Var3, mueVar4, z4, x16Var, af1.b0(201394123, new o8(str, 27), l46Var), l46Var, (i9 & 896) | 24582 | (i9 & 7168), 0);
            j09Var2 = j09Var3;
            mueVar2 = mueVar4;
            z3 = z4;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            mueVar2 = mueVar;
            z3 = z2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t7b(j09Var2, str, mueVar2, z3, x16Var, i, i2);
        }
    }

    public static final void g(j09 j09Var, String str, mue mueVar, boolean z, x16 x16Var, l46 l46Var, int i) {
        mue mueVar2;
        boolean z2;
        mue mueVarI;
        boolean z3;
        l46Var.h0(1276156661);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                mue mueVar3 = pue.a;
                mueVarI = pue.i(l46Var);
                j09Var = g09.a;
                z3 = true;
            } else {
                l46Var.Z();
                mueVarI = mueVar;
                z3 = z;
            }
            l46Var.s();
            j09 j09VarA0 = ynb.a0(androidx.compose.foundation.b.c(db6.w(tm7.o(oa7.E(j09Var, eze.a(l46Var).a.a), eze.a(l46Var).b.w(l46Var), g21.f), 1.0f, eze.a(l46Var).b.x(l46Var), eze.a(l46Var).a.a), z3, null, null, x16Var, 14), 12.0f, 4.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
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
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            mh3.a(nte.a.a(mueVarI), af1.b0(-778927045, new o8(str, 25), l46Var), l46Var, 56);
            l46Var.r(true);
            mueVar2 = mueVarI;
            z2 = z3;
        } else {
            l46Var.Z();
            mueVar2 = mueVar;
            z2 = z;
        }
        j09 j09Var2 = j09Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t7b(j09Var2, str, mueVar2, z2, x16Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:104:0x017a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    public static final void h(j09 j09Var, boolean z, long j, long j2, String str, final x16 x16Var, l46 l46Var, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        long jC;
        int i5;
        long j3;
        int i6;
        String str2;
        int i7;
        x16 x16Var2;
        boolean z3;
        final j09 j09Var2;
        final boolean z4;
        final long j4;
        final long j5;
        final String str3;
        ojb ojbVarV;
        j09 j09Var3;
        long j6;
        j09 j09Var4;
        int i8;
        long jD;
        String strI;
        int i9;
        int i10;
        x16Var.getClass();
        l46Var.h0(1097482062);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= l46Var.h(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    jC = j;
                    if (l46Var.f(jC)) {
                        i5 = 256;
                    } else {
                        i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j2;
                        if (l46Var.f(j3)) {
                            i10 = 2048;
                        }
                        i3 |= i10;
                    } else {
                        j3 = j2;
                    }
                    i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    i3 |= i10;
                } else {
                    j3 = j2;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        str2 = str;
                        if (l46Var.g(str2)) {
                            i7 = 16384;
                        } else {
                            i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        x16Var2 = x16Var;
                        if (l46Var.i(x16Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    } else {
                        x16Var2 = x16Var;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i3 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0 || l46Var.C()) {
                            if (i11 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            boolean z5 = i12 == 0 ? z2 : true;
                            if (i4 != 0) {
                                jC = abg.c(527857280);
                            }
                            if ((i2 & 8) != 0) {
                                if (g21.S(l46Var)) {
                                    jD = abg.d(2570861635L);
                                } else {
                                    jD = abg.d(2751463423L);
                                }
                                i3 &= -7169;
                                j3 = jD;
                            }
                            if (i6 != 0) {
                                str2 = null;
                            }
                            j6 = j3;
                            j09Var4 = j09Var3;
                            i8 = i3;
                            z4 = z5;
                        } else {
                            l46Var.Z();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            i8 = i3;
                            z4 = z2;
                            j6 = j3;
                            j09Var4 = j09Var;
                        }
                        l46Var.s();
                        if (str2 == null) {
                            strI = tec.i(l46Var, -1881682541, R.string.button_close, l46Var, false);
                        } else {
                            l46Var.f0(-1881683223);
                            l46Var.r(false);
                            strI = str2;
                        }
                        final String str4 = strI;
                        final long j7 = j6;
                        final long j8 = jC;
                        bm8.h(x16Var2, b.l(j09Var4, 44.0f), z4, null, null, af1.b0(1455098736, new l26() { // from class: z7b
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                l46 l46Var2 = (l46) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    g09 g09Var = g09.a;
                                    j09 j09VarO = tm7.o(oa7.E(b.l(g09Var, 24.0f), a7c.a), j8, g21.f);
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
                                    gu6.a(ok8.v(), str4, b.l(g09Var, 16.0f), j7, l46Var2, 384, 0);
                                    l46Var2.r(true);
                                } else {
                                    l46Var2.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var), l46Var, ((i8 >> 15) & 14) | 1572864 | ((i8 << 3) & 896), 56);
                        j09Var2 = j09Var4;
                        j4 = j8;
                        j5 = j7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        z4 = z2;
                        j4 = jC;
                        j5 = j3;
                    }
                    str3 = str2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: b8b
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                c8b.h(j09Var2, z4, j4, j5, str3, x16Var, (l46) obj, k99.P(i | 1), i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                str2 = str;
                if ((196608 & i) == 0) {
                    x16Var2 = x16Var;
                    if (l46Var.i(x16Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                } else {
                    x16Var2 = x16Var;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i12 == 0) {
                        }
                        if (i4 != 0) {
                            jC = abg.c(527857280);
                        }
                        if ((i2 & 8) != 0) {
                            if (g21.S(l46Var)) {
                                jD = abg.d(2570861635L);
                            } else {
                                jD = abg.d(2751463423L);
                            }
                            i3 &= -7169;
                            j3 = jD;
                        }
                        if (i6 != 0) {
                            str2 = null;
                        }
                        j6 = j3;
                        j09Var4 = j09Var3;
                        i8 = i3;
                        z4 = z5;
                    } else {
                        if (i11 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i12 == 0) {
                        }
                        if (i4 != 0) {
                            jC = abg.c(527857280);
                        }
                        if ((i2 & 8) != 0) {
                            if (g21.S(l46Var)) {
                                jD = abg.d(2570861635L);
                            } else {
                                jD = abg.d(2751463423L);
                            }
                            i3 &= -7169;
                            j3 = jD;
                        }
                        if (i6 != 0) {
                            str2 = null;
                        }
                        j6 = j3;
                        j09Var4 = j09Var3;
                        i8 = i3;
                        z4 = z5;
                    }
                    l46Var.s();
                    if (str2 == null) {
                        strI = tec.i(l46Var, -1881682541, R.string.button_close, l46Var, false);
                    } else {
                        l46Var.f0(-1881683223);
                        l46Var.r(false);
                        strI = str2;
                    }
                    final String str5 = strI;
                    final long j9 = j6;
                    final long j10 = jC;
                    bm8.h(x16Var2, b.l(j09Var4, 44.0f), z4, null, null, af1.b0(1455098736, new l26() { // from class: z7b
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            l46 l46Var2 = (l46) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                g09 g09Var = g09.a;
                                j09 j09VarO = tm7.o(oa7.E(b.l(g09Var, 24.0f), a7c.a), j10, g21.f);
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
                                gu6.a(ok8.v(), str5, b.l(g09Var, 16.0f), j9, l46Var2, 384, 0);
                                l46Var2.r(true);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, ((i8 >> 15) & 14) | 1572864 | ((i8 << 3) & 896), 56);
                    j09Var2 = j09Var4;
                    j4 = j10;
                    j5 = j9;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    z4 = z2;
                    j4 = jC;
                    j5 = j3;
                }
                str3 = str2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: b8b
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            c8b.h(j09Var2, z4, j4, j5, str3, x16Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 384;
            jC = j;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j3 = j2;
                    if (l46Var.f(j3)) {
                        i10 = 2048;
                    }
                    i3 |= i10;
                } else {
                    j3 = j2;
                }
                i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i3 |= i10;
            } else {
                j3 = j2;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    if (l46Var.g(str2)) {
                        i7 = 16384;
                    } else {
                        i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    x16Var2 = x16Var;
                    if (l46Var.i(x16Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                } else {
                    x16Var2 = x16Var;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i12 == 0) {
                        }
                        if (i4 != 0) {
                            jC = abg.c(527857280);
                        }
                        if ((i2 & 8) != 0) {
                            if (g21.S(l46Var)) {
                                jD = abg.d(2570861635L);
                            } else {
                                jD = abg.d(2751463423L);
                            }
                            i3 &= -7169;
                            j3 = jD;
                        }
                        if (i6 != 0) {
                            str2 = null;
                        }
                        j6 = j3;
                        j09Var4 = j09Var3;
                        i8 = i3;
                        z4 = z5;
                    } else {
                        if (i11 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i12 == 0) {
                        }
                        if (i4 != 0) {
                            jC = abg.c(527857280);
                        }
                        if ((i2 & 8) != 0) {
                            if (g21.S(l46Var)) {
                                jD = abg.d(2570861635L);
                            } else {
                                jD = abg.d(2751463423L);
                            }
                            i3 &= -7169;
                            j3 = jD;
                        }
                        if (i6 != 0) {
                            str2 = null;
                        }
                        j6 = j3;
                        j09Var4 = j09Var3;
                        i8 = i3;
                        z4 = z5;
                    }
                    l46Var.s();
                    if (str2 == null) {
                        strI = tec.i(l46Var, -1881682541, R.string.button_close, l46Var, false);
                    } else {
                        l46Var.f0(-1881683223);
                        l46Var.r(false);
                        strI = str2;
                    }
                    final String str6 = strI;
                    final long j11 = j6;
                    final long j12 = jC;
                    bm8.h(x16Var2, b.l(j09Var4, 44.0f), z4, null, null, af1.b0(1455098736, new l26() { // from class: z7b
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            l46 l46Var2 = (l46) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                g09 g09Var = g09.a;
                                j09 j09VarO = tm7.o(oa7.E(b.l(g09Var, 24.0f), a7c.a), j12, g21.f);
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
                                gu6.a(ok8.v(), str6, b.l(g09Var, 16.0f), j11, l46Var2, 384, 0);
                                l46Var2.r(true);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, ((i8 >> 15) & 14) | 1572864 | ((i8 << 3) & 896), 56);
                    j09Var2 = j09Var4;
                    j4 = j12;
                    j5 = j11;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    z4 = z2;
                    j4 = jC;
                    j5 = j3;
                }
                str3 = str2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: b8b
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            c8b.h(j09Var2, z4, j4, j5, str3, x16Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            str2 = str;
            if ((196608 & i) == 0) {
                x16Var2 = x16Var;
                if (l46Var.i(x16Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            } else {
                x16Var2 = x16Var;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i12 == 0) {
                    }
                    if (i4 != 0) {
                        jC = abg.c(527857280);
                    }
                    if ((i2 & 8) != 0) {
                        if (g21.S(l46Var)) {
                            jD = abg.d(2570861635L);
                        } else {
                            jD = abg.d(2751463423L);
                        }
                        i3 &= -7169;
                        j3 = jD;
                    }
                    if (i6 != 0) {
                        str2 = null;
                    }
                    j6 = j3;
                    j09Var4 = j09Var3;
                    i8 = i3;
                    z4 = z5;
                } else {
                    if (i11 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i12 == 0) {
                    }
                    if (i4 != 0) {
                        jC = abg.c(527857280);
                    }
                    if ((i2 & 8) != 0) {
                        if (g21.S(l46Var)) {
                            jD = abg.d(2570861635L);
                        } else {
                            jD = abg.d(2751463423L);
                        }
                        i3 &= -7169;
                        j3 = jD;
                    }
                    if (i6 != 0) {
                        str2 = null;
                    }
                    j6 = j3;
                    j09Var4 = j09Var3;
                    i8 = i3;
                    z4 = z5;
                }
                l46Var.s();
                if (str2 == null) {
                    strI = tec.i(l46Var, -1881682541, R.string.button_close, l46Var, false);
                } else {
                    l46Var.f0(-1881683223);
                    l46Var.r(false);
                    strI = str2;
                }
                final String str7 = strI;
                final long j13 = j6;
                final long j14 = jC;
                bm8.h(x16Var2, b.l(j09Var4, 44.0f), z4, null, null, af1.b0(1455098736, new l26() { // from class: z7b
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        l46 l46Var2 = (l46) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                            g09 g09Var = g09.a;
                            j09 j09VarO = tm7.o(oa7.E(b.l(g09Var, 24.0f), a7c.a), j14, g21.f);
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
                            gu6.a(ok8.v(), str7, b.l(g09Var, 16.0f), j13, l46Var2, 384, 0);
                            l46Var2.r(true);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, ((i8 >> 15) & 14) | 1572864 | ((i8 << 3) & 896), 56);
                j09Var2 = j09Var4;
                j4 = j14;
                j5 = j13;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                z4 = z2;
                j4 = jC;
                j5 = j3;
            }
            str3 = str2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: b8b
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c8b.h(j09Var2, z4, j4, j5, str3, x16Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                jC = j;
                if (l46Var.f(jC)) {
                    i5 = 256;
                } else {
                    i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j3 = j2;
                    if (l46Var.f(j3)) {
                        i10 = 2048;
                    }
                    i3 |= i10;
                } else {
                    j3 = j2;
                }
                i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i3 |= i10;
            } else {
                j3 = j2;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    if (l46Var.g(str2)) {
                        i7 = 16384;
                    } else {
                        i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    x16Var2 = x16Var;
                    if (l46Var.i(x16Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                } else {
                    x16Var2 = x16Var;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i12 == 0) {
                        }
                        if (i4 != 0) {
                            jC = abg.c(527857280);
                        }
                        if ((i2 & 8) != 0) {
                            if (g21.S(l46Var)) {
                                jD = abg.d(2570861635L);
                            } else {
                                jD = abg.d(2751463423L);
                            }
                            i3 &= -7169;
                            j3 = jD;
                        }
                        if (i6 != 0) {
                            str2 = null;
                        }
                        j6 = j3;
                        j09Var4 = j09Var3;
                        i8 = i3;
                        z4 = z5;
                    } else {
                        if (i11 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i12 == 0) {
                        }
                        if (i4 != 0) {
                            jC = abg.c(527857280);
                        }
                        if ((i2 & 8) != 0) {
                            if (g21.S(l46Var)) {
                                jD = abg.d(2570861635L);
                            } else {
                                jD = abg.d(2751463423L);
                            }
                            i3 &= -7169;
                            j3 = jD;
                        }
                        if (i6 != 0) {
                            str2 = null;
                        }
                        j6 = j3;
                        j09Var4 = j09Var3;
                        i8 = i3;
                        z4 = z5;
                    }
                    l46Var.s();
                    if (str2 == null) {
                        strI = tec.i(l46Var, -1881682541, R.string.button_close, l46Var, false);
                    } else {
                        l46Var.f0(-1881683223);
                        l46Var.r(false);
                        strI = str2;
                    }
                    final String str8 = strI;
                    final long j15 = j6;
                    final long j16 = jC;
                    bm8.h(x16Var2, b.l(j09Var4, 44.0f), z4, null, null, af1.b0(1455098736, new l26() { // from class: z7b
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            l46 l46Var2 = (l46) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                g09 g09Var = g09.a;
                                j09 j09VarO = tm7.o(oa7.E(b.l(g09Var, 24.0f), a7c.a), j16, g21.f);
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
                                gu6.a(ok8.v(), str8, b.l(g09Var, 16.0f), j15, l46Var2, 384, 0);
                                l46Var2.r(true);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, ((i8 >> 15) & 14) | 1572864 | ((i8 << 3) & 896), 56);
                    j09Var2 = j09Var4;
                    j4 = j16;
                    j5 = j15;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    z4 = z2;
                    j4 = jC;
                    j5 = j3;
                }
                str3 = str2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: b8b
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            c8b.h(j09Var2, z4, j4, j5, str3, x16Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            str2 = str;
            if ((196608 & i) == 0) {
                x16Var2 = x16Var;
                if (l46Var.i(x16Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            } else {
                x16Var2 = x16Var;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i12 == 0) {
                    }
                    if (i4 != 0) {
                        jC = abg.c(527857280);
                    }
                    if ((i2 & 8) != 0) {
                        if (g21.S(l46Var)) {
                            jD = abg.d(2570861635L);
                        } else {
                            jD = abg.d(2751463423L);
                        }
                        i3 &= -7169;
                        j3 = jD;
                    }
                    if (i6 != 0) {
                        str2 = null;
                    }
                    j6 = j3;
                    j09Var4 = j09Var3;
                    i8 = i3;
                    z4 = z5;
                } else {
                    if (i11 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i12 == 0) {
                    }
                    if (i4 != 0) {
                        jC = abg.c(527857280);
                    }
                    if ((i2 & 8) != 0) {
                        if (g21.S(l46Var)) {
                            jD = abg.d(2570861635L);
                        } else {
                            jD = abg.d(2751463423L);
                        }
                        i3 &= -7169;
                        j3 = jD;
                    }
                    if (i6 != 0) {
                        str2 = null;
                    }
                    j6 = j3;
                    j09Var4 = j09Var3;
                    i8 = i3;
                    z4 = z5;
                }
                l46Var.s();
                if (str2 == null) {
                    strI = tec.i(l46Var, -1881682541, R.string.button_close, l46Var, false);
                } else {
                    l46Var.f0(-1881683223);
                    l46Var.r(false);
                    strI = str2;
                }
                final String str9 = strI;
                final long j17 = j6;
                final long j18 = jC;
                bm8.h(x16Var2, b.l(j09Var4, 44.0f), z4, null, null, af1.b0(1455098736, new l26() { // from class: z7b
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        l46 l46Var2 = (l46) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                            g09 g09Var = g09.a;
                            j09 j09VarO = tm7.o(oa7.E(b.l(g09Var, 24.0f), a7c.a), j18, g21.f);
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
                            gu6.a(ok8.v(), str9, b.l(g09Var, 16.0f), j17, l46Var2, 384, 0);
                            l46Var2.r(true);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, ((i8 >> 15) & 14) | 1572864 | ((i8 << 3) & 896), 56);
                j09Var2 = j09Var4;
                j4 = j18;
                j5 = j17;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                z4 = z2;
                j4 = jC;
                j5 = j3;
            }
            str3 = str2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: b8b
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c8b.h(j09Var2, z4, j4, j5, str3, x16Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 384;
        jC = j;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j3 = j2;
                if (l46Var.f(j3)) {
                    i10 = 2048;
                }
                i3 |= i10;
            } else {
                j3 = j2;
            }
            i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i3 |= i10;
        } else {
            j3 = j2;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                if (l46Var.g(str2)) {
                    i7 = 16384;
                } else {
                    i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                x16Var2 = x16Var;
                if (l46Var.i(x16Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            } else {
                x16Var2 = x16Var;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i12 == 0) {
                    }
                    if (i4 != 0) {
                        jC = abg.c(527857280);
                    }
                    if ((i2 & 8) != 0) {
                        if (g21.S(l46Var)) {
                            jD = abg.d(2570861635L);
                        } else {
                            jD = abg.d(2751463423L);
                        }
                        i3 &= -7169;
                        j3 = jD;
                    }
                    if (i6 != 0) {
                        str2 = null;
                    }
                    j6 = j3;
                    j09Var4 = j09Var3;
                    i8 = i3;
                    z4 = z5;
                } else {
                    if (i11 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i12 == 0) {
                    }
                    if (i4 != 0) {
                        jC = abg.c(527857280);
                    }
                    if ((i2 & 8) != 0) {
                        if (g21.S(l46Var)) {
                            jD = abg.d(2570861635L);
                        } else {
                            jD = abg.d(2751463423L);
                        }
                        i3 &= -7169;
                        j3 = jD;
                    }
                    if (i6 != 0) {
                        str2 = null;
                    }
                    j6 = j3;
                    j09Var4 = j09Var3;
                    i8 = i3;
                    z4 = z5;
                }
                l46Var.s();
                if (str2 == null) {
                    strI = tec.i(l46Var, -1881682541, R.string.button_close, l46Var, false);
                } else {
                    l46Var.f0(-1881683223);
                    l46Var.r(false);
                    strI = str2;
                }
                final String str10 = strI;
                final long j19 = j6;
                final long j110 = jC;
                bm8.h(x16Var2, b.l(j09Var4, 44.0f), z4, null, null, af1.b0(1455098736, new l26() { // from class: z7b
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        l46 l46Var2 = (l46) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                            g09 g09Var = g09.a;
                            j09 j09VarO = tm7.o(oa7.E(b.l(g09Var, 24.0f), a7c.a), j110, g21.f);
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
                            gu6.a(ok8.v(), str10, b.l(g09Var, 16.0f), j19, l46Var2, 384, 0);
                            l46Var2.r(true);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, ((i8 >> 15) & 14) | 1572864 | ((i8 << 3) & 896), 56);
                j09Var2 = j09Var4;
                j4 = j110;
                j5 = j19;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                z4 = z2;
                j4 = jC;
                j5 = j3;
            }
            str3 = str2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: b8b
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c8b.h(j09Var2, z4, j4, j5, str3, x16Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 24576;
        str2 = str;
        if ((196608 & i) == 0) {
            x16Var2 = x16Var;
            if (l46Var.i(x16Var2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        } else {
            x16Var2 = x16Var;
        }
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i3 & 1, z3)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var;
                }
                if (i12 == 0) {
                }
                if (i4 != 0) {
                    jC = abg.c(527857280);
                }
                if ((i2 & 8) != 0) {
                    if (g21.S(l46Var)) {
                        jD = abg.d(2570861635L);
                    } else {
                        jD = abg.d(2751463423L);
                    }
                    i3 &= -7169;
                    j3 = jD;
                }
                if (i6 != 0) {
                    str2 = null;
                }
                j6 = j3;
                j09Var4 = j09Var3;
                i8 = i3;
                z4 = z5;
            } else {
                if (i11 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var;
                }
                if (i12 == 0) {
                }
                if (i4 != 0) {
                    jC = abg.c(527857280);
                }
                if ((i2 & 8) != 0) {
                    if (g21.S(l46Var)) {
                        jD = abg.d(2570861635L);
                    } else {
                        jD = abg.d(2751463423L);
                    }
                    i3 &= -7169;
                    j3 = jD;
                }
                if (i6 != 0) {
                    str2 = null;
                }
                j6 = j3;
                j09Var4 = j09Var3;
                i8 = i3;
                z4 = z5;
            }
            l46Var.s();
            if (str2 == null) {
                strI = tec.i(l46Var, -1881682541, R.string.button_close, l46Var, false);
            } else {
                l46Var.f0(-1881683223);
                l46Var.r(false);
                strI = str2;
            }
            final String str11 = strI;
            final long j111 = j6;
            final long j112 = jC;
            bm8.h(x16Var2, b.l(j09Var4, 44.0f), z4, null, null, af1.b0(1455098736, new l26() { // from class: z7b
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    l46 l46Var2 = (l46) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        g09 g09Var = g09.a;
                        j09 j09VarO = tm7.o(oa7.E(b.l(g09Var, 24.0f), a7c.a), j112, g21.f);
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
                        gu6.a(ok8.v(), str11, b.l(g09Var, 16.0f), j111, l46Var2, 384, 0);
                        l46Var2.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i8 >> 15) & 14) | 1572864 | ((i8 << 3) & 896), 56);
            j09Var2 = j09Var4;
            j4 = j112;
            j5 = j111;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z4 = z2;
            j4 = jC;
            j5 = j3;
        }
        str3 = str2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: b8b
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c8b.h(j09Var2, z4, j4, j5, str3, x16Var, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:102:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x012f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:115:0x014d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0155  */
    /* JADX WARN: Code duplicated, block: B:120:0x015c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0160  */
    /* JADX WARN: Code duplicated, block: B:124:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0172  */
    /* JADX WARN: Code duplicated, block: B:130:0x017b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181  */
    /* JADX WARN: Code duplicated, block: B:133:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x018f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0192  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:167:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x0204  */
    /* JADX WARN: Code duplicated, block: B:169:0x0207  */
    /* JADX WARN: Code duplicated, block: B:171:0x020a  */
    /* JADX WARN: Code duplicated, block: B:174:0x020f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0218  */
    /* JADX WARN: Code duplicated, block: B:177:0x021c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0220  */
    /* JADX WARN: Code duplicated, block: B:181:0x0223  */
    /* JADX WARN: Code duplicated, block: B:184:0x0229  */
    /* JADX WARN: Code duplicated, block: B:185:0x0234  */
    /* JADX WARN: Code duplicated, block: B:188:0x0239  */
    /* JADX WARN: Code duplicated, block: B:190:0x0241  */
    /* JADX WARN: Code duplicated, block: B:191:0x0244  */
    /* JADX WARN: Code duplicated, block: B:194:0x024c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0251  */
    /* JADX WARN: Code duplicated, block: B:197:0x0255  */
    /* JADX WARN: Code duplicated, block: B:198:0x0258  */
    /* JADX WARN: Code duplicated, block: B:201:0x025e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0264  */
    /* JADX WARN: Code duplicated, block: B:205:0x0277  */
    /* JADX WARN: Code duplicated, block: B:208:0x0292  */
    /* JADX WARN: Code duplicated, block: B:209:0x0295  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:219:0x0325  */
    /* JADX WARN: Code duplicated, block: B:222:0x0340  */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    public static final void i(j09 j09Var, final String str, String str2, mue mueVar, long j, float f, boolean z, x4d x4dVar, u51 u51Var, boolean z2, xw9 xw9Var, l26 l26Var, x16 x16Var, l46 l46Var, final int i, final int i2, final int i3) {
        j09 j09Var2;
        int i4;
        String str3;
        String str4;
        int i5;
        int i6;
        long j2;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        boolean z3;
        int i11;
        x4d x4dVar2;
        u51 u51VarM;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z4;
        final mue mueVar2;
        final j09 j09Var3;
        final float f3;
        final boolean z5;
        final x4d x4dVar3;
        final String str5;
        final xw9 xw9Var2;
        final l26 l26Var2;
        final x16 x16Var2;
        long j3;
        final boolean z6;
        final u51 u51Var2;
        final long j4;
        ojb ojbVarV;
        int i22;
        Object obj;
        j09 j09Var4;
        mue mueVarJ;
        x4d x4dVar4;
        boolean z7;
        int i23;
        xw9 xw9Var3;
        l26 l26Var3;
        xw9 xw9Var4;
        x16 x16Var3;
        int i24;
        int i25;
        Object objR;
        gh6 gh6VarW0;
        boolean z8;
        boolean zI;
        Object objR2;
        l46Var.h0(-1882095558);
        int i26 = i3 & 1;
        if (i26 != 0) {
            i4 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i4 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i4 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i4 |= l46Var.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        int i27 = i3 & 4;
        if (i27 == 0) {
            if ((i & 384) == 0) {
                str4 = str2;
                i4 |= l46Var.g(str4) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i & 3072) != 0) {
                i4 |= ((i3 & 8) == 0 || !l46Var.g(mueVar)) ? UserMetadata.MAX_ATTRIBUTE_SIZE : 2048;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                i4 |= 24576;
                i6 = i27;
                j2 = j;
            } else {
                i6 = i27;
                j2 = j;
                if ((i & 24576) == 0) {
                    if (l46Var.f(j2)) {
                        i7 = 16384;
                    } else {
                        i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i7;
                }
            }
            i8 = i3 & 32;
            if (i8 != 0) {
                i4 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 196608) == 0) {
                    if (l46Var.d(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                z3 = z;
            } else {
                z3 = z;
                if ((i & 1572864) == 0) {
                    if (l46Var.h(z3)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            if ((i & 12582912) == 0) {
                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                    x4dVar2 = x4dVar;
                    int i28 = l46Var.g(x4dVar2) ? 8388608 : 4194304;
                    i4 |= i28;
                } else {
                    x4dVar2 = x4dVar;
                }
                i4 |= i28;
            } else {
                x4dVar2 = x4dVar;
            }
            if ((i & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    u51VarM = u51Var;
                    int i29 = l46Var.g(u51VarM) ? 67108864 : 33554432;
                    i4 |= i29;
                } else {
                    u51VarM = u51Var;
                }
                i4 |= i29;
            } else {
                u51VarM = u51Var;
            }
            i12 = i3 & 512;
            if (i12 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (l46Var.h(z2)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i4 |= i13;
            }
            if ((i2 & 6) == 0) {
                i14 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
            } else {
                i14 = i2;
            }
            i15 = i3 & 2048;
            if (i15 != 0) {
                i14 |= 48;
            } else if ((i2 & 48) != 0) {
                if (l46Var.i(l26Var)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
                i14 |= i16;
            }
            i17 = i14;
            i18 = i3 & 4096;
            if (i18 != 0) {
                i20 = i17 | 384;
            } else {
                i19 = i17;
                if ((i2 & 384) != 0) {
                    if (l46Var.i(x16Var)) {
                        i21 = 256;
                    } else {
                        i21 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i19 |= i21;
                }
                i20 = i19;
            }
            if ((i4 & 306783379) == 306783378 || (i20 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i4 & 1, z4)) {
                l46Var.b0();
                i22 = i & 1;
                obj = sf2.a;
                if (i22 != 0 || l46Var.C()) {
                    if (i26 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if ((i3 & 8) != 0) {
                        mue mueVar3 = pue.a;
                        mueVarJ = pue.j(l46Var);
                        i4 &= -7169;
                    } else {
                        mueVarJ = mueVar;
                    }
                    if (i5 != 0) {
                        j2 = y72.k;
                    }
                    if (i8 != 0) {
                        f2 = 0.0f;
                    }
                    if (i10 != 0) {
                        z3 = true;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        x4dVar4 = eze.a(l46Var).a.a;
                        i4 &= -29360129;
                    } else {
                        x4dVar4 = x4dVar2;
                    }
                    if ((i3 & 256) != 0) {
                        u51VarM = m(l46Var);
                        i4 &= -234881025;
                    }
                    if (i12 != 0) {
                        z7 = true;
                    } else {
                        z7 = z2;
                    }
                    i23 = i20;
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        xw9Var3 = v51.a;
                        i23 &= -15;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    if (i15 != 0) {
                        l26Var3 = null;
                    } else {
                        l26Var3 = l26Var;
                    }
                    xw9Var4 = xw9Var3;
                    if (i18 != 0) {
                        objR = l46Var.R();
                        if (objR == obj) {
                            objR = new i7b(2);
                            l46Var.p0(objR);
                        }
                        x16Var3 = (x16) objR;
                        i24 = i4;
                        i25 = i23;
                        xw9Var3 = xw9Var4;
                    } else {
                        x16Var3 = x16Var;
                        i24 = i4;
                        i25 = i23;
                    }
                } else {
                    l46Var.Z();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        i4 &= -29360129;
                    }
                    if ((i3 & 256) != 0) {
                        i4 &= -234881025;
                    }
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        i20 &= -15;
                    }
                    mueVarJ = mueVar;
                    l26Var3 = l26Var;
                    x16Var3 = x16Var;
                    j09Var4 = j09Var2;
                    i24 = i4;
                    x4dVar4 = x4dVar2;
                    z7 = z2;
                    i25 = i20;
                    xw9Var3 = xw9Var;
                }
                l46Var.s();
                xw9 xw9Var5 = xw9Var3;
                gh6VarW0 = kj0.w0(l46Var);
                j09 j09Var5 = j09Var4;
                u51 u51Var3 = u51VarM;
                if ((i24 & 1879048192) == 536870912) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zI = z8 | l46Var.i(gh6VarW0) | ((i25 & 896) == 256);
                objR2 = l46Var.R();
                if (zI || objR2 == obj) {
                    objR2 = new j28(z7, gh6VarW0, x16Var3, 3);
                    l46Var.p0(objR2);
                }
                final String str6 = str3;
                final float f4 = f2;
                final long j5 = j2;
                final String str7 = str4;
                final mue mueVar4 = mueVarJ;
                final l26 l26Var4 = l26Var3;
                int i30 = i24 >> 12;
                cgg.a((x16) objR2, j09Var5, z3, x4dVar4, u51Var3, null, null, xw9Var5, af1.b0(-91926486, new n26() { // from class: w7b
                    @Override // defpackage.n26
                    public final Object m(Object obj2, Object obj3, Object obj4) {
                        l46 l46Var2 = (l46) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        ((u7c) obj2).getClass();
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                            pr4 pr4Var = nte.a;
                            mue mueVar5 = pue.a;
                            e1b e1bVarA = pr4Var.a(pue.a(l46Var2));
                            final l26 l26Var5 = l26Var4;
                            final float f5 = f4;
                            final String str8 = str6;
                            final String str9 = str7;
                            final long j6 = j5;
                            final mue mueVar6 = mueVar4;
                            mh3.a(e1bVarA, af1.b0(-18230422, new l26() { // from class: y7b
                                @Override // defpackage.l26
                                public final Object z(Object obj5, Object obj6) {
                                    l46 l46Var3 = (l46) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        kx0 kx0Var = ndb.z;
                                        jx0 jx0Var = ndb.Z;
                                        t7c t7cVarA = s7c.a(new uc0(8.0f, true, new jv2(3, jx0Var)), kx0Var, l46Var3, 54);
                                        int iHashCode = Long.hashCode(l46Var3.T);
                                        u8a u8aVarM = l46Var3.m();
                                        g09 g09Var = g09.a;
                                        j09 j09VarJ = m93.J(l46Var3, g09Var);
                                        lf2.q.getClass();
                                        l46Var3.j0();
                                        boolean z9 = l46Var3.S;
                                        ov7 ov7Var = LayoutNode.h1;
                                        if (z9) {
                                            l46Var3.l(ov7Var);
                                        } else {
                                            l46Var3.s0();
                                        }
                                        he2 he2Var = hj6.z;
                                        dec.l(he2Var, l46Var3, t7cVarA);
                                        he2 he2Var2 = hj6.y;
                                        dec.l(he2Var2, l46Var3, u8aVarM);
                                        Integer numValueOf = Integer.valueOf(iHashCode);
                                        he2 he2Var3 = hj6.X;
                                        dec.l(he2Var3, l46Var3, numValueOf);
                                        dec.k(l46Var3);
                                        he2 he2Var4 = hj6.x;
                                        dec.l(he2Var4, l46Var3, j09VarJ);
                                        l26 l26Var6 = l26Var5;
                                        if (l26Var6 == null) {
                                            l46Var3.f0(-1295995437);
                                        } else {
                                            l46Var3.f0(-1704374290);
                                            l26Var6.z(l46Var3, 0);
                                        }
                                        l46Var3.r(false);
                                        c92 c92VarA = a92.a(new uc0(f5, true, new qc0(0)), jx0Var, l46Var3, 48);
                                        int iHashCode2 = Long.hashCode(l46Var3.T);
                                        u8a u8aVarM2 = l46Var3.m();
                                        j09 j09VarJ2 = m93.J(l46Var3, g09Var);
                                        l46Var3.j0();
                                        if (l46Var3.S) {
                                            l46Var3.l(ov7Var);
                                        } else {
                                            l46Var3.s0();
                                        }
                                        dec.l(he2Var, l46Var3, c92VarA);
                                        dec.l(he2Var2, l46Var3, u8aVarM2);
                                        ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
                                        dec.l(he2Var4, l46Var3, j09VarJ2);
                                        nte.b(str8, null, 0L, 0L, jgb.S(l46Var3), null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var3, 0, 0, 261054);
                                        l46 l46Var4 = l46Var3;
                                        String str10 = str9;
                                        if (str10 == null) {
                                            l46Var4.f0(-527061007);
                                            l46Var4.r(false);
                                        } else {
                                            l46Var4.f0(-527061006);
                                            nte.b(str10, null, j6, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar6, l46Var4, 0, 0, 130042);
                                            l46Var4 = l46Var4;
                                            l46Var4.r(false);
                                        }
                                        l46Var4.r(true);
                                        l46Var4.r(true);
                                    } else {
                                        l46Var3.Z();
                                    }
                                    return wef.a;
                                }
                            }, l46Var2), l46Var2, 56);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, ((i24 << 3) & 112) | 805306368 | (i30 & 896) | (i30 & 7168) | (i30 & 57344) | ((i25 << 21) & 29360128), 352);
                u51VarM = u51Var3;
                j09Var3 = j09Var5;
                f3 = f2;
                z5 = z3;
                str5 = str4;
                mueVar2 = mueVarJ;
                xw9Var2 = xw9Var5;
                x16Var2 = x16Var3;
                x4dVar3 = x4dVar4;
                j3 = j2;
                z6 = z7;
                l26Var2 = l26Var3;
            } else {
                l46Var.Z();
                mueVar2 = mueVar;
                j09Var3 = j09Var2;
                f3 = f2;
                z5 = z3;
                x4dVar3 = x4dVar2;
                str5 = str4;
                xw9Var2 = xw9Var;
                l26Var2 = l26Var;
                x16Var2 = x16Var;
                j3 = j2;
                z6 = z2;
            }
            u51Var2 = u51VarM;
            j4 = j3;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: x7b
                    @Override // defpackage.l26
                    public final Object z(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        c8b.i(j09Var3, str, str5, mueVar2, j4, f3, z5, x4dVar3, u51Var2, z6, xw9Var2, l26Var2, x16Var2, (l46) obj2, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 384;
        str4 = str2;
        if ((i & 3072) != 0) {
            i4 |= ((i3 & 8) == 0 || !l46Var.g(mueVar)) ? UserMetadata.MAX_ATTRIBUTE_SIZE : 2048;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
            i6 = i27;
            j2 = j;
        } else {
            i6 = i27;
            j2 = j;
            if ((i & 24576) == 0) {
                if (l46Var.f(j2)) {
                    i7 = 16384;
                } else {
                    i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i7;
            }
        }
        i8 = i3 & 32;
        if (i8 != 0) {
            i4 |= 196608;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 196608) == 0) {
                if (l46Var.d(f2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
        }
        i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 1572864;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 1572864) == 0) {
                if (l46Var.h(z3)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
        }
        if ((i & 12582912) == 0) {
            if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                x4dVar2 = x4dVar;
                if (l46Var.g(x4dVar2)) {
                }
                i4 |= i28;
            } else {
                x4dVar2 = x4dVar;
            }
            i4 |= i28;
        } else {
            x4dVar2 = x4dVar;
        }
        if ((i & 100663296) == 0) {
            if ((i3 & 256) == 0) {
                u51VarM = u51Var;
                if (l46Var.g(u51VarM)) {
                }
                i4 |= i29;
            } else {
                u51VarM = u51Var;
            }
            i4 |= i29;
        } else {
            u51VarM = u51Var;
        }
        i12 = i3 & 512;
        if (i12 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (l46Var.h(z2)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i4 |= i13;
        }
        if ((i2 & 6) == 0) {
            i14 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
        } else {
            i14 = i2;
        }
        i15 = i3 & 2048;
        if (i15 != 0) {
            i14 |= 48;
        } else if ((i2 & 48) != 0) {
            if (l46Var.i(l26Var)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        i17 = i14;
        i18 = i3 & 4096;
        if (i18 != 0) {
            i20 = i17 | 384;
        } else {
            i19 = i17;
            if ((i2 & 384) != 0) {
                if (l46Var.i(x16Var)) {
                    i21 = 256;
                } else {
                    i21 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i19 |= i21;
            }
            i20 = i19;
        }
        if ((i4 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (l46Var.W(i4 & 1, z4)) {
            l46Var.b0();
            i22 = i & 1;
            obj = sf2.a;
            if (i22 != 0) {
                if (i26 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i6 != 0) {
                    str4 = null;
                }
                if ((i3 & 8) != 0) {
                    mue mueVar5 = pue.a;
                    mueVarJ = pue.j(l46Var);
                    i4 &= -7169;
                } else {
                    mueVarJ = mueVar;
                }
                if (i5 != 0) {
                    j2 = y72.k;
                }
                if (i8 != 0) {
                    f2 = 0.0f;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    x4dVar4 = eze.a(l46Var).a.a;
                    i4 &= -29360129;
                } else {
                    x4dVar4 = x4dVar2;
                }
                if ((i3 & 256) != 0) {
                    u51VarM = m(l46Var);
                    i4 &= -234881025;
                }
                if (i12 != 0) {
                    z7 = true;
                } else {
                    z7 = z2;
                }
                i23 = i20;
                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    xw9Var3 = v51.a;
                    i23 &= -15;
                } else {
                    xw9Var3 = xw9Var;
                }
                if (i15 != 0) {
                    l26Var3 = null;
                } else {
                    l26Var3 = l26Var;
                }
                xw9Var4 = xw9Var3;
                if (i18 != 0) {
                    objR = l46Var.R();
                    if (objR == obj) {
                        objR = new i7b(2);
                        l46Var.p0(objR);
                    }
                    x16Var3 = (x16) objR;
                    i24 = i4;
                    i25 = i23;
                    xw9Var3 = xw9Var4;
                } else {
                    x16Var3 = x16Var;
                    i24 = i4;
                    i25 = i23;
                }
            } else {
                if (i26 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i6 != 0) {
                    str4 = null;
                }
                if ((i3 & 8) != 0) {
                    mue mueVar6 = pue.a;
                    mueVarJ = pue.j(l46Var);
                    i4 &= -7169;
                } else {
                    mueVarJ = mueVar;
                }
                if (i5 != 0) {
                    j2 = y72.k;
                }
                if (i8 != 0) {
                    f2 = 0.0f;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    x4dVar4 = eze.a(l46Var).a.a;
                    i4 &= -29360129;
                } else {
                    x4dVar4 = x4dVar2;
                }
                if ((i3 & 256) != 0) {
                    u51VarM = m(l46Var);
                    i4 &= -234881025;
                }
                if (i12 != 0) {
                    z7 = true;
                } else {
                    z7 = z2;
                }
                i23 = i20;
                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    xw9Var3 = v51.a;
                    i23 &= -15;
                } else {
                    xw9Var3 = xw9Var;
                }
                if (i15 != 0) {
                    l26Var3 = null;
                } else {
                    l26Var3 = l26Var;
                }
                xw9Var4 = xw9Var3;
                if (i18 != 0) {
                    objR = l46Var.R();
                    if (objR == obj) {
                        objR = new i7b(2);
                        l46Var.p0(objR);
                    }
                    x16Var3 = (x16) objR;
                    i24 = i4;
                    i25 = i23;
                    xw9Var3 = xw9Var4;
                } else {
                    x16Var3 = x16Var;
                    i24 = i4;
                    i25 = i23;
                }
            }
            l46Var.s();
            xw9 xw9Var6 = xw9Var3;
            gh6VarW0 = kj0.w0(l46Var);
            j09 j09Var6 = j09Var4;
            u51 u51Var4 = u51VarM;
            if ((i24 & 1879048192) == 536870912) {
                z8 = true;
            } else {
                z8 = false;
            }
            zI = z8 | l46Var.i(gh6VarW0) | ((i25 & 896) == 256);
            objR2 = l46Var.R();
            if (zI) {
                objR2 = new j28(z7, gh6VarW0, x16Var3, 3);
                l46Var.p0(objR2);
            } else {
                objR2 = new j28(z7, gh6VarW0, x16Var3, 3);
                l46Var.p0(objR2);
            }
            final String str8 = str3;
            final float f5 = f2;
            final long j6 = j2;
            final String str9 = str4;
            final mue mueVar7 = mueVarJ;
            final l26 l26Var5 = l26Var3;
            int i31 = i24 >> 12;
            cgg.a((x16) objR2, j09Var6, z3, x4dVar4, u51Var4, null, null, xw9Var6, af1.b0(-91926486, new n26() { // from class: w7b
                @Override // defpackage.n26
                public final Object m(Object obj2, Object obj3, Object obj4) {
                    l46 l46Var2 = (l46) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((u7c) obj2).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        pr4 pr4Var = nte.a;
                        mue mueVar8 = pue.a;
                        e1b e1bVarA = pr4Var.a(pue.a(l46Var2));
                        final l26 l26Var6 = l26Var5;
                        final float f6 = f5;
                        final String str10 = str8;
                        final String str11 = str9;
                        final long j7 = j6;
                        final mue mueVar9 = mueVar7;
                        mh3.a(e1bVarA, af1.b0(-18230422, new l26() { // from class: y7b
                            @Override // defpackage.l26
                            public final Object z(Object obj5, Object obj6) {
                                l46 l46Var3 = (l46) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    kx0 kx0Var = ndb.z;
                                    jx0 jx0Var = ndb.Z;
                                    t7c t7cVarA = s7c.a(new uc0(8.0f, true, new jv2(3, jx0Var)), kx0Var, l46Var3, 54);
                                    int iHashCode = Long.hashCode(l46Var3.T);
                                    u8a u8aVarM = l46Var3.m();
                                    g09 g09Var = g09.a;
                                    j09 j09VarJ = m93.J(l46Var3, g09Var);
                                    lf2.q.getClass();
                                    l46Var3.j0();
                                    boolean z9 = l46Var3.S;
                                    ov7 ov7Var = LayoutNode.h1;
                                    if (z9) {
                                        l46Var3.l(ov7Var);
                                    } else {
                                        l46Var3.s0();
                                    }
                                    he2 he2Var = hj6.z;
                                    dec.l(he2Var, l46Var3, t7cVarA);
                                    he2 he2Var2 = hj6.y;
                                    dec.l(he2Var2, l46Var3, u8aVarM);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    he2 he2Var3 = hj6.X;
                                    dec.l(he2Var3, l46Var3, numValueOf);
                                    dec.k(l46Var3);
                                    he2 he2Var4 = hj6.x;
                                    dec.l(he2Var4, l46Var3, j09VarJ);
                                    l26 l26Var7 = l26Var6;
                                    if (l26Var7 == null) {
                                        l46Var3.f0(-1295995437);
                                    } else {
                                        l46Var3.f0(-1704374290);
                                        l26Var7.z(l46Var3, 0);
                                    }
                                    l46Var3.r(false);
                                    c92 c92VarA = a92.a(new uc0(f6, true, new qc0(0)), jx0Var, l46Var3, 48);
                                    int iHashCode2 = Long.hashCode(l46Var3.T);
                                    u8a u8aVarM2 = l46Var3.m();
                                    j09 j09VarJ2 = m93.J(l46Var3, g09Var);
                                    l46Var3.j0();
                                    if (l46Var3.S) {
                                        l46Var3.l(ov7Var);
                                    } else {
                                        l46Var3.s0();
                                    }
                                    dec.l(he2Var, l46Var3, c92VarA);
                                    dec.l(he2Var2, l46Var3, u8aVarM2);
                                    ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
                                    dec.l(he2Var4, l46Var3, j09VarJ2);
                                    nte.b(str10, null, 0L, 0L, jgb.S(l46Var3), null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var3, 0, 0, 261054);
                                    l46 l46Var4 = l46Var3;
                                    String str12 = str11;
                                    if (str12 == null) {
                                        l46Var4.f0(-527061007);
                                        l46Var4.r(false);
                                    } else {
                                        l46Var4.f0(-527061006);
                                        nte.b(str12, null, j7, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar9, l46Var4, 0, 0, 130042);
                                        l46Var4 = l46Var4;
                                        l46Var4.r(false);
                                    }
                                    l46Var4.r(true);
                                    l46Var4.r(true);
                                } else {
                                    l46Var3.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var2), l46Var2, 56);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i24 << 3) & 112) | 805306368 | (i31 & 896) | (i31 & 7168) | (i31 & 57344) | ((i25 << 21) & 29360128), 352);
            u51VarM = u51Var4;
            j09Var3 = j09Var6;
            f3 = f2;
            z5 = z3;
            str5 = str4;
            mueVar2 = mueVarJ;
            xw9Var2 = xw9Var6;
            x16Var2 = x16Var3;
            x4dVar3 = x4dVar4;
            j3 = j2;
            z6 = z7;
            l26Var2 = l26Var3;
        } else {
            l46Var.Z();
            mueVar2 = mueVar;
            j09Var3 = j09Var2;
            f3 = f2;
            z5 = z3;
            x4dVar3 = x4dVar2;
            str5 = str4;
            xw9Var2 = xw9Var;
            l26Var2 = l26Var;
            x16Var2 = x16Var;
            j3 = j2;
            z6 = z2;
        }
        u51Var2 = u51VarM;
        j4 = j3;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: x7b
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = k99.P(i | 1);
                    int iP2 = k99.P(i2);
                    c8b.i(j09Var3, str, str5, mueVar2, j4, f3, z5, x4dVar3, u51Var2, z6, xw9Var2, l26Var2, x16Var2, (l46) obj2, iP, iP2, i3);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0115  */
    /* JADX WARN: Code duplicated, block: B:104:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:126:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:131:0x018c  */
    /* JADX WARN: Code duplicated, block: B:132:0x019c  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:149:0x0202  */
    /* JADX WARN: Code duplicated, block: B:151:0x0208  */
    /* JADX WARN: Code duplicated, block: B:152:0x020a  */
    /* JADX WARN: Code duplicated, block: B:154:0x020e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0214  */
    /* JADX WARN: Code duplicated, block: B:159:0x022d  */
    /* JADX WARN: Code duplicated, block: B:162:0x023c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0247  */
    /* JADX WARN: Code duplicated, block: B:168:0x0251  */
    /* JADX WARN: Code duplicated, block: B:174:0x025f  */
    /* JADX WARN: Code duplicated, block: B:177:0x026a  */
    /* JADX WARN: Code duplicated, block: B:178:0x026d  */
    /* JADX WARN: Code duplicated, block: B:181:0x027f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x028b  */
    /* JADX WARN: Code duplicated, block: B:187:0x02df  */
    /* JADX WARN: Code duplicated, block: B:190:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:93:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0112  */
    public static final void j(j09 j09Var, String str, boolean z, kn2 kn2Var, float f, x4d x4dVar, u51 u51Var, q11 q11Var, boolean z2, x16 x16Var, l46 l46Var, final int i, final int i2) {
        j09 j09Var2;
        int i3;
        boolean z3;
        int i4;
        boolean zI;
        int i5;
        float f2;
        x4d x4dVar2;
        u51 u51VarA;
        int i6;
        q11 q11Var2;
        int i7;
        int i8;
        int i9;
        x16 x16Var2;
        int i10;
        boolean z4;
        final kn2 kn2Var2;
        final q11 q11Var3;
        final x16 x16Var3;
        final j09 j09Var3;
        final boolean z5;
        final float f3;
        final x4d x4dVar3;
        final u51 u51Var2;
        final String str2;
        final boolean z6;
        ojb ojbVarV;
        int i11;
        Object obj;
        j09 j09Var4;
        int i12;
        String strQ;
        boolean z7;
        kn2 kn2Var3;
        float f4;
        int i13;
        Object obj2;
        int i14;
        q11 q11Var4;
        x16 x16Var4;
        x4d x4dVar4;
        u51 u51Var3;
        String str3;
        boolean z8;
        int i15;
        float f5;
        kn2 kn2Var4;
        Object objR;
        gh6 gh6VarW0;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean zI2;
        Object objR2;
        int i16;
        l46Var.h0(586210171);
        int i17 = i2 & 1;
        if (i17 != 0) {
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
            i3 |= ((i2 & 2) == 0 && l46Var.g(str)) ? 32 : 16;
        }
        int i18 = i2 & 4;
        if (i18 == 0) {
            if ((i & 384) == 0) {
                z3 = z;
                i3 |= l46Var.h(z3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if ((i & 4096) == 0) {
                    zI = l46Var.g(kn2Var);
                } else {
                    zI = l46Var.i(kn2Var);
                }
                if (zI) {
                    i5 = 2048;
                } else {
                    i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    f2 = f;
                    if (l46Var.d(f2)) {
                        i16 = 16384;
                    }
                    i3 |= i16;
                } else {
                    f2 = f;
                }
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i3 |= i16;
            } else {
                f2 = f;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    x4dVar2 = x4dVar;
                    int i19 = l46Var.g(x4dVar2) ? 131072 : 65536;
                    i3 |= i19;
                } else {
                    x4dVar2 = x4dVar;
                }
                i3 |= i19;
            } else {
                x4dVar2 = x4dVar;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    u51VarA = u51Var;
                    int i20 = l46Var.g(u51VarA) ? 1048576 : 524288;
                    i3 |= i20;
                } else {
                    u51VarA = u51Var;
                }
                i3 |= i20;
            } else {
                u51VarA = u51Var;
            }
            i6 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i6 != 0) {
                i3 |= 12582912;
                q11Var2 = q11Var;
            } else {
                q11Var2 = q11Var;
                if ((i & 12582912) == 0) {
                    if (l46Var.g(q11Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
            }
            i8 = i3 | 100663296;
            i9 = i2 & 512;
            if (i9 != 0) {
                if ((i & 805306368) == 0) {
                    x16Var2 = x16Var;
                    if (l46Var.i(x16Var2)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i8 |= i10;
                }
                if ((i8 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i8 & 1, z4)) {
                    l46Var.b0();
                    i11 = i & 1;
                    obj = sf2.a;
                    if (i11 != 0 || l46Var.C()) {
                        if (i17 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if ((i2 & 2) != 0) {
                            int i21 = i8 & (-113);
                            strQ = afc.q(R.string.button_continue, l46Var);
                            i12 = i21;
                        } else {
                            i12 = i8;
                            strQ = str;
                        }
                        if (i18 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i4 != 0) {
                            kn2Var3 = dd.E0;
                        } else {
                            kn2Var3 = kn2Var;
                        }
                        if ((i2 & 16) != 0) {
                            i12 &= -57345;
                            f4 = 4.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            x4dVar2 = eze.a(l46Var).a.a;
                        }
                        i13 = i12;
                        if ((i2 & 64) != 0) {
                            bx9 bx9Var = v51.a;
                            i13 &= -3670017;
                            obj2 = obj;
                            u51VarA = v51.a(eze.a(l46Var).b.z(l46Var), eze.a(l46Var).b.A(l46Var), 0L, 0L, l46Var, 12);
                            i14 = 3;
                        } else {
                            obj2 = obj;
                            i14 = 3;
                        }
                        if (i6 != 0) {
                            q11Var4 = null;
                        } else {
                            q11Var4 = q11Var;
                        }
                        if (i9 != 0) {
                            objR = l46Var.R();
                            if (objR == obj2) {
                                objR = new i7b(i14);
                                l46Var.p0(objR);
                            }
                            x16Var4 = (x16) objR;
                        } else {
                            x16Var4 = x16Var;
                        }
                        x4dVar4 = x4dVar2;
                        u51Var3 = u51VarA;
                        str3 = strQ;
                        z8 = true;
                        i15 = i13;
                        f5 = f4;
                        kn2Var4 = kn2Var3;
                    } else {
                        l46Var.Z();
                        if ((i2 & 2) != 0) {
                            i8 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i8 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i8 &= -3670017;
                        }
                        kn2Var4 = kn2Var;
                        z8 = z2;
                        j09Var4 = j09Var2;
                        x16Var4 = x16Var2;
                        obj2 = obj;
                        z7 = z3;
                        f5 = f2;
                        q11Var4 = q11Var2;
                        x4dVar4 = x4dVar2;
                        u51Var3 = u51VarA;
                        i15 = i8;
                        i14 = 3;
                        str3 = str;
                    }
                    l46Var.s();
                    gh6VarW0 = kj0.w0(l46Var);
                    if (z7 || pa7.t(kn2Var4, ed.E0)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    boolean z12 = z9;
                    if ((i15 & 7168) != 2048 || ((i15 & 4096) != 0 && l46Var.i(kn2Var4))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z13 = z10;
                    if ((234881024 & i15) == 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zI2 = z13 | z11 | l46Var.i(gh6VarW0) | ((1879048192 & i15) == 536870912);
                    objR2 = l46Var.R();
                    if (zI2 || objR2 == obj2) {
                        objR2 = new nt5(kn2Var4, z8, gh6VarW0, x16Var4);
                        l46Var.p0(objR2);
                    }
                    int i22 = i15 >> 6;
                    x16 x16Var5 = x16Var4;
                    float f6 = f5;
                    j09Var3 = j09Var4;
                    cgg.a((x16) objR2, j09Var3, z12, x4dVar4, u51Var3, null, q11Var4, null, af1.b0(-393643157, new j43(kn2Var4, u51Var3, f5, str3), l46Var), l46Var, (i22 & 7168) | ((i15 << 3) & 112) | 805306368 | (57344 & i22) | ((i15 >> 3) & 3670016), 416);
                    u51Var2 = u51Var3;
                    q11Var3 = q11Var4;
                    str2 = str3;
                    kn2Var2 = kn2Var4;
                    x16Var3 = x16Var5;
                    z6 = z8;
                    f3 = f6;
                    x4dVar3 = x4dVar4;
                    z5 = z7;
                } else {
                    l46Var.Z();
                    kn2Var2 = kn2Var;
                    q11Var3 = q11Var;
                    x16Var3 = x16Var;
                    j09Var3 = j09Var2;
                    z5 = z3;
                    f3 = f2;
                    x4dVar3 = x4dVar2;
                    u51Var2 = u51VarA;
                    str2 = str;
                    z6 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: s7b
                        @Override // defpackage.l26
                        public final Object z(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            c8b.j(j09Var3, str2, z5, kn2Var2, f3, x4dVar3, u51Var2, q11Var3, z6, x16Var3, (l46) obj3, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i8 = i3 | 905969664;
            x16Var2 = x16Var;
            if ((i8 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i8 & 1, z4)) {
                l46Var.b0();
                i11 = i & 1;
                obj = sf2.a;
                if (i11 != 0) {
                    if (i17 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        int i23 = i8 & (-113);
                        strQ = afc.q(R.string.button_continue, l46Var);
                        i12 = i23;
                    } else {
                        i12 = i8;
                        strQ = str;
                    }
                    if (i18 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i4 != 0) {
                        kn2Var3 = dd.E0;
                    } else {
                        kn2Var3 = kn2Var;
                    }
                    if ((i2 & 16) != 0) {
                        i12 &= -57345;
                        f4 = 4.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        x4dVar2 = eze.a(l46Var).a.a;
                    }
                    i13 = i12;
                    if ((i2 & 64) != 0) {
                        bx9 bx9Var2 = v51.a;
                        i13 &= -3670017;
                        obj2 = obj;
                        u51VarA = v51.a(eze.a(l46Var).b.z(l46Var), eze.a(l46Var).b.A(l46Var), 0L, 0L, l46Var, 12);
                        i14 = 3;
                    } else {
                        obj2 = obj;
                        i14 = 3;
                    }
                    if (i6 != 0) {
                        q11Var4 = null;
                    } else {
                        q11Var4 = q11Var;
                    }
                    if (i9 != 0) {
                        objR = l46Var.R();
                        if (objR == obj2) {
                            objR = new i7b(i14);
                            l46Var.p0(objR);
                        }
                        x16Var4 = (x16) objR;
                    } else {
                        x16Var4 = x16Var;
                    }
                    x4dVar4 = x4dVar2;
                    u51Var3 = u51VarA;
                    str3 = strQ;
                    z8 = true;
                    i15 = i13;
                    f5 = f4;
                    kn2Var4 = kn2Var3;
                } else {
                    if (i17 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        int i24 = i8 & (-113);
                        strQ = afc.q(R.string.button_continue, l46Var);
                        i12 = i24;
                    } else {
                        i12 = i8;
                        strQ = str;
                    }
                    if (i18 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i4 != 0) {
                        kn2Var3 = dd.E0;
                    } else {
                        kn2Var3 = kn2Var;
                    }
                    if ((i2 & 16) != 0) {
                        i12 &= -57345;
                        f4 = 4.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        x4dVar2 = eze.a(l46Var).a.a;
                    }
                    i13 = i12;
                    if ((i2 & 64) != 0) {
                        bx9 bx9Var3 = v51.a;
                        i13 &= -3670017;
                        obj2 = obj;
                        u51VarA = v51.a(eze.a(l46Var).b.z(l46Var), eze.a(l46Var).b.A(l46Var), 0L, 0L, l46Var, 12);
                        i14 = 3;
                    } else {
                        obj2 = obj;
                        i14 = 3;
                    }
                    if (i6 != 0) {
                        q11Var4 = null;
                    } else {
                        q11Var4 = q11Var;
                    }
                    if (i9 != 0) {
                        objR = l46Var.R();
                        if (objR == obj2) {
                            objR = new i7b(i14);
                            l46Var.p0(objR);
                        }
                        x16Var4 = (x16) objR;
                    } else {
                        x16Var4 = x16Var;
                    }
                    x4dVar4 = x4dVar2;
                    u51Var3 = u51VarA;
                    str3 = strQ;
                    z8 = true;
                    i15 = i13;
                    f5 = f4;
                    kn2Var4 = kn2Var3;
                }
                l46Var.s();
                gh6VarW0 = kj0.w0(l46Var);
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                boolean z14 = z9;
                if ((i15 & 7168) != 2048) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                boolean z15 = z10;
                if ((234881024 & i15) == 67108864) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zI2 = z15 | z11 | l46Var.i(gh6VarW0) | ((1879048192 & i15) == 536870912);
                objR2 = l46Var.R();
                if (zI2) {
                    objR2 = new nt5(kn2Var4, z8, gh6VarW0, x16Var4);
                    l46Var.p0(objR2);
                } else {
                    objR2 = new nt5(kn2Var4, z8, gh6VarW0, x16Var4);
                    l46Var.p0(objR2);
                }
                int i25 = i15 >> 6;
                x16 x16Var6 = x16Var4;
                float f7 = f5;
                j09Var3 = j09Var4;
                cgg.a((x16) objR2, j09Var3, z14, x4dVar4, u51Var3, null, q11Var4, null, af1.b0(-393643157, new j43(kn2Var4, u51Var3, f5, str3), l46Var), l46Var, (i25 & 7168) | ((i15 << 3) & 112) | 805306368 | (57344 & i25) | ((i15 >> 3) & 3670016), 416);
                u51Var2 = u51Var3;
                q11Var3 = q11Var4;
                str2 = str3;
                kn2Var2 = kn2Var4;
                x16Var3 = x16Var6;
                z6 = z8;
                f3 = f7;
                x4dVar3 = x4dVar4;
                z5 = z7;
            } else {
                l46Var.Z();
                kn2Var2 = kn2Var;
                q11Var3 = q11Var;
                x16Var3 = x16Var;
                j09Var3 = j09Var2;
                z5 = z3;
                f3 = f2;
                x4dVar3 = x4dVar2;
                u51Var2 = u51VarA;
                str2 = str;
                z6 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: s7b
                    @Override // defpackage.l26
                    public final Object z(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        c8b.j(j09Var3, str2, z5, kn2Var2, f3, x4dVar3, u51Var2, q11Var3, z6, x16Var3, (l46) obj3, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 384;
        z3 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                zI = l46Var.g(kn2Var);
            } else {
                zI = l46Var.i(kn2Var);
            }
            if (zI) {
                i5 = 2048;
            } else {
                i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i3 |= i5;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                f2 = f;
                if (l46Var.d(f2)) {
                    i16 = 16384;
                }
                i3 |= i16;
            } else {
                f2 = f;
            }
            i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i3 |= i16;
        } else {
            f2 = f;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                x4dVar2 = x4dVar;
                if (l46Var.g(x4dVar2)) {
                }
                i3 |= i19;
            } else {
                x4dVar2 = x4dVar;
            }
            i3 |= i19;
        } else {
            x4dVar2 = x4dVar;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                u51VarA = u51Var;
                if (l46Var.g(u51VarA)) {
                }
                i3 |= i20;
            } else {
                u51VarA = u51Var;
            }
            i3 |= i20;
        } else {
            u51VarA = u51Var;
        }
        i6 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i6 != 0) {
            i3 |= 12582912;
            q11Var2 = q11Var;
        } else {
            q11Var2 = q11Var;
            if ((i & 12582912) == 0) {
                if (l46Var.g(q11Var2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
        }
        i8 = i3 | 100663296;
        i9 = i2 & 512;
        if (i9 != 0) {
            if ((i & 805306368) == 0) {
                x16Var2 = x16Var;
                if (l46Var.i(x16Var2)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i8 |= i10;
            }
            if ((i8 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i8 & 1, z4)) {
                l46Var.b0();
                i11 = i & 1;
                obj = sf2.a;
                if (i11 != 0) {
                    if (i17 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        int i26 = i8 & (-113);
                        strQ = afc.q(R.string.button_continue, l46Var);
                        i12 = i26;
                    } else {
                        i12 = i8;
                        strQ = str;
                    }
                    if (i18 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i4 != 0) {
                        kn2Var3 = dd.E0;
                    } else {
                        kn2Var3 = kn2Var;
                    }
                    if ((i2 & 16) != 0) {
                        i12 &= -57345;
                        f4 = 4.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        x4dVar2 = eze.a(l46Var).a.a;
                    }
                    i13 = i12;
                    if ((i2 & 64) != 0) {
                        bx9 bx9Var4 = v51.a;
                        i13 &= -3670017;
                        obj2 = obj;
                        u51VarA = v51.a(eze.a(l46Var).b.z(l46Var), eze.a(l46Var).b.A(l46Var), 0L, 0L, l46Var, 12);
                        i14 = 3;
                    } else {
                        obj2 = obj;
                        i14 = 3;
                    }
                    if (i6 != 0) {
                        q11Var4 = null;
                    } else {
                        q11Var4 = q11Var;
                    }
                    if (i9 != 0) {
                        objR = l46Var.R();
                        if (objR == obj2) {
                            objR = new i7b(i14);
                            l46Var.p0(objR);
                        }
                        x16Var4 = (x16) objR;
                    } else {
                        x16Var4 = x16Var;
                    }
                    x4dVar4 = x4dVar2;
                    u51Var3 = u51VarA;
                    str3 = strQ;
                    z8 = true;
                    i15 = i13;
                    f5 = f4;
                    kn2Var4 = kn2Var3;
                } else {
                    if (i17 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 2) != 0) {
                        int i27 = i8 & (-113);
                        strQ = afc.q(R.string.button_continue, l46Var);
                        i12 = i27;
                    } else {
                        i12 = i8;
                        strQ = str;
                    }
                    if (i18 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i4 != 0) {
                        kn2Var3 = dd.E0;
                    } else {
                        kn2Var3 = kn2Var;
                    }
                    if ((i2 & 16) != 0) {
                        i12 &= -57345;
                        f4 = 4.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        x4dVar2 = eze.a(l46Var).a.a;
                    }
                    i13 = i12;
                    if ((i2 & 64) != 0) {
                        bx9 bx9Var5 = v51.a;
                        i13 &= -3670017;
                        obj2 = obj;
                        u51VarA = v51.a(eze.a(l46Var).b.z(l46Var), eze.a(l46Var).b.A(l46Var), 0L, 0L, l46Var, 12);
                        i14 = 3;
                    } else {
                        obj2 = obj;
                        i14 = 3;
                    }
                    if (i6 != 0) {
                        q11Var4 = null;
                    } else {
                        q11Var4 = q11Var;
                    }
                    if (i9 != 0) {
                        objR = l46Var.R();
                        if (objR == obj2) {
                            objR = new i7b(i14);
                            l46Var.p0(objR);
                        }
                        x16Var4 = (x16) objR;
                    } else {
                        x16Var4 = x16Var;
                    }
                    x4dVar4 = x4dVar2;
                    u51Var3 = u51VarA;
                    str3 = strQ;
                    z8 = true;
                    i15 = i13;
                    f5 = f4;
                    kn2Var4 = kn2Var3;
                }
                l46Var.s();
                gh6VarW0 = kj0.w0(l46Var);
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                boolean z16 = z9;
                if ((i15 & 7168) != 2048) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                boolean z17 = z10;
                if ((234881024 & i15) == 67108864) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zI2 = z17 | z11 | l46Var.i(gh6VarW0) | ((1879048192 & i15) == 536870912);
                objR2 = l46Var.R();
                if (zI2) {
                    objR2 = new nt5(kn2Var4, z8, gh6VarW0, x16Var4);
                    l46Var.p0(objR2);
                } else {
                    objR2 = new nt5(kn2Var4, z8, gh6VarW0, x16Var4);
                    l46Var.p0(objR2);
                }
                int i28 = i15 >> 6;
                x16 x16Var7 = x16Var4;
                float f8 = f5;
                j09Var3 = j09Var4;
                cgg.a((x16) objR2, j09Var3, z16, x4dVar4, u51Var3, null, q11Var4, null, af1.b0(-393643157, new j43(kn2Var4, u51Var3, f5, str3), l46Var), l46Var, (i28 & 7168) | ((i15 << 3) & 112) | 805306368 | (57344 & i28) | ((i15 >> 3) & 3670016), 416);
                u51Var2 = u51Var3;
                q11Var3 = q11Var4;
                str2 = str3;
                kn2Var2 = kn2Var4;
                x16Var3 = x16Var7;
                z6 = z8;
                f3 = f8;
                x4dVar3 = x4dVar4;
                z5 = z7;
            } else {
                l46Var.Z();
                kn2Var2 = kn2Var;
                q11Var3 = q11Var;
                x16Var3 = x16Var;
                j09Var3 = j09Var2;
                z5 = z3;
                f3 = f2;
                x4dVar3 = x4dVar2;
                u51Var2 = u51VarA;
                str2 = str;
                z6 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: s7b
                    @Override // defpackage.l26
                    public final Object z(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        c8b.j(j09Var3, str2, z5, kn2Var2, f3, x4dVar3, u51Var2, q11Var3, z6, x16Var3, (l46) obj3, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i8 = i3 | 905969664;
        x16Var2 = x16Var;
        if ((i8 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var.W(i8 & 1, z4)) {
            l46Var.b0();
            i11 = i & 1;
            obj = sf2.a;
            if (i11 != 0) {
                if (i17 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if ((i2 & 2) != 0) {
                    int i29 = i8 & (-113);
                    strQ = afc.q(R.string.button_continue, l46Var);
                    i12 = i29;
                } else {
                    i12 = i8;
                    strQ = str;
                }
                if (i18 != 0) {
                    z7 = true;
                } else {
                    z7 = z3;
                }
                if (i4 != 0) {
                    kn2Var3 = dd.E0;
                } else {
                    kn2Var3 = kn2Var;
                }
                if ((i2 & 16) != 0) {
                    i12 &= -57345;
                    f4 = 4.0f;
                } else {
                    f4 = f2;
                }
                if ((i2 & 32) != 0) {
                    i12 &= -458753;
                    x4dVar2 = eze.a(l46Var).a.a;
                }
                i13 = i12;
                if ((i2 & 64) != 0) {
                    bx9 bx9Var6 = v51.a;
                    i13 &= -3670017;
                    obj2 = obj;
                    u51VarA = v51.a(eze.a(l46Var).b.z(l46Var), eze.a(l46Var).b.A(l46Var), 0L, 0L, l46Var, 12);
                    i14 = 3;
                } else {
                    obj2 = obj;
                    i14 = 3;
                }
                if (i6 != 0) {
                    q11Var4 = null;
                } else {
                    q11Var4 = q11Var;
                }
                if (i9 != 0) {
                    objR = l46Var.R();
                    if (objR == obj2) {
                        objR = new i7b(i14);
                        l46Var.p0(objR);
                    }
                    x16Var4 = (x16) objR;
                } else {
                    x16Var4 = x16Var;
                }
                x4dVar4 = x4dVar2;
                u51Var3 = u51VarA;
                str3 = strQ;
                z8 = true;
                i15 = i13;
                f5 = f4;
                kn2Var4 = kn2Var3;
            } else {
                if (i17 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if ((i2 & 2) != 0) {
                    int i210 = i8 & (-113);
                    strQ = afc.q(R.string.button_continue, l46Var);
                    i12 = i210;
                } else {
                    i12 = i8;
                    strQ = str;
                }
                if (i18 != 0) {
                    z7 = true;
                } else {
                    z7 = z3;
                }
                if (i4 != 0) {
                    kn2Var3 = dd.E0;
                } else {
                    kn2Var3 = kn2Var;
                }
                if ((i2 & 16) != 0) {
                    i12 &= -57345;
                    f4 = 4.0f;
                } else {
                    f4 = f2;
                }
                if ((i2 & 32) != 0) {
                    i12 &= -458753;
                    x4dVar2 = eze.a(l46Var).a.a;
                }
                i13 = i12;
                if ((i2 & 64) != 0) {
                    bx9 bx9Var7 = v51.a;
                    i13 &= -3670017;
                    obj2 = obj;
                    u51VarA = v51.a(eze.a(l46Var).b.z(l46Var), eze.a(l46Var).b.A(l46Var), 0L, 0L, l46Var, 12);
                    i14 = 3;
                } else {
                    obj2 = obj;
                    i14 = 3;
                }
                if (i6 != 0) {
                    q11Var4 = null;
                } else {
                    q11Var4 = q11Var;
                }
                if (i9 != 0) {
                    objR = l46Var.R();
                    if (objR == obj2) {
                        objR = new i7b(i14);
                        l46Var.p0(objR);
                    }
                    x16Var4 = (x16) objR;
                } else {
                    x16Var4 = x16Var;
                }
                x4dVar4 = x4dVar2;
                u51Var3 = u51VarA;
                str3 = strQ;
                z8 = true;
                i15 = i13;
                f5 = f4;
                kn2Var4 = kn2Var3;
            }
            l46Var.s();
            gh6VarW0 = kj0.w0(l46Var);
            if (z7) {
                z9 = false;
            } else {
                z9 = false;
            }
            boolean z18 = z9;
            if ((i15 & 7168) != 2048) {
                z10 = true;
            } else {
                z10 = true;
            }
            boolean z19 = z10;
            if ((234881024 & i15) == 67108864) {
                z11 = true;
            } else {
                z11 = false;
            }
            zI2 = z19 | z11 | l46Var.i(gh6VarW0) | ((1879048192 & i15) == 536870912);
            objR2 = l46Var.R();
            if (zI2) {
                objR2 = new nt5(kn2Var4, z8, gh6VarW0, x16Var4);
                l46Var.p0(objR2);
            } else {
                objR2 = new nt5(kn2Var4, z8, gh6VarW0, x16Var4);
                l46Var.p0(objR2);
            }
            int i211 = i15 >> 6;
            x16 x16Var8 = x16Var4;
            float f9 = f5;
            j09Var3 = j09Var4;
            cgg.a((x16) objR2, j09Var3, z18, x4dVar4, u51Var3, null, q11Var4, null, af1.b0(-393643157, new j43(kn2Var4, u51Var3, f5, str3), l46Var), l46Var, (i211 & 7168) | ((i15 << 3) & 112) | 805306368 | (57344 & i211) | ((i15 >> 3) & 3670016), 416);
            u51Var2 = u51Var3;
            q11Var3 = q11Var4;
            str2 = str3;
            kn2Var2 = kn2Var4;
            x16Var3 = x16Var8;
            z6 = z8;
            f3 = f9;
            x4dVar3 = x4dVar4;
            z5 = z7;
        } else {
            l46Var.Z();
            kn2Var2 = kn2Var;
            q11Var3 = q11Var;
            x16Var3 = x16Var;
            j09Var3 = j09Var2;
            z5 = z3;
            f3 = f2;
            x4dVar3 = x4dVar2;
            u51Var2 = u51VarA;
            str2 = str;
            z6 = z2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: s7b
                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    c8b.j(j09Var3, str2, z5, kn2Var2, f3, x4dVar3, u51Var2, q11Var3, z6, x16Var3, (l46) obj3, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x012c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0132  */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:114:0x014a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0150  */
    /* JADX WARN: Code duplicated, block: B:118:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x0175  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:132:0x020e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0211  */
    /* JADX WARN: Code duplicated, block: B:137:0x0220  */
    /* JADX WARN: Code duplicated, block: B:140:0x022a  */
    /* JADX WARN: Code duplicated, block: B:142:0x022e  */
    /* JADX WARN: Code duplicated, block: B:144:0x026b  */
    /* JADX WARN: Code duplicated, block: B:147:0x027d  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    public static final void k(j09 j09Var, boolean z, x4d x4dVar, u51 u51Var, q11 q11Var, xw9 xw9Var, boolean z2, x16 x16Var, n26 n26Var, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        boolean z3;
        x4d x4dVar2;
        u51 u51VarM;
        int i4;
        q11 q11Var2;
        int i5;
        int i6;
        boolean z4;
        xw9 xw9Var2;
        j09 j09Var3;
        boolean z5;
        x4d x4dVar3;
        u51 u51Var2;
        q11 q11Var3;
        boolean z6;
        ojb ojbVarV;
        xw9 xw9Var3;
        int i7;
        x4d x4dVar4;
        u51 u51Var3;
        boolean z7;
        pr4 pr4Var;
        boolean zF;
        gh6 gh6VarW0;
        boolean z8;
        q11 q11Var4;
        l46 l46Var2;
        gh6 gh6Var;
        boolean z9;
        u51 u51Var4;
        x4d x4dVar5;
        boolean z10;
        boolean zI;
        Object objR;
        int i8;
        int i9;
        int i10;
        int i11;
        x16Var.getClass();
        n26Var.getClass();
        l46Var.h0(210357032);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i3 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= l46Var.h(z3) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    x4dVar2 = x4dVar;
                    if (l46Var.g(x4dVar2)) {
                        i11 = 256;
                    }
                    i3 |= i11;
                } else {
                    x4dVar2 = x4dVar;
                }
                i11 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                i3 |= i11;
            } else {
                x4dVar2 = x4dVar;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    u51VarM = u51Var;
                    if (l46Var.g(u51VarM)) {
                        i10 = 2048;
                    }
                    i3 |= i10;
                } else {
                    u51VarM = u51Var;
                }
                i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i3 |= i10;
            } else {
                u51VarM = u51Var;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    q11Var2 = q11Var;
                    if (l46Var.g(q11Var2)) {
                        i5 = 16384;
                    } else {
                        i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !l46Var.g(xw9Var)) ? 65536 : 131072;
                }
                i6 = i3 | 1572864;
                if ((12582912 & i) == 0) {
                    if (l46Var.i(x16Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i6 |= i9;
                }
                if ((100663296 & i) == 0) {
                    if (l46Var.i(n26Var)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i6 |= i8;
                }
                if ((38347923 & i6) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i6 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0 || l46Var.C()) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i13 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 4) != 0) {
                            i6 &= -897;
                            x4dVar2 = eze.a(l46Var).a.a;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            u51VarM = m(l46Var);
                        }
                        if (i4 != 0) {
                            q11Var2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            xw9Var3 = v51.a;
                            i6 &= -458753;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        xw9Var2 = xw9Var3;
                        i7 = i6;
                        x4dVar4 = x4dVar2;
                        u51Var3 = u51VarM;
                        q11Var3 = q11Var2;
                        z7 = true;
                    } else {
                        l46Var.Z();
                        if ((i2 & 4) != 0) {
                            i6 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i6 &= -458753;
                        }
                        xw9Var2 = xw9Var;
                        i7 = i6;
                        x4dVar4 = x4dVar2;
                        u51Var3 = u51VarM;
                        q11Var3 = q11Var2;
                        z7 = z2;
                    }
                    l46Var.s();
                    pr4Var = l8b.a;
                    zF = k8b.f((e8b) l46Var.k(pr4Var));
                    gh6VarW0 = kj0.w0(l46Var);
                    if (zF) {
                        l46Var.f0(289666073);
                        q11 q11VarB = x57.b(eze.a(l46Var).b.x(l46Var), 1.0f);
                        z8 = false;
                        l46Var.r(false);
                        q11Var4 = q11VarB;
                    } else {
                        z8 = false;
                        l46Var.f0(289667790);
                        l46Var.r(false);
                        q11Var4 = q11Var3;
                    }
                    if (zF) {
                        l46Var.f0(289669584);
                        bx9 bx9Var = v51.a;
                        z9 = false;
                        gh6Var = gh6VarW0;
                        u51 u51VarA = v51.a(y72.j, ((e8b) l46Var.k(pr4Var)).q, 0L, 0L, l46Var, 12);
                        l46Var2 = l46Var;
                        l46Var2.r(false);
                        u51Var4 = u51VarA;
                    } else {
                        l46Var2 = l46Var;
                        gh6Var = gh6VarW0;
                        z9 = z8;
                        l46Var2.f0(289673006);
                        l46Var2.r(z9);
                        u51Var4 = u51Var3;
                    }
                    if (zF) {
                        l46Var2.f0(289674639);
                        x4d x4dVar6 = eze.a(l46Var2).a.a;
                        l46Var2.r(z9);
                        x4dVar5 = x4dVar6;
                    } else {
                        l46Var2.f0(289675053);
                        l46Var2.r(z9);
                        x4dVar5 = x4dVar4;
                    }
                    if ((i7 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = z9;
                    }
                    zI = z10 | l46Var2.i(gh6Var) | ((i7 & 29360128) == 8388608);
                    objR = l46Var2.R();
                    if (zI || objR == sf2.a) {
                        objR = new j28(z7, gh6Var, x16Var, 4);
                        l46Var2.p0(objR);
                    }
                    int i14 = i7 << 3;
                    boolean z11 = z3;
                    l46 l46Var3 = l46Var2;
                    j09 j09Var4 = j09Var2;
                    cgg.a((x16) objR, j09Var4, z11, x4dVar5, u51Var4, null, q11Var4, xw9Var2, af1.b0(-691620072, new g20(27, n26Var), l46Var2), l46Var3, (i14 & 896) | (i14 & 112) | 805306368 | ((i7 << 6) & 29360128), 288);
                    z6 = z7;
                    u51Var2 = u51Var3;
                    j09Var3 = j09Var4;
                    z5 = z11;
                    x4dVar3 = x4dVar4;
                } else {
                    l46Var.Z();
                    xw9Var2 = xw9Var;
                    j09Var3 = j09Var2;
                    z5 = z3;
                    x4dVar3 = x4dVar2;
                    u51Var2 = u51VarM;
                    q11Var3 = q11Var2;
                    z6 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new u77(j09Var3, z5, x4dVar3, u51Var2, q11Var3, xw9Var2, z6, x16Var, n26Var, i, i2);
                }
            }
            i3 |= 24576;
            q11Var2 = q11Var;
            if ((196608 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !l46Var.g(xw9Var)) ? 65536 : 131072;
            }
            i6 = i3 | 1572864;
            if ((12582912 & i) == 0) {
                if (l46Var.i(x16Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i6 |= i9;
            }
            if ((100663296 & i) == 0) {
                if (l46Var.i(n26Var)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i6 |= i8;
            }
            if ((38347923 & i6) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i6 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 4) != 0) {
                        i6 &= -897;
                        x4dVar2 = eze.a(l46Var).a.a;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        u51VarM = m(l46Var);
                    }
                    if (i4 != 0) {
                        q11Var2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        xw9Var3 = v51.a;
                        i6 &= -458753;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    xw9Var2 = xw9Var3;
                    i7 = i6;
                    x4dVar4 = x4dVar2;
                    u51Var3 = u51VarM;
                    q11Var3 = q11Var2;
                    z7 = true;
                } else {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 4) != 0) {
                        i6 &= -897;
                        x4dVar2 = eze.a(l46Var).a.a;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        u51VarM = m(l46Var);
                    }
                    if (i4 != 0) {
                        q11Var2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        xw9Var3 = v51.a;
                        i6 &= -458753;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    xw9Var2 = xw9Var3;
                    i7 = i6;
                    x4dVar4 = x4dVar2;
                    u51Var3 = u51VarM;
                    q11Var3 = q11Var2;
                    z7 = true;
                }
                l46Var.s();
                pr4Var = l8b.a;
                zF = k8b.f((e8b) l46Var.k(pr4Var));
                gh6VarW0 = kj0.w0(l46Var);
                if (zF) {
                    l46Var.f0(289666073);
                    q11 q11VarB2 = x57.b(eze.a(l46Var).b.x(l46Var), 1.0f);
                    z8 = false;
                    l46Var.r(false);
                    q11Var4 = q11VarB2;
                } else {
                    z8 = false;
                    l46Var.f0(289667790);
                    l46Var.r(false);
                    q11Var4 = q11Var3;
                }
                if (zF) {
                    l46Var.f0(289669584);
                    bx9 bx9Var2 = v51.a;
                    z9 = false;
                    gh6Var = gh6VarW0;
                    u51 u51VarA2 = v51.a(y72.j, ((e8b) l46Var.k(pr4Var)).q, 0L, 0L, l46Var, 12);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                    u51Var4 = u51VarA2;
                } else {
                    l46Var2 = l46Var;
                    gh6Var = gh6VarW0;
                    z9 = z8;
                    l46Var2.f0(289673006);
                    l46Var2.r(z9);
                    u51Var4 = u51Var3;
                }
                if (zF) {
                    l46Var2.f0(289674639);
                    x4d x4dVar7 = eze.a(l46Var2).a.a;
                    l46Var2.r(z9);
                    x4dVar5 = x4dVar7;
                } else {
                    l46Var2.f0(289675053);
                    l46Var2.r(z9);
                    x4dVar5 = x4dVar4;
                }
                if ((i7 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = z9;
                }
                zI = z10 | l46Var2.i(gh6Var) | ((i7 & 29360128) == 8388608);
                objR = l46Var2.R();
                if (zI) {
                    objR = new j28(z7, gh6Var, x16Var, 4);
                    l46Var2.p0(objR);
                } else {
                    objR = new j28(z7, gh6Var, x16Var, 4);
                    l46Var2.p0(objR);
                }
                int i15 = i7 << 3;
                boolean z12 = z3;
                l46 l46Var4 = l46Var2;
                j09 j09Var5 = j09Var2;
                cgg.a((x16) objR, j09Var5, z12, x4dVar5, u51Var4, null, q11Var4, xw9Var2, af1.b0(-691620072, new g20(27, n26Var), l46Var2), l46Var4, (i15 & 896) | (i15 & 112) | 805306368 | ((i7 << 6) & 29360128), 288);
                z6 = z7;
                u51Var2 = u51Var3;
                j09Var3 = j09Var5;
                z5 = z12;
                x4dVar3 = x4dVar4;
            } else {
                l46Var.Z();
                xw9Var2 = xw9Var;
                j09Var3 = j09Var2;
                z5 = z3;
                x4dVar3 = x4dVar2;
                u51Var2 = u51VarM;
                q11Var3 = q11Var2;
                z6 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new u77(j09Var3, z5, x4dVar3, u51Var2, q11Var3, xw9Var2, z6, x16Var, n26Var, i, i2);
            }
        }
        i3 |= 48;
        z3 = z;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                x4dVar2 = x4dVar;
                if (l46Var.g(x4dVar2)) {
                    i11 = 256;
                }
                i3 |= i11;
            } else {
                x4dVar2 = x4dVar;
            }
            i11 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            i3 |= i11;
        } else {
            x4dVar2 = x4dVar;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                u51VarM = u51Var;
                if (l46Var.g(u51VarM)) {
                    i10 = 2048;
                }
                i3 |= i10;
            } else {
                u51VarM = u51Var;
            }
            i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i3 |= i10;
        } else {
            u51VarM = u51Var;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                q11Var2 = q11Var;
                if (l46Var.g(q11Var2)) {
                    i5 = 16384;
                } else {
                    i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i5;
            }
            if ((196608 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !l46Var.g(xw9Var)) ? 65536 : 131072;
            }
            i6 = i3 | 1572864;
            if ((12582912 & i) == 0) {
                if (l46Var.i(x16Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i6 |= i9;
            }
            if ((100663296 & i) == 0) {
                if (l46Var.i(n26Var)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i6 |= i8;
            }
            if ((38347923 & i6) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i6 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 4) != 0) {
                        i6 &= -897;
                        x4dVar2 = eze.a(l46Var).a.a;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        u51VarM = m(l46Var);
                    }
                    if (i4 != 0) {
                        q11Var2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        xw9Var3 = v51.a;
                        i6 &= -458753;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    xw9Var2 = xw9Var3;
                    i7 = i6;
                    x4dVar4 = x4dVar2;
                    u51Var3 = u51VarM;
                    q11Var3 = q11Var2;
                    z7 = true;
                } else {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 4) != 0) {
                        i6 &= -897;
                        x4dVar2 = eze.a(l46Var).a.a;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        u51VarM = m(l46Var);
                    }
                    if (i4 != 0) {
                        q11Var2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        xw9Var3 = v51.a;
                        i6 &= -458753;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    xw9Var2 = xw9Var3;
                    i7 = i6;
                    x4dVar4 = x4dVar2;
                    u51Var3 = u51VarM;
                    q11Var3 = q11Var2;
                    z7 = true;
                }
                l46Var.s();
                pr4Var = l8b.a;
                zF = k8b.f((e8b) l46Var.k(pr4Var));
                gh6VarW0 = kj0.w0(l46Var);
                if (zF) {
                    l46Var.f0(289666073);
                    q11 q11VarB3 = x57.b(eze.a(l46Var).b.x(l46Var), 1.0f);
                    z8 = false;
                    l46Var.r(false);
                    q11Var4 = q11VarB3;
                } else {
                    z8 = false;
                    l46Var.f0(289667790);
                    l46Var.r(false);
                    q11Var4 = q11Var3;
                }
                if (zF) {
                    l46Var.f0(289669584);
                    bx9 bx9Var3 = v51.a;
                    z9 = false;
                    gh6Var = gh6VarW0;
                    u51 u51VarA3 = v51.a(y72.j, ((e8b) l46Var.k(pr4Var)).q, 0L, 0L, l46Var, 12);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                    u51Var4 = u51VarA3;
                } else {
                    l46Var2 = l46Var;
                    gh6Var = gh6VarW0;
                    z9 = z8;
                    l46Var2.f0(289673006);
                    l46Var2.r(z9);
                    u51Var4 = u51Var3;
                }
                if (zF) {
                    l46Var2.f0(289674639);
                    x4d x4dVar8 = eze.a(l46Var2).a.a;
                    l46Var2.r(z9);
                    x4dVar5 = x4dVar8;
                } else {
                    l46Var2.f0(289675053);
                    l46Var2.r(z9);
                    x4dVar5 = x4dVar4;
                }
                if ((i7 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = z9;
                }
                zI = z10 | l46Var2.i(gh6Var) | ((i7 & 29360128) == 8388608);
                objR = l46Var2.R();
                if (zI) {
                    objR = new j28(z7, gh6Var, x16Var, 4);
                    l46Var2.p0(objR);
                } else {
                    objR = new j28(z7, gh6Var, x16Var, 4);
                    l46Var2.p0(objR);
                }
                int i16 = i7 << 3;
                boolean z13 = z3;
                l46 l46Var5 = l46Var2;
                j09 j09Var6 = j09Var2;
                cgg.a((x16) objR, j09Var6, z13, x4dVar5, u51Var4, null, q11Var4, xw9Var2, af1.b0(-691620072, new g20(27, n26Var), l46Var2), l46Var5, (i16 & 896) | (i16 & 112) | 805306368 | ((i7 << 6) & 29360128), 288);
                z6 = z7;
                u51Var2 = u51Var3;
                j09Var3 = j09Var6;
                z5 = z13;
                x4dVar3 = x4dVar4;
            } else {
                l46Var.Z();
                xw9Var2 = xw9Var;
                j09Var3 = j09Var2;
                z5 = z3;
                x4dVar3 = x4dVar2;
                u51Var2 = u51VarM;
                q11Var3 = q11Var2;
                z6 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new u77(j09Var3, z5, x4dVar3, u51Var2, q11Var3, xw9Var2, z6, x16Var, n26Var, i, i2);
            }
        }
        i3 |= 24576;
        q11Var2 = q11Var;
        if ((196608 & i) != 0) {
            i3 |= ((i2 & 32) == 0 || !l46Var.g(xw9Var)) ? 65536 : 131072;
        }
        i6 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            if (l46Var.i(x16Var)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i6 |= i9;
        }
        if ((100663296 & i) == 0) {
            if (l46Var.i(n26Var)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i6 |= i8;
        }
        if ((38347923 & i6) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var.W(i6 & 1, z4)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i13 != 0) {
                    z3 = true;
                }
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                    x4dVar2 = eze.a(l46Var).a.a;
                }
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                    u51VarM = m(l46Var);
                }
                if (i4 != 0) {
                    q11Var2 = null;
                }
                if ((i2 & 32) != 0) {
                    xw9Var3 = v51.a;
                    i6 &= -458753;
                } else {
                    xw9Var3 = xw9Var;
                }
                xw9Var2 = xw9Var3;
                i7 = i6;
                x4dVar4 = x4dVar2;
                u51Var3 = u51VarM;
                q11Var3 = q11Var2;
                z7 = true;
            } else {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i13 != 0) {
                    z3 = true;
                }
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                    x4dVar2 = eze.a(l46Var).a.a;
                }
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                    u51VarM = m(l46Var);
                }
                if (i4 != 0) {
                    q11Var2 = null;
                }
                if ((i2 & 32) != 0) {
                    xw9Var3 = v51.a;
                    i6 &= -458753;
                } else {
                    xw9Var3 = xw9Var;
                }
                xw9Var2 = xw9Var3;
                i7 = i6;
                x4dVar4 = x4dVar2;
                u51Var3 = u51VarM;
                q11Var3 = q11Var2;
                z7 = true;
            }
            l46Var.s();
            pr4Var = l8b.a;
            zF = k8b.f((e8b) l46Var.k(pr4Var));
            gh6VarW0 = kj0.w0(l46Var);
            if (zF) {
                l46Var.f0(289666073);
                q11 q11VarB4 = x57.b(eze.a(l46Var).b.x(l46Var), 1.0f);
                z8 = false;
                l46Var.r(false);
                q11Var4 = q11VarB4;
            } else {
                z8 = false;
                l46Var.f0(289667790);
                l46Var.r(false);
                q11Var4 = q11Var3;
            }
            if (zF) {
                l46Var.f0(289669584);
                bx9 bx9Var4 = v51.a;
                z9 = false;
                gh6Var = gh6VarW0;
                u51 u51VarA4 = v51.a(y72.j, ((e8b) l46Var.k(pr4Var)).q, 0L, 0L, l46Var, 12);
                l46Var2 = l46Var;
                l46Var2.r(false);
                u51Var4 = u51VarA4;
            } else {
                l46Var2 = l46Var;
                gh6Var = gh6VarW0;
                z9 = z8;
                l46Var2.f0(289673006);
                l46Var2.r(z9);
                u51Var4 = u51Var3;
            }
            if (zF) {
                l46Var2.f0(289674639);
                x4d x4dVar9 = eze.a(l46Var2).a.a;
                l46Var2.r(z9);
                x4dVar5 = x4dVar9;
            } else {
                l46Var2.f0(289675053);
                l46Var2.r(z9);
                x4dVar5 = x4dVar4;
            }
            if ((i7 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = z9;
            }
            zI = z10 | l46Var2.i(gh6Var) | ((i7 & 29360128) == 8388608);
            objR = l46Var2.R();
            if (zI) {
                objR = new j28(z7, gh6Var, x16Var, 4);
                l46Var2.p0(objR);
            } else {
                objR = new j28(z7, gh6Var, x16Var, 4);
                l46Var2.p0(objR);
            }
            int i17 = i7 << 3;
            boolean z14 = z3;
            l46 l46Var6 = l46Var2;
            j09 j09Var7 = j09Var2;
            cgg.a((x16) objR, j09Var7, z14, x4dVar5, u51Var4, null, q11Var4, xw9Var2, af1.b0(-691620072, new g20(27, n26Var), l46Var2), l46Var6, (i17 & 896) | (i17 & 112) | 805306368 | ((i7 << 6) & 29360128), 288);
            z6 = z7;
            u51Var2 = u51Var3;
            j09Var3 = j09Var7;
            z5 = z14;
            x4dVar3 = x4dVar4;
        } else {
            l46Var.Z();
            xw9Var2 = xw9Var;
            j09Var3 = j09Var2;
            z5 = z3;
            x4dVar3 = x4dVar2;
            u51Var2 = u51VarM;
            q11Var3 = q11Var2;
            z6 = z2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new u77(j09Var3, z5, x4dVar3, u51Var2, q11Var3, xw9Var2, z6, x16Var, n26Var, i, i2);
        }
    }

    public static final u51 l(l46 l46Var) {
        bx9 bx9Var = v51.a;
        return v51.a(((e8b) l46Var.k(l8b.a)).m, eze.a(l46Var).b.y(l46Var), 0L, 0L, l46Var, 12);
    }

    public static final u51 m(l46 l46Var) {
        bx9 bx9Var = v51.a;
        long jA = eze.a(l46Var).b.A(l46Var);
        return v51.a(eze.a(l46Var).b.z(l46Var), jA, y72.b(eze.a(l46Var).b.z(l46Var), 0.38f), y72.b(eze.a(l46Var).b.A(l46Var), 0.38f), l46Var, 0);
    }

    public static final u51 n(l46 l46Var) {
        bx9 bx9Var = v51.a;
        pr4 pr4Var = l8b.a;
        return v51.a(((e8b) l46Var.k(pr4Var)).b, ((e8b) l46Var.k(pr4Var)).q, 0L, 0L, l46Var, 12);
    }
}
