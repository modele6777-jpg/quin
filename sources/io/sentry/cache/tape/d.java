package io.sentry.cache.tape;

import defpackage.b85;
import defpackage.qc0;
import defpackage.r82;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {
    public final i a;
    public final b85 b = new b85();
    public final e c;

    public d(i iVar, e eVar) {
        this.a = iVar;
        this.c = eVar;
    }

    @Override // io.sentry.cache.tape.f
    public final void C0(int i) throws IOException {
        this.a.U0(i);
    }

    @Override // io.sentry.cache.tape.f
    public final void H0() throws IOException {
        i iVar = this.a;
        if (iVar.x) {
            return;
        }
        iVar.a.getChannel().force(false);
    }

    @Override // io.sentry.cache.tape.f
    public final void clear() throws IOException {
        this.a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this, new h(this.a));
    }

    @Override // io.sentry.cache.tape.f
    public final int size() {
        return this.a.d;
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.a + '}';
    }

    @Override // io.sentry.cache.tape.f
    public final void x(Comparable comparable) throws IOException {
        long j;
        long j2;
        long j3;
        long jB1;
        long j4;
        long j5;
        b85 b85Var = this.b;
        b85Var.reset();
        this.c.c(comparable, b85Var);
        i iVar = this.a;
        byte[] bArr = iVar.g;
        byte[] bArrB = b85Var.b();
        int size = b85Var.size();
        if (bArrB == null) {
            r82.g("data == null");
            return;
        }
        if (size < 0 || size > bArrB.length) {
            throw new IndexOutOfBoundsException();
        }
        if (iVar.y) {
            qc0.p("closed");
            return;
        }
        int i = iVar.w;
        if (i != -1 && iVar.d == i) {
            iVar.U0(1);
        }
        long j6 = ((long) size) + 4;
        long j7 = iVar.c;
        if (iVar.d == 0) {
            j = 4;
            j3 = 32;
            j2 = 32;
        } else {
            g gVar = iVar.f;
            long j8 = gVar.a;
            j = 4;
            long j9 = iVar.e.a;
            int i2 = gVar.b;
            if (j8 >= j9) {
                j3 = (j8 - j9) + 4 + ((long) i2) + 32;
                j2 = 32;
            } else {
                j2 = 32;
                j3 = (((j8 + 4) + ((long) i2)) + j7) - j9;
            }
        }
        long j10 = j7 - j3;
        if (j10 < j6) {
            do {
                j10 += j7;
                j7 <<= 1;
            } while (j10 < j6);
            iVar.a.setLength(j7);
            iVar.a.getChannel().force(true);
            g gVar2 = iVar.f;
            long jB2 = iVar.b1(gVar2.a + j + ((long) gVar2.b));
            if (jB2 <= iVar.e.a) {
                FileChannel channel = iVar.a.getChannel();
                channel.position(iVar.c);
                j4 = jB2 - j2;
                if (channel.transferTo(32L, j4, channel) != j4) {
                    qc0.i("Copied insufficient number of bytes!");
                    return;
                }
            } else {
                j4 = 0;
            }
            long j11 = iVar.f.a;
            long j12 = iVar.e.a;
            if (j11 < j12) {
                long j13 = (iVar.c + j11) - j2;
                j5 = j7;
                iVar.c1(iVar.d, j5, j12, j13);
                iVar.f = new g(j13, iVar.f.b);
            } else {
                j5 = j7;
                iVar.c1(iVar.d, j5, j12, j11);
            }
            iVar.c = j5;
            long j14 = j2;
            long j15 = j4;
            while (j15 > 0) {
                int iMin = (int) Math.min(j15, 4096L);
                iVar.a1(iMin, j14, i.z);
                long j16 = iMin;
                j15 -= j16;
                j14 += j16;
            }
        }
        boolean z = iVar.d == 0;
        if (z) {
            jB1 = j2;
        } else {
            g gVar3 = iVar.f;
            jB1 = iVar.b1(gVar3.a + j + ((long) gVar3.b));
        }
        g gVar4 = new g(jB1, size);
        i.d1(bArr, 0, size);
        iVar.a1(4, jB1, bArr);
        iVar.a1(size, jB1 + j, bArrB);
        iVar.c1(iVar.d + 1, iVar.c, z ? jB1 : iVar.e.a, jB1);
        iVar.f = gVar4;
        iVar.d++;
        iVar.v++;
        if (z) {
            iVar.e = gVar4;
        }
    }
}
