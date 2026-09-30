package defpackage;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u35 extends FilterOutputStream {
    public static final byte[] g = "Exif\u0000\u0000".getBytes(f35.d);
    public final k35 a;
    public final byte[] b;
    public final ByteBuffer c;
    public int d;
    public int e;
    public int f;

    public u35(ByteArrayOutputStream byteArrayOutputStream, k35 k35Var) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.b = new byte[1];
        this.c = ByteBuffer.allocate(4);
        this.d = 0;
        this.a = k35Var;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        k35 k35Var;
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = this.e;
            if ((i5 <= 0 && this.f <= 0 && this.d == 2) || i4 <= 0) {
                break;
            }
            if (i5 > 0) {
                int iMin = Math.min(i4, i5);
                i4 -= iMin;
                this.e -= iMin;
                i3 += iMin;
            }
            int i6 = this.f;
            if (i6 > 0) {
                int iMin2 = Math.min(i4, i6);
                ((FilterOutputStream) this).out.write(bArr, i3, iMin2);
                i4 -= iMin2;
                this.f -= iMin2;
                i3 += iMin2;
            }
            if (i4 == 0) {
                return;
            }
            int i7 = this.d;
            int i8 = 4;
            ByteBuffer byteBuffer = this.c;
            if (i7 == 0) {
                int iMin3 = Math.min(i4, 2 - byteBuffer.position());
                byteBuffer.put(bArr, i3, iMin3);
                i3 += iMin3;
                i4 -= iMin3;
                if (byteBuffer.position() < 2) {
                    return;
                }
                byteBuffer.rewind();
                if (byteBuffer.getShort() != -40) {
                    yg5.m("Not a valid jpeg image, cannot write exif");
                    return;
                }
                ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                this.d = 1;
                byteBuffer.rewind();
                OutputStream outputStream = ((FilterOutputStream) this).out;
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                k61 k61Var = new k61(outputStream);
                k61Var.h((short) -31);
                int[] iArr = new int[4];
                int[] iArr2 = new int[4];
                v35[] v35VarArr = k35.b;
                int i9 = 0;
                while (true) {
                    k35Var = this.a;
                    if (i9 >= i8) {
                        break;
                    }
                    v35 v35Var = v35VarArr[i9];
                    int i10 = 0;
                    while (true) {
                        v35[] v35VarArr2 = k35.b;
                        if (i10 < i8) {
                            k35Var.a(i10).remove(v35Var.b);
                            i10++;
                            i8 = 4;
                        }
                    }
                    i9++;
                    i8 = 4;
                }
                Map mapA = k35Var.a(1);
                ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
                if (!mapA.isEmpty()) {
                    k35Var.a(0).put(k35.b[1].b, f35.a(0L, byteOrder2));
                }
                if (!k35Var.a(2).isEmpty()) {
                    k35Var.a(0).put(k35.b[2].b, f35.a(0L, byteOrder2));
                }
                if (!k35Var.a(3).isEmpty()) {
                    k35Var.a(1).put(k35.b[3].b, f35.a(0L, byteOrder2));
                }
                int i11 = 0;
                while (true) {
                    v35[] v35VarArr3 = k35.b;
                    if (i11 >= 4) {
                        break;
                    }
                    Iterator it = k35Var.a(i11).entrySet().iterator();
                    int i12 = 0;
                    while (it.hasNext()) {
                        f35 f35Var = (f35) ((Map.Entry) it.next()).getValue();
                        int i13 = f35.f[f35Var.a] * f35Var.b;
                        if (i13 > 4) {
                            i12 += i13;
                        }
                    }
                    iArr2[i11] = iArr2[i11] + i12;
                    i11++;
                }
                int i14 = 0;
                int size = 8;
                while (true) {
                    v35[] v35VarArr4 = k35.b;
                    if (i14 >= 4) {
                        break;
                    }
                    if (!k35Var.a(i14).isEmpty()) {
                        iArr[i14] = size;
                        size += (k35Var.a(i14).size() * 12) + 6 + iArr2[i14];
                    }
                    i14++;
                }
                int i15 = size + 8;
                if (!k35Var.a(1).isEmpty()) {
                    k35Var.a(0).put(k35.b[1].b, f35.a(iArr[1], byteOrder2));
                }
                if (!k35Var.a(2).isEmpty()) {
                    k35Var.a(0).put(k35.b[2].b, f35.a(iArr[2], byteOrder2));
                }
                if (!k35Var.a(3).isEmpty()) {
                    k35Var.a(1).put(k35.b[3].b, f35.a(iArr[3], byteOrder2));
                }
                k61Var.h((short) i15);
                k61Var.write(g);
                ByteOrder byteOrder3 = ByteOrder.BIG_ENDIAN;
                k61Var.h((short) 19789);
                k61Var.h((short) 42);
                k61Var.b(8);
                int i16 = 0;
                while (true) {
                    v35[] v35VarArr5 = k35.b;
                    if (i16 >= 4) {
                        break;
                    }
                    if (!k35Var.a(i16).isEmpty()) {
                        k61Var.h((short) k35Var.a(i16).size());
                        int size2 = (k35Var.a(i16).size() * 12) + iArr[i16] + 2 + 4;
                        for (Map.Entry entry : k35Var.a(i16).entrySet()) {
                            v35 v35Var2 = (v35) ((HashMap) i35.e.get(i16)).get(entry.getKey());
                            ok8.n(v35Var2, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                            int i17 = v35Var2.a;
                            f35 f35Var2 = (f35) entry.getValue();
                            int[] iArr3 = f35.f;
                            int i18 = f35Var2.a;
                            int i19 = f35Var2.b;
                            int i20 = iArr3[i18] * i19;
                            k61Var.h((short) i17);
                            k61Var.h((short) f35Var2.a);
                            k61Var.b(i19);
                            if (i20 > 4) {
                                k61Var.b(size2);
                                size2 += i20;
                            } else {
                                k61Var.write(f35Var2.c);
                                if (i20 < 4) {
                                    for (int i21 = 4; i20 < i21; i21 = 4) {
                                        k61Var.a.write(0);
                                        i20++;
                                    }
                                }
                            }
                        }
                        k61Var.b(0);
                        Iterator it2 = k35Var.a(i16).entrySet().iterator();
                        while (it2.hasNext()) {
                            byte[] bArr2 = ((f35) ((Map.Entry) it2.next()).getValue()).c;
                            if (bArr2.length > 4) {
                                k61Var.write(bArr2, 0, bArr2.length);
                            }
                        }
                    }
                    i16++;
                }
                ByteOrder byteOrder4 = ByteOrder.BIG_ENDIAN;
            } else if (i7 != 1) {
                continue;
            } else {
                int iMin4 = Math.min(i4, 4 - byteBuffer.position());
                byteBuffer.put(bArr, i3, iMin4);
                i3 += iMin4;
                i4 -= iMin4;
                if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                    byteBuffer.rewind();
                }
                if (byteBuffer.position() < 4) {
                    return;
                }
                byteBuffer.rewind();
                short s = byteBuffer.getShort();
                if (s == -31) {
                    this.e = (byteBuffer.getShort() & 65535) - 2;
                    this.d = 2;
                } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.f = (byteBuffer.getShort() & 65535) - 2;
                } else {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.d = 2;
                }
                byteBuffer.rewind();
            }
        }
        if (i4 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i3, i4);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
