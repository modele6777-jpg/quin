package defpackage;

import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nbh implements Comparable {
    public static final /* synthetic */ long c = ud0.a.objectFieldOffset(nbh.class.getDeclaredField("b"));
    public final String a;
    public volatile Object b;

    public /* synthetic */ nbh(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        nbh nbhVar;
        int i = 0;
        while (true) {
            Object obj = this.b;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            byte[][] bArr5 = bArr2;
            while (true) {
                Unsafe unsafe = ud0.a;
                long j = c;
                nbhVar = this;
                if (unsafe.compareAndSwapObject(nbhVar, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(nbhVar, j) != obj) {
                    break;
                } else {
                    this = nbhVar;
                }
            }
            this = nbhVar;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo((String) obj);
    }
}
