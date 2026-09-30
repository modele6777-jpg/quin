package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ij0 {
    public final u8e a;
    public final Handler b;
    public g55 c;
    public xi0 d;
    public int f;
    public jj0 h;
    public float g = 1.0f;
    public int e = 0;

    public ij0(Context context, Looper looper, g55 g55Var) {
        this.a = vtb.r(new hj0(0, context));
        this.c = g55Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.get();
        AudioFocusRequest audioFocusRequest = this.h.e;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        g55 g55Var = this.c;
        if (g55Var != null) {
            g55Var.g.g(34);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [gj0] */
    public final int c(int i, boolean z) {
        int i2;
        ff8 ff8Var;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        int i3 = this.e;
        int i4 = 3;
        if (z) {
            if (i3 != 2) {
                jj0 jj0Var = this.h;
                if (jj0Var == null) {
                    if (jj0Var == null) {
                        ff8Var = new ff8(i4);
                        xi0 xi0Var = xi0.b;
                        ff8Var.b = i2;
                    } else {
                        ff8 ff8Var2 = new ff8(i4);
                        ff8Var2.b = jj0Var.a;
                        ff8Var = ff8Var2;
                    }
                    xi0 xi0Var2 = this.d;
                    xi0Var2.getClass();
                    this.h = new jj0(ff8Var.b, new AudioManager.OnAudioFocusChangeListener() { // from class: gj0
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i5) {
                            ij0 ij0Var = this.a;
                            ij0Var.getClass();
                            if (i5 == -3 || i5 == -2) {
                                if (i5 != -2) {
                                    ij0Var.b(4);
                                    return;
                                }
                                g55 g55Var = ij0Var.c;
                                if (g55Var != null) {
                                    g55Var.g.b(33, 0, 0).b();
                                }
                                ij0Var.b(3);
                                return;
                            }
                            if (i5 == -1) {
                                g55 g55Var2 = ij0Var.c;
                                if (g55Var2 != null) {
                                    g55Var2.g.b(33, -1, 0).b();
                                }
                                ij0Var.a();
                                ij0Var.b(1);
                                return;
                            }
                            if (i5 != 1) {
                                kv2.w(i5, "Unknown focus change type: ", "AudioFocusManager");
                                return;
                            }
                            ij0Var.b(2);
                            g55 g55Var3 = ij0Var.c;
                            if (g55Var3 != null) {
                                g55Var3.g.b(33, 1, 0).b();
                            }
                        }
                    }, this.b, xi0Var2, true);
                }
                AudioManager audioManager = (AudioManager) this.a.get();
                AudioFocusRequest audioFocusRequest = this.h.e;
                audioFocusRequest.getClass();
                int iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                if (iRequestAudioFocus == 1 || iRequestAudioFocus == 2) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
