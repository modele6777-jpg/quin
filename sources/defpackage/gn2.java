package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.adjust.sdk.sig.r3;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gn2 {
    public Object a;
    public volatile Object b = null;

    public gn2(r3 r3Var) {
        this.a = r3Var;
    }

    public Object a(Context context) {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = ((r3) this.a).e(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    public jch b(final f8h f8hVar) {
        final rbh rbhVar = (rbh) this.b;
        rbh rbhVar2 = jch.i;
        if (rbhVar != rbhVar2) {
            fnb fnbVar = jch.h;
            fnbVar.getClass();
            final f17 f17Var = new f17(10, false);
            f17Var.b = false;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) fnbVar.a;
            Context context = f8hVar.b;
            String str = rbhVar.d;
            if (str == null) {
                str = (String) rbhVar.a.apply(context);
                rbhVar.d = str;
            }
            tbh tbhVar = (tbh) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: fch
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    tbh tbhVar2 = new tbh(new jch(f8hVar, rbhVar));
                    f17Var.b = true;
                    return tbhVar2;
                }
            });
            if (f17Var.b) {
                Context context2 = f8hVar.b;
                oid oidVar = new oid(15, fnbVar);
                if (ddh.a == null) {
                    synchronized (ddh.class) {
                        try {
                            if (ddh.a == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(new ddh(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new ddh(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                ddh.a = oidVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            this.a = tbhVar.a;
            this.b = rbhVar2;
        }
        return (jch) this.a;
    }
}
