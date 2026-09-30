package defpackage;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r01 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r01(sn4 sn4Var, long j, li6 li6Var, b41 b41Var) {
        this.a = 0;
        this.c = sn4Var;
        this.b = j;
        this.d = li6Var;
        this.e = b41Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j;
        int i;
        boolean z;
        float fA;
        float fA2;
        long jR;
        long jR2;
        int i2 = this.a;
        long j2 = this.b;
        wef wefVar = wef.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                sn4 sn4Var = (sn4) obj4;
                li6 li6Var = (li6) obj3;
                b41 b41Var = (b41) obj2;
                ke6 ke6Var = (ke6) obj;
                ke6Var.getClass();
                me6 me6Var = ke6Var.a;
                if (me6Var.m() != 1) {
                    me6Var.H(1);
                }
                sn4Var.F0(db6.P0(sn4Var.f()), new l0(22, li6Var, b41Var), ke6Var);
                if ((((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0 || hl9.c(j2, 0L)) {
                    i7h.r(sn4Var, ke6Var);
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    ((vd9) sn4Var.v0().c).I(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        i7h.r(sn4Var, ke6Var);
                    } finally {
                        ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                    }
                }
                return wefVar;
            case 1:
                hkb hkbVar = (hkb) obj4;
                mmb mmbVar = (mmb) obj3;
                long j3 = this.b;
                c82 c82Var = (c82) obj2;
                vv7 vv7Var = (vv7) ((im2) obj);
                vv7Var.a();
                float f = hkbVar.a;
                float f2 = hkbVar.b;
                xl1 xl1Var = vv7Var.a;
                ((vd9) xl1Var.b.c).I(f, f2);
                try {
                    sn4.g0(vv7Var, (cv6) mmbVar.element, 0L, j3, 0L, 0L, 0.0f, c82Var, 0, 890);
                    return wefVar;
                } finally {
                    ((vd9) xl1Var.b.c).I(-f, -f2);
                }
            case 2:
                float[] fArr = (float[]) obj4;
                kmb kmbVar = (kmb) obj3;
                jmb jmbVar = (jmb) obj2;
                oy9 oy9Var = (oy9) obj;
                int i3 = oy9Var.b;
                tt ttVar = oy9Var.a;
                int iF = oy9Var.c;
                int iG = i3 > eue.g(j2) ? oy9Var.b : eue.g(j2);
                if (iF >= eue.f(j2)) {
                    iF = eue.f(j2);
                }
                long jB = u3c.b(oy9Var.d(iG), oy9Var.d(iF));
                int i4 = kmbVar.element;
                qte qteVar = ttVar.d;
                int iG2 = eue.g(jB);
                int iF2 = eue.f(jB);
                Layout layout = qteVar.f;
                int length = layout.getText().length();
                if (iG2 < 0) {
                    j37.a("startOffset must be > 0");
                }
                if (iG2 >= length) {
                    j37.a("startOffset must be less than text length");
                }
                if (iF2 <= iG2) {
                    j37.a("endOffset must be greater than startOffset");
                }
                if (iF2 > length) {
                    j37.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i4 < (iF2 - iG2) * 4) {
                    j37.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iG3 = qteVar.g(iG2);
                int iG4 = qteVar.g(iF2 - 1);
                pq6 pq6Var = new pq6(qteVar);
                if (iG3 <= iG4) {
                    while (true) {
                        int lineStart = layout.getLineStart(iG3);
                        j = jB;
                        int iF3 = qteVar.f(iG3);
                        int iMax = Math.max(iG2, lineStart);
                        int iMin = Math.min(iF2, iF3);
                        float fI = qteVar.i(iG3);
                        float fE = qteVar.e(iG3);
                        boolean z2 = true;
                        boolean z3 = layout.getParagraphDirection(iG3) == 1;
                        int i5 = i4;
                        int i6 = iMax;
                        while (i6 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i6);
                            if (!z3 || zIsRtlCharAt) {
                                i = iMin;
                                if (z3 && zIsRtlCharAt) {
                                    float fA3 = pq6Var.a(i6, false, false, false);
                                    z = z3;
                                    fA = pq6Var.a(i6 + 1, z2, z2, false);
                                    fA2 = fA3;
                                } else {
                                    z = z3;
                                    if (z || !zIsRtlCharAt) {
                                        fA = pq6Var.a(i6, false, false, false);
                                        fA2 = pq6Var.a(i6 + 1, z2, z2, false);
                                    } else {
                                        fA2 = pq6Var.a(i6, false, false, z2);
                                        fA = pq6Var.a(i6 + 1, z2, z2, z2);
                                    }
                                }
                                fArr[i5] = fA;
                                fArr[i5 + 1] = fI;
                                fArr[i5 + 2] = fA2;
                                fArr[i5 + 3] = fE;
                                i5 += 4;
                                i6++;
                                z3 = z;
                                iMin = i;
                                z2 = true;
                            } else {
                                i = iMin;
                                z = z3;
                                fA = pq6Var.a(i6, false, false, z2);
                                fA2 = pq6Var.a(i6 + 1, z2, z2, z2);
                            }
                            fArr[i5] = fA;
                            fArr[i5 + 1] = fI;
                            fArr[i5 + 2] = fA2;
                            fArr[i5 + 3] = fE;
                            i5 += 4;
                            i6++;
                            z3 = z;
                            iMin = i;
                            z2 = true;
                        }
                        if (iG3 != iG4) {
                            iG3++;
                            jB = j;
                            i4 = i5;
                        }
                    }
                } else {
                    j = jB;
                }
                int iE = (eue.e(j) * 4) + kmbVar.element;
                for (int i7 = kmbVar.element; i7 < iE; i7 += 4) {
                    int i8 = i7 + 1;
                    float f3 = fArr[i8];
                    float f4 = jmbVar.element;
                    fArr[i8] = f3 + f4;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f4;
                }
                kmbVar.element = iE;
                jmbVar.element += ttVar.f;
                return wefVar;
            default:
                Float f5 = (Float) obj4;
                e89 e89Var = (e89) obj3;
                e89 e89Var2 = (e89) obj2;
                ste steVar = (ste) obj;
                steVar.getClass();
                if (steVar.e() || steVar.d()) {
                    long j4 = ((mue) e89Var.getValue()).a.b;
                    w6c.f(j4);
                    long jR3 = w6c.r(j4 & 1095216660480L, (float) (((double) wue.c(j4)) * 0.9d));
                    long j5 = this.b;
                    w6c.g(jR3, j5);
                    if (Float.compare(wue.c(jR3), wue.c(j5)) > 0) {
                        mue mueVar = (mue) e89Var.getValue();
                        if (f5 != null) {
                            float fFloatValue = f5.floatValue();
                            long j6 = ((mue) e89Var.getValue()).a.b;
                            w6c.f(j6);
                            jR2 = w6c.r(1095216660480L & j6, wue.c(j6) * fFloatValue);
                        } else {
                            jR2 = ((mue) e89Var.getValue()).b.c;
                        }
                        e89Var.setValue(mue.a(mueVar, 0L, jR3, null, null, 0L, null, 0, jR2, null, null, 16646141));
                    } else {
                        mue mueVar2 = (mue) e89Var.getValue();
                        if (f5 != null) {
                            float fFloatValue2 = f5.floatValue();
                            long j7 = ((mue) e89Var.getValue()).a.b;
                            w6c.f(j7);
                            jR = w6c.r(1095216660480L & j7, wue.c(j7) * fFloatValue2);
                        } else {
                            jR = ((mue) e89Var.getValue()).b.c;
                        }
                        e89Var.setValue(mue.a(mueVar2, 0L, j5, null, null, 0L, null, 0, jR, null, null, 16646141));
                        e89Var2.setValue(Boolean.TRUE);
                    }
                } else {
                    e89Var2.setValue(Boolean.TRUE);
                }
                return wefVar;
        }
    }

    public /* synthetic */ r01(long j, Serializable serializable, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = j;
        this.c = serializable;
        this.d = obj;
        this.e = obj2;
    }

    public /* synthetic */ r01(hkb hkbVar, mmb mmbVar, long j, xz0 xz0Var) {
        this.a = 1;
        this.c = hkbVar;
        this.d = mmbVar;
        this.b = j;
        this.e = xz0Var;
    }
}
