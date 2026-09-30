package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fr0 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public fr0(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static fr0 a(d0a d0aVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            d0aVar.N(4);
            int iZ = (d0aVar.z() & 3) + 1;
            if (iZ == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZ2 = d0aVar.z() & 31;
            for (int i9 = 0; i9 < iZ2; i9++) {
                int iG = d0aVar.G();
                int i10 = d0aVar.b;
                d0aVar.N(iG);
                byte[] bArr = d0aVar.a;
                byte[] bArr2 = new byte[iG + 4];
                System.arraycopy(d72.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iG);
                arrayList.add(bArr2);
            }
            int iZ3 = d0aVar.z();
            for (int i11 = 0; i11 < iZ3; i11++) {
                int iG2 = d0aVar.G();
                int i12 = d0aVar.b;
                d0aVar.N(iG2);
                byte[] bArr3 = d0aVar.a;
                byte[] bArr4 = new byte[iG2 + 4];
                System.arraycopy(d72.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iG2);
                arrayList.add(bArr4);
            }
            if (iZ2 > 0) {
                s99 s99VarQ = n16.Q((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i13 = s99VarQ.e;
                int i14 = s99VarQ.f;
                int i15 = s99VarQ.h + 8;
                int i16 = s99VarQ.i + 8;
                int i17 = s99VarQ.p;
                int i18 = s99VarQ.q;
                int i19 = s99VarQ.r;
                int i20 = s99VarQ.s;
                float f2 = s99VarQ.g;
                int i21 = s99VarQ.a;
                int i22 = s99VarQ.b;
                int i23 = s99VarQ.c;
                byte[] bArr5 = d72.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new fr0(arrayList, iZ, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw l0a.a(e, "Error parsing AVC config");
        }
    }
}
