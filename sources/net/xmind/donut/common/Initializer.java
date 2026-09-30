package net.xmind.donut.common;

import android.content.Context;
import defpackage.af1;
import defpackage.c37;
import defpackage.cn1;
import defpackage.dzb;
import defpackage.ex2;
import defpackage.ezb;
import defpackage.fc3;
import defpackage.hf8;
import defpackage.kv8;
import defpackage.li4;
import defpackage.lw2;
import defpackage.ne5;
import defpackage.nx2;
import defpackage.pg0;
import defpackage.pu4;
import defpackage.qd0;
import defpackage.s72;
import defpackage.tb3;
import defpackage.vd8;
import defpackage.wef;
import defpackage.xpa;
import defpackage.ynb;
import defpackage.ypa;
import defpackage.z7c;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import timber.log.Timber;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnet/xmind/donut/common/Initializer;", "Lc37;", "Lwef;", "<init>", "()V", "Quin.core:common_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class Initializer implements c37 {
    @Override // defpackage.c37
    public final List a() {
        return pu4.a;
    }

    @Override // defpackage.c37
    public final Object b(Context context) {
        Object dzbVar;
        context.getClass();
        cn1.O0 = context;
        cn1.P0 = cn1.z();
        cn1.X(vd8.b());
        ypa.a.getClass();
        ypa.d = (fc3) ypa.c.a(ypa.b[0], context);
        ynb.V(lw2.a, null, null, new xpa(2, null), 3);
        li4.c(li4.a.j());
        hf8.Q.getClass();
        File file = new File(context.getFilesDir(), "logs");
        file.mkdirs();
        af1.Z = file;
        nx2 nx2Var = Timber.a;
        nx2Var.k(new pg0(file));
        nx2Var.k(new nx2(0));
        Thread.setDefaultUncaughtExceptionHandler(new ex2(1, Thread.getDefaultUncaughtExceptionHandler()));
        File file2 = new File(file, "logcat.txt");
        try {
            ne5.d0(file2, "");
        } catch (Throwable unused) {
        }
        try {
            dzbVar = Runtime.getRuntime().exec(new String[]{"logcat", "-v", "time", "NetworkSecurityConfig:S", "OpenGLRenderer:S", "System:S", "Binder:S", "ApplicationLoaders:S", "Adreno:S", "zygote:S", "art:S", "BoostFramework:S", "AccessibilityManager:S", "-f", file2.getAbsolutePath()});
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            nx2 nx2Var2 = Timber.a;
            nx2Var2.l("Quin:Logger");
            nx2Var2.j(thA, "Failed to start logcat capture", new Object[0]);
        }
        File[] fileArrListFiles = file.listFiles(new tb3(2));
        if (fileArrListFiles != null) {
            List listA0 = qd0.A0(new kv8(6), fileArrListFiles);
            if (listA0.size() > 7) {
                Iterator it = s72.r0(listA0, 7).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        }
        return wef.a;
    }
}
