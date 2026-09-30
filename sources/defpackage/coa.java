package defpackage;

import ai.askquin.R;
import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class coa implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ soa b;

    public /* synthetic */ coa(soa soaVar, int i) {
        this.a = i;
        this.b = soaVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        p05 p05Var = p05.a;
        wef wefVar = wef.a;
        soa soaVar = this.b;
        switch (i) {
            case 0:
                x1f x1fVar = x1f.a;
                x1f.k(p05Var, new zea(3), 2);
                soaVar.f();
                break;
            case 1:
                soaVar.g.setValue(Boolean.FALSE);
                soaVar.x.setValue(Boolean.TRUE);
                soaVar.y.k(soaVar.d.c);
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new zea(7), 2);
                jcc.k(0, Integer.valueOf(R.string.voice_limit_reached));
                soaVar.m();
                break;
            default:
                MediaPlayer mediaPlayer = soaVar.Y;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
                soaVar.i(false);
                lyd lydVar = soaVar.F0;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                soaVar.F0 = null;
                break;
        }
        return wefVar;
    }
}
