package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oy5 {
    public final k1f a;
    public n1f d;
    public is3 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public rr5 l;
    public rr5 m;
    public boolean n;
    public final g1f b = new g1f();
    public final d0a c = new d0a();
    public final d0a j = new d0a(1);
    public final d0a k = new d0a();

    public oy5(k1f k1fVar, n1f n1fVar, is3 is3Var, rr5 rr5Var) {
        this.a = k1fVar;
        this.d = n1fVar;
        this.e = is3Var;
        this.m = rr5Var;
        if (y41.z(rr5Var.p)) {
            this.l = rr5Var;
        }
        this.d = n1fVar;
        this.e = is3Var;
        if (this.l == null) {
            k1fVar.g(this.m);
        }
        e();
    }

    public final int a() {
        int i;
        if (this.n) {
            i = this.b.j[this.f] ? 1 : 0;
        } else {
            i = this.d.g[this.f];
        }
        return b() != null ? 1073741824 | i : i;
    }

    public final f1f b() {
        if (this.n) {
            g1f g1fVar = this.b;
            is3 is3Var = g1fVar.a;
            String str = pqf.a;
            int i = is3Var.a;
            f1f f1fVar = g1fVar.m;
            if (f1fVar == null) {
                f1f[] f1fVarArr = this.d.a.n;
                f1fVar = f1fVarArr == null ? null : f1fVarArr[i];
            }
            if (f1fVar != null && f1fVar.a) {
                return f1fVar;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f++;
        if (!this.n) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        d0a d0aVar;
        f1f f1fVarB = b();
        if (f1fVarB == null) {
            return 0;
        }
        int length = f1fVarB.d;
        g1f g1fVar = this.b;
        if (length != 0) {
            d0aVar = g1fVar.n;
        } else {
            byte[] bArr = f1fVarB.e;
            String str = pqf.a;
            int length2 = bArr.length;
            d0a d0aVar2 = this.k;
            d0aVar2.K(bArr, length2);
            length = bArr.length;
            d0aVar = d0aVar2;
        }
        boolean z = g1fVar.k && g1fVar.l[this.f];
        boolean z2 = z || i2 != 0;
        d0a d0aVar3 = this.j;
        d0aVar3.a[0] = (byte) ((z2 ? UserMetadata.MAX_ROLLOUT_ASSIGNMENTS : 0) | length);
        d0aVar3.M(0);
        k1f k1fVar = this.a;
        k1fVar.b(d0aVar3, 1, 1);
        k1fVar.b(d0aVar, length, 1);
        if (!z2) {
            return length + 1;
        }
        d0a d0aVar4 = this.c;
        if (!z) {
            d0aVar4.J(8);
            byte[] bArr2 = d0aVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            k1fVar.b(d0aVar4, 8, 1);
            return length + 9;
        }
        d0a d0aVar5 = g1fVar.n;
        int iG = d0aVar5.G();
        d0aVar5.N(-2);
        int i3 = (iG * 6) + 2;
        if (i2 != 0) {
            d0aVar4.J(i3);
            byte[] bArr3 = d0aVar4.a;
            d0aVar5.k(bArr3, 0, i3);
            int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i4 >> 8) & 255);
            bArr3[3] = (byte) (i4 & 255);
        } else {
            d0aVar4 = d0aVar5;
        }
        k1fVar.b(d0aVar4, i3, 1);
        return length + 1 + i3;
    }

    public final void e() {
        g1f g1fVar = this.b;
        g1fVar.d = 0;
        g1fVar.p = 0L;
        g1fVar.q = false;
        g1fVar.k = false;
        g1fVar.o = false;
        g1fVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.n = false;
    }
}
