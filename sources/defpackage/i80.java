package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i80 {
    public static final h80 a = new h80(new g94(2));
    public static int b = -100;
    public static td8 c = null;
    public static td8 d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final od0 g = new od0(0);
    public static final Object v = new Object();
    public static final Object w = new Object();

    public static void a() {
        td8 td8Var;
        od0 od0Var = g;
        od0Var.getClass();
        fd0 fd0Var = new fd0(od0Var);
        while (fd0Var.hasNext()) {
            i80 i80Var = (i80) ((WeakReference) fd0Var.next()).get();
            if (i80Var != null) {
                q80 q80Var = (q80) i80Var;
                Context context = q80Var.y;
                if (f(context) && (td8Var = c) != null && !td8Var.equals(d)) {
                    a.execute(new kh(context, 2));
                }
                q80Var.p(true, true);
            }
        }
    }

    public static td8 b() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objD = d();
            if (objD != null) {
                return td8.c(q6.B(objD));
            }
        } else {
            td8 td8Var = c;
            if (td8Var != null) {
                return td8Var;
            }
        }
        return td8.b;
    }

    public static Object d() {
        Context context;
        od0 od0Var = g;
        od0Var.getClass();
        fd0 fd0Var = new fd0(od0Var);
        while (fd0Var.hasNext()) {
            i80 i80Var = (i80) ((WeakReference) fd0Var.next()).get();
            if (i80Var != null && (context = ((q80) i80Var).y) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean f(Context context) {
        if (e == null) {
            try {
                int i = AppLocalesMetadataHolderService.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), 640).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void i(q80 q80Var) {
        synchronized (v) {
            try {
                od0 od0Var = g;
                od0Var.getClass();
                fd0 fd0Var = new fd0(od0Var);
                while (fd0Var.hasNext()) {
                    i80 i80Var = (i80) ((WeakReference) fd0Var.next()).get();
                    if (i80Var == q80Var || i80Var == null) {
                        fd0Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void o(Context context) {
        if (f(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f) {
                    return;
                }
                a.execute(new kh(context, 1));
                return;
            }
            synchronized (w) {
                try {
                    td8 td8Var = c;
                    if (td8Var == null) {
                        td8 td8VarA = d;
                        if (td8VarA == null) {
                            td8VarA = td8.a(qn4.O(context));
                            d = td8VarA;
                        }
                        if (td8VarA.a.a.isEmpty()) {
                        } else {
                            c = d;
                        }
                    } else if (!td8Var.equals(d)) {
                        td8 td8Var2 = c;
                        d = td8Var2;
                        qn4.L(context, td8Var2.a.a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void e();

    public abstract void g();

    public abstract void h();

    public abstract boolean j(int i);

    public abstract void k(int i);

    public abstract void l(View view);

    public abstract void m(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void n(CharSequence charSequence);
}
