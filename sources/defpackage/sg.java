package defpackage;

import ai.askquin.R;
import ai.askquin.ui.account.component.AuthOption;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sg implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sg(boolean z, s69 s69Var, s69 s69Var2) {
        this.a = 5;
        this.b = z;
        this.c = s69Var;
        this.d = s69Var2;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x0612  */
    /* JADX WARN: Code duplicated, block: B:232:0x0622  */
    /* JADX WARN: Code duplicated, block: B:235:0x065a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0667 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x0669  */
    /* JADX WARN: Code duplicated, block: B:240:0x0670  */
    /* JADX WARN: Code duplicated, block: B:242:0x0674  */
    /* JADX WARN: Code duplicated, block: B:243:0x0690  */
    /* JADX WARN: Code duplicated, block: B:246:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:247:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:249:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:250:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:254:0x0711  */
    /* JADX WARN: Code duplicated, block: B:256:0x0721  */
    /* JADX WARN: Code duplicated, block: B:259:0x074f  */
    /* JADX WARN: Code duplicated, block: B:261:0x0757  */
    /* JADX WARN: Code duplicated, block: B:263:0x075d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0760  */
    /* JADX WARN: Code duplicated, block: B:266:0x078a  */
    /* JADX WARN: Code duplicated, block: B:268:0x0792  */
    /* JADX WARN: Code duplicated, block: B:270:0x0798  */
    /* JADX WARN: Code duplicated, block: B:271:0x079b  */
    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        String strI;
        int i;
        int i2;
        long jD;
        String strI2;
        int i3;
        int i4;
        boolean zBooleanValue;
        boolean z;
        j09 j09Var;
        j09 j09VarD;
        long jD2;
        long j;
        mue mueVarA;
        String strY;
        String str;
        String str2;
        int i5 = this.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        boolean z2 = this.b;
        wef wefVar = wef.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i5) {
            case 0:
                p07 p07Var = (p07) obj5;
                n07 n07Var = (n07) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    az2 az2Var = az2.CreditPackB;
                    az2 az2Var2 = az2.CreditPackA;
                    if (p07Var == az2Var2) {
                        i = -1829411779;
                        i2 = R.string.paywall_credit_pack_a;
                    } else {
                        if (p07Var == az2Var) {
                            i = -1829408547;
                            i2 = R.string.paywall_credit_pack_b;
                        } else if (p07Var instanceof thb) {
                            l46Var.f0(-1829405657);
                            strI = afc.r(R.string.addon_paywall_times, new Object[]{Integer.valueOf(((thb) p07Var).d())}, l46Var);
                            l46Var.r(false);
                        } else {
                            strI = tec.i(l46Var, -1829403467, R.string.reading_title, l46Var, false);
                        }
                        String str3 = strI;
                        mue mueVar = pue.a;
                        mue mueVarD = pue.d(l46Var);
                        if (z2) {
                            l46Var.f0(-1662789244);
                            jD = l8b.b(l46Var);
                        } else {
                            l46Var.f0(-1662788378);
                            jD = l8b.d(l46Var);
                        }
                        l46Var.r(false);
                        nte.b(str3, null, jD, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarD, l46Var, 0, 0, 130042);
                        if (p07Var == az2Var2) {
                            i3 = 2118558022;
                            i4 = R.string.paywall_credit_pack_a_desc;
                        } else {
                            if (p07Var == az2Var) {
                                i3 = 2118561414;
                                i4 = R.string.paywall_credit_pack_b_desc;
                            } else if (p07Var instanceof thb) {
                                l46Var.f0(2118564459);
                                strI2 = afc.r(R.string.addon_paywall_times, new Object[]{Integer.valueOf(((thb) p07Var).d())}, l46Var);
                                l46Var.r(false);
                            } else {
                                strI2 = tec.i(l46Var, 2118566649, R.string.reading_title, l46Var, false);
                            }
                            nte.b(strI2, null, l8b.a(l46Var), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.d(l46Var), l46Var, 0, 0, 130042);
                            zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
                            j09 j09VarB = b.b(100.0f, 0.0f, g09Var, 2);
                            if (zBooleanValue) {
                                l46Var.f0(-1662775810);
                                l46Var.r(false);
                                j09Var = g09Var;
                            } else {
                                l46Var.f0(-6407123);
                                ved vedVarU0 = vd0.u0(l46Var);
                                if (n07Var == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                j09 j09VarU0 = kj0.u0(g09Var, z, ((s5d) l46Var.k(u5d.a)).b, vedVarU0);
                                l46Var.r(false);
                                j09Var = j09VarU0;
                            }
                            j09VarD = j09VarB.D(j09Var);
                            if (z2) {
                                l46Var.f0(-1662768029);
                                jD2 = l8b.a(l46Var);
                            } else {
                                l46Var.f0(-1662767194);
                                jD2 = l8b.d(l46Var);
                            }
                            l46Var.r(false);
                            j = jD2;
                            mueVarA = mue.a(pue.n(l46Var), 0L, 0L, null, cr5.h, 0L, null, 3, 0L, null, null, 16744415);
                            if (zBooleanValue) {
                                l46Var.f0(-5999597);
                                strY = n07Var != null ? n07Var.y() : null;
                                if (strY == null) {
                                    str2 = "";
                                } else {
                                    str2 = strY;
                                }
                                nte.b(str2, j09VarD, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var, 0, 0, 131064);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-5796981);
                                strY = n07Var != null ? n07Var.y() : null;
                                if (strY == null) {
                                    str = "";
                                } else {
                                    str = strY;
                                }
                                iqf.a(str, j09VarD, j, mueVarA, 0L, 0L, l46Var, 0, 48);
                                l46Var.r(false);
                            }
                        }
                        strI2 = tec.i(l46Var, i3, i4, l46Var, false);
                        nte.b(strI2, null, l8b.a(l46Var), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.d(l46Var), l46Var, 0, 0, 130042);
                        zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
                        j09 j09VarB2 = b.b(100.0f, 0.0f, g09Var, 2);
                        if (zBooleanValue) {
                            l46Var.f0(-1662775810);
                            l46Var.r(false);
                            j09Var = g09Var;
                        } else {
                            l46Var.f0(-6407123);
                            ved vedVarU1 = vd0.u0(l46Var);
                            if (n07Var == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            j09 j09VarU1 = kj0.u0(g09Var, z, ((s5d) l46Var.k(u5d.a)).b, vedVarU1);
                            l46Var.r(false);
                            j09Var = j09VarU1;
                        }
                        j09VarD = j09VarB2.D(j09Var);
                        if (z2) {
                            l46Var.f0(-1662768029);
                            jD2 = l8b.a(l46Var);
                        } else {
                            l46Var.f0(-1662767194);
                            jD2 = l8b.d(l46Var);
                        }
                        l46Var.r(false);
                        j = jD2;
                        mueVarA = mue.a(pue.n(l46Var), 0L, 0L, null, cr5.h, 0L, null, 3, 0L, null, null, 16744415);
                        if (zBooleanValue) {
                            l46Var.f0(-5999597);
                            if (n07Var != null) {
                            }
                            if (strY == null) {
                                str2 = "";
                            } else {
                                str2 = strY;
                            }
                            nte.b(str2, j09VarD, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var, 0, 0, 131064);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-5796981);
                            if (n07Var != null) {
                            }
                            if (strY == null) {
                                str = "";
                            } else {
                                str = strY;
                            }
                            iqf.a(str, j09VarD, j, mueVarA, 0L, 0L, l46Var, 0, 48);
                            l46Var.r(false);
                        }
                    }
                    strI = tec.i(l46Var, i, i2, l46Var, false);
                    String str4 = strI;
                    mue mueVar2 = pue.a;
                    mue mueVarD2 = pue.d(l46Var);
                    if (z2) {
                        l46Var.f0(-1662789244);
                        jD = l8b.b(l46Var);
                    } else {
                        l46Var.f0(-1662788378);
                        jD = l8b.d(l46Var);
                    }
                    l46Var.r(false);
                    nte.b(str4, null, jD, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarD2, l46Var, 0, 0, 130042);
                    if (p07Var == az2Var2) {
                        i3 = 2118558022;
                        i4 = R.string.paywall_credit_pack_a_desc;
                    } else {
                        if (p07Var == az2Var) {
                            i3 = 2118561414;
                            i4 = R.string.paywall_credit_pack_b_desc;
                        } else if (p07Var instanceof thb) {
                            l46Var.f0(2118564459);
                            strI2 = afc.r(R.string.addon_paywall_times, new Object[]{Integer.valueOf(((thb) p07Var).d())}, l46Var);
                            l46Var.r(false);
                        } else {
                            strI2 = tec.i(l46Var, 2118566649, R.string.reading_title, l46Var, false);
                        }
                        nte.b(strI2, null, l8b.a(l46Var), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.d(l46Var), l46Var, 0, 0, 130042);
                        zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
                        j09 j09VarB3 = b.b(100.0f, 0.0f, g09Var, 2);
                        if (zBooleanValue) {
                            l46Var.f0(-1662775810);
                            l46Var.r(false);
                            j09Var = g09Var;
                        } else {
                            l46Var.f0(-6407123);
                            ved vedVarU2 = vd0.u0(l46Var);
                            if (n07Var == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            j09 j09VarU2 = kj0.u0(g09Var, z, ((s5d) l46Var.k(u5d.a)).b, vedVarU2);
                            l46Var.r(false);
                            j09Var = j09VarU2;
                        }
                        j09VarD = j09VarB3.D(j09Var);
                        if (z2) {
                            l46Var.f0(-1662768029);
                            jD2 = l8b.a(l46Var);
                        } else {
                            l46Var.f0(-1662767194);
                            jD2 = l8b.d(l46Var);
                        }
                        l46Var.r(false);
                        j = jD2;
                        mueVarA = mue.a(pue.n(l46Var), 0L, 0L, null, cr5.h, 0L, null, 3, 0L, null, null, 16744415);
                        if (zBooleanValue) {
                            l46Var.f0(-5999597);
                            if (n07Var != null) {
                            }
                            if (strY == null) {
                                str2 = "";
                            } else {
                                str2 = strY;
                            }
                            nte.b(str2, j09VarD, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var, 0, 0, 131064);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-5796981);
                            if (n07Var != null) {
                            }
                            if (strY == null) {
                                str = "";
                            } else {
                                str = strY;
                            }
                            iqf.a(str, j09VarD, j, mueVarA, 0L, 0L, l46Var, 0, 48);
                            l46Var.r(false);
                        }
                    }
                    strI2 = tec.i(l46Var, i3, i4, l46Var, false);
                    nte.b(strI2, null, l8b.a(l46Var), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.d(l46Var), l46Var, 0, 0, 130042);
                    zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
                    j09 j09VarB4 = b.b(100.0f, 0.0f, g09Var, 2);
                    if (zBooleanValue) {
                        l46Var.f0(-1662775810);
                        l46Var.r(false);
                        j09Var = g09Var;
                    } else {
                        l46Var.f0(-6407123);
                        ved vedVarU3 = vd0.u0(l46Var);
                        if (n07Var == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        j09 j09VarU3 = kj0.u0(g09Var, z, ((s5d) l46Var.k(u5d.a)).b, vedVarU3);
                        l46Var.r(false);
                        j09Var = j09VarU3;
                    }
                    j09VarD = j09VarB4.D(j09Var);
                    if (z2) {
                        l46Var.f0(-1662768029);
                        jD2 = l8b.a(l46Var);
                    } else {
                        l46Var.f0(-1662767194);
                        jD2 = l8b.d(l46Var);
                    }
                    l46Var.r(false);
                    j = jD2;
                    mueVarA = mue.a(pue.n(l46Var), 0L, 0L, null, cr5.h, 0L, null, 3, 0L, null, null, 16744415);
                    if (zBooleanValue) {
                        l46Var.f0(-5999597);
                        if (n07Var != null) {
                        }
                        if (strY == null) {
                            str2 = "";
                        } else {
                            str2 = strY;
                        }
                        nte.b(str2, j09VarD, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var, 0, 0, 131064);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-5796981);
                        if (n07Var != null) {
                        }
                        if (strY == null) {
                            str = "";
                        } else {
                            str = strY;
                        }
                        iqf.a(str, j09VarD, j, mueVarA, 0L, 0L, l46Var, 0, 48);
                        l46Var.r(false);
                    }
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                x16 x16Var = (x16) obj5;
                h0e h0eVar = (h0e) obj4;
                xw9 xw9Var = (xw9) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                    return wefVar;
                }
                l40 l40Var = (l40) h0eVar.getValue();
                if (!(l40Var instanceof j40)) {
                    if (!(l40Var instanceof i40)) {
                        if (!(l40Var instanceof k40)) {
                            throw tec.d(-1371263453, l46Var2, false);
                        }
                        l46Var2.f0(440885917);
                        m93.i((k40) l40Var, z2, ynb.a0(mh3.d0(ynb.Y(b.c, xw9Var), mh3.T(l46Var2), false, 14), 20.0f, 20.0f), l46Var2, 0);
                        l46Var2.r(false);
                        return wefVar;
                    }
                    l46Var2.f0(440762816);
                    boolean zG = l46Var2.g(x16Var);
                    Object objR = l46Var2.R();
                    if (zG || objR == i8cVar) {
                        objR = new m30(x16Var, null);
                        l46Var2.p0(objR);
                    }
                    af1.o((l26) objR, l46Var2, wefVar);
                    l46Var2.r(false);
                    return wefVar;
                }
                l46Var2.f0(440561657);
                FillElement fillElement = b.c;
                xn8 xn8VarC = s21.c(ndb.f, false);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, fillElement);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(hj6.z, l46Var2, xn8VarC);
                dec.l(hj6.y, l46Var2, u8aVarM);
                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                dec.k(l46Var2);
                dec.l(hj6.x, l46Var2, j09VarJ);
                jgb.w(null, 0L, 0.0f, l46Var2, 0);
                l46Var2.r(true);
                l46Var2.r(false);
                return wefVar;
            case 2:
                use useVar = (use) obj5;
                x16 x16Var2 = (x16) obj4;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                    return wefVar;
                }
                FillElement fillElement2 = b.c;
                j09 j09VarN = mh3.N(fillElement2);
                jx0 jx0Var = ndb.Z;
                sc0 sc0Var = xc0.c;
                c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var3, 48);
                int iHashCode2 = Long.hashCode(l46Var3.T);
                u8a u8aVarM2 = l46Var3.m();
                j09 j09VarJ2 = m93.J(l46Var3, j09VarN);
                lf2.q.getClass();
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var3, c92VarA);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var3, u8aVarM2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var3, numValueOf);
                dec.k(l46Var3);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var3, j09VarJ2);
                j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 32.0f, 7, ynb.b0(32.0f, 0.0f, fillElement2, 2));
                c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var3, 48);
                int iHashCode3 = Long.hashCode(l46Var3.T);
                u8a u8aVarM3 = l46Var3.m();
                j09 j09VarJ3 = m93.J(l46Var3, j09VarD0);
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(he2Var, l46Var3, c92VarA2);
                dec.l(he2Var2, l46Var3, u8aVarM3);
                ib8.s(iHashCode3, l46Var3, he2Var3, l46Var3);
                dec.l(he2Var4, l46Var3, j09VarJ3);
                String strH = ks0.h(81.0f, R.string.auth_bind_phone_number, l46Var3, l46Var3, g09Var);
                boolean zG2 = l46Var3.g(x16Var2);
                Object objR2 = l46Var3.R();
                if (zG2 || objR2 == i8cVar) {
                    objR2 = new p9(4, x16Var2);
                    l46Var3.p0(objR2);
                }
                oca.a(null, null, null, useVar, strH, this.b, (a26) objR2, l46Var3, 0, 7);
                l46Var3.r(true);
                l46Var3.r(true);
                return wefVar;
            case 3:
                a26 a26Var = (a26) obj5;
                a26 a26Var2 = (a26) obj4;
                xw9 xw9Var2 = (xw9) obj;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                xw9Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= l46Var4.g(xw9Var2) ? 4 : 2;
                }
                if (l46Var4.W(1 & iIntValue4, (iIntValue4 & 19) != 18)) {
                    ded.a(b.c, af1.b0(-830624552, new ck(xw9Var2, a26Var, a26Var2, this.b, 2), l46Var4), l46Var4, 54, 0);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                e63 e63Var = (e63) obj5;
                a26 a26Var3 = (a26) obj4;
                xw9 xw9Var3 = (xw9) obj;
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                xw9Var3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= l46Var5.g(xw9Var3) ? 4 : 2;
                }
                if (l46Var5.W(1 & iIntValue5, (iIntValue5 & 19) != 18)) {
                    rs0.f(null, false, af1.b0(1914827606, new ck(e63Var, xw9Var3, z2, a26Var3), l46Var5), l46Var5, 384, 3);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                zn8 zn8Var = (zn8) obj;
                tn8 tn8Var = (tn8) obj2;
                kl2 kl2Var = (kl2) obj3;
                int iG = ll2.g(((sz9) ((s69) obj5)).j(), kl2Var.a);
                long j2 = kl2Var.a;
                int iF = ll2.f(((sz9) ((s69) obj4)).j(), j2);
                int iJ = z2 ? iG : kl2.j(j2);
                if (!z2) {
                    iG = kl2.h(j2);
                }
                cea ceaVarV = tn8Var.v(kl2.a(kl2Var.a, iJ, iG, 0, iF, 4));
                return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 6));
            case 6:
                e83 e83Var = (e83) obj5;
                a26 a26Var4 = (a26) obj4;
                xw9 xw9Var4 = (xw9) obj;
                l46 l46Var6 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                xw9Var4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= l46Var6.g(xw9Var4) ? 4 : 2;
                }
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    j09 j09VarY = ynb.Y(b.c, xw9Var4);
                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                    int iHashCode4 = Long.hashCode(l46Var6.T);
                    u8a u8aVarM4 = l46Var6.m();
                    j09 j09VarJ4 = m93.J(l46Var6, j09VarY);
                    lf2.q.getClass();
                    l46Var6.j0();
                    if (l46Var6.S) {
                        l46Var6.l(ov7Var);
                    } else {
                        l46Var6.s0();
                    }
                    dec.l(hj6.z, l46Var6, xn8VarC2);
                    dec.l(hj6.y, l46Var6, u8aVarM4);
                    dec.l(hj6.X, l46Var6, Integer.valueOf(iHashCode4));
                    dec.k(l46Var6);
                    dec.l(hj6.x, l46Var6, j09VarJ4);
                    pa7.i(e83Var, !z2, a26Var4, l46Var6, 0);
                    l46Var6.r(true);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 7:
                upc upcVar = (upc) obj5;
                x16 x16Var3 = (x16) obj4;
                xw9 xw9Var5 = (xw9) obj;
                l46 l46Var7 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                xw9Var5.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= l46Var7.g(xw9Var5) ? 4 : 2;
                }
                if (!l46Var7.W(1 & iIntValue7, (iIntValue7 & 19) != 18)) {
                    l46Var7.Z();
                } else if ((upcVar instanceof opc) || (upcVar instanceof tpc) || (upcVar instanceof rpc)) {
                    l46Var7.f0(2019649126);
                    uyb.c(0, x16Var3, l46Var7, ynb.Y(b.c, xw9Var5));
                    l46Var7.r(false);
                } else {
                    if (!pa7.t(upcVar, ppc.a) && !pa7.t(upcVar, qpc.a) && !(upcVar instanceof spc)) {
                        throw tec.d(2019644916, l46Var7, false);
                    }
                    l46Var7.f0(2019658207);
                    uyb.d(0, l46Var7, ynb.Y(b.c, xw9Var5), z2);
                    l46Var7.r(false);
                }
                return wefVar;
            case 8:
                pqe pqeVar = (pqe) obj5;
                vz9 vz9Var = pqeVar.f;
                t69 t69Var = (t69) obj4;
                l46 l46Var8 = (l46) obj2;
                ((Integer) obj3).getClass();
                l46Var8.f0(-2137546592);
                boolean z3 = ((ks9) vz9Var.getValue()) == ks9.a || !(l46Var8.k(zg2.n) == cv7.b);
                boolean zG3 = l46Var8.g(pqeVar);
                Object objR3 = l46Var8.R();
                if (zG3 || objR3 == i8cVar) {
                    objR3 = new trd(14, pqeVar);
                    l46Var8.p0(objR3);
                }
                e89 e89VarI = q1c.i((a26) objR3, l46Var8);
                Object objR4 = l46Var8.R();
                if (objR4 == i8cVar) {
                    os3 os3Var = new os3(new w77(e89VarI, 8));
                    l46Var8.p0(os3Var);
                    objR4 = os3Var;
                }
                zhc zhcVar = (zhc) objR4;
                boolean zG4 = l46Var8.g(zhcVar) | l46Var8.g(pqeVar);
                Object objR5 = l46Var8.R();
                if (zG4 || objR5 == i8cVar) {
                    objR5 = new oqe(zhcVar, pqeVar);
                    l46Var8.p0(objR5);
                }
                j09 j09VarA = ohc.a(g09.a, (oqe) objR5, (ks9) vz9Var.getValue(), z2 && pqeVar.b.j() != 0.0f, z3, t69Var);
                l46Var8.r(false);
                return j09VarA;
            default:
                use useVar2 = (use) obj5;
                a26 a26Var5 = (a26) obj4;
                AuthOption authOption = (AuthOption) obj;
                l46 l46Var9 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                authOption.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= l46Var9.e(authOption.ordinal()) ? 4 : 2;
                }
                if (l46Var9.W(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    int i6 = clf.b[authOption.ordinal()];
                    boolean z4 = this.b;
                    if (i6 == 1) {
                        l46Var9.f0(-879095015);
                        eb3.i(b.c(g09Var, 1.0f), useVar2, afc.q(R.string.auth_login_email_hint, l46Var9), z4, a26Var5, l46Var9, 6);
                        l46Var9.r(false);
                    } else if (i6 == 2) {
                        l46Var9.f0(-878758572);
                        oca.a(null, null, afc.q(R.string.auth_login_phone_hint, l46Var9), useVar2, null, z4, a26Var5, l46Var9, 0, 19);
                        l46Var9.r(false);
                    } else {
                        if (i6 != 3 && i6 != 4 && i6 != 5) {
                            throw tec.d(802925156, l46Var9, false);
                        }
                        l46Var9.f0(802947032);
                        l46Var9.r(false);
                    }
                } else {
                    l46Var9.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ sg(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ sg(Object obj, m26 m26Var, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = m26Var;
        this.b = z;
    }
}
