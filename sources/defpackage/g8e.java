package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g8e implements k1f {
    public final k1f a;
    public final d8e b;
    public f8e g;
    public rr5 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = pqf.b;
    public final d0a c = new d0a();

    public g8e(k1f k1fVar, d8e d8eVar) {
        this.a = k1fVar;
        this.b = d8eVar;
    }

    @Override // defpackage.k1f
    public final void a(long j, int i, int i2, int i3, j1f j1fVar) {
        int i4;
        if (this.g == null) {
            this.a.a(j, i, i2, i3, j1fVar);
            return;
        }
        pa7.z("DRM on subtitles is not supported", j1fVar == null);
        int i5 = (this.e - i3) - i2;
        try {
            i4 = i5;
            try {
                this.g.s(this.f, i4, i2, e8e.c, new po3(this, j, i));
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                if (!this.i) {
                    throw runtimeException;
                }
                xo1.W("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e2) {
            e = e2;
            i4 = i5;
        }
        int i6 = i4 + i2;
        this.d = i6;
        if (i6 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.k1f
    public final void b(d0a d0aVar, int i, int i2) {
        if (this.g == null) {
            this.a.b(d0aVar, i, i2);
            return;
        }
        h(i);
        d0aVar.k(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.k1f
    public final int f(sb3 sb3Var, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.f(sb3Var, i, z);
        }
        h(i);
        int i2 = sb3Var.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.k1f
    public final void g(rr5 rr5Var) {
        rr5Var.p.getClass();
        String str = rr5Var.p;
        pa7.A(qv8.g(str) == 3);
        boolean zEquals = rr5Var.equals(this.h);
        d8e d8eVar = this.b;
        if (!zEquals) {
            this.h = rr5Var;
            this.g = d8eVar.c(rr5Var) ? d8eVar.V(rr5Var) : null;
        }
        f8e f8eVar = this.g;
        k1f k1fVar = this.a;
        if (f8eVar == null) {
            k1fVar.g(rr5Var);
            return;
        }
        qr5 qr5VarA = rr5Var.a();
        qr5VarA.o = qv8.l("application/x-media3-cues");
        qr5VarA.k = str;
        qr5VarA.t = Long.MAX_VALUE;
        qr5VarA.P = d8eVar.w0(rr5Var);
        k1fVar.g(new rr5(qr5VarA));
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
