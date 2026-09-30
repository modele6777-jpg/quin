package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rw {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public static String c(ff5 ff5Var) {
        ff5Var.a();
        wf5 wf5Var = ff5Var.c;
        String str = wf5Var.e;
        if (str != null) {
            return str;
        }
        ff5Var.a();
        String str2 = wf5Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            qd0.b0(jArr, jArr2, 0, 0, jArr.length);
            qd0.c0(0, 0, 14, (int[]) this.d, iArr);
            this.c = jArr2;
            this.d = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int[] iArr2 = (int[]) this.e;
        int length2 = iArr2.length;
        if (this.b >= length2) {
            int i4 = length2 * 2;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            qd0.c0(0, 0, 14, (int[]) this.e, iArr2);
            this.e = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.b;
        this.b = iArr2[i7];
        long[] jArr3 = (long[]) this.c;
        jArr3[i3] = j;
        ((int[]) this.d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (pa7.M(jArr3[i8], j) <= 0) {
                break;
            }
            j(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public synchronized String b() {
        try {
            if (((String) this.d) == null) {
                i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.d;
    }

    public synchronized int d() {
        PackageInfo packageInfoG;
        try {
            if (this.a == 0 && (packageInfoG = g("com.google.android.gms")) != null) {
                this.a = packageInfoG.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    public sug e(TypedArray typedArray, Resources.Theme theme, String str, int i) throws XmlPullParserException, IOException {
        sug sugVar;
        int i2 = 3;
        Object obj = null;
        int i3 = 0;
        if (z7c.l((XmlPullParser) this.c, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i4 = typedValue.type;
            if (i4 < 28 || i4 > 31) {
                try {
                    sugVar = sug.h(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    b1.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    sugVar = null;
                }
                if (sugVar == null) {
                    sugVar = new sug(obj, i3, i2);
                }
            } else {
                sugVar = new sug(obj, typedValue.data, i2);
            }
        } else {
            sugVar = new sug(obj, i3, i2);
        }
        k(typedArray.getChangingConfigurations());
        return sugVar;
    }

    public float f(TypedArray typedArray, String str, int i, float f) {
        if (z7c.l((XmlPullParser) this.c, str)) {
            f = typedArray.getFloat(i, f);
        }
        k(typedArray.getChangingConfigurations());
        return f;
    }

    public PackageInfo g(String str) {
        try {
            return ((Context) this.c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            b1.l("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    public boolean h() {
        int i;
        synchronized (this) {
            i = this.b;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    b1.d("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        b1.l("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.b = 2;
                    } else {
                        this.b = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }

    public synchronized void i() {
        PackageInfo packageInfoG = g(((Context) this.c).getPackageName());
        if (packageInfoG != null) {
            this.d = Integer.toString(packageInfoG.versionCode);
            this.e = packageInfoG.versionName;
        }
    }

    public void j(int i, int i2) {
        long[] jArr = (long[]) this.c;
        int[] iArr = (int[]) this.d;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public void k(int i) {
        this.a = i | this.a;
    }
}
