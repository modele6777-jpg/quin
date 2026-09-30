package defpackage;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pte extends eu0 {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final du7 J;
    public final du7 K;
    public final HashMap L;
    public final gg8 M;
    public final ArrayList N;
    public final ArrayList O;
    public final f82 P;
    public final oi8 Q;
    public final uh8 R;
    public final int S;
    public final f82 T;
    public final f82 U;
    public final f82 V;
    public final f82 W;
    public final f82 X;
    public final f82 Y;
    public final f82 Z;
    public final f82 a0;

    public pte(oi8 oi8Var, tu7 tu7Var) {
        veh vehVar;
        veh vehVar2;
        kx kxVar;
        veh vehVar3;
        kx kxVar2;
        veh vehVar4;
        kx kxVar3;
        a82 a82Var;
        kx kxVar4;
        a82 a82Var2;
        lx lxVar;
        a82 a82Var3;
        lx lxVar2;
        a82 a82Var4;
        kx kxVar5;
        a82 a82Var5;
        kx kxVar6;
        super(oi8Var, tu7Var);
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        du7 du7Var = new du7(1, 1);
        du7Var.setStyle(Paint.Style.FILL);
        this.J = du7Var;
        du7 du7Var2 = new du7(1, 2);
        du7Var2.setStyle(Paint.Style.STROKE);
        this.K = du7Var2;
        this.L = new HashMap();
        this.M = new gg8((Object) null);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = 2;
        this.Q = oi8Var;
        this.R = tu7Var.b;
        f82 f82Var = new f82((List) tu7Var.q.b, 3);
        this.P = f82Var;
        f82Var.a(this);
        d(f82Var);
        a90 a90Var = tu7Var.r;
        if (a90Var != null && (a82Var5 = (a82) a90Var.b) != null && (kxVar6 = (kx) a82Var5.c) != null) {
            du0 du0VarC0 = kxVar6.c0();
            this.T = (f82) du0VarC0;
            du0VarC0.a(this);
            d(du0VarC0);
        }
        if (a90Var != null && (a82Var4 = (a82) a90Var.b) != null && (kxVar5 = (kx) a82Var4.d) != null) {
            du0 du0VarC1 = kxVar5.c0();
            this.U = (f82) du0VarC1;
            du0VarC1.a(this);
            d(du0VarC1);
        }
        if (a90Var != null && (a82Var3 = (a82) a90Var.b) != null && (lxVar2 = (lx) a82Var3.b) != null) {
            f82 f82VarC0 = lxVar2.c0();
            this.V = f82VarC0;
            f82VarC0.a(this);
            d(f82VarC0);
        }
        if (a90Var != null && (a82Var2 = (a82) a90Var.b) != null && (lxVar = (lx) a82Var2.e) != null) {
            f82 f82VarC1 = lxVar.c0();
            this.W = f82VarC1;
            f82VarC1.a(this);
            d(f82VarC1);
        }
        if (a90Var != null && (a82Var = (a82) a90Var.b) != null && (kxVar4 = (kx) a82Var.f) != null) {
            du0 du0VarC2 = kxVar4.c0();
            this.X = (f82) du0VarC2;
            du0VarC2.a(this);
            d(du0VarC2);
        }
        if (a90Var != null && (vehVar4 = (veh) a90Var.c) != null && (kxVar3 = (kx) vehVar4.c) != null) {
            du0 du0VarC3 = kxVar3.c0();
            this.Y = (f82) du0VarC3;
            du0VarC3.a(this);
            d(du0VarC3);
        }
        if (a90Var != null && (vehVar3 = (veh) a90Var.c) != null && (kxVar2 = (kx) vehVar3.d) != null) {
            du0 du0VarC4 = kxVar2.c0();
            this.Z = (f82) du0VarC4;
            du0VarC4.a(this);
            d(du0VarC4);
        }
        if (a90Var != null && (vehVar2 = (veh) a90Var.c) != null && (kxVar = (kx) vehVar2.e) != null) {
            du0 du0VarC5 = kxVar.c0();
            this.a0 = (f82) du0VarC5;
            du0VarC5.a(this);
            d(du0VarC5);
        }
        if (a90Var == null || (vehVar = (veh) a90Var.c) == null) {
            return;
        }
        this.S = vehVar.b;
    }

    public static void q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void r(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.eu0, defpackage.ep4
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        uh8 uh8Var = this.R;
        rectF.set(0.0f, 0.0f, uh8Var.k.width(), uh8Var.k.height());
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0286  */
    /* JADX WARN: Code duplicated, block: B:66:0x028d  */
    /* JADX WARN: Code duplicated, block: B:67:0x028f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0293  */
    /* JADX WARN: Code duplicated, block: B:71:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:73:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:80:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:85:0x02f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:93:0x0303  */
    /* JADX WARN: Code duplicated, block: B:95:0x030b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eu0
    public final void i(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        int i2;
        szc szcVar;
        Typeface typefaceCreateFromAsset;
        w37 w37Var;
        HashMap map;
        Typeface typeface;
        HashMap map2;
        Typeface typeface2;
        Typeface typeface3;
        boolean zContains;
        boolean zContains2;
        int i3;
        int i4;
        ArrayList arrayList;
        Canvas canvas2;
        List list;
        du7 du7Var;
        du7 du7Var2;
        dg4 dg4Var = (dg4) this.P.d();
        uh8 uh8Var = this.R;
        up5 up5Var = (up5) uh8Var.f.get(dg4Var.b);
        if (up5Var == null) {
            return;
        }
        String str = up5Var.c;
        String str2 = up5Var.a;
        canvas.save();
        canvas.concat(matrix);
        p(dg4Var, i, 0);
        oi8 oi8Var = this.Q;
        Map map3 = oi8Var.v;
        du7 du7Var3 = this.J;
        int i5 = 0;
        du7 du7Var4 = this.K;
        f82 f82Var = this.W;
        du7 du7Var5 = du7Var4;
        if (map3 == null) {
            i2 = 2;
            if (oi8Var.a.h.d() > 0) {
                float f = dg4Var.c / 100.0f;
                float f2 = 0.0f;
                float[] fArr = (float[]) xqf.e.get();
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f3 = xqf.f;
                fArr[2] = f3;
                fArr[3] = f3;
                float f4 = f;
                matrix.mapPoints(fArr);
                oi8 oi8Var2 = oi8Var;
                Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
                List listAsList = Arrays.asList(dg4Var.a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                int size = listAsList.size();
                float fFloatValue = dg4Var.e / 10.0f;
                if (f82Var != null) {
                    fFloatValue += ((Float) f82Var.d()).floatValue();
                }
                float f5 = fFloatValue;
                int i6 = 0;
                int i7 = -1;
                while (i6 < size) {
                    String str3 = (String) listAsList.get(i6);
                    PointF pointF = dg4Var.m;
                    int i8 = i6;
                    float f6 = f4;
                    pte pteVar = this;
                    List listV = pteVar.v(str3, pointF == null ? f2 : pointF.x, up5Var, f6, f5, true);
                    int i9 = i5;
                    while (i9 < listV.size()) {
                        ote oteVar = (ote) listV.get(i9);
                        List list2 = listV;
                        int i10 = i7 + 1;
                        canvas.save();
                        int i11 = i9;
                        if (pteVar.u(canvas, dg4Var, i10, oteVar.b)) {
                            String str4 = oteVar.a;
                            int i12 = i5;
                            while (i12 < str4.length()) {
                                int iA = vp5.a(str4.charAt(i12), str2, str);
                                String str5 = str4;
                                fud fudVar = uh8Var.h;
                                fudVar.getClass();
                                vp5 vp5Var = (vp5) abg.q(fudVar, iA);
                                if (vp5Var == null) {
                                    f5 = f5;
                                    i12 = i12;
                                    listAsList = listAsList;
                                    size = size;
                                    du7Var = du7Var5;
                                    oi8Var2 = oi8Var2;
                                } else {
                                    pteVar.p(dg4Var, i, i12);
                                    HashMap map4 = pteVar.L;
                                    if (map4.containsKey(vp5Var)) {
                                        list = (List) map4.get(vp5Var);
                                    } else {
                                        ArrayList arrayList2 = vp5Var.a;
                                        int size2 = arrayList2.size();
                                        ArrayList arrayList3 = new ArrayList(size2);
                                        int i13 = i5;
                                        while (i13 < size2) {
                                            arrayList3.add(new km2(oi8Var2, pteVar, (e5d) arrayList2.get(i13), uh8Var));
                                            size2 = size2;
                                            i13++;
                                            arrayList2 = arrayList2;
                                        }
                                        map4.put(vp5Var, arrayList3);
                                        list = arrayList3;
                                    }
                                    int i14 = i5;
                                    while (i14 < list.size()) {
                                        Path pathE = ((km2) list.get(i14)).e();
                                        List list3 = list;
                                        pathE.computeBounds(pteVar.H, i5);
                                        Matrix matrix2 = pteVar.I;
                                        matrix2.reset();
                                        matrix2.preTranslate(f2, (-dg4Var.g) * xqf.c());
                                        matrix2.preScale(f6, f6);
                                        pathE.transform(matrix2);
                                        if (dg4Var.k) {
                                            r(pathE, du7Var3, canvas);
                                            du7Var2 = du7Var5;
                                            r(pathE, du7Var2, canvas);
                                        } else {
                                            du7Var2 = du7Var5;
                                            r(pathE, du7Var2, canvas);
                                            r(pathE, du7Var3, canvas);
                                        }
                                        i14++;
                                        pteVar = this;
                                        du7Var5 = du7Var2;
                                        list = list3;
                                        i5 = 0;
                                        f2 = 0.0f;
                                    }
                                    du7Var = du7Var5;
                                    canvas.translate((xqf.c() * ((float) vp5Var.c) * f6) + f5, 0.0f);
                                }
                                i12++;
                                pteVar = this;
                                du7Var5 = du7Var;
                                oi8Var2 = oi8Var2;
                                str4 = str5;
                                f5 = f5;
                                listAsList = listAsList;
                                size = size;
                                i5 = 0;
                                f2 = 0.0f;
                            }
                        }
                        float f7 = f5;
                        List list4 = listAsList;
                        int i15 = size;
                        du7 du7Var6 = du7Var5;
                        oi8 oi8Var3 = oi8Var2;
                        canvas.restore();
                        i9 = i11 + 1;
                        pteVar = this;
                        listV = list2;
                        i7 = i10;
                        du7Var5 = du7Var6;
                        oi8Var2 = oi8Var3;
                        f5 = f7;
                        listAsList = list4;
                        size = i15;
                        i5 = 0;
                        f2 = 0.0f;
                    }
                    i6 = i8 + 1;
                    f4 = f6;
                    listAsList = listAsList;
                    size = size;
                    i5 = 0;
                    f2 = 0.0f;
                }
                canvas2 = canvas;
            }
            canvas2.restore();
        }
        i2 = 2;
        Map map5 = oi8Var.v;
        if (map5 == null) {
            if (oi8Var.getCallback() == null) {
                szcVar = null;
            } else {
                szcVar = oi8Var.g;
                if (szcVar == null) {
                    szcVar = new szc(oi8Var.getCallback());
                    oi8Var.g = szcVar;
                }
            }
            if (szcVar != null) {
                w37Var = (w37) szcVar.b;
                w37Var.b = str2;
                w37Var.c = str;
                map = (HashMap) szcVar.c;
                typeface = (Typeface) map.get(w37Var);
                if (typeface != null) {
                    typefaceCreateFromAsset = typeface;
                } else {
                    map2 = (HashMap) szcVar.d;
                    typeface2 = (Typeface) map2.get(str2);
                    if (typeface2 != null) {
                        typefaceCreateFromAsset = typeface2;
                    } else {
                        typeface3 = up5Var.d;
                        if (typeface3 != null) {
                            typefaceCreateFromAsset = typeface3;
                        } else {
                            typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) szcVar.e, ib8.j("fonts/", str2, ".ttf"));
                            map2.put(str2, typefaceCreateFromAsset);
                        }
                    }
                    zContains = str.contains("Italic");
                    zContains2 = str.contains("Bold");
                    if (!zContains && zContains2) {
                        i3 = 3;
                    } else if (zContains) {
                        i3 = i2;
                    } else if (zContains2) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i3) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                    }
                    map.put(w37Var, typefaceCreateFromAsset);
                }
            } else {
                typefaceCreateFromAsset = null;
            }
        } else if (map5.containsKey(str2)) {
            typefaceCreateFromAsset = (Typeface) map5.get(str2);
        } else {
            String str6 = up5Var.b;
            if (map5.containsKey(str6)) {
                typefaceCreateFromAsset = (Typeface) map5.get(str6);
            } else {
                String strJ = ub3.j(str2, "-", str);
                if (map5.containsKey(strJ)) {
                    typefaceCreateFromAsset = (Typeface) map5.get(strJ);
                } else {
                    if (oi8Var.getCallback() == null) {
                        szcVar = null;
                    } else {
                        szcVar = oi8Var.g;
                        if (szcVar == null) {
                            szcVar = new szc(oi8Var.getCallback());
                            oi8Var.g = szcVar;
                        }
                    }
                    if (szcVar != null) {
                        w37Var = (w37) szcVar.b;
                        w37Var.b = str2;
                        w37Var.c = str;
                        map = (HashMap) szcVar.c;
                        typeface = (Typeface) map.get(w37Var);
                        if (typeface != null) {
                            typefaceCreateFromAsset = typeface;
                        } else {
                            map2 = (HashMap) szcVar.d;
                            typeface2 = (Typeface) map2.get(str2);
                            if (typeface2 != null) {
                                typefaceCreateFromAsset = typeface2;
                            } else {
                                typeface3 = up5Var.d;
                                if (typeface3 != null) {
                                    typefaceCreateFromAsset = typeface3;
                                } else {
                                    typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) szcVar.e, ib8.j("fonts/", str2, ".ttf"));
                                    map2.put(str2, typefaceCreateFromAsset);
                                }
                            }
                            zContains = str.contains("Italic");
                            zContains2 = str.contains("Bold");
                            if (!zContains) {
                                if (zContains) {
                                    i3 = i2;
                                } else if (zContains2) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                            } else if (zContains) {
                                i3 = i2;
                            } else if (zContains2) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            if (typefaceCreateFromAsset.getStyle() != i3) {
                                typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                            }
                            map.put(w37Var, typefaceCreateFromAsset);
                        }
                    } else {
                        typefaceCreateFromAsset = null;
                    }
                }
            }
        }
        if (typefaceCreateFromAsset == null) {
            typefaceCreateFromAsset = up5Var.d;
        }
        if (typefaceCreateFromAsset != null) {
            String str7 = dg4Var.a;
            du7Var3.setTypeface(typefaceCreateFromAsset);
            float f8 = dg4Var.c;
            du7Var3.setTextSize(xqf.c() * f8);
            du7Var5.setTypeface(du7Var3.getTypeface());
            du7Var5.setTextSize(du7Var3.getTextSize());
            float fFloatValue2 = dg4Var.e / 10.0f;
            if (f82Var != null) {
                fFloatValue2 += ((Float) f82Var.d()).floatValue();
            }
            float fC = ((xqf.c() * fFloatValue2) * f8) / 100.0f;
            List listAsList2 = Arrays.asList(str7.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size3 = listAsList2.size();
            int i16 = 0;
            int i17 = -1;
            int length = 0;
            while (i16 < size3) {
                String str8 = (String) listAsList2.get(i16);
                PointF pointF2 = dg4Var.m;
                float f9 = fC;
                int i18 = i2;
                int i19 = 0;
                for (List listV2 = v(str8, pointF2 == null ? 0.0f : pointF2.x, up5Var, 0.0f, f9, false); i19 < listV2.size(); listV2 = listV2) {
                    ote oteVar2 = (ote) listV2.get(i19);
                    i17++;
                    canvas.save();
                    if (u(canvas, dg4Var, i17, du7Var3.measureText(oteVar2.a))) {
                        String string = oteVar2.a;
                        if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                            Bidi bidi = new Bidi(string, -2);
                            int runCount = bidi.getRunCount();
                            byte[] bArr = new byte[runCount];
                            Integer[] numArr = new Integer[runCount];
                            int i20 = 0;
                            while (i20 < runCount) {
                                bArr[i20] = (byte) bidi.getRunLevel(i20);
                                numArr[i20] = Integer.valueOf(i20);
                                i20++;
                                size3 = size3;
                            }
                            i4 = size3;
                            Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                            StringBuilder sb = this.F;
                            sb.setLength(0);
                            int i21 = 0;
                            while (i21 < runCount) {
                                int iIntValue = numArr[i21].intValue();
                                int i22 = runCount;
                                int runStart = bidi.getRunStart(iIntValue);
                                Integer[] numArr2 = numArr;
                                int runLimit = bidi.getRunLimit(iIntValue);
                                int runLevel = bidi.getRunLevel(iIntValue);
                                String strSubstring = string.substring(runStart, runLimit);
                                if ((runLevel & 1) == 0) {
                                    sb.append(strSubstring);
                                } else {
                                    StringBuilder sb2 = this.G;
                                    int length2 = 0;
                                    sb2.setLength(0);
                                    while (length2 < strSubstring.length()) {
                                        String strO = o(length2, strSubstring);
                                        sb2.insert(0, strO);
                                        length2 += strO.length();
                                        strSubstring = strSubstring;
                                    }
                                    sb.append((CharSequence) sb2);
                                }
                                i21++;
                                runCount = i22;
                                numArr = numArr2;
                                bidi = bidi;
                            }
                            string = sb.toString();
                        } else {
                            i4 = size3;
                        }
                        ArrayList arrayList4 = this.N;
                        arrayList4.clear();
                        int length3 = 0;
                        while (length3 < string.length()) {
                            String strO2 = o(length3, string);
                            arrayList4.add(strO2);
                            length3 += strO2.length();
                        }
                        int i23 = 0;
                        while (i23 < arrayList4.size()) {
                            StringBuilder sb3 = this.E;
                            sb3.setLength(0);
                            sb3.append((String) arrayList4.get(i23));
                            int i24 = i23 + 1;
                            while (i24 < arrayList4.size()) {
                                String str9 = (String) arrayList4.get(i24);
                                int i25 = 0;
                                while (true) {
                                    if (i25 >= str9.length()) {
                                        break;
                                    }
                                    arrayList = arrayList4;
                                    if (Character.getDirectionality(str9.codePointAt(i25)) == 2) {
                                        break;
                                    }
                                    i25++;
                                    arrayList4 = arrayList;
                                }
                                sb3.insert(0, str9);
                                i24++;
                                arrayList4 = arrayList;
                            }
                            ArrayList arrayList5 = arrayList4;
                            String string2 = sb3.toString();
                            p(dg4Var, i, i23 + length);
                            if (dg4Var.k) {
                                q(string2, du7Var3, canvas);
                                q(string2, du7Var5, canvas);
                            } else {
                                q(string2, du7Var5, canvas);
                                q(string2, du7Var3, canvas);
                            }
                            canvas.translate(du7Var3.measureText(string2) + f9, 0.0f);
                            i23 = i24;
                            arrayList4 = arrayList5;
                        }
                    } else {
                        f9 = f9;
                        listAsList2 = listAsList2;
                        i4 = size3;
                    }
                    length += oteVar2.a.length();
                    canvas.restore();
                    i19++;
                    up5Var = up5Var;
                    i18 = 2;
                    f9 = f9;
                    listAsList2 = listAsList2;
                    size3 = i4;
                }
                i16++;
                up5Var = up5Var;
                i2 = i18;
                fC = f9;
                size3 = size3;
            }
        }
        canvas2 = canvas;
        canvas2.restore();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String o(int i, String str) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        gg8 gg8Var = this.M;
        if (gg8Var.b(j)) {
            return (String) gg8Var.c(j);
        }
        StringBuilder sb = this.D;
        sb.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb.toString();
        gg8Var.e(j, string);
        return string;
    }

    public final void p(dg4 dg4Var, int i, int i2) {
        du7 du7Var = this.J;
        f82 f82Var = this.T;
        if (f82Var == null || !t(i2)) {
            du7Var.setColor(dg4Var.h);
        } else {
            du7Var.setColor(((Integer) f82Var.d()).intValue());
        }
        f82 f82Var2 = this.U;
        du7 du7Var2 = this.K;
        if (f82Var2 == null || !t(i2)) {
            du7Var2.setColor(dg4Var.i);
        } else {
            du7Var2.setColor(((Integer) f82Var2.d()).intValue());
        }
        f82 f82Var3 = this.w.p;
        int iIntValue = 100;
        int iIntValue2 = f82Var3 == null ? 100 : ((Integer) f82Var3.d()).intValue();
        f82 f82Var4 = this.X;
        if (f82Var4 != null && t(i2)) {
            iIntValue = ((Integer) f82Var4.d()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        du7Var.setAlpha(iRound);
        du7Var2.setAlpha(iRound);
        f82 f82Var5 = this.V;
        if (f82Var5 == null || !t(i2)) {
            du7Var2.setStrokeWidth(xqf.c() * dg4Var.j);
        } else {
            du7Var2.setStrokeWidth(((Float) f82Var5.d()).floatValue());
        }
    }

    public final ote s(int i) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i; size++) {
            ote oteVar = new ote();
            oteVar.a = "";
            oteVar.b = 0.0f;
            arrayList.add(oteVar);
        }
        return (ote) arrayList.get(i - 1);
    }

    public final boolean t(int i) {
        f82 f82Var;
        int length = ((dg4) this.P.d()).a.length();
        f82 f82Var2 = this.Y;
        if (f82Var2 == null || (f82Var = this.Z) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) f82Var2.d()).intValue(), ((Integer) f82Var.d()).intValue());
        int iMax = Math.max(((Integer) f82Var2.d()).intValue(), ((Integer) f82Var.d()).intValue());
        f82 f82Var3 = this.a0;
        if (f82Var3 != null) {
            int iIntValue = ((Integer) f82Var3.d()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.S == 2) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean u(Canvas canvas, dg4 dg4Var, int i, float f) {
        PointF pointF = dg4Var.l;
        PointF pointF2 = dg4Var.m;
        float fC = xqf.c();
        float f2 = (i * dg4Var.f * fC) + (pointF == null ? 0.0f : (dg4Var.f * fC) + pointF.y);
        if (this.Q.F0 && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + dg4Var.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iB = kv2.B(dg4Var.d);
        if (iB == 0) {
            canvas.translate(f3, f2);
            return true;
        }
        if (iB == 1) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (iB != 2) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    public final List v(String str, float f, up5 up5Var, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                int iA = vp5.a(cCharAt, up5Var.a, up5Var.c);
                fud fudVar = this.R.h;
                fudVar.getClass();
                vp5 vp5Var = (vp5) abg.q(fudVar, iA);
                if (vp5Var != null) {
                    fMeasureText = (xqf.c() * ((float) vp5Var.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.J.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                ote oteVarS = s(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    float length = (f4 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f6);
                    oteVarS.a = strTrim;
                    oteVarS.b = length;
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6;
                    oteVarS.a = strTrim2;
                    oteVarS.b = length2;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            ote oteVarS2 = s(i);
            oteVarS2.a = str.substring(i2);
            oteVarS2.b = f4;
        }
        return this.O.subList(0, i);
    }
}
