package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class de0 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf8 b;

    public /* synthetic */ de0(hf8 hf8Var, int i) {
        this.a = i;
        this.b = hf8Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = this.a;
        hf8 hf8Var = this.b;
        switch (i) {
            case 0:
                ((je0) hf8Var).b();
                break;
            default:
                soa soaVar = (soa) hf8Var;
                if (m93.m == soaVar.G0) {
                    m93.m = null;
                }
                soaVar.i(false);
                soaVar.E0.setValue(Float.valueOf(0.0f));
                lyd lydVar = soaVar.F0;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                soaVar.F0 = null;
                mediaPlayer.release();
                soaVar.Y = null;
                break;
        }
    }
}
