package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sa0 extends fbc {
    public final /* synthetic */ int a;

    public /* synthetic */ sa0(int i) {
        this.a = i;
    }

    @Override // defpackage.fbc
    public final su8 f(zu8 zu8Var, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                zu1 zu1Var = new zu1(byteBuffer.array(), byteBuffer.limit());
                zu1Var.o(12);
                int iD = (zu1Var.d() + zu1Var.g(12)) - 4;
                zu1Var.o(44);
                zu1Var.p(zu1Var.g(12));
                zu1Var.o(16);
                ArrayList arrayList = new ArrayList();
                while (zu1Var.d() < iD) {
                    zu1Var.o(48);
                    int iG = zu1Var.g(8);
                    zu1Var.o(4);
                    int iD2 = zu1Var.d() + zu1Var.g(12);
                    String str = null;
                    String str2 = null;
                    while (zu1Var.d() < iD2) {
                        int iG2 = zu1Var.g(8);
                        int iG3 = zu1Var.g(8);
                        int iD3 = zu1Var.d() + iG3;
                        if (iG2 == 2) {
                            int iG4 = zu1Var.g(16);
                            zu1Var.o(8);
                            if (iG4 == 3) {
                                while (zu1Var.d() < iD3) {
                                    int iG5 = zu1Var.g(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[iG5];
                                    zu1Var.j(bArr, iG5);
                                    String str3 = new String(bArr, charset);
                                    int iG6 = zu1Var.g(8);
                                    for (int i = 0; i < iG6; i++) {
                                        zu1Var.p(zu1Var.g(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iG2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[iG3];
                            zu1Var.j(bArr2, iG3);
                            str2 = new String(bArr2, charset2);
                        }
                        zu1Var.m(iD3 * 8);
                    }
                    zu1Var.m(iD2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new ra0(iG, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new su8(arrayList);
            default:
                d0a d0aVar = new d0a(byteBuffer.array(), byteBuffer.limit());
                String strU = d0aVar.u();
                strU.getClass();
                String strU2 = d0aVar.u();
                strU2.getClass();
                return new su8(new c05(strU, strU2, d0aVar.t(), d0aVar.t(), Arrays.copyOfRange(d0aVar.a, d0aVar.b, d0aVar.c)));
        }
    }
}
