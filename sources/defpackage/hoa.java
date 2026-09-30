package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hoa extends gbe implements l26 {
    int label;
    final /* synthetic */ soa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoa(soa soaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = soaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hoa(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0 && i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        while (((Boolean) this.this$0.Z.getValue()).booleanValue()) {
            soa soaVar = this.this$0;
            MediaPlayer mediaPlayer = soaVar.Y;
            if (mediaPlayer != null) {
                try {
                    float currentPosition = mediaPlayer.getCurrentPosition();
                    int duration = mediaPlayer.getDuration();
                    if (duration < 1) {
                        duration = 1;
                    }
                    soaVar.E0.setValue(Float.valueOf(mh3.n(currentPosition / duration, 0.0f, 1.0f)));
                } catch (Exception unused) {
                }
            }
            this.label = 1;
            Object objQ = vfh.q(50L, this);
            bw2 bw2Var = bw2.a;
            if (objQ == bw2Var) {
                return bw2Var;
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hoa) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
