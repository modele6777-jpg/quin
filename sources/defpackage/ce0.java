package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ce0 implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf8 b;

    public /* synthetic */ ce0(hf8 hf8Var, int i) {
        this.a = i;
        this.b = hf8Var;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i = this.a;
        hf8 hf8Var = this.b;
        switch (i) {
            case 0:
                je0 je0Var = (je0) hf8Var;
                mediaPlayer.start();
                je0Var.e(true);
                lyd lydVar = je0Var.e;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                je0Var.e = ynb.V(je0Var.c, null, null, new ie0(je0Var, null), 3);
                break;
            default:
                soa soaVar = (soa) hf8Var;
                mediaPlayer.start();
                soaVar.i(true);
                lyd lydVar2 = soaVar.F0;
                if (lydVar2 != null) {
                    lydVar2.h(null);
                }
                soaVar.F0 = ynb.V(hwf.a(soaVar), null, null, new hoa(soaVar, null), 3);
                break;
        }
    }
}
