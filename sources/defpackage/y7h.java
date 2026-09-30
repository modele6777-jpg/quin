package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Base64;
import android.view.InputEvent;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.config.a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y7h {
    public static volatile vr9 a;
    public static final dd2 b = new dd2(new ym0(23), false, 511544658);
    public static final dd2 c = new dd2(new xd2(9), false, -1755910198);
    public static final dd2 d = new dd2(new yd2(0), false, -446914307);
    public static final dd2 e = new dd2(new yd2(1), false, -1977323696);
    public static final dd2 f = new dd2(new yd2(2), false, -2060250745);
    public static final dd2 g = new dd2(new de2(14), false, -243444675);
    public static final dd2 h = new dd2(new ed2(11), false, 699680074);
    public static final bw2 i = bw2.a;
    public static final byte[] j = {112, 114, 111, 0};
    public static final byte[] k = {112, 114, 109, 0};
    public static volatile vd9 l;
    public static volatile kd9 m;

    public static final ArrayList A(Map map, a26 a26Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            ca9 ca9Var = (ca9) entry.getValue();
            Boolean boolValueOf = ca9Var != null ? Boolean.valueOf(ca9Var.b) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !ca9Var.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) a26Var.d((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final pv2 B(aw2 aw2Var, pv2 pv2Var) {
        pv2 pv2VarV = v(aw2Var.getCoroutineContext(), pv2Var, true);
        js3 js3Var = ga4.a;
        return (pv2VarV == js3Var || pv2VarV.F0(hj6.Z) != null) ? pv2VarV : pv2VarV.p0(js3Var);
    }

    public static final void C(opd opdVar, ac0 ac0Var, int i2) {
        while (true) {
            int i3 = opdVar.v;
            if (i2 > i3 && i2 < opdVar.u) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            opdVar.N();
            if (opdVar.x(opdVar.v)) {
                ac0Var.l();
            }
            opdVar.i();
        }
    }

    public static int[] D(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iG0 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iG0 += (int) db6.G0(byteArrayInputStream, 2);
            iArr[i3] = iG0;
        }
        return iArr;
    }

    public static me9 E(yhb yhbVar) throws EOFException {
        int i2 = Integer.parseInt(yhbVar.g0(Long.MAX_VALUE));
        long j2 = Long.parseLong(yhbVar.g0(Long.MAX_VALUE));
        long j3 = Long.parseLong(yhbVar.g0(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = Integer.parseInt(yhbVar.g0(Long.MAX_VALUE));
        for (int i4 = 0; i4 < i3; i4++) {
            String strG0 = yhbVar.g0(Long.MAX_VALUE);
            int iN = v4e.N(strG0, ':', 0, 6);
            if (iN == -1) {
                qc0.o("Unexpected header: ".concat(strG0));
                return null;
            }
            String string = v4e.o0(strG0.substring(0, iN)).toString();
            String strSubstring = strG0.substring(iN + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new me9(i2, j2, j3, new xd9(bm8.X(linkedHashMap)), null, null);
    }

    public static b84[] F(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b84[] b84VarArr) throws IOException {
        byte[] bArr3 = vfh.q;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, vfh.r)) {
                qc0.p("Unsupported meta version");
                return null;
            }
            int iG0 = (int) db6.G0(fileInputStream, 2);
            byte[] bArrE0 = db6.E0(fileInputStream, (int) db6.G0(fileInputStream, 4), (int) db6.G0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                qc0.p("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE0);
            try {
                b84[] b84VarArrH = H(byteArrayInputStream, bArr2, iG0, b84VarArr);
                byteArrayInputStream.close();
                return b84VarArrH;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(vfh.l, bArr2)) {
            qc0.p("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            qc0.p("Unsupported meta version");
            return null;
        }
        int iG1 = (int) db6.G0(fileInputStream, 1);
        byte[] bArrE1 = db6.E0(fileInputStream, (int) db6.G0(fileInputStream, 4), (int) db6.G0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            qc0.p("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrE1);
        try {
            b84[] b84VarArrG = G(byteArrayInputStream2, iG1, b84VarArr);
            byteArrayInputStream2.close();
            return b84VarArrG;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static b84[] G(ByteArrayInputStream byteArrayInputStream, int i2, b84[] b84VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b84[0];
        }
        if (i2 != b84VarArr.length) {
            qc0.p("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iG0 = (int) db6.G0(byteArrayInputStream, 2);
            iArr[i3] = (int) db6.G0(byteArrayInputStream, 2);
            strArr[i3] = new String(db6.D0(byteArrayInputStream, iG0), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            b84 b84Var = b84VarArr[i4];
            if (!b84Var.b.equals(strArr[i4])) {
                qc0.p("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            b84Var.e = i5;
            b84Var.h = D(byteArrayInputStream, i5);
        }
        return b84VarArr;
    }

    public static b84[] H(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, b84[] b84VarArr) throws IOException {
        b84 b84Var;
        if (byteArrayInputStream.available() == 0) {
            return new b84[0];
        }
        if (i2 != b84VarArr.length) {
            qc0.p("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            db6.G0(byteArrayInputStream, 2);
            String str = new String(db6.D0(byteArrayInputStream, (int) db6.G0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jG0 = db6.G0(byteArrayInputStream, 4);
            int iG0 = (int) db6.G0(byteArrayInputStream, 2);
            if (b84VarArr.length <= 0) {
                b84Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i4 = 0;
            while (true) {
                if (i4 >= b84VarArr.length) {
                    b84Var = null;
                    break;
                }
                if (b84VarArr[i4].b.equals(strSubstring)) {
                    b84Var = b84VarArr[i4];
                    break;
                }
                i4++;
            }
            if (b84Var == null) {
                qc0.p("Missing profile key: ".concat(str));
                return null;
            }
            b84Var.d = jG0;
            int[] iArrD = D(byteArrayInputStream, iG0);
            if (Arrays.equals(bArr, vfh.p)) {
                b84Var.e = iG0;
                b84Var.h = iArrD;
            }
        }
        return b84VarArr;
    }

    public static b84[] I(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, vfh.m)) {
            qc0.p("Unsupported version");
            return null;
        }
        int iG0 = (int) db6.G0(fileInputStream, 1);
        byte[] bArrE0 = db6.E0(fileInputStream, (int) db6.G0(fileInputStream, 4), (int) db6.G0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            qc0.p("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE0);
        try {
            b84[] b84VarArrJ = J(byteArrayInputStream, str, iG0);
            byteArrayInputStream.close();
            return b84VarArrJ;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static b84[] J(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b84[0];
        }
        b84[] b84VarArr = new b84[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iG0 = (int) db6.G0(byteArrayInputStream, 2);
            int iG1 = (int) db6.G0(byteArrayInputStream, 2);
            b84VarArr[i4] = new b84(str, new String(db6.D0(byteArrayInputStream, iG0), StandardCharsets.UTF_8), db6.G0(byteArrayInputStream, 4), iG1, (int) db6.G0(byteArrayInputStream, 4), (int) db6.G0(byteArrayInputStream, 4), new int[iG1], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            b84 b84Var = b84VarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = b84Var.f;
            int i7 = b84Var.g;
            TreeMap treeMap = b84Var.i;
            int i8 = iAvailable - i6;
            int iG2 = i3;
            while (byteArrayInputStream.available() > i8) {
                iG2 += (int) db6.G0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iG2), 1);
                int iG3 = (int) db6.G0(byteArrayInputStream, 2);
                while (iG3 > 0) {
                    db6.G0(byteArrayInputStream, 2);
                    int iG4 = (int) db6.G0(byteArrayInputStream, 1);
                    if (iG4 != 6 && iG4 != 7) {
                        while (iG4 > 0) {
                            db6.G0(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iG5 = (int) db6.G0(byteArrayInputStream, 1); iG5 > 0; iG5--) {
                                db6.G0(byteArrayInputStream, 2);
                            }
                            iG4--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iG3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                qc0.p("Read too much data during profile line parse");
                return null;
            }
            b84Var.h = D(byteArrayInputStream, b84Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(db6.D0(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return b84VarArr;
    }

    public static final j09 M(l26 l26Var) {
        return new wme(l26Var);
    }

    public static final pq7 N(Collection collection, qq7 qq7Var) {
        Iterator it = collection.iterator();
        pq7 pq7Var = null;
        while (it.hasNext()) {
            pq7 pq7Var2 = (pq7) it.next();
            if (pa7.t(pq7Var2.getType(), qq7Var)) {
                if (pq7Var != null) {
                    yg5.r(qq7Var, "Multiple extensions handle the same extension type: ");
                    return null;
                }
                pq7Var = pq7Var2;
            }
        }
        if (pq7Var != null) {
            return pq7Var;
        }
        yg5.r(qq7Var, "No extensions handle the extension type: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void O(Throwable th, xn2 xn2Var) {
        gs7 gs7Var;
        if (xn2Var instanceof gs7) {
            gs7Var = (gs7) xn2Var;
            int i2 = gs7Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gs7Var.label = i2 - Integer.MIN_VALUE;
            } else {
                gs7Var = new gs7(xn2Var);
            }
        } else {
            gs7Var = new gs7(xn2Var);
        }
        Object obj = gs7Var.result;
        int i3 = gs7Var.label;
        if (i3 == 0) {
            jzb.q(obj);
            gs7Var.L$0 = th;
            gs7Var.label = 1;
            ga4.a.Z0(gs7Var.getContext(), new v36(15, gs7Var, th));
            return;
        }
        if (i3 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return;
        }
        jzb.q(obj);
        oo3.f();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object P(int i2, Object obj, zxb zxbVar, ar5 ar5Var, int i3) {
        byte b2;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i4 = 0;
        z = false;
        if ((i2 & 1) == 0 || pa7.t(zxbVar.b, ar5Var)) {
            b2 = false;
        } else {
            ar5 ar5Var2 = ar5.d;
            if (ar5Var.compareTo(ar5Var2) < 0 || pa7.L(zxbVar.b.a, ar5Var2.a) >= 0) {
                b2 = false;
            } else {
                b2 = true;
            }
        }
        byte b3 = ((i2 & 2) == 0 || i3 == zxbVar.c) ? false : true;
        if (b3 != true && b2 != true) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int i5 = b2 != false ? ar5Var.a : zxbVar.b.a;
            if (b3 == false ? zxbVar.c == 1 : i3 == 1) {
                z = true;
            }
            return s.h((Typeface) obj, i5, z);
        }
        byte b4 = b3 == true && i3 == 1;
        if (b4 == true && b2 == true) {
            i4 = 3;
        } else if (b2 == true) {
            i4 = 1;
        } else if (b4 != false) {
            i4 = 2;
        }
        return Typeface.create((Typeface) obj, i4);
    }

    public static int Q(b94 b94Var, zdc zdcVar) {
        if (b94Var instanceof z84) {
            return ((z84) b94Var).a;
        }
        int iOrdinal = zdcVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        ap.c();
        return 0;
    }

    public static boolean R(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b84[] b84VarArr) throws IOException {
        int length;
        byte[] bArr2 = vfh.p;
        byte[] bArr3 = vfh.o;
        byte[] bArr4 = vfh.l;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = vfh.m;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrS = s(b84VarArr, bArr5);
                db6.l1(byteArrayOutputStream, b84VarArr.length, 1);
                db6.l1(byteArrayOutputStream, bArrS.length, 4);
                byte[] bArrB = db6.B(bArrS);
                db6.l1(byteArrayOutputStream, bArrB.length, 4);
                byteArrayOutputStream.write(bArrB);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                db6.l1(byteArrayOutputStream, b84VarArr.length, 1);
                for (b84 b84Var : b84VarArr) {
                    int size = b84Var.i.size() * 4;
                    String strW = w(b84Var.a, b84Var.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    db6.m1(byteArrayOutputStream, strW.getBytes(charset).length);
                    db6.m1(byteArrayOutputStream, b84Var.h.length);
                    db6.l1(byteArrayOutputStream, size, 4);
                    db6.l1(byteArrayOutputStream, b84Var.c, 4);
                    byteArrayOutputStream.write(strW.getBytes(charset));
                    Iterator it = b84Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        db6.m1(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        db6.m1(byteArrayOutputStream, 0);
                    }
                    for (int i3 : b84Var.h) {
                        db6.m1(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = vfh.n;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrS2 = s(b84VarArr, bArr6);
                db6.l1(byteArrayOutputStream, b84VarArr.length, 1);
                db6.l1(byteArrayOutputStream, bArrS2.length, 4);
                byte[] bArrB2 = db6.B(bArrS2);
                db6.l1(byteArrayOutputStream, bArrB2.length, 4);
                byteArrayOutputStream.write(bArrB2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            db6.m1(byteArrayOutputStream, b84VarArr.length);
            for (b84 b84Var2 : b84VarArr) {
                String str = b84Var2.a;
                TreeMap treeMap = b84Var2.i;
                String strW2 = w(str, b84Var2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                db6.m1(byteArrayOutputStream, strW2.getBytes(charset2).length);
                db6.m1(byteArrayOutputStream, treeMap.size());
                db6.m1(byteArrayOutputStream, b84Var2.h.length);
                db6.l1(byteArrayOutputStream, b84Var2.c, 4);
                byteArrayOutputStream.write(strW2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    db6.m1(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : b84Var2.h) {
                    db6.m1(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            db6.m1(byteArrayOutputStream2, b84VarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (b84 b84Var3 : b84VarArr) {
                db6.l1(byteArrayOutputStream2, b84Var3.c, 4);
                db6.l1(byteArrayOutputStream2, b84Var3.d, 4);
                db6.l1(byteArrayOutputStream2, b84Var3.g, 4);
                String strW3 = w(b84Var3.a, b84Var3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strW3.getBytes(charset3).length;
                db6.m1(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strW3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            tcg tcgVar = new tcg(qd5.a, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(tcgVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            for (int i8 = 0; i8 < b84VarArr.length; i8++) {
                try {
                    b84 b84Var4 = b84VarArr[i8];
                    db6.m1(byteArrayOutputStream3, i8);
                    db6.m1(byteArrayOutputStream3, b84Var4.e);
                    i7 = i7 + 4 + (b84Var4.e * i5);
                    int[] iArr = b84Var4.h;
                    int length3 = iArr.length;
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < length3) {
                        int i11 = iArr[i9];
                        db6.m1(byteArrayOutputStream3, i11 - i10);
                        i9++;
                        i5 = i5;
                        i10 = i11;
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            tcg tcgVar2 = new tcg(qd5.b, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(tcgVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < b84VarArr.length) {
                try {
                    b84 b84Var5 = b84VarArr[i12];
                    Iterator it3 = b84Var5.i.entrySet().iterator();
                    int iIntValue = i2;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        W(byteArrayOutputStream5, iIntValue, b84Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            X(byteArrayOutputStream6, b84Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            db6.m1(byteArrayOutputStream4, i12);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i13 + 6;
                            db6.l1(byteArrayOutputStream4, length4, 4);
                            db6.m1(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i14 + length4;
                            i12++;
                            i2 = 0;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            tcg tcgVar3 = new tcg(qd5.c, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(tcgVar3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            db6.l1(byteArrayOutputStream, arrayList.size(), 4);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                tcg tcgVar4 = (tcg) arrayList.get(i15);
                qd5 qd5Var = tcgVar4.a;
                byte[] bArr7 = tcgVar4.b;
                db6.l1(byteArrayOutputStream, qd5Var.a(), 4);
                db6.l1(byteArrayOutputStream, size2, 4);
                if (tcgVar4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrB3 = db6.B(bArr7);
                    arrayList2.add(bArrB3);
                    db6.l1(byteArrayOutputStream, bArrB3.length, 4);
                    db6.l1(byteArrayOutputStream, length5, 4);
                    length = bArrB3.length;
                } else {
                    arrayList2.add(bArr7);
                    db6.l1(byteArrayOutputStream, bArr7.length, 4);
                    db6.l1(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
            }
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static final hbf S(xn2 xn2Var, pv2 pv2Var, Object obj) {
        hbf hbfVar = null;
        if ((xn2Var instanceof cw2) && pv2Var.F0(ul1.d) != null) {
            cw2 cw2VarE = (cw2) xn2Var;
            while (!(cw2VarE instanceof ba4) && (cw2VarE = cw2VarE.e()) != null) {
                if (cw2VarE instanceof hbf) {
                    hbfVar = (hbf) cw2VarE;
                    break;
                }
            }
            if (hbfVar != null) {
                hbfVar.o0(pv2Var, obj);
            }
        }
        return hbfVar;
    }

    public static final void T(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            qc0.j("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            qc0.j("colors and colorStops arguments must have equal length.");
        }
    }

    public static void U(ByteArrayOutputStream byteArrayOutputStream, b84 b84Var) throws IOException {
        X(byteArrayOutputStream, b84Var);
        int i2 = b84Var.g;
        int[] iArr = b84Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            db6.m1(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : b84Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void V(ByteArrayOutputStream byteArrayOutputStream, b84 b84Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        db6.m1(byteArrayOutputStream, str.getBytes(charset).length);
        db6.m1(byteArrayOutputStream, b84Var.e);
        db6.l1(byteArrayOutputStream, b84Var.f, 4);
        db6.l1(byteArrayOutputStream, b84Var.c, 4);
        db6.l1(byteArrayOutputStream, b84Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void W(ByteArrayOutputStream byteArrayOutputStream, int i2, b84 b84Var) throws IOException {
        int i3 = b84Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : b84Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, b84 b84Var) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : b84Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                db6.m1(byteArrayOutputStream, iIntValue - i2);
                db6.m1(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static void Y(me9 me9Var, xhb xhbVar) {
        xhbVar.T0(me9Var.a);
        xhbVar.writeByte(10);
        xhbVar.T0(me9Var.b);
        xhbVar.writeByte(10);
        xhbVar.T0(me9Var.c);
        xhbVar.writeByte(10);
        Set<Map.Entry> setEntrySet = me9Var.d.a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        xhbVar.T0(size);
        xhbVar.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                xhbVar.i0((String) entry.getKey());
                xhbVar.i0(":");
                xhbVar.i0(str);
                xhbVar.writeByte(10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:75:0x017b, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0048, B:74:0x0177, B:76:0x017e, B:77:0x0181, B:78:0x0182, B:26:0x004c, B:28:0x0050, B:29:0x005d, B:31:0x0063, B:37:0x0079, B:39:0x007f, B:40:0x008b, B:61:0x015b, B:62:0x015e, B:70:0x016e, B:69:0x016b, B:71:0x016f, B:72:0x0174, B:73:0x0175, B:32:0x0069, B:36:0x0070), top: B:83:0x0007, inners: #5 }] */
    public static vr9 Z(Context context) {
        vr9 vr9Var;
        vr9 gtaVar;
        vr9 gtaVar2;
        char c2;
        vr9 vr9Var2 = a;
        if (vr9Var2 != null) {
            return vr9Var2;
        }
        synchronized (y7h.class) {
            try {
                vr9Var = a;
                if (vr9Var == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    kd0 kd0Var = a8h.a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        vr9Var = v.a;
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c3 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                gtaVar = file.exists() ? new gta(file) : v.a;
                            } catch (RuntimeException e2) {
                                b1.e("HermeticFileOverrides", "no data dir", e2);
                                gtaVar = v.a;
                            }
                            if (gtaVar.b()) {
                                File file2 = (File) gtaVar.a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.b(file2, new FileInputStream(file2))));
                                    try {
                                        wid widVar = new wid(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                b1.d("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c3]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                wid widVar2 = (wid) widVar.get(str3);
                                                if (widVar2 == null) {
                                                    c2 = 0;
                                                    widVar2 = new wid(0);
                                                    widVar.put(str3, widVar2);
                                                } else {
                                                    c2 = 0;
                                                }
                                                widVar2.put(strDecode, strDecode2);
                                                c3 = c2;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        b1.l("HermeticFileOverrides", sb2.toString());
                                        x7h x7hVar = new x7h(widVar);
                                        bufferedReader.close();
                                        gtaVar2 = new gta(x7hVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            } else {
                                gtaVar2 = v.a;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            vr9Var = gtaVar2;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        vr9Var = v.a;
                    }
                    a = vr9Var;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vr9Var;
    }

    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        switch (i2) {
            case 1:
                objArr[0] = "member";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                objArr[0] = "descriptor";
                break;
            case 3:
                objArr[0] = "element";
                break;
            case 5:
                objArr[0] = "field";
                break;
            case 7:
                objArr[0] = "javaClass";
                break;
            default:
                objArr[0] = "fqName";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (i2) {
            case 1:
            case 2:
                objArr[2] = "recordMethod";
                break;
            case 3:
            case 4:
                objArr[2] = "recordConstructor";
                break;
            case 5:
            case 6:
                objArr[2] = "recordField";
                break;
            case 7:
            case 8:
                objArr[2] = "recordClass";
                break;
            default:
                objArr[2] = "getClassResolvedFromSource";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final za2 b(Object obj) {
        za2 za2Var = new za2();
        za2Var.R(obj);
        return za2Var;
    }

    public static final void c(final List list, final List list2, final a26 a26Var, final l26 l26Var, final a26 a26Var2, final a26 a26Var3, final boolean z, final ghc ghcVar, final float f2, final float f3, l46 l46Var, final int i2) {
        float f4;
        Object ml4Var;
        final n69 n69Var;
        Map map;
        int i3;
        s69 s69Var;
        int i4;
        n69 n69Var2;
        Object nl4Var;
        Map map2;
        e89 e89Var;
        s69 s69Var2;
        hl9 hl9Var;
        final e89 e89Var2;
        list.getClass();
        list2.getClass();
        a26Var.getClass();
        l26Var.getClass();
        a26Var2.getClass();
        a26Var3.getClass();
        l46Var.h0(-152096379);
        int i5 = i2 | (l46Var.g(list) ? 4 : 2) | (l46Var.g(list2) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(l26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(a26Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.h(z) ? 1048576 : 524288) | (l46Var.g(ghcVar) ? 8388608 : 4194304) | (l46Var.d(f2) ? 67108864 : 33554432) | (l46Var.d(f3) ? 536870912 : 268435456);
        if (l46Var.W(i5 & 1, (306783379 & i5) != 306783378)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = kv2.f(-1, l46Var);
            }
            s69 s69Var3 = (s69) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(new hl9(0L));
                l46Var.p0(objR2);
            }
            e89 e89Var3 = (e89) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = kv2.f(-1, l46Var);
            }
            s69 s69Var4 = (s69) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == i8cVar) {
                objR4 = new LinkedHashMap();
                l46Var.p0(objR4);
            }
            Map map3 = (Map) objR4;
            Object objR5 = l46Var.R();
            if (objR5 == i8cVar) {
                objR5 = new qz9(0.0f);
                l46Var.p0(objR5);
            }
            n69 n69Var3 = (n69) objR5;
            Object objR6 = l46Var.R();
            if (objR6 == i8cVar) {
                objR6 = new qz9(0.0f);
                l46Var.p0(objR6);
            }
            n69 n69Var4 = (n69) objR6;
            float fP0 = ((sw3) l46Var.k(zg2.h)).p0(80.0f);
            Object objR7 = l46Var.R();
            if (objR7 == i8cVar) {
                objR7 = kv2.f(0, l46Var);
            }
            final s69 s69Var5 = (s69) objR7;
            Object objR8 = l46Var.R();
            if (objR8 == i8cVar) {
                f4 = 0.0f;
                objR8 = new qz9(0.0f);
                l46Var.p0(objR8);
            } else {
                f4 = 0.0f;
            }
            final n69 n69Var5 = (n69) objR8;
            Object objR9 = l46Var.R();
            if (objR9 == i8cVar) {
                objR9 = q1c.f(null);
                l46Var.p0(objR9);
            }
            e89 e89Var4 = (e89) objR9;
            float fJ = (ghcVar == null || ((sz9) s69Var3).j() < 0) ? f4 : ghcVar.a.j() - ((sz9) s69Var5).j();
            sz9 sz9Var = (sz9) s69Var3;
            Integer numValueOf = Integer.valueOf(sz9Var.j());
            int i6 = i5 & 29360128;
            boolean zD = (i6 == 8388608) | ((i5 & 1879048192) == 536870912) | ((i5 & 234881024) == 67108864) | l46Var.d(fP0);
            Object objR10 = l46Var.R();
            if (zD || objR10 == i8cVar) {
                n69Var = n69Var4;
                map = map3;
                i3 = i6;
                s69Var = s69Var3;
                i4 = 8388608;
                ml4Var = new ml4(ghcVar, s69Var, n69Var, f3, f2, fP0, 30.0f, n69Var3, null);
                n69Var2 = n69Var3;
                l46Var.p0(ml4Var);
            } else {
                ml4Var = objR10;
                map = map3;
                i3 = i6;
                n69Var = n69Var4;
                s69Var = s69Var3;
                i4 = 8388608;
                n69Var2 = n69Var3;
            }
            af1.o((l26) ml4Var, l46Var, numValueOf);
            Float fValueOf = Float.valueOf(fJ);
            hl9 hl9Var2 = (hl9) e89Var3.getValue();
            long j2 = hl9Var2.a;
            Integer numValueOf2 = Integer.valueOf(sz9Var.j());
            boolean zI = l46Var.i(map) | (i3 == i4);
            Object objR11 = l46Var.R();
            if (zI || objR11 == i8cVar) {
                map2 = map;
                e89Var = e89Var3;
                s69Var2 = s69Var4;
                hl9Var = hl9Var2;
                nl4Var = new nl4(ghcVar, s69Var, e89Var4, e89Var, 0.3f, map2, s69Var2, null);
                e89Var2 = e89Var4;
                l46Var.p0(nl4Var);
            } else {
                map2 = map;
                s69Var2 = s69Var4;
                e89Var2 = e89Var4;
                hl9Var = hl9Var2;
                nl4Var = objR11;
                e89Var = e89Var3;
            }
            af1.q(fValueOf, hl9Var, numValueOf2, (l26) nl4Var, l46Var);
            final s69 s69Var6 = s69Var;
            final e89 e89Var5 = e89Var;
            final Map map4 = map2;
            final s69 s69Var7 = s69Var2;
            final n69 n69Var6 = n69Var2;
            final float f5 = fJ;
            ynb.j(b.c(g09.a, 1.0f), new uc0(8.0f, true, new jv2(3, ndb.Z)), new uc0(16.0f, true, new qc0(0)), null, 3, 0, af1.b0(19081408, new n26() { // from class: fl4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    Object obj4;
                    e89 e89Var6;
                    final ghc ghcVar2;
                    n69 n69Var7;
                    e89 e89Var7;
                    final n69 n69Var8;
                    n69 n69Var9;
                    s69 s69Var8;
                    s69 s69Var9;
                    n69 n69Var10;
                    String desc;
                    String name;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((en5) obj).getClass();
                    int i7 = 1;
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Iterator it = list.iterator();
                        int i8 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                t72.Z();
                                throw null;
                            }
                            TarotCardChoice tarotCardChoice = (TarotCardChoice) next;
                            PatternData patternData = (PatternData) s72.y0(i8, list2);
                            final s69 s69Var10 = s69Var6;
                            int i10 = ((sz9) s69Var10).j() == i8 ? i7 : 0;
                            final s69 s69Var11 = s69Var7;
                            int i11 = ((sz9) s69Var11).j() == i8 ? i7 : 0;
                            j09 j09VarW = fdc.w(g09.a, i10 != 0 ? 10.0f : 0.0f);
                            final Map map5 = map4;
                            boolean zI2 = l46Var2.i(map5) | l46Var2.e(i8);
                            final ghc ghcVar3 = ghcVar;
                            boolean zG = zI2 | l46Var2.g(ghcVar3);
                            Object objR12 = l46Var2.R();
                            i8c i8cVar2 = sf2.a;
                            if (zG || objR12 == i8cVar2) {
                                objR12 = new g01(map5, i8, ghcVar3, i7);
                                l46Var2.p0(objR12);
                            }
                            j09 j09VarW2 = nk8.w(j09VarW, (a26) objR12);
                            String str = (patternData == null || (name = patternData.getName()) == null) ? "" : name;
                            String str2 = (patternData == null || (desc = patternData.getDesc()) == null) ? "" : desc;
                            final e89 e89Var8 = e89Var5;
                            long j3 = i10 != 0 ? ((hl9) e89Var8.getValue()).a : 0L;
                            float f6 = i10 != 0 ? f5 : 0.0f;
                            a26 a26Var4 = a26Var;
                            boolean zG2 = l46Var2.g(a26Var4) | l46Var2.e(i8);
                            Object objR13 = l46Var2.R();
                            if (zG2 || objR13 == i8cVar2) {
                                objR13 = new rr1(i8, 2, a26Var4);
                                l46Var2.p0(objR13);
                            }
                            x16 x16Var = (x16) objR13;
                            a26 a26Var5 = a26Var2;
                            boolean zG3 = l46Var2.g(a26Var5) | l46Var2.e(i8);
                            Object objR14 = l46Var2.R();
                            if (zG3 || objR14 == i8cVar2) {
                                objR14 = new rr1(i8, 3, a26Var5);
                                l46Var2.p0(objR14);
                            }
                            x16 x16Var2 = (x16) objR14;
                            a26 a26Var6 = a26Var3;
                            boolean zG4 = l46Var2.g(a26Var6) | l46Var2.e(i8);
                            Object objR15 = l46Var2.R();
                            if (zG4 || objR15 == i8cVar2) {
                                objR15 = new rr1(i8, 4, a26Var6);
                                l46Var2.p0(objR15);
                            }
                            x16 x16Var3 = (x16) objR15;
                            boolean zE = l46Var2.e(i8) | l46Var2.g(ghcVar3) | l46Var2.i(map5);
                            Object objR16 = l46Var2.R();
                            final n69 n69Var11 = n69Var6;
                            final s69 s69Var12 = s69Var5;
                            Iterator it2 = it;
                            final e89 e89Var9 = e89Var2;
                            final n69 n69Var12 = n69Var5;
                            final n69 n69Var13 = n69Var;
                            if (zE || objR16 == i8cVar2) {
                                final int i12 = i8;
                                obj4 = new x16() { // from class: kl4
                                    @Override // defpackage.x16
                                    public final Object invoke() {
                                        sz9 sz9Var2 = (sz9) s69Var10;
                                        int i13 = i12;
                                        sz9Var2.k(i13);
                                        e89Var8.setValue(new hl9(0L));
                                        ((sz9) s69Var11).k(-1);
                                        ((qz9) n69Var11).k(0.0f);
                                        ghc ghcVar4 = ghcVar3;
                                        int iJ = ghcVar4 != null ? ghcVar4.a.j() : 0;
                                        sz9 sz9Var3 = (sz9) s69Var12;
                                        sz9Var3.k(iJ);
                                        ol4 ol4Var = (ol4) map5.get(Integer.valueOf(i13));
                                        if (ol4Var != null) {
                                            hkb hkbVarE = y7h.e(ol4Var, sz9Var3.j());
                                            e89Var9.setValue(hkbVarE);
                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (hkbVarE.d() & 4294967295L));
                                            qz9 qz9Var = (qz9) n69Var12;
                                            qz9Var.k(fIntBitsToFloat);
                                            ((qz9) n69Var13).k(qz9Var.j());
                                        }
                                        return wef.a;
                                    }
                                };
                                e89Var6 = e89Var8;
                                s69Var11 = s69Var11;
                                i8 = i12;
                                ghcVar2 = ghcVar3;
                                n69Var7 = n69Var13;
                                e89Var7 = e89Var9;
                                n69Var8 = n69Var12;
                                n69Var9 = n69Var11;
                                map5 = map5;
                                l46Var2.p0(obj4);
                            } else {
                                n69Var7 = n69Var13;
                                n69Var8 = n69Var12;
                                e89Var7 = e89Var9;
                                n69Var9 = n69Var11;
                                obj4 = objR16;
                                ghcVar2 = ghcVar3;
                                e89Var6 = e89Var8;
                            }
                            x16 x16Var4 = (x16) obj4;
                            boolean zG5 = l46Var2.g(ghcVar2) | l46Var2.i(map5) | l46Var2.e(i8);
                            Object objR17 = l46Var2.R();
                            if (zG5 || objR17 == i8cVar2) {
                                final e89 e89Var10 = e89Var6;
                                final e89 e89Var11 = e89Var7;
                                final s69 s69Var13 = s69Var11;
                                final n69 n69Var14 = n69Var7;
                                final int i13 = i8;
                                a26 a26Var7 = new a26() { // from class: ll4
                                    @Override // defpackage.a26
                                    public final Object d(Object obj5) {
                                        e89 e89Var12 = e89Var10;
                                        e89Var12.setValue(new hl9(hl9.g(((hl9) e89Var12.getValue()).a, ((hl9) obj5).a)));
                                        ((qz9) n69Var14).k(Float.intBitsToFloat((int) (((hl9) e89Var12.getValue()).a & 4294967295L)) + ((qz9) n69Var8).j());
                                        e89 e89Var13 = e89Var11;
                                        if (((hkb) e89Var13.getValue()) != null) {
                                            ghc ghcVar4 = ghcVar2;
                                            int iJ = ghcVar4 != null ? ghcVar4.a.j() : 0;
                                            hkb hkbVar = (hkb) e89Var13.getValue();
                                            hkbVar.getClass();
                                            ((sz9) s69Var13).k(y7h.d(0.3f, map5, hkbVar.k(((hl9) e89Var12.getValue()).a), i13, iJ));
                                        }
                                        return wef.a;
                                    }
                                };
                                s69Var11 = s69Var13;
                                e89Var7 = e89Var11;
                                e89Var6 = e89Var10;
                                l46Var2.p0(a26Var7);
                                objR17 = a26Var7;
                            }
                            a26 a26Var8 = (a26) objR17;
                            l26 l26Var2 = l26Var;
                            boolean zG6 = l46Var2.g(l26Var2);
                            Object objR18 = l46Var2.R();
                            if (zG6 || objR18 == i8cVar2) {
                                s69Var8 = s69Var10;
                                n69 n69Var15 = n69Var9;
                                zr2 zr2Var = new zr2(l26Var2, n69Var15, s69Var8, s69Var11, e89Var6, s69Var12, e89Var7);
                                s69Var9 = s69Var12;
                                n69Var10 = n69Var15;
                                l46Var2.p0(zr2Var);
                                objR18 = zr2Var;
                            } else {
                                s69Var8 = s69Var10;
                                n69Var10 = n69Var9;
                                s69Var9 = s69Var12;
                            }
                            x16 x16Var5 = (x16) objR18;
                            Object objR19 = l46Var2.R();
                            if (objR19 == i8cVar2) {
                                objR19 = new xi3(n69Var10, s69Var8, e89Var6, s69Var11, s69Var9, e89Var7, 1);
                                l46Var2.p0(objR19);
                            }
                            l46 l46Var3 = l46Var2;
                            y7h.f(j09VarW2, i8, tarotCardChoice, str, str2, i10, i11, j3, f6, z, x16Var, x16Var2, x16Var3, x16Var4, a26Var8, x16Var5, (x16) objR19, l46Var3, 0);
                            i7 = i7;
                            l46Var2 = l46Var3;
                            i8 = i9;
                            it = it2;
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 1597878, 40);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(list, list2, a26Var, l26Var, a26Var2, a26Var3, z, ghcVar, f2, f3, i2) { // from class: jl4
                public final /* synthetic */ List a;
                public final /* synthetic */ List b;
                public final /* synthetic */ a26 c;
                public final /* synthetic */ l26 d;
                public final /* synthetic */ a26 e;
                public final /* synthetic */ a26 f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ ghc v;
                public final /* synthetic */ float w;
                public final /* synthetic */ float x;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(196609);
                    y7h.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final int d(float f2, Map map, hkb hkbVar, int i2, int i3) {
        int i4 = -1;
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            ol4 ol4Var = (ol4) entry.getValue();
            if (iIntValue != i2) {
                hkb hkbVarE = e(ol4Var, i3);
                hkb hkbVarG = hkbVarE.g(hkbVar);
                if (!hkbVarG.h()) {
                    float f3 = (hkbVarG.d - hkbVarG.b) * (hkbVarG.c - hkbVarG.a);
                    float f4 = (hkbVarE.d - hkbVarE.b) * (hkbVarE.c - hkbVarE.a);
                    float f5 = f4 > 0.0f ? f3 / f4 : 0.0f;
                    if (f5 > f2) {
                        f2 = f5;
                        i4 = iIntValue;
                    }
                }
            }
        }
        return i4;
    }

    public static final hkb e(ol4 ol4Var, int i2) {
        return ol4Var.a.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(-(i2 - ol4Var.b))) & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v51 */
    public static final void f(final j09 j09Var, final int i2, TarotCardChoice tarotCardChoice, final String str, final String str2, final boolean z, final boolean z2, final long j2, final float f2, final boolean z3, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, final a26 a26Var, final x16 x16Var5, final x16 x16Var6, l46 l46Var, final int i3) {
        l46 l46Var2;
        he2 he2Var;
        int i4;
        float f3;
        boolean z4;
        l46 l46Var3;
        l46 l46Var4;
        j09 j09VarW;
        j09 j09Var2;
        boolean z5;
        boolean z6;
        j09 j09Var3;
        l46 l46Var5;
        g09 g09Var;
        ?? r5;
        boolean z7;
        boolean z8;
        j09 j09VarW2;
        j09 j09Var4;
        boolean z9;
        final TarotCardChoice tarotCardChoice2 = tarotCardChoice;
        l46 l46Var6 = l46Var;
        lx0 lx0Var = ndb.f;
        lx0 lx0Var2 = ndb.b;
        l46Var6.h0(717152);
        int i5 = i3 | (l46Var6.g(j09Var) ? 4 : 2) | (l46Var6.g(tarotCardChoice2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var6.g(str) ? 2048 : 1024) | (l46Var6.g(str2) ? 16384 : 8192) | (l46Var6.h(z) ? 131072 : 65536) | (l46Var6.h(z2) ? 1048576 : 524288) | (l46Var6.f(j2) ? 8388608 : 4194304) | (l46Var6.d(f2) ? 67108864 : 33554432) | (l46Var6.h(z3) ? 536870912 : 268435456);
        int i6 = 0 | (l46Var6.i(x16Var) ? (char) 4 : (char) 2) | (l46Var6.i(x16Var2) ? 32 : 16) | (l46Var6.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var6.i(x16Var4) ? (char) 2048 : (char) 1024) | (l46Var6.i(a26Var) ? (char) 16384 : (char) 8192) | (l46Var6.i(x16Var5) ? (char) 0 : (char) 0);
        if (l46Var6.W(i5 & 1, ((i5 & 306783363) == 306783362 && (599187 & i6) == 599186) ? false : true)) {
            float aspectRatio = ((die) l46Var6.k(snd.a)).a.getAspectRatio();
            j09 j09VarP = b.p(j09Var, 109.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var6, 48);
            int iHashCode = Long.hashCode(l46Var6.T);
            u8a u8aVarM = l46Var6.m();
            j09 j09VarJ = m93.J(l46Var6, j09VarP);
            lf2.q.getClass();
            l46Var6.j0();
            boolean z10 = l46Var6.S;
            x16 x16Var7 = LayoutNode.h1;
            if (z10) {
                l46Var6.l(x16Var7);
            } else {
                l46Var6.s0();
            }
            he2 he2Var2 = hj6.z;
            dec.l(he2Var2, l46Var6, c92VarA);
            he2 he2Var3 = hj6.y;
            dec.l(he2Var3, l46Var6, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var4 = hj6.X;
            dec.l(he2Var4, l46Var6, numValueOf);
            dec.k(l46Var6);
            he2 he2Var5 = hj6.x;
            dec.l(he2Var5, l46Var6, j09VarJ);
            j09 j09VarC = g09.a;
            Object obj = sf2.a;
            if (tarotCardChoice2 == null) {
                l46Var6.f0(-1623466733);
                j09 j09VarW3 = dj6.w(b.p(j09VarC, 109.0f), aspectRatio);
                if (z2) {
                    l46Var6.f0(-1623332131);
                    j09VarW2 = db6.w(j09VarC, 2.0f, ((m82) l46Var6.k(o82.a)).a, a7c.b(eze.a(l46Var6).a.f));
                    z8 = false;
                    l46Var6.r(false);
                    j09VarW3 = j09VarW3;
                } else {
                    z8 = false;
                    l46Var6.f0(1748756754);
                    l46Var6.r(false);
                    j09VarW2 = j09VarC;
                }
                j09 j09VarD = j09VarW3.D(j09VarW2);
                xn8 xn8VarC = s21.c(lx0Var2, z8);
                int iHashCode2 = Long.hashCode(l46Var6.T);
                u8a u8aVarM2 = l46Var6.m();
                j09 j09VarJ2 = m93.J(l46Var6, j09VarD);
                l46Var6.j0();
                if (l46Var6.S) {
                    l46Var6.l(x16Var7);
                } else {
                    l46Var6.s0();
                }
                dec.l(he2Var2, l46Var6, xn8VarC);
                dec.l(he2Var3, l46Var6, u8aVarM2);
                ib8.s(iHashCode2, l46Var6, he2Var4, l46Var6);
                dec.l(he2Var5, l46Var6, j09VarJ2);
                j09 j09VarP2 = pa7.p(b.c, z2 ? 1.0f : 0.8f);
                if (z3) {
                    l46Var6.f0(-56072955);
                    boolean z11 = (i6 & 896) == 256;
                    Object objR = l46Var6.R();
                    if (z11 || objR == obj) {
                        objR = new c20(16, x16Var3);
                        l46Var6.p0(objR);
                    }
                    j09VarC = androidx.compose.foundation.b.c(j09VarC, false, null, null, (x16) objR, 15);
                    j09Var4 = j09VarC;
                    z9 = false;
                    l46Var6.r(false);
                } else {
                    j09Var4 = j09VarC;
                    z9 = false;
                    l46Var6.f0(-56071439);
                    l46Var6.r(false);
                }
                hkg.L(j09VarP2.D(j09VarC), z3, str2, 0.0f, 0.0f, 0.0f, l46Var6, ((i5 >> 24) & 112) | ((i5 >> 6) & 896));
                l46Var6.r(true);
                l46Var6.r(z9);
                g09Var = j09Var4;
                l46Var5 = l46Var6;
            } else {
                l46Var6.f0(-1622558185);
                xn8 xn8VarC2 = s21.c(lx0Var2, false);
                int iHashCode3 = Long.hashCode(l46Var6.T);
                u8a u8aVarM3 = l46Var6.m();
                j09 j09VarJ3 = m93.J(l46Var6, j09VarC);
                l46Var6.j0();
                if (l46Var6.S) {
                    l46Var6.l(x16Var7);
                } else {
                    l46Var6.s0();
                }
                dec.l(he2Var2, l46Var6, xn8VarC2);
                dec.l(he2Var3, l46Var6, u8aVarM3);
                ib8.s(iHashCode3, l46Var6, he2Var4, l46Var6);
                dec.l(he2Var5, l46Var6, j09VarJ3);
                if (z) {
                    l46Var6.f0(-1323762265);
                    j09 j09VarE = oa7.E(pa7.p(dj6.w(b.p(j09VarC, 109.0f), aspectRatio), 0.3f), a7c.b(eze.a(l46Var6).a.f));
                    long j3 = y72.c;
                    f3 = aspectRatio;
                    j09 j09VarW4 = db6.w(tm7.o(j09VarE, y72.b(j3, 0.3f), g21.f), 1.0f, y72.b(j3, 0.5f), a7c.b(eze.a(l46Var6).a.f));
                    xn8 xn8VarC3 = s21.c(lx0Var, false);
                    int iHashCode4 = Long.hashCode(l46Var6.T);
                    u8a u8aVarM4 = l46Var6.m();
                    j09 j09VarJ4 = m93.J(l46Var6, j09VarW4);
                    l46Var6.j0();
                    if (l46Var6.S) {
                        l46Var6.l(x16Var7);
                    } else {
                        l46Var6.s0();
                    }
                    dec.l(he2Var2, l46Var6, xn8VarC3);
                    dec.l(he2Var3, l46Var6, u8aVarM4);
                    ib8.s(iHashCode4, l46Var6, he2Var4, l46Var6);
                    dec.l(he2Var5, l46Var6, j09VarJ4);
                    he2Var = he2Var4;
                    i4 = i6;
                    z4 = true;
                    b21.p(oa7.E(pa7.p(dj6.w(b.p(j09VarC, 109.0f), f3), 0.4f), a7c.b(eze.a(l46Var6).a.f)), tarotCardChoice, 0.0f, false, l46Var6, (i5 >> 3) & 112);
                    l46 l46Var7 = l46Var6;
                    l46Var7.r(true);
                    l46Var7.r(false);
                    l46Var3 = l46Var7;
                } else {
                    he2Var = he2Var4;
                    l46 l46Var8 = l46Var6;
                    i4 = i6;
                    f3 = aspectRatio;
                    z4 = true;
                    l46Var8.f0(-1322967518);
                    l46Var8.r(false);
                    l46Var3 = l46Var8;
                }
                final y6c y6cVarB = a7c.b(eze.a(l46Var3).a.f);
                boolean zG = ((i5 & 458752) == 131072 ? z4 : false) | ((i5 & 29360128) == 8388608 ? z4 : false) | ((i5 & 234881024) == 67108864 ? z4 : false) | l46Var3.g(y6cVarB);
                Object objR2 = l46Var3.R();
                if (zG || objR2 == obj) {
                    l46 l46Var9 = l46Var;
                    Object obj2 = new a26() { // from class: gl4
                        @Override // defpackage.a26
                        public final Object d(Object obj3) {
                            g0c g0cVar = (g0c) obj3;
                            g0cVar.getClass();
                            if (z) {
                                long j4 = j2;
                                g0cVar.E(Float.intBitsToFloat((int) (j4 >> 32)));
                                g0cVar.G(Float.intBitsToFloat((int) (j4 & 4294967295L)) + f2);
                                g0cVar.q(1.05f);
                                g0cVar.r(1.05f);
                                g0cVar.v(16.0f);
                                g0cVar.w(y6cVarB);
                                g0cVar.g(true);
                            }
                            return wef.a;
                        }
                    };
                    l46Var9.p0(obj2);
                    objR2 = obj2;
                    l46Var4 = l46Var9;
                } else {
                    l46Var4 = l46Var3;
                }
                j09 j09VarX = bzd.x(j09VarC, (a26) objR2);
                if (z2) {
                    l46Var4.f0(-1322438565);
                    j09VarW = db6.w(j09VarC, 2.0f, ((m82) l46Var4.k(o82.a)).a, a7c.b(eze.a(l46Var4).a.f));
                    l46Var4.r(false);
                } else {
                    l46Var4.f0(-458293944);
                    l46Var4.r(false);
                    j09VarW = j09VarC;
                }
                j09 j09VarD2 = j09VarX.D(j09VarW);
                boolean z12 = (i4 & 14) == 4;
                Object objR3 = l46Var4.R();
                if (z12 || objR3 == obj) {
                    objR3 = new fu1(1, x16Var);
                    l46Var4.p0(objR3);
                }
                j09 j09VarA = ibe.a(j09VarD2, tarotCardChoice, (PointerInputEventHandler) objR3);
                boolean z13 = ((i4 & 7168) == 2048) | ((i4 & 458752) == 131072) | ((57344 & i4) == 16384);
                Object objR4 = l46Var4.R();
                if (z13 || objR4 == obj) {
                    objR4 = new pl4(x16Var4, x16Var5, x16Var6, a26Var, 0);
                    l46Var4.p0(objR4);
                }
                j09 j09VarA2 = ibe.a(j09VarA, tarotCardChoice, (PointerInputEventHandler) objR4);
                xn8 xn8VarC4 = s21.c(lx0Var, false);
                int iHashCode5 = Long.hashCode(l46Var4.T);
                u8a u8aVarM5 = l46Var4.m();
                j09 j09VarJ5 = m93.J(l46Var4, j09VarA2);
                l46Var4.j0();
                if (l46Var4.S) {
                    l46Var4.l(x16Var7);
                } else {
                    l46Var4.s0();
                }
                dec.l(he2Var2, l46Var4, xn8VarC4);
                dec.l(he2Var3, l46Var4, u8aVarM5);
                ib8.s(iHashCode5, l46Var4, he2Var, l46Var4);
                dec.l(he2Var5, l46Var4, j09VarJ5);
                l46 l46Var10 = l46Var4;
                b21.p(oa7.E(dj6.w(b.p(j09VarC, 109.0f), f3), a7c.b(eze.a(l46Var4).a.f)), tarotCardChoice, 0.0f, false, l46Var10, (i5 >> 3) & 112);
                if (z) {
                    j09Var2 = j09VarC;
                    z5 = true;
                    z6 = false;
                    l46Var10.f0(-1688664440);
                    l46Var10.r(false);
                } else {
                    l46Var10.f0(-1691165923);
                    b1b b1bVar = l8b.a;
                    boolean zF = k8b.f((e8b) l46Var10.k(b1bVar));
                    d31 d31Var = d31.a;
                    if (zF) {
                        l46Var10.f0(-1691109193);
                        s21.a(tm7.n(oa7.E(d31Var.b(j09VarC), a7c.b(eze.a(l46Var10).a.f)), gec.O(new iy9[]{new iy9(Float.valueOf(0.6f), new y72(y72.j)), new iy9(Float.valueOf(1.0f), new y72(y72.b(y72.b, 0.5f)))}, 0.0f, 0.0f, 14), null, 6), l46Var10, 0);
                        j09 j09Var5 = j09VarC;
                        j09 j09VarC2 = androidx.compose.foundation.b.c(d31Var.a(b.l(j09Var5, 36.0f), ndb.x), false, null, null, x16Var2, 15);
                        xn8 xn8VarC5 = s21.c(lx0Var, false);
                        int iHashCode6 = Long.hashCode(l46Var10.T);
                        u8a u8aVarM6 = l46Var10.m();
                        j09 j09VarJ6 = m93.J(l46Var10, j09VarC2);
                        l46Var10.j0();
                        if (l46Var10.S) {
                            l46Var10.l(x16Var7);
                        } else {
                            l46Var10.s0();
                        }
                        dec.l(he2Var2, l46Var10, xn8VarC5);
                        dec.l(he2Var3, l46Var10, u8aVarM6);
                        ib8.s(iHashCode6, l46Var10, he2Var, l46Var10);
                        dec.l(he2Var5, l46Var10, j09VarJ6);
                        z6 = false;
                        gu6.b(od4.A(R.drawable.ic_delete_circle_greyscale, 0, l46Var10), null, b.l(j09Var5, 14.0f), y72.k, l46Var10, 3512, 0);
                        l46Var10.r(true);
                        l46Var10.r(false);
                        z5 = true;
                        j09Var3 = j09Var5;
                    } else {
                        j09 j09Var6 = j09VarC;
                        l46Var10.f0(-1689998680);
                        long j4 = ((e8b) l46Var10.k(b1bVar)).v;
                        j09 j09VarC3 = androidx.compose.foundation.b.c(d31Var.a(b.l(j09Var6, 36.0f), ndb.d), false, null, null, x16Var2, 15);
                        xn8 xn8VarC6 = s21.c(lx0Var, false);
                        int iHashCode7 = Long.hashCode(l46Var10.T);
                        u8a u8aVarM7 = l46Var10.m();
                        j09 j09VarJ7 = m93.J(l46Var10, j09VarC3);
                        l46Var10.j0();
                        if (l46Var10.S) {
                            l46Var10.l(x16Var7);
                        } else {
                            l46Var10.s0();
                        }
                        dec.l(he2Var2, l46Var10, xn8VarC6);
                        dec.l(he2Var3, l46Var10, u8aVarM7);
                        ib8.s(iHashCode7, l46Var10, he2Var, l46Var10);
                        dec.l(he2Var5, l46Var10, j09VarJ7);
                        j09 j09VarH = iqf.h(b.l(j09Var6, 20.0f), y72.b(y72.b, 0.5f), 0.0f, 12.0f, r4d.a, 6);
                        Object objR5 = l46Var10.R();
                        if (objR5 == obj) {
                            objR5 = new hl4(0);
                            l46Var10.p0(objR5);
                        }
                        j09 j09VarE2 = oa7.E(bzd.x(j09VarH, (a26) objR5), a7c.a);
                        boolean zF2 = l46Var10.f(j4);
                        Object objR6 = l46Var10.R();
                        if (zF2 || objR6 == obj) {
                            objR6 = new ac(j4, 5);
                            l46Var10.p0(objR6);
                        }
                        z6 = false;
                        s21.a(b21.u(j09VarE2, (a26) objR6), l46Var10, 0);
                        z5 = true;
                        l46Var10.r(true);
                        l46Var10.r(false);
                        j09Var3 = j09Var6;
                    }
                    l46Var10.r(z6);
                    j09Var2 = j09Var3;
                }
                tec.s(l46Var10, z5, z5, z6);
                g09Var = j09Var2;
                l46Var5 = l46Var10;
            }
            if (str.length() > 0) {
                ib8.r(8.0f, -1617494025, l46Var5, l46Var5, g09Var);
                nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var5.k(nte.a), y72.b(((m82) l46Var5.k(o82.a)).q, 0.7f), w6c.l(12), ar5.x, null, 0L, null, 3, 0L, null, null, 16744440), l46Var5, (i5 >> 9) & 14, 0, 131070);
                r5 = 0;
                l46Var5.r(false);
            } else {
                r5 = 0;
                l46Var5.f0(-1617185544);
                l46Var5.r(false);
            }
            if (z) {
                tarotCardChoice2 = tarotCardChoice;
                z7 = true;
                l46Var5.f0(-1617041704);
                l46Var5.r(r5);
            } else {
                l46Var5.f0(1748949483);
                if (tarotCardChoice == null) {
                    l46Var5.f0(-1617140874);
                    l46Var5.r(r5);
                    tarotCardChoice2 = tarotCardChoice;
                    z7 = true;
                } else {
                    ib8.r(8.0f, -1617140873, l46Var5, l46Var5, g09Var);
                    tarotCardChoice2 = tarotCardChoice;
                    z7 = true;
                    cgg.c(null, tarotCardChoice2, l46Var5, r5, 1);
                    l46Var5.r(r5);
                }
                l46Var5.r(r5);
            }
            l46Var5.r(z7);
            l46Var2 = l46Var5;
        } else {
            l46Var6.Z();
            l46Var2 = l46Var6;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(i2, tarotCardChoice2, str, str2, z, z2, j2, f2, z3, x16Var, x16Var2, x16Var3, x16Var4, a26Var, x16Var5, x16Var6, i3) { // from class: il4
                public final /* synthetic */ x16 E0;
                public final /* synthetic */ x16 F0;
                public final /* synthetic */ x16 X;
                public final /* synthetic */ x16 Y;
                public final /* synthetic */ a26 Z;
                public final /* synthetic */ int b;
                public final /* synthetic */ TarotCardChoice c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ long v;
                public final /* synthetic */ float w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ x16 y;
                public final /* synthetic */ x16 z;

                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iP = k99.P(1);
                    y7h.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, this.E0, this.F0, (l46) obj3, iP);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x012f  */
    /* JADX WARN: Code duplicated, block: B:87:0x013d  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void g(j09 j09Var, String str, g7g g7gVar, long j2, x16 x16Var, final x16 x16Var2, l46 l46Var, final int i2, final int i3) {
        final j09 j09Var2;
        int i4;
        String str2;
        g7g g7gVar2;
        int i5;
        int i6;
        x16 x16Var3;
        int i7;
        boolean z;
        final x16 x16Var4;
        final String str3;
        final g7g g7gVar3;
        final long j3;
        ojb ojbVarV;
        j09 j09Var3;
        g7g g7gVarP;
        String str4;
        x16 x16Var5;
        long j4;
        int i8;
        int i9;
        x16Var2.getClass();
        l46Var.h0(-1825815053);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            j09Var2 = j09Var;
        } else if ((i2 & 6) == 0) {
            j09Var2 = j09Var;
            i4 = (l46Var.g(j09Var2) ? 4 : 2) | i2;
        } else {
            j09Var2 = j09Var;
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                str2 = str;
                i4 |= l46Var.g(str2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    g7gVar2 = g7gVar;
                    if (l46Var.g(g7gVar2)) {
                        i9 = 256;
                    }
                    i4 |= i9;
                } else {
                    g7gVar2 = g7gVar;
                }
                i9 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                i4 |= i9;
            } else {
                g7gVar2 = g7gVar;
            }
            i5 = i4 | 3072;
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    x16Var3 = x16Var;
                    if (l46Var.i(x16Var3)) {
                        i7 = 16384;
                    } else {
                        i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i5 |= i7;
                }
                if ((196608 & i2) == 0) {
                    if (l46Var.i(x16Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i5 |= i8;
                }
                if ((74899 & i5) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i5 & 1, z)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0 || l46Var.C()) {
                        if (i10 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var2;
                        }
                        if (i11 != 0) {
                            str2 = null;
                        }
                        if ((i3 & 4) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i5 &= -897;
                        } else {
                            g7gVarP = g7gVar2;
                        }
                        long j5 = y72.j;
                        g7gVar2 = g7gVarP;
                        str4 = str2;
                        if (i6 != 0) {
                            x16Var5 = null;
                        } else {
                            x16Var5 = x16Var3;
                        }
                        j4 = j5;
                    } else {
                        l46Var.Z();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        j09Var3 = j09Var2;
                        x16Var5 = x16Var3;
                        str4 = str2;
                        j4 = j2;
                    }
                    l46Var.s();
                    int i12 = (i5 & 14) | 221184 | ((i5 >> 6) & 112) | ((i5 << 3) & 7168) | ((i5 << 9) & 234881024);
                    x16 x16Var6 = x16Var5;
                    pa7.a(j09Var3, j4, 0L, g7gVar2, af1.b0(610668969, new o8(str4, 21), l46Var), af1.b0(1234283424, new n(11, x16Var5), l46Var), false, false, x16Var2, l46Var, i12, 196);
                    g7gVar3 = g7gVar2;
                    x16Var4 = x16Var6;
                    j3 = j4;
                    str3 = str4;
                    j09Var2 = j09Var3;
                } else {
                    l46Var.Z();
                    x16Var4 = x16Var3;
                    str3 = str2;
                    g7gVar3 = g7gVar2;
                    j3 = j2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: kca
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            y7h.g(j09Var2, str3, g7gVar3, j3, x16Var4, x16Var2, (l46) obj, k99.P(i2 | 1), i3);
                            return wef.a;
                        }
                    };
                }
            }
            i5 = i4 | 27648;
            x16Var3 = x16Var;
            if ((196608 & i2) == 0) {
                if (l46Var.i(x16Var2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i5 |= i8;
            }
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i5 & 1, z)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i11 != 0) {
                        str2 = null;
                    }
                    if ((i3 & 4) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i5 &= -897;
                    } else {
                        g7gVarP = g7gVar2;
                    }
                    long j6 = y72.j;
                    g7gVar2 = g7gVarP;
                    str4 = str2;
                    if (i6 != 0) {
                        x16Var5 = null;
                    } else {
                        x16Var5 = x16Var3;
                    }
                    j4 = j6;
                } else {
                    if (i10 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i11 != 0) {
                        str2 = null;
                    }
                    if ((i3 & 4) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i5 &= -897;
                    } else {
                        g7gVarP = g7gVar2;
                    }
                    long j7 = y72.j;
                    g7gVar2 = g7gVarP;
                    str4 = str2;
                    if (i6 != 0) {
                        x16Var5 = null;
                    } else {
                        x16Var5 = x16Var3;
                    }
                    j4 = j7;
                }
                l46Var.s();
                int i13 = (i5 & 14) | 221184 | ((i5 >> 6) & 112) | ((i5 << 3) & 7168) | ((i5 << 9) & 234881024);
                x16 x16Var7 = x16Var5;
                pa7.a(j09Var3, j4, 0L, g7gVar2, af1.b0(610668969, new o8(str4, 21), l46Var), af1.b0(1234283424, new n(11, x16Var5), l46Var), false, false, x16Var2, l46Var, i13, 196);
                g7gVar3 = g7gVar2;
                x16Var4 = x16Var7;
                j3 = j4;
                str3 = str4;
                j09Var2 = j09Var3;
            } else {
                l46Var.Z();
                x16Var4 = x16Var3;
                str3 = str2;
                g7gVar3 = g7gVar2;
                j3 = j2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: kca
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y7h.g(j09Var2, str3, g7gVar3, j3, x16Var4, x16Var2, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 48;
        str2 = str;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                g7gVar2 = g7gVar;
                if (l46Var.g(g7gVar2)) {
                    i9 = 256;
                }
                i4 |= i9;
            } else {
                g7gVar2 = g7gVar;
            }
            i9 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            i4 |= i9;
        } else {
            g7gVar2 = g7gVar;
        }
        i5 = i4 | 3072;
        i6 = i3 & 16;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                x16Var3 = x16Var;
                if (l46Var.i(x16Var3)) {
                    i7 = 16384;
                } else {
                    i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i5 |= i7;
            }
            if ((196608 & i2) == 0) {
                if (l46Var.i(x16Var2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i5 |= i8;
            }
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i5 & 1, z)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i11 != 0) {
                        str2 = null;
                    }
                    if ((i3 & 4) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i5 &= -897;
                    } else {
                        g7gVarP = g7gVar2;
                    }
                    long j8 = y72.j;
                    g7gVar2 = g7gVarP;
                    str4 = str2;
                    if (i6 != 0) {
                        x16Var5 = null;
                    } else {
                        x16Var5 = x16Var3;
                    }
                    j4 = j8;
                } else {
                    if (i10 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i11 != 0) {
                        str2 = null;
                    }
                    if ((i3 & 4) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i5 &= -897;
                    } else {
                        g7gVarP = g7gVar2;
                    }
                    long j9 = y72.j;
                    g7gVar2 = g7gVarP;
                    str4 = str2;
                    if (i6 != 0) {
                        x16Var5 = null;
                    } else {
                        x16Var5 = x16Var3;
                    }
                    j4 = j9;
                }
                l46Var.s();
                int i14 = (i5 & 14) | 221184 | ((i5 >> 6) & 112) | ((i5 << 3) & 7168) | ((i5 << 9) & 234881024);
                x16 x16Var8 = x16Var5;
                pa7.a(j09Var3, j4, 0L, g7gVar2, af1.b0(610668969, new o8(str4, 21), l46Var), af1.b0(1234283424, new n(11, x16Var5), l46Var), false, false, x16Var2, l46Var, i14, 196);
                g7gVar3 = g7gVar2;
                x16Var4 = x16Var8;
                j3 = j4;
                str3 = str4;
                j09Var2 = j09Var3;
            } else {
                l46Var.Z();
                x16Var4 = x16Var3;
                str3 = str2;
                g7gVar3 = g7gVar2;
                j3 = j2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: kca
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y7h.g(j09Var2, str3, g7gVar3, j3, x16Var4, x16Var2, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i5 = i4 | 27648;
        x16Var3 = x16Var;
        if ((196608 & i2) == 0) {
            if (l46Var.i(x16Var2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i5 |= i8;
        }
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i5 & 1, z)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i11 != 0) {
                    str2 = null;
                }
                if ((i3 & 4) != 0) {
                    g7gVarP = fdc.p(l46Var);
                    i5 &= -897;
                } else {
                    g7gVarP = g7gVar2;
                }
                long j10 = y72.j;
                g7gVar2 = g7gVarP;
                str4 = str2;
                if (i6 != 0) {
                    x16Var5 = null;
                } else {
                    x16Var5 = x16Var3;
                }
                j4 = j10;
            } else {
                if (i10 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i11 != 0) {
                    str2 = null;
                }
                if ((i3 & 4) != 0) {
                    g7gVarP = fdc.p(l46Var);
                    i5 &= -897;
                } else {
                    g7gVarP = g7gVar2;
                }
                long j11 = y72.j;
                g7gVar2 = g7gVarP;
                str4 = str2;
                if (i6 != 0) {
                    x16Var5 = null;
                } else {
                    x16Var5 = x16Var3;
                }
                j4 = j11;
            }
            l46Var.s();
            int i15 = (i5 & 14) | 221184 | ((i5 >> 6) & 112) | ((i5 << 3) & 7168) | ((i5 << 9) & 234881024);
            x16 x16Var9 = x16Var5;
            pa7.a(j09Var3, j4, 0L, g7gVar2, af1.b0(610668969, new o8(str4, 21), l46Var), af1.b0(1234283424, new n(11, x16Var5), l46Var), false, false, x16Var2, l46Var, i15, 196);
            g7gVar3 = g7gVar2;
            x16Var4 = x16Var9;
            j3 = j4;
            str3 = str4;
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            x16Var4 = x16Var3;
            str3 = str2;
            g7gVar3 = g7gVar2;
            j3 = j2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: kca
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y7h.g(j09Var2, str3, g7gVar3, j3, x16Var4, x16Var2, (l46) obj, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void h(List list, boolean z, String str, boolean z2, l26 l26Var, x16 x16Var, l46 l46Var, int i2) {
        boolean z3 = z;
        list.getClass();
        l26Var.getClass();
        x16Var.getClass();
        l46Var.h0(-1535952993);
        int i3 = i2 | (l46Var.g(list) ? 4 : 2) | (l46Var.h(z3) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(l26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (74899 & i3) != 74898)) {
            Context context = (Context) l46Var.k(uq.b);
            String strQ = afc.q(R.string.reading_feedback_text_too_long, l46Var);
            use useVarO = n3d.o(null, l46Var, 3);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = new gn8(new e5b(i4, context, strQ));
                l46Var.p0(objR);
            }
            gn8 gn8Var = (gn8) objR;
            boolean z4 = (i3 & 14) == 4;
            Object objR2 = l46Var.R();
            Object obj2 = objR2;
            if (z4 || objR2 == obj) {
                ArrayList arrayList = new ArrayList(t72.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new PatternData((String) it.next(), ""));
                }
                l46Var.p0(arrayList);
                obj2 = arrayList;
            }
            FillElement fillElement = b.c;
            long j2 = ((e8b) l46Var.k(l8b.a)).a;
            dd2 dd2VarB0 = af1.b0(-847265445, new fi4(28, x16Var), l46Var);
            we3 we3Var = new we3(z3, str, z2, list, useVarO, l26Var, (List) obj2);
            z3 = z3;
            xdc.a(fillElement, dd2VarB0, af1.b0(202603770, we3Var, l46Var), null, null, 0, j2, 0L, null, af1.b0(1760330864, new f5b(z3, useVarO, gn8Var, 0), l46Var), l46Var, 805306806, 440);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p91(list, z3, str, z2, l26Var, x16Var, i2);
        }
    }

    public static final void i(kpb kpbVar, a26 a26Var, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(1855446683);
        int i3 = i2 | (l46Var.e(kpbVar == null ? -1 : kpbVar.ordinal()) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            rs0.f(null, false, af1.b0(-1296437826, new n50(x16Var2, (Object) kpbVar, x16Var, x16Var3, (m26) a26Var, 10), l46Var), l46Var, 384, 3);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm((Object) kpbVar, (Object) a26Var, (m26) x16Var, (m26) x16Var2, (m26) x16Var3, i2, 20);
        }
    }

    public static final Drawable j(bv6 bv6Var, Resources resources) {
        if (bv6Var instanceof ao4) {
            return ((ao4) bv6Var).a;
        }
        return bv6Var instanceof gz0 ? new BitmapDrawable(resources, ((gz0) bv6Var).a) : new mc(1, bv6Var);
    }

    public static final bv6 k(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new gz0(((BitmapDrawable) drawable).getBitmap()) : new ao4(drawable);
    }

    public static final Object l(u91 u91Var, xn2 xn2Var) {
        pl1 pl1Var = new pl1(1, k99.D(xn2Var));
        pl1Var.v();
        pl1Var.x(new fs7(u91Var, 0));
        u91Var.x(new nc6(pl1Var));
        return pl1Var.t();
    }

    public static final Object m(u91 u91Var, xn2 xn2Var) {
        pl1 pl1Var = new pl1(1, k99.D(xn2Var));
        pl1Var.v();
        pl1Var.x(new fs7(u91Var, 1));
        u91Var.x(new hy2(pl1Var, 2));
        return pl1Var.t();
    }

    public static final j09 n(j09 j09Var, u47 u47Var) {
        return u47Var instanceof mx1 ? j09Var.D(new bjb((cjb) u47Var)) : j09Var;
    }

    public static void o(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            r3.g(i4, ib8.n(i2, i3, "startIndex: ", ", endIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            qc0.j(ks0.k("startIndex: ", i2, " > endIndex: ", i3));
        }
    }

    public static void p(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            r3.g(i4, ib8.n(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            qc0.j(ks0.k("fromIndex: ", i2, " > toIndex: ", i3));
        }
    }

    public static final long q(int i2, int i3, ykd ykdVar, zdc zdcVar, ykd ykdVar2) {
        int i4;
        int i5;
        if (!pa7.t(ykdVar, ykd.c)) {
            i2 = Q(ykdVar.a, zdcVar);
            i3 = Q(ykdVar.b, zdcVar);
        }
        b94 b94Var = ykdVar2.a;
        b94 b94Var2 = ykdVar2.b;
        if ((b94Var instanceof z84) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i5 = ((z84) b94Var).a)) {
            i2 = i5;
        }
        if ((b94Var2 instanceof z84) && i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && i3 > (i4 = ((z84) b94Var2).a)) {
            i3 = i4;
        }
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final double r(int i2, int i3, int i4, int i5, zdc zdcVar, ykd ykdVar) {
        double dMax;
        double d2 = i2;
        double d3 = ((double) i4) / d2;
        double d4 = i3;
        double d5 = ((double) i5) / d4;
        int iOrdinal = zdcVar.ordinal();
        if (iOrdinal == 0) {
            dMax = Math.max(d3, d5);
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return 0.0d;
            }
            dMax = Math.min(d3, d5);
        }
        b94 b94Var = ykdVar.a;
        if (b94Var instanceof z84) {
            double d6 = ((double) ((z84) b94Var).a) / d2;
            if (dMax > d6) {
                dMax = d6;
            }
        }
        b94 b94Var2 = ykdVar.b;
        if (b94Var2 instanceof z84) {
            double d7 = ((double) ((z84) b94Var2).a) / d4;
            if (dMax > d7) {
                return d7;
            }
        }
        return dMax;
    }

    public static byte[] s(b84[] b84VarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (b84 b84Var : b84VarArr) {
            length += ((((b84Var.g * 2) + 7) & (-8)) / 8) + (b84Var.e * 2) + w(b84Var.a, b84Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + b84Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, vfh.n)) {
            int length2 = b84VarArr.length;
            while (i2 < length2) {
                b84 b84Var2 = b84VarArr[i2];
                V(byteArrayOutputStream, b84Var2, w(b84Var2.a, b84Var2.b, bArr));
                U(byteArrayOutputStream, b84Var2);
                i2++;
            }
        } else {
            for (b84 b84Var3 : b84VarArr) {
                V(byteArrayOutputStream, b84Var3, w(b84Var3.a, b84Var3.b, bArr));
            }
            int length3 = b84VarArr.length;
            while (i2 < length3) {
                U(byteArrayOutputStream, b84VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static Map t(ssg ssgVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((Iterable) ssgVar.b).iterator();
        while (it.hasNext()) {
            GiftCardStatus status = ((GiftCardItem) it.next()).getStatus();
            Object kmbVar = linkedHashMap.get(status);
            if (kmbVar == null && !linkedHashMap.containsKey(status)) {
                kmbVar = new kmb();
            }
            kmb kmbVar2 = (kmb) kmbVar;
            kmbVar2.element++;
            linkedHashMap.put(status, kmbVar2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getClass();
            if ((entry instanceof zm7) && !(entry instanceof bn7)) {
                z7f.b0(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((kmb) entry.getValue()).element));
        }
        return z7f.q(linkedHashMap);
    }

    public static String u(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final pv2 v(pv2 pv2Var, pv2 pv2Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i2 = 29;
        boolean zBooleanValue = ((Boolean) pv2Var.V0(new he2(i2), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pv2Var2.V0(new he2(i2), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return pv2Var.p0(pv2Var2);
        }
        qv2 qv2Var = new qv2(0);
        nu4 nu4Var = nu4.a;
        pv2 pv2Var3 = (pv2) pv2Var.V0(qv2Var, nu4Var);
        Object objV0 = pv2Var2;
        if (zBooleanValue2) {
            objV0 = pv2Var2.V0(new qv2(1), nu4Var);
        }
        return pv2Var3.p0((pv2) objV0);
    }

    public static String w(String str, String str2, byte[] bArr) {
        byte[] bArr2 = vfh.o;
        byte[] bArr3 = vfh.p;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return ks0.l(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static pa1 y(pv2 pv2Var, l26 l26Var) {
        pv2Var.getClass();
        return y41.t(new gi2(pv2Var, dw2.a, l26Var, 6));
    }

    public static final float[] z(List list, List list2) {
        if (list != null) {
            return s72.g1(list);
        }
        return null;
    }

    public abstract Object K(Uri uri, InputEvent inputEvent, xn2 xn2Var);

    public abstract Object L(Uri uri, xn2 xn2Var);

    public abstract Object x(xn2 xn2Var);
}
