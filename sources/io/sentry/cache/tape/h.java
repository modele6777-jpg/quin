package io.sentry.cache.tape;

import defpackage.qc0;
import defpackage.s8f;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Iterator {
    public int a = 0;
    public long b;
    public int c;
    public final /* synthetic */ i d;

    public h(i iVar) {
        this.d = iVar;
        this.b = iVar.e.a;
        this.c = iVar.v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        i iVar = this.d;
        if (iVar.y) {
            qc0.p("closed");
            return false;
        }
        if (iVar.v == this.c) {
            return this.a != iVar.d;
        }
        qc0.e();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        byte[] bArr = i.z;
        i iVar = this.d;
        if (iVar.y) {
            qc0.p("closed");
            return null;
        }
        if (iVar.v != this.c) {
            qc0.e();
            return null;
        }
        int i = iVar.d;
        if (i == 0) {
            s8f.c();
            return null;
        }
        if (this.a >= i) {
            s8f.c();
            return null;
        }
        try {
            g gVarU = iVar.U(this.b);
            int i2 = gVarU.b;
            long j = gVarU.a;
            byte[] bArr2 = new byte[i2];
            long j2 = j + 4;
            long jB1 = iVar.b1(j2);
            this.b = jB1;
            if (!iVar.Z0(i2, jB1, bArr2)) {
                this.a = iVar.d;
                return bArr;
            }
            this.b = iVar.b1(j2 + ((long) i2));
            this.a++;
            return bArr2;
        } catch (IOException e) {
            throw e;
        } catch (OutOfMemoryError unused) {
            iVar.V0();
            this.a = iVar.d;
            return bArr;
        }
    }

    @Override // java.util.Iterator
    public final void remove() throws IOException {
        i iVar = this.d;
        if (iVar.v != this.c) {
            qc0.e();
            return;
        }
        if (iVar.d == 0) {
            s8f.c();
        } else {
            if (this.a != 1) {
                s8f.i("Removal is only permitted from the head.");
                return;
            }
            iVar.U0(1);
            this.c = iVar.v;
            this.a--;
        }
    }
}
