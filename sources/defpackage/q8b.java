package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.network.ErrorCodes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q8b {
    public static final long a = abg.d(4289302239L);
    public static final long b = abg.d(4287067624L);
    public static final long c = abg.d(4284833265L);
    public static final long d = abg.d(4294965414L);
    public static final long e = abg.d(4286207201L);
    public static final float f = 16.0f;
    public static final float g = 6.0f;
    public static final float h = 3.0f;
    public static final List i = t72.I(new eud(-80.0f, -16.0f, 8.0f, ErrorCodes.THROWABLE, 0), new eud(-102.0f, 4.0f, 12.0f, 1700, 450), new eud(-68.0f, 18.0f, 6.0f, 900, 850), new eud(90.0f, -15.0f, 11.0f, 1400, 200), new eud(104.0f, 9.0f, 7.0f, 1000, 650));

    /* JADX WARN: Code duplicated, block: B:104:0x0224  */
    /* JADX WARN: Code duplicated, block: B:107:0x0254  */
    /* JADX WARN: Code duplicated, block: B:108:0x0258  */
    /* JADX WARN: Code duplicated, block: B:111:0x0287 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0289  */
    /* JADX WARN: Code duplicated, block: B:114:0x029c  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:119:0x032a  */
    /* JADX WARN: Code duplicated, block: B:120:0x032c  */
    /* JADX WARN: Code duplicated, block: B:127:0x033c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0370  */
    /* JADX WARN: Code duplicated, block: B:132:0x037c  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0142  */
    /* JADX WARN: Code duplicated, block: B:78:0x0156  */
    /* JADX WARN: Code duplicated, block: B:81:0x016a  */
    /* JADX WARN: Code duplicated, block: B:82:0x016c  */
    /* JADX WARN: Code duplicated, block: B:86:0x017a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x0196  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e4  */
    public static final void a(String str, x16 x16Var, j09 j09Var, r8b r8bVar, boolean z, l46 l46Var, int i2, int i3) {
        int i4;
        boolean z2;
        boolean z3;
        r8b r8bVar2;
        boolean z4;
        ojb ojbVarV;
        r8b r8bVar3;
        boolean z5;
        gh6 gh6VarW0;
        Object objR;
        i8c i8cVar;
        r8b r8bVar4;
        int i5;
        final boolean z6;
        m27 m27VarW;
        m27 m27VarW2;
        float f2;
        final float f3;
        float fC;
        int i6;
        boolean z7;
        boolean zG;
        Object objR2;
        boolean z8;
        boolean zD;
        Object objR3;
        boolean z9;
        boolean z10;
        Object objR4;
        boolean z11;
        ov7 ov7Var;
        boolean zD2;
        Object objR5;
        int iOrdinal;
        boolean z12;
        mue mueVarP;
        float f4;
        boolean z13;
        boolean z14;
        Object objR6;
        r8b r8bVar5;
        l46 l46Var2 = l46Var;
        str.getClass();
        x16Var.getClass();
        l46Var2.h0(-526861670);
        if ((i2 & 6) == 0) {
            i4 = (l46Var2.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var2.i(x16Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var2.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= l46Var2.e(r8bVar == null ? -1 : r8bVar.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i8 = i3 & 16;
        if (i8 == 0) {
            if ((i2 & 24576) == 0) {
                z2 = z;
                i4 |= l46Var2.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((i4 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var2.W(i4 & 1, z3)) {
                if (i7 != 0) {
                    r8bVar3 = r8b.Large;
                } else {
                    r8bVar3 = r8bVar;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                gh6VarW0 = kj0.w0(l46Var2);
                objR = l46Var2.R();
                i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = ib8.e(l46Var2);
                }
                t69 t69Var = (t69) objR;
                p27 p27VarC0 = af1.c0("quin_sparkle_button", l46Var2, 0);
                r8bVar4 = r8bVar3;
                i5 = i4;
                z6 = z5;
                m27VarW = af1.w(p27VarC0, 1.0f, 1.03f, b21.D(b21.T(1000, 0, hs4.a, 2), lrb.b, 4), "quin_sparkle_button_scale", l46Var2, 29112, 0);
                m27VarW2 = af1.w(p27VarC0, 0.0f, 1.0f, b21.D(b21.T(3000, 0, hs4.c, 2), lrb.a, 4), "quin_sparkle_button_comet", l46Var, 29112, 0);
                if (z6) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.54f;
                }
                if (if9.B(l46Var)) {
                    f3 = 0.55f;
                } else {
                    f3 = 0.9f;
                }
                fC = r8bVar4.c() / 2.0f;
                y6c y6cVarB = a7c.b(fC);
                j09 j09VarA = b.a(j09Var, r8bVar4.b(), r8bVar4.c());
                i6 = 57344 & i5;
                if (i6 == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zG = z7 | l46Var.g(m27VarW);
                objR2 = l46Var.R();
                if (zG || objR2 == i8cVar) {
                    objR2 = new bs0(z6, m27VarW, 11);
                    l46Var.p0(objR2);
                }
                j09 j09VarX = bzd.x(j09VarA, (a26) objR2);
                if (i6 == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zD = z8 | l46Var.d(f3);
                objR3 = l46Var.R();
                if (zD || objR3 == i8cVar) {
                    objR3 = new a26() { // from class: p8b
                        @Override // defpackage.a26
                        public final Object d(Object obj) {
                            sn4 sn4Var = (sn4) obj;
                            sn4Var.getClass();
                            if (z6) {
                                float fP0 = sn4Var.p0(q8b.f);
                                float fP1 = sn4Var.p0(q8b.g);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) / 2.0f;
                                vl1 vl1VarP = sn4Var.v0().p();
                                Paint paint = new Paint(1);
                                paint.setStyle(Paint.Style.FILL);
                                paint.setShader(new LinearGradient(0.0f, 0.0f, Float.intBitsToFloat((int) (sn4Var.f() >> 32)), 0.0f, new int[]{abg.Z(q8b.d), abg.Z(q8b.e)}, (float[]) null, Shader.TileMode.CLAMP));
                                paint.setMaskFilter(new BlurMaskFilter(fP0, BlurMaskFilter.Blur.NORMAL));
                                paint.setAlpha(mh3.o((int) (f3 * 255.0f), 0, 255));
                                mp.b(vl1VarP).drawRoundRect(0.0f, fP1, Float.intBitsToFloat((int) (sn4Var.f() >> 32)), Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) + fP1, fIntBitsToFloat, fIntBitsToFloat, paint);
                            }
                            return wef.a;
                        }
                    };
                    l46Var.p0(objR3);
                }
                j09 j09VarS = b21.s(j09VarX, (a26) objR3);
                boolean zI = l46Var.i(gh6VarW0);
                if ((i5 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zI | z9;
                objR4 = l46Var.R();
                if (z10 || objR4 == i8cVar) {
                    objR4 = new sj2(gh6VarW0, x16Var, 6);
                    l46Var.p0(objR4);
                }
                j09 j09VarB = androidx.compose.foundation.b.b(j09VarS, t69Var, null, z6, null, (x16) objR4, 24);
                xn8 xn8VarC = s21.c(ndb.f, false);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarB);
                lf2.q.getClass();
                l46Var.j0();
                z11 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z11) {
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
                d31 d31Var = d31.a;
                g09 g09Var = g09.a;
                j09 j09VarE = oa7.E(d31Var.b(g09Var), y6cVarB);
                zD2 = l46Var.d(f2) | l46Var.d(fC);
                objR5 = l46Var.R();
                if (zD2 || objR5 == i8cVar) {
                    objR5 = new qi2(f2, fC, 2);
                    l46Var.p0(objR5);
                }
                j09 j09VarS2 = b21.s(j09VarE, (a26) objR5);
                xn8 xn8VarC2 = s21.c(ndb.b, false);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarS2);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, xn8VarC2);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                c(z6, r8bVar4, l46Var, 6 | ((i5 >> 9) & 112) | ((i5 >> 3) & 896));
                l46Var.r(true);
                long jB = y72.b(y72.e, f2);
                iOrdinal = r8bVar4.ordinal();
                if (iOrdinal != 0) {
                    z12 = false;
                    l46Var.f0(-553867198);
                    mue mueVar = pue.a;
                    mueVarP = pue.p(l46Var);
                    l46Var.r(false);
                } else {
                    if (iOrdinal == 1) {
                        throw tec.d(-553869296, l46Var, false);
                    }
                    l46Var.f0(-553865460);
                    mue mueVar2 = pue.a;
                    mueVarP = pue.b(l46Var);
                    z12 = false;
                    l46Var.r(false);
                }
                f4 = f2;
                nte.b(str, null, jB, 0L, ar5.e, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarP, l46Var, (i5 & 14) | 1572864, 0, 129850);
                l46Var2 = l46Var;
                j09 j09VarB2 = d31Var.b(g09Var);
                boolean zG2 = l46Var2.g(m27VarW2) | l46Var2.d(f4);
                if ((i5 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zG2 | z13;
                objR6 = l46Var2.R();
                if (!z14 || objR6 == i8cVar) {
                    r8bVar5 = r8bVar4;
                    objR6 = new er(f4, r8bVar5, m27VarW2, 4);
                    l46Var2.p0(objR6);
                } else {
                    r8bVar5 = r8bVar4;
                }
                nk8.e(0, (a26) objR6, l46Var2, j09VarB2);
                s21.a(o17.a(oa7.E(d31Var.b(g09Var), y6cVarB), t69Var, d5c.a(0.0f, 7, 0L, false)), l46Var2, 0);
                l46Var2.r(true);
                r8bVar2 = r8bVar5;
                z4 = z6;
            } else {
                l46Var2.Z();
                r8bVar2 = r8bVar;
                z4 = z2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new jv1(str, x16Var, j09Var, r8bVar2, z4, i2, i3);
            }
        }
        i4 |= 24576;
        z2 = z;
        if ((i4 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var2.W(i4 & 1, z3)) {
            if (i7 != 0) {
                r8bVar3 = r8b.Large;
            } else {
                r8bVar3 = r8bVar;
            }
            if (i8 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            gh6VarW0 = kj0.w0(l46Var2);
            objR = l46Var2.R();
            i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = ib8.e(l46Var2);
            }
            t69 t69Var2 = (t69) objR;
            p27 p27VarC1 = af1.c0("quin_sparkle_button", l46Var2, 0);
            r8bVar4 = r8bVar3;
            i5 = i4;
            z6 = z5;
            m27VarW = af1.w(p27VarC1, 1.0f, 1.03f, b21.D(b21.T(1000, 0, hs4.a, 2), lrb.b, 4), "quin_sparkle_button_scale", l46Var2, 29112, 0);
            m27VarW2 = af1.w(p27VarC1, 0.0f, 1.0f, b21.D(b21.T(3000, 0, hs4.c, 2), lrb.a, 4), "quin_sparkle_button_comet", l46Var, 29112, 0);
            if (z6) {
                f2 = 1.0f;
            } else {
                f2 = 0.54f;
            }
            if (if9.B(l46Var)) {
                f3 = 0.55f;
            } else {
                f3 = 0.9f;
            }
            fC = r8bVar4.c() / 2.0f;
            y6c y6cVarB2 = a7c.b(fC);
            j09 j09VarA2 = b.a(j09Var, r8bVar4.b(), r8bVar4.c());
            i6 = 57344 & i5;
            if (i6 == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            zG = z7 | l46Var.g(m27VarW);
            objR2 = l46Var.R();
            if (zG) {
                objR2 = new bs0(z6, m27VarW, 11);
                l46Var.p0(objR2);
            } else {
                objR2 = new bs0(z6, m27VarW, 11);
                l46Var.p0(objR2);
            }
            j09 j09VarX2 = bzd.x(j09VarA2, (a26) objR2);
            if (i6 == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            zD = z8 | l46Var.d(f3);
            objR3 = l46Var.R();
            if (zD) {
                objR3 = new a26() { // from class: p8b
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        sn4 sn4Var = (sn4) obj;
                        sn4Var.getClass();
                        if (z6) {
                            float fP0 = sn4Var.p0(q8b.f);
                            float fP1 = sn4Var.p0(q8b.g);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) / 2.0f;
                            vl1 vl1VarP = sn4Var.v0().p();
                            Paint paint = new Paint(1);
                            paint.setStyle(Paint.Style.FILL);
                            paint.setShader(new LinearGradient(0.0f, 0.0f, Float.intBitsToFloat((int) (sn4Var.f() >> 32)), 0.0f, new int[]{abg.Z(q8b.d), abg.Z(q8b.e)}, (float[]) null, Shader.TileMode.CLAMP));
                            paint.setMaskFilter(new BlurMaskFilter(fP0, BlurMaskFilter.Blur.NORMAL));
                            paint.setAlpha(mh3.o((int) (f3 * 255.0f), 0, 255));
                            mp.b(vl1VarP).drawRoundRect(0.0f, fP1, Float.intBitsToFloat((int) (sn4Var.f() >> 32)), Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) + fP1, fIntBitsToFloat, fIntBitsToFloat, paint);
                        }
                        return wef.a;
                    }
                };
                l46Var.p0(objR3);
            } else {
                objR3 = new a26() { // from class: p8b
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        sn4 sn4Var = (sn4) obj;
                        sn4Var.getClass();
                        if (z6) {
                            float fP0 = sn4Var.p0(q8b.f);
                            float fP1 = sn4Var.p0(q8b.g);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) / 2.0f;
                            vl1 vl1VarP = sn4Var.v0().p();
                            Paint paint = new Paint(1);
                            paint.setStyle(Paint.Style.FILL);
                            paint.setShader(new LinearGradient(0.0f, 0.0f, Float.intBitsToFloat((int) (sn4Var.f() >> 32)), 0.0f, new int[]{abg.Z(q8b.d), abg.Z(q8b.e)}, (float[]) null, Shader.TileMode.CLAMP));
                            paint.setMaskFilter(new BlurMaskFilter(fP0, BlurMaskFilter.Blur.NORMAL));
                            paint.setAlpha(mh3.o((int) (f3 * 255.0f), 0, 255));
                            mp.b(vl1VarP).drawRoundRect(0.0f, fP1, Float.intBitsToFloat((int) (sn4Var.f() >> 32)), Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) + fP1, fIntBitsToFloat, fIntBitsToFloat, paint);
                        }
                        return wef.a;
                    }
                };
                l46Var.p0(objR3);
            }
            j09 j09VarS3 = b21.s(j09VarX2, (a26) objR3);
            boolean zI2 = l46Var.i(gh6VarW0);
            if ((i5 & 112) == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = zI2 | z9;
            objR4 = l46Var.R();
            if (z10) {
                objR4 = new sj2(gh6VarW0, x16Var, 6);
                l46Var.p0(objR4);
            } else {
                objR4 = new sj2(gh6VarW0, x16Var, 6);
                l46Var.p0(objR4);
            }
            j09 j09VarB3 = androidx.compose.foundation.b.b(j09VarS3, t69Var2, null, z6, null, (x16) objR4, 24);
            xn8 xn8VarC3 = s21.c(ndb.f, false);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, j09VarB3);
            lf2.q.getClass();
            l46Var.j0();
            z11 = l46Var.S;
            ov7Var = LayoutNode.h1;
            if (z11) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var5 = hj6.z;
            dec.l(he2Var5, l46Var, xn8VarC3);
            he2 he2Var6 = hj6.y;
            dec.l(he2Var6, l46Var, u8aVarM3);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            he2 he2Var7 = hj6.X;
            dec.l(he2Var7, l46Var, numValueOf2);
            dec.k(l46Var);
            he2 he2Var8 = hj6.x;
            dec.l(he2Var8, l46Var, j09VarJ3);
            d31 d31Var2 = d31.a;
            g09 g09Var2 = g09.a;
            j09 j09VarE2 = oa7.E(d31Var2.b(g09Var2), y6cVarB2);
            zD2 = l46Var.d(f2) | l46Var.d(fC);
            objR5 = l46Var.R();
            if (zD2) {
                objR5 = new qi2(f2, fC, 2);
                l46Var.p0(objR5);
            } else {
                objR5 = new qi2(f2, fC, 2);
                l46Var.p0(objR5);
            }
            j09 j09VarS4 = b21.s(j09VarE2, (a26) objR5);
            xn8 xn8VarC4 = s21.c(ndb.b, false);
            int iHashCode4 = Long.hashCode(l46Var.T);
            u8a u8aVarM4 = l46Var.m();
            j09 j09VarJ4 = m93.J(l46Var, j09VarS4);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var5, l46Var, xn8VarC4);
            dec.l(he2Var6, l46Var, u8aVarM4);
            ib8.s(iHashCode4, l46Var, he2Var7, l46Var);
            dec.l(he2Var8, l46Var, j09VarJ4);
            c(z6, r8bVar4, l46Var, 6 | ((i5 >> 9) & 112) | ((i5 >> 3) & 896));
            l46Var.r(true);
            long jB2 = y72.b(y72.e, f2);
            iOrdinal = r8bVar4.ordinal();
            if (iOrdinal != 0) {
                z12 = false;
                l46Var.f0(-553867198);
                mue mueVar3 = pue.a;
                mueVarP = pue.p(l46Var);
                l46Var.r(false);
            } else {
                if (iOrdinal == 1) {
                    throw tec.d(-553869296, l46Var, false);
                }
                l46Var.f0(-553865460);
                mue mueVar4 = pue.a;
                mueVarP = pue.b(l46Var);
                z12 = false;
                l46Var.r(false);
            }
            f4 = f2;
            nte.b(str, null, jB2, 0L, ar5.e, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarP, l46Var, (i5 & 14) | 1572864, 0, 129850);
            l46Var2 = l46Var;
            j09 j09VarB4 = d31Var2.b(g09Var2);
            boolean zG3 = l46Var2.g(m27VarW2) | l46Var2.d(f4);
            if ((i5 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zG3 | z13;
            objR6 = l46Var2.R();
            if (z14) {
                r8bVar5 = r8bVar4;
                objR6 = new er(f4, r8bVar5, m27VarW2, 4);
                l46Var2.p0(objR6);
            } else {
                r8bVar5 = r8bVar4;
                objR6 = new er(f4, r8bVar5, m27VarW2, 4);
                l46Var2.p0(objR6);
            }
            nk8.e(0, (a26) objR6, l46Var2, j09VarB4);
            s21.a(o17.a(oa7.E(d31Var2.b(g09Var2), y6cVarB2), t69Var2, d5c.a(0.0f, 7, 0L, false)), l46Var2, 0);
            l46Var2.r(true);
            r8bVar2 = r8bVar5;
            z4 = z6;
        } else {
            l46Var2.Z();
            r8bVar2 = r8bVar;
            z4 = z2;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jv1(str, x16Var, j09Var, r8bVar2, z4, i2, i3);
        }
    }

    public static final void b(float f2, eud eudVar, float f3, j09 j09Var, l46 l46Var, int i2) {
        l46Var.h0(987705078);
        int i3 = (l46Var.d(f2) ? 4 : 2) | i2 | (l46Var.g(eudVar) ? 32 : 16) | (l46Var.d(f3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            float f4 = (0.6f * f2) + 0.4f;
            float f5 = (0.8f * f2) + 0.2f;
            float f6 = eudVar.c * f3;
            j09 j09VarL = b.l(j09Var, (h * 2.0f) + f6);
            boolean zD = l46Var.d(f4) | l46Var.d(f5);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zD || objR == i8cVar) {
                objR = new qi2(f4, f5, 3);
                l46Var.p0(objR);
            }
            j09 j09VarX = bzd.x(j09VarL, (a26) objR);
            boolean zD2 = l46Var.d(f6);
            Object objR2 = l46Var.R();
            if (zD2 || objR2 == i8cVar) {
                objR2 = new uc2(10, f6);
                l46Var.p0(objR2);
            }
            nk8.e(0, (a26) objR2, l46Var, j09VarX);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r58(f2, eudVar, f3, j09Var, i2);
        }
    }

    public static final void c(boolean z, r8b r8bVar, l46 l46Var, int i2) {
        l46Var.h0(647702003);
        int i3 = i2 & 6;
        d31 d31Var = d31.a;
        int i4 = i3 == 0 ? (l46Var.g(d31Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.e(r8bVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = 0;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            p27 p27VarC0 = af1.c0("quin_sparkle_button_stars", l46Var, 0);
            for (Object obj : i) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    t72.Z();
                    throw null;
                }
                eud eudVar = (eud) obj;
                p27 p27Var = p27VarC0;
                b(z ? ((Number) af1.w(p27VarC0, 0.0f, 1.0f, b21.D(new x6f(eudVar.d, eudVar.e, hs4.a), lrb.b, 4), tec.e(i5, "quin_sparkle_button_star_"), l46Var, 4536, 0).c.getValue()).floatValue() : 0.0f, eudVar, r8bVar.a(), tm7.M(d31Var.a(g09.a, ndb.f), r8bVar.d() * eudVar.a, r8bVar.a() * eudVar.b), l46Var, 0);
                p27VarC0 = p27Var;
                i5 = i6;
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iv1(i2, 3, r8bVar, z);
        }
    }

    public static final void d(sn4 sn4Var, PathMeasure pathMeasure, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (f6 <= 0.0f || f4 <= f3) {
            return;
        }
        Path path = new Path();
        pathMeasure.getSegment(f3 * f2, f2 * f4, path, true);
        vl1 vl1VarP = sn4Var.v0().p();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(f5);
        paint.setColor(abg.Z(y72.b(y72.e, f6)));
        if (f7 > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(f7, BlurMaskFilter.Blur.NORMAL));
        }
        mp.b(vl1VarP).drawPath(path, paint);
    }

    public static final void e(sn4 sn4Var, PathMeasure pathMeasure, float f2, float f3, float f4, float f5, float f6, float f7) {
        float fFloor = f3 - ((float) Math.floor(f3));
        float f8 = (f4 - f3) + fFloor;
        if (f8 <= 1.0f) {
            d(sn4Var, pathMeasure, f2, fFloor, f8, f5, f6, f7);
        } else {
            d(sn4Var, pathMeasure, f2, fFloor, 1.0f, f5, f6, f7);
            d(sn4Var, pathMeasure, f2, 0.0f, f8 - 1.0f, f5, f6, f7);
        }
    }
}
