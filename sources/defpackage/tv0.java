package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tv0 {
    public static final long a = cgg.f(40.0f, 40.0f);

    public static final void a(use useVar, j09 j09Var, final boolean z, final u47 u47Var, final mue mueVar, final wo7 wo7Var, dwd dwdVar, final ype ypeVar, final l26 l26Var, t69 t69Var, final b41 b41Var, final goe goeVar, final ghc ghcVar, l46 l46Var, int i, int i2) {
        int i3;
        int i4;
        l46 l46Var2;
        t69 t69Var2;
        boolean z2;
        c52 c52Var;
        Object jseVar;
        l46 l46Var3;
        int i5;
        int i6;
        sw3 sw3Var;
        int i7;
        ute uteVar;
        final tze tzeVar;
        aw2 aw2Var;
        final jse jseVar2;
        Object obj;
        boolean z3;
        boolean z4;
        boolean z5;
        ks9 ks9Var;
        boolean z6 = z;
        l46Var.h0(965149429);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(useVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(j09Var) ? 32 : 16;
        }
        int i8 = i & 384;
        int i9 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i8 == 0) {
            i3 |= l46Var.h(z6) ? 256 : 128;
        }
        int i10 = i & 3072;
        int i11 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i10 == 0) {
            i3 |= l46Var.h(false) ? 2048 : 1024;
        }
        int i12 = i & 24576;
        int i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i12 == 0) {
            i3 |= l46Var.g(u47Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= l46Var.g(mueVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= l46Var.g(wo7Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= l46Var.g(dwdVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= l46Var.g(ypeVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= l46Var.i(l26Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (l46Var.g(t69Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(b41Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (l46Var.g(null)) {
                i9 = 256;
            }
            i4 |= i9;
        }
        if ((i2 & 3072) == 0) {
            if (l46Var.g(null)) {
                i11 = 2048;
            }
            i4 |= i11;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0 ? l46Var.g(goeVar) : l46Var.i(goeVar)) {
                i13 = 16384;
            }
            i4 |= i13;
        }
        if ((i2 & 196608) == 0) {
            i4 |= l46Var.g(ghcVar) ? 131072 : 65536;
        }
        int i14 = i4 | 1572864;
        if (l46Var.W(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i14) == 599186) ? false : true)) {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            sw3 sw3Var2 = (sw3) l46Var.k(zg2.h);
            cv7 cv7Var = (cv7) l46Var.k(zg2.n);
            final boolean zT = pa7.t(ypeVar, gec.x);
            i8c i8cVar = sf2.a;
            if (t69Var == null) {
                l46Var.f0(-2038132442);
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = ib8.e(l46Var);
                }
                l46Var.r(false);
                t69Var2 = (t69) objR;
            } else {
                l46Var.f0(-204294191);
                l46Var.r(false);
                t69Var2 = t69Var;
            }
            ks9 ks9Var2 = ks9.a;
            ks9 ks9Var3 = zT ? ks9.b : ks9Var2;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                z2 = true;
                objR2 = ocd.b(1, 0, i41.c, 2);
                l46Var.p0(objR2);
            } else {
                z2 = true;
            }
            b89 b89Var = (b89) objR2;
            boolean z7 = ((i3 & 14) == 4 ? z2 : false) | ((i14 & 896) == 256) | ((i14 & 7168) == 2048);
            Object objR3 = l46Var.R();
            if (z7 || objR3 == i8cVar) {
                i8c i8cVar2 = i8c.e;
                if (!zT) {
                    i8cVar2 = null;
                }
                objR3 = new z2f(useVar, u47Var, i8cVar2);
                l46Var.p0(objR3);
            }
            final z2f z2fVar = (z2f) objR3;
            boolean zG = l46Var.g(z2fVar);
            Object objR4 = l46Var.R();
            if (zG || objR4 == i8cVar) {
                objR4 = new ute();
                l46Var.p0(objR4);
            }
            ute uteVar2 = (ute) objR4;
            wo7Var.getClass();
            Object objR5 = l46Var.R();
            if (objR5 == i8cVar) {
                objR5 = af1.E(l46Var);
                l46Var.p0(objR5);
            }
            aw2 aw2Var2 = (aw2) objR5;
            l46Var.f0(-2036249936);
            sd8 sd8VarS = mueVar.a.k;
            if (sd8VarS == null) {
                sd8 sd8Var = sd8.c;
                sd8VarS = cfa.a.s();
            }
            final rfa rfaVarB = zfa.b(tuc.a, sd8VarS, l46Var, 6);
            l46Var.r(false);
            Object objR6 = l46Var.R();
            if (objR6 == i8cVar) {
                objR6 = new tze();
                l46Var.p0(objR6);
            }
            tze tzeVar2 = (tze) objR6;
            c52 c52Var2 = (c52) l46Var.k(zg2.f);
            boolean zG2 = l46Var.g(z2fVar);
            Object objR7 = l46Var.R();
            if (zG2 || objR7 == i8cVar) {
                c52Var = c52Var2;
                l46Var3 = l46Var;
                i5 = i3;
                i6 = i14;
                sw3Var = sw3Var2;
                i7 = 16384;
                jseVar = new jse(z2fVar, uteVar2, sw3Var, z, tzeVar2, aw2Var2, rfaVarB, c52Var);
                uteVar = uteVar2;
                tzeVar = tzeVar2;
                aw2Var = aw2Var2;
                l46Var3.p0(jseVar);
            } else {
                tzeVar = tzeVar2;
                l46Var3 = l46Var;
                aw2Var = aw2Var2;
                sw3Var = sw3Var2;
                i6 = i14;
                c52Var = c52Var2;
                uteVar = uteVar2;
                jseVar = objR7;
                i5 = i3;
                i7 = 16384;
            }
            jse jseVar3 = (jse) jseVar;
            final eh6 eh6Var = (eh6) l46Var3.k(zg2.l);
            boolean zG3 = l46Var3.g((que) l46Var3.k(zg2.r)) | l46Var3.g(aw2Var);
            Object objR8 = l46Var3.R();
            if (zG3 || objR8 == i8cVar) {
                objR8 = new qv0();
                l46Var3.p0(objR8);
            }
            final qv0 qv0Var = (qv0) objR8;
            boolean zG4 = ((i5 & 57344) == i7) | l46Var3.g(z2fVar) | l46Var3.i(jseVar3) | l46Var3.i(eh6Var) | l46Var3.i(c52Var) | l46Var3.g(qv0Var) | l46Var3.g(sw3Var) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | ((i6 & 3670016) == 1048576);
            Object objR9 = l46Var3.R();
            if (zG4 || objR9 == i8cVar) {
                final sw3 sw3Var3 = sw3Var;
                jseVar2 = jseVar3;
                final c52 c52Var3 = c52Var;
                obj = new x16(u47Var, jseVar2, eh6Var, c52Var3, qv0Var, sw3Var3, z) { // from class: kv0
                    public final /* synthetic */ u47 b;
                    public final /* synthetic */ jse c;
                    public final /* synthetic */ eh6 d;
                    public final /* synthetic */ c52 e;
                    public final /* synthetic */ sw3 f;
                    public final /* synthetic */ boolean g;

                    {
                        this.f = sw3Var3;
                        this.g = z;
                    }

                    @Override // defpackage.x16
                    public final Object invoke() {
                        lne lneVar;
                        lyd lydVar;
                        this.a.b = this.b;
                        jse jseVar4 = this.c;
                        boolean z8 = this.g;
                        if (!z8 && (lneVar = jseVar4.d.a) != null && (lydVar = lneVar.J0) != null) {
                            lydVar.h(null);
                            lneVar.J0 = null;
                        }
                        jseVar4.j = this.d;
                        jseVar4.g = this.e;
                        jseVar4.c = this.f;
                        jseVar4.i = z8;
                        return wef.a;
                    }
                };
                z3 = z;
                l46Var3.p0(obj);
            } else {
                jseVar2 = jseVar3;
                obj = objR9;
                z3 = z;
            }
            af1.u((x16) obj, l46Var3);
            boolean zI = l46Var3.i(jseVar2);
            Object objR10 = l46Var3.R();
            if (zI || objR10 == i8cVar) {
                objR10 = new lv0(jseVar2, 0);
                l46Var3.p0(objR10);
            }
            af1.g(jseVar2, (a26) objR10, l46Var3);
            int i15 = wo7Var.c;
            boolean z8 = (i15 == 7 || i15 == 8) ? false : true;
            final mre mreVar = (mre) jseVar2.q.getValue();
            boolean zH = l46Var3.h(z8) | l46Var3.i(b89Var);
            Object objR11 = l46Var3.R();
            if (zH || objR11 == i8cVar) {
                z4 = false;
                objR11 = new mv0(z8, b89Var, 0);
                l46Var3.p0(objR11);
            } else {
                z4 = false;
            }
            boolean z9 = z4;
            int i16 = i5;
            final ute uteVar3 = uteVar;
            j09 j09VarD = cgg.Q(j09Var, z3, z8, (x16) objR11).D(new hoe(z2fVar, uteVar3, jseVar2, u47Var, z3, wo7Var, dwdVar, zT, t69Var2, b89Var));
            boolean z10 = (z && mreVar == mre.a) ? true : z9;
            if (cv7Var == cv7.b) {
                ks9 ks9Var4 = ks9Var3;
                if (ks9Var4 != ks9Var2) {
                    ks9Var = ks9Var4;
                    z5 = z9;
                } else {
                    z5 = true;
                    ks9Var = ks9Var4;
                }
            } else {
                z5 = true;
                ks9Var = ks9Var3;
            }
            j09 j09VarA = ohc.a(j09VarD, ghcVar, ks9Var, z10, z5, t69Var2);
            mia.a.getClass();
            j09 j09VarF = jgb.F(qk2.J(j09VarA, urg.n), new p4c(18, jseVar2, aw2Var));
            xn8 xn8VarC = s21.c(ndb.b, true);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarF);
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
            l46Var2 = l46Var;
            final jse jseVar4 = jseVar2;
            final ks9 ks9Var5 = ks9Var;
            final t69 t69Var3 = t69Var2;
            z6 = z;
            ynb.f(jseVar4, z6, af1.b0(-673241599, new l26() { // from class: nv0
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    l46 l46Var4 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (l46Var4.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        goe goeVar2 = goeVar;
                        if (goeVar2 == null) {
                            goeVar2 = af8.e;
                        }
                        final t69 t69Var4 = t69Var3;
                        final ype ypeVar2 = ypeVar;
                        final mue mueVar2 = mueVar;
                        final ute uteVar4 = uteVar3;
                        final boolean z11 = zT;
                        final mre mreVar2 = mreVar;
                        final z2f z2fVar2 = z2fVar;
                        final jse jseVar5 = jseVar4;
                        final b41 b41Var2 = b41Var;
                        final boolean z12 = z;
                        final ghc ghcVar2 = ghcVar;
                        final ks9 ks9Var6 = ks9Var5;
                        final tze tzeVar3 = tzeVar;
                        final rfa rfaVar = rfaVarB;
                        final l26 l26Var2 = l26Var;
                        final wo7 wo7Var2 = wo7Var;
                        goeVar2.V(af1.b0(1969169726, new l26() { // from class: pv0
                            @Override // defpackage.l26
                            public final Object z(Object obj4, Object obj5) {
                                int i17;
                                int i18;
                                l46 l46Var5 = (l46) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (l46Var5.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    t69 t69Var5 = t69Var4;
                                    e89 e89VarW = z7f.w(t69Var5, l46Var5, 0);
                                    Object objR12 = l46Var5.R();
                                    i8c i8cVar3 = sf2.a;
                                    if (objR12 == i8cVar3) {
                                        objR12 = q1c.f(Boolean.FALSE);
                                        l46Var5.p0(objR12);
                                    }
                                    e89 e89Var = (e89) objR12;
                                    boolean zG5 = l46Var5.g(t69Var5);
                                    Object objR13 = l46Var5.R();
                                    if (zG5 || objR13 == i8cVar3) {
                                        objR13 = new jj4(t69Var5, e89Var, null);
                                        l46Var5.p0(objR13);
                                    }
                                    af1.o((l26) objR13, l46Var5, t69Var5);
                                    e7g e7gVar = (e7g) l46Var5.k(zg2.u);
                                    boolean zG6 = l46Var5.g(t69Var5) | l46Var5.g(e7gVar);
                                    Object objR14 = l46Var5.R();
                                    if (zG6 || objR14 == i8cVar3) {
                                        objR14 = zrd.b(new v6(20, e7gVar, e89VarW));
                                        l46Var5.p0(objR14);
                                    }
                                    h0e h0eVar = (h0e) objR14;
                                    ((Boolean) e89VarW.getValue()).getClass();
                                    ype ypeVar3 = ypeVar2;
                                    if (ypeVar3 instanceof xpe) {
                                        xpe xpeVar = (xpe) ypeVar3;
                                        i18 = xpeVar.a;
                                        i17 = xpeVar.b;
                                    } else {
                                        i17 = 1;
                                        i18 = 1;
                                    }
                                    ute uteVar5 = uteVar4;
                                    j09 j09VarZ = jgb.Z(g09.a, new g20(3, uteVar5));
                                    cn1.Y(i18, i17);
                                    mue mueVar3 = mueVar2;
                                    boolean z13 = z11;
                                    if ((i18 != 1 || i17 != Integer.MAX_VALUE) && !z13) {
                                        j09VarZ = j09VarZ.D(new oj6(mueVar3, i18, i17));
                                    }
                                    j09 j09VarF2 = oa7.F(j09VarZ.D(new sse(mueVar3)));
                                    boolean zBooleanValue = ((Boolean) h0eVar.getValue()).booleanValue();
                                    boolean zBooleanValue2 = ((Boolean) e89Var.getValue()).booleanValue();
                                    boolean z14 = mreVar2 == mre.b;
                                    z2f z2fVar3 = z2fVar2;
                                    jse jseVar6 = jseVar5;
                                    b41 b41Var3 = b41Var2;
                                    boolean z15 = z12;
                                    j09 j09VarD2 = j09VarF2.D(new xne(zBooleanValue, zBooleanValue2, z14, uteVar5, z2fVar3, jseVar6, b41Var3, z15, ghcVar2, ks9Var6, tzeVar3, rfaVar));
                                    xn8 xn8VarC2 = s21.c(ndb.b, true);
                                    int iHashCode2 = Long.hashCode(l46Var5.T);
                                    u8a u8aVarM2 = l46Var5.m();
                                    j09 j09VarJ2 = m93.J(l46Var5, j09VarD2);
                                    lf2.q.getClass();
                                    l46Var5.j0();
                                    if (l46Var5.S) {
                                        l46Var5.l(LayoutNode.h1);
                                    } else {
                                        l46Var5.s0();
                                    }
                                    dec.l(hj6.z, l46Var5, xn8VarC2);
                                    dec.l(hj6.y, l46Var5, u8aVarM2);
                                    dec.l(hj6.X, l46Var5, Integer.valueOf(iHashCode2));
                                    dec.k(l46Var5);
                                    dec.l(hj6.x, l46Var5, j09VarJ2);
                                    s21.a(new vse(uteVar5, z2fVar3, mueVar3, z13, l26Var2, wo7Var2), l46Var5, 0);
                                    if (z15 && ((Boolean) h0eVar.getValue()).booleanValue() && ((Boolean) jseVar6.k.getValue()).booleanValue()) {
                                        l46Var5.f0(-810654004);
                                        tv0.f(jseVar6, l46Var5, 0);
                                        l46Var5.f0(-810526873);
                                        tv0.e(jseVar6, l46Var5, 0);
                                        l46Var5.r(false);
                                        l46Var5.r(false);
                                    } else {
                                        l46Var5.f0(-810390690);
                                        l46Var5.r(false);
                                    }
                                    l46Var5.r(true);
                                } else {
                                    l46Var5.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var4), l46Var4, 6);
                    } else {
                        l46Var4.Z();
                    }
                    return wef.a;
                }
            }, l46Var2), l46Var2, ((i16 >> 3) & 112) | 384);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ov0(useVar, j09Var, z6, u47Var, mueVar, wo7Var, dwdVar, ypeVar, l26Var, t69Var, b41Var, goeVar, ghcVar, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x013a  */
    /* JADX WARN: Code duplicated, block: B:107:0x013e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0148  */
    /* JADX WARN: Code duplicated, block: B:110:0x014b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:118:0x0165  */
    /* JADX WARN: Code duplicated, block: B:122:0x0172  */
    /* JADX WARN: Code duplicated, block: B:123:0x0175  */
    /* JADX WARN: Code duplicated, block: B:125:0x017b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x0184  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:133:0x018f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0192  */
    /* JADX WARN: Code duplicated, block: B:136:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:160:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:172:0x0212 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x0214  */
    /* JADX WARN: Code duplicated, block: B:175:0x0218  */
    /* JADX WARN: Code duplicated, block: B:177:0x021b  */
    /* JADX WARN: Code duplicated, block: B:178:0x021e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0221  */
    /* JADX WARN: Code duplicated, block: B:181:0x0224  */
    /* JADX WARN: Code duplicated, block: B:183:0x0227  */
    /* JADX WARN: Code duplicated, block: B:185:0x022a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0232  */
    /* JADX WARN: Code duplicated, block: B:188:0x0236  */
    /* JADX WARN: Code duplicated, block: B:189:0x0238  */
    /* JADX WARN: Code duplicated, block: B:191:0x023c  */
    /* JADX WARN: Code duplicated, block: B:192:0x023e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0242  */
    /* JADX WARN: Code duplicated, block: B:195:0x0245  */
    /* JADX WARN: Code duplicated, block: B:198:0x024b  */
    /* JADX WARN: Code duplicated, block: B:200:0x025d  */
    /* JADX WARN: Code duplicated, block: B:202:0x029b  */
    /* JADX WARN: Code duplicated, block: B:205:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    public static final void b(final use useVar, final j09 j09Var, boolean z, u47 u47Var, mue mueVar, wo7 wo7Var, dwd dwdVar, ype ypeVar, l26 l26Var, t69 t69Var, final b41 b41Var, goe goeVar, ghc ghcVar, l46 l46Var, final int i, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        u47 u47Var2;
        int i10;
        int i11;
        mue mueVar2;
        int i12;
        int i13;
        wo7 wo7Var2;
        int i14;
        int i15;
        dwd dwdVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean zI;
        boolean z3;
        final ype ypeVar2;
        final goe goeVar2;
        final ghc ghcVar2;
        final u47 u47Var3;
        final mue mueVar3;
        final wo7 wo7Var3;
        final dwd dwdVar3;
        final boolean z4;
        final l26 l26Var2;
        final t69 t69Var2;
        ojb ojbVarV;
        mue mueVar4;
        wo7 wo7Var4;
        ype ypeVar3;
        l26 l26Var3;
        t69 t69Var3;
        goe goeVar3;
        ghc ghcVarT;
        goe goeVar4;
        int i30;
        l46Var.h0(469439921);
        if ((i & 6) == 0) {
            i4 = (l46Var.g(useVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= l46Var.g(j09Var) ? 32 : 16;
        }
        int i31 = i3 & 4;
        if (i31 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i4 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i3 & 8;
            i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i5 != 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                if (l46Var.h(false)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i4 |= i7;
            }
            i8 = i3 & 16;
            i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    u47Var2 = u47Var;
                    if (l46Var.g(u47Var2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                    mueVar2 = mueVar;
                } else {
                    mueVar2 = mueVar;
                    if ((i & 196608) == 0) {
                        if (l46Var.g(mueVar2)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    i4 |= 1572864;
                    wo7Var2 = wo7Var;
                } else {
                    wo7Var2 = wo7Var;
                    if ((i & 1572864) == 0) {
                        if (l46Var.g(wo7Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                }
                i15 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i15 != 0) {
                    i4 |= 12582912;
                    dwdVar2 = dwdVar;
                } else {
                    dwdVar2 = dwdVar;
                    if ((i & 12582912) == 0) {
                        if (l46Var.g(dwdVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i4 |= i16;
                    }
                }
                i17 = i3 & 256;
                if (i17 != 0) {
                    if ((i & 100663296) == 0) {
                        if (l46Var.g(ypeVar)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i4 |= i18;
                    }
                    i19 = i3 & 512;
                    if (i19 != 0) {
                        if ((i & 805306368) == 0) {
                            if (l46Var.i(l26Var)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i4 |= i20;
                        }
                        i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                        if (i21 != 0) {
                            i22 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (l46Var.g(t69Var)) {
                                i23 = 4;
                            } else {
                                i23 = 2;
                            }
                            i22 = i2 | i23;
                        } else {
                            i22 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            if (l46Var.g(b41Var)) {
                                i30 = 32;
                            } else {
                                i30 = 16;
                            }
                            i22 |= i30;
                        }
                        i24 = i22;
                        if ((i3 & 4096) != 0) {
                            i25 = i24 | 384;
                        } else if ((i2 & 384) == 0) {
                            if (l46Var.g(null)) {
                                i26 = 256;
                            } else {
                                i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            }
                            i25 = i24 | i26;
                        } else {
                            i25 = i24;
                        }
                        i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        if (i27 != 0) {
                            i29 = i25 | 3072;
                        } else {
                            i28 = i25;
                            if ((i2 & 3072) == 0) {
                                if ((i2 & 4096) == 0) {
                                    zI = l46Var.g(goeVar);
                                } else {
                                    zI = l46Var.i(goeVar);
                                }
                                if (zI) {
                                    i6 = 2048;
                                }
                                i29 = i28 | i6;
                            } else {
                                i29 = i28;
                            }
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0 && l46Var.g(ghcVar)) {
                                i9 = 16384;
                            }
                            i29 |= i9;
                        }
                        if ((i4 & 306783379) == 306783378 || (i29 & 9363) != 9362) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (l46Var.W(i4 & 1, z3)) {
                            l46Var.b0();
                            if ((i & 1) != 0 || l46Var.C()) {
                                if (i31 != 0) {
                                    z2 = true;
                                }
                                if (i8 != 0) {
                                    u47Var2 = null;
                                }
                                if (i11 != 0) {
                                    mueVar4 = mue.d;
                                } else {
                                    mueVar4 = mueVar2;
                                }
                                if (i13 != 0) {
                                    wo7Var4 = wo7.g;
                                } else {
                                    wo7Var4 = wo7Var2;
                                }
                                if (i15 != 0) {
                                    dwdVar2 = null;
                                }
                                if (i17 != 0) {
                                    ype.c0.getClass();
                                    ypeVar3 = wpe.b;
                                } else {
                                    ypeVar3 = ypeVar;
                                }
                                if (i19 != 0) {
                                    l26Var3 = null;
                                } else {
                                    l26Var3 = l26Var;
                                }
                                if (i21 != 0) {
                                    t69Var3 = null;
                                } else {
                                    t69Var3 = t69Var;
                                }
                                if (i27 != 0) {
                                    goeVar3 = null;
                                } else {
                                    goeVar3 = goeVar;
                                }
                                if ((i3 & 16384) != 0) {
                                    i29 &= -57345;
                                    ghcVarT = mh3.T(l46Var);
                                } else {
                                    ghcVarT = ghcVar;
                                }
                                goeVar4 = goeVar3;
                            } else {
                                l46Var.Z();
                                if ((i3 & 16384) != 0) {
                                    i29 &= -57345;
                                }
                                l26Var3 = l26Var;
                                goeVar4 = goeVar;
                                ghcVarT = ghcVar;
                                u47Var2 = u47Var2;
                                i4 = i4;
                                mueVar4 = mueVar2;
                                wo7Var4 = wo7Var2;
                                dwdVar2 = dwdVar2;
                                z2 = z2;
                                ypeVar3 = ypeVar;
                                t69Var3 = t69Var;
                            }
                            l46Var.s();
                            int i32 = i4 & 2147483646;
                            int i33 = (i29 & 14) | 384 | (i29 & 112);
                            int i34 = i29 << 3;
                            a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i32, i33 | (i34 & 7168) | (57344 & i34) | (i34 & 458752));
                            t69Var2 = t69Var3;
                            ghcVar2 = ghcVarT;
                            l26Var2 = l26Var3;
                            goeVar2 = goeVar4;
                            ypeVar2 = ypeVar3;
                            dwdVar3 = dwdVar2;
                            wo7Var3 = wo7Var4;
                            mueVar3 = mueVar4;
                            u47Var3 = u47Var2;
                            z4 = z2;
                        } else {
                            l46Var.Z();
                            ypeVar2 = ypeVar;
                            goeVar2 = goeVar;
                            ghcVar2 = ghcVar;
                            u47Var3 = u47Var2;
                            mueVar3 = mueVar2;
                            wo7Var3 = wo7Var2;
                            dwdVar3 = dwdVar2;
                            z4 = z2;
                            l26Var2 = l26Var;
                            t69Var2 = t69Var;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: fv0
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i | 1);
                                    int iP2 = k99.P(i2);
                                    tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i4 |= 805306368;
                    i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i21 != 0) {
                        i22 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (l46Var.g(t69Var)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i2 | i23;
                    } else {
                        i22 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        if (l46Var.g(b41Var)) {
                            i30 = 32;
                        } else {
                            i30 = 16;
                        }
                        i22 |= i30;
                    }
                    i24 = i22;
                    if ((i3 & 4096) != 0) {
                        i25 = i24 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (l46Var.g(null)) {
                            i26 = 256;
                        } else {
                            i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i25 = i24 | i26;
                    } else {
                        i25 = i24;
                    }
                    i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            if ((i2 & 4096) == 0) {
                                zI = l46Var.g(goeVar);
                            } else {
                                zI = l46Var.i(goeVar);
                            }
                            if (zI) {
                                i6 = 2048;
                            }
                            i29 = i28 | i6;
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i9 = 16384;
                        }
                        i29 |= i9;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i4 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i31 != 0) {
                                z2 = true;
                            }
                            if (i8 != 0) {
                                u47Var2 = null;
                            }
                            if (i11 != 0) {
                                mueVar4 = mue.d;
                            } else {
                                mueVar4 = mueVar2;
                            }
                            if (i13 != 0) {
                                wo7Var4 = wo7.g;
                            } else {
                                wo7Var4 = wo7Var2;
                            }
                            if (i15 != 0) {
                                dwdVar2 = null;
                            }
                            if (i17 != 0) {
                                ype.c0.getClass();
                                ypeVar3 = wpe.b;
                            } else {
                                ypeVar3 = ypeVar;
                            }
                            if (i19 != 0) {
                                l26Var3 = null;
                            } else {
                                l26Var3 = l26Var;
                            }
                            if (i21 != 0) {
                                t69Var3 = null;
                            } else {
                                t69Var3 = t69Var;
                            }
                            if (i27 != 0) {
                                goeVar3 = null;
                            } else {
                                goeVar3 = goeVar;
                            }
                            if ((i3 & 16384) != 0) {
                                i29 &= -57345;
                                ghcVarT = mh3.T(l46Var);
                            } else {
                                ghcVarT = ghcVar;
                            }
                            goeVar4 = goeVar3;
                        } else {
                            if (i31 != 0) {
                                z2 = true;
                            }
                            if (i8 != 0) {
                                u47Var2 = null;
                            }
                            if (i11 != 0) {
                                mueVar4 = mue.d;
                            } else {
                                mueVar4 = mueVar2;
                            }
                            if (i13 != 0) {
                                wo7Var4 = wo7.g;
                            } else {
                                wo7Var4 = wo7Var2;
                            }
                            if (i15 != 0) {
                                dwdVar2 = null;
                            }
                            if (i17 != 0) {
                                ype.c0.getClass();
                                ypeVar3 = wpe.b;
                            } else {
                                ypeVar3 = ypeVar;
                            }
                            if (i19 != 0) {
                                l26Var3 = null;
                            } else {
                                l26Var3 = l26Var;
                            }
                            if (i21 != 0) {
                                t69Var3 = null;
                            } else {
                                t69Var3 = t69Var;
                            }
                            if (i27 != 0) {
                                goeVar3 = null;
                            } else {
                                goeVar3 = goeVar;
                            }
                            if ((i3 & 16384) != 0) {
                                i29 &= -57345;
                                ghcVarT = mh3.T(l46Var);
                            } else {
                                ghcVarT = ghcVar;
                            }
                            goeVar4 = goeVar3;
                        }
                        l46Var.s();
                        int i35 = i4 & 2147483646;
                        int i36 = (i29 & 14) | 384 | (i29 & 112);
                        int i37 = i29 << 3;
                        a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i35, i36 | (i37 & 7168) | (57344 & i37) | (i37 & 458752));
                        t69Var2 = t69Var3;
                        ghcVar2 = ghcVarT;
                        l26Var2 = l26Var3;
                        goeVar2 = goeVar4;
                        ypeVar2 = ypeVar3;
                        dwdVar3 = dwdVar2;
                        wo7Var3 = wo7Var4;
                        mueVar3 = mueVar4;
                        u47Var3 = u47Var2;
                        z4 = z2;
                    } else {
                        l46Var.Z();
                        ypeVar2 = ypeVar;
                        goeVar2 = goeVar;
                        ghcVar2 = ghcVar;
                        u47Var3 = u47Var2;
                        mueVar3 = mueVar2;
                        wo7Var3 = wo7Var2;
                        dwdVar3 = dwdVar2;
                        z4 = z2;
                        l26Var2 = l26Var;
                        t69Var2 = t69Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: fv0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                int iP2 = k99.P(i2);
                                tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 100663296;
                i19 = i3 & 512;
                if (i19 != 0) {
                    if ((i & 805306368) == 0) {
                        if (l46Var.i(l26Var)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i4 |= i20;
                    }
                    i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i21 != 0) {
                        i22 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (l46Var.g(t69Var)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i2 | i23;
                    } else {
                        i22 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        if (l46Var.g(b41Var)) {
                            i30 = 32;
                        } else {
                            i30 = 16;
                        }
                        i22 |= i30;
                    }
                    i24 = i22;
                    if ((i3 & 4096) != 0) {
                        i25 = i24 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (l46Var.g(null)) {
                            i26 = 256;
                        } else {
                            i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i25 = i24 | i26;
                    } else {
                        i25 = i24;
                    }
                    i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            if ((i2 & 4096) == 0) {
                                zI = l46Var.g(goeVar);
                            } else {
                                zI = l46Var.i(goeVar);
                            }
                            if (zI) {
                                i6 = 2048;
                            }
                            i29 = i28 | i6;
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i9 = 16384;
                        }
                        i29 |= i9;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i4 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i31 != 0) {
                                z2 = true;
                            }
                            if (i8 != 0) {
                                u47Var2 = null;
                            }
                            if (i11 != 0) {
                                mueVar4 = mue.d;
                            } else {
                                mueVar4 = mueVar2;
                            }
                            if (i13 != 0) {
                                wo7Var4 = wo7.g;
                            } else {
                                wo7Var4 = wo7Var2;
                            }
                            if (i15 != 0) {
                                dwdVar2 = null;
                            }
                            if (i17 != 0) {
                                ype.c0.getClass();
                                ypeVar3 = wpe.b;
                            } else {
                                ypeVar3 = ypeVar;
                            }
                            if (i19 != 0) {
                                l26Var3 = null;
                            } else {
                                l26Var3 = l26Var;
                            }
                            if (i21 != 0) {
                                t69Var3 = null;
                            } else {
                                t69Var3 = t69Var;
                            }
                            if (i27 != 0) {
                                goeVar3 = null;
                            } else {
                                goeVar3 = goeVar;
                            }
                            if ((i3 & 16384) != 0) {
                                i29 &= -57345;
                                ghcVarT = mh3.T(l46Var);
                            } else {
                                ghcVarT = ghcVar;
                            }
                            goeVar4 = goeVar3;
                        } else {
                            if (i31 != 0) {
                                z2 = true;
                            }
                            if (i8 != 0) {
                                u47Var2 = null;
                            }
                            if (i11 != 0) {
                                mueVar4 = mue.d;
                            } else {
                                mueVar4 = mueVar2;
                            }
                            if (i13 != 0) {
                                wo7Var4 = wo7.g;
                            } else {
                                wo7Var4 = wo7Var2;
                            }
                            if (i15 != 0) {
                                dwdVar2 = null;
                            }
                            if (i17 != 0) {
                                ype.c0.getClass();
                                ypeVar3 = wpe.b;
                            } else {
                                ypeVar3 = ypeVar;
                            }
                            if (i19 != 0) {
                                l26Var3 = null;
                            } else {
                                l26Var3 = l26Var;
                            }
                            if (i21 != 0) {
                                t69Var3 = null;
                            } else {
                                t69Var3 = t69Var;
                            }
                            if (i27 != 0) {
                                goeVar3 = null;
                            } else {
                                goeVar3 = goeVar;
                            }
                            if ((i3 & 16384) != 0) {
                                i29 &= -57345;
                                ghcVarT = mh3.T(l46Var);
                            } else {
                                ghcVarT = ghcVar;
                            }
                            goeVar4 = goeVar3;
                        }
                        l46Var.s();
                        int i38 = i4 & 2147483646;
                        int i39 = (i29 & 14) | 384 | (i29 & 112);
                        int i310 = i29 << 3;
                        a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i38, i39 | (i310 & 7168) | (57344 & i310) | (i310 & 458752));
                        t69Var2 = t69Var3;
                        ghcVar2 = ghcVarT;
                        l26Var2 = l26Var3;
                        goeVar2 = goeVar4;
                        ypeVar2 = ypeVar3;
                        dwdVar3 = dwdVar2;
                        wo7Var3 = wo7Var4;
                        mueVar3 = mueVar4;
                        u47Var3 = u47Var2;
                        z4 = z2;
                    } else {
                        l46Var.Z();
                        ypeVar2 = ypeVar;
                        goeVar2 = goeVar;
                        ghcVar2 = ghcVar;
                        u47Var3 = u47Var2;
                        mueVar3 = mueVar2;
                        wo7Var3 = wo7Var2;
                        dwdVar3 = dwdVar2;
                        z4 = z2;
                        l26Var2 = l26Var;
                        t69Var2 = t69Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: fv0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                int iP2 = k99.P(i2);
                                tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 805306368;
                i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(t69Var)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (l46Var.g(b41Var)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i22 |= i30;
                }
                i24 = i22;
                if ((i3 & 4096) != 0) {
                    i25 = i24 | 384;
                } else if ((i2 & 384) == 0) {
                    if (l46Var.g(null)) {
                        i26 = 256;
                    } else {
                        i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i25 = i24 | i26;
                } else {
                    i25 = i24;
                }
                i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        if ((i2 & 4096) == 0) {
                            zI = l46Var.g(goeVar);
                        } else {
                            zI = l46Var.i(goeVar);
                        }
                        if (zI) {
                            i6 = 2048;
                        }
                        i29 = i28 | i6;
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i9 = 16384;
                    }
                    i29 |= i9;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i4 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    } else {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    }
                    l46Var.s();
                    int i311 = i4 & 2147483646;
                    int i312 = (i29 & 14) | 384 | (i29 & 112);
                    int i313 = i29 << 3;
                    a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i311, i312 | (i313 & 7168) | (57344 & i313) | (i313 & 458752));
                    t69Var2 = t69Var3;
                    ghcVar2 = ghcVarT;
                    l26Var2 = l26Var3;
                    goeVar2 = goeVar4;
                    ypeVar2 = ypeVar3;
                    dwdVar3 = dwdVar2;
                    wo7Var3 = wo7Var4;
                    mueVar3 = mueVar4;
                    u47Var3 = u47Var2;
                    z4 = z2;
                } else {
                    l46Var.Z();
                    ypeVar2 = ypeVar;
                    goeVar2 = goeVar;
                    ghcVar2 = ghcVar;
                    u47Var3 = u47Var2;
                    mueVar3 = mueVar2;
                    wo7Var3 = wo7Var2;
                    dwdVar3 = dwdVar2;
                    z4 = z2;
                    l26Var2 = l26Var;
                    t69Var2 = t69Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: fv0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            u47Var2 = u47Var;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
                mueVar2 = mueVar;
            } else {
                mueVar2 = mueVar;
                if ((i & 196608) == 0) {
                    if (l46Var.g(mueVar2)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                i4 |= 1572864;
                wo7Var2 = wo7Var;
            } else {
                wo7Var2 = wo7Var;
                if ((i & 1572864) == 0) {
                    if (l46Var.g(wo7Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
            }
            i15 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i15 != 0) {
                i4 |= 12582912;
                dwdVar2 = dwdVar;
            } else {
                dwdVar2 = dwdVar;
                if ((i & 12582912) == 0) {
                    if (l46Var.g(dwdVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i4 |= i16;
                }
            }
            i17 = i3 & 256;
            if (i17 != 0) {
                if ((i & 100663296) == 0) {
                    if (l46Var.g(ypeVar)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i4 |= i18;
                }
                i19 = i3 & 512;
                if (i19 != 0) {
                    if ((i & 805306368) == 0) {
                        if (l46Var.i(l26Var)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i4 |= i20;
                    }
                    i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i21 != 0) {
                        i22 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (l46Var.g(t69Var)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i2 | i23;
                    } else {
                        i22 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        if (l46Var.g(b41Var)) {
                            i30 = 32;
                        } else {
                            i30 = 16;
                        }
                        i22 |= i30;
                    }
                    i24 = i22;
                    if ((i3 & 4096) != 0) {
                        i25 = i24 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (l46Var.g(null)) {
                            i26 = 256;
                        } else {
                            i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i25 = i24 | i26;
                    } else {
                        i25 = i24;
                    }
                    i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            if ((i2 & 4096) == 0) {
                                zI = l46Var.g(goeVar);
                            } else {
                                zI = l46Var.i(goeVar);
                            }
                            if (zI) {
                                i6 = 2048;
                            }
                            i29 = i28 | i6;
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i9 = 16384;
                        }
                        i29 |= i9;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i4 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i31 != 0) {
                                z2 = true;
                            }
                            if (i8 != 0) {
                                u47Var2 = null;
                            }
                            if (i11 != 0) {
                                mueVar4 = mue.d;
                            } else {
                                mueVar4 = mueVar2;
                            }
                            if (i13 != 0) {
                                wo7Var4 = wo7.g;
                            } else {
                                wo7Var4 = wo7Var2;
                            }
                            if (i15 != 0) {
                                dwdVar2 = null;
                            }
                            if (i17 != 0) {
                                ype.c0.getClass();
                                ypeVar3 = wpe.b;
                            } else {
                                ypeVar3 = ypeVar;
                            }
                            if (i19 != 0) {
                                l26Var3 = null;
                            } else {
                                l26Var3 = l26Var;
                            }
                            if (i21 != 0) {
                                t69Var3 = null;
                            } else {
                                t69Var3 = t69Var;
                            }
                            if (i27 != 0) {
                                goeVar3 = null;
                            } else {
                                goeVar3 = goeVar;
                            }
                            if ((i3 & 16384) != 0) {
                                i29 &= -57345;
                                ghcVarT = mh3.T(l46Var);
                            } else {
                                ghcVarT = ghcVar;
                            }
                            goeVar4 = goeVar3;
                        } else {
                            if (i31 != 0) {
                                z2 = true;
                            }
                            if (i8 != 0) {
                                u47Var2 = null;
                            }
                            if (i11 != 0) {
                                mueVar4 = mue.d;
                            } else {
                                mueVar4 = mueVar2;
                            }
                            if (i13 != 0) {
                                wo7Var4 = wo7.g;
                            } else {
                                wo7Var4 = wo7Var2;
                            }
                            if (i15 != 0) {
                                dwdVar2 = null;
                            }
                            if (i17 != 0) {
                                ype.c0.getClass();
                                ypeVar3 = wpe.b;
                            } else {
                                ypeVar3 = ypeVar;
                            }
                            if (i19 != 0) {
                                l26Var3 = null;
                            } else {
                                l26Var3 = l26Var;
                            }
                            if (i21 != 0) {
                                t69Var3 = null;
                            } else {
                                t69Var3 = t69Var;
                            }
                            if (i27 != 0) {
                                goeVar3 = null;
                            } else {
                                goeVar3 = goeVar;
                            }
                            if ((i3 & 16384) != 0) {
                                i29 &= -57345;
                                ghcVarT = mh3.T(l46Var);
                            } else {
                                ghcVarT = ghcVar;
                            }
                            goeVar4 = goeVar3;
                        }
                        l46Var.s();
                        int i314 = i4 & 2147483646;
                        int i315 = (i29 & 14) | 384 | (i29 & 112);
                        int i316 = i29 << 3;
                        a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i314, i315 | (i316 & 7168) | (57344 & i316) | (i316 & 458752));
                        t69Var2 = t69Var3;
                        ghcVar2 = ghcVarT;
                        l26Var2 = l26Var3;
                        goeVar2 = goeVar4;
                        ypeVar2 = ypeVar3;
                        dwdVar3 = dwdVar2;
                        wo7Var3 = wo7Var4;
                        mueVar3 = mueVar4;
                        u47Var3 = u47Var2;
                        z4 = z2;
                    } else {
                        l46Var.Z();
                        ypeVar2 = ypeVar;
                        goeVar2 = goeVar;
                        ghcVar2 = ghcVar;
                        u47Var3 = u47Var2;
                        mueVar3 = mueVar2;
                        wo7Var3 = wo7Var2;
                        dwdVar3 = dwdVar2;
                        z4 = z2;
                        l26Var2 = l26Var;
                        t69Var2 = t69Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: fv0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                int iP2 = k99.P(i2);
                                tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 805306368;
                i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(t69Var)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (l46Var.g(b41Var)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i22 |= i30;
                }
                i24 = i22;
                if ((i3 & 4096) != 0) {
                    i25 = i24 | 384;
                } else if ((i2 & 384) == 0) {
                    if (l46Var.g(null)) {
                        i26 = 256;
                    } else {
                        i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i25 = i24 | i26;
                } else {
                    i25 = i24;
                }
                i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        if ((i2 & 4096) == 0) {
                            zI = l46Var.g(goeVar);
                        } else {
                            zI = l46Var.i(goeVar);
                        }
                        if (zI) {
                            i6 = 2048;
                        }
                        i29 = i28 | i6;
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i9 = 16384;
                    }
                    i29 |= i9;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i4 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    } else {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    }
                    l46Var.s();
                    int i317 = i4 & 2147483646;
                    int i318 = (i29 & 14) | 384 | (i29 & 112);
                    int i319 = i29 << 3;
                    a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i317, i318 | (i319 & 7168) | (57344 & i319) | (i319 & 458752));
                    t69Var2 = t69Var3;
                    ghcVar2 = ghcVarT;
                    l26Var2 = l26Var3;
                    goeVar2 = goeVar4;
                    ypeVar2 = ypeVar3;
                    dwdVar3 = dwdVar2;
                    wo7Var3 = wo7Var4;
                    mueVar3 = mueVar4;
                    u47Var3 = u47Var2;
                    z4 = z2;
                } else {
                    l46Var.Z();
                    ypeVar2 = ypeVar;
                    goeVar2 = goeVar;
                    ghcVar2 = ghcVar;
                    u47Var3 = u47Var2;
                    mueVar3 = mueVar2;
                    wo7Var3 = wo7Var2;
                    dwdVar3 = dwdVar2;
                    z4 = z2;
                    l26Var2 = l26Var;
                    t69Var2 = t69Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: fv0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            i19 = i3 & 512;
            if (i19 != 0) {
                if ((i & 805306368) == 0) {
                    if (l46Var.i(l26Var)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i4 |= i20;
                }
                i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(t69Var)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (l46Var.g(b41Var)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i22 |= i30;
                }
                i24 = i22;
                if ((i3 & 4096) != 0) {
                    i25 = i24 | 384;
                } else if ((i2 & 384) == 0) {
                    if (l46Var.g(null)) {
                        i26 = 256;
                    } else {
                        i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i25 = i24 | i26;
                } else {
                    i25 = i24;
                }
                i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        if ((i2 & 4096) == 0) {
                            zI = l46Var.g(goeVar);
                        } else {
                            zI = l46Var.i(goeVar);
                        }
                        if (zI) {
                            i6 = 2048;
                        }
                        i29 = i28 | i6;
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i9 = 16384;
                    }
                    i29 |= i9;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i4 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    } else {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    }
                    l46Var.s();
                    int i3110 = i4 & 2147483646;
                    int i3111 = (i29 & 14) | 384 | (i29 & 112);
                    int i3112 = i29 << 3;
                    a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i3110, i3111 | (i3112 & 7168) | (57344 & i3112) | (i3112 & 458752));
                    t69Var2 = t69Var3;
                    ghcVar2 = ghcVarT;
                    l26Var2 = l26Var3;
                    goeVar2 = goeVar4;
                    ypeVar2 = ypeVar3;
                    dwdVar3 = dwdVar2;
                    wo7Var3 = wo7Var4;
                    mueVar3 = mueVar4;
                    u47Var3 = u47Var2;
                    z4 = z2;
                } else {
                    l46Var.Z();
                    ypeVar2 = ypeVar;
                    goeVar2 = goeVar;
                    ghcVar2 = ghcVar;
                    u47Var3 = u47Var2;
                    mueVar3 = mueVar2;
                    wo7Var3 = wo7Var2;
                    dwdVar3 = dwdVar2;
                    z4 = z2;
                    l26Var2 = l26Var;
                    t69Var2 = t69Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: fv0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 805306368;
            i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i21 != 0) {
                i22 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (l46Var.g(t69Var)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i2 | i23;
            } else {
                i22 = i2;
            }
            if ((i2 & 48) == 0) {
                if (l46Var.g(b41Var)) {
                    i30 = 32;
                } else {
                    i30 = 16;
                }
                i22 |= i30;
            }
            i24 = i22;
            if ((i3 & 4096) != 0) {
                i25 = i24 | 384;
            } else if ((i2 & 384) == 0) {
                if (l46Var.g(null)) {
                    i26 = 256;
                } else {
                    i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i25 = i24 | i26;
            } else {
                i25 = i24;
            }
            i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    if ((i2 & 4096) == 0) {
                        zI = l46Var.g(goeVar);
                    } else {
                        zI = l46Var.i(goeVar);
                    }
                    if (zI) {
                        i6 = 2048;
                    }
                    i29 = i28 | i6;
                } else {
                    i29 = i28;
                }
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i9 = 16384;
                }
                i29 |= i9;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (l46Var.W(i4 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i31 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        u47Var2 = null;
                    }
                    if (i11 != 0) {
                        mueVar4 = mue.d;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i13 != 0) {
                        wo7Var4 = wo7.g;
                    } else {
                        wo7Var4 = wo7Var2;
                    }
                    if (i15 != 0) {
                        dwdVar2 = null;
                    }
                    if (i17 != 0) {
                        ype.c0.getClass();
                        ypeVar3 = wpe.b;
                    } else {
                        ypeVar3 = ypeVar;
                    }
                    if (i19 != 0) {
                        l26Var3 = null;
                    } else {
                        l26Var3 = l26Var;
                    }
                    if (i21 != 0) {
                        t69Var3 = null;
                    } else {
                        t69Var3 = t69Var;
                    }
                    if (i27 != 0) {
                        goeVar3 = null;
                    } else {
                        goeVar3 = goeVar;
                    }
                    if ((i3 & 16384) != 0) {
                        i29 &= -57345;
                        ghcVarT = mh3.T(l46Var);
                    } else {
                        ghcVarT = ghcVar;
                    }
                    goeVar4 = goeVar3;
                } else {
                    if (i31 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        u47Var2 = null;
                    }
                    if (i11 != 0) {
                        mueVar4 = mue.d;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i13 != 0) {
                        wo7Var4 = wo7.g;
                    } else {
                        wo7Var4 = wo7Var2;
                    }
                    if (i15 != 0) {
                        dwdVar2 = null;
                    }
                    if (i17 != 0) {
                        ype.c0.getClass();
                        ypeVar3 = wpe.b;
                    } else {
                        ypeVar3 = ypeVar;
                    }
                    if (i19 != 0) {
                        l26Var3 = null;
                    } else {
                        l26Var3 = l26Var;
                    }
                    if (i21 != 0) {
                        t69Var3 = null;
                    } else {
                        t69Var3 = t69Var;
                    }
                    if (i27 != 0) {
                        goeVar3 = null;
                    } else {
                        goeVar3 = goeVar;
                    }
                    if ((i3 & 16384) != 0) {
                        i29 &= -57345;
                        ghcVarT = mh3.T(l46Var);
                    } else {
                        ghcVarT = ghcVar;
                    }
                    goeVar4 = goeVar3;
                }
                l46Var.s();
                int i3113 = i4 & 2147483646;
                int i3114 = (i29 & 14) | 384 | (i29 & 112);
                int i3115 = i29 << 3;
                a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i3113, i3114 | (i3115 & 7168) | (57344 & i3115) | (i3115 & 458752));
                t69Var2 = t69Var3;
                ghcVar2 = ghcVarT;
                l26Var2 = l26Var3;
                goeVar2 = goeVar4;
                ypeVar2 = ypeVar3;
                dwdVar3 = dwdVar2;
                wo7Var3 = wo7Var4;
                mueVar3 = mueVar4;
                u47Var3 = u47Var2;
                z4 = z2;
            } else {
                l46Var.Z();
                ypeVar2 = ypeVar;
                goeVar2 = goeVar;
                ghcVar2 = ghcVar;
                u47Var3 = u47Var2;
                mueVar3 = mueVar2;
                wo7Var3 = wo7Var2;
                dwdVar3 = dwdVar2;
                z4 = z2;
                l26Var2 = l26Var;
                t69Var2 = t69Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: fv0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 384;
        z2 = z;
        i5 = i3 & 8;
        i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            if (l46Var.h(false)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i4 |= i7;
        }
        i8 = i3 & 16;
        i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                u47Var2 = u47Var;
                if (l46Var.g(u47Var2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
                mueVar2 = mueVar;
            } else {
                mueVar2 = mueVar;
                if ((i & 196608) == 0) {
                    if (l46Var.g(mueVar2)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                i4 |= 1572864;
                wo7Var2 = wo7Var;
            } else {
                wo7Var2 = wo7Var;
                if ((i & 1572864) == 0) {
                    if (l46Var.g(wo7Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
            }
            i15 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i15 != 0) {
                i4 |= 12582912;
                dwdVar2 = dwdVar;
            } else {
                dwdVar2 = dwdVar;
                if ((i & 12582912) == 0) {
                    if (l46Var.g(dwdVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i4 |= i16;
                }
            }
            i17 = i3 & 256;
            if (i17 != 0) {
                if ((i & 100663296) == 0) {
                    if (l46Var.g(ypeVar)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i4 |= i18;
                }
                i19 = i3 & 512;
                if (i19 != 0) {
                    if ((i & 805306368) == 0) {
                        if (l46Var.i(l26Var)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i4 |= i20;
                    }
                    i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i21 != 0) {
                        i22 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (l46Var.g(t69Var)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i2 | i23;
                    } else {
                        i22 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        if (l46Var.g(b41Var)) {
                            i30 = 32;
                        } else {
                            i30 = 16;
                        }
                        i22 |= i30;
                    }
                    i24 = i22;
                    if ((i3 & 4096) != 0) {
                        i25 = i24 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (l46Var.g(null)) {
                            i26 = 256;
                        } else {
                            i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i25 = i24 | i26;
                    } else {
                        i25 = i24;
                    }
                    i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            if ((i2 & 4096) == 0) {
                                zI = l46Var.g(goeVar);
                            } else {
                                zI = l46Var.i(goeVar);
                            }
                            if (zI) {
                                i6 = 2048;
                            }
                            i29 = i28 | i6;
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i9 = 16384;
                        }
                        i29 |= i9;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i4 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i31 != 0) {
                                z2 = true;
                            }
                            if (i8 != 0) {
                                u47Var2 = null;
                            }
                            if (i11 != 0) {
                                mueVar4 = mue.d;
                            } else {
                                mueVar4 = mueVar2;
                            }
                            if (i13 != 0) {
                                wo7Var4 = wo7.g;
                            } else {
                                wo7Var4 = wo7Var2;
                            }
                            if (i15 != 0) {
                                dwdVar2 = null;
                            }
                            if (i17 != 0) {
                                ype.c0.getClass();
                                ypeVar3 = wpe.b;
                            } else {
                                ypeVar3 = ypeVar;
                            }
                            if (i19 != 0) {
                                l26Var3 = null;
                            } else {
                                l26Var3 = l26Var;
                            }
                            if (i21 != 0) {
                                t69Var3 = null;
                            } else {
                                t69Var3 = t69Var;
                            }
                            if (i27 != 0) {
                                goeVar3 = null;
                            } else {
                                goeVar3 = goeVar;
                            }
                            if ((i3 & 16384) != 0) {
                                i29 &= -57345;
                                ghcVarT = mh3.T(l46Var);
                            } else {
                                ghcVarT = ghcVar;
                            }
                            goeVar4 = goeVar3;
                        } else {
                            if (i31 != 0) {
                                z2 = true;
                            }
                            if (i8 != 0) {
                                u47Var2 = null;
                            }
                            if (i11 != 0) {
                                mueVar4 = mue.d;
                            } else {
                                mueVar4 = mueVar2;
                            }
                            if (i13 != 0) {
                                wo7Var4 = wo7.g;
                            } else {
                                wo7Var4 = wo7Var2;
                            }
                            if (i15 != 0) {
                                dwdVar2 = null;
                            }
                            if (i17 != 0) {
                                ype.c0.getClass();
                                ypeVar3 = wpe.b;
                            } else {
                                ypeVar3 = ypeVar;
                            }
                            if (i19 != 0) {
                                l26Var3 = null;
                            } else {
                                l26Var3 = l26Var;
                            }
                            if (i21 != 0) {
                                t69Var3 = null;
                            } else {
                                t69Var3 = t69Var;
                            }
                            if (i27 != 0) {
                                goeVar3 = null;
                            } else {
                                goeVar3 = goeVar;
                            }
                            if ((i3 & 16384) != 0) {
                                i29 &= -57345;
                                ghcVarT = mh3.T(l46Var);
                            } else {
                                ghcVarT = ghcVar;
                            }
                            goeVar4 = goeVar3;
                        }
                        l46Var.s();
                        int i3116 = i4 & 2147483646;
                        int i3117 = (i29 & 14) | 384 | (i29 & 112);
                        int i3118 = i29 << 3;
                        a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i3116, i3117 | (i3118 & 7168) | (57344 & i3118) | (i3118 & 458752));
                        t69Var2 = t69Var3;
                        ghcVar2 = ghcVarT;
                        l26Var2 = l26Var3;
                        goeVar2 = goeVar4;
                        ypeVar2 = ypeVar3;
                        dwdVar3 = dwdVar2;
                        wo7Var3 = wo7Var4;
                        mueVar3 = mueVar4;
                        u47Var3 = u47Var2;
                        z4 = z2;
                    } else {
                        l46Var.Z();
                        ypeVar2 = ypeVar;
                        goeVar2 = goeVar;
                        ghcVar2 = ghcVar;
                        u47Var3 = u47Var2;
                        mueVar3 = mueVar2;
                        wo7Var3 = wo7Var2;
                        dwdVar3 = dwdVar2;
                        z4 = z2;
                        l26Var2 = l26Var;
                        t69Var2 = t69Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: fv0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                int iP2 = k99.P(i2);
                                tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 805306368;
                i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(t69Var)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (l46Var.g(b41Var)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i22 |= i30;
                }
                i24 = i22;
                if ((i3 & 4096) != 0) {
                    i25 = i24 | 384;
                } else if ((i2 & 384) == 0) {
                    if (l46Var.g(null)) {
                        i26 = 256;
                    } else {
                        i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i25 = i24 | i26;
                } else {
                    i25 = i24;
                }
                i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        if ((i2 & 4096) == 0) {
                            zI = l46Var.g(goeVar);
                        } else {
                            zI = l46Var.i(goeVar);
                        }
                        if (zI) {
                            i6 = 2048;
                        }
                        i29 = i28 | i6;
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i9 = 16384;
                    }
                    i29 |= i9;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i4 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    } else {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    }
                    l46Var.s();
                    int i3119 = i4 & 2147483646;
                    int i31110 = (i29 & 14) | 384 | (i29 & 112);
                    int i31111 = i29 << 3;
                    a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i3119, i31110 | (i31111 & 7168) | (57344 & i31111) | (i31111 & 458752));
                    t69Var2 = t69Var3;
                    ghcVar2 = ghcVarT;
                    l26Var2 = l26Var3;
                    goeVar2 = goeVar4;
                    ypeVar2 = ypeVar3;
                    dwdVar3 = dwdVar2;
                    wo7Var3 = wo7Var4;
                    mueVar3 = mueVar4;
                    u47Var3 = u47Var2;
                    z4 = z2;
                } else {
                    l46Var.Z();
                    ypeVar2 = ypeVar;
                    goeVar2 = goeVar;
                    ghcVar2 = ghcVar;
                    u47Var3 = u47Var2;
                    mueVar3 = mueVar2;
                    wo7Var3 = wo7Var2;
                    dwdVar3 = dwdVar2;
                    z4 = z2;
                    l26Var2 = l26Var;
                    t69Var2 = t69Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: fv0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            i19 = i3 & 512;
            if (i19 != 0) {
                if ((i & 805306368) == 0) {
                    if (l46Var.i(l26Var)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i4 |= i20;
                }
                i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(t69Var)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (l46Var.g(b41Var)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i22 |= i30;
                }
                i24 = i22;
                if ((i3 & 4096) != 0) {
                    i25 = i24 | 384;
                } else if ((i2 & 384) == 0) {
                    if (l46Var.g(null)) {
                        i26 = 256;
                    } else {
                        i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i25 = i24 | i26;
                } else {
                    i25 = i24;
                }
                i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        if ((i2 & 4096) == 0) {
                            zI = l46Var.g(goeVar);
                        } else {
                            zI = l46Var.i(goeVar);
                        }
                        if (zI) {
                            i6 = 2048;
                        }
                        i29 = i28 | i6;
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i9 = 16384;
                    }
                    i29 |= i9;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i4 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    } else {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    }
                    l46Var.s();
                    int i31112 = i4 & 2147483646;
                    int i31113 = (i29 & 14) | 384 | (i29 & 112);
                    int i31114 = i29 << 3;
                    a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i31112, i31113 | (i31114 & 7168) | (57344 & i31114) | (i31114 & 458752));
                    t69Var2 = t69Var3;
                    ghcVar2 = ghcVarT;
                    l26Var2 = l26Var3;
                    goeVar2 = goeVar4;
                    ypeVar2 = ypeVar3;
                    dwdVar3 = dwdVar2;
                    wo7Var3 = wo7Var4;
                    mueVar3 = mueVar4;
                    u47Var3 = u47Var2;
                    z4 = z2;
                } else {
                    l46Var.Z();
                    ypeVar2 = ypeVar;
                    goeVar2 = goeVar;
                    ghcVar2 = ghcVar;
                    u47Var3 = u47Var2;
                    mueVar3 = mueVar2;
                    wo7Var3 = wo7Var2;
                    dwdVar3 = dwdVar2;
                    z4 = z2;
                    l26Var2 = l26Var;
                    t69Var2 = t69Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: fv0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 805306368;
            i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i21 != 0) {
                i22 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (l46Var.g(t69Var)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i2 | i23;
            } else {
                i22 = i2;
            }
            if ((i2 & 48) == 0) {
                if (l46Var.g(b41Var)) {
                    i30 = 32;
                } else {
                    i30 = 16;
                }
                i22 |= i30;
            }
            i24 = i22;
            if ((i3 & 4096) != 0) {
                i25 = i24 | 384;
            } else if ((i2 & 384) == 0) {
                if (l46Var.g(null)) {
                    i26 = 256;
                } else {
                    i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i25 = i24 | i26;
            } else {
                i25 = i24;
            }
            i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    if ((i2 & 4096) == 0) {
                        zI = l46Var.g(goeVar);
                    } else {
                        zI = l46Var.i(goeVar);
                    }
                    if (zI) {
                        i6 = 2048;
                    }
                    i29 = i28 | i6;
                } else {
                    i29 = i28;
                }
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i9 = 16384;
                }
                i29 |= i9;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (l46Var.W(i4 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i31 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        u47Var2 = null;
                    }
                    if (i11 != 0) {
                        mueVar4 = mue.d;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i13 != 0) {
                        wo7Var4 = wo7.g;
                    } else {
                        wo7Var4 = wo7Var2;
                    }
                    if (i15 != 0) {
                        dwdVar2 = null;
                    }
                    if (i17 != 0) {
                        ype.c0.getClass();
                        ypeVar3 = wpe.b;
                    } else {
                        ypeVar3 = ypeVar;
                    }
                    if (i19 != 0) {
                        l26Var3 = null;
                    } else {
                        l26Var3 = l26Var;
                    }
                    if (i21 != 0) {
                        t69Var3 = null;
                    } else {
                        t69Var3 = t69Var;
                    }
                    if (i27 != 0) {
                        goeVar3 = null;
                    } else {
                        goeVar3 = goeVar;
                    }
                    if ((i3 & 16384) != 0) {
                        i29 &= -57345;
                        ghcVarT = mh3.T(l46Var);
                    } else {
                        ghcVarT = ghcVar;
                    }
                    goeVar4 = goeVar3;
                } else {
                    if (i31 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        u47Var2 = null;
                    }
                    if (i11 != 0) {
                        mueVar4 = mue.d;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i13 != 0) {
                        wo7Var4 = wo7.g;
                    } else {
                        wo7Var4 = wo7Var2;
                    }
                    if (i15 != 0) {
                        dwdVar2 = null;
                    }
                    if (i17 != 0) {
                        ype.c0.getClass();
                        ypeVar3 = wpe.b;
                    } else {
                        ypeVar3 = ypeVar;
                    }
                    if (i19 != 0) {
                        l26Var3 = null;
                    } else {
                        l26Var3 = l26Var;
                    }
                    if (i21 != 0) {
                        t69Var3 = null;
                    } else {
                        t69Var3 = t69Var;
                    }
                    if (i27 != 0) {
                        goeVar3 = null;
                    } else {
                        goeVar3 = goeVar;
                    }
                    if ((i3 & 16384) != 0) {
                        i29 &= -57345;
                        ghcVarT = mh3.T(l46Var);
                    } else {
                        ghcVarT = ghcVar;
                    }
                    goeVar4 = goeVar3;
                }
                l46Var.s();
                int i31115 = i4 & 2147483646;
                int i31116 = (i29 & 14) | 384 | (i29 & 112);
                int i31117 = i29 << 3;
                a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i31115, i31116 | (i31117 & 7168) | (57344 & i31117) | (i31117 & 458752));
                t69Var2 = t69Var3;
                ghcVar2 = ghcVarT;
                l26Var2 = l26Var3;
                goeVar2 = goeVar4;
                ypeVar2 = ypeVar3;
                dwdVar3 = dwdVar2;
                wo7Var3 = wo7Var4;
                mueVar3 = mueVar4;
                u47Var3 = u47Var2;
                z4 = z2;
            } else {
                l46Var.Z();
                ypeVar2 = ypeVar;
                goeVar2 = goeVar;
                ghcVar2 = ghcVar;
                u47Var3 = u47Var2;
                mueVar3 = mueVar2;
                wo7Var3 = wo7Var2;
                dwdVar3 = dwdVar2;
                z4 = z2;
                l26Var2 = l26Var;
                t69Var2 = t69Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: fv0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 24576;
        u47Var2 = u47Var;
        i11 = i3 & 32;
        if (i11 != 0) {
            i4 |= 196608;
            mueVar2 = mueVar;
        } else {
            mueVar2 = mueVar;
            if ((i & 196608) == 0) {
                if (l46Var.g(mueVar2)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
        }
        i13 = i3 & 64;
        if (i13 != 0) {
            i4 |= 1572864;
            wo7Var2 = wo7Var;
        } else {
            wo7Var2 = wo7Var;
            if ((i & 1572864) == 0) {
                if (l46Var.g(wo7Var2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i4 |= i14;
            }
        }
        i15 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i15 != 0) {
            i4 |= 12582912;
            dwdVar2 = dwdVar;
        } else {
            dwdVar2 = dwdVar;
            if ((i & 12582912) == 0) {
                if (l46Var.g(dwdVar2)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i4 |= i16;
            }
        }
        i17 = i3 & 256;
        if (i17 != 0) {
            if ((i & 100663296) == 0) {
                if (l46Var.g(ypeVar)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i4 |= i18;
            }
            i19 = i3 & 512;
            if (i19 != 0) {
                if ((i & 805306368) == 0) {
                    if (l46Var.i(l26Var)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i4 |= i20;
                }
                i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.g(t69Var)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (l46Var.g(b41Var)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i22 |= i30;
                }
                i24 = i22;
                if ((i3 & 4096) != 0) {
                    i25 = i24 | 384;
                } else if ((i2 & 384) == 0) {
                    if (l46Var.g(null)) {
                        i26 = 256;
                    } else {
                        i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i25 = i24 | i26;
                } else {
                    i25 = i24;
                }
                i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        if ((i2 & 4096) == 0) {
                            zI = l46Var.g(goeVar);
                        } else {
                            zI = l46Var.i(goeVar);
                        }
                        if (zI) {
                            i6 = 2048;
                        }
                        i29 = i28 | i6;
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i9 = 16384;
                    }
                    i29 |= i9;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i4 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    } else {
                        if (i31 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            u47Var2 = null;
                        }
                        if (i11 != 0) {
                            mueVar4 = mue.d;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i13 != 0) {
                            wo7Var4 = wo7.g;
                        } else {
                            wo7Var4 = wo7Var2;
                        }
                        if (i15 != 0) {
                            dwdVar2 = null;
                        }
                        if (i17 != 0) {
                            ype.c0.getClass();
                            ypeVar3 = wpe.b;
                        } else {
                            ypeVar3 = ypeVar;
                        }
                        if (i19 != 0) {
                            l26Var3 = null;
                        } else {
                            l26Var3 = l26Var;
                        }
                        if (i21 != 0) {
                            t69Var3 = null;
                        } else {
                            t69Var3 = t69Var;
                        }
                        if (i27 != 0) {
                            goeVar3 = null;
                        } else {
                            goeVar3 = goeVar;
                        }
                        if ((i3 & 16384) != 0) {
                            i29 &= -57345;
                            ghcVarT = mh3.T(l46Var);
                        } else {
                            ghcVarT = ghcVar;
                        }
                        goeVar4 = goeVar3;
                    }
                    l46Var.s();
                    int i31118 = i4 & 2147483646;
                    int i31119 = (i29 & 14) | 384 | (i29 & 112);
                    int i311110 = i29 << 3;
                    a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i31118, i31119 | (i311110 & 7168) | (57344 & i311110) | (i311110 & 458752));
                    t69Var2 = t69Var3;
                    ghcVar2 = ghcVarT;
                    l26Var2 = l26Var3;
                    goeVar2 = goeVar4;
                    ypeVar2 = ypeVar3;
                    dwdVar3 = dwdVar2;
                    wo7Var3 = wo7Var4;
                    mueVar3 = mueVar4;
                    u47Var3 = u47Var2;
                    z4 = z2;
                } else {
                    l46Var.Z();
                    ypeVar2 = ypeVar;
                    goeVar2 = goeVar;
                    ghcVar2 = ghcVar;
                    u47Var3 = u47Var2;
                    mueVar3 = mueVar2;
                    wo7Var3 = wo7Var2;
                    dwdVar3 = dwdVar2;
                    z4 = z2;
                    l26Var2 = l26Var;
                    t69Var2 = t69Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: fv0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 805306368;
            i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i21 != 0) {
                i22 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (l46Var.g(t69Var)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i2 | i23;
            } else {
                i22 = i2;
            }
            if ((i2 & 48) == 0) {
                if (l46Var.g(b41Var)) {
                    i30 = 32;
                } else {
                    i30 = 16;
                }
                i22 |= i30;
            }
            i24 = i22;
            if ((i3 & 4096) != 0) {
                i25 = i24 | 384;
            } else if ((i2 & 384) == 0) {
                if (l46Var.g(null)) {
                    i26 = 256;
                } else {
                    i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i25 = i24 | i26;
            } else {
                i25 = i24;
            }
            i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    if ((i2 & 4096) == 0) {
                        zI = l46Var.g(goeVar);
                    } else {
                        zI = l46Var.i(goeVar);
                    }
                    if (zI) {
                        i6 = 2048;
                    }
                    i29 = i28 | i6;
                } else {
                    i29 = i28;
                }
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i9 = 16384;
                }
                i29 |= i9;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (l46Var.W(i4 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i31 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        u47Var2 = null;
                    }
                    if (i11 != 0) {
                        mueVar4 = mue.d;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i13 != 0) {
                        wo7Var4 = wo7.g;
                    } else {
                        wo7Var4 = wo7Var2;
                    }
                    if (i15 != 0) {
                        dwdVar2 = null;
                    }
                    if (i17 != 0) {
                        ype.c0.getClass();
                        ypeVar3 = wpe.b;
                    } else {
                        ypeVar3 = ypeVar;
                    }
                    if (i19 != 0) {
                        l26Var3 = null;
                    } else {
                        l26Var3 = l26Var;
                    }
                    if (i21 != 0) {
                        t69Var3 = null;
                    } else {
                        t69Var3 = t69Var;
                    }
                    if (i27 != 0) {
                        goeVar3 = null;
                    } else {
                        goeVar3 = goeVar;
                    }
                    if ((i3 & 16384) != 0) {
                        i29 &= -57345;
                        ghcVarT = mh3.T(l46Var);
                    } else {
                        ghcVarT = ghcVar;
                    }
                    goeVar4 = goeVar3;
                } else {
                    if (i31 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        u47Var2 = null;
                    }
                    if (i11 != 0) {
                        mueVar4 = mue.d;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i13 != 0) {
                        wo7Var4 = wo7.g;
                    } else {
                        wo7Var4 = wo7Var2;
                    }
                    if (i15 != 0) {
                        dwdVar2 = null;
                    }
                    if (i17 != 0) {
                        ype.c0.getClass();
                        ypeVar3 = wpe.b;
                    } else {
                        ypeVar3 = ypeVar;
                    }
                    if (i19 != 0) {
                        l26Var3 = null;
                    } else {
                        l26Var3 = l26Var;
                    }
                    if (i21 != 0) {
                        t69Var3 = null;
                    } else {
                        t69Var3 = t69Var;
                    }
                    if (i27 != 0) {
                        goeVar3 = null;
                    } else {
                        goeVar3 = goeVar;
                    }
                    if ((i3 & 16384) != 0) {
                        i29 &= -57345;
                        ghcVarT = mh3.T(l46Var);
                    } else {
                        ghcVarT = ghcVar;
                    }
                    goeVar4 = goeVar3;
                }
                l46Var.s();
                int i311111 = i4 & 2147483646;
                int i311112 = (i29 & 14) | 384 | (i29 & 112);
                int i311113 = i29 << 3;
                a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i311111, i311112 | (i311113 & 7168) | (57344 & i311113) | (i311113 & 458752));
                t69Var2 = t69Var3;
                ghcVar2 = ghcVarT;
                l26Var2 = l26Var3;
                goeVar2 = goeVar4;
                ypeVar2 = ypeVar3;
                dwdVar3 = dwdVar2;
                wo7Var3 = wo7Var4;
                mueVar3 = mueVar4;
                u47Var3 = u47Var2;
                z4 = z2;
            } else {
                l46Var.Z();
                ypeVar2 = ypeVar;
                goeVar2 = goeVar;
                ghcVar2 = ghcVar;
                u47Var3 = u47Var2;
                mueVar3 = mueVar2;
                wo7Var3 = wo7Var2;
                dwdVar3 = dwdVar2;
                z4 = z2;
                l26Var2 = l26Var;
                t69Var2 = t69Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: fv0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 100663296;
        i19 = i3 & 512;
        if (i19 != 0) {
            if ((i & 805306368) == 0) {
                if (l46Var.i(l26Var)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i4 |= i20;
            }
            i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i21 != 0) {
                i22 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (l46Var.g(t69Var)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i2 | i23;
            } else {
                i22 = i2;
            }
            if ((i2 & 48) == 0) {
                if (l46Var.g(b41Var)) {
                    i30 = 32;
                } else {
                    i30 = 16;
                }
                i22 |= i30;
            }
            i24 = i22;
            if ((i3 & 4096) != 0) {
                i25 = i24 | 384;
            } else if ((i2 & 384) == 0) {
                if (l46Var.g(null)) {
                    i26 = 256;
                } else {
                    i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i25 = i24 | i26;
            } else {
                i25 = i24;
            }
            i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    if ((i2 & 4096) == 0) {
                        zI = l46Var.g(goeVar);
                    } else {
                        zI = l46Var.i(goeVar);
                    }
                    if (zI) {
                        i6 = 2048;
                    }
                    i29 = i28 | i6;
                } else {
                    i29 = i28;
                }
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i9 = 16384;
                }
                i29 |= i9;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (l46Var.W(i4 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i31 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        u47Var2 = null;
                    }
                    if (i11 != 0) {
                        mueVar4 = mue.d;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i13 != 0) {
                        wo7Var4 = wo7.g;
                    } else {
                        wo7Var4 = wo7Var2;
                    }
                    if (i15 != 0) {
                        dwdVar2 = null;
                    }
                    if (i17 != 0) {
                        ype.c0.getClass();
                        ypeVar3 = wpe.b;
                    } else {
                        ypeVar3 = ypeVar;
                    }
                    if (i19 != 0) {
                        l26Var3 = null;
                    } else {
                        l26Var3 = l26Var;
                    }
                    if (i21 != 0) {
                        t69Var3 = null;
                    } else {
                        t69Var3 = t69Var;
                    }
                    if (i27 != 0) {
                        goeVar3 = null;
                    } else {
                        goeVar3 = goeVar;
                    }
                    if ((i3 & 16384) != 0) {
                        i29 &= -57345;
                        ghcVarT = mh3.T(l46Var);
                    } else {
                        ghcVarT = ghcVar;
                    }
                    goeVar4 = goeVar3;
                } else {
                    if (i31 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        u47Var2 = null;
                    }
                    if (i11 != 0) {
                        mueVar4 = mue.d;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i13 != 0) {
                        wo7Var4 = wo7.g;
                    } else {
                        wo7Var4 = wo7Var2;
                    }
                    if (i15 != 0) {
                        dwdVar2 = null;
                    }
                    if (i17 != 0) {
                        ype.c0.getClass();
                        ypeVar3 = wpe.b;
                    } else {
                        ypeVar3 = ypeVar;
                    }
                    if (i19 != 0) {
                        l26Var3 = null;
                    } else {
                        l26Var3 = l26Var;
                    }
                    if (i21 != 0) {
                        t69Var3 = null;
                    } else {
                        t69Var3 = t69Var;
                    }
                    if (i27 != 0) {
                        goeVar3 = null;
                    } else {
                        goeVar3 = goeVar;
                    }
                    if ((i3 & 16384) != 0) {
                        i29 &= -57345;
                        ghcVarT = mh3.T(l46Var);
                    } else {
                        ghcVarT = ghcVar;
                    }
                    goeVar4 = goeVar3;
                }
                l46Var.s();
                int i311114 = i4 & 2147483646;
                int i311115 = (i29 & 14) | 384 | (i29 & 112);
                int i311116 = i29 << 3;
                a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i311114, i311115 | (i311116 & 7168) | (57344 & i311116) | (i311116 & 458752));
                t69Var2 = t69Var3;
                ghcVar2 = ghcVarT;
                l26Var2 = l26Var3;
                goeVar2 = goeVar4;
                ypeVar2 = ypeVar3;
                dwdVar3 = dwdVar2;
                wo7Var3 = wo7Var4;
                mueVar3 = mueVar4;
                u47Var3 = u47Var2;
                z4 = z2;
            } else {
                l46Var.Z();
                ypeVar2 = ypeVar;
                goeVar2 = goeVar;
                ghcVar2 = ghcVar;
                u47Var3 = u47Var2;
                mueVar3 = mueVar2;
                wo7Var3 = wo7Var2;
                dwdVar3 = dwdVar2;
                z4 = z2;
                l26Var2 = l26Var;
                t69Var2 = t69Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: fv0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 805306368;
        i21 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i21 != 0) {
            i22 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (l46Var.g(t69Var)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i22 = i2 | i23;
        } else {
            i22 = i2;
        }
        if ((i2 & 48) == 0) {
            if (l46Var.g(b41Var)) {
                i30 = 32;
            } else {
                i30 = 16;
            }
            i22 |= i30;
        }
        i24 = i22;
        if ((i3 & 4096) != 0) {
            i25 = i24 | 384;
        } else if ((i2 & 384) == 0) {
            if (l46Var.g(null)) {
                i26 = 256;
            } else {
                i26 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i25 = i24 | i26;
        } else {
            i25 = i24;
        }
        i27 = i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i27 != 0) {
            i29 = i25 | 3072;
        } else {
            i28 = i25;
            if ((i2 & 3072) == 0) {
                if ((i2 & 4096) == 0) {
                    zI = l46Var.g(goeVar);
                } else {
                    zI = l46Var.i(goeVar);
                }
                if (zI) {
                    i6 = 2048;
                }
                i29 = i28 | i6;
            } else {
                i29 = i28;
            }
        }
        if ((i2 & 24576) != 0) {
            if ((i3 & 16384) == 0) {
                i9 = 16384;
            }
            i29 |= i9;
        }
        if ((i4 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (l46Var.W(i4 & 1, z3)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i31 != 0) {
                    z2 = true;
                }
                if (i8 != 0) {
                    u47Var2 = null;
                }
                if (i11 != 0) {
                    mueVar4 = mue.d;
                } else {
                    mueVar4 = mueVar2;
                }
                if (i13 != 0) {
                    wo7Var4 = wo7.g;
                } else {
                    wo7Var4 = wo7Var2;
                }
                if (i15 != 0) {
                    dwdVar2 = null;
                }
                if (i17 != 0) {
                    ype.c0.getClass();
                    ypeVar3 = wpe.b;
                } else {
                    ypeVar3 = ypeVar;
                }
                if (i19 != 0) {
                    l26Var3 = null;
                } else {
                    l26Var3 = l26Var;
                }
                if (i21 != 0) {
                    t69Var3 = null;
                } else {
                    t69Var3 = t69Var;
                }
                if (i27 != 0) {
                    goeVar3 = null;
                } else {
                    goeVar3 = goeVar;
                }
                if ((i3 & 16384) != 0) {
                    i29 &= -57345;
                    ghcVarT = mh3.T(l46Var);
                } else {
                    ghcVarT = ghcVar;
                }
                goeVar4 = goeVar3;
            } else {
                if (i31 != 0) {
                    z2 = true;
                }
                if (i8 != 0) {
                    u47Var2 = null;
                }
                if (i11 != 0) {
                    mueVar4 = mue.d;
                } else {
                    mueVar4 = mueVar2;
                }
                if (i13 != 0) {
                    wo7Var4 = wo7.g;
                } else {
                    wo7Var4 = wo7Var2;
                }
                if (i15 != 0) {
                    dwdVar2 = null;
                }
                if (i17 != 0) {
                    ype.c0.getClass();
                    ypeVar3 = wpe.b;
                } else {
                    ypeVar3 = ypeVar;
                }
                if (i19 != 0) {
                    l26Var3 = null;
                } else {
                    l26Var3 = l26Var;
                }
                if (i21 != 0) {
                    t69Var3 = null;
                } else {
                    t69Var3 = t69Var;
                }
                if (i27 != 0) {
                    goeVar3 = null;
                } else {
                    goeVar3 = goeVar;
                }
                if ((i3 & 16384) != 0) {
                    i29 &= -57345;
                    ghcVarT = mh3.T(l46Var);
                } else {
                    ghcVarT = ghcVar;
                }
                goeVar4 = goeVar3;
            }
            l46Var.s();
            int i311117 = i4 & 2147483646;
            int i311118 = (i29 & 14) | 384 | (i29 & 112);
            int i311119 = i29 << 3;
            a(useVar, j09Var, z2, u47Var2, mueVar4, wo7Var4, dwdVar2, ypeVar3, l26Var3, t69Var3, b41Var, goeVar4, ghcVarT, l46Var, i311117, i311118 | (i311119 & 7168) | (57344 & i311119) | (i311119 & 458752));
            t69Var2 = t69Var3;
            ghcVar2 = ghcVarT;
            l26Var2 = l26Var3;
            goeVar2 = goeVar4;
            ypeVar2 = ypeVar3;
            dwdVar3 = dwdVar2;
            wo7Var3 = wo7Var4;
            mueVar3 = mueVar4;
            u47Var3 = u47Var2;
            z4 = z2;
        } else {
            l46Var.Z();
            ypeVar2 = ypeVar;
            goeVar2 = goeVar;
            ghcVar2 = ghcVar;
            u47Var3 = u47Var2;
            mueVar3 = mueVar2;
            wo7Var3 = wo7Var2;
            dwdVar3 = dwdVar2;
            z4 = z2;
            l26Var2 = l26Var;
            t69Var2 = t69Var;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: fv0
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i | 1);
                    int iP2 = k99.P(i2);
                    tv0.b(useVar, j09Var, z4, u47Var3, mueVar3, wo7Var3, dwdVar3, ypeVar2, l26Var2, t69Var2, b41Var, goeVar2, ghcVar2, (l46) obj, iP, iP2, i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void c(zse zseVar, a26 a26Var, j09 j09Var, boolean z, mue mueVar, wo7 wo7Var, uo7 uo7Var, boolean z2, int i, int i2, syf syfVar, a26 a26Var2, t69 t69Var, dtd dtdVar, dd2 dd2Var, l46 l46Var, int i3) {
        a26 a26Var3;
        a26 a26Var4;
        l46Var.h0(-971111025);
        int i4 = i3 | (l46Var.g(zseVar) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        boolean zH = l46Var.h(false);
        int i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        int i6 = i;
        int i7 = i4 | (zH ? 16384 : 8192) | (l46Var.g(mueVar) ? 131072 : 65536) | (l46Var.g(wo7Var) ? 1048576 : 524288) | (l46Var.g(uo7Var) ? 8388608 : 4194304) | (l46Var.h(z2) ? 67108864 : 33554432) | (l46Var.e(i6) ? 536870912 : 268435456);
        int i8 = 196608 | (l46Var.e(i2) ? 4 : 2) | (l46Var.g(syfVar) ? 32 : 16) | 384 | (l46Var.g(t69Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.g(dtdVar)) {
            i5 = 16384;
        }
        int i9 = i8 | i5;
        if (l46Var.W(i7 & 1, ((i7 & 306783379) == 306783378 && (74899 & i9) == 74898) ? false : true)) {
            l46Var.b0();
            int i10 = i3 & 1;
            i8c i8cVar = sf2.a;
            if (i10 == 0 || l46Var.C()) {
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new wu0(2);
                    l46Var.p0(objR);
                }
                a26Var4 = (a26) objR;
            } else {
                l46Var.Z();
                a26Var4 = a26Var2;
            }
            l46Var.s();
            rx6 rx6VarB = wo7Var.b(z2);
            boolean z3 = !z2;
            int i11 = z2 ? 1 : i2;
            if (z2) {
                i6 = 1;
            }
            boolean z4 = ((i7 & 14) == 4) | ((i7 & 112) == 32);
            Object objR2 = l46Var.R();
            if (z4 || objR2 == i8cVar) {
                objR2 = new l0(17, zseVar, a26Var);
                l46Var.p0(objR2);
            }
            int i12 = i9 << 9;
            lmg.F(zseVar, (a26) objR2, j09Var, mueVar, syfVar, a26Var4, t69Var, dtdVar, z3, i6, i11, rx6VarB, uo7Var, z, dd2Var, l46Var, (i7 & 910) | ((i7 >> 6) & 7168) | (i12 & 57344) | 196608 | (i12 & 3670016) | (i12 & 29360128), ((i7 >> 15) & 896) | (i7 & 7168) | (i7 & 57344) | 196608);
            a26Var3 = a26Var4;
        } else {
            l46Var.Z();
            a26Var3 = a26Var2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jv0(zseVar, a26Var, j09Var, z, mueVar, wo7Var, uo7Var, z2, i, i2, syfVar, a26Var3, t69Var, dtdVar, dd2Var, i3, 1);
        }
    }

    public static final void d(String str, a26 a26Var, j09 j09Var, boolean z, mue mueVar, wo7 wo7Var, uo7 uo7Var, boolean z2, int i, int i2, syf syfVar, a26 a26Var2, t69 t69Var, dtd dtdVar, dd2 dd2Var, l46 l46Var, int i3) {
        a26 a26Var3;
        a26 a26Var4;
        l46Var.h0(2026950908);
        int i4 = i3 | (l46Var.g(str) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        boolean zH = l46Var.h(false);
        int i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        int i6 = i4 | (zH ? 16384 : 8192) | (l46Var.g(mueVar) ? 131072 : 65536) | (l46Var.g(wo7Var) ? 1048576 : 524288) | (l46Var.g(uo7Var) ? 8388608 : 4194304) | (l46Var.h(z2) ? 67108864 : 33554432) | (l46Var.e(i) ? 536870912 : 268435456);
        int i7 = 196608 | (l46Var.e(i2) ? 4 : 2) | (l46Var.g(syfVar) ? 32 : 16) | 384 | (l46Var.g(t69Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.g(dtdVar)) {
            i5 = 16384;
        }
        int i8 = i7 | i5;
        if (l46Var.W(i6 & 1, ((i6 & 306783379) == 306783378 && (74899 & i8) == 74898) ? false : true)) {
            l46Var.b0();
            int i9 = i3 & 1;
            Object obj = sf2.a;
            if (i9 == 0 || l46Var.C()) {
                Object objR = l46Var.R();
                if (objR == obj) {
                    objR = new wu0(1);
                    l46Var.p0(objR);
                }
                a26Var4 = (a26) objR;
            } else {
                l46Var.Z();
                a26Var4 = a26Var2;
            }
            l46Var.s();
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = q1c.f(new zse(6, 0L, str));
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            zse zseVar = (zse) e89Var.getValue();
            zse zseVar2 = new zse(new k00(str), zseVar.b, zseVar.c);
            boolean zG = l46Var.g(zseVar2);
            Object objR3 = l46Var.R();
            if (zG || objR3 == obj) {
                objR3 = new v6(19, zseVar2, e89Var);
                l46Var.p0(objR3);
            }
            af1.u((x16) objR3, l46Var);
            boolean z3 = (i6 & 14) == 4;
            Object objR4 = l46Var.R();
            if (z3 || objR4 == obj) {
                objR4 = q1c.f(str);
                l46Var.p0(objR4);
            }
            e89 e89Var2 = (e89) objR4;
            rx6 rx6VarB = wo7Var.b(z2);
            boolean z4 = !z2;
            int i10 = z2 ? 1 : i2;
            int i11 = z2 ? 1 : i;
            boolean zG2 = l46Var.g(e89Var2) | ((i6 & 112) == 32);
            Object objR5 = l46Var.R();
            if (zG2 || objR5 == obj) {
                objR5 = new iv0(a26Var, e89Var, e89Var2, 0);
                l46Var.p0(objR5);
            }
            int i12 = i8 << 9;
            a26 a26Var5 = a26Var4;
            lmg.F(zseVar2, (a26) objR5, j09Var, mueVar, syfVar, a26Var5, t69Var, dtdVar, z4, i11, i10, rx6VarB, uo7Var, z, dd2Var, l46Var, (i6 & 896) | ((i6 >> 6) & 7168) | (i12 & 57344) | 196608 | (3670016 & i12) | (i12 & 29360128), (i6 & 57344) | ((i6 >> 15) & 896) | (i6 & 7168) | 196608);
            a26Var3 = a26Var5;
        } else {
            l46Var.Z();
            a26Var3 = a26Var2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jv0(str, a26Var, j09Var, z, mueVar, wo7Var, uo7Var, z2, i, i2, syfVar, a26Var3, t69Var, dtdVar, dd2Var, i3, 0);
        }
    }

    public static final void e(jse jseVar, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(1991581797);
        int i2 = (l46Var.i(jseVar) ? 4 : 2) | i;
        int i3 = 1;
        int i4 = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            boolean zG = l46Var.g(jseVar);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = zrd.b(new hv0(jseVar, i4));
                l46Var.p0(objR);
            }
            if (((Boolean) ((h0e) objR).getValue()).booleanValue()) {
                l46Var.f0(535437134);
                boolean zI = l46Var.i(jseVar);
                Object objR2 = l46Var.R();
                if (zI || objR2 == i8cVar) {
                    objR2 = new rv0(jseVar, 0);
                    l46Var.p0(objR2);
                }
                ul9 ul9Var = (ul9) objR2;
                boolean zI2 = l46Var.i(jseVar);
                Object objR3 = l46Var.R();
                if (zI2 || objR3 == i8cVar) {
                    objR3 = new sv0(jseVar, i4);
                    l46Var.p0(objR3);
                }
                l46Var2 = l46Var;
                fr.a(ul9Var, ibe.a(g09.a, jseVar, (PointerInputEventHandler) objR3), a, l46Var2, 384, 0);
                l46Var2.r(false);
            } else {
                l46Var2 = l46Var;
                l46Var2.f0(535820573);
                l46Var2.r(false);
            }
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gv0(jseVar, i, i3);
        }
    }

    public static final void f(jse jseVar, l46 l46Var, int i) {
        g09 g09Var;
        l46Var.h0(2025287684);
        int i2 = 2;
        int i3 = (l46Var.i(jseVar) ? 4 : 2) | i;
        int i4 = 1;
        int i5 = 0;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            boolean zG = l46Var.g(jseVar);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = zrd.b(new hv0(jseVar, i4));
                l46Var.p0(objR);
            }
            gpe gpeVar = (gpe) ((h0e) objR).getValue();
            boolean z = gpeVar.a;
            g09 g09Var2 = g09.a;
            if (z) {
                l46Var.f0(-354609545);
                boolean zI = l46Var.i(jseVar);
                Object objR2 = l46Var.R();
                if (zI || objR2 == i8cVar) {
                    objR2 = new rv0(jseVar, 1);
                    l46Var.p0(objR2);
                }
                ul9 ul9Var = (ul9) objR2;
                txb txbVar = gpeVar.d;
                boolean z2 = gpeVar.e;
                boolean zI2 = l46Var.i(jseVar);
                Object objR3 = l46Var.R();
                if (zI2 || objR3 == i8cVar) {
                    objR3 = new sv0(jseVar, i4);
                    l46Var.p0(objR3);
                }
                g09Var = g09Var2;
                i7h.h(ul9Var, true, txbVar, z2, a, gpeVar.c, ibe.a(g09Var2, jseVar, (PointerInputEventHandler) objR3), l46Var, 24624, 0);
                l46Var.r(false);
            } else {
                g09Var = g09Var2;
                l46Var.f0(-353981826);
                l46Var.r(false);
            }
            boolean zG2 = l46Var.g(jseVar);
            Object objR4 = l46Var.R();
            if (zG2 || objR4 == i8cVar) {
                objR4 = zrd.b(new hv0(jseVar, i2));
                l46Var.p0(objR4);
            }
            gpe gpeVar2 = (gpe) ((h0e) objR4).getValue();
            if (gpeVar2.a) {
                l46Var.f0(-353488678);
                boolean zI3 = l46Var.i(jseVar);
                Object objR5 = l46Var.R();
                if (zI3 || objR5 == i8cVar) {
                    objR5 = new rv0(jseVar, 2);
                    l46Var.p0(objR5);
                }
                ul9 ul9Var2 = (ul9) objR5;
                txb txbVar2 = gpeVar2.d;
                boolean z3 = gpeVar2.e;
                boolean zI4 = l46Var.i(jseVar);
                Object objR6 = l46Var.R();
                if (zI4 || objR6 == i8cVar) {
                    objR6 = new sv0(jseVar, i2);
                    l46Var.p0(objR6);
                }
                i7h.h(ul9Var2, false, txbVar2, z3, a, gpeVar2.c, ibe.a(g09Var, jseVar, (PointerInputEventHandler) objR6), l46Var, 24624, 0);
                l46Var.r(false);
            } else {
                l46Var.f0(-352863842);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gv0(jseVar, i, i5);
        }
    }
}
