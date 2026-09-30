package defpackage;

import android.os.Build;
import android.os.Trace;
import io.sentry.android.core.b1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jc1 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ jc1(kc1 kc1Var, int i) {
        this.a = i;
        this.b = kc1Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        Set setO1;
        Set setO2;
        int i = this.a;
        xu4 xu4Var = xu4.a;
        boolean z = false;
        kc1 kc1Var = this.b;
        switch (i) {
            case 0:
                String str = ((Object) ig1.b(kc1Var.a)) + "#availableCaptureRequestKeys";
                try {
                    try {
                        Trace.beginSection(str);
                        if (Build.VERSION.SDK_INT >= 33) {
                            setO1 = s72.o1(q6.i(kc1Var.c, kc1Var.b));
                            break;
                        } else {
                            setO1 = xu4Var;
                        }
                        return setO1;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    b1.n("CXCP", "Failed to get " + str + "! Caching {} and ignoring exception.", th);
                    return xu4Var;
                }
            case 1:
                String str2 = ((Object) ig1.b(kc1Var.a)) + "#availableCaptureResultKeys";
                try {
                    try {
                        Trace.beginSection(str2);
                        if (Build.VERSION.SDK_INT >= 33) {
                            setO2 = s72.o1(q6.j(kc1Var.c, kc1Var.b));
                            break;
                        } else {
                            setO2 = xu4Var;
                        }
                        return setO2;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th2) {
                    b1.n("CXCP", "Failed to get " + str2 + "! Caching {} and ignoring exception.", th2);
                    return xu4Var;
                }
            case 2:
                String str3 = ((Object) ig1.b(kc1Var.a)) + "#isPostviewSupported";
                try {
                    try {
                        Trace.beginSection(str3);
                        boolean zB = Build.VERSION.SDK_INT >= 34 ? hgc.B(kc1Var.c, kc1Var.b) : false;
                        Trace.endSection();
                        z = zB;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                    break;
                } catch (Throwable th4) {
                    b1.n("CXCP", "Failed to get " + str3 + "! Caching false and ignoring exception.", th4);
                }
                return Boolean.valueOf(z);
            default:
                String str4 = ((Object) ig1.b(kc1Var.a)) + "#isCaptureProgressSupported";
                try {
                    try {
                        Trace.beginSection(str4);
                        boolean z2 = Build.VERSION.SDK_INT >= 34 ? hgc.z(kc1Var.c, kc1Var.b) : false;
                        Trace.endSection();
                        z = z2;
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                    break;
                } catch (Throwable th6) {
                    b1.n("CXCP", "Failed to get " + str4 + "! Caching false and ignoring exception.", th6);
                }
                return Boolean.valueOf(z);
        }
    }
}
