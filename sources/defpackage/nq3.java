package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nq3 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final fsf c = new fsf();
    public mjg d;
    public int e;
    public int f;
    public long g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:165:0x0295  */
    /* JADX WARN: Code duplicated, block: B:310:0x0465  */
    /* JADX WARN: Code duplicated, block: B:461:0x06b6 A[PHI: r3 r12 r28
  0x06b6: PHI (r3v118 java.util.List) = (r3v81 java.util.List), (r3v86 java.util.List), (r3v111 java.util.List), (r3v120 java.util.List) binds: [B:508:0x0837, B:502:0x0819, B:472:0x0700, B:460:0x06b4] A[DONT_GENERATE, DONT_INLINE]
  0x06b6: PHI (r12v79 java.lang.String) = (r12v51 java.lang.String), (r12v54 java.lang.String), (r12v72 java.lang.String), (r12v80 java.lang.String) binds: [B:508:0x0837, B:502:0x0819, B:472:0x0700, B:460:0x06b4] A[DONT_GENERATE, DONT_INLINE]
  0x06b6: PHI (r28v50 java.lang.String) = (r28v19 java.lang.String), (r28v21 java.lang.String), (r28v40 java.lang.String), (r28v51 java.lang.String) binds: [B:508:0x0837, B:502:0x0819, B:472:0x0700, B:460:0x06b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:464:0x06c3 A[PHI: r3 r4 r12 r28
  0x06c3: PHI (r3v115 java.util.List) = (r3v111 java.util.List), (r3v120 java.util.List) binds: [B:472:0x0700, B:460:0x06b4] A[DONT_GENERATE, DONT_INLINE]
  0x06c3: PHI (r4v65 int) = (r4v61 int), (r4v69 int) binds: [B:472:0x0700, B:460:0x06b4] A[DONT_GENERATE, DONT_INLINE]
  0x06c3: PHI (r12v77 java.lang.String) = (r12v72 java.lang.String), (r12v80 java.lang.String) binds: [B:472:0x0700, B:460:0x06b4] A[DONT_GENERATE, DONT_INLINE]
  0x06c3: PHI (r28v47 java.lang.String) = (r28v40 java.lang.String), (r28v51 java.lang.String) binds: [B:472:0x0700, B:460:0x06b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:631:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:633:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:634:0x0b3a  */
    /* JADX WARN: Code duplicated, block: B:638:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:639:0x0b49  */
    /* JADX WARN: Code duplicated, block: B:642:0x0b5a  */
    /* JADX WARN: Code duplicated, block: B:643:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:645:0x0b70  */
    /* JADX WARN: Code duplicated, block: B:647:0x0b74  */
    /* JADX WARN: Code duplicated, block: B:649:0x0b79  */
    /* JADX WARN: Code duplicated, block: B:652:0x0b81  */
    /* JADX WARN: Code duplicated, block: B:654:0x0b86  */
    /* JADX WARN: Code duplicated, block: B:657:0x0b8d  */
    /* JADX WARN: Code duplicated, block: B:661:0x0b9c  */
    /* JADX WARN: Code duplicated, block: B:663:0x0ba0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:666:0x0ba5  */
    /* JADX WARN: Code duplicated, block: B:670:0x0bb5  */
    /* JADX WARN: Code duplicated, block: B:672:0x0bbe A[PHI: r3
  0x0bbe: PHI (r3v153 int) = (r3v121 int), (r3v128 int) binds: [B:671:0x0bbc, B:674:0x0bc3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:673:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:678:0x0bca  */
    /* JADX WARN: Code duplicated, block: B:679:0x0bcd  */
    /* JADX WARN: Code duplicated, block: B:681:0x0bd1  */
    /* JADX WARN: Code duplicated, block: B:682:0x0bd4  */
    /* JADX WARN: Code duplicated, block: B:685:0x0bdc  */
    /* JADX WARN: Code duplicated, block: B:705:0x0c92  */
    /* JADX WARN: Code duplicated, block: B:708:0x0c9f  */
    /* JADX WARN: Code duplicated, block: B:711:0x0cb2  */
    /* JADX WARN: Code duplicated, block: B:714:0x0cb7  */
    /* JADX WARN: Code duplicated, block: B:733:0x0d04  */
    /* JADX WARN: Code duplicated, block: B:735:0x0d1c  */
    /* JADX WARN: Code duplicated, block: B:737:0x0d22  */
    /* JADX WARN: Code duplicated, block: B:752:0x0d4d  */
    /* JADX WARN: Code duplicated, block: B:757:0x0d61  */
    /* JADX WARN: Code duplicated, block: B:758:0x0d64  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r5v127, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v130 */
    /* JADX WARN: Type inference failed for: r5v131, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r5v132 */
    /* JADX WARN: Type inference failed for: r5v145 */
    /* JADX WARN: Type inference failed for: r5v146, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r6v121 */
    public final boolean a(m95 m95Var) throws l0a {
        int i;
        boolean z;
        int i2;
        String str;
        int i3;
        int iA;
        String str2;
        byte b;
        List listSingletonList;
        int i4;
        ?? r5;
        String str3;
        int i5;
        String str4;
        String str5;
        int i6;
        Pair pair;
        String str6;
        String str7;
        String str8;
        int i7;
        int i8;
        List list;
        int i9;
        int i10;
        int i11;
        String str9;
        int i12;
        int i13;
        int i14;
        List listS;
        int iU;
        int iW;
        int i15;
        String str10;
        int i16;
        qr5 qr5Var;
        int i17;
        int i18;
        float f;
        int i19;
        int i20;
        int i21;
        byte[] bArr;
        String str11;
        int iIntValue;
        int i22;
        int i23;
        int i24;
        int i25;
        String str12;
        String str13;
        ig4 ig4VarA;
        int i26;
        this.d.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.b;
            mq3 mq3Var = (mq3) arrayDeque.peek();
            int i27 = 0;
            if (mq3Var != null) {
                i = 8;
                if (m95Var.getPosition() >= mq3Var.b) {
                    mjg mjgVar = this.d;
                    int i28 = ((mq3) arrayDeque.pop()).a;
                    en8 en8Var = (en8) mjgVar.a;
                    Map map = en8.v0;
                    SparseArray sparseArray = en8Var.E;
                    SparseArray sparseArray2 = en8Var.c;
                    en8Var.p0.getClass();
                    if (i28 == 128) {
                        an8 an8Var = en8Var.z;
                        an8Var.getClass();
                        if (an8Var.f != null || (str2 = an8Var.h) == null) {
                            return true;
                        }
                        an8Var.f = str2;
                        String str14 = an8Var.i;
                        if (str14 == null) {
                            return true;
                        }
                        an8Var.g = str14;
                        return true;
                    }
                    if (i28 == 160) {
                        if (en8Var.U != 2) {
                            return true;
                        }
                        dn8 dn8Var = (dn8) sparseArray2.get(en8Var.a0);
                        dn8Var.d0.getClass();
                        if (en8Var.f0 > 0 && "A_OPUS".equals(dn8Var.c)) {
                            d0a d0aVar = en8Var.q;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(en8Var.f0).array();
                            d0aVar.getClass();
                            d0aVar.K(bArrArray, bArrArray.length);
                        }
                        int i29 = 0;
                        for (int i30 = 0; i30 < en8Var.Y; i30++) {
                            i29 += en8Var.Z[i30];
                        }
                        int i31 = 0;
                        while (i31 < en8Var.Y) {
                            long j = en8Var.V + ((long) ((dn8Var.g * i31) / 1000));
                            int i32 = en8Var.c0;
                            if (i31 == 0 && !en8Var.e0) {
                                i32 |= 1;
                            }
                            int i33 = en8Var.Z[i31];
                            int i34 = i29 - i33;
                            en8Var.i(dn8Var, j, i32, i33, i34);
                            i31++;
                            i29 = i34;
                        }
                        en8Var.U = 0;
                        return true;
                    }
                    String str15 = "video/webm";
                    if (i28 != 174) {
                        if (i28 == 17849) {
                            while (i27 < sparseArray2.size()) {
                                en8Var.p((dn8) sparseArray2.valueAt(i27));
                                i27++;
                            }
                        } else {
                            if (i28 == 19899) {
                                int i35 = en8Var.C;
                                if (i35 != -1) {
                                    long j2 = en8Var.D;
                                    if (j2 != -1) {
                                        if (i35 == 475249515) {
                                            en8Var.M = j2;
                                            return true;
                                        }
                                        if (i35 == 374648427) {
                                            en8Var.O = j2;
                                            return true;
                                        }
                                    }
                                }
                                throw l0a.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i28 == 25152) {
                                en8Var.h(i28);
                                dn8 dn8Var2 = en8Var.A;
                                if (dn8Var2.j) {
                                    j1f j1fVar = dn8Var2.l;
                                    if (j1fVar == null) {
                                        throw l0a.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    dn8Var2.n = new xp4(null, true, new wp4(d71.a, null, "video/webm", j1fVar.b));
                                    return true;
                                }
                            } else if (i28 == 28032) {
                                en8Var.h(i28);
                                dn8 dn8Var3 = en8Var.A;
                                if (dn8Var3.j && dn8Var3.k != null) {
                                    throw l0a.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i28 == 357149030) {
                                if (en8Var.u == -9223372036854775807L) {
                                    en8Var.u = 1000000L;
                                }
                                long j3 = en8Var.v;
                                if (j3 != -9223372036854775807L) {
                                    en8Var.w = en8Var.o(j3);
                                    return true;
                                }
                            } else if (i28 == 374648427) {
                                if (sparseArray2.size() == 0) {
                                    throw l0a.a(null, "No valid tracks were found");
                                }
                                ?? r1 = !en8Var.e || en8Var.M == -1 || en8Var.B;
                                int i36 = -1;
                                int i37 = -1;
                                int i38 = -1;
                                int i39 = -1;
                                for (int i40 = 0; i40 < sparseArray2.size(); i40++) {
                                    dn8 dn8Var4 = (dn8) sparseArray2.valueAt(i40);
                                    int i41 = dn8Var4.f;
                                    if (i41 == 2) {
                                        if (dn8Var4.b0) {
                                            i36 = dn8Var4.d;
                                        }
                                        if (i37 == -1) {
                                            i37 = dn8Var4.d;
                                        }
                                    } else if (i41 == 1) {
                                        if (dn8Var4.b0) {
                                            i38 = dn8Var4.d;
                                        }
                                        if (i39 == -1) {
                                            i39 = dn8Var4.d;
                                        }
                                    }
                                    if (r1 != false && !dn8Var4.X) {
                                        en8Var.p(dn8Var4);
                                        dn8Var4.d0.getClass();
                                        k1f k1fVar = dn8Var4.d0;
                                        rr5 rr5Var = dn8Var4.e0;
                                        rr5Var.getClass();
                                        k1fVar.g(rr5Var);
                                    }
                                }
                                if (i36 != -1) {
                                    en8Var.K = i36;
                                } else if (i37 != -1) {
                                    en8Var.K = i37;
                                } else if (i38 != -1) {
                                    en8Var.K = i38;
                                } else if (i39 != -1) {
                                    en8Var.K = i39;
                                } else {
                                    en8Var.K = sparseArray2.size() > 0 ? ((dn8) sparseArray2.valueAt(0)).d : -1;
                                }
                                en8Var.R = true;
                                if (r1 != false) {
                                    en8Var.l();
                                    return true;
                                }
                            } else if (i28 != 475249515) {
                                if (i28 == 182) {
                                    an8 an8Var2 = en8Var.z;
                                    an8Var2.getClass();
                                    long j4 = an8Var2.a;
                                    if (j4 != 0) {
                                        en8Var.d.put(j4, an8Var2);
                                    }
                                    en8Var.z = null;
                                    return true;
                                }
                                if (i28 == 183 && !en8Var.B) {
                                    en8Var.g(i28);
                                    if (en8Var.G != -9223372036854775807L && (i26 = en8Var.H) != -1 && en8Var.I != -1) {
                                        List arrayList = (List) sparseArray.get(i26);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            sparseArray.put(en8Var.H, arrayList);
                                        }
                                        arrayList.add(new bn8(en8Var.G, en8Var.t + en8Var.I, en8Var.J));
                                        return true;
                                    }
                                }
                            } else if (!en8Var.B) {
                                int i42 = 0;
                                while (true) {
                                    if (i42 < sparseArray.size()) {
                                        if (((List) sparseArray.valueAt(i42)).isEmpty()) {
                                            i42++;
                                        } else if (en8Var.w != -9223372036854775807L) {
                                            for (int i43 = 0; i43 < sparseArray.size(); i43++) {
                                                Collections.sort((List) sparseArray.valueAt(i43));
                                            }
                                            en8Var.p0.q(new cn8(sparseArray, en8Var.w, en8Var.K, en8Var.t, en8Var.s));
                                        }
                                    }
                                    en8Var.p0.q(new ir0(en8Var.w));
                                }
                                en8Var.B = true;
                                en8Var.F = false;
                                while (i27 < sparseArray2.size()) {
                                    dn8 dn8Var5 = (dn8) sparseArray2.valueAt(i27);
                                    if (!dn8Var5.X) {
                                        en8Var.p(dn8Var5);
                                        dn8Var5.d0.getClass();
                                        k1f k1fVar2 = dn8Var5.d0;
                                        rr5 rr5Var2 = dn8Var5.e0;
                                        rr5Var2.getClass();
                                        k1fVar2.g(rr5Var2);
                                    }
                                    i27++;
                                }
                                en8Var.l();
                                return true;
                            }
                        }
                        return true;
                    }
                    dn8 dn8Var6 = en8Var.A;
                    dn8Var6.getClass();
                    String str16 = dn8Var6.c;
                    if (str16 == null) {
                        throw l0a.a(null, "CodecId is missing in TrackEntry element");
                    }
                    switch (str16) {
                        case "V_MPEG4/ISO/AP":
                        case "V_MPEG4/ISO/SP":
                        case "A_MS/ACM":
                        case "A_TRUEHD":
                        case "A_VORBIS":
                        case "A_MPEG/L2":
                        case "A_MPEG/L3":
                        case "V_MS/VFW/FOURCC":
                        case "S_DVBSUB":
                        case "V_MPEG4/ISO/ASP":
                        case "V_MPEG4/ISO/AVC":
                        case "S_VOBSUB":
                        case "A_DTS/LOSSLESS":
                        case "A_AAC":
                        case "A_AC3":
                        case "A_DTS":
                        case "V_AV1":
                        case "V_VP8":
                        case "V_VP9":
                        case "S_HDMV/PGS":
                        case "V_THEORA":
                        case "A_DTS/EXPRESS":
                        case "A_PCM/FLOAT/IEEE":
                        case "A_PCM/INT/BIG":
                        case "A_PCM/INT/LIT":
                        case "S_TEXT/ASS":
                        case "S_TEXT/SSA":
                        case "V_MPEGH/ISO/HEVC":
                        case "S_TEXT/WEBVTT":
                        case "S_TEXT/UTF8":
                        case "V_MPEG2":
                        case "A_ALAC":
                        case "A_EAC3":
                        case "A_FLAC":
                        case "A_OPUS":
                            int i44 = dn8Var6.d;
                            switch (str16) {
                                case "V_MPEG4/ISO/AP":
                                    b = 0;
                                    break;
                                case "V_MPEG4/ISO/SP":
                                    b = 1;
                                    break;
                                case "A_MS/ACM":
                                    b = 2;
                                    break;
                                case "A_TRUEHD":
                                    b = 3;
                                    break;
                                case "A_VORBIS":
                                    b = 4;
                                    break;
                                case "A_MPEG/L2":
                                    b = 5;
                                    break;
                                case "A_MPEG/L3":
                                    b = 6;
                                    break;
                                case "V_MS/VFW/FOURCC":
                                    b = 7;
                                    break;
                                case "S_DVBSUB":
                                    b = 8;
                                    break;
                                case "V_MPEG4/ISO/ASP":
                                    b = 9;
                                    break;
                                case "V_MPEG4/ISO/AVC":
                                    b = 10;
                                    break;
                                case "S_VOBSUB":
                                    b = 11;
                                    break;
                                case "A_DTS/LOSSLESS":
                                    b = 12;
                                    break;
                                case "A_AAC":
                                    b = 13;
                                    break;
                                case "A_AC3":
                                    b = 14;
                                    break;
                                case "A_DTS":
                                    b = 15;
                                    break;
                                case "V_AV1":
                                    b = 16;
                                    break;
                                case "V_VP8":
                                    b = 17;
                                    break;
                                case "V_VP9":
                                    b = 18;
                                    break;
                                case "S_HDMV/PGS":
                                    b = 19;
                                    break;
                                case "V_THEORA":
                                    b = 20;
                                    break;
                                case "A_DTS/EXPRESS":
                                    b = 21;
                                    break;
                                case "A_PCM/FLOAT/IEEE":
                                    b = 22;
                                    break;
                                case "A_PCM/INT/BIG":
                                    b = 23;
                                    break;
                                case "A_PCM/INT/LIT":
                                    b = 24;
                                    break;
                                case "S_TEXT/ASS":
                                    b = 25;
                                    break;
                                case "S_TEXT/SSA":
                                    b = 26;
                                    break;
                                case "V_MPEGH/ISO/HEVC":
                                    b = 27;
                                    break;
                                case "S_TEXT/WEBVTT":
                                    b = 28;
                                    break;
                                case "S_TEXT/UTF8":
                                    b = 29;
                                    break;
                                case "V_MPEG2":
                                    b = 30;
                                    break;
                                case "A_ALAC":
                                    b = 31;
                                    break;
                                case "A_EAC3":
                                    b = 32;
                                    break;
                                case "A_FLAC":
                                    b = 33;
                                    break;
                                case "A_OPUS":
                                    b = 34;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            String str17 = "video/x-unknown";
                            byte b2 = b;
                            ?? r6 = "MatroskaExtractor";
                            switch (b2) {
                                case 0:
                                case 1:
                                case 9:
                                    str15 = "video/webm";
                                    byte[] bArr2 = dn8Var6.m;
                                    str17 = "video/mp4v-es";
                                    listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z2 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i45 = (z2 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17 || (i23 = dn8Var6.s) == i17) {
                                                f = -1.0f;
                                            } else {
                                                f = (dn8Var6.p * i18) / (dn8Var6.o * i23);
                                            }
                                            if (i12 == -1 && i8 == -1) {
                                                if (i13 == -1 && dn8Var6.C == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i46 = i12;
                                            int i47 = i13;
                                            int i48 = i8;
                                            if (i6 != -1 && (i6 = dn8Var6.q) == -1) {
                                                i19 = 8;
                                            } else {
                                                i19 = i6;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f || dn8Var6.G == -1.0f || dn8Var6.H == -1.0f || dn8Var6.I == -1.0f || dn8Var6.J == -1.0f || dn8Var6.K == -1.0f || dn8Var6.L == -1.0f || dn8Var6.M == -1.0f || dn8Var6.N == -1.0f || dn8Var6.O == -1.0f) {
                                                bArr = null;
                                            } else {
                                                byte[] bArr3 = new byte[25];
                                                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                                                byteBufferOrder.put((byte) 0);
                                                byteBufferOrder.putShort((short) ((dn8Var6.F * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((dn8Var6.G * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((dn8Var6.H * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((dn8Var6.I * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((dn8Var6.J * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((dn8Var6.K * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((dn8Var6.L * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((dn8Var6.M * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) (dn8Var6.N + 0.5f));
                                                byteBufferOrder.putShort((short) (dn8Var6.O + 0.5f));
                                                byteBufferOrder.putShort((short) dn8Var6.D);
                                                byteBufferOrder.putShort((short) dn8Var6.E);
                                                bArr = bArr3;
                                            }
                                            e82 e82Var = new e82(i46, i47, i48, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null && map.containsKey(str11)) {
                                                iIntValue = ((Integer) map.get(dn8Var6.b)).intValue();
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0 || Float.compare(dn8Var6.v, 0.0f) != 0 || Float.compare(dn8Var6.w, 0.0f) != 0) {
                                                i22 = iIntValue;
                                            } else if (Float.compare(dn8Var6.x, 0.0f) == 0) {
                                                i22 = 0;
                                            } else if (Float.compare(dn8Var6.x, 90.0f) == 0) {
                                                i22 = 90;
                                            } else if (Float.compare(dn8Var6.x, -180.0f) == 0 || Float.compare(dn8Var6.x, 180.0f) == 0) {
                                                i22 = 180;
                                            } else if (Float.compare(dn8Var6.x, -90.0f) == 0) {
                                                i22 = 270;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var;
                                        } else if (!"application/x-subrip".equals(str10) && !"text/x-ssa".equals(str10) && !"text/vtt".equals(str10) && !"application/vobsub".equals(str10) && !"application/pgs".equals(str10) && !"application/dvbsubs".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null && !map.containsKey(str12)) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i45;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z3 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i49 = (z3 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i410 = i12;
                                        int i411 = i13;
                                        int i412 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var2 = new e82(i410, i411, i412, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var2;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i49;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 2:
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str15 = "video/webm";
                                    d0a d0aVar2 = new d0a(dn8Var6.a(dn8Var6.c));
                                    try {
                                        int iS = d0aVar2.s();
                                        if (iS != 1) {
                                            if (iS == 65534) {
                                                d0aVar2.M(20);
                                                int iR = d0aVar2.r();
                                                if ((iR >> 18) == 0 && (iR == 0 || Integer.bitCount(iR) == dn8Var6.Q)) {
                                                    dn8Var6.S = iR == 0 ? -1 : iR << 2;
                                                }
                                                long jT = d0aVar2.t();
                                                UUID uuid = en8.u0;
                                                if (jT != uuid.getMostSignificantBits() || d0aVar2.t() != uuid.getLeastSignificantBits()) {
                                                }
                                                str5 = "audio/x-unknown";
                                                i6 = -1;
                                                i5 = -1;
                                                i4 = -1;
                                                i12 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                i8 = -1;
                                                str7 = null;
                                                listSingletonList = null;
                                                if (dn8Var6.P != null) {
                                                    i15 = i5;
                                                    ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                                    if (ig4VarA != null) {
                                                        str10 = "video/dolby-vision";
                                                        str7 = ig4VarA.b;
                                                    }
                                                    boolean z4 = dn8Var6.b0;
                                                    if (dn8Var6.a0) {
                                                        i16 = 2;
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    int i413 = (z4 ? 1 : 0) | i16;
                                                    qr5Var = new qr5();
                                                    if (qv8.h(str10)) {
                                                        qr5Var.I = dn8Var6.Q;
                                                        qr5Var.J = dn8Var6.S;
                                                        qr5Var.K = dn8Var6.T;
                                                        qr5Var.L = i4;
                                                    } else if (qv8.k(str10)) {
                                                        if (dn8Var6.t == 0) {
                                                            i24 = dn8Var6.r;
                                                            i17 = -1;
                                                            if (i24 == -1) {
                                                                i24 = dn8Var6.o;
                                                            }
                                                            dn8Var6.r = i24;
                                                            i25 = dn8Var6.s;
                                                            if (i25 == -1) {
                                                                i25 = dn8Var6.p;
                                                            }
                                                            dn8Var6.s = i25;
                                                        } else {
                                                            i17 = -1;
                                                        }
                                                        i18 = dn8Var6.r;
                                                        if (i18 != i17) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (i12 == -1) {
                                                            if (i13 == -1) {
                                                                i12 = dn8Var6.A;
                                                                i8 = dn8Var6.B;
                                                                i13 = dn8Var6.C;
                                                            } else {
                                                                i12 = dn8Var6.A;
                                                                i8 = dn8Var6.B;
                                                                i13 = dn8Var6.C;
                                                            }
                                                        }
                                                        int i414 = i12;
                                                        int i415 = i13;
                                                        int i416 = i8;
                                                        if (i6 != -1) {
                                                            i19 = i6;
                                                        } else {
                                                            i19 = 8;
                                                        }
                                                        if (i14 != -1) {
                                                            i21 = i14;
                                                        } else {
                                                            i20 = dn8Var6.q;
                                                            if (i20 != -1) {
                                                                i21 = i20;
                                                            } else {
                                                                i21 = 8;
                                                            }
                                                        }
                                                        if (dn8Var6.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        e82 e82Var3 = new e82(i414, i415, i416, bArr, i19, i21);
                                                        str11 = dn8Var6.b;
                                                        if (str11 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (dn8Var6.u == 0) {
                                                            i22 = iIntValue;
                                                        } else {
                                                            i22 = iIntValue;
                                                        }
                                                        qr5Var.v = dn8Var6.o;
                                                        qr5Var.w = dn8Var6.p;
                                                        qr5Var.D = f;
                                                        qr5Var.B = i22;
                                                        qr5Var.E = dn8Var6.y;
                                                        qr5Var.F = dn8Var6.z;
                                                        qr5Var.G = e82Var3;
                                                    } else if (!"application/x-subrip".equals(str10)) {
                                                        throw l0a.a(null, "Unexpected MIME type.");
                                                    }
                                                    str12 = dn8Var6.b;
                                                    if (str12 != null) {
                                                        qr5Var.b = dn8Var6.b;
                                                    }
                                                    qr5Var.a = Integer.toString(i44);
                                                    if (dn8Var6.a) {
                                                        str13 = str15;
                                                    } else {
                                                        str13 = "video/x-matroska";
                                                    }
                                                    qr5Var.n = qv8.l(str13);
                                                    qr5Var.o = qv8.l(str10);
                                                    qr5Var.p = i15;
                                                    qr5Var.d = dn8Var6.c0;
                                                    qr5Var.e = i413;
                                                    qr5Var.r = listSingletonList;
                                                    qr5Var.k = str7;
                                                    qr5Var.s = dn8Var6.n;
                                                    dn8Var6.e0 = new rr5(qr5Var);
                                                    en8Var = en8Var;
                                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                                } else {
                                                    i15 = i5;
                                                }
                                                str10 = str5;
                                                boolean z5 = dn8Var6.b0;
                                                if (dn8Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i417 = (z5 ? 1 : 0) | i16;
                                                qr5Var = new qr5();
                                                if (qv8.h(str10)) {
                                                    qr5Var.I = dn8Var6.Q;
                                                    qr5Var.J = dn8Var6.S;
                                                    qr5Var.K = dn8Var6.T;
                                                    qr5Var.L = i4;
                                                } else if (qv8.k(str10)) {
                                                    if (dn8Var6.t == 0) {
                                                        i24 = dn8Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = dn8Var6.o;
                                                        }
                                                        dn8Var6.r = i24;
                                                        i25 = dn8Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = dn8Var6.p;
                                                        }
                                                        dn8Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = dn8Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        } else {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        }
                                                    }
                                                    int i418 = i12;
                                                    int i419 = i13;
                                                    int i4110 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = dn8Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (dn8Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    e82 e82Var4 = new e82(i418, i419, i4110, bArr, i19, i21);
                                                    str11 = dn8Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dn8Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    qr5Var.v = dn8Var6.o;
                                                    qr5Var.w = dn8Var6.p;
                                                    qr5Var.D = f;
                                                    qr5Var.B = i22;
                                                    qr5Var.E = dn8Var6.y;
                                                    qr5Var.F = dn8Var6.z;
                                                    qr5Var.G = e82Var4;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw l0a.a(null, "Unexpected MIME type.");
                                                }
                                                str12 = dn8Var6.b;
                                                if (str12 != null) {
                                                    qr5Var.b = dn8Var6.b;
                                                }
                                                qr5Var.a = Integer.toString(i44);
                                                if (dn8Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                qr5Var.n = qv8.l(str13);
                                                qr5Var.o = qv8.l(str10);
                                                qr5Var.p = i15;
                                                qr5Var.d = dn8Var6.c0;
                                                qr5Var.e = i417;
                                                qr5Var.r = listSingletonList;
                                                qr5Var.k = str7;
                                                qr5Var.s = dn8Var6.n;
                                                dn8Var6.e0 = new rr5(qr5Var);
                                                en8Var = en8Var;
                                                dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                                sparseArray2.put(dn8Var6.d, dn8Var6);
                                            }
                                            xo1.V("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                            str5 = "audio/x-unknown";
                                            i6 = -1;
                                            i5 = -1;
                                            i4 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            str7 = null;
                                            listSingletonList = null;
                                            if (dn8Var6.P != null) {
                                                i15 = i5;
                                                ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                                if (ig4VarA != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = ig4VarA.b;
                                                }
                                                boolean z6 = dn8Var6.b0;
                                                if (dn8Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111 = (z6 ? 1 : 0) | i16;
                                                qr5Var = new qr5();
                                                if (qv8.h(str10)) {
                                                    qr5Var.I = dn8Var6.Q;
                                                    qr5Var.J = dn8Var6.S;
                                                    qr5Var.K = dn8Var6.T;
                                                    qr5Var.L = i4;
                                                } else if (qv8.k(str10)) {
                                                    if (dn8Var6.t == 0) {
                                                        i24 = dn8Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = dn8Var6.o;
                                                        }
                                                        dn8Var6.r = i24;
                                                        i25 = dn8Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = dn8Var6.p;
                                                        }
                                                        dn8Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = dn8Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        } else {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        }
                                                    }
                                                    int i4112 = i12;
                                                    int i4113 = i13;
                                                    int i4114 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = dn8Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (dn8Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    e82 e82Var5 = new e82(i4112, i4113, i4114, bArr, i19, i21);
                                                    str11 = dn8Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dn8Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    qr5Var.v = dn8Var6.o;
                                                    qr5Var.w = dn8Var6.p;
                                                    qr5Var.D = f;
                                                    qr5Var.B = i22;
                                                    qr5Var.E = dn8Var6.y;
                                                    qr5Var.F = dn8Var6.z;
                                                    qr5Var.G = e82Var5;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw l0a.a(null, "Unexpected MIME type.");
                                                }
                                                str12 = dn8Var6.b;
                                                if (str12 != null) {
                                                    qr5Var.b = dn8Var6.b;
                                                }
                                                qr5Var.a = Integer.toString(i44);
                                                if (dn8Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                qr5Var.n = qv8.l(str13);
                                                qr5Var.o = qv8.l(str10);
                                                qr5Var.p = i15;
                                                qr5Var.d = dn8Var6.c0;
                                                qr5Var.e = i4111;
                                                qr5Var.r = listSingletonList;
                                                qr5Var.k = str7;
                                                qr5Var.s = dn8Var6.n;
                                                dn8Var6.e0 = new rr5(qr5Var);
                                                en8Var = en8Var;
                                                dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                                sparseArray2.put(dn8Var6.d, dn8Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z7 = dn8Var6.b0;
                                            if (dn8Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i4115 = (z7 ? 1 : 0) | i16;
                                            qr5Var = new qr5();
                                            if (qv8.h(str10)) {
                                                qr5Var.I = dn8Var6.Q;
                                                qr5Var.J = dn8Var6.S;
                                                qr5Var.K = dn8Var6.T;
                                                qr5Var.L = i4;
                                            } else if (qv8.k(str10)) {
                                                if (dn8Var6.t == 0) {
                                                    i24 = dn8Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = dn8Var6.o;
                                                    }
                                                    dn8Var6.r = i24;
                                                    i25 = dn8Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = dn8Var6.p;
                                                    }
                                                    dn8Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dn8Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    } else {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    }
                                                }
                                                int i4116 = i12;
                                                int i4117 = i13;
                                                int i4118 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = dn8Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (dn8Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                e82 e82Var6 = new e82(i4116, i4117, i4118, bArr, i19, i21);
                                                str11 = dn8Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dn8Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                qr5Var.v = dn8Var6.o;
                                                qr5Var.w = dn8Var6.p;
                                                qr5Var.D = f;
                                                qr5Var.B = i22;
                                                qr5Var.E = dn8Var6.y;
                                                qr5Var.F = dn8Var6.z;
                                                qr5Var.G = e82Var6;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw l0a.a(null, "Unexpected MIME type.");
                                            }
                                            str12 = dn8Var6.b;
                                            if (str12 != null) {
                                                qr5Var.b = dn8Var6.b;
                                            }
                                            qr5Var.a = Integer.toString(i44);
                                            if (dn8Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            qr5Var.n = qv8.l(str13);
                                            qr5Var.o = qv8.l(str10);
                                            qr5Var.p = i15;
                                            qr5Var.d = dn8Var6.c0;
                                            qr5Var.e = i4115;
                                            qr5Var.r = listSingletonList;
                                            qr5Var.k = str7;
                                            qr5Var.s = dn8Var6.n;
                                            dn8Var6.e0 = new rr5(qr5Var);
                                            en8Var = en8Var;
                                            dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                            sparseArray2.put(dn8Var6.d, dn8Var6);
                                            break;
                                        }
                                        int i50 = dn8Var6.R;
                                        String str18 = pqf.a;
                                        int iW2 = pqf.w(i50, ByteOrder.LITTLE_ENDIAN);
                                        if (iW2 == 0) {
                                            xo1.V("MatroskaExtractor", "Unsupported PCM bit depth: " + dn8Var6.R + ". Setting mimeType to audio/x-unknown");
                                            str5 = "audio/x-unknown";
                                            i6 = -1;
                                            i5 = -1;
                                            i4 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            str7 = null;
                                            listSingletonList = null;
                                            if (dn8Var6.P != null) {
                                                i15 = i5;
                                                ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                                if (ig4VarA != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = ig4VarA.b;
                                                }
                                                boolean z8 = dn8Var6.b0;
                                                if (dn8Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4119 = (z8 ? 1 : 0) | i16;
                                                qr5Var = new qr5();
                                                if (qv8.h(str10)) {
                                                    qr5Var.I = dn8Var6.Q;
                                                    qr5Var.J = dn8Var6.S;
                                                    qr5Var.K = dn8Var6.T;
                                                    qr5Var.L = i4;
                                                } else if (qv8.k(str10)) {
                                                    if (dn8Var6.t == 0) {
                                                        i24 = dn8Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = dn8Var6.o;
                                                        }
                                                        dn8Var6.r = i24;
                                                        i25 = dn8Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = dn8Var6.p;
                                                        }
                                                        dn8Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = dn8Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        } else {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        }
                                                    }
                                                    int i41110 = i12;
                                                    int i41111 = i13;
                                                    int i41112 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = dn8Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (dn8Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    e82 e82Var7 = new e82(i41110, i41111, i41112, bArr, i19, i21);
                                                    str11 = dn8Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dn8Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    qr5Var.v = dn8Var6.o;
                                                    qr5Var.w = dn8Var6.p;
                                                    qr5Var.D = f;
                                                    qr5Var.B = i22;
                                                    qr5Var.E = dn8Var6.y;
                                                    qr5Var.F = dn8Var6.z;
                                                    qr5Var.G = e82Var7;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw l0a.a(null, "Unexpected MIME type.");
                                                }
                                                str12 = dn8Var6.b;
                                                if (str12 != null) {
                                                    qr5Var.b = dn8Var6.b;
                                                }
                                                qr5Var.a = Integer.toString(i44);
                                                if (dn8Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                qr5Var.n = qv8.l(str13);
                                                qr5Var.o = qv8.l(str10);
                                                qr5Var.p = i15;
                                                qr5Var.d = dn8Var6.c0;
                                                qr5Var.e = i4119;
                                                qr5Var.r = listSingletonList;
                                                qr5Var.k = str7;
                                                qr5Var.s = dn8Var6.n;
                                                dn8Var6.e0 = new rr5(qr5Var);
                                                en8Var = en8Var;
                                                dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                                sparseArray2.put(dn8Var6.d, dn8Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z9 = dn8Var6.b0;
                                            if (dn8Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41113 = (z9 ? 1 : 0) | i16;
                                            qr5Var = new qr5();
                                            if (qv8.h(str10)) {
                                                qr5Var.I = dn8Var6.Q;
                                                qr5Var.J = dn8Var6.S;
                                                qr5Var.K = dn8Var6.T;
                                                qr5Var.L = i4;
                                            } else if (qv8.k(str10)) {
                                                if (dn8Var6.t == 0) {
                                                    i24 = dn8Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = dn8Var6.o;
                                                    }
                                                    dn8Var6.r = i24;
                                                    i25 = dn8Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = dn8Var6.p;
                                                    }
                                                    dn8Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dn8Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    } else {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    }
                                                }
                                                int i41114 = i12;
                                                int i41115 = i13;
                                                int i41116 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = dn8Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (dn8Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                e82 e82Var8 = new e82(i41114, i41115, i41116, bArr, i19, i21);
                                                str11 = dn8Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dn8Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                qr5Var.v = dn8Var6.o;
                                                qr5Var.w = dn8Var6.p;
                                                qr5Var.D = f;
                                                qr5Var.B = i22;
                                                qr5Var.E = dn8Var6.y;
                                                qr5Var.F = dn8Var6.z;
                                                qr5Var.G = e82Var8;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw l0a.a(null, "Unexpected MIME type.");
                                            }
                                            str12 = dn8Var6.b;
                                            if (str12 != null) {
                                                qr5Var.b = dn8Var6.b;
                                            }
                                            qr5Var.a = Integer.toString(i44);
                                            if (dn8Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            qr5Var.n = qv8.l(str13);
                                            qr5Var.o = qv8.l(str10);
                                            qr5Var.p = i15;
                                            qr5Var.d = dn8Var6.c0;
                                            qr5Var.e = i41113;
                                            qr5Var.r = listSingletonList;
                                            qr5Var.k = str7;
                                            qr5Var.s = dn8Var6.n;
                                            dn8Var6.e0 = new rr5(qr5Var);
                                            en8Var = en8Var;
                                            dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                            sparseArray2.put(dn8Var6.d, dn8Var6);
                                        } else {
                                            i4 = iW2;
                                            str5 = "audio/raw";
                                            i6 = -1;
                                            i5 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            str7 = null;
                                            listSingletonList = null;
                                            if (dn8Var6.P != null) {
                                                i15 = i5;
                                                ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                                if (ig4VarA != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = ig4VarA.b;
                                                }
                                                boolean z10 = dn8Var6.b0;
                                                if (dn8Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i41117 = (z10 ? 1 : 0) | i16;
                                                qr5Var = new qr5();
                                                if (qv8.h(str10)) {
                                                    qr5Var.I = dn8Var6.Q;
                                                    qr5Var.J = dn8Var6.S;
                                                    qr5Var.K = dn8Var6.T;
                                                    qr5Var.L = i4;
                                                } else if (qv8.k(str10)) {
                                                    if (dn8Var6.t == 0) {
                                                        i24 = dn8Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = dn8Var6.o;
                                                        }
                                                        dn8Var6.r = i24;
                                                        i25 = dn8Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = dn8Var6.p;
                                                        }
                                                        dn8Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = dn8Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        } else {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        }
                                                    }
                                                    int i41118 = i12;
                                                    int i41119 = i13;
                                                    int i411110 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = dn8Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (dn8Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    e82 e82Var9 = new e82(i41118, i41119, i411110, bArr, i19, i21);
                                                    str11 = dn8Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dn8Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    qr5Var.v = dn8Var6.o;
                                                    qr5Var.w = dn8Var6.p;
                                                    qr5Var.D = f;
                                                    qr5Var.B = i22;
                                                    qr5Var.E = dn8Var6.y;
                                                    qr5Var.F = dn8Var6.z;
                                                    qr5Var.G = e82Var9;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw l0a.a(null, "Unexpected MIME type.");
                                                }
                                                str12 = dn8Var6.b;
                                                if (str12 != null) {
                                                    qr5Var.b = dn8Var6.b;
                                                }
                                                qr5Var.a = Integer.toString(i44);
                                                if (dn8Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                qr5Var.n = qv8.l(str13);
                                                qr5Var.o = qv8.l(str10);
                                                qr5Var.p = i15;
                                                qr5Var.d = dn8Var6.c0;
                                                qr5Var.e = i41117;
                                                qr5Var.r = listSingletonList;
                                                qr5Var.k = str7;
                                                qr5Var.s = dn8Var6.n;
                                                dn8Var6.e0 = new rr5(qr5Var);
                                                en8Var = en8Var;
                                                dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                                sparseArray2.put(dn8Var6.d, dn8Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z11 = dn8Var6.b0;
                                            if (dn8Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i411111 = (z11 ? 1 : 0) | i16;
                                            qr5Var = new qr5();
                                            if (qv8.h(str10)) {
                                                qr5Var.I = dn8Var6.Q;
                                                qr5Var.J = dn8Var6.S;
                                                qr5Var.K = dn8Var6.T;
                                                qr5Var.L = i4;
                                            } else if (qv8.k(str10)) {
                                                if (dn8Var6.t == 0) {
                                                    i24 = dn8Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = dn8Var6.o;
                                                    }
                                                    dn8Var6.r = i24;
                                                    i25 = dn8Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = dn8Var6.p;
                                                    }
                                                    dn8Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dn8Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    } else {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    }
                                                }
                                                int i411112 = i12;
                                                int i411113 = i13;
                                                int i411114 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = dn8Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (dn8Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                e82 e82Var10 = new e82(i411112, i411113, i411114, bArr, i19, i21);
                                                str11 = dn8Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dn8Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                qr5Var.v = dn8Var6.o;
                                                qr5Var.w = dn8Var6.p;
                                                qr5Var.D = f;
                                                qr5Var.B = i22;
                                                qr5Var.E = dn8Var6.y;
                                                qr5Var.F = dn8Var6.z;
                                                qr5Var.G = e82Var10;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw l0a.a(null, "Unexpected MIME type.");
                                            }
                                            str12 = dn8Var6.b;
                                            if (str12 != null) {
                                                qr5Var.b = dn8Var6.b;
                                            }
                                            qr5Var.a = Integer.toString(i44);
                                            if (dn8Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            qr5Var.n = qv8.l(str13);
                                            qr5Var.o = qv8.l(str10);
                                            qr5Var.p = i15;
                                            qr5Var.d = dn8Var6.c0;
                                            qr5Var.e = i411111;
                                            qr5Var.r = listSingletonList;
                                            qr5Var.k = str7;
                                            qr5Var.s = dn8Var6.n;
                                            dn8Var6.e0 = new rr5(qr5Var);
                                            en8Var = en8Var;
                                            dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                            sparseArray2.put(dn8Var6.d, dn8Var6);
                                        }
                                    } catch (ArrayIndexOutOfBoundsException unused) {
                                        throw l0a.a(null, "Error parsing MS/ACM codec private");
                                    }
                                    break;
                                case 3:
                                    str15 = "video/webm";
                                    dn8Var6.W = new o5f();
                                    str17 = "audio/true-hd";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z12 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411115 = (z12 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411116 = i12;
                                            int i411117 = i13;
                                            int i411118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11 = new e82(i411116, i411117, i411118, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i411115;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z13 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411119 = (z13 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i4111110 = i12;
                                        int i4111111 = i13;
                                        int i4111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var12 = new e82(i4111110, i4111111, i4111112, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var12;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i411119;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 4:
                                    byte[] bArrA = dn8Var6.a(str16);
                                    try {
                                        r5 = bArrA[0];
                                        try {
                                            if (r5 != 2) {
                                                throw l0a.a(null, "Error parsing vorbis codec private");
                                            }
                                            int i51 = 1;
                                            int i52 = 0;
                                            while (true) {
                                                int i53 = i51;
                                                int i54 = bArrA[i51] & 255;
                                                if (i54 != 255) {
                                                    int i55 = i53 + 1;
                                                    int i56 = i52 + i54;
                                                    int i57 = 0;
                                                    while (true) {
                                                        int i58 = bArrA[i55] & 255;
                                                        if (i58 != 255) {
                                                            int i59 = i55 + 1;
                                                            int i60 = i57 + i58;
                                                            if (bArrA[i59] != 1) {
                                                                throw l0a.a(null, "Error parsing vorbis codec private");
                                                            }
                                                            byte[] bArr4 = new byte[i56];
                                                            System.arraycopy(bArrA, i59, bArr4, 0, i56);
                                                            int i61 = i59 + i56;
                                                            if (bArrA[i61] != 3) {
                                                                throw l0a.a(null, "Error parsing vorbis codec private");
                                                            }
                                                            int i62 = i61 + i60;
                                                            if (bArrA[i62] != 5) {
                                                                throw l0a.a(null, "Error parsing vorbis codec private");
                                                            }
                                                            byte[] bArr5 = new byte[bArrA.length - i62];
                                                            System.arraycopy(bArrA, i62, bArr5, 0, bArrA.length - i62);
                                                            ArrayList arrayList2 = new ArrayList(2);
                                                            arrayList2.add(bArr4);
                                                            arrayList2.add(bArr5);
                                                            str3 = "audio/vorbis";
                                                            i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                                            listSingletonList = arrayList2;
                                                            str5 = str3;
                                                            i6 = -1;
                                                            i4 = -1;
                                                            i12 = -1;
                                                            i13 = -1;
                                                            i14 = -1;
                                                            i8 = -1;
                                                            str7 = null;
                                                            if (dn8Var6.P != null) {
                                                                i15 = i5;
                                                                ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                                                if (ig4VarA != null) {
                                                                    str10 = "video/dolby-vision";
                                                                    str7 = ig4VarA.b;
                                                                }
                                                                boolean z14 = dn8Var6.b0;
                                                                if (dn8Var6.a0) {
                                                                    i16 = 2;
                                                                } else {
                                                                    i16 = 0;
                                                                }
                                                                int i4111113 = (z14 ? 1 : 0) | i16;
                                                                qr5Var = new qr5();
                                                                if (qv8.h(str10)) {
                                                                    qr5Var.I = dn8Var6.Q;
                                                                    qr5Var.J = dn8Var6.S;
                                                                    qr5Var.K = dn8Var6.T;
                                                                    qr5Var.L = i4;
                                                                } else if (qv8.k(str10)) {
                                                                    if (dn8Var6.t == 0) {
                                                                        i24 = dn8Var6.r;
                                                                        i17 = -1;
                                                                        if (i24 == -1) {
                                                                            i24 = dn8Var6.o;
                                                                        }
                                                                        dn8Var6.r = i24;
                                                                        i25 = dn8Var6.s;
                                                                        if (i25 == -1) {
                                                                            i25 = dn8Var6.p;
                                                                        }
                                                                        dn8Var6.s = i25;
                                                                    } else {
                                                                        i17 = -1;
                                                                    }
                                                                    i18 = dn8Var6.r;
                                                                    if (i18 != i17) {
                                                                        f = -1.0f;
                                                                    } else {
                                                                        f = -1.0f;
                                                                    }
                                                                    if (i12 == -1) {
                                                                        if (i13 == -1) {
                                                                            i12 = dn8Var6.A;
                                                                            i8 = dn8Var6.B;
                                                                            i13 = dn8Var6.C;
                                                                        } else {
                                                                            i12 = dn8Var6.A;
                                                                            i8 = dn8Var6.B;
                                                                            i13 = dn8Var6.C;
                                                                        }
                                                                    }
                                                                    int i4111114 = i12;
                                                                    int i4111115 = i13;
                                                                    int i4111116 = i8;
                                                                    if (i6 != -1) {
                                                                        i19 = i6;
                                                                    } else {
                                                                        i19 = 8;
                                                                    }
                                                                    if (i14 != -1) {
                                                                        i21 = i14;
                                                                    } else {
                                                                        i20 = dn8Var6.q;
                                                                        if (i20 != -1) {
                                                                            i21 = i20;
                                                                        } else {
                                                                            i21 = 8;
                                                                        }
                                                                    }
                                                                    if (dn8Var6.F != -1.0f) {
                                                                        bArr = null;
                                                                    } else {
                                                                        bArr = null;
                                                                    }
                                                                    e82 e82Var13 = new e82(i4111114, i4111115, i4111116, bArr, i19, i21);
                                                                    str11 = dn8Var6.b;
                                                                    if (str11 == null) {
                                                                        iIntValue = -1;
                                                                    } else {
                                                                        iIntValue = -1;
                                                                    }
                                                                    if (dn8Var6.u == 0) {
                                                                        i22 = iIntValue;
                                                                    } else {
                                                                        i22 = iIntValue;
                                                                    }
                                                                    qr5Var.v = dn8Var6.o;
                                                                    qr5Var.w = dn8Var6.p;
                                                                    qr5Var.D = f;
                                                                    qr5Var.B = i22;
                                                                    qr5Var.E = dn8Var6.y;
                                                                    qr5Var.F = dn8Var6.z;
                                                                    qr5Var.G = e82Var13;
                                                                } else if (!"application/x-subrip".equals(str10)) {
                                                                    throw l0a.a(null, "Unexpected MIME type.");
                                                                }
                                                                str12 = dn8Var6.b;
                                                                if (str12 != null) {
                                                                    qr5Var.b = dn8Var6.b;
                                                                }
                                                                qr5Var.a = Integer.toString(i44);
                                                                if (dn8Var6.a) {
                                                                    str13 = str15;
                                                                } else {
                                                                    str13 = "video/x-matroska";
                                                                }
                                                                qr5Var.n = qv8.l(str13);
                                                                qr5Var.o = qv8.l(str10);
                                                                qr5Var.p = i15;
                                                                qr5Var.d = dn8Var6.c0;
                                                                qr5Var.e = i4111113;
                                                                qr5Var.r = listSingletonList;
                                                                qr5Var.k = str7;
                                                                qr5Var.s = dn8Var6.n;
                                                                dn8Var6.e0 = new rr5(qr5Var);
                                                                en8Var = en8Var;
                                                                dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                                                sparseArray2.put(dn8Var6.d, dn8Var6);
                                                            } else {
                                                                i15 = i5;
                                                            }
                                                            str10 = str5;
                                                            boolean z15 = dn8Var6.b0;
                                                            if (dn8Var6.a0) {
                                                                i16 = 2;
                                                            } else {
                                                                i16 = 0;
                                                            }
                                                            int i4111117 = (z15 ? 1 : 0) | i16;
                                                            qr5Var = new qr5();
                                                            if (qv8.h(str10)) {
                                                                qr5Var.I = dn8Var6.Q;
                                                                qr5Var.J = dn8Var6.S;
                                                                qr5Var.K = dn8Var6.T;
                                                                qr5Var.L = i4;
                                                            } else if (qv8.k(str10)) {
                                                                if (dn8Var6.t == 0) {
                                                                    i24 = dn8Var6.r;
                                                                    i17 = -1;
                                                                    if (i24 == -1) {
                                                                        i24 = dn8Var6.o;
                                                                    }
                                                                    dn8Var6.r = i24;
                                                                    i25 = dn8Var6.s;
                                                                    if (i25 == -1) {
                                                                        i25 = dn8Var6.p;
                                                                    }
                                                                    dn8Var6.s = i25;
                                                                } else {
                                                                    i17 = -1;
                                                                }
                                                                i18 = dn8Var6.r;
                                                                if (i18 != i17) {
                                                                    f = -1.0f;
                                                                } else {
                                                                    f = -1.0f;
                                                                }
                                                                if (i12 == -1) {
                                                                    if (i13 == -1) {
                                                                        i12 = dn8Var6.A;
                                                                        i8 = dn8Var6.B;
                                                                        i13 = dn8Var6.C;
                                                                    } else {
                                                                        i12 = dn8Var6.A;
                                                                        i8 = dn8Var6.B;
                                                                        i13 = dn8Var6.C;
                                                                    }
                                                                }
                                                                int i4111118 = i12;
                                                                int i4111119 = i13;
                                                                int i41111110 = i8;
                                                                if (i6 != -1) {
                                                                    i19 = i6;
                                                                } else {
                                                                    i19 = 8;
                                                                }
                                                                if (i14 != -1) {
                                                                    i21 = i14;
                                                                } else {
                                                                    i20 = dn8Var6.q;
                                                                    if (i20 != -1) {
                                                                        i21 = i20;
                                                                    } else {
                                                                        i21 = 8;
                                                                    }
                                                                }
                                                                if (dn8Var6.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                e82 e82Var14 = new e82(i4111118, i4111119, i41111110, bArr, i19, i21);
                                                                str11 = dn8Var6.b;
                                                                if (str11 == null) {
                                                                    iIntValue = -1;
                                                                } else {
                                                                    iIntValue = -1;
                                                                }
                                                                if (dn8Var6.u == 0) {
                                                                    i22 = iIntValue;
                                                                } else {
                                                                    i22 = iIntValue;
                                                                }
                                                                qr5Var.v = dn8Var6.o;
                                                                qr5Var.w = dn8Var6.p;
                                                                qr5Var.D = f;
                                                                qr5Var.B = i22;
                                                                qr5Var.E = dn8Var6.y;
                                                                qr5Var.F = dn8Var6.z;
                                                                qr5Var.G = e82Var14;
                                                            } else if (!"application/x-subrip".equals(str10)) {
                                                                throw l0a.a(null, "Unexpected MIME type.");
                                                            }
                                                            str12 = dn8Var6.b;
                                                            if (str12 != null) {
                                                                qr5Var.b = dn8Var6.b;
                                                            }
                                                            qr5Var.a = Integer.toString(i44);
                                                            if (dn8Var6.a) {
                                                                str13 = str15;
                                                            } else {
                                                                str13 = "video/x-matroska";
                                                            }
                                                            qr5Var.n = qv8.l(str13);
                                                            qr5Var.o = qv8.l(str10);
                                                            qr5Var.p = i15;
                                                            qr5Var.d = dn8Var6.c0;
                                                            qr5Var.e = i4111117;
                                                            qr5Var.r = listSingletonList;
                                                            qr5Var.k = str7;
                                                            qr5Var.s = dn8Var6.n;
                                                            dn8Var6.e0 = new rr5(qr5Var);
                                                            en8Var = en8Var;
                                                            dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                                            sparseArray2.put(dn8Var6.d, dn8Var6);
                                                        } else {
                                                            i57 += 255;
                                                            i55++;
                                                        }
                                                    }
                                                } else {
                                                    i52 += 255;
                                                    i51 = i53 + 1;
                                                }
                                                break;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException unused2) {
                                        }
                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                        r5 = 0;
                                    }
                                    throw l0a.a(r5, "Error parsing vorbis codec private");
                                case 5:
                                    str4 = "audio/mpeg-L2";
                                    en8Var = en8Var;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = str4;
                                    i6 = -1;
                                    i5 = 4096;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z16 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111 = (z16 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i41111112 = i12;
                                            int i41111113 = i13;
                                            int i41111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var15 = new e82(i41111112, i41111113, i41111114, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var15;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i41111111;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z17 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111115 = (z17 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i41111116 = i12;
                                        int i41111117 = i13;
                                        int i41111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var16 = new e82(i41111116, i41111117, i41111118, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var16;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i41111115;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 6:
                                    str4 = "audio/mpeg";
                                    en8Var = en8Var;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = str4;
                                    i6 = -1;
                                    i5 = 4096;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z18 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111119 = (z18 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111110 = i12;
                                            int i411111111 = i13;
                                            int i411111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var17 = new e82(i411111110, i411111111, i411111112, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var17;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i41111119;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z19 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111113 = (z19 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i411111114 = i12;
                                        int i411111115 = i13;
                                        int i411111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var18 = new e82(i411111114, i411111115, i411111116, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var18;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i411111113;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 7:
                                    d0a d0aVar3 = new d0a(dn8Var6.a(dn8Var6.c));
                                    try {
                                        d0aVar3.N(16);
                                        long jQ = d0aVar3.q();
                                        try {
                                            if (jQ == 1482049860) {
                                                pair = new Pair("video/divx", null);
                                            } else if (jQ != 859189832) {
                                                if (jQ == 826496599) {
                                                    int i63 = d0aVar3.b + 20;
                                                    byte[] bArr6 = d0aVar3.a;
                                                    while (true) {
                                                        if (i63 >= bArr6.length - 4) {
                                                            throw l0a.a(null, "Failed to find FourCC VC1 initialization data");
                                                        }
                                                        if (bArr6[i63] == 0 && bArr6[i63 + 1] == 0 && bArr6[i63 + 2] == 1) {
                                                            if (bArr6[i63 + 3] == 15) {
                                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr6, i63, bArr6.length)));
                                                            }
                                                        }
                                                        i63++;
                                                    }
                                                } else {
                                                    xo1.V("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str6 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                }
                                                str7 = str6;
                                                str5 = (String) pair.first;
                                                listSingletonList = (List) pair.second;
                                                i6 = -1;
                                                i5 = -1;
                                                i4 = -1;
                                                i12 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                i8 = -1;
                                                if (dn8Var6.P != null) {
                                                    i15 = i5;
                                                    ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                                    if (ig4VarA != null) {
                                                        str10 = "video/dolby-vision";
                                                        str7 = ig4VarA.b;
                                                    }
                                                    boolean z110 = dn8Var6.b0;
                                                    if (dn8Var6.a0) {
                                                        i16 = 2;
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    int i411111117 = (z110 ? 1 : 0) | i16;
                                                    qr5Var = new qr5();
                                                    if (qv8.h(str10)) {
                                                        qr5Var.I = dn8Var6.Q;
                                                        qr5Var.J = dn8Var6.S;
                                                        qr5Var.K = dn8Var6.T;
                                                        qr5Var.L = i4;
                                                    } else if (qv8.k(str10)) {
                                                        if (dn8Var6.t == 0) {
                                                            i24 = dn8Var6.r;
                                                            i17 = -1;
                                                            if (i24 == -1) {
                                                                i24 = dn8Var6.o;
                                                            }
                                                            dn8Var6.r = i24;
                                                            i25 = dn8Var6.s;
                                                            if (i25 == -1) {
                                                                i25 = dn8Var6.p;
                                                            }
                                                            dn8Var6.s = i25;
                                                        } else {
                                                            i17 = -1;
                                                        }
                                                        i18 = dn8Var6.r;
                                                        if (i18 != i17) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (i12 == -1) {
                                                            if (i13 == -1) {
                                                                i12 = dn8Var6.A;
                                                                i8 = dn8Var6.B;
                                                                i13 = dn8Var6.C;
                                                            } else {
                                                                i12 = dn8Var6.A;
                                                                i8 = dn8Var6.B;
                                                                i13 = dn8Var6.C;
                                                            }
                                                        }
                                                        int i411111118 = i12;
                                                        int i411111119 = i13;
                                                        int i4111111110 = i8;
                                                        if (i6 != -1) {
                                                            i19 = i6;
                                                        } else {
                                                            i19 = 8;
                                                        }
                                                        if (i14 != -1) {
                                                            i21 = i14;
                                                        } else {
                                                            i20 = dn8Var6.q;
                                                            if (i20 != -1) {
                                                                i21 = i20;
                                                            } else {
                                                                i21 = 8;
                                                            }
                                                        }
                                                        if (dn8Var6.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        e82 e82Var19 = new e82(i411111118, i411111119, i4111111110, bArr, i19, i21);
                                                        str11 = dn8Var6.b;
                                                        if (str11 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (dn8Var6.u == 0) {
                                                            i22 = iIntValue;
                                                        } else {
                                                            i22 = iIntValue;
                                                        }
                                                        qr5Var.v = dn8Var6.o;
                                                        qr5Var.w = dn8Var6.p;
                                                        qr5Var.D = f;
                                                        qr5Var.B = i22;
                                                        qr5Var.E = dn8Var6.y;
                                                        qr5Var.F = dn8Var6.z;
                                                        qr5Var.G = e82Var19;
                                                    } else if (!"application/x-subrip".equals(str10)) {
                                                        throw l0a.a(null, "Unexpected MIME type.");
                                                    }
                                                    str12 = dn8Var6.b;
                                                    if (str12 != null) {
                                                        qr5Var.b = dn8Var6.b;
                                                    }
                                                    qr5Var.a = Integer.toString(i44);
                                                    if (dn8Var6.a) {
                                                        str13 = str15;
                                                    } else {
                                                        str13 = "video/x-matroska";
                                                    }
                                                    qr5Var.n = qv8.l(str13);
                                                    qr5Var.o = qv8.l(str10);
                                                    qr5Var.p = i15;
                                                    qr5Var.d = dn8Var6.c0;
                                                    qr5Var.e = i411111117;
                                                    qr5Var.r = listSingletonList;
                                                    qr5Var.k = str7;
                                                    qr5Var.s = dn8Var6.n;
                                                    dn8Var6.e0 = new rr5(qr5Var);
                                                    en8Var = en8Var;
                                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                                } else {
                                                    i15 = i5;
                                                }
                                                str10 = str5;
                                                boolean z111 = dn8Var6.b0;
                                                if (dn8Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111111111 = (z111 ? 1 : 0) | i16;
                                                qr5Var = new qr5();
                                                if (qv8.h(str10)) {
                                                    qr5Var.I = dn8Var6.Q;
                                                    qr5Var.J = dn8Var6.S;
                                                    qr5Var.K = dn8Var6.T;
                                                    qr5Var.L = i4;
                                                } else if (qv8.k(str10)) {
                                                    if (dn8Var6.t == 0) {
                                                        i24 = dn8Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = dn8Var6.o;
                                                        }
                                                        dn8Var6.r = i24;
                                                        i25 = dn8Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = dn8Var6.p;
                                                        }
                                                        dn8Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = dn8Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        } else {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        }
                                                    }
                                                    int i4111111112 = i12;
                                                    int i4111111113 = i13;
                                                    int i4111111114 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = dn8Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (dn8Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    e82 e82Var110 = new e82(i4111111112, i4111111113, i4111111114, bArr, i19, i21);
                                                    str11 = dn8Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dn8Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    qr5Var.v = dn8Var6.o;
                                                    qr5Var.w = dn8Var6.p;
                                                    qr5Var.D = f;
                                                    qr5Var.B = i22;
                                                    qr5Var.E = dn8Var6.y;
                                                    qr5Var.F = dn8Var6.z;
                                                    qr5Var.G = e82Var110;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw l0a.a(null, "Unexpected MIME type.");
                                                }
                                                str12 = dn8Var6.b;
                                                if (str12 != null) {
                                                    qr5Var.b = dn8Var6.b;
                                                }
                                                qr5Var.a = Integer.toString(i44);
                                                if (dn8Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                qr5Var.n = qv8.l(str13);
                                                qr5Var.o = qv8.l(str10);
                                                qr5Var.p = i15;
                                                qr5Var.d = dn8Var6.c0;
                                                qr5Var.e = i4111111111;
                                                qr5Var.r = listSingletonList;
                                                qr5Var.k = str7;
                                                qr5Var.s = dn8Var6.n;
                                                dn8Var6.e0 = new rr5(qr5Var);
                                                en8Var = en8Var;
                                                dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                                sparseArray2.put(dn8Var6.d, dn8Var6);
                                            } else {
                                                pair = new Pair("video/3gpp", null);
                                            }
                                            str6 = null;
                                            str7 = str6;
                                            str5 = (String) pair.first;
                                            listSingletonList = (List) pair.second;
                                            i6 = -1;
                                            i5 = -1;
                                            i4 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            if (dn8Var6.P != null) {
                                                i15 = i5;
                                                ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                                if (ig4VarA != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = ig4VarA.b;
                                                }
                                                boolean z112 = dn8Var6.b0;
                                                if (dn8Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111111115 = (z112 ? 1 : 0) | i16;
                                                qr5Var = new qr5();
                                                if (qv8.h(str10)) {
                                                    qr5Var.I = dn8Var6.Q;
                                                    qr5Var.J = dn8Var6.S;
                                                    qr5Var.K = dn8Var6.T;
                                                    qr5Var.L = i4;
                                                } else if (qv8.k(str10)) {
                                                    if (dn8Var6.t == 0) {
                                                        i24 = dn8Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = dn8Var6.o;
                                                        }
                                                        dn8Var6.r = i24;
                                                        i25 = dn8Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = dn8Var6.p;
                                                        }
                                                        dn8Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = dn8Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        } else {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        }
                                                    }
                                                    int i4111111116 = i12;
                                                    int i4111111117 = i13;
                                                    int i4111111118 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = dn8Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (dn8Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    e82 e82Var111 = new e82(i4111111116, i4111111117, i4111111118, bArr, i19, i21);
                                                    str11 = dn8Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dn8Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    qr5Var.v = dn8Var6.o;
                                                    qr5Var.w = dn8Var6.p;
                                                    qr5Var.D = f;
                                                    qr5Var.B = i22;
                                                    qr5Var.E = dn8Var6.y;
                                                    qr5Var.F = dn8Var6.z;
                                                    qr5Var.G = e82Var111;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw l0a.a(null, "Unexpected MIME type.");
                                                }
                                                str12 = dn8Var6.b;
                                                if (str12 != null) {
                                                    qr5Var.b = dn8Var6.b;
                                                }
                                                qr5Var.a = Integer.toString(i44);
                                                if (dn8Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                qr5Var.n = qv8.l(str13);
                                                qr5Var.o = qv8.l(str10);
                                                qr5Var.p = i15;
                                                qr5Var.d = dn8Var6.c0;
                                                qr5Var.e = i4111111115;
                                                qr5Var.r = listSingletonList;
                                                qr5Var.k = str7;
                                                qr5Var.s = dn8Var6.n;
                                                dn8Var6.e0 = new rr5(qr5Var);
                                                en8Var = en8Var;
                                                dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                                sparseArray2.put(dn8Var6.d, dn8Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z113 = dn8Var6.b0;
                                            if (dn8Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i4111111119 = (z113 ? 1 : 0) | i16;
                                            qr5Var = new qr5();
                                            if (qv8.h(str10)) {
                                                qr5Var.I = dn8Var6.Q;
                                                qr5Var.J = dn8Var6.S;
                                                qr5Var.K = dn8Var6.T;
                                                qr5Var.L = i4;
                                            } else if (qv8.k(str10)) {
                                                if (dn8Var6.t == 0) {
                                                    i24 = dn8Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = dn8Var6.o;
                                                    }
                                                    dn8Var6.r = i24;
                                                    i25 = dn8Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = dn8Var6.p;
                                                    }
                                                    dn8Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dn8Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    } else {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    }
                                                }
                                                int i41111111110 = i12;
                                                int i41111111111 = i13;
                                                int i41111111112 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = dn8Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (dn8Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                e82 e82Var112 = new e82(i41111111110, i41111111111, i41111111112, bArr, i19, i21);
                                                str11 = dn8Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dn8Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                qr5Var.v = dn8Var6.o;
                                                qr5Var.w = dn8Var6.p;
                                                qr5Var.D = f;
                                                qr5Var.B = i22;
                                                qr5Var.E = dn8Var6.y;
                                                qr5Var.F = dn8Var6.z;
                                                qr5Var.G = e82Var112;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw l0a.a(null, "Unexpected MIME type.");
                                            }
                                            str12 = dn8Var6.b;
                                            if (str12 != null) {
                                                qr5Var.b = dn8Var6.b;
                                            }
                                            qr5Var.a = Integer.toString(i44);
                                            if (dn8Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            qr5Var.n = qv8.l(str13);
                                            qr5Var.o = qv8.l(str10);
                                            qr5Var.p = i15;
                                            qr5Var.d = dn8Var6.c0;
                                            qr5Var.e = i4111111119;
                                            qr5Var.r = listSingletonList;
                                            qr5Var.k = str7;
                                            qr5Var.s = dn8Var6.n;
                                            dn8Var6.e0 = new rr5(qr5Var);
                                            en8Var = en8Var;
                                            dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                            sparseArray2.put(dn8Var6.d, dn8Var6);
                                        } catch (ArrayIndexOutOfBoundsException unused4) {
                                            throw l0a.a(r6, "Error parsing FourCC private data");
                                        }
                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                        r6 = 0;
                                    }
                                    break;
                                case 8:
                                    byte[] bArr7 = new byte[4];
                                    System.arraycopy(dn8Var6.a(str16), 0, bArr7, 0, 4);
                                    listSingletonList = jy6.s(bArr7);
                                    str5 = "application/dvbsubs";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z114 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111113 = (z114 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i41111111114 = i12;
                                            int i41111111115 = i13;
                                            int i41111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var113 = new e82(i41111111114, i41111111115, i41111111116, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i41111111113;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z115 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111117 = (z115 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i41111111118 = i12;
                                        int i41111111119 = i13;
                                        int i411111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var114 = new e82(i41111111118, i41111111119, i411111111110, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i41111111117;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    fr0 fr0VarA = fr0.a(new d0a(dn8Var6.a(dn8Var6.c)));
                                    ArrayList arrayList3 = fr0VarA.a;
                                    dn8Var6.f0 = fr0VarA.b;
                                    str8 = fr0VarA.l;
                                    i7 = fr0VarA.g;
                                    i8 = fr0VarA.i;
                                    list = arrayList3;
                                    i9 = fr0VarA.h;
                                    i10 = fr0VarA.e;
                                    i11 = fr0VarA.f;
                                    str9 = "video/avc";
                                    i13 = i9;
                                    str5 = str9;
                                    i12 = i7;
                                    listSingletonList = list;
                                    i14 = i11;
                                    i6 = i10;
                                    str7 = str8;
                                    i5 = -1;
                                    i4 = -1;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z116 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111 = (z116 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111112 = i12;
                                            int i411111111113 = i13;
                                            int i411111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var115 = new e82(i411111111112, i411111111113, i411111111114, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i411111111111;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z117 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111115 = (z117 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i411111111116 = i12;
                                        int i411111111117 = i13;
                                        int i411111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var116 = new e82(i411111111116, i411111111117, i411111111118, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i411111111115;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                    listSingletonList = jy6.s(dn8Var6.a(str16));
                                    str5 = "application/vobsub";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z118 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111119 = (z118 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i4111111111110 = i12;
                                            int i4111111111111 = i13;
                                            int i4111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var117 = new e82(i4111111111110, i4111111111111, i4111111111112, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i411111111119;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z119 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111113 = (z119 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i4111111111114 = i12;
                                        int i4111111111115 = i13;
                                        int i4111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var118 = new e82(i4111111111114, i4111111111115, i4111111111116, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i4111111111113;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    str15 = "video/webm";
                                    str17 = "audio/vnd.dts.hd";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z1110 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111117 = (z1110 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i4111111111118 = i12;
                                            int i4111111111119 = i13;
                                            int i41111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var119 = new e82(i4111111111118, i4111111111119, i41111111111110, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i4111111111117;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111 = (z1111 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i41111111111112 = i12;
                                        int i41111111111113 = i13;
                                        int i41111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var1110 = new e82(i41111111111112, i41111111111113, i41111111111114, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var1110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i41111111111111;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                    List listSingletonList2 = Collections.singletonList(dn8Var6.a(str16));
                                    byte[] bArr8 = dn8Var6.m;
                                    i iVarC0 = jgb.c0(new zu1(bArr8, bArr8.length), false);
                                    dn8Var6.T = iVarC0.a;
                                    dn8Var6.Q = iVarC0.b;
                                    listSingletonList = listSingletonList2;
                                    str7 = iVarC0.c;
                                    str5 = "audio/mp4a-latm";
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z1112 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111115 = (z1112 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i41111111111116 = i12;
                                            int i41111111111117 = i13;
                                            int i41111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var1111 = new e82(i41111111111116, i41111111111117, i41111111111118, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var1111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i41111111111115;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1113 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111119 = (z1113 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i411111111111110 = i12;
                                        int i411111111111111 = i13;
                                        int i411111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var1112 = new e82(i411111111111110, i411111111111111, i411111111111112, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var1112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i41111111111119;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 14:
                                    str15 = "video/webm";
                                    str17 = "audio/ac3";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z1114 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111113 = (z1114 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111111114 = i12;
                                            int i411111111111115 = i13;
                                            int i411111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var1113 = new e82(i411111111111114, i411111111111115, i411111111111116, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var1113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i411111111111113;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1115 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111117 = (z1115 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i411111111111118 = i12;
                                        int i411111111111119 = i13;
                                        int i4111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var1114 = new e82(i411111111111118, i411111111111119, i4111111111111110, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var1114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i411111111111117;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 15:
                                    str15 = "video/webm";
                                    dn8Var6.X = true;
                                    str17 = "audio/vnd.dts";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z1116 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111 = (z1116 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i4111111111111112 = i12;
                                            int i4111111111111113 = i13;
                                            int i4111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var1115 = new e82(i4111111111111112, i4111111111111113, i4111111111111114, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var1115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i4111111111111111;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1117 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111115 = (z1117 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i4111111111111116 = i12;
                                        int i4111111111111117 = i13;
                                        int i4111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var1116 = new e82(i4111111111111116, i4111111111111117, i4111111111111118, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var1116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i4111111111111115;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                    str15 = "video/webm";
                                    byte[] bArr9 = dn8Var6.m;
                                    str17 = "video/av01";
                                    if (bArr9 != null) {
                                        listS = jy6.s(bArr9);
                                        er0 er0VarI = er0.i(dn8Var6.m);
                                        if (er0VarI != null) {
                                            int i64 = er0VarI.c;
                                            i8 = er0VarI.e;
                                            int i65 = er0VarI.d;
                                            i6 = er0VarI.b;
                                            listSingletonList = listS;
                                            str5 = "video/av01";
                                            i13 = i65;
                                            i14 = i6;
                                            str7 = (String) er0VarI.f;
                                            i12 = i64;
                                            i5 = -1;
                                            i4 = -1;
                                            if (dn8Var6.P != null) {
                                                i15 = i5;
                                                ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                                if (ig4VarA != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = ig4VarA.b;
                                                }
                                                boolean z1118 = dn8Var6.b0;
                                                if (dn8Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111111111111119 = (z1118 ? 1 : 0) | i16;
                                                qr5Var = new qr5();
                                                if (qv8.h(str10)) {
                                                    qr5Var.I = dn8Var6.Q;
                                                    qr5Var.J = dn8Var6.S;
                                                    qr5Var.K = dn8Var6.T;
                                                    qr5Var.L = i4;
                                                } else if (qv8.k(str10)) {
                                                    if (dn8Var6.t == 0) {
                                                        i24 = dn8Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = dn8Var6.o;
                                                        }
                                                        dn8Var6.r = i24;
                                                        i25 = dn8Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = dn8Var6.p;
                                                        }
                                                        dn8Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = dn8Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        } else {
                                                            i12 = dn8Var6.A;
                                                            i8 = dn8Var6.B;
                                                            i13 = dn8Var6.C;
                                                        }
                                                    }
                                                    int i41111111111111110 = i12;
                                                    int i41111111111111111 = i13;
                                                    int i41111111111111112 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = dn8Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (dn8Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    e82 e82Var1117 = new e82(i41111111111111110, i41111111111111111, i41111111111111112, bArr, i19, i21);
                                                    str11 = dn8Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dn8Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    qr5Var.v = dn8Var6.o;
                                                    qr5Var.w = dn8Var6.p;
                                                    qr5Var.D = f;
                                                    qr5Var.B = i22;
                                                    qr5Var.E = dn8Var6.y;
                                                    qr5Var.F = dn8Var6.z;
                                                    qr5Var.G = e82Var1117;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw l0a.a(null, "Unexpected MIME type.");
                                                }
                                                str12 = dn8Var6.b;
                                                if (str12 != null) {
                                                    qr5Var.b = dn8Var6.b;
                                                }
                                                qr5Var.a = Integer.toString(i44);
                                                if (dn8Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                qr5Var.n = qv8.l(str13);
                                                qr5Var.o = qv8.l(str10);
                                                qr5Var.p = i15;
                                                qr5Var.d = dn8Var6.c0;
                                                qr5Var.e = i4111111111111119;
                                                qr5Var.r = listSingletonList;
                                                qr5Var.k = str7;
                                                qr5Var.s = dn8Var6.n;
                                                dn8Var6.e0 = new rr5(qr5Var);
                                                en8Var = en8Var;
                                                dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                                sparseArray2.put(dn8Var6.d, dn8Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z1119 = dn8Var6.b0;
                                            if (dn8Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111113 = (z1119 ? 1 : 0) | i16;
                                            qr5Var = new qr5();
                                            if (qv8.h(str10)) {
                                                qr5Var.I = dn8Var6.Q;
                                                qr5Var.J = dn8Var6.S;
                                                qr5Var.K = dn8Var6.T;
                                                qr5Var.L = i4;
                                            } else if (qv8.k(str10)) {
                                                if (dn8Var6.t == 0) {
                                                    i24 = dn8Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = dn8Var6.o;
                                                    }
                                                    dn8Var6.r = i24;
                                                    i25 = dn8Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = dn8Var6.p;
                                                    }
                                                    dn8Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dn8Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    } else {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    }
                                                }
                                                int i41111111111111114 = i12;
                                                int i41111111111111115 = i13;
                                                int i41111111111111116 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = dn8Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (dn8Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                e82 e82Var1118 = new e82(i41111111111111114, i41111111111111115, i41111111111111116, bArr, i19, i21);
                                                str11 = dn8Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dn8Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                qr5Var.v = dn8Var6.o;
                                                qr5Var.w = dn8Var6.p;
                                                qr5Var.D = f;
                                                qr5Var.B = i22;
                                                qr5Var.E = dn8Var6.y;
                                                qr5Var.F = dn8Var6.z;
                                                qr5Var.G = e82Var1118;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw l0a.a(null, "Unexpected MIME type.");
                                            }
                                            str12 = dn8Var6.b;
                                            if (str12 != null) {
                                                qr5Var.b = dn8Var6.b;
                                            }
                                            qr5Var.a = Integer.toString(i44);
                                            if (dn8Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            qr5Var.n = qv8.l(str13);
                                            qr5Var.o = qv8.l(str10);
                                            qr5Var.p = i15;
                                            qr5Var.d = dn8Var6.c0;
                                            qr5Var.e = i41111111111111113;
                                            qr5Var.r = listSingletonList;
                                            qr5Var.k = str7;
                                            qr5Var.s = dn8Var6.n;
                                            dn8Var6.e0 = new rr5(qr5Var);
                                            en8Var = en8Var;
                                            dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                            sparseArray2.put(dn8Var6.d, dn8Var6);
                                        }
                                        listSingletonList = listS;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        if (dn8Var6.P != null) {
                                            i15 = i5;
                                            ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                            if (ig4VarA != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = ig4VarA.b;
                                            }
                                            boolean z11110 = dn8Var6.b0;
                                            if (dn8Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111117 = (z11110 ? 1 : 0) | i16;
                                            qr5Var = new qr5();
                                            if (qv8.h(str10)) {
                                                qr5Var.I = dn8Var6.Q;
                                                qr5Var.J = dn8Var6.S;
                                                qr5Var.K = dn8Var6.T;
                                                qr5Var.L = i4;
                                            } else if (qv8.k(str10)) {
                                                if (dn8Var6.t == 0) {
                                                    i24 = dn8Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = dn8Var6.o;
                                                    }
                                                    dn8Var6.r = i24;
                                                    i25 = dn8Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = dn8Var6.p;
                                                    }
                                                    dn8Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dn8Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    } else {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    }
                                                }
                                                int i41111111111111118 = i12;
                                                int i41111111111111119 = i13;
                                                int i411111111111111110 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = dn8Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (dn8Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                e82 e82Var1119 = new e82(i41111111111111118, i41111111111111119, i411111111111111110, bArr, i19, i21);
                                                str11 = dn8Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dn8Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                qr5Var.v = dn8Var6.o;
                                                qr5Var.w = dn8Var6.p;
                                                qr5Var.D = f;
                                                qr5Var.B = i22;
                                                qr5Var.E = dn8Var6.y;
                                                qr5Var.F = dn8Var6.z;
                                                qr5Var.G = e82Var1119;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw l0a.a(null, "Unexpected MIME type.");
                                            }
                                            str12 = dn8Var6.b;
                                            if (str12 != null) {
                                                qr5Var.b = dn8Var6.b;
                                            }
                                            qr5Var.a = Integer.toString(i44);
                                            if (dn8Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            qr5Var.n = qv8.l(str13);
                                            qr5Var.o = qv8.l(str10);
                                            qr5Var.p = i15;
                                            qr5Var.d = dn8Var6.c0;
                                            qr5Var.e = i41111111111111117;
                                            qr5Var.r = listSingletonList;
                                            qr5Var.k = str7;
                                            qr5Var.s = dn8Var6.n;
                                            dn8Var6.e0 = new rr5(qr5Var);
                                            en8Var = en8Var;
                                            dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                            sparseArray2.put(dn8Var6.d, dn8Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z11111 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111 = (z11111 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111111111112 = i12;
                                            int i411111111111111113 = i13;
                                            int i411111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11110 = new e82(i411111111111111112, i411111111111111113, i411111111111111114, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11110;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i411111111111111111;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    }
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z11112 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111115 = (z11112 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111111111116 = i12;
                                            int i411111111111111117 = i13;
                                            int i411111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11111 = new e82(i411111111111111116, i411111111111111117, i411111111111111118, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i411111111111111115;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11113 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111119 = (z11113 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i4111111111111111110 = i12;
                                        int i4111111111111111111 = i13;
                                        int i4111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var11112 = new e82(i4111111111111111110, i4111111111111111111, i4111111111111111112, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var11112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i411111111111111119;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 17:
                                    str15 = "video/webm";
                                    str17 = "video/x-vnd.on2.vp8";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z11114 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111113 = (z11114 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i4111111111111111114 = i12;
                                            int i4111111111111111115 = i13;
                                            int i4111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11113 = new e82(i4111111111111111114, i4111111111111111115, i4111111111111111116, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i4111111111111111113;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11115 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111117 = (z11115 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i4111111111111111118 = i12;
                                        int i4111111111111111119 = i13;
                                        int i41111111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var11114 = new e82(i4111111111111111118, i4111111111111111119, i41111111111111111110, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var11114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i4111111111111111117;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 18:
                                    str15 = "video/webm";
                                    byte[] bArr10 = dn8Var6.m;
                                    listS = bArr10 == null ? null : jy6.s(bArr10);
                                    str17 = "video/x-vnd.on2.vp9";
                                    listSingletonList = listS;
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z11116 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111 = (z11116 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i41111111111111111112 = i12;
                                            int i41111111111111111113 = i13;
                                            int i41111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11115 = new e82(i41111111111111111112, i41111111111111111113, i41111111111111111114, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i41111111111111111111;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11117 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111115 = (z11117 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i41111111111111111116 = i12;
                                        int i41111111111111111117 = i13;
                                        int i41111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var11116 = new e82(i41111111111111111116, i41111111111111111117, i41111111111111111118, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var11116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i41111111111111111115;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 19:
                                    str5 = "application/pgs";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z11118 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111119 = (z11118 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111111111111110 = i12;
                                            int i411111111111111111111 = i13;
                                            int i411111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11117 = new e82(i411111111111111111110, i411111111111111111111, i411111111111111111112, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i41111111111111111119;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11119 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111113 = (z11119 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i411111111111111111114 = i12;
                                        int i411111111111111111115 = i13;
                                        int i411111111111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var11118 = new e82(i411111111111111111114, i411111111111111111115, i411111111111111111116, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var11118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i411111111111111111113;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 20:
                                    str15 = "video/webm";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z111110 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111117 = (z111110 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111111111111118 = i12;
                                            int i411111111111111111119 = i13;
                                            int i4111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11119 = new e82(i411111111111111111118, i411111111111111111119, i4111111111111111111110, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i411111111111111111117;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111111 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111 = (z111111 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i4111111111111111111112 = i12;
                                        int i4111111111111111111113 = i13;
                                        int i4111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var111110 = new e82(i4111111111111111111112, i4111111111111111111113, i4111111111111111111114, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i4111111111111111111111;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 21:
                                    str15 = "video/webm";
                                    str17 = "audio/vnd.dts.hd;profile=lbr";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z111112 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111115 = (z111112 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i4111111111111111111116 = i12;
                                            int i4111111111111111111117 = i13;
                                            int i4111111111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var111111 = new e82(i4111111111111111111116, i4111111111111111111117, i4111111111111111111118, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var111111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i4111111111111111111115;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111113 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111119 = (z111113 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i41111111111111111111110 = i12;
                                        int i41111111111111111111111 = i13;
                                        int i41111111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var111112 = new e82(i41111111111111111111110, i41111111111111111111111, i41111111111111111111112, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var111112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i4111111111111111111119;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 22:
                                    str15 = "video/webm";
                                    int i66 = dn8Var6.R;
                                    String str19 = pqf.a;
                                    iU = pqf.u(i66, ByteOrder.LITTLE_ENDIAN);
                                    if (iU == 0) {
                                        xo1.V("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + dn8Var6.R + ". Setting mimeType to audio/x-unknown");
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = "audio/x-unknown";
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        listSingletonList = null;
                                        if (dn8Var6.P != null) {
                                            i15 = i5;
                                            ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                            if (ig4VarA != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = ig4VarA.b;
                                            }
                                            boolean z111114 = dn8Var6.b0;
                                            if (dn8Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111111111113 = (z111114 ? 1 : 0) | i16;
                                            qr5Var = new qr5();
                                            if (qv8.h(str10)) {
                                                qr5Var.I = dn8Var6.Q;
                                                qr5Var.J = dn8Var6.S;
                                                qr5Var.K = dn8Var6.T;
                                                qr5Var.L = i4;
                                            } else if (qv8.k(str10)) {
                                                if (dn8Var6.t == 0) {
                                                    i24 = dn8Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = dn8Var6.o;
                                                    }
                                                    dn8Var6.r = i24;
                                                    i25 = dn8Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = dn8Var6.p;
                                                    }
                                                    dn8Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dn8Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    } else {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    }
                                                }
                                                int i41111111111111111111114 = i12;
                                                int i41111111111111111111115 = i13;
                                                int i41111111111111111111116 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = dn8Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (dn8Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                e82 e82Var111113 = new e82(i41111111111111111111114, i41111111111111111111115, i41111111111111111111116, bArr, i19, i21);
                                                str11 = dn8Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dn8Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                qr5Var.v = dn8Var6.o;
                                                qr5Var.w = dn8Var6.p;
                                                qr5Var.D = f;
                                                qr5Var.B = i22;
                                                qr5Var.E = dn8Var6.y;
                                                qr5Var.F = dn8Var6.z;
                                                qr5Var.G = e82Var111113;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw l0a.a(null, "Unexpected MIME type.");
                                            }
                                            str12 = dn8Var6.b;
                                            if (str12 != null) {
                                                qr5Var.b = dn8Var6.b;
                                            }
                                            qr5Var.a = Integer.toString(i44);
                                            if (dn8Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            qr5Var.n = qv8.l(str13);
                                            qr5Var.o = qv8.l(str10);
                                            qr5Var.p = i15;
                                            qr5Var.d = dn8Var6.c0;
                                            qr5Var.e = i41111111111111111111113;
                                            qr5Var.r = listSingletonList;
                                            qr5Var.k = str7;
                                            qr5Var.s = dn8Var6.n;
                                            dn8Var6.e0 = new rr5(qr5Var);
                                            en8Var = en8Var;
                                            dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                            sparseArray2.put(dn8Var6.d, dn8Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z111115 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111117 = (z111115 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i41111111111111111111118 = i12;
                                            int i41111111111111111111119 = i13;
                                            int i411111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var111114 = new e82(i41111111111111111111118, i41111111111111111111119, i411111111111111111111110, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var111114;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i41111111111111111111117;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    }
                                    i4 = iU;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "audio/raw";
                                    i6 = -1;
                                    i5 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z111116 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111 = (z111116 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111111111111111112 = i12;
                                            int i411111111111111111111113 = i13;
                                            int i411111111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var111115 = new e82(i411111111111111111111112, i411111111111111111111113, i411111111111111111111114, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var111115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i411111111111111111111111;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111117 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111115 = (z111117 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i411111111111111111111116 = i12;
                                        int i411111111111111111111117 = i13;
                                        int i411111111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var111116 = new e82(i411111111111111111111116, i411111111111111111111117, i411111111111111111111118, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var111116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i411111111111111111111115;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 23:
                                    str15 = "video/webm";
                                    iU = pqf.w(dn8Var6.R, ByteOrder.BIG_ENDIAN);
                                    if (iU == 0) {
                                        xo1.V("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + dn8Var6.R + ". Setting mimeType to audio/x-unknown");
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = "audio/x-unknown";
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        listSingletonList = null;
                                        if (dn8Var6.P != null) {
                                            i15 = i5;
                                            ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                            if (ig4VarA != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = ig4VarA.b;
                                            }
                                            boolean z111118 = dn8Var6.b0;
                                            if (dn8Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i411111111111111111111119 = (z111118 ? 1 : 0) | i16;
                                            qr5Var = new qr5();
                                            if (qv8.h(str10)) {
                                                qr5Var.I = dn8Var6.Q;
                                                qr5Var.J = dn8Var6.S;
                                                qr5Var.K = dn8Var6.T;
                                                qr5Var.L = i4;
                                            } else if (qv8.k(str10)) {
                                                if (dn8Var6.t == 0) {
                                                    i24 = dn8Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = dn8Var6.o;
                                                    }
                                                    dn8Var6.r = i24;
                                                    i25 = dn8Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = dn8Var6.p;
                                                    }
                                                    dn8Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dn8Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    } else {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    }
                                                }
                                                int i4111111111111111111111110 = i12;
                                                int i4111111111111111111111111 = i13;
                                                int i4111111111111111111111112 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = dn8Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (dn8Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                e82 e82Var111117 = new e82(i4111111111111111111111110, i4111111111111111111111111, i4111111111111111111111112, bArr, i19, i21);
                                                str11 = dn8Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dn8Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                qr5Var.v = dn8Var6.o;
                                                qr5Var.w = dn8Var6.p;
                                                qr5Var.D = f;
                                                qr5Var.B = i22;
                                                qr5Var.E = dn8Var6.y;
                                                qr5Var.F = dn8Var6.z;
                                                qr5Var.G = e82Var111117;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw l0a.a(null, "Unexpected MIME type.");
                                            }
                                            str12 = dn8Var6.b;
                                            if (str12 != null) {
                                                qr5Var.b = dn8Var6.b;
                                            }
                                            qr5Var.a = Integer.toString(i44);
                                            if (dn8Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            qr5Var.n = qv8.l(str13);
                                            qr5Var.o = qv8.l(str10);
                                            qr5Var.p = i15;
                                            qr5Var.d = dn8Var6.c0;
                                            qr5Var.e = i411111111111111111111119;
                                            qr5Var.r = listSingletonList;
                                            qr5Var.k = str7;
                                            qr5Var.s = dn8Var6.n;
                                            dn8Var6.e0 = new rr5(qr5Var);
                                            en8Var = en8Var;
                                            dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                            sparseArray2.put(dn8Var6.d, dn8Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z111119 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111113 = (z111119 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111114 = i12;
                                            int i4111111111111111111111115 = i13;
                                            int i4111111111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var111118 = new e82(i4111111111111111111111114, i4111111111111111111111115, i4111111111111111111111116, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var111118;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i4111111111111111111111113;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    }
                                    i4 = iU;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "audio/raw";
                                    i6 = -1;
                                    i5 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z1111110 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111117 = (z1111110 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111118 = i12;
                                            int i4111111111111111111111119 = i13;
                                            int i41111111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var111119 = new e82(i4111111111111111111111118, i4111111111111111111111119, i41111111111111111111111110, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var111119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i4111111111111111111111117;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111111 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111111111111 = (z1111111 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111112 = i12;
                                        int i41111111111111111111111113 = i13;
                                        int i41111111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var1111110 = new e82(i41111111111111111111111112, i41111111111111111111111113, i41111111111111111111111114, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var1111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i41111111111111111111111111;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 24:
                                    str15 = "video/webm";
                                    int i67 = dn8Var6.R;
                                    String str20 = pqf.a;
                                    iU = pqf.w(i67, ByteOrder.LITTLE_ENDIAN);
                                    if (iU == 0) {
                                        xo1.V("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + dn8Var6.R + ". Setting mimeType to audio/x-unknown");
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = "audio/x-unknown";
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        listSingletonList = null;
                                        if (dn8Var6.P != null) {
                                            i15 = i5;
                                            ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                            if (ig4VarA != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = ig4VarA.b;
                                            }
                                            boolean z1111112 = dn8Var6.b0;
                                            if (dn8Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111111111111115 = (z1111112 ? 1 : 0) | i16;
                                            qr5Var = new qr5();
                                            if (qv8.h(str10)) {
                                                qr5Var.I = dn8Var6.Q;
                                                qr5Var.J = dn8Var6.S;
                                                qr5Var.K = dn8Var6.T;
                                                qr5Var.L = i4;
                                            } else if (qv8.k(str10)) {
                                                if (dn8Var6.t == 0) {
                                                    i24 = dn8Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = dn8Var6.o;
                                                    }
                                                    dn8Var6.r = i24;
                                                    i25 = dn8Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = dn8Var6.p;
                                                    }
                                                    dn8Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dn8Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    } else {
                                                        i12 = dn8Var6.A;
                                                        i8 = dn8Var6.B;
                                                        i13 = dn8Var6.C;
                                                    }
                                                }
                                                int i41111111111111111111111116 = i12;
                                                int i41111111111111111111111117 = i13;
                                                int i41111111111111111111111118 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = dn8Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (dn8Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                e82 e82Var1111111 = new e82(i41111111111111111111111116, i41111111111111111111111117, i41111111111111111111111118, bArr, i19, i21);
                                                str11 = dn8Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dn8Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                qr5Var.v = dn8Var6.o;
                                                qr5Var.w = dn8Var6.p;
                                                qr5Var.D = f;
                                                qr5Var.B = i22;
                                                qr5Var.E = dn8Var6.y;
                                                qr5Var.F = dn8Var6.z;
                                                qr5Var.G = e82Var1111111;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw l0a.a(null, "Unexpected MIME type.");
                                            }
                                            str12 = dn8Var6.b;
                                            if (str12 != null) {
                                                qr5Var.b = dn8Var6.b;
                                            }
                                            qr5Var.a = Integer.toString(i44);
                                            if (dn8Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            qr5Var.n = qv8.l(str13);
                                            qr5Var.o = qv8.l(str10);
                                            qr5Var.p = i15;
                                            qr5Var.d = dn8Var6.c0;
                                            qr5Var.e = i41111111111111111111111115;
                                            qr5Var.r = listSingletonList;
                                            qr5Var.k = str7;
                                            qr5Var.s = dn8Var6.n;
                                            dn8Var6.e0 = new rr5(qr5Var);
                                            en8Var = en8Var;
                                            dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                            sparseArray2.put(dn8Var6.d, dn8Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z1111113 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111119 = (z1111113 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111110 = i12;
                                            int i411111111111111111111111111 = i13;
                                            int i411111111111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var1111112 = new e82(i411111111111111111111111110, i411111111111111111111111111, i411111111111111111111111112, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var1111112;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i41111111111111111111111119;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    }
                                    i4 = iU;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "audio/raw";
                                    i6 = -1;
                                    i5 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z1111114 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111113 = (z1111114 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111114 = i12;
                                            int i411111111111111111111111115 = i13;
                                            int i411111111111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var1111113 = new e82(i411111111111111111111111114, i411111111111111111111111115, i411111111111111111111111116, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var1111113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i411111111111111111111111113;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111115 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111117 = (z1111115 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i411111111111111111111111118 = i12;
                                        int i411111111111111111111111119 = i13;
                                        int i4111111111111111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var1111114 = new e82(i411111111111111111111111118, i411111111111111111111111119, i4111111111111111111111111110, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var1111114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i411111111111111111111111117;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 25:
                                case 26:
                                    str15 = "video/webm";
                                    en8Var = en8Var;
                                    listSingletonList = jy6.t(en8.r0, dn8Var6.a(str16));
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "text/x-ssa";
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z1111116 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111111 = (z1111116 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111111112 = i12;
                                            int i4111111111111111111111111113 = i13;
                                            int i4111111111111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var1111115 = new e82(i4111111111111111111111111112, i4111111111111111111111111113, i4111111111111111111111111114, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var1111115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i4111111111111111111111111111;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111117 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111115 = (z1111117 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111116 = i12;
                                        int i4111111111111111111111111117 = i13;
                                        int i4111111111111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var1111116 = new e82(i4111111111111111111111111116, i4111111111111111111111111117, i4111111111111111111111111118, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var1111116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i4111111111111111111111111115;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 27:
                                    rj6 rj6VarA = rj6.a(new d0a(dn8Var6.a(dn8Var6.c)), false, null);
                                    List list2 = rj6VarA.a;
                                    dn8Var6.f0 = rj6VarA.b;
                                    str8 = rj6VarA.n;
                                    i7 = rj6VarA.h;
                                    i8 = rj6VarA.j;
                                    list = list2;
                                    i9 = rj6VarA.i;
                                    i10 = rj6VarA.f;
                                    i11 = rj6VarA.g;
                                    str9 = "video/hevc";
                                    i13 = i9;
                                    str5 = str9;
                                    i12 = i7;
                                    listSingletonList = list;
                                    i14 = i11;
                                    i6 = i10;
                                    str7 = str8;
                                    i5 = -1;
                                    i4 = -1;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z1111118 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111119 = (z1111118 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i41111111111111111111111111110 = i12;
                                            int i41111111111111111111111111111 = i13;
                                            int i41111111111111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var1111117 = new e82(i41111111111111111111111111110, i41111111111111111111111111111, i41111111111111111111111111112, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var1111117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i4111111111111111111111111119;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111119 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111111111111113 = (z1111119 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111111114 = i12;
                                        int i41111111111111111111111111115 = i13;
                                        int i41111111111111111111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var1111118 = new e82(i41111111111111111111111111114, i41111111111111111111111111115, i41111111111111111111111111116, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var1111118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i41111111111111111111111111113;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 28:
                                    str15 = "video/webm";
                                    en8Var = en8Var;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "text/vtt";
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z11111110 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111111117 = (z11111110 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i41111111111111111111111111118 = i12;
                                            int i41111111111111111111111111119 = i13;
                                            int i411111111111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var1111119 = new e82(i41111111111111111111111111118, i41111111111111111111111111119, i411111111111111111111111111110, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var1111119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i41111111111111111111111111117;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111111 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111111111 = (z11111111 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i411111111111111111111111111112 = i12;
                                        int i411111111111111111111111111113 = i13;
                                        int i411111111111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var11111110 = new e82(i411111111111111111111111111112, i411111111111111111111111111113, i411111111111111111111111111114, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var11111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i411111111111111111111111111111;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 29:
                                    str5 = "application/x-subrip";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z11111112 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111111115 = (z11111112 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111111116 = i12;
                                            int i411111111111111111111111111117 = i13;
                                            int i411111111111111111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11111111 = new e82(i411111111111111111111111111116, i411111111111111111111111111117, i411111111111111111111111111118, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11111111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i411111111111111111111111111115;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111113 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111111119 = (z11111113 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111111110 = i12;
                                        int i4111111111111111111111111111111 = i13;
                                        int i4111111111111111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var11111112 = new e82(i4111111111111111111111111111110, i4111111111111111111111111111111, i4111111111111111111111111111112, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var11111112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i411111111111111111111111111119;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 30:
                                    str15 = "video/webm";
                                    str17 = "video/mpeg2";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z11111114 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111111113 = (z11111114 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111111111114 = i12;
                                            int i4111111111111111111111111111115 = i13;
                                            int i4111111111111111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11111113 = new e82(i4111111111111111111111111111114, i4111111111111111111111111111115, i4111111111111111111111111111116, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11111113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i4111111111111111111111111111113;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111115 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111111117 = (z11111115 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111111118 = i12;
                                        int i4111111111111111111111111111119 = i13;
                                        int i41111111111111111111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var11111114 = new e82(i4111111111111111111111111111118, i4111111111111111111111111111119, i41111111111111111111111111111110, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var11111114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i4111111111111111111111111111117;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 31:
                                    str15 = "video/webm";
                                    listS = Collections.singletonList(dn8Var6.a(str16));
                                    int i68 = dn8Var6.R;
                                    String str21 = pqf.a;
                                    iW = pqf.w(i68, ByteOrder.LITTLE_ENDIAN);
                                    str17 = "audio/alac";
                                    if (iW == 0) {
                                        listSingletonList = listS;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                    } else {
                                        en8Var = en8Var;
                                        listSingletonList = listS;
                                        i4 = iW;
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                    }
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z11111116 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111111111111 = (z11111116 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i41111111111111111111111111111112 = i12;
                                            int i41111111111111111111111111111113 = i13;
                                            int i41111111111111111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11111115 = new e82(i41111111111111111111111111111112, i41111111111111111111111111111113, i41111111111111111111111111111114, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11111115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i41111111111111111111111111111111;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111117 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111111111111111115 = (z11111117 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111111111116 = i12;
                                        int i41111111111111111111111111111117 = i13;
                                        int i41111111111111111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var11111116 = new e82(i41111111111111111111111111111116, i41111111111111111111111111111117, i41111111111111111111111111111118, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var11111116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i41111111111111111111111111111115;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                    str15 = "video/webm";
                                    str17 = "audio/eac3";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z11111118 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111111111119 = (z11111118 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111111111110 = i12;
                                            int i411111111111111111111111111111111 = i13;
                                            int i411111111111111111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11111117 = new e82(i411111111111111111111111111111110, i411111111111111111111111111111111, i411111111111111111111111111111112, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11111117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i41111111111111111111111111111119;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111119 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111111111113 = (z11111119 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i411111111111111111111111111111114 = i12;
                                        int i411111111111111111111111111111115 = i13;
                                        int i411111111111111111111111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var11111118 = new e82(i411111111111111111111111111111114, i411111111111111111111111111111115, i411111111111111111111111111111116, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var11111118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i411111111111111111111111111111113;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 33:
                                    str15 = "video/webm";
                                    listS = Collections.singletonList(dn8Var6.a(str16));
                                    int i69 = dn8Var6.R;
                                    String str22 = pqf.a;
                                    iW = pqf.w(i69, ByteOrder.LITTLE_ENDIAN);
                                    str17 = "audio/flac";
                                    if (iW == 0) {
                                        listSingletonList = listS;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                    } else {
                                        en8Var = en8Var;
                                        listSingletonList = listS;
                                        i4 = iW;
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                    }
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z111111110 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111111111117 = (z111111110 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111111111118 = i12;
                                            int i411111111111111111111111111111119 = i13;
                                            int i4111111111111111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var11111119 = new e82(i411111111111111111111111111111118, i411111111111111111111111111111119, i4111111111111111111111111111111110, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var11111119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i411111111111111111111111111111117;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111111111 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111111111111 = (z111111111 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111111111112 = i12;
                                        int i4111111111111111111111111111111113 = i13;
                                        int i4111111111111111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var111111110 = new e82(i4111111111111111111111111111111112, i4111111111111111111111111111111113, i4111111111111111111111111111111114, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var111111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i4111111111111111111111111111111111;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                case 34:
                                    ArrayList arrayList4 = new ArrayList(3);
                                    arrayList4.add(dn8Var6.a(dn8Var6.c));
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                    arrayList4.add(byteBufferAllocate.order(byteOrder).putLong(dn8Var6.U).array());
                                    arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(dn8Var6.V).array());
                                    str3 = "audio/opus";
                                    i5 = 5760;
                                    listSingletonList = arrayList4;
                                    str5 = str3;
                                    i6 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (dn8Var6.P != null) {
                                        i15 = i5;
                                        ig4VarA = ig4.a(new d0a(dn8Var6.P));
                                        if (ig4VarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = ig4VarA.b;
                                        }
                                        boolean z111111112 = dn8Var6.b0;
                                        if (dn8Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111111111115 = (z111111112 ? 1 : 0) | i16;
                                        qr5Var = new qr5();
                                        if (qv8.h(str10)) {
                                            qr5Var.I = dn8Var6.Q;
                                            qr5Var.J = dn8Var6.S;
                                            qr5Var.K = dn8Var6.T;
                                            qr5Var.L = i4;
                                        } else if (qv8.k(str10)) {
                                            if (dn8Var6.t == 0) {
                                                i24 = dn8Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = dn8Var6.o;
                                                }
                                                dn8Var6.r = i24;
                                                i25 = dn8Var6.s;
                                                if (i25 == -1) {
                                                    i25 = dn8Var6.p;
                                                }
                                                dn8Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = dn8Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                } else {
                                                    i12 = dn8Var6.A;
                                                    i8 = dn8Var6.B;
                                                    i13 = dn8Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111111111111116 = i12;
                                            int i4111111111111111111111111111111117 = i13;
                                            int i4111111111111111111111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = dn8Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (dn8Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            e82 e82Var111111111 = new e82(i4111111111111111111111111111111116, i4111111111111111111111111111111117, i4111111111111111111111111111111118, bArr, i19, i21);
                                            str11 = dn8Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dn8Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            qr5Var.v = dn8Var6.o;
                                            qr5Var.w = dn8Var6.p;
                                            qr5Var.D = f;
                                            qr5Var.B = i22;
                                            qr5Var.E = dn8Var6.y;
                                            qr5Var.F = dn8Var6.z;
                                            qr5Var.G = e82Var111111111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw l0a.a(null, "Unexpected MIME type.");
                                        }
                                        str12 = dn8Var6.b;
                                        if (str12 != null) {
                                            qr5Var.b = dn8Var6.b;
                                        }
                                        qr5Var.a = Integer.toString(i44);
                                        if (dn8Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        qr5Var.n = qv8.l(str13);
                                        qr5Var.o = qv8.l(str10);
                                        qr5Var.p = i15;
                                        qr5Var.d = dn8Var6.c0;
                                        qr5Var.e = i4111111111111111111111111111111115;
                                        qr5Var.r = listSingletonList;
                                        qr5Var.k = str7;
                                        qr5Var.s = dn8Var6.n;
                                        dn8Var6.e0 = new rr5(qr5Var);
                                        en8Var = en8Var;
                                        dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                        sparseArray2.put(dn8Var6.d, dn8Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111111113 = dn8Var6.b0;
                                    if (dn8Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111111111119 = (z111111113 ? 1 : 0) | i16;
                                    qr5Var = new qr5();
                                    if (qv8.h(str10)) {
                                        qr5Var.I = dn8Var6.Q;
                                        qr5Var.J = dn8Var6.S;
                                        qr5Var.K = dn8Var6.T;
                                        qr5Var.L = i4;
                                    } else if (qv8.k(str10)) {
                                        if (dn8Var6.t == 0) {
                                            i24 = dn8Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = dn8Var6.o;
                                            }
                                            dn8Var6.r = i24;
                                            i25 = dn8Var6.s;
                                            if (i25 == -1) {
                                                i25 = dn8Var6.p;
                                            }
                                            dn8Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = dn8Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            } else {
                                                i12 = dn8Var6.A;
                                                i8 = dn8Var6.B;
                                                i13 = dn8Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111111111111110 = i12;
                                        int i41111111111111111111111111111111111 = i13;
                                        int i41111111111111111111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = dn8Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (dn8Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        e82 e82Var111111112 = new e82(i41111111111111111111111111111111110, i41111111111111111111111111111111111, i41111111111111111111111111111111112, bArr, i19, i21);
                                        str11 = dn8Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (dn8Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        qr5Var.v = dn8Var6.o;
                                        qr5Var.w = dn8Var6.p;
                                        qr5Var.D = f;
                                        qr5Var.B = i22;
                                        qr5Var.E = dn8Var6.y;
                                        qr5Var.F = dn8Var6.z;
                                        qr5Var.G = e82Var111111112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw l0a.a(null, "Unexpected MIME type.");
                                    }
                                    str12 = dn8Var6.b;
                                    if (str12 != null) {
                                        qr5Var.b = dn8Var6.b;
                                    }
                                    qr5Var.a = Integer.toString(i44);
                                    if (dn8Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    qr5Var.n = qv8.l(str13);
                                    qr5Var.o = qv8.l(str10);
                                    qr5Var.p = i15;
                                    qr5Var.d = dn8Var6.c0;
                                    qr5Var.e = i4111111111111111111111111111111119;
                                    qr5Var.r = listSingletonList;
                                    qr5Var.k = str7;
                                    qr5Var.s = dn8Var6.n;
                                    dn8Var6.e0 = new rr5(qr5Var);
                                    en8Var = en8Var;
                                    dn8Var6.d0 = en8Var.p0.n(dn8Var6.d, dn8Var6.f);
                                    sparseArray2.put(dn8Var6.d, dn8Var6);
                                    break;
                                default:
                                    throw l0a.a(null, "Unrecognized codec identifier.");
                            }
                            break;
                    }
                    en8Var.A = null;
                    return true;
                }
            } else {
                i = 8;
            }
            boolean z20 = true;
            int i70 = this.e;
            fsf fsfVar = this.c;
            if (i70 == 0) {
                int i71 = 4;
                int i72 = 0;
                long jH = fsfVar.h(m95Var, true, false, 4);
                if (jH == -2) {
                    m95Var.k();
                    while (true) {
                        byte[] bArr11 = this.a;
                        m95Var.o(bArr11, i72, i71);
                        byte b3 = bArr11[i72];
                        int i73 = i;
                        int i74 = 0;
                        while (true) {
                            if (i74 >= i73) {
                                i3 = -1;
                            } else if ((fsf.d[i74] & ((long) b3)) != 0) {
                                i3 = i74 + 1;
                            } else {
                                i74++;
                                i73 = 8;
                            }
                        }
                        if (i3 != -1 && i3 <= 4) {
                            iA = (int) fsf.a(bArr11, i3, false);
                            Object obj = this.d.a;
                            if (iA == 357149030 || iA == 272869232 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                            }
                        }
                        m95Var.l(1);
                        i71 = 4;
                        i72 = 0;
                        i = 8;
                    }
                    m95Var.l(i3);
                    jH = iA;
                }
                z20 = true;
                if (jH == -1) {
                    return false;
                }
                z = false;
                this.f = (int) jH;
                this.e = 1;
                i70 = 1;
            } else {
                z = false;
            }
            if (i70 == z20) {
                this.g = fsfVar.h(m95Var, z, z20, 8);
                this.e = 2;
            }
            mjg mjgVar2 = this.d;
            int i75 = this.f;
            Object obj2 = mjgVar2.a;
            switch (i75) {
                case UserMetadata.MAX_ROLLOUT_ASSIGNMENTS /* 128 */:
                case 143:
                case 160:
                case 166:
                case 174:
                case 182:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 17849:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 272869232:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i2 = 1;
                    break;
                case 131:
                case 136:
                case 137:
                case 145:
                case 146:
                case 152:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 240:
                case 241:
                case 247:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 29636:
                case 29637:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i2 = 2;
                    break;
                case 133:
                case 134:
                case 17026:
                case 17276:
                case 21358:
                case 2274716:
                    i2 = 3;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i2 = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i2 = 5;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    long position = m95Var.getPosition();
                    arrayDeque.push(new mq3(this.f, this.g + position));
                    this.d.M(position, this.f, this.g);
                    this.e = 0;
                    return true;
                }
                if (i2 == 2) {
                    long j5 = this.g;
                    if (j5 <= 8) {
                        mjgVar2.F(i75, b(m95Var, (int) j5));
                        this.e = 0;
                        return true;
                    }
                    throw l0a.a(null, "Invalid integer size: " + this.g);
                }
                if (i2 == 3) {
                    int i76 = 0;
                    long j6 = this.g;
                    if (j6 > 2147483647L) {
                        throw l0a.a(null, "String element size: " + this.g);
                    }
                    int i77 = (int) j6;
                    if (i77 == 0) {
                        str = "";
                    } else {
                        byte[] bArr12 = new byte[i77];
                        m95Var.readFully(bArr12, 0, i77);
                        while (i77 > 0 && bArr12[i77 - 1] == 0) {
                            i77--;
                        }
                        i76 = 0;
                        str = new String(bArr12, 0, i77);
                    }
                    mjgVar2.N(i75, str);
                    this.e = i76;
                    return true;
                }
                if (i2 == 4) {
                    mjgVar2.D(i75, (int) this.g, m95Var);
                    this.e = 0;
                    return true;
                }
                if (i2 != 5) {
                    throw l0a.a(null, "Invalid element type " + i2);
                }
                long j7 = this.g;
                if (j7 != 4 && j7 != 8) {
                    throw l0a.a(null, "Invalid float size: " + this.g);
                }
                int i78 = (int) j7;
                long jB = b(m95Var, i78);
                double dIntBitsToFloat = i78 == 4 ? Float.intBitsToFloat((int) jB) : Double.longBitsToDouble(jB);
                en8 en8Var2 = (en8) mjgVar2.a;
                if (i75 == 181) {
                    en8Var2.h(i75);
                    en8Var2.A.T = (int) dIntBitsToFloat;
                } else if (i75 != 17545) {
                    switch (i75) {
                        case 21969:
                            en8Var2.h(i75);
                            en8Var2.A.F = (float) dIntBitsToFloat;
                            break;
                        case 21970:
                            en8Var2.h(i75);
                            en8Var2.A.G = (float) dIntBitsToFloat;
                            break;
                        case 21971:
                            en8Var2.h(i75);
                            en8Var2.A.H = (float) dIntBitsToFloat;
                            break;
                        case 21972:
                            en8Var2.h(i75);
                            en8Var2.A.I = (float) dIntBitsToFloat;
                            break;
                        case 21973:
                            en8Var2.h(i75);
                            en8Var2.A.J = (float) dIntBitsToFloat;
                            break;
                        case 21974:
                            en8Var2.h(i75);
                            en8Var2.A.K = (float) dIntBitsToFloat;
                            break;
                        case 21975:
                            en8Var2.h(i75);
                            en8Var2.A.L = (float) dIntBitsToFloat;
                            break;
                        case 21976:
                            en8Var2.h(i75);
                            en8Var2.A.M = (float) dIntBitsToFloat;
                            break;
                        case 21977:
                            en8Var2.h(i75);
                            en8Var2.A.N = (float) dIntBitsToFloat;
                            break;
                        case 21978:
                            en8Var2.h(i75);
                            en8Var2.A.O = (float) dIntBitsToFloat;
                            break;
                        default:
                            switch (i75) {
                                case 30323:
                                    en8Var2.h(i75);
                                    en8Var2.A.v = (float) dIntBitsToFloat;
                                    break;
                                case 30324:
                                    en8Var2.h(i75);
                                    en8Var2.A.w = (float) dIntBitsToFloat;
                                    break;
                                case 30325:
                                    en8Var2.h(i75);
                                    en8Var2.A.x = (float) dIntBitsToFloat;
                                    break;
                            }
                            break;
                    }
                } else {
                    en8Var2.v = (long) dIntBitsToFloat;
                }
                this.e = 0;
                return true;
            }
            m95Var.l((int) this.g);
            this.e = 0;
        }
    }

    public final long b(m95 m95Var, int i) {
        byte[] bArr = this.a;
        m95Var.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
