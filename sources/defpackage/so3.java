package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class so3 implements dp3 {
    public final Context a;
    public Boolean b;

    public so3(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    public final mj0 a(xi0 xi0Var, rr5 rr5Var) {
        Boolean boolValueOf;
        boolean zBooleanValue;
        rr5Var.getClass();
        int i = rr5Var.L;
        xi0Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return mj0.d;
        }
        Boolean bool = this.b;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = this.a;
            if (context != null) {
                String parameters = kj0.d0(context).getParameters("offloadVariableRateSupported");
                boolValueOf = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                this.b = boolValueOf;
            } else {
                boolValueOf = Boolean.FALSE;
                this.b = boolValueOf;
            }
            zBooleanValue = boolValueOf.booleanValue();
        }
        String str = rr5Var.p;
        str.getClass();
        int iB = qv8.b(str, rr5Var.l);
        if (iB == 0 || i2 < pqf.o(iB)) {
            return mj0.d;
        }
        int iP = rr5Var.K;
        if (iP == -1) {
            iP = pqf.p(rr5Var.J);
        }
        if (iP == 0) {
            return mj0.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iP).setEncoding(iB).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, xi0Var.a());
                if ((directPlaybackSupport & 1) == 0) {
                    return mj0.d;
                }
                z = (directPlaybackSupport & 3) == 3;
                lj0 lj0Var = new lj0();
                lj0Var.a = true;
                lj0Var.b = z;
                lj0Var.c = zBooleanValue;
                return lj0Var.a();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, xi0Var.a())) {
                    return mj0.d;
                }
                lj0 lj0Var2 = new lj0();
                lj0Var2.a = true;
                lj0Var2.c = zBooleanValue;
                return lj0Var2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, xi0Var.a());
            if (playbackOffloadSupport == 0) {
                return mj0.d;
            }
            lj0 lj0Var3 = new lj0();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            lj0Var3.a = true;
            lj0Var3.b = z;
            lj0Var3.c = zBooleanValue;
            return lj0Var3.a();
        } catch (IllegalArgumentException unused) {
            return mj0.d;
        }
    }
}
