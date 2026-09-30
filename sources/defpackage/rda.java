package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rda implements qu8 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public rda(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static rda d(d0a d0aVar) {
        int iM = d0aVar.m();
        String strL = qv8.l(d0aVar.x(d0aVar.m(), StandardCharsets.US_ASCII));
        String strX = d0aVar.x(d0aVar.m(), StandardCharsets.UTF_8);
        int iM2 = d0aVar.m();
        int iM3 = d0aVar.m();
        int iM4 = d0aVar.m();
        int iM5 = d0aVar.m();
        int iM6 = d0aVar.m();
        byte[] bArr = new byte[iM6];
        d0aVar.k(bArr, 0, iM6);
        return new rda(iM, strL, strX, iM2, iM3, iM4, iM5, bArr);
    }

    @Override // defpackage.qu8
    public final void b(r23 r23Var) {
        r23Var.b(this.h, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rda.class != obj.getClass()) {
            return false;
        }
        rda rdaVar = (rda) obj;
        return this.a == rdaVar.a && this.b.equals(rdaVar.b) && this.c.equals(rdaVar.c) && this.d == rdaVar.d && this.e == rdaVar.e && this.f == rdaVar.f && this.g == rdaVar.g && Arrays.equals(this.h, rdaVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((ub3.c(ub3.c((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
