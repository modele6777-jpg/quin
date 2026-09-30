package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class pk1 implements gfe {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public pk1(Context context, xi1 xi1Var) {
        boolean z = false;
        this.a = 0;
        context.getClass();
        this.b = Build.VERSION.SDK_INT >= 34 && hgc.o(context) != 0;
        PackageManager packageManager = context.getPackageManager();
        Integer numB = xi1Var != null ? xi1Var.b() : null;
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z2 = zHasSystemFeature && (numB == null || numB.intValue() == 1);
        if (zHasSystemFeature2 && (numB == null || numB.intValue() == 0)) {
            z = true;
        }
        this.c = new ok1(z2, z);
    }

    public static boolean c(Set set, xi1 xi1Var) {
        try {
            xi1Var.c(new LinkedHashSet(set));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(int i) {
        pa7.J(!this.b);
        ((SparseBooleanArray) this.c).append(i, true);
    }

    public ki5 b() {
        pa7.J(!this.b);
        this.b = true;
        return new ki5((SparseBooleanArray) this.c);
    }

    public void d() {
        this.b = true;
    }

    public boolean e(LinkedHashSet linkedHashSet, Set set) {
        ok1 ok1Var = (ok1) this.c;
        boolean z = ok1Var.b;
        boolean z2 = ok1Var.a;
        if (!this.b && (z2 || z)) {
            xi1 xi1Var = xi1.c;
            xi1Var.getClass();
            boolean zC = c(linkedHashSet, xi1Var);
            xi1 xi1Var2 = xi1.b;
            xi1Var2.getClass();
            boolean zC2 = c(linkedHashSet, xi1Var2);
            Set set2 = set;
            ArrayList arrayList = new ArrayList(t72.u(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(((jg1) it.next()).a());
            }
            Set setO1 = s72.o1(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSet) {
                if (!setO1.contains(((pg1) obj).q().d())) {
                    arrayList2.add(obj);
                }
            }
            Set setO2 = s72.o1(arrayList2);
            xi1 xi1Var3 = xi1.c;
            xi1Var3.getClass();
            boolean zC3 = c(setO2, xi1Var3);
            xi1 xi1Var4 = xi1.b;
            xi1Var4.getClass();
            boolean zC4 = c(setO2, xi1Var4);
            boolean z3 = z2 && zC && !zC3;
            boolean z4 = z && zC2 && !zC4;
            if (z3 || z4) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        this.b = false;
    }

    public void g() {
        this.b = false;
    }

    public void h(byte b) {
        ((sug) this.c).y(String.valueOf(b));
    }

    public void i(char c) {
        sug sugVar = (sug) this.c;
        sugVar.j(sugVar.b, 1);
        char[] cArr = (char[]) sugVar.c;
        int i = sugVar.b;
        sugVar.b = i + 1;
        cArr[i] = c;
    }

    public void j(int i) {
        ((sug) this.c).y(String.valueOf(i));
    }

    public void k(long j) {
        ((sug) this.c).y(String.valueOf(j));
    }

    public void l(short s) {
        ((sug) this.c).y(String.valueOf(s));
    }

    public void m(String str) {
        byte b;
        str.getClass();
        sug sugVar = (sug) this.c;
        sugVar.j(sugVar.b, str.length() + 2);
        char[] cArr = (char[]) sugVar.c;
        int i = sugVar.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = n4e.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    sugVar.j(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = n4e.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) sugVar.c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = n4e.a[cCharAt];
                        str2.getClass();
                        sugVar.j(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) sugVar.c, i4);
                        int length3 = str2.length() + i4;
                        sugVar.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) sugVar.c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        sugVar.b = i4;
                    }
                }
                sugVar.j(i4, 1);
                ((char[]) sugVar.c)[i4] = '\"';
                sugVar.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        sugVar.b = i3 + 1;
    }

    public void p(vi1 vi1Var) throws nk1 {
        ok1 ok1Var = (ok1) this.c;
        vi1Var.getClass();
        if (this.b) {
            b21.q("CameraValidator", "Virtual device with " + vi1Var.c().size() + " cameras. Skipping validation.");
            return;
        }
        b21.q("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE);
        if (ok1Var.a) {
            try {
                xi1.c.c(vi1Var.c()).getClass();
            } catch (RuntimeException e) {
                e = e;
                b21.X("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
            }
        }
        e = null;
        if (ok1Var.b) {
            try {
                xi1.b.c(vi1Var.c()).getClass();
            } catch (RuntimeException e2) {
                b21.X("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e2);
                if (e == null) {
                    e = e2;
                }
            }
        }
        if (e != null) {
            throw new nk1(vi1Var.c().size(), e);
        }
    }

    public void q(h7h h7hVar) {
        if (this.b) {
            zsg.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((a4f) this.c).a(new vo0(h7hVar, lua.a, null), new cva(25));
        } catch (Throwable unused) {
            zsg.h("BillingLogger", "logging failed.");
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return this.b ? "FALL_THROUGH" : String.valueOf(this.c);
            default:
                return super.toString();
        }
    }

    public void n() {
    }

    public void o() {
    }

    public pk1(sug sugVar) {
        this.a = 1;
        this.c = sugVar;
        this.b = true;
    }

    public pk1(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.c = new double[]{0.0d, 0.0d, 0.0d, 0.0d};
                this.b = false;
                break;
            case 8:
                break;
            default:
                this.c = new SparseBooleanArray();
                break;
        }
    }

    public pk1(boolean z, String[] strArr) {
        this.a = 7;
        this.b = z;
        this.c = strArr;
    }

    public /* synthetic */ pk1(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }
}
