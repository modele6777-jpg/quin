package defpackage;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eg4 implements yrf {
    public static final eg4 a = new eg4();
    public static final w84 b = w84.b1("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.yrf
    public final Object x(cj7 cj7Var, float f) {
        cj7Var.beginObject();
        String strNextString = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zH = true;
        int i = 3;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (cj7Var.hasNext()) {
            switch (cj7Var.x(b)) {
                case 0:
                    strNextString = cj7Var.nextString();
                    break;
                case 1:
                    strNextString2 = cj7Var.nextString();
                    break;
                case 2:
                    fNextDouble = (float) cj7Var.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = cj7Var.nextInt();
                    i = (iNextInt2 <= 2 && iNextInt2 >= 0) ? kv2.C(3)[iNextInt2] : 3;
                    break;
                case 4:
                    iNextInt = cj7Var.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) cj7Var.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) cj7Var.nextDouble();
                    break;
                case 7:
                    iA = lj7.a(cj7Var);
                    break;
                case 8:
                    iA2 = lj7.a(cj7Var);
                    break;
                case 9:
                    fNextDouble4 = (float) cj7Var.nextDouble();
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    zH = cj7Var.h();
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    cj7Var.beginArray();
                    pointF = new PointF(((float) cj7Var.nextDouble()) * f, ((float) cj7Var.nextDouble()) * f);
                    cj7Var.endArray();
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    cj7Var.beginArray();
                    pointF = pointF;
                    pointF2 = new PointF(((float) cj7Var.nextDouble()) * f, ((float) cj7Var.nextDouble()) * f);
                    cj7Var.endArray();
                    break;
                default:
                    cj7Var.E();
                    cj7Var.skipValue();
                    break;
            }
        }
        cj7Var.endObject();
        dg4 dg4Var = new dg4();
        dg4Var.a = strNextString;
        dg4Var.b = strNextString2;
        dg4Var.c = fNextDouble;
        dg4Var.d = i;
        dg4Var.e = iNextInt;
        dg4Var.f = fNextDouble2;
        dg4Var.g = fNextDouble3;
        dg4Var.h = iA;
        dg4Var.i = iA2;
        dg4Var.j = fNextDouble4;
        dg4Var.k = zH;
        dg4Var.l = pointF;
        dg4Var.m = pointF2;
        return dg4Var;
    }
}
