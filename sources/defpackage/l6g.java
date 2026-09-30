package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l6g {
    public static final ykd a = xdc.c(384, 672);

    /* JADX WARN: Code duplicated, block: B:78:0x01a9  */
    public static final Float a(Bitmap bitmap) {
        Object next;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (bitmap == null || bitmap.isRecycled()) {
            qc0.j("Bitmap is not valid");
            return null;
        }
        arrayList4.add(z5c.g);
        arrayList3.add(ife.d);
        arrayList3.add(ife.e);
        arrayList3.add(ife.f);
        arrayList3.add(ife.g);
        arrayList3.add(ife.h);
        arrayList3.add(ife.i);
        int height = bitmap.getHeight() * bitmap.getWidth();
        double dSqrt = height > 12544 ? Math.sqrt(12544.0d / ((double) height)) : -1.0d;
        int i = 0;
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        int width = bitmapCreateScaledBitmap.getWidth();
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        a82 a82Var = new a82(iArr, arrayList4.isEmpty() ? null : (ky9[]) arrayList4.toArray(new ky9[arrayList4.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        ArrayList arrayList5 = (ArrayList) a82Var.b;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        kd0 kd0Var = new kd0(0);
        int size = arrayList5.size();
        int i2 = Integer.MIN_VALUE;
        ly9 ly9Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            ly9 ly9Var2 = (ly9) arrayList5.get(i3);
            int i4 = ly9Var2.e;
            if (i4 > i2) {
                ly9Var = ly9Var2;
                i2 = i4;
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            ife ifeVar = (ife) arrayList3.get(i5);
            float[] fArr = ifeVar.c;
            float[] fArr2 = ifeVar.a;
            int length = fArr.length;
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i6 = i; i6 < length; i6++) {
                float f3 = fArr[i6];
                if (f3 > 0.0f) {
                    f2 += f3;
                }
            }
            if (f2 != 0.0f) {
                int length2 = fArr.length;
                for (int i7 = i; i7 < length2; i7++) {
                    float f4 = fArr[i7];
                    if (f4 > 0.0f) {
                        fArr[i7] = f4 / f2;
                    }
                }
            }
            int size3 = arrayList5.size();
            int i8 = i;
            float f5 = 0.0f;
            ly9 ly9Var3 = null;
            while (i8 < size3) {
                int i9 = i;
                ly9 ly9Var4 = (ly9) arrayList5.get(i8);
                float[] fArrB = ly9Var4.b();
                float f6 = fArrB[1];
                float f7 = f;
                float[] fArr3 = ifeVar.b;
                if (f6 < fArr2[i9] || f6 > fArr2[2]) {
                    arrayList = arrayList5;
                    arrayList2 = arrayList3;
                } else {
                    float f8 = fArrB[2];
                    if (f8 < fArr3[i9] || f8 > fArr3[2] || sparseBooleanArray.get(ly9Var4.d)) {
                        arrayList = arrayList5;
                        arrayList2 = arrayList3;
                    } else {
                        float[] fArrB2 = ly9Var4.b();
                        arrayList = arrayList5;
                        int i10 = ly9Var != null ? ly9Var.e : 1;
                        arrayList2 = arrayList3;
                        float[] fArr4 = ifeVar.c;
                        float f9 = fArr4[i9];
                        float fAbs = f9 > f7 ? (1.0f - Math.abs(fArrB2[1] - fArr2[1])) * f9 : f7;
                        float f10 = fArr4[1];
                        float fAbs2 = f10 > f7 ? (1.0f - Math.abs(fArrB2[2] - fArr3[1])) * f10 : f7;
                        float f11 = fArr4[2];
                        float f12 = fAbs + fAbs2 + (f11 > f7 ? (ly9Var4.e / i10) * f11 : f7);
                        if (ly9Var3 == null || f12 > f5) {
                            ly9Var3 = ly9Var4;
                            f5 = f12;
                        }
                    }
                }
                i8++;
                f = f7;
                i = i9;
                arrayList5 = arrayList;
                arrayList3 = arrayList2;
            }
            ArrayList arrayList6 = arrayList5;
            ArrayList arrayList7 = arrayList3;
            int i11 = i;
            if (ly9Var3 != null) {
                sparseBooleanArray.append(ly9Var3.d, true);
            }
            kd0Var.put(ifeVar, ly9Var3);
            i5++;
            i = i11;
            arrayList5 = arrayList6;
            arrayList3 = arrayList7;
        }
        ArrayList arrayList8 = arrayList5;
        int i12 = i;
        sparseBooleanArray.clear();
        ly9 ly9Var5 = (ly9) kd0Var.get(ife.e);
        if (ly9Var5 != null) {
            ly9Var = ly9Var5;
        } else if (ly9Var == null) {
            List listUnmodifiableList = Collections.unmodifiableList(arrayList8);
            listUnmodifiableList.getClass();
            Iterator it = listUnmodifiableList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int i13 = ((ly9) next).e;
                    do {
                        Object next2 = it.next();
                        int i14 = ((ly9) next2).e;
                        if (i13 < i14) {
                            next = next2;
                            i13 = i14;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            ly9Var = (ly9) next;
            if (ly9Var == null) {
                return null;
            }
        }
        float[] fArr5 = new float[3];
        Color.colorToHSV(ly9Var.d, fArr5);
        return Float.valueOf(fArr5[i12]);
    }

    public static final TarotSkinIdentify b(TarotSkinIdentify tarotSkinIdentify, l46 l46Var, int i) {
        tarotSkinIdentify.getClass();
        l46Var.f0(519017583);
        if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
            l46Var.r(false);
            return tarotSkinIdentify;
        }
        if (!tarotSkinIdentify.getRequiresDownload()) {
            l46Var.r(false);
            return tarotSkinIdentify;
        }
        nfc nfcVarB = kr7.b(l46Var);
        boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (zG || objR == obj) {
            objR = nfcVarB.b(job.a.b(kmd.class), null, null);
            l46Var.p0(objR);
        }
        kmd kmdVar = (kmd) objR;
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && l46Var.e(tarotSkinIdentify.ordinal())) || (i & 6) == 4;
        Object objR2 = l46Var.R();
        if (z2 || objR2 == obj) {
            objR2 = q1c.f(Boolean.TRUE);
            l46Var.p0(objR2);
        }
        e89 e89Var = (e89) objR2;
        boolean zG2 = l46Var.g(e89Var) | l46Var.i(kmdVar);
        if ((i2 <= 4 || !l46Var.e(tarotSkinIdentify.ordinal())) && (i & 6) != 4) {
            z = false;
        }
        boolean z3 = zG2 | z;
        Object objR3 = l46Var.R();
        if (z3 || objR3 == obj) {
            objR3 = new i6g(kmdVar, tarotSkinIdentify, e89Var, null);
            l46Var.p0(objR3);
        }
        af1.o((l26) objR3, l46Var, tarotSkinIdentify);
        if (!((Boolean) e89Var.getValue()).booleanValue()) {
            tarotSkinIdentify = r8c.d();
        }
        l46Var.r(false);
        return tarotSkinIdentify;
    }

    public static final z3g c(qhe qheVar, TarotSkinIdentify tarotSkinIdentify, x16 x16Var, l46 l46Var, int i, int i2) {
        x16 x16Var2;
        e89 e89Var;
        qheVar.getClass();
        Object obj = qheVar.a;
        tarotSkinIdentify.getClass();
        l46Var.f0(-1853870647);
        int i3 = i2 & 4;
        Object obj2 = sf2.a;
        if (i3 != 0) {
            Object objR = l46Var.R();
            if (objR == obj2) {
                objR = new yqf(9);
                l46Var.p0(objR);
            }
            x16Var2 = (x16) objR;
        } else {
            x16Var2 = x16Var;
        }
        if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
            l46Var.r(false);
            return null;
        }
        Context context = (Context) l46Var.k(uq.b);
        aw6 aw6Var = (aw6) l46Var.k(n72.a);
        nfc nfcVarB = kr7.b(l46Var);
        boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
        Object objR2 = l46Var.R();
        if (zG || objR2 == obj2) {
            objR2 = nfcVarB.b(job.a.b(kmd.class), null, null);
            l46Var.p0(objR2);
        }
        kmd kmdVar = (kmd) objR2;
        e89 e89VarI = q1c.i(x16Var2, l46Var);
        int i4 = (i & 112) ^ 48;
        boolean z = true;
        boolean zG2 = l46Var.g(obj) | ((i4 > 32 && l46Var.e(tarotSkinIdentify.ordinal())) || (i & 48) == 32);
        Object objR3 = l46Var.R();
        if (zG2 || objR3 == obj2) {
            objR3 = q1c.f(null);
            l46Var.p0(objR3);
        }
        e89 e89Var2 = (e89) objR3;
        boolean zG3 = l46Var.g(e89Var2) | l46Var.i(kmdVar);
        if ((i4 <= 32 || !l46Var.e(tarotSkinIdentify.ordinal())) && (i & 48) != 32) {
            z = false;
        }
        boolean zI = zG3 | z | l46Var.i(qheVar) | l46Var.i(aw6Var) | l46Var.i(context) | l46Var.g(e89VarI);
        Object objR4 = l46Var.R();
        if (zI || objR4 == obj2) {
            e89Var = e89Var2;
            Object k6gVar = new k6g(kmdVar, tarotSkinIdentify, qheVar, aw6Var, context, e89Var, e89VarI, null);
            l46Var.p0(k6gVar);
            objR4 = k6gVar;
        } else {
            e89Var = e89Var2;
        }
        af1.p(obj, tarotSkinIdentify, (l26) objR4, l46Var);
        z3g z3gVar = (z3g) e89Var.getValue();
        l46Var.r(false);
        return z3gVar;
    }
}
