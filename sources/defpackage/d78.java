package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d78 implements hr0 {
    public final jy6 a;
    public final int b;

    public d78(int i, yob yobVar) {
        this.b = i;
        this.a = yobVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d78 b(int i, d0a d0aVar) {
        String str;
        hr0 z2eVar;
        String str2;
        int i2 = 4;
        ynb.D(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = d0aVar.c;
        int iA = -2;
        int i4 = 0;
        while (d0aVar.a() > 8) {
            int iO = d0aVar.o();
            int iO2 = d0aVar.b + d0aVar.o();
            d0aVar.L(iO2);
            if (iO != 1414744396) {
                lr0 lr0Var = null;
                switch (iO) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iS = d0aVar.s();
                                if (iS == 1) {
                                    str = "audio/raw";
                                } else if (iS == 85) {
                                    str = "audio/mpeg";
                                } else if (iS == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iS != 8192) {
                                    str = iS != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iS2 = d0aVar.s();
                                    int iO3 = d0aVar.o();
                                    d0aVar.N(6);
                                    int iS3 = d0aVar.s();
                                    String str3 = pqf.a;
                                    int iW = pqf.w(iS3, ByteOrder.LITTLE_ENDIAN);
                                    int iS4 = d0aVar.a() > 0 ? d0aVar.s() : 0;
                                    qr5 qr5Var = new qr5();
                                    qr5Var.o = qv8.l(str);
                                    qr5Var.I = iS2;
                                    qr5Var.K = iO3;
                                    if (str.equals("audio/raw") && iW != 0) {
                                        qr5Var.L = iW;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iS4 > 0) {
                                        byte[] bArr = new byte[iS4];
                                        d0aVar.k(bArr, 0, iS4);
                                        qr5Var.r = jy6.s(bArr);
                                    }
                                    z2eVar = new z2e(new rr5(qr5Var));
                                } else {
                                    kv2.w(iS, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                xo1.V("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(pqf.z(iA)));
                            }
                            z2eVar = lr0Var;
                            break;
                        } else {
                            d0aVar.N(i2);
                            int iO4 = d0aVar.o();
                            int iO5 = d0aVar.o();
                            d0aVar.N(i2);
                            int iO6 = d0aVar.o();
                            switch (iO6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                qr5 qr5Var2 = new qr5();
                                qr5Var2.v = iO4;
                                qr5Var2.w = iO5;
                                qr5Var2.o = qv8.l(str2);
                                z2eVar = new z2e(new rr5(qr5Var2));
                            } else {
                                kv2.w(iO6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                z2eVar = lr0Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iO7 = d0aVar.o();
                        d0aVar.N(8);
                        int iO8 = d0aVar.o();
                        int iO9 = d0aVar.o();
                        d0aVar.N(i2);
                        d0aVar.o();
                        d0aVar.N(12);
                        z2eVar = new kr0(iO7, iO8, iO9);
                        break;
                    case 1752331379:
                        int iO10 = d0aVar.o();
                        d0aVar.N(12);
                        d0aVar.o();
                        int iO11 = d0aVar.o();
                        int iO12 = d0aVar.o();
                        d0aVar.N(i2);
                        int iO13 = d0aVar.o();
                        int iO14 = d0aVar.o();
                        d0aVar.N(i2);
                        lr0Var = new lr0(iO10, iO11, iO12, iO13, iO14, d0aVar.o());
                        z2eVar = lr0Var;
                        break;
                    case 1852994675:
                        z2eVar = new f3e(d0aVar.x(d0aVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        z2eVar = lr0Var;
                        break;
                }
            } else {
                z2eVar = b(d0aVar.o(), d0aVar);
            }
            if (z2eVar != null) {
                if (z2eVar.getType() == 1752331379) {
                    iA = ((lr0) z2eVar).a();
                }
                int i5 = i4 + 1;
                int iF = yx6.f(objArrCopyOf.length, i5);
                if (iF > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                }
                objArrCopyOf[i4] = z2eVar;
                i4 = i5;
            }
            d0aVar.M(iO2);
            d0aVar.L(i3);
            i2 = 4;
        }
        return new d78(i, jy6.k(i4, objArrCopyOf));
    }

    public final hr0 a(Class cls) {
        ey6 ey6VarListIterator = this.a.listIterator(0);
        while (ey6VarListIterator.hasNext()) {
            hr0 hr0Var = (hr0) ey6VarListIterator.next();
            if (hr0Var.getClass() == cls) {
                return hr0Var;
            }
        }
        return null;
    }

    @Override // defpackage.hr0
    public final int getType() {
        return this.b;
    }
}
