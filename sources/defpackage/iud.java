package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iud {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final hud d;

    public iud(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerD0 = context == null ? null : kj0.d0(context);
        if (audioManagerD0 == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = audioManagerD0.getSpatializer();
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.c = handler;
        hud hudVar = new hud(runnable);
        this.d = hudVar;
        spatializer.addOnSpatializerStateChangedListener(new xk0(handler, 0), hudVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    public final boolean a(xi0 xi0Var, rr5 rr5Var) {
        int i;
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = rr5Var.p;
        int i2 = rr5Var.J;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i2 == 16) {
                i = 12;
            } else {
                i = i2;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i2 == -1) {
                i = 6;
            } else {
                i = i2;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i2 == 18 || i2 == 21)) {
            i = 24;
        } else {
            i = i2;
        }
        int iP = rr5Var.K;
        if (iP == -1 || i2 != i) {
            iP = pqf.p(i);
        }
        if (iP == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iP);
        int i3 = rr5Var.L;
        if (i3 != -1) {
            channelMask.setSampleRate(i3);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(xi0Var.a(), channelMask.build());
    }

    public final List b() {
        if (this.a == null || !this.b || !c() || !d()) {
            ey6 ey6Var = jy6.b;
            return yob.e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return jy6.s(252);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean d() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isEnabled();
    }

    public final void e() {
        hud hudVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (hudVar = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(hudVar);
        handler.removeCallbacksAndMessages(null);
    }
}
