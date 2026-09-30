package defpackage;

import android.util.Pair;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b31 {
    public static final byte[] a;

    static {
        String str = pqf.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(d0a d0aVar) {
        int i = d0aVar.b;
        d0aVar.N(4);
        if (d0aVar.m() != 1751411826) {
            i += 4;
        }
        d0aVar.M(i);
    }

    /* JADX WARN: Code duplicated, block: B:195:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:264:0x0570  */
    /* JADX WARN: Code duplicated, block: B:276:0x0597  */
    /* JADX WARN: Code duplicated, block: B:282:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:356:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0164  */
    public static void b(d0a d0aVar, int i, int i2, int i3, int i4, String str, boolean z, xp4 xp4Var, p90 p90Var, int i5) throws l0a {
        int iG;
        int iM;
        int iRound;
        int iD;
        int iW;
        xp4 xp4VarA;
        String str2;
        String str3;
        int i6;
        String str4;
        int i7;
        String str5;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iG2;
        int i17;
        boolean z2;
        boolean z3;
        int i18;
        int i19;
        boolean zF;
        int i20;
        int iG3;
        String str6;
        d0a d0aVar2 = d0aVar;
        int iIntValue = i;
        int i21 = i3;
        int[] iArr = b21.d;
        int[] iArr2 = b21.b;
        d0aVar2.M(i2 + 16);
        if (z) {
            iG = d0aVar2.G();
            d0aVar2.N(6);
        } else {
            d0aVar2.N(8);
            iG = 0;
        }
        int i22 = 4;
        int i23 = 2;
        if (iG == 0 || iG == 1) {
            i22 = 4;
            int iG4 = d0aVar2.G();
            d0aVar2.N(6);
            int iA = d0aVar2.A();
            d0aVar2.M(d0aVar2.b - 4);
            iM = d0aVar2.m();
            if (iG == 1) {
                d0aVar2.N(16);
            }
            iRound = iA;
            iD = iG4;
            iW = -1;
        } else {
            if (iG != 2) {
                return;
            }
            d0aVar2.N(16);
            iRound = (int) Math.round(Double.longBitsToDouble(d0aVar2.t()));
            iD = d0aVar2.D();
            d0aVar2.N(4);
            int iD2 = d0aVar2.D();
            int iD3 = d0aVar2.D();
            boolean z4 = (iD3 & 1) != 0;
            boolean z5 = (iD3 & 2) != 0;
            iW = z4 ? pqf.u(iD2, z5 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN) : pqf.w(iD2, z5 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            if (iW == 0) {
                iW = -1;
            }
            d0aVar2.N(8);
            iM = 0;
        }
        if (iIntValue == 1767992678) {
            iRound = -1;
            iD = -1;
        } else {
            if (iIntValue != 1935764850) {
                iRound = iIntValue == 1935767394 ? 16000 : 8000;
            }
            iD = 1;
        }
        int i24 = d0aVar2.b;
        if (iIntValue == 1701733217) {
            Pair pairH = h(d0aVar2, i2, i21);
            if (pairH != null) {
                iIntValue = ((Integer) pairH.first).intValue();
                xp4VarA = xp4Var == null ? null : xp4Var.a(((f1f) pairH.second).b);
                ((f1f[]) p90Var.d)[i5] = (f1f) pairH.second;
            } else {
                xp4VarA = xp4Var;
            }
            d0aVar2.M(i24);
        } else {
            xp4VarA = xp4Var;
        }
        String str7 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue != 1936684916) {
            if (iIntValue == 1953984371) {
                iW = 268435456;
            } else if (iIntValue == 1819304813) {
                if (iW == -1) {
                    iW = i23;
                }
            } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                str2 = "audio/mpeg";
            } else if (iIntValue == 1835557169) {
                str2 = "audio/mha1";
            } else if (iIntValue == 1835560241) {
                str2 = "audio/mhm1";
            } else if (iIntValue == 1634492771) {
                str2 = "audio/alac";
            } else if (iIntValue == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (iIntValue == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (iIntValue == 1332770163) {
                str2 = "audio/opus";
            } else if (iIntValue == 1716281667) {
                str2 = "audio/flac";
            } else if (iIntValue == 1835823201) {
                str2 = "audio/true-hd";
            } else {
                str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
            }
            str2 = "audio/raw";
        } else {
            iW = i23;
            str2 = "audio/raw";
        }
        y21 y21VarC = null;
        String str8 = null;
        List listS = null;
        w21 w21Var = null;
        while (i24 - i2 < i21) {
            d0aVar2.M(i24);
            int iM2 = d0aVar2.m();
            int i25 = iW;
            rs0.n("childAtomSize must be positive", iM2 > 0);
            int iM3 = d0aVar2.m();
            String str9 = str8;
            if (iM3 == 1835557187) {
                d0aVar2.M(i24 + 8);
                d0aVar2.N(1);
                int iZ = d0aVar2.z();
                d0aVar2.N(1);
                String str10 = Objects.equals(str2, str7) ? String.format("mhm1.%02X", Integer.valueOf(iZ)) : String.format("mha1.%02X", Integer.valueOf(iZ));
                int iG5 = d0aVar2.G();
                byte[] bArr = new byte[iG5];
                str9 = str10;
                d0aVar2.k(bArr, 0, iG5);
                listS = listS == null ? jy6.s(bArr) : jy6.t(bArr, (byte[]) listS.get(0));
            } else if (iM3 == 1835557200) {
                d0aVar2.M(i24 + 8);
                int iZ2 = d0aVar2.z();
                if (iZ2 > 0) {
                    byte[] bArr2 = new byte[iZ2];
                    d0aVar2.k(bArr2, 0, iZ2);
                    listS = listS == null ? jy6.s(bArr2) : jy6.t((byte[]) listS.get(0), bArr2);
                }
            } else {
                if (iM3 == 1702061171 || (z && iM3 == 2002876005)) {
                    String str11 = str2;
                    List list = listS;
                    int i26 = iM2;
                    str3 = str7;
                    int i27 = i24;
                    iRound = iRound;
                    int i28 = iD;
                    iIntValue = iIntValue;
                    if (iM3 == 1702061171) {
                        iM2 = i26;
                        i6 = i27;
                        i24 = i6;
                    } else {
                        i6 = d0aVar2.b;
                        i24 = i27;
                        rs0.n(null, i6 >= i24);
                        while (true) {
                            iM2 = i26;
                            if (i6 - i24 < iM2) {
                                d0aVar2.M(i6);
                                int iM4 = d0aVar2.m();
                                rs0.n("childAtomSize must be positive", iM4 > 0);
                                if (d0aVar2.m() != 1702061171) {
                                    i6 += iM4;
                                    i26 = iM2;
                                }
                            } else {
                                i6 = -1;
                            }
                        }
                    }
                    if (i6 != -1) {
                        y21VarC = c(i6, d0aVar2);
                        str4 = (String) y21VarC.c;
                        byte[] bArr3 = (byte[]) y21VarC.d;
                        if (bArr3 != null) {
                            if ("audio/vorbis".equals(str4)) {
                                cy6 cy6Var = dzf.a;
                                d0a d0aVar3 = new d0a(bArr3);
                                d0aVar3.N(1);
                                int i29 = 0;
                                while (d0aVar3.a() > 0 && d0aVar3.j() == 255) {
                                    i29 += 255;
                                    d0aVar3.N(1);
                                }
                                int iZ3 = d0aVar3.z() + i29;
                                int i30 = 0;
                                while (true) {
                                    if (d0aVar3.a() > 0) {
                                        i24 = i24;
                                        if (d0aVar3.j() == 255) {
                                            i30 += 255;
                                            d0aVar3.N(1);
                                            i24 = i24;
                                        }
                                    } else {
                                        i24 = i24;
                                    }
                                }
                                int iZ4 = d0aVar3.z() + i30;
                                byte[] bArr4 = new byte[iZ3];
                                int i31 = d0aVar3.b;
                                System.arraycopy(bArr3, i31, bArr4, 0, iZ3);
                                int i32 = i31 + iZ3 + iZ4;
                                int length = bArr3.length - i32;
                                byte[] bArr5 = new byte[length];
                                System.arraycopy(bArr3, i32, bArr5, 0, length);
                                iRound = iRound;
                                listS = jy6.t(bArr4, bArr5);
                                i28 = i28;
                                str8 = str9;
                            } else {
                                i24 = i24;
                                if ("audio/mp4a-latm".equals(str4)) {
                                    i iVarC0 = jgb.c0(new zu1(bArr3, bArr3.length), false);
                                    iRound = iVarC0.a;
                                    int i33 = iVarC0.b;
                                    str8 = iVarC0.c;
                                    i28 = i33;
                                } else {
                                    i28 = i28;
                                    iRound = iRound;
                                    str8 = str9;
                                }
                                listS = jy6.s(bArr3);
                            }
                        }
                        i7 = i28;
                        str5 = str4;
                        iW = i25;
                    } else {
                        y21VarC = y21VarC;
                        str4 = str11;
                    }
                    listS = list;
                    str8 = str9;
                    i7 = i28;
                    str5 = str4;
                    iW = i25;
                } else if (iM3 == 1651798644) {
                    d0aVar2.M(i24 + 8);
                    d0aVar2.N(i22);
                    w21Var = new w21(d0aVar2.B(), d0aVar2.B(), 0, (byte) 0);
                } else {
                    if (iM3 == 1684103987) {
                        d0aVar2.M(i24 + 8);
                        String string = Integer.toString(i4);
                        zu1 zu1Var = new zu1();
                        zu1Var.k(d0aVar2);
                        int i34 = iArr2[zu1Var.g(i23)];
                        str5 = str2;
                        zu1Var.o(8);
                        int i35 = iArr[zu1Var.g(3)];
                        int i36 = zu1Var.g(1) != 0 ? i35 + 1 : i35;
                        str3 = str7;
                        int i37 = b21.e[zu1Var.g(5)] * 1000;
                        zu1Var.c();
                        d0aVar2.M(zu1Var.d());
                        qr5 qr5Var = new qr5();
                        qr5Var.a = string;
                        qr5Var.o = qv8.l("audio/ac3");
                        qr5Var.I = i36;
                        qr5Var.K = i34;
                        qr5Var.s = xp4VarA;
                        qr5Var.d = str;
                        qr5Var.i = i37;
                        qr5Var.j = i37;
                        p90Var.e = new rr5(qr5Var);
                    } else {
                        str5 = str2;
                        str3 = str7;
                        if (iM3 == 1684366131) {
                            d0aVar2.M(i24 + 8);
                            String string2 = Integer.toString(i4);
                            zu1 zu1Var2 = new zu1();
                            zu1Var2.k(d0aVar2);
                            int iG6 = zu1Var2.g(13) * 1000;
                            zu1Var2.o(3);
                            int i38 = iArr2[zu1Var2.g(2)];
                            zu1Var2.o(10);
                            int i39 = iArr[zu1Var2.g(3)];
                            if (zu1Var2.g(1) != 0) {
                                i39++;
                            }
                            zu1Var2.o(3);
                            int iG7 = zu1Var2.g(4);
                            zu1Var2.o(1);
                            if (iG7 > 0) {
                                zu1Var2.o(6);
                                if (zu1Var2.g(1) != 0) {
                                    i39 += 2;
                                }
                                zu1Var2.o(1);
                            }
                            int i40 = i39;
                            if (zu1Var2.b() > 7) {
                                zu1Var2.o(7);
                                if (zu1Var2.g(1) != 0) {
                                    str6 = "audio/eac3-joc";
                                } else {
                                    str6 = "audio/eac3";
                                }
                            } else {
                                str6 = "audio/eac3";
                            }
                            zu1Var2.c();
                            d0aVar2.M(zu1Var2.d());
                            qr5 qr5Var2 = new qr5();
                            qr5Var2.a = string2;
                            qr5Var2.o = qv8.l(str6);
                            qr5Var2.I = i40;
                            qr5Var2.K = i38;
                            qr5Var2.s = xp4VarA;
                            qr5Var2.d = str;
                            qr5Var2.j = iG6;
                            p90Var.e = new rr5(qr5Var2);
                        } else {
                            listS = listS;
                            iM2 = iM2;
                            if (iM3 == 1684103988) {
                                d0aVar2.M(i24 + 8);
                                String string3 = Integer.toString(i4);
                                zu1 zu1Var3 = new zu1();
                                zu1Var3.k(d0aVar2);
                                int iB = zu1Var3.b();
                                int iG8 = zu1Var3.g(3);
                                if (iG8 > 1) {
                                    throw l0a.b("Unsupported AC-4 DSI version: " + iG8);
                                }
                                int iG9 = zu1Var3.g(7);
                                int i41 = zu1Var3.f() ? 48000 : 44100;
                                zu1Var3.o(4);
                                int iG10 = zu1Var3.g(9);
                                if (iG9 > 1) {
                                    if (iG8 == 0) {
                                        throw l0a.b("Invalid AC-4 DSI version: " + iG8);
                                    }
                                    if (zu1Var3.f()) {
                                        zu1Var3.o(16);
                                        if (zu1Var3.f()) {
                                            zu1Var3.o(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                                        }
                                    }
                                }
                                if (iG8 == 1) {
                                    if (zu1Var3.b() < 66) {
                                        throw l0a.b("Invalid AC-4 DSI bitrate.");
                                    }
                                    zu1Var3.o(66);
                                    zu1Var3.c();
                                }
                                d6 d6Var = new d6();
                                d6Var.a = true;
                                d6Var.b = -1;
                                d6Var.c = -1;
                                d6Var.d = true;
                                d6Var.e = 2;
                                d6Var.f = 1;
                                d6Var.g = 0;
                                int i42 = 0;
                                while (true) {
                                    if (i42 < iG10) {
                                        if (iG8 == 0) {
                                            boolean zF2 = zu1Var3.f();
                                            int iG11 = zu1Var3.g(5);
                                            i11 = iRound;
                                            iG2 = zu1Var3.g(5);
                                            i17 = 0;
                                            z2 = false;
                                            z3 = zF2;
                                            i18 = iG11;
                                            i19 = 0;
                                        } else {
                                            int i43 = iG10;
                                            int iG12 = zu1Var3.g(8);
                                            i11 = iRound;
                                            int iG13 = zu1Var3.g(8);
                                            if (iG13 == 255) {
                                                iG13 = zu1Var3.g(16) + iG13;
                                            }
                                            if (iG12 > 2) {
                                                zu1Var3.o(iG13 * 8);
                                                i42++;
                                                iG10 = i43;
                                                iRound = i11;
                                            } else {
                                                int iB2 = (iB - zu1Var3.b()) / 8;
                                                int i44 = iG13;
                                                int iG14 = zu1Var3.g(5);
                                                z2 = iG14 == 31;
                                                i18 = iG14;
                                                iG2 = iG12;
                                                i19 = iB2;
                                                i17 = i44;
                                                z3 = false;
                                            }
                                        }
                                        d6Var.f = iG2;
                                        i12 = iD;
                                        if (z3 || z2 || i18 != 6) {
                                            d6Var.g = zu1Var3.g(3);
                                            if (zu1Var3.f()) {
                                                zu1Var3.o(5);
                                            }
                                            zu1Var3.o(2);
                                            int i45 = 1;
                                            if (iG8 == 1 && (iG2 == 1 || iG2 == 2)) {
                                                zu1Var3.o(2);
                                            }
                                            zu1Var3.o(5);
                                            zu1Var3.o(10);
                                            if (iG8 == 1) {
                                                if (iG2 > 0) {
                                                    d6Var.a = zu1Var3.f();
                                                }
                                                if (d6Var.a) {
                                                    if (iG2 != 1) {
                                                        i20 = 2;
                                                        if (iG2 == 2) {
                                                            iG3 = zu1Var3.g(5);
                                                            if (iG3 >= 0 && iG3 <= 15) {
                                                                d6Var.b = iG3;
                                                            }
                                                            if (iG3 >= 11 || iG3 > 14) {
                                                                i20 = 2;
                                                            } else {
                                                                d6Var.d = zu1Var3.f();
                                                                i20 = 2;
                                                                d6Var.e = zu1Var3.g(2);
                                                            }
                                                        }
                                                    } else {
                                                        iG3 = zu1Var3.g(5);
                                                        if (iG3 >= 0) {
                                                            d6Var.b = iG3;
                                                        }
                                                        if (iG3 >= 11) {
                                                            i20 = 2;
                                                        } else {
                                                            i20 = 2;
                                                        }
                                                    }
                                                    zu1Var3.o(24);
                                                    i45 = 1;
                                                } else {
                                                    i20 = 2;
                                                }
                                                if (iG2 == i45 || iG2 == i20) {
                                                    if (zu1Var3.f() && zu1Var3.f()) {
                                                        zu1Var3.o(i20);
                                                    }
                                                    if (zu1Var3.f()) {
                                                        zu1Var3.n();
                                                        int i46 = 8;
                                                        int iG15 = zu1Var3.g(8);
                                                        int i47 = 0;
                                                        while (i47 < iG15) {
                                                            zu1Var3.o(i46);
                                                            i47++;
                                                            i46 = 8;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!z3 && !z2) {
                                                zu1Var3.n();
                                                if (i18 == 0 || i18 == 1 || i18 == 2) {
                                                    if (iG2 == 0) {
                                                        for (int i48 = 0; i48 < 2; i48++) {
                                                            g21.U(zu1Var3, d6Var);
                                                        }
                                                    } else {
                                                        for (int i49 = 0; i49 < 2; i49++) {
                                                            g21.V(zu1Var3, d6Var);
                                                        }
                                                    }
                                                } else if (i18 == 3 || i18 == 4) {
                                                    if (iG2 == 0) {
                                                        for (int i50 = 0; i50 < 3; i50++) {
                                                            g21.U(zu1Var3, d6Var);
                                                        }
                                                    } else {
                                                        for (int i51 = 0; i51 < 3; i51++) {
                                                            g21.V(zu1Var3, d6Var);
                                                        }
                                                    }
                                                } else if (i18 != 5) {
                                                    int iG16 = zu1Var3.g(7);
                                                    for (int i52 = 0; i52 < iG16; i52++) {
                                                        zu1Var3.o(8);
                                                    }
                                                } else if (iG2 == 0) {
                                                    g21.U(zu1Var3, d6Var);
                                                } else {
                                                    int iG17 = zu1Var3.g(3);
                                                    for (int i53 = 0; i53 < iG17 + 2; i53++) {
                                                        g21.V(zu1Var3, d6Var);
                                                    }
                                                }
                                            } else if (iG2 == 0) {
                                                g21.U(zu1Var3, d6Var);
                                            } else {
                                                g21.V(zu1Var3, d6Var);
                                            }
                                            zu1Var3.n();
                                            zF = zu1Var3.f();
                                        } else {
                                            iG2 = iG2;
                                            zF = true;
                                        }
                                        if (zF) {
                                            int iG18 = zu1Var3.g(7);
                                            for (int i54 = 0; i54 < iG18; i54++) {
                                                zu1Var3.o(15);
                                            }
                                        }
                                        if (iG2 <= 0) {
                                            i13 = 8;
                                        } else {
                                            if (zu1Var3.f()) {
                                                if (zu1Var3.b() < 66) {
                                                    throw l0a.b("Can't parse bitrate DSI.");
                                                }
                                                zu1Var3.o(66);
                                            }
                                            if (zu1Var3.f()) {
                                                zu1Var3.c();
                                                zu1Var3.p(zu1Var3.g(16));
                                                int iG19 = zu1Var3.g(5);
                                                for (int i55 = 0; i55 < iG19; i55++) {
                                                    zu1Var3.o(3);
                                                    zu1Var3.o(8);
                                                }
                                                i13 = 8;
                                            } else {
                                                i13 = 8;
                                            }
                                        }
                                        zu1Var3.c();
                                        if (iG8 == 1) {
                                            int iB3 = ((iB - zu1Var3.b()) / 8) - i19;
                                            if (i17 < iB3) {
                                                throw l0a.b("pres_bytes is smaller than presentation bytes read.");
                                            }
                                            zu1Var3.p(i17 - iB3);
                                        }
                                        if (d6Var.a && d6Var.b == -1) {
                                            throw l0a.b("Can't determine channel mode of presentation " + i42);
                                        }
                                    } else {
                                        iIntValue = iIntValue;
                                        i11 = iRound;
                                        i12 = iD;
                                        i13 = 8;
                                    }
                                    if (d6Var.a) {
                                        int i56 = d6Var.b;
                                        boolean z6 = d6Var.d;
                                        int i57 = d6Var.e;
                                        switch (i56) {
                                            case 0:
                                                i15 = 11;
                                                i16 = 1;
                                                break;
                                            case 1:
                                                i15 = 11;
                                                i16 = 2;
                                                break;
                                            case 2:
                                                i15 = 11;
                                                i16 = 3;
                                                break;
                                            case 3:
                                                i15 = 11;
                                                i16 = 5;
                                                break;
                                            case 4:
                                                i15 = 11;
                                                i16 = 6;
                                                break;
                                            case 5:
                                            case 7:
                                            case 9:
                                                i15 = 11;
                                                i16 = 7;
                                                break;
                                            case 6:
                                            case 8:
                                            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                                i16 = i13;
                                                i15 = 11;
                                                break;
                                            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                                i15 = 11;
                                                i16 = 11;
                                                break;
                                            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                                i16 = 12;
                                                i15 = 11;
                                                break;
                                            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                                i15 = 11;
                                                i16 = 13;
                                                break;
                                            case 14:
                                                i15 = 11;
                                                i16 = 14;
                                                break;
                                            case 15:
                                                i15 = 11;
                                                i16 = 24;
                                                break;
                                            default:
                                                i15 = 11;
                                                i16 = -1;
                                                break;
                                        }
                                        if (i56 == i15 || i56 == 12 || i56 == 13 || i56 == 14) {
                                            if (!z6) {
                                                i16 -= 2;
                                            }
                                            if (i57 == 0) {
                                                i16 -= 4;
                                            } else if (i57 == 1) {
                                                i16 -= 2;
                                            }
                                        }
                                        i14 = i16;
                                    } else {
                                        int i58 = d6Var.c;
                                        int i59 = d6Var.g;
                                        if (i58 > 0) {
                                            i14 = i58 + 1;
                                            if (i59 == 4 && i14 == 17) {
                                                i14 = 21;
                                            }
                                        } else if (i59 == 0) {
                                            i14 = 2;
                                        } else if (i59 == 1) {
                                            i14 = 6;
                                        } else if (i59 == 2) {
                                            i14 = i13;
                                        } else if (i59 == 3) {
                                            i14 = 10;
                                        } else if (i59 != 4) {
                                            xo1.V("Ac4Util", "AC-4 level " + d6Var.g + " has not been defined.");
                                            i14 = 2;
                                        } else {
                                            i14 = 12;
                                        }
                                    }
                                    if (i14 <= 0) {
                                        throw l0a.b("Cannot determine channel count of presentation.");
                                    }
                                    Object[] objArr = {Integer.valueOf(iG9), Integer.valueOf(d6Var.f), Integer.valueOf(d6Var.g)};
                                    String str12 = pqf.a;
                                    String str13 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                    qr5 qr5Var3 = new qr5();
                                    qr5Var3.a = string3;
                                    qr5Var3.o = qv8.l("audio/ac4");
                                    qr5Var3.I = i14;
                                    qr5Var3.K = i41;
                                    qr5Var3.s = xp4VarA;
                                    qr5Var3.d = str;
                                    qr5Var3.k = str13;
                                    p90Var.e = new rr5(qr5Var3);
                                    i9 = i11;
                                    i8 = i12;
                                    iIntValue = iIntValue;
                                    i7 = i8;
                                    iRound = i9;
                                    iW = i25;
                                    listS = listS;
                                    iM2 = iM2;
                                    str8 = str9;
                                }
                            } else {
                                int i60 = iIntValue;
                                i24 = i24;
                                iRound = iRound;
                                i7 = iD;
                                if (iM3 != 1684892784) {
                                    if (iM3 == 1684305011 || iM3 == 1969517683) {
                                        iIntValue = i60;
                                        qr5 qr5Var4 = new qr5();
                                        qr5Var4.a = Integer.toString(i4);
                                        qr5Var4.o = qv8.l(str5);
                                        i8 = i7;
                                        qr5Var4.I = i8;
                                        i9 = iRound;
                                        qr5Var4.K = i9;
                                        qr5Var4.s = xp4VarA;
                                        qr5Var4.d = str;
                                        p90Var.e = new rr5(qr5Var4);
                                    } else {
                                        if (iM3 == 1682927731) {
                                            int i61 = iM2 - 8;
                                            byte[] bArr6 = a;
                                            byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i61);
                                            d0aVar2.M(i24 + 8);
                                            d0aVar2.k(bArrCopyOf, bArr6.length, i61);
                                            listS = vd0.O(bArrCopyOf);
                                        } else if (iM3 == 1684425825) {
                                            byte[] bArr7 = new byte[iM2 - 8];
                                            bArr7[0] = 102;
                                            bArr7[1] = 76;
                                            bArr7[2] = 97;
                                            bArr7[3] = 67;
                                            d0aVar2.M(i24 + 12);
                                            d0aVar2.k(bArr7, 4, iM2 - 12);
                                            listS = jy6.s(bArr7);
                                        } else if (iM3 == 1634492771) {
                                            int i62 = iM2 - 12;
                                            byte[] bArr8 = new byte[i62];
                                            d0aVar2.M(i24 + 12);
                                            d0aVar2.k(bArr8, 0, i62);
                                            byte[] bArr9 = d72.a;
                                            d0a d0aVar4 = new d0a(bArr8);
                                            d0aVar4.M(5);
                                            int iZ5 = d0aVar4.z();
                                            d0aVar4.M(9);
                                            int iZ6 = d0aVar4.z();
                                            d0aVar4.M(20);
                                            int[] iArr3 = {d0aVar4.D(), iZ6, iZ5};
                                            int i63 = iArr3[0];
                                            int i64 = iArr3[1];
                                            int i65 = iArr3[2];
                                            String str14 = pqf.a;
                                            int iW2 = pqf.w(i65, ByteOrder.LITTLE_ENDIAN);
                                            if (iW2 == 0) {
                                                iW2 = -1;
                                            }
                                            iW = iW2;
                                            iRound = i63;
                                            i7 = i64;
                                            iM2 = iM2;
                                            iIntValue = i60;
                                            listS = jy6.s(bArr8);
                                            str8 = str9;
                                        } else if (iM3 == 1767990114) {
                                            d0aVar2.M(i24 + 9);
                                            int iE = d0aVar2.E();
                                            byte[] bArr10 = new byte[iE];
                                            d0aVar2.k(bArr10, 0, iE);
                                            byte[] bArr11 = d72.a;
                                            d0a d0aVar5 = new d0a(bArr10);
                                            String str15 = null;
                                            String strX = null;
                                            while (d0aVar5.a() > 0 && (str15 == null || strX == null)) {
                                                int iZ7 = d0aVar5.z();
                                                int i66 = iZ7 >> 3;
                                                boolean z7 = (iZ7 & 2) != 0;
                                                boolean z8 = (iZ7 & 1) != 0;
                                                int iE2 = d0aVar5.E();
                                                if (i66 > 4 && i66 < 24 && z7) {
                                                    do {
                                                    } while ((d0aVar5.z() & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0);
                                                    for (i10 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS; (d0aVar5.z() & i10) != 0; i10 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) {
                                                    }
                                                }
                                                if (z8) {
                                                    d0aVar5.N(d0aVar5.E());
                                                }
                                                int i67 = d0aVar5.b + iE2;
                                                if (i66 == 31) {
                                                    d0aVar5.N(4);
                                                    Object[] objArr2 = {Integer.valueOf(d0aVar5.z()), Integer.valueOf(d0aVar5.z())};
                                                    String str16 = pqf.a;
                                                    str15 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                                } else {
                                                    if (i66 == 0) {
                                                        while ((d0aVar5.z() & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                                        }
                                                        strX = d0aVar5.x(4, StandardCharsets.UTF_8);
                                                        if (strX.equals("mp4a")) {
                                                            while ((d0aVar5.z() & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                                            }
                                                            d0aVar5.N(2);
                                                            zu1 zu1Var4 = new zu1();
                                                            zu1Var4.k(d0aVar5);
                                                            int iG20 = zu1Var4.g(5);
                                                            if (iG20 == 31) {
                                                                iG20 = zu1Var4.g(6) + 32;
                                                            }
                                                            strX = strX + ".40." + iG20;
                                                        }
                                                        d0aVar5.M(i67);
                                                    }
                                                    d0aVar5.M(i67);
                                                }
                                                d0aVar5.M(i67);
                                            }
                                            String strJ = (str15 == null || strX == null) ? null : ib8.j(str15, ".", strX);
                                            listS = jy6.s(bArr10);
                                            str8 = strJ;
                                            iW = i25;
                                            iIntValue = i60;
                                        } else if (iM3 == 1885564227) {
                                            d0aVar2.M(i24 + 12);
                                            ByteOrder byteOrder = (d0aVar2.z() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int iZ8 = d0aVar2.z();
                                            iIntValue = i60;
                                            iW = iIntValue == 1768973165 ? pqf.w(iZ8, byteOrder) : iIntValue == 1718641517 ? pqf.u(iZ8, byteOrder) : i25;
                                            if (iW == 0) {
                                                iW = -1;
                                            }
                                            str8 = str9;
                                            if (iW != -1) {
                                                str5 = "audio/raw";
                                            }
                                            listS = listS;
                                        } else {
                                            iIntValue = i60;
                                            i9 = iRound;
                                            i8 = i7;
                                        }
                                        y21VarC = y21VarC;
                                        str8 = str9;
                                        iW = i25;
                                        iM2 = iM2;
                                        iRound = iRound;
                                        iIntValue = i60;
                                    }
                                    i7 = i8;
                                    iRound = i9;
                                    iW = i25;
                                    listS = listS;
                                    iM2 = iM2;
                                    str8 = str9;
                                } else {
                                    if (iM <= 0) {
                                        throw l0a.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM);
                                    }
                                    y21VarC = y21VarC;
                                    str8 = str9;
                                    iRound = iM;
                                    iW = i25;
                                    listS = listS;
                                    iM2 = iM2;
                                    iIntValue = i60;
                                    i7 = 2;
                                }
                            }
                        }
                    }
                    i9 = iRound;
                    i8 = iD;
                    i7 = i8;
                    iRound = i9;
                    iW = i25;
                    listS = listS;
                    iM2 = iM2;
                    str8 = str9;
                }
                i24 += iM2;
                i22 = 4;
                i23 = 2;
                d0aVar2 = d0aVar;
                i21 = i3;
                iIntValue = iIntValue;
                y21VarC = y21VarC;
                str2 = str5;
                str7 = str3;
                iD = i7;
            }
            str8 = str9;
            str5 = str2;
            str3 = str7;
            i24 = i24;
            i7 = iD;
            iW = i25;
            iIntValue = iIntValue;
            iM2 = iM2;
            y21VarC = y21VarC;
            i24 += iM2;
            i22 = 4;
            i23 = 2;
            d0aVar2 = d0aVar;
            i21 = i3;
            iIntValue = iIntValue;
            y21VarC = y21VarC;
            str2 = str5;
            str7 = str3;
            iD = i7;
        }
        String str17 = str8;
        String str18 = str2;
        List list2 = listS;
        int i68 = iRound;
        int i69 = iW;
        int i70 = iD;
        if (((rr5) p90Var.e) != null || str18 == null) {
            return;
        }
        qr5 qr5Var5 = new qr5();
        qr5Var5.a = Integer.toString(i4);
        qr5Var5.o = qv8.l(str18);
        qr5Var5.k = str17;
        qr5Var5.I = i70;
        qr5Var5.K = i68;
        qr5Var5.L = i69;
        qr5Var5.r = list2;
        qr5Var5.s = xp4VarA;
        qr5Var5.d = str;
        if (y21VarC != null) {
            y21 y21Var = y21VarC;
            qr5Var5.i = rxg.R(y21Var.a);
            qr5Var5.j = rxg.R(y21Var.b);
        } else {
            w21 w21Var2 = w21Var;
            if (w21Var2 != null) {
                qr5Var5.i = rxg.R(w21Var2.b);
                qr5Var5.j = rxg.R(w21Var2.c);
            }
        }
        p90Var.e = new rr5(qr5Var5);
    }

    public static y21 c(int i, d0a d0aVar) {
        d0aVar.M(i + 12);
        d0aVar.N(1);
        d(d0aVar);
        d0aVar.N(2);
        int iZ = d0aVar.z();
        if ((iZ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            d0aVar.N(2);
        }
        if ((iZ & 64) != 0) {
            d0aVar.N(d0aVar.z());
        }
        if ((iZ & 32) != 0) {
            d0aVar.N(2);
        }
        d0aVar.N(1);
        d(d0aVar);
        String strD = qv8.d(d0aVar.z());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new y21(strD, null, -1L, -1L);
        }
        d0aVar.N(4);
        long jB = d0aVar.B();
        long jB2 = d0aVar.B();
        d0aVar.N(1);
        int iD = d(d0aVar);
        long j = jB2;
        byte[] bArr = new byte[iD];
        d0aVar.k(bArr, 0, iD);
        if (j <= 0) {
            j = -1;
        }
        return new y21(strD, bArr, j, jB > 0 ? jB : -1L);
    }

    public static int d(d0a d0aVar) {
        int iZ = d0aVar.z();
        int i = iZ & 127;
        while ((iZ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            iZ = d0aVar.z();
            i = (i << 7) | (iZ & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static su8 f(m49 m49Var) {
        sn8 sn8Var;
        n49 n49VarG = m49Var.g(1751411826);
        n49 n49VarG2 = m49Var.g(1801812339);
        n49 n49VarG3 = m49Var.g(1768715124);
        if (n49VarG == null || n49VarG2 == null || n49VarG3 == null) {
            return null;
        }
        d0a d0aVar = n49VarG.c;
        d0aVar.M(16);
        if (d0aVar.m() != 1835299937) {
            return null;
        }
        d0a d0aVar2 = n49VarG2.c;
        d0aVar2.M(12);
        int iM = d0aVar2.m();
        String[] strArr = new String[iM];
        for (int i = 0; i < iM; i++) {
            int iM2 = d0aVar2.m();
            d0aVar2.N(4);
            strArr[i] = d0aVar2.x(iM2 - 8, StandardCharsets.UTF_8);
        }
        d0a d0aVar3 = n49VarG3.c;
        d0aVar3.M(8);
        ArrayList arrayList = new ArrayList();
        while (d0aVar3.a() > 8) {
            int i2 = d0aVar3.b;
            int iM3 = d0aVar3.m();
            int iM4 = d0aVar3.m() - 1;
            if (iM4 < 0 || iM4 >= iM) {
                kv2.w(iM4, "Skipped metadata with unknown key index: ", "BoxParsers");
            } else {
                String str = strArr[iM4];
                int i3 = i2 + iM3;
                while (true) {
                    int i4 = d0aVar3.b;
                    if (i4 < i3) {
                        int iM5 = d0aVar3.m();
                        if (d0aVar3.m() == 1684108385) {
                            int iM6 = d0aVar3.m();
                            int iM7 = d0aVar3.m();
                            int i5 = iM5 - 16;
                            byte[] bArr = new byte[i5];
                            d0aVar3.k(bArr, 0, i5);
                            try {
                                sn8Var = new sn8(str, bArr, iM7, iM6);
                                break;
                            } catch (Exception unused) {
                                ks0.v("Failed to parse metadata entry with key: ", str, "MetadataUtil");
                                sn8Var = null;
                                break;
                            }
                        }
                        d0aVar3.M(i4 + iM5);
                    }
                    sn8Var = null;
                    break;
                }
                if (sn8Var != null) {
                    arrayList.add(sn8Var);
                }
            }
            d0aVar3.M(i2 + iM3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new su8(arrayList);
    }

    public static s49 g(d0a d0aVar) {
        long jT;
        long jT2;
        d0aVar.M(8);
        if (e(d0aVar.m()) == 0) {
            jT = d0aVar.B();
            jT2 = d0aVar.B();
        } else {
            jT = d0aVar.t();
            jT2 = d0aVar.t();
        }
        return new s49(jT, jT2, d0aVar.B());
    }

    public static Pair h(d0a d0aVar, int i, int i2) throws l0a {
        f1f f1fVar;
        Pair pairCreate;
        int i3;
        int i4;
        int i5 = d0aVar.b;
        while (i5 - i < i2) {
            d0aVar.M(i5);
            int iM = d0aVar.m();
            rs0.n("childAtomSize must be positive", iM > 0);
            if (d0aVar.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strX = null;
                while (i6 - i5 < iM) {
                    d0aVar.M(i6);
                    int iM2 = d0aVar.m();
                    int iM3 = d0aVar.m();
                    if (iM3 == 1718775137) {
                        numValueOf = Integer.valueOf(d0aVar.m());
                    } else if (iM3 == 1935894637) {
                        d0aVar.N(4);
                        strX = d0aVar.x(4, StandardCharsets.UTF_8);
                    } else if (iM3 == 1935894633) {
                        i8 = i6;
                        i7 = iM2;
                    }
                    i6 += iM2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strX) || "cbc1".equals(strX) || "cens".equals(strX) || "cbcs".equals(strX)) {
                    rs0.n("frma atom is mandatory", numValueOf != null);
                    rs0.n("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            f1fVar = null;
                            break;
                        }
                        d0aVar.M(i9);
                        int iM4 = d0aVar.m();
                        if (d0aVar.m() == 1952804451) {
                            int iE = e(d0aVar.m());
                            d0aVar.N(1);
                            if (iE == 0) {
                                d0aVar.N(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iZ = d0aVar.z();
                                i3 = iZ & 15;
                                i4 = (iZ & 240) >> 4;
                            }
                            boolean z = d0aVar.z() == 1;
                            int iZ2 = d0aVar.z();
                            byte[] bArr2 = new byte[16];
                            d0aVar.k(bArr2, 0, 16);
                            if (z && iZ2 == 0) {
                                int iZ3 = d0aVar.z();
                                byte[] bArr3 = new byte[iZ3];
                                d0aVar.k(bArr3, 0, iZ3);
                                bArr = bArr3;
                            }
                            f1fVar = new f1f(z, strX, iZ2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iM4;
                    }
                    rs0.n("tenc atom is mandatory", f1fVar != null);
                    String str = pqf.a;
                    pairCreate = Pair.create(numValueOf, f1fVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iM;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0313  */
    public static p90 i(d0a d0aVar, a31 a31Var, String str, xp4 xp4Var, boolean z) throws l0a {
        xp4 xp4Var2;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        String str3;
        String str4;
        a31 a31Var2;
        int iG;
        int i5;
        int i6;
        byte[] bArrCopyOfRange;
        int i7;
        int i8;
        int iZ;
        int iZ2;
        int i9;
        int i10;
        xp4 xp4VarA;
        String str5;
        yob yobVarS;
        long j;
        d0a d0aVar2 = d0aVar;
        a31 a31Var3 = a31Var;
        String str6 = str;
        int i11 = a31Var3.a;
        d0aVar2.M(12);
        int iM = d0aVar2.m();
        p90 p90Var = new p90(iM);
        int i12 = 0;
        while (i12 < iM) {
            int i13 = d0aVar2.b;
            int iM2 = d0aVar2.m();
            String str7 = "childAtomSize must be positive";
            rs0.n("childAtomSize must be positive", iM2 > 0);
            int iM3 = d0aVar2.m();
            byte b = 3;
            int i14 = 8;
            String str8 = null;
            if (iM3 == 1635148593 || iM3 == 1635148595 || iM3 == 1701733238 || iM3 == 1831958048 || iM3 == 1836070006 || iM3 == 1752589105 || iM3 == 1751479857 || iM3 == 1987470129 || iM3 == 1987471665 || iM3 == 1932670515 || iM3 == 1211250227 || iM3 == 1748121139 || iM3 == 1987063864 || iM3 == 1987063865 || iM3 == 1635135537 || iM3 == 1685479798 || iM3 == 1685479729 || iM3 == 1685481573 || iM3 == 1685481521 || iM3 == 1634760241 || iM3 == 1684108849) {
                d0aVar2.M(i13 + 16);
                d0aVar2.N(16);
                int iG2 = d0aVar2.G();
                int iG3 = d0aVar2.G();
                d0aVar2.N(50);
                int i15 = d0aVar2.b;
                if (iM3 == 1701733238) {
                    Pair pairH = h(d0aVar2, i13, iM2);
                    if (pairH != null) {
                        iM3 = ((Integer) pairH.first).intValue();
                        xp4VarA = xp4Var == null ? null : xp4Var.a(((f1f) pairH.second).b);
                        ((f1f[]) p90Var.d)[i12] = (f1f) pairH.second;
                    } else {
                        i13 = i13;
                        xp4VarA = xp4Var;
                    }
                    d0aVar2.M(i15);
                    xp4Var2 = xp4VarA;
                } else {
                    i13 = i13;
                    xp4Var2 = xp4Var;
                }
                if (iM3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iM3 == 1211250227 ? "video/3gpp" : null;
                }
                xp4 xp4Var3 = xp4Var2;
                i = iM;
                int i16 = 8;
                szc szcVar = null;
                List listS = null;
                String string = null;
                byte[] bArr = null;
                ByteBuffer byteBuffer = null;
                ig4 ig4VarA = null;
                w21 w21Var = null;
                y21 y21Var = null;
                String str9 = str2;
                float fD = 1.0f;
                int i17 = i15;
                int i18 = -1;
                int i19 = -1;
                int iF = -1;
                boolean z2 = false;
                int i20 = -1;
                int i21 = -1;
                int i22 = -1;
                int i23 = -1;
                i2 = i12;
                i3 = i11;
                int i24 = 8;
                int i25 = -1;
                while (i17 - i13 < iM2) {
                    d0aVar2.M(i17);
                    int i26 = d0aVar2.b;
                    int i27 = i17;
                    int iM4 = d0aVar2.m();
                    if (iM4 == 0 && d0aVar2.b - i13 == iM2) {
                        break;
                    }
                    rs0.n(str7, iM4 > 0);
                    int iM5 = d0aVar2.m();
                    int i28 = iM2;
                    if (iM5 == 1635148611) {
                        rs0.n(str8, str9 == null);
                        d0aVar2.M(i26 + 8);
                        fr0 fr0VarA = fr0.a(d0aVar2);
                        listS = fr0VarA.a;
                        p90Var.b = fr0VarA.b;
                        float f = !z2 ? fr0VarA.k : fD;
                        String str10 = fr0VarA.l;
                        int i29 = fr0VarA.j;
                        iF = fr0VarA.g;
                        int i30 = fr0VarA.h;
                        int i31 = fr0VarA.i;
                        int i32 = fr0VarA.e;
                        i16 = fr0VarA.f;
                        i5 = iM3;
                        str7 = str7;
                        i21 = i29;
                        fD = f;
                        iG = i31;
                        i24 = i32;
                        i14 = i14;
                        str9 = "video/avc";
                        string = str10;
                        i25 = i30;
                    } else {
                        int i33 = iM3;
                        if (iM5 == 1752589123) {
                            rs0.n(null, str9 == null);
                            d0aVar2.M(i26 + 8);
                            rj6 rj6VarA = rj6.a(d0aVar2, false, null);
                            listS = rj6VarA.a;
                            p90Var.b = rj6VarA.b;
                            float f2 = !z2 ? rj6VarA.l : fD;
                            int i34 = rj6VarA.m;
                            int i35 = rj6VarA.c;
                            String str11 = rj6VarA.n;
                            int i36 = rj6VarA.k;
                            if (i36 != -1) {
                                i18 = i36;
                            }
                            int i37 = rj6VarA.d;
                            int i38 = rj6VarA.e;
                            int i39 = rj6VarA.h;
                            int i40 = rj6VarA.i;
                            int i41 = i18;
                            int i42 = rj6VarA.j;
                            int i43 = rj6VarA.f;
                            i16 = rj6VarA.g;
                            str9 = "video/hevc";
                            str7 = str7;
                            i23 = i37;
                            i22 = i38;
                            fD = f2;
                            iF = i39;
                            i25 = i40;
                            i18 = i41;
                            iG = i42;
                            i24 = i43;
                            i5 = i33;
                            i20 = i35;
                            string = str11;
                            i21 = i34;
                            szcVar = rj6VarA.o;
                            i14 = i14;
                        } else {
                            i18 = i18;
                            if (iM5 == 1818785347) {
                                rs0.n("lhvC must follow hvcC atom", "video/hevc".equals(str9));
                                rs0.n("must have at least two layers", szcVar != null && ((jy6) szcVar.b).size() >= 2);
                                d0aVar2.M(i26 + 8);
                                szcVar.getClass();
                                rj6 rj6VarA2 = rj6.a(d0aVar2, true, szcVar);
                                rs0.n("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", p90Var.b == rj6VarA2.b);
                                int i44 = rj6VarA2.h;
                                if (i44 != -1) {
                                    rs0.n("colorSpace must be the same for both views", iF == i44);
                                }
                                int i45 = rj6VarA2.i;
                                if (i45 != -1) {
                                    rs0.n("colorRange must be the same for both views", i25 == i45);
                                }
                                int i46 = rj6VarA2.j;
                                if (i46 != -1) {
                                    rs0.n("colorTransfer must be the same for both views", i19 == i46);
                                }
                                rs0.n("bitdepthLuma must be the same for both views", i24 == rj6VarA2.f);
                                rs0.n("bitdepthChroma must be the same for both views", i16 == rj6VarA2.g);
                                if (listS != null) {
                                    dy6 dy6VarM = jy6.m();
                                    dy6VarM.d(listS);
                                    dy6VarM.d(rj6VarA2.a);
                                    listS = dy6VarM.g();
                                } else {
                                    rs0.n("initializationData must be already set from hvcC atom", false);
                                }
                                string = rj6VarA2.n;
                                str9 = "video/mv-hevc";
                                iG = i19;
                                i24 = i24;
                                i16 = i16;
                            } else if (iM5 == 1987470147) {
                                rs0.n(null, str9 == null);
                                d0aVar2.M(i26 + 8);
                                try {
                                    if (d0aVar2.m() != 0) {
                                        throw l0a.a(null, "Unsupported VVC version");
                                    }
                                    int iZ3 = d0aVar2.z();
                                    int i47 = (iZ3 >> 1) & 3;
                                    boolean z3 = (iZ3 & 1) != 0;
                                    int i48 = i47 + 1;
                                    String str12 = "L";
                                    if (z3) {
                                        d0aVar2.N(1);
                                        int iZ4 = (d0aVar2.z() >> 4) & 7;
                                        iZ = (d0aVar2.z() >> 5) & 7;
                                        int iZ5 = d0aVar2.z() & 63;
                                        int iZ6 = d0aVar2.z();
                                        i9 = (iZ6 >> 1) & 127;
                                        str12 = (iZ6 & 1) != 0 ? "H" : "L";
                                        iZ2 = d0aVar2.z();
                                        d0aVar2.N(iZ5);
                                        int i49 = 1;
                                        if (iZ4 > 1) {
                                            int iZ7 = d0aVar2.z();
                                            int i50 = 0;
                                            while (true) {
                                                int i51 = i49;
                                                if (i50 >= iZ4 - 1) {
                                                    break;
                                                }
                                                if (((iZ7 >> (7 - i50)) & 1) != 0) {
                                                    d0aVar2.N(i51);
                                                }
                                                i50++;
                                                i49 = 1;
                                            }
                                        }
                                        d0aVar2.N(d0aVar2.z() * 4);
                                        d0aVar2.N(6);
                                    } else {
                                        iZ = 0;
                                        iZ2 = 0;
                                        i9 = 0;
                                    }
                                    int iZ8 = d0aVar2.z();
                                    int i52 = d0aVar2.b;
                                    int i53 = iZ;
                                    int i54 = i25;
                                    int i55 = 0;
                                    int i56 = 0;
                                    while (true) {
                                        i10 = 13;
                                        if (i56 >= iZ8) {
                                            break;
                                        }
                                        int i57 = i56;
                                        int iZ9 = d0aVar2.z() & 31;
                                        int iG4 = (iZ9 == 13 || iZ9 == 12) ? 1 : d0aVar2.G();
                                        int i58 = 0;
                                        while (i58 < iG4) {
                                            int i59 = i55;
                                            int iG5 = d0aVar2.G();
                                            d0aVar2.N(iG5);
                                            i58++;
                                            i55 = iG5 + 4 + i59;
                                        }
                                        i56 = i57 + 1;
                                    }
                                    d0aVar2.M(i52);
                                    byte[] bArr2 = new byte[i55];
                                    int i60 = 0;
                                    int i61 = 0;
                                    while (i60 < iZ8) {
                                        int i62 = iZ8;
                                        int iZ10 = d0aVar2.z() & 31;
                                        int iG6 = (iZ10 == i10 || iZ10 == 12) ? 1 : d0aVar2.G();
                                        int i63 = 0;
                                        while (i63 < iG6) {
                                            int i64 = iG6;
                                            int iG7 = d0aVar2.G();
                                            System.arraycopy(n16.D, 0, bArr2, i61, 4);
                                            int i65 = i61 + 4;
                                            d0aVar2.k(bArr2, i65, iG7);
                                            i61 = i65 + iG7;
                                            i63++;
                                            iG6 = i64;
                                            i60 = i60;
                                            i19 = i19;
                                        }
                                        i60++;
                                        iZ8 = i62;
                                        i10 = 13;
                                    }
                                    iG = i19;
                                    Locale locale = Locale.US;
                                    String str13 = "vvc1." + i9 + "." + str12 + iZ2;
                                    listS = jy6.s(bArr2);
                                    int i66 = i53 + 8;
                                    p90Var.b = i48;
                                    str9 = "video/vvc";
                                    string = str13;
                                    i24 = i66;
                                    i16 = i24;
                                    i25 = i54;
                                    i21 = 16;
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    throw l0a.a(e, "Error parsing VVC configuration");
                                }
                            } else {
                                iG = i19;
                                i25 = i25;
                                if (iM5 == 1986361461) {
                                    d0aVar2.M(i26 + 8);
                                    int i67 = d0aVar2.b;
                                    mjg mjgVar = null;
                                    while (i67 - i26 < iM4) {
                                        d0aVar2.M(i67);
                                        int iM6 = d0aVar2.m();
                                        rs0.n(str7, iM6 > 0);
                                        if (d0aVar2.m() == 1702454643) {
                                            d0aVar2.M(i67 + 8);
                                            int i68 = d0aVar2.b;
                                            while (true) {
                                                if (i68 - i67 >= iM6) {
                                                    mjgVar = null;
                                                    break;
                                                }
                                                d0aVar2.M(i68);
                                                int iM7 = d0aVar2.m();
                                                rs0.n(str7, iM7 > 0);
                                                if (d0aVar2.m() == 1937011305) {
                                                    d0aVar2.N(4);
                                                    int iZ11 = d0aVar2.z();
                                                    boolean z4 = (iZ11 & 1) == 1;
                                                    boolean z5 = (iZ11 & 2) == 2;
                                                    boolean z6 = (iZ11 & 8) == i14;
                                                    lj0 lj0Var = new lj0();
                                                    lj0Var.a = z4;
                                                    lj0Var.b = z5;
                                                    lj0Var.c = z6;
                                                    mjgVar = new mjg(lj0Var);
                                                    break;
                                                }
                                                i68 += iM7;
                                                i14 = 8;
                                            }
                                        }
                                        i67 += iM6;
                                        i14 = 8;
                                    }
                                    ssg ssgVar = mjgVar == null ? null : new ssg(5, mjgVar);
                                    if (ssgVar != null) {
                                        lj0 lj0Var2 = (lj0) ((mjg) ssgVar.b).a;
                                        boolean z7 = lj0Var2.c;
                                        if (szcVar == null || ((jy6) szcVar.b).size() < 2) {
                                            i18 = i18;
                                            if (i18 == -1) {
                                                i18 = z7 ? 5 : 4;
                                            }
                                        } else {
                                            rs0.n("both eye views must be marked as available", lj0Var2.a && lj0Var2.b);
                                            rs0.n("for MV-HEVC, eye_views_reversed must be set to false", !z7);
                                            i18 = i18;
                                        }
                                    } else {
                                        i18 = i18;
                                    }
                                    i5 = i33;
                                } else {
                                    i18 = i18;
                                    if (iM5 == 1685480259 || iM5 == 1685485123 || iM5 == 1685485379) {
                                        str7 = str7;
                                        str9 = str9;
                                        i24 = i24;
                                        szcVar = szcVar;
                                        i16 = i16;
                                        i5 = i33;
                                        i14 = 8;
                                        iG = iG;
                                        ig4VarA = ig4.a(d0aVar2);
                                    } else {
                                        if (iM5 == 1987076931) {
                                            rs0.n(null, str9 == null);
                                            String str14 = i33 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            d0aVar2.M(i26 + 12);
                                            byte bZ = (byte) d0aVar2.z();
                                            byte bZ2 = (byte) d0aVar2.z();
                                            int iZ12 = d0aVar2.z();
                                            int i69 = iZ12 >> 4;
                                            byte b2 = (byte) ((iZ12 >> 1) & 7);
                                            if (str14.equals("video/x-vnd.on2.vp9")) {
                                                byte[] bArr3 = d72.a;
                                                byte[] bArr4 = new byte[12];
                                                bArr4[0] = 1;
                                                bArr4[1] = 1;
                                                bArr4[2] = bZ;
                                                bArr4[b] = 2;
                                                bArr4[4] = 1;
                                                bArr4[5] = bZ2;
                                                bArr4[6] = b;
                                                bArr4[7] = 1;
                                                bArr4[8] = (byte) i69;
                                                bArr4[9] = 4;
                                                bArr4[10] = 1;
                                                bArr4[11] = b2;
                                                listS = jy6.s(bArr4);
                                            }
                                            boolean z8 = (iZ12 & 1) != 0;
                                            int iZ13 = d0aVar2.z();
                                            int iZ14 = d0aVar2.z();
                                            iF = e82.f(iZ13);
                                            int i70 = z8 ? 1 : 2;
                                            iG = e82.g(iZ14);
                                            i5 = i33;
                                            str7 = str7;
                                            str9 = str14;
                                            i24 = i69;
                                            i16 = i24;
                                            i25 = i70;
                                        } else {
                                            int i71 = 11;
                                            if (iM5 == 1635135811) {
                                                int i72 = iM4 - 8;
                                                byte[] bArr5 = new byte[i72];
                                                d0aVar2.k(bArr5, 0, i72);
                                                listS = jy6.s(bArr5);
                                                er0 er0VarI = er0.i(bArr5);
                                                if (er0VarI != null) {
                                                    i24 = er0VarI.b;
                                                    iF = er0VarI.c;
                                                    i7 = er0VarI.d;
                                                    i8 = er0VarI.e;
                                                    string = (String) er0VarI.f;
                                                    i16 = i24;
                                                } else {
                                                    i7 = i25;
                                                    i8 = iG;
                                                }
                                                str9 = "video/av01";
                                                i25 = i7;
                                                i5 = i33;
                                                str7 = str7;
                                                iG = i8;
                                                i24 = i24;
                                                i16 = i16;
                                            } else if (iM5 == 1668050025) {
                                                ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                byteBufferOrder.position(21);
                                                byteBufferOrder.putShort(d0aVar2.w());
                                                byteBufferOrder.putShort(d0aVar2.w());
                                                byteBuffer = byteBufferOrder;
                                                i5 = i33;
                                            } else {
                                                if (iM5 == 1835295606) {
                                                    ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    short sW = d0aVar2.w();
                                                    short sW2 = d0aVar2.w();
                                                    short sW3 = d0aVar2.w();
                                                    i5 = i33;
                                                    short sW4 = d0aVar2.w();
                                                    str7 = str7;
                                                    short sW5 = d0aVar2.w();
                                                    str9 = str9;
                                                    short sW6 = d0aVar2.w();
                                                    i24 = i24;
                                                    short sW7 = d0aVar2.w();
                                                    szcVar = szcVar;
                                                    short sW8 = d0aVar2.w();
                                                    long jB = d0aVar2.B();
                                                    long jB2 = d0aVar2.B();
                                                    i16 = i16;
                                                    byteBufferOrder2.position(1);
                                                    byteBufferOrder2.putShort(sW5);
                                                    byteBufferOrder2.putShort(sW6);
                                                    byteBufferOrder2.putShort(sW);
                                                    byteBufferOrder2.putShort(sW2);
                                                    byteBufferOrder2.putShort(sW3);
                                                    byteBufferOrder2.putShort(sW4);
                                                    byteBufferOrder2.putShort(sW7);
                                                    byteBufferOrder2.putShort(sW8);
                                                    byteBufferOrder2.putShort((short) (jB / 10000));
                                                    byteBufferOrder2.putShort((short) (jB2 / 10000));
                                                    byteBuffer = byteBufferOrder2;
                                                } else {
                                                    i5 = i33;
                                                    str7 = str7;
                                                    str9 = str9;
                                                    i24 = i24;
                                                    szcVar = szcVar;
                                                    i16 = i16;
                                                    if (iM5 == 1681012275) {
                                                        rs0.n(null, str9 == null);
                                                        str9 = "video/3gpp";
                                                    } else {
                                                        if (iM5 == 1702061171) {
                                                            rs0.n(null, str9 == null);
                                                            y21 y21VarC = c(i26, d0aVar2);
                                                            String str15 = (String) y21VarC.c;
                                                            byte[] bArr6 = (byte[]) y21VarC.d;
                                                            if (bArr6 != null) {
                                                                listS = jy6.s(bArr6);
                                                            }
                                                            y21Var = y21VarC;
                                                            str9 = str15;
                                                        } else if (iM5 == 1651798644) {
                                                            d0aVar2.M(i26 + 8);
                                                            d0aVar2.N(4);
                                                            w21Var = new w21(d0aVar2.B(), d0aVar2.B(), 0, (byte) 0);
                                                            i14 = 8;
                                                        } else if (iM5 == 1885434736) {
                                                            d0aVar2.M(i26 + 8);
                                                            fD = d0aVar2.D() / d0aVar2.D();
                                                            i25 = i25;
                                                            szcVar = szcVar;
                                                            i14 = 8;
                                                            z2 = true;
                                                        } else if (iM5 == 1937126244) {
                                                            int i73 = i26 + 8;
                                                            while (true) {
                                                                if (i73 - i26 >= iM4) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                d0aVar2.M(i73);
                                                                int iM8 = d0aVar2.m();
                                                                if (d0aVar2.m() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(d0aVar2.a, i73, iM8 + i73);
                                                                    break;
                                                                }
                                                                i73 += iM8;
                                                            }
                                                            bArr = bArrCopyOfRange;
                                                        } else if (iM5 == 1936995172) {
                                                            int iZ15 = d0aVar2.z();
                                                            byte b3 = b;
                                                            d0aVar2.N(b3);
                                                            if (iZ15 == 0) {
                                                                int iZ16 = d0aVar2.z();
                                                                if (iZ16 == 0) {
                                                                    i18 = 0;
                                                                } else if (iZ16 == 1) {
                                                                    i18 = 1;
                                                                } else if (iZ16 == 2) {
                                                                    i18 = 2;
                                                                } else if (iZ16 == b3) {
                                                                    i18 = b3;
                                                                }
                                                            }
                                                        } else if (iM5 == 1634760259) {
                                                            int i74 = iM4 - 12;
                                                            byte[] bArr7 = new byte[i74];
                                                            d0aVar2.M(i26 + 12);
                                                            d0aVar2.k(bArr7, 0, i74);
                                                            byte[] bArr8 = d72.a;
                                                            pa7.w(i74, "Invalid APV CSD length: %s", i74 >= 17);
                                                            byte b4 = bArr7[0];
                                                            pa7.w(b4, "Invalid APV CSD version: %s", b4 == 1);
                                                            int i75 = bArr7[5] & 255;
                                                            int i76 = bArr7[6] & 255;
                                                            int i77 = bArr7[7] & 255;
                                                            String str16 = pqf.a;
                                                            Locale locale2 = Locale.US;
                                                            StringBuilder sbN = ib8.n(i75, i76, "apv1.apvf", ".apvl", ".apvb");
                                                            sbN.append(i77);
                                                            string = sbN.toString();
                                                            listS = jy6.s(bArr7);
                                                            d0a d0aVar3 = new d0a(bArr7);
                                                            zu1 zu1Var = new zu1(bArr7, i74);
                                                            i14 = 8;
                                                            zu1Var.m(d0aVar3.b * 8);
                                                            zu1Var.p(1);
                                                            int iG8 = zu1Var.g(8);
                                                            int i78 = -1;
                                                            int i79 = 0;
                                                            int i80 = -1;
                                                            int i81 = -1;
                                                            int i82 = -1;
                                                            int i83 = -1;
                                                            while (i79 < iG8) {
                                                                zu1Var.p(1);
                                                                int iG9 = zu1Var.g(8);
                                                                int iG10 = i83;
                                                                int i84 = i82;
                                                                int i85 = i81;
                                                                int i86 = i80;
                                                                int iG11 = i78;
                                                                int i87 = 0;
                                                                while (i87 < iG9) {
                                                                    zu1Var.o(6);
                                                                    boolean zF = zu1Var.f();
                                                                    zu1Var.n();
                                                                    zu1Var.p(i71);
                                                                    zu1Var.o(4);
                                                                    iG10 = zu1Var.g(4) + 8;
                                                                    zu1Var.p(1);
                                                                    if (zF) {
                                                                        int iG12 = zu1Var.g(8);
                                                                        int iG13 = zu1Var.g(8);
                                                                        zu1Var.p(1);
                                                                        boolean zF2 = zu1Var.f();
                                                                        int iF2 = e82.f(iG12);
                                                                        i84 = zF2 ? 1 : 2;
                                                                        i85 = iF2;
                                                                        iG11 = e82.g(iG13);
                                                                    }
                                                                    i87++;
                                                                    i86 = iG10;
                                                                    i71 = 11;
                                                                }
                                                                i79++;
                                                                i78 = iG11;
                                                                i80 = i86;
                                                                i81 = i85;
                                                                i82 = i84;
                                                                i83 = iG10;
                                                                i71 = 11;
                                                            }
                                                            str9 = "video/apv";
                                                            iG = i78;
                                                            i24 = i80;
                                                            iF = i81;
                                                            i25 = i82;
                                                            i16 = i83;
                                                            szcVar = szcVar;
                                                        } else {
                                                            i14 = 8;
                                                            if (iM5 == 1668246642) {
                                                                i6 = iG;
                                                                if (iF == -1 && i6 == -1) {
                                                                    int iM9 = d0aVar2.m();
                                                                    if (iM9 == 1852009592 || iM9 == 1852009571) {
                                                                        int iG14 = d0aVar2.G();
                                                                        int iG15 = d0aVar2.G();
                                                                        d0aVar2.N(2);
                                                                        boolean z9 = iM4 == 19 && (d0aVar2.z() & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
                                                                        int iF3 = e82.f(iG14);
                                                                        i25 = z9 ? 1 : 2;
                                                                        iG = e82.g(iG15);
                                                                        szcVar = szcVar;
                                                                        iF = iF3;
                                                                    } else {
                                                                        xo1.V("BoxParsers", "Unsupported color type: ".concat(g41.b(iM9)));
                                                                    }
                                                                }
                                                            } else {
                                                                i6 = iG;
                                                            }
                                                            iG = i6;
                                                        }
                                                        i14 = 8;
                                                    }
                                                }
                                                i25 = i25;
                                                szcVar = szcVar;
                                            }
                                        }
                                        i14 = 8;
                                    }
                                    i25 = i25;
                                    szcVar = szcVar;
                                }
                                i25 = i25;
                                i14 = 8;
                            }
                            i5 = i33;
                        }
                    }
                    i17 = i27 + iM4;
                    i14 = i14;
                    iM2 = i28;
                    iM3 = i5;
                    i19 = iG;
                    str7 = str7;
                    str9 = str9;
                    i24 = i24;
                    i16 = i16;
                    b = 3;
                    str8 = null;
                }
                i4 = iM2;
                int i88 = i19;
                String str17 = str9;
                int i89 = i24;
                int i90 = i25;
                int i91 = i16;
                if (ig4VarA != null) {
                    str3 = ig4VarA.b;
                    str4 = "video/dolby-vision";
                } else {
                    str3 = string;
                    str4 = str17;
                }
                if (str4 == null) {
                    a31Var2 = a31Var;
                    str6 = str;
                } else {
                    qr5 qr5Var = new qr5();
                    qr5Var.a = Integer.toString(i3);
                    qr5Var.o = qv8.l(str4);
                    qr5Var.k = str3;
                    qr5Var.v = iG2;
                    qr5Var.w = iG3;
                    qr5Var.y = i23;
                    qr5Var.z = i22;
                    qr5Var.D = fD;
                    a31Var2 = a31Var;
                    qr5Var.B = a31Var2.c;
                    qr5Var.C = a31Var2.d;
                    qr5Var.E = bArr;
                    qr5Var.F = i18;
                    qr5Var.r = listS;
                    qr5Var.q = i21;
                    qr5Var.H = i20;
                    qr5Var.s = xp4Var3;
                    str6 = str;
                    qr5Var.d = str6;
                    qr5Var.G = new e82(iF, i90, i88, byteBuffer != null ? byteBuffer.array() : null, i89, i91);
                    w21 w21Var2 = w21Var;
                    if (w21Var2 != null) {
                        qr5Var.i = rxg.R(w21Var2.b);
                        qr5Var.j = rxg.R(w21Var2.c);
                    } else {
                        y21 y21Var2 = y21Var;
                        if (y21Var2 != null) {
                            qr5Var.i = rxg.R(y21Var2.a);
                            qr5Var.j = rxg.R(y21Var2.b);
                        }
                    }
                    p90Var.e = new rr5(qr5Var);
                }
            } else {
                if (iM3 == 1836069985 || iM3 == 1701733217 || iM3 == 1633889587 || iM3 == 1700998451 || iM3 == 1633889588 || iM3 == 1835823201 || iM3 == 1685353315 || iM3 == 1685353317 || iM3 == 1685353320 || iM3 == 1685353324 || iM3 == 1685353336 || iM3 == 1935764850 || iM3 == 1935767394 || iM3 == 1819304813 || iM3 == 1936684916 || iM3 == 1953984371 || iM3 == 778924082 || iM3 == 778924083 || iM3 == 1835557169 || iM3 == 1835560241 || iM3 == 1634492771 || iM3 == 1634492791 || iM3 == 1970037111 || iM3 == 1332770163 || iM3 == 1716281667 || iM3 == 1767992678 || iM3 == 1768973165 || iM3 == 1718641517) {
                    d0aVar2 = d0aVar;
                    i13 = i13;
                    b(d0aVar2, iM3, i13, iM2, a31Var3.a, str6, z, xp4Var, p90Var, i12);
                    str6 = str;
                } else if (iM3 == 1414810956 || iM3 == 1954034535 || iM3 == 2004251764 || iM3 == 1937010800 || iM3 == 1664495672 || iM3 == 1836070003 || iM3 == 1952807028) {
                    d0aVar2.M(i13 + 16);
                    String str18 = "application/ttml+xml";
                    long j2 = Long.MAX_VALUE;
                    if (iM3 != 1414810956) {
                        if (iM3 == 1954034535) {
                            int i92 = iM2 - 16;
                            byte[] bArr9 = new byte[i92];
                            d0aVar2.k(bArr9, 0, i92);
                            yobVarS = jy6.s(bArr9);
                            str18 = "application/x-quicktime-tx3g";
                            i13 = i13;
                        } else {
                            if (iM3 == 2004251764) {
                                str18 = "application/x-mp4-vtt";
                            } else if (iM3 == 1937010800) {
                                j2 = 0;
                            } else if (iM3 == 1664495672) {
                                p90Var.c = 1;
                                str18 = "application/x-mp4-cea-608";
                            } else if (iM3 == 1836070003) {
                                int i93 = d0aVar2.b;
                                d0aVar2.N(4);
                                if (d0aVar2.m() == 1702061171) {
                                    byte[] bArr10 = (byte[]) c(i93, d0aVar2).d;
                                    if (bArr10 == null || bArr10.length != 64) {
                                        i13 = i13;
                                    } else {
                                        int i94 = a31Var3.e;
                                        int i95 = a31Var3.f;
                                        pa7.J(bArr10.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i96 = 0;
                                        while (i96 < bArr10.length - 3) {
                                            byte[] bArr11 = bArr10;
                                            int iF4 = rxg.F(bArr10[i96], bArr10[i96 + 1], bArr10[i96 + 2], bArr11[i96 + 3]);
                                            int i97 = (iF4 >> 16) & 255;
                                            int i98 = ((iF4 >> 8) & 255) - 128;
                                            int i99 = (iF4 & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(pqf.h(((i99 * 17790) / 10000) + i97, 0, 255) | (pqf.h((i97 - ((i99 * 3455) / 10000)) - ((i98 * 7169) / 10000), 0, 255) << 8) | (pqf.h(((i98 * 14075) / 10000) + i97, 0, 255) << 16))));
                                            i96 += 4;
                                            bArr10 = bArr11;
                                            i13 = i13;
                                        }
                                        i13 = i13;
                                        StringBuilder sbN2 = ib8.n(i94, i95, "size: ", "x", "\npalette: ");
                                        sbN2.append(new ue1(", ", 1).b(arrayList));
                                        sbN2.append("\n");
                                        String string2 = sbN2.toString();
                                        String str19 = pqf.a;
                                        yobVarS = jy6.s(string2.getBytes(StandardCharsets.UTF_8));
                                        str5 = "application/vobsub";
                                    }
                                } else {
                                    i13 = i13;
                                    str5 = null;
                                    yobVarS = null;
                                }
                                str18 = str5;
                            } else {
                                if (iM3 != 1952807028) {
                                    r3.l();
                                    return null;
                                }
                                str18 = "text/x-unknown";
                                yobVarS = null;
                            }
                            yobVarS = null;
                        }
                        j = j2;
                        if (str18 != null) {
                            qr5 qr5Var2 = new qr5();
                            qr5Var2.a = Integer.toString(i11);
                            qr5Var2.o = qv8.l(str18);
                            qr5Var2.d = str6;
                            qr5Var2.t = j;
                            qr5Var2.r = yobVarS;
                            p90Var.e = new rr5(qr5Var2);
                        }
                    } else {
                        yobVarS = null;
                        j = j2;
                        if (str18 != null) {
                            qr5 qr5Var3 = new qr5();
                            qr5Var3.a = Integer.toString(i11);
                            qr5Var3.o = qv8.l(str18);
                            qr5Var3.d = str6;
                            qr5Var3.t = j;
                            qr5Var3.r = yobVarS;
                            p90Var.e = new rr5(qr5Var3);
                        }
                    }
                    d0aVar2 = d0aVar;
                    i4 = iM2;
                    i2 = i12;
                    a31Var2 = a31Var3;
                    i3 = i11;
                    i = iM;
                    i13 = i13;
                } else if (iM3 == 1835365492 || iM3 == 1769222965) {
                    d0aVar2.M(i13 + 16);
                    if (iM3 == 1835365492) {
                        d0aVar2.u();
                        String strU = d0aVar2.u();
                        if (strU != null) {
                            qr5 qr5Var4 = new qr5();
                            qr5Var4.a = Integer.toString(i11);
                            qr5Var4.o = qv8.l(strU);
                            p90Var.e = new rr5(qr5Var4);
                        }
                    } else if (iM3 == 1769222965) {
                        int iZ17 = d0aVar2.z();
                        byte[] bArr12 = new byte[iZ17];
                        d0aVar2.k(bArr12, 0, iZ17);
                        qr5 qr5Var5 = new qr5();
                        qr5Var5.a = Integer.toString(i11);
                        qr5Var5.o = qv8.l("application/x-itut-t35");
                        qr5Var5.r = jy6.s(bArr12);
                        p90Var.e = new rr5(qr5Var5);
                    }
                } else if (iM3 == 1667329389) {
                    qr5 qr5Var6 = new qr5();
                    qr5Var6.a = Integer.toString(i11);
                    qr5Var6.o = qv8.l("application/x-camera-motion");
                    p90Var.e = new rr5(qr5Var6);
                }
                i13 = i13;
                i4 = iM2;
                i2 = i12;
                a31Var2 = a31Var3;
                i3 = i11;
                i = iM;
            }
            d0aVar2.M(i13 + i4);
            i12 = i2 + 1;
            a31Var3 = a31Var2;
            i11 = i3;
            iM = i;
        }
        return p90Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:108:0x020a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0216 A[LOOP:18: B:98:0x01e6->B:109:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x0256  */
    /* JADX WARN: Code duplicated, block: B:123:0x0278  */
    /* JADX WARN: Code duplicated, block: B:125:0x0287  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:199:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:203:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:204:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:206:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:208:0x0408  */
    /* JADX WARN: Code duplicated, block: B:209:0x0412  */
    /* JADX WARN: Code duplicated, block: B:272:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:275:0x05de  */
    /* JADX WARN: Code duplicated, block: B:276:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:278:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:281:0x05f1 A[LOOP:1: B:279:0x05eb->B:281:0x05f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:284:0x0604 A[LOOP:2: B:283:0x0602->B:284:0x0604, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:287:0x0621  */
    /* JADX WARN: Code duplicated, block: B:289:0x0635 A[LOOP:4: B:288:0x0633->B:289:0x0635, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x067e  */
    /* JADX WARN: Code duplicated, block: B:295:0x0682  */
    /* JADX WARN: Code duplicated, block: B:297:0x0686  */
    /* JADX WARN: Code duplicated, block: B:299:0x068a  */
    /* JADX WARN: Code duplicated, block: B:302:0x069c  */
    /* JADX WARN: Code duplicated, block: B:304:0x069f  */
    /* JADX WARN: Code duplicated, block: B:305:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:308:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:309:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:312:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:313:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:316:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:317:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:320:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:322:0x06de  */
    /* JADX WARN: Code duplicated, block: B:324:0x06e4 A[LOOP:14: B:321:0x06dc->B:324:0x06e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:329:0x070a  */
    /* JADX WARN: Code duplicated, block: B:331:0x0722  */
    /* JADX WARN: Code duplicated, block: B:332:0x0727  */
    /* JADX WARN: Code duplicated, block: B:334:0x072b A[ADDED_TO_REGION, LOOP:15: B:334:0x072b->B:336:0x072f, LOOP_START, PHI: r10 r30 r31
  0x072b: PHI (r10v18 int) = (r10v16 int), (r10v19 int) binds: [B:333:0x0729, B:336:0x072f] A[DONT_GENERATE, DONT_INLINE]
  0x072b: PHI (r30v5 int) = (r30v1 int), (r30v6 int) binds: [B:333:0x0729, B:336:0x072f] A[DONT_GENERATE, DONT_INLINE]
  0x072b: PHI (r31v11 int) = (r31v9 int), (r31v13 int) binds: [B:333:0x0729, B:336:0x072f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:340:0x0748  */
    /* JADX WARN: Code duplicated, block: B:342:0x074b  */
    /* JADX WARN: Code duplicated, block: B:344:0x0758  */
    /* JADX WARN: Code duplicated, block: B:345:0x075a  */
    /* JADX WARN: Code duplicated, block: B:348:0x075f  */
    /* JADX WARN: Code duplicated, block: B:349:0x076b  */
    /* JADX WARN: Code duplicated, block: B:363:0x07be A[DONT_INVERT, LOOP:16: B:363:0x07be->B:367:0x07c8, LOOP_START, PHI: r30
  0x07be: PHI (r30v2 int) = (r30v1 int), (r30v3 int) binds: [B:362:0x07bc, B:367:0x07c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:364:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:367:0x07c8 A[LOOP:16: B:363:0x07be->B:367:0x07c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:368:0x07ce A[EDGE_INSN: B:368:0x07ce->B:369:0x07cf BREAK  A[LOOP:16: B:363:0x07be->B:367:0x07c8]] */
    /* JADX WARN: Code duplicated, block: B:377:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:379:0x080f  */
    /* JADX WARN: Code duplicated, block: B:380:0x0812  */
    /* JADX WARN: Code duplicated, block: B:385:0x0833  */
    /* JADX WARN: Code duplicated, block: B:392:0x087b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:393:0x087d  */
    /* JADX WARN: Code duplicated, block: B:396:0x088f  */
    /* JADX WARN: Code duplicated, block: B:398:0x0895  */
    /* JADX WARN: Code duplicated, block: B:404:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:407:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:409:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:413:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:437:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:440:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:442:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:445:0x09c4 A[LOOP:6: B:443:0x09c1->B:445:0x09c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:447:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:450:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:451:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:455:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:457:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:462:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:463:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:470:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:476:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:481:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:486:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:487:0x0aab  */
    /* JADX WARN: Code duplicated, block: B:489:0x0ab3  */
    /* JADX WARN: Code duplicated, block: B:493:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:494:0x0acf  */
    /* JADX WARN: Code duplicated, block: B:497:0x0ad5  */
    /* JADX WARN: Code duplicated, block: B:498:0x0ad8  */
    /* JADX WARN: Code duplicated, block: B:500:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:501:0x0ade  */
    /* JADX WARN: Code duplicated, block: B:503:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:505:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:506:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:508:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:509:0x0af2  */
    /* JADX WARN: Code duplicated, block: B:513:0x0b04  */
    /* JADX WARN: Code duplicated, block: B:515:0x0b10  */
    /* JADX WARN: Code duplicated, block: B:516:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:519:0x0b2c  */
    /* JADX WARN: Code duplicated, block: B:521:0x0b56  */
    /* JADX WARN: Code duplicated, block: B:524:0x0b5d  */
    /* JADX WARN: Code duplicated, block: B:528:0x0b65 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:536:0x0ba4  */
    /* JADX WARN: Code duplicated, block: B:558:0x08d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x0a68 A[EDGE_INSN: B:563:0x0a68->B:467:0x0a68 BREAK  A[LOOP:8: B:458:0x0a53->B:466:0x0a65], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x0a65 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x0a7f A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x0aa0 A[ADDED_TO_REGION, EDGE_INSN: B:569:0x0aa0->B:484:0x0aa0 BREAK  A[LOOP:10: B:479:0x0a8d->B:483:0x0a99], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x0b76 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0701 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x07a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x06f9 A[EDGE_INSN: B:583:0x06f9->B:325:0x06f9 BREAK  A[LOOP:14: B:321:0x06dc->B:324:0x06e4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x07ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x07c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    /* JADX WARN: Code duplicated, block: B:83:0x017d  */
    /* JADX WARN: Code duplicated, block: B:86:0x018b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0192  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01de  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e8  */
    public static ArrayList j(m49 m49Var, s46 s46Var, long j, xp4 xp4Var, boolean z, boolean z2, i26 i26Var, boolean z3) {
        int i;
        int i2;
        long j2;
        long jN;
        long jB;
        int i3;
        int i4;
        boolean z4;
        a31 a31Var;
        long j3;
        long j4;
        long jN2;
        long j5;
        d0a d0aVar;
        int iE;
        int i5;
        long jB2;
        int i6;
        int i7;
        ArrayList arrayList;
        int i8;
        long j6;
        ArrayList arrayList2;
        int i9;
        char[] cArr;
        int i10;
        String str;
        n49 n49VarG;
        p90 p90VarI;
        m49 m49VarE;
        int iM;
        ky6 ky6Var;
        ky6 ky6Var2;
        rr5 rr5Var;
        int i11;
        d1f d1fVar;
        l49 l49Var;
        su8 su8Var;
        su8 su8Var2;
        m49 m49VarE2;
        Pair pairCreate;
        n49 n49VarG2;
        char c;
        int i12;
        int i13;
        int i14;
        long jF;
        z21 er0Var;
        boolean z5;
        int iD;
        int iD2;
        int iD3;
        int iH;
        boolean z6;
        ArrayList arrayList3;
        boolean z7;
        long[] jArr;
        d0a d0aVar2;
        int[] iArrCopyOf;
        z21 z21Var;
        long[] jArr2;
        int[] iArr;
        d0a d0aVar3;
        int i15;
        int i16;
        long j7;
        long j8;
        long j9;
        int iM2;
        int i17;
        int i18;
        int iD4;
        int i19;
        int i20;
        String str2;
        long[] jArrCopyOf;
        long[] jArr3;
        int i21;
        int[] iArrCopyOf2;
        boolean z8;
        String str3;
        int i22;
        long j10;
        int i23;
        int[] iArr2;
        long j11;
        long j12;
        int i24;
        boolean zA;
        int i25;
        int iR;
        long[] jArr4;
        int[] iArr3;
        long j13;
        long j14;
        int iD5;
        int i26;
        long[] jArr5;
        int[] iArr4;
        long j15;
        int i27;
        long j16;
        rr5 rr5Var2;
        ky6 ky6Var3;
        ky6 ky6Var4;
        long jN3;
        int[] iArrZ;
        long[] jArr6;
        long j17;
        int i28;
        long[] jArr7;
        int[] iArr5;
        int i29;
        boolean z9;
        int[] iArr6;
        int[] iArr7;
        int i30;
        int i31;
        boolean z10;
        int i32;
        int[] iArr8;
        boolean z11;
        boolean z12;
        long[] jArr8;
        int[] iArr9;
        int[] iArr10;
        ArrayList arrayList4;
        long[] jArr9;
        int i33;
        boolean z13;
        int i34;
        long jA;
        rr5 rr5Var3;
        n1f n1fVar;
        long jA2;
        int i35;
        int i36;
        int[] iArr11;
        int i37;
        int i38;
        int[] iArr12;
        long jN4;
        long jA3;
        int i39;
        long jN5;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        boolean z14;
        int i46;
        long jA4;
        int i47;
        n1f n1fVar2;
        long jA5;
        int i48;
        long jN6;
        long jN7;
        int i49;
        long[] jArr10;
        int[] iArr13;
        long j18;
        int i50;
        int i51;
        int iE2;
        int[] iArr14;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        long j19;
        int iMax;
        int i57;
        int i58;
        int i59;
        m49 m49Var2 = m49Var;
        ArrayList arrayList5 = m49Var2.e;
        ArrayList arrayList6 = new ArrayList();
        int i60 = 0;
        while (i60 < arrayList5.size()) {
            m49 m49Var3 = (m49) arrayList5.get(i60);
            if (m49Var3.b != 1953653099) {
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                i2 = i60;
            } else {
                n49 n49VarG3 = m49Var2.g(1836476516);
                n49VarG3.getClass();
                m49 m49VarE3 = m49Var3.e(1835297121);
                m49VarE3.getClass();
                n49 n49VarG4 = m49VarE3.g(1751411826);
                n49VarG4.getClass();
                d0a d0aVar4 = n49VarG4.c;
                d0aVar4.M(16);
                int iM3 = d0aVar4.m();
                if (iM3 == 1936684398) {
                    i = 1;
                } else if (iM3 == 1986618469) {
                    i = 2;
                } else if (iM3 == 1952807028 || iM3 == 1935832172 || iM3 == 1937072756 || iM3 == 1668047728 || iM3 == 1937072752) {
                    i = 3;
                } else {
                    i = iM3 == 1835365473 ? 5 : -1;
                }
                String str4 = "BoxParsers";
                int i61 = 1;
                i2 = i60;
                if (i == -1) {
                    i26Var = i26Var;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    m49Var3 = m49Var3;
                    str4 = "BoxParsers";
                    d1fVar = null;
                    j2 = 0;
                } else {
                    j2 = 0;
                    n49 n49VarG5 = m49Var3.g(1953196132);
                    n49VarG5.getClass();
                    d0a d0aVar5 = n49VarG5.c;
                    d0aVar5.M(8);
                    int iE3 = e(d0aVar5.m());
                    d0aVar5.N(iE3 != 0 ? 16 : 8);
                    int iM4 = d0aVar5.m();
                    d0aVar5.N(4);
                    int i62 = d0aVar5.b;
                    int i63 = iE3 == 0 ? 4 : 8;
                    int i64 = 0;
                    while (true) {
                        jN = -9223372036854775807L;
                        if (i64 >= i63) {
                            d0aVar5.N(i63);
                        } else {
                            if (d0aVar5.a[i62 + i64] != -1) {
                                jB = iE3 == 0 ? d0aVar5.B() : d0aVar5.F();
                                if (jB != 0) {
                                    break;
                                }
                                break;
                            }
                            i64++;
                        }
                        jB = -9223372036854775807L;
                        break;
                    }
                    d0aVar5.N(10);
                    int iG = d0aVar5.G();
                    d0aVar5.N(4);
                    int iM5 = d0aVar5.m();
                    int iM6 = d0aVar5.m();
                    d0aVar5.N(4);
                    int iM7 = d0aVar5.m();
                    int iM8 = d0aVar5.m();
                    if (iM5 == 0 && iM6 == 65536 && ((iM7 == -65536 || iM7 == 65536) && iM8 == 0)) {
                        i3 = 90;
                    } else if (iM5 == 0 && iM6 == -65536 && ((iM7 == 65536 || iM7 == -65536) && iM8 == 0)) {
                        i3 = 270;
                    } else {
                        if ((iM5 == -65536 || iM5 == 65536) && iM6 == 0 && iM7 == 0 && iM8 == -65536) {
                            i3 = 180;
                        } else {
                            i4 = 0;
                        }
                        d0aVar5.N(16);
                        short sW = d0aVar5.w();
                        d0aVar5.N(2);
                        short sW2 = d0aVar5.w();
                        if ((((long) iM5) * ((long) iM8)) - (((long) iM6) * ((long) iM7)) < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        a31Var = new a31(iM4, jB, iG, i4, z4, sW, sW2);
                        if (j == -9223372036854775807L) {
                            j3 = jB;
                        } else {
                            j3 = j;
                        }
                        j4 = g(n49VarG3.c).c;
                        if (j3 == -9223372036854775807L) {
                            j5 = j4;
                            jN2 = -9223372036854775807L;
                        } else {
                            String str5 = pqf.a;
                            jN2 = pqf.N(j3, 1000000L, j4, RoundingMode.DOWN);
                            j5 = j4;
                        }
                        m49 m49VarE4 = m49VarE3.e(1835626086);
                        m49VarE4.getClass();
                        m49 m49VarE5 = m49VarE4.e(1937007212);
                        m49VarE5.getClass();
                        n49 n49VarG6 = m49VarE3.g(1835296868);
                        n49VarG6.getClass();
                        d0aVar = n49VarG6.c;
                        d0aVar.M(8);
                        iE = e(d0aVar.m());
                        if (iE == 0) {
                            i5 = 8;
                        } else {
                            i5 = 16;
                        }
                        d0aVar.N(i5);
                        jB2 = d0aVar.B();
                        i6 = d0aVar.b;
                        if (iE == 0) {
                            i7 = 4;
                        } else {
                            i7 = 8;
                        }
                        arrayList = arrayList5;
                        i8 = 0;
                        while (true) {
                            if (i8 < i7) {
                                d0aVar.N(i7);
                                break;
                            }
                            i13 = i8;
                            i14 = iE;
                            if (d0aVar.a[i6 + i13] != -1) {
                                if (i14 == 0) {
                                    jF = d0aVar.B();
                                } else {
                                    jF = d0aVar.F();
                                }
                                if (jF != 0) {
                                    String str6 = pqf.a;
                                    jN = pqf.N(jF, 1000000L, jB2, RoundingMode.DOWN);
                                }
                                break;
                            }
                            arrayList6 = arrayList6;
                            i8 = i13 + 1;
                            iE = i14;
                        }
                        j6 = jN;
                        int iG2 = d0aVar.G();
                        char c2 = (char) (((iG2 >> 10) & 31) + 96);
                        char c3 = (char) (((iG2 >> 5) & 31) + 96);
                        char c4 = (char) ((iG2 & 31) + 96);
                        arrayList2 = arrayList6;
                        i9 = 3;
                        cArr = new char[]{c2, c3, c4};
                        i10 = 0;
                        while (true) {
                            if (i10 < i9) {
                                str = new String(cArr);
                                break;
                            }
                            c = cArr[i10];
                            i12 = i10;
                            if (c >= 'a' || c > 'z') {
                                str = null;
                                break;
                            }
                            i10 = i12 + 1;
                            i9 = 3;
                        }
                        n49VarG = m49VarE5.g(1937011556);
                        if (n49VarG == null) {
                            xo1.V("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                            m49Var3 = m49Var3;
                            str4 = "BoxParsers";
                        } else {
                            p90VarI = i(n49VarG.c, a31Var, str, xp4Var, z2);
                            m49VarE = m49Var3.e(1953654118);
                            if (m49VarE != null || (n49VarG2 = m49VarE.g(1667785072)) == null) {
                                iM = -1;
                            } else {
                                d0a d0aVar6 = n49VarG2.c;
                                d0aVar6.M(8);
                                if (d0aVar6.a() >= 4) {
                                    iM = d0aVar6.m();
                                } else {
                                    iM = -1;
                                }
                            }
                            if (!z || (m49VarE2 = m49Var3.e(1701082227)) == null) {
                                j6 = j6;
                                m49Var3 = m49Var3;
                                jN2 = jN2;
                                iM = iM;
                                str4 = "BoxParsers";
                            } else {
                                n49 n49VarG7 = m49VarE2.g(1701606260);
                                if (n49VarG7 == null) {
                                    pairCreate = null;
                                } else {
                                    d0a d0aVar7 = n49VarG7.c;
                                    d0aVar7.M(8);
                                    int iE4 = e(d0aVar7.m());
                                    int iD6 = d0aVar7.D();
                                    pa7.w(iD6, "Invalid initialCapacity: %s", iD6 >= 0);
                                    long[] jArr11 = new long[iD6];
                                    pa7.w(iD6, "Invalid initialCapacity: %s", iD6 >= 0);
                                    long[] jArrCopyOf2 = new long[iD6];
                                    int i65 = 0;
                                    long[] jArrCopyOf3 = jArr11;
                                    int i66 = 0;
                                    int i67 = 0;
                                    while (i66 < iD6) {
                                        long jF2 = iE4 == i61 ? d0aVar7.F() : d0aVar7.B();
                                        int i68 = i67 + 1;
                                        int i69 = i66;
                                        if (i68 > jArrCopyOf3.length) {
                                            int length = jArrCopyOf3.length;
                                            if (i68 < 0) {
                                                qc0.i("cannot store more than MAX_VALUE elements");
                                                return null;
                                            }
                                            int iHighestOneBit = length + (length >> 1) + 1;
                                            if (iHighestOneBit < i68) {
                                                iHighestOneBit = Integer.highestOneBit(i67) << 1;
                                            }
                                            if (iHighestOneBit < 0) {
                                                iHighestOneBit = Integer.MAX_VALUE;
                                            }
                                            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, iHighestOneBit);
                                        }
                                        long[] jArr12 = jArrCopyOf3;
                                        jArrCopyOf3[i67] = jF2;
                                        int i70 = i67 + 1;
                                        int i71 = i65 + 1;
                                        long jT = iE4 == 1 ? d0aVar7.t() : d0aVar7.m();
                                        if (i71 > jArrCopyOf2.length) {
                                            int length2 = jArrCopyOf2.length;
                                            if (i71 < 0) {
                                                qc0.i("cannot store more than MAX_VALUE elements");
                                                return null;
                                            }
                                            int iHighestOneBit2 = length2 + (length2 >> 1) + 1;
                                            if (iHighestOneBit2 < i71) {
                                                iHighestOneBit2 = Integer.highestOneBit(i65) << 1;
                                            }
                                            if (iHighestOneBit2 < 0) {
                                                iHighestOneBit2 = Integer.MAX_VALUE;
                                            }
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, iHighestOneBit2);
                                        }
                                        long[] jArr13 = jArrCopyOf2;
                                        jArrCopyOf2[i65] = jT;
                                        i65++;
                                        if (d0aVar7.w() != 1) {
                                            qc0.j("Unsupported media rate.");
                                            return null;
                                        }
                                        d0aVar7.N(2);
                                        jArrCopyOf2 = jArr13;
                                        i66 = i69 + 1;
                                        jArrCopyOf3 = jArr12;
                                        i67 = i70;
                                        i61 = 1;
                                    }
                                    ky6 ky6Var5 = ky6.a;
                                    ky6 ky6Var6 = i67 == 0 ? ky6Var5 : new ky6(jArrCopyOf3, i67);
                                    if (i65 != 0) {
                                        ky6Var5 = new ky6(jArrCopyOf2, i65);
                                    }
                                    pairCreate = Pair.create(ky6Var6, ky6Var5);
                                }
                                if (pairCreate != null) {
                                    ky6Var2 = (ky6) pairCreate.first;
                                    ky6Var = (ky6) pairCreate.second;
                                }
                                rr5Var = (rr5) p90VarI.e;
                                if (rr5Var != null) {
                                    i11 = a31Var.b;
                                    if (i11 != 0) {
                                        l49Var = new l49(i11);
                                        qr5 qr5VarA = rr5Var.a();
                                        su8Var = ((rr5) p90VarI.e).m;
                                        if (su8Var != null) {
                                            su8Var2 = su8Var.a(l49Var);
                                        } else {
                                            su8Var2 = new su8(l49Var);
                                        }
                                        qr5VarA.l = su8Var2;
                                        rr5Var = new rr5(qr5VarA);
                                    }
                                    boolean z15 = !Objects.equals(rr5Var.p, "text/x-unknown");
                                    c1f c1fVar = new c1f();
                                    c1fVar.m = true;
                                    c1fVar.n = -1;
                                    c1fVar.a = a31Var.a;
                                    c1fVar.b = i;
                                    c1fVar.c = jB2;
                                    c1fVar.d = j5;
                                    c1fVar.e = jN2;
                                    c1fVar.f = j6;
                                    c1fVar.g = rr5Var;
                                    c1fVar.h = p90VarI.c;
                                    c1fVar.i = (f1f[]) ((f1f[]) p90VarI.d).clone();
                                    c1fVar.j = p90VarI.b;
                                    c1fVar.k = ky6Var2;
                                    c1fVar.l = ky6Var;
                                    c1fVar.m = z15;
                                    c1fVar.n = iM;
                                    c1fVar.g.getClass();
                                    d1fVar = new d1f(c1fVar);
                                    i26Var = i26Var;
                                }
                            }
                            ky6Var = null;
                            ky6Var2 = null;
                            rr5Var = (rr5) p90VarI.e;
                            if (rr5Var != null) {
                                i11 = a31Var.b;
                                if (i11 != 0) {
                                    l49Var = new l49(i11);
                                    qr5 qr5VarA2 = rr5Var.a();
                                    su8Var = ((rr5) p90VarI.e).m;
                                    if (su8Var != null) {
                                        su8Var2 = su8Var.a(l49Var);
                                    } else {
                                        su8Var2 = new su8(l49Var);
                                    }
                                    qr5VarA2.l = su8Var2;
                                    rr5Var = new rr5(qr5VarA2);
                                }
                                boolean z16 = !Objects.equals(rr5Var.p, "text/x-unknown");
                                c1f c1fVar2 = new c1f();
                                c1fVar2.m = true;
                                c1fVar2.n = -1;
                                c1fVar2.a = a31Var.a;
                                c1fVar2.b = i;
                                c1fVar2.c = jB2;
                                c1fVar2.d = j5;
                                c1fVar2.e = jN2;
                                c1fVar2.f = j6;
                                c1fVar2.g = rr5Var;
                                c1fVar2.h = p90VarI.c;
                                c1fVar2.i = (f1f[]) ((f1f[]) p90VarI.d).clone();
                                c1fVar2.j = p90VarI.b;
                                c1fVar2.k = ky6Var2;
                                c1fVar2.l = ky6Var;
                                c1fVar2.m = z16;
                                c1fVar2.n = iM;
                                c1fVar2.g.getClass();
                                d1fVar = new d1f(c1fVar2);
                                i26Var = i26Var;
                            }
                        }
                        d1fVar = null;
                    }
                    i4 = i3;
                    d0aVar5.N(16);
                    short sW3 = d0aVar5.w();
                    d0aVar5.N(2);
                    short sW4 = d0aVar5.w();
                    if ((((long) iM5) * ((long) iM8)) - (((long) iM6) * ((long) iM7)) < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    a31Var = new a31(iM4, jB, iG, i4, z4, sW3, sW4);
                    if (j == -9223372036854775807L) {
                        j3 = jB;
                    } else {
                        j3 = j;
                    }
                    j4 = g(n49VarG3.c).c;
                    if (j3 == -9223372036854775807L) {
                        j5 = j4;
                        jN2 = -9223372036854775807L;
                    } else {
                        String str7 = pqf.a;
                        jN2 = pqf.N(j3, 1000000L, j4, RoundingMode.DOWN);
                        j5 = j4;
                    }
                    m49 m49VarE6 = m49VarE3.e(1835626086);
                    m49VarE6.getClass();
                    m49 m49VarE7 = m49VarE6.e(1937007212);
                    m49VarE7.getClass();
                    n49 n49VarG8 = m49VarE3.g(1835296868);
                    n49VarG8.getClass();
                    d0aVar = n49VarG8.c;
                    d0aVar.M(8);
                    iE = e(d0aVar.m());
                    if (iE == 0) {
                        i5 = 8;
                    } else {
                        i5 = 16;
                    }
                    d0aVar.N(i5);
                    jB2 = d0aVar.B();
                    i6 = d0aVar.b;
                    if (iE == 0) {
                        i7 = 4;
                    } else {
                        i7 = 8;
                    }
                    arrayList = arrayList5;
                    i8 = 0;
                    while (true) {
                        if (i8 < i7) {
                            d0aVar.N(i7);
                            break;
                        }
                        i13 = i8;
                        i14 = iE;
                        if (d0aVar.a[i6 + i13] != -1) {
                            if (i14 == 0) {
                                jF = d0aVar.B();
                            } else {
                                jF = d0aVar.F();
                            }
                            if (jF != 0) {
                                String str8 = pqf.a;
                                jN = pqf.N(jF, 1000000L, jB2, RoundingMode.DOWN);
                            }
                            break;
                            break;
                        }
                        arrayList6 = arrayList6;
                        i8 = i13 + 1;
                        iE = i14;
                    }
                    j6 = jN;
                    int iG3 = d0aVar.G();
                    char c5 = (char) (((iG3 >> 10) & 31) + 96);
                    char c6 = (char) (((iG3 >> 5) & 31) + 96);
                    char c7 = (char) ((iG3 & 31) + 96);
                    arrayList2 = arrayList6;
                    i9 = 3;
                    cArr = new char[]{c5, c6, c7};
                    i10 = 0;
                    while (true) {
                        if (i10 < i9) {
                            str = new String(cArr);
                            break;
                        }
                        c = cArr[i10];
                        i12 = i10;
                        if (c >= 'a') {
                        }
                        str = null;
                        break;
                        i10 = i12 + 1;
                        i9 = 3;
                    }
                    n49VarG = m49VarE7.g(1937011556);
                    if (n49VarG == null) {
                        xo1.V("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        m49Var3 = m49Var3;
                        str4 = "BoxParsers";
                    } else {
                        p90VarI = i(n49VarG.c, a31Var, str, xp4Var, z2);
                        m49VarE = m49Var3.e(1953654118);
                        if (m49VarE != null) {
                            iM = -1;
                        } else {
                            iM = -1;
                        }
                        if (z) {
                            j6 = j6;
                            m49Var3 = m49Var3;
                            jN2 = jN2;
                            iM = iM;
                            str4 = "BoxParsers";
                            ky6Var = null;
                            ky6Var2 = null;
                        } else {
                            j6 = j6;
                            m49Var3 = m49Var3;
                            jN2 = jN2;
                            iM = iM;
                            str4 = "BoxParsers";
                            ky6Var = null;
                            ky6Var2 = null;
                        }
                        rr5Var = (rr5) p90VarI.e;
                        if (rr5Var != null) {
                            i11 = a31Var.b;
                            if (i11 != 0) {
                                l49Var = new l49(i11);
                                qr5 qr5VarA3 = rr5Var.a();
                                su8Var = ((rr5) p90VarI.e).m;
                                if (su8Var != null) {
                                    su8Var2 = su8Var.a(l49Var);
                                } else {
                                    su8Var2 = new su8(l49Var);
                                }
                                qr5VarA3.l = su8Var2;
                                rr5Var = new rr5(qr5VarA3);
                            }
                            boolean z17 = !Objects.equals(rr5Var.p, "text/x-unknown");
                            c1f c1fVar3 = new c1f();
                            c1fVar3.m = true;
                            c1fVar3.n = -1;
                            c1fVar3.a = a31Var.a;
                            c1fVar3.b = i;
                            c1fVar3.c = jB2;
                            c1fVar3.d = j5;
                            c1fVar3.e = jN2;
                            c1fVar3.f = j6;
                            c1fVar3.g = rr5Var;
                            c1fVar3.h = p90VarI.c;
                            c1fVar3.i = (f1f[]) ((f1f[]) p90VarI.d).clone();
                            c1fVar3.j = p90VarI.b;
                            c1fVar3.k = ky6Var2;
                            c1fVar3.l = ky6Var;
                            c1fVar3.m = z17;
                            c1fVar3.n = iM;
                            c1fVar3.g.getClass();
                            d1fVar = new d1f(c1fVar3);
                            i26Var = i26Var;
                        }
                    }
                    d1fVar = null;
                }
                d1f d1fVar2 = (d1f) i26Var.apply(d1fVar);
                if (d1fVar2 == null) {
                    arrayList2 = arrayList2;
                } else {
                    rr5 rr5Var4 = d1fVar2.g;
                    m49 m49VarE8 = m49Var3.e(1835297121);
                    m49VarE8.getClass();
                    m49 m49VarE9 = m49VarE8.e(1835626086);
                    m49VarE9.getClass();
                    m49 m49VarE10 = m49VarE9.e(1937007212);
                    m49VarE10.getClass();
                    n49 n49VarG9 = m49VarE10.g(1937011578);
                    if (n49VarG9 != null) {
                        er0Var = new yl9(n49VarG9, rr5Var4);
                    } else {
                        n49 n49VarG10 = m49VarE10.g(1937013298);
                        if (n49VarG10 == null) {
                            throw l0a.a(null, "Track has no sample table size information");
                        }
                        er0Var = new er0(n49VarG10);
                    }
                    int iQ = er0Var.q();
                    if (iQ == 0) {
                        n1fVar = new n1f(d1fVar2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (d1fVar2.b == 2) {
                            long j20 = d1fVar2.f;
                            if (j20 > j2) {
                                float f = iQ / (j20 / 1000000.0f);
                                qr5 qr5VarA4 = rr5Var4.a();
                                pa7.A(f == -1.0f || f > 0.0f);
                                qr5VarA4.A = f;
                                rr5 rr5Var5 = new rr5(qr5VarA4);
                                c1f c1fVarA = d1fVar2.a();
                                c1fVarA.g = rr5Var5;
                                d1fVar2 = new d1f(c1fVarA);
                            }
                        }
                        rr5 rr5Var6 = d1fVar2.g;
                        n49 n49VarG11 = m49VarE10.g(1937007471);
                        if (n49VarG11 == null) {
                            n49VarG11 = m49VarE10.g(1668232756);
                            n49VarG11.getClass();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        d0a d0aVar8 = n49VarG11.c;
                        n49 n49VarG12 = m49VarE10.g(1937011555);
                        n49VarG12.getClass();
                        d0a d0aVar9 = n49VarG12.c;
                        n49 n49VarG13 = m49VarE10.g(1937011827);
                        n49VarG13.getClass();
                        d0a d0aVar10 = n49VarG13.c;
                        n49 n49VarG14 = m49VarE10.g(1937011571);
                        d0a d0aVar11 = n49VarG14 != null ? n49VarG14.c : null;
                        n49 n49VarG15 = m49VarE10.g(1668576371);
                        d0a d0aVar12 = n49VarG15 != null ? n49VarG15.c : null;
                        x21 x21Var = new x21(d0aVar9, d0aVar8, z5);
                        d0aVar10.M(12);
                        int iD7 = d0aVar10.D() - 1;
                        int iD8 = d0aVar10.D();
                        int iD9 = d0aVar10.D();
                        if (d0aVar12 != null) {
                            d0aVar12.M(12);
                            iD = d0aVar12.D();
                        } else {
                            iD = 0;
                        }
                        if (d0aVar11 != null) {
                            d0aVar11.M(12);
                            iD2 = d0aVar11.D();
                            if (iD2 > 0) {
                                iD3 = d0aVar11.D() - 1;
                            } else {
                                d0aVar11 = null;
                            }
                            iH = er0Var.h();
                            String str9 = rr5Var6.p;
                            if (iH == -1 && (("audio/raw".equals(str9) || "audio/g711-mlaw".equals(str9) || "audio/g711-alaw".equals(str9)) && iD7 == 0 && iD == 0 && iD2 == 0)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            arrayList3 = new ArrayList();
                            if (d0aVar11 == null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z6) {
                                i49 = x21Var.a;
                                jArr10 = new long[i49];
                                iArr13 = new int[i49];
                                while (x21Var.a()) {
                                    int i72 = x21Var.b;
                                    jArr10[i72] = x21Var.d;
                                    iArr13[i72] = x21Var.c;
                                }
                                j18 = iD9;
                                i50 = UserMetadata.MAX_INTERNAL_KEY_SIZE / iH;
                                iE2 = 0;
                                for (i51 = 0; i51 < i49; i51++) {
                                    iE2 += pqf.e(iArr13[i51], i50);
                                }
                                jArr3 = new long[iE2];
                                iArr14 = new int[iE2];
                                jArrCopyOf = new long[iE2];
                                iArrCopyOf2 = new int[iE2];
                                i52 = 0;
                                i53 = 0;
                                i54 = 0;
                                i55 = 0;
                                i56 = 0;
                                while (i53 < i49) {
                                    int i73 = iArr13[i53];
                                    j19 = jArr10[i53];
                                    int i74 = i56;
                                    int i75 = i49;
                                    iMax = i55;
                                    i57 = i74;
                                    i58 = i52;
                                    i59 = i73;
                                    while (i59 > 0) {
                                        int iMin = Math.min(i50, i59);
                                        jArr3[i57] = j19;
                                        int i76 = i59;
                                        int i77 = iH * iMin;
                                        iArr14[i57] = i77;
                                        i58 += i77;
                                        iMax = Math.max(iMax, i77);
                                        long j21 = j18;
                                        jArrCopyOf[i57] = j21 * ((long) i54);
                                        iArrCopyOf2[i57] = 1;
                                        j19 += (long) iArr14[i57];
                                        i54 += iMin;
                                        i59 = i76 - iMin;
                                        i57++;
                                        iArr13 = iArr13;
                                        j18 = j21;
                                    }
                                    i53++;
                                    int i78 = i57;
                                    i55 = iMax;
                                    i49 = i75;
                                    i56 = i78;
                                    i52 = i58;
                                }
                                long j22 = j18 * ((long) i54);
                                j11 = i52;
                                if (z3) {
                                    jArr3 = new long[0];
                                }
                                if (z3) {
                                    iArr14 = new int[0];
                                }
                                if (z3) {
                                    jArrCopyOf = new long[0];
                                }
                                if (z3) {
                                    iArrCopyOf2 = new int[0];
                                }
                                j10 = j22;
                                i22 = iE2;
                                iArr2 = iArr14;
                                i23 = i55;
                                arrayList3 = arrayList3;
                            } else {
                                if (z3) {
                                    jArr = new long[0];
                                } else {
                                    jArr = new long[iQ];
                                }
                                d0aVar2 = d0aVar12;
                                if (z3) {
                                    iArrCopyOf = new int[0];
                                } else {
                                    iArrCopyOf = new int[iQ];
                                }
                                z21Var = er0Var;
                                if (z3) {
                                    jArr2 = new long[0];
                                } else {
                                    jArr2 = new long[iQ];
                                }
                                int i79 = iD2;
                                if (z3) {
                                    iArr = new int[0];
                                } else {
                                    iArr = new int[iQ];
                                }
                                d0aVar3 = d0aVar11;
                                i15 = iD;
                                i16 = i79;
                                j7 = j2;
                                j8 = j7;
                                j9 = j8;
                                iQ = 0;
                                iM2 = 0;
                                i17 = 0;
                                i18 = 0;
                                iD4 = 0;
                                while (true) {
                                    if (iQ < iQ) {
                                        i19 = iD7;
                                        i20 = iD8;
                                        str2 = str4;
                                        jArrCopyOf = jArr2;
                                        jArr3 = jArr;
                                        i21 = i18;
                                        iArrCopyOf2 = iArr;
                                        break;
                                    }
                                    j12 = j9;
                                    i24 = i18;
                                    zA = true;
                                    while (i24 == 0) {
                                        zA = x21Var.a();
                                        if (zA) {
                                            break;
                                        }
                                        int i80 = iD7;
                                        long j23 = x21Var.d;
                                        i24 = x21Var.c;
                                        j12 = j23;
                                        iD7 = i80;
                                        iD8 = iD8;
                                        iQ = iQ;
                                    }
                                    i25 = iQ;
                                    i19 = iD7;
                                    i20 = iD8;
                                    if (!zA) {
                                        str2 = str4;
                                        xo1.V(str2, "Unexpected end of chunk data");
                                        if (z3) {
                                            jArrCopyOf = jArr2;
                                            iArrCopyOf2 = iArr;
                                            jArr3 = jArr;
                                        } else {
                                            long[] jArrCopyOf4 = Arrays.copyOf(jArr, iQ);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iQ);
                                            jArr3 = jArrCopyOf4;
                                            jArrCopyOf = Arrays.copyOf(jArr2, iQ);
                                            iArrCopyOf2 = Arrays.copyOf(iArr, iQ);
                                        }
                                        i21 = i24;
                                        break;
                                    }
                                    String str10 = str4;
                                    if (d0aVar2 != null) {
                                        while (iD4 == 0 && i15 > 0) {
                                            iD4 = d0aVar2.D();
                                            iM2 = d0aVar2.m();
                                            i15--;
                                        }
                                        iD4--;
                                    }
                                    iR = z21Var.r();
                                    jArr4 = jArr2;
                                    iArr3 = iArr;
                                    j13 = iR;
                                    j8 += j13;
                                    if (iR > i17) {
                                        i17 = iR;
                                    }
                                    if (z3) {
                                        j14 = j13;
                                    } else {
                                        jArr[iQ] = j12;
                                        iArrCopyOf[iQ] = iR;
                                        j14 = j13;
                                        jArr4[iQ] = j7 + ((long) iM2);
                                        if (d0aVar3 == null) {
                                            i26 = 1;
                                        } else {
                                            i26 = 0;
                                        }
                                        iArr3[iQ] = i26;
                                        if (iQ == iD3) {
                                            iArr3[iQ] = 1;
                                            arrayList3.add(Integer.valueOf(iQ));
                                        }
                                    }
                                    if (d0aVar3 != null && iQ == iD3 && (i16 = i16 - 1) > 0) {
                                        iD3 = d0aVar3.D() - 1;
                                    }
                                    j7 += (long) iD9;
                                    iD5 = i20 - 1;
                                    if (iD5 != 0 && i19 > 0) {
                                        iD5 = d0aVar10.D();
                                        iD9 = d0aVar10.m();
                                        i19--;
                                    }
                                    i18 = i24 - 1;
                                    iQ++;
                                    j9 = j12 + j14;
                                    jArr2 = jArr4;
                                    iArr = iArr3;
                                    iD8 = iD5;
                                    str4 = str10;
                                    iD7 = i19;
                                    iQ = i25;
                                }
                                long j24 = j7 + ((long) iM2);
                                if (d0aVar2 != null) {
                                    z8 = true;
                                    break;
                                }
                                while (true) {
                                    if (i15 > 0) {
                                        z8 = true;
                                        break;
                                    }
                                    if (d0aVar2.D() != 0) {
                                        z8 = false;
                                        break;
                                    }
                                    d0aVar2.m();
                                    i15--;
                                }
                                if (i16 == 0 || i20 != 0 || i21 != 0 || i19 != 0 || iD4 != 0 || !z8) {
                                    StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                    ub3.u(sb, d1fVar2.a, ": remainingSynchronizationSamples ", i16, ", remainingSamplesAtTimestampDelta ");
                                    ub3.u(sb, i20, ", remainingSamplesInChunk ", i21, ", remainingTimestampDeltaChanges ");
                                    sb.append(i19);
                                    sb.append(", remainingSamplesAtTimestampOffset ");
                                    sb.append(iD4);
                                    if (z8) {
                                        str3 = "";
                                    } else {
                                        str3 = ", ctts invalid";
                                    }
                                    sb.append(str3);
                                    xo1.V(str2, sb.toString());
                                }
                                i22 = iQ;
                                j10 = j24;
                                i23 = i17;
                                iArr2 = iArrCopyOf;
                                j11 = j8;
                            }
                            jArr5 = jArr3;
                            iArr4 = iArrCopyOf2;
                            j15 = d1fVar2.f;
                            if (j15 > j2) {
                                jN7 = pqf.N(8 * j11, 1000000L, j15, RoundingMode.HALF_DOWN);
                                if (jN7 > j2 && jN7 < 2147483647L) {
                                    qr5 qr5VarA5 = rr5Var6.a();
                                    qr5VarA5.i = (int) jN7;
                                    rr5 rr5Var7 = new rr5(qr5VarA5);
                                    c1f c1fVarA2 = d1fVar2.a();
                                    c1fVarA2.g = rr5Var7;
                                    d1fVar2 = new d1f(c1fVarA2);
                                }
                            }
                            i27 = d1fVar2.b;
                            j16 = d1fVar2.c;
                            rr5Var2 = d1fVar2.g;
                            ky6Var3 = d1fVar2.j;
                            ky6Var4 = d1fVar2.i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jN3 = pqf.N(j10, 1000000L, j16, roundingMode);
                            iArrZ = rxg.Z(arrayList3);
                            if (ky6Var4 == null) {
                                if (!z3) {
                                    pqf.M(jArrCopyOf, j16);
                                }
                                n1fVar2 = new n1f(d1fVar2, jArr5, iArr2, i23, jArrCopyOf, iArr4, iArrZ, z7, jN3, i22);
                            } else {
                                jArr6 = jArrCopyOf;
                                if (z3) {
                                    ky6Var3.getClass();
                                    if (ky6Var4.b() == 1 || ky6Var4.a(0) != j2) {
                                        jA5 = j2;
                                        for (i48 = 0; i48 < ky6Var4.b(); i48++) {
                                            if (ky6Var3.a(i48) != -1) {
                                                jA5 = ky6Var4.a(i48) + jA5;
                                            }
                                        }
                                        jN6 = pqf.N(jA5, 1000000L, d1fVar2.d, RoundingMode.DOWN);
                                    } else {
                                        jN6 = pqf.N(j10 - ky6Var3.a(0), 1000000L, d1fVar2.c, roundingMode);
                                    }
                                    n1fVar2 = new n1f(d1fVar2, jArr5, iArr2, i23, jArr6, iArr4, iArrZ, z7, jN6, i22);
                                } else {
                                    if (ky6Var4.b() == 1 || i27 != 1 || jArr6.length < 2) {
                                        j17 = -1;
                                    } else {
                                        ky6Var3.getClass();
                                        long jA6 = ky6Var3.a(0);
                                        j17 = -1;
                                        long jN8 = pqf.N(ky6Var4.a(0), d1fVar2.c, d1fVar2.d, roundingMode) + jA6;
                                        int length3 = jArr6.length - 1;
                                        int iH2 = pqf.h(4, 0, length3);
                                        int iH3 = pqf.h(jArr6.length - 4, 0, length3);
                                        if (jArr6[0] <= jA6 && jA6 < jArr6[iH2] && jArr6[iH3] < jN8 && jN8 <= j10 + 2) {
                                            long jMax = Math.max(j2, j10 - jN8);
                                            long jN9 = pqf.N(jA6 - jArr6[0], rr5Var2.L, d1fVar2.c, roundingMode);
                                            long jN10 = pqf.N(jMax, rr5Var2.L, d1fVar2.c, roundingMode);
                                            if ((jN9 != j2 || jN10 != j2) && jN9 <= 2147483647L && jN10 <= 2147483647L) {
                                                s46Var.a = (int) jN9;
                                                s46Var.b = (int) jN10;
                                                pqf.M(jArr6, j16);
                                                n1fVar2 = new n1f(d1fVar2, jArr5, iArr2, i23, jArr6, iArr4, iArrZ, z7, pqf.N(ky6Var4.a(0), 1000000L, d1fVar2.d, roundingMode), i22);
                                            }
                                        }
                                        arrayList2.add(n1fVar);
                                    }
                                    i28 = 1;
                                    if (ky6Var4.b() == 1) {
                                        if (ky6Var4.a(0) == 0) {
                                            ky6Var3.getClass();
                                            jA4 = ky6Var3.a(0);
                                            for (i47 = 0; i47 < jArr6.length; i47++) {
                                                jArr6[i47] = pqf.N(jArr6[i47] - jA4, 1000000L, d1fVar2.c, RoundingMode.DOWN);
                                            }
                                            n1fVar2 = new n1f(d1fVar2, jArr5, iArr2, i23, jArr6, iArr4, iArrZ, z7, pqf.N(j10 - jA4, 1000000L, d1fVar2.c, RoundingMode.DOWN), i22);
                                        } else {
                                            i28 = 1;
                                        }
                                    }
                                    jArr7 = jArr5;
                                    iArr5 = iArr2;
                                    i29 = i22;
                                    if (i27 == i28) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    iArr6 = new int[ky6Var4.b()];
                                    iArr7 = new int[ky6Var4.b()];
                                    ky6Var3.getClass();
                                    i30 = 0;
                                    i31 = 0;
                                    z10 = false;
                                    i32 = 0;
                                    while (i31 < ky6Var4.b()) {
                                        int[] iArr15 = iArr5;
                                        jA3 = ky6Var3.a(i31);
                                        if (jA3 != j17) {
                                            int i81 = i31;
                                            boolean z18 = z10;
                                            jN5 = pqf.N(ky6Var4.a(i31), d1fVar2.c, d1fVar2.d, RoundingMode.DOWN) + jA3;
                                            i39 = i81;
                                            iArr6[i39] = pqf.d(jArr6, jA3, true);
                                            int iA = pqf.a(jArr6, jN5, z9);
                                            i40 = iA - 1;
                                            i42 = 0;
                                            for (i41 = iA; i41 < jArr6.length; i41++) {
                                                if (jArr6[i41] >= jN5) {
                                                    i42++;
                                                    if (i42 > rr5Var2.r) {
                                                        break;
                                                    }
                                                } else {
                                                    i40 = i41;
                                                }
                                            }
                                            iArr7[i39] = i40 + 1;
                                            i43 = iArr6[i39];
                                            while (true) {
                                                i44 = iArr6[i39];
                                                if (i44 > 0 || (iArr4[i44] & 1) != 0) {
                                                    break;
                                                    break;
                                                }
                                                iArr6[i39] = i44 - 1;
                                            }
                                            if (i44 == 0 && (iArr4[0] & 1) == 0) {
                                                iArr6[i39] = i43;
                                                while (true) {
                                                    i46 = iArr6[i39];
                                                    if (i46 < iArr7[i39] || (iArr4[i46] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr6[i39] = i46 + 1;
                                                }
                                            }
                                            int i82 = iArr7[i39];
                                            i45 = iArr6[i39];
                                            int i83 = (i82 - i45) + i32;
                                            if (i30 != i45) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            z10 = z18 | z14;
                                            i32 = i83;
                                            i30 = i82;
                                        } else {
                                            i39 = i31;
                                        }
                                        i31 = i39 + 1;
                                        z9 = z9;
                                        iArr5 = iArr15;
                                    }
                                    iArr8 = iArr5;
                                    boolean z19 = z10;
                                    if (i32 != i29) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    z12 = z19 | z11;
                                    if (z12) {
                                        jArr8 = new long[i32];
                                    } else {
                                        jArr8 = jArr7;
                                    }
                                    if (z12) {
                                        iArr9 = new int[i32];
                                    } else {
                                        iArr9 = iArr8;
                                    }
                                    if (z12) {
                                        i23 = 0;
                                    }
                                    if (z12) {
                                        iArr10 = new int[i32];
                                    } else {
                                        iArr10 = iArr4;
                                    }
                                    if (z12) {
                                        arrayList4 = new ArrayList();
                                    } else {
                                        arrayList4 = arrayList3;
                                    }
                                    jArr9 = new long[i32];
                                    i33 = 0;
                                    z13 = false;
                                    i34 = 0;
                                    jA = 0;
                                    while (i33 < ky6Var4.b()) {
                                        jA2 = ky6Var3.a(i33);
                                        i35 = iArr6[i33];
                                        rr5 rr5Var8 = rr5Var2;
                                        i36 = iArr7[i33];
                                        if (z12) {
                                            int i84 = i36 - i35;
                                            System.arraycopy(jArr7, i35, jArr8, i34, i84);
                                            iArr11 = iArr8;
                                            System.arraycopy(iArr11, i35, iArr9, i34, i84);
                                            System.arraycopy(iArr4, i35, iArr10, i34, i84);
                                        } else {
                                            iArr11 = iArr8;
                                        }
                                        i37 = i23;
                                        while (i35 < i36) {
                                            i38 = i35;
                                            iArr12 = iArr11;
                                            long j25 = d1fVar2.d;
                                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                                            long jN11 = pqf.N(jA, 1000000L, j25, roundingMode2);
                                            jN4 = pqf.N(jArr6[i38] - jA2, 1000000L, d1fVar2.c, roundingMode2);
                                            if (jN4 < 0) {
                                                z13 = true;
                                            }
                                            jArr9[i34] = jN11 + jN4;
                                            if (z12 && iArr9[i34] > i37) {
                                                i37 = iArr12[i38];
                                            }
                                            if (!z12 && !z7 && (iArr10[i34] & 1) != 0) {
                                                arrayList4.add(Integer.valueOf(i34));
                                            }
                                            i34++;
                                            i35 = i38 + 1;
                                            iArr11 = iArr12;
                                        }
                                        iArr8 = iArr11;
                                        jA = ky6Var4.a(i33) + jA;
                                        i33++;
                                        i23 = i37;
                                        rr5Var2 = rr5Var8;
                                        ky6Var3 = ky6Var3;
                                        jArr7 = jArr7;
                                    }
                                    rr5Var3 = rr5Var2;
                                    long jN12 = pqf.N(jA, 1000000L, d1fVar2.d, RoundingMode.DOWN);
                                    if (z13) {
                                        qr5 qr5VarA6 = rr5Var3.a();
                                        qr5VarA6.u = true;
                                        rr5 rr5Var9 = new rr5(qr5VarA6);
                                        c1f c1fVarA3 = d1fVar2.a();
                                        c1fVarA3.g = rr5Var9;
                                        d1fVar2 = new d1f(c1fVarA3);
                                    }
                                    n1f n1fVar3 = new n1f(d1fVar2, jArr8, iArr9, i23, jArr9, iArr10, rxg.Z(arrayList4), z7, jN12, jArr8.length);
                                    arrayList2 = arrayList2;
                                    n1fVar = n1fVar3;
                                    arrayList2.add(n1fVar);
                                }
                            }
                            n1fVar = n1fVar2;
                        } else {
                            iD2 = 0;
                        }
                        iD3 = -1;
                        iH = er0Var.h();
                        String str11 = rr5Var6.p;
                        if (iH == -1) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        arrayList3 = new ArrayList();
                        if (d0aVar11 == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z6) {
                            i49 = x21Var.a;
                            jArr10 = new long[i49];
                            iArr13 = new int[i49];
                            while (x21Var.a()) {
                                int i710 = x21Var.b;
                                jArr10[i710] = x21Var.d;
                                iArr13[i710] = x21Var.c;
                            }
                            j18 = iD9;
                            i50 = UserMetadata.MAX_INTERNAL_KEY_SIZE / iH;
                            iE2 = 0;
                            while (i51 < i49) {
                                iE2 += pqf.e(iArr13[i51], i50);
                            }
                            jArr3 = new long[iE2];
                            iArr14 = new int[iE2];
                            jArrCopyOf = new long[iE2];
                            iArrCopyOf2 = new int[iE2];
                            i52 = 0;
                            i53 = 0;
                            i54 = 0;
                            i55 = 0;
                            i56 = 0;
                            while (i53 < i49) {
                                int i711 = iArr13[i53];
                                j19 = jArr10[i53];
                                int i712 = i56;
                                int i713 = i49;
                                iMax = i55;
                                i57 = i712;
                                i58 = i52;
                                i59 = i711;
                                while (i59 > 0) {
                                    int iMin2 = Math.min(i50, i59);
                                    jArr3[i57] = j19;
                                    int i714 = i59;
                                    int i715 = iH * iMin2;
                                    iArr14[i57] = i715;
                                    i58 += i715;
                                    iMax = Math.max(iMax, i715);
                                    long j26 = j18;
                                    jArrCopyOf[i57] = j26 * ((long) i54);
                                    iArrCopyOf2[i57] = 1;
                                    j19 += (long) iArr14[i57];
                                    i54 += iMin2;
                                    i59 = i714 - iMin2;
                                    i57++;
                                    iArr13 = iArr13;
                                    j18 = j26;
                                }
                                i53++;
                                int i716 = i57;
                                i55 = iMax;
                                i49 = i713;
                                i56 = i716;
                                i52 = i58;
                            }
                            long j27 = j18 * ((long) i54);
                            j11 = i52;
                            if (z3) {
                                jArr3 = new long[0];
                            }
                            if (z3) {
                                iArr14 = new int[0];
                            }
                            if (z3) {
                                jArrCopyOf = new long[0];
                            }
                            if (z3) {
                                iArrCopyOf2 = new int[0];
                            }
                            j10 = j27;
                            i22 = iE2;
                            iArr2 = iArr14;
                            i23 = i55;
                            arrayList3 = arrayList3;
                        } else {
                            if (z3) {
                                jArr = new long[0];
                            } else {
                                jArr = new long[iQ];
                            }
                            d0aVar2 = d0aVar12;
                            if (z3) {
                                iArrCopyOf = new int[0];
                            } else {
                                iArrCopyOf = new int[iQ];
                            }
                            z21Var = er0Var;
                            if (z3) {
                                jArr2 = new long[0];
                            } else {
                                jArr2 = new long[iQ];
                            }
                            int i717 = iD2;
                            if (z3) {
                                iArr = new int[0];
                            } else {
                                iArr = new int[iQ];
                            }
                            d0aVar3 = d0aVar11;
                            i15 = iD;
                            i16 = i717;
                            j7 = j2;
                            j8 = j7;
                            j9 = j8;
                            iQ = 0;
                            iM2 = 0;
                            i17 = 0;
                            i18 = 0;
                            iD4 = 0;
                            while (true) {
                                if (iQ < iQ) {
                                    i19 = iD7;
                                    i20 = iD8;
                                    str2 = str4;
                                    jArrCopyOf = jArr2;
                                    jArr3 = jArr;
                                    i21 = i18;
                                    iArrCopyOf2 = iArr;
                                    break;
                                }
                                j12 = j9;
                                i24 = i18;
                                zA = true;
                                while (i24 == 0) {
                                    zA = x21Var.a();
                                    if (zA) {
                                        break;
                                        break;
                                    }
                                    int i85 = iD7;
                                    long j28 = x21Var.d;
                                    i24 = x21Var.c;
                                    j12 = j28;
                                    iD7 = i85;
                                    iD8 = iD8;
                                    iQ = iQ;
                                }
                                i25 = iQ;
                                i19 = iD7;
                                i20 = iD8;
                                if (!zA) {
                                    str2 = str4;
                                    xo1.V(str2, "Unexpected end of chunk data");
                                    if (z3) {
                                        long[] jArrCopyOf5 = Arrays.copyOf(jArr, iQ);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iQ);
                                        jArr3 = jArrCopyOf5;
                                        jArrCopyOf = Arrays.copyOf(jArr2, iQ);
                                        iArrCopyOf2 = Arrays.copyOf(iArr, iQ);
                                    } else {
                                        jArrCopyOf = jArr2;
                                        iArrCopyOf2 = iArr;
                                        jArr3 = jArr;
                                    }
                                    i21 = i24;
                                    break;
                                }
                                String str12 = str4;
                                if (d0aVar2 != null) {
                                    while (iD4 == 0) {
                                        iD4 = d0aVar2.D();
                                        iM2 = d0aVar2.m();
                                        i15--;
                                    }
                                    iD4--;
                                }
                                iR = z21Var.r();
                                jArr4 = jArr2;
                                iArr3 = iArr;
                                j13 = iR;
                                j8 += j13;
                                if (iR > i17) {
                                    i17 = iR;
                                }
                                if (z3) {
                                    jArr[iQ] = j12;
                                    iArrCopyOf[iQ] = iR;
                                    j14 = j13;
                                    jArr4[iQ] = j7 + ((long) iM2);
                                    if (d0aVar3 == null) {
                                        i26 = 1;
                                    } else {
                                        i26 = 0;
                                    }
                                    iArr3[iQ] = i26;
                                    if (iQ == iD3) {
                                        iArr3[iQ] = 1;
                                        arrayList3.add(Integer.valueOf(iQ));
                                    }
                                } else {
                                    j14 = j13;
                                }
                                if (d0aVar3 != null) {
                                    iD3 = d0aVar3.D() - 1;
                                }
                                j7 += (long) iD9;
                                iD5 = i20 - 1;
                                if (iD5 != 0) {
                                }
                                i18 = i24 - 1;
                                iQ++;
                                j9 = j12 + j14;
                                jArr2 = jArr4;
                                iArr = iArr3;
                                iD8 = iD5;
                                str4 = str12;
                                iD7 = i19;
                                iQ = i25;
                            }
                            long j29 = j7 + ((long) iM2);
                            if (d0aVar2 != null) {
                                z8 = true;
                                break;
                            }
                            while (true) {
                                if (i15 > 0) {
                                    z8 = true;
                                    break;
                                }
                                if (d0aVar2.D() != 0) {
                                    z8 = false;
                                    break;
                                }
                                d0aVar2.m();
                                i15--;
                            }
                            if (i16 == 0) {
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                ub3.u(sb2, d1fVar2.a, ": remainingSynchronizationSamples ", i16, ", remainingSamplesAtTimestampDelta ");
                                ub3.u(sb2, i20, ", remainingSamplesInChunk ", i21, ", remainingTimestampDeltaChanges ");
                                sb2.append(i19);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(iD4);
                                if (z8) {
                                    str3 = ", ctts invalid";
                                } else {
                                    str3 = "";
                                }
                                sb2.append(str3);
                                xo1.V(str2, sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                ub3.u(sb3, d1fVar2.a, ": remainingSynchronizationSamples ", i16, ", remainingSamplesAtTimestampDelta ");
                                ub3.u(sb3, i20, ", remainingSamplesInChunk ", i21, ", remainingTimestampDeltaChanges ");
                                sb3.append(i19);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(iD4);
                                if (z8) {
                                    str3 = ", ctts invalid";
                                } else {
                                    str3 = "";
                                }
                                sb3.append(str3);
                                xo1.V(str2, sb3.toString());
                            }
                            i22 = iQ;
                            j10 = j29;
                            i23 = i17;
                            iArr2 = iArrCopyOf;
                            j11 = j8;
                        }
                        jArr5 = jArr3;
                        iArr4 = iArrCopyOf2;
                        j15 = d1fVar2.f;
                        if (j15 > j2) {
                            jN7 = pqf.N(8 * j11, 1000000L, j15, RoundingMode.HALF_DOWN);
                            if (jN7 > j2) {
                                qr5 qr5VarA7 = rr5Var6.a();
                                qr5VarA7.i = (int) jN7;
                                rr5 rr5Var10 = new rr5(qr5VarA7);
                                c1f c1fVarA4 = d1fVar2.a();
                                c1fVarA4.g = rr5Var10;
                                d1fVar2 = new d1f(c1fVarA4);
                            }
                        }
                        i27 = d1fVar2.b;
                        j16 = d1fVar2.c;
                        rr5Var2 = d1fVar2.g;
                        ky6Var3 = d1fVar2.j;
                        ky6Var4 = d1fVar2.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        jN3 = pqf.N(j10, 1000000L, j16, roundingMode3);
                        iArrZ = rxg.Z(arrayList3);
                        if (ky6Var4 == null) {
                            if (!z3) {
                                pqf.M(jArrCopyOf, j16);
                            }
                            n1fVar2 = new n1f(d1fVar2, jArr5, iArr2, i23, jArrCopyOf, iArr4, iArrZ, z7, jN3, i22);
                        } else {
                            jArr6 = jArrCopyOf;
                            if (z3) {
                                ky6Var3.getClass();
                                if (ky6Var4.b() == 1) {
                                    jA5 = j2;
                                    while (i48 < ky6Var4.b()) {
                                        if (ky6Var3.a(i48) != -1) {
                                            jA5 = ky6Var4.a(i48) + jA5;
                                        }
                                    }
                                    jN6 = pqf.N(jA5, 1000000L, d1fVar2.d, RoundingMode.DOWN);
                                } else {
                                    jA5 = j2;
                                    while (i48 < ky6Var4.b()) {
                                        if (ky6Var3.a(i48) != -1) {
                                            jA5 = ky6Var4.a(i48) + jA5;
                                        }
                                    }
                                    jN6 = pqf.N(jA5, 1000000L, d1fVar2.d, RoundingMode.DOWN);
                                }
                                n1fVar2 = new n1f(d1fVar2, jArr5, iArr2, i23, jArr6, iArr4, iArrZ, z7, jN6, i22);
                            } else if (ky6Var4.b() == 1) {
                                j17 = -1;
                                i28 = 1;
                                if (ky6Var4.b() == 1) {
                                    if (ky6Var4.a(0) == 0) {
                                        ky6Var3.getClass();
                                        jA4 = ky6Var3.a(0);
                                        while (i47 < jArr6.length) {
                                            jArr6[i47] = pqf.N(jArr6[i47] - jA4, 1000000L, d1fVar2.c, RoundingMode.DOWN);
                                        }
                                        n1fVar2 = new n1f(d1fVar2, jArr5, iArr2, i23, jArr6, iArr4, iArrZ, z7, pqf.N(j10 - jA4, 1000000L, d1fVar2.c, RoundingMode.DOWN), i22);
                                    } else {
                                        i28 = 1;
                                    }
                                }
                                jArr7 = jArr5;
                                iArr5 = iArr2;
                                i29 = i22;
                                if (i27 == i28) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                iArr6 = new int[ky6Var4.b()];
                                iArr7 = new int[ky6Var4.b()];
                                ky6Var3.getClass();
                                i30 = 0;
                                i31 = 0;
                                z10 = false;
                                i32 = 0;
                                while (i31 < ky6Var4.b()) {
                                    int[] iArr16 = iArr5;
                                    jA3 = ky6Var3.a(i31);
                                    if (jA3 != j17) {
                                        int i86 = i31;
                                        boolean z110 = z10;
                                        jN5 = pqf.N(ky6Var4.a(i31), d1fVar2.c, d1fVar2.d, RoundingMode.DOWN) + jA3;
                                        i39 = i86;
                                        iArr6[i39] = pqf.d(jArr6, jA3, true);
                                        int iA2 = pqf.a(jArr6, jN5, z9);
                                        i40 = iA2 - 1;
                                        i42 = 0;
                                        while (i41 < jArr6.length) {
                                            if (jArr6[i41] >= jN5) {
                                                i42++;
                                                if (i42 > rr5Var2.r) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                i40 = i41;
                                            }
                                        }
                                        iArr7[i39] = i40 + 1;
                                        i43 = iArr6[i39];
                                        while (true) {
                                            i44 = iArr6[i39];
                                            if (i44 > 0) {
                                                break;
                                            }
                                            iArr6[i39] = i44 - 1;
                                        }
                                        if (i44 == 0) {
                                            iArr6[i39] = i43;
                                            while (true) {
                                                i46 = iArr6[i39];
                                                if (i46 < iArr7[i39]) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr6[i39] = i46 + 1;
                                            }
                                        }
                                        int i87 = iArr7[i39];
                                        i45 = iArr6[i39];
                                        int i88 = (i87 - i45) + i32;
                                        if (i30 != i45) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        z10 = z110 | z14;
                                        i32 = i88;
                                        i30 = i87;
                                    } else {
                                        i39 = i31;
                                    }
                                    i31 = i39 + 1;
                                    z9 = z9;
                                    iArr5 = iArr16;
                                }
                                iArr8 = iArr5;
                                boolean z111 = z10;
                                if (i32 != i29) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = z111 | z11;
                                if (z12) {
                                    jArr8 = new long[i32];
                                } else {
                                    jArr8 = jArr7;
                                }
                                if (z12) {
                                    iArr9 = new int[i32];
                                } else {
                                    iArr9 = iArr8;
                                }
                                if (z12) {
                                    i23 = 0;
                                }
                                if (z12) {
                                    iArr10 = new int[i32];
                                } else {
                                    iArr10 = iArr4;
                                }
                                if (z12) {
                                    arrayList4 = new ArrayList();
                                } else {
                                    arrayList4 = arrayList3;
                                }
                                jArr9 = new long[i32];
                                i33 = 0;
                                z13 = false;
                                i34 = 0;
                                jA = 0;
                                while (i33 < ky6Var4.b()) {
                                    jA2 = ky6Var3.a(i33);
                                    i35 = iArr6[i33];
                                    rr5 rr5Var11 = rr5Var2;
                                    i36 = iArr7[i33];
                                    if (z12) {
                                        int i89 = i36 - i35;
                                        System.arraycopy(jArr7, i35, jArr8, i34, i89);
                                        iArr11 = iArr8;
                                        System.arraycopy(iArr11, i35, iArr9, i34, i89);
                                        System.arraycopy(iArr4, i35, iArr10, i34, i89);
                                    } else {
                                        iArr11 = iArr8;
                                    }
                                    i37 = i23;
                                    while (i35 < i36) {
                                        i38 = i35;
                                        iArr12 = iArr11;
                                        long j210 = d1fVar2.d;
                                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                                        long jN13 = pqf.N(jA, 1000000L, j210, roundingMode4);
                                        jN4 = pqf.N(jArr6[i38] - jA2, 1000000L, d1fVar2.c, roundingMode4);
                                        if (jN4 < 0) {
                                            z13 = true;
                                        }
                                        jArr9[i34] = jN13 + jN4;
                                        if (z12) {
                                            i37 = iArr12[i38];
                                        }
                                        if (!z12) {
                                        }
                                        i34++;
                                        i35 = i38 + 1;
                                        iArr11 = iArr12;
                                    }
                                    iArr8 = iArr11;
                                    jA = ky6Var4.a(i33) + jA;
                                    i33++;
                                    i23 = i37;
                                    rr5Var2 = rr5Var11;
                                    ky6Var3 = ky6Var3;
                                    jArr7 = jArr7;
                                }
                                rr5Var3 = rr5Var2;
                                long jN14 = pqf.N(jA, 1000000L, d1fVar2.d, RoundingMode.DOWN);
                                if (z13) {
                                    qr5 qr5VarA8 = rr5Var3.a();
                                    qr5VarA8.u = true;
                                    rr5 rr5Var12 = new rr5(qr5VarA8);
                                    c1f c1fVarA5 = d1fVar2.a();
                                    c1fVarA5.g = rr5Var12;
                                    d1fVar2 = new d1f(c1fVarA5);
                                }
                                n1f n1fVar4 = new n1f(d1fVar2, jArr8, iArr9, i23, jArr9, iArr10, rxg.Z(arrayList4), z7, jN14, jArr8.length);
                                arrayList2 = arrayList2;
                                n1fVar = n1fVar4;
                                arrayList2.add(n1fVar);
                            } else {
                                j17 = -1;
                                i28 = 1;
                                if (ky6Var4.b() == 1) {
                                    if (ky6Var4.a(0) == 0) {
                                        ky6Var3.getClass();
                                        jA4 = ky6Var3.a(0);
                                        while (i47 < jArr6.length) {
                                            jArr6[i47] = pqf.N(jArr6[i47] - jA4, 1000000L, d1fVar2.c, RoundingMode.DOWN);
                                        }
                                        n1fVar2 = new n1f(d1fVar2, jArr5, iArr2, i23, jArr6, iArr4, iArrZ, z7, pqf.N(j10 - jA4, 1000000L, d1fVar2.c, RoundingMode.DOWN), i22);
                                    } else {
                                        i28 = 1;
                                    }
                                }
                                jArr7 = jArr5;
                                iArr5 = iArr2;
                                i29 = i22;
                                if (i27 == i28) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                iArr6 = new int[ky6Var4.b()];
                                iArr7 = new int[ky6Var4.b()];
                                ky6Var3.getClass();
                                i30 = 0;
                                i31 = 0;
                                z10 = false;
                                i32 = 0;
                                while (i31 < ky6Var4.b()) {
                                    int[] iArr17 = iArr5;
                                    jA3 = ky6Var3.a(i31);
                                    if (jA3 != j17) {
                                        int i810 = i31;
                                        boolean z112 = z10;
                                        jN5 = pqf.N(ky6Var4.a(i31), d1fVar2.c, d1fVar2.d, RoundingMode.DOWN) + jA3;
                                        i39 = i810;
                                        iArr6[i39] = pqf.d(jArr6, jA3, true);
                                        int iA3 = pqf.a(jArr6, jN5, z9);
                                        i40 = iA3 - 1;
                                        i42 = 0;
                                        while (i41 < jArr6.length) {
                                            if (jArr6[i41] >= jN5) {
                                                i42++;
                                                if (i42 > rr5Var2.r) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                i40 = i41;
                                            }
                                        }
                                        iArr7[i39] = i40 + 1;
                                        i43 = iArr6[i39];
                                        while (true) {
                                            i44 = iArr6[i39];
                                            if (i44 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr6[i39] = i44 - 1;
                                        }
                                        if (i44 == 0) {
                                            iArr6[i39] = i43;
                                            while (true) {
                                                i46 = iArr6[i39];
                                                if (i46 < iArr7[i39]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr6[i39] = i46 + 1;
                                            }
                                        }
                                        int i811 = iArr7[i39];
                                        i45 = iArr6[i39];
                                        int i812 = (i811 - i45) + i32;
                                        if (i30 != i45) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        z10 = z112 | z14;
                                        i32 = i812;
                                        i30 = i811;
                                    } else {
                                        i39 = i31;
                                    }
                                    i31 = i39 + 1;
                                    z9 = z9;
                                    iArr5 = iArr17;
                                }
                                iArr8 = iArr5;
                                boolean z113 = z10;
                                if (i32 != i29) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = z113 | z11;
                                if (z12) {
                                    jArr8 = new long[i32];
                                } else {
                                    jArr8 = jArr7;
                                }
                                if (z12) {
                                    iArr9 = new int[i32];
                                } else {
                                    iArr9 = iArr8;
                                }
                                if (z12) {
                                    i23 = 0;
                                }
                                if (z12) {
                                    iArr10 = new int[i32];
                                } else {
                                    iArr10 = iArr4;
                                }
                                if (z12) {
                                    arrayList4 = new ArrayList();
                                } else {
                                    arrayList4 = arrayList3;
                                }
                                jArr9 = new long[i32];
                                i33 = 0;
                                z13 = false;
                                i34 = 0;
                                jA = 0;
                                while (i33 < ky6Var4.b()) {
                                    jA2 = ky6Var3.a(i33);
                                    i35 = iArr6[i33];
                                    rr5 rr5Var13 = rr5Var2;
                                    i36 = iArr7[i33];
                                    if (z12) {
                                        int i813 = i36 - i35;
                                        System.arraycopy(jArr7, i35, jArr8, i34, i813);
                                        iArr11 = iArr8;
                                        System.arraycopy(iArr11, i35, iArr9, i34, i813);
                                        System.arraycopy(iArr4, i35, iArr10, i34, i813);
                                    } else {
                                        iArr11 = iArr8;
                                    }
                                    i37 = i23;
                                    while (i35 < i36) {
                                        i38 = i35;
                                        iArr12 = iArr11;
                                        long j211 = d1fVar2.d;
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        long jN15 = pqf.N(jA, 1000000L, j211, roundingMode5);
                                        jN4 = pqf.N(jArr6[i38] - jA2, 1000000L, d1fVar2.c, roundingMode5);
                                        if (jN4 < 0) {
                                            z13 = true;
                                        }
                                        jArr9[i34] = jN15 + jN4;
                                        if (z12) {
                                            i37 = iArr12[i38];
                                        }
                                        if (!z12) {
                                        }
                                        i34++;
                                        i35 = i38 + 1;
                                        iArr11 = iArr12;
                                    }
                                    iArr8 = iArr11;
                                    jA = ky6Var4.a(i33) + jA;
                                    i33++;
                                    i23 = i37;
                                    rr5Var2 = rr5Var13;
                                    ky6Var3 = ky6Var3;
                                    jArr7 = jArr7;
                                }
                                rr5Var3 = rr5Var2;
                                long jN16 = pqf.N(jA, 1000000L, d1fVar2.d, RoundingMode.DOWN);
                                if (z13) {
                                    qr5 qr5VarA9 = rr5Var3.a();
                                    qr5VarA9.u = true;
                                    rr5 rr5Var14 = new rr5(qr5VarA9);
                                    c1f c1fVarA6 = d1fVar2.a();
                                    c1fVarA6.g = rr5Var14;
                                    d1fVar2 = new d1f(c1fVarA6);
                                }
                                n1f n1fVar5 = new n1f(d1fVar2, jArr8, iArr9, i23, jArr9, iArr10, rxg.Z(arrayList4), z7, jN16, jArr8.length);
                                arrayList2 = arrayList2;
                                n1fVar = n1fVar5;
                                arrayList2.add(n1fVar);
                            }
                        }
                        n1fVar = n1fVar2;
                    }
                    arrayList2.add(n1fVar);
                }
            }
            i60 = i2 + 1;
            m49Var2 = m49Var;
            arrayList6 = arrayList2;
            arrayList5 = arrayList;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:214:0x0379  */
    /* JADX WARN: Code duplicated, block: B:217:0x037e A[EDGE_INSN: B:217:0x037e->B:220:0x039f BREAK  A[LOOP:4: B:177:0x0309->B:218:0x0391]] */
    /* JADX WARN: Code duplicated, block: B:276:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    public static su8 k(n49 n49Var, boolean z) {
        int i;
        boolean z2;
        su8 su8Var;
        su8 su8VarB;
        su8 su8Var2;
        su8 su8Var3;
        int iA;
        su8 su8Var4;
        Object objN;
        d0a d0aVar = n49Var.c;
        int i2 = 8;
        d0aVar.M(8);
        su8 su8Var5 = new su8(new qu8[0]);
        while (d0aVar.a() >= i2) {
            int i3 = d0aVar.b;
            int iM = d0aVar.m();
            int iM2 = d0aVar.m();
            boolean z3 = true;
            String str = null;
            if (iM2 == 1835365473) {
                d0aVar.M(i3);
                int i4 = i3 + iM;
                d0aVar.N(i2);
                a(d0aVar);
                while (true) {
                    int i5 = d0aVar.b;
                    if (i5 < i4) {
                        int iM3 = d0aVar.m();
                        if (d0aVar.m() == 1768715124) {
                            d0aVar.M(i5);
                            int i6 = i5 + iM3;
                            d0aVar.N(i2);
                            ArrayList arrayList = new ArrayList();
                            ?? r11 = z3;
                            while (true) {
                                int i7 = d0aVar.b;
                                if (i7 >= i6) {
                                    break;
                                }
                                int iM4 = d0aVar.m();
                                if (iM4 < i2) {
                                    xo1.V("MetadataUtil", "Skipped empty metadata entry");
                                } else {
                                    int i8 = i7 + iM4;
                                    int iM5 = d0aVar.m();
                                    int i9 = (iM5 >> 24) & 255;
                                    try {
                                        if (i8 - d0aVar.b < i2) {
                                            xo1.V("MetadataUtil", "Skipped empty metadata entry: ".concat(g41.b(iM5)));
                                            d0aVar.M(i8);
                                        } else if (i9 == 169 || i9 == 253) {
                                            int i10 = 16777215 & iM5;
                                            if (i10 == 6516084) {
                                                int iM6 = d0aVar.m();
                                                if (d0aVar.m() == 1684108385) {
                                                    d0aVar.N(8);
                                                    String strV = d0aVar.v(iM6 - 16);
                                                    objN = new aa2("und", strV, strV);
                                                } else {
                                                    xo1.V("MetadataUtil", "Failed to parse comment attribute: ".concat(g41.b(iM5)));
                                                    objN = null;
                                                }
                                            } else if (i10 == 7233901 || i10 == 7631467) {
                                                objN = cn1.N(iM5, d0aVar, "TIT2");
                                            } else if (i10 == 6516589 || i10 == 7828084) {
                                                objN = cn1.N(iM5, d0aVar, "TCOM");
                                            } else if (i10 == 6578553) {
                                                objN = cn1.N(iM5, d0aVar, "TDRC");
                                            } else if (i10 == 4280916) {
                                                objN = cn1.N(iM5, d0aVar, "TPE1");
                                            } else if (i10 == 7630703) {
                                                objN = cn1.N(iM5, d0aVar, "TSSE");
                                            } else if (i10 == 6384738) {
                                                objN = cn1.N(iM5, d0aVar, "TALB");
                                            } else if (i10 == 7108978) {
                                                objN = cn1.N(iM5, d0aVar, "USLT");
                                            } else if (i10 == 6776174) {
                                                objN = cn1.N(iM5, d0aVar, "TCON");
                                            } else if (i10 == 6779504) {
                                                objN = cn1.N(iM5, d0aVar, "TIT1");
                                            } else if (i10 == 7173742) {
                                                objN = cn1.N(iM5, d0aVar, "MVNM");
                                            } else if (i10 == 7173737) {
                                                ru6 ru6VarM = cn1.M(iM5, "MVIN", d0aVar, true, false);
                                                d0aVar.M(i8);
                                                objN = ru6VarM;
                                            } else {
                                                xo1.v("MetadataUtil", "Skipped unknown metadata entry: ".concat(g41.b(iM5)));
                                                d0aVar.M(i8);
                                                objN = null;
                                            }
                                            d0aVar.M(i8);
                                        } else {
                                            if (iM5 == 1735291493) {
                                                String strA = su6.a(cn1.L(d0aVar) - r11);
                                                if (strA != null) {
                                                    objN = new fte("TCON", str, jy6.s(strA));
                                                } else {
                                                    xo1.V("MetadataUtil", "Failed to parse standard genre code");
                                                }
                                            } else if (iM5 == 1684632427) {
                                                objN = cn1.K(iM5, d0aVar, "TPOS");
                                            } else if (iM5 == 1953655662) {
                                                objN = cn1.K(iM5, d0aVar, "TRCK");
                                            } else if (iM5 == 1953329263) {
                                                objN = cn1.M(iM5, "TBPM", d0aVar, r11, false);
                                            } else if (iM5 == 1668311404) {
                                                objN = cn1.M(iM5, "TCMP", d0aVar, r11, r11);
                                            } else if (iM5 == 1668249202) {
                                                objN = z ? str : cn1.J(d0aVar);
                                            } else if (iM5 == 1631670868) {
                                                objN = cn1.N(iM5, d0aVar, "TPE2");
                                            } else if (iM5 == 1936682605) {
                                                objN = cn1.N(iM5, d0aVar, "TSOT");
                                            } else if (iM5 == 1936679276) {
                                                objN = cn1.N(iM5, d0aVar, "TSOA");
                                            } else if (iM5 == 1936679282) {
                                                objN = cn1.N(iM5, d0aVar, "TSOP");
                                            } else if (iM5 == 1936679265) {
                                                objN = cn1.N(iM5, d0aVar, "TSO2");
                                            } else if (iM5 == 1936679791) {
                                                objN = cn1.N(iM5, d0aVar, "TSOC");
                                            } else if (iM5 == 1920233063) {
                                                objN = cn1.M(iM5, "ITUNESADVISORY", d0aVar, false, false);
                                            } else if (iM5 == 1885823344) {
                                                objN = cn1.M(iM5, "ITUNESGAPLESS", d0aVar, false, r11);
                                            } else if (iM5 == 1936683886) {
                                                objN = cn1.N(iM5, d0aVar, "TVSHOWSORT");
                                            } else if (iM5 == 1953919848) {
                                                objN = cn1.N(iM5, d0aVar, "TVSHOW");
                                            } else if (iM5 == 757935405) {
                                                String strV2 = str;
                                                String strV3 = strV2;
                                                int i11 = -1;
                                                int i12 = -1;
                                                while (true) {
                                                    int i13 = d0aVar.b;
                                                    if (i13 >= i8) {
                                                        break;
                                                    }
                                                    int iM7 = d0aVar.m();
                                                    int iM8 = d0aVar.m();
                                                    d0aVar.N(4);
                                                    if (iM8 == 1835360622) {
                                                        strV2 = d0aVar.v(iM7 - 12);
                                                    } else if (iM8 == 1851878757) {
                                                        strV3 = d0aVar.v(iM7 - 12);
                                                    } else {
                                                        if (iM8 == 1684108385) {
                                                            i11 = i13;
                                                            i12 = iM7;
                                                        }
                                                        d0aVar.N(iM7 - 12);
                                                    }
                                                }
                                                if (strV2 == null || strV3 == null || i11 == -1) {
                                                    objN = null;
                                                } else {
                                                    d0aVar.M(i11);
                                                    d0aVar.N(16);
                                                    objN = new x87(strV2, strV3, d0aVar.v(i12 - 16));
                                                }
                                                d0aVar.M(i8);
                                            } else {
                                                xo1.v("MetadataUtil", "Skipped unknown metadata entry: ".concat(g41.b(iM5)));
                                                d0aVar.M(i8);
                                                objN = null;
                                            }
                                            d0aVar.M(i8);
                                        }
                                        if (objN != null) {
                                            arrayList.add(objN);
                                        }
                                        i2 = 8;
                                        r11 = 1;
                                        str = null;
                                    } catch (Throwable th) {
                                        d0aVar.M(i8);
                                        throw th;
                                    }
                                }
                                objN = str;
                                if (objN != null) {
                                    arrayList.add(objN);
                                }
                                i2 = 8;
                                r11 = 1;
                                str = null;
                            }
                            if (!arrayList.isEmpty()) {
                                su8Var4 = new su8(arrayList);
                                break;
                            }
                            break;
                        }
                        d0aVar.M(i5 + iM3);
                        i2 = 8;
                        z3 = true;
                        str = null;
                    }
                    su8Var4 = null;
                    break;
                }
                su8Var5 = su8Var5.b(su8Var4);
                i = 8;
            } else {
                if (iM2 == 1936553057) {
                    d0aVar.M(i3);
                    int i14 = i3 + iM;
                    d0aVar.N(12);
                    while (true) {
                        int i15 = d0aVar.b;
                        if (i15 < i14) {
                            int iM9 = d0aVar.m();
                            if (d0aVar.m() == 1935766900) {
                                if (iM9 >= 16) {
                                    d0aVar.N(4);
                                    int i16 = -1;
                                    int i17 = 0;
                                    for (int i18 = 0; i18 < 2; i18++) {
                                        int iZ = d0aVar.z();
                                        int iZ2 = d0aVar.z();
                                        if (iZ == 0) {
                                            i16 = iZ2;
                                        } else if (iZ == 1) {
                                            i17 = iZ2;
                                        }
                                    }
                                    if (i16 != 12) {
                                        if (i16 != 13) {
                                            if (i16 != 21) {
                                                iA = -2147483647;
                                            } else {
                                                i = 8;
                                                if (d0aVar.a() < 8 || d0aVar.b + 8 > i14) {
                                                    iA = -2147483647;
                                                } else {
                                                    int iM10 = d0aVar.m();
                                                    int iM11 = d0aVar.m();
                                                    if (iM10 < 12 || iM11 != 1936877170) {
                                                        iA = -2147483647;
                                                    } else {
                                                        iA = d0aVar.A();
                                                    }
                                                }
                                            }
                                            if (iA == -2147483647) {
                                                su8Var3 = new su8(new eqd(i17, iA));
                                                break;
                                            }
                                            break;
                                        }
                                        iA = 120;
                                    } else {
                                        iA = 240;
                                    }
                                    i = 8;
                                    if (iA == -2147483647) {
                                        su8Var3 = new su8(new eqd(i17, iA));
                                        break;
                                    }
                                    break;
                                }
                                su8Var3 = null;
                                i = 8;
                                break;
                            }
                            d0aVar.M(i15 + iM9);
                        } else {
                            i = 8;
                        }
                        su8Var3 = null;
                        break;
                    }
                    su8Var5 = su8Var5.b(su8Var3);
                } else {
                    i = 8;
                    if (iM2 == -1451722374) {
                        short sW = d0aVar.w();
                        d0aVar.N(2);
                        String strX = d0aVar.x(sW, StandardCharsets.UTF_8);
                        int iMax = Math.max(strX.lastIndexOf(43), strX.lastIndexOf(45));
                        try {
                            try {
                                r49 r49Var = new r49(Float.parseFloat(strX.substring(0, iMax)), Float.parseFloat(strX.substring(iMax, strX.length() - 1)));
                                qu8[] qu8VarArr = new qu8[1];
                                z2 = false;
                                try {
                                    qu8VarArr[0] = r49Var;
                                    su8Var2 = new su8(qu8VarArr);
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    su8Var2 = null;
                                }
                            } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                                z2 = false;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                            z2 = false;
                        }
                        su8VarB = su8Var5.b(su8Var2);
                    } else {
                        z2 = false;
                        if (iM2 == 1667788908) {
                            try {
                                d0aVar.N(5);
                                int iM12 = d0aVar.m();
                                ArrayList arrayList2 = new ArrayList();
                                for (int i19 = 0; i19 < iM12; i19++) {
                                    long jT = d0aVar.t() / 10000;
                                    if (jT < 0) {
                                        jT = -9223372036854775807L;
                                    }
                                    su8Var = null;
                                    try {
                                        arrayList2.add(new ww1(jT, -9223372036854775807L, false, new fu7(null, d0aVar.x(d0aVar.z(), StandardCharsets.UTF_8))));
                                    } catch (IndexOutOfBoundsException unused4) {
                                    }
                                }
                                su8Var = null;
                                if (!arrayList2.isEmpty()) {
                                    su8Var = new su8(arrayList2);
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                                su8Var = null;
                            }
                            su8VarB = su8Var5.b(su8Var);
                        }
                    }
                    su8Var5 = su8VarB;
                }
                d0aVar.M(i3 + iM);
                i2 = i;
            }
            z2 = false;
            d0aVar.M(i3 + iM);
            i2 = i;
        }
        return su8Var5;
    }
}
