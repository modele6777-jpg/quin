package defpackage;

import com.google.android.play.core.assetpacks.q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dgg extends OutputStream {
    public final qgg a = new qgg();
    public final File b;
    public final q c;
    public long d;
    public long e;
    public FileOutputStream f;
    public pfg g;

    public dgg(File file, q qVar) {
        this.b = file;
        this.c = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        int i3;
        while (i2 > 0) {
            long j = this.d;
            q qVar = this.c;
            if (j == 0 && this.e == 0) {
                qgg qggVar = this.a;
                int iA = qggVar.a(bArr, i, i2);
                if (iA == -1) {
                    return;
                }
                i += iA;
                i2 -= iA;
                pfg pfgVarB = qggVar.b();
                this.g = pfgVarB;
                if (pfgVarB.e) {
                    this.d = 0L;
                    byte[] bArr3 = pfgVarB.f;
                    qVar.k(bArr3, bArr3.length);
                    this.e = this.g.f.length;
                } else if (pfgVarB.c != 0) {
                    byte[] bArr4 = this.g.f;
                    qVar.k(bArr4, bArr4.length);
                    this.d = this.g.b;
                } else {
                    String str = pfgVarB.a;
                    if (str == null ? false : str.endsWith("/")) {
                        byte[] bArr5 = this.g.f;
                        qVar.k(bArr5, bArr5.length);
                        this.d = this.g.b;
                    } else {
                        qVar.i(this.g.f);
                        File file = new File(this.b, this.g.a);
                        file.getParentFile().mkdirs();
                        this.d = this.g.b;
                        this.f = new FileOutputStream(file);
                    }
                }
            }
            int i4 = i;
            int iMin = i2;
            String str2 = this.g.a;
            if (str2 == null ? false : str2.endsWith("/")) {
                i2 = iMin;
                bArr = bArr;
                i = i4;
            } else {
                long j2 = iMin;
                pfg pfgVar = this.g;
                if (pfgVar.e) {
                    bArr2 = bArr;
                    qVar.d(this.e, bArr2, i4, iMin);
                    i3 = iMin;
                    this.e += j2;
                } else {
                    bArr2 = bArr;
                    i3 = iMin;
                    boolean z = pfgVar.c == 0;
                    long j3 = this.d;
                    if (z) {
                        iMin = (int) Math.min(j2, j3);
                        this.f.write(bArr2, i4, iMin);
                        long j4 = this.d - ((long) iMin);
                        this.d = j4;
                        if (j4 == 0) {
                            this.f.close();
                        }
                    } else {
                        iMin = (int) Math.min(j2, j3);
                        pfg pfgVar2 = this.g;
                        qVar.d((((long) pfgVar2.f.length) + pfgVar2.b) - this.d, bArr2, i4, iMin);
                        this.d -= (long) iMin;
                    }
                }
                i = i4 + iMin;
                i2 = i3 - iMin;
                bArr = bArr2;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
