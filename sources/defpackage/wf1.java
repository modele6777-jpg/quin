package defpackage;

import android.os.Build;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wf1 {
    public final boolean a;
    public final ff8 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    public wf1(boolean z, ff8 ff8Var, int i, boolean z2, int i2) {
        boolean z3;
        if ((i2 & 2) != 0) {
            z = Build.VERSION.SDK_INT >= 30;
        }
        ff8Var = (i2 & 4) != 0 ? new ff8(0, xf1.a) : ff8Var;
        i = (i2 & 16) != 0 ? 0 : i;
        if ((i2 & 32) != 0) {
            Map map = sd1.c;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 > 27) {
                String str = Build.HARDWARE;
                if (!pa7.t(str, "samsungexynos7870") && (!c5e.v(str, "qcom", true) || i3 > 31)) {
                    Map map2 = sd1.d;
                    String str2 = Build.BRAND;
                    str2.getClass();
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    Set set = (Set) map2.get(lowerCase);
                    if (set != null) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        String lowerCase2 = str3.toLowerCase(locale);
                        lowerCase2.getClass();
                        z3 = set.contains(lowerCase2) ? true : z3;
                    }
                    z3 = false;
                }
            }
        }
        z2 = (i2 & 64) != 0 ? false : z2;
        boolean z4 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0;
        this.a = z;
        this.b = ff8Var;
        this.c = i;
        this.d = z3;
        this.e = z2;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wf1) {
            wf1 wf1Var = (wf1) obj;
            if (this.a == wf1Var.a && this.b == wf1Var.b && this.c == wf1Var.c && this.d == wf1Var.d && this.e == wf1Var.e && this.f == wf1Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ub3.d(ub3.d(ub3.b(this.c, (this.b.hashCode() + ub3.d(Boolean.hashCode(false) * 31, 31, this.a)) * 961, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=" + this.a + ", awaitRepeatingRequestBeforeCapture=" + this.b + ", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=" + ((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.c + ')')) + ", closeCaptureSessionOnDisconnect=" + this.d + ", closeCameraDeviceOnClose=" + this.e + ", enableRestartDelays=" + this.f + ')';
    }
}
