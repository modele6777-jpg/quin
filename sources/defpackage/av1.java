package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class av1 extends dv1 {
    public final d0a h = new d0a();
    public final zu1 i = new zu1();
    public int j = -1;
    public final int k;
    public final yu1[] l;
    public yu1 m;
    public List n;
    public List o;
    public zu1 p;
    public int q;

    public av1(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = d72.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new yu1[8];
        int i2 = 0;
        while (true) {
            yu1[] yu1VarArr = this.l;
            if (i2 >= 8) {
                this.m = yu1VarArr[0];
                return;
            } else {
                yu1VarArr[i2] = new yu1();
                i2++;
            }
        }
    }

    @Override // defpackage.dv1, defpackage.pm3
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        m();
        this.p = null;
    }

    @Override // defpackage.dv1
    public final kd9 g() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new kd9(5, list);
    }

    @Override // defpackage.dv1
    public final void h(bv1 bv1Var) {
        zu1 zu1Var;
        ByteBuffer byteBuffer = bv1Var.e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        d0a d0aVar = this.h;
        d0aVar.K(bArrArray, iLimit);
        while (d0aVar.a() >= 3) {
            int iZ = d0aVar.z();
            int i = iZ & 3;
            boolean z = (iZ & 4) == 4;
            byte bZ = (byte) d0aVar.z();
            byte bZ2 = (byte) d0aVar.z();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        k();
                        int i2 = (bZ & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m();
                            xo1.V("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bZ & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        zu1Var = new zu1(i2, i4);
                        this.p = zu1Var;
                        byte[] bArr = zu1Var.b;
                        zu1Var.e = 1;
                        bArr[0] = bZ2;
                    } else {
                        pa7.A(i == 2);
                        zu1Var = this.p;
                        if (zu1Var == null) {
                            xo1.x("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = zu1Var.b;
                            int i5 = zu1Var.e;
                            int i6 = i5 + 1;
                            zu1Var.e = i6;
                            bArr2[i5] = bZ;
                            zu1Var.e = i5 + 2;
                            bArr2[i6] = bZ2;
                        }
                    }
                    if (zu1Var.e == (zu1Var.d * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // defpackage.dv1
    public final boolean j() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x053d  */
    public final void k() {
        char c;
        boolean z;
        zu1 zu1Var = this.p;
        if (zu1Var == null) {
            return;
        }
        int i = 2;
        if (zu1Var.e != (zu1Var.d * 2) - 1) {
            xo1.v("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        zu1 zu1Var2 = this.p;
        byte[] bArr = zu1Var2.b;
        int i2 = zu1Var2.e;
        zu1 zu1Var3 = this.i;
        zu1Var3.l(bArr, i2);
        boolean z2 = false;
        while (zu1Var3.b() > 0) {
            int i3 = 3;
            int iG = zu1Var3.g(3);
            int iG2 = zu1Var3.g(5);
            if (iG == 7) {
                zu1Var3.o(i);
                iG = zu1Var3.g(6);
                if (iG < 7) {
                    kv2.w(iG, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (iG2 == 0) {
                if (iG != 0) {
                    xo1.V("Cea708Decoder", "serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                }
                if (z2) {
                    this.n = l();
                }
                this.p = null;
            }
            if (iG != this.k) {
                zu1Var3.p(iG2);
            } else {
                int iE = (iG2 * 8) + zu1Var3.e();
                while (zu1Var3.e() < iE) {
                    int iG3 = zu1Var3.g(8);
                    if (iG3 != 16) {
                        if (iG3 <= 31) {
                            if (iG3 != 0) {
                                if (iG3 == i3) {
                                    this.n = l();
                                } else if (iG3 != 8) {
                                    switch (iG3) {
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            m();
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iG3 >= 17 && iG3 <= 23) {
                                                xo1.V("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                zu1Var3.o(8);
                                            } else if (iG3 < 24 || iG3 > 31) {
                                                kv2.w(iG3, "Invalid C0 command: ", "Cea708Decoder");
                                            } else {
                                                xo1.V("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iG3);
                                                zu1Var3.o(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iG3 <= 127) {
                            yu1 yu1Var = this.m;
                            if (iG3 == 127) {
                                yu1Var.a((char) 9835);
                            } else {
                                yu1Var.a((char) (iG3 & 255));
                            }
                            z2 = true;
                        } else {
                            if (iG3 <= 159) {
                                yu1[] yu1VarArr = this.l;
                                switch (iG3) {
                                    case UserMetadata.MAX_ROLLOUT_ASSIGNMENTS /* 128 */:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z = true;
                                        int i4 = iG3 - 128;
                                        if (this.q != i4) {
                                            this.q = i4;
                                            this.m = yu1VarArr[i4];
                                        }
                                        break;
                                    case 136:
                                        z = true;
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (zu1Var3.f()) {
                                                yu1 yu1Var2 = yu1VarArr[8 - i5];
                                                yu1Var2.a.clear();
                                                yu1Var2.b.clear();
                                                yu1Var2.o = -1;
                                                yu1Var2.p = -1;
                                                yu1Var2.q = -1;
                                                yu1Var2.s = -1;
                                                yu1Var2.u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (zu1Var3.f()) {
                                                yu1VarArr[8 - i6].d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 138:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (zu1Var3.f()) {
                                                yu1VarArr[8 - i7].d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 139:
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (zu1Var3.f()) {
                                                yu1 yu1Var3 = yu1VarArr[8 - i8];
                                                yu1Var3.d = !yu1Var3.d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 140:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (zu1Var3.f()) {
                                                yu1VarArr[8 - i9].d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 141:
                                        zu1Var3.o(8);
                                        z = true;
                                        break;
                                    case 142:
                                        z = true;
                                        break;
                                    case 143:
                                        m();
                                        z = true;
                                        break;
                                    case 144:
                                        int i10 = i;
                                        if (this.m.c) {
                                            zu1Var3.g(4);
                                            zu1Var3.g(i10);
                                            zu1Var3.g(i10);
                                            boolean zF = zu1Var3.f();
                                            boolean zF2 = zu1Var3.f();
                                            i3 = 3;
                                            zu1Var3.g(3);
                                            zu1Var3.g(3);
                                            this.m.e(zF, zF2);
                                            z = true;
                                        } else {
                                            zu1Var3.o(16);
                                            z = true;
                                            i3 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.m.c) {
                                            int iC = yu1.c(zu1Var3.g(2), zu1Var3.g(2), zu1Var3.g(2), zu1Var3.g(2));
                                            int iC2 = yu1.c(zu1Var3.g(2), zu1Var3.g(2), zu1Var3.g(2), zu1Var3.g(2));
                                            zu1Var3.o(2);
                                            yu1.c(zu1Var3.g(2), zu1Var3.g(2), zu1Var3.g(2), 0);
                                            this.m.f(iC, iC2);
                                        } else {
                                            zu1Var3.o(24);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 146:
                                        if (this.m.c) {
                                            zu1Var3.o(4);
                                            int iG4 = zu1Var3.g(4);
                                            zu1Var3.o(2);
                                            zu1Var3.g(6);
                                            yu1 yu1Var4 = this.m;
                                            if (yu1Var4.u != iG4) {
                                                yu1Var4.a('\n');
                                            }
                                            yu1Var4.u = iG4;
                                        } else {
                                            zu1Var3.o(16);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        kv2.w(iG3, "Invalid C1 command: ", "Cea708Decoder");
                                        z = true;
                                        break;
                                    case 151:
                                        if (this.m.c) {
                                            int iC3 = yu1.c(zu1Var3.g(2), zu1Var3.g(2), zu1Var3.g(2), zu1Var3.g(2));
                                            zu1Var3.g(2);
                                            yu1.c(zu1Var3.g(2), zu1Var3.g(2), zu1Var3.g(2), 0);
                                            zu1Var3.f();
                                            zu1Var3.f();
                                            zu1Var3.g(2);
                                            zu1Var3.g(2);
                                            int iG5 = zu1Var3.g(2);
                                            zu1Var3.o(8);
                                            yu1 yu1Var5 = this.m;
                                            yu1Var5.n = iC3;
                                            yu1Var5.k = iG5;
                                        } else {
                                            zu1Var3.o(32);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i11 = iG3 - 152;
                                        yu1 yu1Var6 = yu1VarArr[i11];
                                        zu1Var3.o(i);
                                        boolean zF3 = zu1Var3.f();
                                        zu1Var3.o(i);
                                        int iG6 = zu1Var3.g(i3);
                                        boolean zF4 = zu1Var3.f();
                                        int iG7 = zu1Var3.g(7);
                                        int iG8 = zu1Var3.g(8);
                                        int iG9 = zu1Var3.g(4);
                                        int iG10 = zu1Var3.g(4);
                                        zu1Var3.o(i);
                                        zu1Var3.o(6);
                                        zu1Var3.o(i);
                                        int iG11 = zu1Var3.g(3);
                                        int iG12 = zu1Var3.g(3);
                                        ArrayList arrayList = yu1Var6.a;
                                        yu1Var6.c = true;
                                        yu1Var6.d = zF3;
                                        yu1Var6.e = iG6;
                                        yu1Var6.f = zF4;
                                        yu1Var6.g = iG7;
                                        yu1Var6.h = iG8;
                                        yu1Var6.i = iG9;
                                        int i12 = iG10 + 1;
                                        if (yu1Var6.j != i12) {
                                            yu1Var6.j = i12;
                                            while (true) {
                                                if (arrayList.size() >= yu1Var6.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iG11 != 0 && yu1Var6.l != iG11) {
                                            yu1Var6.l = iG11;
                                            int i13 = iG11 - 1;
                                            int i14 = yu1.B[i13];
                                            boolean z3 = yu1.A[i13];
                                            int i15 = yu1.y[i13];
                                            int i16 = yu1.z[i13];
                                            int i17 = yu1.x[i13];
                                            yu1Var6.n = i14;
                                            yu1Var6.k = i17;
                                        }
                                        if (iG12 != 0 && yu1Var6.m != iG12) {
                                            yu1Var6.m = iG12;
                                            int i18 = iG12 - 1;
                                            int i19 = yu1.D[i18];
                                            int i20 = yu1.C[i18];
                                            yu1Var6.e(false, false);
                                            yu1Var6.f(yu1.v, yu1.E[i18]);
                                        }
                                        if (this.q != i11) {
                                            this.q = i11;
                                            this.m = yu1VarArr[i11];
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                }
                            } else {
                                z = true;
                                if (iG3 <= 255) {
                                    this.m.a((char) (iG3 & 255));
                                } else {
                                    kv2.w(iG3, "Invalid base command: ", "Cea708Decoder");
                                }
                                i = 2;
                                c = 7;
                            }
                            z2 = z;
                            i = 2;
                            c = 7;
                        }
                        c = 7;
                    } else {
                        int iG13 = zu1Var3.g(8);
                        if (iG13 <= 31) {
                            c = 7;
                            if (iG13 > 7) {
                                if (iG13 <= 15) {
                                    zu1Var3.o(8);
                                } else if (iG13 <= 23) {
                                    zu1Var3.o(16);
                                } else if (iG13 <= 31) {
                                    zu1Var3.o(24);
                                }
                            }
                        } else {
                            c = 7;
                            if (iG13 <= 127) {
                                if (iG13 == 32) {
                                    this.m.a(' ');
                                } else if (iG13 == 33) {
                                    this.m.a((char) 160);
                                } else if (iG13 == 37) {
                                    this.m.a((char) 8230);
                                } else if (iG13 == 42) {
                                    this.m.a((char) 352);
                                } else if (iG13 == 44) {
                                    this.m.a((char) 338);
                                } else if (iG13 == 63) {
                                    this.m.a((char) 376);
                                } else if (iG13 == 57) {
                                    this.m.a((char) 8482);
                                } else if (iG13 == 58) {
                                    this.m.a((char) 353);
                                } else if (iG13 == 60) {
                                    this.m.a((char) 339);
                                } else if (iG13 != 61) {
                                    switch (iG13) {
                                        case z7c.f /* 48 */:
                                            this.m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (iG13) {
                                                case 118:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    kv2.w(iG13, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                i = 2;
                                z2 = true;
                            } else if (iG13 > 159) {
                                i = 2;
                                if (iG13 <= 255) {
                                    if (iG13 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        kv2.w(iG13, "Invalid G3 character: ", "Cea708Decoder");
                                        this.m.a('_');
                                    }
                                    z2 = true;
                                } else {
                                    kv2.w(iG13, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (iG13 <= 135) {
                                zu1Var3.o(32);
                            } else if (iG13 <= 143) {
                                zu1Var3.o(40);
                            } else if (iG13 <= 159) {
                                i = 2;
                                zu1Var3.o(2);
                                zu1Var3.o(zu1Var3.g(6) * 8);
                            }
                        }
                        i = 2;
                    }
                    i = i;
                }
            }
        }
        if (z2) {
            this.n = l();
        }
        this.p = null;
    }

    public final List l() {
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            yu1[] yu1VarArr = this.l;
            yu1 yu1Var = yu1VarArr[i];
            if (yu1Var.c && (!yu1Var.a.isEmpty() || yu1Var.b.length() != 0)) {
                yu1 yu1Var2 = yu1VarArr[i];
                if (yu1Var2.d) {
                    ArrayList arrayList2 = yu1Var2.a;
                    xu1 xu1Var = null;
                    if (yu1Var2.c && (!arrayList2.isEmpty() || yu1Var2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) yu1Var2.b());
                        int i3 = yu1Var2.k;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                yg5.j(yu1Var2.k, "Unexpected justification value: ");
                                return null;
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        boolean z = yu1Var2.f;
                        int i4 = yu1Var2.h;
                        int i5 = yu1Var2.g;
                        if (z) {
                            f = i4 / 99.0f;
                            f2 = i5 / 99.0f;
                        } else {
                            f = i4 / 209.0f;
                            f2 = i5 / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i6 = yu1Var2.i;
                        int i7 = i6 / 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = i6 % 3;
                        int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : 2;
                        int i11 = yu1Var2.n;
                        xu1Var = new xu1(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 != yu1.w, i11, yu1Var2.e);
                    }
                    if (xu1Var != null) {
                        arrayList.add(xu1Var);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, xu1.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((xu1) arrayList.get(i12)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void m() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
