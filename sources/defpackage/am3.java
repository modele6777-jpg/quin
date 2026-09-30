package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class am3 {
    public static final q03 a = gs4.a;
    public static final List b = t72.I(Float.valueOf(0.012499999f), Float.valueOf(0.008333334f), Float.valueOf(0.004166667f));
    public static final List c;
    public static final float d;
    public static final float e;
    public static final long f;
    public static final List g;
    public static final float[] h;
    public static final float[] i;
    public static final float[] j;

    static {
        long j2 = y72.b;
        y72 y72Var = new y72(y72.b(j2, 0.18f));
        y72 y72Var2 = new y72(y72.b(j2, 0.1f));
        long j3 = y72.e;
        c = t72.I(y72Var, y72Var2, new y72(y72.b(j3, 0.85f)));
        d = 6.0f;
        e = 0.5f;
        f = y72.b(j3, 0.4f);
        List listI = t72.I(new txf(-4.0f, -0.78f, 1.0f, 88.0f), new txf(-3.0f, -0.65f, 1.12f, 86.0f), new txf(-2.0f, -0.48f, 1.25f, 84.0f), new txf(-1.0f, -0.27f, 1.43f, 82.0f), new txf(0.0f, 0.0f, 1.65f, 80.0f), new txf(1.0f, 1.305f, 1.71f, 70.0f), new txf(2.0f, 1.466f, 1.9f, 60.0f), new txf(2.5f, 1.66f, 2.09f, 50.0f));
        g = listI;
        ArrayList arrayList = new ArrayList(t72.u(listI, 10));
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((txf) it.next()).b));
        }
        h = d(arrayList);
        List list = g;
        ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((txf) it2.next()).c));
        }
        i = d(arrayList2);
        List list2 = g;
        ArrayList arrayList3 = new ArrayList(t72.u(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Float.valueOf(((txf) it3.next()).d));
        }
        j = d(arrayList3);
    }

    public static final void a(final TarotSkinIdentify tarotSkinIdentify, final List list, final int i2, final float f2, final a26 a26Var, final l26 l26Var, final j09 j09Var, l46 l46Var, final int i3) {
        Object wl3Var;
        Object obj;
        float f3;
        yl3 yl3Var;
        int i4;
        a26Var.getClass();
        l26Var.getClass();
        l46Var.h0(2134771205);
        int i5 = i3 | (l46Var.e(tarotSkinIdentify.ordinal()) ? 4 : 2) | (l46Var.g(list) ? 32 : 16) | (l46Var.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.d(f2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(l26Var) ? 131072 : 65536) | (l46Var.g(j09Var) ? 1048576 : 524288);
        if (!l46Var.W(i5 & 1, (599187 & i5) != 599186)) {
            j09Var = j09Var;
            l46Var.Z();
        } else {
            if (list.isEmpty()) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i6 = 0;
                    ojbVarV.d = new l26(tarotSkinIdentify, list, i2, f2, a26Var, l26Var, j09Var, i3, i6) { // from class: ql3
                        public final /* synthetic */ int a;
                        public final /* synthetic */ TarotSkinIdentify b;
                        public final /* synthetic */ List c;
                        public final /* synthetic */ int d;
                        public final /* synthetic */ float e;
                        public final /* synthetic */ a26 f;
                        public final /* synthetic */ l26 g;
                        public final /* synthetic */ j09 v;

                        {
                            this.a = i6;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj2, Object obj3) {
                            int i7 = this.a;
                            wef wefVar = wef.a;
                            switch (i7) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int iP = k99.P(1);
                                    am3.a(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj2, iP);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int iP2 = k99.P(1);
                                    am3.a(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj2, iP2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            int size = list.size();
            gh6 gh6VarW0 = kj0.w0(l46Var);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            e89 e89VarI = q1c.i(a26Var, l46Var);
            Object objI = q1c.i(l26Var, l46Var);
            e89 e89VarI2 = q1c.i(Integer.valueOf(i2), l46Var);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                Object qz9Var = new qz9(i2);
                l46Var.p0(qz9Var);
                objR2 = qz9Var;
            }
            n69 n69Var = (n69) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = kv2.f(i2, l46Var);
            }
            s69 s69Var = (s69) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == i8cVar) {
                objR4 = new yl3();
                l46Var.p0(objR4);
            }
            yl3 yl3Var2 = (yl3) objR4;
            Object objR5 = l46Var.R();
            if (objR5 == i8cVar) {
                Object qh3Var = new qh3(new ij5(1.0f, 20.0f));
                l46Var.p0(qh3Var);
                objR5 = qh3Var;
            }
            ph3 ph3Var = (ph3) objR5;
            Integer numValueOf = Integer.valueOf(i2);
            boolean zE = ((i5 & 896) == 256) | l46Var.e(size) | l46Var.i(yl3Var2) | l46Var.i(aw2Var);
            Object objR6 = l46Var.R();
            if (zE || objR6 == i8cVar) {
                obj = objI;
                f3 = 1.0f;
                yl3Var = yl3Var2;
                wl3Var = new wl3(i2, size, yl3Var, aw2Var, s69Var, n69Var, null);
                l46Var.p0(wl3Var);
            } else {
                obj = objI;
                yl3Var = yl3Var2;
                wl3Var = objR6;
                f3 = 1.0f;
            }
            af1.o((l26) wl3Var, l46Var, numValueOf);
            boolean zI = l46Var.i(yl3Var) | l46Var.i(aw2Var) | l46Var.i(ph3Var) | l46Var.e(size) | l46Var.g(e89VarI2) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI);
            Object objR7 = l46Var.R();
            if (zI || objR7 == i8cVar) {
                i4 = size;
                objR7 = new rl3(yl3Var, aw2Var, ph3Var, i4, e89VarI2, gh6VarW0, e89VarI, n69Var, s69Var);
                l46Var.p0(objR7);
            } else {
                i4 = size;
            }
            Object obj2 = (a26) objR7;
            boolean z = f2 >= f3;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = l46Var.h(z) | l46Var.i(yl3Var) | l46Var.g(obj2);
            Object objR8 = l46Var.R();
            if (zH || objR8 == i8cVar) {
                objR8 = new xl3(z, yl3Var, n69Var, obj2, 0);
                n69Var = n69Var;
                l46Var.p0(objR8);
            }
            j09 j09VarA = ibe.a(j09Var, boolValueOf, (PointerInputEventHandler) objR8);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            Object obj3 = obj;
            boolean zH2 = l46Var.h(z) | l46Var.g(obj3) | ((i5 & 112) == 32) | l46Var.g(e89VarI2);
            Object objR9 = l46Var.R();
            if (zH2 || objR9 == i8cVar) {
                Object xl3Var = new xl3(z, obj3, list, e89VarI2, 1);
                l46Var.p0(xl3Var);
                objR9 = xl3Var;
            }
            final int i7 = i4;
            final n69 n69Var2 = n69Var;
            nk8.d(ibe.a(j09VarA, boolValueOf2, (PointerInputEventHandler) objR9), ndb.f, af1.b0(862790639, new n26() { // from class: sl3
                /* JADX WARN: Code duplicated, block: B:100:0x02e7 A[LOOP:1: B:96:0x02d7->B:100:0x02e7, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:105:0x0324  */
                /* JADX WARN: Code duplicated, block: B:106:0x0327  */
                /* JADX WARN: Code duplicated, block: B:117:0x0317 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:120:0x031b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:56:0x019a  */
                /* JADX WARN: Code duplicated, block: B:58:0x01a3  */
                /* JADX WARN: Code duplicated, block: B:60:0x01a6  */
                /* JADX WARN: Code duplicated, block: B:62:0x01ac  */
                /* JADX WARN: Code duplicated, block: B:65:0x01bb  */
                /* JADX WARN: Code duplicated, block: B:67:0x01bf  */
                /* JADX WARN: Code duplicated, block: B:69:0x01c3  */
                /* JADX WARN: Code duplicated, block: B:71:0x01c8  */
                /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
                /* JADX WARN: Code duplicated, block: B:75:0x01d7  */
                /* JADX WARN: Code duplicated, block: B:77:0x01dd  */
                /* JADX WARN: Code duplicated, block: B:79:0x01e8  */
                /* JADX WARN: Code duplicated, block: B:80:0x01ea  */
                /* JADX WARN: Code duplicated, block: B:83:0x0239 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:86:0x023f  */
                /* JADX WARN: Code duplicated, block: B:89:0x025b  */
                /* JADX WARN: Code duplicated, block: B:90:0x0275  */
                /* JADX WARN: Code duplicated, block: B:93:0x02a6  */
                /* JADX WARN: Code duplicated, block: B:94:0x02ac  */
                /* JADX WARN: Code duplicated, block: B:98:0x02df  */
                @Override // defpackage.n26
                public final Object m(Object obj4, Object obj5, Object obj6) {
                    float f4;
                    float f5;
                    TarotSkinIdentify tarotSkinIdentify2;
                    y6c y6cVar;
                    boolean z2;
                    boolean z3;
                    i8c i8cVar2;
                    uxf uxfVar;
                    float f6;
                    float f7;
                    float f8;
                    float f9;
                    long j2;
                    final long j3;
                    float f10;
                    float f11;
                    float fP;
                    float fP2;
                    TarotSkinIdentify tarotSkinIdentify3;
                    float fP3;
                    float fP4;
                    final float fP5;
                    g09 g09Var;
                    boolean zD;
                    Object objR10;
                    float f12;
                    boolean z4;
                    float f13;
                    j09 j09VarA2;
                    Iterator it;
                    int i8;
                    boolean zHasNext;
                    d31 d31Var;
                    float f14;
                    Object next;
                    int i9;
                    sl3 sl3Var = this;
                    e31 e31Var = (e31) obj4;
                    l46 l46Var2 = (l46) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                    }
                    boolean z5 = true;
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = e31Var.d() * 0.36641222f;
                        TarotSkinIdentify tarotSkinIdentify4 = tarotSkinIdentify;
                        float aspectRatio = fD / tarotSkinIdentify4.getAspectRatio();
                        float f15 = 0.055555556f * fD;
                        boolean zD2 = l46Var2.d(f15);
                        Object objR11 = l46Var2.R();
                        i8c i8cVar3 = sf2.a;
                        if (zD2 || objR11 == i8cVar3) {
                            objR11 = a7c.b(f15);
                            l46Var2.p0(objR11);
                        }
                        y6c y6cVar2 = (y6c) objR11;
                        float fP0 = ((sw3) l46Var2.k(zg2.h)).p0(e31Var.d()) / 2.0f;
                        int i10 = 0;
                        for (Object obj7 : list) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                t72.Z();
                                throw null;
                            }
                            TarotCardType tarotCardType = (TarotCardType) obj7;
                            l46Var2.d0(177613320, tarotCardType.getCardKey());
                            float fJ = ((qz9) n69Var2).j() - i10;
                            int i12 = i7;
                            float f16 = i12;
                            float f17 = fJ % f16;
                            if (f17 > f16 / 2.0f) {
                                f17 -= f16;
                            }
                            if (f17 < (-i12) / 2.0f) {
                                f17 += f16;
                            }
                            boolean z6 = f17 == 0.0f ? z5 : false;
                            if (f17 >= -4.5f && f17 <= 2.5f) {
                                l46Var2.f0(1211224124);
                                List list2 = am3.g;
                                txf txfVar = (txf) s72.v0(list2);
                                boolean z7 = z5;
                                txf txfVar2 = (txf) s72.F0(list2);
                                if (f17 > txfVar.a) {
                                    if (f17 < txfVar2.a) {
                                        int size2 = list2.size() - 1;
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= size2) {
                                                f4 = fP0;
                                                f6 = 1.0f;
                                                f7 = 0.0f;
                                                uxfVar = new uxf(0.0f, 1.0f, 80.0f);
                                                break;
                                            }
                                            txf txfVar3 = (txf) list2.get(i13);
                                            int i14 = i13 + 1;
                                            txf txfVar4 = (txf) list2.get(i14);
                                            f4 = fP0;
                                            float f18 = txfVar3.a;
                                            if (f17 >= f18) {
                                                float f19 = txfVar4.a;
                                                if (f17 <= f19) {
                                                    float f20 = f19 - f18;
                                                    float f21 = (f17 - f18) / f20;
                                                    float f22 = txfVar3.b;
                                                    float f23 = txfVar4.b;
                                                    float[] fArr = am3.h;
                                                    float fC = am3.c(f22, f23, fArr[i13], fArr[i14], f20, f21);
                                                    float f24 = txfVar3.c;
                                                    float f25 = txfVar4.c;
                                                    float[] fArr2 = am3.i;
                                                    float fC2 = am3.c(f24, f25, fArr2[i13], fArr2[i14], f20, f21);
                                                    float f26 = txfVar3.d;
                                                    float f27 = txfVar4.d;
                                                    float[] fArr3 = am3.j;
                                                    uxfVar = new uxf(fC, fC2, am3.c(f26, f27, fArr3[i13], fArr3[i14], f20, f21));
                                                    f6 = 1.0f;
                                                    f7 = 0.0f;
                                                    break;
                                                }
                                            }
                                            fP0 = f4;
                                            i13 = i14;
                                        }
                                    } else {
                                        uxfVar = new uxf(txfVar2.b, txfVar2.c, txfVar2.d);
                                    }
                                    if (f17 > 2.0f) {
                                        f9 = f6 - ((f17 - 2.0f) / 0.5f);
                                        if (f9 < f7) {
                                            f9 = 0.0f;
                                        }
                                        f8 = f9;
                                    } else if (f17 < -4.0f) {
                                        f9 = ((4.0f + f17) / 0.5f) + 1.0f;
                                        if (f9 < 0.0f) {
                                            f9 = 0.0f;
                                        }
                                        f8 = f9;
                                    } else {
                                        f8 = 1.0f;
                                    }
                                    if (f17 < 0.0f) {
                                        j2 = y72.b;
                                    } else {
                                        j2 = y72.e;
                                    }
                                    j3 = j2;
                                    if (f17 < 0.0f) {
                                        if (f17 > 0.0f) {
                                            f11 = 0.18f * f17;
                                            if (f11 > 0.4f) {
                                                f10 = 0.4f;
                                            }
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        float f28 = 90.0f - uxfVar.c;
                                        float f29 = f2;
                                        fP = abg.P(0.0f, f28, f29);
                                        fP2 = abg.P(1.0f, uxfVar.b, f29);
                                        tarotSkinIdentify3 = tarotSkinIdentify4;
                                        fP3 = abg.P(0.0f, uxfVar.a * f4, f29);
                                        fP4 = abg.P(1.0f, f8, f29);
                                        fP5 = abg.P(0.0f, f10, f29);
                                        g09Var = g09.a;
                                        j09 j09VarW = fdc.w(b.m(g09Var, fD, aspectRatio), f17);
                                        zD = l46Var2.d(fP) | l46Var2.d(fP2) | l46Var2.d(fP3) | l46Var2.d(fP4);
                                        objR10 = l46Var2.R();
                                        if (!zD || objR10 == i8cVar3) {
                                            f12 = fP;
                                            objR10 = new tl3(f12, fP2, fP3, fP4, 0);
                                            l46Var2.p0(objR10);
                                        } else {
                                            f12 = fP;
                                        }
                                        j09 j09VarX = bzd.x(j09VarW, (a26) objR10);
                                        if (z6) {
                                            l46Var2.f0(177678119);
                                            f13 = 0.0f;
                                            j09VarA2 = vt1.a(g09Var, tarotCardType.getCardKey(), null, l46Var2, 390, 12);
                                            z4 = false;
                                            l46Var2.r(false);
                                        } else {
                                            z4 = false;
                                            f13 = 0.0f;
                                            l46Var2.f0(177679652);
                                            l46Var2.r(false);
                                            j09VarA2 = g09Var;
                                        }
                                        j09 j09VarD = j09VarX.D(j09VarA2);
                                        xn8 xn8VarC = s21.c(ndb.b, z4);
                                        int iHashCode = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM = l46Var2.m();
                                        j09 j09VarJ = m93.J(l46Var2, j09VarD);
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
                                        l46Var2.f0(-1580784290);
                                        it = am3.b.iterator();
                                        i8 = 0;
                                        while (true) {
                                            zHasNext = it.hasNext();
                                            d31Var = d31.a;
                                            if (zHasNext) {
                                                f5 = fD;
                                                l46Var2.r(false);
                                                if (z6) {
                                                    f14 = f12;
                                                } else {
                                                    f14 = 0.0f;
                                                }
                                                j09 j09VarB = d31Var.b(g09Var);
                                                dd2 dd2VarB0 = af1.b0(815980045, new n26() { // from class: ul3
                                                    @Override // defpackage.n26
                                                    public final Object m(Object obj8, Object obj9, Object obj10) {
                                                        c31 c31Var = (c31) obj8;
                                                        l46 l46Var3 = (l46) obj9;
                                                        int iIntValue2 = ((Integer) obj10).intValue();
                                                        c31Var.getClass();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= l46Var3.g(c31Var) ? 4 : 2;
                                                        }
                                                        if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            float f30 = fP5;
                                                            if (f30 > 0.0f) {
                                                                l46Var3.f0(-653184020);
                                                                s21.a(tm7.o(c31Var.b(g09.a), y72.b(j3, f30), g21.f), l46Var3, 0);
                                                                l46Var3.r(false);
                                                            } else {
                                                                l46Var3.f0(-652990859);
                                                                l46Var3.r(false);
                                                            }
                                                        } else {
                                                            l46Var3.Z();
                                                        }
                                                        return wef.a;
                                                    }
                                                }, l46Var2);
                                                i8cVar2 = i8cVar3;
                                                y6cVar = y6cVar2;
                                                tarotSkinIdentify2 = tarotSkinIdentify3;
                                                l46 l46Var3 = l46Var2;
                                                z3 = false;
                                                fdc.b(tarotCardType, tarotSkinIdentify2, f14, j09VarB, 0.0f, null, null, false, dd2VarB0, l46Var3, 100663296, 240);
                                                z2 = z7;
                                                l46Var2 = l46Var3;
                                                l46Var2.r(z2);
                                                l46Var2.r(false);
                                                break;
                                            }
                                            next = it.next();
                                            i9 = i8 + 1;
                                            if (i8 >= 0) {
                                                t72.Z();
                                                throw null;
                                            }
                                            s21.a(tm7.o(oa7.E(tm7.N(-(((Number) next).floatValue() * fD), f13, d31Var.b(g09Var), 2), y6cVar2), ((y72) am3.c.get(i8)).a, g21.f), l46Var2, 0);
                                            fD = fD;
                                            i8 = i9;
                                            f13 = 0.0f;
                                        }
                                    } else {
                                        f11 = (-f17) * 0.05f;
                                        if (f11 > 0.3f) {
                                            f11 = 0.3f;
                                        }
                                    }
                                    f10 = f11;
                                    float f210 = 90.0f - uxfVar.c;
                                    float f211 = f2;
                                    fP = abg.P(0.0f, f210, f211);
                                    fP2 = abg.P(1.0f, uxfVar.b, f211);
                                    tarotSkinIdentify3 = tarotSkinIdentify4;
                                    fP3 = abg.P(0.0f, uxfVar.a * f4, f211);
                                    fP4 = abg.P(1.0f, f8, f211);
                                    fP5 = abg.P(0.0f, f10, f211);
                                    g09Var = g09.a;
                                    j09 j09VarW2 = fdc.w(b.m(g09Var, fD, aspectRatio), f17);
                                    zD = l46Var2.d(fP) | l46Var2.d(fP2) | l46Var2.d(fP3) | l46Var2.d(fP4);
                                    objR10 = l46Var2.R();
                                    if (zD) {
                                        f12 = fP;
                                        objR10 = new tl3(f12, fP2, fP3, fP4, 0);
                                        l46Var2.p0(objR10);
                                    } else {
                                        f12 = fP;
                                        objR10 = new tl3(f12, fP2, fP3, fP4, 0);
                                        l46Var2.p0(objR10);
                                    }
                                    j09 j09VarX2 = bzd.x(j09VarW2, (a26) objR10);
                                    if (z6) {
                                        l46Var2.f0(177678119);
                                        f13 = 0.0f;
                                        j09VarA2 = vt1.a(g09Var, tarotCardType.getCardKey(), null, l46Var2, 390, 12);
                                        z4 = false;
                                        l46Var2.r(false);
                                    } else {
                                        z4 = false;
                                        f13 = 0.0f;
                                        l46Var2.f0(177679652);
                                        l46Var2.r(false);
                                        j09VarA2 = g09Var;
                                    }
                                    j09 j09VarD2 = j09VarX2.D(j09VarA2);
                                    xn8 xn8VarC2 = s21.c(ndb.b, z4);
                                    int iHashCode2 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM2 = l46Var2.m();
                                    j09 j09VarJ2 = m93.J(l46Var2, j09VarD2);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(LayoutNode.h1);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(hj6.z, l46Var2, xn8VarC2);
                                    dec.l(hj6.y, l46Var2, u8aVarM2);
                                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
                                    dec.k(l46Var2);
                                    dec.l(hj6.x, l46Var2, j09VarJ2);
                                    l46Var2.f0(-1580784290);
                                    it = am3.b.iterator();
                                    i8 = 0;
                                    while (true) {
                                        zHasNext = it.hasNext();
                                        d31Var = d31.a;
                                        if (zHasNext) {
                                            f5 = fD;
                                            l46Var2.r(false);
                                            if (z6) {
                                                f14 = f12;
                                            } else {
                                                f14 = 0.0f;
                                            }
                                            j09 j09VarB2 = d31Var.b(g09Var);
                                            dd2 dd2VarB1 = af1.b0(815980045, new n26() { // from class: ul3
                                                @Override // defpackage.n26
                                                public final Object m(Object obj8, Object obj9, Object obj10) {
                                                    c31 c31Var = (c31) obj8;
                                                    l46 l46Var4 = (l46) obj9;
                                                    int iIntValue2 = ((Integer) obj10).intValue();
                                                    c31Var.getClass();
                                                    if ((iIntValue2 & 6) == 0) {
                                                        iIntValue2 |= l46Var4.g(c31Var) ? 4 : 2;
                                                    }
                                                    if (l46Var4.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                        float f30 = fP5;
                                                        if (f30 > 0.0f) {
                                                            l46Var4.f0(-653184020);
                                                            s21.a(tm7.o(c31Var.b(g09.a), y72.b(j3, f30), g21.f), l46Var4, 0);
                                                            l46Var4.r(false);
                                                        } else {
                                                            l46Var4.f0(-652990859);
                                                            l46Var4.r(false);
                                                        }
                                                    } else {
                                                        l46Var4.Z();
                                                    }
                                                    return wef.a;
                                                }
                                            }, l46Var2);
                                            i8cVar2 = i8cVar3;
                                            y6cVar = y6cVar2;
                                            tarotSkinIdentify2 = tarotSkinIdentify3;
                                            l46 l46Var4 = l46Var2;
                                            z3 = false;
                                            fdc.b(tarotCardType, tarotSkinIdentify2, f14, j09VarB2, 0.0f, null, null, false, dd2VarB1, l46Var4, 100663296, 240);
                                            z2 = z7;
                                            l46Var2 = l46Var4;
                                            l46Var2.r(z2);
                                            l46Var2.r(false);
                                            break;
                                            break;
                                        }
                                        next = it.next();
                                        i9 = i8 + 1;
                                        if (i8 >= 0) {
                                            t72.Z();
                                            throw null;
                                        }
                                        s21.a(tm7.o(oa7.E(tm7.N(-(((Number) next).floatValue() * fD), f13, d31Var.b(g09Var), 2), y6cVar2), ((y72) am3.c.get(i8)).a, g21.f), l46Var2, 0);
                                        fD = fD;
                                        i8 = i9;
                                        f13 = 0.0f;
                                    }
                                } else {
                                    uxfVar = new uxf(txfVar.b, txfVar.c, txfVar.d);
                                }
                                f4 = fP0;
                                f7 = 0.0f;
                                f6 = 1.0f;
                                if (f17 > 2.0f) {
                                    f9 = f6 - ((f17 - 2.0f) / 0.5f);
                                    if (f9 < f7) {
                                        f9 = 0.0f;
                                    }
                                    f8 = f9;
                                } else if (f17 < -4.0f) {
                                    f9 = ((4.0f + f17) / 0.5f) + 1.0f;
                                    if (f9 < 0.0f) {
                                        f9 = 0.0f;
                                    }
                                    f8 = f9;
                                } else {
                                    f8 = 1.0f;
                                }
                                if (f17 < 0.0f) {
                                    j2 = y72.b;
                                } else {
                                    j2 = y72.e;
                                }
                                j3 = j2;
                                if (f17 < 0.0f) {
                                    if (f17 > 0.0f) {
                                        f11 = 0.18f * f17;
                                        if (f11 > 0.4f) {
                                            f10 = 0.4f;
                                        }
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    float f212 = 90.0f - uxfVar.c;
                                    float f213 = f2;
                                    fP = abg.P(0.0f, f212, f213);
                                    fP2 = abg.P(1.0f, uxfVar.b, f213);
                                    tarotSkinIdentify3 = tarotSkinIdentify4;
                                    fP3 = abg.P(0.0f, uxfVar.a * f4, f213);
                                    fP4 = abg.P(1.0f, f8, f213);
                                    fP5 = abg.P(0.0f, f10, f213);
                                    g09Var = g09.a;
                                    j09 j09VarW3 = fdc.w(b.m(g09Var, fD, aspectRatio), f17);
                                    zD = l46Var2.d(fP) | l46Var2.d(fP2) | l46Var2.d(fP3) | l46Var2.d(fP4);
                                    objR10 = l46Var2.R();
                                    if (zD) {
                                        f12 = fP;
                                        objR10 = new tl3(f12, fP2, fP3, fP4, 0);
                                        l46Var2.p0(objR10);
                                    } else {
                                        f12 = fP;
                                        objR10 = new tl3(f12, fP2, fP3, fP4, 0);
                                        l46Var2.p0(objR10);
                                    }
                                    j09 j09VarX3 = bzd.x(j09VarW3, (a26) objR10);
                                    if (z6) {
                                        l46Var2.f0(177678119);
                                        f13 = 0.0f;
                                        j09VarA2 = vt1.a(g09Var, tarotCardType.getCardKey(), null, l46Var2, 390, 12);
                                        z4 = false;
                                        l46Var2.r(false);
                                    } else {
                                        z4 = false;
                                        f13 = 0.0f;
                                        l46Var2.f0(177679652);
                                        l46Var2.r(false);
                                        j09VarA2 = g09Var;
                                    }
                                    j09 j09VarD3 = j09VarX3.D(j09VarA2);
                                    xn8 xn8VarC3 = s21.c(ndb.b, z4);
                                    int iHashCode3 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM3 = l46Var2.m();
                                    j09 j09VarJ3 = m93.J(l46Var2, j09VarD3);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(LayoutNode.h1);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(hj6.z, l46Var2, xn8VarC3);
                                    dec.l(hj6.y, l46Var2, u8aVarM3);
                                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode3));
                                    dec.k(l46Var2);
                                    dec.l(hj6.x, l46Var2, j09VarJ3);
                                    l46Var2.f0(-1580784290);
                                    it = am3.b.iterator();
                                    i8 = 0;
                                    while (true) {
                                        zHasNext = it.hasNext();
                                        d31Var = d31.a;
                                        if (zHasNext) {
                                            f5 = fD;
                                            l46Var2.r(false);
                                            if (z6) {
                                                f14 = f12;
                                            } else {
                                                f14 = 0.0f;
                                            }
                                            j09 j09VarB3 = d31Var.b(g09Var);
                                            dd2 dd2VarB2 = af1.b0(815980045, new n26() { // from class: ul3
                                                @Override // defpackage.n26
                                                public final Object m(Object obj8, Object obj9, Object obj10) {
                                                    c31 c31Var = (c31) obj8;
                                                    l46 l46Var5 = (l46) obj9;
                                                    int iIntValue2 = ((Integer) obj10).intValue();
                                                    c31Var.getClass();
                                                    if ((iIntValue2 & 6) == 0) {
                                                        iIntValue2 |= l46Var5.g(c31Var) ? 4 : 2;
                                                    }
                                                    if (l46Var5.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                        float f30 = fP5;
                                                        if (f30 > 0.0f) {
                                                            l46Var5.f0(-653184020);
                                                            s21.a(tm7.o(c31Var.b(g09.a), y72.b(j3, f30), g21.f), l46Var5, 0);
                                                            l46Var5.r(false);
                                                        } else {
                                                            l46Var5.f0(-652990859);
                                                            l46Var5.r(false);
                                                        }
                                                    } else {
                                                        l46Var5.Z();
                                                    }
                                                    return wef.a;
                                                }
                                            }, l46Var2);
                                            i8cVar2 = i8cVar3;
                                            y6cVar = y6cVar2;
                                            tarotSkinIdentify2 = tarotSkinIdentify3;
                                            l46 l46Var5 = l46Var2;
                                            z3 = false;
                                            fdc.b(tarotCardType, tarotSkinIdentify2, f14, j09VarB3, 0.0f, null, null, false, dd2VarB2, l46Var5, 100663296, 240);
                                            z2 = z7;
                                            l46Var2 = l46Var5;
                                            l46Var2.r(z2);
                                            l46Var2.r(false);
                                            break;
                                            break;
                                        }
                                        next = it.next();
                                        i9 = i8 + 1;
                                        if (i8 >= 0) {
                                            t72.Z();
                                            throw null;
                                        }
                                        s21.a(tm7.o(oa7.E(tm7.N(-(((Number) next).floatValue() * fD), f13, d31Var.b(g09Var), 2), y6cVar2), ((y72) am3.c.get(i8)).a, g21.f), l46Var2, 0);
                                        fD = fD;
                                        i8 = i9;
                                        f13 = 0.0f;
                                    }
                                } else {
                                    f11 = (-f17) * 0.05f;
                                    if (f11 > 0.3f) {
                                        f11 = 0.3f;
                                    }
                                }
                                f10 = f11;
                                float f214 = 90.0f - uxfVar.c;
                                float f215 = f2;
                                fP = abg.P(0.0f, f214, f215);
                                fP2 = abg.P(1.0f, uxfVar.b, f215);
                                tarotSkinIdentify3 = tarotSkinIdentify4;
                                fP3 = abg.P(0.0f, uxfVar.a * f4, f215);
                                fP4 = abg.P(1.0f, f8, f215);
                                fP5 = abg.P(0.0f, f10, f215);
                                g09Var = g09.a;
                                j09 j09VarW4 = fdc.w(b.m(g09Var, fD, aspectRatio), f17);
                                zD = l46Var2.d(fP) | l46Var2.d(fP2) | l46Var2.d(fP3) | l46Var2.d(fP4);
                                objR10 = l46Var2.R();
                                if (zD) {
                                    f12 = fP;
                                    objR10 = new tl3(f12, fP2, fP3, fP4, 0);
                                    l46Var2.p0(objR10);
                                } else {
                                    f12 = fP;
                                    objR10 = new tl3(f12, fP2, fP3, fP4, 0);
                                    l46Var2.p0(objR10);
                                }
                                j09 j09VarX4 = bzd.x(j09VarW4, (a26) objR10);
                                if (z6) {
                                    l46Var2.f0(177678119);
                                    f13 = 0.0f;
                                    j09VarA2 = vt1.a(g09Var, tarotCardType.getCardKey(), null, l46Var2, 390, 12);
                                    z4 = false;
                                    l46Var2.r(false);
                                } else {
                                    z4 = false;
                                    f13 = 0.0f;
                                    l46Var2.f0(177679652);
                                    l46Var2.r(false);
                                    j09VarA2 = g09Var;
                                }
                                j09 j09VarD4 = j09VarX4.D(j09VarA2);
                                xn8 xn8VarC4 = s21.c(ndb.b, z4);
                                int iHashCode4 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM4 = l46Var2.m();
                                j09 j09VarJ4 = m93.J(l46Var2, j09VarD4);
                                lf2.q.getClass();
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(LayoutNode.h1);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(hj6.z, l46Var2, xn8VarC4);
                                dec.l(hj6.y, l46Var2, u8aVarM4);
                                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode4));
                                dec.k(l46Var2);
                                dec.l(hj6.x, l46Var2, j09VarJ4);
                                l46Var2.f0(-1580784290);
                                it = am3.b.iterator();
                                i8 = 0;
                                while (true) {
                                    zHasNext = it.hasNext();
                                    d31Var = d31.a;
                                    if (zHasNext) {
                                        f5 = fD;
                                        l46Var2.r(false);
                                        if (z6) {
                                            f14 = f12;
                                        } else {
                                            f14 = 0.0f;
                                        }
                                        j09 j09VarB4 = d31Var.b(g09Var);
                                        dd2 dd2VarB3 = af1.b0(815980045, new n26() { // from class: ul3
                                            @Override // defpackage.n26
                                            public final Object m(Object obj8, Object obj9, Object obj10) {
                                                c31 c31Var = (c31) obj8;
                                                l46 l46Var6 = (l46) obj9;
                                                int iIntValue2 = ((Integer) obj10).intValue();
                                                c31Var.getClass();
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= l46Var6.g(c31Var) ? 4 : 2;
                                                }
                                                if (l46Var6.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                    float f30 = fP5;
                                                    if (f30 > 0.0f) {
                                                        l46Var6.f0(-653184020);
                                                        s21.a(tm7.o(c31Var.b(g09.a), y72.b(j3, f30), g21.f), l46Var6, 0);
                                                        l46Var6.r(false);
                                                    } else {
                                                        l46Var6.f0(-652990859);
                                                        l46Var6.r(false);
                                                    }
                                                } else {
                                                    l46Var6.Z();
                                                }
                                                return wef.a;
                                            }
                                        }, l46Var2);
                                        i8cVar2 = i8cVar3;
                                        y6cVar = y6cVar2;
                                        tarotSkinIdentify2 = tarotSkinIdentify3;
                                        l46 l46Var6 = l46Var2;
                                        z3 = false;
                                        fdc.b(tarotCardType, tarotSkinIdentify2, f14, j09VarB4, 0.0f, null, null, false, dd2VarB3, l46Var6, 100663296, 240);
                                        z2 = z7;
                                        l46Var2 = l46Var6;
                                        l46Var2.r(z2);
                                        l46Var2.r(false);
                                        break;
                                        break;
                                    }
                                    next = it.next();
                                    i9 = i8 + 1;
                                    if (i8 >= 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    s21.a(tm7.o(oa7.E(tm7.N(-(((Number) next).floatValue() * fD), f13, d31Var.b(g09Var), 2), y6cVar2), ((y72) am3.c.get(i8)).a, g21.f), l46Var2, 0);
                                    fD = fD;
                                    i8 = i9;
                                    f13 = 0.0f;
                                }
                            } else {
                                f4 = fP0;
                                f5 = fD;
                                tarotSkinIdentify2 = tarotSkinIdentify4;
                                y6cVar = y6cVar2;
                                z2 = z5;
                                z3 = false;
                                i8cVar2 = i8cVar3;
                                l46Var2.f0(1214493446);
                                l46Var2.r(false);
                            }
                            l46Var2.r(z3);
                            sl3Var = this;
                            fD = f5;
                            aspectRatio = aspectRatio;
                            tarotSkinIdentify4 = tarotSkinIdentify2;
                            y6cVar2 = y6cVar;
                            i8cVar3 = i8cVar2;
                            fP0 = f4;
                            z5 = z2;
                            i10 = i11;
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 3120, 4);
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            final int i8 = 1;
            final j09 j09Var2 = j09Var;
            ojbVarV2.d = new l26(tarotSkinIdentify, list, i2, f2, a26Var, l26Var, j09Var2, i3, i8) { // from class: ql3
                public final /* synthetic */ int a;
                public final /* synthetic */ TarotSkinIdentify b;
                public final /* synthetic */ List c;
                public final /* synthetic */ int d;
                public final /* synthetic */ float e;
                public final /* synthetic */ a26 f;
                public final /* synthetic */ l26 g;
                public final /* synthetic */ j09 v;

                {
                    this.a = i8;
                }

                @Override // defpackage.l26
                public final Object z(Object obj4, Object obj5) {
                    int i9 = this.a;
                    wef wefVar = wef.a;
                    switch (i9) {
                        case 0:
                            ((Integer) obj5).getClass();
                            int iP = k99.P(1);
                            am3.a(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj4, iP);
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            int iP2 = k99.P(1);
                            am3.a(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj4, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    public static final void b(n69 n69Var, float f2) {
        ((qz9) n69Var).k(f2);
    }

    public static final float c(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f7 * f7;
        float f9 = f8 * f7;
        float f10 = 3.0f * f8;
        return ((f9 - f8) * f6 * f5) + ((((-2.0f) * f9) + f10) * f3) + (((f9 - (2.0f * f8)) + f7) * f6 * f4) + ((((f9 * 2.0f) - f10) + 1.0f) * f2);
    }

    public static final float[] d(ArrayList arrayList) {
        List list = g;
        ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf(((txf) it.next()).a));
        }
        int size = arrayList.size();
        int i2 = size - 1;
        float[] fArr = new float[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            fArr[i3] = (((Number) arrayList.get(i4)).floatValue() - ((Number) arrayList.get(i3)).floatValue()) / (((Number) arrayList2.get(i4)).floatValue() - ((Number) arrayList2.get(i3)).floatValue());
            i3 = i4;
        }
        float[] fArr2 = new float[size];
        fArr2[0] = fArr[0];
        fArr2[i2] = fArr[size - 2];
        for (int i5 = 1; i5 < i2; i5++) {
            float f2 = fArr[i5 - 1];
            float f3 = 0.0f;
            if (fArr[i5] * f2 > 0.0f) {
                float fMin = Math.min(Math.abs(f2), Math.abs(fArr[i5]));
                f3 = fArr[i5] < 0.0f ? -fMin : fMin;
            }
            fArr2[i5] = f3;
        }
        return fArr2;
    }
}
