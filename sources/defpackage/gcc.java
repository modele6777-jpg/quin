package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.RoundingMode;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gcc {
    public static int A(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void B(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + A(parcel, i));
    }

    public static final Object C(pfc pfcVar, boolean z, Object obj, l26 l26Var) throws Throwable {
        Object eb2Var;
        Object objS;
        try {
            if (l26Var instanceof pt0) {
                z7f.t(2, l26Var);
                eb2Var = l26Var.z(obj, pfcVar);
            } else {
                eb2Var = k99.Q(l26Var, obj, pfcVar);
            }
        } catch (y94 e) {
            pfcVar.R(new eb2(e.getCause(), false));
            throw e.getCause();
        } catch (Throwable th) {
            eb2Var = new eb2(th, false);
        }
        bw2 bw2Var = bw2.a;
        if (eb2Var == bw2Var || (objS = pfcVar.S(eb2Var)) == sg7.b) {
            return bw2Var;
        }
        pfcVar.l0();
        if (!(objS instanceof eb2)) {
            return sg7.a(objS);
        }
        if (!z) {
            Throwable th2 = ((eb2) objS).a;
            if ((th2 instanceof kye) && ((kye) th2).a == pfcVar) {
                if (eb2Var instanceof eb2) {
                    throw ((eb2) eb2Var).a;
                }
                return eb2Var;
            }
        }
        throw ((eb2) objS).a;
    }

    public static final int D(vag vagVar) {
        vagVar.getClass();
        int iOrdinal = vagVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        ap.c();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final va8 E(w57 w57Var, cye cyeVar) {
        w57Var.getClass();
        cyeVar.getClass();
        try {
            Instant instantOfEpochSecond = Instant.ofEpochSecond(w57Var.a(), w57Var.b());
            instantOfEpochSecond.getClass();
            return new va8(LocalDateTime.ofInstant(instantOfEpochSecond, cyeVar.a));
        } catch (DateTimeException e) {
            throw new yf3(e);
        }
    }

    public static final be9 F(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new be9(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                be9 be9VarM = s.m(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return be9VarM;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ym8.t(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ym8.t(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static int G(Parcel parcel) {
        int i = parcel.readInt();
        int iA = A(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new fcc("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iA + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new fcc(sb.toString(), parcel);
    }

    public static int H(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (tzg.a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static void I(Parcel parcel, int i, int i2) {
        int iA = A(parcel, i);
        if (iA == i2) {
            return;
        }
        String hexString = Integer.toHexString(iA);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iA).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iA);
        throw new fcc(ib8.m(sb, " (0x", hexString, ")"), parcel);
    }

    public static void J(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new fcc(ib8.m(sb, " (0x", hexString, ")"), parcel);
    }

    public static final void a(d0e d0eVar, boolean z, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        long jF;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-922798699);
        int i4 = i | (l46Var2.e(d0eVar.ordinal()) ? 4 : 2) | (l46Var2.h(z) ? 32 : 16) | (l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var2.W(i4 & 1, (i4 & 1171) != 1170)) {
            g09 g09Var = g09.a;
            j09 j09VarE = oa7.E(b.c(g09Var, 1.0f), a7c.b(32.0f));
            if (z) {
                l46Var2.f0(-2046278338);
                jF = l8b.h(l46Var2);
            } else {
                l46Var2.f0(-2046277628);
                jF = l8b.f(l46Var2);
            }
            l46Var2.r(false);
            j09 j09VarO = tm7.o(j09VarE, jF, g21.f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z4 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 32.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarZ);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            feg.j(od4.A(z ? R.drawable.img_startup_update_neo : R.drawable.img_startup_update_colorful, 0, l46Var2), null, dj6.w(b.c(g09Var, 1.0f), 1.6666666f), null, an2.b, 0.0f, null, l46Var2, 25016, 104);
            int iOrdinal = d0eVar.ordinal();
            if (iOrdinal != 0) {
                z2 = true;
                if (iOrdinal != 1) {
                    ap.c();
                    return;
                }
                i2 = R.string.startup_update_force_title;
            } else {
                z2 = true;
                i2 = R.string.startup_update_soft_title;
            }
            String strQ = afc.q(i2, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, b.c(g09Var, 1.0f), l8b.b(l46Var2), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var, 48, 0, 130040);
            o5c.f(l46Var, b.d(g09Var, 8.0f));
            int iOrdinal2 = d0eVar.ordinal();
            if (iOrdinal2 == 0) {
                i3 = R.string.startup_update_soft_message;
            } else {
                if (iOrdinal2 != 1) {
                    ap.c();
                    return;
                }
                i3 = R.string.startup_update_force_message;
            }
            String strQ2 = afc.q(i3, l46Var);
            mue mueVar2 = oue.a;
            nte.b(strQ2, b.c(g09Var, 1.0f), l8b.d(l46Var), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.c(l46Var), l46Var, 48, 0, 130040);
            j09 j09VarB = b.b(0.0f, 56.0f, kv2.e(g09Var, 24.0f, l46Var, g09Var, 1.0f), 1);
            y6c y6cVarB = z ? a7c.b(0.0f) : a7c.b(32.0f);
            bx9 bx9Var = v51.a;
            cgg.a(x16Var2, j09VarB, false, y6cVarB, v51.a(eze.a(l46Var).b.z(l46Var), eze.a(l46Var).b.A(l46Var), 0L, 0L, l46Var, 12), null, null, null, af1.b0(-1046155223, new g8(z, 6), l46Var), l46Var, ((i4 >> 9) & 14) | 805306416, 484);
            l46Var2 = l46Var;
            d0e d0eVar2 = d0e.a;
            if (d0eVar == d0eVar2) {
                ib8.r(8.0f, -998315075, l46Var2, l46Var2, g09Var);
                cgg.m(x16Var, b.c(g09Var, 1.0f), false, null, null, null, od4.j, l46Var2, ((i4 >> 6) & 14) | 805306416, 508);
                z3 = false;
                l46Var2.r(false);
            } else {
                z3 = false;
                l46Var2.f0(-997965271);
                l46Var2.r(false);
            }
            l46Var2.r(true);
            if (d0eVar == d0eVar2) {
                l46Var2.f0(-1969745834);
                c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, l8b.d(l46Var2), null, x16Var, l46Var2, (i4 << 9) & 458752, 22);
                l46Var2 = l46Var2;
                l46Var2.r(z3);
            } else {
                l46Var2.f0(-1969533453);
                l46Var2.r(z3);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50(d0eVar, z, x16Var, x16Var2, i, 23, false);
        }
    }

    public static final void b(d0e d0eVar, x16 x16Var, boolean z, l46 l46Var, int i) {
        boolean z2;
        String str;
        x16Var.getClass();
        l46Var.h0(1990524104);
        int i2 = 4;
        int i3 = i | (l46Var.e(d0eVar.ordinal()) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | 384;
        boolean z3 = false;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) l46Var.k(uq.b);
            int iOrdinal = d0eVar.ordinal();
            if (iOrdinal == 0) {
                str = "soft_update";
            } else {
                if (iOrdinal != 1) {
                    ap.c();
                    return;
                }
                str = "force_update";
            }
            String str2 = str;
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            boolean zG = l46Var.g(str2);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = new a0e(null, str2, true);
                l46Var.p0(objR);
            }
            af1.p(d0eVar, true, (l26) objR, l46Var);
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new ond(13);
                l46Var.p0(objR2);
            }
            t72.b((x16) objR2, new s84(z3, z3, i2), af1.b0(-2044192161, new l30(d0eVar, zF, str2, x16Var, context), l46Var), l46Var, 438, 0);
            z2 = true;
        } else {
            l46Var.Z();
            z2 = z;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kg(d0eVar, x16Var, z2, i, 14);
        }
    }

    public static w57 c(ma8 ma8Var, cye cyeVar) {
        ma8Var.getClass();
        cyeVar.getClass();
        Instant instant = ma8Var.i().atStartOfDay(cyeVar.a).toInstant();
        instant.getClass();
        w57 w57Var = w57.a;
        return mh3.y(instant.getNano(), instant.getEpochSecond());
    }

    public static final mr7 d(t09 t09Var, em7 em7Var, l26 l26Var) {
        em7Var.getClass();
        mr7 mr7VarH = oa7.H(em7Var, l26Var, null, lp7.b, t09Var, false, 72);
        oa7.o(mr7VarH, job.a.b(ewf.class));
        return mr7VarH;
    }

    public static final LinkedHashSet e(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new il2(z, uri));
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return linkedHashSet;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ym8.t(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ym8.t(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static Bundle f(Parcel parcel, int i) {
        int iA = A(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iA);
        return bundle;
    }

    public static byte[] g(Parcel parcel, int i) {
        int iA = A(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iA);
        return bArrCreateByteArray;
    }

    public static byte[][] h(Parcel parcel, int i) {
        int iA = A(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iA);
        return bArr;
    }

    public static int[] i(Parcel parcel, int i) {
        int iA = A(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iA);
        return iArrCreateIntArray;
    }

    public static Parcelable j(Parcel parcel, int i, Parcelable.Creator creator) {
        int iA = A(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iA);
        return parcelable;
    }

    public static String k(Parcel parcel, int i) {
        int iA = A(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iA);
        return string;
    }

    public static ArrayList l(Parcel parcel, int i) {
        int iA = A(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateStringArrayList;
    }

    public static Object[] m(Parcel parcel, int i, Parcelable.Creator creator) {
        int iA = A(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iA);
        return objArrCreateTypedArray;
    }

    public static ArrayList n(Parcel parcel, int i, Parcelable.Creator creator) {
        int iA = A(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateTypedArrayList;
    }

    public static void o(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new fcc(ub3.h(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static final String p(long j) {
        String strH;
        if (j <= -999500000) {
            strH = tec.h((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strH = tec.h((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strH = tec.h((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strH = tec.h((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strH = tec.h((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strH = tec.h((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strH}, 1));
    }

    public static final txb q(ste steVar, int i) {
        rte rteVar = steVar.a;
        b59 b59Var = steVar.b;
        if (rteVar.a.b.length() != 0) {
            int iD = b59Var.d(i);
            if ((i != 0 && iD == b59Var.d(i - 1)) || (i != rteVar.a.b.length() && iD == b59Var.d(i + 1))) {
                return steVar.a(i);
            }
        }
        return steVar.k(i);
    }

    public static final us0 r(int i) {
        if (i == 0) {
            return us0.a;
        }
        if (i == 1) {
            return us0.b;
        }
        qc0.j(tec.f(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final qe9 s(int i) {
        if (i == 0) {
            return qe9.a;
        }
        if (i == 1) {
            return qe9.b;
        }
        if (i == 2) {
            return qe9.c;
        }
        if (i == 3) {
            return qe9.d;
        }
        if (i == 4) {
            return qe9.e;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return qe9.f;
        }
        qc0.j(tec.f(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final rs9 t(int i) {
        if (i == 0) {
            return rs9.a;
        }
        if (i == 1) {
            return rs9.b;
        }
        qc0.j(tec.f(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final vag u(int i) {
        if (i == 0) {
            return vag.a;
        }
        if (i == 1) {
            return vag.b;
        }
        if (i == 2) {
            return vag.c;
        }
        if (i == 3) {
            return vag.d;
        }
        if (i == 4) {
            return vag.e;
        }
        if (i == 5) {
            return vag.f;
        }
        qc0.j(tec.f(i, "Could not convert ", " to State"));
        return null;
    }

    public static final void v(Logger logger, ele eleVar, jle jleVar, String str) {
        logger.fine(jleVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + eleVar.a);
    }

    public static boolean w(Parcel parcel, int i) {
        I(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder x(Parcel parcel, int i) {
        int iA = A(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iA);
        return strongBinder;
    }

    public static int y(Parcel parcel, int i) {
        I(parcel, i, 4);
        return parcel.readInt();
    }

    public static long z(Parcel parcel, int i) {
        I(parcel, i, 8);
        return parcel.readLong();
    }
}
