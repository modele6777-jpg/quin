package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uo {
    public final Context a;
    public final od4 b;
    public final ei9 c;

    public uo(Context context, yk8 yk8Var, ei9 ei9Var) {
        context.getClass();
        yk8Var.getClass();
        this.a = context;
        this.b = yk8Var;
        this.c = ei9Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    public final boolean a() {
        String str;
        Object dzbVar;
        od4 od4Var = this.b;
        ei9 ei9Var = this.c;
        if (ei9Var != null) {
            di9 di9Var = di9.a;
            if (Build.VERSION.SDK_INT < 33) {
                str = null;
            } else {
                try {
                    dzbVar = di9.e().a(r8a.SystemSettings, ei9Var);
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                Throwable thA = ezb.a(dzbVar);
                if (thA != null) {
                    di9.f(thA);
                }
                if (dzbVar instanceof dzb) {
                    dzbVar = null;
                }
                str = (String) dzbVar;
            }
        } else {
            str = null;
        }
        Context context = this.a;
        Intent intentJ = uyb.j(context);
        try {
            od4Var.y(intentJ, null);
            return true;
        } catch (Exception unused) {
            if (pa7.t(intentJ.getAction(), "android.settings.APPLICATION_DETAILS_SETTINGS")) {
                if (str == null) {
                    return false;
                }
                di9 di9Var2 = di9.a;
                di9.a(str);
                return false;
            }
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            try {
                od4Var.y(intent, null);
                return true;
            } catch (Exception unused2) {
                if (str == null) {
                    return false;
                }
                di9 di9Var3 = di9.a;
                di9.a(str);
                return false;
            }
        }
    }
}
