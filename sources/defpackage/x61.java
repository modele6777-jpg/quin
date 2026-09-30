package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x61 extends OutputStream {
    public static final byte[] e = new byte[0];
    public int b;
    public int d;
    public final ArrayList a = new ArrayList();
    public byte[] c = new byte[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];

    public final void b(int i) {
        this.a.add(new m98(this.c));
        int length = this.b + this.c.length;
        this.b = length;
        this.c = new byte[Math.max(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, Math.max(i, length >>> 1))];
        this.d = 0;
    }

    public final void h() {
        int i = this.d;
        byte[] bArr = this.c;
        int length = bArr.length;
        ArrayList arrayList = this.a;
        if (i >= length) {
            arrayList.add(new m98(bArr));
            this.c = e;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new m98(bArr2));
        }
        this.b += this.d;
        this.d = 0;
    }

    public final synchronized z61 l() {
        ArrayList arrayList;
        h();
        arrayList = this.a;
        return arrayList.isEmpty() ? z61.a : z61.a(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.b + this.d;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.c;
            int length = bArr2.length;
            int i3 = this.d;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.d += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                b(i4);
                System.arraycopy(bArr, i + length2, this.c, 0, i4);
                this.d = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.d == this.c.length) {
                b(1);
            }
            byte[] bArr = this.c;
            int i2 = this.d;
            this.d = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
