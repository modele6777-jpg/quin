package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qtc {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public qtc f;
    public qtc g;

    public qtc(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final qtc a() {
        qtc qtcVar = this.f;
        if (qtcVar == this) {
            qtcVar = null;
        }
        qtc qtcVar2 = this.g;
        qtcVar2.getClass();
        qtcVar2.f = this.f;
        qtc qtcVar3 = this.f;
        qtcVar3.getClass();
        qtcVar3.g = this.g;
        this.f = null;
        this.g = null;
        return qtcVar;
    }

    public final void b(qtc qtcVar) {
        qtcVar.getClass();
        qtcVar.g = this;
        qtcVar.f = this.f;
        qtc qtcVar2 = this.f;
        qtcVar2.getClass();
        qtcVar2.g = qtcVar;
        this.f = qtcVar;
    }

    public final qtc c() {
        this.d = true;
        return new qtc(this.a, this.b, this.c, true);
    }

    public final void d(qtc qtcVar, int i) {
        qtcVar.getClass();
        byte[] bArr = qtcVar.a;
        if (!qtcVar.e) {
            qc0.p("only owner can write");
            return;
        }
        int i2 = qtcVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (qtcVar.d) {
                cva.s();
                return;
            }
            int i4 = qtcVar.b;
            if (i3 - i4 > 8192) {
                cva.s();
                return;
            }
            qd0.X(0, i4, i2, bArr, bArr);
            i2 = qtcVar.c - qtcVar.b;
            qtcVar.c = i2;
            qtcVar.b = 0;
        }
        int i5 = this.b;
        qd0.X(i2, i5, i5 + i, this.a, bArr);
        qtcVar.c += i;
        this.b += i;
    }

    public qtc() {
        this.a = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        this.e = true;
        this.d = false;
    }
}
