package defpackage;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rch implements ut4 {
    public static final Object c = new Object();
    public static volatile dpb d;
    public final /* synthetic */ int a;
    public final String b;

    public rch(String str) {
        this.a = 3;
        this.b = kv2.h(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String g(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = ub3.k(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return ib8.j(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", g(this.b, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", g(this.b, str, objArr));
        }
    }

    public void d(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", g(this.b, str, objArr), exc);
        }
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", g(this.b, str, objArr));
        }
    }

    public void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", g(this.b, str, objArr));
        }
    }

    @Override // defpackage.ut4
    public boolean i(CharSequence charSequence, int i, int i2, g9f g9fVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.b)) {
            return true;
        }
        g9fVar.c = (g9fVar.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ut4
    public Object c() {
        return this;
    }

    public rch(Context context, sch schVar) {
        String strR;
        this.a = 0;
        if (schVar.s()) {
            strR = a8h.b(context, schVar.r());
        } else {
            strR = schVar.r();
        }
        this.b = strR;
    }

    public /* synthetic */ rch(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
