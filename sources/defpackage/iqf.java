package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iqf {
    public static gx6 b;
    public final /* synthetic */ int a;

    public /* synthetic */ iqf(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x011b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0129  */
    /* JADX WARN: Code duplicated, block: B:82:0x0142  */
    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0164  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void a(final String str, j09 j09Var, long j, final mue mueVar, long j2, long j3, l46 l46Var, final int i, final int i2) {
        j09 j09Var2;
        int i3;
        int i4;
        long j4;
        int i5;
        long j5;
        int i6;
        boolean z;
        final long j6;
        final j09 j09Var3;
        final long j7;
        final long j8;
        ojb ojbVarV;
        j09 j09Var4;
        long j9;
        long jL;
        long jL2;
        Object objR;
        i8c i8cVar;
        long j10;
        i8c i8cVar2;
        e89 e89Var;
        Object objR2;
        e89 e89Var2;
        Object objR3;
        boolean z2;
        Object objR4;
        str.getClass();
        l46Var.h0(-89050279);
        int i7 = (l46Var.g(str) ? 4 : 2) | i;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 = i7 | 48;
            j09Var2 = j09Var;
        } else {
            j09Var2 = j09Var;
            i3 = i7 | (l46Var.g(j09Var2) ? 32 : 16);
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i4 = i3 | 384;
        } else {
            i4 = i3 | (l46Var.f(j) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        int i10 = i4 | (l46Var.g(mueVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i11 = i2 & 16;
        if (i11 == 0) {
            if ((i & 24576) == 0) {
                j4 = j2;
                i10 |= l46Var.f(j4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    j5 = j3;
                    if (l46Var.f(j5)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i10 |= i6;
                }
                if ((74899 & i10) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i10 & 1, z)) {
                    l46Var.b0();
                    if ((i & 1) != 0 || l46Var.C()) {
                        if (i8 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i9 != 0) {
                            j9 = y72.k;
                        } else {
                            j9 = j;
                        }
                        if (i11 != 0) {
                            jL = w6c.l(12);
                        } else {
                            jL = j4;
                        }
                        if (i5 != 0) {
                            jL2 = w6c.l(24);
                        } else {
                            jL2 = j5;
                        }
                    } else {
                        l46Var.Z();
                        j09Var4 = j09Var2;
                        jL = j4;
                        jL2 = j5;
                        j9 = j;
                    }
                    l46Var.s();
                    objR = l46Var.R();
                    i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        i8cVar2 = i8cVar;
                        j10 = jL;
                        objR = q1c.f(mue.a(mueVar, 0L, jL2, null, null, 0L, null, 0, 0L, null, null, 16777213));
                        l46Var.p0(objR);
                    } else {
                        j10 = jL;
                        i8cVar2 = i8cVar;
                    }
                    e89Var = (e89) objR;
                    objR2 = l46Var.R();
                    if (objR2 == i8cVar2) {
                        objR2 = q1c.f(Boolean.FALSE);
                        l46Var.p0(objR2);
                    }
                    e89Var2 = (e89) objR2;
                    mue mueVar2 = (mue) e89Var.getValue();
                    objR3 = l46Var.R();
                    if (objR3 == i8cVar2) {
                        objR3 = new w77(e89Var2, 15);
                        l46Var.p0(objR3);
                    }
                    j09 j09VarU = b21.u(j09Var4, (a26) objR3);
                    z2 = (57344 & i10) == 16384;
                    objR4 = l46Var.R();
                    if (z2 || objR4 == i8cVar2) {
                        objR4 = new zi3(j10, e89Var, e89Var2);
                        l46Var.p0(objR4);
                    }
                    long j11 = j9;
                    nte.b(str, j09VarU, j11, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, (a26) objR4, mueVar2, l46Var, i10 & 910, 27648, 40952);
                    j6 = j11;
                    j09Var3 = j09Var4;
                    j8 = jL2;
                    j7 = j10;
                } else {
                    l46Var.Z();
                    j6 = j;
                    j09Var3 = j09Var2;
                    j7 = j4;
                    j8 = j5;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: lte
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            iqf.a(str, j09Var3, j6, mueVar, j7, j8, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i10 |= 196608;
            j5 = j3;
            if ((74899 & i10) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i10 & 1, z)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i9 != 0) {
                        j9 = y72.k;
                    } else {
                        j9 = j;
                    }
                    if (i11 != 0) {
                        jL = w6c.l(12);
                    } else {
                        jL = j4;
                    }
                    if (i5 != 0) {
                        jL2 = w6c.l(24);
                    } else {
                        jL2 = j5;
                    }
                } else {
                    if (i8 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i9 != 0) {
                        j9 = y72.k;
                    } else {
                        j9 = j;
                    }
                    if (i11 != 0) {
                        jL = w6c.l(12);
                    } else {
                        jL = j4;
                    }
                    if (i5 != 0) {
                        jL2 = w6c.l(24);
                    } else {
                        jL2 = j5;
                    }
                }
                l46Var.s();
                objR = l46Var.R();
                i8cVar = sf2.a;
                if (objR == i8cVar) {
                    i8cVar2 = i8cVar;
                    j10 = jL;
                    objR = q1c.f(mue.a(mueVar, 0L, jL2, null, null, 0L, null, 0, 0L, null, null, 16777213));
                    l46Var.p0(objR);
                } else {
                    j10 = jL;
                    i8cVar2 = i8cVar;
                }
                e89Var = (e89) objR;
                objR2 = l46Var.R();
                if (objR2 == i8cVar2) {
                    objR2 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR2);
                }
                e89Var2 = (e89) objR2;
                mue mueVar3 = (mue) e89Var.getValue();
                objR3 = l46Var.R();
                if (objR3 == i8cVar2) {
                    objR3 = new w77(e89Var2, 15);
                    l46Var.p0(objR3);
                }
                j09 j09VarU2 = b21.u(j09Var4, (a26) objR3);
                if ((57344 & i10) == 16384) {
                }
                objR4 = l46Var.R();
                if (z2) {
                    objR4 = new zi3(j10, e89Var, e89Var2);
                    l46Var.p0(objR4);
                } else {
                    objR4 = new zi3(j10, e89Var, e89Var2);
                    l46Var.p0(objR4);
                }
                long j12 = j9;
                nte.b(str, j09VarU2, j12, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, (a26) objR4, mueVar3, l46Var, i10 & 910, 27648, 40952);
                j6 = j12;
                j09Var3 = j09Var4;
                j8 = jL2;
                j7 = j10;
            } else {
                l46Var.Z();
                j6 = j;
                j09Var3 = j09Var2;
                j7 = j4;
                j8 = j5;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: lte
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        iqf.a(str, j09Var3, j6, mueVar, j7, j8, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i10 |= 24576;
        j4 = j2;
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                j5 = j3;
                if (l46Var.f(j5)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i10 |= i6;
            }
            if ((74899 & i10) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i10 & 1, z)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i9 != 0) {
                        j9 = y72.k;
                    } else {
                        j9 = j;
                    }
                    if (i11 != 0) {
                        jL = w6c.l(12);
                    } else {
                        jL = j4;
                    }
                    if (i5 != 0) {
                        jL2 = w6c.l(24);
                    } else {
                        jL2 = j5;
                    }
                } else {
                    if (i8 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i9 != 0) {
                        j9 = y72.k;
                    } else {
                        j9 = j;
                    }
                    if (i11 != 0) {
                        jL = w6c.l(12);
                    } else {
                        jL = j4;
                    }
                    if (i5 != 0) {
                        jL2 = w6c.l(24);
                    } else {
                        jL2 = j5;
                    }
                }
                l46Var.s();
                objR = l46Var.R();
                i8cVar = sf2.a;
                if (objR == i8cVar) {
                    i8cVar2 = i8cVar;
                    j10 = jL;
                    objR = q1c.f(mue.a(mueVar, 0L, jL2, null, null, 0L, null, 0, 0L, null, null, 16777213));
                    l46Var.p0(objR);
                } else {
                    j10 = jL;
                    i8cVar2 = i8cVar;
                }
                e89Var = (e89) objR;
                objR2 = l46Var.R();
                if (objR2 == i8cVar2) {
                    objR2 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR2);
                }
                e89Var2 = (e89) objR2;
                mue mueVar4 = (mue) e89Var.getValue();
                objR3 = l46Var.R();
                if (objR3 == i8cVar2) {
                    objR3 = new w77(e89Var2, 15);
                    l46Var.p0(objR3);
                }
                j09 j09VarU3 = b21.u(j09Var4, (a26) objR3);
                if ((57344 & i10) == 16384) {
                }
                objR4 = l46Var.R();
                if (z2) {
                    objR4 = new zi3(j10, e89Var, e89Var2);
                    l46Var.p0(objR4);
                } else {
                    objR4 = new zi3(j10, e89Var, e89Var2);
                    l46Var.p0(objR4);
                }
                long j13 = j9;
                nte.b(str, j09VarU3, j13, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, (a26) objR4, mueVar4, l46Var, i10 & 910, 27648, 40952);
                j6 = j13;
                j09Var3 = j09Var4;
                j8 = jL2;
                j7 = j10;
            } else {
                l46Var.Z();
                j6 = j;
                j09Var3 = j09Var2;
                j7 = j4;
                j8 = j5;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: lte
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        iqf.a(str, j09Var3, j6, mueVar, j7, j8, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i10 |= 196608;
        j5 = j3;
        if ((74899 & i10) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i10 & 1, z)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i9 != 0) {
                    j9 = y72.k;
                } else {
                    j9 = j;
                }
                if (i11 != 0) {
                    jL = w6c.l(12);
                } else {
                    jL = j4;
                }
                if (i5 != 0) {
                    jL2 = w6c.l(24);
                } else {
                    jL2 = j5;
                }
            } else {
                if (i8 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i9 != 0) {
                    j9 = y72.k;
                } else {
                    j9 = j;
                }
                if (i11 != 0) {
                    jL = w6c.l(12);
                } else {
                    jL = j4;
                }
                if (i5 != 0) {
                    jL2 = w6c.l(24);
                } else {
                    jL2 = j5;
                }
            }
            l46Var.s();
            objR = l46Var.R();
            i8cVar = sf2.a;
            if (objR == i8cVar) {
                i8cVar2 = i8cVar;
                j10 = jL;
                objR = q1c.f(mue.a(mueVar, 0L, jL2, null, null, 0L, null, 0, 0L, null, null, 16777213));
                l46Var.p0(objR);
            } else {
                j10 = jL;
                i8cVar2 = i8cVar;
            }
            e89Var = (e89) objR;
            objR2 = l46Var.R();
            if (objR2 == i8cVar2) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89Var2 = (e89) objR2;
            mue mueVar5 = (mue) e89Var.getValue();
            objR3 = l46Var.R();
            if (objR3 == i8cVar2) {
                objR3 = new w77(e89Var2, 15);
                l46Var.p0(objR3);
            }
            j09 j09VarU4 = b21.u(j09Var4, (a26) objR3);
            if ((57344 & i10) == 16384) {
            }
            objR4 = l46Var.R();
            if (z2) {
                objR4 = new zi3(j10, e89Var, e89Var2);
                l46Var.p0(objR4);
            } else {
                objR4 = new zi3(j10, e89Var, e89Var2);
                l46Var.p0(objR4);
            }
            long j14 = j9;
            nte.b(str, j09VarU4, j14, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, (a26) objR4, mueVar5, l46Var, i10 & 910, 27648, 40952);
            j6 = j14;
            j09Var3 = j09Var4;
            j8 = jL2;
            j7 = j10;
        } else {
            l46Var.Z();
            j6 = j;
            j09Var3 = j09Var2;
            j7 = j4;
            j8 = j5;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: lte
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iqf.a(str, j09Var3, j6, mueVar, j7, j8, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:71:0x010a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0121  */
    /* JADX WARN: Code duplicated, block: B:77:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x012f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0177  */
    /* JADX WARN: Code duplicated, block: B:85:0x0183  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void b(final k00 k00Var, j09 j09Var, long j, final mue mueVar, final long j2, final long j3, final int i, Float f, l46 l46Var, final int i2, final int i3) {
        j09 j09Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        final Float f2;
        int i10;
        boolean z;
        final long j4;
        final j09 j09Var3;
        ojb ojbVarV;
        j09 j09Var4;
        long j5;
        Float f3;
        Object objR;
        i8c i8cVar;
        e89 e89Var;
        Object objR2;
        e89 e89Var2;
        Object objR3;
        boolean z2;
        Object objR4;
        Float f4;
        l46Var.h0(896795946);
        int i11 = i2 | (l46Var.g(k00Var) ? 4 : 2);
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                j09Var2 = j09Var;
                i11 |= l46Var.g(j09Var2) ? 32 : 16;
            }
            i4 = i3 & 4;
            if (i4 != 0) {
                i6 = i11 | 384;
            } else {
                if (l46Var.f(j)) {
                    i5 = 256;
                } else {
                    i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i6 = i11 | i5;
            }
            if (l46Var.g(mueVar)) {
                i7 = 2048;
            } else {
                i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i8 = i6 | i7;
            i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i9 != 0) {
                if ((i2 & 12582912) == 0) {
                    f2 = f;
                    if (l46Var.g(f2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i8 |= i10;
                }
                if ((4793491 & i8) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i8 & 1, z)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0 || l46Var.C()) {
                        if (i12 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i4 != 0) {
                            j5 = y72.k;
                        } else {
                            j5 = j;
                        }
                        if (i9 != 0) {
                            f3 = null;
                        } else {
                            f3 = f2;
                        }
                    } else {
                        l46Var.Z();
                        j09Var4 = j09Var2;
                        f3 = f2;
                        j5 = j;
                    }
                    l46Var.s();
                    objR = l46Var.R();
                    i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = q1c.f(mue.a(mueVar, 0L, j3, null, null, 0L, null, 0, 0L, null, null, 16777213));
                        l46Var.p0(objR);
                    }
                    e89Var = (e89) objR;
                    objR2 = l46Var.R();
                    if (objR2 == i8cVar) {
                        objR2 = q1c.f(Boolean.FALSE);
                        l46Var.p0(objR2);
                    }
                    e89Var2 = (e89) objR2;
                    mue mueVar2 = (mue) e89Var.getValue();
                    objR3 = l46Var.R();
                    if (objR3 == i8cVar) {
                        objR3 = new w77(e89Var2, 16);
                        l46Var.p0(objR3);
                    }
                    j09 j09VarU = b21.u(j09Var4, (a26) objR3);
                    z2 = (29360128 & i8) == 8388608;
                    objR4 = l46Var.R();
                    if (!z2 || objR4 == i8cVar) {
                        Float f5 = f3;
                        r01 r01Var = new r01(j2, f5, e89Var, e89Var2, 3);
                        f4 = f5;
                        l46Var.p0(r01Var);
                        objR4 = r01Var;
                    } else {
                        f4 = f3;
                    }
                    long j6 = j5;
                    nte.c(k00Var, j09VarU, j6, 0L, null, null, 0L, null, 0L, 2, true, i, 0, null, (a26) objR4, mueVar2, l46Var, i8 & 910, 28032, 102392);
                    j4 = j6;
                    f2 = f4;
                    j09Var3 = j09Var4;
                } else {
                    l46Var.Z();
                    j4 = j;
                    j09Var3 = j09Var2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: mte
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i2 | 1);
                            iqf.b(k00Var, j09Var3, j4, mueVar, j2, j3, i, f2, (l46) obj, iP, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i8 |= 12582912;
            f2 = f;
            if ((4793491 & i8) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i8 & 1, z)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i4 != 0) {
                        j5 = y72.k;
                    } else {
                        j5 = j;
                    }
                    if (i9 != 0) {
                        f3 = null;
                    } else {
                        f3 = f2;
                    }
                } else {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i4 != 0) {
                        j5 = y72.k;
                    } else {
                        j5 = j;
                    }
                    if (i9 != 0) {
                        f3 = null;
                    } else {
                        f3 = f2;
                    }
                }
                l46Var.s();
                objR = l46Var.R();
                i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = q1c.f(mue.a(mueVar, 0L, j3, null, null, 0L, null, 0, 0L, null, null, 16777213));
                    l46Var.p0(objR);
                }
                e89Var = (e89) objR;
                objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR2);
                }
                e89Var2 = (e89) objR2;
                mue mueVar3 = (mue) e89Var.getValue();
                objR3 = l46Var.R();
                if (objR3 == i8cVar) {
                    objR3 = new w77(e89Var2, 16);
                    l46Var.p0(objR3);
                }
                j09 j09VarU2 = b21.u(j09Var4, (a26) objR3);
                if ((29360128 & i8) == 8388608) {
                }
                objR4 = l46Var.R();
                if (z2) {
                    Float f6 = f3;
                    r01 r01Var2 = new r01(j2, f6, e89Var, e89Var2, 3);
                    f4 = f6;
                    l46Var.p0(r01Var2);
                    objR4 = r01Var2;
                } else {
                    Float f7 = f3;
                    r01 r01Var3 = new r01(j2, f7, e89Var, e89Var2, 3);
                    f4 = f7;
                    l46Var.p0(r01Var3);
                    objR4 = r01Var3;
                }
                long j7 = j5;
                nte.c(k00Var, j09VarU2, j7, 0L, null, null, 0L, null, 0L, 2, true, i, 0, null, (a26) objR4, mueVar3, l46Var, i8 & 910, 28032, 102392);
                j4 = j7;
                f2 = f4;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                j4 = j;
                j09Var3 = j09Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: mte
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i2 | 1);
                        iqf.b(k00Var, j09Var3, j4, mueVar, j2, j3, i, f2, (l46) obj, iP, i3);
                        return wef.a;
                    }
                };
            }
        }
        i11 |= 48;
        j09Var2 = j09Var;
        i4 = i3 & 4;
        if (i4 != 0) {
            i6 = i11 | 384;
        } else {
            if (l46Var.f(j)) {
                i5 = 256;
            } else {
                i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i6 = i11 | i5;
        }
        if (l46Var.g(mueVar)) {
            i7 = 2048;
        } else {
            i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        i8 = i6 | i7;
        i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i9 != 0) {
            if ((i2 & 12582912) == 0) {
                f2 = f;
                if (l46Var.g(f2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i8 |= i10;
            }
            if ((4793491 & i8) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i8 & 1, z)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i4 != 0) {
                        j5 = y72.k;
                    } else {
                        j5 = j;
                    }
                    if (i9 != 0) {
                        f3 = null;
                    } else {
                        f3 = f2;
                    }
                } else {
                    if (i12 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i4 != 0) {
                        j5 = y72.k;
                    } else {
                        j5 = j;
                    }
                    if (i9 != 0) {
                        f3 = null;
                    } else {
                        f3 = f2;
                    }
                }
                l46Var.s();
                objR = l46Var.R();
                i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = q1c.f(mue.a(mueVar, 0L, j3, null, null, 0L, null, 0, 0L, null, null, 16777213));
                    l46Var.p0(objR);
                }
                e89Var = (e89) objR;
                objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR2);
                }
                e89Var2 = (e89) objR2;
                mue mueVar4 = (mue) e89Var.getValue();
                objR3 = l46Var.R();
                if (objR3 == i8cVar) {
                    objR3 = new w77(e89Var2, 16);
                    l46Var.p0(objR3);
                }
                j09 j09VarU3 = b21.u(j09Var4, (a26) objR3);
                if ((29360128 & i8) == 8388608) {
                }
                objR4 = l46Var.R();
                if (z2) {
                    Float f8 = f3;
                    r01 r01Var4 = new r01(j2, f8, e89Var, e89Var2, 3);
                    f4 = f8;
                    l46Var.p0(r01Var4);
                    objR4 = r01Var4;
                } else {
                    Float f9 = f3;
                    r01 r01Var5 = new r01(j2, f9, e89Var, e89Var2, 3);
                    f4 = f9;
                    l46Var.p0(r01Var5);
                    objR4 = r01Var5;
                }
                long j8 = j5;
                nte.c(k00Var, j09VarU3, j8, 0L, null, null, 0L, null, 0L, 2, true, i, 0, null, (a26) objR4, mueVar4, l46Var, i8 & 910, 28032, 102392);
                j4 = j8;
                f2 = f4;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                j4 = j;
                j09Var3 = j09Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: mte
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i2 | 1);
                        iqf.b(k00Var, j09Var3, j4, mueVar, j2, j3, i, f2, (l46) obj, iP, i3);
                        return wef.a;
                    }
                };
            }
        }
        i8 |= 12582912;
        f2 = f;
        if ((4793491 & i8) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i8 & 1, z)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i4 != 0) {
                    j5 = y72.k;
                } else {
                    j5 = j;
                }
                if (i9 != 0) {
                    f3 = null;
                } else {
                    f3 = f2;
                }
            } else {
                if (i12 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i4 != 0) {
                    j5 = y72.k;
                } else {
                    j5 = j;
                }
                if (i9 != 0) {
                    f3 = null;
                } else {
                    f3 = f2;
                }
            }
            l46Var.s();
            objR = l46Var.R();
            i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(mue.a(mueVar, 0L, j3, null, null, 0L, null, 0, 0L, null, null, 16777213));
                l46Var.p0(objR);
            }
            e89Var = (e89) objR;
            objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89Var2 = (e89) objR2;
            mue mueVar5 = (mue) e89Var.getValue();
            objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new w77(e89Var2, 16);
                l46Var.p0(objR3);
            }
            j09 j09VarU4 = b21.u(j09Var4, (a26) objR3);
            if ((29360128 & i8) == 8388608) {
            }
            objR4 = l46Var.R();
            if (z2) {
                Float f10 = f3;
                r01 r01Var6 = new r01(j2, f10, e89Var, e89Var2, 3);
                f4 = f10;
                l46Var.p0(r01Var6);
                objR4 = r01Var6;
            } else {
                Float f11 = f3;
                r01 r01Var7 = new r01(j2, f11, e89Var, e89Var2, 3);
                f4 = f11;
                l46Var.p0(r01Var7);
                objR4 = r01Var7;
            }
            long j9 = j5;
            nte.c(k00Var, j09VarU4, j9, 0L, null, null, 0L, null, 0L, 2, true, i, 0, null, (a26) objR4, mueVar5, l46Var, i8 & 910, 28032, 102392);
            j4 = j9;
            f2 = f4;
            j09Var3 = j09Var4;
        } else {
            l46Var.Z();
            j4 = j;
            j09Var3 = j09Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: mte
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i2 | 1);
                    iqf.b(k00Var, j09Var3, j4, mueVar, j2, j3, i, f2, (l46) obj, iP, i3);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r17v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v20 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v20 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v21 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v21 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v33 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r37v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r37v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r37v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r37v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v41 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v41 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v42 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v42 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v45 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v30 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v30 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v31 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v41 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v41 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v40 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v40 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v41 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v41 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v41 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v41 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v44 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v44 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v30 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void c(defpackage.sdd r78, java.util.List r79, java.lang.Integer r80, defpackage.a26 r81, defpackage.ft1 r82, defpackage.j09 r83, java.util.List r84, float r85, float r86, float r87, float r88, defpackage.l26 r89, defpackage.l46 r90, int r91) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqf.c(sdd, java.util.List, java.lang.Integer, a26, ft1, j09, java.util.List, float, float, float, float, l26, l46, int):void");
    }

    public static t8e d() {
        return new t8e(null);
    }

    public static final void e(x16 x16Var, l46 l46Var, int i) {
        l46Var.h0(1936267914);
        int i2 = i | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            FillElement fillElement = b.c;
            fy9 fy9VarA = od4.A(R.drawable.bg_welcome_upgrade, 0, l46Var);
            lx0 lx0Var = ndb.w;
            feg.j(fy9VarA, null, fillElement, lx0Var, an2.a, 0.0f, null, l46Var, 28088, 96);
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            d31 d31Var = d31.a;
            feg.j(od4.A(R.drawable.img_welcome, 0, l46Var), null, d31Var.a(j09VarC, lx0Var), null, null, 0.0f, null, l46Var, 56, 120);
            vtb.j(i2 & 112, x16Var, l46Var, d31Var.a(g09Var, lx0Var));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fkc(i, 12, x16Var);
        }
    }

    public static final void f(x16 x16Var, l46 l46Var, int i) {
        x16Var.getClass();
        l46Var.h0(152596473);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            lmg.J(b.c, af1.b0(-239852624, new fkc(10, x16Var), l46Var), l46Var, 54);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fkc(i, 11, x16Var);
        }
    }

    public static final float g(long j, long j2) {
        long jF = hl9.f(j2, j);
        return (float) Math.toDegrees((float) Math.atan2(Float.intBitsToFloat((int) (4294967295L & jF)), Float.intBitsToFloat((int) (jF >> 32))));
    }

    public static j09 h(j09 j09Var, long j, float f, float f2, vtb vtbVar, int i) {
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        j09Var.getClass();
        return b21.s(j09Var, new ho6(f2, f, j, vtbVar));
    }

    public static ird j() {
        return (ird) qrd.b.get();
    }

    public static final gx6 k() {
        gx6 gx6Var = b;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Filled.Replay", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = msf.a;
        dtd dtdVar = new dtd(y72.b);
        s71 s71Var = new s71(1);
        s71Var.p(12.0f, 5.0f);
        s71Var.s(1.0f);
        s71Var.n(7.0f, 6.0f);
        s71Var.o(5.0f, 5.0f);
        s71Var.s(7.0f);
        s71Var.j(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        s71Var.r(-2.69f, 6.0f, -6.0f, 6.0f);
        s71Var.r(-6.0f, -2.69f, -6.0f, -6.0f);
        s71Var.l(4.0f);
        s71Var.j(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        s71Var.r(8.0f, -3.58f, 8.0f, -8.0f);
        s71Var.r(-3.58f, -8.0f, -8.0f, -8.0f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        b = gx6VarB;
        return gx6VarB;
    }

    public static ird l(ird irdVar) {
        if (irdVar instanceof t3f) {
            t3f t3fVar = (t3f) irdVar;
            if (t3fVar.t == o8c.k()) {
                t3fVar.r = null;
                return irdVar;
            }
        }
        if (irdVar instanceof u3f) {
            u3f u3fVar = (u3f) irdVar;
            if (u3fVar.i == o8c.k()) {
                u3fVar.h = null;
                return irdVar;
            }
        }
        ird irdVarE = qrd.e(irdVar, null, false);
        irdVarE.j();
        return irdVarE;
    }

    public static Object m(kx3 kx3Var, x16 x16Var) {
        ird t3fVar;
        ird irdVar = (ird) qrd.b.get();
        if (irdVar instanceof t3f) {
            t3f t3fVar2 = (t3f) irdVar;
            if (t3fVar2.t == o8c.k()) {
                a26 a26Var = t3fVar2.r;
                a26 a26Var2 = t3fVar2.s;
                try {
                    ((t3f) irdVar).r = qrd.i(kx3Var, a26Var, true);
                    ((t3f) irdVar).s = a26Var2;
                    return x16Var.invoke();
                } finally {
                    t3fVar2.r = a26Var;
                    t3fVar2.s = a26Var2;
                }
            }
        }
        if (irdVar == null || (irdVar instanceof c89)) {
            t3fVar = new t3f(irdVar instanceof c89 ? (c89) irdVar : null, kx3Var, null, true, false);
        } else {
            t3fVar = irdVar.u(kx3Var);
        }
        try {
            ird irdVarJ = t3fVar.j();
            try {
                Object objInvoke = x16Var.invoke();
                ird.q(irdVarJ);
                t3fVar.c();
                return objInvoke;
            } catch (Throwable th) {
                ird.q(irdVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            t3fVar.c();
            throw th2;
        }
    }

    public static long o(d0a d0aVar, int i, int i2) {
        d0aVar.M(i);
        if (d0aVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iM = d0aVar.m();
        if ((8388608 & iM) != 0 || ((2096896 & iM) >> 8) != i2 || (iM & 32) == 0 || d0aVar.z() < 7 || d0aVar.a() < 7 || (d0aVar.z() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        d0aVar.k(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static void p(ird irdVar, ird irdVar2, a26 a26Var) {
        if (irdVar != irdVar2) {
            irdVar2.getClass();
            ird.q(irdVar);
            irdVar2.c();
        } else if (irdVar instanceof t3f) {
            ((t3f) irdVar).r = a26Var;
        } else if (irdVar instanceof u3f) {
            ((u3f) irdVar).h = a26Var;
        } else {
            pd4.i(irdVar, "Non-transparent snapshot was reused: ");
        }
    }

    public static int q(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            iqf iqfVar = mqf.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return mqf.b(i, wff.e(bArr, j));
        }
        if (i2 == 2) {
            return mqf.c(i, wff.e(bArr, j), wff.e(bArr, j + 1));
        }
        throw new AssertionError();
    }

    public static int r(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static boolean s(byte b2) {
        return b2 > -65;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    public final int i(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        int i5;
        char cCharAt3;
        char c = 2048;
        char c2 = 55296;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new kqf(i7, length);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i3);
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new kqf(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    }
                    i7++;
                }
                return i3;
            default:
                long j = i;
                long j2 = ((long) i2) + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i20 = 0;
                while (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                    wff.l(bArr, j, (byte) cCharAt3);
                    i20++;
                    j++;
                }
                if (i20 != length2) {
                    while (i20 < length2) {
                        char cCharAt5 = str.charAt(i20);
                        if (cCharAt5 < 128 && j < j2) {
                            wff.l(bArr, j, (byte) cCharAt5);
                            j++;
                        } else if (cCharAt5 >= c || j > j2 - 2) {
                            int i21 = i20;
                            if ((cCharAt5 >= c2 && 57343 >= cCharAt5) || j > j2 - 3) {
                                if (j > j2 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new kqf(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                }
                                i20 = i21 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        wff.l(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
                                        wff.l(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                        long j3 = j + 3;
                                        wff.l(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                        j += 4;
                                        wff.l(bArr, j3, (byte) ((codePoint2 & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                    }
                                } else {
                                    i20 = i21;
                                }
                                throw new kqf(i20 - 1, length2);
                            }
                            wff.l(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j4 = j + 2;
                            wff.l(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                            j += 3;
                            wff.l(bArr, j4, (byte) ((cCharAt5 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                            i20 = i21;
                        } else {
                            long j5 = j + 1;
                            wff.l(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
                            j += 2;
                            wff.l(bArr, j5, (byte) ((cCharAt5 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                            i20 = i20;
                        }
                        i20++;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb  */
    public final int n(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4;
        long j2;
        long j3;
        byte bE;
        long j4;
        byte bE2;
        long j5;
        int i5 = i;
        switch (this.a) {
            case 0:
                break;
            default:
                if ((i5 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)));
                }
                long j6 = i5;
                int i6 = (int) (((long) i2) - j6);
                if (i6 < 16) {
                    j = 1;
                    i3 = 0;
                } else {
                    int i7 = 8 - (((int) j6) & 7);
                    long j7 = j6;
                    j = 1;
                    i3 = 0;
                    while (true) {
                        if (i3 < i7) {
                            long j8 = j7 + 1;
                            if (wff.e(bArr, j7) >= 0) {
                                i3++;
                                j7 = j8;
                            }
                        } else {
                            while (true) {
                                int i8 = i3 + 8;
                                if (i8 <= i6 && (wff.i(wff.f + j7, bArr) & (-9187201950435737472L)) == 0) {
                                    j7 += 8;
                                    i3 = i8;
                                }
                            }
                            while (true) {
                                if (i3 < i6) {
                                    long j9 = j7 + 1;
                                    if (wff.e(bArr, j7) >= 0) {
                                        i3++;
                                        j7 = j9;
                                    }
                                } else {
                                    i3 = i6;
                                }
                            }
                        }
                    }
                }
                int i9 = i6 - i3;
                long j10 = j6 + ((long) i3);
                while (true) {
                    byte b2 = 0;
                    while (i9 > 0) {
                        long j11 = j10 + j;
                        byte bE3 = wff.e(bArr, j10);
                        if (bE3 >= 0) {
                            i9--;
                            b2 = bE3;
                            j10 = j11;
                        } else {
                            b2 = bE3;
                            j10 = j11;
                            if (i9 == 0) {
                                return 0;
                            }
                            i4 = i9 - 1;
                            if (b2 < -32) {
                                if (i4 == 0) {
                                    return b2;
                                }
                                i9 -= 2;
                                if (b2 >= -62) {
                                    return -1;
                                }
                                j2 = j10 + j;
                                if (wff.e(bArr, j10) > -65) {
                                    return -1;
                                }
                                j10 = j2;
                            } else if (b2 < -16) {
                                if (i4 < 2) {
                                    return q(j10, bArr, b2, i4);
                                }
                                i9 -= 3;
                                j3 = j10 + j;
                                bE = wff.e(bArr, j10);
                                if (bE <= -65) {
                                    return -1;
                                }
                                if (b2 != -32 && bE < -96) {
                                    return -1;
                                }
                                if (b2 != -19 && bE >= -96) {
                                    return -1;
                                }
                                j10 += 2;
                                if (wff.e(bArr, j3) > -65) {
                                    return -1;
                                }
                            } else {
                                if (i4 < 3) {
                                    return q(j10, bArr, b2, i4);
                                }
                                i9 -= 4;
                                j4 = j10 + j;
                                bE2 = wff.e(bArr, j10);
                                if (bE2 <= -65) {
                                    return -1;
                                }
                                if ((((bE2 + 112) + (b2 << 28)) >> 30) == 0) {
                                    return -1;
                                }
                                j5 = j10 + 2;
                                if (wff.e(bArr, j4) <= -65) {
                                    return -1;
                                }
                                j10 += 3;
                                if (wff.e(bArr, j5) > -65) {
                                    return -1;
                                }
                            }
                        }
                    }
                    if (i9 == 0) {
                        return 0;
                    }
                    i4 = i9 - 1;
                    if (b2 < -32) {
                        if (i4 == 0) {
                            return b2;
                        }
                        i9 -= 2;
                        if (b2 >= -62) {
                            return -1;
                        }
                        j2 = j10 + j;
                        if (wff.e(bArr, j10) > -65) {
                            return -1;
                        }
                        j10 = j2;
                    } else if (b2 < -16) {
                        if (i4 < 2) {
                            return q(j10, bArr, b2, i4);
                        }
                        i9 -= 3;
                        j3 = j10 + j;
                        bE = wff.e(bArr, j10);
                        if (bE <= -65) {
                            return -1;
                        }
                        if (b2 != -32) {
                        }
                        if (b2 != -19) {
                        }
                        j10 += 2;
                        if (wff.e(bArr, j3) > -65) {
                            return -1;
                        }
                    } else {
                        if (i4 < 3) {
                            return q(j10, bArr, b2, i4);
                        }
                        i9 -= 4;
                        j4 = j10 + j;
                        bE2 = wff.e(bArr, j10);
                        if (bE2 <= -65) {
                            return -1;
                        }
                        if ((((bE2 + 112) + (b2 << 28)) >> 30) == 0) {
                            return -1;
                        }
                        j5 = j10 + 2;
                        if (wff.e(bArr, j4) <= -65) {
                            return -1;
                        }
                        j10 += 3;
                        if (wff.e(bArr, j5) > -65) {
                            return -1;
                        }
                    }
                }
                break;
        }
        while (i5 < i2 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 < i2) {
            while (i5 < i2) {
                int i10 = i5 + 1;
                byte b3 = bArr[i5];
                if (b3 >= 0) {
                    i5 = i10;
                } else if (b3 < -32) {
                    if (i10 >= i2) {
                        return b3;
                    }
                    if (b3 < -62) {
                        return -1;
                    }
                    i5 += 2;
                    if (bArr[i10] > -65) {
                        return -1;
                    }
                } else if (b3 < -16) {
                    if (i10 >= i2 - 1) {
                        return mqf.d(bArr, i10, i2);
                    }
                    int i11 = i5 + 2;
                    byte b4 = bArr[i10];
                    if (b4 > -65) {
                        return -1;
                    }
                    if (b3 == -32 && b4 < -96) {
                        return -1;
                    }
                    if (b3 == -19 && b4 >= -96) {
                        return -1;
                    }
                    i5 += 3;
                    if (bArr[i11] > -65) {
                        return -1;
                    }
                } else {
                    if (i10 >= i2 - 2) {
                        return mqf.d(bArr, i10, i2);
                    }
                    int i12 = i5 + 2;
                    byte b5 = bArr[i10];
                    if (b5 > -65) {
                        return -1;
                    }
                    if ((((b5 + 112) + (b3 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i13 = i5 + 3;
                    if (bArr[i12] > -65) {
                        return -1;
                    }
                    i5 += 4;
                    if (bArr[i13] > -65) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}
