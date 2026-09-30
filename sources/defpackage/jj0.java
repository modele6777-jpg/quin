package defpackage;

import android.media.AudioFocusRequest;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jj0 {
    public final int a;
    public final gj0 b;
    public final Handler c;
    public final xi0 d;
    public final AudioFocusRequest e;

    public jj0(int i, gj0 gj0Var, Handler handler, xi0 xi0Var, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = xi0Var;
        this.b = gj0Var;
        this.e = new AudioFocusRequest.Builder(i).setAudioAttributes(xi0Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(gj0Var, handler).setAcceptsDelayedFocusGain(z).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jj0) {
            jj0 jj0Var = (jj0) obj;
            if (this.a == jj0Var.a && this.b == jj0Var.b && this.c.equals(jj0Var.c) && Objects.equals(this.d, jj0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.FALSE);
    }
}
