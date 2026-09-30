package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oca {
    public static final List a = t72.H("+86");

    /* JADX WARN: Code duplicated, block: B:101:0x0144  */
    /* JADX WARN: Code duplicated, block: B:104:0x0155  */
    /* JADX WARN: Code duplicated, block: B:107:0x0193  */
    /* JADX WARN: Code duplicated, block: B:108:0x0197  */
    /* JADX WARN: Code duplicated, block: B:111:0x0218  */
    /* JADX WARN: Code duplicated, block: B:112:0x021c  */
    /* JADX WARN: Code duplicated, block: B:115:0x023b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0245  */
    /* JADX WARN: Code duplicated, block: B:119:0x035a  */
    /* JADX WARN: Code duplicated, block: B:120:0x035c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0366  */
    /* JADX WARN: Code duplicated, block: B:125:0x036c  */
    /* JADX WARN: Code duplicated, block: B:130:0x037a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0382  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:139:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e  */
    public static final void a(j09 j09Var, List list, String str, use useVar, String str2, boolean z, a26 a26Var, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        List list2;
        String str3;
        int i4;
        use useVarO;
        int i5;
        int i6;
        boolean z2;
        String str4;
        List list3;
        String str5;
        use useVar2;
        boolean z3;
        ojb ojbVarV;
        int i7;
        g09 g09Var;
        List list4;
        String strQ;
        List list5;
        String str6;
        use useVar3;
        Object objR;
        i8c i8cVar;
        Object objR2;
        e89 e89Var;
        Object objR3;
        int i8;
        boolean z4;
        ov7 ov7Var;
        use useVar4;
        Object objR4;
        char c;
        boolean z5;
        boolean z6;
        Object objR5;
        int i9;
        a26 a26Var2 = a26Var;
        a26Var2.getClass();
        l46Var.h0(2106839832);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i3 = i | (l46Var.g(j09Var2) ? 4 : 2);
        } else {
            j09Var2 = j09Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                list2 = list;
                int i11 = l46Var.g(list2) ? 32 : 16;
                i3 |= i11;
            } else {
                list2 = list;
            }
            i3 |= i11;
        } else {
            list2 = list;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i4 = i3 | 384;
            str3 = str;
        } else {
            str3 = str;
            i4 = i3 | (l46Var.g(str3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        if ((i2 & 8) == 0) {
            useVarO = useVar;
            if (l46Var.g(useVarO)) {
                i5 = 2048;
            }
            i6 = i4 | i5 | (((i2 & 16) == 0 || !l46Var.g(str2)) ? UserMetadata.MAX_INTERNAL_KEY_SIZE : 16384);
            if ((i & 1572864) == 0) {
                if (l46Var.i(a26Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i6 |= i9;
            }
            if ((533651 & i6) != 533650) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i6 & 1, z2)) {
                l46Var.b0();
                i7 = i & 1;
                g09Var = g09.a;
                if (i7 != 0 || l46Var.C()) {
                    if (i10 != 0) {
                        j09Var2 = g09Var;
                    }
                    if ((i2 & 2) != 0) {
                        i6 &= -113;
                        list4 = a;
                    } else {
                        list4 = list2;
                    }
                    if (i12 != 0) {
                        str3 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        useVarO = n3d.o(null, l46Var, 3);
                    }
                    if ((i2 & 16) != 0) {
                        strQ = afc.q(R.string.auth_using_phone, l46Var);
                        i6 &= -57345;
                    } else {
                        strQ = str2;
                    }
                    if ((i2 & 32) != 0) {
                        list5 = list4;
                        str6 = strQ;
                        useVar3 = useVarO;
                        z = false;
                    } else {
                        list5 = list4;
                        str6 = strQ;
                    }
                    j09 j09Var3 = j09Var2;
                    l46Var.s();
                    objR = l46Var.R();
                    i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = zrd.b(new zr1(useVar3, 6));
                        l46Var.p0(objR);
                    }
                    h0e h0eVar = (h0e) objR;
                    objR2 = l46Var.R();
                    if (objR2 == i8cVar) {
                        objR2 = q1c.f(Boolean.FALSE);
                        l46Var.p0(objR2);
                    }
                    e89Var = (e89) objR2;
                    objR3 = l46Var.R();
                    if (objR3 == i8cVar) {
                        objR3 = q1c.f(s72.v0(list5));
                        l46Var.p0(objR3);
                    }
                    e89 e89Var2 = (e89) objR3;
                    c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
                    i8 = i6;
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09Var3);
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
                    dec.l(he2Var, l46Var, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    String str7 = str3;
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    useVar4 = useVar3;
                    j09 j09VarW = db6.w(tm7.o(b.b(0.0f, 48.0f, b.c(g09Var, 1.0f), 1), eze.a(l46Var).b.w(l46Var), eze.a(l46Var).a.a), 1.0f, eze.a(l46Var).b.x(l46Var), eze.a(l46Var).a.a);
                    t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var, 48);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarW);
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
                    boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                    objR4 = l46Var.R();
                    if (objR4 == i8cVar) {
                        c = 6;
                        objR4 = new w77(e89Var, 6);
                        l46Var.p0(objR4);
                    } else {
                        c = 6;
                    }
                    rxg.d(zBooleanValue, (a26) objR4, null, af1.b0(-1774588792, new nca(e89Var2, e89Var, list5), l46Var), l46Var, 3120);
                    oa7.n(b.d(ynb.b0(0.0f, 8.0f, g09Var, 1), 24.0f), 0.0f, 0L, l46Var, 6, 6);
                    j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 0.0f, 14, new jw7(1.0f, true));
                    gec gecVar = gec.x;
                    wo7 wo7Var = new wo7(3, 0, 123);
                    pr4 pr4Var = o82.a;
                    int i13 = i8 >> 9;
                    List list6 = list5;
                    tv0.b(useVar4, j09VarD0, false, null, mue.a((mue) l46Var.k(nte.a), ((m82) l46Var.k(pr4Var)).q, w6c.l(17), null, null, 0L, null, 0, w6c.l(24), null, null, 16646140), wo7Var, null, gecVar, null, null, new dtd(((m82) l46Var.k(pr4Var)).q), new w84(27, useVar4, str7), null, l46Var, (i13 & 14) | 102236160, 0, 22172);
                    l46Var.r(true);
                    j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
                    boolean zBooleanValue2 = ((Boolean) h0eVar.getValue()).booleanValue();
                    u51 u51VarM = c8b.m(l46Var);
                    if ((3670016 & i8) == 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | ((((i8 & 7168) ^ 3072) <= 2048 && l46Var.g(useVar4)) || (i8 & 3072) == 2048);
                    objR5 = l46Var.R();
                    if (!z6 || objR5 == i8cVar) {
                        a26Var2 = a26Var;
                        objR5 = new y7(a26Var2, useVar4, 4);
                        l46Var.p0(objR5);
                    } else {
                        a26Var2 = a26Var;
                    }
                    String str8 = str6;
                    c8b.j(j09VarB, str8, zBooleanValue2, null, 0.0f, null, u51VarM, null, false, (x16) objR5, l46Var, (i13 & 112) | 6, 440);
                    l46Var.r(true);
                    list3 = list6;
                    str5 = str7;
                    str4 = str8;
                    z3 = z;
                    j09Var2 = j09Var3;
                    useVar2 = useVar4;
                } else {
                    l46Var.Z();
                    if ((i2 & 2) != 0) {
                        i6 &= -113;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                    }
                    str6 = str2;
                    list5 = list2;
                }
                useVar3 = useVarO;
                j09 j09Var4 = j09Var2;
                l46Var.s();
                objR = l46Var.R();
                i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = zrd.b(new zr1(useVar3, 6));
                    l46Var.p0(objR);
                }
                h0e h0eVar2 = (h0e) objR;
                objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR2);
                }
                e89Var = (e89) objR2;
                objR3 = l46Var.R();
                if (objR3 == i8cVar) {
                    objR3 = q1c.f(s72.v0(list5));
                    l46Var.p0(objR3);
                }
                e89 e89Var3 = (e89) objR3;
                c92 c92VarA2 = a92.a(new uc0(24.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
                i8 = i6;
                int iHashCode3 = Long.hashCode(l46Var.T);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, j09Var4);
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
                dec.l(he2Var5, l46Var, c92VarA2);
                he2 he2Var6 = hj6.y;
                dec.l(he2Var6, l46Var, u8aVarM3);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                String str9 = str3;
                he2 he2Var7 = hj6.X;
                dec.l(he2Var7, l46Var, numValueOf2);
                dec.k(l46Var);
                he2 he2Var8 = hj6.x;
                dec.l(he2Var8, l46Var, j09VarJ3);
                useVar4 = useVar3;
                j09 j09VarW2 = db6.w(tm7.o(b.b(0.0f, 48.0f, b.c(g09Var, 1.0f), 1), eze.a(l46Var).b.w(l46Var), eze.a(l46Var).a.a), 1.0f, eze.a(l46Var).b.x(l46Var), eze.a(l46Var).a.a);
                t7c t7cVarA2 = s7c.a(xc0.a, ndb.z, l46Var, 48);
                int iHashCode4 = Long.hashCode(l46Var.T);
                u8a u8aVarM4 = l46Var.m();
                j09 j09VarJ4 = m93.J(l46Var, j09VarW2);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var5, l46Var, t7cVarA2);
                dec.l(he2Var6, l46Var, u8aVarM4);
                ib8.s(iHashCode4, l46Var, he2Var7, l46Var);
                dec.l(he2Var8, l46Var, j09VarJ4);
                boolean zBooleanValue3 = ((Boolean) e89Var.getValue()).booleanValue();
                objR4 = l46Var.R();
                if (objR4 == i8cVar) {
                    c = 6;
                    objR4 = new w77(e89Var, 6);
                    l46Var.p0(objR4);
                } else {
                    c = 6;
                }
                rxg.d(zBooleanValue3, (a26) objR4, null, af1.b0(-1774588792, new nca(e89Var3, e89Var, list5), l46Var), l46Var, 3120);
                oa7.n(b.d(ynb.b0(0.0f, 8.0f, g09Var, 1), 24.0f), 0.0f, 0L, l46Var, 6, 6);
                j09 j09VarD1 = ynb.d0(0.0f, 0.0f, 0.0f, 0.0f, 14, new jw7(1.0f, true));
                gec gecVar2 = gec.x;
                wo7 wo7Var2 = new wo7(3, 0, 123);
                pr4 pr4Var2 = o82.a;
                int i14 = i8 >> 9;
                List list7 = list5;
                tv0.b(useVar4, j09VarD1, false, null, mue.a((mue) l46Var.k(nte.a), ((m82) l46Var.k(pr4Var2)).q, w6c.l(17), null, null, 0L, null, 0, w6c.l(24), null, null, 16646140), wo7Var2, null, gecVar2, null, null, new dtd(((m82) l46Var.k(pr4Var2)).q), new w84(27, useVar4, str9), null, l46Var, (i14 & 14) | 102236160, 0, 22172);
                l46Var.r(true);
                j09 j09VarB2 = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
                boolean zBooleanValue4 = ((Boolean) h0eVar2.getValue()).booleanValue();
                u51 u51VarM2 = c8b.m(l46Var);
                if ((3670016 & i8) == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | ((((i8 & 7168) ^ 3072) <= 2048 && l46Var.g(useVar4)) || (i8 & 3072) == 2048);
                objR5 = l46Var.R();
                if (z6) {
                    a26Var2 = a26Var;
                    objR5 = new y7(a26Var2, useVar4, 4);
                    l46Var.p0(objR5);
                } else {
                    a26Var2 = a26Var;
                    objR5 = new y7(a26Var2, useVar4, 4);
                    l46Var.p0(objR5);
                }
                String str10 = str6;
                c8b.j(j09VarB2, str10, zBooleanValue4, null, 0.0f, null, u51VarM2, null, false, (x16) objR5, l46Var, (i14 & 112) | 6, 440);
                l46Var.r(true);
                list3 = list7;
                str5 = str9;
                str4 = str10;
                z3 = z;
                j09Var2 = j09Var4;
                useVar2 = useVar4;
            } else {
                l46Var.Z();
                str4 = str2;
                list3 = list2;
                str5 = str3;
                useVar2 = useVarO;
                z3 = z;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new c61(j09Var2, list3, str5, useVar2, str4, z3, a26Var2, i, i2);
            }
        }
        useVarO = useVar;
        i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        i6 = i4 | i5 | (((i2 & 16) == 0 || !l46Var.g(str2)) ? UserMetadata.MAX_INTERNAL_KEY_SIZE : 16384);
        if ((i & 1572864) == 0) {
            if (l46Var.i(a26Var2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i6 |= i9;
        }
        if ((533651 & i6) != 533650) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i6 & 1, z2)) {
            l46Var.b0();
            i7 = i & 1;
            g09Var = g09.a;
            if (i7 != 0) {
                if (i10 != 0) {
                    j09Var2 = g09Var;
                }
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                    list4 = a;
                } else {
                    list4 = list2;
                }
                if (i12 != 0) {
                    str3 = null;
                }
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                    useVarO = n3d.o(null, l46Var, 3);
                }
                if ((i2 & 16) != 0) {
                    strQ = afc.q(R.string.auth_using_phone, l46Var);
                    i6 &= -57345;
                } else {
                    strQ = str2;
                }
                if ((i2 & 32) != 0) {
                    list5 = list4;
                    str6 = strQ;
                    useVar3 = useVarO;
                    z = false;
                } else {
                    list5 = list4;
                    str6 = strQ;
                    useVar3 = useVarO;
                }
            } else {
                if (i10 != 0) {
                    j09Var2 = g09Var;
                }
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                    list4 = a;
                } else {
                    list4 = list2;
                }
                if (i12 != 0) {
                    str3 = null;
                }
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                    useVarO = n3d.o(null, l46Var, 3);
                }
                if ((i2 & 16) != 0) {
                    strQ = afc.q(R.string.auth_using_phone, l46Var);
                    i6 &= -57345;
                } else {
                    strQ = str2;
                }
                if ((i2 & 32) != 0) {
                    list5 = list4;
                    str6 = strQ;
                    useVar3 = useVarO;
                    z = false;
                } else {
                    list5 = list4;
                    str6 = strQ;
                    useVar3 = useVarO;
                }
            }
            j09 j09Var5 = j09Var2;
            l46Var.s();
            objR = l46Var.R();
            i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = zrd.b(new zr1(useVar3, 6));
                l46Var.p0(objR);
            }
            h0e h0eVar3 = (h0e) objR;
            objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89Var = (e89) objR2;
            objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = q1c.f(s72.v0(list5));
                l46Var.p0(objR3);
            }
            e89 e89Var4 = (e89) objR3;
            c92 c92VarA3 = a92.a(new uc0(24.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
            i8 = i6;
            int iHashCode5 = Long.hashCode(l46Var.T);
            u8a u8aVarM5 = l46Var.m();
            j09 j09VarJ5 = m93.J(l46Var, j09Var5);
            lf2.q.getClass();
            l46Var.j0();
            z4 = l46Var.S;
            ov7Var = LayoutNode.h1;
            if (z4) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var9 = hj6.z;
            dec.l(he2Var9, l46Var, c92VarA3);
            he2 he2Var10 = hj6.y;
            dec.l(he2Var10, l46Var, u8aVarM5);
            Integer numValueOf3 = Integer.valueOf(iHashCode5);
            String str11 = str3;
            he2 he2Var11 = hj6.X;
            dec.l(he2Var11, l46Var, numValueOf3);
            dec.k(l46Var);
            he2 he2Var12 = hj6.x;
            dec.l(he2Var12, l46Var, j09VarJ5);
            useVar4 = useVar3;
            j09 j09VarW3 = db6.w(tm7.o(b.b(0.0f, 48.0f, b.c(g09Var, 1.0f), 1), eze.a(l46Var).b.w(l46Var), eze.a(l46Var).a.a), 1.0f, eze.a(l46Var).b.x(l46Var), eze.a(l46Var).a.a);
            t7c t7cVarA3 = s7c.a(xc0.a, ndb.z, l46Var, 48);
            int iHashCode6 = Long.hashCode(l46Var.T);
            u8a u8aVarM6 = l46Var.m();
            j09 j09VarJ6 = m93.J(l46Var, j09VarW3);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var9, l46Var, t7cVarA3);
            dec.l(he2Var10, l46Var, u8aVarM6);
            ib8.s(iHashCode6, l46Var, he2Var11, l46Var);
            dec.l(he2Var12, l46Var, j09VarJ6);
            boolean zBooleanValue5 = ((Boolean) e89Var.getValue()).booleanValue();
            objR4 = l46Var.R();
            if (objR4 == i8cVar) {
                c = 6;
                objR4 = new w77(e89Var, 6);
                l46Var.p0(objR4);
            } else {
                c = 6;
            }
            rxg.d(zBooleanValue5, (a26) objR4, null, af1.b0(-1774588792, new nca(e89Var4, e89Var, list5), l46Var), l46Var, 3120);
            oa7.n(b.d(ynb.b0(0.0f, 8.0f, g09Var, 1), 24.0f), 0.0f, 0L, l46Var, 6, 6);
            j09 j09VarD2 = ynb.d0(0.0f, 0.0f, 0.0f, 0.0f, 14, new jw7(1.0f, true));
            gec gecVar3 = gec.x;
            wo7 wo7Var3 = new wo7(3, 0, 123);
            pr4 pr4Var3 = o82.a;
            int i15 = i8 >> 9;
            List list8 = list5;
            tv0.b(useVar4, j09VarD2, false, null, mue.a((mue) l46Var.k(nte.a), ((m82) l46Var.k(pr4Var3)).q, w6c.l(17), null, null, 0L, null, 0, w6c.l(24), null, null, 16646140), wo7Var3, null, gecVar3, null, null, new dtd(((m82) l46Var.k(pr4Var3)).q), new w84(27, useVar4, str11), null, l46Var, (i15 & 14) | 102236160, 0, 22172);
            l46Var.r(true);
            j09 j09VarB3 = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
            boolean zBooleanValue6 = ((Boolean) h0eVar3.getValue()).booleanValue();
            u51 u51VarM3 = c8b.m(l46Var);
            if ((3670016 & i8) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z5 | ((((i8 & 7168) ^ 3072) <= 2048 && l46Var.g(useVar4)) || (i8 & 3072) == 2048);
            objR5 = l46Var.R();
            if (z6) {
                a26Var2 = a26Var;
                objR5 = new y7(a26Var2, useVar4, 4);
                l46Var.p0(objR5);
            } else {
                a26Var2 = a26Var;
                objR5 = new y7(a26Var2, useVar4, 4);
                l46Var.p0(objR5);
            }
            String str12 = str6;
            c8b.j(j09VarB3, str12, zBooleanValue6, null, 0.0f, null, u51VarM3, null, false, (x16) objR5, l46Var, (i15 & 112) | 6, 440);
            l46Var.r(true);
            list3 = list8;
            str5 = str11;
            str4 = str12;
            z3 = z;
            j09Var2 = j09Var5;
            useVar2 = useVar4;
        } else {
            l46Var.Z();
            str4 = str2;
            list3 = list2;
            str5 = str3;
            useVar2 = useVarO;
            z3 = z;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new c61(j09Var2, list3, str5, useVar2, str4, z3, a26Var2, i, i2);
        }
    }
}
