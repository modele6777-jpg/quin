package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.assetpacks.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.GenericDeclaration;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a82 implements is7, h1b, qy9, f1b, x7e, lw7, cfg {
    public static final ww2 g = new ww2(17);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public a82(k00 k00Var, sw3 sw3Var, xp5 xp5Var, mue mueVar, List list, boolean z) {
        int i;
        k00 k00Var2 = k00Var;
        mue mueVar2 = mueVar;
        this.a = 17;
        this.c = k00Var2;
        this.d = list;
        final int i2 = 0;
        x16 x16Var = new x16(this) { // from class: c59
            public final /* synthetic */ a82 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                Object obj = null;
                int i4 = 1;
                a82 a82Var = this.b;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) a82Var.b;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fG = ((py9) obj2).a.g();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i4);
                                    float fG2 = ((py9) obj3).a.g();
                                    if (Float.compare(fG, fG2) < 0) {
                                        obj2 = obj3;
                                        fG = fG2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        py9 py9Var = (py9) obj;
                        return Float.valueOf(py9Var != null ? py9Var.a.g() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) a82Var.b;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((py9) obj4).a.w.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i4);
                                    float fC2 = ((py9) obj5).a.w.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        py9 py9Var2 = (py9) obj;
                        return Float.valueOf(py9Var2 != null ? py9Var2.a.w.c() : 0.0f);
                }
            }
        };
        z18 z18Var = z18.c;
        this.e = eb3.N(z18Var, x16Var);
        final int i3 = 1;
        this.f = eb3.N(z18Var, new x16(this) { // from class: c59
            public final /* synthetic */ a82 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                a82 a82Var = this.b;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) a82Var.b;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fG = ((py9) obj2).a.g();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fG2 = ((py9) obj3).a.g();
                                    if (Float.compare(fG, fG2) < 0) {
                                        obj2 = obj3;
                                        fG = fG2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        py9 py9Var = (py9) obj;
                        return Float.valueOf(py9Var != null ? py9Var.a.g() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) a82Var.b;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((py9) obj4).a.w.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fC2 = ((py9) obj5).a.w.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        py9 py9Var2 = (py9) obj;
                        return Float.valueOf(py9Var2 != null ? py9Var2.a.w.c() : 0.0f);
                }
            }
        });
        ty9 ty9Var = mueVar2.b;
        k00 k00Var3 = l00.a;
        ArrayList arrayList = k00Var2.d;
        String str = k00Var2.b;
        pu4 pu4Var = pu4.a;
        List listB1 = arrayList != null ? s72.b1(arrayList, new ww2(12)) : pu4Var;
        ArrayList arrayList2 = new ArrayList();
        ad0 ad0Var = new ad0();
        int size = listB1.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            j00 j00Var = (j00) listB1.get(i4);
            j00 j00VarA = j00.a(j00Var, ty9Var.a((ty9) j00Var.a), i2, i2, 14);
            Object obj = j00VarA.a;
            int i6 = j00VarA.c;
            int i7 = j00VarA.b;
            while (i5 < i7 && !ad0Var.isEmpty()) {
                j00 j00Var2 = (j00) ad0Var.last();
                listB1 = listB1;
                int i8 = j00Var2.c;
                pu4Var = pu4Var;
                Object obj2 = j00Var2.a;
                if (i7 < i8) {
                    arrayList2.add(new j00(obj2, i5, i7));
                    i5 = i7;
                } else {
                    int i9 = size;
                    arrayList2.add(new j00(obj2, i5, i8));
                    i5 = j00Var2.c;
                    while (!ad0Var.isEmpty() && i5 == ((j00) ad0Var.last()).c) {
                        ad0Var.removeLast();
                    }
                    size = i9;
                }
            }
            List list2 = listB1;
            pu4 pu4Var2 = pu4Var;
            int i10 = size;
            if (i5 < i7) {
                arrayList2.add(new j00(ty9Var, i5, i7));
                i5 = i7;
            }
            j00 j00Var3 = (j00) ad0Var.k();
            if (j00Var3 != null) {
                int i11 = j00Var3.c;
                Object obj3 = j00Var3.a;
                int i12 = j00Var3.b;
                if (i12 == i7 && i11 == i6) {
                    ad0Var.removeLast();
                    ad0Var.addLast(new j00(((ty9) obj3).a((ty9) obj), i7, i6));
                } else if (i12 == i11) {
                    arrayList2.add(new j00(obj3, i12, i11));
                    ad0Var.removeLast();
                    ad0Var.addLast(new j00(obj, i7, i6));
                } else {
                    if (i11 < i6) {
                        cva.s();
                        throw null;
                    }
                    ad0Var.addLast(new j00(((ty9) obj3).a((ty9) obj), i7, i6));
                }
            } else {
                ad0Var.addLast(new j00(obj, i7, i6));
            }
            i4++;
            listB1 = list2;
            pu4Var = pu4Var2;
            size = i10;
            i2 = 0;
        }
        pu4 pu4Var3 = pu4Var;
        while (i5 <= str.length() && !ad0Var.isEmpty()) {
            j00 j00Var4 = (j00) ad0Var.last();
            Object obj4 = j00Var4.a;
            int i13 = j00Var4.c;
            arrayList2.add(new j00(obj4, i5, i13));
            while (!ad0Var.isEmpty() && i13 == ((j00) ad0Var.last()).c) {
                ad0Var.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str.length()) {
            arrayList2.add(new j00(ty9Var, i5, str.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new j00(ty9Var, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i14 = i;
        for (int size2 = arrayList2.size(); i14 < size2; size2 = size2) {
            j00 j00Var5 = (j00) arrayList2.get(i14);
            int i15 = j00Var5.b;
            int i16 = j00Var5.c;
            String strSubstring = i15 != i16 ? str.substring(i15, i16) : "";
            List listA = l00.a(k00Var2, i15, i16, new zv(5));
            k00 k00Var4 = new k00(strSubstring, listA == null ? pu4Var3 : listA);
            ty9 ty9Var2 = (ty9) j00Var5.a;
            if (ty9Var2.b == 0) {
                ty9Var2 = new ty9(ty9Var2.a, ty9Var.b, ty9Var2.c, ty9Var2.d, ty9Var2.e, ty9Var2.f, ty9Var2.g, ty9Var2.h, ty9Var2.i);
            }
            mue mueVar3 = new mue(mueVar2.a, ty9Var.a(ty9Var2));
            List list3 = k00Var4.a;
            List list4 = list3 == null ? pu4Var3 : list3;
            List list5 = (List) this.d;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i17 = 0;
            while (i17 < size3) {
                j00 j00Var6 = (j00) list5.get(i17);
                int i18 = j00Var6.b;
                ty9 ty9Var3 = ty9Var;
                int i19 = j00Var6.c;
                if (l00.b(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        j37.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new j00(j00Var6.a, i18 - i15, i19 - i15));
                }
                i17++;
                list5 = list5;
                ty9Var = ty9Var3;
            }
            arrayList3.add(new py9(new xt(strSubstring, mueVar3, list4, arrayList4, xp5Var, sw3Var, z), i15, i16));
            i14++;
            k00Var2 = k00Var;
            mueVar2 = mueVar;
            str = str;
        }
        this.b = arrayList3;
    }

    public static void J(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    public static int K(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public int A(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            xf xfVar = (xf) arrayList.get(i2);
            int i3 = xfVar.a;
            int i4 = xfVar.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = xfVar.c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (xfVar.c <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = xfVar.c;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += xfVar.c;
            }
            i2++;
        }
        return i;
    }

    public void B(a26 a26Var) {
        int i;
        synchronized (this.c) {
            try {
                i79 i79Var = (i79) this.e;
                this.e = (i79) this.f;
                this.f = i79Var;
                xh0 xh0Var = (xh0) this.b;
                do {
                    i = xh0Var.get();
                } while (!xh0Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = i79Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    a26Var.d(i79Var.b(i3));
                }
                i79Var.k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float C(int i, boolean z) {
        Layout layout = (Layout) this.c;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float D(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.c;
        if (!z2) {
            return C(i, z);
        }
        int iU = jgb.U(layout, i, z2);
        int lineStart = layout.getLineStart(iU);
        int lineEnd = layout.getLineEnd(iU);
        if (i != lineStart && i != lineEnd) {
            return C(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return C(i, z);
        }
        int iE = E(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(F(iE))) == -1;
        int iH = H(lineEnd, lineStart);
        int iF = F(iE);
        int i4 = lineStart - iF;
        int i5 = iH - iF;
        Bidi bidiR = r(iE);
        Bidi bidiCreateLineBidi = bidiR != null ? bidiR.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iU) : layout.getLineRight(iU);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        ev7[] ev7VarArr = new ev7[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            ev7VarArr[i6] = new ev7(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, ev7VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (ev7VarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == ev7VarArr[i3].c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iU);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(ev7VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(ev7VarArr[i3 + 1].a);
            }
            return layout.getLineRight(iU);
        }
        int iH2 = i > iH ? H(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (ev7VarArr[i9].b == iH2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == ev7VarArr[i2].c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iU);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(ev7VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(ev7VarArr[i2 + 1].b);
        }
        return layout.getLineRight(iU);
    }

    public int E(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        int iS = t72.s(arrayList, Integer.valueOf(i));
        int i2 = iS < 0 ? -(iS + 1) : iS + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int F(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i - 1)).intValue();
    }

    public boolean G() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ff5 ff5Var = (ff5) this.d;
        ff5Var.a();
        Context context = ff5Var.a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public int H(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.c).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((pa7.L(cCharAt, UserMetadata.MAX_INTERNAL_KEY_SIZE) < 0 || pa7.L(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public u8e I(int i) {
        u8e hj0Var;
        HashMap map = (HashMap) this.d;
        u8e u8eVar = (u8e) map.get(Integer.valueOf(i));
        if (u8eVar != null) {
            return u8eVar;
        }
        final a90 a90Var = (a90) this.e;
        a90Var.getClass();
        if (i != 0) {
            final int i2 = 1;
            if (i != 1) {
                final int i3 = 2;
                if (i != 2) {
                    final int i4 = 3;
                    if (i == 3) {
                        hj0Var = new hj0(5, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(yp8.class));
                    } else {
                        if (i != 4) {
                            qc0.j(tec.e(i, "Unrecognized contentType: "));
                            return null;
                        }
                        hj0Var = new u8e() { // from class: xr3
                            @Override // defpackage.u8e
                            public final Object get() {
                                int i5 = i4;
                                yb3 yb3Var = a90Var;
                                Object obj = this;
                                switch (i5) {
                                    case 0:
                                        return yr3.e((Class) obj, yb3Var);
                                    case 1:
                                        return yr3.e((Class) obj, yb3Var);
                                    case 2:
                                        return yr3.e((Class) obj, yb3Var);
                                    default:
                                        return new nxa(yb3Var, (sq3) ((a82) obj).c);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(yp8.class);
                    hj0Var = new u8e() { // from class: xr3
                        @Override // defpackage.u8e
                        public final Object get() {
                            int i5 = i3;
                            yb3 yb3Var = a90Var;
                            Object obj = genericDeclarationAsSubclass;
                            switch (i5) {
                                case 0:
                                    return yr3.e((Class) obj, yb3Var);
                                case 1:
                                    return yr3.e((Class) obj, yb3Var);
                                case 2:
                                    return yr3.e((Class) obj, yb3Var);
                                default:
                                    return new nxa(yb3Var, (sq3) ((a82) obj).c);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(yp8.class);
                hj0Var = new u8e() { // from class: xr3
                    @Override // defpackage.u8e
                    public final Object get() {
                        int i5 = i2;
                        yb3 yb3Var = a90Var;
                        Object obj = genericDeclarationAsSubclass2;
                        switch (i5) {
                            case 0:
                                return yr3.e((Class) obj, yb3Var);
                            case 1:
                                return yr3.e((Class) obj, yb3Var);
                            case 2:
                                return yr3.e((Class) obj, yb3Var);
                            default:
                                return new nxa(yb3Var, (sq3) ((a82) obj).c);
                        }
                    }
                };
            }
        } else {
            final GenericDeclaration genericDeclarationAsSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(yp8.class);
            final int i5 = 0;
            hj0Var = new u8e() { // from class: xr3
                @Override // defpackage.u8e
                public final Object get() {
                    int i6 = i5;
                    yb3 yb3Var = a90Var;
                    Object obj = genericDeclarationAsSubclass3;
                    switch (i6) {
                        case 0:
                            return yr3.e((Class) obj, yb3Var);
                        case 1:
                            return yr3.e((Class) obj, yb3Var);
                        case 2:
                            return yr3.e((Class) obj, yb3Var);
                        default:
                            return new nxa(yb3Var, (sq3) ((a82) obj).c);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i), hj0Var);
        return hj0Var;
    }

    public xf L(int i, int i2, int i3) {
        xf xfVar = (xf) ((sug) this.c).a();
        if (xfVar != null) {
            xfVar.a = i;
            xfVar.b = i2;
            xfVar.c = i3;
            return xfVar;
        }
        xf xfVar2 = new xf();
        xfVar2.a = i;
        xfVar2.b = i2;
        xfVar2.c = i3;
        return xfVar2;
    }

    public void M(xf xfVar) {
        m6c m6cVar = (m6c) this.e;
        ((ArrayList) this.d).add(xfVar);
        int i = xfVar.a;
        if (i == 1) {
            m6cVar.I(xfVar.b, xfVar.c);
            return;
        }
        if (i == 2) {
            int i2 = xfVar.b;
            int i3 = xfVar.c;
            RecyclerView recyclerView = (RecyclerView) m6cVar.b;
            recyclerView.L(i2, i3, false);
            recyclerView.v1 = true;
            return;
        }
        if (i == 4) {
            m6cVar.H(xfVar.b, xfVar.c);
        } else if (i == 8) {
            m6cVar.J(xfVar.b, xfVar.c);
        } else {
            yg5.l(xfVar, "Unknown update op type for ");
        }
    }

    public void N(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xf xfVar = (xf) arrayList.get(i);
            xfVar.getClass();
            ((sug) this.c).q(xfVar);
        }
        arrayList.clear();
    }

    public void O(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.c).put(str, obj);
        h89 h89Var = (h89) ((LinkedHashMap) this.b).get(str);
        if (h89Var != null) {
            ((s0e) h89Var).m(obj);
        }
        h89 h89Var2 = (h89) ((LinkedHashMap) this.e).get(str);
        if (h89Var2 != null) {
            ((s0e) h89Var2).m(obj);
        }
    }

    public boolean P(float[] fArr) {
        ky9[] ky9VarArr = (ky9[]) this.e;
        if (ky9VarArr != null && ky9VarArr.length > 0) {
            for (ky9 ky9Var : ky9VarArr) {
                ky9Var.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int Q(int i, int i2) {
        int i3;
        int i4;
        sug sugVar = (sug) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xf xfVar = (xf) arrayList.get(size);
            int i5 = xfVar.a;
            int i6 = xfVar.b;
            if (i5 == 8) {
                int i7 = xfVar.c;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            xfVar.b = i6 + 1;
                            xfVar.c = i7 + 1;
                        } else if (i2 == 2) {
                            xfVar.b = i6 - 1;
                            xfVar.c = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        xfVar.c = i7 + 1;
                    } else if (i2 == 2) {
                        xfVar.c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        xfVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        xfVar.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= xfVar.c;
                } else if (i5 == 2) {
                    i += xfVar.c;
                }
            } else if (i2 == 1) {
                xfVar.b = i6 + 1;
            } else if (i2 == 2) {
                xfVar.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            xf xfVar2 = (xf) arrayList.get(size2);
            int i8 = xfVar2.a;
            int i9 = xfVar2.c;
            if (i8 == 8) {
                if (i9 == xfVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    sugVar.q(xfVar2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                sugVar.q(xfVar2);
            }
        }
        return i;
    }

    @Override // defpackage.cfg
    public Object a() {
        return new gfg((Context) ((ysd) ((oid) this.c).b).b, (b) ((bfg) this.d).a(), (dhg) ((bfg) this.b).a(), (yfg) ((bfg) this.e).a(), (tgg) ((bfg) this.f).a());
    }

    @Override // defpackage.lw7
    public boolean b() {
        return ((ewf) this.f) != null;
    }

    @Override // defpackage.x7e
    public int c(long j) {
        long[] jArr = (long[]) this.d;
        int iA = pqf.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.is7
    public void d() {
        ((hc2) this.d).d();
        hc2 hc2Var = (hc2) this.e;
        ((HashMap) hc2Var.b).put((t99) this.f, new f10((u00) s72.X0((ArrayList) this.b)));
    }

    @Override // defpackage.qy9
    public boolean e() {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((py9) arrayList.get(i)).a.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.x7e
    public long f(int i) {
        return ((long[]) this.d)[i];
    }

    @Override // defpackage.qy9
    public float g() {
        return ((Number) ((lw7) this.e).getValue()).floatValue();
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case 9:
                return new ks3((Executor) ((h1b) this.c).get(), (uu8) ((h1b) this.d).get(), (gg7) ((gg7) this.b).get(), (w8c) ((h1b) this.e).get(), (w8c) ((h1b) this.f).get());
            case 18:
                return new iqb((yxe) ((f1b) this.c).get(), (of5) ((f1b) this.d).get(), (xb0) ((f1b) this.b).get(), (kqb) ((f1b) this.e).get(), (w3d) ((f1b) this.f).get());
            default:
                return new s0d((ff5) ((ze) this.c).a, (of5) ((f1b) this.d).get(), (m1d) ((f1b) this.b).get(), (iz4) ((f1b) this.e).get(), (pv2) ((f1b) this.f).get());
        }
    }

    @Override // defpackage.lw7
    public Object getValue() {
        ewf ewfVar = (ewf) this.f;
        if (ewfVar != null) {
            return ewfVar;
        }
        owf owfVarG = ((lo2) this.d).b.g();
        jwf jwfVarC = ((lo2) this.b).b.c();
        m69 m69VarE = ((lo2) this.e).b.e();
        jwfVarC.getClass();
        kxa kxaVar = new kxa(owfVarG, jwfVarC, m69VarE);
        em7 em7Var = (em7) this.c;
        em7Var.getClass();
        String strG = em7Var.g();
        if (strG == null) {
            qc0.j("Local and anonymous classes can not be ViewModels");
            return null;
        }
        ewf ewfVarF = kxaVar.f(em7Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG));
        this.f = ewfVarF;
        return ewfVarF;
    }

    @Override // defpackage.is7
    public void h(t99 t99Var, Object obj) {
        ((hc2) this.c).h(t99Var, obj);
    }

    @Override // defpackage.qy9
    public float i() {
        return ((Number) ((lw7) this.f).getValue()).floatValue();
    }

    @Override // defpackage.x7e
    public List j(long j) {
        y5f y5fVar = (y5f) this.c;
        Map map = (Map) this.b;
        HashMap map2 = (HashMap) this.e;
        HashMap map3 = (HashMap) this.f;
        ArrayList<Pair> arrayList = new ArrayList();
        y5fVar.g(j, y5fVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        y5fVar.i(j, false, y5fVar.h, treeMap);
        y5fVar.h(j, map, map2, y5fVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                b6f b6fVar = (b6f) map2.get(pair.first);
                b6fVar.getClass();
                arrayList2.add(new t03(null, null, null, bitmapDecodeByteArray, b6fVar.c, 0, b6fVar.e, b6fVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, b6fVar.f, b6fVar.g, false, -16777216, b6fVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            b6f b6fVar2 = (b6f) map2.get(entry.getKey());
            b6fVar2.getClass();
            s03 s03Var = (s03) entry.getValue();
            CharSequence charSequence = s03Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (kw3 kw3Var : (kw3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), kw3.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(kw3Var), spannableStringBuilder.getSpanEnd(kw3Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = b6fVar2.c;
            int i9 = b6fVar2.d;
            s03Var.e = f;
            s03Var.f = i9;
            s03Var.g = b6fVar2.e;
            s03Var.h = b6fVar2.b;
            s03Var.l = b6fVar2.f;
            float f2 = b6fVar2.i;
            int i10 = b6fVar2.h;
            s03Var.k = f2;
            s03Var.j = i10;
            s03Var.p = b6fVar2.j;
            arrayList2.add(s03Var.a());
        }
        return arrayList2;
    }

    public void k(qw qwVar, em7 em7Var) {
        ((ArrayList) this.c).add(new iy9(qwVar, em7Var));
    }

    @Override // defpackage.x7e
    public int l() {
        return ((long[]) this.d).length;
    }

    @Override // defpackage.is7
    public void m(t99 t99Var, m22 m22Var) {
        ((hc2) this.c).m(t99Var, m22Var);
    }

    @Override // defpackage.is7
    public js7 n(t99 t99Var) {
        return ((hc2) this.c).n(t99Var);
    }

    public void o(oc5 oc5Var, em7 em7Var) {
        ((ArrayList) this.e).add(new ad1(6, oc5Var, em7Var));
    }

    @Override // defpackage.is7
    public void p(t99 t99Var, j22 j22Var, t99 t99Var2) {
        ((hc2) this.c).p(t99Var, j22Var, t99Var2);
    }

    public rl1 q(ur0 ur0Var, x16 x16Var) {
        int i;
        int i2;
        int i3;
        kmb kmbVar = new kmb();
        kmbVar.element = -1;
        synchronized (this.c) {
            Throwable th = (Throwable) this.d;
            if (th != null) {
                ur0Var.b(th);
                return hj6.g;
            }
            xh0 xh0Var = (xh0) this.b;
            do {
                i = xh0Var.get();
                i2 = i + 1;
            } while (!xh0Var.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            kmbVar.element = (i2 >>> 27) & 15;
            ((i79) this.e).h(ur0Var);
            if (z) {
                try {
                    x16Var.invoke();
                } catch (Throwable th2) {
                    synchronized (this.c) {
                        try {
                            if (((Throwable) this.d) == null) {
                                this.d = th2;
                                i79 i79Var = (i79) this.e;
                                Object[] objArr = i79Var.a;
                                int i4 = i79Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((ur0) objArr[i5]).b(th2);
                                }
                                ((i79) this.e).k();
                                xh0 xh0Var2 = (xh0) this.b;
                                do {
                                    i3 = xh0Var2.get();
                                } while (!xh0Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new w84(new j8(ur0Var, this, kmbVar, 5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi r(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.c;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.d;
        boolean[] zArr = (boolean[]) this.e;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(F(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f = cArr2;
        return bidi;
    }

    public eq0 s() {
        String strConcat = ((lu3) this.c) == null ? " surface" : "";
        if (((List) this.d) == null) {
            strConcat = strConcat.concat(" sharedSurfaces");
        }
        if (((Integer) this.b) == null) {
            strConcat = strConcat.concat(" mirrorMode");
        }
        if (((Integer) this.e) == null) {
            strConcat = strConcat.concat(" surfaceGroupId");
        }
        if (((qr4) this.f) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (strConcat.isEmpty()) {
            return new eq0((lu3) this.c, (List) this.d, ((Integer) this.b).intValue(), ((Integer) this.e).intValue(), (qr4) this.f);
        }
        qc0.p("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.is7
    public is7 t(j22 j22Var, t99 t99Var) {
        return ((hc2) this.c).t(j22Var, t99Var);
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 15:
                StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
                er7 er7Var = (er7) this.c;
                if (er7Var == null) {
                    pa7.g0("kind");
                    throw null;
                }
                sb.append(er7Var);
                sb.append(", level=");
                dr7 dr7Var = (dr7) this.d;
                if (dr7Var == null) {
                    pa7.g0("level");
                    throw null;
                }
                sb.append(dr7Var);
                sb.append(", version=");
                cr7 cr7Var = (cr7) this.f;
                if (cr7Var == null) {
                    pa7.g0("version");
                    throw null;
                }
                sb.append(cr7Var);
                sb.append(", errorCode=");
                sb.append((Integer) this.b);
                sb.append(", message=");
                return ub3.l(sb, (String) this.e, ')');
            case 23:
                String str2 = (String) this.f;
                StringBuilder sb2 = new StringBuilder("since ");
                sb2.append((ntf) this.c);
                sb2.append(' ');
                sb2.append((fx3) this.b);
                Integer num = (Integer) this.e;
                if (num != null) {
                    str = " error " + num.intValue();
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append(str2 != null ? ": ".concat(str2) : "");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            xf xfVar = (xf) arrayList.get(i2);
            int i3 = xfVar.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = xfVar.b;
                    int i5 = xfVar.c + i4;
                    while (i4 < i5) {
                        if (A(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (A(xfVar.c, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void v() {
        m6c m6cVar = (m6c) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m6c) this.e).p((xf) arrayList.get(i));
        }
        N(arrayList);
        ArrayList arrayList2 = (ArrayList) this.b;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            xf xfVar = (xf) arrayList2.get(i2);
            int i3 = xfVar.a;
            if (i3 == 1) {
                m6cVar.p(xfVar);
                m6cVar.I(xfVar.b, xfVar.c);
            } else if (i3 == 2) {
                m6cVar.p(xfVar);
                int i4 = xfVar.b;
                int i5 = xfVar.c;
                RecyclerView recyclerView = (RecyclerView) m6cVar.b;
                recyclerView.L(i4, i5, true);
                recyclerView.v1 = true;
                recyclerView.s1.b += i5;
            } else if (i3 == 4) {
                m6cVar.p(xfVar);
                m6cVar.H(xfVar.b, xfVar.c);
            } else if (i3 == 8) {
                m6cVar.p(xfVar);
                m6cVar.J(xfVar.b, xfVar.c);
            }
        }
        N(arrayList2);
    }

    public wc1 w(re1 re1Var, Map map, Map map2) {
        re1Var.getClass();
        map.getClass();
        map2.getClass();
        qwe qweVar = (qwe) this.c;
        uf1 uf1Var = (uf1) this.d;
        d3e d3eVar = (d3e) this.b;
        i4e i4eVar = (i4e) this.f;
        sd1 sd1Var = (sd1) this.e;
        sd1Var.getClass();
        sd1Var.b.getClass();
        xg1 xg1Var = yg1.o;
        yg1 yg1VarA = ((qd1) sd1Var.a).a(uf1Var.a);
        xg1Var.getClass();
        return new wc1(re1Var, qweVar, map, map2, d3eVar, i4eVar, xg1.c(yg1VarA));
    }

    public void x(pg1 pg1Var, pg1 pg1Var2, iae iaeVar, iae iaeVar2, Map.Entry entry) {
        iae iaeVar3 = (iae) entry.getValue();
        b21.q("DualSurfaceProcessorNode", "     -> outputEdge = " + iaeVar3);
        iq0 iq0Var = new iq0(iaeVar.g.a, ((qo0) entry.getKey()).a.d, iaeVar.c ? pg1Var : null, ((qo0) entry.getKey()).a.f, ((qo0) entry.getKey()).a.g);
        iq0 iq0Var2 = new iq0(iaeVar2.g.a, ((qo0) entry.getKey()).b.d, iaeVar2.c ? pg1Var2 : null, ((qo0) entry.getKey()).b.f, ((qo0) entry.getKey()).b.g);
        int i = ((qo0) entry.getKey()).a.c;
        iaeVar3.getClass();
        p8c.m();
        iaeVar3.a();
        ok8.o("Consumer can only be linked once.", !iaeVar3.j);
        iaeVar3.j = true;
        hae haeVar = iaeVar3.l;
        tv1 tv1VarD0 = bm8.d0(haeVar.c(), new fae(iaeVar3, haeVar, i, iq0Var, iq0Var2), ok8.w());
        tv1VarD0.b(new w36(0, tv1VarD0, new w84(this, iaeVar3)), ok8.w());
    }

    public void y(xf xfVar) {
        int i;
        sug sugVar = (sug) this.c;
        int i2 = xfVar.a;
        if (i2 == 1 || i2 == 8) {
            qc0.j("should not dispatch add or move for pre layout");
            return;
        }
        int iQ = Q(xfVar.b, i2);
        int i3 = xfVar.b;
        int i4 = xfVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                yg5.l(xfVar, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < xfVar.c; i6++) {
            int iQ2 = Q((i * i6) + xfVar.b, xfVar.a);
            int i7 = xfVar.a;
            if (i7 == 2 ? iQ2 != iQ : !(i7 == 4 && iQ2 == iQ + 1)) {
                xf xfVarL = L(i7, iQ, i5);
                z(xfVarL, i3);
                sugVar.q(xfVarL);
                if (xfVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iQ = iQ2;
            } else {
                i5++;
            }
        }
        sugVar.q(xfVar);
        if (i5 > 0) {
            xf xfVarL2 = L(xfVar.a, iQ, i5);
            z(xfVarL2, i3);
            sugVar.q(xfVarL2);
        }
    }

    public void z(xf xfVar, int i) {
        m6c m6cVar = (m6c) this.e;
        m6cVar.p(xfVar);
        int i2 = xfVar.a;
        if (i2 != 2) {
            if (i2 == 4) {
                m6cVar.H(i, xfVar.c);
                return;
            } else {
                qc0.j("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = xfVar.c;
        RecyclerView recyclerView = (RecyclerView) m6cVar.b;
        recyclerView.L(i, i3, true);
        recyclerView.v1 = true;
        recyclerView.s1.b += i3;
    }

    public /* synthetic */ a82(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public a82(Context context, ff5 ff5Var, of5 of5Var, hbc hbcVar, rw rwVar) {
        this.a = 12;
        this.c = new a97(context, a97.o, k60.h, yb6.c);
        this.d = ff5Var;
        this.b = of5Var;
        this.e = hbcVar;
        this.f = rwVar;
    }

    public a82(Map map) {
        this.a = 19;
        map.getClass();
        this.c = new LinkedHashMap(map);
        this.d = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new pb2(4, this);
    }

    public a82() {
        this.a = 4;
        this.c = new Object();
        this.b = new xh0(0);
        this.e = new i79();
        this.f = new i79();
    }

    public a82(Layout layout) {
        this.a = 16;
        this.c = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iN = v4e.N(((Layout) this.c).getText(), '\n', length, 4);
            length = iN < 0 ? ((Layout) this.c).getText().length() : iN + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.c).getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.d = arrayList2;
        this.e = new boolean[((ArrayList) this.b).size()];
        ((ArrayList) this.b).size();
    }

    public a82(em7 em7Var, lo2 lo2Var, lo2 lo2Var2, lo2 lo2Var3) {
        this.a = 24;
        em7Var.getClass();
        this.c = em7Var;
        this.d = lo2Var;
        this.b = lo2Var2;
        this.e = lo2Var3;
    }

    public a82(y5f y5fVar, HashMap map, HashMap map2, HashMap map3) {
        this.a = 22;
        this.c = y5fVar;
        this.e = map2;
        this.f = map3;
        this.b = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        y5fVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.d = jArr;
    }

    public /* synthetic */ a82(int i) {
        this.a = i;
    }

    public a82(qwe qweVar, uf1 uf1Var, d3e d3eVar, sd1 sd1Var, i4e i4eVar) {
        this.a = 21;
        qweVar.getClass();
        sd1Var.getClass();
        i4eVar.getClass();
        this.c = qweVar;
        this.d = uf1Var;
        this.b = d3eVar;
        this.e = sd1Var;
        this.f = i4eVar;
    }

    public a82(int[] iArr, ky9[] ky9VarArr) {
        z72 z72Var;
        this.a = 0;
        this.f = new float[3];
        this.e = ky9VarArr;
        int[] iArr2 = new int[32768];
        this.d = iArr2;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int iK = K(Color.blue(i2), 8, 5) | (K(Color.red(i2), 8, 5) << 10) | (K(Color.green(i2), 8, 5) << 5);
            iArr[i] = iK;
            iArr2[iK] = iArr2[iK] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0) {
                int iRgb = Color.rgb(K((i4 >> 10) & 31, 5, 8), K((i4 >> 5) & 31, 5, 8), K(i4 & 31, 5, 8));
                float[] fArr = (float[]) this.f;
                ThreadLocal threadLocal = v82.a;
                v82.a(Color.red(iRgb), Color.green(iRgb), Color.blue(iRgb), fArr);
                if (P(fArr)) {
                    iArr2[i4] = 0;
                }
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.c = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= 16) {
            this.b = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                ((ArrayList) this.b).add(new ly9(Color.rgb(K((i8 >> 10) & 31, 5, 8), K((i8 >> 5) & 31, 5, 8), K(i8 & 31, 5, 8)), iArr2[i8]));
            }
            return;
        }
        PriorityQueue<z72> priorityQueue = new PriorityQueue(16, g);
        priorityQueue.offer(new z72(this, 0, ((int[]) this.c).length - 1));
        while (priorityQueue.size() < 16 && (z72Var = (z72) priorityQueue.poll()) != null) {
            int i9 = z72Var.b;
            int iMin = z72Var.a;
            if ((i9 + 1) - iMin <= 1) {
                break;
            }
            a82 a82Var = z72Var.j;
            if ((i9 + 1) - iMin > 1) {
                int i10 = z72Var.e - z72Var.d;
                int i11 = z72Var.g - z72Var.f;
                int i12 = z72Var.i - z72Var.h;
                int i13 = (i10 < i11 || i10 < i12) ? (i11 < i10 || i11 < i12) ? -1 : -2 : -3;
                int[] iArr4 = (int[]) a82Var.c;
                int[] iArr5 = (int[]) a82Var.d;
                J(i13, iMin, i9, iArr4);
                Arrays.sort(iArr4, iMin, z72Var.b + 1);
                J(i13, iMin, z72Var.b, iArr4);
                int i14 = z72Var.c / 2;
                int i15 = 0;
                int i16 = iMin;
                while (true) {
                    int i17 = z72Var.b;
                    if (i16 > i17) {
                        break;
                    }
                    i15 += iArr5[iArr4[i16]];
                    if (i15 >= i14) {
                        iMin = Math.min(i17 - 1, i16);
                        break;
                    }
                    i16++;
                }
                z72 z72Var2 = new z72(a82Var, iMin + 1, z72Var.b);
                z72Var.b = iMin;
                z72Var.a();
                priorityQueue.offer(z72Var2);
                priorityQueue.offer(z72Var);
            } else {
                qc0.p("Can not split a box with only 1 color");
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (z72 z72Var3 : priorityQueue) {
            a82 a82Var2 = z72Var3.j;
            int[] iArr6 = (int[]) a82Var2.c;
            int[] iArr7 = (int[]) a82Var2.d;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            for (int i22 = z72Var3.a; i22 <= z72Var3.b; i22++) {
                int i23 = iArr6[i22];
                int i24 = iArr7[i23];
                i19 += i24;
                i18 = (((i23 >> 10) & 31) * i24) + i18;
                i20 = (((i23 >> 5) & 31) * i24) + i20;
                i21 += i24 * (i23 & 31);
            }
            float f = i19;
            ly9 ly9Var = new ly9(Color.rgb(K(Math.round(i18 / f), 5, 8), K(Math.round(i20 / f), 5, 8), K(Math.round(i21 / f), 5, 8)), i19);
            if (!P(ly9Var.b())) {
                arrayList.add(ly9Var);
            }
        }
        this.b = arrayList;
    }

    public a82(m6c m6cVar) {
        this.a = 1;
        this.c = new sug(30);
        this.b = new ArrayList();
        this.d = new ArrayList();
        this.e = m6cVar;
        this.f = new kd9(22, this);
    }

    public a82(pg1 pg1Var, pg1 pg1Var2, pae paeVar) {
        this.a = 11;
        this.d = pg1Var;
        this.b = pg1Var2;
        this.c = paeVar;
    }

    public a82(ec2 ec2Var) {
        this.a = 7;
        this.b = s72.l1(ec2Var.a);
        this.c = s72.l1(ec2Var.b);
        this.d = s72.l1(ec2Var.c);
        List list = (List) ec2Var.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new p(26, (iy9) it.next()));
        }
        this.e = arrayList;
        List list2 = (List) ec2Var.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new dc2((mm3) it2.next(), 1));
        }
        this.f = arrayList2;
    }

    public a82(hc2 hc2Var, hc2 hc2Var2, t99 t99Var, ArrayList arrayList) {
        this.a = 5;
        this.d = hc2Var;
        this.e = hc2Var2;
        this.f = t99Var;
        this.b = arrayList;
        this.c = hc2Var;
    }

    public a82(kle kleVar) {
        this.a = 13;
        kleVar.getClass();
        this.c = kleVar;
        this.e = bs6.a;
        this.f = yj5.a;
    }

    public a82(sq3 sq3Var, qfc qfcVar) {
        this.a = 8;
        this.c = sq3Var;
        this.f = qfcVar;
        this.d = new HashMap();
        this.b = new HashMap();
    }
}
