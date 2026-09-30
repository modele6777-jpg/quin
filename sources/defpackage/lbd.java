package defpackage;

import ai.askquin.R;
import ai.askquin.ui.share.SharedDivination;
import tech.chatmind.api.EmotionTheme;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lbd extends gcg {
    public static final /* synthetic */ int w = 0;
    public final SharedDivination d;
    public final xt6 e;
    public final vc4 f;
    public final vz9 g = q1c.f(null);
    public final vz9 v = q1c.f(abd.a);

    static {
        dcd dcdVar = SharedDivination.Companion;
        bm8.H(new iy9(EmotionTheme.CALM, t72.I(Integer.valueOf(R.drawable.share_calm_1), Integer.valueOf(R.drawable.share_calm_2))), new iy9(EmotionTheme.JOY, t72.I(Integer.valueOf(R.drawable.share_joy_1), Integer.valueOf(R.drawable.share_joy_2), Integer.valueOf(R.drawable.share_joy_3))), new iy9(EmotionTheme.WORRY, t72.I(Integer.valueOf(R.drawable.share_worry_1), Integer.valueOf(R.drawable.share_worry_2), Integer.valueOf(R.drawable.share_worry_3))), new iy9(EmotionTheme.TENSION, t72.I(Integer.valueOf(R.drawable.share_tension_1), Integer.valueOf(R.drawable.share_tension_2))));
    }

    public lbd(SharedDivination sharedDivination, xt6 xt6Var, vc4 vc4Var) {
        this.d = sharedDivination;
        this.e = xt6Var;
        this.f = vc4Var;
    }

    public final void g(Throwable th) {
        vz9 vz9Var = this.v;
        if (((abd) vz9Var.getValue()) == abd.c) {
            return;
        }
        vz9Var.setValue(abd.d);
        d().c("Failed to get sharing summary", th);
        jcc.k(1, Integer.valueOf(R.string.chat_content_error_network));
    }
}
