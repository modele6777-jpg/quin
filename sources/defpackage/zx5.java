package defpackage;

import ai.askquin.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zx5 {
    public final tx5 A;
    public final y25 B;
    public jf C;
    public jf D;
    public jf E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public by5 O;
    public final wwg P;
    public boolean b;
    public ArrayList e;
    public um9 g;
    public final ArrayList n;
    public final w84 o;
    public final CopyOnWriteArrayList p;
    public final rx5 q;
    public final rx5 r;
    public final rx5 s;
    public final rx5 t;
    public final sx5 u;
    public int v;
    public mx5 w;
    public qk2 x;
    public kx5 y;
    public kx5 z;
    public final ArrayList a = new ArrayList();
    public final szc c = new szc(19);
    public ArrayList d = new ArrayList();
    public final px5 f = new px5(this);
    public hs0 h = null;
    public boolean i = false;
    public final yr0 j = new yr0(1, this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [rx5] */
    /* JADX WARN: Type inference failed for: r0v17, types: [rx5] */
    /* JADX WARN: Type inference failed for: r0v18, types: [rx5] */
    /* JADX WARN: Type inference failed for: r0v19, types: [rx5] */
    public zx5() {
        Collections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new w84(this);
        this.p = new CopyOnWriteArrayList();
        final int i = 0;
        this.q = new yl2(this) { // from class: rx5
            public final /* synthetic */ zx5 b;

            {
                this.b = this;
            }

            @Override // defpackage.yl2
            public final void accept(Object obj) {
                int i2 = i;
                zx5 zx5Var = this.b;
                switch (i2) {
                    case 0:
                        if (zx5Var.K()) {
                            zx5Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (zx5Var.K() && num.intValue() == 80) {
                            zx5Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        y59 y59Var = (y59) obj;
                        if (zx5Var.K()) {
                            boolean z = y59Var.a;
                            zx5Var.n(false);
                        }
                        break;
                    default:
                        sda sdaVar = (sda) obj;
                        if (zx5Var.K()) {
                            boolean z2 = sdaVar.a;
                            zx5Var.s(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.r = new yl2(this) { // from class: rx5
            public final /* synthetic */ zx5 b;

            {
                this.b = this;
            }

            @Override // defpackage.yl2
            public final void accept(Object obj) {
                int i3 = i2;
                zx5 zx5Var = this.b;
                switch (i3) {
                    case 0:
                        if (zx5Var.K()) {
                            zx5Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (zx5Var.K() && num.intValue() == 80) {
                            zx5Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        y59 y59Var = (y59) obj;
                        if (zx5Var.K()) {
                            boolean z = y59Var.a;
                            zx5Var.n(false);
                        }
                        break;
                    default:
                        sda sdaVar = (sda) obj;
                        if (zx5Var.K()) {
                            boolean z2 = sdaVar.a;
                            zx5Var.s(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.s = new yl2(this) { // from class: rx5
            public final /* synthetic */ zx5 b;

            {
                this.b = this;
            }

            @Override // defpackage.yl2
            public final void accept(Object obj) {
                int i4 = i3;
                zx5 zx5Var = this.b;
                switch (i4) {
                    case 0:
                        if (zx5Var.K()) {
                            zx5Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (zx5Var.K() && num.intValue() == 80) {
                            zx5Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        y59 y59Var = (y59) obj;
                        if (zx5Var.K()) {
                            boolean z = y59Var.a;
                            zx5Var.n(false);
                        }
                        break;
                    default:
                        sda sdaVar = (sda) obj;
                        if (zx5Var.K()) {
                            boolean z2 = sdaVar.a;
                            zx5Var.s(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.t = new yl2(this) { // from class: rx5
            public final /* synthetic */ zx5 b;

            {
                this.b = this;
            }

            @Override // defpackage.yl2
            public final void accept(Object obj) {
                int i5 = i4;
                zx5 zx5Var = this.b;
                switch (i5) {
                    case 0:
                        if (zx5Var.K()) {
                            zx5Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (zx5Var.K() && num.intValue() == 80) {
                            zx5Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        y59 y59Var = (y59) obj;
                        if (zx5Var.K()) {
                            boolean z = y59Var.a;
                            zx5Var.n(false);
                        }
                        break;
                    default:
                        sda sdaVar = (sda) obj;
                        if (zx5Var.K()) {
                            boolean z2 = sdaVar.a;
                            zx5Var.s(false);
                        }
                        break;
                }
            }
        };
        this.u = new sx5(this);
        this.v = -1;
        this.A = new tx5(this);
        this.B = new y25(4);
        this.F = new ArrayDeque();
        this.P = new wwg(12, this);
    }

    public static HashSet D(hs0 hs0Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < hs0Var.a.size(); i++) {
            kx5 kx5Var = ((ky5) hs0Var.a.get(i)).b;
            if (kx5Var != null && hs0Var.g) {
                hashSet.add(kx5Var);
            }
        }
        return hashSet;
    }

    public static boolean I(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean J(kx5 kx5Var) {
        boolean zJ = false;
        for (kx5 kx5Var2 : kx5Var.K0.c.I()) {
            if (kx5Var2 != null) {
                zJ = J(kx5Var2);
            }
            if (zJ) {
                return true;
            }
        }
        return false;
    }

    public static boolean L(kx5 kx5Var) {
        if (kx5Var == null) {
            return true;
        }
        if (kx5Var.S0) {
            return kx5Var.I0 == null || L(kx5Var.L0);
        }
        return false;
    }

    public static boolean M(kx5 kx5Var) {
        if (kx5Var == null) {
            return true;
        }
        zx5 zx5Var = kx5Var.I0;
        return kx5Var == zx5Var.z && M(zx5Var.y);
    }

    public static void a0(kx5 kx5Var) {
        if (I(2)) {
            Log.v("FragmentManager", "show: " + kx5Var);
        }
        if (kx5Var.P0) {
            kx5Var.P0 = false;
            kx5Var.Y0 = !kx5Var.Y0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x022f A[PHI: r15
  0x022f: PHI (r15v20 char) = (r15v19 char), (r15v22 char) binds: [B:105:0x021c, B:109:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    public final void A(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5 = i;
        szc szcVar = this.c;
        ArrayList arrayList4 = this.n;
        boolean z4 = ((hs0) arrayList.get(i5)).o;
        ArrayList arrayList5 = this.N;
        if (arrayList5 == null) {
            this.N = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.N.addAll(szcVar.K());
        kx5 kx5Var = this.z;
        int i6 = i5;
        boolean z5 = false;
        while (i6 < i2) {
            hs0 hs0Var = (hs0) arrayList.get(i6);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList6 = this.N;
            if (zBooleanValue) {
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
                int i7 = 1;
                ArrayList arrayList7 = hs0Var.a;
                int size = arrayList7.size() - 1;
                while (size >= 0) {
                    ky5 ky5Var = (ky5) arrayList7.get(size);
                    int i8 = ky5Var.a;
                    if (i8 != i7) {
                        if (i8 != 3) {
                            switch (i8) {
                                case 6:
                                    arrayList6.add(ky5Var.b);
                                    break;
                                case 8:
                                    kx5Var = null;
                                    break;
                                case 9:
                                    kx5Var = ky5Var.b;
                                    break;
                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    ky5Var.i = ky5Var.h;
                                    break;
                            }
                        } else {
                            arrayList6.add(ky5Var.b);
                        }
                        size--;
                        i7 = 1;
                    }
                    arrayList6.remove(ky5Var.b);
                    size--;
                    i7 = 1;
                }
            } else {
                ArrayList arrayList8 = hs0Var.a;
                int i9 = 0;
                while (i9 < arrayList8.size()) {
                    ky5 ky5Var2 = (ky5) arrayList8.get(i9);
                    boolean z6 = z4;
                    int i10 = ky5Var2.a;
                    int i11 = i6;
                    int i12 = 1;
                    if (i10 != 1) {
                        z3 = z5;
                        if (i10 != 2) {
                            if (i10 == 3 || i10 == 6) {
                                arrayList6.remove(ky5Var2.b);
                                kx5 kx5Var2 = ky5Var2.b;
                                if (kx5Var2 == kx5Var) {
                                    arrayList8.add(i9, new ky5(9, kx5Var2));
                                    i9++;
                                    kx5Var = null;
                                }
                            } else if (i10 == 7) {
                                i12 = 1;
                            } else if (i10 == 8) {
                                arrayList8.add(i9, new ky5(9, kx5Var, 0));
                                ky5Var2.c = true;
                                i9++;
                                kx5Var = ky5Var2.b;
                            }
                            i12 = 1;
                        } else {
                            kx5 kx5Var3 = ky5Var2.b;
                            int i13 = kx5Var3.N0;
                            int size2 = arrayList6.size() - 1;
                            boolean z7 = false;
                            while (size2 >= 0) {
                                int i14 = size2;
                                kx5 kx5Var4 = (kx5) arrayList6.get(size2);
                                ArrayList arrayList9 = arrayList4;
                                if (kx5Var4.N0 != i13) {
                                    i13 = i13;
                                } else if (kx5Var4 == kx5Var3) {
                                    i13 = i13;
                                    z7 = true;
                                } else {
                                    if (kx5Var4 == kx5Var) {
                                        arrayList8.add(i9, new ky5(9, kx5Var4, 0));
                                        i9++;
                                        i4 = 0;
                                        kx5Var = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    ky5 ky5Var3 = new ky5(3, kx5Var4, i4);
                                    ky5Var3.d = ky5Var2.d;
                                    ky5Var3.f = ky5Var2.f;
                                    ky5Var3.e = ky5Var2.e;
                                    ky5Var3.g = ky5Var2.g;
                                    arrayList8.add(i9, ky5Var3);
                                    arrayList6.remove(kx5Var4);
                                    i9++;
                                    kx5Var = kx5Var;
                                }
                                size2 = i14 - 1;
                                i13 = i13;
                                arrayList4 = arrayList9;
                            }
                            arrayList4 = arrayList4;
                            i12 = 1;
                            if (z7) {
                                arrayList8.remove(i9);
                                i9--;
                            } else {
                                ky5Var2.a = 1;
                                ky5Var2.c = true;
                                arrayList6.add(kx5Var3);
                            }
                        }
                        i9 += i12;
                        z4 = z6;
                        i6 = i11;
                        z5 = z3;
                        arrayList4 = arrayList4;
                    } else {
                        z3 = z5;
                    }
                    arrayList4 = arrayList4;
                    arrayList6.add(ky5Var2.b);
                    i9 += i12;
                    z4 = z6;
                    i6 = i11;
                    z5 = z3;
                    arrayList4 = arrayList4;
                }
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
            }
            z5 = z2 || hs0Var.g;
            i6 = i3 + 1;
            z4 = z;
            arrayList4 = arrayList3;
        }
        ArrayList arrayList10 = arrayList4;
        boolean z8 = z4;
        boolean z9 = z5;
        this.N.clear();
        if (!z8 && this.v >= 1) {
            for (int i15 = i5; i15 < i2; i15++) {
                Iterator it = ((hs0) arrayList.get(i15)).a.iterator();
                while (it.hasNext()) {
                    kx5 kx5Var5 = ((ky5) it.next()).b;
                    if (kx5Var5 != null && kx5Var5.I0 != null) {
                        szcVar.Q(g(kx5Var5));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i16 = i5;
        while (i16 < i2) {
            hs0 hs0Var2 = (hs0) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                hs0Var2.c(-1);
                zx5 zx5Var = hs0Var2.q;
                ArrayList arrayList11 = hs0Var2.a;
                boolean z10 = true;
                for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                    ky5 ky5Var4 = (ky5) arrayList11.get(size3);
                    kx5 kx5Var6 = ky5Var4.b;
                    if (kx5Var6 != null) {
                        if (kx5Var6.X0 != null) {
                            kx5Var6.d().a = z10;
                        }
                        int i17 = hs0Var2.f;
                        char c = 8194;
                        char c2 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                c = 4100;
                                if (i17 != 8197) {
                                    c2 = 4099;
                                    if (i17 != 4099) {
                                        c = i17 != 4100 ? (char) 0 : (char) 8197;
                                    } else {
                                        c = c2;
                                    }
                                }
                            } else {
                                c = c2;
                            }
                        }
                        if (kx5Var6.X0 != null || c != 0) {
                            kx5Var6.d();
                            kx5Var6.X0.getClass();
                        }
                        kx5Var6.d();
                        kx5Var6.X0.getClass();
                    }
                    switch (ky5Var4.a) {
                        case 1:
                            kx5Var6.C(ky5Var4.d, ky5Var4.e, ky5Var4.f, ky5Var4.g);
                            z10 = true;
                            zx5Var.W(kx5Var6, true);
                            zx5Var.R(kx5Var6);
                            break;
                        case 2:
                        default:
                            yg5.j(ky5Var4.a, str);
                            return;
                        case 3:
                            kx5Var6.C(ky5Var4.d, ky5Var4.e, ky5Var4.f, ky5Var4.g);
                            zx5Var.a(kx5Var6);
                            z10 = true;
                            break;
                        case 4:
                            kx5Var6.C(ky5Var4.d, ky5Var4.e, ky5Var4.f, ky5Var4.g);
                            a0(kx5Var6);
                            z10 = true;
                            break;
                        case 5:
                            kx5Var6.C(ky5Var4.d, ky5Var4.e, ky5Var4.f, ky5Var4.g);
                            zx5Var.W(kx5Var6, true);
                            zx5Var.H(kx5Var6);
                            z10 = true;
                            break;
                        case 6:
                            kx5Var6.C(ky5Var4.d, ky5Var4.e, ky5Var4.f, ky5Var4.g);
                            zx5Var.c(kx5Var6);
                            z10 = true;
                            break;
                        case 7:
                            kx5Var6.C(ky5Var4.d, ky5Var4.e, ky5Var4.f, ky5Var4.g);
                            zx5Var.W(kx5Var6, true);
                            zx5Var.h(kx5Var6);
                            z10 = true;
                            break;
                        case 8:
                            zx5Var.Y(null);
                            z10 = true;
                            break;
                        case 9:
                            zx5Var.Y(kx5Var6);
                            z10 = true;
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            ky5Var4.i = kx5Var6.b1;
                            zx5Var.X(kx5Var6, ky5Var4.h);
                            z10 = true;
                            break;
                    }
                }
            } else {
                hs0Var2.c(1);
                zx5 zx5Var2 = hs0Var2.q;
                ArrayList arrayList12 = hs0Var2.a;
                int size4 = arrayList12.size();
                int i18 = 0;
                while (i18 < size4) {
                    ky5 ky5Var5 = (ky5) arrayList12.get(i18);
                    kx5 kx5Var7 = ky5Var5.b;
                    if (kx5Var7 != null) {
                        if (kx5Var7.X0 != null) {
                            kx5Var7.d().a = false;
                        }
                        int i19 = hs0Var2.f;
                        if (kx5Var7.X0 != null || i19 != 0) {
                            kx5Var7.d();
                            kx5Var7.X0.getClass();
                        }
                        kx5Var7.d();
                        kx5Var7.X0.getClass();
                    }
                    switch (ky5Var5.a) {
                        case 1:
                            kx5Var7.C(ky5Var5.d, ky5Var5.e, ky5Var5.f, ky5Var5.g);
                            zx5Var2.W(kx5Var7, false);
                            zx5Var2.a(kx5Var7);
                            i18++;
                            str = str;
                            break;
                        case 2:
                        default:
                            yg5.j(ky5Var5.a, str);
                            return;
                        case 3:
                            kx5Var7.C(ky5Var5.d, ky5Var5.e, ky5Var5.f, ky5Var5.g);
                            zx5Var2.R(kx5Var7);
                            i18++;
                            str = str;
                            break;
                        case 4:
                            kx5Var7.C(ky5Var5.d, ky5Var5.e, ky5Var5.f, ky5Var5.g);
                            zx5Var2.H(kx5Var7);
                            i18++;
                            str = str;
                            break;
                        case 5:
                            kx5Var7.C(ky5Var5.d, ky5Var5.e, ky5Var5.f, ky5Var5.g);
                            zx5Var2.W(kx5Var7, false);
                            a0(kx5Var7);
                            i18++;
                            str = str;
                            break;
                        case 6:
                            kx5Var7.C(ky5Var5.d, ky5Var5.e, ky5Var5.f, ky5Var5.g);
                            zx5Var2.h(kx5Var7);
                            i18++;
                            str = str;
                            break;
                        case 7:
                            kx5Var7.C(ky5Var5.d, ky5Var5.e, ky5Var5.f, ky5Var5.g);
                            zx5Var2.W(kx5Var7, false);
                            zx5Var2.c(kx5Var7);
                            i18++;
                            str = str;
                            break;
                        case 8:
                            zx5Var2.Y(kx5Var7);
                            i18++;
                            str = str;
                            break;
                        case 9:
                            zx5Var2.Y(null);
                            i18++;
                            str = str;
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            ky5Var5.h = kx5Var7.b1;
                            zx5Var2.X(kx5Var7, ky5Var5.i);
                            i18++;
                            str = str;
                            break;
                    }
                }
            }
            i16++;
            str = str;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList10.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(D((hs0) it2.next()));
            }
            if (this.h == null) {
                Iterator it3 = arrayList10.iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        r3.f();
                        return;
                    }
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = arrayList10.iterator();
                while (it5.hasNext()) {
                    if (it5.next() != null) {
                        r3.f();
                        return;
                    }
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i20 = i5; i20 < i2; i20++) {
            hs0 hs0Var3 = (hs0) arrayList.get(i20);
            if (zBooleanValue2) {
                for (int size5 = hs0Var3.a.size() - 1; size5 >= 0; size5--) {
                    kx5 kx5Var8 = ((ky5) hs0Var3.a.get(size5)).b;
                    if (kx5Var8 != null) {
                        g(kx5Var8).j();
                    }
                }
            } else {
                Iterator it7 = hs0Var3.a.iterator();
                while (it7.hasNext()) {
                    kx5 kx5Var9 = ((ky5) it7.next()).b;
                    if (kx5Var9 != null) {
                        g(kx5Var9).j();
                    }
                }
            }
        }
        N(this.v, true);
        for (bt3 bt3Var : f(arrayList, i5, i2)) {
            bt3Var.e = zBooleanValue2;
            synchronized (bt3Var.b) {
                bt3Var.e();
                ArrayList arrayList13 = bt3Var.b;
                ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                if (listIterator.hasPrevious()) {
                    throw null;
                }
                bt3Var.f = false;
            }
            bt3Var.b();
        }
        while (i5 < i2) {
            hs0 hs0Var4 = (hs0) arrayList.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue() && hs0Var4.s >= 0) {
                hs0Var4.s = -1;
            }
            if (hs0Var4.p != null) {
                for (int i21 = 0; i21 < hs0Var4.p.size(); i21++) {
                    ((Runnable) hs0Var4.p.get(i21)).run();
                }
                hs0Var4.p = null;
            }
            i5++;
        }
        if (!z9 || arrayList10.size() <= 0) {
            return;
        }
        arrayList10.get(0).getClass();
        r3.f();
    }

    public final kx5 B(int i) {
        szc szcVar = this.c;
        ArrayList arrayList = (ArrayList) szcVar.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            kx5 kx5Var = (kx5) arrayList.get(size);
            if (kx5Var != null && kx5Var.M0 == i) {
                return kx5Var;
            }
        }
        for (fy5 fy5Var : ((HashMap) szcVar.c).values()) {
            if (fy5Var != null) {
                kx5 kx5Var2 = fy5Var.c;
                if (kx5Var2.M0 == i) {
                    return kx5Var2;
                }
            }
        }
        return null;
    }

    public final void C() {
        for (bt3 bt3Var : e()) {
            if (bt3Var.f) {
                if (I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                bt3Var.f = false;
                bt3Var.b();
            }
        }
    }

    public final ViewGroup E(kx5 kx5Var) {
        ViewGroup viewGroup = kx5Var.U0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (kx5Var.N0 <= 0 || !this.x.I()) {
            return null;
        }
        View viewH = this.x.H(kx5Var.N0);
        if (viewH instanceof ViewGroup) {
            return (ViewGroup) viewH;
        }
        return null;
    }

    public final tx5 F() {
        kx5 kx5Var = this.y;
        return kx5Var != null ? kx5Var.I0.F() : this.A;
    }

    public final y25 G() {
        kx5 kx5Var = this.y;
        return kx5Var != null ? kx5Var.I0.G() : this.B;
    }

    public final void H(kx5 kx5Var) {
        if (I(2)) {
            Log.v("FragmentManager", "hide: " + kx5Var);
        }
        if (kx5Var.P0) {
            return;
        }
        kx5Var.P0 = true;
        kx5Var.Y0 = true ^ kx5Var.Y0;
        Z(kx5Var);
    }

    public final boolean K() {
        kx5 kx5Var = this.y;
        if (kx5Var == null) {
            return true;
        }
        return kx5Var.n() && this.y.j().K();
    }

    public final void N(int i, boolean z) {
        mx5 mx5Var;
        if (this.w == null && i != -1) {
            qc0.p("No activity");
            return;
        }
        if (z || i != this.v) {
            this.v = i;
            szc szcVar = this.c;
            HashMap map = (HashMap) szcVar.c;
            Iterator it = ((ArrayList) szcVar.b).iterator();
            while (it.hasNext()) {
                fy5 fy5Var = (fy5) map.get(((kx5) it.next()).e);
                if (fy5Var != null) {
                    fy5Var.j();
                }
            }
            for (fy5 fy5Var2 : map.values()) {
                if (fy5Var2 != null) {
                    fy5Var2.j();
                    kx5 kx5Var = fy5Var2.c;
                    if (kx5Var.z && !kx5Var.p()) {
                        szcVar.R(fy5Var2);
                    }
                }
            }
            b0();
            if (this.G && (mx5Var = this.w) != null && this.v == 7) {
                mx5Var.K0.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void O() {
        if (this.w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.g = false;
        for (kx5 kx5Var : this.c.K()) {
            if (kx5Var != null) {
                kx5Var.K0.O();
            }
        }
    }

    public final boolean P() {
        z(false);
        y(true);
        kx5 kx5Var = this.z;
        if (kx5Var != null && kx5Var.f().P()) {
            return true;
        }
        boolean zQ = Q(-1, 0, this.L, this.M);
        if (zQ) {
            this.b = true;
            try {
                S(this.L, this.M);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        d0();
        if (this.K) {
            this.K = false;
            b0();
        }
        ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        return zQ;
    }

    public final boolean Q(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    hs0 hs0Var = (hs0) this.d.get(size2);
                    if (i >= 0 && i == hs0Var.s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        hs0 hs0Var2 = (hs0) this.d.get(size - 1);
                        if (i < 0 || i != hs0Var2.s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((hs0) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void R(kx5 kx5Var) {
        if (I(2)) {
            Log.v("FragmentManager", "remove: " + kx5Var + " nesting=" + kx5Var.H0);
        }
        boolean zP = kx5Var.p();
        if (kx5Var.Q0 && zP) {
            return;
        }
        szc szcVar = this.c;
        synchronized (((ArrayList) szcVar.b)) {
            ((ArrayList) szcVar.b).remove(kx5Var);
        }
        kx5Var.y = false;
        if (J(kx5Var)) {
            this.G = true;
        }
        kx5Var.z = true;
        Z(kx5Var);
    }

    public final void S(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            qc0.p("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((hs0) arrayList.get(i)).o) {
                if (i2 != i) {
                    A(i2, i, arrayList, arrayList2);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((hs0) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                A(i, i2, arrayList, arrayList2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            A(i2, size, arrayList, arrayList2);
        }
    }

    public final void T(Bundle bundle) {
        w84 w84Var;
        int i;
        boolean z;
        int i2;
        fy5 fy5Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.w.H0.getClassLoader());
                this.m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.w.H0.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        szc szcVar = this.c;
        HashMap map2 = (HashMap) szcVar.d;
        HashMap map3 = (HashMap) szcVar.c;
        map2.clear();
        map2.putAll(map);
        ay5 ay5Var = (ay5) bundle.getParcelable("state");
        if (ay5Var == null) {
            return;
        }
        map3.clear();
        Iterator it = ay5Var.a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            w84Var = this.o;
            i = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleS = szcVar.S((String) it.next(), null);
            if (bundleS != null) {
                kx5 kx5Var = (kx5) this.O.b.get(((ey5) bundleS.getParcelable("state")).b);
                if (kx5Var != null) {
                    if (I(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + kx5Var);
                    }
                    fy5Var = new fy5(w84Var, szcVar, kx5Var, bundleS);
                } else {
                    fy5Var = new fy5(this.o, this.c, this.w.H0.getClassLoader(), F(), bundleS);
                }
                kx5 kx5Var2 = fy5Var.c;
                kx5Var2.b = bundleS;
                kx5Var2.I0 = this;
                if (I(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + kx5Var2.e + "): " + kx5Var2);
                }
                fy5Var.l(this.w.H0.getClassLoader());
                szcVar.Q(fy5Var);
                fy5Var.e = this.v;
            }
        }
        by5 by5Var = this.O;
        by5Var.getClass();
        Iterator it2 = new ArrayList(by5Var.b.values()).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            kx5 kx5Var3 = (kx5) it2.next();
            if (map3.get(kx5Var3.e) == null) {
                if (I(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + kx5Var3 + " that was not found in the set of active Fragments " + ay5Var.a);
                }
                this.O.i(kx5Var3);
                kx5Var3.I0 = this;
                fy5 fy5Var2 = new fy5(w84Var, szcVar, kx5Var3);
                fy5Var2.e = 1;
                fy5Var2.j();
                kx5Var3.z = true;
                fy5Var2.j();
            }
        }
        ArrayList<String> arrayList = ay5Var.b;
        ((ArrayList) szcVar.b).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                kx5 kx5VarF = szcVar.F(str3);
                if (kx5VarF == null) {
                    qc0.p(ib8.j("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (I(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + kx5VarF);
                }
                szcVar.w(kx5VarF);
            }
        }
        if (ay5Var.c != null) {
            this.d = new ArrayList(ay5Var.c.length);
            int i3 = 0;
            while (true) {
                is0[] is0VarArr = ay5Var.c;
                if (i3 >= is0VarArr.length) {
                    break;
                }
                is0 is0Var = is0VarArr[i3];
                ArrayList arrayList2 = is0Var.b;
                hs0 hs0Var = new hs0(this);
                int[] iArr = is0Var.a;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    ky5 ky5Var = new ky5();
                    int i6 = i4 + 1;
                    int i7 = i;
                    ky5Var.a = iArr[i4];
                    if (I(i7)) {
                        Log.v("FragmentManager", "Instantiate " + hs0Var + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    ky5Var.h = g48.values()[is0Var.c[i5]];
                    ky5Var.i = g48.values()[is0Var.d[i5]];
                    int i8 = i4 + 2;
                    ky5Var.c = iArr[i6] != 0 ? z : false;
                    int i9 = iArr[i8];
                    ky5Var.d = i9;
                    int i10 = iArr[i4 + 3];
                    ky5Var.e = i10;
                    int i11 = i4 + 5;
                    int i12 = iArr[i4 + 4];
                    ky5Var.f = i12;
                    i4 += 6;
                    int[] iArr2 = iArr;
                    int i13 = iArr2[i11];
                    ky5Var.g = i13;
                    hs0Var.b = i9;
                    hs0Var.c = i10;
                    hs0Var.d = i12;
                    hs0Var.e = i13;
                    hs0Var.b(ky5Var);
                    i5++;
                    i = i7;
                    iArr = iArr2;
                    z = true;
                }
                int i14 = i;
                hs0Var.f = is0Var.e;
                hs0Var.h = is0Var.f;
                hs0Var.g = true;
                hs0Var.i = is0Var.v;
                hs0Var.j = is0Var.w;
                hs0Var.k = is0Var.x;
                hs0Var.l = is0Var.y;
                hs0Var.m = is0Var.z;
                hs0Var.n = is0Var.X;
                hs0Var.o = is0Var.Y;
                hs0Var.s = is0Var.g;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    String str4 = (String) arrayList2.get(i15);
                    if (str4 != null) {
                        ((ky5) hs0Var.a.get(i15)).b = szcVar.F(str4);
                    }
                }
                hs0Var.c(1);
                if (I(i14)) {
                    StringBuilder sbN = ub3.n(i3, "restoreAllState: back stack #", " (index ");
                    sbN.append(hs0Var.s);
                    sbN.append("): ");
                    sbN.append(hs0Var);
                    Log.v("FragmentManager", sbN.toString());
                    PrintWriter printWriter = new PrintWriter(new bf8());
                    hs0Var.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(hs0Var);
                i3++;
                i = i14;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = new ArrayList();
        }
        this.k.set(ay5Var.d);
        String str5 = ay5Var.e;
        if (str5 != null) {
            kx5 kx5VarF2 = szcVar.F(str5);
            this.z = kx5VarF2;
            r(kx5VarF2);
        }
        ArrayList arrayList3 = ay5Var.f;
        if (arrayList3 != null) {
            for (int i16 = i2; i16 < arrayList3.size(); i16++) {
                this.l.put((String) arrayList3.get(i16), (js0) ay5Var.g.get(i16));
            }
        }
        this.F = new ArrayDeque(ay5Var.v);
    }

    public final Bundle U() {
        int i;
        ArrayList arrayList;
        is0[] is0VarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        C();
        w();
        z(true);
        this.H = true;
        this.O.g = true;
        szc szcVar = this.c;
        szcVar.getClass();
        HashMap map = (HashMap) szcVar.c;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            fy5 fy5Var = (fy5) it.next();
            if (fy5Var != null) {
                kx5 kx5Var = fy5Var.c;
                String str = kx5Var.e;
                Bundle bundle3 = new Bundle();
                kx5 kx5Var2 = fy5Var.c;
                if (kx5Var2.a == -1 && (bundle = kx5Var2.b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new ey5(kx5Var2));
                if (kx5Var2.a > 0) {
                    Bundle bundle4 = new Bundle();
                    kx5Var2.x(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    fy5Var.a.R0(kx5Var2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    kx5Var2.f1.q(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleU = kx5Var2.K0.U();
                    if (!bundleU.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleU);
                    }
                    SparseArray<? extends Parcelable> sparseArray = kx5Var2.c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = kx5Var2.d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = kx5Var2.f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                szcVar.S(str, bundle3);
                arrayList2.add(kx5Var.e);
                if (I(2)) {
                    Log.v("FragmentManager", "Saved state of " + kx5Var + ": " + kx5Var.b);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.d;
        if (!map2.isEmpty()) {
            szc szcVar2 = this.c;
            synchronized (((ArrayList) szcVar2.b)) {
                try {
                    if (((ArrayList) szcVar2.b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) szcVar2.b).size());
                        for (kx5 kx5Var3 : (ArrayList) szcVar2.b) {
                            arrayList.add(kx5Var3.e);
                            if (I(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + kx5Var3.e + "): " + kx5Var3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.d.size();
            if (size > 0) {
                is0VarArr = new is0[size];
                for (i = 0; i < size; i++) {
                    is0VarArr[i] = new is0((hs0) this.d.get(i));
                    if (I(2)) {
                        StringBuilder sbN = ub3.n(i, "saveAllState: adding back stack #", ": ");
                        sbN.append(this.d.get(i));
                        Log.v("FragmentManager", sbN.toString());
                    }
                }
            } else {
                is0VarArr = null;
            }
            ay5 ay5Var = new ay5();
            ay5Var.e = null;
            ArrayList arrayList3 = new ArrayList();
            ay5Var.f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            ay5Var.g = arrayList4;
            ay5Var.a = arrayList2;
            ay5Var.b = arrayList;
            ay5Var.c = is0VarArr;
            ay5Var.d = this.k.get();
            kx5 kx5Var4 = this.z;
            if (kx5Var4 != null) {
                ay5Var.e = kx5Var4.e;
            }
            arrayList3.addAll(this.l.keySet());
            arrayList4.addAll(this.l.values());
            ay5Var.v = new ArrayList(this.F);
            bundle2.putParcelable("state", ay5Var);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(ub3.i("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(ub3.i("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (I(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void V() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.I0.removeCallbacks(this.P);
                    this.w.I0.post(this.P);
                    d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void W(kx5 kx5Var, boolean z) {
        ViewGroup viewGroupE = E(kx5Var);
        if (viewGroupE == null || !(viewGroupE instanceof ox5)) {
            return;
        }
        ((ox5) viewGroupE).setDrawDisappearingViewsLast(!z);
    }

    public final void X(kx5 kx5Var, g48 g48Var) {
        if (kx5Var == this.c.F(kx5Var.e) && (kx5Var.J0 == null || kx5Var.I0 == this)) {
            kx5Var.b1 = g48Var;
        } else {
            s8f.k("Fragment ", kx5Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void Y(kx5 kx5Var) {
        if (kx5Var != null) {
            if (kx5Var != this.c.F(kx5Var.e) || (kx5Var.J0 != null && kx5Var.I0 != this)) {
                s8f.k("Fragment ", kx5Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        kx5 kx5Var2 = this.z;
        this.z = kx5Var;
        r(kx5Var2);
        r(this.z);
    }

    public final void Z(kx5 kx5Var) {
        ViewGroup viewGroupE = E(kx5Var);
        if (viewGroupE != null) {
            ix5 ix5Var = kx5Var.X0;
            if ((ix5Var == null ? 0 : ix5Var.e) + (ix5Var == null ? 0 : ix5Var.d) + (ix5Var == null ? 0 : ix5Var.c) + (ix5Var == null ? 0 : ix5Var.b) > 0) {
                if (viewGroupE.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupE.setTag(R.id.visible_removing_fragment_view_tag, kx5Var);
                }
                kx5 kx5Var2 = (kx5) viewGroupE.getTag(R.id.visible_removing_fragment_view_tag);
                ix5 ix5Var2 = kx5Var.X0;
                boolean z = ix5Var2 != null ? ix5Var2.a : false;
                if (kx5Var2.X0 == null) {
                    return;
                }
                kx5Var2.d().a = z;
            }
        }
    }

    public final fy5 a(kx5 kx5Var) {
        String str = kx5Var.a1;
        if (str != null) {
            hy5 hy5Var = iy5.a;
            iy5.b(new dy5(kx5Var, str));
            iy5.a(kx5Var).getClass();
        }
        if (I(2)) {
            Log.v("FragmentManager", "add: " + kx5Var);
        }
        fy5 fy5VarG = g(kx5Var);
        kx5Var.I0 = this;
        szc szcVar = this.c;
        szcVar.Q(fy5VarG);
        if (!kx5Var.Q0) {
            szcVar.w(kx5Var);
            kx5Var.z = false;
            kx5Var.Y0 = false;
            if (J(kx5Var)) {
                this.G = true;
            }
        }
        return fy5VarG;
    }

    public final void b(mx5 mx5Var, qk2 qk2Var, kx5 kx5Var) {
        by5 by5Var;
        if (this.w != null) {
            qc0.p("Already attached");
            return;
        }
        this.w = mx5Var;
        this.x = qk2Var;
        this.y = kx5Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (kx5Var != null) {
            copyOnWriteArrayList.add(new ux5(kx5Var));
        } else if (mx5Var != null) {
            copyOnWriteArrayList.add(mx5Var);
        }
        if (this.y != null) {
            d0();
        }
        if (mx5Var != null) {
            um9 um9VarB = mx5Var.K0.b();
            this.g = um9VarB;
            um9VarB.a(kx5Var != null ? kx5Var : mx5Var, this.j);
        }
        if (kx5Var != null) {
            by5 by5Var2 = kx5Var.I0.O;
            HashMap map = by5Var2.c;
            by5Var = (by5) map.get(kx5Var.e);
            if (by5Var == null) {
                by5Var = new by5(by5Var2.e);
                map.put(kx5Var.e, by5Var);
            }
            this.O = by5Var;
        } else if (mx5Var != null) {
            owf owfVarG = mx5Var.K0.g();
            ey2 ey2Var = ey2.b;
            ey2Var.getClass();
            kxa kxaVar = new kxa(owfVarG, by5.v, ey2Var);
            em7 em7VarB = job.a.b(by5.class);
            String strG = em7VarB.g();
            if (strG == null) {
                qc0.j("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                by5Var = (by5) kxaVar.f(em7VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG));
                this.O = by5Var;
            }
        } else {
            by5Var = new by5(false);
            this.O = by5Var;
        }
        by5 by5Var3 = by5Var;
        by5Var.g = this.H || this.I;
        this.c.e = by5Var3;
        mx5 mx5Var2 = this.w;
        if (mx5Var2 != null && kx5Var == null) {
            vea veaVarH = mx5Var2.h();
            veaVarH.A("android:support:fragments", new pb2(3, this));
            Bundle bundleO = veaVarH.o("android:support:fragments");
            if (bundleO != null) {
                T(bundleO);
            }
        }
        mx5 mx5Var3 = this.w;
        if (mx5Var3 != null) {
            tb2 tb2Var = mx5Var3.K0.w;
            String strConcat = "FragmentManager:".concat(kx5Var != null ? ks0.l(new StringBuilder(), kx5Var.e, ":") : "");
            int i = 18;
            this.C = tb2Var.c(strConcat.concat("StartActivityForResult"), new af(4), new ssg(i, this));
            this.D = tb2Var.c(strConcat.concat("StartIntentSenderForResult"), new af(7), new m6c(i, this));
            this.E = tb2Var.c(strConcat.concat("RequestPermissions"), new af(2), new mjg(this));
        }
        mx5 mx5Var4 = this.w;
        if (mx5Var4 != null) {
            nx5 nx5Var = mx5Var4.K0;
            rx5 rx5Var = this.q;
            rx5Var.getClass();
            nx5Var.x.add(rx5Var);
        }
        mx5 mx5Var5 = this.w;
        if (mx5Var5 != null) {
            nx5 nx5Var2 = mx5Var5.K0;
            rx5 rx5Var2 = this.r;
            rx5Var2.getClass();
            nx5Var2.y.add(rx5Var2);
        }
        mx5 mx5Var6 = this.w;
        if (mx5Var6 != null) {
            nx5 nx5Var3 = mx5Var6.K0;
            rx5 rx5Var3 = this.s;
            rx5Var3.getClass();
            nx5Var3.X.add(rx5Var3);
        }
        mx5 mx5Var7 = this.w;
        if (mx5Var7 != null) {
            nx5 nx5Var4 = mx5Var7.K0;
            rx5 rx5Var4 = this.t;
            rx5Var4.getClass();
            nx5Var4.Y.add(rx5Var4);
        }
        mx5 mx5Var8 = this.w;
        if (mx5Var8 == null || kx5Var != null) {
            return;
        }
        nx5 nx5Var5 = mx5Var8.K0;
        sx5 sx5Var = this.u;
        sx5Var.getClass();
        gg7 gg7Var = nx5Var5.c;
        ((CopyOnWriteArrayList) gg7Var.c).add(sx5Var);
        ((Runnable) gg7Var.b).run();
    }

    public final void b0() {
        for (fy5 fy5Var : this.c.H()) {
            kx5 kx5Var = fy5Var.c;
            if (kx5Var.V0) {
                if (this.b) {
                    this.K = true;
                } else {
                    kx5Var.V0 = false;
                    fy5Var.j();
                }
            }
        }
    }

    public final void c(kx5 kx5Var) {
        if (I(2)) {
            Log.v("FragmentManager", "attach: " + kx5Var);
        }
        if (kx5Var.Q0) {
            kx5Var.Q0 = false;
            if (kx5Var.y) {
                return;
            }
            this.c.w(kx5Var);
            if (I(2)) {
                Log.v("FragmentManager", "add from attach: " + kx5Var);
            }
            if (J(kx5Var)) {
                this.G = true;
            }
        }
    }

    public final void c0(IllegalStateException illegalStateException) {
        b1.d("FragmentManager", illegalStateException.getMessage());
        b1.d("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new bf8());
        mx5 mx5Var = this.w;
        if (mx5Var == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                b1.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            mx5Var.K0.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            b1.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.f(true);
                    if (I(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && M(this.y);
                if (I(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.j.f(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet e() {
        bt3 bt3Var;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.H().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((fy5) it.next()).c.U0;
            if (viewGroup != null) {
                G().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof bt3) {
                    bt3Var = (bt3) tag;
                } else {
                    bt3Var = new bt3(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, bt3Var);
                }
                hashSet.add(bt3Var);
            }
        }
        return hashSet;
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        bt3 bt3Var;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((hs0) arrayList.get(i)).a.iterator();
            while (it.hasNext()) {
                kx5 kx5Var = ((ky5) it.next()).b;
                if (kx5Var != null && (viewGroup = kx5Var.U0) != null) {
                    G().getClass();
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof bt3) {
                        bt3Var = (bt3) tag;
                    } else {
                        bt3Var = new bt3(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, bt3Var);
                    }
                    hashSet.add(bt3Var);
                }
            }
            i++;
        }
        return hashSet;
    }

    public final fy5 g(kx5 kx5Var) {
        String str = kx5Var.e;
        szc szcVar = this.c;
        fy5 fy5Var = (fy5) ((HashMap) szcVar.c).get(str);
        if (fy5Var != null) {
            return fy5Var;
        }
        fy5 fy5Var2 = new fy5(this.o, szcVar, kx5Var);
        fy5Var2.l(this.w.H0.getClassLoader());
        fy5Var2.e = this.v;
        return fy5Var2;
    }

    public final void h(kx5 kx5Var) {
        if (I(2)) {
            Log.v("FragmentManager", "detach: " + kx5Var);
        }
        if (kx5Var.Q0) {
            return;
        }
        kx5Var.Q0 = true;
        if (kx5Var.y) {
            if (I(2)) {
                Log.v("FragmentManager", "remove from detach: " + kx5Var);
            }
            szc szcVar = this.c;
            synchronized (((ArrayList) szcVar.b)) {
                ((ArrayList) szcVar.b).remove(kx5Var);
            }
            kx5Var.y = false;
            if (J(kx5Var)) {
                this.G = true;
            }
            Z(kx5Var);
        }
    }

    public final void i(boolean z) {
        if (z && this.w != null) {
            c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (kx5 kx5Var : this.c.K()) {
            if (kx5Var != null) {
                kx5Var.T0 = true;
                if (z) {
                    kx5Var.K0.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.v >= 1) {
            for (kx5 kx5Var : this.c.K()) {
                if (kx5Var != null) {
                    if (!kx5Var.P0 ? kx5Var.K0.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (kx5 kx5Var : this.c.K()) {
            if (kx5Var != null && L(kx5Var)) {
                if (!kx5Var.P0 ? kx5Var.K0.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(kx5Var);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                kx5 kx5Var2 = (kx5) this.e.get(i);
                if (arrayList == null || !arrayList.contains(kx5Var2)) {
                    kx5Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.J = true;
        z(true);
        w();
        mx5 mx5Var = this.w;
        szc szcVar = this.c;
        if (mx5Var != null) {
            zIsChangingConfigurations = ((by5) szcVar.e).f;
        } else {
            Context context = mx5Var.H0;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((js0) it.next()).a.iterator();
                while (it2.hasNext()) {
                    ((by5) szcVar.e).g((String) it2.next(), false);
                }
            }
        }
        u(-1);
        mx5 mx5Var2 = this.w;
        if (mx5Var2 != null) {
            nx5 nx5Var = mx5Var2.K0;
            rx5 rx5Var = this.r;
            rx5Var.getClass();
            nx5Var.y.remove(rx5Var);
        }
        mx5 mx5Var3 = this.w;
        if (mx5Var3 != null) {
            nx5 nx5Var2 = mx5Var3.K0;
            rx5 rx5Var2 = this.q;
            rx5Var2.getClass();
            nx5Var2.x.remove(rx5Var2);
        }
        mx5 mx5Var4 = this.w;
        if (mx5Var4 != null) {
            nx5 nx5Var3 = mx5Var4.K0;
            rx5 rx5Var3 = this.s;
            rx5Var3.getClass();
            nx5Var3.X.remove(rx5Var3);
        }
        mx5 mx5Var5 = this.w;
        if (mx5Var5 != null) {
            nx5 nx5Var4 = mx5Var5.K0;
            rx5 rx5Var4 = this.t;
            rx5Var4.getClass();
            nx5Var4.Y.remove(rx5Var4);
        }
        mx5 mx5Var6 = this.w;
        if (mx5Var6 != null && this.y == null) {
            nx5 nx5Var5 = mx5Var6.K0;
            sx5 sx5Var = this.u;
            sx5Var.getClass();
            gg7 gg7Var = nx5Var5.c;
            ((CopyOnWriteArrayList) gg7Var.c).remove(sx5Var);
            if (((HashMap) gg7Var.d).remove(sx5Var) == null) {
                ((Runnable) gg7Var.b).run();
            } else {
                r3.f();
            }
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.j.e();
            this.g = null;
        }
        jf jfVar = this.C;
        if (jfVar != null) {
            jfVar.L();
            this.D.L();
            this.E.L();
        }
    }

    public final void m(boolean z) {
        if (z && this.w != null) {
            c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (kx5 kx5Var : this.c.K()) {
            if (kx5Var != null) {
                kx5Var.T0 = true;
                if (z) {
                    kx5Var.K0.m(true);
                }
            }
        }
    }

    public final void n(boolean z) {
        if (z && this.w != null) {
            c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (kx5 kx5Var : this.c.K()) {
            if (kx5Var != null && z) {
                kx5Var.K0.n(true);
            }
        }
    }

    public final void o() {
        for (kx5 kx5Var : this.c.I()) {
            if (kx5Var != null) {
                kx5Var.o();
                kx5Var.K0.o();
            }
        }
    }

    public final boolean p() {
        if (this.v >= 1) {
            for (kx5 kx5Var : this.c.K()) {
                if (kx5Var != null) {
                    if (!kx5Var.P0 ? kx5Var.K0.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.v < 1) {
            return;
        }
        for (kx5 kx5Var : this.c.K()) {
            if (kx5Var != null && !kx5Var.P0) {
                kx5Var.K0.q();
            }
        }
    }

    public final void r(kx5 kx5Var) {
        if (kx5Var != null) {
            if (kx5Var != this.c.F(kx5Var.e)) {
                return;
            }
            kx5Var.I0.getClass();
            boolean zM = M(kx5Var);
            Boolean bool = kx5Var.x;
            if (bool == null || bool.booleanValue() != zM) {
                kx5Var.x = Boolean.valueOf(zM);
                zx5 zx5Var = kx5Var.K0;
                zx5Var.d0();
                zx5Var.r(zx5Var.z);
            }
        }
    }

    public final void s(boolean z) {
        if (z && this.w != null) {
            c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (kx5 kx5Var : this.c.K()) {
            if (kx5Var != null && z) {
                kx5Var.K0.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.v < 1) {
            return false;
        }
        boolean z = false;
        for (kx5 kx5Var : this.c.K()) {
            if (kx5Var != null && L(kx5Var)) {
                if (!kx5Var.P0 ? kx5Var.K0.t() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        kx5 kx5Var = this.y;
        if (kx5Var != null) {
            sb.append(kx5Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            mx5 mx5Var = this.w;
            if (mx5Var != null) {
                sb.append(mx5Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (fy5 fy5Var : ((HashMap) this.c.c).values()) {
                if (fy5Var != null) {
                    fy5Var.e = i;
                }
            }
            N(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((bt3) it.next()).c();
            }
            this.b = false;
            z(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String strL = tec.l(str, "    ");
        szc szcVar = this.c;
        ArrayList arrayList = (ArrayList) szcVar.b;
        String strL2 = tec.l(str, "    ");
        HashMap map = (HashMap) szcVar.c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (fy5 fy5Var : map.values()) {
                printWriter.print(str);
                if (fy5Var != null) {
                    kx5 kx5Var = fy5Var.c;
                    printWriter.println(kx5Var);
                    printWriter.print(strL2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(kx5Var.M0));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(kx5Var.N0));
                    printWriter.print(" mTag=");
                    printWriter.println(kx5Var.O0);
                    printWriter.print(strL2);
                    printWriter.print("mState=");
                    printWriter.print(kx5Var.a);
                    printWriter.print(" mWho=");
                    printWriter.print(kx5Var.e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(kx5Var.H0);
                    printWriter.print(strL2);
                    printWriter.print("mAdded=");
                    printWriter.print(kx5Var.y);
                    printWriter.print(" mRemoving=");
                    printWriter.print(kx5Var.z);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(kx5Var.Y);
                    printWriter.print(" mInLayout=");
                    printWriter.println(kx5Var.Z);
                    printWriter.print(strL2);
                    printWriter.print("mHidden=");
                    printWriter.print(kx5Var.P0);
                    printWriter.print(" mDetached=");
                    printWriter.print(kx5Var.Q0);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(kx5Var.S0);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strL2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(kx5Var.R0);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(kx5Var.W0);
                    if (kx5Var.I0 != null) {
                        printWriter.print(strL2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(kx5Var.I0);
                    }
                    if (kx5Var.J0 != null) {
                        printWriter.print(strL2);
                        printWriter.print("mHost=");
                        printWriter.println(kx5Var.J0);
                    }
                    if (kx5Var.L0 != null) {
                        printWriter.print(strL2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(kx5Var.L0);
                    }
                    if (kx5Var.f != null) {
                        printWriter.print(strL2);
                        printWriter.print("mArguments=");
                        printWriter.println(kx5Var.f);
                    }
                    if (kx5Var.b != null) {
                        printWriter.print(strL2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(kx5Var.b);
                    }
                    if (kx5Var.c != null) {
                        printWriter.print(strL2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(kx5Var.c);
                    }
                    if (kx5Var.d != null) {
                        printWriter.print(strL2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(kx5Var.d);
                    }
                    Object objF = kx5Var.g;
                    if (objF == null) {
                        zx5 zx5Var = kx5Var.I0;
                        objF = (zx5Var == null || (str2 = kx5Var.v) == null) ? null : zx5Var.c.F(str2);
                    }
                    if (objF != null) {
                        printWriter.print(strL2);
                        printWriter.print("mTarget=");
                        printWriter.print(objF);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(kx5Var.w);
                    }
                    printWriter.print(strL2);
                    printWriter.print("mPopDirection=");
                    ix5 ix5Var = kx5Var.X0;
                    printWriter.println(ix5Var == null ? false : ix5Var.a);
                    ix5 ix5Var2 = kx5Var.X0;
                    if ((ix5Var2 == null ? 0 : ix5Var2.b) != 0) {
                        printWriter.print(strL2);
                        printWriter.print("getEnterAnim=");
                        ix5 ix5Var3 = kx5Var.X0;
                        printWriter.println(ix5Var3 == null ? 0 : ix5Var3.b);
                    }
                    ix5 ix5Var4 = kx5Var.X0;
                    if ((ix5Var4 == null ? 0 : ix5Var4.c) != 0) {
                        printWriter.print(strL2);
                        printWriter.print("getExitAnim=");
                        ix5 ix5Var5 = kx5Var.X0;
                        printWriter.println(ix5Var5 == null ? 0 : ix5Var5.c);
                    }
                    ix5 ix5Var6 = kx5Var.X0;
                    if ((ix5Var6 == null ? 0 : ix5Var6.d) != 0) {
                        printWriter.print(strL2);
                        printWriter.print("getPopEnterAnim=");
                        ix5 ix5Var7 = kx5Var.X0;
                        printWriter.println(ix5Var7 == null ? 0 : ix5Var7.d);
                    }
                    ix5 ix5Var8 = kx5Var.X0;
                    if ((ix5Var8 == null ? 0 : ix5Var8.e) != 0) {
                        printWriter.print(strL2);
                        printWriter.print("getPopExitAnim=");
                        ix5 ix5Var9 = kx5Var.X0;
                        printWriter.println(ix5Var9 == null ? 0 : ix5Var9.e);
                    }
                    if (kx5Var.U0 != null) {
                        printWriter.print(strL2);
                        printWriter.print("mContainer=");
                        printWriter.println(kx5Var.U0);
                    }
                    mx5 mx5Var = kx5Var.J0;
                    if ((mx5Var != null ? mx5Var.H0 : null) != null) {
                        new fz3(kx5Var, kx5Var.g()).p(strL2, printWriter);
                    }
                    printWriter.print(strL2);
                    printWriter.println("Child " + kx5Var.K0 + ":");
                    kx5Var.K0.v(strL2.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                kx5 kx5Var2 = (kx5) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(kx5Var2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                kx5 kx5Var3 = (kx5) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(kx5Var3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                hs0 hs0Var = (hs0) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(hs0Var.toString());
                hs0Var.g(strL, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (wx5) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((bt3) it.next()).c();
        }
    }

    public final void x(wx5 wx5Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.J) {
                    qc0.p("FragmentManager has been destroyed");
                    return;
                } else {
                    qc0.p("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.H || this.I) {
                qc0.p("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.w == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(wx5Var);
                    V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z) {
        if (this.b) {
            qc0.p("FragmentManager is already executing transactions");
            return;
        }
        if (this.w == null) {
            if (this.J) {
                qc0.p("FragmentManager has been destroyed");
                return;
            } else {
                qc0.p("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.w.I0.getLooper()) {
            qc0.p("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.H || this.I)) {
            qc0.p("Can not perform this action after onSaveInstanceState");
        } else if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    public final boolean z(boolean z) {
        boolean zA;
        ArrayList arrayList;
        hs0 hs0Var;
        y(z);
        if (!this.i && (hs0Var = this.h) != null) {
            hs0Var.r = false;
            hs0Var.d();
            if (I(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.e(false, false);
            this.a.add(0, this.h);
            Iterator it = this.h.a.iterator();
            while (it.hasNext()) {
                kx5 kx5Var = ((ky5) it.next()).b;
                if (kx5Var != null) {
                    kx5Var.X = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            zA |= ((wx5) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.w.I0.removeCallbacks(this.P);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.w.I0.removeCallbacks(this.P);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            z2 = true;
            this.b = true;
            try {
                S(this.L, this.M);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        d0();
        if (this.K) {
            this.K = false;
            b0();
        }
        ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        return z2;
    }
}
