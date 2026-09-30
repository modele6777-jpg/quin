package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b68 extends l4d implements i97 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;

    public b68(List list, List list2, long j, long j2) {
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.i97
    public final Object b(float f, Object obj) {
        if (obj == null) {
            obj = new dtd(y72.j);
        }
        boolean z = obj instanceof dtd;
        List list = this.c;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                long j = ((y72) list.get(i)).a;
                arrayList.add(new y72(((dtd) obj).a));
            }
            obj = new b68(arrayList, this.d, this.e, this.f);
        }
        if (!(obj instanceof b68)) {
            return null;
        }
        b68 b68Var = (b68) obj;
        return new b68(k99.F(list, b68Var.c, f), k99.G(this.d, b68Var.d, f), k99.H(this.e, b68Var.e, f), k99.H(this.f, b68Var.f, f));
    }

    @Override // defpackage.l4d
    public final Shader c(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.c;
        List list2 = this.d;
        y7h.T(list, list2);
        int i5 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            int size = list.size();
            long[] jArr = new long[size];
            while (i5 < size) {
                jArr[i5] = bm8.b0(((y72) list.get(i5)).a);
                i5++;
            }
            return yc6.a.a(jFloatToRawIntBits, jFloatToRawIntBits2, jArr, list2 != null ? s72.g1(list2) : null, 0);
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size2 = list.size();
        int[] iArr = new int[size2];
        while (i5 < size2) {
            iArr[i5] = abg.Z(((y72) list.get(i5)).a);
            i5++;
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, y7h.z(list2, list), jgb.h0(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b68)) {
            return false;
        }
        b68 b68Var = (b68) obj;
        return this.c.equals(b68Var.c) && pa7.t(this.d, b68Var.d) && hl9.c(this.e, b68Var.e) && hl9.c(this.f, b68Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(0) + ib8.b(ib8.b((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        long j = this.e;
        String strJ = ((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? ib8.j("start=", hl9.i(j), ", ") : "";
        long j2 = this.f;
        String strJ2 = ((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? ib8.j("end=", hl9.i(j2), ", ") : "";
        String strQ = y8c.q(0);
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        ub3.v(sb, strJ, strJ2, "tileMode=", strQ);
        sb.append(")");
        return sb.toString();
    }
}
