package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rj6 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final szc o;

    public rj6(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, szc szcVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = szcVar;
    }

    public static rj6 a(d0a d0aVar, boolean z, szc szcVar) {
        boolean z2;
        ff8 ff8VarN;
        int i = 4;
        try {
            if (z) {
                d0aVar.N(4);
            } else {
                d0aVar.N(21);
            }
            int iZ = d0aVar.z() & 3;
            int iZ2 = d0aVar.z();
            int i2 = d0aVar.b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iZ2) {
                    break;
                }
                d0aVar.N(1);
                int iG = d0aVar.G();
                for (int i6 = 0; i6 < iG; i6++) {
                    int iG2 = d0aVar.G();
                    i5 += iG2 + 4;
                    d0aVar.N(iG2);
                }
                i4++;
            }
            d0aVar.M(i2);
            byte[] bArr = new byte[i5];
            szc szcVar2 = szcVar;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            String strA = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iZ2) {
                int iZ3 = d0aVar.z() & 63;
                int iG3 = d0aVar.G();
                int i19 = i3;
                szc szcVarP = szcVar2;
                while (i19 < iG3) {
                    boolean z3 = z2;
                    int iG4 = d0aVar.G();
                    int i20 = iZ;
                    System.arraycopy(n16.D, i3, bArr, i18, i);
                    int i21 = i18 + 4;
                    System.arraycopy(d0aVar.a, d0aVar.b, bArr, i21, iG4);
                    if (iZ3 == 32 && i19 == 0) {
                        szcVarP = n16.P(bArr, i21, i21 + iG4);
                    } else {
                        if (iZ3 == 33 && i19 == 0) {
                            p99 p99VarO = n16.O(bArr, i21, i21 + iG4, szcVarP);
                            i7 = p99VarO.a + 1;
                            i8 = p99VarO.g;
                            int i22 = p99VarO.h;
                            i10 = p99VarO.c + 8;
                            i11 = p99VarO.d + 8;
                            int i23 = p99VarO.k;
                            i9 = i22;
                            int i24 = p99VarO.l;
                            int i25 = p99VarO.m;
                            float f2 = p99VarO.i;
                            int i26 = p99VarO.j;
                            m99 m99Var = p99VarO.b;
                            if (m99Var != null) {
                                strA = d72.a(m99Var.a, m99Var.b, m99Var.c, m99Var.d, m99Var.e, m99Var.f);
                            }
                            i16 = i26;
                            f = f2;
                            i14 = i25;
                            i13 = i24;
                            i12 = i23;
                        } else if (iZ3 == 39 && i19 == 0 && (ff8VarN = n16.N(bArr, i21, i21 + iG4)) != null && szcVarP != null) {
                            i3 = 0;
                            i15 = ff8VarN.b == ((l99) ((jy6) szcVarP.b).get(0)).b ? 4 : 5;
                        }
                        i3 = 0;
                    }
                    i18 = i21 + iG4;
                    d0aVar.N(iG4);
                    i19++;
                    z2 = z3;
                    iZ = i20;
                    i = 4;
                }
                i17++;
                szcVar2 = szcVarP;
                i = 4;
            }
            return new rj6(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZ + 1, i7, i8, i9, i10, i11, i12, i13, i14, i15, f, i16, strA, szcVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw l0a.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
