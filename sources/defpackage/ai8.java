package defpackage;

import android.graphics.Rect;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ai8 {
    public static final w84 a = w84.b1("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final w84 b = w84.b1("id", "layers", "w", "h", "p", "u");
    public static final w84 c = w84.b1("list");
    public static final w84 d = w84.b1("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static uh8 a(kj7 kj7Var) throws uh7, EOFException {
        float f;
        uh8 uh8Var;
        int i;
        float f2;
        uh8 uh8Var2;
        int i2;
        float f3;
        float f4;
        float fC = xqf.c();
        gg8 gg8Var = new gg8((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        fud fudVar = new fud(0);
        uh8 uh8Var3 = new uh8();
        kj7Var.beginObject();
        int iNextDouble = 0;
        int iNextDouble2 = 0;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        while (kj7Var.hasNext()) {
            switch (kj7Var.x(a)) {
                case 0:
                    iNextDouble = (int) kj7Var.nextDouble();
                    uh8Var3 = uh8Var3;
                    break;
                case 1:
                    iNextDouble2 = (int) kj7Var.nextDouble();
                    uh8Var3 = uh8Var3;
                    break;
                case 2:
                    fNextDouble2 = (float) kj7Var.nextDouble();
                    uh8Var3 = uh8Var3;
                    break;
                case 3:
                    fNextDouble = ((float) kj7Var.nextDouble()) - 0.01f;
                    uh8Var3 = uh8Var3;
                    fC = fC;
                    break;
                case 4:
                    fNextDouble3 = (float) kj7Var.nextDouble();
                    uh8Var3 = uh8Var3;
                    fC = fC;
                    break;
                case 5:
                    f = fC;
                    uh8Var = uh8Var3;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    String[] strArrSplit = kj7Var.nextString().split("\\.");
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    int i4 = Integer.parseInt(strArrSplit[1]);
                    int i5 = Integer.parseInt(strArrSplit[2]);
                    if (i3 < 4 || (i3 <= 4 && (i4 < 4 || (i4 <= 4 && i5 < 0)))) {
                        uh8Var.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    uh8Var3 = uh8Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                case 6:
                    f = fC;
                    uh8 uh8Var4 = uh8Var3;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    kj7Var.beginArray();
                    int i6 = 0;
                    while (kj7Var.hasNext()) {
                        uh8 uh8Var5 = uh8Var4;
                        tu7 tu7VarA = vu7.a(kj7Var, uh8Var5);
                        if (tu7VarA.e == 3) {
                            i6++;
                        }
                        arrayList.add(tu7VarA);
                        gg8Var.e(tu7VarA.d, tu7VarA);
                        if (i6 > 4) {
                            gf8.b("You have " + i6 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        uh8Var4 = uh8Var5;
                    }
                    uh8Var = uh8Var4;
                    kj7Var.endArray();
                    uh8Var3 = uh8Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                case 7:
                    f = fC;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    kj7Var.beginArray();
                    while (kj7Var.hasNext()) {
                        ArrayList arrayList3 = new ArrayList();
                        gg8 gg8Var2 = new gg8((Object) null);
                        kj7Var.beginObject();
                        String strNextString = null;
                        String strNextString2 = null;
                        String strNextString3 = null;
                        int iNextInt = 0;
                        int iNextInt2 = 0;
                        while (kj7Var.hasNext()) {
                            int iX = kj7Var.x(b);
                            if (iX != 0) {
                                if (iX == 1) {
                                    kj7Var.beginArray();
                                    while (kj7Var.hasNext()) {
                                        tu7 tu7VarA2 = vu7.a(kj7Var, uh8Var3);
                                        gg8Var2.e(tu7VarA2.d, tu7VarA2);
                                        arrayList3.add(tu7VarA2);
                                        uh8Var3 = uh8Var3;
                                    }
                                    uh8Var2 = uh8Var3;
                                    kj7Var.endArray();
                                } else if (iX == 2) {
                                    iNextInt = kj7Var.nextInt();
                                } else if (iX == 3) {
                                    iNextInt2 = kj7Var.nextInt();
                                } else if (iX == 4) {
                                    strNextString2 = kj7Var.nextString();
                                } else if (iX != 5) {
                                    kj7Var.E();
                                    kj7Var.skipValue();
                                    uh8Var2 = uh8Var3;
                                } else {
                                    strNextString3 = kj7Var.nextString();
                                }
                                uh8Var3 = uh8Var2;
                            } else {
                                strNextString = kj7Var.nextString();
                            }
                        }
                        uh8 uh8Var6 = uh8Var3;
                        kj7Var.endObject();
                        if (strNextString2 != null) {
                            map2.put(strNextString, new ri8(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3));
                        } else {
                            map.put(strNextString, arrayList3);
                        }
                        uh8Var3 = uh8Var6;
                    }
                    kj7Var.endArray();
                    uh8Var = uh8Var3;
                    uh8Var3 = uh8Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                case 8:
                    f = fC;
                    int i7 = iNextDouble2;
                    float f5 = fNextDouble2;
                    kj7Var.beginObject();
                    while (kj7Var.hasNext()) {
                        if (kj7Var.x(c) != 0) {
                            kj7Var.E();
                            kj7Var.skipValue();
                        } else {
                            kj7Var.beginArray();
                            while (kj7Var.hasNext()) {
                                w84 w84Var = gq5.a;
                                kj7Var.beginObject();
                                String strNextString4 = null;
                                String strNextString5 = null;
                                String strNextString6 = null;
                                while (kj7Var.hasNext()) {
                                    i7 = i7;
                                    int iX2 = kj7Var.x(gq5.a);
                                    if (iX2 != 0) {
                                        float f6 = f5;
                                        if (iX2 == 1) {
                                            strNextString5 = kj7Var.nextString();
                                        } else if (iX2 == 2) {
                                            strNextString6 = kj7Var.nextString();
                                        } else if (iX2 != 3) {
                                            kj7Var.E();
                                            kj7Var.skipValue();
                                        } else {
                                            kj7Var.nextDouble();
                                        }
                                        f5 = f6;
                                    } else {
                                        strNextString4 = kj7Var.nextString();
                                    }
                                }
                                kj7Var.endObject();
                                map3.put(strNextString5, new up5(strNextString4, strNextString5, strNextString6));
                                i7 = i7;
                            }
                            kj7Var.endArray();
                        }
                    }
                    i = i7;
                    f2 = f5;
                    kj7Var.endObject();
                    uh8Var = uh8Var3;
                    uh8Var3 = uh8Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                case 9:
                    f = fC;
                    i2 = iNextDouble2;
                    f3 = fNextDouble2;
                    kj7Var.beginArray();
                    while (kj7Var.hasNext()) {
                        w84 w84Var2 = wp5.a;
                        ArrayList arrayList4 = new ArrayList();
                        kj7Var.beginObject();
                        double dNextDouble = 0.0d;
                        char cCharAt = 0;
                        String strNextString7 = null;
                        String strNextString8 = null;
                        while (kj7Var.hasNext()) {
                            int iX3 = kj7Var.x(wp5.a);
                            if (iX3 == 0) {
                                cCharAt = kj7Var.nextString().charAt(0);
                            } else if (iX3 == 1) {
                                kj7Var.nextDouble();
                            } else if (iX3 == 2) {
                                dNextDouble = kj7Var.nextDouble();
                            } else if (iX3 == 3) {
                                strNextString7 = kj7Var.nextString();
                            } else if (iX3 == 4) {
                                strNextString8 = kj7Var.nextString();
                            } else if (iX3 != 5) {
                                kj7Var.E();
                                kj7Var.skipValue();
                            } else {
                                kj7Var.beginObject();
                                while (kj7Var.hasNext()) {
                                    if (kj7Var.x(wp5.b) != 0) {
                                        kj7Var.E();
                                        kj7Var.skipValue();
                                    } else {
                                        kj7Var.beginArray();
                                        while (kj7Var.hasNext()) {
                                            arrayList4.add((e5d) xm2.a(kj7Var, uh8Var3));
                                        }
                                        kj7Var.endArray();
                                    }
                                }
                                kj7Var.endObject();
                            }
                        }
                        kj7Var.endObject();
                        vp5 vp5Var = new vp5(arrayList4, cCharAt, dNextDouble, strNextString7, strNextString8);
                        fudVar.c(vp5Var.hashCode(), vp5Var);
                    }
                    kj7Var.endArray();
                    i = i2;
                    f2 = f3;
                    uh8Var = uh8Var3;
                    uh8Var3 = uh8Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    kj7Var.beginArray();
                    while (kj7Var.hasNext()) {
                        kj7Var.beginObject();
                        String strNextString9 = null;
                        float fNextDouble4 = 0.0f;
                        while (kj7Var.hasNext()) {
                            int iX4 = kj7Var.x(d);
                            if (iX4 != 0) {
                                f4 = fC;
                                if (iX4 == 1) {
                                    fNextDouble2 = fNextDouble2;
                                    fNextDouble4 = (float) kj7Var.nextDouble();
                                    iNextDouble2 = iNextDouble2;
                                } else if (iX4 != 2) {
                                    kj7Var.E();
                                    kj7Var.skipValue();
                                } else {
                                    kj7Var.nextDouble();
                                }
                            } else {
                                f4 = fC;
                                strNextString9 = kj7Var.nextString();
                            }
                            fC = f4;
                        }
                        kj7Var.endObject();
                        arrayList2.add(new km8(strNextString9, fNextDouble4));
                        iNextDouble2 = iNextDouble2;
                        fNextDouble2 = fNextDouble2;
                        fC = fC;
                    }
                    f = fC;
                    i2 = iNextDouble2;
                    f3 = fNextDouble2;
                    kj7Var.endArray();
                    i = i2;
                    f2 = f3;
                    uh8Var = uh8Var3;
                    uh8Var3 = uh8Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                default:
                    kj7Var.E();
                    kj7Var.skipValue();
                    f = fC;
                    uh8Var = uh8Var3;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    uh8Var3 = uh8Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
            }
        }
        float f7 = fC;
        uh8 uh8Var7 = uh8Var3;
        Rect rect = new Rect(0, 0, (int) (iNextDouble * f7), (int) (iNextDouble2 * f7));
        float fC2 = xqf.c();
        uh8Var7.k = rect;
        uh8Var7.l = fNextDouble2;
        uh8Var7.m = fNextDouble;
        uh8Var7.n = fNextDouble3;
        uh8Var7.j = arrayList;
        uh8Var7.i = gg8Var;
        uh8Var7.c = map;
        uh8Var7.d = map2;
        uh8Var7.e = fC2;
        uh8Var7.h = fudVar;
        uh8Var7.f = map3;
        uh8Var7.g = arrayList2;
        return uh8Var7;
    }
}
