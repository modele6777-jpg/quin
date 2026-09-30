package defpackage;

import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gg6 {
    public static final byte[] e = {0, 0, 1};
    public int a;
    public int b;
    public boolean c;
    public Serializable d;

    public Size a(ew6 ew6Var) {
        int iA = ew6Var.A(0);
        Size size = (Size) ew6Var.a(ew6.J, null);
        int i = this.b;
        int i2 = this.a;
        if (size != null) {
            int iV = od4.v(od4.G(iA), i2, 1 == i);
            if (iV == 90 || iV == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.io.Serializable] */
    public void b(byte[] bArr, int i, int i2) {
        Object obj;
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.d;
            int length = bArr2.length;
            int i4 = this.a + i3;
            if (length < i4) {
                obj = bArr2;
                ?? CopyOf = Arrays.copyOf(bArr2, i4 * 2);
                this.d = CopyOf;
                obj = CopyOf;
            }
            obj = bArr2;
            System.arraycopy(bArr, i, obj, this.a, i3);
            this.a += i3;
        }
    }
}
