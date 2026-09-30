package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oia {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public oia q;

    public oia(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        oia oiaVar = this.q;
        if (oiaVar == null) {
            this.o = true;
            this.p = true;
        } else if (oiaVar != null) {
            oiaVar.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        return arrayList == null ? pu4.a : arrayList;
    }

    public final boolean c() {
        oia oiaVar = this.q;
        if (oiaVar != null) {
            return oiaVar.c();
        }
        return this.o || this.p;
    }

    public final String toString() {
        String strA0 = kn2.a0(this.a);
        String strI = hl9.i(this.c);
        String strI2 = hl9.i(this.g);
        boolean zC = c();
        String strA = xia.a(this.i);
        List listB = b();
        String strI3 = hl9.i(this.j);
        String strI4 = hl9.i(this.l);
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append(strA0);
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(strI);
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append(strI2);
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(zC);
        sb.append(", type=");
        sb.append(strA);
        sb.append(", historical=");
        sb.append(listB);
        sb.append(", scrollDelta=");
        sb.append(strI3);
        sb.append(", scaleFactor=");
        sb.append(this.k);
        return ib8.m(sb, ", panOffset=", strI4, ")");
    }

    public oia(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
