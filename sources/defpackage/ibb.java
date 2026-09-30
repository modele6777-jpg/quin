package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ibb extends l4d implements i97 {
    public final List c;
    public final List d;
    public final long e;
    public final float f;

    public ibb(List list, List list2, long j, float f) {
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = f;
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
            obj = new ibb(arrayList, this.d, this.e, this.f);
        }
        if (!(obj instanceof ibb)) {
            return null;
        }
        ibb ibbVar = (ibb) obj;
        return new ibb(k99.F(list, ibbVar.c, f), k99.G(this.d, ibbVar.d, f), ynb.W(this.e, ibbVar.e, f), abg.P(this.f, ibbVar.f, f));
    }

    @Override // defpackage.l4d
    public final Shader c(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.e;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jF = dec.f(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jF >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        float fC = this.f;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = ald.c(j) / 2.0f;
        }
        float f = fC;
        List list = this.c;
        List list2 = this.d;
        y7h.T(list, list2);
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            int size = list.size();
            long[] jArr = new long[size];
            while (i3 < size) {
                jArr[i3] = bm8.b0(((y72) list.get(i3)).a);
                i3++;
            }
            return yc6.a.b(jFloatToRawIntBits, f, jArr, list2 != null ? s72.g1(list2) : null, 0);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        int size2 = list.size();
        int[] iArr = new int[size2];
        while (i3 < size2) {
            iArr[i3] = abg.Z(((y72) list.get(i3)).a);
            i3++;
        }
        return new RadialGradient(fIntBitsToFloat3, fIntBitsToFloat4, f, iArr, y7h.z(list2, list), jgb.h0(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibb)) {
            return false;
        }
        ibb ibbVar = (ibb) obj;
        return this.c.equals(ibbVar.c) && pa7.t(this.d, ibbVar.d) && hl9.c(this.e, ibbVar.e) && this.f == ibbVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(0) + ub3.a(this.f, ib8.b((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        long j = this.e;
        String strJ = (9223372034707292159L & j) != 9205357640488583168L ? ib8.j("center=", hl9.i(j), ", ") : "";
        float f = this.f;
        String strJ2 = (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040 ? kv2.j("radius=", f, ", ") : "";
        String strQ = y8c.q(0);
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        ub3.v(sb, strJ, strJ2, "tileMode=", strQ);
        sb.append(")");
        return sb.toString();
    }
}
